package ml;

import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConfirmationFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class w extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LivenessConfirmationFragment.LivenessConfirmationResult f206551a;

    public w(LivenessConfirmationFragment.LivenessConfirmationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f206551a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f206551a, ((w) obj2).f206551a);
    }

    public final int hashCode() {
        return this.f206551a.hashCode();
    }

    public final String toString() {
        return "LivenessConfirmationFragmentResult(result=" + this.f206551a + ")";
    }
}
