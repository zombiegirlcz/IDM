package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class SegmentBase {
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public MultiSegmentBase(RangedUri rangedUri, long j2, long j3, long j5, long j16, List<SegmentTimelineElement> list, long j22, long j42, long j46) {
            super(rangedUri, j2, j3);
            this.startNumber = j5;
            this.duration = j16;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j22;
            this.timeShiftBufferDepthUs = j42;
            this.periodStartUnixTimeUs = j46;
        }

        public long getAvailableSegmentCount(long j2, long j3) {
            long segmentCount = getSegmentCount(j2);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((j3 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j2) - getFirstAvailableSegmentNum(j2, j3));
        }

        public long getFirstAvailableSegmentNum(long j2, long j3) {
            if (getSegmentCount(j2) == -1) {
                long j5 = this.timeShiftBufferDepthUs;
                if (j5 != -9223372036854775807L) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j3 - this.periodStartUnixTimeUs) - j5, j2));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j2, long j3) {
            if (this.segmentTimeline != null) {
                return -9223372036854775807L;
            }
            long availableSegmentCount = getAvailableSegmentCount(j2, j3) + getFirstAvailableSegmentNum(j2, j3);
            return (getSegmentDurationUs(availableSegmentCount, j2) + getSegmentTimeUs(availableSegmentCount)) - this.availabilityTimeOffsetUs;
        }

        public abstract long getSegmentCount(long j2);

        public final long getSegmentDurationUs(long j2, long j3) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j2 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j3);
            return (segmentCount == -1 || j2 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j3 - getSegmentTimeUs(j2);
        }

        public long getSegmentNum(long j2, long j3) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j3);
            if (segmentCount != 0) {
                if (this.segmentTimeline != null) {
                    long j5 = (segmentCount + firstSegmentNum) - 1;
                    long j16 = firstSegmentNum;
                    while (j16 <= j5) {
                        long j22 = ((j5 - j16) / 2) + j16;
                        long segmentTimeUs = getSegmentTimeUs(j22);
                        if (segmentTimeUs < j2) {
                            j16 = j22 + 1;
                        } else {
                            if (segmentTimeUs <= j2) {
                                return j22;
                            }
                            j5 = j22 - 1;
                        }
                    }
                    return j16 == firstSegmentNum ? j16 : j5;
                }
                long j42 = (j2 / ((this.duration * 1000000) / this.timescale)) + this.startNumber;
                if (j42 >= firstSegmentNum) {
                    return segmentCount == -1 ? j42 : Math.min(j42, (firstSegmentNum + segmentCount) - 1);
                }
            }
            return firstSegmentNum;
        }

        public final long getSegmentTimeUs(long j2) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j2 - this.startNumber)).startTime - this.presentationTimeOffset : (j2 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long j2);

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {
        final List<RangedUri> mediaSegments;

        public SegmentList(RangedUri rangedUri, long j2, long j3, long j5, long j16, List<SegmentTimelineElement> list, long j22, List<RangedUri> list2, long j42, long j46) {
            super(rangedUri, j2, j3, j5, j16, list, j22, j42, j46);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j2) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j2) {
            return this.mediaSegments.get((int) (j2 - this.startNumber));
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;
        final UrlTemplate initializationTemplate;
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j2, long j3, long j5, long j16, long j22, List<SegmentTimelineElement> list, long j42, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j46, long j47) {
            super(rangedUri, j2, j3, j5, j22, list, j42, j46, j47);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j16;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f7444id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j2) {
            if (this.segmentTimeline != null) {
                return r0.size();
            }
            long j3 = this.endNumber;
            if (j3 != -1) {
                return (j3 - this.startNumber) + 1;
            }
            if (j2 != -9223372036854775807L) {
                return BigIntegerMath.divide(BigInteger.valueOf(j2).multiply(BigInteger.valueOf(this.timescale)), BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j2) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j3 = list != null ? list.get((int) (j2 - this.startNumber)).startTime : (j2 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f7444id, j2, format.bitrate, j3), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public SegmentTimelineElement(long j2, long j3) {
            this.startTime = j2;
            this.duration = j3;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 != null && SegmentTimelineElement.class == obj2.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj2;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }
    }

    public SegmentBase(RangedUri rangedUri, long j2, long j3) {
        this.initialization = rangedUri;
        this.timescale = j2;
        this.presentationTimeOffset = j3;
    }

    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(RangedUri rangedUri, long j2, long j3, long j5, long j16) {
            super(rangedUri, j2, j3);
            this.indexStart = j5;
            this.indexLength = j16;
        }

        public RangedUri getIndex() {
            long j2 = this.indexLength;
            if (j2 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j2);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
