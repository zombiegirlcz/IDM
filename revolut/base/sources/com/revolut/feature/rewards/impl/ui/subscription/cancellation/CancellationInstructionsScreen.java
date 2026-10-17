package com.revolut.feature.rewards.impl.ui.subscription.cancellation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.l;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rewards.impl.R$id;
import com.revolut.feature.rewards.impl.R$layout;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import te0.w;
import tx0.q1;
import tx0.x1;
import vc.s;
import whc.n;
import xjc.a;
import xjc.b;
import xjc.d;
import xjc.f;
import xjc.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/subscription/cancellation/CancellationInstructionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxjc/a;", "Ldli/a;", "Lxjc/b;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancellationInstructionsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CancellationInstructionsScreen.class, "binding", "getBinding()Lcom/revolut/feature/rewards/impl/databinding/ScreenCancellationInstructionsBinding;", 0))};
    public final CancellationInstructionsContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CancellationInstructionsScreen(CancellationInstructionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_cancellation_instructions;
        this.M = s.t(this, d.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xjc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationInstructionsScreen f306512b;

            {
                this.f306512b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancellationInstructionsScreen cancellationInstructionsScreen = this.f306512b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationInstructionsScreen.R;
                        qji.b bVarU2 = cancellationInstructionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.cancellation.di.CancellationInstructionsScreenInjector");
                        n nVar = (n) bVarU2;
                        whc.s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData = cancellationInstructionsScreen.K;
                        cancellationInstructionsContract$InputData.getClass();
                        return new whc.h(sVar, nVar2, cancellationInstructionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationInstructionsScreen.R;
                        return (g) ((whc.h) cancellationInstructionsScreen.O.getValue()).f297534b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationInstructionsScreen.R;
                        CancellationInstructionsScreen cancellationInstructionsScreen2 = this.f306512b;
                        return dli.f.a(cancellationInstructionsScreen2, (g) cancellationInstructionsScreen2.P.getValue(), v.k(new ListCellDelegate(), cancellationInstructionsScreen2.N), R$id.cancellationInstructionsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xjc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationInstructionsScreen f306512b;

            {
                this.f306512b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancellationInstructionsScreen cancellationInstructionsScreen = this.f306512b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationInstructionsScreen.R;
                        qji.b bVarU2 = cancellationInstructionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.cancellation.di.CancellationInstructionsScreenInjector");
                        n nVar = (n) bVarU2;
                        whc.s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData = cancellationInstructionsScreen.K;
                        cancellationInstructionsContract$InputData.getClass();
                        return new whc.h(sVar, nVar2, cancellationInstructionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationInstructionsScreen.R;
                        return (g) ((whc.h) cancellationInstructionsScreen.O.getValue()).f297534b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationInstructionsScreen.R;
                        CancellationInstructionsScreen cancellationInstructionsScreen2 = this.f306512b;
                        return dli.f.a(cancellationInstructionsScreen2, (g) cancellationInstructionsScreen2.P.getValue(), v.k(new ListCellDelegate(), cancellationInstructionsScreen2.N), R$id.cancellationInstructionsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xjc.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationInstructionsScreen f306512b;

            {
                this.f306512b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancellationInstructionsScreen cancellationInstructionsScreen = this.f306512b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationInstructionsScreen.R;
                        qji.b bVarU2 = cancellationInstructionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.cancellation.di.CancellationInstructionsScreenInjector");
                        n nVar = (n) bVarU2;
                        whc.s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        CancellationInstructionsContract$InputData cancellationInstructionsContract$InputData = cancellationInstructionsScreen.K;
                        cancellationInstructionsContract$InputData.getClass();
                        return new whc.h(sVar, nVar2, cancellationInstructionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationInstructionsScreen.R;
                        return (g) ((whc.h) cancellationInstructionsScreen.O.getValue()).f297534b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationInstructionsScreen.R;
                        CancellationInstructionsScreen cancellationInstructionsScreen2 = this.f306512b;
                        return dli.f.a(cancellationInstructionsScreen2, (g) cancellationInstructionsScreen2.P.getValue(), v.k(new ListCellDelegate(), cancellationInstructionsScreen2.N), R$id.cancellationInstructionsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f271358c;
        TextClause textClause = uiState.f306509b;
        navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new l(textClause, x1.SMALL), textClause, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 988));
        ActionFooterView cancellationInstructionsScreenActionFooterView = d3().f271357b;
        Intrinsics.checkNotNullExpressionValue(cancellationInstructionsScreenActionFooterView, "cancellationInstructionsScreenActionFooterView");
        i iVar = uiState.f306510c;
        cancellationInstructionsScreenActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView cancellationInstructionsScreenActionFooterView2 = d3().f271357b;
            Intrinsics.checkNotNullExpressionValue(cancellationInstructionsScreenActionFooterView2, "cancellationInstructionsScreenActionFooterView");
            cancellationInstructionsScreenActionFooterView2.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (whc.h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarLargeCentred cancellationInstructionsScreenNavBar = d3().f271358c;
        Intrinsics.checkNotNullExpressionValue(cancellationInstructionsScreenNavBar, "cancellationInstructionsScreenNavBar");
        NavBarLargeCentred.setLargeImage$default(cancellationInstructionsScreenNavBar, new AvatarModel.Default(new UrlImage(this.K.f84992a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, null, new AvatarModel.BadgeModel(new WarningCircleBadge(dw0.a.Info), com.revolut.core.ui_kit.models.avatar.b.BOTTOM), null, LDSFile.EF_DG14_TAG), (q1) null, 2, (Object) null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f271358c.f59292m), new xjc.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f271357b.f), new xjc.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new f(this, null), 3);
    }

    public final thc.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (thc.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
