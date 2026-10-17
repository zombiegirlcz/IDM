package androidx.camera.video;

import android.net.Uri;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_OutputResults extends OutputResults {
    private final Uri outputUri;

    public AutoValue_OutputResults(Uri uri2) {
        if (uri2 == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.outputUri = uri2;
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof OutputResults) {
            return this.outputUri.equals(((OutputResults) obj2).getOutputUri());
        }
        return false;
    }

    @Override // androidx.camera.video.OutputResults
    public Uri getOutputUri() {
        return this.outputUri;
    }

    public int hashCode() {
        return this.outputUri.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.outputUri + "}";
    }
}
