package kwb;

import kotlin.jvm.internal.Intrinsics;
import tvb.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f190323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f190324c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f190325g;

    public a(String id10, e source, String str, String name, String logoImageUrl, String category, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(logoImageUrl, "logoImageUrl");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f190322a = id10;
        this.f190323b = source;
        this.f190324c = str;
        this.d = name;
        this.e = logoImageUrl;
        this.f = category;
        this.f190325g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f190322a, aVar.f190322a) && this.f190323b == aVar.f190323b && Intrinsics.f(this.f190324c, aVar.f190324c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f190325g == aVar.f190325g;
    }

    public final int hashCode() {
        int iHashCode = (this.f190323b.hashCode() + (this.f190322a.hashCode() * 31)) * 31;
        String str = this.f190324c;
        return Boolean.hashCode(this.f190325g) + p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
