package androidx.camera.video;

import android.net.Uri;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes15.dex */
public abstract class OutputResults {
    public static OutputResults of(Uri uri2) {
        Preconditions.checkNotNull(uri2, "OutputUri cannot be null.");
        return new AutoValue_OutputResults(uri2);
    }

    public abstract Uri getOutputUri();
}
