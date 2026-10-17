package jlc;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f175675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f175676b;

    public c(dj0.d upperBound, dj0.d lowerBound) {
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        this.f175675a = upperBound;
        this.f175676b = lowerBound;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f175675a.equals(cVar.f175675a) && Intrinsics.f(this.f175676b, cVar.f175676b);
    }

    public final int hashCode() {
        return Integer.hashCode(6) + v7.c(this.f175675a.hashCode() * 31, 31, this.f175676b);
    }
}
