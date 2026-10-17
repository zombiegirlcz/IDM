package bzg;

import a83.w0;
import android.os.Parcelable;
import aw0.e5;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.models.PnLValues;
import cul.r1;
import ip0.s7;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gyg.o f20024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final czg.c f20025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uyg.e f20026c;
    public final gyg.m d;
    public final pyg.i e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f20027g;

    public y(gyg.o analyticsChartMapper, czg.c widgetisedAnalyticsPnLContributionMapper, uyg.e timeframeMapper, gyg.m barChartMapper, uyg.c headerTimeframeMapper, pyg.i analyticsDisclaimersMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(analyticsChartMapper, "analyticsChartMapper");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPnLContributionMapper, "widgetisedAnalyticsPnLContributionMapper");
        Intrinsics.checkNotNullParameter(timeframeMapper, "timeframeMapper");
        Intrinsics.checkNotNullParameter(barChartMapper, "barChartMapper");
        Intrinsics.checkNotNullParameter(headerTimeframeMapper, "headerTimeframeMapper");
        Intrinsics.checkNotNullParameter(analyticsDisclaimersMapper, "analyticsDisclaimersMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f20024a = analyticsChartMapper;
        this.f20025b = widgetisedAnalyticsPnLContributionMapper;
        this.f20026c = timeframeMapper;
        this.d = barChartMapper;
        this.e = analyticsDisclaimersMapper;
        this.f = featureToggleInteractor;
        this.f20027g = te0.w.y0(new bvb.a(this, 4));
    }

    public static List a() {
        List listK = zhm.v.k(new s7("BREAKDOWN_FIRST_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("BREAKDOWN_SECOND_LIST_ID", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, R$attr.uikit_dp0, 0, 0, 0, 30);
        return listK;
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        boolean z;
        List listA;
        List list;
        int[] iArr;
        Data data;
        vyg.c cVar;
        Data data2;
        vyg.f fVar;
        String str;
        boolean z3;
        ?? r3;
        int i;
        int i2;
        Clause textClause;
        Clause textClause2;
        Clause textClause3;
        String str2;
        List listK;
        boolean z4;
        String str3;
        String str4;
        Clause clauseC;
        TimeClause.Format pretty;
        int i3;
        dj0.d value;
        fzg.e eVar;
        char c2;
        int i5;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        vyg.d dVar = domainState.f;
        e5 e5Var = domainState.f20003t;
        fzg.f fVar2 = domainState.f19999p;
        boolean z6 = domainState.f19993g;
        Data data3 = domainState.f19992c;
        vyg.c selectedTimeframe = domainState.d;
        Data chartData = domainState.i;
        vyg.f selectedPnlType = domainState.f19991b;
        int[] iArr2 = x.f20021a;
        int i6 = iArr2[dVar.ordinal()];
        int i21 = 19;
        if (i6 == 1) {
            z = z6;
            listA = this.f20024a.a("PNL_CHART_LIST_ID", domainState.i, new bxg.t(23), new bxg.t(24), new bxg.t(25), null);
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            int i22 = x.f20022b[selectedPnlType.ordinal()];
            gyg.m mVar = this.d;
            if (i22 == 1) {
                z = z6;
                listA = mVar.f(chartData, selectedTimeframe, e5Var, selectedPnlType);
            } else {
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Data realisedItems = domainState.f20000q;
                Intrinsics.checkNotNullParameter("PNL_CHART_LIST_ID", "listId");
                Intrinsics.checkNotNullParameter(realisedItems, "realisedItems");
                Intrinsics.checkNotNullParameter(chartData, "chartData");
                Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
                Intrinsics.checkNotNullParameter(selectedPnlType, "selectedPnlType");
                if (selectedTimeframe == vyg.c.DAILY) {
                    listA = mVar.f(chartData, selectedTimeframe, e5Var, selectedPnlType);
                    z = z6;
                } else {
                    z = z6;
                    List list2 = (List) iii.c.f(realisedItems, new gvi.p(i21), new gyg.a(mVar, 1), new gyg.b(mVar, selectedTimeframe, e5Var, 1));
                    yp0.b.q(list2, 0, 0, 0, 0, 15);
                    listA = list2;
                }
            }
        }
        eVarB.addAll(listA);
        eVarB.add(this.f20026c.c(selectedTimeframe));
        int[] iArr3 = x.f20022b;
        int i32 = iArr3[selectedPnlType.ordinal()];
        int i33 = 20;
        int i43 = 21;
        if (i32 == 1) {
            list = ((Boolean) this.f20027g.getValue()).booleanValue() ? (List) iii.c.f(data3, new bxg.t(this, i33), new bw4.t(20), new w0(domainState.f19996l, 1)) : (List) iii.c.f(data3, new bxg.t(this, 22), new bw4.t(21), new b0c.a(i43));
        } else {
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Data data4 = domainState.f19997m;
            list = data4 != null ? (List) iii.c.f(data4, new bxg.t(this, i43), new bw4.t(19), new b0c.a(i33)) : null;
        }
        if (list != null) {
            eVarB.addAll(list);
        }
        if (!z || fVar2 == null || (chartData.getContent() == null && chartData.getError() != null)) {
            iArr = iArr3;
            data = data3;
            cVar = selectedTimeframe;
            data2 = chartData;
            fVar = selectedPnlType;
            str = "selectedTimeframe";
            z3 = z;
            r3 = 0;
            i = 14;
        } else {
            Data contributorsData = domainState.f20002s;
            boolean z11 = domainState.o;
            Intrinsics.checkNotNullParameter(contributorsData, "contributorsData");
            czg.c cVar2 = this.f20025b;
            iArr = iArr3;
            List list3 = (List) iii.c.f(contributorsData, new cw7.j(cVar2, i43), new r1(29), new cf1.h(cVar2, 17));
            int i59 = x.f20023c[fVar2.ordinal()];
            if (i59 != 1) {
                c2 = 2;
                if (i59 == 2) {
                    i5 = R$string.wealth_analytics_widgetised_profit_and_loss_by_transaction;
                } else {
                    if (i59 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = R$string.wealth_analytics_widgetised_profit_and_loss_by_positions;
                }
            } else {
                c2 = 2;
                i5 = R$string.wealth_analytics_widgetised_profit_and_loss_by_asset;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i5, null, null, 14);
            z3 = z;
            data2 = chartData;
            cVar = selectedTimeframe;
            r3 = 0;
            str = "selectedTimeframe";
            data = data3;
            fVar = selectedPnlType;
            i = 14;
            eVarB.addAll(yp0.b.g(list3, new ListSubheaderDelegate.Model("CONTRIBUTORS_TITLE_ID", (Image) null, (Clause) textLocalisedClause, (Image) (z11 ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null), (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z11, z11, false, 4), false, false, (Object) fVar2, (Parcelable) null, 0, 0, 0, 0, 64434), null, 0, 0, 126));
        }
        eVarB.addAll(this.e.f(domainState.f19990a, domainState.e, domainState.f19994h, domainState.u));
        aim.e eVarA = zhm.u.a(eVarB);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_analytics_widgetised_profit_and_loss_title, r3, r3, i);
        vyg.d dVar2 = domainState.f;
        fzg.e eVar2 = domainState.f19995j;
        Pair pair = domainState.k;
        PnLValues pnLValues = (PnLValues) data.getContent();
        if (pnLValues != null) {
            int i66 = iArr[fVar.ordinal()];
            if (i66 != 1) {
                i2 = 2;
                if (i66 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List list4 = (List) data2.getContent();
                if (list4 == null || (eVar = (fzg.e) d0.o0(list4)) == null || (value = eVar.getValue()) == null) {
                    value = pnLValues.f95097b;
                }
            } else {
                i2 = 2;
                value = pnLValues.f95096a;
            }
            if (pair != null) {
                fzg.e eVar3 = (fzg.e) pair.f186385a;
                value = new dj0.d(((fzg.e) pair.f186386b).getValue().f115082a - eVar3.getValue().f115082a, eVar3.getValue().f115083b);
            } else if (eVar2 != null) {
                value = eVar2.getValue();
            }
            textClause = new MoneyClause(value, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12);
        } else {
            i2 = 2;
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (((PnLValues) data.getContent()) != null) {
            int i74 = iArr[fVar.ordinal()];
            if (i74 == 1) {
                i3 = R$string.wealth_analytics_profit_and_loss_header_total;
            } else {
                if (i74 != i2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R$string.wealth_analytics_profit_and_loss_header_realised;
            }
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i3, null, null, 14);
            ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28);
            Clause[] clauseArr = new Clause[i2];
            clauseArr[0] = textLocalisedClause3;
            clauseArr[1] = imageClause;
            textClause2 = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(clauseArr));
        } else {
            m70.a.c(t0.f186434a);
            textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        Clause clause = textClause2;
        if (((List) data2.getContent()) != null) {
            int i92 = iArr2[dVar2.ordinal()];
            if (i92 == 1) {
                clauseC = uyg.c.c(pair != null ? new Pair(((fzg.e) pair.f186385a).getTimestamp(), ((fzg.e) pair.f186386b).getTimestamp()) : null, eVar2 != null ? eVar2.getTimestamp() : null, cVar);
            } else {
                if (i92 != i2) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair pair2 = pair != null ? new Pair(((fzg.e) pair.f186385a).getTimestamp(), ((fzg.e) pair.f186386b).getTimestamp()) : null;
                vyg.c cVar3 = cVar;
                Intrinsics.checkNotNullParameter(cVar3, str);
                if (pair2 != null) {
                    DateTime dateTime = (DateTime) pair2.f186385a;
                    switch (uyg.b.f284337a[cVar3.ordinal()]) {
                        case 1:
                            pretty = new TimeClause.Format.Pretty(0);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        case 2:
                            pretty = new TimeClause.Format.Pretty(q0.ONLY_DATE);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        case 3:
                            pretty = new TimeClause.Format.Pretty(q0.ONLY_DATE);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        case 4:
                            pretty = new TimeClause.Format.MonthAndYear((ka) null, 3);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        case 5:
                            pretty = new TimeClause.Format.MonthAndYear((ka) null, 3);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        case 6:
                            pretty = new TimeClause.Format.Year(0);
                            clauseC = uyg.c.a(dateTime, pretty);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } else {
                    m70.a.c(t0.f186434a);
                    clauseC = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            }
            textClause3 = clauseC;
        } else {
            m70.a.c(t0.f186434a);
            textClause3 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (z3) {
            str2 = null;
            listK = zhm.v.k(new FixedTabs.IconItem(null, new ResourceImage(R$drawable.uikit_icn_24_line_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wealth_analytics_total_value_settings_line_chart, null, null, 14), 126), "LINE_CHART_TAB_ID"), new FixedTabs.IconItem(null, new ResourceImage(R$drawable.uikit_icn_24_bar_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.wealth_analytics_total_value_settings_bar_chart, null, null, 14), 126), "BAR_CHART_TAB_ID"));
        } else {
            str2 = null;
            listK = null;
        }
        if (z3) {
            int i96 = iArr2[dVar2.ordinal()];
            z4 = true;
            if (i96 == 1) {
                str4 = "LINE_CHART_TAB_ID";
            } else {
                if (i96 != i2) {
                    throw new NoWhenBranchMatchedException();
                }
                str4 = "BAR_CHART_TAB_ID";
            }
            str3 = str4;
        } else {
            z4 = true;
            str3 = str2;
        }
        return new n(eVarA, new l(textLocalisedClause2, textClause, clause, textClause3, listK, str3, (data.getContent() == null && data.getLoading()) ? z4 : false));
    }
}
