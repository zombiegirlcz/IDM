package iqk;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f167885a;

    public b(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f167885a = transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f167885a, ((b) obj2).f167885a);
    }

    public final int hashCode() {
        return this.f167885a.hashCode();
    }
}
