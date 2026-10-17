package com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.CreditCardOfferFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import g84.m;
import ggk.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import w4l.j;
import wik.t;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function1 {
    public nu3.c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f67382w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Continuation continuation) {
        super(1, continuation);
        this.f67382w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f67382w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        nu3.c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        i iVar = this.f67382w;
        if (i == 0) {
            o.b(obj2);
            g84.e eVar = iVar.f67384q;
            this.v = 1;
            obj2 = ((m) eVar).h(this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.u;
            o.b(obj2);
            oki.h.w2(iVar.z, new CreditCardOfferFlowContract$Step.Benefits(cVar.d), ModalDestination.Style.POPUP.f98311a);
            return Unit.f186387a;
        }
        o.b(obj2);
        nu3.c cVar2 = (nu3.c) obj2;
        jhi.b bVarG = mo3.a.g(((t) iVar.f67385r).f(cVar2.d.f219197a, g0.CREDIT_CARD_OFFER_BENEFITS, j.f294644c), null, new g5k.f(9), 1);
        this.u = cVar2;
        this.v = 2;
        if (q.z(bVarG, this) != aVar) {
            cVar = cVar2;
            oki.h.w2(iVar.z, new CreditCardOfferFlowContract$Step.Benefits(cVar.d), ModalDestination.Style.POPUP.f98311a);
            return Unit.f186387a;
        }
        return aVar;
    }
}
