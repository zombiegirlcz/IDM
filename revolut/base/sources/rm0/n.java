package rm0;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.security.auth.x500.X500Principal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.CVCAFile;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();
    public static final String d;
    public static final String e;
    public static final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f255160g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f255161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f255162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f255163c;

    static {
        Charset charset = Charsets.UTF_8;
        d = new String("RSA".getBytes(), charset);
        e = new String(new byte[]{69, 67, CVCAFile.CAR_TAG}, charset);
        f = new String(new byte[]{80, 75, 67, 83, Constants.INQUIRY, 80, 97, ISOFileInfo.FMD_BYTE, ISOFileInfo.FMD_BYTE, 105, 110, 103}, charset);
        f255160g = new String(new byte[]{79, 65, 69, 80, 80, 97, ISOFileInfo.FMD_BYTE, ISOFileInfo.FMD_BYTE, 105, 110, 103}, charset);
    }

    public n(a0 keyStoreErrorsTracker, b0 mainThreadChecker, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(keyStoreErrorsTracker, "keyStoreErrorsTracker");
        Intrinsics.checkNotNullParameter(mainThreadChecker, "mainThreadChecker");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f255161a = keyStoreErrorsTracker;
        this.f255162b = mainThreadChecker;
        this.f255163c = securityFeatureToggles;
    }

    public final KeyPair a(hn0.k aliasWithVersion) throws Throwable {
        String str;
        a0 a0Var;
        KeyPair keyPairGenerateKeyPair;
        Intrinsics.checkNotNullParameter(aliasWithVersion, "aliasWithVersion");
        this.f255162b.a(new k(0));
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(d, "AndroidKeyStore");
        String strC = aliasWithVersion.c();
        hn0.c cVar = aliasWithVersion.f154023a;
        X500Principal x500Principal = new X500Principal(j6.a.q("CN=", strC));
        BigInteger bigIntegerValueOf = BigInteger.valueOf(Math.abs(aliasWithVersion.hashCode() * 31));
        r rVar = aliasWithVersion.f154024b;
        int i = m.f255159a[rVar.ordinal()];
        if (i == 1) {
            str = f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = f255160g;
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(aliasWithVersion.c(), 3);
        KeyGenParameterSpec.Builder certificateSerialNumber = builder.setBlockModes(e).setEncryptionPaddings(str).setCertificateSubject(x500Principal).setCertificateSerialNumber(bigIntegerValueOf);
        Intrinsics.checkNotNullExpressionValue(certificateSerialNumber, "setCertificateSerialNumber(...)");
        if (rVar == r.V2_OAEP) {
            certificateSerialNumber.setDigests("SHA-1");
        }
        if (cVar.b()) {
            certificateSerialNumber.setUserAuthenticationRequired(true);
            certificateSerialNumber.setInvalidatedByBiometricEnrollment(cVar.b());
            if (this.f255163c.a()) {
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar2 = rd0.c.DEBUG;
                int i2 = Build.VERSION.SDK_INT;
                rd0.d.b(cVar2, "CipherCertificateGenerator", j6.a.l(i2, "Creating biometric key with new flow on ", " API"), null, null, 16);
                if (i2 >= 30) {
                    certificateSerialNumber.setUserAuthenticationParameters(0, 2);
                } else {
                    certificateSerialNumber.setUserAuthenticationValidityDurationSeconds(-1);
                }
            }
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "with(...)");
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        a0 a0Var2 = this.f255161a;
        eo.d operationName = eo.d.CERTIFICATE_GENERATION;
        eo.c certificateType = ifk.b.t(cVar);
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        Intrinsics.checkNotNullParameter(operationName, "operationName");
        Intrinsics.checkNotNullParameter(certificateType, "certificateType");
        Throwable th10 = null;
        int i3 = 1;
        long j2 = 0;
        while (true) {
            Throwable th11 = th10;
            if (j2 > 0) {
                Thread.sleep(j2);
            }
            try {
                keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                if (th11 == null) {
                    break;
                }
                Intrinsics.checkNotNullParameter(operationName, "operationName");
                Intrinsics.checkNotNullParameter(certificateType, "certificateType");
                a0Var2.a(new eo.e(operationName, certificateType, i3, true), th11);
                break;
            } catch (Throwable th12) {
                th10 = th12;
                if (j2 == 0) {
                    j2 = 100;
                    a0Var = a0Var2;
                } else {
                    a0Var = a0Var2;
                    j2 *= (long) 2;
                }
                Intrinsics.checkNotNullParameter(operationName, "operationName");
                Intrinsics.checkNotNullParameter(certificateType, "certificateType");
                a0Var.a(new eo.e(operationName, certificateType, i3, false), th10);
                if (th11 != null) {
                    yhm.f.a(th10, th11);
                }
                int i5 = i3 + 1;
                if (i3 >= 3) {
                    throw th10;
                }
                i3 = i5;
                a0Var2 = a0Var;
            }
        }
        if (cVar.equals(hn0.d.f154015a)) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "CipherCertificateGenerator", "Created Default certificate", null, null, 16);
        }
        Intrinsics.checkNotNullExpressionValue(keyPairGenerateKeyPair, "also(...)");
        return keyPairGenerateKeyPair;
    }
}
