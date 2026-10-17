package ty8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f275520c;
    public final f d;

    public g(boolean z, boolean z3, String portalUrl, f fVar) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f275518a = z;
        this.f275519b = z3;
        this.f275520c = portalUrl;
        this.d = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f275518a == gVar.f275518a && this.f275519b == gVar.f275519b && Intrinsics.f(this.f275520c, gVar.f275520c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f275518a) * 31, 31, this.f275519b), 31, this.f275520c);
        f fVar = this.d;
        return iC + (fVar == null ? 0 : fVar.hashCode());
    }
}
