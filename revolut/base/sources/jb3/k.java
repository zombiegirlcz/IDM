package jb3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f172591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f172592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cb3.a f172593c;

    public k(co3.a userLocation, co3.a searchLocation, cb3.a flowType) {
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        Intrinsics.checkNotNullParameter(searchLocation, "searchLocation");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f172591a = userLocation;
        this.f172592b = searchLocation;
        this.f172593c = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f172591a, kVar.f172591a) && Intrinsics.f(this.f172592b, kVar.f172592b) && this.f172593c == kVar.f172593c;
    }

    public final int hashCode() {
        return this.f172593c.hashCode() + ((this.f172592b.hashCode() + (this.f172591a.hashCode() * 31)) * 31);
    }
}
