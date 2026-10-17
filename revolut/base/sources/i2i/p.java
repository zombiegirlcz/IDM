package i2i;

import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature_exchange.api.models.ExchangePocket;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import g1i.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157969a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f157970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a f157971c;

    public /* synthetic */ p(ExchangeOrderDraft exchangeOrderDraft, com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar) {
        this.f157970b = exchangeOrderDraft;
        this.f157971c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f157969a) {
            case 0:
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                m1i.m mVar = this.f157971c.f96946j;
                ExchangeOrderDraft exchangeOrderDraft = this.f157970b;
                xi0.b bVar = exchangeOrderDraft.f96880b.f96897a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : currencies) {
                    if (!Intrinsics.f((xi0.b) obj3, exchangeOrderDraft.f96879a.f96897a)) {
                        arrayList.add(obj3);
                    }
                }
                return ue0.e.v(((l0) mVar).p(arrayList, bVar, 324));
            default:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                StakingPocket stakingPocket = (StakingPocket) it8.f224257a;
                ExchangeOrderDraft exchangeOrderDraft2 = this.f157970b;
                MoneyDetails moneyDetails = exchangeOrderDraft2.f96879a;
                long j2 = moneyDetails.f96899c;
                xi0.b bVar2 = moneyDetails.f96897a;
                dj0.d dVar = new dj0.d(j2, bVar2);
                Iterator it9 = exchangeOrderDraft2.k.values().iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (Intrinsics.f(((ExchangePocket) next).f96823b, bVar2.f306286a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ExchangePocket exchangePocket = (ExchangePocket) next;
                long j3 = exchangePocket != null ? exchangePocket.d : 0L;
                dj0.d dVar2 = new dj0.d(j3, bVar2);
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar = this.f157971c;
                if (stakingPocket != null) {
                    return new pfm.h(new aed.d(aVar, dVar, stakingPocket, dVar2, 6), 2);
                }
                if (exchangeOrderDraft2.f96881c != wd6.e.SELL) {
                    return pfm.m.f235744a;
                }
                if (j3 > 0) {
                    return new pfm.h(new a09.a0(aVar, 18, dVar, dVar2), 2);
                }
                m1i.k kVar = aVar.k;
                l4i.a aVar2 = aVar.u;
                MoneyDetails moneyDetails2 = exchangeOrderDraft2.f96879a;
                dj0.d dVar3 = new dj0.d(moneyDetails2.f96899c, moneyDetails2.f96897a);
                aVar2.getClass();
                Amount amount = l4i.a.e(dVar3);
                g1i.d0 d0Var = (g1i.d0) kVar;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                return d0Var.R3(new g0f.f(d0Var, amount, 15));
        }
    }

    public /* synthetic */ p(com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar, ExchangeOrderDraft exchangeOrderDraft) {
        this.f157971c = aVar;
        this.f157970b = exchangeOrderDraft;
    }
}
