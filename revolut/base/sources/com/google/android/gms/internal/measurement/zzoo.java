package com.google.android.gms.internal.measurement;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;

/* JADX INFO: loaded from: classes16.dex */
final class zzoo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40557zza = 0;

    static {
        if (zzol.zzx() && zzol.zzy()) {
            int i = zzkr.f40391zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b4 = bArr[i - 1];
        if (i3 == 0) {
            if (b4 <= -12) {
                return b4;
            }
            return -1;
        }
        if (i3 == 1) {
            byte b5 = bArr[i];
            if (b4 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b4;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i];
        byte b13 = bArr[i + 1];
        if (b4 > -12 || b7 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b7 << 8) ^ b4);
    }

    public static int zzb(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i21 = 0;
        while (true) {
            i3 = i + i2;
            if (i21 >= length || (i6 = i21 + i) >= i3 || (cCharAt = str.charAt(i21)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i21++;
        }
        if (i21 == length) {
            return i + length;
        }
        int i22 = i + i21;
        while (i21 < length) {
            char cCharAt2 = str.charAt(i21);
            if (cCharAt2 < 128 && i22 < i3) {
                bArr[i22] = (byte) cCharAt2;
                i22++;
            } else if (cCharAt2 < 2048 && i22 <= i3 - 2) {
                bArr[i22] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i22 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i22 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i22 > i3 - 3) {
                    if (i22 > i3 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i21 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new zzon(i21, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i22);
                    }
                    int i32 = i21 + 1;
                    if (i32 != str.length()) {
                        char cCharAt3 = str.charAt(i32);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i33 = i22 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i22] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i22 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i22 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i22 += 4;
                            bArr[i33] = (byte) ((codePoint & 63) | 128);
                            i21 = i32;
                        } else {
                            i21 = i32;
                        }
                    }
                    throw new zzon(i21 - 1, length);
                }
                bArr[i22] = (byte) ((cCharAt2 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                bArr[i22 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i22 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i22 += 3;
            }
            i21++;
        }
        return i22;
    }

    public static int zzc(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new zzon(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzd(byte[] r6, int r7, int r8) {
        /*
        L0:
            if (r7 >= r8) goto L9
            r0 = r6[r7]
            if (r0 < 0) goto L9
            int r7 = r7 + 1
            goto L0
        L9:
            if (r7 < r8) goto Ld
            goto L7a
        Ld:
            if (r7 >= r8) goto L7a
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L78
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L29
            if (r0 < r8) goto L1e
            goto L57
        L1e:
            r2 = -62
            if (r1 < r2) goto L76
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto Ld
            goto L76
        L29:
            r4 = -16
            if (r1 >= r4) goto L4f
            int r4 = r8 + (-1)
            if (r0 < r4) goto L36
            int r1 = zza(r6, r0, r8)
            goto L57
        L36:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            r5 = -96
            if (r1 != r2) goto L42
            if (r0 < r5) goto L76
        L42:
            r2 = -19
            if (r1 != r2) goto L48
            if (r0 >= r5) goto L76
        L48:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto Ld
            goto L76
        L4f:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5a
            int r1 = zza(r6, r0, r8)
        L57:
            if (r1 == 0) goto L7a
            goto L76
        L5a:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L76
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L76
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L76
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 > r3) goto L76
            goto Ld
        L76:
            r6 = 0
            return r6
        L78:
            r7 = r0
            goto Ld
        L7a:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzoo.zzd(byte[], int, int):boolean");
    }
}
