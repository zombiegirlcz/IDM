package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import com.revolut.feature.payments.profile.impl.R$drawable;
import com.revolut.feature.payments.profile.impl.R$string;
import com.revolut.feature.payments.profile.impl.ui_kompot.scanner.ProfileScannerScreenContract$ProcessingState;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {
    @Override // jki.p
    public final m a(i iVar) {
        ax9.e domainState = (ax9.e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ProfileScannerScreenContract$ProcessingState profileScannerScreenContract$ProcessingState = domainState.f10899a;
        if (profileScannerScreenContract$ProcessingState instanceof ProfileScannerScreenContract$ProcessingState.Detecting) {
            return new ax9.g(false, qb.DETECTING, R$string.payments_profile_qr_label_scan_code, R$drawable.message_background);
        }
        if (profileScannerScreenContract$ProcessingState instanceof ProfileScannerScreenContract$ProcessingState.Processing) {
            return new ax9.g(((ProfileScannerScreenContract$ProcessingState.Processing) profileScannerScreenContract$ProcessingState).f79653b == ProfileScannerScreenContract$ProcessingState.Processing.Type.CAMERA_STREAM, qb.DETECTING, R$string.payments_profile_qr_label_scan_code, R$drawable.message_background);
        }
        if (profileScannerScreenContract$ProcessingState instanceof ProfileScannerScreenContract$ProcessingState.Finished) {
            return new ax9.g(false, qb.SUCCESS, R$string.payments_profile_qr_label_scan_code, R$drawable.message_background);
        }
        if (profileScannerScreenContract$ProcessingState instanceof ProfileScannerScreenContract$ProcessingState.Error) {
            return new ax9.g(false, qb.ERROR, R$string.payments_profile_qr_label_error, R$drawable.message_error_background);
        }
        throw new NoWhenBranchMatchedException();
    }
}
