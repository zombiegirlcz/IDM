package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public final List<Event> events;

    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        private ComponentSplice(int i, long j2) {
            this.componentTag = i;
            this.utcSpliceTime = j2;
        }
    }

    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j2, boolean z, boolean z3, boolean z4, List<ComponentSplice> list, long j3, boolean z6, long j5, int i, int i2, int i3) {
            this.spliceEventId = j2;
            this.spliceEventCancelIndicator = z;
            this.outOfNetworkIndicator = z3;
            this.programSpliceFlag = z4;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j3;
            this.autoReturn = z6;
            this.breakDurationUs = j5;
            this.uniqueProgramId = i;
            this.availNum = i2;
            this.availsExpected = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z;
            ArrayList arrayList;
            boolean z3;
            boolean z4;
            long j2;
            boolean z6;
            long j3;
            int i;
            int i2;
            int unsignedByte;
            boolean z11;
            long unsignedInt;
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            boolean z12 = true;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z = true;
            } else {
                z = true;
                z12 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z12) {
                arrayList = arrayList2;
                z3 = false;
                z4 = false;
                j2 = -9223372036854775807L;
                z6 = false;
                j3 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                unsignedByte = 0;
            } else {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                boolean z29 = (unsignedByte2 & 128) != 0 ? z : false;
                boolean z31 = (unsignedByte2 & 64) != 0 ? z : false;
                boolean z41 = (unsignedByte2 & 32) != 0 ? z : false;
                long unsignedInt3 = z31 ? parsableByteArray.readUnsignedInt() : -9223372036854775807L;
                if (!z31) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(unsignedByte3);
                    int i3 = 0;
                    while (i3 < unsignedByte3) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                        i3++;
                        unsignedByte3 = unsignedByte3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z41) {
                    long unsignedByte4 = parsableByteArray.readUnsignedByte();
                    boolean z49 = (128 & unsignedByte4) != 0;
                    unsignedInt = ((((unsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z11 = z49;
                } else {
                    z11 = false;
                    unsignedInt = -9223372036854775807L;
                }
                int unsignedShort = parsableByteArray.readUnsignedShort();
                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                boolean z54 = z29;
                z6 = z11;
                z3 = z54;
                unsignedByte = parsableByteArray.readUnsignedByte();
                long j5 = unsignedInt3;
                i = unsignedShort;
                i2 = unsignedByte5;
                long j16 = unsignedInt;
                arrayList = arrayList2;
                z4 = z31;
                j2 = j5;
                j3 = j16;
            }
            return new Event(unsignedInt2, z12, z3, z4, arrayList, j2, z6, j3, i, i2, unsignedByte);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }
}
