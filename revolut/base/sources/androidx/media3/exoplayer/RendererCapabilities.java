package androidx.media3.exoplayer;

import androidx.media3.common.Format;

/* JADX INFO: loaded from: classes.dex */
public interface RendererCapabilities {

    public interface Listener {
        void onRendererCapabilitiesChanged(Renderer renderer);
    }

    static int create(int i, int i2, int i3, int i5, int i6, int i21) {
        return i | i2 | i3 | i5 | i6 | i21;
    }

    static int getAdaptiveSupport(int i) {
        return i & 24;
    }

    static int getAudioOffloadSupport(int i) {
        return i & 3584;
    }

    static int getDecoderSupport(int i) {
        return i & 384;
    }

    static int getFormatSupport(int i) {
        return i & 7;
    }

    static int getHardwareAccelerationSupport(int i) {
        return i & 64;
    }

    static int getTunnelingSupport(int i) {
        return i & 32;
    }

    static boolean isFormatSupported(int i, boolean z) {
        int formatSupport = getFormatSupport(i);
        if (formatSupport != 4) {
            return z && formatSupport == 3;
        }
        return true;
    }

    void clearListener();

    String getName();

    int getTrackType();

    void setListener(Listener listener);

    int supportsFormat(Format format) throws ExoPlaybackException;

    int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException;

    static int create(int i) {
        return create(i, 0, 0, 0);
    }

    static int create(int i, int i2, int i3, int i5) {
        return create(i, i2, i3, 0, 128, i5);
    }

    static int create(int i, int i2, int i3, int i5, int i6) {
        return create(i, i2, i3, i5, i6, 0);
    }
}
