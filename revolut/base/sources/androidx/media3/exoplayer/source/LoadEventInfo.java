package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final DataSpec dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    public final Uri f7577uri;

    public LoadEventInfo(long j2, DataSpec dataSpec, long j3) {
        this(j2, dataSpec, dataSpec.f7466uri, Collections.EMPTY_MAP, j3, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo copyWithTaskIdAndDurationMs(long j2, long j3) {
        return new LoadEventInfo(j2, this.dataSpec, this.f7577uri, this.responseHeaders, this.elapsedRealtimeMs, j3, this.bytesLoaded);
    }

    public LoadEventInfo(long j2, DataSpec dataSpec, Uri uri2, Map<String, List<String>> map, long j3, long j5, long j16) {
        this.loadTaskId = j2;
        this.dataSpec = dataSpec;
        this.f7577uri = uri2;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j3;
        this.loadDurationMs = j5;
        this.bytesLoaded = j16;
    }
}
