package mgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205242c;
    public final g d;

    public h(String title, String description, String backgroundUrl, g cta2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(cta2, "cta");
        this.f205240a = title;
        this.f205241b = description;
        this.f205242c = backgroundUrl;
        this.d = cta2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205240a, hVar.f205240a) && Intrinsics.f(this.f205241b, hVar.f205241b) && Intrinsics.f(this.f205242c, hVar.f205242c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f205240a.hashCode() * 31, 31, this.f205241b), 31, this.f205242c);
    }
}
