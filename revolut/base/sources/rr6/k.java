package rr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f256716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f256717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f256718c;

    public k(dj0.d plan, dj0.d booster) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(booster, "booster");
        this.f256716a = plan;
        this.f256717b = booster;
        this.f256718c = pyd.c.O(plan, booster);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f256716a, kVar.f256716a) && Intrinsics.f(this.f256717b, kVar.f256717b);
    }

    public final int hashCode() {
        return this.f256717b.hashCode() + (this.f256716a.hashCode() * 31);
    }
}
