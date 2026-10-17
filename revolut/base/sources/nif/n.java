package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215947c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public n(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f215945a = str;
        this.f215946b = str2;
        this.f215947c = str3;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
    }

    public final Boolean a() {
        return this.f;
    }

    public final Boolean b() {
        return this.d;
    }

    public final String c() {
        return this.f215945a;
    }

    public final String d() {
        return this.f215947c;
    }

    public final String e() {
        return this.f215946b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f215945a, nVar.f215945a) && Intrinsics.f(this.f215946b, nVar.f215946b) && Intrinsics.f(this.f215947c, nVar.f215947c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f);
    }

    public final Boolean f() {
        return this.e;
    }

    public final int hashCode() {
        String str = this.f215945a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215946b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215947c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }
}
