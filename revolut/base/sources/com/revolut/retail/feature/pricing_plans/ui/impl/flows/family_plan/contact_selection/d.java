package com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements wgk.b {
    public final wgk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ln3.b f103002p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f103003q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f103004r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xgk.d f103005s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f103006t;

    public d(wgk.c inputData, ln3.b contactsChooserScreenProvider, t pricingPlanInteractor, f familyPlanInvitationPlanProvider, xgk.d familyPlanContactContextHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsChooserScreenProvider, "contactsChooserScreenProvider");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(familyPlanInvitationPlanProvider, "familyPlanInvitationPlanProvider");
        Intrinsics.checkNotNullParameter(familyPlanContactContextHandler, "familyPlanContactContextHandler");
        this.o = inputData;
        this.f103002p = contactsChooserScreenProvider;
        this.f103003q = pricingPlanInteractor;
        this.f103004r = familyPlanInvitationPlanProvider;
        this.f103005s = familyPlanContactContextHandler;
        this.f103006t = d8l.d.a(this, new wde.f(this, 10));
    }

    @Override // yki.j
    public final void M0() {
        l2(new w76.a(this, null, 11), new yi5.b(26)).k(new wdb.b(this, 20));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103006t;
    }
}
