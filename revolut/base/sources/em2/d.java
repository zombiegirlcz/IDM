package em2;

import aw0.s8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127579c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f127580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s8 f127581h;

    public d(String id10, String fullSizeUrl, String fullSizeUrlDark, String previewUrl, String previewUrlDark, boolean z, boolean z3, s8 paletteType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fullSizeUrl, "fullSizeUrl");
        Intrinsics.checkNotNullParameter(fullSizeUrlDark, "fullSizeUrlDark");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(previewUrlDark, "previewUrlDark");
        Intrinsics.checkNotNullParameter(paletteType, "paletteType");
        this.f127577a = id10;
        this.f127578b = fullSizeUrl;
        this.f127579c = fullSizeUrlDark;
        this.d = previewUrl;
        this.e = previewUrlDark;
        this.f = z;
        this.f127580g = z3;
        this.f127581h = paletteType;
    }

    @Override // em2.e
    public final String a() {
        return this.f127577a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f127577a, dVar.f127577a) && Intrinsics.f(this.f127578b, dVar.f127578b) && Intrinsics.f(this.f127579c, dVar.f127579c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && this.f127580g == dVar.f127580g && this.f127581h == dVar.f127581h;
    }

    public final int hashCode() {
        return this.f127581h.hashCode() + j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f127577a.hashCode() * 31, 31, this.f127578b), 31, this.f127579c), 31, this.d), 31, this.e), 31, this.f), 31, this.f127580g);
    }
}
