package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation;

import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.CobrandedCardsPostActivationFlowContract$Step;
import d8l.d;
import e6b.e;
import e93.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mz3.r;
import n3j.w;
import n68.x;
import oki.h;
import qh3.c;
import yki.i;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements n6b.b {
    public final CobrandedCardsPostActivationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q5b.b f82545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f82546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e6b.b f82547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f82548s;

    public b(CobrandedCardsPostActivationFlowContract$InputData inputData, q5b.b cobrandedCardsPlansInteractor, c checkoutControllerExtension, e6b.b cardOrderNavigationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        Intrinsics.checkNotNullParameter(checkoutControllerExtension, "checkoutControllerExtension");
        Intrinsics.checkNotNullParameter(cardOrderNavigationResolver, "cardOrderNavigationResolver");
        this.o = inputData;
        this.f82545p = cobrandedCardsPlansInteractor;
        this.f82546q = checkoutControllerExtension;
        this.f82547r = cardOrderNavigationResolver;
        this.f82548s = d.a(this, new r(this, 20));
    }

    public final void I2() {
        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = this.o;
        if (cobrandedCardsPostActivationFlowContract$InputData instanceof CobrandedCardsPostActivationFlowContract$InputData.Default) {
            h.D2(this.f82548s);
        } else {
            if (!(cobrandedCardsPostActivationFlowContract$InputData instanceof CobrandedCardsPostActivationFlowContract$InputData.PostActivation)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(u0.b(((CobrandedCardsPostActivationFlowContract$InputData.PostActivation) cobrandedCardsPostActivationFlowContract$InputData).f82538a));
        }
    }

    public final void J2(f fVar, CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration) {
        this.f82547r.getClass();
        e eVarA = e6b.b.a(fVar, cobrandedCardsCardConfiguration);
        if (eVarA instanceof e6b.c) {
            l2(new w(this, (e6b.c) eVarA, (Continuation) null, 7), new yi5.b(26));
        } else {
            if (!(eVarA instanceof e6b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            C1(((e6b.d) eVarA).f122964a);
        }
    }

    @Override // yki.j
    public final void M0() {
        CobrandedCardsPostActivationFlowContract$InputData cobrandedCardsPostActivationFlowContract$InputData = this.o;
        Continuation continuation = null;
        if ((cobrandedCardsPostActivationFlowContract$InputData instanceof CobrandedCardsPostActivationFlowContract$InputData.PostActivation) || ((cobrandedCardsPostActivationFlowContract$InputData instanceof CobrandedCardsPostActivationFlowContract$InputData.Default) && !((CobrandedCardsPostActivationFlowContract$InputData.Default) cobrandedCardsPostActivationFlowContract$InputData).f82537b)) {
            h.u2(this, this.f82548s, CobrandedCardsPostActivationFlowContract$Step.CardSelectionDashboard.f82540a, null, 6);
        } else {
            l2(new x(this, continuation, 1), new n6b.c(this, 0));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f82548s;
    }
}
