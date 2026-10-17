package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215926c;

    public l1(String str, String str2, String str3) {
        this.f215924a = str;
        this.f215925b = str2;
        this.f215926c = str3;
    }

    public final String a() {
        return this.f215926c;
    }

    public final String b() {
        return this.f215924a;
    }

    public final String c() {
        return this.f215925b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.f215924a, l1Var.f215924a) && Intrinsics.f(this.f215925b, l1Var.f215925b) && Intrinsics.f(this.f215926c, l1Var.f215926c);
    }

    public final int hashCode() {
        String str = this.f215924a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215925b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215926c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
