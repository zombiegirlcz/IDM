package androidx.media3.container;

import androidx.media3.common.util.ParsableByteArray;
import p.a;

/* JADX INFO: loaded from: classes15.dex */
public final class DolbyVisionConfig {
    public final String codecs;
    public final int level;
    public final int profile;

    private DolbyVisionConfig(int i, int i2, String str) {
        this.profile = i;
        this.level = i2;
        this.codecs = str;
    }

    public static DolbyVisionConfig parse(ParsableByteArray parsableByteArray) {
        String str;
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte >> 1;
        int unsignedByte2 = ((parsableByteArray.readUnsignedByte() >> 3) & 31) | ((unsignedByte & 1) << 5);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbS = a.s(str);
        sbS.append(i < 10 ? ".0" : ".");
        sbS.append(i);
        return new DolbyVisionConfig(i, unsignedByte2, com.google.android.gms.internal.mlkit_vision_face.a.s(sbS, unsignedByte2 < 10 ? ".0" : ".", unsignedByte2));
    }
}
