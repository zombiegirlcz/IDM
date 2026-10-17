package coj;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.i;
import com.revolut.core.ui_kit.delegates.widgets.n0;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.r0;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetClickData;
import com.revolut.retail.feature.esim.api.widgets.EsimWidgetContext;
import ish.a0;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import pfm.m;
import qv0.p;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f25565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fej.b f25566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f25567c;
    public final ash.d d;

    public g(a0 widgetsUiInteractor, fej.b esimHomeFlowCommandProvider, ln.a navigationCommandsDispatcher, ash.d widgetsCommonEventDispatcher) {
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(esimHomeFlowCommandProvider, "esimHomeFlowCommandProvider");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(widgetsCommonEventDispatcher, "widgetsCommonEventDispatcher");
        this.f25565a = widgetsUiInteractor;
        this.f25566b = esimHomeFlowCommandProvider;
        this.f25567c = navigationCommandsDispatcher;
        this.d = widgetsCommonEventDispatcher;
    }

    public final efm.b b(Object obj2, boolean z) {
        EsimWidgetClickData esimWidgetClickData = obj2 instanceof EsimWidgetClickData ? (EsimWidgetClickData) obj2 : null;
        m mVar = m.f235744a;
        if (esimWidgetClickData == null) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (esimWidgetClickData instanceof EsimWidgetClickData.PurchaseDataPlan) {
            EsimWidgetClickData.PurchaseDataPlan purchaseDataPlan = (EsimWidgetClickData.PurchaseDataPlan) esimWidgetClickData;
            h hVar = new h(new d(this, purchaseDataPlan.f100558a, purchaseDataPlan.f100559b, z), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (esimWidgetClickData instanceof EsimWidgetClickData.SubscriptionDetails) {
            EsimWidgetClickData.SubscriptionDetails subscriptionDetails = (EsimWidgetClickData.SubscriptionDetails) esimWidgetClickData;
            h hVar2 = new h(new d(this, subscriptionDetails.f100565b, subscriptionDetails.f100564a, z), 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (!(esimWidgetClickData instanceof EsimWidgetClickData.EsimHome)) {
            return mVar;
        }
        pfm.a aVar = new pfm.a(w.o0(p0.f264003c, new f(this, null, 1)), new cmc.d(new c(this, 1), 7), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    @Override // csh.f
    public final Class j() {
        return EsimWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        EsimWidgetContext widgetContext2 = (EsimWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof i;
        m mVar = m.f235744a;
        if (z) {
            i iVar = (i) event;
            j jVar = iVar.f55375c;
            if (!(jVar instanceof HorizontalScrollerWidgetDelegate.Model)) {
                p pVar = jVar instanceof p ? (p) jVar : null;
                return b(pVar != null ? pVar.getF() : null, true);
            }
            if (kotlin.text.a0.H(iVar.f55374b, "EsimHomeMedium", false)) {
                return new pfm.a(w.o0(p0.f264003c, new f(this, null, 0)), new cmc.d(new c(this, 0), 6), 4);
            }
        } else {
            if (event instanceof n0) {
                ReferralContactDelegate.Model model = ((n0) event).f55437c;
                if (model == null) {
                    model = null;
                }
                return b(model != null ? model.getF() : null, false);
            }
            if (event instanceof r0) {
                return b(((r0) event).b(), false);
            }
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            ErrorWidgetDelegate.Model model2 = ((q0) event).f55477c;
            if (model2 == null) {
                model2 = null;
            }
            if (model2 == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj2 = model2.f55103h;
            Object obj3 = obj2 instanceof EsimWidgetClickData ? (EsimWidgetClickData) obj2 : null;
            if (obj3 == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            if (obj3 instanceof EsimWidgetClickData.Reload) {
                h hVar = new h(new a09.a0(this, 4, ((EsimWidgetClickData.Reload) obj3).f100561a, widgetContext2), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            }
        }
        return mVar;
    }
}
