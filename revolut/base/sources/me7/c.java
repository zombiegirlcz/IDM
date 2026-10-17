package me7;

import kotlin.jvm.internal.Intrinsics;
import v30.s;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f204620a;

    public c(s pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f204620a = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f204620a == ((c) obj2).f204620a;
    }

    public final int hashCode() {
        return this.f204620a.hashCode();
    }
}
