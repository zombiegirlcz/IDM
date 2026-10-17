package xr6;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f308266a;

    public n(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f308266a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f308266a, ((n) obj2).f308266a);
    }

    public final int hashCode() {
        return this.f308266a.hashCode();
    }
}
