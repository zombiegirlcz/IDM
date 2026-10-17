package wok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298948c;

    public i(String str, String str2, boolean z) {
        this.f298946a = str;
        this.f298947b = str2;
        this.f298948c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f298946a, iVar.f298946a) && Intrinsics.f(this.f298947b, iVar.f298947b) && this.f298948c == iVar.f298948c;
    }

    public final int hashCode() {
        String str = this.f298946a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f298947b;
        return Boolean.hashCode(this.f298948c) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
