package com.revolut.feature_crypto_order_flow.impl.exchange;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$ModalStep;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import vkm.q;
import wd6.e;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoOrderDraft f96738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, CryptoOrderDraft cryptoOrderDraft, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f96738w = cryptoOrderDraft;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f96738w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        CryptoOrderDraft cryptoOrderDraft = this.f96738w;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = q.x(dVar.f96752y.p(new Pair(cryptoOrderDraft.f96689a.f96683a, cryptoOrderDraft.f96690b.f96683a)), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n9l.a aVar2 = (n9l.a) d0.o0((List) obj2);
        if (aVar2 == null) {
            return Unit.f186387a;
        }
        h.v2(dVar.L, new CryptoExchangeScreenContract$ModalStep.TpslSettings(new TakeProfitStopLossParams(aVar2.f213662b, aVar2.f213661a, r0i.c.TP_SL, (float) aVar2.f213663c, e.SELL, oyh.b.d(cryptoOrderDraft.f96689a), oyh.b.d(cryptoOrderDraft.f96690b), cryptoOrderDraft.f96697n, null)), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
