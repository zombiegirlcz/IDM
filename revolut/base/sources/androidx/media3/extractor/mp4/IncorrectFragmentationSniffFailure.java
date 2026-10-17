package androidx.media3.extractor.mp4;

import androidx.media3.extractor.SniffFailure;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes.dex */
public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public static final IncorrectFragmentationSniffFailure FILE_FRAGMENTED = new IncorrectFragmentationSniffFailure(true);
    public static final IncorrectFragmentationSniffFailure FILE_NOT_FRAGMENTED = new IncorrectFragmentationSniffFailure(false);
    public final boolean fileIsFragmented;

    private IncorrectFragmentationSniffFailure(boolean z) {
        this.fileIsFragmented = z;
    }

    public String toString() {
        return a.t(new StringBuilder("IncorrectFragmentation{expected="), !this.fileIsFragmented, "}");
    }
}
