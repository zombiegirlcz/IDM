package fj5;

import com.revolut.feature.crypto.qr.parser.api.model.CryptoQrCodeParseResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aj5.a f135540a;

    public i(aj5.a qrCodeParserStrategy) {
        Intrinsics.checkNotNullParameter(qrCodeParserStrategy, "qrCodeParserStrategy");
        this.f135540a = qrCodeParserStrategy;
    }

    public final CryptoQrCodeParseResult a(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        for (zi5.b bVar : this.f135540a.f5399a.values()) {
            String str = code.f308049a;
            if (str == null) {
                str = "";
            }
            CryptoQrCodeParseResult cryptoQrCodeParseResult = bVar.parse(str);
            if (cryptoQrCodeParseResult instanceof CryptoQrCodeParseResult.Success) {
                return cryptoQrCodeParseResult;
            }
        }
        return CryptoQrCodeParseResult.NotDetected.f70895a;
    }
}
