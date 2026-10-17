package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details;

import com.revolut.data.model.Data;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import cpb.j;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import xme.f;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
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
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = new j(bVar, null, 24);
            this.u = 1;
            obj2 = u0.b0(bVar.X(), "TRANSFER_POINTS_BUTTON_LOADING_TAG", jVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        f fVar = (f) ((Data) obj2).getContent();
        if (fVar == null || (str = fVar.f307233a) == null) {
            return l.a1(bVar, bVar.X1(b.I2()), null, null, null, 7);
        }
        h.v2(bVar.B, new TradeRevPointsAgentDetailsScreenContract$ModalStep.AccountRegistrationByTaxId(str, bVar.o.f91137a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
