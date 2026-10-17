package g1i;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature_exchange.api.models.ExchangePocket;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import zhm.a1;
import zhm.q0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f139597b;

    public /* synthetic */ d(d0 d0Var, int i) {
        this.f139596a = i;
        this.f139597b = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        wd6.e eVar;
        mha.s sVarP;
        efm.k kVarB3;
        Object objS3;
        ufm.i iVarU3;
        dj0.d dVarB;
        dj0.d dVarB2;
        Amount amount;
        Amount amount2;
        Object next;
        TradingAccount.Portfolio portfolio;
        efm.r map;
        int i = this.f139596a;
        int i2 = 23;
        efm.f fVarP3 = pfm.m.f235744a;
        int i3 = 5;
        int i5 = 27;
        int i6 = 24;
        int i21 = 9;
        int i22 = 1;
        d0 d0Var = this.f139597b;
        switch (i) {
            case 0:
                List currencies = (List) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                efm.r rVarG = osg.b.g(d0Var.f139599c, w4l.h.f294642c, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, null, 68);
                sfm.b bVar = new sfm.b(d0Var.f139599c.x(AccountId.Personal.f51414a), new e(12, new g0f.f(zhm.d0.d1(currencies), d0Var, 6)), 2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                efm.d0 d0VarFirstOrError = m70.a.g(nim.a.w(kli.a.h(rVarG, ue0.e.H(bVar, zhm.h0.f322473a, new g1.c(18))), new fvk.q(currencies, i3)), null, new g0c.h(4), 1).firstOrError();
                e eVar2 = new e(i3, new g1.c(i21));
                d0VarFirstOrError.getClass();
                rfm.j jVar = new rfm.j(d0VarFirstOrError, eVar2, 2);
                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                return ue0.e.B(jVar, new g1.c(10));
            case 1:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                if (r1i.d.j(draft)) {
                    return nim.a.w(d0Var.z.c(zhm.u.c(new Pair(draft.f96879a.f96897a, draft.f96880b.f96897a)), n9l.b.SEC_3), new dyh.b(draft.f96881c, i22));
                }
                efm.r rVarJust = efm.r.just(new Data(draft.i, null, false, 6, null));
                Intrinsics.h(rVarJust);
                return rVarJust;
            case 2:
                ExchangeOrderDraft draft2 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft2, "draft");
                o0 o0Var = d0Var.f139605n;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(draft2, "draft");
                wd6.e eVar3 = draft2.f96881c;
                wd6.h hVar = draft2.e;
                int i32 = n0.f139670b[eVar3.ordinal()];
                if (i32 == 1) {
                    eVar = wd6.e.SELL;
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = wd6.e.BUY;
                }
                wd6.e eVar4 = eVar;
                boolean zD = i26.l.D(hVar);
                Long l2 = !zD ? null : draft2.f96879a.f96898b;
                Long l3 = zD ? draft2.f96880b.f96898b : null;
                ExchangeOrderDraft exchangeOrderDraftA = ExchangeOrderDraft.a(draft2, o0.j(o0Var, draft2, null, null, l2, l3, null, null, eVar4, null, false, null, 3942), o0.f(o0Var, draft2, null, null, l2, l3, null, null, eVar4, null, false, null, 3942), eVar4, null, null, null, null, null, null, null, null, 0.0d, false, null, null, null, null, false, 33290232);
                return (hVar == wd6.h.RECURRING && eVar4 == wd6.e.SELL) ? o0Var.o(exchangeOrderDraftA, wd6.h.MARKET) : exchangeOrderDraftA;
            case 3:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return d0Var.o.d(AccountId.Personal.f51414a, pocket);
            case 4:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                m0 m0Var = (m0) d0Var.e;
                String str = (String) m0Var.x0().get();
                return str.length() == 0 ? te0.w.z0(m0Var.x0(), it8.f152287a) : (str.length() <= 0 || str.equals(it8.f152287a)) ? fVarP3 : te0.w.z0(m0Var.f139666r.getValue(m0Var, m0.f139655t[16]), Boolean.TRUE).e(te0.w.z0(m0Var.x0(), it8.f152287a));
            case 5:
                ExchangeOrderDraft draft3 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft3, "draft");
                return d0Var.f139605n.l(draft3, ((ExchangeOrderDraft) ((m0) d0Var.e).y0().get()).f96880b.f96899c, true);
            case 6:
                Set it9 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!((o8b.c) d0Var.G).g()) {
                    return it9;
                }
                xi0.b.Companion.getClass();
                return a1.j(it9, xi0.b.E);
            case 7:
                ExchangeOrderDraft draft4 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft4, "draft");
                return d0Var.f139605n.q(draft4, ((ExchangeOrderDraft) ((m0) d0Var.e).y0().get()).f96879a.f96899c, true);
            case 8:
                xi0.b currencyTo = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
                efm.d0 d0VarFirstOrError2 = m70.a.g(d0Var.f139600g.n(), null, new g0c.h(6), 1).firstOrError();
                e eVar5 = new e(14, new f(d0Var, currencyTo, i22));
                d0VarFirstOrError2.getClass();
                return new ufm.i(d0VarFirstOrError2, eVar5, 1);
            case 9:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                ExchangeOrderDraft draft5 = (ExchangeOrderDraft) kVar.f288454a;
                Data data = (Data) kVar.f288455b;
                LocalDate localDate = (LocalDate) kVar.f288456c;
                f2i.g gVar = (f2i.g) kVar.d;
                boolean zBooleanValue = ((Boolean) kVar.e).booleanValue();
                nd.k kVar2 = d0Var.f139604m;
                List list = (List) data.getContent();
                mha.k kVar3 = (list == null || (sVarP = mra.d.p(list)) == null) ? null : sVarP.f205466g;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(draft5, "draft");
                wd6.h hVar2 = draft5.e;
                MoneyDetails moneyDetails = draft5.f96880b;
                r1i.h hVar3 = draft5.f96882g;
                wd6.e eVar6 = draft5.f96881c;
                MoneyDetails moneyDetails2 = draft5.f96879a;
                Long l4 = moneyDetails2.f96898b;
                dj0.d dVar = new dj0.d(l4 != null ? l4.longValue() : 0L, moneyDetails2.f96897a);
                b2i.a aVar = hVar3 == r1i.h.TOP ? b2i.a.PRECISE : b2i.a.ESTIMATED;
                Long l5 = moneyDetails.f96898b;
                dj0.d dVar2 = new dj0.d(l5 != null ? l5.longValue() : 0L, moneyDetails.f96897a);
                b2i.a aVar2 = hVar3 == r1i.h.BOTTOM ? b2i.a.PRECISE : b2i.a.ESTIMATED;
                double d = draft5.f96885l;
                dj0.d dVar3 = draft5.f96887n;
                BigDecimal bigDecimal = draft5.f96883h;
                return new b2i.b(hVar2, eVar6, d, dVar, aVar, dVar2, aVar2, bigDecimal != null ? Double.valueOf(bigDecimal.doubleValue()) : null, dVar3, null, kVar3, localDate, gVar, draft5.f96891s, zBooleanValue, draft5.f, null, null, false, null, null, false, 8323584);
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                b bVar2 = d0Var.e;
                p0i.b bVar3 = d0Var.f139602j;
                ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) ((m0) bVar2).y0().get();
                wd6.h hVar4 = exchangeOrderDraft.e;
                String str2 = exchangeOrderDraft.v;
                return hVar4 == wd6.h.TAKE_PROFIT_STOP_LOSS ? ((x0i.g) bVar3).c(r1i.d.l(exchangeOrderDraft), str2) : ((x0i.g) bVar3).b(r1i.d.k(exchangeOrderDraft), str2);
            case 11:
                Boolean it10 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (!it10.booleanValue()) {
                    return fVarP3;
                }
                d0Var.B.f168048a.i();
                return d0Var.o3();
            case 12:
                e7l.f userConfig = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(userConfig, "userConfig");
                d0 d0Var2 = this.f139597b;
                w0i.a aVar3 = d0Var2.A;
                AccountId accountId = d0Var2.f139613y;
                r10.r rVar = d0Var2.H;
                Set prohibitedCurrencies = userConfig.U;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(prohibitedCurrencies, "prohibitedCurrencies");
                boolean zIsEmpty = prohibitedCurrencies.isEmpty();
                Set set = !zIsEmpty ? userConfig.U : zhm.h0.f322473a;
                ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) ((m0) d0Var2.e).w0().get();
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Default) {
                    ExchangeFeatureConfig.Default r102 = (ExchangeFeatureConfig.Default) exchangeFeatureConfig;
                    return new pfm.a(new ufm.i(rVar.m(accountId), new e(i5, new eed.i(d0Var2, i5, set, r102)), 0), new e(28, new g0f.f(d0Var2, r102, 10)), 4);
                }
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.RecurringBuy) {
                    ExchangeFeatureConfig.RecurringBuy recurringBuy = (ExchangeFeatureConfig.RecurringBuy) exchangeFeatureConfig;
                    pfm.a aVar4 = new pfm.a(rVar.m(accountId), new e(29, new g0f.f(d0Var2, recurringBuy, 11)), 4);
                    wd6.h hVar5 = wd6.h.MARKET;
                    if (recurringBuy.d) {
                        fVarP3 = d0Var2.P3();
                    }
                    return aVar4.e(fVarP3);
                }
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy) {
                    ExchangeFeatureConfig.Buy buy = (ExchangeFeatureConfig.Buy) exchangeFeatureConfig;
                    xi0.b bVar4 = buy.f96830a;
                    if (bVar4 != null) {
                        ufm.b bVarM = efm.d0.m(bVar4);
                        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                        iVarU3 = d0Var2.u3(bVarM);
                    } else {
                        iVarU3 = d0Var2.u3(d0Var2.s3(buy.f96831b, set, wd6.e.BUY, buy.f96832c, buy.k));
                    }
                    return new pfm.a(iVarU3, new h(0, new g0f.f(d0Var2, buy, 12)), 4);
                }
                Set set2 = set;
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell) {
                    ExchangeFeatureConfig.Sell sell = (ExchangeFeatureConfig.Sell) exchangeFeatureConfig;
                    xi0.b bVar5 = sell.f96851b;
                    if (bVar5 != null) {
                        objS3 = efm.d0.m(bVar5);
                        Intrinsics.checkNotNullExpressionValue(objS3, "just(...)");
                    } else {
                        objS3 = d0Var2.s3(sell.f96850a, set2, wd6.e.SELL, sell.d, false);
                    }
                    return new pfm.a(objS3, new h(i22, new g0f.f(d0Var2, sell, 13)), 4);
                }
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.FreelancerSell) {
                    if (zIsEmpty || !set2.contains(((ExchangeFeatureConfig.FreelancerSell) exchangeFeatureConfig).f96844a)) {
                        kVarB3 = d0Var2.B3(a1.m(set2, ((ExchangeFeatureConfig.FreelancerSell) exchangeFeatureConfig).f96844a), io3.l.MERCHANT);
                    } else {
                        efm.d0 d0VarQ3 = d0Var2.q3();
                        h hVar6 = new h(18, new f2i.x(1, d0Var2.F, p0i.a.class, "getDefaultCurrency", "getDefaultCurrency(Lcom/revolut/shared/feature/configuration/api/models/Config;)Lcom/revolut/core/model/currency/Currency;", 0, 21));
                        d0VarQ3.getClass();
                        ufm.i iVar = new ufm.i(d0VarQ3, hVar6, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        kVarB3 = iVar.w();
                    }
                    ExchangeFeatureConfig.FreelancerSell freelancerSell = (ExchangeFeatureConfig.FreelancerSell) exchangeFeatureConfig;
                    return new pfm.a(new rfm.m(kVarB3.m(d0Var2.r3(a1.m(set2, freelancerSell.f96844a))), new e(i2, new g1.b(freelancerSell, 10)), 1), new e(i6, new d(d0Var2, 16)), 3);
                }
                if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.BuyInvest) {
                    ExchangeFeatureConfig.BuyInvest buyInvest = (ExchangeFeatureConfig.BuyInvest) exchangeFeatureConfig;
                    efm.d0 d0VarA3 = d0Var2.A3(buyInvest.f96837a);
                    e eVar7 = new e(25, new g0f.f(d0Var2, buyInvest, 8));
                    d0VarA3.getClass();
                    return new pfm.a(d0VarA3, eVar7, 4);
                }
                if (!(exchangeFeatureConfig instanceof ExchangeFeatureConfig.SellInvest)) {
                    if ((exchangeFeatureConfig instanceof ExchangeFeatureConfig.CryptoCommodityOnboarded) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Refresh)) {
                        throw new IllegalArgumentException("Initial config should be buy or sell");
                    }
                    return fVarP3;
                }
                ExchangeFeatureConfig.SellInvest sellInvest = (ExchangeFeatureConfig.SellInvest) exchangeFeatureConfig;
                efm.d0 d0VarA32 = d0Var2.A3(sellInvest.f96858b);
                e eVar8 = new e(26, new g0f.f(sellInvest, d0Var2, i21));
                d0VarA32.getClass();
                return new pfm.a(d0VarA32, eVar8, 4);
            case 13:
                ExchangeOrderDraft it11 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ue0.e.v(d0Var.f139599c.n0((it11.f96881c == wd6.e.BUY ? it11.f96879a : it11.f96880b).f96897a, d0Var.f139613y));
            case 14:
                ExchangeOrderDraft draft6 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft6, "draft");
                return d0Var.t3(draft6.f96879a, draft6.f96888p);
            case 15:
                ExchangeOrderDraft draft7 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft7, "draft");
                return r1i.g.a(draft7, d0Var.f139608r, d0Var.p3(), Boolean.valueOf(d0Var.I.a(draft7)));
            case 16:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.D3(this.f139597b, (xi0.b) pair.f186385a, null, (xi0.b) pair.f186386b, null, wd6.e.SELL, wd6.h.MARKET, wd6.c.FREELANCER_ONLY, wd6.i.MERCHANT, null, null, null, 1802);
            case 17:
                LegacyOrderQuoteParams params = (LegacyOrderQuoteParams) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return new sfm.b(efm.d0.u(300L, TimeUnit.MILLISECONDS, hhm.f.f152430b), new h(i21, new g0f.f(d0Var, params, 16)), 2);
            case 18:
                ExchangeOrderDraft order = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(order, "order");
                xi0.b bVar6 = order.f96879a.f96897a;
                if (order.f96881c != wd6.e.BUY || order.e != wd6.h.MARKET || !cp5.d.z(bVar6)) {
                    return zi0.c.j(new u2i.i(null, null, null));
                }
                yud.g gVar2 = d0Var.f139611w;
                w4l.h hVar7 = w4l.h.f294642c;
                akg.n nVarD = gVar2.d(bVar6, hVar7);
                kotlin.coroutines.g gVar3 = kotlin.coroutines.g.f186406a;
                return nim.a.w(mif.a.e(nim.a.z(nim.a.w(rd0.e.c(nVarD, gVar3), new g1.c(11)), new g1.c(12)), nim.a.z(rd0.e.c(d0Var.f139612x.a(bVar6), gVar3), new g1.c(14)), nim.a.z(nim.a.w(d0Var.f139599c.M(hVar7, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.DEFAULT, d0Var.f139613y), new dv5.p(20, bVar6)), new g1.c(13))), new g1.c(8));
            case 19:
                l4i.a aVar5 = d0Var.f139608r;
                ExchangeOrderDraft draft8 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft8, "draft");
                Limit.UpperRestrictionLimit upperRestrictionLimitF = r1i.d.f(draft8);
                if (upperRestrictionLimitF == null || (amount2 = upperRestrictionLimitF.f104747b) == null) {
                    dVarB = null;
                } else {
                    aVar5.getClass();
                    dVarB = l4i.a.b(amount2);
                }
                Limit.LowerRestrictionLimit lowerRestrictionLimitE = r1i.d.e(draft8);
                if (lowerRestrictionLimitE == null || (amount = lowerRestrictionLimitE.f104744b) == null) {
                    dVarB2 = null;
                } else {
                    aVar5.getClass();
                    dVarB2 = l4i.a.b(amount);
                }
                MoneyDetails moneyDetails3 = draft8.f96879a;
                wd6.e eVar9 = draft8.f96881c;
                if ((!cp5.d.z(moneyDetails3.f96897a) || eVar9 != wd6.e.BUY) && (!cp5.d.z(draft8.f96880b.f96897a) || eVar9 != wd6.e.SELL)) {
                    dVarB2 = null;
                }
                return zi0.c.P(new u2i.l(dVarB, dVarB2), false, null, 3);
            case 20:
                qua.p recuringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recuringPayment, "recuringPayment");
                return new f2i.i(recuringPayment, ((ExchangeOrderDraft) ((m0) d0Var.e).y0().get()).f96879a.f96897a);
            case 21:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                ArrayList arrayListE0 = zhm.d0.E0((List) pair2.f186386b, (List) pair2.f186385a);
                int iB = q0.b(zhm.w.t(arrayListE0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : arrayListE0) {
                    linkedHashMap.put(((ExchangePocket) obj3).f96822a, obj3);
                }
                return d0Var.R3(new g0f.f(d0Var, linkedHashMap, 19));
            case 22:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                d0Var.K.onNext(it12);
                return Unit.f186387a;
            case 23:
                ExchangeOrderDraft draft9 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft9, "draft");
                b bVar7 = d0Var.e;
                o0 o0Var2 = d0Var.f139605n;
                wd6.h hVar8 = (wd6.h) ((od0.i) ((m0) bVar7).B0().get()).f224257a;
                if (hVar8 != null) {
                    draft9 = o0Var2.o(draft9, hVar8);
                }
                double dDoubleValue = ((Number) ((Pair) ((m0) bVar7).z0().get()).f186385a).doubleValue();
                o0Var2.getClass();
                Intrinsics.checkNotNullParameter(draft9, "draft");
                n9l.a aVar6 = new n9l.a(draft9.f96880b.f96897a, draft9.f96879a.f96897a, dDoubleValue, null, null, null);
                Long lI = o0.i(o0Var2, draft9, aVar6, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
                Long lE = o0.e(o0Var2, draft9, aVar6, null, Constants.TAG_SUPPORTED_LOCALE_LIST);
                ExchangeOrderDraft exchangeOrderDraft2 = draft9;
                return ExchangeOrderDraft.a(exchangeOrderDraft2, o0.j(o0Var2, exchangeOrderDraft2, null, aVar6, lI, lE, null, null, null, null, false, null, 4066), o0.f(o0Var2, exchangeOrderDraft2, null, aVar6, lI, lE, null, null, null, null, false, null, 4066), null, null, null, null, null, null, null, null, null, dDoubleValue, false, null, null, null, null, false, 33552380);
            case 24:
                List accounts = (List) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                Iterator it13 = accounts.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next = it13.next();
                        if (next instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next = null;
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) next;
                if (securities != null && (portfolio = securities.f95240c) != null) {
                    obj = portfolio.f105210a;
                }
                String strValueOf = String.valueOf(obj);
                ybl.d dVar4 = d0Var.D;
                ybl.c cVar = ybl.d.Companion;
                return rd0.e.c(nim.a.v(((ael.y) dVar4).e(strValueOf, w4l.h.f294642c), new g1.c(16)), kotlin.coroutines.g.f186406a);
            case 25:
                xi0.b currency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                efm.d0 d0VarR = osg.b.r(d0Var.f139599c, currency, null, io3.i.INTERNAL, d0Var.f139613y, 22);
                e eVar10 = new e(i21, new dv5.p(i2, currency));
                d0VarR.getClass();
                ufm.i iVar2 = new ufm.i(d0VarR, eVar10, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return ue0.e.I(iVar2, zhm.h0.f322473a, new dv5.p(i6, currency));
            case 26:
                ExchangeOrderDraft draft10 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft10, "draft");
                return r1i.g.a(draft10, d0Var.f139608r, d0Var.p3(), Boolean.valueOf(d0Var.I.a(draft10)));
            case 27:
                LegacyOrderQuoteParams it14 = (LegacyOrderQuoteParams) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return d0Var.f139607q.p(it14);
            default:
                ExchangeOrderDraft draft11 = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft11, "draft");
                wd6.d dVarW3 = d0Var.w3();
                b bVar8 = d0Var.e;
                efm.r rVarH = dVarW3 == wd6.d.FX ? te0.w.h(zhm.f0.f322471a) : d0Var.F.d(w4l.i.f294643c, draft11.d, d0Var.f139613y, ((Boolean) ((m0) bVar8).H0().get()).booleanValue());
                ExchangeFeatureConfig exchangeFeatureConfig2 = (ExchangeFeatureConfig) ((m0) bVar8).w0().get();
                if ((exchangeFeatureConfig2 instanceof ExchangeFeatureConfig.BuyInvest) || (exchangeFeatureConfig2 instanceof ExchangeFeatureConfig.SellInvest)) {
                    map = m70.a.g(pd.b.r(rd0.e.c(tzg.m.c(d0Var.C, null, null, 3), kotlin.coroutines.g.f186406a), new d(d0Var, i6)), null, new g0c.h(i21), 1).map(new h(15, new g1.c(i5)));
                    Intrinsics.h(map);
                } else {
                    map = te0.w.h(zhm.f0.f322471a);
                }
                return te0.w.l(map, rVarH).flatMapCompletable(new h(i3, new d(d0Var, 21)));
        }
    }
}
