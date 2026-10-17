package h91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150082c;
    public final String d;

    public a(String title, String subtitle, String logoUrl, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f150080a = title;
        this.f150081b = subtitle;
        this.f150082c = logoUrl;
        this.d = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f150080a, aVar.f150080a) && Intrinsics.f(this.f150081b, aVar.f150081b) && Intrinsics.f(this.f150082c, aVar.f150082c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f150080a.hashCode() * 31, 31, this.f150081b), 31, this.f150082c);
    }
}
