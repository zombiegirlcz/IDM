package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eb1 f29213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f29214b;

    public hb1(eb1 navigation, hq0 hq0Var) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f29213a = navigation;
        this.f29214b = hq0Var;
    }

    public final hq0 a() {
        return this.f29214b;
    }

    public final eb1 b() {
        return this.f29213a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof hb1)) {
            return false;
        }
        hb1 hb1Var = (hb1) obj2;
        return Intrinsics.f(this.f29213a, hb1Var.f29213a) && Intrinsics.f(this.f29214b, hb1Var.f29214b);
    }

    public int hashCode() {
        int iHashCode = this.f29213a.hashCode() * 31;
        hq0 hq0Var = this.f29214b;
        return iHashCode + (hq0Var == null ? 0 : hq0Var.hashCode());
    }

    public String toString() {
        return "TypeSelectActions(navigation=" + this.f29213a + ", linkButtonPopup=" + this.f29214b + ")";
    }
}
