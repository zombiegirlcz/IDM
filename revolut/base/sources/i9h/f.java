package i9h;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.wealth.resources.R$string;
import i9g.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f159854b;

    public /* synthetic */ f(o oVar, int i) {
        this.f159853a = i;
        this.f159854b = oVar;
    }

    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        efm.b bVarZ0;
        String str2;
        switch (this.f159853a) {
            case 0:
                u selected = (u) obj2;
                Intrinsics.checkNotNullParameter(selected, "selected");
                d dVar = this.f159854b.f159864j;
                List sections = o.f159862s;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(sections, "sections");
                Intrinsics.checkNotNullParameter(selected, "selected");
                List<u> list = sections;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (u uVar : list) {
                    Intrinsics.checkNotNullParameter(uVar, "<this>");
                    int i = e.f159851a[uVar.ordinal()];
                    if (i == 1) {
                        str = "mostTraded_assets.section.most_traded";
                    } else if (i == 2) {
                        str = "mostTraded_assets.section.most_bought";
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "mostTraded_assets.section.most_sold";
                    }
                    arrayList.add(new SingleChoiceDelegate.Model(str, TextLocalisedClause.c(n14.e.C(uVar), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 27), uVar == selected, null, uVar, YearClass.CLASS_2008));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return d.c(new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_moverType_title, null, null, 14), arrayList);
            case 1:
                o oVar = this.f159854b;
                r10.q qVar = oVar.k;
                SingleChoiceDelegate.Model it8 = (SingleChoiceDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.f;
                if (obj3 instanceof v) {
                    v input = (v) obj3;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(input, "input");
                    bVarZ0 = te0.w.z0(((qah.d) ((q) qVar.f250849b)).x0(), input);
                } else if (obj3 instanceof u) {
                    u input2 = (u) obj3;
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(input2, "input");
                    bVarZ0 = te0.w.z0(((qah.d) ((q) qVar.f250849b)).w0(), input2);
                } else {
                    bVarZ0 = pfm.m.f235744a;
                }
                pfm.a aVarE = bVarZ0.e(((opi.b) oVar.f159867n).O());
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 2:
                q0h.d token = (q0h.d) obj2;
                Intrinsics.checkNotNullParameter(token, "token");
                if (!(token instanceof q0h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                qah.c cVar = this.f159854b.f159865l;
                q0h.a token2 = (q0h.a) token;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(token2, "token");
                return pd.b.n(p0.f264003c, new q03.m(cVar, token2, null, 27));
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                u section = (u) pair.f186385a;
                v timeSpan = (v) pair.f186386b;
                this.f159854b.f159864j.getClass();
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                Intrinsics.checkNotNullParameter(section, "section");
                mx0.d dVar2 = mx0.d.SEMIBLACK;
                return zhm.v.k(new ActionsView.Item("FILTER_LIST_ID", dVar2, false, null, null, n14.e.C(section), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, a.SECTION, null, 24476), new ActionsView.Item("TIMEFRAME_LIST_ID", dVar2, false, null, null, n14.e.D(timeSpan), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, a.TIME_SPAN, null, 24476));
            case 4:
                v selected2 = (v) obj2;
                Intrinsics.checkNotNullParameter(selected2, "selected");
                d dVar3 = this.f159854b.f159864j;
                List timeSpans = o.f159863t;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(timeSpans, "timeSpans");
                Intrinsics.checkNotNullParameter(selected2, "selected");
                List<v> list2 = timeSpans;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                for (v vVar : list2) {
                    Intrinsics.checkNotNullParameter(vVar, "<this>");
                    int i2 = e.f159852b[vVar.ordinal()];
                    if (i2 == 1) {
                        str2 = "most_traded_assets.timeSpan.one_day";
                    } else if (i2 == 2) {
                        str2 = "most_traded_assets.timeSpan.one_week";
                    } else if (i2 == 3) {
                        str2 = "most_traded_assets.timeSpan.one_month";
                    } else {
                        if (i2 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str2 = "most_traded_assets.timeSpan.one_year";
                    }
                    arrayList2.add(new SingleChoiceDelegate.Model(str2, TextLocalisedClause.c(n14.e.D(vVar), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 27), vVar == selected2, null, vVar, YearClass.CLASS_2008));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return d.c(new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14), arrayList2);
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                qah.c cVar2 = this.f159854b.f159865l;
                cVar2.getClass();
                return cVar2.f244036a.a(new FinishCommand(null, null, null, 7));
            default:
                a mostTradedAssetsActions = (a) obj2;
                Intrinsics.checkNotNullParameter(mostTradedAssetsActions, "mostTradedAssetsActions");
                int i3 = i.f159857a[mostTradedAssetsActions.ordinal()];
                o oVar2 = this.f159854b;
                if (i3 == 1) {
                    return ((efm.r) oVar2.f159869q.getValue()).map(new f0(10, new f(oVar2, 0)));
                }
                if (i3 == 2) {
                    return ((efm.r) oVar2.f159870r.getValue()).map(new f0(11, new f(oVar2, 4)));
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
