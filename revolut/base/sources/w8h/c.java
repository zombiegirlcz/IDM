package w8h;

import cfl.j;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rd0.d;
import xzg.o0;
import xzg.q0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final boolean a(TradingAccountType tradingAccountType) {
        Intrinsics.checkNotNullParameter(tradingAccountType, "<this>");
        if (Intrinsics.f(tradingAccountType, TradingAccountType.Margin.f105271a) || Intrinsics.f(tradingAccountType, TradingAccountType.Robo.f105274a) || Intrinsics.f(tradingAccountType, TradingAccountType.Taa.f105275a) || Intrinsics.f(tradingAccountType, TradingAccountType.Gia.f105270a)) {
            return true;
        }
        if (Intrinsics.f(tradingAccountType, TradingAccountType.MoneyMarketFunds.f105272a) || Intrinsics.f(tradingAccountType, TradingAccountType.PaperTrading.f105273a) || Intrinsics.f(tradingAccountType, TradingAccountType.Unknown.f105276a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final WealthAccount b(TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
        if (tradingAccount instanceof TradingAccount.GIA) {
            TradingAccount.GIA gia = (TradingAccount.GIA) tradingAccount;
            String string = gia.f105181a.toString();
            o0 o0VarD = d(gia.d);
            q0 q0VarC = c(gia.e);
            Iterator it8 = gia.f105184g.iterator();
            if (it8.hasNext()) {
                next = it8.next();
                if (it8.hasNext()) {
                    Instant instant = ((TradingAccount.Portfolio) next).f105212c;
                    do {
                        Object next = it8.next();
                        Instant instant2 = ((TradingAccount.Portfolio) next).f105212c;
                        if (instant.compareTo(instant2) < 0) {
                            next = next;
                            instant = instant2;
                        }
                    } while (it8.hasNext());
                }
            }
            return new WealthAccount.Securities(o0VarD, q0VarC, (TradingAccount.Portfolio) next, string, null);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
            TradingAccount.TaxAdvantage.Isa isa = (TradingAccount.TaxAdvantage.Isa) tradingAccount;
            o0 o0VarD2 = d(isa.e);
            q0 q0VarC2 = c(isa.f);
            Iterator it9 = isa.f105225h.iterator();
            if (it9.hasNext()) {
                next = it9.next();
                if (it9.hasNext()) {
                    Instant instant3 = ((TradingAccount.Portfolio) next).f105212c;
                    do {
                        Object next2 = it9.next();
                        Instant instant4 = ((TradingAccount.Portfolio) next2).f105212c;
                        if (instant3.compareTo(instant4) < 0) {
                            next = next2;
                            instant3 = instant4;
                        }
                    } while (it9.hasNext());
                }
            }
            return new WealthAccount.TaxAdvantageWealthAccount.Isa(isa.f105222b.toString(), null, o0VarD2, (TradingAccount.Portfolio) next, isa.f105227l, isa.f105229n, q0VarC2);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) {
            TradingAccount.TaxAdvantage.JIsa jIsa = (TradingAccount.TaxAdvantage.JIsa) tradingAccount;
            if (jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                TradingAccount.TaxAdvantage.JIsa.Personal personal = (TradingAccount.TaxAdvantage.JIsa.Personal) tradingAccount;
                o0 o0VarD3 = d(personal.e);
                q0 q0VarC3 = c(personal.f);
                Iterator it10 = personal.f105241h.iterator();
                if (it10.hasNext()) {
                    next = it10.next();
                    if (it10.hasNext()) {
                        Instant instant5 = ((TradingAccount.Portfolio) next).f105212c;
                        do {
                            Object next3 = it10.next();
                            Instant instant6 = ((TradingAccount.Portfolio) next3).f105212c;
                            if (instant5.compareTo(instant6) < 0) {
                                next = next3;
                                instant5 = instant6;
                            }
                        } while (it10.hasNext());
                    }
                }
                return new WealthAccount.TaxAdvantageWealthAccount.JIsa.Personal(personal.f105238b.toString(), null, o0VarD3, (TradingAccount.Portfolio) next, personal.f105243l, personal.f105245n, q0VarC3);
            }
            if (!(jIsa instanceof TradingAccount.TaxAdvantage.JIsa.Custodian)) {
                throw new NoWhenBranchMatchedException();
            }
            TradingAccount.TaxAdvantage.JIsa.Custodian custodian = (TradingAccount.TaxAdvantage.JIsa.Custodian) tradingAccount;
            o0 o0VarD4 = d(custodian.e);
            q0 q0VarC4 = c(custodian.f);
            Iterator it11 = custodian.f105233h.iterator();
            if (it11.hasNext()) {
                next = it11.next();
                if (it11.hasNext()) {
                    Instant instant7 = ((TradingAccount.Portfolio) next).f105212c;
                    do {
                        Object next4 = it11.next();
                        Instant instant8 = ((TradingAccount.Portfolio) next4).f105212c;
                        if (instant7.compareTo(instant8) < 0) {
                            next = next4;
                            instant7 = instant8;
                        }
                    } while (it11.hasNext());
                }
            }
            return new WealthAccount.TaxAdvantageWealthAccount.JIsa.Custodian(custodian.f105230b.toString(), null, o0VarD4, (TradingAccount.Portfolio) next, custodian.f105235l, custodian.f105237n, q0VarC4);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) {
            TradingAccount.TaxAdvantage.Pea pea2 = (TradingAccount.TaxAdvantage.Pea) tradingAccount;
            o0 o0VarD5 = d(pea2.e);
            q0 q0VarC5 = c(pea2.f);
            Iterator it12 = pea2.f105253h.iterator();
            if (it12.hasNext()) {
                next = it12.next();
                if (it12.hasNext()) {
                    Instant instant9 = ((TradingAccount.Portfolio) next).f105212c;
                    do {
                        Object next5 = it12.next();
                        Instant instant10 = ((TradingAccount.Portfolio) next5).f105212c;
                        if (instant9.compareTo(instant10) < 0) {
                            next = next5;
                            instant9 = instant10;
                        }
                    } while (it12.hasNext());
                }
            }
            return new WealthAccount.TaxAdvantageWealthAccount.Pea(pea2.f105250b.toString(), null, o0VarD5, (TradingAccount.Portfolio) next, pea2.f105255l, pea2.f105257n, q0VarC5);
        }
        if (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) {
            TradingAccount.TaxAdvantage.Unknown unknown = (TradingAccount.TaxAdvantage.Unknown) tradingAccount;
            unknown.f105221a.getClass();
            ArrayList arrayList = unknown.f105260g;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it13 = arrayList.iterator();
            while (it13.hasNext()) {
                arrayList2.add(((TradingProduct) it13.next()).f105281b);
            }
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("toWealthAccount TAX_ADVANTAGED account with product codes [", d0.k0(arrayList2, null, null, null, 0, null, 63), "] not supported"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        if ((tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown)) {
            IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("toWealthAccount ", tradingAccount.W().getLabel(), " accounts not supported"));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return null;
        }
        if (!(tradingAccount instanceof TradingAccount.Margin)) {
            if (!(tradingAccount instanceof TradingAccount.Robo.Regular)) {
                throw new NoWhenBranchMatchedException();
            }
            TradingAccount.Robo.Regular regular = (TradingAccount.Robo.Regular) tradingAccount;
            return new WealthAccount.Robo(regular.f105214b.toString(), d(regular.e), regular.f105217h, c(regular.f));
        }
        TradingAccount.Margin margin = (TradingAccount.Margin) tradingAccount;
        o0 o0VarD6 = d(margin.d);
        String string2 = margin.f105189a.toString();
        q0 q0VarC6 = c(margin.e);
        TradingAccount.Portfolio portfolio = (TradingAccount.Portfolio) d0.d0(d0.P0(margin.f105192g, new b()));
        return new WealthAccount.Margin(o0VarD6, string2, String.valueOf(portfolio != null ? portfolio.f105210a : null), q0VarC6);
    }

    public static final q0 c(j jVar) {
        int i = a.f295648b[jVar.ordinal()];
        if (i == 1) {
            return q0.PERSONAL;
        }
        if (i == 2) {
            return q0.PERSONAL_JOINT;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Youth account holder type is not supported");
    }

    public static final o0 d(cfl.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        switch (a.f295647a[bVar.ordinal()]) {
            case 1:
                return o0.AVAILABLE;
            case 2:
                return o0.ONBOARDING;
            case 3:
                return o0.ACTIVE;
            case 4:
                return o0.SUSPENDED;
            case 5:
                return o0.OFFBOARDING;
            case 6:
                return o0.TERMINATED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
