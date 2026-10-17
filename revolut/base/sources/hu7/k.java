package hu7;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bu7.k f155585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f155586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155587c;

    public k(bu7.k coverageGroup, List pricingPlansId) throws IOException {
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        Intrinsics.checkNotNullParameter(pricingPlansId, "pricingPlansId");
        this.f155585a = coverageGroup;
        this.f155586b = pricingPlansId;
        this.f155587c = "PLAN_COMPARISON_" + coverageGroup + "_" + d0.k0(pricingPlansId, null, null, null, 0, null, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f155585a == kVar.f155585a && Intrinsics.f(this.f155586b, kVar.f155586b);
    }

    public final int hashCode() {
        return this.f155586b.hashCode() + (this.f155585a.hashCode() * 31);
    }
}
