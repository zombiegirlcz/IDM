package vke;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f289919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f289920c;
    public final d d;
    public final String e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f289921g;

    public c(String id10, boolean z, String title, d type, String str, a aVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f289918a = id10;
        this.f289919b = z;
        this.f289920c = title;
        this.d = type;
        this.e = str;
        this.f = aVar;
        this.f289921g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f289918a, cVar.f289918a) && this.f289919b == cVar.f289919b && Intrinsics.f(this.f289920c, cVar.f289920c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f289921g, cVar.f289921g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(j6.a.c(this.f289918a.hashCode() * 31, 31, this.f289919b), 31, this.f289920c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f289921g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
