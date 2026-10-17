package uh7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.GridWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d2;
import com.revolut.core.ui_kit.delegates.widgets.g3;
import com.revolut.core.ui_kit.delegates.widgets.i3;
import com.revolut.core.ui_kit.delegates.widgets.j3;
import com.revolut.core.ui_kit.delegates.widgets.l3;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.instruments.trend.collections.api.feedwidget.InstrumentsTrendCollectionsFeedWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import efm.d0;
import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zc0.b0;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements csh.f {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f280120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b7h.a f280121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh7.d f280122c;
    public final a0 d;
    public final a38.a e;
    public final zh7.c f;

    public l(ln.a navigationCommandsDispatcher, b7h.a tabbedWidgetInteractor, nh7.d widget, a0 widgetsUiInteractor, a38.a swipeActionEventHandler, zh7.c onboardingNavigationProvider) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(tabbedWidgetInteractor, "tabbedWidgetInteractor");
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        Intrinsics.checkNotNullParameter(swipeActionEventHandler, "swipeActionEventHandler");
        Intrinsics.checkNotNullParameter(onboardingNavigationProvider, "onboardingNavigationProvider");
        this.f280120a = navigationCommandsDispatcher;
        this.f280121b = tabbedWidgetInteractor;
        this.f280122c = widget;
        this.d = widgetsUiInteractor;
        this.e = swipeActionEventHandler;
        this.f = onboardingNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.b b() {
        /*
            r10 = this;
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r1 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination r3 = new com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination
            nh7.d r2 = r10.f280122c
            com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId r4 = r2.a()
            nh7.c r5 = r2.c()
            boolean r6 = r5 instanceof nh7.a
            r7 = 0
            if (r6 == 0) goto L1a
            nh7.a r5 = (nh7.a) r5
            ph7.c r2 = r5.f215377a
            goto L65
        L1a:
            boolean r5 = r5 instanceof nh7.b
            if (r5 == 0) goto L7b
            java.lang.String r5 = "widget"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            b7h.a r5 = r10.f280121b
            ne0.j r5 = r5.f13040a
            java.lang.String r6 = r2.name()
            java.lang.Object r5 = r5.get(r6)
            te0.r r5 = (te0.r) r5
            if (r5 == 0) goto L61
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            kotlin.enums.EnumEntries r6 = ph7.c.a()
            java.util.Iterator r6 = r6.iterator()
        L41:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L59
            java.lang.Object r8 = r6.next()
            r9 = r8
            ph7.c r9 = (ph7.c) r9
            java.lang.String r9 = r9.b()
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r5)
            if (r9 == 0) goto L41
            goto L5a
        L59:
            r8 = r7
        L5a:
            ph7.c r8 = (ph7.c) r8
            if (r8 != 0) goto L5f
            goto L61
        L5f:
            r2 = r8
            goto L65
        L61:
            ph7.c r2 = b7h.a.a(r2)
        L65:
            r3.<init>(r4, r7, r2)
            r6 = 0
            r7 = 61
            r2 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            ln.a r1 = r10.f280120a
            pfm.h r0 = r1.a(r0)
            return r0
        L7b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uh7.l.b():efm.b");
    }

    @Override // csh.f
    public final Class j() {
        return InstrumentsTrendCollectionsFeedWidgetContext.class;
    }

    @Override // csh.f
    public final efm.b w(WidgetContext widgetContext, BaseDraggableWidgetDelegate.a event) {
        InstrumentsTrendCollectionsFeedWidgetContext widgetContext2 = (InstrumentsTrendCollectionsFeedWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d2) {
            pfm.h hVar = new pfm.h(new rzc.b(this, ((d2) event).f55327c, 26), 2);
            Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
            return hVar;
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.e;
        pfm.m mVar = pfm.m.f235744a;
        if (z) {
            Object obj2 = ((com.revolut.core.ui_kit.delegates.widgets.e) event).f55333c.f53167l;
            qi7.h hVar2 = obj2 instanceof qi7.h ? (qi7.h) obj2 : null;
            if (hVar2 != null) {
                return pd.b.n(p0.f264003c, new uf0.d(this, hVar2, null, 2));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof i3) {
            Object obj3 = ((i3) event).f55382c.u;
            oh7.b bVar = obj3 instanceof oh7.b ? (oh7.b) obj3 : null;
            qi7.h hVar3 = bVar != null ? bVar.f225321b : null;
            if (hVar3 != null) {
                return pd.b.n(p0.f264003c, new uf0.d(this, hVar3, null, 2));
            }
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        if (event instanceof q0) {
            pfm.h hVar4 = new pfm.h(new r2d.e(this, 13, ((q0) event).f55476b, widgetContext2), 2);
            Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
            return hVar4;
        }
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.i) {
            BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) event).f55375c;
            if (model instanceof GridWidgetDelegate.Model) {
                return b();
            }
            if (!(model instanceof RowsWidgetDelegate.Model)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            if (((RowsWidgetDelegate.Model) model).o == null) {
                return b();
            }
        } else {
            if (event instanceof g3) {
                return b();
            }
            if (event instanceof j3) {
                return this.e.w(widgetContext2, event);
            }
            if (!(event instanceof l3)) {
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            }
            if (this.f280122c == nh7.d.RECOMMENDED_BUYS) {
                zh7.c cVar = this.f;
                d0 d0VarFirstOrError = m70.a.g(zi0.c.J(rd0.e.c(ybl.k.k(cVar.f322244a, null, null, cfl.m.f23746a, 3), kotlin.coroutines.g.f186406a)), null, new z8d.h(21), 1).firstOrError();
                b0 b0Var = new b0(new za9.c(cVar, 29), 29);
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, b0Var, 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return new pfm.a(iVar, new ubj.c(25, new ud3.n(this, 21)), 4);
            }
        }
        return mVar;
    }
}
