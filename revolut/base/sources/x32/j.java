package x32;

import cli.n;
import cli.o;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.impl.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.screen.QrScanningScreenContract$ProcessingState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        QrScanningScreenContract$ProcessingState qrScanningScreenContract$ProcessingState = domainState.f302622a;
        if (qrScanningScreenContract$ProcessingState instanceof QrScanningScreenContract$ProcessingState.Detecting) {
            return new e(false, qb.DETECTING, R$string.apm_qr_label_scan_code, R$drawable.message_background);
        }
        if (qrScanningScreenContract$ProcessingState instanceof QrScanningScreenContract$ProcessingState.Processing) {
            return new e(true, qb.DETECTING, R$string.apm_qr_label_scan_code, R$drawable.message_background);
        }
        if (qrScanningScreenContract$ProcessingState instanceof QrScanningScreenContract$ProcessingState.Finished) {
            return new e(false, qb.SUCCESS, R$string.apm_qr_label_scan_code, R$drawable.message_background);
        }
        if (qrScanningScreenContract$ProcessingState instanceof QrScanningScreenContract$ProcessingState.Error) {
            return new e(false, qb.ERROR, R$string.apm_qr_label_error, R$drawable.message_error_background);
        }
        throw new NoWhenBranchMatchedException();
    }
}
