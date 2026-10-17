package k6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f181685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f181686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f181687c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f181688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f181689h;
    public final c i;

    public h(a appearanceMode, String str, b font, boolean z, boolean z3, boolean z4, boolean z6, c cVar, c cVar2) {
        Intrinsics.checkNotNullParameter(appearanceMode, "appearanceMode");
        Intrinsics.checkNotNullParameter(font, "font");
        this.f181685a = appearanceMode;
        this.f181686b = str;
        this.f181687c = font;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f181688g = z6;
        this.f181689h = cVar;
        this.i = cVar2;
    }

    public static h a(h hVar, String str, boolean z, boolean z3, boolean z4, boolean z6, c cVar, c cVar2, int i) {
        a appearanceMode = hVar.f181685a;
        if ((i & 2) != 0) {
            str = hVar.f181686b;
        }
        String str2 = str;
        b font = hVar.f181687c;
        if ((i & 8) != 0) {
            z = hVar.d;
        }
        boolean z11 = z;
        if ((i & 16) != 0) {
            z3 = hVar.e;
        }
        boolean z12 = z3;
        if ((i & 32) != 0) {
            z4 = hVar.f;
        }
        boolean z29 = z4;
        if ((i & 64) != 0) {
            z6 = hVar.f181688g;
        }
        boolean z31 = z6;
        c cVar3 = (i & 128) != 0 ? hVar.f181689h : cVar;
        c cVar4 = (i & 256) != 0 ? hVar.i : cVar2;
        Intrinsics.checkNotNullParameter(appearanceMode, "appearanceMode");
        Intrinsics.checkNotNullParameter(font, "font");
        return new h(appearanceMode, str2, font, z11, z12, z29, z31, cVar3, cVar4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f181685a == hVar.f181685a && Intrinsics.f(this.f181686b, hVar.f181686b) && this.f181687c == hVar.f181687c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.f181688g == hVar.f181688g && Intrinsics.f(this.f181689h, hVar.f181689h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f181685a.hashCode() * 31;
        String str = this.f181686b;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.f181687c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f181688g);
        c cVar = this.f181689h;
        int iHashCode2 = (iC + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.i;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }
}
