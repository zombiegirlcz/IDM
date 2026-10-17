package org.bouncycastle.pqc.crypto.ntruprime;

import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes14.dex */
public class SNTRUPrimeParameters implements KEMParameters {
    private final String name;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f228858p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f228859q;
    private final int roundedPolynomialBytes;
    private final int rqPolynomialBytes;
    private final int sharedKeyBytes;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f228860w;
    public static final SNTRUPrimeParameters sntrup653 = new SNTRUPrimeParameters("sntrup653", 653, 4621, 288, 994, 865, 994, 1518, 32);
    public static final SNTRUPrimeParameters sntrup761 = new SNTRUPrimeParameters("sntrup761", 761, 4591, 286, 1158, 1007, 1158, 1763, 32);
    public static final SNTRUPrimeParameters sntrup857 = new SNTRUPrimeParameters("sntrup857", 857, 5167, 322, 1322, 1152, 1322, 1999, 32);
    public static final SNTRUPrimeParameters sntrup953 = new SNTRUPrimeParameters("sntrup953", 953, 6343, 396, 1505, 1317, 1505, 2254, 32);
    public static final SNTRUPrimeParameters sntrup1013 = new SNTRUPrimeParameters("sntrup1013", 1013, 7177, CaptureActivity.RESULT_EXIT_USER_FLOW, 1623, 1423, 1623, 2417, 32);
    public static final SNTRUPrimeParameters sntrup1277 = new SNTRUPrimeParameters("sntrup1277", 1277, 7879, 492, 2067, 1815, 2067, 3059, 32);

    private SNTRUPrimeParameters(String str, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        this.name = str;
        this.f228858p = i;
        this.f228859q = i2;
        this.f228860w = i3;
        this.rqPolynomialBytes = i5;
        this.roundedPolynomialBytes = i6;
        this.publicKeyBytes = i21;
        this.privateKeyBytes = i22;
        this.sharedKeyBytes = i32;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f228858p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f228859q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getRqPolynomialBytes() {
        return this.rqPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getW() {
        return this.f228860w;
    }
}
