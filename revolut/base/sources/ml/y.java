package ml;

import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class y extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentCaptureScreen.DocumentCaptureResult f206553a;

    public y(DocumentCaptureScreen.DocumentCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f206553a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f206553a, ((y) obj2).f206553a);
    }

    public final int hashCode() {
        return this.f206553a.hashCode();
    }

    public final String toString() {
        return "OnDocumentCaptureFragmentResult(result=" + this.f206553a + ")";
    }
}
