package j61;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.t3;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f171656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3 f171657b;

    public c(a3 transaction, t3 details) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f171656a = transaction;
        this.f171657b = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f171656a, cVar.f171656a) && Intrinsics.f(this.f171657b, cVar.f171657b);
    }

    public final int hashCode() {
        return this.f171657b.hashCode() + (this.f171656a.hashCode() * 31);
    }
}
