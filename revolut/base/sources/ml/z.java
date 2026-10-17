package ml;

import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class z extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LivenessCaptureScreen.LivenessCaptureResult f206554a;

    public z(LivenessCaptureScreen.LivenessCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f206554a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f206554a, ((z) obj2).f206554a);
    }

    public final int hashCode() {
        return this.f206554a.hashCode();
    }

    public final String toString() {
        return "OnFaceLivenessCaptureFragmentResult(result=" + this.f206554a + ")";
    }
}
