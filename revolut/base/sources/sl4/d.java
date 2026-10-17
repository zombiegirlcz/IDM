package sl4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264142c;
    public final String d;
    public final String e;

    public d(String title, String description, String logoUrl, String deepLink, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        this.f264140a = title;
        this.f264141b = description;
        this.f264142c = logoUrl;
        this.d = deepLink;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f264140a, dVar.f264140a) && Intrinsics.f(this.f264141b, dVar.f264141b) && Intrinsics.f(this.f264142c, dVar.f264142c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f264140a.hashCode() * 31, 31, this.f264141b), 31, this.f264142c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
