package pl;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import g2e.t;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NfcDataRepository f237241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NfcTracker f237242b;

    public q(NfcDataRepository nfcDataRepository, NfcTracker nfcTracker) {
        Intrinsics.checkNotNullParameter(nfcDataRepository, "nfcDataRepository");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        this.f237241a = nfcDataRepository;
        this.f237242b = nfcTracker;
    }

    public final Single a(ArrayList mediaUploads, NfcHostFragment.NfcHostResult.NfcScanSuccess nfcScanSuccess) {
        Intrinsics.checkNotNullParameter(mediaUploads, "mediaUploads");
        if (nfcScanSuccess == null) {
            return Single.f(new l(mediaUploads));
        }
        return new tgm.d(new tgm.e(new tgm.g(this.f237241a.uploadData(nfcScanSuccess.getNfcData(), DocumentType.PASSPORT).g(new n(mediaUploads)).g(new t(m.class, 25)), new pjg.i(this, 5), 2), new o(this, nfcScanSuccess), 1), new p(this, nfcScanSuccess), 3);
    }
}
