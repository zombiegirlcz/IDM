package ty8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f275517c;
    public final f d;

    public c(boolean z, boolean z3, String portalUrl, f fVar) {
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        this.f275515a = z;
        this.f275516b = z3;
        this.f275517c = portalUrl;
        this.d = fVar;
    }

    public static c a(c cVar, f fVar, int i) {
        boolean z = (i & 1) != 0 ? cVar.f275515a : true;
        boolean z3 = (i & 2) != 0 ? cVar.f275516b : true;
        String portalUrl = cVar.f275517c;
        if ((i & 8) != 0) {
            fVar = cVar.d;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(portalUrl, "portalUrl");
        return new c(z, z3, portalUrl, fVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f275515a == cVar.f275515a && this.f275516b == cVar.f275516b && Intrinsics.f(this.f275517c, cVar.f275517c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f275515a) * 31, 31, this.f275516b), 31, this.f275517c);
        f fVar = this.d;
        return iC + (fVar == null ? 0 : fVar.hashCode());
    }
}
