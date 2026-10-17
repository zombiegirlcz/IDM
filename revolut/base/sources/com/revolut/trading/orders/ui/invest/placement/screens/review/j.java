package com.revolut.trading.orders.ui.invest.placement.screens.review;

import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$ModalStep;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import vkm.q;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, Continuation continuation) {
        super(1, continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        o oVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            FrequencySettings frequencySettings = ((hul.h) ((j2) oVar.g0.f22677a).getValue()).f155720b;
            if (frequencySettings != null) {
                lul.e eVar = oVar.L;
                String str = oVar.i0;
                List list = oVar.o.d;
                this.u = 1;
                obj2 = q.x(mo3.a.g(nim.a.v(u0.m(eVar.f200257b.a(), ((vrl.e) eVar.f200258c).c(str)), new li8.n(eVar, 7, frequencySettings, list)), null, new lnk.o(15), 1), this);
                if (obj2 == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        InvestOrderReviewScreenContract$ModalStep.ScheduleSettings scheduleSettings = (InvestOrderReviewScreenContract$ModalStep.ScheduleSettings) obj2;
        if (scheduleSettings != null) {
            oki.h.v2(oVar.f106983h0, scheduleSettings, ModalDestination.Style.POPUP.f98311a);
            return Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
