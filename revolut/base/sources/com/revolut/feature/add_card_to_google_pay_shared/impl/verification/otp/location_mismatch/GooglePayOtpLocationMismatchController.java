package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ch1.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.add_card_to_google_pay_shared.impl.R$string;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchController;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/otp/location_mismatch/GooglePayOtpLocationMismatchController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/otp/location_mismatch/c;", "Ltki/c;", "Lch1/k;", "Lin0/g;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayOtpLocationMismatchController extends ViewController<c> implements tki.c, g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(GooglePayOtpLocationMismatchController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final GooglePayOtpLocationMismatchScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;

    public GooglePayOtpLocationMismatchController(GooglePayOtpLocationMismatchScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ch1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpLocationMismatchController f24101b;

            {
                this.f24101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = this.f24101b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayOtpLocationMismatchController.Q;
                        qji.b bVarU2 = googlePayOtpLocationMismatchController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.di.GooglePayOtpLocationMismatchControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = googlePayOtpLocationMismatchController.K;
                        googlePayOtpLocationMismatchScreenContract$InputData.getClass();
                        return new og1.g(iVar, eVar2, googlePayOtpLocationMismatchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayOtpLocationMismatchController.Q;
                        return (h) ((og1.g) googlePayOtpLocationMismatchController.L.getValue()).f224974c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayOtpLocationMismatchController.Q;
                        GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController2 = this.f24101b;
                        return tki.g.a(googlePayOtpLocationMismatchController2, (h) googlePayOtpLocationMismatchController2.O.getValue(), v.k(new CellDetailsDelegate(), new MapPlainDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_two_buttons;
        this.N = s.t(this, ch1.b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ch1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpLocationMismatchController f24101b;

            {
                this.f24101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = this.f24101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayOtpLocationMismatchController.Q;
                        qji.b bVarU2 = googlePayOtpLocationMismatchController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.di.GooglePayOtpLocationMismatchControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = googlePayOtpLocationMismatchController.K;
                        googlePayOtpLocationMismatchScreenContract$InputData.getClass();
                        return new og1.g(iVar, eVar2, googlePayOtpLocationMismatchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayOtpLocationMismatchController.Q;
                        return (h) ((og1.g) googlePayOtpLocationMismatchController.L.getValue()).f224974c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayOtpLocationMismatchController.Q;
                        GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController2 = this.f24101b;
                        return tki.g.a(googlePayOtpLocationMismatchController2, (h) googlePayOtpLocationMismatchController2.O.getValue(), v.k(new CellDetailsDelegate(), new MapPlainDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ch1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayOtpLocationMismatchController f24101b;

            {
                this.f24101b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController = this.f24101b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GooglePayOtpLocationMismatchController.Q;
                        qji.b bVarU2 = googlePayOtpLocationMismatchController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.di.GooglePayOtpLocationMismatchControllerInjector");
                        og1.e eVar = (og1.e) bVarU2;
                        og1.i iVar = eVar.f224967b;
                        og1.e eVar2 = eVar.f224968c;
                        GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = googlePayOtpLocationMismatchController.K;
                        googlePayOtpLocationMismatchScreenContract$InputData.getClass();
                        return new og1.g(iVar, eVar2, googlePayOtpLocationMismatchScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = GooglePayOtpLocationMismatchController.Q;
                        return (h) ((og1.g) googlePayOtpLocationMismatchController.L.getValue()).f224974c.get();
                    default:
                        KProperty[] kPropertyArr3 = GooglePayOtpLocationMismatchController.Q;
                        GooglePayOtpLocationMismatchController googlePayOtpLocationMismatchController2 = this.f24101b;
                        return tki.g.a(googlePayOtpLocationMismatchController2, (h) googlePayOtpLocationMismatchController2.O.getValue(), v.k(new CellDetailsDelegate(), new MapPlainDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (og1.g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ch1.h) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.xpay_location_mismatch_generic_title, null, null, 14), null);
        d3().f174573b.setText(new TextLocalisedClause(R$string.xpay_location_mismatch_button_confirm, null, null, 14));
        LargeActionButton largeActionButton = d3().e;
        largeActionButton.setText(new TextLocalisedClause(R$string.xpay_location_mismatch_button_cancel, null, null, 14));
        largeActionButton.o(LargeActionButton.ButtonStyle.f);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new ch1.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new ch1.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new ch1.c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
