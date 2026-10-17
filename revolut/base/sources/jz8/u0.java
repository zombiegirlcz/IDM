package jz8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f179672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179673b;

    public u0(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f179672a = j2;
        this.f179673b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return this.f179672a == u0Var.f179672a && Intrinsics.f(this.f179673b, u0Var.f179673b);
    }

    public final int hashCode() {
        return this.f179673b.hashCode() + (Long.hashCode(this.f179672a) * 31);
    }
}
