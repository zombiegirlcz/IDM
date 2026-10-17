package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yg0 f35582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yg0 f35583b;

    public zg0(yg0 cellStyle1, yg0 cellStyle2) {
        Intrinsics.checkNotNullParameter(cellStyle1, "cellStyle1");
        Intrinsics.checkNotNullParameter(cellStyle2, "cellStyle2");
        this.f35582a = cellStyle1;
        this.f35583b = cellStyle2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zg0)) {
            return false;
        }
        zg0 zg0Var = (zg0) obj2;
        return Intrinsics.f(this.f35582a, zg0Var.f35582a) && Intrinsics.f(this.f35583b, zg0Var.f35583b);
    }

    public int hashCode() {
        return (this.f35582a.hashCode() * 31) + this.f35583b.hashCode();
    }

    public String toString() {
        return "OrcaCells(cellStyle1=" + this.f35582a + ", cellStyle2=" + this.f35583b + ")";
    }
}
