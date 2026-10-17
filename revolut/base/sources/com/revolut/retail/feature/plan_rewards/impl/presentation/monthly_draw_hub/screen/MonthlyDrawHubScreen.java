package com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cdk.b;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.CountDownTimerDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_rewards.impl.R$id;
import com.revolut.retail.feature.plan_rewards.impl.R$layout;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreen;
import com.revolut.retail.feature.plan_rewards.impl.presentation.monthly_draw_hub.screen.MonthlyDrawHubScreenContract$InputData;
import dli.a;
import dli.c;
import fdk.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q43.m;
import qdk.a0;
import qdk.b0;
import qdk.k0;
import qdk.p;
import qdk.q0;
import qdk.r;
import qdk.r0;
import qdk.t;
import qdk.u;
import qdk.y;
import qdk.z;
import te0.w;
import tx0.u1;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/monthly_draw_hub/screen/MonthlyDrawHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqdk/k0;", "Ldli/a;", "Lqdk/r0;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MonthlyDrawHubScreen extends ViewController<k0> implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f102568a0 = {o0.f186429a.j(new h0(MonthlyDrawHubScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/plan_rewards/impl/databinding/ScreenMonthlyDrawHubBinding;", 0))};
    public final MonthlyDrawHubScreenContract$InputData K;
    public final int L;
    public final FooterTextDelegate M;
    public final FullScreenStateDelegate N;
    public final SmallActionButtonDelegate O;
    public final ActionWidgetDelegate P;
    public final BigTileDelegate Q;
    public final CenteredContentTileDelegate R;
    public final ListSubheaderDelegate S;
    public final RowDelegate T;
    public final VoucherSmallTileDelegate U;
    public final ScrollerDelegate V;
    public final Object W;
    public final Object X;
    public final h Y;
    public final Object Z;

    public MonthlyDrawHubScreen(MonthlyDrawHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_monthly_draw_hub;
        this.M = new FooterTextDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new SmallActionButtonDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.P = actionWidgetDelegate;
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.Q = bigTileDelegate;
        this.R = new CenteredContentTileDelegate();
        this.S = new ListSubheaderDelegate();
        this.T = new RowDelegate(null, null, 7);
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.U = voucherSmallTileDelegate;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.V = new ScrollerDelegate(v.k(actionWidgetDelegate, bigTileDelegate, voucherSmallTileDelegate), false);
        this.W = w.y0(new Function0(this) { // from class: qdk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthlyDrawHubScreen f244978b;

            {
                this.f244978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                MonthlyDrawHubScreen monthlyDrawHubScreen = this.f244978b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = MonthlyDrawHubScreen.f102568a0;
                        return (q0) ((fdk.d) monthlyDrawHubScreen.Z.getValue()).f133976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MonthlyDrawHubScreen.f102568a0;
                        MonthlyDrawHubScreen monthlyDrawHubScreen2 = this.f244978b;
                        return dli.f.a(monthlyDrawHubScreen2, monthlyDrawHubScreen2.d(), zhm.v.k(monthlyDrawHubScreen2.M, monthlyDrawHubScreen2.N, monthlyDrawHubScreen2.O, new CountDownTimerDelegate(), monthlyDrawHubScreen2.S, new GridBoxDelegate(zhm.u.c(monthlyDrawHubScreen2.R), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), monthlyDrawHubScreen2.T, monthlyDrawHubScreen2.V), R$id.monthlyDrawsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MonthlyDrawHubScreen.f102568a0;
                        phm.a aVar = (phm.a) ue0.e.j(monthlyDrawHubScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                        }
                        fdk.g gVar = ((fdk.g) aVar2.b()).f133990n;
                        MonthlyDrawHubScreenContract$InputData monthlyDrawHubScreenContract$InputData = monthlyDrawHubScreen.K;
                        monthlyDrawHubScreenContract$InputData.getClass();
                        return new fdk.d(gVar, monthlyDrawHubScreenContract$InputData);
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: qdk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthlyDrawHubScreen f244978b;

            {
                this.f244978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                MonthlyDrawHubScreen monthlyDrawHubScreen = this.f244978b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = MonthlyDrawHubScreen.f102568a0;
                        return (q0) ((fdk.d) monthlyDrawHubScreen.Z.getValue()).f133976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MonthlyDrawHubScreen.f102568a0;
                        MonthlyDrawHubScreen monthlyDrawHubScreen2 = this.f244978b;
                        return dli.f.a(monthlyDrawHubScreen2, monthlyDrawHubScreen2.d(), zhm.v.k(monthlyDrawHubScreen2.M, monthlyDrawHubScreen2.N, monthlyDrawHubScreen2.O, new CountDownTimerDelegate(), monthlyDrawHubScreen2.S, new GridBoxDelegate(zhm.u.c(monthlyDrawHubScreen2.R), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), monthlyDrawHubScreen2.T, monthlyDrawHubScreen2.V), R$id.monthlyDrawsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MonthlyDrawHubScreen.f102568a0;
                        phm.a aVar = (phm.a) ue0.e.j(monthlyDrawHubScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                        }
                        fdk.g gVar = ((fdk.g) aVar2.b()).f133990n;
                        MonthlyDrawHubScreenContract$InputData monthlyDrawHubScreenContract$InputData = monthlyDrawHubScreen.K;
                        monthlyDrawHubScreenContract$InputData.getClass();
                        return new fdk.d(gVar, monthlyDrawHubScreenContract$InputData);
                }
            }
        });
        this.Y = s.t(this, p.f);
        this.Z = w.y0(new Function0(this) { // from class: qdk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MonthlyDrawHubScreen f244978b;

            {
                this.f244978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                MonthlyDrawHubScreen monthlyDrawHubScreen = this.f244978b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = MonthlyDrawHubScreen.f102568a0;
                        return (q0) ((fdk.d) monthlyDrawHubScreen.Z.getValue()).f133976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = MonthlyDrawHubScreen.f102568a0;
                        MonthlyDrawHubScreen monthlyDrawHubScreen2 = this.f244978b;
                        return dli.f.a(monthlyDrawHubScreen2, monthlyDrawHubScreen2.d(), zhm.v.k(monthlyDrawHubScreen2.M, monthlyDrawHubScreen2.N, monthlyDrawHubScreen2.O, new CountDownTimerDelegate(), monthlyDrawHubScreen2.S, new GridBoxDelegate(zhm.u.c(monthlyDrawHubScreen2.R), 2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12), monthlyDrawHubScreen2.T, monthlyDrawHubScreen2.V), R$id.monthlyDrawsScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MonthlyDrawHubScreen.f102568a0;
                        phm.a aVar = (phm.a) ue0.e.j(monthlyDrawHubScreen.m2()).a().get(fdk.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fdk.g.class, " is not found"));
                        }
                        fdk.g gVar = ((fdk.g) aVar2.b()).f133990n;
                        MonthlyDrawHubScreenContract$InputData monthlyDrawHubScreenContract$InputData = monthlyDrawHubScreen.K;
                        monthlyDrawHubScreenContract$InputData.getClass();
                        return new fdk.d(gVar, monthlyDrawHubScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r0 uiState = (r0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        AnimatedBackgroundType animatedBackgroundType = uiState.f244982b;
        i iVar = uiState.d;
        if (animatedBackgroundType != null) {
            d3().f23271c.setBackgroundType(animatedBackgroundType);
        }
        if (iVar != null) {
            ActionFooterView monthlyDrawsScreenActionFooterView = d3().f23270b;
            Intrinsics.checkNotNullExpressionValue(monthlyDrawsScreenActionFooterView, "monthlyDrawsScreenActionFooterView");
            monthlyDrawsScreenActionFooterView.setModel(iVar);
        }
        ActionFooterView monthlyDrawsScreenActionFooterView2 = d3().f23270b;
        Intrinsics.checkNotNullExpressionValue(monthlyDrawsScreenActionFooterView2, "monthlyDrawsScreenActionFooterView");
        monthlyDrawsScreenActionFooterView2.setVisibility(iVar != null ? 0 : 8);
        NavBarLargeCentred navBarLargeCentred = d3().d;
        navBarLargeCentred.setMenuItems(uiState.f244983c);
        b0 b0Var = uiState.f244981a;
        if (b0Var instanceof y) {
            navBarLargeCentred.B();
            ResourceImage resourceImage = new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            y yVar = (y) b0Var;
            TextClause textClause = yVar.f244994a;
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new l(textClause), textClause, null, yVar.f244995b, resourceImage, yVar.f244996c, null, null, 916));
            return;
        }
        if (b0Var.equals(z.f244998a)) {
            navBarLargeCentred.B();
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991));
        } else {
            if (!b0Var.equals(a0.f244957a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarLargeCentred.setModel(new NavBarLargeCentred.Model(null, null, null, null, new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 991));
            navBarLargeCentred.H(u1.DEFAULT);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59292m), null, new m(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59291l.f57403b), null, new qdk.s(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.e.f121375b), new qdk.s(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f23270b.f), null, new qdk.s(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new t(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f53336c.f121375b), null, new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51589c.f121375b), new qdk.s(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.e), null, new qdk.v(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new qdk.w(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.f53218h), null, new qdk.q(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f53608c), null, new r(this, null), 3);
    }

    public final b d3() {
        ViewBinding value = this.Y.getValue(this, f102568a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final q0 d() {
        return (q0) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.X.getValue();
    }
}
