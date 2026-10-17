package qfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f245322c;
    public final String d;
    public final String e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f245323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f245324h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f245325j;

    public f(String id10, String name, String description, String logoUrl, String signupUrl, a aVar, g gVar, String unit, e eVar, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(signupUrl, "signupUrl");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f245320a = id10;
        this.f245321b = name;
        this.f245322c = description;
        this.d = logoUrl;
        this.e = signupUrl;
        this.f = aVar;
        this.f245323g = gVar;
        this.f245324h = unit;
        this.i = eVar;
        this.f245325j = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f245320a, fVar.f245320a) && Intrinsics.f(this.f245321b, fVar.f245321b) && Intrinsics.f(this.f245322c, fVar.f245322c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f245323g, fVar.f245323g) && Intrinsics.f(this.f245324h, fVar.f245324h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f245325j, fVar.f245325j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f245320a.hashCode() * 31, 31, this.f245321b), 31, this.f245322c), 31, this.d), 31, this.e);
        a aVar = this.f;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g gVar = this.f245323g;
        int iC2 = p.a.c((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f245324h);
        e eVar = this.i;
        int iHashCode2 = (iC2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f245325j;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
