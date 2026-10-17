package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173471c;

    public i(String str, String str2, String str3) {
        this.f173469a = str;
        this.f173470b = str2;
        this.f173471c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f173469a, iVar.f173469a) && Intrinsics.f(this.f173470b, iVar.f173470b) && Intrinsics.f(this.f173471c, iVar.f173471c);
    }

    public final int hashCode() {
        String str = this.f173469a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173470b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173471c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
