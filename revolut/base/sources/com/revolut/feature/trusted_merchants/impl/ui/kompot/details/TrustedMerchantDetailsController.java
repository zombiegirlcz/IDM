package com.revolut.feature.trusted_merchants.impl.ui.kompot.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsContract$InputData;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.details.TrustedMerchantDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import jj9.b;
import jjg.e;
import jjg.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/details/TrustedMerchantDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Ljjg/c;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedMerchantDetailsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TrustedMerchantDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TrustedMerchantDetailsContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TrustedMerchantDetailsController(TrustedMerchantDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, e.f);
        this.N = w.y0(new b(3));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: jjg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantDetailsController f174947b;

            {
                this.f174947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedMerchantDetailsController trustedMerchantDetailsController = this.f174947b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantDetailsController.R;
                        TrustedMerchantDetailsController trustedMerchantDetailsController2 = this.f174947b;
                        return tki.g.a(trustedMerchantDetailsController2, (a) trustedMerchantDetailsController2.Q.getValue(), u.c((CellDetailsDelegate) trustedMerchantDetailsController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantDetailsController.R;
                        qji.b bVarU2 = trustedMerchantDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.details.di.TrustedMerchantDetailsControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        ejg.b bVar = dVar.f126896b;
                        ejg.d dVar2 = dVar.f126897c;
                        TrustedMerchantDetailsContract$InputData trustedMerchantDetailsContract$InputData = trustedMerchantDetailsController.K;
                        trustedMerchantDetailsContract$InputData.getClass();
                        return new ejg.a(bVar, dVar2, trustedMerchantDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantDetailsController.R;
                        return (a) ((ejg.a) trustedMerchantDetailsController.P.getValue()).f126881c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jjg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantDetailsController f174947b;

            {
                this.f174947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedMerchantDetailsController trustedMerchantDetailsController = this.f174947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantDetailsController.R;
                        TrustedMerchantDetailsController trustedMerchantDetailsController2 = this.f174947b;
                        return tki.g.a(trustedMerchantDetailsController2, (a) trustedMerchantDetailsController2.Q.getValue(), u.c((CellDetailsDelegate) trustedMerchantDetailsController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantDetailsController.R;
                        qji.b bVarU2 = trustedMerchantDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.details.di.TrustedMerchantDetailsControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        ejg.b bVar = dVar.f126896b;
                        ejg.d dVar2 = dVar.f126897c;
                        TrustedMerchantDetailsContract$InputData trustedMerchantDetailsContract$InputData = trustedMerchantDetailsController.K;
                        trustedMerchantDetailsContract$InputData.getClass();
                        return new ejg.a(bVar, dVar2, trustedMerchantDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantDetailsController.R;
                        return (a) ((ejg.a) trustedMerchantDetailsController.P.getValue()).f126881c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jjg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedMerchantDetailsController f174947b;

            {
                this.f174947b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustedMerchantDetailsController trustedMerchantDetailsController = this.f174947b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedMerchantDetailsController.R;
                        TrustedMerchantDetailsController trustedMerchantDetailsController2 = this.f174947b;
                        return tki.g.a(trustedMerchantDetailsController2, (a) trustedMerchantDetailsController2.Q.getValue(), u.c((CellDetailsDelegate) trustedMerchantDetailsController2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedMerchantDetailsController.R;
                        qji.b bVarU2 = trustedMerchantDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trusted_merchants.impl.ui.kompot.details.di.TrustedMerchantDetailsControllerInjector");
                        ejg.d dVar = (ejg.d) bVarU2;
                        ejg.b bVar = dVar.f126896b;
                        ejg.d dVar2 = dVar.f126897c;
                        TrustedMerchantDetailsContract$InputData trustedMerchantDetailsContract$InputData = trustedMerchantDetailsController.K;
                        trustedMerchantDetailsContract$InputData.getClass();
                        return new ejg.a(bVar, dVar2, trustedMerchantDetailsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TrustedMerchantDetailsController.R;
                        return (a) ((ejg.a) trustedMerchantDetailsController.P.getValue()).f126881c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        jjg.c uiState = (jjg.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f174944b, null);
        navBarWithToolbar.setDescriptionText(uiState.f174945c);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setEndIconImage(uiState.d);
        navBarWithToolbar.setActions(uiState.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ejg.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jjg.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j2c.b(this, null, 28), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.s0()), new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.O.getValue();
    }
}
