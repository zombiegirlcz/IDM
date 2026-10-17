package ec5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124437c;
    public final boolean d;

    public d(String str, String str2, String str3, boolean z) {
        this.f124435a = str;
        this.f124436b = str2;
        this.f124437c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f124435a, dVar.f124435a) && Intrinsics.f(this.f124436b, dVar.f124436b) && Intrinsics.f(this.f124437c, dVar.f124437c) && this.d == dVar.d;
    }

    public final int hashCode() {
        String str = this.f124435a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f124436b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124437c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
