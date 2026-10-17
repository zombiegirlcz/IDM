package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.m7;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.CustomContentDescriptionClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.s4;
import dx4.t4;
import dx4.u4;
import dx4.v4;
import dx4.x4;
import ip0.tq;
import ip0.wq;
import ip0.xq;
import ip0.yq;
import ip0.zq;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c1 {
    public static int b(long j2) {
        return (int) kotlin.ranges.f.i(j2, 0L, 2147483647L);
    }

    public final InputSliderDelegate.Model a(x4 item, ax4.b constructorDomainState) {
        boolean z;
        List list;
        long j2;
        int i;
        long j3;
        Clause compositeClause;
        String str;
        Clause customContentDescriptionClause;
        int i2;
        boolean z3;
        Clause clause;
        zq yqVar;
        MoneyClause moneyClause;
        Clause textClause;
        MoneyClause moneyClause2;
        Clause textClause2;
        m7 m7Var;
        Iterator it8;
        int i3;
        boolean z4;
        Clause clause2;
        Clause moneyClause3;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        Map map = constructorDomainState.f10861j;
        String str2 = item.f120834a;
        List list2 = item.f120842n;
        long j5 = item.d;
        long j16 = item.f120836c;
        long j22 = item.e;
        v4 v4Var = item.f120837g;
        ax4.l lVar = (ax4.l) map.get(str2);
        long j42 = lVar != null ? lVar.f10889c : j22;
        boolean z6 = v4Var instanceof u4;
        if (z6) {
            String str3 = ((u4) v4Var).f120793c;
            if (str3 == null) {
                z = z6;
                list = list2;
                j2 = j22;
                j3 = j42;
                i = 1;
                compositeClause = null;
            } else {
                z = z6;
                j2 = j22;
                j3 = j42;
                i = 1;
                compositeClause = new TextClause(a0.d.v(new Object[]{Long.valueOf(j42)}, 1, str3, "format(...)"), (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                list = list2;
            }
        } else {
            z = z6;
            if (v4Var instanceof s4) {
                i = 1;
                list = list2;
                j2 = j22;
                compositeClause = new MoneyClause(new dj0.d(j42, ((s4) v4Var).f120767a), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.NON_SENSITIVE);
                j3 = j42;
            } else {
                list = list2;
                j2 = j22;
                i = 1;
                if (!(v4Var instanceof t4)) {
                    throw new NoWhenBranchMatchedException();
                }
                t4 t4Var = (t4) v4Var;
                MoneyClause moneyClause4 = new MoneyClause(new dj0.d(j42, t4Var.f120779a), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), o9.NON_SENSITIVE);
                DotDividerClause dotDividerClause = new DotDividerClause((Integer) null);
                j3 = j42;
                BigDecimal bigDecimalDivide = BigDecimal.valueOf(j42).multiply(BigDecimal.valueOf(100L)).divide(BigDecimal.valueOf(t4Var.f120780b), MathContext.DECIMAL128);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                compositeClause = new CompositeClause(zhm.v.k(moneyClause4, dotDividerClause, new PercentageClause(bigDecimalDivide, new PercentageClause.Format.Custom(0, 14, null, null, null), (Style) null, 4)), null, null, null, 14);
            }
        }
        String str4 = item.f120834a;
        boolean z11 = item.f120838h;
        if (compositeClause != null) {
            Clause clause3 = compositeClause;
            dx4.q qVar = item.f120840l;
            int i5 = R$string.credit_application_constructor_slider_value;
            Clause[] elements = new Clause[2];
            elements[0] = qVar != null ? c8g.c.D(qVar) : null;
            elements[i] = clause3;
            Intrinsics.checkNotNullParameter(elements, "elements");
            str = str4;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i5, zhm.u.c(new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14)), null, 12);
            customContentDescriptionClause = qVar != null ? new CustomContentDescriptionClause(textLocalisedClause, clause3) : textLocalisedClause;
        } else {
            str = str4;
            customContentDescriptionClause = null;
        }
        int iB = b(j16);
        int iB2 = b(j5);
        int iB3 = lVar != null ? lVar.f10888b : b(j3);
        if (ue0.e.n(list)) {
            i2 = iB;
            z3 = z11;
            clause = customContentDescriptionClause;
            Integer numValueOf = Integer.valueOf(b(j2));
            if ((lVar != null ? lVar.f10888b : b(j3)) == b(j2)) {
                numValueOf = null;
            }
            yqVar = new yq(zhm.v.l(numValueOf));
        } else {
            List list3 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                int iIntValue = ((Number) it9.next()).intValue();
                if (z) {
                    moneyClause3 = new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    it8 = it9;
                    i3 = iB;
                    z4 = z11;
                    clause2 = customContentDescriptionClause;
                } else {
                    it8 = it9;
                    if (v4Var instanceof s4) {
                        i3 = iB;
                        z4 = z11;
                        clause2 = customContentDescriptionClause;
                        moneyClause3 = new MoneyClause(new dj0.d(iIntValue, ((s4) v4Var).f120767a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    } else {
                        i3 = iB;
                        z4 = z11;
                        clause2 = customContentDescriptionClause;
                        if (!(v4Var instanceof t4)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        moneyClause3 = new MoneyClause(new dj0.d(iIntValue, ((t4) v4Var).f120779a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    }
                }
                arrayList.add(new wq(moneyClause3, iIntValue));
                it9 = it8;
                z11 = z4;
                iB = i3;
                customContentDescriptionClause = clause2;
            }
            i2 = iB;
            z3 = z11;
            clause = customContentDescriptionClause;
            yqVar = new xq(arrayList);
        }
        if (z) {
            textClause = new TextClause(a0.d.v(new Object[]{Long.valueOf(j16)}, i, ((u4) v4Var).f120791a, "format(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (v4Var instanceof s4) {
                moneyClause = new MoneyClause(new dj0.d(j16, ((s4) v4Var).f120767a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            } else {
                if (!(v4Var instanceof t4)) {
                    throw new NoWhenBranchMatchedException();
                }
                moneyClause = new MoneyClause(new dj0.d(j16, ((t4) v4Var).f120779a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            }
            textClause = moneyClause;
        }
        if (z) {
            textClause2 = new TextClause(a0.d.v(new Object[]{Long.valueOf(j5)}, 1, ((u4) v4Var).f120792b, "format(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (v4Var instanceof s4) {
                moneyClause2 = new MoneyClause(new dj0.d(j5, ((s4) v4Var).f120767a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            } else {
                if (!(v4Var instanceof t4)) {
                    throw new NoWhenBranchMatchedException();
                }
                moneyClause2 = new MoneyClause(new dj0.d(j5, ((t4) v4Var).f120779a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            }
            textClause2 = moneyClause2;
        }
        tq tqVar = new tq(textClause, textClause2);
        int i6 = R$string.credit_application_constructor_slider_title;
        TextClause textClause3 = new TextClause(item.f120835b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dx4.q qVar2 = item.f120839j;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i6, zhm.u.c(yoj.b.w(textClause3, qVar2 != null ? c8g.c.F(qVar2) : null)), null, 12);
        com.google.protobuf.w0 w0VarA = zw4.a.a(item.f120834a);
        int i21 = b1.f210167a[item.o.ordinal()];
        if (i21 == 1) {
            m7Var = m7.START;
        } else {
            if (i21 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m7Var = m7.CENTER;
        }
        return new InputSliderDelegate.Model(str, tqVar, i2, textLocalisedClause2, iB2, iB3, clause, yqVar, z3, m7Var, new AnalyticsContext(w0VarA), item, 4112);
    }
}
