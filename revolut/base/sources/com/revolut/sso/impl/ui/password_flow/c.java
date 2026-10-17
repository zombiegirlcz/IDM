package com.revolut.sso.impl.ui.password_flow;

import bjl.p0;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.passcode.PasscodeScreen;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.feature.passcode.PasscodeScreenContract$VerificationMode;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlow;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$InputData;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.PasswordEvidence;
import com.revolut.sso.api.models.PasswordEvidenceType;
import com.revolut.sso.api.models.PasswordScreenCustomization;
import com.revolut.sso.api.models.PinEvidence;
import com.revolut.sso.api.models.UICustomization;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Mode;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Step;
import com.revolut.sso.impl.ui.password_flow.a;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreen;
import com.revolut.sso.impl.ui.password_flow.password_input.PasswordInputScreenContract$InputData;
import de9.j;
import de9.k;
import de9.m;
import dki.g;
import jol.d;
import ke9.h;
import ke9.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import tll.n;
import yji.l;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends g implements d {
    public final UICustomization A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final PasswordFlowContract$InputData f106629t;
    public final p0 u;
    public final wl0.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final me9.a f106630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final oe9.a f106631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n f106632y;
    public final jol.b z;

    public c(PasswordFlowContract$InputData inputData, p0 revolutSsoDependenciesProvider, wl0.c biometricHelper, me9.a biometricPasscodeVerificationResultDispatcher, oe9.a passcodeVerificationDispatcher, n parentStateReceiver, jol.b authenticationFlowDialogsFactory, UICustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(biometricPasscodeVerificationResultDispatcher, "biometricPasscodeVerificationResultDispatcher");
        Intrinsics.checkNotNullParameter(passcodeVerificationDispatcher, "passcodeVerificationDispatcher");
        Intrinsics.checkNotNullParameter(parentStateReceiver, "parentStateReceiver");
        Intrinsics.checkNotNullParameter(authenticationFlowDialogsFactory, "authenticationFlowDialogsFactory");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        this.f106629t = inputData;
        this.u = revolutSsoDependenciesProvider;
        this.v = biometricHelper;
        this.f106630w = biometricPasscodeVerificationResultDispatcher;
        this.f106631x = passcodeVerificationDispatcher;
        this.f106632y = parentStateReceiver;
        this.z = authenticationFlowDialogsFactory;
        this.A = uiCustomization;
    }

    public static final void O2(c cVar) {
        ((jol.c) cVar.z).getClass();
        Intrinsics.checkNotNullParameter("PASSCODE_SCREEN_ID_PASSCODE_ERROR_DIALOG", "dialogId");
        l.a1(cVar, cVar.X1(new y0("PASSCODE_SCREEN_ID_PASSCODE_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.revolut_sso_login_incorrect_passcode_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_incorrect_passcode_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4)), null, null, null, 7);
    }

    public final PasscodeScreenContract$InputData P2(PasswordFlowContract$Mode passwordFlowContract$Mode) {
        this.u.getClass();
        Integer d = passwordFlowContract$Mode.getD();
        PinCodeView.Mode placeholder = d != null ? new PinCodeView.Mode.Placeholder(d.intValue()) : PinCodeView.Mode.Dynamic.f59608a;
        boolean z = passwordFlowContract$Mode instanceof PasswordFlowContract$Mode.Confirmation;
        PasswordFlowContract$InputData passwordFlowContract$InputData = this.f106629t;
        if (z) {
            return PasscodeScreenContract$InputData.Companion.d(PasscodeScreenContract$InputData.INSTANCE, new PinCodeView.Header.Title(6, new TextLocalisedClause(R$string.revolut_sso_login_input_passcode_title, null, null, 14), (TextLocalisedClause) null), placeholder, new PasscodeScreenContract$VerificationMode.Default(((PasswordFlowContract$Mode.Confirmation) passwordFlowContract$Mode).f106617a), false, mql.a.f208025a, passwordFlowContract$InputData.f106616c, SyslogConstants.LOG_CLOCK);
        }
        boolean z3 = passwordFlowContract$Mode instanceof PasswordFlowContract$Mode.Default;
        UICustomization uICustomization = this.A;
        if (z3) {
            PasscodeScreenContract$InputData.Companion companion = PasscodeScreenContract$InputData.INSTANCE;
            PinCodeView.Header.Title title = new PinCodeView.Header.Title(6, new TextLocalisedClause(R$string.revolut_sso_login_input_passcode_title, null, null, 14), (TextLocalisedClause) null);
            PasscodeScreenContract$VerificationMode.Default r56 = new PasscodeScreenContract$VerificationMode.Default(((PasswordFlowContract$Mode.Default) passwordFlowContract$Mode).f106619a);
            PasswordScreenCustomization passwordScreenCustomization = uICustomization.d;
            return PasscodeScreenContract$InputData.Companion.a(companion, title, placeholder, r56, passwordScreenCustomization.f105966c, passwordScreenCustomization.d, mql.a.f208025a, passwordScreenCustomization.e, passwordFlowContract$InputData.f106616c);
        }
        if (!(passwordFlowContract$Mode instanceof PasswordFlowContract$Mode.Welcome)) {
            throw new NoWhenBranchMatchedException();
        }
        PasscodeScreenContract$InputData.Companion companion2 = PasscodeScreenContract$InputData.INSTANCE;
        PasswordFlowContract$Mode.Welcome welcome = (PasswordFlowContract$Mode.Welcome) passwordFlowContract$Mode;
        Clause title2 = welcome.f106621a;
        Image image = welcome.f106622b;
        Intrinsics.checkNotNullParameter(title2, "title");
        PinCodeView.Header.TitleImage titleImage = new PinCodeView.Header.TitleImage(title2, image != null ? new ImageWithAnimatedBackgroundView.Model(image, null) : null, null, null);
        PasscodeScreenContract$VerificationMode.Default r59 = new PasscodeScreenContract$VerificationMode.Default(welcome.f106623c);
        PasswordScreenCustomization passwordScreenCustomization2 = uICustomization.d;
        return PasscodeScreenContract$InputData.Companion.a(companion2, titleImage, placeholder, r59, passwordScreenCustomization2.f105966c, passwordScreenCustomization2.d, mql.a.f208025a, passwordScreenCustomization2.e, passwordFlowContract$InputData.f106616c);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, this.f106632y.f272117a, null, new b(this, null), 3);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PasswordFlowContract$Step step = (PasswordFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean zF = Intrinsics.f(step, PasswordFlowContract$Step.Passcode.f106624a);
        PasswordFlowContract$InputData passwordFlowContract$InputData = this.f106629t;
        if (!zF) {
            if (!Intrinsics.f(step, PasswordFlowContract$Step.Password.f106625a)) {
                throw new NoWhenBranchMatchedException();
            }
            PasswordScreenCustomization passwordScreenCustomization = this.A.d;
            PasswordInputScreen passwordInputScreen = new PasswordInputScreen(new PasswordInputScreenContract$InputData(passwordScreenCustomization.f105965b, passwordScreenCustomization.f105966c, passwordFlowContract$InputData.f106616c));
            final int i = 2;
            Function1 function1 = new Function1(this) { // from class: jol.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.password_flow.c f177171b;

                {
                    this.f177171b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            i outputData = (i) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof ke9.g;
                            com.revolut.sso.impl.ui.password_flow.c cVar = this.f177171b;
                            if (z) {
                                String secret = ((ke9.g) outputData).f183056a;
                                Intrinsics.checkNotNullParameter(secret, "secret");
                                cVar.G2(new e(new PinEvidence(secret)));
                            } else if (outputData instanceof ke9.d) {
                                ke9.d dVar = (ke9.d) outputData;
                                cVar.G2(new f(dVar.f183052a, dVar.f183053b));
                            } else if (outputData instanceof ke9.f) {
                                cVar.G2(a.C0639a.f106626a);
                            } else if (outputData instanceof h) {
                                cVar.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                            } else {
                                if (!(outputData instanceof ke9.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.X1(((c) cVar.z).e("PASSWORD_SCREEN_ID_GENERIC_ERROR_DIALOG"));
                            }
                            return Unit.f186387a;
                        case 1:
                            m outputData2 = (m) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z3 = outputData2 instanceof j;
                            com.revolut.sso.impl.ui.password_flow.c cVar2 = this.f177171b;
                            if (z3) {
                                String secret2 = ((j) outputData2).f113326a;
                                Intrinsics.checkNotNullParameter(secret2, "secret");
                                cVar2.G2(new e(new PinEvidence(secret2)));
                            } else if (outputData2 instanceof k) {
                                k kVar = (k) outputData2;
                                cVar2.G2(new f(kVar.f113327a, kVar.f113328b));
                            } else if (outputData2 instanceof de9.i) {
                                cVar2.G2(a.C0639a.f106626a);
                            } else {
                                if (!(outputData2 instanceof de9.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                            }
                            return Unit.f186387a;
                        default:
                            lol.i result = (lol.i) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z4 = result instanceof lol.h;
                            com.revolut.sso.impl.ui.password_flow.c cVar3 = this.f177171b;
                            if (z4) {
                                cVar3.G2(new e(new PasswordEvidence(((lol.h) result).f197471a)));
                            } else {
                                if (!Intrinsics.f(result, lol.g.f197470a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar3.G2(a.b.f106627a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            passwordInputScreen.H = function1;
            return passwordInputScreen;
        }
        if (this.v.f298341b.a() != wl0.i.CUSTOM) {
            BiometricPasscodeVerificationFlow biometricPasscodeVerificationFlow = new BiometricPasscodeVerificationFlow(new BiometricPasscodeVerificationFlowContract$InputData(mql.a.f208025a, P2(passwordFlowContract$InputData.f106615b)));
            final int i2 = 0;
            Function1 block = new Function1(this) { // from class: jol.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.sso.impl.ui.password_flow.c f177171b;

                {
                    this.f177171b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            i outputData = (i) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof ke9.g;
                            com.revolut.sso.impl.ui.password_flow.c cVar = this.f177171b;
                            if (z) {
                                String secret = ((ke9.g) outputData).f183056a;
                                Intrinsics.checkNotNullParameter(secret, "secret");
                                cVar.G2(new e(new PinEvidence(secret)));
                            } else if (outputData instanceof ke9.d) {
                                ke9.d dVar = (ke9.d) outputData;
                                cVar.G2(new f(dVar.f183052a, dVar.f183053b));
                            } else if (outputData instanceof ke9.f) {
                                cVar.G2(a.C0639a.f106626a);
                            } else if (outputData instanceof h) {
                                cVar.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                            } else {
                                if (!(outputData instanceof ke9.e)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.X1(((c) cVar.z).e("PASSWORD_SCREEN_ID_GENERIC_ERROR_DIALOG"));
                            }
                            return Unit.f186387a;
                        case 1:
                            m outputData2 = (m) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean z3 = outputData2 instanceof j;
                            com.revolut.sso.impl.ui.password_flow.c cVar2 = this.f177171b;
                            if (z3) {
                                String secret2 = ((j) outputData2).f113326a;
                                Intrinsics.checkNotNullParameter(secret2, "secret");
                                cVar2.G2(new e(new PinEvidence(secret2)));
                            } else if (outputData2 instanceof k) {
                                k kVar = (k) outputData2;
                                cVar2.G2(new f(kVar.f113327a, kVar.f113328b));
                            } else if (outputData2 instanceof de9.i) {
                                cVar2.G2(a.C0639a.f106626a);
                            } else {
                                if (!(outputData2 instanceof de9.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar2.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                            }
                            return Unit.f186387a;
                        default:
                            lol.i result = (lol.i) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            boolean z4 = result instanceof lol.h;
                            com.revolut.sso.impl.ui.password_flow.c cVar3 = this.f177171b;
                            if (z4) {
                                cVar3.G2(new e(new PasswordEvidence(((lol.h) result).f197471a)));
                            } else {
                                if (!Intrinsics.f(result, lol.g.f197470a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar3.G2(a.b.f106627a);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            biometricPasscodeVerificationFlow.H = block;
            return biometricPasscodeVerificationFlow;
        }
        PasscodeScreen passcodeScreen = new PasscodeScreen(P2(passwordFlowContract$InputData.f106615b));
        final int i3 = 1;
        Function1 function12 = new Function1(this) { // from class: jol.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.sso.impl.ui.password_flow.c f177171b;

            {
                this.f177171b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        i outputData = (i) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof ke9.g;
                        com.revolut.sso.impl.ui.password_flow.c cVar = this.f177171b;
                        if (z) {
                            String secret = ((ke9.g) outputData).f183056a;
                            Intrinsics.checkNotNullParameter(secret, "secret");
                            cVar.G2(new e(new PinEvidence(secret)));
                        } else if (outputData instanceof ke9.d) {
                            ke9.d dVar = (ke9.d) outputData;
                            cVar.G2(new f(dVar.f183052a, dVar.f183053b));
                        } else if (outputData instanceof ke9.f) {
                            cVar.G2(a.C0639a.f106626a);
                        } else if (outputData instanceof h) {
                            cVar.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                        } else {
                            if (!(outputData instanceof ke9.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar.X1(((c) cVar.z).e("PASSWORD_SCREEN_ID_GENERIC_ERROR_DIALOG"));
                        }
                        return Unit.f186387a;
                    case 1:
                        m outputData2 = (m) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean z3 = outputData2 instanceof j;
                        com.revolut.sso.impl.ui.password_flow.c cVar2 = this.f177171b;
                        if (z3) {
                            String secret2 = ((j) outputData2).f113326a;
                            Intrinsics.checkNotNullParameter(secret2, "secret");
                            cVar2.G2(new e(new PinEvidence(secret2)));
                        } else if (outputData2 instanceof k) {
                            k kVar = (k) outputData2;
                            cVar2.G2(new f(kVar.f113327a, kVar.f113328b));
                        } else if (outputData2 instanceof de9.i) {
                            cVar2.G2(a.C0639a.f106626a);
                        } else {
                            if (!(outputData2 instanceof de9.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar2.E2(PasswordFlowContract$Step.Password.f106625a, true, TransitionAnimation.FADE.f98392a, false);
                        }
                        return Unit.f186387a;
                    default:
                        lol.i result = (lol.i) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        boolean z4 = result instanceof lol.h;
                        com.revolut.sso.impl.ui.password_flow.c cVar3 = this.f177171b;
                        if (z4) {
                            cVar3.G2(new e(new PasswordEvidence(((lol.h) result).f197471a)));
                        } else {
                            if (!Intrinsics.f(result, lol.g.f197470a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cVar3.G2(a.b.f106627a);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        passcodeScreen.H = function12;
        return passcodeScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return PasswordFlowContract$EmptyState.f106613a;
    }

    @Override // dki.g
    public final FlowStep y2() {
        PasswordEvidenceType passwordEvidenceType = this.A.d.f105964a;
        if (Intrinsics.f(passwordEvidenceType, PasswordEvidenceType.Passcode.f105962a)) {
            return PasswordFlowContract$Step.Passcode.f106624a;
        }
        if (Intrinsics.f(passwordEvidenceType, PasswordEvidenceType.Password.f105963a)) {
            return PasswordFlowContract$Step.Password.f106625a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
