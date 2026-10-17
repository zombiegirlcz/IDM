package du;

import com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.BiometricVerificationManualInputViewController;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kx4.r0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class l implements oim.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117500a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputTextDelegate.Model f117501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f117502c;

    public /* synthetic */ l(InputTextDelegate.Model model, BiometricVerificationManualInputViewController biometricVerificationManualInputViewController) {
        this.f117501b = model;
        this.f117502c = biometricVerificationManualInputViewController;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f117500a;
        InputTextDelegate.Model model = this.f117501b;
        Object obj6 = this.f117502c;
        switch (i) {
            case 0:
                BiometricVerificationManualInputViewController biometricVerificationManualInputViewController = (BiometricVerificationManualInputViewController) obj6;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Date date = (Date) obj3;
                KProperty[] kPropertyArr = BiometricVerificationManualInputViewController.P;
                Intrinsics.checkNotNullParameter((String) obj5, "<unused var>");
                if (date != null && zBooleanValue) {
                    String str = model.f52580a;
                    if (Intrinsics.f(str, "INPUT_DATES_BIRTH_ID")) {
                        ((com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c) biometricVerificationManualInputViewController.d()).I2(new e(ebm.a.N(date)));
                    } else if (Intrinsics.f(str, "INPUT_DATES_EXPIRY_ID")) {
                        ((com.revolut.biometric_verification.impl.ui.step.nfc.manual_input.c) biometricVerificationManualInputViewController.d()).I2(new d(ebm.a.N(date)));
                    }
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                String rawDate = (String) obj5;
                Intrinsics.checkNotNullParameter(rawDate, "rawDate");
                ((r0) obj6).f190424s.onNext(new ax4.i(model.f52580a, (Date) obj3, rawDate, zBooleanValue2));
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ l(r0 r0Var, InputTextDelegate.Model model) {
        this.f117502c = r0Var;
        this.f117501b = model;
    }
}
