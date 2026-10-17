package vfk;

import hha.d;
import kotlin.jvm.internal.Intrinsics;
import vfk.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f288665a;

    public a(d pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        this.f288665a = pricingPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f288665a, ((a) obj2).f288665a);
    }

    public final int hashCode() {
        return this.f288665a.hashCode();
    }
}
