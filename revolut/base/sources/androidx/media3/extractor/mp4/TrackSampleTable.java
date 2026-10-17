package androidx.media3.extractor.mp4;

import a10.b;
import androidx.media3.common.util.Util;
import com.google.common.base.Preconditions;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSampleTable {
    public final long durationUs;
    public final int[] flags;
    public final boolean hasOnlySyncSamples;
    public final int maximumSize;
    public final long[] offsets;
    public final int sampleCount;
    public final int[] sizes;
    public final int[] syncSampleIndices;
    public final long[] timestampsUs;
    public final Track track;

    public TrackSampleTable(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j2, int i2) {
        Preconditions.checkArgument(iArr.length == jArr2.length);
        Preconditions.checkArgument(jArr.length == jArr2.length);
        Preconditions.checkArgument(iArr2.length == jArr2.length);
        this.track = track;
        this.offsets = jArr;
        this.sizes = iArr;
        this.maximumSize = i;
        this.timestampsUs = jArr2;
        this.flags = iArr2;
        this.syncSampleIndices = iArr3;
        this.hasOnlySyncSamples = z;
        this.durationUs = j2;
        this.sampleCount = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | PKIFailureInfo.duplicateCertReq;
        }
    }

    public int getIndexOfEarlierOrEqualSynchronizationSample(long j2) {
        int i = 0;
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchFloor(this.timestampsUs, j2, true, false);
        }
        int length = this.syncSampleIndices.length - 1;
        int i2 = -1;
        while (i <= length) {
            int iA = b.a(length, i, 2, i);
            if (this.timestampsUs[this.syncSampleIndices[iA]] <= j2) {
                i = iA + 1;
                i2 = iA;
            } else {
                length = iA - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j3 = this.timestampsUs[this.syncSampleIndices[i2]];
        if (j3 == j2) {
            while (i2 > 0 && this.timestampsUs[this.syncSampleIndices[i2 - 1]] == j3) {
                i2--;
            }
        }
        return this.syncSampleIndices[i2];
    }

    public int getIndexOfLaterOrEqualSynchronizationSample(long j2) {
        int i = 0;
        if (this.hasOnlySyncSamples) {
            return Util.binarySearchCeil(this.timestampsUs, j2, true, false);
        }
        int length = this.syncSampleIndices.length - 1;
        int i2 = -1;
        while (i <= length) {
            int iA = b.a(length, i, 2, i);
            if (this.timestampsUs[this.syncSampleIndices[iA]] >= j2) {
                length = iA - 1;
                i2 = iA;
            } else {
                i = iA + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j3 = this.timestampsUs[this.syncSampleIndices[i2]];
        if (j3 == j2) {
            while (true) {
                int[] iArr = this.syncSampleIndices;
                if (i2 >= iArr.length - 1) {
                    break;
                }
                int i3 = i2 + 1;
                if (this.timestampsUs[iArr[i3]] != j3) {
                    break;
                }
                i2 = i3;
            }
        }
        return this.syncSampleIndices[i2];
    }
}
