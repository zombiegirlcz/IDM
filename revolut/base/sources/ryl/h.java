package ryl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f258436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v01.b f258437c;
    public final boolean d;
    public p31.c e;
    public p31.c f;

    public h(String listId, Integer num, v01.b textStyle) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f258435a = listId;
        this.f258436b = num;
        this.f258437c = textStyle;
        this.d = true;
        this.e = null;
        this.f = null;
    }

    @Override // ryl.a, koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53355a() {
        return this.f258435a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f258435a, hVar.f258435a) && Intrinsics.f(this.f258436b, hVar.f258436b) && Intrinsics.f(this.f258437c, hVar.f258437c) && this.d == hVar.d && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f258435a.hashCode() * 961;
        Integer num = this.f258436b;
        int iC = j6.a.c(j6.a.c((this.f258437c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 961)) * 31, 31, false), 961, this.d);
        p31.c cVar = this.e;
        int iHashCode2 = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        p31.c cVar2 = this.f;
        return (iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 961;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: i */
    public final p31.c getF53367s() {
        return this.e;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: k */
    public final p31.c getF53368t() {
        return this.f;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: q */
    public final p31.c getV() {
        return null;
    }

    @Override // o31.c
    /* JADX INFO: renamed from: r */
    public final p31.c getU() {
        return null;
    }

    @Override // o31.c
    public final void s(p31.c cVar) {
        this.e = cVar;
    }

    @Override // o31.c
    public final void u(p31.c cVar) {
        this.f = cVar;
    }
}
