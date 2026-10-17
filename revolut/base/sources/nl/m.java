package nl;

import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f216927a = new m();

    @Override // igm.o
    public final Object apply(Object obj2) {
        tl.m lVar;
        DocumentCaptureScreen.DocumentCaptureResult.Completed it8 = (DocumentCaptureScreen.DocumentCaptureResult.Completed) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        CaptureStepDataBundle documentData = it8.getDocumentData();
        if (it8.getNfcProperties() != null) {
            String uploadId = it8.getUploadId();
            String videoUploadId = it8.getVideoUploadId();
            NfcProperties nfcProperties = it8.getNfcProperties();
            Intrinsics.h(nfcProperties);
            lVar = new tl.k(uploadId, videoUploadId, it8.isNfcSupported(), nfcProperties);
        } else {
            lVar = new tl.l(it8.getUploadId(), it8.getVideoUploadId(), it8.isNfcSupported());
        }
        return new tl.b(documentData, lVar);
    }
}
