package ej5;

import android.net.Uri;
import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements zi5.b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // zi5.b
    public final CryptoQrCodeParseResult parse(String qrCode) {
        String strA;
        Uri uri2;
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        if (!d0.W(qrCode) && (strA = zi5.b.a("ethereum", qrCode)) != null && (uri2 = Uri.parse(strA)) != null) {
            if (Intrinsics.f(uri2.getPath(), "/transfer")) {
                String queryParameter = uri2.getQueryParameter("address");
                if (queryParameter != null) {
                    return new CryptoQrCodeParseResult.Success(queryParameter, null);
                }
            } else {
                if (!pd.b.j(uri2.getPath() != null ? Boolean.valueOf(!d0.W(r0)) : null)) {
                    String host = uri2.getHost();
                    if (host != null) {
                        return new CryptoQrCodeParseResult.Success(host, null);
                    }
                }
            }
            return CryptoQrCodeParseResult.NotSupported.f70896a;
        }
        return CryptoQrCodeParseResult.NotDetected.f70895a;
    }
}
