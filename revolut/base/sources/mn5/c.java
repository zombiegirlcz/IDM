package mn5;

import com.google.common.primitives.UnsignedBytes;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static byte[] a(int i, byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length == 0) {
            return null;
        }
        int length = input.length;
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (int i3 : input) {
            int length2 = input.length;
            while (true) {
                length2--;
                if (-1 < length2) {
                    int i5 = ((bArr[length2] & UnsignedBytes.MAX_VALUE) * i) + i3;
                    bArr[length2] = (byte) (i5 % 256);
                    i3 = i5 / 256;
                }
            }
        }
        int i6 = 0;
        while (i6 < input.length && input[i6] == 0) {
            i6++;
        }
        while (i2 < length && bArr[i2] == 0) {
            i2++;
        }
        return d.l0(bArr, f.o(i2 - i6, length));
    }
}
