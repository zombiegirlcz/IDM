package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215853c;

    public h3(String str, String str2, String str3) {
        this.f215851a = str;
        this.f215852b = str2;
        this.f215853c = str3;
    }

    public final String a() {
        return this.f215853c;
    }

    public final String b() {
        return this.f215852b;
    }

    public final String c() {
        return this.f215851a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f215851a, h3Var.f215851a) && Intrinsics.f(this.f215852b, h3Var.f215852b) && Intrinsics.f(this.f215853c, h3Var.f215853c);
    }

    public final int hashCode() {
        String str = this.f215851a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215852b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f215853c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
