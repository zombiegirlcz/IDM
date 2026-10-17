package aqd;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f8384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f8385c;

    public p(String walletId, a3 transaction, o mode) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f8383a = walletId;
        this.f8384b = transaction;
        this.f8385c = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f8383a, pVar.f8383a) && Intrinsics.f(this.f8384b, pVar.f8384b) && this.f8385c == pVar.f8385c;
    }

    @Override // aqd.s
    public final a3 getTransaction() {
        return this.f8384b;
    }

    public final int hashCode() {
        return this.f8385c.hashCode() + wp5.y.f(this.f8384b, this.f8383a.hashCode() * 31, 31);
    }
}
