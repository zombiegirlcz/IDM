package he9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.passcode.ui.biometric_passcode_verification.BiometricPasscodeVerificationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements xki.c, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f151605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricPasscodeVerificationFlowContract$InputData f151606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f151607c;
    public final d d = this;
    public final e4m.e e;
    public final e4m.e f;

    public d(e eVar, ViewController viewController, BiometricPasscodeVerificationFlowContract$InputData biometricPasscodeVerificationFlowContract$InputData) {
        this.f151607c = eVar;
        this.f151605a = viewController;
        this.f151606b = biometricPasscodeVerificationFlowContract$InputData;
        int i = 27;
        this.e = e4m.g.a(new h08.e(eVar, this, 0, i));
        this.f = e4m.b.b(new h08.e(eVar, this, 1, i));
    }

    @Override // he9.k
    public final f b() {
        return new f(this.f151607c, this.d, 0);
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
