package com.revolut.feature.card.verification.impl.flow.card_penny_topup;

import com.revolut.feature.card.verification.impl.flow.card_penny_topup.CardPennyTopUpFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f64404w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, boolean z, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f64404w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f64404w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            Map mapK = r0.k(new Pair(ib.b.Flow, "VERIFY_EXTERNAL_CARD"), new Pair("externalCardId", bVar.o.f64398a), new Pair("topupSuccessful", String.valueOf(this.f64404w)));
            jvh.a aVar2 = bVar.f64405p;
            this.u = 1;
            obj2 = aVar2.b(mapK, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.w2(bVar.f64407r, new CardPennyTopUpFlowContract$Step.CardVerificationWorkflow((String) obj2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
