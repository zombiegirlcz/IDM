package tl;

import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureStepDataBundle f271979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f271980b;

    public b(CaptureStepDataBundle captureStepDataBundle, m documentUploadPayload) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        Intrinsics.checkNotNullParameter(documentUploadPayload, "documentUploadPayload");
        this.f271979a = captureStepDataBundle;
        this.f271980b = documentUploadPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f271979a, bVar.f271979a) && Intrinsics.f(this.f271980b, bVar.f271980b);
    }

    public final int hashCode() {
        return this.f271980b.hashCode() + (this.f271979a.hashCode() * 31);
    }

    public final String toString() {
        return "DocumentUpload(captureStepDataBundle=" + this.f271979a + ", documentUploadPayload=" + this.f271980b + ")";
    }
}
