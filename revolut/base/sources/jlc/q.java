package jlc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f175695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f175696b;

    public q(dj0.d upperBound, dj0.d lowerBound) {
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        this.f175695a = upperBound;
        this.f175696b = lowerBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f175695a.equals(qVar.f175695a) && Intrinsics.f(this.f175696b, qVar.f175696b);
    }

    public final int hashCode() {
        return Integer.hashCode(6) + v7.c(this.f175695a.hashCode() * 31, 31, this.f175696b);
    }
}
