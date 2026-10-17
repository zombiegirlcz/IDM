package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes15.dex */
public class InvalidJpegDataParser {
    private final LargeJpegImageQuirk mQuirk = (LargeJpegImageQuirk) DeviceQuirks.get(LargeJpegImageQuirk.class);

    public static int getJfifEoiMarkEndPosition(byte[] bArr) {
        byte b4;
        int i = 2;
        while (i + 4 <= bArr.length && (b4 = bArr[i]) == -1) {
            int i2 = i + 2;
            int i3 = ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i + 3] & UnsignedBytes.MAX_VALUE);
            if (b4 == -1 && bArr[i + 1] == -38) {
                while (true) {
                    int i5 = i2 + 2;
                    if (i5 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i2] == -1 && bArr[i2 + 1] == -39) {
                        return i5;
                    }
                    i2++;
                }
            } else {
                i += i3 + 2;
            }
        }
        return -1;
    }

    public int getValidDataLength(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.mQuirk;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.shouldCheckInvalidJpegData(bArr)) {
            return bArr.length;
        }
        int jfifEoiMarkEndPosition = getJfifEoiMarkEndPosition(bArr);
        return jfifEoiMarkEndPosition != -1 ? jfifEoiMarkEndPosition : bArr.length;
    }
}
