package com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;
import com.revolut.core.ui_kit.delegates.RewardProgressLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.incentive_reward.impl.R$id;
import com.revolut.feature.incentive_reward.impl.R$layout;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsController;
import com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.IncentiveRewardDetailsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tzh.g;
import uf7.c;
import uf7.i;
import uf7.j;
import uf7.m;
import uf7.n;
import uf7.p;
import uf7.x;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/incentive_reward/impl/ui/incentive_reward/screen/details/IncentiveRewardDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luf7/x;", "feature_retail_incentive_reward_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IncentiveRewardDetailsController extends ViewController<q> implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74865a0 = {o0.f186429a.j(new h0(IncentiveRewardDetailsController.class, "binding", "getBinding()Lcom/revolut/feature/incentive_reward/impl/databinding/ScreenDetailsBinding;", 0))};
    public final IncentiveRewardDetailsControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final TwinHorizontalButtonDelegate Q;
    public final TextDelegate R;
    public final ActionWidgetDelegate S;
    public final ListSubheaderDelegate T;
    public final RowDelegate U;
    public final CellDetailsChevronDelegate V;
    public final ProductSelectionDelegate W;
    public final CounterTextDelegate X;
    public final LargeActionButtonDelegate Y;
    public final Object Z;

    public IncentiveRewardDetailsController(IncentiveRewardDetailsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_details;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: uf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveRewardDetailsController f279594b;

            {
                this.f279594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IncentiveRewardDetailsController incentiveRewardDetailsController = this.f279594b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveRewardDetailsController.f74865a0;
                        qji.b bVarU2 = incentiveRewardDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.di.IncentiveRewardDetailsComponent.Injector");
                        cf7.d dVar = (cf7.d) bVarU2;
                        cf7.b bVar = dVar.f23604b;
                        cf7.d dVar2 = dVar.f23605c;
                        IncentiveRewardDetailsControllerContract$InputData incentiveRewardDetailsControllerContract$InputData = incentiveRewardDetailsController.K;
                        incentiveRewardDetailsControllerContract$InputData.getClass();
                        return new cf7.c(bVar, dVar2, incentiveRewardDetailsController, incentiveRewardDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveRewardDetailsController.f74865a0;
                        return (m) ((cf7.c) ((wf7.a) incentiveRewardDetailsController.N.getValue())).u.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveRewardDetailsController.f74865a0;
                        IncentiveRewardDetailsController incentiveRewardDetailsController2 = this.f279594b;
                        return dli.f.a(incentiveRewardDetailsController2, incentiveRewardDetailsController2.d(), zhm.v.k(new RewardProgressLoadingDelegate(), new HeaderLoadingDelegate(), new RowLoadingDelegate(), incentiveRewardDetailsController2.P, incentiveRewardDetailsController2.R, incentiveRewardDetailsController2.S, incentiveRewardDetailsController2.X, new VaultsProgressDelegate(), new RewardProgressDelegate(), incentiveRewardDetailsController2.T, incentiveRewardDetailsController2.U, incentiveRewardDetailsController2.V, new ListCellDelegate(), incentiveRewardDetailsController2.W, new ScrollerBoxDelegate(zhm.u.c(new RewardDelegate(1)))), R$id.screenDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: uf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveRewardDetailsController f279594b;

            {
                this.f279594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IncentiveRewardDetailsController incentiveRewardDetailsController = this.f279594b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveRewardDetailsController.f74865a0;
                        qji.b bVarU2 = incentiveRewardDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.di.IncentiveRewardDetailsComponent.Injector");
                        cf7.d dVar = (cf7.d) bVarU2;
                        cf7.b bVar = dVar.f23604b;
                        cf7.d dVar2 = dVar.f23605c;
                        IncentiveRewardDetailsControllerContract$InputData incentiveRewardDetailsControllerContract$InputData = incentiveRewardDetailsController.K;
                        incentiveRewardDetailsControllerContract$InputData.getClass();
                        return new cf7.c(bVar, dVar2, incentiveRewardDetailsController, incentiveRewardDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveRewardDetailsController.f74865a0;
                        return (m) ((cf7.c) ((wf7.a) incentiveRewardDetailsController.N.getValue())).u.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveRewardDetailsController.f74865a0;
                        IncentiveRewardDetailsController incentiveRewardDetailsController2 = this.f279594b;
                        return dli.f.a(incentiveRewardDetailsController2, incentiveRewardDetailsController2.d(), zhm.v.k(new RewardProgressLoadingDelegate(), new HeaderLoadingDelegate(), new RowLoadingDelegate(), incentiveRewardDetailsController2.P, incentiveRewardDetailsController2.R, incentiveRewardDetailsController2.S, incentiveRewardDetailsController2.X, new VaultsProgressDelegate(), new RewardProgressDelegate(), incentiveRewardDetailsController2.T, incentiveRewardDetailsController2.U, incentiveRewardDetailsController2.V, new ListCellDelegate(), incentiveRewardDetailsController2.W, new ScrollerBoxDelegate(zhm.u.c(new RewardDelegate(1)))), R$id.screenDetails_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new TwinHorizontalButtonDelegate();
        this.R = new TextDelegate();
        this.S = new ActionWidgetDelegate();
        this.T = new ListSubheaderDelegate();
        this.U = new RowDelegate(null, null, 7);
        this.V = new CellDetailsChevronDelegate();
        this.W = new ProductSelectionDelegate();
        this.X = new CounterTextDelegate();
        this.Y = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.Z = w.y0(new Function0(this) { // from class: uf7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IncentiveRewardDetailsController f279594b;

            {
                this.f279594b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IncentiveRewardDetailsController incentiveRewardDetailsController = this.f279594b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IncentiveRewardDetailsController.f74865a0;
                        qji.b bVarU2 = incentiveRewardDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.incentive_reward.impl.ui.incentive_reward.screen.details.di.IncentiveRewardDetailsComponent.Injector");
                        cf7.d dVar = (cf7.d) bVarU2;
                        cf7.b bVar = dVar.f23604b;
                        cf7.d dVar2 = dVar.f23605c;
                        IncentiveRewardDetailsControllerContract$InputData incentiveRewardDetailsControllerContract$InputData = incentiveRewardDetailsController.K;
                        incentiveRewardDetailsControllerContract$InputData.getClass();
                        return new cf7.c(bVar, dVar2, incentiveRewardDetailsController, incentiveRewardDetailsControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IncentiveRewardDetailsController.f74865a0;
                        return (m) ((cf7.c) ((wf7.a) incentiveRewardDetailsController.N.getValue())).u.get();
                    default:
                        KProperty[] kPropertyArr3 = IncentiveRewardDetailsController.f74865a0;
                        IncentiveRewardDetailsController incentiveRewardDetailsController2 = this.f279594b;
                        return dli.f.a(incentiveRewardDetailsController2, incentiveRewardDetailsController2.d(), zhm.v.k(new RewardProgressLoadingDelegate(), new HeaderLoadingDelegate(), new RowLoadingDelegate(), incentiveRewardDetailsController2.P, incentiveRewardDetailsController2.R, incentiveRewardDetailsController2.S, incentiveRewardDetailsController2.X, new VaultsProgressDelegate(), new RewardProgressDelegate(), incentiveRewardDetailsController2.T, incentiveRewardDetailsController2.U, incentiveRewardDetailsController2.V, new ListCellDelegate(), incentiveRewardDetailsController2.W, new ScrollerBoxDelegate(zhm.u.c(new RewardDelegate(1)))), R$id.screenDetails_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        x uiState = (x) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        uf7.q qVar2 = uiState.f279624b;
        if (qVar2 instanceof p) {
            d3().f3930c.setTagView(null);
            d3().f3929b.setLoading();
        } else if (qVar2 instanceof uf7.o) {
            d3().f3930c.setTagView(null);
            d3().f3929b.setStories(f0.f322471a);
        } else {
            if (!(qVar2 instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            n nVar = (n) qVar2;
            d3().f3930c.setTagView(nVar.f279613a);
            d3().f3929b.setStories(nVar.f279614b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wf7.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((cf7.c) ((wf7.a) this.N.getValue())).d.get()).d(v.k(this.Q, new CellDetailsDelegate(), new VaultsProgressDelegate(), this.Y));
        NavBarWithContainer navBarWithContainer = d3().f3930c;
        navBarWithContainer.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithContainer.M();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f3930c.K()), null, new i(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new t4j.c(vkm.q.J(rd0.e.b(this.X.d), rd0.e.b(this.V.f51821c), rd0.e.b(this.W.p()), rd0.e.b(this.T.f52707c), rd0.e.b(this.Y.d.f121375b)), i), null, new uf7.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.S.f51589c.f121375b), 12), null, new uf7.h(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.U.f53218h), 13), null, new uf7.h(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, new g(rd0.e.b(this.R.d), 14), null, new uf7.h(this, continuation, 0), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new i(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalButtonDelegate.d.f121375b), null, new i(this, null, 1), 3);
    }

    public final af7.a d3() {
        ViewBinding value = this.M.getValue(this, f74865a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (af7.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m d() {
        return (m) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }
}
