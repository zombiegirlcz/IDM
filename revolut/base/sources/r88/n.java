package r88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.p2;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.core.ui_kit.delegates.widgets.q2;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorCardProfileNavigationDestination;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ExternalDestination;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements csh.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc7.a f252398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f252399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c70.a f252400c;

    public n(uc7.a homeFeedWidgetsEventDispatcher, a0 widgetsUiInteractor, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(homeFeedWidgetsEventDispatcher, "homeFeedWidgetsEventDispatcher");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f252398a = homeFeedWidgetsEventDispatcher;
        this.f252399b = widgetsUiInteractor;
        this.f252400c = clipboard;
    }

    @Override // csh.f
    public final Class j() {
        return HomeFeedWidgetContext.Junior.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        HomeFeedWidgetContext.Junior widgetContext2 = (HomeFeedWidgetContext.Junior) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.i;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            PaymentLinkWidgetDelegate.Model model2 = model instanceof PaymentLinkWidgetDelegate.Model ? (PaymentLinkWidgetDelegate.Model) model : null;
            if (model2 == null) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            Object obj2 = model2.f55203g;
            if (!(obj2 instanceof g)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            final g gVar = (g) obj2;
            final int i = 1;
            pfm.h hVar = new pfm.h(new kfm.a(this) { // from class: r88.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f252393b;

                {
                    this.f252393b = this;
                }

                @Override // kfm.a
                public final void run() {
                    switch (i) {
                        case 0:
                            n nVar = this.f252393b;
                            nVar.f252400c.c(null, gVar.d, false, new r1a.a(nVar, 4));
                            break;
                        default:
                            this.f252393b.f252398a.a(new JuniorCardProfileNavigationDestination(gVar.f252382a));
                            break;
                    }
                }
            }, 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        if (event instanceof q2) {
            Object obj3 = ((q2) event).f55481c.f55203g;
            if (!(obj3 instanceof i)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            final i iVar = (i) obj3;
            final int i2 = 1;
            pfm.h hVar2 = new pfm.h(new kfm.a(this) { // from class: r88.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f252396b;

                {
                    this.f252396b = this;
                }

                @Override // kfm.a
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f252396b.f252398a.a(new ExternalDestination.Browser(iVar.f252388c, null));
                            break;
                        default:
                            this.f252396b.f252398a.a(new JuniorCardProfileNavigationDestination(iVar.f252386a));
                            break;
                    }
                }
            }, 2);
            Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
            return hVar2;
        }
        if (!(event instanceof p2)) {
            if (!(event instanceof q0)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            pfm.h hVar3 = new pfm.h(new r2d.e(this, 1, (q0) event, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
            return hVar3;
        }
        Object obj4 = ((p2) event).f55467c.f55203g;
        if (obj4 instanceof g) {
            final g gVar2 = (g) obj4;
            final int i3 = 0;
            pfm.h hVar4 = new pfm.h(new kfm.a(this) { // from class: r88.l

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f252393b;

                {
                    this.f252393b = this;
                }

                @Override // kfm.a
                public final void run() {
                    switch (i3) {
                        case 0:
                            n nVar = this.f252393b;
                            nVar.f252400c.c(null, gVar2.d, false, new r1a.a(nVar, 4));
                            break;
                        default:
                            this.f252393b.f252398a.a(new JuniorCardProfileNavigationDestination(gVar2.f252382a));
                            break;
                    }
                }
            }, 2);
            Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
            return hVar4;
        }
        if (!(obj4 instanceof i)) {
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        final i iVar2 = (i) obj4;
        final int i5 = 0;
        pfm.h hVar5 = new pfm.h(new kfm.a(this) { // from class: r88.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f252396b;

            {
                this.f252396b = this;
            }

            @Override // kfm.a
            public final void run() {
                switch (i5) {
                    case 0:
                        this.f252396b.f252398a.a(new ExternalDestination.Browser(iVar2.f252388c, null));
                        break;
                    default:
                        this.f252396b.f252398a.a(new JuniorCardProfileNavigationDestination(iVar2.f252386a));
                        break;
                }
            }
        }, 2);
        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
        return hVar5;
    }
}
