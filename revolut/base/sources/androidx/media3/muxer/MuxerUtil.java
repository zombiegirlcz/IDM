package androidx.media3.muxer;

import android.media.MediaCodec;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MuxerUtil {
    public static MdtaMetadataEntry getAuxiliaryTracksLengthMetadata(long j2) {
        return new MdtaMetadataEntry("auxiliary.tracks.length", Longs.toByteArray(j2), 78);
    }

    private static MdtaMetadataEntry getAuxiliaryTracksMapMetadata(List<Track> list) {
        int i;
        int size = list.size();
        byte[] bArr = new byte[size + 2];
        bArr[0] = 1;
        bArr[1] = (byte) size;
        for (int i2 = 0; i2 < size; i2++) {
            Track track = list.get(i2);
            int i3 = track.format.auxiliaryTrackType;
            if (i3 != 1) {
                i = 2;
                if (i3 == 2) {
                    i = 1;
                } else if (i3 == 3) {
                    continue;
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException("Unsupported auxiliary track type " + track.format.auxiliaryTrackType);
                    }
                    i = 3;
                }
            } else {
                i = 0;
            }
            bArr[i2 + 2] = (byte) i;
        }
        return new MdtaMetadataEntry("auxiliary.tracks.map", bArr, 0);
    }

    public static MdtaMetadataEntry getAuxiliaryTracksOffsetMetadata(long j2) {
        return new MdtaMetadataEntry("auxiliary.tracks.offset", Longs.toByteArray(j2), 78);
    }

    private static MdtaMetadataEntry getAuxiliaryTracksSamplesLocationMetadata(boolean z) {
        return new MdtaMetadataEntry("auxiliary.tracks.interleaved", new byte[]{z ? (byte) 1 : (byte) 0}, 75);
    }

    public static BufferInfo getMuxerBufferInfoFromMediaCodecBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        Preconditions.checkNotNull(bufferInfo);
        return new BufferInfo(bufferInfo.presentationTimeUs, bufferInfo.size, Util.getBufferFlagsFromMediaCodecFlags(bufferInfo.flags));
    }

    public static boolean isAuxiliaryTrack(Format format) {
        if ((format.roleFlags & 32768) <= 0) {
            return false;
        }
        int i = format.auxiliaryTrackType;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    private static boolean isMdtaMetadataEntrySupported(MdtaMetadataEntry mdtaMetadataEntry) {
        int i = mdtaMetadataEntry.typeIndicator;
        return i == 1 || i == 23;
    }

    public static boolean isMetadataSupported(Metadata.Entry entry) {
        if ((entry instanceof Mp4OrientationData) || (entry instanceof Mp4LocationData)) {
            return true;
        }
        if ((entry instanceof Mp4TimestampData) && isMp4TimestampDataSupported((Mp4TimestampData) entry)) {
            return true;
        }
        return (entry instanceof MdtaMetadataEntry) && isMdtaMetadataEntrySupported((MdtaMetadataEntry) entry);
    }

    private static boolean isMp4TimestampDataSupported(Mp4TimestampData mp4TimestampData) {
        return mp4TimestampData.creationTimestampSeconds <= BodyPartID.bodyIdMax && mp4TimestampData.modificationTimestampSeconds <= BodyPartID.bodyIdMax;
    }

    public static void populateAuxiliaryTracksMetadata(MetadataCollector metadataCollector, Mp4TimestampData mp4TimestampData, boolean z, List<Track> list) {
        metadataCollector.addMetadata(mp4TimestampData);
        metadataCollector.addMetadata(getAuxiliaryTracksSamplesLocationMetadata(z));
        metadataCollector.addMetadata(getAuxiliaryTracksMapMetadata(list));
    }
}
