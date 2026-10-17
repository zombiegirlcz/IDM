package tl;

import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UploadedArtifact f271985a;

    public h(UploadedArtifact uploadArtifact) {
        Intrinsics.checkNotNullParameter(uploadArtifact, "uploadArtifact");
        this.f271985a = uploadArtifact;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f271985a, ((h) obj2).f271985a);
    }

    public final int hashCode() {
        return this.f271985a.hashCode();
    }

    public final String toString() {
        return "FaceUploadPhoto(uploadArtifact=" + this.f271985a + ")";
    }
}
