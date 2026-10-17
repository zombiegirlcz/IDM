package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class z81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x71 f35547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35548b;

    public z81(x71 taxationCountry, String taxNumber) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        Intrinsics.checkNotNullParameter(taxNumber, "taxNumber");
        this.f35547a = taxationCountry;
        this.f35548b = taxNumber;
    }

    public final String a() {
        return this.f35548b;
    }

    public final x71 b() {
        return this.f35547a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z81)) {
            return false;
        }
        z81 z81Var = (z81) obj2;
        return this.f35547a == z81Var.f35547a && Intrinsics.f(this.f35548b, z81Var.f35548b);
    }

    public int hashCode() {
        return (this.f35547a.hashCode() * 31) + this.f35548b.hashCode();
    }

    public String toString() {
        return "TinDetailsResult(taxationCountry=" + this.f35547a + ", taxNumber=" + this.f35548b + ")";
    }
}
