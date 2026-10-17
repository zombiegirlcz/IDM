package pr;

import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2.BiometricVerificationNfcV2ConsolidatedScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class e0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f238839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationNfcV2ConsolidatedScreenContract$InputData f238840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238841c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e0(q qVar, d0 d0Var, ViewController viewController, BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData) {
        this.f238839a = viewController;
        this.f238840b = biometricVerificationNfcV2ConsolidatedScreenContract$InputData;
        this.f238841c = e4m.b.b(new ppd.i0(qVar, this, 2, 15));
        this.d = e4m.b.b(new ppd.i0(qVar, this, 1, 15));
        this.e = e4m.b.b(new ppd.i0(qVar, this, 0, 15));
        this.f = e4m.b.b(new ppd.i0(qVar, this, 3, 15));
    }

    public final yt.a b() {
        yt.a aVar;
        bu.b.Companion.getClass();
        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData inputData = this.f238840b;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        BiometricVerificationDocumentType type = inputData.f50629b;
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, BiometricVerificationDocumentType.IdentityCard.f50386a)) {
            aVar = yt.a.IDENTITY_CARD;
        } else if (Intrinsics.f(type, BiometricVerificationDocumentType.Passport.f50387a)) {
            aVar = yt.a.PASSPORT;
        } else {
            if (!Intrinsics.f(type, BiometricVerificationDocumentType.ResidencePermit.f50388a)) {
                throw new IllegalStateException("Can't process unsupported document type in NFC flow");
            }
            aVar = yt.a.RESIDENCE_PERMIT;
        }
        vc.s.k(aVar);
        return aVar;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
