package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static byte[] AFInAppEventType = null;
    private static short[] AFKeystoreWrapper = null;
    private static int e = 1;
    private static int registerClient;
    private static int valueOf;
    private static int values;

    static {
        AFKeystoreWrapper();
        Color.rgb(0, 0, 0);
        SystemClock.elapsedRealtime();
        TextUtils.getOffsetBefore("", 0);
        SystemClock.elapsedRealtimeNanos();
        View.combineMeasuredStates(0, 0);
        registerClient = (e + 95) % 128;
    }

    @NonNull
    private static AFi1ySDK AFInAppEventParameterName(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        String string;
        if (str == null) {
            return new AFi1ySDK(aFh1aSDK.AFKeystoreWrapper == AFh1gSDK.DEFAULT, AFh1cSDK.NA);
        }
        Object[] objArr = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777155, (short) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), (-1901123894) - ImageFormat.getBitsPerPixel(0), (-910605926) - View.MeasureSpec.getMode(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFh1aSDK.AFKeystoreWrapper == AFh1gSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = values(new StringBuilder(str3).reverse().toString(), aFh1aSDK.AFInAppEventType, "android", "v1", string).equals(str);
        return new AFi1ySDK(zEquals, zEquals ? AFh1cSDK.SUCCESS : AFh1cSDK.FAILURE);
    }

    public static void AFKeystoreWrapper() {
        AFInAppEventParameterName = 508919704;
        values = 672383426;
        valueOf = 1497569430;
        AFInAppEventType = new byte[]{-6, -15, 1, 1, 1, -3, 15, -12, -8, 1, 5, -2, -2, -6, 1, 3, -3, -1, -4, 4, 8, -14, 14, -15, 1, -4, 10, -11, -4, 1, 1, -2, -5, 2, -4, 3, 12, -18, -6, 2, 2, -6, 5, -7, 3, -1, 0, -6, -2, 0, -2, -4, 7, -4, 0, -8, 3, 1, -1, -3, -2, 2, -6, -2};
    }

    private static void a(int i, short s2, byte b4, int i2, int i3, Object[] objArr) {
        int length;
        byte[] bArr;
        int i5;
        int length2;
        byte[] bArr2;
        AFj1bSDK aFj1bSDK = new AFj1bSDK();
        StringBuilder sb6 = new StringBuilder();
        int i6 = i + ((int) (((long) values) ^ (-1575393930485972482L)));
        int i21 = i6 == -1 ? 1 : 0;
        if (i21 != 0) {
            byte[] bArr3 = AFInAppEventType;
            if (bArr3 != null) {
                int i22 = $10 + 25;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                } else {
                    length2 = bArr3.length;
                    bArr2 = new byte[length2];
                }
                for (int i32 = 0; i32 < length2; i32++) {
                    bArr2[i32] = (byte) (((long) bArr3[i32]) ^ (-1575393930485972482L));
                }
                bArr3 = bArr2;
            }
            i6 = bArr3 != null ? (byte) (((byte) (((long) AFInAppEventType[i3 + ((int) (((long) AFInAppEventParameterName) ^ (-1575393930485972482L)))]) ^ (-1575393930485972482L))) + ((int) (((long) values) ^ (-1575393930485972482L)))) : (short) (((short) (((long) AFKeystoreWrapper[i3 + ((int) (((long) AFInAppEventParameterName) ^ (-1575393930485972482L)))]) ^ (-1575393930485972482L))) + ((int) (((long) values) ^ (-1575393930485972482L))));
        }
        if (i6 > 0) {
            aFj1bSDK.AFInAppEventType = ((i3 + i6) - 2) + ((int) (((long) AFInAppEventParameterName) ^ (-1575393930485972482L))) + i21;
            char c2 = (char) (((int) (((long) valueOf) ^ (-1575393930485972482L))) + i2);
            aFj1bSDK.valueOf = c2;
            sb6.append(c2);
            aFj1bSDK.AFKeystoreWrapper = aFj1bSDK.valueOf;
            byte[] bArr4 = AFInAppEventType;
            if (bArr4 != null) {
                int i33 = $10 + 43;
                $11 = i33 % 128;
                if (i33 % 2 == 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 1;
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    bArr[i5] = (byte) (((long) bArr4[i5]) ^ (-1575393930485972482L));
                    i5++;
                }
                bArr4 = bArr;
            }
            boolean z = bArr4 != null;
            aFj1bSDK.values = 1;
            while (aFj1bSDK.values < i6) {
                int i43 = $11;
                $10 = (i43 + 97) % 128;
                if (z) {
                    byte[] bArr5 = AFInAppEventType;
                    aFj1bSDK.AFInAppEventType = aFj1bSDK.AFInAppEventType - 1;
                    aFj1bSDK.valueOf = (char) (aFj1bSDK.AFKeystoreWrapper + (((byte) (((byte) (((long) bArr5[r8]) ^ (-1575393930485972482L))) + s2)) ^ b4));
                } else {
                    short[] sArr = AFKeystoreWrapper;
                    aFj1bSDK.AFInAppEventType = aFj1bSDK.AFInAppEventType - 1;
                    aFj1bSDK.valueOf = (char) (aFj1bSDK.AFKeystoreWrapper + (((short) (((short) (((long) sArr[r9]) ^ (-1575393930485972482L))) + s2)) ^ b4));
                    $10 = (i43 + 37) % 128;
                }
                sb6.append(aFj1bSDK.valueOf);
                aFj1bSDK.AFKeystoreWrapper = aFj1bSDK.valueOf;
                aFj1bSDK.values++;
            }
        }
        objArr[0] = sb6.toString();
    }

    private static String values(String str, String str2, String str3, String str4, String str5) {
        String strAFInAppEventParameterName = AFb1mSDK.AFInAppEventParameterName(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (strAFInAppEventParameterName.length() < 12) {
            registerClient = (e + 123) % 128;
            return strAFInAppEventParameterName;
        }
        String strSubstring = strAFInAppEventParameterName.substring(0, 12);
        int i = e + 63;
        registerClient = i % 128;
        if (i % 2 != 0) {
            int i2 = 42 / 0;
        }
        return strSubstring;
    }

    @NonNull
    public final AFi1ySDK valueOf(@NonNull AFh1aSDK aFh1aSDK, String str, @NonNull String str2, @NonNull String str3) {
        if (aFh1aSDK != null) {
            int i = (e + 79) % 128;
            registerClient = i;
            if (str2 != null) {
                e = (i + 9) % 128;
                if (str3 != null) {
                    return AFInAppEventParameterName(aFh1aSDK, str, str2, str3);
                }
            }
        }
        return new AFi1ySDK(false, AFh1cSDK.INTERNAL_ERROR);
    }
}
