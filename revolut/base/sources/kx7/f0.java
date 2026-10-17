package kx7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zw7.p f190458b;

    public f0(String petId, zw7.p petEditData) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(petEditData, "petEditData");
        this.f190457a = petId;
        this.f190458b = petEditData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f190457a, f0Var.f190457a) && Intrinsics.f(this.f190458b, f0Var.f190458b);
    }

    public final int hashCode() {
        return this.f190458b.hashCode() + (this.f190457a.hashCode() * 31);
    }
}
