package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321850c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f321851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f321852h;

    public h(String type, String key, String parentKey, String title, String str, String language, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f321848a = type;
        this.f321849b = key;
        this.f321850c = parentKey;
        this.d = title;
        this.e = z;
        this.f = str;
        this.f321851g = language;
        this.f321852h = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f321848a, hVar.f321848a) && Intrinsics.f(this.f321849b, hVar.f321849b) && Intrinsics.f(this.f321850c, hVar.f321850c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f321851g, hVar.f321851g) && Intrinsics.f(this.f321852h, hVar.f321852h);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(p.a.c(p.a.c(this.f321848a.hashCode() * 31, 31, this.f321849b), 31, this.f321850c), 31, this.d), 31, this.e);
        String str = this.f;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f321851g);
        String str2 = this.f321852h;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }

    public h() {
        this("", "", "", "", null, "", false, null);
    }
}
