package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154947c;
    public final String d;
    public final r e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f154948g;

    public t(String title, String str, String str2, String str3, r congratulationType, s sVar, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(congratulationType, "congratulationType");
        this.f154945a = title;
        this.f154946b = str;
        this.f154947c = str2;
        this.d = str3;
        this.e = congratulationType;
        this.f = sVar;
        this.f154948g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f154945a, tVar.f154945a) && Intrinsics.f(this.f154946b, tVar.f154946b) && Intrinsics.f(this.f154947c, tVar.f154947c) && Intrinsics.f(this.d, tVar.d) && this.e == tVar.e && Intrinsics.f(this.f, tVar.f) && this.f154948g == tVar.f154948g;
    }

    public final int hashCode() {
        int iHashCode = this.f154945a.hashCode() * 31;
        String str = this.f154946b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f154947c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        s sVar = this.f;
        return Boolean.hashCode(this.f154948g) + ((iHashCode4 + (sVar != null ? sVar.hashCode() : 0)) * 31);
    }
}
