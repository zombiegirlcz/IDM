package com.revolut.feature.external_accounts.impl.ui.link.screens.iban;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import java.util.List;
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
import vn6.b;
import vn6.c;
import vn6.f;
import vn6.g;
import xf6.w0;
import xf6.x0;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/screens/iban/IbanScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvn6/f;", "Ldli/a;", "Lvn6/h;", "Companion", "a", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IbanScreen extends ViewController<f> implements a {
    public final IbanScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final InputTextDelegate P;
    public final Object Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(IbanScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public IbanScreen(IbanScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: vn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IbanScreen f290758b;

            {
                this.f290758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IbanScreen ibanScreen = this.f290758b;
                switch (i2) {
                    case 0:
                        IbanScreen.Companion companion = IbanScreen.INSTANCE;
                        qji.b bVarU2 = ibanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.iban.di.IbanScreenInjector");
                        w0 w0Var = (w0) ((wn6.a) bVarU2).b().mo3808a(ibanScreen);
                        IbanScreenContract$InputData ibanScreenContract$InputData = ibanScreen.K;
                        switch (w0Var.f305128a) {
                            case 0:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            case 1:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            default:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        IbanScreen.Companion companion2 = IbanScreen.INSTANCE;
                        x0 x0Var = (x0) ibanScreen.N.getValue();
                        switch (x0Var.f305155a) {
                            case 0:
                                return (g) x0Var.e.get();
                            case 1:
                                return (g) x0Var.e.get();
                            default:
                                return (g) x0Var.e.get();
                        }
                    default:
                        IbanScreen.Companion companion3 = IbanScreen.INSTANCE;
                        IbanScreen ibanScreen2 = this.f290758b;
                        return dli.f.a(ibanScreen2, (g) ibanScreen2.O.getValue(), u.c(ibanScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: vn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IbanScreen f290758b;

            {
                this.f290758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IbanScreen ibanScreen = this.f290758b;
                switch (i22) {
                    case 0:
                        IbanScreen.Companion companion = IbanScreen.INSTANCE;
                        qji.b bVarU2 = ibanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.iban.di.IbanScreenInjector");
                        w0 w0Var = (w0) ((wn6.a) bVarU2).b().mo3808a(ibanScreen);
                        IbanScreenContract$InputData ibanScreenContract$InputData = ibanScreen.K;
                        switch (w0Var.f305128a) {
                            case 0:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            case 1:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            default:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        IbanScreen.Companion companion2 = IbanScreen.INSTANCE;
                        x0 x0Var = (x0) ibanScreen.N.getValue();
                        switch (x0Var.f305155a) {
                            case 0:
                                return (g) x0Var.e.get();
                            case 1:
                                return (g) x0Var.e.get();
                            default:
                                return (g) x0Var.e.get();
                        }
                    default:
                        IbanScreen.Companion companion3 = IbanScreen.INSTANCE;
                        IbanScreen ibanScreen2 = this.f290758b;
                        return dli.f.a(ibanScreen2, (g) ibanScreen2.O.getValue(), u.c(ibanScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new InputTextDelegate(new vh9.b(this, 10));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vn6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IbanScreen f290758b;

            {
                this.f290758b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IbanScreen ibanScreen = this.f290758b;
                switch (i22) {
                    case 0:
                        IbanScreen.Companion companion = IbanScreen.INSTANCE;
                        qji.b bVarU2 = ibanScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.link.screens.iban.di.IbanScreenInjector");
                        w0 w0Var = (w0) ((wn6.a) bVarU2).b().mo3808a(ibanScreen);
                        IbanScreenContract$InputData ibanScreenContract$InputData = ibanScreen.K;
                        switch (w0Var.f305128a) {
                            case 0:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            case 1:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                            default:
                                ibanScreenContract$InputData.getClass();
                                w0Var.d = ibanScreenContract$InputData;
                                break;
                        }
                        return (x0) w0Var.mo3783build();
                    case 1:
                        IbanScreen.Companion companion2 = IbanScreen.INSTANCE;
                        x0 x0Var = (x0) ibanScreen.N.getValue();
                        switch (x0Var.f305155a) {
                            case 0:
                                return (g) x0Var.e.get();
                            case 1:
                                return (g) x0Var.e.get();
                            default:
                                return (g) x0Var.e.get();
                        }
                    default:
                        IbanScreen.Companion companion3 = IbanScreen.INSTANCE;
                        IbanScreen ibanScreen2 = this.f290758b;
                        return dli.f.a(ibanScreen2, (g) ibanScreen2.O.getValue(), u.c(ibanScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vn6.h uiState = (vn6.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174551b.setLargeButtonEnabled(uiState.f290764b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        IbanScreenContract$InputData ibanScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(ibanScreenContract$InputData.f73050a);
        navBarWithToolbar.setTitle(ibanScreenContract$InputData.f73050a, null);
        navBarWithToolbar.setDescriptionText(ibanScreenContract$InputData.f73051b);
        navBarWithToolbar.setDescriptionVisible(true);
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R.string.common_action_continue, null, null, 14));
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new c(this, continuation, 2), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
