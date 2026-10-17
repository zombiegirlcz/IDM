package com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.AutoEarnRewardsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fma.c0;
import fma.d0;
import fma.u;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tki.c;
import una.d;
import una.e;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/auto_earn_rewards/AutoEarnRewardsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Luna/e;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoEarnRewardsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AutoEarnRewardsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final RowDelegate P;
    public final List Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public AutoEarnRewardsController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: una.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoEarnRewardsController f281377b;

            {
                this.f281377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AutoEarnRewardsController autoEarnRewardsController = this.f281377b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AutoEarnRewardsController.R;
                        qji.b bVarU2 = autoEarnRewardsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.di.AutoEarnRewardsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        u uVar = new u();
                        uVar.f136224a = e4m.b.b(new fma.q(c0Var, 1));
                        return uVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AutoEarnRewardsController.R;
                        return (d) ((u) autoEarnRewardsController.L.getValue()).f136224a.get();
                    default:
                        KProperty[] kPropertyArr3 = AutoEarnRewardsController.R;
                        AutoEarnRewardsController autoEarnRewardsController2 = this.f281377b;
                        return tki.g.a(autoEarnRewardsController2, (d) autoEarnRewardsController2.M.getValue(), autoEarnRewardsController2.Q, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: una.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoEarnRewardsController f281377b;

            {
                this.f281377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AutoEarnRewardsController autoEarnRewardsController = this.f281377b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AutoEarnRewardsController.R;
                        qji.b bVarU2 = autoEarnRewardsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.di.AutoEarnRewardsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        u uVar = new u();
                        uVar.f136224a = e4m.b.b(new fma.q(c0Var, 1));
                        return uVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AutoEarnRewardsController.R;
                        return (d) ((u) autoEarnRewardsController.L.getValue()).f136224a.get();
                    default:
                        KProperty[] kPropertyArr3 = AutoEarnRewardsController.R;
                        AutoEarnRewardsController autoEarnRewardsController2 = this.f281377b;
                        return tki.g.a(autoEarnRewardsController2, (d) autoEarnRewardsController2.M.getValue(), autoEarnRewardsController2.Q, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: una.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoEarnRewardsController f281377b;

            {
                this.f281377b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AutoEarnRewardsController autoEarnRewardsController = this.f281377b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AutoEarnRewardsController.R;
                        qji.b bVarU2 = autoEarnRewardsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.di.AutoEarnRewardsControllerInjector");
                        c0 c0Var = ((d0) bVarU2).f136085b;
                        u uVar = new u();
                        uVar.f136224a = e4m.b.b(new fma.q(c0Var, 1));
                        return uVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AutoEarnRewardsController.R;
                        return (d) ((u) autoEarnRewardsController.L.getValue()).f136224a.get();
                    default:
                        KProperty[] kPropertyArr3 = AutoEarnRewardsController.R;
                        AutoEarnRewardsController autoEarnRewardsController2 = this.f281377b;
                        return tki.g.a(autoEarnRewardsController2, (d) autoEarnRewardsController2.M.getValue(), autoEarnRewardsController2.Q, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = v.k(rowDelegate, new RowLoadingDelegate());
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.profile_auto_earn_rewards_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new uea.e(this, null, 14), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53225r), new una.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.N.getValue();
    }
}
