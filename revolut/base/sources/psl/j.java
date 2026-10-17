package psl;

import aw0.o9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.wealth.models.config.Links;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.trading.orders.R$string;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.t0;
import yhm.m;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f239526w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f239526w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f239526w, continuation, 0);
            case 1:
                return new j(this.f239526w, continuation, 1);
            case 2:
                return new j(this.f239526w, continuation, 2);
            case 3:
                return new j(this.f239526w, continuation, 3);
            case 4:
                return new j(this.f239526w, continuation, 4);
            case 5:
                return new j(this.f239526w, continuation, 5);
            case 6:
                return new j(this.f239526w, continuation, 6);
            case 7:
                return new j(this.f239526w, continuation, 7);
            case 8:
                return new j(this.f239526w, continuation, 8);
            default:
                return new j(this.f239526w, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                n nVar = this.f239526w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarG = mo3.a.g(new t0(nVar.A.B(new e(9)), 1), null, new pof.e(27), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nVar.A2(new AssetDetailsDestination(((nel.n) obj2).f214596b, null, false, null, null, null, 62));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                final n nVar2 = this.f239526w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    final int i3 = 0;
                    jhi.b bVarH = mo3.a.h(nVar2.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar2;
                            Optional optional;
                            int i5 = i3;
                            TradingAccount tradingAccount = null;
                            n nVar3 = nVar2;
                            switch (i5) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar3.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i6 = wul.d.f300227a[orderType.ordinal()];
                                        if (i6 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i6 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar != null) {
                                        return yVar;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar3.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar3.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar3.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i21 = wul.d.d[tradeSide.ordinal()];
                                    if (i21 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i21 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar3.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar3.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar2 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar2 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar2;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar3.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar3.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar3.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new pof.e(28), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar = (rp0.y) obj2;
                if (yVar == null) {
                    return null;
                }
                nVar2.f239539w.x(yVar);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                final n nVar3 = this.f239526w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    final int i6 = 1;
                    jhi.b bVarH2 = mo3.a.h(nVar3.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar2;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar22;
                            Optional optional;
                            int i59 = i6;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar3;
                            switch (i59) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar2 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i66 = wul.d.f300227a[orderType.ordinal()];
                                        if (i66 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i66 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar2 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar2 != null) {
                                        return yVar2;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i21 = wul.d.d[tradeSide.ordinal()];
                                    if (i21 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i21 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar22 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar22 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar22;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new pof.e(29), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar2 = (rp0.y) obj2;
                if (yVar2 == null) {
                    return null;
                }
                nVar3.f239539w.x(yVar2);
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                final n nVar4 = this.f239526w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    final int i22 = 2;
                    jhi.b bVarH3 = mo3.a.h(nVar4.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i59 = i22;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar4;
                            switch (i59) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i66 = wul.d.f300227a[orderType.ordinal()];
                                        if (i66 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i66 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(0), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH3, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar3 = (rp0.y) obj2;
                if (yVar3 == null) {
                    return null;
                }
                nVar4.f239539w.x(yVar3);
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                final n nVar5 = this.f239526w;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    final int i33 = 3;
                    jhi.b bVarH4 = mo3.a.h(nVar5.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i59 = i33;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar5;
                            switch (i59) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i66 = wul.d.f300227a[orderType.ordinal()];
                                        if (i66 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i66 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(1), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH4, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar4 = (rp0.y) obj2;
                if (yVar4 == null) {
                    return null;
                }
                nVar5.f239539w.x(yVar4);
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                final n nVar6 = this.f239526w;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    final int i59 = 4;
                    jhi.b bVarH5 = mo3.a.h(nVar6.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i592 = i59;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar6;
                            switch (i592) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i66 = wul.d.f300227a[orderType.ordinal()];
                                        if (i66 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i66 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(2), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH5, this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar5 = (rp0.y) obj2;
                if (yVar5 == null) {
                    return null;
                }
                nVar6.f239539w.x(yVar5);
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                n nVar7 = this.f239526w;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarH6 = mo3.a.h(nVar7.d3(), new p2b.a(24), new m(3), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH6, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return nVar7.A2(u0.c(new HistoricFeeBreakdownFeatureConfig((ChargeBreakdown) null, (String) obj2, (z3i.b) null, (xi0.b) null, false, false, c4i.a.TRADING_ORDER, (AnalyticsProduct.Retail) null, OnfidoActivity.RESULT_EXIT_INVALID_CERTIFICATE)));
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                final n nVar8 = this.f239526w;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    final int i92 = 5;
                    jhi.b bVarH7 = mo3.a.h(nVar8.d3(), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i592 = i92;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar8;
                            switch (i592) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i662 = wul.d.f300227a[orderType.ordinal()];
                                        if (i662 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i662 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(4), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH7, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar6 = (rp0.y) obj2;
                if (yVar6 == null) {
                    return null;
                }
                nVar8.f239539w.x(yVar6);
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                final n nVar9 = this.f239526w;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    final int i99 = 6;
                    jhi.b bVarH8 = mo3.a.h(rd0.e.b(ybl.l.c(nVar9.f239535q, false, 3)), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i592 = i99;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar9;
                            switch (i592) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i662 = wul.d.f300227a[orderType.ordinal()];
                                        if (i662 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i662 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(5), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH8, this);
                    if (obj2 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rp0.y yVar7 = (rp0.y) obj2;
                if (yVar7 == null) {
                    return null;
                }
                nVar9.f239539w.x(yVar7);
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                final n nVar10 = this.f239526w;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    final int i101 = 7;
                    jhi.b bVarH9 = mo3.a.h(rd0.e.b(ybl.l.c(nVar10.f239535q, false, 3)), new Function3() { // from class: psl.l
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                            rp0.y yVar22;
                            TextLocalisedClause textLocalisedClause;
                            rp0.y yVar222;
                            Optional optional;
                            int i592 = i101;
                            TradingAccount tradingAccount = null;
                            n nVar32 = nVar10;
                            switch (i592) {
                                case 0:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar = nVar32.v;
                                    r0 orderType = ((tsl.j) obj3).a().getF104635j();
                                    ((wul.e) fVar).getClass();
                                    Intrinsics.checkNotNullParameter(orderType, "orderType");
                                    if (oi0.d.B(orderType)) {
                                        yVar22 = null;
                                    } else {
                                        List listC = zhm.u.c(wul.e.d());
                                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_orders_estimated_shares, null, null, 14);
                                        int i662 = wul.d.f300227a[orderType.ordinal()];
                                        if (i662 == 2) {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_limit_order, null, null, 14);
                                        } else if (i662 != 3) {
                                            IllegalStateException illegalStateException = new IllegalStateException("Order type " + orderType + " is not provided or not supported.");
                                            h0 h0Var = h0.f322473a;
                                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                            rd0.d.a(rd0.c.WARNING, null, null, illegalStateException, h0Var);
                                            textLocalisedClause = null;
                                        } else {
                                            textLocalisedClause = new TextLocalisedClause(R$string.trading_orders_estimated_shares_info_stop_order, null, null, 14);
                                        }
                                        yVar22 = new rp0.y(listC, new rp0.t(textLocalisedClause2, textLocalisedClause, null, 28), null, null, null, null, null, null, null, null, 3836);
                                    }
                                    if (yVar22 != null) {
                                        return yVar22;
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Order type " + orderType + " is not supported.");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                                    rd0.d.a(rd0.c.WARNING, null, null, illegalStateException2, h0Var2);
                                    return null;
                                case 1:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).a(((tsl.j) obj3).a().getF104635j());
                                case 2:
                                    ((Boolean) obj4).getClass();
                                    return ((wul.e) nVar32.v).b(((tsl.j) obj3).a().getF104635j());
                                case 3:
                                    tsl.j jVar = (tsl.j) obj3;
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar2 = nVar32.v;
                                    r0 orderType2 = jVar.a().getF104635j();
                                    bfl.g tradeSide = jVar.a().getF104634h();
                                    wul.e eVar = (wul.e) fVar2;
                                    eVar.getClass();
                                    Intrinsics.checkNotNullParameter(orderType2, "orderType");
                                    Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
                                    int i212 = wul.d.d[tradeSide.ordinal()];
                                    if (i212 == 1) {
                                        return eVar.a(orderType2);
                                    }
                                    if (i212 == 2) {
                                        return eVar.b(orderType2);
                                    }
                                    throw new NoWhenBranchMatchedException();
                                case 4:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar3 = nVar32.v;
                                    InvestOrder investOrder = ((tsl.j) obj3).a();
                                    wul.e eVar2 = (wul.e) fVar3;
                                    eVar2.getClass();
                                    Intrinsics.checkNotNullParameter(investOrder, "investOrder");
                                    if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                                        Instant z = ((InvestOrder.InvestSecuritiesOrder) investOrder).getZ();
                                        if (z != null) {
                                            return eVar2.c(z, investOrder.getF104635j());
                                        }
                                        return null;
                                    }
                                    if (investOrder instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e) {
                                            throw e;
                                        } catch (Throwable th10) {
                                            m.Companion companion2 = yhm.m.INSTANCE;
                                            Throwable thA = yhm.m.a(yhm.o.a(th10));
                                            if (thA == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion3 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        } catch (Throwable th11) {
                                            m.Companion companion4 = yhm.m.INSTANCE;
                                            Throwable thA2 = yhm.m.a(yhm.o.a(th11));
                                            if (thA2 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA2);
                                            return null;
                                        }
                                    }
                                    if (investOrder instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion5 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e4) {
                                            throw e4;
                                        } catch (Throwable th12) {
                                            m.Companion companion6 = yhm.m.INSTANCE;
                                            Throwable thA3 = yhm.m.a(yhm.o.a(th12));
                                            if (thA3 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA3);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder instanceof InvestOptionOrder)) {
                                        if (!(investOrder instanceof InvestMarginOrder)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                                        Instant instant = investMarginOrder.f104560t;
                                        if (instant != null) {
                                            return eVar2.c(instant, investMarginOrder.f104552j);
                                        }
                                        return null;
                                    }
                                    try {
                                        m.Companion companion7 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e5) {
                                        throw e5;
                                    } catch (Throwable th13) {
                                        m.Companion companion8 = yhm.m.INSTANCE;
                                        Throwable thA4 = yhm.m.a(yhm.o.a(th13));
                                        if (thA4 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA4);
                                        return null;
                                    }
                                case 5:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar4 = nVar32.v;
                                    InvestOrder investOrder2 = ((tsl.j) obj3).a();
                                    ((wul.e) fVar4).getClass();
                                    Intrinsics.checkNotNullParameter(investOrder2, "investOrder");
                                    if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                                        switch (wul.d.f300228b[investOrder2.getD().ordinal()]) {
                                            case 1:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t = investSecuritiesOrder.getF104643t();
                                                BigDecimal f104646y = investSecuritiesOrder.getF104646y();
                                                if (f104646y == null) {
                                                    f104646y = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y);
                                                BigDecimal bigDecimalSubtract = f104643t.subtract(f104646y);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_bonds_partial_fill_info, zhm.v.k(new NumberClause(f104646y, null, null, null, 14), new NumberClause(f104643t, null, null, null, 14), new NumberClause(bigDecimalSubtract, null, null, null, 14)), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                                InvestOrder.InvestSecuritiesOrder investSecuritiesOrder2 = (InvestOrder.InvestSecuritiesOrder) investOrder2;
                                                BigDecimal f104643t2 = investSecuritiesOrder2.getF104643t();
                                                BigDecimal f104646y2 = investSecuritiesOrder2.getF104646y();
                                                if (f104646y2 == null) {
                                                    f104646y2 = BigDecimal.ZERO;
                                                }
                                                Intrinsics.h(f104646y2);
                                                String o = investSecuritiesOrder2.getO();
                                                BigDecimal bigDecimalSubtract2 = f104643t2.subtract(f104646y2);
                                                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                                                yVar222 = new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.trading_orders_partial_fill_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_partial_fill_info, zhm.v.k(new AssetClause(f104643t2, new AssetClauseType.Stock(0), o, null, o9.NON_SENSITIVE, 8), f104646y2, bigDecimalSubtract2), null, 12), null, 28), null, null, null, null, null, null, null, null, 3836);
                                                break;
                                            default:
                                                throw new NoWhenBranchMatchedException();
                                        }
                                        return yVar222;
                                    }
                                    if (investOrder2 instanceof InvestCommodityOrder) {
                                        try {
                                            m.Companion companion9 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Commodity order is unsupported");
                                        } catch (CancellationException e6) {
                                            throw e6;
                                        } catch (Throwable th14) {
                                            m.Companion companion10 = yhm.m.INSTANCE;
                                            Throwable thA5 = yhm.m.a(yhm.o.a(th14));
                                            if (thA5 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA5);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMarginOrder) {
                                        try {
                                            m.Companion companion11 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Margin order is unsupported");
                                        } catch (CancellationException e22) {
                                            throw e22;
                                        } catch (Throwable th15) {
                                            m.Companion companion12 = yhm.m.INSTANCE;
                                            Throwable thA6 = yhm.m.a(yhm.o.a(th15));
                                            if (thA6 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA6);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestFundOrder) {
                                        try {
                                            m.Companion companion13 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Fund order is unsupported");
                                        } catch (CancellationException e33) {
                                            throw e33;
                                        } catch (Throwable th16) {
                                            m.Companion companion14 = yhm.m.INSTANCE;
                                            Throwable thA7 = yhm.m.a(yhm.o.a(th16));
                                            if (thA7 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA7);
                                            return null;
                                        }
                                    }
                                    if (investOrder2 instanceof InvestMutualFundOrder) {
                                        try {
                                            m.Companion companion15 = yhm.m.INSTANCE;
                                            throw new IllegalStateException("Mutual fund order is unsupported");
                                        } catch (CancellationException e35) {
                                            throw e35;
                                        } catch (Throwable th17) {
                                            m.Companion companion16 = yhm.m.INSTANCE;
                                            Throwable thA8 = yhm.m.a(yhm.o.a(th17));
                                            if (thA8 == null) {
                                                return null;
                                            }
                                            hx7.e.n(thA8);
                                            return null;
                                        }
                                    }
                                    if (!(investOrder2 instanceof InvestOptionOrder)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    try {
                                        m.Companion companion17 = yhm.m.INSTANCE;
                                        throw new IllegalStateException("Option order is unsupported");
                                    } catch (CancellationException e41) {
                                        throw e41;
                                    } catch (Throwable th18) {
                                        m.Companion companion18 = yhm.m.INSTANCE;
                                        Throwable thA9 = yhm.m.a(yhm.o.a(th18));
                                        if (thA9 == null) {
                                            return null;
                                        }
                                        hx7.e.n(thA9);
                                        return null;
                                    }
                                case 6:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar5 = nVar32.v;
                                    Links links = ((hel.a) obj3).e;
                                    ((wul.e) fVar5).getClass();
                                    Intrinsics.checkNotNullParameter(links, "links");
                                    String str = links.f105101s;
                                    if (str != null) {
                                        return new rp0.y(zhm.u.c(wul.e.d()), new rp0.t(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_main, zhm.v.k(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link, null, new Click(28, (Integer) null, (Object) new ndf.e(new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_link_title, null, null, 14), str), "INVESTMENT_PLAN_PROJECTIONS_LINK", false), 10), new TextLocalisedClause(R$string.wealth_trading_order_details_projections_disclaimer_etf_investment_plan_learn_more, null, new Click(28, (Integer) null, (Object) new ndf.d(f7d.i.CATEGORY_WEALTH.a()), "INVESTMENT_PLAN_PROJECTIONS_LEARN_MORE", false), 10)), null, 12), null, 28), rp0.l.WINDOW, null, null, null, null, null, null, null, 3832);
                                    }
                                    return null;
                                default:
                                    ((Boolean) obj4).getClass();
                                    ndf.f fVar6 = nVar32.v;
                                    hel.b tradingContext = ((hel.a) obj3).d;
                                    Data data = ((jsl.a0) ((j2) nVar32.A.f22677a).getValue()).f178201j;
                                    if (data != null && (optional = (Optional) data.getContent()) != null) {
                                        Intrinsics.checkNotNullParameter(optional, "<this>");
                                        tradingAccount = (TradingAccount) optional.orElse(null);
                                    }
                                    wul.e eVar3 = (wul.e) fVar6;
                                    eVar3.getClass();
                                    Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                                    return new rp0.y(zhm.u.c(wul.e.d()), eVar3.f300232c.a(tradingContext, tradingAccount), null, null, null, null, null, null, null, null, 3836);
                            }
                        }
                    }, new m(6), 2);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarH9, this);
                    if (obj2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nVar10.f239539w.x((rp0.y) obj2);
                return Unit.f186387a;
        }
    }
}
