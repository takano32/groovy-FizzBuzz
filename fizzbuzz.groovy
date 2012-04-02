#!/usr/bin/env groovy

f = "Fizz"
b = "Buzz"


for (i in 1..100) {
	switch (true) {
	case i % 15 == 0:
		println f + b
	case i % 5 == 0:
		println b
	case i % 3 == 0:
		println f
	default:
		println i
	}
}

