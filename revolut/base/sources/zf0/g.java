package zf0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321847c;

    public g(String key, String language, String json) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f321845a = key;
        this.f321846b = language;
        this.f321847c = json;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f321845a, gVar.f321845a) && Intrinsics.f(this.f321846b, gVar.f321846b) && Intrinsics.f(this.f321847c, gVar.f321847c);
    }

    public final int hashCode() {
        return this.f321847c.hashCode() + p.a.c(this.f321845a.hashCode() * 31, 31, this.f321846b);
    }

    public g() {
        this("", "", "");
    }
}
