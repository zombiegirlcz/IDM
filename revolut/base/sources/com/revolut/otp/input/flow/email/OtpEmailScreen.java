package com.revolut.otp.input.flow.email;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.otp.input.R$string;
import com.revolut.otp.input.flow.email.OtpEmailScreen;
import com.revolut.otp.input.flow.email.OtpEmailScreenContract$InputData;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pni.c;
import pni.d;
import pni.f;
import pni.r;
import pni.s;
import pni.t;
import te0.w;
import wii.b;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/otp/input/flow/email/OtpEmailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpni/r;", "Ldli/a;", "Lpni/t;", "Lwii/b;", "revolut_otp_input_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtpEmailScreen extends ViewController<r> implements a, b {
    public final OtpEmailScreenContract$InputData K;
    public final Boolean L;
    public final Object M;
    public final int N;
    public final ModalTransitionAnimation.Style.POPUP O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public OtpEmailScreen(OtpEmailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = inputData.f98512g;
        final int i = 0;
        this.M = w.y0(new pni.a(0));
        this.N = R$layout.screen_recycler_view;
        this.O = ModalTransitionAnimation.Style.POPUP.f98391a;
        this.P = w.y0(new Function0(this) { // from class: pni.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpEmailScreen f237811b;

            {
                this.f237811b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        OtpEmailScreen otpEmailScreen = this.f237811b;
                        qji.b bVarU2 = otpEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.email.di.OtpEmailScreenInjector");
                        ini.a aVar = (ini.a) bVarU2;
                        ini.f fVar = aVar.f162953b;
                        ini.a aVar2 = aVar.f162954c;
                        OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = otpEmailScreen.K;
                        otpEmailScreenContract$InputData.getClass();
                        return new ini.e(fVar, aVar2, otpEmailScreenContract$InputData);
                    case 1:
                        return (s) ((ini.e) this.f237811b.P.getValue()).f162964c.get();
                    default:
                        OtpEmailScreen otpEmailScreen2 = this.f237811b;
                        return dli.f.a(otpEmailScreen2, otpEmailScreen2.d(), zhm.u.c(otpEmailScreen2.e3()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pni.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpEmailScreen f237811b;

            {
                this.f237811b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        OtpEmailScreen otpEmailScreen = this.f237811b;
                        qji.b bVarU2 = otpEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.email.di.OtpEmailScreenInjector");
                        ini.a aVar = (ini.a) bVarU2;
                        ini.f fVar = aVar.f162953b;
                        ini.a aVar2 = aVar.f162954c;
                        OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = otpEmailScreen.K;
                        otpEmailScreenContract$InputData.getClass();
                        return new ini.e(fVar, aVar2, otpEmailScreenContract$InputData);
                    case 1:
                        return (s) ((ini.e) this.f237811b.P.getValue()).f162964c.get();
                    default:
                        OtpEmailScreen otpEmailScreen2 = this.f237811b;
                        return dli.f.a(otpEmailScreen2, otpEmailScreen2.d(), zhm.u.c(otpEmailScreen2.e3()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: pni.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtpEmailScreen f237811b;

            {
                this.f237811b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        OtpEmailScreen otpEmailScreen = this.f237811b;
                        qji.b bVarU2 = otpEmailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.otp.input.flow.email.di.OtpEmailScreenInjector");
                        ini.a aVar = (ini.a) bVarU2;
                        ini.f fVar = aVar.f162953b;
                        ini.a aVar2 = aVar.f162954c;
                        OtpEmailScreenContract$InputData otpEmailScreenContract$InputData = otpEmailScreen.K;
                        otpEmailScreenContract$InputData.getClass();
                        return new ini.e(fVar, aVar2, otpEmailScreenContract$InputData);
                    case 1:
                        return (s) ((ini.e) this.f237811b.P.getValue()).f162964c.get();
                    default:
                        OtpEmailScreen otpEmailScreen2 = this.f237811b;
                        return dli.f.a(otpEmailScreen2, otpEmailScreen2.d(), zhm.u.c(otpEmailScreen2.e3()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((t) oVar);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Boolean getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ini.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.revolut_sso_email_verification_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(e3().f53079c), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().f53080g.f121375b), new pni.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().e), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(e3().d), new pnb.b(this, null, 1), 3);
    }

    @Override // wii.b
    public final ModalTransitionAnimation.Style d2() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final s d() {
        return (s) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PromptMarketingContentDelegate e3() {
        return (PromptMarketingContentDelegate) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
