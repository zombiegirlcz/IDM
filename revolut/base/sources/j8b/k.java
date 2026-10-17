package j8b;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.corporate_events.common.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import iel.a0;
import iel.m;
import iel.o;
import iel.p;
import iel.q;
import iel.r;
import iel.t;
import iel.v;
import iel.w;
import iel.x;
import iel.y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import nel.n;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k {
    public static final boolean a(List list, List instruments) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        List<t> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        for (t tVar : list2) {
            if (!l.D(xi0.b.Companion, tVar.f160815b)) {
                List list3 = instruments;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    return false;
                }
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((n) it8.next()).f214596b, tVar.f160815b)) {
                        break;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final ComplexImage.Regular b(int i, int i2) {
        return new ComplexImage.Regular(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, null, i2, 8.0f, Float.valueOf(24.0f), null, 32));
    }

    public static final TextLocalisedClause c(iel.a aVar) {
        int i;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof iel.k) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_ex_dividend_description, null, null, 14);
        }
        if (aVar instanceof iel.d) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_cash_dividend_description, null, null, 14);
        }
        if (aVar instanceof x) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_stock_dividend_description, null, null, 14);
        }
        if (aVar instanceof a0) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_symbol_change_full_description, null, null, 14);
        }
        if (aVar instanceof y) {
            w wVar = ((y) aVar).f160829g;
            return wVar.f160822b > wVar.f160821a ? new TextLocalisedClause(R$string.feature_corporate_events_stock_split_forward_description, null, null, 14) : new TextLocalisedClause(R$string.feature_corporate_events_stock_split_reverse_description, null, null, 14);
        }
        if (aVar instanceof o) {
            o oVar = (o) aVar;
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            int i2 = j.f172167b[oVar.e.ordinal()];
            if (i2 == 1) {
                i = R$string.feature_corporate_events_listing_status_change_delisted_description;
            } else if (i2 == 2) {
                i = R$string.feature_corporate_events_listing_status_change_listed_description;
            } else if (i2 == 3) {
                i = R$string.feature_corporate_events_listing_status_change_new_listing_description;
            } else if (i2 == 4) {
                i = R$string.feature_corporate_events_listing_status_change_resumed_description;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.feature_corporate_events_listing_status_change_suspended_description;
            }
            return new TextLocalisedClause(i, null, null, 14);
        }
        if (aVar instanceof iel.h) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_earnings_call_full_description, null, null, 14);
        }
        if (aVar instanceof iel.b) {
            return new TextLocalisedClause(R$string.trading_corporate_event_learn_more_bankruptcy_what_is_it, null, null, 14);
        }
        if (aVar instanceof r) {
            return new TextLocalisedClause(R$string.trading_corporate_event_learn_more_merger_what_is_it, null, null, 14);
        }
        if (aVar instanceof v) {
            return new TextLocalisedClause(R$string.trading_corporate_event_learn_more_spin_off_what_is_it, null, null, 14);
        }
        if (aVar instanceof iel.c) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_bond_coupon_description, null, null, 14);
        }
        if (aVar instanceof m) {
            return new TextLocalisedClause(R$string.feature_corporate_events_bubble_structured_note_description, null, null, 14);
        }
        if (aVar instanceof iel.g) {
            return new TextLocalisedClause(R$string.feature_corporate_events_event_type_call_description, null, null, 14);
        }
        if (aVar instanceof q) {
            return new TextLocalisedClause(R$string.feature_corporate_events_event_type_principal_description, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int i = j.f172167b[oVar.e.ordinal()];
        if (i == 1) {
            return R$string.feature_corporate_events_listing_status_change_delisted_name;
        }
        if (i == 2) {
            return R$string.feature_corporate_events_listing_status_change_listed_name;
        }
        if (i == 3) {
            return R$string.feature_corporate_events_listing_status_change_new_listing_name;
        }
        if (i == 4) {
            return R$string.feature_corporate_events_listing_status_change_resumed_name;
        }
        if (i == 5) {
            return R$string.feature_corporate_events_listing_status_change_suspended_name;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final List e(int i, int i2) {
        TextClause textClause;
        Clause[] elements = new Clause[3];
        int i3 = i2 - 2;
        TextClause textClause2 = null;
        if (i == i3) {
            m70.a.t(t0.f186434a);
            textClause = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        elements[0] = textClause;
        elements[1] = i < i3 ? new TextClause(",", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : i == i3 ? new TextLocalisedClause(R$string.feature_corporate_events_ampersand, null, null, 14) : null;
        if (i < i2 - 1) {
            m70.a.t(t0.f186434a);
            textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        elements[2] = textClause2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static final Clause f(iel.a aVar, boolean z) {
        Float fValueOf = Float.valueOf(16.0f);
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return z ? new CompositeClause(zhm.v.k(new ImageClause(R$drawable.uikit_icn_24_info_outline, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(g(aVar), null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10)), null, null, null, 14) : new TextLocalisedClause(g(aVar), null, null, 14);
    }

    public static final int g(iel.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof iel.k) {
            return R$string.feature_corporate_events_event_type_ex_dividend_title;
        }
        if (aVar instanceof iel.d) {
            return R$string.feature_corporate_events_bubble_cash_dividend;
        }
        if (aVar instanceof x) {
            return R$string.feature_corporate_events_bubble_stock_dividend;
        }
        if (aVar instanceof a0) {
            return R$string.feature_corporate_events_symbol_change_name;
        }
        if (aVar instanceof y) {
            w wVar = ((y) aVar).f160829g;
            return wVar.f160821a < wVar.f160822b ? R$string.feature_corporate_events_stock_split_forward_name : R$string.feature_corporate_events_stock_split_reverse_name;
        }
        if (aVar instanceof o) {
            return d((o) aVar);
        }
        if (aVar instanceof iel.h) {
            return R$string.feature_corporate_events_earnings_call_name;
        }
        if (aVar instanceof iel.b) {
            return R$string.feature_corporate_events_event_type_bankruptcy_title;
        }
        if (aVar instanceof r) {
            return R$string.feature_corporate_events_event_type_merger_title;
        }
        if (aVar instanceof v) {
            return R$string.feature_corporate_events_event_type_spin_off_title;
        }
        if (!(aVar instanceof iel.c) && !(aVar instanceof m)) {
            if (aVar instanceof iel.g) {
                return R$string.feature_corporate_events_event_type_structured_note_call_title;
            }
            if (aVar instanceof q) {
                return R$string.feature_corporate_events_event_type_structured_note_principal_title;
            }
            throw new NoWhenBranchMatchedException();
        }
        return R$string.feature_corporate_events_event_type_bond_coupon_title;
    }

    public static final kp3.a h(iel.a aVar, List instruments) {
        String symbol;
        Object next;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        Iterator it8 = instruments.iterator();
        while (true) {
            symbol = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n) next).f214596b, aVar.i())) {
                break;
            }
        }
        n nVar = (n) next;
        if (nVar != null && io3.h.i(nVar.f214597c)) {
            symbol = ifk.b.e(nVar);
            if (symbol == null) {
                symbol = nVar.d;
            }
        } else if (nVar != null) {
            symbol = nVar.d;
        }
        if (symbol == null) {
            symbol = aVar.getSymbol();
        }
        return new kp3.a(aVar, symbol);
    }

    public static final ArrayList i(List list, List restructuredInstruments, Function1 filter) {
        AssetClauseType stock;
        String str;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        Intrinsics.checkNotNullParameter(filter, "filter");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Boolean) filter.invoke(obj2)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        int i = 0;
        for (Object obj3 : arrayList) {
            int i2 = i + 1;
            Object obj4 = null;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            t tVar = (t) obj3;
            BigDecimal bigDecimal = tVar.f160816c;
            String str2 = tVar.f160815b;
            List list2 = restructuredInstruments;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                stock = new AssetClauseType.Money(new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14));
            } else {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((n) it8.next()).f214596b, str2)) {
                        stock = new AssetClauseType.Stock(NumberClause.Format.Default.f57900a);
                        break;
                    }
                }
                stock = new AssetClauseType.Money(new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14));
            }
            Iterator it9 = list2.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next = it9.next();
                if (Intrinsics.f(((n) next).f214596b, str2)) {
                    obj4 = next;
                    break;
                }
            }
            n nVar = (n) obj4;
            arrayList2.add(d0.E0(e(i, arrayList.size()), u.c(new AssetClause(bigDecimal, stock, (nVar == null || (str = nVar.e) == null) ? str2 : str, null, null, 24))));
            i = i2;
        }
        return zhm.w.u(arrayList2);
    }

    public static final ArrayList j(List list, List restructuredInstruments) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(restructuredInstruments, "restructuredInstruments");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            t tVar = (t) obj2;
            Iterator it8 = restructuredInstruments.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((n) next).f214596b, tVar.f160815b)) {
                    break;
                }
            }
            n nVar = (n) next;
            ArrayList arrayListE0 = nVar != null ? d0.E0(restructuredInstruments.size() > 1 ? e(i, list.size()) : f0.f322471a, u.c(new TextClause(nVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126))) : null;
            if (arrayListE0 != null) {
                arrayList.add(arrayListE0);
            }
            i = i2;
        }
        return zhm.w.u(arrayList);
    }

    public static final TextLocalisedClause k(p pVar) {
        int i;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        switch (j.f172166a[pVar.f160804c.ordinal()]) {
            case 1:
                i = R$string.feature_corporate_events_martin_luter_king_day_name;
                break;
            case 2:
                i = R$string.feature_corporate_events_washingtons_birthday_name;
                break;
            case 3:
                i = R$string.feature_corporate_events_good_friday_name;
                break;
            case 4:
                i = R$string.feature_corporate_events_memorial_day_name;
                break;
            case 5:
                i = R$string.feature_corporate_events_independance_day_name;
                break;
            case 6:
                i = R$string.feature_corporate_events_labor_day_name;
                break;
            case 7:
                i = R$string.feature_corporate_events_thanksgiving_name;
                break;
            case 8:
                i = R$string.feature_corporate_events_christmas_name;
                break;
            case 9:
                i = R$string.feature_corporate_events_juneteenth;
                break;
            case 10:
                i = R.string.common_empty;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
