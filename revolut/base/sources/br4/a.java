package br4;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f17875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f17876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f17877c;

    public a(dj0.d minCreditLimit, dj0.d maxCreditLimit, dj0.d nonSelectableMinCreditLimit) {
        Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
        Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
        Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
        this.f17875a = minCreditLimit;
        this.f17876b = maxCreditLimit;
        this.f17877c = nonSelectableMinCreditLimit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17875a, aVar.f17875a) && Intrinsics.f(this.f17876b, aVar.f17876b) && Intrinsics.f(this.f17877c, aVar.f17877c);
    }

    public final int hashCode() {
        return this.f17877c.hashCode() + v7.c(this.f17875a.hashCode() * 31, 31, this.f17876b);
    }
}
