package jq9;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f177504a;

    public j(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f177504a = transaction;
    }

    @Override // jq9.b
    public final long a() {
        return this.f177504a.f272593h.getMillis();
    }

    @Override // jq9.b
    public final boolean b(String userCode) {
        Intrinsics.checkNotNullParameter(userCode, "userCode");
        return this.f177504a.k.f(dj0.d.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f177504a, ((j) obj2).f177504a);
    }

    public final int hashCode() {
        return this.f177504a.hashCode();
    }
}
