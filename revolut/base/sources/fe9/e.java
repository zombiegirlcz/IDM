package fe9;

import androidx.fragment.app.FragmentActivity;
import aw0.o9;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.l;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.feature.passcode.R$string;
import com.revolut.tracking.v3.SettingsUnlockContext;
import f2i.x;
import grl.fc;
import grl.hc;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import no.j2;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import wl0.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends yji.d implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f134477c;
    public final f01.c d;
    public final j2 e;
    public final z1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e0m.c f134478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zl0.c f134479h;
    public FragmentActivity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PinCodeView f134480j;
    public com.revolut.kompot.navigable.a k;

    public e(i biometricPromptProviderCreator, f01.c uiKitResources, j2 settingsEventTracker) {
        Intrinsics.checkNotNullParameter(biometricPromptProviderCreator, "biometricPromptProviderCreator");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(settingsEventTracker, "settingsEventTracker");
        this.f134477c = biometricPromptProviderCreator;
        this.d = uiKitResources;
        this.e = settingsEventTracker;
        this.f = ta6.a.a(0);
        this.f134478g = new e0m.c(new x(1, this, e.class, "initBiometricPromptProvider", "initBiometricPromptProvider(Lcom/revolut/feature/passcode/biometrics/BiometricState$Allowed;)V", 0, 14));
    }

    public static Clause Q(o oVar) {
        int i = c.f134474a[oVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new TextLocalisedClause(R$string.biometric_prompt_fingerprint, null, null, 14);
            }
            if (i == 3) {
                return new TextLocalisedClause(R$string.biometric_prompt_biometric_sensor, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "BiometricPromptControllerExtensionImpl", "Illegal state: biometric is not allowed", null, h0Var);
        m70.a.c(t0.f186434a);
        return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static fc S(o oVar) {
        int i = c.f134474a[oVar.ordinal()];
        if (i == 1) {
            return fc.Pin;
        }
        if (i == 2) {
            return fc.Fingerprint;
        }
        if (i == 3) {
            return fc.Face;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void R(ee9.g biometricState) {
        yx0.e eVar;
        Intrinsics.checkNotNullParameter(biometricState, "biometricState");
        boolean z = biometricState instanceof ee9.a;
        PinCodeView.a bVar = PinCodeView.a.C0445a.f59611a;
        if (z) {
            ee9.a aVar = (ee9.a) biometricState;
            o oVar = aVar.f125153a;
            if (aVar.f125155c) {
                this.f134478g.a(biometricState);
            }
            int i = c.f134474a[oVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    eVar = yx0.e.FINGERPRINT;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar = yx0.e.FACE_ID;
                }
                int i2 = c.f134475b[aVar.f125154b.ordinal()];
                if (i2 == 1) {
                    bVar = new com.revolut.core.ui_kit.views.pin.b(eVar);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new com.revolut.core.ui_kit.views.pin.a(eVar);
                }
            } else {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BiometricPromptControllerExtensionImpl", "Illegal state: biometric is not allowed", null, h0Var);
            }
            PinCodeView pinCodeView = this.f134480j;
            if (pinCodeView != null) {
                pinCodeView.setFingerPrintModeInfo(Q(oVar), new TextLocalisedClause(R$string.biometric_prompt_use_passcode, null, null, 14));
            }
            PinCodeView pinCodeView2 = this.f134480j;
            if (pinCodeView2 != null) {
                pinCodeView2.setBiometricModeAndInvalidate(bVar);
            }
            zl0.c cVar = this.f134479h;
            if (cVar != null) {
                FragmentActivity fragmentActivity = this.i;
                if (fragmentActivity == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                cVar.c(fragmentActivity);
            }
            T(oVar);
            return;
        }
        if (biometricState instanceof ee9.e) {
            PinCodeView pinCodeView3 = this.f134480j;
            if (pinCodeView3 != null) {
                pinCodeView3.setBiometricModeAndInvalidate(bVar);
            }
            zl0.c cVar2 = this.f134479h;
            if (cVar2 != null) {
                cVar2.b();
            }
            T(null);
            return;
        }
        if (biometricState instanceof ee9.b) {
            PinCodeView pinCodeView4 = this.f134480j;
            if (pinCodeView4 != null) {
                pinCodeView4.r0();
            }
            PinCodeView pinCodeView5 = this.f134480j;
            if (pinCodeView5 != null) {
                pinCodeView5.F0(true);
            }
            zl0.c cVar3 = this.f134479h;
            if (cVar3 != null) {
                cVar3.b();
            }
            T(null);
            return;
        }
        if (biometricState instanceof ee9.d) {
            PinCodeView pinCodeView6 = this.f134480j;
            if (pinCodeView6 != null) {
                pinCodeView6.setBiometricModeAndInvalidate(bVar);
            }
            PinCodeView pinCodeView7 = this.f134480j;
            if (pinCodeView7 != null) {
                pinCodeView7.o0();
            }
            zl0.c cVar4 = this.f134479h;
            if (cVar4 != null) {
                cVar4.b();
            }
            T(null);
            return;
        }
        boolean z3 = biometricState instanceof ee9.c;
        j2 j2Var = this.e;
        if (z3) {
            o oVar2 = ((ee9.c) biometricState).f125157a;
            l lVar = (l) j2Var;
            lVar.r3(S(oVar2), hc.Failure);
            return;
        }
        if (!(biometricState instanceof ee9.f)) {
            throw new NoWhenBranchMatchedException();
        }
        PinCodeView pinCodeView8 = this.f134480j;
        if (pinCodeView8 != null) {
            pinCodeView8.I0();
        }
        PinCodeView pinCodeView9 = this.f134480j;
        if (pinCodeView9 != null) {
            pinCodeView9.r0();
        }
        PinCodeView pinCodeView10 = this.f134480j;
        if (pinCodeView10 != null) {
            pinCodeView10.q0();
        }
        zl0.c cVar5 = this.f134479h;
        if (cVar5 != null) {
            cVar5.b();
        }
        o oVar3 = ((ee9.f) biometricState).f125160a;
        l lVar2 = (l) j2Var;
        lVar2.r3(S(oVar3), hc.Success);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.revolut.kompot.navigable.a, no.k] */
    public final void T(o oVar) {
        fc fcVarS;
        if (oVar == null || (fcVarS = S(oVar)) == null) {
            fcVarS = fc.Pin;
        }
        ?? r06 = this.k;
        if (r06 != 0) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            SettingsUnlockContext.a aVarNewBuilder = SettingsUnlockContext.newBuilder();
            aVarNewBuilder.c();
            ((SettingsUnlockContext) aVarNewBuilder.f49761b).setMethod(fcVarS);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            r06.K1(new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA)));
        }
    }
}
