package f19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131186c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f131187g;

    public c(String id10, String title, String imageUrl, String deeplink, String placementId, String str, a badge) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(badge, "badge");
        this.f131184a = id10;
        this.f131185b = title;
        this.f131186c = imageUrl;
        this.d = deeplink;
        this.e = placementId;
        this.f = str;
        this.f131187g = badge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f131184a, cVar.f131184a) && Intrinsics.f(this.f131185b, cVar.f131185b) && Intrinsics.f(this.f131186c, cVar.f131186c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f131187g, cVar.f131187g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f131184a.hashCode() * 31, 31, this.f131185b), 31, this.f131186c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.f131187g.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
