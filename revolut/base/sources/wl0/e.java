package wl0;

import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import java.lang.reflect.Field;
import java.security.Signature;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import rm0.e0;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements zl0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl0.b f298346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f298347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yl0.a f298348c;
    public final e0 d;
    public BiometricPrompt e;

    public e(xl0.b callback, g promptInfo, yl0.a cryptoObjectProvider, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(promptInfo, "promptInfo");
        Intrinsics.checkNotNullParameter(cryptoObjectProvider, "cryptoObjectProvider");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f298346a = callback;
        this.f298347b = promptInfo;
        this.f298348c = cryptoObjectProvider;
        this.d = securityFeatureToggles;
    }

    @Override // zl0.c
    public final rm0.j a(LoginFragment fragment) throws Throwable {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        BiometricPrompt biometricPrompt = new BiometricPrompt(fragment, Executors.newSingleThreadExecutor(), this.f298346a);
        d(fragment.getActivity());
        return e(biometricPrompt);
    }

    @Override // zl0.c
    public final void b() {
        this.f298346a.a(false);
        BiometricPrompt biometricPrompt = this.e;
        if (biometricPrompt != null) {
            biometricPrompt.cancelAuthentication();
        }
        this.e = null;
    }

    @Override // zl0.c
    public final rm0.j c(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BiometricPrompt biometricPrompt = new BiometricPrompt(activity, Executors.newSingleThreadExecutor(), this.f298346a);
        d(activity);
        return e(biometricPrompt);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(FragmentActivity fragmentActivity) throws Throwable {
        Object objA;
        if (fragmentActivity == null || !((Boolean) this.d.f255154g.getValue()).booleanValue()) {
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            BiometricViewModel biometricViewModel = (BiometricViewModel) new ViewModelProvider(fragmentActivity).get(BiometricViewModel.class);
            Field declaredField = BiometricViewModel.class.getDeclaredField("mIsPromptShowing");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            declaredField.setBoolean(biometricViewModel, false);
            objA = Unit.f186387a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
    }

    public final rm0.j e(BiometricPrompt biometricPrompt) {
        BiometricPrompt.CryptoObject cryptoObject;
        this.f298346a.a(true);
        rm0.i iVarA = this.f298348c.a();
        if (!(iVarA instanceof rm0.e)) {
            if (iVarA instanceof rm0.j) {
                return (rm0.j) iVarA;
            }
            throw new NoWhenBranchMatchedException();
        }
        Object objA = ((rm0.e) iVarA).a();
        g gVar = this.f298347b;
        try {
            if (objA instanceof Cipher) {
                cryptoObject = new BiometricPrompt.CryptoObject((Cipher) objA);
            } else {
                if (!(objA instanceof Signature)) {
                    throw new IllegalStateException(("Unexpected crypto object type " + (objA != null ? objA.getClass() : null)).toString());
                }
                cryptoObject = new BiometricPrompt.CryptoObject((Signature) objA);
            }
            BiometricPrompt.PromptInfo promptInfoBuild = new BiometricPrompt.PromptInfo.Builder().setTitle(gVar.f298352a).setDeviceCredentialAllowed(false).setConfirmationRequired(gVar.f298354c).setNegativeButtonText(gVar.f298353b).build();
            Intrinsics.checkNotNullExpressionValue(promptInfoBuild, "build(...)");
            biometricPrompt.authenticate(promptInfoBuild, cryptoObject);
            this.e = biometricPrompt;
            return rm0.d.f255149a;
        } catch (Throwable th10) {
            return new rm0.f(th10);
        }
    }
}
