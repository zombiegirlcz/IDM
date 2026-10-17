package androidx.media3.exoplayer.dash;

import androidx.media3.exoplayer.dash.manifest.RangedUri;

/* JADX INFO: loaded from: classes15.dex */
public interface DashSegmentIndex {
    long getAvailableSegmentCount(long j2, long j3);

    long getDurationUs(long j2, long j3);

    long getFirstAvailableSegmentNum(long j2, long j3);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j2, long j3);

    long getSegmentCount(long j2);

    long getSegmentNum(long j2, long j3);

    RangedUri getSegmentUrl(long j2);

    long getTimeUs(long j2);

    boolean isExplicit();
}
