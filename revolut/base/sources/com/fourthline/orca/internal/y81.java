package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y81 implements x81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x71 f35192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35193b;

    public y81(x71 taxationCountry, String str) {
        Intrinsics.checkNotNullParameter(taxationCountry, "taxationCountry");
        this.f35192a = taxationCountry;
        this.f35193b = str;
    }

    @Override // com.fourthline.orca.internal.x81
    public x71 a() {
        return this.f35192a;
    }

    @Override // com.fourthline.orca.internal.x81
    public String b() {
        return this.f35193b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y81)) {
            return false;
        }
        y81 y81Var = (y81) obj2;
        return this.f35192a == y81Var.f35192a && Intrinsics.f(this.f35193b, y81Var.f35193b);
    }

    public int hashCode() {
        int iHashCode = this.f35192a.hashCode() * 31;
        String str = this.f35193b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TinDetailsRepositoryData(taxationCountry=" + this.f35192a + ", taxationCodeSuggestion=" + this.f35193b + ")";
    }
}
