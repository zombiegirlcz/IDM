package kye;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f190717c;

    public c0(dj0.d limitUsedMoney, dj0.d limitMoney, xi0.b currency) {
        Intrinsics.checkNotNullParameter(limitUsedMoney, "limitUsedMoney");
        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190715a = limitUsedMoney;
        this.f190716b = limitMoney;
        this.f190717c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f190715a, c0Var.f190715a) && Intrinsics.f(this.f190716b, c0Var.f190716b) && Intrinsics.f(this.f190717c, c0Var.f190717c);
    }

    public final int hashCode() {
        return this.f190717c.hashCode() + v7.c(this.f190715a.hashCode() * 31, 31, this.f190716b);
    }
}
