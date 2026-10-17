package com.revolut.feature.staking.impl.stake.v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.R$id;
import com.revolut.feature.staking.impl.R$layout;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import com.revolut.kompot.navigable.vc.ViewController;
import d01.g;
import efm.r;
import iz0.e;
import java.util.List;
import jh.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qg7.k;
import qwd.f;
import qwd.j;
import qwd.n;
import te0.w;
import vc.s;
import vkm.i;
import ytd.c;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/staking/impl/stake/v2/StakeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lytd/c;", "Ltki/c;", "Lqwd/n;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakeController extends ViewController<c> implements tki.c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(StakeController.class, "binding", "getBinding()Lcom/revolut/feature/staking/impl/databinding/ScreenStakingBinding;", 0))};
    public final CellDetailsActionDelegate K;
    public final LargeActionButtonDelegate L;
    public final CenteredAmountDelegate M;
    public final h N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public StakeController(StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.K = new CellDetailsActionDelegate();
        this.L = new LargeActionButtonDelegate();
        this.M = new CenteredAmountDelegate(new qm2.c(this, 13));
        this.N = s.t(this, qwd.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qwd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakeController f249855b;

            {
                this.f249855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StakeController stakeController = this.f249855b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StakeController.T;
                        return (fvd.a) ((qud.b) stakeController.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakeController.T;
                        return (j) ((qud.b) stakeController.R.getValue()).f249362q.get();
                    default:
                        KProperty[] kPropertyArr3 = StakeController.T;
                        StakeController stakeController2 = this.f249855b;
                        return tki.g.a(stakeController2, stakeController2.R2(), zhm.v.k(new CellDetailsDelegate(), stakeController2.K, stakeController2.M), R$id.screenStaking_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = R$layout.screen_staking;
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: qwd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakeController f249855b;

            {
                this.f249855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StakeController stakeController = this.f249855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StakeController.T;
                        return (fvd.a) ((qud.b) stakeController.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakeController.T;
                        return (j) ((qud.b) stakeController.R.getValue()).f249362q.get();
                    default:
                        KProperty[] kPropertyArr3 = StakeController.T;
                        StakeController stakeController2 = this.f249855b;
                        return tki.g.a(stakeController2, stakeController2.R2(), zhm.v.k(new CellDetailsDelegate(), stakeController2.K, stakeController2.M), R$id.screenStaking_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new k(this, i2, stakingProduct, stakingPocket));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: qwd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakeController f249855b;

            {
                this.f249855b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StakeController stakeController = this.f249855b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StakeController.T;
                        return (fvd.a) ((qud.b) stakeController.R.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StakeController.T;
                        return (j) ((qud.b) stakeController.R.getValue()).f249362q.get();
                    default:
                        KProperty[] kPropertyArr3 = StakeController.T;
                        StakeController stakeController2 = this.f249855b;
                        return tki.g.a(stakeController2, stakeController2.R2(), zhm.v.k(new CellDetailsDelegate(), stakeController2.K, stakeController2.M), R$id.screenStaking_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithAvatar navBarWithAvatar = d3().f229856c;
        navBarWithAvatar.setToolbarTitle(uiState.f249869a);
        navBarWithAvatar.setAvatarImage(uiState.f249870b);
        LargeActionButton largeActionButton = d3().f229855b;
        largeActionButton.setText(uiState.f249871c);
        largeActionButton.setEnabled(uiState.d);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        List items = uiState.e;
        if (items.isEmpty()) {
            return;
        }
        fvd.a aVar = (fvd.a) this.O.getValue();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        g gVarE0 = d.f(aVar.f138418c.m2()).e0();
        if (gVarE0 != null) {
            Intrinsics.checkNotNullParameter(items, "items");
            ((e) gVarE0).g("legacy_source_id", items);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qud.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f229856c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((qud.b) this.R.getValue()).f249355g.get()).d(v.k(new CellDetailsDelegate(), this.L));
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        r rVarD;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229856c.f59338a), null, new qwd.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229855b.o), null, new qwd.c(this, continuation, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), null, new qwd.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f51965h.f121375b), null, new qwd.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new qwd.g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.d), null, new qwd.h(this, null), 3);
        g gVarE0 = d.f(((fvd.a) this.O.getValue()).f138418c.m2()).e0();
        com.revolut.kompot.navigable.a.g2(this, (gVarE0 == null || (rVarD = ((e) gVarE0).d("legacy_source_id")) == null) ? i.f290039a : rd0.e.b(rVarD), null, new qp7.g(this, continuation, 13), 3);
    }

    public final oud.a d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (oud.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
