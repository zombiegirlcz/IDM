package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import com.google.android.material.color.utilities.g;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final ImmutableList<Interstitial> interstitials;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    public static final class Interstitial {
        public final Uri assetListUri;
        public final Uri assetUri;
        public final ImmutableList<ClientDefinedAttribute> clientDefinedAttributes;
        public final boolean contentMayVary;

        /* JADX INFO: renamed from: cue, reason: collision with root package name */
        public final List<String> f7539cue;
        public final long durationUs;
        public final long endDateUnixUs;
        public final boolean endOnNext;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final String f7540id;
        public final long plannedDurationUs;
        public final long playoutLimitUs;
        public final ImmutableList<String> restrictions;
        public final long resumeOffsetUs;
        public final long skipControlDurationUs;
        public final String skipControlLabelId;
        public final long skipControlOffsetUs;
        public final ImmutableList<String> snapTypes;
        public final long startDateUnixUs;
        public final String timelineOccupies;
        public final String timelineStyle;

        public static final class Builder {
            private Uri assetListUri;
            private Uri assetUri;
            private Boolean contentMayVary;
            private boolean endOnNext;

            /* JADX INFO: renamed from: id, reason: collision with root package name */
            private final String f7542id;
            private String skipControlLabelId;
            private String timelineOccupies;
            private String timelineStyle;
            private final Map<String, ClientDefinedAttribute> clientDefinedAttributes = new HashMap();
            private long startDateUnixUs = -9223372036854775807L;
            private long endDateUnixUs = -9223372036854775807L;
            private long durationUs = -9223372036854775807L;
            private long plannedDurationUs = -9223372036854775807L;

            /* JADX INFO: renamed from: cue, reason: collision with root package name */
            private List<String> f7541cue = new ArrayList();
            private long resumeOffsetUs = -9223372036854775807L;
            private long playoutLimitUs = -9223372036854775807L;
            private List<String> snapTypes = new ArrayList();
            private List<String> restrictions = new ArrayList();
            private long skipControlOffsetUs = -9223372036854775807L;
            private long skipControlDurationUs = -9223372036854775807L;

            public Builder(String str) {
                this.f7542id = str;
            }

            public Interstitial build() {
                Uri uri2 = this.assetListUri;
                if ((uri2 != null || this.assetUri == null) && (uri2 == null || this.assetUri != null)) {
                    return null;
                }
                long j2 = this.startDateUnixUs;
                if (j2 == -9223372036854775807L) {
                    return null;
                }
                String str = this.f7542id;
                Uri uri3 = this.assetUri;
                long j3 = this.endDateUnixUs;
                long j5 = this.durationUs;
                long j16 = this.plannedDurationUs;
                List<String> list = this.f7541cue;
                boolean z = this.endOnNext;
                long j22 = this.resumeOffsetUs;
                long j42 = this.playoutLimitUs;
                List<String> list2 = this.snapTypes;
                List<String> list3 = this.restrictions;
                ArrayList arrayList = new ArrayList(this.clientDefinedAttributes.values());
                Boolean bool = this.contentMayVary;
                boolean z3 = bool == null || bool.booleanValue();
                String str2 = this.timelineOccupies;
                if (str2 == null) {
                    str2 = "POINT";
                }
                String str3 = str2;
                String str4 = this.timelineStyle;
                if (str4 == null) {
                    str4 = "HIGHLIGHT";
                }
                return new Interstitial(str, uri3, uri2, j2, j3, j5, j16, list, z, j22, j42, list2, list3, arrayList, z3, str3, str4, this.skipControlOffsetUs, this.skipControlDurationUs, this.skipControlLabelId);
            }

            public Builder setAssetListUri(Uri uri2) {
                if (uri2 == null) {
                    return this;
                }
                Uri uri3 = this.assetListUri;
                if (uri3 != null) {
                    Preconditions.checkArgument(uri3.equals(uri2), "Can't change assetListUri from %s to %s", this.assetListUri, uri2);
                }
                this.assetListUri = uri2;
                return this;
            }

            public Builder setAssetUri(Uri uri2) {
                if (uri2 == null) {
                    return this;
                }
                Uri uri3 = this.assetUri;
                if (uri3 != null) {
                    Preconditions.checkArgument(uri3.equals(uri2), "Can't change assetUri from %s to %s", this.assetUri, uri2);
                }
                this.assetUri = uri2;
                return this;
            }

            public Builder setClientDefinedAttributes(List<ClientDefinedAttribute> list) {
                if (!list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        ClientDefinedAttribute clientDefinedAttribute = list.get(i);
                        String str = clientDefinedAttribute.name;
                        ClientDefinedAttribute clientDefinedAttribute2 = this.clientDefinedAttributes.get(str);
                        if (clientDefinedAttribute2 != null) {
                            Preconditions.checkArgument(clientDefinedAttribute2.equals(clientDefinedAttribute), "Can't change %s from %s %s to %s %s", str, clientDefinedAttribute2.textValue, Double.valueOf(clientDefinedAttribute2.doubleValue), clientDefinedAttribute.textValue, Double.valueOf(clientDefinedAttribute.doubleValue));
                        }
                        this.clientDefinedAttributes.put(str, clientDefinedAttribute);
                    }
                }
                return this;
            }

            public Builder setContentMayVary(Boolean bool) {
                if (bool == null) {
                    return this;
                }
                Boolean bool2 = this.contentMayVary;
                if (bool2 != null) {
                    Preconditions.checkArgument(bool2.equals(bool), "Can't change contentMayVary from %s to %s", this.contentMayVary, bool);
                }
                this.contentMayVary = bool;
                return this;
            }

            public Builder setCue(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.f7541cue.isEmpty()) {
                    Preconditions.checkArgument(this.f7541cue.equals(list), "Can't change cue from " + String.join(", ", this.f7541cue) + " to " + String.join(", ", list));
                }
                this.f7541cue = list;
                return this;
            }

            public Builder setDurationUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.durationUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change durationUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.durationUs = j3;
                return this;
            }

            public Builder setEndDateUnixUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.endDateUnixUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change endDateUnixUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.endDateUnixUs = j3;
                return this;
            }

            public Builder setEndOnNext(boolean z) {
                if (!z) {
                    return this;
                }
                this.endOnNext = true;
                return this;
            }

            public Builder setPlannedDurationUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.plannedDurationUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change plannedDurationUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.plannedDurationUs = j3;
                return this;
            }

            public Builder setPlayoutLimitUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.playoutLimitUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change playoutLimitUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.playoutLimitUs = j3;
                return this;
            }

            public Builder setRestrictions(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.restrictions.isEmpty()) {
                    Preconditions.checkArgument(this.restrictions.equals(list), "Can't change restrictions from " + String.join(", ", this.restrictions) + " to " + String.join(", ", list));
                }
                this.restrictions = list;
                return this;
            }

            public Builder setResumeOffsetUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.resumeOffsetUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change resumeOffsetUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.resumeOffsetUs = j3;
                return this;
            }

            public Builder setSkipControlDurationUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.skipControlDurationUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change skipControlDurationUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.skipControlDurationUs = j3;
                return this;
            }

            public Builder setSkipControlLabelId(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.skipControlLabelId;
                if (str2 != null) {
                    Preconditions.checkArgument(str2.equals(str), "Can't change skipControlLabelId from %s to %s", this.skipControlLabelId, str);
                }
                this.skipControlLabelId = str;
                return this;
            }

            public Builder setSkipControlOffsetUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.skipControlOffsetUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change skipControlOffsetUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.skipControlOffsetUs = j3;
                return this;
            }

            public Builder setSnapTypes(List<String> list) {
                if (list.isEmpty()) {
                    return this;
                }
                if (!this.snapTypes.isEmpty()) {
                    Preconditions.checkArgument(this.snapTypes.equals(list), "Can't change snapTypes from " + String.join(", ", this.snapTypes) + " to " + String.join(", ", list));
                }
                this.snapTypes = list;
                return this;
            }

            public Builder setStartDateUnixUs(long j2) {
                long j3;
                if (j2 == -9223372036854775807L) {
                    return this;
                }
                long j5 = this.startDateUnixUs;
                if (j5 != -9223372036854775807L) {
                    j3 = j2;
                    Preconditions.checkArgument(j5 == j2, "Can't change startDateUnixUs from %s to %s", j5, j3);
                } else {
                    j3 = j2;
                }
                this.startDateUnixUs = j3;
                return this;
            }

            public Builder setTimelineOccupies(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineOccupies;
                if (str2 != null) {
                    Preconditions.checkArgument(str2.equals(str), "Can't change timelineOccupies from %s to %s", this.timelineOccupies, str);
                }
                this.timelineOccupies = str;
                return this;
            }

            public Builder setTimelineStyle(String str) {
                if (str == null) {
                    return this;
                }
                String str2 = this.timelineStyle;
                if (str2 != null) {
                    Preconditions.checkArgument(str2.equals(str), "Can't change timelineStyle from %s to %s", this.timelineStyle, str);
                }
                this.timelineStyle = str;
                return this;
            }
        }

        public Interstitial(String str, Uri uri2, Uri uri3, long j2, long j3, long j5, long j16, List<String> list, boolean z, long j22, long j42, List<String> list2, List<String> list3, List<ClientDefinedAttribute> list4, boolean z3, String str2, String str3, long j46, long j47, String str4) {
            Preconditions.checkArgument((uri2 == null || uri3 == null) && !(uri2 == null && uri3 == null));
            this.f7540id = str;
            this.assetUri = uri2;
            this.assetListUri = uri3;
            this.startDateUnixUs = j2;
            this.endDateUnixUs = j3;
            this.durationUs = j5;
            this.plannedDurationUs = j16;
            this.f7539cue = list;
            this.endOnNext = z;
            this.resumeOffsetUs = j22;
            this.playoutLimitUs = j42;
            this.snapTypes = ImmutableList.copyOf((Collection) list2);
            this.restrictions = ImmutableList.copyOf((Collection) list3);
            this.clientDefinedAttributes = ImmutableList.sortedCopyOf(new g(11), list4);
            this.contentMayVary = z3;
            this.timelineOccupies = str2;
            this.timelineStyle = str3;
            this.skipControlOffsetUs = j46;
            this.skipControlDurationUs = j47;
            this.skipControlLabelId = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$new$0(ClientDefinedAttribute clientDefinedAttribute, ClientDefinedAttribute clientDefinedAttribute2) {
            return clientDefinedAttribute.name.compareTo(clientDefinedAttribute2.name);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj2;
            return this.startDateUnixUs == interstitial.startDateUnixUs && this.endDateUnixUs == interstitial.endDateUnixUs && this.durationUs == interstitial.durationUs && this.plannedDurationUs == interstitial.plannedDurationUs && this.endOnNext == interstitial.endOnNext && this.resumeOffsetUs == interstitial.resumeOffsetUs && this.playoutLimitUs == interstitial.playoutLimitUs && this.contentMayVary == interstitial.contentMayVary && this.skipControlOffsetUs == interstitial.skipControlOffsetUs && this.skipControlDurationUs == interstitial.skipControlDurationUs && Objects.equals(this.f7540id, interstitial.f7540id) && Objects.equals(this.assetUri, interstitial.assetUri) && Objects.equals(this.assetListUri, interstitial.assetListUri) && Objects.equals(this.f7539cue, interstitial.f7539cue) && Objects.equals(this.snapTypes, interstitial.snapTypes) && Objects.equals(this.restrictions, interstitial.restrictions) && Objects.equals(this.clientDefinedAttributes, interstitial.clientDefinedAttributes) && Objects.equals(this.timelineOccupies, interstitial.timelineOccupies) && Objects.equals(this.timelineStyle, interstitial.timelineStyle) && Objects.equals(this.skipControlLabelId, interstitial.skipControlLabelId);
        }

        public int hashCode() {
            return Objects.hash(this.f7540id, this.assetUri, this.assetListUri, Long.valueOf(this.startDateUnixUs), Long.valueOf(this.endDateUnixUs), Long.valueOf(this.durationUs), Long.valueOf(this.plannedDurationUs), this.f7539cue, Boolean.valueOf(this.endOnNext), Long.valueOf(this.resumeOffsetUs), Long.valueOf(this.playoutLimitUs), this.snapTypes, this.restrictions, this.clientDefinedAttributes, Boolean.valueOf(this.contentMayVary), this.timelineOccupies, this.timelineStyle, Long.valueOf(this.skipControlOffsetUs), Long.valueOf(this.skipControlDurationUs), this.skipControlLabelId);
        }
    }

    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, Segment segment, long j2, int i, long j3, DrmInitData drmInitData, String str2, String str3, long j5, long j16, boolean z, boolean z3, boolean z4) {
            super(str, segment, j2, i, j3, drmInitData, str2, str3, j5, j16, z);
            this.isIndependent = z3;
            this.isPreload = z4;
        }

        public Part copyWith(long j2, int i) {
            return new Part(this.f7543url, this.initializationSegment, this.durationUs, i, j2, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri2, long j2, int i) {
            this.playlistUri = uri2;
            this.lastMediaSequence = j2;
            this.lastPartIndex = i;
        }
    }

    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final DrmInitData drmInitData;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        public final String f7543url;

        private SegmentBase(String str, Segment segment, long j2, int i, long j3, DrmInitData drmInitData, String str2, String str3, long j5, long j16, boolean z) {
            this.f7543url = str;
            this.initializationSegment = segment;
            this.durationUs = j2;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j3;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j5;
            this.byteRangeLength = j16;
            this.hasGapTag = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l2) {
            if (this.relativeStartTimeUs > l2.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l2.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j2, boolean z, long j3, long j5, boolean z3) {
            this.skipUntilUs = j2;
            this.canSkipDateRanges = z;
            this.holdBackUs = j3;
            this.partHoldBackUs = j5;
            this.canBlockReload = z3;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j2, boolean z, long j3, boolean z3, int i2, long j5, int i3, long j16, long j22, boolean z4, boolean z6, boolean z11, DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map, List<Interstitial> list4) {
        super(str, list, z4);
        this.playlistType = i;
        this.startTimeUs = j3;
        this.preciseStart = z;
        this.hasDiscontinuitySequence = z3;
        this.discontinuitySequence = i2;
        this.mediaSequence = j5;
        this.version = i3;
        this.targetDurationUs = j16;
        this.partTargetDurationUs = j22;
        this.hasEndTag = z6;
        this.hasProgramDateTime = z11;
        this.protectionSchemes = drmInitData;
        this.segments = ImmutableList.copyOf((Collection) list2);
        this.trailingParts = ImmutableList.copyOf((Collection) list3);
        this.renditionReports = ImmutableMap.copyOf((Map) map);
        this.interstitials = ImmutableList.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            Part part = (Part) Iterables.getLast(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) Iterables.getLast(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j2 != -9223372036854775807L ? j2 >= 0 ? Math.min(this.durationUs, j2) : Math.max(0L, this.durationUs + j2) : -9223372036854775807L;
        this.hasPositiveStartOffset = j2 >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j2, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j2, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports, this.interstitials);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j2 = this.mediaSequence;
            long j3 = hlsMediaPlaylist.mediaSequence;
            if (j2 <= j3) {
                if (j2 < j3) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        public Segment(String str, long j2, long j3, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j2, j3, false, ImmutableList.of());
        }

        public Segment copyWith(long j2, int i) {
            ArrayList arrayList = new ArrayList();
            long j3 = j2;
            for (int i2 = 0; i2 < this.parts.size(); i2++) {
                Part part = this.parts.get(i2);
                arrayList.add(part.copyWith(j3, i));
                j3 += part.durationUs;
            }
            return new Segment(this.f7543url, this.initializationSegment, this.title, this.durationUs, i, j2, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, Segment segment, String str2, long j2, int i, long j3, DrmInitData drmInitData, String str3, String str4, long j5, long j16, boolean z, List<Part> list) {
            super(str, segment, j2, i, j3, drmInitData, str3, str4, j5, j16, z);
            this.title = str2;
            this.parts = ImmutableList.copyOf((Collection) list);
        }
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public static class ClientDefinedAttribute {
        private final double doubleValue;
        public final String name;
        private final String textValue;
        public final int type;

        public ClientDefinedAttribute(String str, double d) {
            this.name = str;
            this.type = 2;
            this.doubleValue = d;
            this.textValue = null;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ClientDefinedAttribute)) {
                return false;
            }
            ClientDefinedAttribute clientDefinedAttribute = (ClientDefinedAttribute) obj2;
            return this.type == clientDefinedAttribute.type && Double.compare(this.doubleValue, clientDefinedAttribute.doubleValue) == 0 && Objects.equals(this.name, clientDefinedAttribute.name) && Objects.equals(this.textValue, clientDefinedAttribute.textValue);
        }

        public int hashCode() {
            return Objects.hash(this.name, Integer.valueOf(this.type), Double.valueOf(this.doubleValue), this.textValue);
        }

        public ClientDefinedAttribute(String str, String str2, int i) {
            boolean z = true;
            if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z = false;
            }
            Preconditions.checkState(z);
            this.name = str;
            this.type = i;
            this.textValue = str2;
            this.doubleValue = 0.0d;
        }
    }
}
