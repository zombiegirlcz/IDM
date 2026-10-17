package dwk;

import aw0.m8;
import aw0.n8;
import aw0.p8;
import aw0.p9;
import bfl.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.OrderBookItemDelegate;
import com.revolut.core.ui_kit.delegates.da;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.trading.core.domain.orders.InvestCommodityOrder;
import com.revolut.retail.trading.core.domain.orders.InvestFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMarginOrder;
import com.revolut.retail.trading.core.domain.orders.InvestMutualFundOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOptionOrder;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.retail.wealth.resources.R$string;
import cp5.d;
import ip0.iz;
import ip0.mz;
import ip0.nz;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import ue0.e;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a() {
        nz nzVarB = b(true);
        f0 f0Var = f0.f322471a;
        iz izVar = new iz(new m8(f0Var, f0Var, BitmapDescriptorFactory.HUE_RED), u.c(new TextLocalisedClause(R$string.trading_asset_details_order_book_caption_no_data, null, null, 14)), 24);
        int i = R$attr.uikit_dp16;
        izVar.f164759c = i;
        izVar.d = i;
        List listK = v.k(nzVarB, izVar);
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public static nz b(boolean z) {
        return new nz(new mz(new TextLocalisedClause(R$string.trading_asset_details_order_book_header_bid, null, null, 14), new TextLocalisedClause(R$string.trading_asset_details_order_book_header_ask, null, null, 14), z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.revolut.core.ui_kit.models.Clause] */
    public static ArrayList c(rel.a aVar, boolean z) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Object obj2;
        AssetClause assetClause;
        BigDecimal bigDecimal3;
        int iIntValue;
        String str;
        BigDecimal bigDecimal4;
        int i;
        AssetClause assetClause2;
        boolean z3;
        int iIntValue2;
        rel.a aVar2 = aVar;
        ArrayList arrayList = aVar2.f253644b;
        ArrayList arrayList2 = aVar2.f253645c;
        int iMax = Math.max(arrayList.size(), arrayList2.size());
        Float f = null;
        if (iMax == 0) {
            return null;
        }
        if (z) {
            iMax = 1;
        }
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            bigDecimal = ((rel.b) it8.next()).f253647b;
            while (it8.hasNext()) {
                BigDecimal bigDecimal5 = ((rel.b) it8.next()).f253647b;
                if (bigDecimal.compareTo(bigDecimal5) < 0) {
                    bigDecimal = bigDecimal5;
                }
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        Iterator it9 = arrayList2.iterator();
        if (it9.hasNext()) {
            bigDecimal2 = ((rel.b) it9.next()).f253647b;
            while (it9.hasNext()) {
                BigDecimal bigDecimal6 = ((rel.b) it9.next()).f253647b;
                if (bigDecimal2.compareTo(bigDecimal6) < 0) {
                    bigDecimal2 = bigDecimal6;
                }
            }
        } else {
            bigDecimal2 = null;
        }
        if (bigDecimal2 == null) {
            bigDecimal2 = BigDecimal.ZERO;
        }
        IntRange intRangeO = f.o(0, iMax);
        ArrayList arrayList3 = new ArrayList(w.t(intRangeO, 10));
        vim.f it10 = intRangeO.iterator();
        while (it10.f289625c) {
            int iNextInt = it10.nextInt();
            rel.b bVar = (rel.b) d0.e0(iNextInt, arrayList);
            rel.b bVar2 = (rel.b) d0.e0(iNextInt, arrayList2);
            Intrinsics.h(bigDecimal);
            Intrinsics.h(bigDecimal2);
            String strJ = d.J(aVar2.f253643a);
            String str2 = "OrderBookItem_" + (bVar != null ? Float.valueOf(bVar.f253646a) : f) + "_" + (bVar2 != null ? Float.valueOf(bVar2.f253646a) : f);
            Object numberClause = bVar != null ? new NumberClause(bVar.f253647b, null, null, null, 14) : f;
            if (bVar != null) {
                obj2 = numberClause;
                assetClause = new AssetClause(new BigDecimal(String.valueOf(bVar.f253646a)), new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), strJ, null, null, 24);
            } else {
                obj2 = numberClause;
                assetClause = null;
            }
            if (bVar != null) {
                BigDecimal bigDecimal7 = bVar.f253647b;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                bigDecimal3 = bigDecimal;
                iIntValue = bigDecimal7.multiply(bigDecimalValueOf).divide(bigDecimal3, 0, RoundingMode.HALF_UP).intValue();
            } else {
                bigDecimal3 = bigDecimal;
                iIntValue = 0;
            }
            NumberClause numberClause2 = bVar2 != null ? new NumberClause(bVar2.f253647b, null, null, null, 14) : null;
            if (bVar2 != null) {
                str = "valueOf(...)";
                bigDecimal4 = bigDecimal3;
                i = 100;
                assetClause2 = new AssetClause(new BigDecimal(String.valueOf(bVar2.f253646a)), new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), strJ, null, null, 24);
            } else {
                str = "valueOf(...)";
                bigDecimal4 = bigDecimal3;
                i = 100;
                assetClause2 = null;
            }
            if (bVar2 != null) {
                BigDecimal bigDecimal8 = bVar2.f253647b;
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, str);
                z3 = false;
                iIntValue2 = bigDecimal8.multiply(bigDecimalValueOf2).divide(bigDecimal2, 0, RoundingMode.HALF_UP).intValue();
            } else {
                z3 = false;
                iIntValue2 = 0;
            }
            arrayList3.add(new da(str2, new OrderBookItemDelegate.a(obj2, assetClause, iIntValue, numberClause2, assetClause2, iIntValue2), new ewk.a(bVar != null ? Float.valueOf(bVar.f253646a) : null, bVar2 != null ? Float.valueOf(bVar2.f253646a) : null)));
            aVar2 = aVar;
            bigDecimal = bigDecimal4;
            f = null;
        }
        return arrayList3;
    }

    public static LinkedHashMap d(ArrayList arrayList, List list) {
        BigDecimal bigDecimalY;
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            InvestOrder investOrder = (InvestOrder) obj2;
            BigDecimal bigDecimal = null;
            if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                bigDecimalY = pyd.c.Y(com.revolut.retail.trading.core.domain.orders.a.f((InvestOrder.InvestSecuritiesOrder) investOrder));
            } else {
                if (investOrder instanceof InvestMarginOrder) {
                    InvestMarginOrder investMarginOrder = (InvestMarginOrder) investOrder;
                    Intrinsics.checkNotNullParameter(investMarginOrder, "<this>");
                    ej0.b bVar = investMarginOrder.u;
                    if (bVar == null) {
                        bVar = investMarginOrder.v;
                    }
                    if (bVar != null) {
                        bigDecimalY = bVar.f126703a;
                    }
                } else if (!(investOrder instanceof InvestFundOrder) && !(investOrder instanceof InvestMutualFundOrder) && !(investOrder instanceof InvestOptionOrder) && !(investOrder instanceof InvestCommodityOrder)) {
                    throw new NoWhenBranchMatchedException();
                }
                bigDecimalY = null;
            }
            if (bigDecimalY != null) {
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(new BigDecimal(String.valueOf(((rel.b) it8.next()).f253646a)));
                }
                Iterator it9 = arrayList2.iterator();
                if (it9.hasNext()) {
                    next = it9.next();
                    if (it9.hasNext()) {
                        BigDecimal bigDecimalSubtract = ((BigDecimal) next).subtract(bigDecimalY);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                        BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                        do {
                            Object next2 = it9.next();
                            BigDecimal bigDecimalSubtract2 = ((BigDecimal) next2).subtract(bigDecimalY);
                            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                            BigDecimal bigDecimalAbs2 = bigDecimalSubtract2.abs();
                            if (bigDecimalAbs.compareTo(bigDecimalAbs2) > 0) {
                                next = next2;
                                bigDecimalAbs = bigDecimalAbs2;
                            }
                        } while (it9.hasNext());
                    }
                } else {
                    next = null;
                }
                BigDecimal bigDecimal2 = (BigDecimal) next;
                if (bigDecimal2 != null) {
                    bigDecimal = bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros();
                }
            }
            Object arrayList3 = linkedHashMap.get(bigDecimal);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(bigDecimal, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v11 */
    public static ArrayList e(ArrayList arrayList, xi0.b bVar, float f, g gVar, LinkedHashMap linkedHashMap) {
        BigDecimal bigDecimal;
        ?? r142;
        int i;
        TextLocalisedClause textLocalisedClause;
        int i2;
        char c2;
        char c3;
        Iterable iterableK;
        boolean z;
        dj0.d u;
        BigDecimal ZERO;
        BigDecimal element = BigDecimal.ZERO;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i5 = 0;
        while (i5 < size) {
            rel.b bVar2 = (rel.b) arrayList.get(i5);
            Intrinsics.checkNotNullExpressionValue(element, "element");
            BigDecimal bigDecimal2 = bVar2.f253647b;
            float f4 = bVar2.f253646a;
            BigDecimal bigDecimalAdd = element.add(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(f4));
            List list = (List) linkedHashMap.get(bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, i3) : bigDecimal3.stripTrailingZeros());
            float fFloatValue = bVar2.f253647b.floatValue();
            int i6 = i3;
            if (e.n(list)) {
                iterableK = f0.f322471a;
                i2 = size;
                c3 = 2;
                c2 = 1;
            } else {
                int size2 = list.size();
                BigDecimal bigDecimal4 = BigDecimal.ZERO;
                if (list.isEmpty()) {
                    bigDecimal = bigDecimal4;
                } else {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        InvestOrder investOrder = (InvestOrder) listIterator.previous();
                        Intrinsics.h(bigDecimal4);
                        if (investOrder instanceof InvestOrder.InvestSecuritiesOrder) {
                            ZERO = com.revolut.retail.trading.core.domain.orders.a.d((InvestOrder.InvestSecuritiesOrder) investOrder);
                        } else if (investOrder instanceof InvestMarginOrder) {
                            ZERO = com.revolut.retail.trading.core.domain.orders.a.c((InvestMarginOrder) investOrder);
                        } else if (investOrder instanceof InvestFundOrder) {
                            ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        } else if (investOrder instanceof InvestMutualFundOrder) {
                            ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        } else if (investOrder instanceof InvestOptionOrder) {
                            ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        } else {
                            if (!(investOrder instanceof InvestCommodityOrder)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ZERO = BigDecimal.ZERO;
                            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        }
                        BigDecimal bigDecimalAdd2 = bigDecimal4.add(ZERO);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                        bigDecimal4 = bigDecimalAdd2;
                    }
                    bigDecimal = bigDecimal4;
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO = dj0.d.e;
                if (!list.isEmpty()) {
                    ListIterator listIterator2 = list.listIterator(list.size());
                    while (listIterator2.hasPrevious()) {
                        InvestOrder investOrder2 = (InvestOrder) listIterator2.previous();
                        if (investOrder2 instanceof InvestOrder.InvestSecuritiesOrder) {
                            u = ((InvestOrder.InvestSecuritiesOrder) investOrder2).getU();
                        } else if (investOrder2 instanceof InvestMarginOrder) {
                            u = ((InvestMarginOrder) investOrder2).f104559s;
                        } else if (investOrder2 instanceof InvestFundOrder) {
                            dj0.d.Companion.getClass();
                            u = dj0.d.e;
                        } else if (investOrder2 instanceof InvestMutualFundOrder) {
                            dj0.d.Companion.getClass();
                            u = dj0.d.e;
                        } else if (investOrder2 instanceof InvestOptionOrder) {
                            dj0.d.Companion.getClass();
                            u = dj0.d.e;
                        } else {
                            if (!(investOrder2 instanceof InvestCommodityOrder)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dj0.d.Companion.getClass();
                            u = dj0.d.e;
                        }
                        dVarO = pyd.c.O(dVarO, u);
                    }
                }
                int i21 = c.f120489a[gVar.ordinal()];
                if (i21 == 1) {
                    r142 = 0;
                    z = false;
                    if (size2 > 1) {
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_multiple_buy, u.c(Integer.valueOf(size2)), null, 12);
                    } else {
                        i = 14;
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_title, null, null, 14);
                        qw0.b bVar3 = new qw0.b(textLocalisedClause, "tooltip_limit_header");
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_shares_key, r142, r142, i);
                        Intrinsics.h(bigDecimal);
                        qw0.d dVar = new qw0.d(textLocalisedClause2, new NumberClause(bigDecimal, null, null, null, 14), "tooltip_limit_total_shares");
                        i2 = size;
                        qw0.d dVar2 = new qw0.d(new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_value_key, null, null, 14), new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), "tooltip_limit_total_value");
                        qw0.e[] eVarArr = new qw0.e[3];
                        eVarArr[i6] = bVar3;
                        c2 = 1;
                        eVarArr[1] = dVar;
                        c3 = 2;
                        eVarArr[2] = dVar2;
                        iterableK = v.k(eVarArr);
                    }
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (size2 > 1) {
                        z = false;
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_multiple_sell, u.c(Integer.valueOf(size2)), null, 12);
                    } else {
                        z = false;
                        textLocalisedClause = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_sell_title, null, null, 14);
                    }
                }
                i = 14;
                r142 = z;
                qw0.b bVar32 = new qw0.b(textLocalisedClause, "tooltip_limit_header");
                TextLocalisedClause textLocalisedClause22 = new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_shares_key, r142, r142, i);
                Intrinsics.h(bigDecimal);
                qw0.d dVar3 = new qw0.d(textLocalisedClause22, new NumberClause(bigDecimal, null, null, null, 14), "tooltip_limit_total_shares");
                i2 = size;
                qw0.d dVar22 = new qw0.d(new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_value_key, null, null, 14), new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), "tooltip_limit_total_value");
                qw0.e[] eVarArr2 = new qw0.e[3];
                eVarArr2[i6] = bVar32;
                c2 = 1;
                eVarArr2[1] = dVar3;
                c3 = 2;
                eVarArr2[2] = dVar22;
                iterableK = v.k(eVarArr2);
            }
            int i22 = i5;
            double d = f;
            qw0.b bVar4 = new qw0.b(new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_range, u.c(new PercentageClause(((((double) f4) - d) / d) * ((double) 100), new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), (Custom) null, 4)), null, 12), "tooltip_range");
            qw0.d dVar4 = new qw0.d(new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_price_key, null, null, 14), new AssetClause(new BigDecimal(String.valueOf(f4)), new AssetClauseType.Money(new MoneyClause.Format.Defaults(null, null, false, false, 15)), d.J(bVar), null, null, 24), "tooltip_price");
            qw0.d dVar5 = new qw0.d(new TextLocalisedClause(R$string.trading_asset_details_order_book_tooltip_sum_key, null, null, 14), new NumberClause(bigDecimalAdd, null, null, null, 14), "tooltip_volume");
            qw0.e[] eVarArr3 = new qw0.e[3];
            eVarArr3[i6] = bVar4;
            eVarArr3[c2] = dVar4;
            eVarArr3[c3] = dVar5;
            arrayList2.add(new p8(f4, fFloatValue, new n8(d0.E0(iterableK, v.k(eVarArr3))), list != null ? new TextLocalisedClause(R$string.trading_asset_details_order_book_indicator_limit_order, null, null, 14) : null));
            i5 = i22 + 1;
            element = bigDecimalAdd;
            i3 = i6;
            size = i2;
        }
        return arrayList2;
    }
}
