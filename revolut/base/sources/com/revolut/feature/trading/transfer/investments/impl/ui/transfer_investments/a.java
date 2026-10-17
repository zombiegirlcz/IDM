package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments;

import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.TransferInvestmentsFlowContract$Step;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import raf.f;
import raf.g;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f91620w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f91620w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f91620w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        g gVar = this.f91620w;
        if (i == 0) {
            o.b(obj2);
            qaf.b bVar = dVar.f91621p;
            TradingAccount tradingAccount = ((f) gVar).f252829a;
            this.u = 1;
            obj2 = bVar.a(tradingAccount, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        ProductArticleKey productArticleKey = (ProductArticleKey) obj2;
        if (productArticleKey == null) {
            d.I2(dVar, ((f) gVar).f252829a, true);
        } else {
            h.t2(dVar, dVar.f91624s, new TransferInvestmentsFlowContract$Step.ProductArticle(((f) gVar).f252829a, productArticleKey), true, null, false, 12);
        }
        return Unit.f186387a;
    }
}
