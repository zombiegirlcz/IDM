package zi5;

import ch.qos.logback.core.CoreConstants;
import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f322501a;

    static String a(String schemePrefix, String qrCode) {
        Intrinsics.checkNotNullParameter(schemePrefix, "schemePrefix");
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        String str = schemePrefix + ":";
        if (a0.H(qrCode, str + "//", true)) {
            return qrCode;
        }
        if (!a0.H(qrCode, str, true)) {
            if (d0.K(qrCode, CoreConstants.COLON_CHAR)) {
                return null;
            }
            return com.google.android.gms.internal.mlkit_vision_face.a.o(str, "//", qrCode);
        }
        if (d0.m0(qrCode, new char[]{CoreConstants.COLON_CHAR}, 6).size() < 2) {
            return null;
        }
        return a0.D(qrCode, str, str + "//", true);
    }

    CryptoQrCodeParseResult parse(String str);
}
