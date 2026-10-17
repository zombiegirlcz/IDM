package androidx.media3.muxer;

import androidx.media3.common.MediaLibraryInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class MuxerException extends Exception {
    static {
        MediaLibraryInfo.registerModule("media3.muxer");
    }

    public MuxerException(String str, Throwable th10) {
        super(str, th10);
    }
}
