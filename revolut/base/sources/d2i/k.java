package d2i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import efm.d0;
import et6.h1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rea.m f110864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f110865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vi0.b f110866c;
    public final x0i.f d;

    public k(rea.m pocketDetailsInteractor, h1 freelancerInteractor, vi0.b accountIdProvider, x0i.f exchangeCurrenciesInteractor) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(accountIdProvider, "accountIdProvider");
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        this.f110864a = pocketDetailsInteractor;
        this.f110865b = freelancerInteractor;
        this.f110866c = accountIdProvider;
        this.d = exchangeCurrenciesInteractor;
    }

    public static dj0.d b(MoneyDetails moneyDetails) {
        Long l2 = moneyDetails.f96898b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f96897a);
    }

    @Override // d2i.f
    public final d0 a(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        wd6.e eVar = draft.f96881c;
        MoneyDetails moneyDetails = draft.f96879a;
        MoneyDetails moneyDetails2 = draft.f96880b;
        j jVar = eVar == wd6.e.BUY ? new j(b(moneyDetails2), b(moneyDetails), eVar, moneyDetails2.f) : new j(b(moneyDetails), b(moneyDetails2), eVar, moneyDetails.f);
        d0 d0VarC = this.d.c(jVar.d, jVar.f110861a.f115083b, this.f110866c.f289492a, io3.l.MERCHANT);
        a aVar = new a(new d27.d0(9), 3);
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(d0VarC, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(ue0.e.I(iVar, h0.f322473a, new d27.d0(10)), new a(new i(this, jVar, 0), 4), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
