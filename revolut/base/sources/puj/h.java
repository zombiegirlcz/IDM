package puj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239924c;
    public final String d;
    public final String e;
    public final String f;

    public h(String id10, String eyebrow, String title, String subtitle, String buttonText, String assetUrl) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eyebrow, "eyebrow");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        this.f239922a = id10;
        this.f239923b = eyebrow;
        this.f239924c = title;
        this.d = subtitle;
        this.e = buttonText;
        this.f = assetUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f239922a, hVar.f239922a) && Intrinsics.f(this.f239923b, hVar.f239923b) && Intrinsics.f(this.f239924c, hVar.f239924c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f239922a.hashCode() * 31, 31, this.f239923b), 31, this.f239924c), 31, this.d), 31, this.e);
    }
}
