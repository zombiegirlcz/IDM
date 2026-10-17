package snd;

import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements cli.n {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mzi.b f264538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wnd.h f264539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f264540c;
    public final yod.m d;
    public final xod.c0 e;
    public final wnd.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f264541g;

    public i0(mzi.b intervalMapper, wnd.h toolsMapper, ImmutableMap widgetMappers, yod.m totalWealthWidgetMapper, xod.c0 widgetLoadingMapper, xod.t budgetWidgetMapper, xod.z tripsWidgetMapper, wnd.a titleMapper, rrd.g customAssetsDisclaimerProvider, wnd.e contextMenuMapper, wnd.d accountSelectorPopupMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(intervalMapper, "intervalMapper");
        Intrinsics.checkNotNullParameter(toolsMapper, "toolsMapper");
        Intrinsics.checkNotNullParameter(widgetMappers, "widgetMappers");
        Intrinsics.checkNotNullParameter(totalWealthWidgetMapper, "totalWealthWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetLoadingMapper, "widgetLoadingMapper");
        Intrinsics.checkNotNullParameter(budgetWidgetMapper, "budgetWidgetMapper");
        Intrinsics.checkNotNullParameter(tripsWidgetMapper, "tripsWidgetMapper");
        Intrinsics.checkNotNullParameter(titleMapper, "titleMapper");
        Intrinsics.checkNotNullParameter(customAssetsDisclaimerProvider, "customAssetsDisclaimerProvider");
        Intrinsics.checkNotNullParameter(contextMenuMapper, "contextMenuMapper");
        Intrinsics.checkNotNullParameter(accountSelectorPopupMapper, "accountSelectorPopupMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f264538a = intervalMapper;
        this.f264539b = toolsMapper;
        this.f264540c = widgetMappers;
        this.d = totalWealthWidgetMapper;
        this.e = widgetLoadingMapper;
        this.f = accountSelectorPopupMapper;
        this.f264541g = ((jte.d) featureToggleInteractor).c(AnalyticsFeatureApi$Toggles.AnalyticsRevamp.f87388c);
    }

    public final qv0.i a(qv0.i iVar) {
        if ((iVar instanceof AirTipDelegate.Model) || !this.f264541g) {
            return iVar;
        }
        qv0.i iVar2 = iVar;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp0;
        yp0.b.p(iVar2, i, i, i2, i2);
        return iVar2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        xnd.c0 data;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f264521a, new f0(this, 0), new sl5.g(9), new si5.c(this, domainState, 1));
        a aVar = (a) domainState.f264521a.getContent();
        if (aVar == null || (data = aVar.f264519h) == null) {
            listC = null;
        } else {
            Intrinsics.checkNotNullParameter(data, "data");
            listC = (data.f307381a || data.f307382b || data.f307383c) ? zhm.u.c(new IconNavBarMenuItem("analytics_dashboard_add_new_menu_item", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.analytics_dashboard_context_menu_add_new_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : zhm.f0.f322471a;
        }
        List list2 = listC;
        if (list2 == null) {
            list2 = zhm.f0.f322471a;
        }
        return new q(list, list2);
    }
}
