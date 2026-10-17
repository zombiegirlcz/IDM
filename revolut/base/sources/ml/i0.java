package ml;

import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureStepDataBundle f206531a;

    public i0(CaptureStepDataBundle captureStepDataBundle) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        this.f206531a = captureStepDataBundle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i0) && Intrinsics.f(this.f206531a, ((i0) obj2).f206531a);
    }

    public final int hashCode() {
        return this.f206531a.hashCode();
    }

    public final String toString() {
        return "Granted(captureStepDataBundle=" + this.f206531a + ")";
    }
}
