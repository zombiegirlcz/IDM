package hul;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155734w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f155734w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f155734w, continuation, 0);
            case 1:
                return new i0(this.f155734w, continuation, 1);
            case 2:
                return new i0(this.f155734w, continuation, 2);
            case 3:
                return new i0(this.f155734w, continuation, 3);
            default:
                return new i0(this.f155734w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.f155734w;
                jhi.b bVarG = mo3.a.g(u0.m(oVar.f106990w.Z2(), new t0(oVar.g0.B(new hu1.h0(21)), 1)), null, new ht1.l(17), 1);
                this.v = 1;
                Object objX = vkm.q.x(bVarG, this);
                return objX == aVar ? aVar : objX;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = this.f155734w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = vkm.q.x(mo3.a.g(ybl.l.d(oVar2.f106986q), null, new ht1.l(8), 1), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                hel.b tradingContext = ((TradingLegalEntityInformation) obj2).f105106a;
                if (tradingContext == null) {
                    return null;
                }
                csl.k kVar = oVar2.f106985p;
                Data data = ((h) ((j2) oVar2.g0.f22677a).getValue()).f155726m;
                TradingAccount tradingAccount = data != null ? (TradingAccount) data.getContent() : null;
                ((csl.n) kVar).getClass();
                Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                boolean z = (tradingAccount == null || (listC0 = tradingAccount.c0()) == null || !com.revolut.shared.feature.wealth.models.trading_accounts.b.d(listC0)) ? false : true;
                hel.b bVar = hel.b.EEA;
                oVar2.A.x(csl.n.d(new rp0.t(new TextLocalisedClause(R$string.trading_orders_settlement_date_title, null, null, 14), new TextLocalisedClause((tradingContext == bVar && z) ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_rseuab : tradingContext == bVar ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_rseuab : z ? com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_jisa_text_other : com.revolut.retail.wealth.resources.R$string.trading_cash_settlement_text_other, null, null, 14), null, 28)));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = this.f155734w;
                i0 i0Var = new i0(oVar3, null, 1);
                this.v = 1;
                Object objP2 = oVar3.p2(this, i0Var);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = this.f155734w;
                    com.revolut.trading.orders.ui.invest.placement.screens.review.j jVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.j(oVar4, null);
                    this.v = 1;
                    if (oVar4.p2(this, jVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                Object objN2 = this.f155734w.N2(this);
                return objN2 == aVar5 ? aVar5 : objN2;
        }
    }
}
