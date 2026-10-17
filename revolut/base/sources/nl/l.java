package nl;

import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.api.client.data.DocSide;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements igm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DocSide f216925a;

    public l(DocSide docSide) {
        this.f216925a = docSide;
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        DocumentCaptureScreen.DocumentCaptureResult.Completed it8 = (DocumentCaptureScreen.DocumentCaptureResult.Completed) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.getDocumentData().getDocSide() == this.f216925a;
    }
}
