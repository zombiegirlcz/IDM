package com.revolut.feature.pockets.impl.details_v2.flow;

import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.domain.PocketDetailsBottomButtonAction;
import com.revolut.feature.pockets.impl.details_v2.flow.PocketDetailsV2FlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cu8.r0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ks8.c;
import ks8.j;
import oki.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objF;
        FlowStep openPocketDetailsStep;
        b bVar = this.v;
        PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            r0 r0Var = bVar.f80810p;
            c.Companion.getClass();
            c cVar = c.f;
            this.u = 1;
            objF = r0Var.f(cVar, this);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objF = obj2;
        }
        j jVar = (j) objF;
        if (jVar instanceof ks8.i) {
            h.D2(bVar.f80811q);
            bVar.C1(u0.b(((ks8.i) jVar).f189312a));
        } else {
            if (!(jVar instanceof j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = aea.c.f3522a[pocketDetailsFlowContract$InputData.f80771a.f163149h.ordinal()];
            if (i2 == 1) {
                CheckoutParams checkoutParams = pocketDetailsFlowContract$InputData.f80775h;
                PocketDetailsBottomButtonAction.OrderCard orderCard = checkoutParams instanceof CheckoutParams.CardOrder ? new PocketDetailsBottomButtonAction.OrderCard(pocketDetailsFlowContract$InputData.i, checkoutParams) : null;
                openPocketDetailsStep = new PocketDetailsV2FlowContract$Step.OpenPocketDetailsStep(pocketDetailsFlowContract$InputData.f80771a, pocketDetailsFlowContract$InputData.f80772b, pocketDetailsFlowContract$InputData.f80773c, pocketDetailsFlowContract$InputData.d, pocketDetailsFlowContract$InputData.e, pocketDetailsFlowContract$InputData.f, pocketDetailsFlowContract$InputData.f80774g, orderCard, pocketDetailsFlowContract$InputData.f80776j, pocketDetailsFlowContract$InputData.k);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                openPocketDetailsStep = PocketDetailsV2FlowContract$Step.LinkedAccountDetailsStep.f80803a;
            }
            h.u2(bVar, bVar.f80811q, openPocketDetailsStep, null, 6);
        }
        return Unit.f186387a;
    }
}
