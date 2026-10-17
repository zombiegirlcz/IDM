package xsi;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f308523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f308524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f308525c;
    public final boolean d;

    public b(a3 transaction, long j2, a inputValues, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(inputValues, "inputValues");
        this.f308523a = transaction;
        this.f308524b = j2;
        this.f308525c = inputValues;
        this.d = z;
    }

    public static b a(b bVar, a inputValues, boolean z) {
        a3 transaction = bVar.f308523a;
        long j2 = bVar.f308524b;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(inputValues, "inputValues");
        return new b(transaction, j2, inputValues, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f308523a, bVar.f308523a) && this.f308524b == bVar.f308524b && Intrinsics.f(this.f308525c, bVar.f308525c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f308525c.hashCode() + a0.d.c(this.f308523a.hashCode() * 31, 31, this.f308524b)) * 31);
    }
}
