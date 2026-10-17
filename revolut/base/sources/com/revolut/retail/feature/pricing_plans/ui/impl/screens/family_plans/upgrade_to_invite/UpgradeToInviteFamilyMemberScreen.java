package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.UpgradeToInviteFamilyMemberScreenContract$InputData;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qgk.a2;
import qgk.i0;
import qkk.b;
import qkk.c;
import qkk.f;
import qkk.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/upgrade_to_invite/UpgradeToInviteFamilyMemberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqkk/f;", "Ldli/a;", "Lqkk/h;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpgradeToInviteFamilyMemberScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(UpgradeToInviteFamilyMemberScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final UpgradeToInviteFamilyMemberScreenContract$InputData K;
    public final int L;
    public final LargeActionButtonDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public UpgradeToInviteFamilyMemberScreen(UpgradeToInviteFamilyMemberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = new LargeActionButtonDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToInviteFamilyMemberScreen f247014b;

            {
                this.f247014b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen = this.f247014b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpgradeToInviteFamilyMemberScreen.R;
                        UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen2 = this.f247014b;
                        return dli.f.a(upgradeToInviteFamilyMemberScreen2, (g) upgradeToInviteFamilyMemberScreen2.Q.getValue(), u.c(upgradeToInviteFamilyMemberScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpgradeToInviteFamilyMemberScreen.R;
                        qji.b bVarU2 = upgradeToInviteFamilyMemberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.di.UpgradeToInviteFamilyMemberScreenInjector");
                        qgk.i iVar = (qgk.i) bVarU2;
                        i0 i0Var = iVar.f246006b;
                        qgk.j jVar = iVar.f246007c;
                        qgk.i iVar2 = iVar.d;
                        UpgradeToInviteFamilyMemberScreenContract$InputData upgradeToInviteFamilyMemberScreenContract$InputData = upgradeToInviteFamilyMemberScreen.K;
                        upgradeToInviteFamilyMemberScreenContract$InputData.getClass();
                        return new a2(i0Var, jVar, iVar2, upgradeToInviteFamilyMemberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpgradeToInviteFamilyMemberScreen.R;
                        return (g) ((a2) upgradeToInviteFamilyMemberScreen.P.getValue()).f245881c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToInviteFamilyMemberScreen f247014b;

            {
                this.f247014b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen = this.f247014b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpgradeToInviteFamilyMemberScreen.R;
                        UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen2 = this.f247014b;
                        return dli.f.a(upgradeToInviteFamilyMemberScreen2, (g) upgradeToInviteFamilyMemberScreen2.Q.getValue(), u.c(upgradeToInviteFamilyMemberScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpgradeToInviteFamilyMemberScreen.R;
                        qji.b bVarU2 = upgradeToInviteFamilyMemberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.di.UpgradeToInviteFamilyMemberScreenInjector");
                        qgk.i iVar = (qgk.i) bVarU2;
                        i0 i0Var = iVar.f246006b;
                        qgk.j jVar = iVar.f246007c;
                        qgk.i iVar2 = iVar.d;
                        UpgradeToInviteFamilyMemberScreenContract$InputData upgradeToInviteFamilyMemberScreenContract$InputData = upgradeToInviteFamilyMemberScreen.K;
                        upgradeToInviteFamilyMemberScreenContract$InputData.getClass();
                        return new a2(i0Var, jVar, iVar2, upgradeToInviteFamilyMemberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpgradeToInviteFamilyMemberScreen.R;
                        return (g) ((a2) upgradeToInviteFamilyMemberScreen.P.getValue()).f245881c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qkk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpgradeToInviteFamilyMemberScreen f247014b;

            {
                this.f247014b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen = this.f247014b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpgradeToInviteFamilyMemberScreen.R;
                        UpgradeToInviteFamilyMemberScreen upgradeToInviteFamilyMemberScreen2 = this.f247014b;
                        return dli.f.a(upgradeToInviteFamilyMemberScreen2, (g) upgradeToInviteFamilyMemberScreen2.Q.getValue(), u.c(upgradeToInviteFamilyMemberScreen2.M), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpgradeToInviteFamilyMemberScreen.R;
                        qji.b bVarU2 = upgradeToInviteFamilyMemberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.upgrade_to_invite.di.UpgradeToInviteFamilyMemberScreenInjector");
                        qgk.i iVar = (qgk.i) bVarU2;
                        i0 i0Var = iVar.f246006b;
                        qgk.j jVar = iVar.f246007c;
                        qgk.i iVar2 = iVar.d;
                        UpgradeToInviteFamilyMemberScreenContract$InputData upgradeToInviteFamilyMemberScreenContract$InputData = upgradeToInviteFamilyMemberScreen.K;
                        upgradeToInviteFamilyMemberScreenContract$InputData.getClass();
                        return new a2(i0Var, jVar, iVar2, upgradeToInviteFamilyMemberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpgradeToInviteFamilyMemberScreen.R;
                        return (g) ((a2) upgradeToInviteFamilyMemberScreen.P.getValue()).f245881c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        qkk.h uiState = (qkk.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(uiState.f247022b, uiState.f247023c, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.d.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
