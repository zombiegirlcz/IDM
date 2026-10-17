package com.revolut.feature_crypto_order_flow.impl.exchange;

import cli.y;
import com.revolut.feature.crypto.locked.balance.api.CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import uyh.j;
import uyh.q;
import vkm.j2;
import wd6.e;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
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
        d dVar = this.v;
        y yVar = dVar.K;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            CryptoOrderDraft cryptoOrderDraft = ((j) ((j2) yVar.f22677a).getValue()).f284369a;
            if (cryptoOrderDraft == null) {
                return null;
            }
            if (cryptoOrderDraft.e == e.SELL) {
                StakingPocket stakingPocket = ((j) ((j2) yVar.f22677a).getValue()).f284371c;
                CryptoExchangeContract$MoneyDetails cryptoExchangeContract$MoneyDetails = cryptoOrderDraft.f96689a;
                long j2 = cryptoOrderDraft.f96694j;
                xi0.b bVar = cryptoExchangeContract$MoneyDetails.f96683a;
                dj0.d dVar2 = new dj0.d(j2, bVar);
                dj0.d dVar3 = new dj0.d(cryptoOrderDraft.f96695l, bVar);
                if (dVar3.k() && stakingPocket == null && !((j) ((j2) yVar.f22677a).getValue()).d) {
                    this.u = 1;
                    Object objT2 = dVar.T2(this, new q(dVar, 0));
                    if (objT2 != aVar) {
                        objT2 = Unit.f186387a;
                    }
                    if (objT2 == aVar) {
                        return aVar;
                    }
                } else {
                    h.v2(dVar.L, ((jte.d) dVar.f96750w).c(CryptoLockedBalanceApi$Toggles$CryptoBalanceBreakdown.f70866c) ? new CryptoExchangeScreenContract$ModalStep.CryptoBalanceBreakdown(bVar) : new CryptoExchangeScreenContract$ModalStep.BalanceBreakdown(dVar2, stakingPocket, dVar3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
