package ml;

import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelfieCaptureScreen.SelfieCaptureResult f206516a;

    public b0(SelfieCaptureScreen.SelfieCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f206516a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f206516a, ((b0) obj2).f206516a);
    }

    public final int hashCode() {
        return this.f206516a.hashCode();
    }

    public final String toString() {
        return "OnFaceSelfieCaptureFragmentResult(result=" + this.f206516a + ")";
    }
}
