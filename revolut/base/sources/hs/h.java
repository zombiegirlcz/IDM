package hs;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import es.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vr.l;
import zhm.f0;
import zr.k;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f154841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154842b;

    public h(k interactor, String verificationToken) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f154841a = interactor;
        this.f154842b = verificationToken;
    }

    @Override // hs.a
    public final Object a(Continuation continuation) {
        f0 f0Var = f0.f322471a;
        BiometricVerificationStep.SelfieSearch selfieSearch = new BiometricVerificationStep.SelfieSearch(f0Var);
        BiometricVerificationFeatures.INSTANCE.getClass();
        return new vr.f(selfieSearch, f0Var, BiometricVerificationFeatures.k, null, null);
    }

    @Override // hs.a
    public final Object b(l lVar, Continuation continuation) {
        return vr.h.f291444a;
    }

    @Override // hs.a
    public final Object c(l lVar, m mVar) {
        return vr.h.f291444a;
    }

    @Override // hs.a
    public final boolean d() {
        return false;
    }

    @Override // hs.a
    public final boolean e() {
        return true;
    }

    @Override // hs.a
    public final boolean f() {
        return true;
    }

    @Override // hs.a
    public final Object g(BiometricVerificationDocument biometricVerificationDocument, eif.j jVar) {
        lr.l lVar = new lr.l((Object) null, this.f154841a.f324516a, this.f154842b, (Continuation) null, 0);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, lVar, jVar);
    }
}
