package com.revolut.feature.tab.invest.impl.ui.home;

import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.tab.invest.impl.ui.home.TabInvestControllerContract$HeaderState;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import yhm.r;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(2, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVar = (r) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ChosenBackground chosenBackground = (ChosenBackground) rVar.f314201a;
        return new TabInvestControllerContract$HeaderState.PreOnboarding((TradingLegalEntityInformation) rVar.f314202b, chosenBackground, f0.f322471a, null, (TradingAccounts) rVar.f314203c);
    }
}
