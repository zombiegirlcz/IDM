package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details;

import aee.g;
import an9.i;
import android.text.InputFilter;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import at.b;
import at.c;
import at.n;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreen;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import nr.d;
import org.jetbrains.annotations.NotNull;
import pki.a;
import pr.b0;
import pr.x;
import rx0.j;
import tx0.j0;
import vc.s;
import vs.f;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lat/n;", "Lno/k;", "Lcli/w;", "Lat/o;", "Companion", "a", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationMyNumberDetailsEditScreen extends ViewController<n> implements k, w {
    public final BiometricVerificationMyNumberDetailsEditScreenContract$InputData K;
    public final h L;
    public boolean M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BiometricVerificationMyNumberDetailsEditScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationMyNumberDetailsEditBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.BiometricVerificationMyNumberDetailsEditScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BiometricVerificationMyNumberDetailsEditScreen(BiometricVerificationMyNumberDetailsEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.N = R$layout.screen_biometric_verification_my_number_details_edit;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: at.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDetailsEditScreen f8955b;

            {
                this.f8955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationMyNumberDetailsEditScreen biometricVerificationMyNumberDetailsEditScreen = this.f8955b;
                switch (i2) {
                    case 0:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDetailsEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.di.BiometricVerificationMyNumberDetailsEditScreenInjector");
                        x xVar = (x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDetailsEditScreenContract$InputData biometricVerificationMyNumberDetailsEditScreenContract$InputData = biometricVerificationMyNumberDetailsEditScreen.K;
                        biometricVerificationMyNumberDetailsEditScreenContract$InputData.getClass();
                        return new b0(qVar, xVar2, biometricVerificationMyNumberDetailsEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion2 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return (q) ((b0) biometricVerificationMyNumberDetailsEditScreen.O.getValue()).f238832c.get();
                    default:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion3 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return n14.e.a(biometricVerificationMyNumberDetailsEditScreen, biometricVerificationMyNumberDetailsEditScreen.d());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: at.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDetailsEditScreen f8955b;

            {
                this.f8955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationMyNumberDetailsEditScreen biometricVerificationMyNumberDetailsEditScreen = this.f8955b;
                switch (i22) {
                    case 0:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDetailsEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.di.BiometricVerificationMyNumberDetailsEditScreenInjector");
                        x xVar = (x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDetailsEditScreenContract$InputData biometricVerificationMyNumberDetailsEditScreenContract$InputData = biometricVerificationMyNumberDetailsEditScreen.K;
                        biometricVerificationMyNumberDetailsEditScreenContract$InputData.getClass();
                        return new b0(qVar, xVar2, biometricVerificationMyNumberDetailsEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion2 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return (q) ((b0) biometricVerificationMyNumberDetailsEditScreen.O.getValue()).f238832c.get();
                    default:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion3 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return n14.e.a(biometricVerificationMyNumberDetailsEditScreen, biometricVerificationMyNumberDetailsEditScreen.d());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: at.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDetailsEditScreen f8955b;

            {
                this.f8955b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationMyNumberDetailsEditScreen biometricVerificationMyNumberDetailsEditScreen = this.f8955b;
                switch (i22) {
                    case 0:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDetailsEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.details.di.BiometricVerificationMyNumberDetailsEditScreenInjector");
                        x xVar = (x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDetailsEditScreenContract$InputData biometricVerificationMyNumberDetailsEditScreenContract$InputData = biometricVerificationMyNumberDetailsEditScreen.K;
                        biometricVerificationMyNumberDetailsEditScreenContract$InputData.getClass();
                        return new b0(qVar, xVar2, biometricVerificationMyNumberDetailsEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion2 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return (q) ((b0) biometricVerificationMyNumberDetailsEditScreen.O.getValue()).f238832c.get();
                    default:
                        BiometricVerificationMyNumberDetailsEditScreen.Companion companion3 = BiometricVerificationMyNumberDetailsEditScreen.INSTANCE;
                        return n14.e.a(biometricVerificationMyNumberDetailsEditScreen, biometricVerificationMyNumberDetailsEditScreen.d());
                }
            }
        });
        this.R = new AnalyticsContext(inputData.f50538c);
    }

    public static void g3(InputText inputText, String str) {
        if (String.valueOf(inputText.getText()).equals(str)) {
            return;
        }
        InputText.setText$default(inputText, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        at.o uiState = (at.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = e3().d;
        navBarWithToolbar.setTitle(uiState.f8968a, null);
        navBarWithToolbar.setDescriptionText(uiState.f8969b);
        InputText biometricVerificationMyNumberDetailsEditExpiryYear = e3().f218493b;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDetailsEditExpiryYear, "biometricVerificationMyNumberDetailsEditExpiryYear");
        g3(biometricVerificationMyNumberDetailsEditExpiryYear, uiState.f8970c);
        InputText inputText = e3().e;
        Intrinsics.checkNotNullExpressionValue(inputText, "biometricVerificationMyN…erDetailsEditSecurityCode");
        g3(inputText, uiState.d);
        e3().f218494c.setButtonEnabled(uiState.e);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = e3().d;
        navBarWithToolbar.setAnalyticsContext(this.R);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        InputText biometricVerificationMyNumberDetailsEditExpiryYear = e3().f218493b;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDetailsEditExpiryYear, "biometricVerificationMyNumberDetailsEditExpiryYear");
        d3(biometricVerificationMyNumberDetailsEditExpiryYear, new TextLocalisedClause(R$string.vision_nfc_my_number_details_year_of_expiry, null, null, 14), new TextLocalisedClause(R$string.vision_nfc_my_number_details_year_of_expiry_placeholder, null, null, 14), 5);
        InputText inputText = e3().e;
        Intrinsics.checkNotNullExpressionValue(inputText, "biometricVerificationMyN…erDetailsEditSecurityCode");
        d3(inputText, new TextLocalisedClause(R$string.vision_nfc_my_number_details_security_code, null, null, 14), new TextLocalisedClause(R$string.vision_nfc_my_number_details_security_code_placeholder, null, null, 14), 6);
        FooterActionButtonView footerActionButtonView = e3().f218494c;
        footerActionButtonView.setAnalyticsContext(this.R);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        InputText inputText;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 4;
        ViewController.P2(this, new i(rd0.e.b(e3().d.f59410q), 8), new g(2, d(), at.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreenContract$Event;)V", 4, i), 3);
        int i2 = 2;
        ViewController.P2(this, new i(rd0.e.b(e3().f218493b.s()), 9), new g(i2, d(), at.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreenContract$Event;)V", i, 5), 3);
        ViewController.P2(this, new i(rd0.e.b(e3().e.s()), 10), new g(i2, d(), at.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreenContract$Event;)V", i, 6), 3);
        ViewController.P2(this, new i(rd0.e.b(e3().f218494c.f0()), 11), new g(i2, d(), at.q.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/details/BiometricVerificationMyNumberDetailsEditScreenContract$Event;)V", i, 7), 3);
        if (this.M) {
            return;
        }
        f fVar = this.K.f50537b;
        int i3 = fVar == null ? -1 : b.f8956a[fVar.ordinal()];
        if (i3 == -1) {
            inputText = null;
        } else if (i3 == 1) {
            inputText = e3().f218493b;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            inputText = null;
        } else {
            inputText = e3().e;
        }
        if (inputText != null) {
            inputText.C0(true);
        }
        this.M = true;
    }

    public final void d3(InputText inputText, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i) {
        this.R = this.R;
        inputText.setLabel(textLocalisedClause);
        inputText.setPlaceholder(textLocalisedClause2, j.OnFocus);
        inputText.setInputType(2);
        inputText.setInputFilters(u.c(new InputFilter.LengthFilter(4)));
        inputText.setImeOptions(i);
        inputText.setSingleLine(true);
    }

    public final d e3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final at.q d() {
        return (at.q) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.Q.getValue();
    }
}
