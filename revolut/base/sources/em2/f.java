package em2;

import aw0.s8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127585c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s8 f127586g;

    public f(String id10, String fullSizeUrl, String fullSizeUrlDark, String previewUrl, String previewUrlDark, boolean z, s8 paletteType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(fullSizeUrl, "fullSizeUrl");
        Intrinsics.checkNotNullParameter(fullSizeUrlDark, "fullSizeUrlDark");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(previewUrlDark, "previewUrlDark");
        Intrinsics.checkNotNullParameter(paletteType, "paletteType");
        this.f127583a = id10;
        this.f127584b = fullSizeUrl;
        this.f127585c = fullSizeUrlDark;
        this.d = previewUrl;
        this.e = previewUrlDark;
        this.f = z;
        this.f127586g = paletteType;
    }

    @Override // em2.e
    public final String a() {
        return this.f127583a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f127583a, fVar.f127583a) && Intrinsics.f(this.f127584b, fVar.f127584b) && Intrinsics.f(this.f127585c, fVar.f127585c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && this.f127586g == fVar.f127586g;
    }

    public final int hashCode() {
        return this.f127586g.hashCode() + j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f127583a.hashCode() * 31, 31, this.f127584b), 31, this.f127585c), 31, this.d), 31, this.e), 31, this.f);
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4) {
        this("bg190", str, str2, str3, str4, true, s8.DEFAULT);
    }
}
