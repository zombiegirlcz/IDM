package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f325854b;

    public u(dj0.d amount, String petId) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f325853a = petId;
        this.f325854b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f325853a, uVar.f325853a) && Intrinsics.f(this.f325854b, uVar.f325854b);
    }

    public final int hashCode() {
        return this.f325854b.hashCode() + (this.f325853a.hashCode() * 31);
    }
}
