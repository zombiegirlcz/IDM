package com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.WithdrawalAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import i72.a0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qd0.b;
import te0.w;
import u7k.f0;
import u82.c;
import u82.f;
import u82.g;
import v62.j;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/amount/WithdrawalAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv62/j;", "Ldli/a;", "Lu82/f;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawalAmountScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WithdrawalAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0))};
    public final int K;
    public final boolean L;
    public final h M;
    public b N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public WithdrawalAmountScreen(MultibancoWithdrawalInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transfer_amount;
        this.L = true;
        this.M = s.t(this, u82.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: u82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalAmountScreen f278078b;

            {
                this.f278078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WithdrawalAmountScreen withdrawalAmountScreen = this.f278078b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                        qd0.b bVar = withdrawalAmountScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalAmountScreen.T;
                        return new CenteredAmountDelegate(new u7k.w(withdrawalAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalAmountScreen.T;
                        WithdrawalAmountScreen withdrawalAmountScreen2 = this.f278078b;
                        return dli.f.a(withdrawalAmountScreen2, (g) withdrawalAmountScreen2.S.getValue(), v.k((CenteredAmountDelegate) withdrawalAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = WithdrawalAmountScreen.T;
                        qji.b bVarU2 = withdrawalAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.di.WithdrawalAmountScreenInjector");
                        i72.w wVar = (i72.w) bVarU2;
                        return new a0(wVar.f159173b, wVar.f159174c, withdrawalAmountScreen);
                    default:
                        KProperty[] kPropertyArr5 = WithdrawalAmountScreen.T;
                        return (g) ((a0) withdrawalAmountScreen.R.getValue()).f159058m.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: u82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalAmountScreen f278078b;

            {
                this.f278078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WithdrawalAmountScreen withdrawalAmountScreen = this.f278078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                        qd0.b bVar = withdrawalAmountScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalAmountScreen.T;
                        return new CenteredAmountDelegate(new u7k.w(withdrawalAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalAmountScreen.T;
                        WithdrawalAmountScreen withdrawalAmountScreen2 = this.f278078b;
                        return dli.f.a(withdrawalAmountScreen2, (g) withdrawalAmountScreen2.S.getValue(), v.k((CenteredAmountDelegate) withdrawalAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = WithdrawalAmountScreen.T;
                        qji.b bVarU2 = withdrawalAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.di.WithdrawalAmountScreenInjector");
                        i72.w wVar = (i72.w) bVarU2;
                        return new a0(wVar.f159173b, wVar.f159174c, withdrawalAmountScreen);
                    default:
                        KProperty[] kPropertyArr5 = WithdrawalAmountScreen.T;
                        return (g) ((a0) withdrawalAmountScreen.R.getValue()).f159058m.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: u82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalAmountScreen f278078b;

            {
                this.f278078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WithdrawalAmountScreen withdrawalAmountScreen = this.f278078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                        qd0.b bVar = withdrawalAmountScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalAmountScreen.T;
                        return new CenteredAmountDelegate(new u7k.w(withdrawalAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalAmountScreen.T;
                        WithdrawalAmountScreen withdrawalAmountScreen2 = this.f278078b;
                        return dli.f.a(withdrawalAmountScreen2, (g) withdrawalAmountScreen2.S.getValue(), v.k((CenteredAmountDelegate) withdrawalAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = WithdrawalAmountScreen.T;
                        qji.b bVarU2 = withdrawalAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.di.WithdrawalAmountScreenInjector");
                        i72.w wVar = (i72.w) bVarU2;
                        return new a0(wVar.f159173b, wVar.f159174c, withdrawalAmountScreen);
                    default:
                        KProperty[] kPropertyArr5 = WithdrawalAmountScreen.T;
                        return (g) ((a0) withdrawalAmountScreen.R.getValue()).f159058m.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: u82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalAmountScreen f278078b;

            {
                this.f278078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WithdrawalAmountScreen withdrawalAmountScreen = this.f278078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                        qd0.b bVar = withdrawalAmountScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalAmountScreen.T;
                        return new CenteredAmountDelegate(new u7k.w(withdrawalAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalAmountScreen.T;
                        WithdrawalAmountScreen withdrawalAmountScreen2 = this.f278078b;
                        return dli.f.a(withdrawalAmountScreen2, (g) withdrawalAmountScreen2.S.getValue(), v.k((CenteredAmountDelegate) withdrawalAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = WithdrawalAmountScreen.T;
                        qji.b bVarU2 = withdrawalAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.di.WithdrawalAmountScreenInjector");
                        i72.w wVar = (i72.w) bVarU2;
                        return new a0(wVar.f159173b, wVar.f159174c, withdrawalAmountScreen);
                    default:
                        KProperty[] kPropertyArr5 = WithdrawalAmountScreen.T;
                        return (g) ((a0) withdrawalAmountScreen.R.getValue()).f159058m.get();
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: u82.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawalAmountScreen f278078b;

            {
                this.f278078b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                WithdrawalAmountScreen withdrawalAmountScreen = this.f278078b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WithdrawalAmountScreen.T;
                        qd0.b bVar = withdrawalAmountScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = WithdrawalAmountScreen.T;
                        return new CenteredAmountDelegate(new u7k.w(withdrawalAmountScreen, 1));
                    case 2:
                        KProperty[] kPropertyArr3 = WithdrawalAmountScreen.T;
                        WithdrawalAmountScreen withdrawalAmountScreen2 = this.f278078b;
                        return dli.f.a(withdrawalAmountScreen2, (g) withdrawalAmountScreen2.S.getValue(), v.k((CenteredAmountDelegate) withdrawalAmountScreen2.P.getValue(), new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = WithdrawalAmountScreen.T;
                        qji.b bVarU2 = withdrawalAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.ui.withdrawal.amount.di.WithdrawalAmountScreenInjector");
                        i72.w wVar = (i72.w) bVarU2;
                        return new a0(wVar.f159173b, wVar.f159174c, withdrawalAmountScreen);
                    default:
                        KProperty[] kPropertyArr5 = WithdrawalAmountScreen.T;
                        return (g) ((a0) withdrawalAmountScreen.R.getValue()).f159058m.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f293623g.setEnabled(uiState.f278085b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVarN = ((a0) this.R.getValue()).f159051a.k.n();
        s.j(bVarN);
        this.N = bVarN;
        pd.b.p(view, new TextLocalisedClause(R.string.apm_product_multibanco, null, null, 14));
        NavBarWithAvatar navBarWithAvatar = d3().d;
        navBarWithAvatar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.multibanco_back, null, null, 14), 126));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.multibanco_withdrawal_amount_title, null, null, 14));
        navBarWithAvatar.setAvatarImage(new ResourceImage(R$drawable.uikit_icn_16_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton largeActionButton = d3().f293623g;
        largeActionButton.setLoadingButtonTag("MULTIBANCO_WITHDRAWAL_AMOUNT_CTA_BUTTON_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.multibanco_withdrawal_amount_action, null, null, 14));
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59338a), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59339b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293623g.o), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.P.getValue()).d.f121375b), null, new f0(this, null, 2), 3);
    }

    public final w02.b d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w02.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
