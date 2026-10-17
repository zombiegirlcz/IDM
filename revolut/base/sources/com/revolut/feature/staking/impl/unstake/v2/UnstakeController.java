package com.revolut.feature.staking.impl.unstake.v2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.impl.R$id;
import com.revolut.feature.staking.impl.R$layout;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xwd.c;
import xwd.d;
import xwd.f;
import xwd.g;
import xwd.j;
import xwd.m;
import ytd.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/staking/impl/unstake/v2/UnstakeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lytd/e;", "Ldli/a;", "Lxwd/m;", "Companion", "a", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnstakeController extends ViewController<e> implements dli.a {
    public final CellDetailsDelegate K;
    public final CenteredAmountDelegate L;
    public final LargeActionButtonDelegate M;
    public final h N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UnstakeController.class, "binding", "getBinding()Lcom/revolut/feature/staking/impl/databinding/ScreenStakingBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.staking.impl.unstake.v2.UnstakeController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public UnstakeController(StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingPocket, "stakingPocket");
        this.K = new CellDetailsDelegate();
        this.L = new CenteredAmountDelegate(new xwd.a(this, 0));
        this.M = new LargeActionButtonDelegate();
        this.N = s.t(this, c.f);
        this.O = R$layout.screen_staking;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: xwd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnstakeController f309349b;

            {
                this.f309349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UnstakeController.Companion companion = UnstakeController.INSTANCE;
                        return (j) ((qud.h) this.f309349b.Q.getValue()).f249408n.get();
                    default:
                        UnstakeController.Companion companion2 = UnstakeController.INSTANCE;
                        UnstakeController unstakeController = this.f309349b;
                        return dli.f.a(unstakeController, unstakeController.R2(), v.k(unstakeController.K, unstakeController.L), R$id.screenStaking_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new xfj.a(this, stakingPocket, 27));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: xwd.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnstakeController f309349b;

            {
                this.f309349b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UnstakeController.Companion companion = UnstakeController.INSTANCE;
                        return (j) ((qud.h) this.f309349b.Q.getValue()).f249408n.get();
                    default:
                        UnstakeController.Companion companion2 = UnstakeController.INSTANCE;
                        UnstakeController unstakeController = this.f309349b;
                        return dli.f.a(unstakeController, unstakeController.R2(), v.k(unstakeController.K, unstakeController.L), R$id.screenStaking_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithAvatar navBarWithAvatar = d3().f229856c;
        navBarWithAvatar.setToolbarTitle(uiState.f309359a);
        navBarWithAvatar.setToolbarDescription(uiState.f309360b);
        navBarWithAvatar.setAvatarImage(uiState.f309361c);
        LargeActionButton largeActionButton = d3().f229855b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.e);
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qud.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f229856c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f229855b.setCustomE2ETestId("ConfirmUnstakingButton");
        ((j60.a) ((qud.h) this.Q.getValue()).f.get()).d(u.c(this.M));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229856c.f59338a), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229856c.f59343j), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f229855b.o), null, new d(this, continuation, 2), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), null, new xwd.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f51965h.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.d), null, new xwd.h(this, null), 3);
    }

    public final oud.a d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (oud.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
