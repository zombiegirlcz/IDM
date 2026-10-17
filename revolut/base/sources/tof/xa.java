package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xa extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.l f273167a;

    public xa(io3.l pocketType) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f273167a = pocketType;
    }

    public final io3.l a() {
        return this.f273167a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xa) && this.f273167a == ((xa) obj2).f273167a;
    }

    public final int hashCode() {
        return this.f273167a.hashCode();
    }
}
