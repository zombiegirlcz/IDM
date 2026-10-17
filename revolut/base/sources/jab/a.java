package jab;

import ffk.t;
import gab.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f172473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f172474b;

    public a(c juniorPricingPlansRepository, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(juniorPricingPlansRepository, "juniorPricingPlansRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f172473a = juniorPricingPlansRepository;
        this.f172474b = pricingPlanInteractor;
    }
}
