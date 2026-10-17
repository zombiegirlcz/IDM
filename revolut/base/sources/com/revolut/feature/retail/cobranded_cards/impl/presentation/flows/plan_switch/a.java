package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch.CobrandedCardsPlanSwitchFlowContract$Step;
import cp5.d;
import e6b.e;
import e93.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l6b.b;
import oki.h;
import qh3.c;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e6b.b f82534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f82535q;

    public a(c checkoutControllerExtension, e6b.b cardOrderNavigationResolver) {
        Intrinsics.checkNotNullParameter(checkoutControllerExtension, "checkoutControllerExtension");
        Intrinsics.checkNotNullParameter(cardOrderNavigationResolver, "cardOrderNavigationResolver");
        this.o = checkoutControllerExtension;
        this.f82534p = cardOrderNavigationResolver;
        v vVar = new v(this, 12);
        this.f82535q = d.a(this, CobrandedCardsPlanSwitchFlowContract$Step.CardSelectionDashboard.f82528a, f0.f322471a, vVar);
    }

    public final void I2(f fVar, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration) {
        this.f82534p.getClass();
        e eVarA = e6b.b.a(fVar, cobrandedCardsCardConfiguration);
        if (eVarA instanceof e6b.c) {
            l2(new l34.a(this, (e6b.c) eVarA, null, 7), new yi5.b(26));
        } else {
            if (!(eVarA instanceof e6b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(((e6b.d) eVarA).f122964a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82535q;
    }
}
