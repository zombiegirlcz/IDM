package n61;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212681c;
    public final String d;

    public d(String str, String str2, String str3, String str4) {
        this.f212679a = str;
        this.f212680b = str2;
        this.f212681c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f212679a, dVar.f212679a) && Intrinsics.f(this.f212680b, dVar.f212680b) && Intrinsics.f(this.f212681c, dVar.f212681c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        String str = this.f212679a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f212680b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f212681c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
