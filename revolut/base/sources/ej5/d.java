package ej5;

import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements zi5.b {
    @Override // zi5.b
    public final CryptoQrCodeParseResult parse(String qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        return d0.W(qrCode) ? CryptoQrCodeParseResult.NotDetected.f70895a : new CryptoQrCodeParseResult.Success(qrCode, null);
    }
}
