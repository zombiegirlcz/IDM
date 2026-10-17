package com.revolut.feature.add_money.impl.flow;

import com.revolut.feature.add_money.impl.flow.AddMoneyFlowContract$Step;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import io3.l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mh1.m;
import mh1.n;
import oki.h;
import rd0.d;
import skm.e0;
import yhm.o;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
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
    public final Object invokeSuspend(Object obj2) throws Exception {
        BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton additionalCurrenciesButton;
        Object objO;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                n nVar = cVar.f60918p;
                this.u = 1;
                nVar.getClass();
                objO = e0.o(new m(nVar, null), this);
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                objO = obj2;
            }
            additionalCurrenciesButton = (BalanceSelector$ExtraConfiguration.AdditionalCurrenciesButton) objO;
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e, h0Var);
            additionalCurrenciesButton = null;
        }
        h.u2(cVar, cVar.f60921s, new AddMoneyFlowContract$Step.BalancePicker(new BalanceSelector$InputData(cVar.o.f60915a, k1j.d.RETAIL, l.CURRENT, null, null, null, null, null, z0.i(additionalCurrenciesButton, BalanceSelector$ExtraConfiguration.SearchEnabled.f99374a), Constants.TAG_FULL_SVPP_IDENTIFICATION)), null, 6);
        return Unit.f186387a;
    }
}
