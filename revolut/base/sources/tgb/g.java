package tgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271139c;

    public g(String imageUrl, String title, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f271137a = imageUrl;
        this.f271138b = title;
        this.f271139c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f271137a, gVar.f271137a) && Intrinsics.f(this.f271138b, gVar.f271138b) && Intrinsics.f(this.f271139c, gVar.f271139c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f271137a.hashCode() * 31, 31, this.f271138b);
        String str = this.f271139c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
