package g70;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public static boolean a() {
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (d0.J(HARDWARE, "goldfish", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        if (d0.J(HARDWARE, "ranchu", false)) {
            return true;
        }
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (d0.J(MODEL, "google_sdk", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        if (d0.J(MODEL, "Emulator", false)) {
            return true;
        }
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (a0.H(FINGERPRINT, "generic", false)) {
            return true;
        }
        String PRODUCT = Build.PRODUCT;
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        if (d0.J(PRODUCT, "sdk", false)) {
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(PRODUCT, "PRODUCT");
        return d0.J(PRODUCT, "google_sdk", false);
    }
}
