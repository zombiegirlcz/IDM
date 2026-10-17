package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Util;
import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AdPlaybackState {
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, -9223372036854775807L, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);

    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final SkipInfo[] skipInfos;
        public final int[] states;
        public final long timeUs;

        @Deprecated
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);
        static final String FIELD_MEDIA_ITEMS = Util.intToStringMaxRadix(8);
        static final String FIELD_IDS = Util.intToStringMaxRadix(9);
        static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(10);
        private static final String FIELD_SKIP_INFOS = Util.intToStringMaxRadix(11);

        public AdGroup(long j2) {
            this(j2, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false, new String[0], new SkipInfo[0], false);
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i) {
            int length = jArr.length;
            int iMax = Math.max(i, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static SkipInfo[] copySkipInfosWithSpaceForAdCount(SkipInfo[] skipInfoArr, int i) {
            return (SkipInfo[]) Arrays.copyOf(skipInfoArr, Math.max(i, skipInfoArr.length));
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i) {
            int length = iArr.length;
            int iMax = Math.max(i, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 != null && AdGroup.class == obj2.getClass()) {
                AdGroup adGroup = (AdGroup) obj2;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && Arrays.equals(this.ids, adGroup.ids) && Arrays.equals(this.skipInfos, adGroup.skipInfos) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || this.isServerSideInserted || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i = 0; i < this.count; i++) {
                int i2 = this.states[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.count * 31) + this.originalCount) * 31;
            long j2 = this.timeUs;
            int iHashCode = (Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + ((Arrays.hashCode(this.mediaItems) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31;
            long j3 = this.contentResumeOffsetUs;
            return ((Arrays.hashCode(this.skipInfos) + ((((((iHashCode + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + Arrays.hashCode(this.ids)) * 31)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public AdGroup withAdCount(int i) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i);
            return new AdGroup(this.timeUs, i, this.originalCount, iArrCopyStatesWithSpaceForAdCount, (MediaItem[]) Arrays.copyOf(this.mediaItems, i), jArrCopyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i), copySkipInfosWithSpaceForAdCount(this.skipInfos, i), this.isPlaceholder);
        }

        private AdGroup(long j2, int i, int i2, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, long j3, boolean z, String[] strArr, SkipInfo[] skipInfoArr, boolean z3) {
            int i3 = 0;
            Preconditions.checkArgument(iArr.length == mediaItemArr.length);
            Preconditions.checkArgument(iArr.length == skipInfoArr.length);
            this.timeUs = j2;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j3;
            this.isServerSideInserted = z;
            this.uris = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i3 >= uriArr.length) {
                    this.ids = strArr;
                    this.skipInfos = skipInfoArr;
                    this.isPlaceholder = z3;
                    return;
                } else {
                    MediaItem mediaItem = mediaItemArr[i3];
                    uriArr[i3] = mediaItem == null ? null : ((MediaItem.LocalConfiguration) Preconditions.checkNotNull(mediaItem.localConfiguration)).f7449uri;
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class SkipInfo {
    }

    private AdPlaybackState(Object obj2, AdGroup[] adGroupArr, long j2, long j3, int i) {
        this.adsId = obj2;
        this.adResumePositionUs = j2;
        this.contentDurationUs = j3;
        this.adGroupCount = adGroupArr.length + i;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i;
    }

    private boolean isPositionBeforeAdGroup(long j2, long j3, int i) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i);
        long j5 = adGroup.timeUs;
        return j5 == Long.MIN_VALUE ? j3 == -9223372036854775807L || adGroup.isLivePostrollPlaceholder() || j2 < j3 : j2 < j5;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && AdPlaybackState.class == obj2.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj2;
            if (Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(int i) {
        int i2 = this.removedAdGroupCount;
        return i < i2 ? REMOVED_AD_GROUP : this.adGroups[i - i2];
    }

    public int getAdGroupIndexAfterPositionUs(long j2, long j3) {
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i = this.removedAdGroupCount;
            while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j2) || !getAdGroup(i).shouldPlayAdGroup())) {
                i++;
            }
            if (i < this.adGroupCount && (j3 == -9223372036854775807L || getAdGroup(i).timeUs <= j3)) {
                return i;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j2, long j3) {
        int i = this.adGroupCount - 1;
        int i2 = i - (isLivePostrollPlaceholder(i) ? 1 : 0);
        while (i2 >= 0) {
            long j5 = j2;
            long j16 = j3;
            if (!isPositionBeforeAdGroup(j5, j16, i2)) {
                break;
            }
            i2--;
            j2 = j5;
            j3 = j16;
        }
        if (i2 < 0 || !getAdGroup(i2).hasUnplayedAds()) {
            return -1;
        }
        return i2;
    }

    public int hashCode() {
        int i = this.adGroupCount * 31;
        Object obj2 = this.adsId;
        return Arrays.hashCode(this.adGroups) + ((((((((i + (obj2 == null ? 0 : obj2.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31);
    }

    public boolean isLivePostrollPlaceholder(int i) {
        return i == this.adGroupCount - 1 && getAdGroup(i).isLivePostrollPlaceholder();
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("AdPlaybackState(adsId=");
        sb6.append(this.adsId);
        sb6.append(", adResumePositionUs=");
        sb6.append(this.adResumePositionUs);
        sb6.append(", adGroups=[");
        for (int i = 0; i < this.adGroups.length; i++) {
            sb6.append("adGroup(timeUs=");
            sb6.append(this.adGroups[i].timeUs);
            sb6.append(", ads=[");
            for (int i2 = 0; i2 < this.adGroups[i].states.length; i2++) {
                sb6.append("ad(state=");
                int i3 = this.adGroups[i].states[i2];
                if (i3 == 0) {
                    sb6.append('_');
                } else if (i3 == 1) {
                    sb6.append('R');
                } else if (i3 == 2) {
                    sb6.append('S');
                } else if (i3 == 3) {
                    sb6.append('P');
                } else if (i3 != 4) {
                    sb6.append('?');
                } else {
                    sb6.append('!');
                }
                sb6.append(", durationUs=");
                sb6.append(this.adGroups[i].durationsUs[i2]);
                sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i2 < this.adGroups[i].states.length - 1) {
                    sb6.append(", ");
                }
            }
            sb6.append("])");
            if (i < this.adGroups.length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append("])");
        return sb6.toString();
    }
}
