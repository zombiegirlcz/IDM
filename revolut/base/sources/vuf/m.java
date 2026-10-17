package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292381c;

    public m(String defaultDescription, String str, String str2) {
        Intrinsics.checkNotNullParameter(defaultDescription, "defaultDescription");
        this.f292379a = defaultDescription;
        this.f292380b = str;
        this.f292381c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f292379a, mVar.f292379a) && Intrinsics.f(this.f292380b, mVar.f292380b) && Intrinsics.f(this.f292381c, mVar.f292381c);
    }

    public final int hashCode() {
        int iHashCode = this.f292379a.hashCode() * 31;
        String str = this.f292380b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f292381c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
