package jz2;

import dj0.d;
import h93.f0;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f179580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f179581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f179582c;
    public final d d;
    public final boolean e;

    public a(f0 card, d amount, d spent, d maxLimit, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
        this.f179580a = card;
        this.f179581b = amount;
        this.f179582c = spent;
        this.d = maxLimit;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f179580a, aVar.f179580a) && Intrinsics.f(this.f179581b, aVar.f179581b) && Intrinsics.f(this.f179582c, aVar.f179582c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + v7.c(v7.c(v7.c(this.f179580a.hashCode() * 31, 31, this.f179581b), 31, this.f179582c), 31, this.d);
    }
}
