package com.onfido.android.sdk.capture.ui.camera;

import android.media.ExifInterface;
import com.google.common.primitives.UnsignedBytes;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes17.dex */
public class Exif {
    private static final String TAG = "CameraExif";

    public static void copy(ExifInterface exifInterface, ExifInterface exifInterface2, String... strArr) {
        String str;
        String attribute;
        Object obj2;
        try {
            ArrayList arrayList = new ArrayList();
            for (String str2 : strArr) {
                arrayList.add(str2.toLowerCase(Locale.ROOT));
            }
            for (Field field : exifInterface.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.getName().startsWith("TAG_")) {
                    try {
                        obj2 = field.get(exifInterface);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        str = null;
                    }
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                        if (str != null && (attribute = exifInterface.getAttribute(str)) != null && !arrayList.contains(str.toLowerCase(Locale.ROOT))) {
                            exifInterface2.setAttribute(str, attribute);
                        }
                    }
                }
            }
            exifInterface2.saveAttributes();
        } catch (RuntimeException e2) {
            Timber.e(e2, "Exif copy failed", new Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        com.onfido.android.sdk.capture.internal.util.logging.Timber.e("Invalid length", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0062, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
    
        r8 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int exifOrientationIdentifier(byte[] r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = r0
        L5:
            int r2 = r1 + 3
            int r3 = r10.length
            r4 = 1
            r5 = 8
            r6 = 4
            r7 = 2
            if (r2 >= r3) goto L63
            int r2 = r1 + 1
            r3 = r10[r1]
            r8 = 255(0xff, float:3.57E-43)
            r3 = r3 & r8
            if (r3 != r8) goto L62
            r3 = r10[r2]
            r3 = r3 & r8
            if (r3 != r8) goto L1f
        L1d:
            r1 = r2
            goto L5
        L1f:
            int r2 = r1 + 2
            r8 = 216(0xd8, float:3.03E-43)
            if (r3 == r8) goto L1d
            if (r3 != r4) goto L28
            goto L1d
        L28:
            r8 = 217(0xd9, float:3.04E-43)
            if (r3 == r8) goto L62
            r8 = 218(0xda, float:3.05E-43)
            if (r3 != r8) goto L31
            goto L62
        L31:
            int r8 = pack(r10, r2, r7, r0)
            if (r8 < r7) goto L5a
            int r2 = r2 + r8
            int r9 = r10.length
            if (r2 <= r9) goto L3c
            goto L5a
        L3c:
            r9 = 225(0xe1, float:3.15E-43)
            if (r3 != r9) goto L1d
            if (r8 < r5) goto L1d
            int r3 = r1 + 4
            int r3 = pack(r10, r3, r6, r0)
            r9 = 1165519206(0x45786966, float:3974.5874)
            if (r3 != r9) goto L1d
            int r3 = r1 + 8
            int r3 = pack(r10, r3, r7, r0)
            if (r3 != 0) goto L1d
            int r1 = r1 + 10
            int r8 = r8 + (-8)
            goto L64
        L5a:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r1 = "Invalid length"
            com.onfido.android.sdk.capture.internal.util.logging.Timber.e(r1, r10)
            return r0
        L62:
            r1 = r2
        L63:
            r8 = r0
        L64:
            if (r8 <= r5) goto Lba
            int r2 = pack(r10, r1, r6, r0)
            r3 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r3) goto L7c
            r9 = 1296891946(0x4d4d002a, float:2.1495875E8)
            if (r2 == r9) goto L7c
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r1 = "Invalid byte order"
            com.onfido.android.sdk.capture.internal.util.logging.Timber.e(r1, r10)
            return r0
        L7c:
            if (r2 != r3) goto L7f
            goto L80
        L7f:
            r4 = r0
        L80:
            int r2 = r1 + 4
            int r2 = pack(r10, r2, r6, r4)
            int r2 = r2 + r7
            r3 = 10
            if (r2 < r3) goto Lb2
            if (r2 <= r8) goto L8e
            goto Lb2
        L8e:
            int r1 = r1 + r2
            int r8 = r8 - r2
            int r2 = r1 + (-2)
            int r2 = pack(r10, r2, r7, r4)
        L96:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto Lba
            r2 = 12
            if (r8 < r2) goto Lba
            int r2 = pack(r10, r1, r7, r4)
            r6 = 274(0x112, float:3.84E-43)
            if (r2 != r6) goto Lac
            int r1 = r1 + r5
            int r10 = pack(r10, r1, r7, r4)
            return r10
        Lac:
            int r1 = r1 + 12
            int r8 = r8 + (-12)
            r2 = r3
            goto L96
        Lb2:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r1 = "Invalid offset"
            com.onfido.android.sdk.capture.internal.util.logging.Timber.e(r1, r10)
            return r0
        Lba:
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r1 = "Orientation not found"
            com.onfido.android.sdk.capture.internal.util.logging.Timber.i(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.Exif.exifOrientationIdentifier(byte[]):int");
    }

    private static int pack(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i5 = 0;
        while (true) {
            int i6 = i2 - 1;
            if (i2 <= 0) {
                return i5;
            }
            i5 = (bArr[i] & UnsignedBytes.MAX_VALUE) | (i5 << 8);
            i += i3;
            i2 = i6;
        }
    }
}
