package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.core.impl.Timebase;

/* JADX INFO: loaded from: classes15.dex */
public interface EncoderConfig {
    Timebase getInputTimebase();

    String getMimeType();

    MediaFormat toMediaFormat() throws InvalidConfigException;
}
