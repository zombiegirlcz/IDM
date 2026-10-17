package hj3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f152662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152663c;
    public final String d;
    public final b e;

    public g(String id10, c cVar, String str, String str2, b background) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f152661a = id10;
        this.f152662b = cVar;
        this.f152663c = str;
        this.d = str2;
        this.e = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f152661a, gVar.f152661a) && Intrinsics.f(this.f152662b, gVar.f152662b) && Intrinsics.f(this.f152663c, gVar.f152663c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f152661a.hashCode() * 31;
        c cVar = this.f152662b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f152663c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
