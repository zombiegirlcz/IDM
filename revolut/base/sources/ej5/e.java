package ej5;

import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements zi5.b {
    @Override // zi5.b
    public final CryptoQrCodeParseResult parse(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        return CryptoQrCodeParseResult.NotDetected.f70895a;
    }
}
