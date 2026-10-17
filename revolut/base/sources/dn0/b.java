package dn0;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import hn0.f;
import hn0.g;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import javax.security.auth.x500.X500Principal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n80.e;
import org.jetbrains.annotations.NotNull;
import rm0.a0;
import rm0.i;
import wm0.c;
import wm0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f116201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f116202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f116203c;

    public b(wm0.b keyPairFactory, d keySignatureFactory, a0 keyStoreErrorsTracker, c keyStoreProvider, e packageManager) {
        Intrinsics.checkNotNullParameter(keyPairFactory, "keyPairFactory");
        Intrinsics.checkNotNullParameter(keySignatureFactory, "keySignatureFactory");
        Intrinsics.checkNotNullParameter(keyStoreErrorsTracker, "keyStoreErrorsTracker");
        Intrinsics.checkNotNullParameter(keyStoreProvider, "keyStoreProvider");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.f116201a = keyStoreErrorsTracker;
        this.f116202b = keyStoreProvider;
        this.f116203c = packageManager;
    }

    public final PublicKey a(g gVar, boolean z) throws Throwable {
        X500Principal x500Principal;
        eo.c cVar;
        PublicKey publicKey;
        KeyGenParameterSpec.Builder digests = new KeyGenParameterSpec.Builder(gVar.getName(), 12).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256");
        boolean z3 = gVar instanceof hn0.e;
        if (z3) {
            hn0.e eVar = (hn0.e) gVar;
            x500Principal = new X500Principal(a0.d.s("CN=", eVar.f154017b, ", O=Revolut Ltd, L=London, C=GB, UID=", eVar.f154016a));
        } else {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = (f) gVar;
            x500Principal = new X500Principal(a0.d.s("CN=", fVar.f154020b, ", O=Revolut Ltd, L=London, C=GB, UID=", fVar.f154019a));
        }
        KeyGenParameterSpec.Builder certificateSubject = digests.setCertificateSubject(x500Principal);
        if (gVar.b()) {
            certificateSubject.setInvalidatedByBiometricEnrollment(true);
            certificateSubject.setUserAuthenticationParameters(0, 2);
        }
        KeyGenParameterSpec.Builder userAuthenticationRequired = certificateSubject.setUserAuthenticationRequired(gVar.a());
        od0.a aVar = od0.a.f224253a;
        KeyGenParameterSpec keySpec = userAuthenticationRequired.setUnlockedDeviceRequired((od0.a.e() && od0.a.i()) ? false : true).setIsStrongBoxBacked(z).build();
        Intrinsics.checkNotNullExpressionValue(keySpec, "build(...)");
        a0 a0Var = this.f116201a;
        eo.d operationName = eo.d.SIGNATURE_GENERATION;
        if (z3) {
            cVar = eo.c.BIOMETRIC_SIGNATURE;
        } else {
            if (!(gVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = eo.c.NON_BIOMETRIC_SIGNATURE;
        }
        eo.c certificateType = cVar;
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        long j2 = 0;
        Throwable th10 = null;
        int i = 1;
        long j3 = 0;
        while (true) {
            Throwable th11 = th10;
            if (j3 > j2) {
                Thread.sleep(j3);
            }
            try {
                Intrinsics.checkNotNullParameter("EC", "algorithm");
                Intrinsics.checkNotNullParameter(keySpec, "keySpec");
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                keyPairGenerator.initialize(keySpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "generateKeyPair(...)");
                publicKey = keyPairGenerateKeyPair.getPublic();
                if (th11 == null) {
                    break;
                }
                Intrinsics.checkNotNullParameter(operationName, "operationName");
                Intrinsics.checkNotNullParameter(certificateType, "certificateType");
                a0Var.a(new eo.e(operationName, certificateType, i, true), th11);
                break;
            } catch (Throwable th12) {
                th10 = th12;
                j3 = j3 == j2 ? 100L : j3 * ((long) 2);
                Intrinsics.checkNotNullParameter(operationName, "operationName");
                Intrinsics.checkNotNullParameter(certificateType, "certificateType");
                a0Var.a(new eo.e(operationName, certificateType, i, false), th10);
                if (th11 != null) {
                    yhm.f.a(th10, th11);
                }
                int i2 = i + 1;
                if (i >= 3) {
                    throw th10;
                }
                i = i2;
                j2 = 0;
            }
        }
        Intrinsics.h(publicKey);
        return publicKey;
    }

    public final i b(g alias) {
        eo.c cVar;
        Intrinsics.checkNotNullParameter(alias, "alias");
        try {
            PrivateKey privateKey = (PrivateKey) ((wm0.g) this.f116202b.a()).e(alias.getName());
            return privateKey == null ? rm0.c.f255146a : new rm0.e(d.a(privateKey));
        } catch (KeyPermanentlyInvalidatedException unused) {
            return rm0.g.f255157a;
        } catch (Throwable th10) {
            eo.d dVar = eo.d.SIGNATURE_INITIALIZATION;
            if (alias instanceof hn0.e) {
                cVar = eo.c.BIOMETRIC_SIGNATURE;
            } else {
                if (!(alias instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = eo.c.NON_BIOMETRIC_SIGNATURE;
            }
            this.f116201a.a(new eo.e(dVar, cVar), th10);
            return new rm0.f(th10);
        }
    }
}
