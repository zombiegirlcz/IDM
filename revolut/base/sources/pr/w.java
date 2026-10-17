package pr;

import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection.BiometricVerificationManualDocumentSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class w implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationManualDocumentSelectionScreenContract$InputData f238903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.a f238905c;
    public final ppd.i0 d;

    public w(q qVar, u uVar, BiometricVerificationManualDocumentSelectionScreenContract$InputData biometricVerificationManualDocumentSelectionScreenContract$InputData) {
        this.f238903a = biometricVerificationManualDocumentSelectionScreenContract$InputData;
        this.f238904b = e4m.b.b(new ppd.i0(uVar, this, 1, 14));
        e4m.a aVar = new e4m.a();
        this.f238905c = aVar;
        int i = 14;
        this.d = new ppd.i0(uVar, this, 2, i);
        e4m.a.a(aVar, e4m.b.b(new ppd.i0(uVar, this, 0, i)));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
