package hs;

import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import es.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vr.l;
import zhm.a0;
import zhm.f0;
import zr.k;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f154844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f154846c;
    public List d;
    public BiometricVerificationFeatures e;

    public j(k interactor, String verificationToken) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f154844a = interactor;
        this.f154845b = verificationToken;
        this.f154846c = new ArrayList();
        this.d = f0.f322471a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hs.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof hs.i
            if (r0 == 0) goto L13
            r0 = r12
            hs.i r0 = (hs.i) r0
            int r1 = r0.f154843w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154843w = r1
            goto L1a
        L13:
            hs.i r0 = new hs.i
            gim.c r12 = (gim.c) r12
            r0.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f154843w
            r3 = 1
            java.util.ArrayList r4 = r11.f154846c
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r12)
            goto L4d
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L33:
            yhm.o.b(r12)
            r4.clear()
            zhm.f0 r12 = zhm.f0.f322471a
            r11.d = r12
            r12 = 0
            r11.e = r12
            r0.f154843w = r3
            zr.k r12 = r11.f154844a
            java.lang.String r2 = r11.f154845b
            java.lang.Object r12 = r12.a(r2, r0)
            if (r12 != r1) goto L4d
            return r1
        L4d:
            wr.b r12 = (wr.b) r12
            java.util.ArrayList r0 = r12.f299481a
            com.revolut.biometric_verification.api.models.BiometricVerificationFeatures r8 = r12.f299483c
            r4.addAll(r0)
            java.util.List r0 = r12.f299482b
            r11.d = r0
            r11.e = r8
            java.lang.Object r0 = zhm.a0.G(r4)
            r6 = r0
            com.revolut.biometric_verification.api.models.BiometricVerificationStep r6 = (com.revolut.biometric_verification.api.models.BiometricVerificationStep) r6
            if (r6 == 0) goto L6f
            vr.f r5 = new vr.f
            java.util.List r7 = r12.f299482b
            r10 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L6f:
            vr.h r12 = vr.h.f291444a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: hs.j.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // hs.a
    public final Object b(l lVar, Continuation continuation) {
        if (this.e == null) {
            throw new IllegalStateException("Must call getInitialInstruction first");
        }
        BiometricVerificationStep biometricVerificationStep = (BiometricVerificationStep) a0.G(this.f154846c);
        if (biometricVerificationStep == null) {
            return vr.h.f291444a;
        }
        List list = this.d;
        BiometricVerificationFeatures biometricVerificationFeatures = this.e;
        if (biometricVerificationFeatures == null) {
            BiometricVerificationFeatures.INSTANCE.getClass();
            biometricVerificationFeatures = BiometricVerificationFeatures.k;
        }
        return new vr.f(biometricVerificationStep, list, biometricVerificationFeatures, null, null);
    }

    @Override // hs.a
    public final Object c(l lVar, m mVar) {
        return a(mVar);
    }

    @Override // hs.a
    public final boolean d() {
        return !this.f154846c.isEmpty() || this.e == null;
    }

    @Override // hs.a
    public final boolean e() {
        return false;
    }

    @Override // hs.a
    public final boolean f() {
        return false;
    }

    @Override // hs.a
    public final Object g(BiometricVerificationDocument biometricVerificationDocument, eif.j jVar) {
        ur.g gVar;
        ur.i iVar;
        Continuation continuation = null;
        if (biometricVerificationDocument != null) {
            BiometricVerificationDocumentType biometricVerificationDocumentType = biometricVerificationDocument.f50375a;
            if (Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.DrivingLicence.f50385a)) {
                iVar = ur.i.DRIVING_LICENCE;
            } else if (Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.IdentityCard.f50386a)) {
                iVar = ur.i.IDENTITY_CARD;
            } else if (Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.Passport.f50387a)) {
                iVar = ur.i.PASSPORT;
            } else if (Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.ResidencePermit.f50388a)) {
                iVar = ur.i.RESIDENCE_PERMIT;
            } else if (Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.Visa.f50389a)) {
                iVar = ur.i.VISA;
            } else {
                if (!Intrinsics.f(biometricVerificationDocumentType, BiometricVerificationDocumentType.BirthCertificate.f50384a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar = ur.i.BIRTH_CERTIFICATE;
            }
            gVar = new ur.g(iVar, biometricVerificationDocument.f50376b.f297794a);
        } else {
            gVar = null;
        }
        lr.l lVar = new lr.l(gVar, this.f154844a.f324516a, this.f154845b, continuation, 0);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, lVar, jVar);
    }
}
