package kye;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f190705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f190706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f190707c;

    public b0(dj0.d limitUsedMoney, dj0.d limitMoney, xi0.b currency) {
        Intrinsics.checkNotNullParameter(limitUsedMoney, "limitUsedMoney");
        Intrinsics.checkNotNullParameter(limitMoney, "limitMoney");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f190705a = limitUsedMoney;
        this.f190706b = limitMoney;
        this.f190707c = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f190705a, b0Var.f190705a) && Intrinsics.f(this.f190706b, b0Var.f190706b) && Intrinsics.f(this.f190707c, b0Var.f190707c);
    }

    public final int hashCode() {
        return this.f190707c.hashCode() + v7.c(this.f190705a.hashCode() * 31, 31, this.f190706b);
    }
}
