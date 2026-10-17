package com.revolut.feature.tab.invest.impl.ui.home;

import akg.n;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vkm.q;
import ybl.l;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hel.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            n nVarD = l.d(fVar.f89879t);
            this.u = 1;
            obj2 = q.x(nVarD, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) ((Data) obj2).getContent();
        if (tradingLegalEntityInformation == null || (bVar = tradingLegalEntityInformation.f105106a) == null) {
            return null;
        }
        h.v2(fVar.f0, new TabInvestControllerContract$ModalStep.PortfolioValueInfo(bVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
