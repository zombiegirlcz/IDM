package com.google.android.gms.internal.play_billing;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes16.dex */
final class zzin {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f46133zza = 0;

    static {
        try {
            if (System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (SecurityException unused) {
        }
        if (zzii.zzx() && zzii.zzy()) {
            int i = zzei.f45956zza;
        }
    }

    public static int zza(String str, byte[] bArr, int i, int i2) {
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
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i21 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        return zzik.zza(str, bArr, i, i2);
                    }
                    i21++;
                    if (i21 != str.length()) {
                        char cCharAt3 = str.charAt(i21);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i32 = i22 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i22] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i22 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i22 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i22 += 4;
                            bArr[i32] = (byte) ((codePoint & 63) | 128);
                        }
                    }
                    return zzik.zza(str, bArr, i, i2);
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

    public static int zzb(String str) {
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
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new zzim(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                } catch (zzim unused) {
                    return str.getBytes(zzga.f46029zza).length;
                }
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    public static boolean zzc(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b4 = bArr[i];
            if (b4 >= 0) {
                i = i3;
            } else {
                if (b4 < -32) {
                    if (i3 < i2 && b4 >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b4 >= -16) {
                    if (i3 >= i2 - 2) {
                        return false;
                    }
                    int i5 = i + 2;
                    byte b5 = bArr[i3];
                    if (b5 <= -65) {
                        if ((((b5 + ISO7816.INS_MANAGE_CHANNEL) + (b4 << 28)) >> 30) == 0) {
                            int i6 = i + 3;
                            if (bArr[i5] <= -65) {
                                i += 4;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 1) {
                    return false;
                }
                int i21 = i + 2;
                byte b7 = bArr[i3];
                if (b7 > -65 || (b4 == -32 && b7 < -96)) {
                    return false;
                }
                if (b4 == -19 && b7 >= -96) {
                    return false;
                }
                i += 3;
                if (bArr[i21] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
