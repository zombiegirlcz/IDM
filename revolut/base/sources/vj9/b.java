package vj9;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import zh9.z;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f289658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f289659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f289660c;
    public final boolean d;

    public b(d repayAmount, d totalAmount, z instalmentsState, boolean z) {
        Intrinsics.checkNotNullParameter(repayAmount, "repayAmount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(instalmentsState, "instalmentsState");
        this.f289658a = repayAmount;
        this.f289659b = totalAmount;
        this.f289660c = instalmentsState;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f289658a, bVar.f289658a) && Intrinsics.f(this.f289659b, bVar.f289659b) && this.f289660c == bVar.f289660c && this.d == bVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f289660c.hashCode() + v7.c(this.f289658a.hashCode() * 31, 31, this.f289659b)) * 31);
    }
}
