package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321842c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f321843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f321844h;
    public final String i;

    public f(int i, String type, String key, String title, String parentKey, String contentStyle, String deeplink, String language, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parentKey, "parentKey");
        Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(language, "language");
        this.f321840a = type;
        this.f321841b = key;
        this.f321842c = title;
        this.d = parentKey;
        this.e = contentStyle;
        this.f = deeplink;
        this.f321843g = language;
        this.f321844h = i;
        this.i = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f321840a, fVar.f321840a) && Intrinsics.f(this.f321841b, fVar.f321841b) && Intrinsics.f(this.f321842c, fVar.f321842c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f321843g, fVar.f321843g) && this.f321844h == fVar.f321844h && Intrinsics.f(this.i, fVar.i);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f321844h, p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f321840a.hashCode() * 31, 31, this.f321841b), 31, this.f321842c), 31, this.d), 31, this.e), 31, this.f), 31, this.f321843g), 31);
        String str = this.i;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public f() {
        this(0, "", "", "", "", "", "", "", null);
    }
}
