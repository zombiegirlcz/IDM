package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f136455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136457c;
    public final String d;
    public final y e;

    public z(w type, String title, String str, String str2, y yVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f136455a = type;
        this.f136456b = title;
        this.f136457c = str;
        this.d = str2;
        this.e = yVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f136455a == zVar.f136455a && Intrinsics.f(this.f136456b, zVar.f136456b) && Intrinsics.f(this.f136457c, zVar.f136457c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f136455a.hashCode() * 31, 31, this.f136456b);
        String str = this.f136457c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        y yVar = this.e;
        return iHashCode2 + (yVar != null ? yVar.hashCode() : 0);
    }
}
