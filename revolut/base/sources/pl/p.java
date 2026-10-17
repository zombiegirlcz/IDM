package pl;

import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;

/* JADX INFO: loaded from: classes17.dex */
public final class p implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f237239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NfcHostFragment.NfcHostResult.NfcScanSuccess f237240b;

    public p(q qVar, NfcHostFragment.NfcHostResult.NfcScanSuccess nfcScanSuccess) {
        this.f237239a = qVar;
        this.f237240b = nfcScanSuccess;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        this.f237239a.f237242b.trackDataUploadCompleted(this.f237240b.getNfcFlowType());
    }
}
