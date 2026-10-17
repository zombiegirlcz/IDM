package com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.s0;
import aw0.d0;
import cga.c;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.R$id;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.R$layout;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreen;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreenContract$InputData;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.a;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import iga.d;
import iga.f;
import iga.g;
import iga.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.o2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/ui/screen/unlock_benefits/UnlockBenefitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liga/g;", "Ldli/a;", "Liga/i;", "feature_pricing_plans_unlock_benefits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnlockBenefitsScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UnlockBenefitsScreen.class, "binding", "getBinding()Lcom/revolut/feature/pricing_plans/unlock_benefits/impl/databinding/ScreenUnlockBenefitsBinding;", 0))};
    public final UnlockBenefitsScreenContract$InputData K;
    public final h L;
    public final SplitColumnCellDelegate M;
    public final int N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public UnlockBenefitsScreen(UnlockBenefitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, iga.b.f);
        this.M = new SplitColumnCellDelegate();
        this.N = R$layout.screen_unlock_benefits;
        this.O = R$style.UiKitTheme_Night;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: iga.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnlockBenefitsScreen f161100b;

            {
                this.f161100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UnlockBenefitsScreen unlockBenefitsScreen = this.f161100b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UnlockBenefitsScreen.S;
                        UnlockBenefitsScreen unlockBenefitsScreen2 = this.f161100b;
                        return dli.f.a(unlockBenefitsScreen2, unlockBenefitsScreen2.R2(), v.k(new FullScreenStateDelegate(), unlockBenefitsScreen2.M, new SplitColumnCellLoadingDelegate()), R$id.unlockBenefits_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UnlockBenefitsScreen.S;
                        qji.b bVarU2 = unlockBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.di.UnlockBenefitsScreenInjector");
                        cga.b bVar = (cga.b) bVarU2;
                        cga.a aVar = bVar.f23893b;
                        cga.b bVar2 = bVar.f23894c;
                        UnlockBenefitsScreenContract$InputData unlockBenefitsScreenContract$InputData = unlockBenefitsScreen.K;
                        unlockBenefitsScreenContract$InputData.getClass();
                        return new cga.c(aVar, bVar2, unlockBenefitsScreen, unlockBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UnlockBenefitsScreen.S;
                        return (h) ((cga.c) unlockBenefitsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: iga.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnlockBenefitsScreen f161100b;

            {
                this.f161100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UnlockBenefitsScreen unlockBenefitsScreen = this.f161100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UnlockBenefitsScreen.S;
                        UnlockBenefitsScreen unlockBenefitsScreen2 = this.f161100b;
                        return dli.f.a(unlockBenefitsScreen2, unlockBenefitsScreen2.R2(), v.k(new FullScreenStateDelegate(), unlockBenefitsScreen2.M, new SplitColumnCellLoadingDelegate()), R$id.unlockBenefits_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UnlockBenefitsScreen.S;
                        qji.b bVarU2 = unlockBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.di.UnlockBenefitsScreenInjector");
                        cga.b bVar = (cga.b) bVarU2;
                        cga.a aVar = bVar.f23893b;
                        cga.b bVar2 = bVar.f23894c;
                        UnlockBenefitsScreenContract$InputData unlockBenefitsScreenContract$InputData = unlockBenefitsScreen.K;
                        unlockBenefitsScreenContract$InputData.getClass();
                        return new cga.c(aVar, bVar2, unlockBenefitsScreen, unlockBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UnlockBenefitsScreen.S;
                        return (h) ((cga.c) unlockBenefitsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: iga.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnlockBenefitsScreen f161100b;

            {
                this.f161100b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UnlockBenefitsScreen unlockBenefitsScreen = this.f161100b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UnlockBenefitsScreen.S;
                        UnlockBenefitsScreen unlockBenefitsScreen2 = this.f161100b;
                        return dli.f.a(unlockBenefitsScreen2, unlockBenefitsScreen2.R2(), v.k(new FullScreenStateDelegate(), unlockBenefitsScreen2.M, new SplitColumnCellLoadingDelegate()), R$id.unlockBenefits_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UnlockBenefitsScreen.S;
                        qji.b bVarU2 = unlockBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.di.UnlockBenefitsScreenInjector");
                        cga.b bVar = (cga.b) bVarU2;
                        cga.a aVar = bVar.f23893b;
                        cga.b bVar2 = bVar.f23894c;
                        UnlockBenefitsScreenContract$InputData unlockBenefitsScreenContract$InputData = unlockBenefitsScreen.K;
                        unlockBenefitsScreenContract$InputData.getClass();
                        return new cga.c(aVar, bVar2, unlockBenefitsScreen, unlockBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UnlockBenefitsScreen.S;
                        return (h) ((cga.c) unlockBenefitsScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.O);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView actionFooterView = d3().f15156b;
        aw0.i iVar = uiState.f161108c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
        a aVar = uiState.f161107b;
        if (aVar.equals(a.C0523a.f80971a)) {
            d3().f15157c.setLoadingState(true);
            return;
        }
        if (!(aVar instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithBigTile navBarWithBigTile = d3().f15157c;
        navBarWithBigTile.setLoadingState(false);
        f fVar = (f) aVar;
        c1.S(navBarWithBigTile, u.c(fVar.f161102a), null, null, 6);
        navBarWithBigTile.setActionStatusLabel(fVar.f161103b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f15157c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        navBarWithBigTile.setHeightMode(new o2(new d0(100, 130)));
        navBarWithBigTile.setTitleStyle(b1.LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f15157c.f59357t), new iga.c(this, null, 0), 3);
        ViewController.P2(this, l.y(d3().f15156b.f, d3().f15156b.f58955g, "merge(...)"), new ibg.g(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f15157c.f59360y.f57279r), new iga.c(this, null, 1), 3);
    }

    public final bga.a d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (bga.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final iga.h R2() {
        return (iga.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF78899a0() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
