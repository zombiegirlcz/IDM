package xme;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f307230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307231c;
    public final boolean d;
    public final boolean e;

    public d(boolean z, f taxProfile, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(taxProfile, "taxProfile");
        this.f307229a = z;
        this.f307230b = taxProfile;
        this.f307231c = z3;
        this.d = z4;
        this.e = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f307229a == dVar.f307229a && Intrinsics.f(this.f307230b, dVar.f307230b) && this.f307231c == dVar.f307231c && this.d == dVar.d && this.e == dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((this.f307230b.hashCode() + (Boolean.hashCode(this.f307229a) * 31)) * 31, 31, this.f307231c), 31, this.d);
    }
}
