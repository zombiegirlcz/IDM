package xyb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f309700b;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data pricingPlan, Data benefits, int i) {
        if ((i & 1) != 0) {
            pricingPlan = dVar.f309699a;
        }
        if ((i & 2) != 0) {
            benefits = dVar.f309700b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new d(pricingPlan, benefits);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f309699a, dVar.f309699a) && Intrinsics.f(this.f309700b, dVar.f309700b);
    }

    public final int hashCode() {
        return this.f309700b.hashCode() + (this.f309699a.hashCode() * 31);
    }

    public d(Data pricingPlan, Data benefits) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f309699a = pricingPlan;
        this.f309700b = benefits;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, true, 3, null));
    }
}
