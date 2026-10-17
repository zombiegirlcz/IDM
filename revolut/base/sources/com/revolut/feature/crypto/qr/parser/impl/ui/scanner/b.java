package com.revolut.feature.crypto.qr.parser.impl.ui.scanner;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.crypto.qr.parser.api.R$string;
import com.revolut.feature.crypto.qr.parser.api.UnsupportedCryptoQrFormatError;
import com.revolut.feature.crypto.qr.parser.impl.R$drawable;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import fj5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {
    @Override // cli.n
    public final o c(j jVar) {
        fj5.b domainState = (fj5.b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CryptoQrScannerControllerContract$ProcessingState cryptoQrScannerControllerContract$ProcessingState = domainState.f135535a;
        if (cryptoQrScannerControllerContract$ProcessingState instanceof CryptoQrScannerControllerContract$ProcessingState.Detecting) {
            return new d(qb.DETECTING, R$string.crypto_qr_code_scanner_state_not_detected_text, R$drawable.message_background);
        }
        if (cryptoQrScannerControllerContract$ProcessingState instanceof CryptoQrScannerControllerContract$ProcessingState.Processing) {
            return new d(qb.DETECTING, R$string.crypto_qr_code_scanner_state_detecting_text, R$drawable.message_background);
        }
        if (cryptoQrScannerControllerContract$ProcessingState instanceof CryptoQrScannerControllerContract$ProcessingState.Finished) {
            return new d(qb.SUCCESS, R$string.crypto_qr_code_scanner_state_success_text, R$drawable.message_background);
        }
        if (cryptoQrScannerControllerContract$ProcessingState instanceof CryptoQrScannerControllerContract$ProcessingState.Error) {
            return ((CryptoQrScannerControllerContract$ProcessingState.Error) cryptoQrScannerControllerContract$ProcessingState).f70900a instanceof UnsupportedCryptoQrFormatError ? new d(qb.ERROR, R$string.crypto_qr_code_scanner_state_error_unsupported_text, R$drawable.message_error_background) : new d(qb.ERROR, R$string.crypto_qr_code_scanner_state_error_no_code_detected_text, R$drawable.message_error_background);
        }
        throw new NoWhenBranchMatchedException();
    }
}
