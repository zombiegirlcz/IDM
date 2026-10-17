package jtd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f178487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f178488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f178489c;
    public final dj0.d d;

    public q(xi0.b fromCurrency, xi0.b toCurrency, dj0.d fromMoney, dj0.d toMoney) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        Intrinsics.checkNotNullParameter(fromMoney, "fromMoney");
        Intrinsics.checkNotNullParameter(toMoney, "toMoney");
        this.f178487a = fromCurrency;
        this.f178488b = toCurrency;
        this.f178489c = fromMoney;
        this.d = toMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f178487a, qVar.f178487a) && Intrinsics.f(this.f178488b, qVar.f178488b) && Intrinsics.f(this.f178489c, qVar.f178489c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(h30.l.j(this.f178488b, this.f178487a.hashCode() * 31, 31), 31, this.f178489c);
    }
}
