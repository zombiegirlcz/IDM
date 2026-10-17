package xab;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303825b;

    public /* synthetic */ i(LoginFragment loginFragment, int i) {
        this.f303824a = i;
        this.f303825b = loginFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f303824a) {
            case 0:
                rp0.c result = (rp0.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result.b(), "DIALOG_ID_BIOMETRIC_PROMPT")) {
                    boolean z = result.a() == AlertDialogDisplayer$Button.POSITIVE;
                    LoginFragment loginFragment = this.f303825b;
                    uab.a aVar = loginFragment.p0;
                    if (aVar == null) {
                        Intrinsics.r("biometricInteractor");
                        throw null;
                    }
                    aVar.f278560a.l("FINGERPRINT_USER_ASKED", true);
                    if (z) {
                        ifm.b bVar = loginFragment.f104326b0;
                        pfm.h hVar = new pfm.h(new d(loginFragment, 4), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        Intrinsics.checkNotNullParameter(hVar, "<this>");
                        efm.b bVarU = mo3.a.u(o70.a.g(te0.w.g0(hVar)), loginFragment.I().getProgressView(), true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        g gVar = new g(loginFragment, 1);
                        c cVar = new c(loginFragment, 13);
                        pfm.a aVar2 = new pfm.a(bVarU, new gn.b(12, new x94.q(new BreadcrumbException(), 7)), 2);
                        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                        ofm.h hVarW = aVar2.w(new bo.e(13, cVar), new t1i.n(21, gVar));
                        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                        te0.w.j0(bVar, hVarW);
                    } else {
                        loginFragment.C0();
                    }
                }
                return Unit.f186387a;
            case 1:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f303825b.requireActivity().onBackPressed();
                return Unit.f186387a;
            case 2:
                PinCodeView.a it9 = (PinCodeView.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f303825b.X();
                return Unit.f186387a;
            case 3:
                String pincode = (String) obj2;
                Intrinsics.checkNotNullParameter(pincode, "pincode");
                this.f303825b.b0(new mm0.d(pincode));
                return Unit.f186387a;
            case 4:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                w0 w0Var = (w0) this.f303825b.C();
                w0Var.f303861p.getClass();
                boolean zA = a.a();
                y0 y0Var = (y0) w0Var.L();
                if (y0Var != null) {
                    ((LoginFragment) y0Var).M().c(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, zA, UserAuthFeatureConfig.UseCase.ForgotPasscode.f99358a, 7)));
                }
                return Unit.f186387a;
            case 5:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                zl0.e eVar = this.f303825b.g0;
                if (eVar != null) {
                    eVar.b();
                }
                return Unit.f186387a;
            default:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                LoginFragment loginFragment2 = this.f303825b;
                PinCodeView pinCodeView = loginFragment2.m0;
                if (pinCodeView == null) {
                    Intrinsics.r("pinCodeView");
                    throw null;
                }
                pinCodeView.r0();
                PinCodeView pinCodeView2 = loginFragment2.m0;
                if (pinCodeView2 == null) {
                    Intrinsics.r("pinCodeView");
                    throw null;
                }
                pinCodeView2.F0(true);
                zl0.e eVar2 = loginFragment2.g0;
                if (eVar2 != null) {
                    eVar2.b();
                }
                return Unit.f186387a;
        }
    }
}
