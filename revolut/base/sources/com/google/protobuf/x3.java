package com.google.protobuf;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends a3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f49834c;

    public static int j(byte[] bArr, int i, long j2, int i2) {
        if (i2 == 0) {
            a3 a3Var = z3.f49840a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return z3.c(i, w3.g(bArr, j2));
        }
        if (i2 == 2) {
            return z3.d(i, w3.g(bArr, j2), w3.g(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // com.google.protobuf.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(byte[] r8, int r9, int r10) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x3.a(byte[], int, int):java.lang.String");
    }

    @Override // com.google.protobuf.a3
    public final String c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        long j2;
        switch (this.f49834c) {
            case 0:
                return a3.b(byteBuffer, i, i2);
            default:
                if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                long j3 = w3.f49823c.j(byteBuffer, w3.f49824g) + ((long) i);
                long j5 = ((long) i2) + j3;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (true) {
                    j2 = 1;
                    if (j3 < j5) {
                        byte bE = w3.f49823c.e(j3);
                        if (j.b(bE)) {
                            j3++;
                            j.c(bE, cArr, i3);
                            i3++;
                        }
                    }
                }
                int i5 = i3;
                while (j3 < j5) {
                    long j16 = j3 + j2;
                    v3 v3Var = w3.f49823c;
                    byte bE2 = v3Var.e(j3);
                    if (j.b(bE2)) {
                        int i6 = i5 + 1;
                        j.c(bE2, cArr, i5);
                        while (j16 < j5) {
                            byte bE3 = w3.f49823c.e(j16);
                            if (j.b(bE3)) {
                                j16 += j2;
                                j.c(bE3, cArr, i6);
                                i6++;
                            } else {
                                i5 = i6;
                                j3 = j16;
                            }
                        }
                        i5 = i6;
                        j3 = j16;
                    } else if (j.d(bE2)) {
                        if (j16 >= j5) {
                            throw InvalidProtocolBufferException.b();
                        }
                        j3 += 2;
                        j.e(bE2, v3Var.e(j16), cArr, i5);
                        i5++;
                    } else if (j.f(bE2)) {
                        if (j16 >= j5 - j2) {
                            throw InvalidProtocolBufferException.b();
                        }
                        long j22 = j3 + 2;
                        j3 += 3;
                        j.g(bE2, v3Var.e(j16), v3Var.e(j22), cArr, i5);
                        i5++;
                    } else {
                        if (j16 >= j5 - 2) {
                            throw InvalidProtocolBufferException.b();
                        }
                        byte bE4 = v3Var.e(j16);
                        long j42 = j3 + 3;
                        byte bE5 = v3Var.e(j3 + 2);
                        j3 += 4;
                        j.a(bE2, bE4, bE5, v3Var.e(j42), cArr, i5);
                        i5 += 2;
                    }
                    j2 = 1;
                }
                return new String(cArr, 0, i5);
        }
    }

    @Override // com.google.protobuf.a3
    public final int d(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i5;
        char cCharAt;
        long j2;
        char c2;
        long j3;
        long j5;
        char c3;
        int i6;
        char cCharAt2;
        switch (this.f49834c) {
            case 0:
                int length = str.length();
                int i21 = i2 + i;
                int i22 = 0;
                while (i22 < length && (i5 = i22 + i) < i21 && (cCharAt = str.charAt(i22)) < 128) {
                    bArr[i5] = (byte) cCharAt;
                    i22++;
                }
                if (i22 == length) {
                    return i + length;
                }
                int i32 = i + i22;
                while (i22 < length) {
                    char cCharAt3 = str.charAt(i22);
                    if (cCharAt3 < 128 && i32 < i21) {
                        bArr[i32] = (byte) cCharAt3;
                        i32++;
                    } else if (cCharAt3 < 2048 && i32 <= i21 - 2) {
                        int i33 = i32 + 1;
                        bArr[i32] = (byte) ((cCharAt3 >>> 6) | 960);
                        i32 += 2;
                        bArr[i33] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i32 > i21 - 3) {
                            if (i32 > i21 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i3 = i22 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i3)))) {
                                    throw new y3(i22, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i32);
                            }
                            int i43 = i22 + 1;
                            if (i43 != str.length()) {
                                char cCharAt4 = str.charAt(i43);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i32] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i32 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i59 = i32 + 3;
                                    bArr[i32 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i32 += 4;
                                    bArr[i59] = (byte) ((codePoint & 63) | 128);
                                    i22 = i43;
                                } else {
                                    i22 = i43;
                                }
                            }
                            throw new y3(i22 - 1, length);
                        }
                        bArr[i32] = (byte) ((cCharAt3 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH);
                        int i66 = i32 + 2;
                        bArr[i32 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i32 += 3;
                        bArr[i66] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i22++;
                }
                return i32;
            default:
                long j16 = i;
                long j22 = ((long) i2) + j16;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i74 = 0;
                while (true) {
                    j2 = 1;
                    c2 = 128;
                    if (i74 < length2 && (cCharAt2 = str.charAt(i74)) < 128) {
                        w3.k(bArr, j16, (byte) cCharAt2);
                        i74++;
                        j16 = 1 + j16;
                    }
                }
                if (i74 == length2) {
                    return (int) j16;
                }
                while (i74 < length2) {
                    char cCharAt5 = str.charAt(i74);
                    if (cCharAt5 < c2 && j16 < j22) {
                        w3.k(bArr, j16, (byte) cCharAt5);
                        c3 = c2;
                        j3 = j2;
                        j5 = j16 + j2;
                    } else if (cCharAt5 >= 2048 || j16 > j22 - 2) {
                        j3 = j2;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j16 > j22 - 3) {
                            long j42 = j16;
                            if (j42 > j22 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i74 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                    throw new y3(i74, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j42);
                            }
                            int i92 = i74 + 1;
                            if (i92 != length2) {
                                char cCharAt6 = str.charAt(i92);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    w3.k(bArr, j42, (byte) ((codePoint2 >>> 18) | 240));
                                    c3 = 128;
                                    w3.k(bArr, j42 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    w3.k(bArr, j42 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    w3.k(bArr, j42 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j5 = j42 + 4;
                                    i74 = i92;
                                } else {
                                    i74 = i92;
                                }
                            }
                            throw new y3(i74 - 1, length2);
                        }
                        w3.k(bArr, j16, (byte) ((cCharAt5 >>> '\f') | DefaultFrameSampler.DESIRED_FRAME_WIDTH));
                        long j46 = j16;
                        w3.k(bArr, j16 + j3, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j5 = j46 + 3;
                        w3.k(bArr, j46 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c3 = 128;
                    } else {
                        j3 = j2;
                        w3.k(bArr, j16, (byte) ((cCharAt5 >>> 6) | 960));
                        w3.k(bArr, j16 + j3, (byte) ((cCharAt5 & '?') | c2));
                        j5 = j16 + 2;
                        c3 = c2;
                    }
                    i74++;
                    c2 = c3;
                    j16 = j5;
                    j2 = j3;
                }
                return (int) j16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
    
        return -1;
     */
    @Override // com.google.protobuf.a3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.x3.g(byte[], int, int):int");
    }
}
