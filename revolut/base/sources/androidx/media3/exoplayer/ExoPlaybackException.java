package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.base.Preconditions;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ExoPlaybackException extends PlaybackException {
    final boolean isRecoverable;
    public final MediaSource.MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    private ExoPlaybackException(int i, Throwable th10, int i2) {
        this(i, th10, null, i2, null, -1, null, 4, null, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th10, String str, int i, Format format, int i2, MediaSource.MediaPeriodId mediaPeriodId, boolean z, int i3) {
        if (format == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th10, null, i3, str, i, format, i2, mediaPeriodId, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private static String deriveMessage(int i, String str, String str2, int i2, Format format, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + Util.getFormatSupportString(i3);
        }
        return !TextUtils.isEmpty(str) ? com.google.android.gms.internal.mlkit_vision_face.a.o(str3, ": ", str) : str3;
    }

    public ExoPlaybackException copyWithMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    private ExoPlaybackException(int i, Throwable th10, String str, int i2, String str2, int i3, Format format, int i5, MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        this(deriveMessage(i, str, str2, i3, format, i5), th10, i2, i, str2, i3, format, i5, mediaPeriodId, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(String str, Throwable th10, int i, int i2, String str2, int i3, Format format, int i5, MediaSource.MediaPeriodId mediaPeriodId, long j2, boolean z) {
        super(str, th10, i, Bundle.EMPTY, j2);
        Preconditions.checkArgument(!z || i2 == 1);
        Preconditions.checkArgument(th10 != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format;
        this.rendererFormatSupport = i5;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z;
    }
}
