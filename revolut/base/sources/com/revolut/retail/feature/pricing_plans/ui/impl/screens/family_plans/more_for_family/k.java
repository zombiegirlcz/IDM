package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family;

import djb.n;
import g48.r0;
import klf.w1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njj.l;
import vkm.v1;
import vkm.y;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f103446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f103447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f103448c;
    public final an8.b d;
    public final n e;
    public final ijb.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dcd.b f103449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jla.h f103450h;

    public k(gte.a featureToggleInteractor, r0 jointAccountsInteractor, hj8.a juniorProfileInteractor, an8.b juniorSavingProductInteractor, n savingsAccountsDetailsInteractor, ijb.a savingsProductInteractor, dcd.b savingsInterestRateFormatter, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f103446a = featureToggleInteractor;
        this.f103447b = jointAccountsInteractor;
        this.f103448c = juniorProfileInteractor;
        this.d = juniorSavingProductInteractor;
        this.e = savingsAccountsDetailsInteractor;
        this.f = savingsProductInteractor;
        this.f103449g = savingsInterestRateFormatter;
        this.f103450h = productCatalogueInteractor;
    }

    public static v1 a(Function1 function1) {
        return new v1(new iji.d(5, (Continuation) null, function1));
    }

    public final y b() {
        return new y(new w1(2, 14, null), new l(new ae8.c(bla.b.b(this.f103450h, "YOUTH"), 20), 8));
    }
}
