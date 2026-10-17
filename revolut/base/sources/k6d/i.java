package k6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f181690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f181692c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f181694h;
    public final String i;

    public i(a appearanceMode, String color, b font, boolean z, boolean z3, boolean z4, boolean z6, String backgroundImageId, String logoImageId) {
        Intrinsics.checkNotNullParameter(appearanceMode, "appearanceMode");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(backgroundImageId, "backgroundImageId");
        Intrinsics.checkNotNullParameter(logoImageId, "logoImageId");
        this.f181690a = appearanceMode;
        this.f181691b = color;
        this.f181692c = font;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f181693g = z6;
        this.f181694h = backgroundImageId;
        this.i = logoImageId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f181690a == iVar.f181690a && Intrinsics.f(this.f181691b, iVar.f181691b) && this.f181692c == iVar.f181692c && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f && this.f181693g == iVar.f181693g && Intrinsics.f(this.f181694h, iVar.f181694h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f181692c.hashCode() + p.a.c(this.f181690a.hashCode() * 31, 31, this.f181691b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f181693g), 31, this.f181694h);
    }
}
