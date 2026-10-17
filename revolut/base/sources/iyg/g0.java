package iyg;

import android.os.Parcelable;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import ip0.gu;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.a7;
import mx0.oc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements cli.n {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myg.l f169735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myg.j f169736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final myg.c f169737c;
    public final myg.k d;
    public final pyg.i e;
    public final uyg.l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fxg.c f169738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f169739h;

    public g0(uyg.e timeframeMapper, myg.l totalValueMapper, myg.j widgetisedAnalyticsPerformanceMapper, myg.c widgetisedAnalyticsAllocationsWidgetMapper, myg.k pnLMapper, pyg.i analyticsDisclaimersMapper, uyg.l analyticsTypeMapper, fxg.c portfolioInsightsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(timeframeMapper, "timeframeMapper");
        Intrinsics.checkNotNullParameter(totalValueMapper, "totalValueMapper");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsPerformanceMapper, "widgetisedAnalyticsPerformanceMapper");
        Intrinsics.checkNotNullParameter(widgetisedAnalyticsAllocationsWidgetMapper, "widgetisedAnalyticsAllocationsWidgetMapper");
        Intrinsics.checkNotNullParameter(pnLMapper, "pnLMapper");
        Intrinsics.checkNotNullParameter(analyticsDisclaimersMapper, "analyticsDisclaimersMapper");
        Intrinsics.checkNotNullParameter(analyticsTypeMapper, "analyticsTypeMapper");
        Intrinsics.checkNotNullParameter(portfolioInsightsMapper, "portfolioInsightsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f169735a = totalValueMapper;
        this.f169736b = widgetisedAnalyticsPerformanceMapper;
        this.f169737c = widgetisedAnalyticsAllocationsWidgetMapper;
        this.d = pnLMapper;
        this.e = analyticsDisclaimersMapper;
        this.f = analyticsTypeMapper;
        this.f169738g = portfolioInsightsMapper;
        this.f169739h = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        koi.j jVar2;
        List listL;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        WidgetisedAnalyticsType widgetisedAnalyticsType = domainState.f169704b;
        hel.b bVar = domainState.f;
        vyg.c timeframe = domainState.f169705c;
        gte.a aVar = this.f169739h;
        if (widgetisedAnalyticsType != null) {
            boolean z = domainState.f169703a.size() > 1;
            Clause clauseA = this.f.a(widgetisedAnalyticsType, bVar);
            ResourceImage resourceImage = z ? new ResourceImage(R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null;
            TextLocalisedClause textLocalisedClauseA = uyg.e.a(timeframe);
            eVarB.add(((jte.d) aVar).c(WealthAnalyticsApi$Toggles.AnalyticsDashboardContextualHeader.f94961c) ? new ip0.j(new ip0.i(clauseA, resourceImage, 2), new ip0.i(textLocalisedClauseA, (ResourceImage) null, 6)) : new ListSubheaderDelegate.Model("ACCOUNT_DROPDOWN_ID", (Image) null, clauseA, (Image) resourceImage, (Clause) textLocalisedClauseA, (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, true), false, true, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp12, 0, 0, 56738));
        } else {
            eVarB.add(new gu("ACCOUNT_DROPDOWN_ID", 0, R$attr.uikit_dp12, 26));
        }
        Data data = domainState.f169706g;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        myg.l lVar = this.f169735a;
        int i = 10;
        eVarB.add((BaseDraggableWidgetDelegate.Model) iii.c.f(data, new oc(lVar, i), new mv5.h(19), new mig.a(lVar, timeframe)));
        Data chartData = domainState.f169707h;
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        myg.j jVar3 = this.f169736b;
        int i2 = 9;
        int i3 = 17;
        eVarB.add((BaseDraggableWidgetDelegate.Model) iii.c.f(chartData, new oc(jVar3, i2), new mv5.h(i3), new mig.a(jVar3, 8)));
        Data pnlData = domainState.i;
        Data totalPnlChartData = domainState.f169708j;
        Intrinsics.checkNotNullParameter(pnlData, "pnlData");
        Intrinsics.checkNotNullParameter(totalPnlChartData, "totalPnlChartData");
        Data dataT = t1.t(pnlData, totalPnlChartData);
        myg.k kVar = this.d;
        koi.j jVar4 = (koi.j) iii.c.f(dataT, new a7(kVar, i3), new mv5.h(18), new mgh.i(kVar, i));
        if (widgetisedAnalyticsType == null || domainState.d) {
            Data data2 = domainState.k;
            Intrinsics.checkNotNullParameter(data2, "data");
            myg.c cVar = this.f169737c;
            jVar2 = (koi.j) iii.c.f(data2, new a7(cVar, 16), new mnl.g(cVar, 28), new mgh.i(cVar, i2));
        } else {
            jVar2 = null;
        }
        if (((jte.d) aVar).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            koi.j[] elements = {jVar2, jVar4};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else {
            koi.j[] elements2 = {jVar4, jVar2};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        }
        eVarB.addAll(listL);
        Data data3 = domainState.f169709l;
        List list = data3 != null ? (List) iii.c.f(data3, new fwf.n(i), new fv0.c(12), new fnk.o(this.f169738g, i2)) : null;
        if (list == null) {
            list = zhm.f0.f322471a;
        }
        eVarB.addAll(list);
        if (widgetisedAnalyticsType != null) {
            eVarB.addAll(this.e.f(widgetisedAnalyticsType, bVar, domainState.e, domainState.f169711n));
        }
        return new j(zhm.u.a(eVarB));
    }
}
