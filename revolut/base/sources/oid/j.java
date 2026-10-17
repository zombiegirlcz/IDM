package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225646c;
    public final String d;

    public j(String id10, String source, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f225644a = id10;
        this.f225645b = source;
        this.f225646c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f225644a, jVar.f225644a) && Intrinsics.f(this.f225645b, jVar.f225645b) && Intrinsics.f(this.f225646c, jVar.f225646c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f225644a.hashCode() * 31, 31, this.f225645b);
        String str = this.f225646c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
