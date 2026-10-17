package com.revolut.feature.onboarding.impl.onboarding.passcode;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeCollectionScreenContract$PasscodeScreenMode;
import com.revolut.feature.onboarding.impl.onboarding.passcode.PasscodeScreen;
import com.revolut.feature.passcode.R$layout;
import com.revolut.feature.pincode.common.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.utils.PinCodeHinter;
import grl.k9;
import in0.g;
import iz1.p;
import j7b.l;
import java.util.List;
import jb9.d;
import jb9.f;
import jb9.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ta9.t;
import ta9.u;
import tx0.d0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/passcode/PasscodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljb9/d;", "Lcli/w;", "Ljb9/f;", "Lno/m;", "Lin0/g;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PasscodeScreen extends ViewController<d> implements w, m, g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PasscodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/passcode/databinding/FeatureScreenPasscodeBinding;", 0))};
    public final PasscodeCollectionScreenContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final AnalyticsProduct.Retail P;
    public final int Q;

    public PasscodeScreen(PasscodeCollectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, k.f);
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: jb9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f172619b;

            {
                this.f172619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PasscodeScreen passcodeScreen = this.f172619b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.R;
                        qji.b bVarU2 = passcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.passcode.di.PasscodeScreenInjector");
                        t tVar = (t) bVarU2;
                        ta9.m mVar = tVar.f269275b;
                        t tVar2 = tVar.f269276c;
                        PasscodeCollectionScreenContract$InputData passcodeCollectionScreenContract$InputData = passcodeScreen.K;
                        passcodeCollectionScreenContract$InputData.getClass();
                        return new u(mVar, tVar2, passcodeCollectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.R;
                        return (e) ((u) passcodeScreen.M.getValue()).f269279c.get();
                    default:
                        KProperty[] kPropertyArr3 = PasscodeScreen.R;
                        return n14.e.a(passcodeScreen, passcodeScreen.d());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: jb9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f172619b;

            {
                this.f172619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PasscodeScreen passcodeScreen = this.f172619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.R;
                        qji.b bVarU2 = passcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.passcode.di.PasscodeScreenInjector");
                        t tVar = (t) bVarU2;
                        ta9.m mVar = tVar.f269275b;
                        t tVar2 = tVar.f269276c;
                        PasscodeCollectionScreenContract$InputData passcodeCollectionScreenContract$InputData = passcodeScreen.K;
                        passcodeCollectionScreenContract$InputData.getClass();
                        return new u(mVar, tVar2, passcodeCollectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.R;
                        return (e) ((u) passcodeScreen.M.getValue()).f269279c.get();
                    default:
                        KProperty[] kPropertyArr3 = PasscodeScreen.R;
                        return n14.e.a(passcodeScreen, passcodeScreen.d());
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: jb9.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PasscodeScreen f172619b;

            {
                this.f172619b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PasscodeScreen passcodeScreen = this.f172619b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PasscodeScreen.R;
                        qji.b bVarU2 = passcodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.passcode.di.PasscodeScreenInjector");
                        t tVar = (t) bVarU2;
                        ta9.m mVar = tVar.f269275b;
                        t tVar2 = tVar.f269276c;
                        PasscodeCollectionScreenContract$InputData passcodeCollectionScreenContract$InputData = passcodeScreen.K;
                        passcodeCollectionScreenContract$InputData.getClass();
                        return new u(mVar, tVar2, passcodeCollectionScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PasscodeScreen.R;
                        return (e) ((u) passcodeScreen.M.getValue()).f269279c.get();
                    default:
                        KProperty[] kPropertyArr3 = PasscodeScreen.R;
                        return n14.e.a(passcodeScreen, passcodeScreen.d());
                }
            }
        });
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        this.P = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.Q = R$layout.feature_screen_passcode;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        PinCodeView passcodeScreenPasscode = d3().d;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenPasscode, "passcodeScreenPasscode");
        passcodeScreenPasscode.setHeader(new PinCodeView.Header.Title(6, uiState.f172614a, (TextLocalisedClause) null));
        if (uiState.f172615b) {
            passcodeScreenPasscode.p0();
            a aVar = (a) d();
            aVar.H2(aVar.f78464p, new l(20));
        }
        d3().f143273c.setNavigationButtonImage(uiState.f172616c ? new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f143273c.setBackground(d0.TRANSPARENT);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        PinCodeHinter pinCodeHinterA;
        Intrinsics.checkNotNullParameter(view, "view");
        PinCodeView passcodeScreenPasscode = d3().d;
        Intrinsics.checkNotNullExpressionValue(passcodeScreenPasscode, "passcodeScreenPasscode");
        PasscodeCollectionScreenContract$InputData passcodeCollectionScreenContract$InputData = this.K;
        PasscodeCollectionScreenContract$PasscodeScreenMode passcodeCollectionScreenContract$PasscodeScreenMode = passcodeCollectionScreenContract$InputData.f78460a;
        if (passcodeCollectionScreenContract$PasscodeScreenMode instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Creation) {
            PinCodeHinter.INSTANCE.getClass();
            pinCodeHinterA = new PinCodeHinter(6, 5, null, new TextLocalisedClause(R$string.revolut_passcode_pin_short_hint, null, null, 14));
        } else {
            if (!(passcodeCollectionScreenContract$PasscodeScreenMode instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            PinCodeHinter.INSTANCE.getClass();
            pinCodeHinterA = PinCodeHinter.Companion.a();
        }
        PasscodeCollectionScreenContract$PasscodeScreenMode passcodeCollectionScreenContract$PasscodeScreenMode2 = passcodeCollectionScreenContract$InputData.f78460a;
        if (!(passcodeCollectionScreenContract$PasscodeScreenMode2 instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Creation) && !(passcodeCollectionScreenContract$PasscodeScreenMode2 instanceof PasscodeCollectionScreenContract$PasscodeScreenMode.Confirmation)) {
            throw new NoWhenBranchMatchedException();
        }
        PinCodeView.setMode$default(passcodeScreenPasscode, new PinCodeView.Mode.Placeholder(6), null, 2, null);
        passcodeScreenPasscode.setPinCodeHinter(pinCodeHinterA);
        passcodeScreenPasscode.p0();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(passcodeScreenPasscode.x0()), null, new p(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(passcodeScreenPasscode.y0()), null, new jb9.l(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f143273c.f59211b), null, new jb9.l(this, null, 1), 3);
        e0m.e.a(d3().d);
    }

    public final ge9.a d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ge9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final jb9.e d() {
        return (jb9.e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
