package aqd;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f8330b;

    public c(io3.d pocket, a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f8329a = transaction;
        this.f8330b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8329a, cVar.f8329a) && Intrinsics.f(this.f8330b, cVar.f8330b);
    }

    public final int hashCode() {
        return this.f8330b.hashCode() + (this.f8329a.hashCode() * 31);
    }
}
