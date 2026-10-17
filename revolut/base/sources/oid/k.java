package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225651c;

    public k(String carouselId, String str, String str2) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        this.f225649a = carouselId;
        this.f225650b = str;
        this.f225651c = str2;
    }

    public final String a() {
        return v0.a.i(v0.a.m("ShopsCarouselDetailsParams(carouselId=", this.f225649a, ", lat=", this.f225650b, ", lon="), this.f225651c, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f225649a, kVar.f225649a) && Intrinsics.f(this.f225650b, kVar.f225650b) && Intrinsics.f(this.f225651c, kVar.f225651c);
    }

    public final int hashCode() {
        int iHashCode = this.f225649a.hashCode() * 31;
        String str = this.f225650b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f225651c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
