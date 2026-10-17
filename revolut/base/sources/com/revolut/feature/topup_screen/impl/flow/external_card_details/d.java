package com.revolut.feature.topup_screen.impl.flow.external_card_details;

import com.revolut.feature.topup_screen.impl.flow.external_card_details.ExternalCardDetailsFlowContract$Step;
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

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f90611w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f90611w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f90611w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = eVar.u;
            Map mapK = r0.k(new Pair(ib.b.Flow, "VERIFY_EXTERNAL_CARD"), new Pair("externalCardId", this.f90611w));
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
        h.w2(eVar.f90618x, new ExternalCardDetailsFlowContract$Step.CardVerificationWorkflow((String) obj2), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
