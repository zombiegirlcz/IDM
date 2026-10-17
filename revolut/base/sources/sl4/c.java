package sl4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264139c;
    public final a d;
    public final String e;
    public final String f;

    public c(String title, String logoUrl, String backgroundImageUrl, a badge, String deeplink, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f264137a = title;
        this.f264138b = logoUrl;
        this.f264139c = backgroundImageUrl;
        this.d = badge;
        this.e = deeplink;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f264137a, cVar.f264137a) && Intrinsics.f(this.f264138b, cVar.f264138b) && Intrinsics.f(this.f264139c, cVar.f264139c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c((this.d.hashCode() + p.a.c(p.a.c(this.f264137a.hashCode() * 31, 31, this.f264138b), 31, this.f264139c)) * 31, 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
