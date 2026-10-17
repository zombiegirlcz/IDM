package com.revolut.feature.shared.help_centre.impl.main.screen;

import android.view.View;
import android.view.ViewGroup;
import au0.k4;
import au0.s0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ColorImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.help_centre.impl.R$id;
import com.revolut.feature.shared.help_centre.impl.R$layout;
import com.revolut.feature.shared.help_centre.impl.main.screen.SharedHelpRev10Screen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m9d.a0;
import m9d.c;
import m9d.d;
import m9d.d0;
import m9d.e0;
import m9d.f;
import m9d.f0;
import m9d.g;
import m9d.g0;
import m9d.g1;
import m9d.h;
import m9d.h0;
import m9d.i;
import m9d.i0;
import m9d.j;
import m9d.j0;
import m9d.l;
import m9d.m;
import m9d.o;
import m9d.p;
import m9d.q;
import m9d.r;
import m9d.s;
import m9d.t;
import m9d.u;
import no.k;
import r7d.n;
import rd0.e;
import sji.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/main/screen/SharedHelpRev10Screen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lm9d/j0;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lm9d/a0;", "Lno/k;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedHelpRev10Screen extends BaseRecyclerViewScreen<j0, IOData$EmptyInput, a0> implements k {
    public final int U;
    public final boolean V;
    public final int W;
    public AnalyticsContext X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f86384a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ActionWidgetDelegate f86385b0;
    public final SwipeToActionDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final LabelButtonDelegate f86386d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ProgressStepVerticalV2Delegate f86387e0;
    public final SearchButtonDelegate f0;
    public final CellDetailsChevronDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final CellDetailsSingleButtonDelegate f86388h0;
    public final FullScreenStateDelegate i0;
    public final LargeActionButtonDelegate j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final PlainTextWarningDelegate f86389k0;
    public final ListSubheaderDelegate l0;
    public final CellDetailsDelegate m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ListSubheaderDelegate f86390n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final ActionsDelegate f86391o0;
    public final InputTextDelegate p0;
    public final LargeActionButtonDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public NavBarWithBigTile f86392r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public NavBarWithToolbar f86393s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ViewGroup f86394t0;
    public final ContainerDelegate u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ScrollerDelegate f86395v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f86396w0;

    public SharedHelpRev10Screen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_help_rev10;
        final int i = 1;
        this.V = true;
        this.W = R$id.helpScreen_recyclerView;
        final int i2 = 0;
        this.Y = w.y0(new Function0(this) { // from class: m9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedHelpRev10Screen f203686b;

            {
                this.f203686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                SharedHelpRev10Screen sharedHelpRev10Screen = this.f203686b;
                switch (i3) {
                    case 0:
                        qji.b bVarQ2 = sharedHelpRev10Screen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.main.screen.di.HelpScreenInjector");
                        r7d.m mVar = (r7d.m) bVarQ2;
                        return new r7d.n(mVar.f252138b, mVar.f252139c, sharedHelpRev10Screen);
                    case 1:
                        return (d0) ((r7d.n) sharedHelpRev10Screen.Y.getValue()).f252154s.get();
                    default:
                        return zhm.v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), sharedHelpRev10Screen.l0, sharedHelpRev10Screen.u0, sharedHelpRev10Screen.f86384a0, sharedHelpRev10Screen.f0, sharedHelpRev10Screen.g0, sharedHelpRev10Screen.f86388h0, sharedHelpRev10Screen.i0, new CellDetailsLoadingDelegate(), sharedHelpRev10Screen.c0, sharedHelpRev10Screen.j0, sharedHelpRev10Screen.f86389k0, sharedHelpRev10Screen.f86385b0, sharedHelpRev10Screen.f86395v0, sharedHelpRev10Screen.m0, new CellDetailsLoadingDelegate());
                }
            }
        });
        this.Z = w.y0(new Function0(this) { // from class: m9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedHelpRev10Screen f203686b;

            {
                this.f203686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                SharedHelpRev10Screen sharedHelpRev10Screen = this.f203686b;
                switch (i3) {
                    case 0:
                        qji.b bVarQ2 = sharedHelpRev10Screen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.main.screen.di.HelpScreenInjector");
                        r7d.m mVar = (r7d.m) bVarQ2;
                        return new r7d.n(mVar.f252138b, mVar.f252139c, sharedHelpRev10Screen);
                    case 1:
                        return (d0) ((r7d.n) sharedHelpRev10Screen.Y.getValue()).f252154s.get();
                    default:
                        return zhm.v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), sharedHelpRev10Screen.l0, sharedHelpRev10Screen.u0, sharedHelpRev10Screen.f86384a0, sharedHelpRev10Screen.f0, sharedHelpRev10Screen.g0, sharedHelpRev10Screen.f86388h0, sharedHelpRev10Screen.i0, new CellDetailsLoadingDelegate(), sharedHelpRev10Screen.c0, sharedHelpRev10Screen.j0, sharedHelpRev10Screen.f86389k0, sharedHelpRev10Screen.f86385b0, sharedHelpRev10Screen.f86395v0, sharedHelpRev10Screen.m0, new CellDetailsLoadingDelegate());
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f86384a0 = rowDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.f86385b0 = actionWidgetDelegate;
        this.c0 = new SwipeToActionDelegate(actionWidgetDelegate, false);
        LabelButtonDelegate labelButtonDelegate = new LabelButtonDelegate();
        this.f86386d0 = labelButtonDelegate;
        ProgressStepHorizontalV2Delegate progressStepHorizontalV2Delegate = new ProgressStepHorizontalV2Delegate();
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = new ProgressStepVerticalV2Delegate();
        this.f86387e0 = progressStepVerticalV2Delegate;
        this.f0 = new SearchButtonDelegate();
        this.g0 = new CellDetailsChevronDelegate();
        this.f86388h0 = new CellDetailsSingleButtonDelegate();
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.i0 = fullScreenStateDelegate;
        this.j0 = new LargeActionButtonDelegate();
        this.f86389k0 = new PlainTextWarningDelegate();
        this.l0 = new ListSubheaderDelegate();
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.m0 = cellDetailsDelegate;
        this.f86390n0 = new ListSubheaderDelegate();
        this.f86391o0 = new ActionsDelegate();
        this.p0 = new InputTextDelegate(null);
        this.q0 = new LargeActionButtonDelegate();
        final int i3 = 2;
        ContainerDelegate containerDelegate = new ContainerDelegate(v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), fullScreenStateDelegate, rowDelegate, labelButtonDelegate, progressStepVerticalV2Delegate, progressStepHorizontalV2Delegate, cellDetailsDelegate, new CellDetailsLoadingDelegate()), null, 6);
        this.u0 = containerDelegate;
        this.f86395v0 = new ScrollerDelegate(v.k(actionWidgetDelegate, containerDelegate, rowDelegate), false);
        this.f86396w0 = w.y0(new Function0(this) { // from class: m9d.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedHelpRev10Screen f203686b;

            {
                this.f203686b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                SharedHelpRev10Screen sharedHelpRev10Screen = this.f203686b;
                switch (i32) {
                    case 0:
                        qji.b bVarQ2 = sharedHelpRev10Screen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.main.screen.di.HelpScreenInjector");
                        r7d.m mVar = (r7d.m) bVarQ2;
                        return new r7d.n(mVar.f252138b, mVar.f252139c, sharedHelpRev10Screen);
                    case 1:
                        return (d0) ((r7d.n) sharedHelpRev10Screen.Y.getValue()).f252154s.get();
                    default:
                        return zhm.v.k(new RowLoadingDelegate(), new ProgressStepHorizontalLoadingV2Delegate(), new ProgressStepVerticalLoadingV2Delegate(), sharedHelpRev10Screen.l0, sharedHelpRev10Screen.u0, sharedHelpRev10Screen.f86384a0, sharedHelpRev10Screen.f0, sharedHelpRev10Screen.g0, sharedHelpRev10Screen.f86388h0, sharedHelpRev10Screen.i0, new CellDetailsLoadingDelegate(), sharedHelpRev10Screen.c0, sharedHelpRev10Screen.j0, sharedHelpRev10Screen.f86389k0, sharedHelpRev10Screen.f86385b0, sharedHelpRev10Screen.f86395v0, sharedHelpRev10Screen.m0, new CellDetailsLoadingDelegate());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        g1 g1Var = (g1) T2();
        InternalDestination internalDestination = g1Var.C.f86373b;
        if (internalDestination != null) {
            g1Var.C1(internalDestination);
        }
        return internalDestination != null || super.F2();
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.X = analyticsContext;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getX() {
        return this.X;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (n) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithBigTile navBarWithBigTile = this.f86392r0;
        Continuation continuation = null;
        if (navBarWithBigTile == null) {
            Intrinsics.r("navBarWithTile");
            throw null;
        }
        a.g2(this, e.b(navBarWithBigTile.f59357t), null, new l(this, null, 0), 3);
        NavBarWithBigTile navBarWithBigTile2 = this.f86392r0;
        if (navBarWithBigTile2 == null) {
            Intrinsics.r("navBarWithTile");
            throw null;
        }
        a.g2(this, e.b(navBarWithBigTile2.f59360y.f57265b0.f59002m), null, new l(this, null, 1), 3);
        NavBarWithToolbar navBarWithToolbar = this.f86393s0;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbar");
            throw null;
        }
        a.g2(this, e.b(navBarWithToolbar.f59410q), null, new l(this, null, 2), 3);
        NavBarWithToolbar navBarWithToolbar2 = this.f86393s0;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbar");
            throw null;
        }
        a.g2(this, e.b(navBarWithToolbar2.o.f57403b), null, new i(this, continuation, 5), 3);
        NavBarWithToolbar navBarWithToolbar3 = this.f86393s0;
        if (navBarWithToolbar3 == null) {
            Intrinsics.r("navBarWithToolbar");
            throw null;
        }
        a.g2(this, e.b(navBarWithToolbar3.v0()), null, new l(this, null, 3), 3);
        a.g2(this, e.b(this.c0.f), null, new p(this, null), 3);
        PlainTextWarningDelegate plainTextWarningDelegate = this.f86389k0;
        a.g2(this, e.b(plainTextWarningDelegate.d.f121375b), null, new i(this, continuation, 6), 3);
        a.g2(this, e.b(this.j0.d.f121375b), null, new q(this, null), 3);
        RowDelegate rowDelegate = this.f86384a0;
        a.g2(this, e.b(rowDelegate.f53218h), null, new r(this, null), 3);
        a.g2(this, e.b(rowDelegate.f53220l), null, new c(this, null), 3);
        a.g2(this, e.b(rowDelegate.k), null, new d(this, null), 3);
        a.g2(this, e.b(this.f86388h0.f.f121375b), null, new m9d.e(this, null), 3);
        a.g2(this, e.b(this.f0.f53283c.f121375b), null, new f(this, null), 3);
        a.g2(this, e.b(this.g0.f51821c), null, new g(this, null), 3);
        a.g2(this, e.b(this.i0.f52371h.f121375b), null, new h(this, null), 3);
        a.g2(this, e.b(plainTextWarningDelegate.s()), null, new i(this, continuation, 0), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.l0;
        a.g2(this, e.b(listSubheaderDelegate.f52707c), null, new j(this, null), 3);
        a.g2(this, e.b(listSubheaderDelegate.f), null, new m9d.k(this, null), 3);
        a.g2(this, e.b(this.f86385b0.f51589c.f121375b), null, new i(this, continuation, 1), 3);
        a.g2(this, e.b(this.f86395v0.q()), null, new i(this, continuation, 2), 3);
        ProgressStepVerticalV2Delegate progressStepVerticalV2Delegate = this.f86387e0;
        a.g2(this, e.b(progressStepVerticalV2Delegate.f.f121375b), null, new m(this, null), 3);
        a.g2(this, e.b(progressStepVerticalV2Delegate.e), null, new i(this, continuation, 3), 3);
        a.g2(this, e.b(this.f86386d0.d.f121375b), null, new m9d.n(this, null), 3);
        a.g2(this, e.b(this.u0.f52124g), null, new i(this, continuation, 4), 3);
        a.g2(this, e.b(progressStepVerticalV2Delegate.f53006g.f121375b), null, new o(this, null), 3);
        ep6.n nVar = (ep6.n) ((n) this.Y.getValue()).k.get();
        a.g2(this, e.b(rowDelegate.i), null, new s(nVar, null), 3);
        a.g2(this, e.b(rowDelegate.f53219j), null, new t(nVar, null), 3);
        a.g2(this, e.b(this.f86391o0.f51611c.f121375b), null, new m75.i(nVar, continuation, 5), 3);
        a.g2(this, e.b(this.q0.d.f121375b), null, new u(nVar, null), 3);
        a.g2(this, e.b(this.p0.e.f121375b), null, new m9d.v(nVar, null), 3);
    }

    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        View viewFindViewById = view.findViewById(R$id.helpScreen_navBarWithTile);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f86392r0 = (NavBarWithBigTile) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R$id.helpScreen_navBarWithToolbar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f86393s0 = (NavBarWithToolbar) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.helpScreen_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3;
        this.f86394t0 = viewGroup;
        if (viewGroup == null) {
            Intrinsics.r("root");
            throw null;
        }
        NavBarWithBigTile navBarWithBigTile = this.f86392r0;
        if (navBarWithBigTile == null) {
            Intrinsics.r("navBarWithTile");
            throw null;
        }
        viewGroup.removeView(navBarWithBigTile);
        ViewGroup viewGroup2 = this.f86394t0;
        if (viewGroup2 == null) {
            Intrinsics.r("root");
            throw null;
        }
        NavBarWithToolbar navBarWithToolbar = this.f86393s0;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbar");
            throw null;
        }
        viewGroup2.removeView(navBarWithToolbar);
        NavBarWithBigTile navBarWithBigTile2 = this.f86392r0;
        if (navBarWithBigTile2 == null) {
            Intrinsics.r("navBarWithTile");
            throw null;
        }
        navBarWithBigTile2.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile2.K = false;
        navBarWithBigTile2.setLayoutType(s0.CENTERED_HORIZONTALLY);
        NavBarWithToolbar navBarWithToolbar2 = this.f86393s0;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbar");
            throw null;
        }
        navBarWithToolbar2.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar2.setHeaderTitleMode(tx0.j0.MULTILINE);
        navBarWithToolbar2.f59417v0 = false;
        navBarWithToolbar2.setTitleAutoSize(true);
        ((j60.a) ((n) this.Y.getValue()).f.get()).d(v.k(this.f86391o0, this.f86390n0, this.p0, this.q0, new ActionsLoadingDelegate(), new LargeActionButtonLoadingDelegate()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f86396w0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getV() {
        return this.V;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j0 uiState, jki.o oVar) {
        k4 k4Var;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        i0 i0Var = oVar instanceof i0 ? (i0) oVar : null;
        if (i0Var == null) {
            i0Var = new i0(true, true, true, true);
        }
        AnalyticsContext analyticsContext = uiState.f203716a;
        Clause clause = uiState.d;
        List<? extends NavBarMenuItem> list = uiState.f;
        h0 h0Var = uiState.f203717b;
        this.X = analyticsContext;
        boolean z = h0Var instanceof g0;
        if (z) {
            NavBarWithToolbar navBarWithToolbar = this.f86393s0;
            if (navBarWithToolbar == null) {
                Intrinsics.r("navBarWithToolbar");
                throw null;
            }
            if (navBarWithToolbar.getParent() == null) {
                ViewGroup viewGroup = this.f86394t0;
                if (viewGroup == null) {
                    Intrinsics.r("root");
                    throw null;
                }
                NavBarWithBigTile navBarWithBigTile = this.f86392r0;
                if (navBarWithBigTile == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                viewGroup.removeView(navBarWithBigTile);
                ViewGroup viewGroup2 = this.f86394t0;
                if (viewGroup2 == null) {
                    Intrinsics.r("root");
                    throw null;
                }
                NavBarWithToolbar navBarWithToolbar2 = this.f86393s0;
                if (navBarWithToolbar2 == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
                viewGroup2.addView(navBarWithToolbar2, 0);
            }
        } else {
            NavBarWithBigTile navBarWithBigTile2 = this.f86392r0;
            if (navBarWithBigTile2 == null) {
                Intrinsics.r("navBarWithTile");
                throw null;
            }
            if (navBarWithBigTile2.getParent() == null) {
                ViewGroup viewGroup3 = this.f86394t0;
                if (viewGroup3 == null) {
                    Intrinsics.r("root");
                    throw null;
                }
                NavBarWithToolbar navBarWithToolbar3 = this.f86393s0;
                if (navBarWithToolbar3 == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
                viewGroup3.removeView(navBarWithToolbar3);
                ViewGroup viewGroup4 = this.f86394t0;
                if (viewGroup4 == null) {
                    Intrinsics.r("root");
                    throw null;
                }
                NavBarWithBigTile navBarWithBigTile3 = this.f86392r0;
                if (navBarWithBigTile3 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                viewGroup4.addView(navBarWithBigTile3, 0);
            }
        }
        if (i0Var.f203710a) {
            if (h0Var instanceof e0) {
                NavBarWithBigTile navBarWithBigTile4 = this.f86392r0;
                if (navBarWithBigTile4 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                e0 e0Var = (e0) h0Var;
                navBarWithBigTile4.setActionStatusLabel(new aw0.k(6, e0Var.f203691a, null, false));
                NavBarWithBigTile navBarWithBigTile5 = this.f86392r0;
                if (navBarWithBigTile5 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                navBarWithBigTile5.setTitle(e0Var.f203692b);
                NavBarWithBigTile navBarWithBigTile6 = this.f86392r0;
                if (navBarWithBigTile6 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                navBarWithBigTile6.setToolbarTitle(e0Var.f203693c);
            } else if (h0Var instanceof f0) {
                NavBarWithBigTile navBarWithBigTile7 = this.f86392r0;
                if (navBarWithBigTile7 == 0) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                f0 f0Var = (f0) h0Var;
                navBarWithBigTile7.setToolbarTitle(f0Var.f203695b);
                NavBarWithBigTile navBarWithBigTile8 = this.f86392r0;
                if (navBarWithBigTile8 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                navBarWithBigTile8.setTitle(f0Var.f203694a);
            } else {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                NavBarWithToolbar navBarWithToolbar4 = this.f86393s0;
                if (navBarWithToolbar4 == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
                g0 g0Var = (g0) h0Var;
                navBarWithToolbar4.setToolbarTitle(g0Var.f203696a);
                NavBarWithToolbar navBarWithToolbar5 = this.f86393s0;
                if (navBarWithToolbar5 == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
                navBarWithToolbar5.setTitle(g0Var.f203697b, null);
            }
        }
        if (i0Var.d) {
            if (z) {
                NavBarWithToolbar navBarWithToolbar6 = this.f86393s0;
                if (navBarWithToolbar6 == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
                navBarWithToolbar6.setMenuItems(list);
            } else {
                NavBarWithBigTile navBarWithBigTile9 = this.f86392r0;
                if (navBarWithBigTile9 == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
                navBarWithBigTile9.setMenuItems(list);
            }
        }
        if (i0Var.f203711b && !z) {
            NavBarWithBigTile navBarWithBigTile10 = this.f86392r0;
            if (navBarWithBigTile10 == null) {
                Intrinsics.r("navBarWithTile");
                throw null;
            }
            navBarWithBigTile10.setBackgroundImage(new ColorImage(new ColorImage.ColorAttr(R$attr.uikit_colorTransparent), null));
        }
        if (i0Var.f203712c) {
            if (z) {
                k4Var = this.f86393s0;
                if (k4Var == null) {
                    Intrinsics.r("navBarWithToolbar");
                    throw null;
                }
            } else {
                k4Var = this.f86392r0;
                if (k4Var == null) {
                    Intrinsics.r("navBarWithTile");
                    throw null;
                }
            }
            k4Var.setSearchButtonActive(clause != null);
            if (clause != null) {
                k4Var.setHint(clause);
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final d0 T2() {
        return (d0) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
