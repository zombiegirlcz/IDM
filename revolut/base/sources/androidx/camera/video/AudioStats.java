package androidx.camera.video;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AudioStats {
    private static final Set<Integer> ERROR_STATES = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    public static AudioStats of(int i, Throwable th10, double d, long j2) {
        return new AutoValue_AudioStats(i, d, j2, th10);
    }

    public abstract double getAudioAmplitudeInternal();

    public abstract long getAudioBytesRecorded();

    public abstract int getAudioState();

    public abstract Throwable getErrorCause();
}
