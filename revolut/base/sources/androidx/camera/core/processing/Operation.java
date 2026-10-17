package androidx.camera.core.processing;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes15.dex */
public interface Operation<I, O> {
    O apply(I i) throws ImageCaptureException;
}
