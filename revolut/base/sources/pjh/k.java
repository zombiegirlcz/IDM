package pjh;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import i26.l;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kel.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.z;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import wjh.y;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements g {

    @NotNull
    public static final h Companion = new h();
    public static final BigDecimal d = new BigDecimal(BigInteger.ONE, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljh.a f236783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufl.b f236784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bnh.c f236785c;

    public k(ljh.a expandCollapseItemsCtaMapper, ufl.b wealthHoldingsClauseFactory, bnh.c roboPortfolioItemsMapper) {
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaMapper, "expandCollapseItemsCtaMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        Intrinsics.checkNotNullParameter(roboPortfolioItemsMapper, "roboPortfolioItemsMapper");
        this.f236783a = expandCollapseItemsCtaMapper;
        this.f236784b = wealthHoldingsClauseFactory;
        this.f236785c = roboPortfolioItemsMapper;
    }

    public static RowDelegate.Model c(dj0.d dVar, String str, TradingLegalEntityInformation tradingLegalEntityInformation) {
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 16.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 60);
        hel.b bVar = tradingLegalEntityInformation.f105106a;
        switch (bVar == null ? -1 : i.f236782c[bVar.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.trading_cash_balance_pockets_title, null, null, 14);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.trading_cash_balance_pockets_title_mx, null, null, 14);
                break;
        }
        return new RowDelegate.Model("PRODUCT_WIDGET_ITEM_CONSOLIDATED_CASH_BALANCE", image40, textLocalisedClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(dVar.f115082a <= 0 ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126), false, null, false, null, null, null, null, null, null, new b(TradingAccountType.Gia.f105270a, str), null, 0, 0, 0, 0, 532675576);
    }

    public final ArrayList a(RowDelegate.Model header, boolean z, List cashData, List stocksData) {
        ArrayList arrayListU;
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(cashData, "cashData");
        Intrinsics.checkNotNullParameter(stocksData, "stocksData");
        if (z) {
            l.E(cashData);
            arrayListU = w.u(v.k(cashData, stocksData));
        } else {
            arrayListU = w.u(v.k(cashData, stocksData));
            l.E(arrayListU);
        }
        ArrayList arrayListJ = ue0.e.J(header, arrayListU);
        yp0.b.k(arrayListJ, 0, 0, 0, 0, 15);
        return arrayListJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType r37, java.lang.String r38, del.b r39, java.util.ArrayList r40, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.TaxAdvantage.Limit r41) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pjh.k.b(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType, java.lang.String, del.b, java.util.ArrayList, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$TaxAdvantage$Limit):java.util.ArrayList");
    }

    public final AbstractList d(List instrumentBalances, String portfolioId, boolean z, bih.b expandCollapseItemsCtaState, TradingAccountType accountType, AnimationRequest animationRequest, Data data) {
        del.a aVar;
        ArrayList arrayList;
        f fVar;
        Intrinsics.checkNotNullParameter(instrumentBalances, "instrumentBalances");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (!z) {
            List list = instrumentBalances;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new y((del.a) it8.next()));
            }
            return f(arrayList2, portfolioId, accountType, expandCollapseItemsCtaState, animationRequest);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : instrumentBalances) {
            switch (i.f236781b[((del.a) obj2).e.f183178j.ordinal()]) {
                case 1:
                    fVar = f.Bonds;
                    break;
                case 2:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                    fVar = f.Stocks;
                    break;
                case 3:
                case 4:
                case 5:
                    fVar = f.ETPs;
                    break;
                case 9:
                case 10:
                case 14:
                case 15:
                    fVar = f.Other;
                    break;
                case 13:
                    fVar = f.StructuredNotes;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Object arrayList3 = linkedHashMap.get(fVar);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(fVar, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        Iterator<E> it9 = f.a().iterator();
        while (true) {
            if (it9.hasNext()) {
                List list2 = (List) linkedHashMap.get((f) it9.next());
                aVar = list2 != null ? (del.a) d0.d0(list2) : null;
                if (aVar != null) {
                }
            } else {
                aVar = null;
            }
        }
        int i = 1;
        ArrayList arrayListB = this.f236785c.b(data, portfolioId, true);
        EnumEntries<f> enumEntriesA = f.a();
        ArrayList arrayList4 = new ArrayList();
        for (f fVar2 : enumEntriesA) {
            if (i.f236780a[fVar2.ordinal()] == i) {
                arrayList = arrayListB;
            } else {
                Iterable iterable = (List) linkedHashMap.get(fVar2);
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterable<del.a> iterable2 = iterable;
                arrayList = new ArrayList(w.t(iterable2, 10));
                for (del.a aVar2 : iterable2) {
                    arrayList.add(e(aVar2, accountType, aVar2 == aVar ? animationRequest : null));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            Pair pair = arrayList != null ? new Pair(fVar2, arrayList) : null;
            if (pair != null) {
                arrayList4.add(pair);
            }
            i = 1;
        }
        LargeActionButtonDelegate.Model modelA = this.f236783a.a(expandCollapseItemsCtaState, portfolioId);
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        for (Object obj3 : arrayList4) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            Pair pair2 = (Pair) obj3;
            f fVar3 = (f) pair2.f186385a;
            List list3 = (List) pair2.f186386b;
            LargeActionButtonDelegate.Model model = i2 == v.j(arrayList4) ? modelA : null;
            Integer numB = fVar3.b();
            ListSubheaderDelegate.Model model2 = numB != null ? new ListSubheaderDelegate.Model("LIST_ID_GROUP_HEADER_" + portfolioId + "_" + fVar3, (Image) null, (Clause) new TextLocalisedClause(numB.intValue(), null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp4, 0, 0, 57338) : null;
            aim.e eVarB = u.b();
            eVarB.addAll(list3);
            if (model != null) {
                eVarB.add(model);
            }
            aim.e eVarA = u.a(eVarB);
            l.E(eVarA);
            aim.e eVarB2 = u.b();
            if (model2 != null) {
                eVarB2.add(model2);
            }
            eVarB2.addAll(eVarA);
            a0.x(u.a(eVarB2), arrayList5);
            i2 = i3;
        }
        return arrayList5;
    }

    public final RowDelegate.Model e(del.a aVar, TradingAccountType tradingAccountType, AnimationRequest animationRequest) {
        Clause clauseM;
        dj0.d dVar;
        kel.a aVar2 = aVar.e.f183173a;
        String strS = a0.d.s("PRODUCT_WIDGET_ITEM_", aVar2.f183146b, "_", aVar2.f183145a);
        int i = com.revolut.feature.wealth.ui.impl.R$string.wealth_trading_templates_company;
        n nVar = aVar.e;
        Clause clauseB = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new TextClause(nVar.f183173a.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        InstrumentTicker instrumentTicker = aVar.f;
        z zVar = instrumentTicker != null ? instrumentTicker.d : null;
        switch (zVar == null ? -1 : i.f236781b[zVar.ordinal()]) {
            case -1:
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
                BigDecimal scale = nVar.f183174b.setScale(2, RoundingMode.DOWN);
                Object moneyClause = (instrumentTicker == null || (dVar = instrumentTicker.e) == null) ? null : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                if (scale.compareTo(d) >= 0) {
                    int i2 = zVar != null ? i.f236781b[zVar.ordinal()] : -1;
                    if (i2 == 11) {
                        int i3 = R$plurals.wealth_portfolio_shares_string;
                        BigDecimal bigDecimal = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                        Intrinsics.checkNotNullExpressionValue(bigDecimal, "stripTrailingZeros(...)");
                        Object[] elements = {new TextLocalisedQuantityClause(i3, scale, u.c(new NumberClause(bigDecimal, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, o9.SENSITIVE, 4)), (Style) null, 24), moneyClause != null ? new TextClause("·", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, moneyClause};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                    } else if (i2 == 13) {
                        int i5 = R$plurals.wealth_trading_orders_list_notes_value;
                        Integer numValueOf = Integer.valueOf((scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).intValue());
                        String plainString = (scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros()).toPlainString();
                        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                        Object[] elements2 = {new TextLocalisedQuantityClause(i5, numValueOf, u.c(new TextClause(plainString, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG)), (Style) null, 24), moneyClause};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        clauseM = v1.c.f(kotlin.collections.d.L(elements2), null);
                    } else {
                        BigDecimal bigDecimal2 = scale.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : scale.stripTrailingZeros();
                        Intrinsics.checkNotNullExpressionValue(bigDecimal2, "stripTrailingZeros(...)");
                        Object[] elements3 = {new NumberClause(bigDecimal2, new NumberClause.Format.FixedDigitsAfterDot(2, 14, null, null, null), null, o9.SENSITIVE, 4), new TextClause(aVar.f113704a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), moneyClause != null ? new TextClause("·", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, moneyClause};
                        Intrinsics.checkNotNullParameter(elements3, "elements");
                        clauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements3));
                    }
                } else {
                    int i6 = R$string.wealth_portfolio_shares_too_small_pattern;
                    if (moneyClause == null) {
                        m70.a.c(t0.f186434a);
                        moneyClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    clauseM = new TextLocalisedClause(i6, u.c(moneyClause), null, 12);
                }
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                if (instrumentTicker == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                BigDecimal bigDecimal3 = instrumentTicker.f105125w;
                if (bigDecimal3 == null) {
                    r6.b.D("Type is BOND, but lastYtm is null");
                    bigDecimal3 = BigDecimal.ZERO;
                }
                int i21 = com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_stocks_item_yield;
                String str = String.format("%.2f%%", Arrays.copyOf(new Object[]{bigDecimal3.multiply(new BigDecimal(100))}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                clauseM = new TextLocalisedClause(i21, u.c(str), null, 12);
                break;
                break;
        }
        Clause clause = clauseM;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new InstrumentImage(nVar.e, 30, null, null), null, null, false, null, false, 60);
        dj0.d dVarB = aVar.b();
        MoneyClause moneyClause2 = dVarB != null ? new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
        dj0.d dVarA = aVar.a();
        BigDecimal bigDecimal4 = aVar.d;
        if (dVarA != null && bigDecimal4 != null) {
            clauseB = sfl.b.b(this.f236784b, dVarA, bigDecimal4, null, 28);
        }
        return new RowDelegate.Model(strS, image40, textLocalisedClause, null, 0, clause, null, null, 0, new RowDelegate.Model.c.b(moneyClause2, clauseB, null, false, 124), false, null, false, null, null, null, null, null, null, new d(nVar, tradingAccountType, animationRequest), null, 0, 0, 0, 0, 532675544);
    }

    public final aim.e f(List rows, String portfolioId, TradingAccountType accountType, bih.b expandCollapseItemsCtaState, AnimationRequest animationRequest) {
        Object next;
        qv0.l lVarA;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        List<wjh.a0> list = rows;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((wjh.a0) next) instanceof y) {
                break;
            }
        }
        wjh.a0 a0Var = (wjh.a0) next;
        LargeActionButtonDelegate.Model modelA = this.f236783a.a(expandCollapseItemsCtaState, portfolioId);
        aim.e eVarB = u.b();
        for (wjh.a0 a0Var2 : list) {
            if (a0Var2 instanceof y) {
                lVarA = e(((y) a0Var2).f298131a, accountType, a0Var2 == a0Var ? animationRequest : null);
            } else {
                if (!(a0Var2 instanceof wjh.z)) {
                    throw new NoWhenBranchMatchedException();
                }
                lVarA = this.f236785c.a(((wjh.z) a0Var2).f298132a, true, portfolioId);
            }
            eVarB.add(lVarA);
        }
        if (modelA != null) {
            eVarB.add(modelA);
        }
        return u.a(eVarB);
    }

    public final CompositeClause g(del.b portfolioBalance, bnh.a aVar) {
        BigDecimal scale;
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        CompositeClause compositeClauseC = null;
        dj0.d dVarO = pyd.c.O(mif.a.Q(portfolioBalance.f113708a), aVar != null ? aVar.f17169a : null);
        if (aVar == null) {
            scale = portfolioBalance.d;
        } else {
            dj0.d dVarO2 = pyd.c.O(mif.a.Q(portfolioBalance.f113708a), aVar.f17169a);
            dj0.d dVarO3 = pyd.c.O(mif.a.Q(portfolioBalance.f113710c), aVar.f17170b);
            dj0.d dVarH = pyd.c.H(dVarO2, dVarO3);
            if (dVarH.f115082a != 0) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVarO3.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                RoundingMode roundingMode = RoundingMode.HALF_UP;
                BigDecimal scale2 = bigDecimalValueOf.setScale(8, roundingMode);
                Intrinsics.checkNotNullExpressionValue(scale2, "setScale(...)");
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVarH.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                BigDecimal bigDecimalDivide = scale2.divide(bigDecimalValueOf2, RoundingMode.HALF_EVEN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf3, "valueOf(...)");
                scale = bigDecimalDivide.multiply(bigDecimalValueOf3).setScale(4, roundingMode);
            } else {
                scale = BigDecimal.ZERO;
            }
        }
        boolean z = (portfolioBalance.e.isEmpty() && aVar == null) ? false : true;
        MoneyClause moneyClause = new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        if (z) {
            if (scale == null) {
                scale = BigDecimal.ZERO;
            }
            BigDecimal bigDecimal = scale;
            Intrinsics.h(bigDecimal);
            compositeClauseC = xqi.a.c(bigDecimal, false, false, false, false, false, CertificateBody.profileType);
        }
        Object[] elements = {moneyClause, compositeClauseC};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
