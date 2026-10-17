package com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth;

import android.text.InputFilter;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.impl.R$layout;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreen;
import com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData;
import com.revolut.camerakit.revolut.ui.R$string;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import org.jetbrains.annotations.NotNull;
import pr.a0;
import rx0.j;
import t4j.c;
import te0.w;
import tki.h;
import tx0.j0;
import woc.p;
import xki.e;
import yp0.r;
import ys.b;
import ys.i;
import ys.s;
import ys.t;
import ys.u;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lys/s;", "Lno/k;", "Ltki/h;", "Lys/u;", "Companion", "a", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BiometricVerificationMyNumberDateOfBirthEditScreen extends ViewController<s> implements k, h {
    public final BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData K;
    public final ao.h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public AnalyticsContext Q;
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BiometricVerificationMyNumberDateOfBirthEditScreen.class, "binding", "getBinding()Lcom/revolut/biometric_verification/impl/databinding/ScreenBiometricVerificationMyNumberDateOfBirthEditBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.BiometricVerificationMyNumberDateOfBirthEditScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public BiometricVerificationMyNumberDateOfBirthEditScreen(BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = vc.s.t(this, b.f);
        this.M = R$layout.screen_biometric_verification_my_number_date_of_birth_edit;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ys.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDateOfBirthEditScreen f316335b;

            {
                this.f316335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BiometricVerificationMyNumberDateOfBirthEditScreen biometricVerificationMyNumberDateOfBirthEditScreen = this.f316335b;
                switch (i2) {
                    case 0:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDateOfBirthEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.di.BiometricVerificationMyNumberDateOfBirthEditScreenInjector");
                        pr.x xVar = (pr.x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        pr.x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData = biometricVerificationMyNumberDateOfBirthEditScreen.K;
                        biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData.getClass();
                        return new pr.a0(qVar, xVar2, biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion2 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return (t) ((pr.a0) biometricVerificationMyNumberDateOfBirthEditScreen.N.getValue()).f238828c.get();
                    default:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion3 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return tki.g.b(biometricVerificationMyNumberDateOfBirthEditScreen, biometricVerificationMyNumberDateOfBirthEditScreen.d());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ys.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDateOfBirthEditScreen f316335b;

            {
                this.f316335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BiometricVerificationMyNumberDateOfBirthEditScreen biometricVerificationMyNumberDateOfBirthEditScreen = this.f316335b;
                switch (i22) {
                    case 0:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDateOfBirthEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.di.BiometricVerificationMyNumberDateOfBirthEditScreenInjector");
                        pr.x xVar = (pr.x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        pr.x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData = biometricVerificationMyNumberDateOfBirthEditScreen.K;
                        biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData.getClass();
                        return new pr.a0(qVar, xVar2, biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion2 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return (t) ((pr.a0) biometricVerificationMyNumberDateOfBirthEditScreen.N.getValue()).f238828c.get();
                    default:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion3 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return tki.g.b(biometricVerificationMyNumberDateOfBirthEditScreen, biometricVerificationMyNumberDateOfBirthEditScreen.d());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: ys.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BiometricVerificationMyNumberDateOfBirthEditScreen f316335b;

            {
                this.f316335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BiometricVerificationMyNumberDateOfBirthEditScreen biometricVerificationMyNumberDateOfBirthEditScreen = this.f316335b;
                switch (i22) {
                    case 0:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        qji.b bVarU2 = biometricVerificationMyNumberDateOfBirthEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.biometric_verification.impl.ui.step.document.card_details_edit.date_of_birth.di.BiometricVerificationMyNumberDateOfBirthEditScreenInjector");
                        pr.x xVar = (pr.x) bVarU2;
                        pr.q qVar = xVar.f238907b;
                        pr.x xVar2 = xVar.f238908c;
                        BiometricVerificationMyNumberDateOfBirthEditScreenContract$InputData biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData = biometricVerificationMyNumberDateOfBirthEditScreen.K;
                        biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData.getClass();
                        return new pr.a0(qVar, xVar2, biometricVerificationMyNumberDateOfBirthEditScreenContract$InputData);
                    case 1:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion2 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return (t) ((pr.a0) biometricVerificationMyNumberDateOfBirthEditScreen.N.getValue()).f238828c.get();
                    default:
                        BiometricVerificationMyNumberDateOfBirthEditScreen.Companion companion3 = BiometricVerificationMyNumberDateOfBirthEditScreen.INSTANCE;
                        return tki.g.b(biometricVerificationMyNumberDateOfBirthEditScreen, biometricVerificationMyNumberDateOfBirthEditScreen.d());
                }
            }
        });
        this.Q = new AnalyticsContext(inputData.f50530b);
    }

    public static void g3(InputText inputText, String str) {
        if (String.valueOf(inputText.getText()).equals(str)) {
            return;
        }
        InputText.setText$default(inputText, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 2, null);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = e3().f;
        navBarWithToolbar.setTitle(uiState.f316362a, null);
        navBarWithToolbar.setDescriptionText(uiState.f316363b);
        InputText biometricVerificationMyNumberDobEditCalendar = e3().f218489b;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDobEditCalendar, "biometricVerificationMyNumberDobEditCalendar");
        InputText.setText$default(biometricVerificationMyNumberDobEditCalendar, uiState.f316364c, false, 2, null);
        InputText inputText = e3().f218491g;
        g3(inputText, uiState.d);
        TextLocalisedClause textLocalisedClause = uiState.f316365g;
        j jVar = j.OnFocus;
        inputText.setPlaceholder(textLocalisedClause, jVar);
        inputText.setInputFilters(zhm.u.c(new InputFilter.LengthFilter(uiState.f316366h)));
        InputText inputText2 = e3().e;
        g3(inputText2, uiState.e);
        inputText2.setPlaceholder(new TextLocalisedClause(R$string.vision_nfc_my_number_dob_month_placeholder, null, null, 14), jVar);
        InputText inputText3 = e3().f218490c;
        g3(inputText3, uiState.f);
        inputText3.setPlaceholder(new TextLocalisedClause(R$string.vision_nfc_my_number_dob_day_placeholder, null, null, 14), jVar);
        e3().d.setButtonEnabled(uiState.i);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.Q = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a0) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = e3().f;
        navBarWithToolbar.setAnalyticsContext(this.Q);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setDescriptionVisible(true);
        InputText inputText = e3().f218489b;
        this.Q = this.Q;
        inputText.setLabel(new TextLocalisedClause(R$string.vision_nfc_my_number_dob_calendar, null, null, 14));
        ResourceImage resourceImage = r.f315752a;
        Intrinsics.checkNotNullParameter(inputText, "<this>");
        inputText.setMainIconImage(r.f315752a);
        inputText.setFocusable(false);
        InputText biometricVerificationMyNumberDobEditYear = e3().f218491g;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDobEditYear, "biometricVerificationMyNumberDobEditYear");
        d3(biometricVerificationMyNumberDobEditYear, new TextLocalisedClause(R$string.vision_nfc_my_number_dob_year, null, null, 14), 5);
        InputText biometricVerificationMyNumberDobEditMonth = e3().e;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDobEditMonth, "biometricVerificationMyNumberDobEditMonth");
        d3(biometricVerificationMyNumberDobEditMonth, new TextLocalisedClause(R$string.vision_nfc_my_number_dob_month, null, null, 14), 5);
        InputText biometricVerificationMyNumberDobEditDay = e3().f218490c;
        Intrinsics.checkNotNullExpressionValue(biometricVerificationMyNumberDobEditDay, "biometricVerificationMyNumberDobEditDay");
        d3(biometricVerificationMyNumberDobEditDay, new TextLocalisedClause(R$string.vision_nfc_my_number_dob_day, null, null, 14), 6);
        e3().e.setInputFilters(zhm.u.c(new InputFilter.LengthFilter(2)));
        e3().f218490c.setInputFilters(zhm.u.c(new InputFilter.LengthFilter(2)));
        FooterActionButtonView footerActionButtonView = e3().d;
        footerActionButtonView.setAnalyticsContext(this.Q);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.vision_common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new yph.b(rd0.e.b(e3().f.f59410q), 3), new p(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 28), 3);
        ViewController.P2(this, new c(vkm.q.J(rd0.e.b(e3().f218489b.u0), rd0.e.b(e3().f218489b.y0())), 8), new p(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 29), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(e3().f218491g.s()), 4), new i(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 0), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(e3().e.s()), 5), new i(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 1), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(e3().f218490c.s()), 6), new p(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 26), 3);
        ViewController.P2(this, new yph.b(rd0.e.b(e3().d.f0()), 7), new p(2, d(), t.class, "onEvent", "onEvent(Lcom/revolut/biometric_verification/impl/ui/step/document/card_details_edit/date_of_birth/BiometricVerificationMyNumberDateOfBirthEditScreenContract$Event;)V", 4, 27), 3);
    }

    public final void d3(InputText inputText, TextLocalisedClause textLocalisedClause, int i) {
        this.Q = this.Q;
        inputText.setLabel(textLocalisedClause);
        inputText.setInputType(2);
        inputText.setImeOptions(i);
        inputText.setSingleLine(true);
    }

    public final nr.c e3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nr.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.P.getValue();
    }
}
