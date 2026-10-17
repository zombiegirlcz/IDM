package pr;

import com.google.common.collect.ImmutableSet;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class v implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationFlowProvider$InputData f238899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f238900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238901c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238902g;

    public v(q qVar, BiometricVerificationFlowProvider$InputData biometricVerificationFlowProvider$InputData) {
        this.f238900b = qVar;
        this.f238899a = biometricVerificationFlowProvider$InputData;
        int i = 13;
        this.f238901c = e4m.b.b(new ppd.i0(qVar, this, 1, i));
        this.d = e4m.b.b(new ppd.i0(qVar, this, 0, i));
        this.e = e4m.b.b(new ppd.i0(qVar, this, 4, i));
        this.f = e4m.b.b(new ppd.i0(qVar, this, 3, i));
        this.f238902g = e4m.b.b(new ppd.i0(qVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
