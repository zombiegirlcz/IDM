package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f225068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f225069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f225070c;
    public final boolean d;
    public final e e;

    public f(j title, c cVar, e action, boolean z, e eVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f225068a = title;
        this.f225069b = cVar;
        this.f225070c = action;
        this.d = z;
        this.e = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f225068a, fVar.f225068a) && Intrinsics.f(this.f225069b, fVar.f225069b) && Intrinsics.f(this.f225070c, fVar.f225070c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f225068a.hashCode() * 31;
        c cVar = this.f225069b;
        int iC = j6.a.c((this.f225070c.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31, this.d);
        e eVar = this.e;
        return iC + (eVar != null ? eVar.hashCode() : 0);
    }
}
