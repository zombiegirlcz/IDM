package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change;

import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.PlanChangeFlowContract$Step;
import gim.i;
import hha.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutOrder f103129w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f103130x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hha.i f103131y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, CheckoutOrder checkoutOrder, d dVar, hha.i iVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f103129w = checkoutOrder;
        this.f103130x = dVar;
        this.f103131y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f103129w, this.f103130x, this.f103131y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CheckoutOrder checkoutOrder = this.f103129w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = b.I2(bVar, checkoutOrder, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.w2(bVar.z, new PlanChangeFlowContract$Step.ExistingPreorderWarning(this.f103130x, checkoutOrder, (kha.d) obj2, this.f103131y), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
        return Unit.f186387a;
    }
}
