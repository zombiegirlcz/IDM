package snd;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardContract$ContextMenuAction;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.AnalyticsDashboardController;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticsDashboardController f264520w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(AnalyticsDashboardController analyticsDashboardController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f264520w = analyticsDashboardController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f264520w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f264520w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f264520w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            default:
                a0 a0Var4 = new a0(this.f264520w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((AnalyticsAccountsSelection) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar;
        xnd.c0 data;
        int i = this.u;
        AnalyticsDashboardController analyticsDashboardController = this.f264520w;
        Continuation continuation = null;
        switch (i) {
            case 0:
                c cVar = (c) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (analyticsDashboardController.V != null) {
                    f fVarD = analyticsDashboardController.d();
                    AnalyticsSpendingPeriod$Interval interval = cVar.f264523a;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) fVarD;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(interval, "interval");
                    und.e eVar = bVar.o;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(interval, "interval");
                    xnd.j jVar = eVar.f281426h;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(interval, "interval");
                    j2 j2Var = jVar.d;
                    xnd.h hVar = (xnd.h) ((od0.i) j2Var.getValue()).f224257a;
                    if (hVar != null) {
                        xnd.h hVarA = xnd.h.a(hVar, lzi.j.a(hVar.f307401b, interval, null, 5));
                        od0.i.Companion.getClass();
                        j2Var.g(null, od0.h.a(hVarA));
                    }
                    int i2 = cVar.f264524b;
                    ipd.c cVar2 = analyticsDashboardController.K;
                    AnalyticsContext analyticsContextA = cVar2.a(Integer.valueOf(i2), cVar2.f167732b);
                    if (analyticsContextA != null) {
                        cVar2.f167734g = analyticsContextA;
                        cVar2.f167731a++;
                    }
                }
                analyticsDashboardController.V = cVar.f264523a;
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = aVar3.d;
                String url2 = obj3 instanceof String ? (String) obj3 : null;
                if (url2 != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) analyticsDashboardController.d();
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    bVar2.n2(new sbb.w(bVar2, url2, continuation, 17), new whi.b(6));
                }
                break;
            case 2:
                AnalyticsAccountsSelection selection = (AnalyticsAccountsSelection) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.checkNotNullParameter(selection, "selection");
                ipd.c cVar3 = analyticsDashboardController.K;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(selection, "selection");
                if (!Intrinsics.f(cVar3.d, selection)) {
                    cVar3.d = selection;
                    cVar3.e = ipd.i.a(selection);
                    cVar3.f = ipd.i.b(selection);
                    cVar3.f167731a = 0;
                    cVar3.f167733c = null;
                    cVar3.f167734g = cVar3.b();
                }
                break;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarD2 = analyticsDashboardController.d();
                Intrinsics.h(menuItemId);
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b bVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.dashboard.b) fVarD2;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("analytics_dashboard_add_new_menu_item") && (aVar = (a) ((b) ((j2) bVar3.z.f22677a).getValue()).f264521a.getContent()) != null && (data = aVar.f264519h) != null) {
                    boolean z = data.f307383c;
                    boolean z3 = data.f307382b;
                    boolean z4 = data.f307381a;
                    if (z4 || z3 || z) {
                        l0 l0Var = bVar3.u;
                        bVar3.v.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        aim.e eVarB = zhm.u.b();
                        if (z4) {
                            eVarB.add(new PopupMenuItem.Cell("analytics_dashboard_context_menu_link_account", new TextLocalisedClause(R$string.analytics_dashboard_context_menu_link_external_account_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, null, AnalyticsDashboardContract$ContextMenuAction.LinkExternalAccount.f87521a, null, 760));
                        }
                        if (z3) {
                            eVarB.add(new PopupMenuItem.Cell("analytics_dashboard_context_menu_add_asset", new TextLocalisedClause(R$string.analytics_dashboard_context_menu_add_asset_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_business_basic, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, null, AnalyticsDashboardContract$ContextMenuAction.AddAsset.f87519a, null, 760));
                        }
                        if (z) {
                            eVarB.add(new PopupMenuItem.Cell("analytics_dashboard_context_menu_add_trip", new TextLocalisedClause(R$string.analytics_dashboard_context_menu_add_trip_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_globe, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, null, AnalyticsDashboardContract$ContextMenuAction.AddTrip.f87520a, null, 760));
                        }
                        l0Var.e(menuItemId, zi0.c.d(zhm.u.a(eVarB)), mw0.o.VIEW_BOUNDS, mw0.m.f209296a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
