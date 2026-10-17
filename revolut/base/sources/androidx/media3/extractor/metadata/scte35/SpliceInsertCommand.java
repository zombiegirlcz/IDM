package androidx.media3.extractor.metadata.scte35;

import a0.d;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        private ComponentSplice(int i, long j2, long j3) {
            this.componentTag = i;
            this.componentSplicePts = j2;
            this.componentSplicePlaybackPositionUs = j3;
        }
    }

    private SpliceInsertCommand(long j2, boolean z, boolean z3, boolean z4, boolean z6, long j3, long j5, List<ComponentSplice> list, boolean z11, long j16, int i, int i2, int i3) {
        this.spliceEventId = j2;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z3;
        this.programSpliceFlag = z4;
        this.spliceImmediateFlag = z6;
        this.programSplicePts = j3;
        this.programSplicePlaybackPositionUs = j5;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z11;
        this.breakDurationUs = j16;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j2, TimestampAdjuster timestampAdjuster) {
        List list;
        long j3;
        boolean z;
        boolean z3;
        boolean z4;
        boolean z6;
        int i;
        int unsignedByte;
        int unsignedByte2;
        boolean z11;
        int i2;
        long spliceTime;
        long unsignedInt = parsableByteArray.readUnsignedInt();
        boolean z12 = (parsableByteArray.readUnsignedByte() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long unsignedInt2 = -9223372036854775807L;
        if (z12) {
            list = list2;
            j3 = -9223372036854775807L;
            z = false;
            z3 = false;
            z4 = false;
            z6 = false;
            i = 0;
            unsignedByte = 0;
            unsignedByte2 = 0;
        } else {
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            boolean z29 = (unsignedByte3 & 128) != 0;
            boolean z31 = (unsignedByte3 & 64) != 0;
            boolean z41 = (unsignedByte3 & 32) != 0;
            boolean z49 = (unsignedByte3 & 16) != 0;
            long spliceTime2 = (!z31 || z49) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(parsableByteArray, j2);
            if (!z31) {
                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(unsignedByte4);
                int i3 = 0;
                while (i3 < unsignedByte4) {
                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                    if (z49) {
                        i2 = unsignedByte4;
                        spliceTime = -9223372036854775807L;
                    } else {
                        i2 = unsignedByte4;
                        spliceTime = TimeSignalCommand.parseSpliceTime(parsableByteArray, j2);
                    }
                    arrayList.add(new ComponentSplice(unsignedByte5, spliceTime, timestampAdjuster.adjustTsTimestamp(spliceTime)));
                    i3++;
                    unsignedByte4 = i2;
                }
                list2 = arrayList;
            }
            if (z41) {
                long unsignedByte6 = parsableByteArray.readUnsignedByte();
                boolean z54 = (128 & unsignedByte6) != 0;
                unsignedInt2 = ((((unsignedByte6 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z11 = z54;
            } else {
                z11 = false;
            }
            int unsignedShort = parsableByteArray.readUnsignedShort();
            long j5 = spliceTime2;
            j3 = unsignedInt2;
            unsignedInt2 = j5;
            unsignedByte = parsableByteArray.readUnsignedByte();
            unsignedByte2 = parsableByteArray.readUnsignedByte();
            i = unsignedShort;
            z6 = z11;
            z = z29;
            z3 = z31;
            list = list2;
            z4 = z49;
        }
        return new SpliceInsertCommand(unsignedInt, z12, z, z3, z4, unsignedInt2, timestampAdjuster.adjustTsTimestamp(unsignedInt2), list, z6, j3, i, unsignedByte, unsignedByte2);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb6.append(this.programSplicePts);
        sb6.append(", programSplicePlaybackPositionUs= ");
        return d.j(this.programSplicePlaybackPositionUs, " }", sb6);
    }
}
