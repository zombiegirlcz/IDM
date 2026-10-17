package com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.m0;
import au0.r0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.trade_rev_points.impl.R$id;
import com.revolut.feature.trade_rev_points.impl.R$layout;
import com.revolut.feature.trade_rev_points.impl.ui.screen.agent_details.TradeRevPointsAgentDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import e2f.d;
import e2f.g;
import e2f.i;
import e2f.j;
import e2f.k;
import e2f.l;
import e2f.m;
import e2f.p;
import e2f.r;
import e2f.v;
import e2f.x;
import e2f.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t1f.f;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/agent_details/TradeRevPointsAgentDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Le2f/v;", "Ldli/a;", "Le2f/y;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAgentDetailsScreen extends ViewController<v> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TradeRevPointsAgentDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/trade_rev_points/impl/databinding/ScreenTradeRevPointsAgentDetailsBinding;", 0))};
    public final int K;
    public final FullScreenStateDelegate L;
    public final ActionCardDelegate M;
    public final ReferralContactDelegate N;
    public final LargeActionButtonDelegate O;
    public final FooterTextDelegate P;
    public final RowDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public TradeRevPointsAgentDetailsScreen(TradeRevPointsAgentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_trade_rev_points_agent_details;
        this.L = new FullScreenStateDelegate();
        this.M = new ActionCardDelegate();
        this.N = new ReferralContactDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new FooterTextDelegate();
        this.Q = new RowDelegate(null, null, 7);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: e2f.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAgentDetailsScreen f122059b;

            {
                this.f122059b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAgentDetailsScreen.V;
                        TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen = this.f122059b;
                        return dli.f.a(tradeRevPointsAgentDetailsScreen, tradeRevPointsAgentDetailsScreen.R2(), zhm.v.k(new RowLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsHeadlineLoadingDelegate(), new CellDetailsHeadlineDelegate(), tradeRevPointsAgentDetailsScreen.Q, new GridBoxDelegate(zhm.v.k(tradeRevPointsAgentDetailsScreen.M, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2), new ScrollerDelegate(zhm.u.c(tradeRevPointsAgentDetailsScreen.N), false), tradeRevPointsAgentDetailsScreen.P, tradeRevPointsAgentDetailsScreen.L, tradeRevPointsAgentDetailsScreen.O), R$id.tradeRevPointsAgentDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAgentDetailsScreen.V;
                        return (x) ((t1f.f) this.f122059b.T.getValue()).i.get();
                }
            }
        });
        this.S = s.t(this, d.f);
        this.T = w.y0(new dgg.b(this, inputData, 28));
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: e2f.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAgentDetailsScreen f122059b;

            {
                this.f122059b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAgentDetailsScreen.V;
                        TradeRevPointsAgentDetailsScreen tradeRevPointsAgentDetailsScreen = this.f122059b;
                        return dli.f.a(tradeRevPointsAgentDetailsScreen, tradeRevPointsAgentDetailsScreen.R2(), zhm.v.k(new RowLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsHeadlineLoadingDelegate(), new CellDetailsHeadlineDelegate(), tradeRevPointsAgentDetailsScreen.Q, new GridBoxDelegate(zhm.v.k(tradeRevPointsAgentDetailsScreen.M, new ActionCardLoadingDelegate()), 0, 8.0f, 8.0f, 2), new ScrollerDelegate(zhm.u.c(tradeRevPointsAgentDetailsScreen.N), false), tradeRevPointsAgentDetailsScreen.P, tradeRevPointsAgentDetailsScreen.L, tradeRevPointsAgentDetailsScreen.O), R$id.tradeRevPointsAgentDetails_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TradeRevPointsAgentDetailsScreen.V;
                        return (x) ((t1f.f) this.f122059b.T.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        y uiState = (y) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        e2f.w wVar = qVar instanceof e2f.w ? (e2f.w) qVar : null;
        if (wVar == null || wVar.f122087a) {
            r rVar = uiState.f122090b;
            if (rVar instanceof e2f.o) {
                NavBarWithBigTile navBarWithBigTile = d3().f241440c;
                navBarWithBigTile.setLoadingState(false);
                e2f.o oVar2 = (e2f.o) rVar;
                TextClause textClause = oVar2.f122080c;
                navBarWithBigTile.setIcon(oVar2.f122079b, r0.DEFAULT);
                navBarWithBigTile.setTitle(textClause);
                navBarWithBigTile.setToolbarTitle(textClause);
                navBarWithBigTile.setDescription((Clause) oVar2.d);
                c1.S(navBarWithBigTile, oVar2.f122078a, null, null, 6);
                navBarWithBigTile.setMenuItems(oVar2.e);
                navBarWithBigTile.setActions(oVar2.f);
            } else if (rVar instanceof p) {
                d3().f241440c.setLoadingState(false);
            } else {
                if (!(rVar instanceof e2f.q)) {
                    throw new NoWhenBranchMatchedException();
                }
                d3().f241440c.setLoadingState(true);
            }
        }
        if (wVar == null || wVar.f122088b) {
            m mVar = uiState.f122091c;
            LargeActionButton largeActionButton = d3().f241439b;
            largeActionButton.setText((Clause) mVar.f122074b);
            largeActionButton.setVisibility(mVar.f122073a ? 0 : 8);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f241440c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.FULL_GRADIENT);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        d3().f241439b.setLoadingButtonTag("TRANSFER_POINTS_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new e2f.e(this, null), 3);
        NavBarWithBigTile navBarWithBigTile = d3().f241440c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new e2f.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.b()), null, new g(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.K()), null, new e2f.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.q()), null, new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51572n), new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f241439b.o), null, new e2f.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.e.f121375b), null, new g(this, null, 1), 3);
    }

    public final q1f.d d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q1f.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x R2() {
        return (x) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
