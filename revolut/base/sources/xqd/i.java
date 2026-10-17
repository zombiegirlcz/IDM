package xqd;

import a0j.c0;
import a0j.d0;
import a0j.e0;
import a0j.g0;
import a0j.h0;
import a0j.i0;
import a0j.l;
import a0j.m;
import a0j.p;
import a0j.q;
import a0j.r;
import a0j.s;
import a0j.t;
import aw0.c7;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.j;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo8.j0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements n {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zqd.a f308164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zqd.c f308165b;

    public i(zqd.a actionMapper, zqd.c elementMapper) {
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(elementMapper, "elementMapper");
        this.f308164a = actionMapper;
        this.f308165b = elementMapper;
    }

    public final ArrayList a(List list) {
        String str;
        int i;
        int i2;
        RowDelegate.Model model;
        String str2;
        String str3;
        int i3;
        String str4;
        Integer num;
        CompositeClause compositeClause;
        String str5;
        Pair pair;
        String str6;
        int i5;
        List<s> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (s element : list2) {
            this.f308165b.getClass();
            Intrinsics.checkNotNullParameter(element, "element");
            if (element instanceof l) {
                m mVar = ((l) element).f411a;
                int[] iArr = zqd.d.f324465a;
                switch (iArr[mVar.ordinal()]) {
                    case 1:
                        str6 = "See how quickly you’re spending day to day";
                        break;
                    case 2:
                        str6 = "Understand how spending affects what’s left";
                        break;
                    case 3:
                        str6 = "Spot subscriptions and regular costs";
                        break;
                    case 4:
                        str6 = "See how consistently you’re putting money aside";
                        break;
                    case 5:
                        str6 = "Track progress towards a stronger safety buffer";
                        break;
                    case 6:
                        str6 = "See how consistently you’re building long-term wealth";
                        break;
                    case 7:
                        str6 = "Understand how balanced or risky your portfolio looks";
                        break;
                    case 8:
                        str6 = "Track growth across cash, savings, and investments";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                String str7 = str6;
                String str8 = "LOCKED_METRIC_LIST_ID" + mVar;
                TextClause textClauseA = zqd.c.a(mVar);
                TextClause textClause = new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                switch (iArr[mVar.ordinal()]) {
                    case 1:
                        i5 = R$drawable.uikit_icn_24_limit;
                        break;
                    case 2:
                        i5 = R$drawable.uikit_icn_24_wealth_down;
                        break;
                    case 3:
                        i5 = R$drawable.uikit_icn_24_retry;
                        break;
                    case 4:
                        i5 = R$drawable.uikit_icn_24_limit;
                        break;
                    case 5:
                        i5 = R$drawable.uikit_icn_24_insurance;
                        break;
                    case 6:
                        i5 = R$drawable.uikit_icn_24_limit;
                        break;
                    case 7:
                        i5 = R$drawable.uikit_icn_24_portfolio_slow_and_steady;
                        break;
                    case 8:
                        i5 = R$drawable.uikit_icn_24_wealth;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                model = new RowDelegate.Model(str8, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i5, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textClauseA, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            } else if (element instanceof a0j.n) {
                a0j.n nVar = (a0j.n) element;
                t tVar = nVar.f413b;
                TextClause textClause2 = zqd.c.f324464a;
                m mVar2 = nVar.f412a;
                int[] iArr2 = zqd.d.f324466b;
                switch (iArr2[tVar.ordinal()]) {
                    case 1:
                        str4 = "High";
                        break;
                    case 2:
                        str4 = "Good";
                        break;
                    case 3:
                        str4 = "Positive";
                        break;
                    case 4:
                        str4 = "Growing";
                        break;
                    case 5:
                        str4 = "Cautious";
                        break;
                    case 6:
                        str4 = "Low";
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                String str9 = str4;
                i0 i0Var = nVar.f414c;
                CompositeClause compositeClause2 = null;
                if (i0Var.equals(c0.f395a)) {
                    num = null;
                } else {
                    if (i0Var instanceof d0) {
                        d0 d0Var = (d0) i0Var;
                        compositeClause = new CompositeClause(v.k(new MoneyClause(d0Var.f398b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), textClause2, new TextClause("by", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause2, j.b(c7.Companion, d0Var.f397a, new LocalDateClause$DateFormat.Month(0))), null, null, null, 14);
                    } else if (i0Var instanceof e0) {
                        compositeClause = new CompositeClause(v.k(new MoneyClause(((e0) i0Var).f400a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), textClause2, textClause2, new ImageClause(R$drawable.uikit_icn_10_stocks_arrow_up, Integer.valueOf(R$attr.uikit_colorStatusSuccess), (Float) null, (Float) null, 28), new PercentageClause(new BigDecimal(String.valueOf(Math.abs(3.12f))), (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusSuccess), false, null, false, null, 254), 2)), null, null, null, 14);
                    } else if (i0Var instanceof g0) {
                        g0 g0Var = (g0) i0Var;
                        MoneyClause moneyClause = new MoneyClause(g0Var.f404b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                        TextClause textClause3 = new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        int i6 = zqd.d.f324467c[g0Var.f403a.ordinal()];
                        if (i6 == 1) {
                            str5 = "day";
                        } else if (i6 == 2) {
                            str5 = "week";
                        } else if (i6 == 3) {
                            str5 = "month";
                        } else {
                            if (i6 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str5 = "year";
                        }
                        TextClause textClause4 = new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        num = null;
                        Object[] elements = {moneyClause, textClause2, textClause3, textClause2, textClause4, g0Var.f405c ? new CompositeClause(v.k(textClause2, new TextClause("avg.", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14) : null};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        compositeClause2 = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
                    } else {
                        num = null;
                        if (!(i0Var instanceof h0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h0 h0Var = (h0) i0Var;
                        compositeClause = new CompositeClause(v.k(new MoneyClause(h0Var.f406a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), textClause2, new TextClause("/", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause2, new MoneyClause(h0Var.f407b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, null, null, 14);
                        compositeClause2 = compositeClause;
                    }
                    num = null;
                    compositeClause2 = compositeClause;
                }
                aim.e eVarB = u.b();
                eVarB.add(new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                if (compositeClause2 != null) {
                    eVarB.add(new DotDividerClause(num));
                    eVarB.add(compositeClause2);
                }
                CompositeClause compositeClause3 = new CompositeClause(u.a(eVarB), null, null, null, 14);
                String str10 = "SCORED_METRIC_LIST_ID" + mVar2;
                TextClause textClauseA2 = zqd.c.a(mVar2);
                switch (iArr2[tVar.ordinal()]) {
                    case 1:
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_up), Integer.valueOf(R$attr.uikit_colorGreyTone20));
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_check), Integer.valueOf(R$attr.uikit_colorStatusSuccess));
                        break;
                    case 6:
                        pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_down), Integer.valueOf(R$attr.uikit_colorGreyTone20));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(((Number) pair.f186385a).intValue(), (Integer) null, (Integer) null, Integer.valueOf(((Number) pair.f186386b).intValue()), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
                yy0.i iVar = yy0.l.Companion;
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                iVar.getClass();
                model = new RowDelegate.Model(str10, image24, textClauseA2, null, 0, compositeClause3, null, null, 0, new tf(yy0.i.a(resourceImage)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            } else if (element instanceof p) {
                p pVar = (p) element;
                int[] iArr3 = zqd.d.d;
                int i21 = iArr3[pVar.ordinal()];
                if (i21 == 1) {
                    str2 = "Improve your chances";
                } else {
                    if (i21 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "Unlock better offers";
                }
                String str11 = str2;
                int i22 = iArr3[pVar.ordinal()];
                if (i22 == 1) {
                    str3 = "Get guidance on habits that may help with future eligibility";
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str3 = "Understand what can support access to Revolut credit products.";
                }
                int i32 = iArr3[pVar.ordinal()];
                if (i32 == 1) {
                    i3 = R$drawable.uikit_icn_24_person_checked;
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R$drawable.uikit_icn_24_card;
                }
                model = new RowDelegate.Model("RECOMMENDATION_LIST_ID" + pVar, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextClause(str11, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            } else {
                if (!(element instanceof r)) {
                    throw new NoWhenBranchMatchedException();
                }
                r rVar = (r) element;
                q qVar = rVar.f415a;
                int[] iArr4 = zqd.d.e;
                int i33 = iArr4[qVar.ordinal()];
                if (i33 == 1) {
                    str = "Doing well";
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "Needs attention";
                }
                String str12 = str;
                String strH = a0.d.h(rVar.f416b, " item(s)");
                int i43 = iArr4[qVar.ordinal()];
                if (i43 == 1) {
                    i = R$drawable.uikit_icn_24_check;
                } else {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$drawable.uikit_icn_24_exclamation_mark;
                }
                int i59 = iArr4[qVar.ordinal()];
                if (i59 == 1) {
                    i2 = R$attr.uikit_colorStatusSuccess;
                } else {
                    if (i59 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R$attr.uikit_colorForeground;
                }
                TextClause textClause5 = new TextClause(str12, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                TextClause textClause6 = new TextClause(strH, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                RowDelegate.Model.MainImage.Image24 image242 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
                yy0.i iVar2 = yy0.l.Companion;
                ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246);
                iVar2.getClass();
                model = new RowDelegate.Model("STATUS_LIST_ID" + qVar, image242, textClause5, null, 0, textClause6, null, null, 0, new tf(yy0.i.a(resourceImage2)), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            }
            arrayList.add(model);
        }
        return arrayList;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c((List) iii.c.f(domainState.f308155a, new xo8.i0(19), new xlb.l(23), new j0(this, 3)));
    }
}
