package co5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kl.c0;
import kn5.e;
import kn5.f;
import kn5.h;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import mn5.c;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements rn5.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f25490a;

    public b(c0 base32Codec, ln5.b crc16XModemCalculator) {
        Intrinsics.checkNotNullParameter(base32Codec, "base32Codec");
        Intrinsics.checkNotNullParameter(crc16XModemCalculator, "crc16XModemCalculator");
        this.f25490a = base32Codec;
    }

    @Override // rn5.a
    public final f a(kn5.a params) {
        byte[] bArrA;
        int i;
        Intrinsics.checkNotNullParameter(params, "params");
        String input = params.f185996a;
        if (input.length() == 0) {
            return new e(h.f186003a);
        }
        if (f0.P0(input) == 'G' && input.length() == 56) {
            String upperCase = input.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (!Intrinsics.f(upperCase, input)) {
                return new e(null);
            }
            Intrinsics.checkNotNullParameter(input, "input");
            if (input.length() == 0) {
                bArrA = null;
                break;
            }
            ArrayList arrayList = new ArrayList(input.length());
            for (int i2 = 0; i2 < input.length(); i2++) {
                int iCharAt = input.charAt(i2) - '0';
                if (iCharAt >= 0) {
                    int[] iArr = (int[]) this.f25490a.f185148b;
                    if (iCharAt < iArr.length && (i = iArr[iCharAt]) != 255) {
                        arrayList.add(Byte.valueOf((byte) i));
                    }
                }
                bArrA = null;
            }
            bArrA = c.a(32, d0.Y0(arrayList));
            if (bArrA == null) {
                return new e(null);
            }
            int length = bArrA.length - 2;
            byte[] input2 = d.l0(bArrA, kotlin.ranges.f.o(0, length));
            byte[] bArrL0 = d.l0(bArrA, kotlin.ranges.f.o(length, bArrA.length));
            Intrinsics.checkNotNullParameter(input2, "input");
            int i3 = 0;
            for (byte b4 : input2) {
                i3 = (i3 << 8) ^ ln5.b.f197109a[(b4 ^ (i3 >>> 8)) & 255];
            }
            int i5 = 65535 & i3;
            return Arrays.equals(new byte[]{(byte) i5, (byte) (i5 >>> 8)}, bArrL0) ? kn5.c.f186000a : new e(null);
        }
        return new e(null);
    }
}
