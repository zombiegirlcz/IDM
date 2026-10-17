package androidx.media3.container;

import androidx.media3.common.Metadata;
import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import ehe.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public MdtaMetadataEntry(String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    private static String getFormattedValueForAuxiliaryTracksMap(List<Integer> list) {
        StringBuilder sbS = a.s("track types = ");
        Joiner.on(CoreConstants.COMMA_CHAR).appendTo(sbS, (Iterable<? extends Object>) list);
        return sbS.toString();
    }

    private static void validateData(String str, byte[] bArr, int i) {
        boolean z;
        byte b4;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                Preconditions.checkArgument(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i == 75 && bArr.length == 1 && ((b4 = bArr[0]) == 0 || b4 == 1)) {
                    z = true;
                }
                Preconditions.checkArgument(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                Preconditions.checkArgument(z);
                break;
            case "auxiliary.tracks.map":
                Preconditions.checkArgument(i == 0);
                break;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && MdtaMetadataEntry.class == obj2.getClass()) {
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj2;
            if (this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getAuxiliaryTrackTypesFromMap() {
        Preconditions.checkState(this.key.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b4 = this.value[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b4; i++) {
            arrayList.add(Integer.valueOf(this.value[i + 2]));
        }
        return arrayList;
    }

    public int hashCode() {
        return ((n.b(a.c(527, 31, this.key), 31, this.value) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.typeIndicator
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            androidx.media3.common.util.ParsableByteArray r0 = new androidx.media3.common.util.ParsableByteArray
            byte[] r1 = r4.value
            r0.<init>(r1)
            long r0 = r0.readUnsignedLongToLong()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r4.value
            r1 = 0
            r0 = r0[r1]
            int r0 = java.lang.Byte.toUnsignedInt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r4.value
            int r0 = com.google.common.primitives.Ints.fromByteArray(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r4.value
            int r0 = com.google.common.primitives.Ints.fromByteArray(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r4.value
            java.lang.String r0 = androidx.media3.common.util.Util.fromUtf8Bytes(r0)
            goto L70
        L57:
            java.lang.String r0 = r4.key
            java.lang.String r1 = "auxiliary.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r4.getAuxiliaryTrackTypesFromMap()
            java.lang.String r0 = getFormattedValueForAuxiliaryTracksMap(r0)
            goto L70
        L6a:
            byte[] r0 = r4.value
            java.lang.String r0 = androidx.media3.common.util.Util.toHexString(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mdta: key="
            r1.<init>(r2)
            java.lang.String r2 = r4.key
            java.lang.String r3 = ", value="
            java.lang.String r0 = a0.d.u(r1, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.MdtaMetadataEntry.toString():java.lang.String");
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        validateData(str, bArr, i2);
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }
}
