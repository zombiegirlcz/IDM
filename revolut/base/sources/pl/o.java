package pl;

import com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f237237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NfcHostFragment.NfcHostResult.NfcScanSuccess f237238b;

    public o(q qVar, NfcHostFragment.NfcHostResult.NfcScanSuccess nfcScanSuccess) {
        this.f237237a = qVar;
        this.f237238b = nfcScanSuccess;
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        Disposable it8 = (Disposable) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        this.f237237a.f237242b.trackDataUploadStarted(this.f237238b.getNfcFlowType());
    }
}
