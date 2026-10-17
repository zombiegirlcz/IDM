package vr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291510c;
    public final String d;

    public b(String businessCategoryId, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(businessCategoryId, "businessCategoryId");
        this.f291508a = businessCategoryId;
        this.f291509b = str;
        this.f291510c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f291508a, bVar.f291508a) && Intrinsics.f(this.f291509b, bVar.f291509b) && Intrinsics.f(this.f291510c, bVar.f291510c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f291508a.hashCode() * 31;
        String str = this.f291509b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f291510c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
