package a9g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2581c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2583h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f2584j;

    public t(String id10, String state, String sessionId, String name, String imageUrl, String str, String str2, String str3, List list, w searchParameters) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        this.f2579a = id10;
        this.f2580b = state;
        this.f2581c = sessionId;
        this.d = name;
        this.e = imageUrl;
        this.f = str;
        this.f2582g = str2;
        this.f2583h = str3;
        this.i = list;
        this.f2584j = searchParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f2579a, tVar.f2579a) && Intrinsics.f(this.f2580b, tVar.f2580b) && Intrinsics.f(this.f2581c, tVar.f2581c) && Intrinsics.f(this.d, tVar.d) && Intrinsics.f(this.e, tVar.e) && Intrinsics.f(this.f, tVar.f) && Intrinsics.f(this.f2582g, tVar.f2582g) && Intrinsics.f(this.f2583h, tVar.f2583h) && Intrinsics.f(this.i, tVar.i) && Intrinsics.f(this.f2584j, tVar.f2584j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f2579a.hashCode() * 31, 31, this.f2580b), 31, this.f2581c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2582g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2583h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.i;
        return this.f2584j.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
