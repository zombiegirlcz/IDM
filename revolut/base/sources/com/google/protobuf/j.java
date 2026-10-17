package com.google.protobuf;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes17.dex */
public abstract class j {
    public static int A(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        t1 t1Var = (t1) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            t1Var.b(p(iO, bArr));
            iO += 8;
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int B(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        m0 m0Var = (m0) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            m0Var.b(Float.intBitsToFloat(n(iO, bArr)));
            iO += 4;
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int C(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        x0 x0Var = (x0) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            iO = O(bArr, iO, iVar);
            x0Var.b(t.c(iVar.f49726a));
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int D(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        t1 t1Var = (t1) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            iO = Q(bArr, iO, iVar);
            t1Var.b(t.d(iVar.f49727b));
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int E(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        x0 x0Var = (x0) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            iO = O(bArr, iO, iVar);
            x0Var.b(iVar.f49726a);
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int F(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        t1 t1Var = (t1) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            iO = Q(bArr, iO, iVar);
            t1Var.b(iVar.f49727b);
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int G(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        x0 x0Var = (x0) i1Var;
        int iO = O(bArr, i2, iVar);
        x0Var.b(t.c(iVar.f49726a));
        while (iO < i3) {
            int iO2 = O(bArr, iO, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iO = O(bArr, iO2, iVar);
            x0Var.b(t.c(iVar.f49726a));
        }
        return iO;
    }

    public static int H(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        t1 t1Var = (t1) i1Var;
        int iQ = Q(bArr, i2, iVar);
        t1Var.b(t.d(iVar.f49727b));
        while (iQ < i3) {
            int iO = O(bArr, iQ, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iQ = Q(bArr, iO, iVar);
            t1Var.b(t.d(iVar.f49727b));
        }
        return iQ;
    }

    public static int I(byte[] bArr, int i, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            iVar.f49728c = "";
            return iO;
        }
        iVar.f49728c = new String(bArr, iO, i2, j1.f49738a);
        return iO + i2;
    }

    public static int J(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i2, iVar);
        int i5 = iVar.f49726a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i5 == 0) {
            i1Var.add("");
        } else {
            i1Var.add(new String(bArr, iO, i5, j1.f49738a));
            iO += i5;
        }
        while (iO < i3) {
            int iO2 = O(bArr, iO, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iO = O(bArr, iO2, iVar);
            int i6 = iVar.f49726a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i6 == 0) {
                i1Var.add("");
            } else {
                i1Var.add(new String(bArr, iO, i6, j1.f49738a));
                iO += i6;
            }
        }
        return iO;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i2, iVar);
        int i5 = iVar.f49726a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i5 == 0) {
            i1Var.add("");
        } else {
            int i6 = iO + i5;
            if (!z3.f49840a.f(bArr, iO, i6)) {
                throw InvalidProtocolBufferException.b();
            }
            i1Var.add(new String(bArr, iO, i5, j1.f49738a));
            iO = i6;
        }
        while (iO < i3) {
            int iO2 = O(bArr, iO, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iO = O(bArr, iO2, iVar);
            int i21 = iVar.f49726a;
            if (i21 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i21 == 0) {
                i1Var.add("");
            } else {
                int i22 = iO + i21;
                if (!z3.f49840a.f(bArr, iO, i22)) {
                    throw InvalidProtocolBufferException.b();
                }
                i1Var.add(new String(bArr, iO, i21, j1.f49738a));
                iO = i22;
            }
        }
        return iO;
    }

    public static int L(byte[] bArr, int i, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            iVar.f49728c = "";
            return iO;
        }
        iVar.f49728c = z3.f49840a.a(bArr, iO, i2);
        return iO + i2;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, m3 m3Var, i iVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i5 = i & 7;
        if (i5 == 0) {
            int iQ = Q(bArr, i2, iVar);
            m3Var.f(i, Long.valueOf(iVar.f49727b));
            return iQ;
        }
        if (i5 == 1) {
            m3Var.f(i, Long.valueOf(p(i2, bArr)));
            return i2 + 8;
        }
        if (i5 == 2) {
            int iO = O(bArr, i2, iVar);
            int i6 = iVar.f49726a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i6 > bArr.length - iO) {
                throw InvalidProtocolBufferException.h();
            }
            if (i6 == 0) {
                m3Var.f(i, p.f49757b);
            } else {
                m3Var.f(i, p.c(iO, i6, bArr));
            }
            return iO + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            m3Var.f(i, Integer.valueOf(n(i2, bArr)));
            return i2 + 4;
        }
        m3 m3Var2 = new m3();
        int i21 = (i & (-8)) | 4;
        int i22 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iO2 = O(bArr, i2, iVar);
            i22 = iVar.f49726a;
            if (i22 == i21) {
                i2 = iO2;
                break;
            }
            i2 = M(i22, bArr, iO2, i3, m3Var2, iVar);
        }
        if (i2 > i3 || i22 != i21) {
            throw InvalidProtocolBufferException.f();
        }
        m3Var.f(i, m3Var2);
        return i2;
    }

    public static int N(int i, byte[] bArr, int i2, i iVar) {
        int i3 = i & CertificateBody.profileType;
        int i5 = i2 + 1;
        byte b4 = bArr[i2];
        if (b4 >= 0) {
            iVar.f49726a = i3 | (b4 << 7);
            return i5;
        }
        int i6 = i3 | ((b4 & Ascii.DEL) << 7);
        int i21 = i2 + 2;
        byte b5 = bArr[i5];
        if (b5 >= 0) {
            iVar.f49726a = i6 | (b5 << 14);
            return i21;
        }
        int i22 = i6 | ((b5 & Ascii.DEL) << 14);
        int i32 = i2 + 3;
        byte b7 = bArr[i21];
        if (b7 >= 0) {
            iVar.f49726a = i22 | (b7 << Ascii.NAK);
            return i32;
        }
        int i33 = i22 | ((b7 & Ascii.DEL) << 21);
        int i43 = i2 + 4;
        byte b13 = bArr[i32];
        if (b13 >= 0) {
            iVar.f49726a = i33 | (b13 << 28);
            return i43;
        }
        int i59 = i33 | ((b13 & Ascii.DEL) << 28);
        while (true) {
            int i66 = i43 + 1;
            if (bArr[i43] >= 0) {
                iVar.f49726a = i59;
                return i66;
            }
            i43 = i66;
        }
    }

    public static int O(byte[] bArr, int i, i iVar) {
        int i2 = i + 1;
        byte b4 = bArr[i];
        if (b4 < 0) {
            return N(b4, bArr, i2, iVar);
        }
        iVar.f49726a = b4;
        return i2;
    }

    public static int P(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        x0 x0Var = (x0) i1Var;
        int iO = O(bArr, i2, iVar);
        x0Var.b(iVar.f49726a);
        while (iO < i3) {
            int iO2 = O(bArr, iO, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iO = O(bArr, iO2, iVar);
            x0Var.b(iVar.f49726a);
        }
        return iO;
    }

    public static int Q(byte[] bArr, int i, i iVar) {
        int i2 = i + 1;
        long j2 = bArr[i];
        if (j2 >= 0) {
            iVar.f49727b = j2;
            return i2;
        }
        int i3 = i + 2;
        byte b4 = bArr[i2];
        long j3 = (j2 & 127) | (((long) (b4 & Ascii.DEL)) << 7);
        int i5 = 7;
        while (b4 < 0) {
            int i6 = i3 + 1;
            byte b5 = bArr[i3];
            i5 += 7;
            j3 |= ((long) (b5 & Ascii.DEL)) << i5;
            b4 = b5;
            i3 = i6;
        }
        iVar.f49727b = j3;
        return i3;
    }

    public static int R(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        t1 t1Var = (t1) i1Var;
        int iQ = Q(bArr, i2, iVar);
        t1Var.b(iVar.f49727b);
        while (iQ < i3) {
            int iO = O(bArr, iQ, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iQ = Q(bArr, iO, iVar);
            t1Var.b(iVar.f49727b);
        }
        return iQ;
    }

    public static boolean S(byte b4) {
        return b4 > -65;
    }

    public static int T(Object obj2, t2 t2Var, byte[] bArr, int i, int i2, int i3, i iVar) {
        int iD = ((h2) t2Var).D(obj2, bArr, i, i2, i3, iVar);
        iVar.f49728c = obj2;
        return iD;
    }

    public static int U(Object obj2, t2 t2Var, byte[] bArr, int i, int i2, i iVar) throws InvalidProtocolBufferException {
        int iN = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iN = N(i3, bArr, iN, iVar);
            i3 = iVar.f49726a;
        }
        int i5 = iN;
        if (i3 < 0 || i3 > i2 - i5) {
            throw InvalidProtocolBufferException.h();
        }
        int i6 = i5 + i3;
        t2Var.b(obj2, bArr, i5, i6, iVar);
        iVar.f49728c = obj2;
        return i6;
    }

    public static w0 V(byte[] bytes, Class clazz) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        q0 q0Var = (q0) w0.getDefaultInstance(clazz).getParserForType();
        q0Var.getClass();
        d0 d0Var = q0.f49772b;
        w0 w0VarD = w0.d(q0Var.f49773a, bytes, 0, bytes.length, d0Var);
        if (w0VarD == null || w0VarD.isInitialized()) {
            Intrinsics.i(w0VarD, "null cannot be cast to non-null type T of com.google.protobuf.GeneratedMessageLiteParser.parse");
            return w0VarD;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = w0VarD.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    public static int W(int i, byte[] bArr, int i2, int i3, i iVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i5 = i & 7;
        if (i5 == 0) {
            return Q(bArr, i2, iVar);
        }
        if (i5 == 1) {
            return i2 + 8;
        }
        if (i5 == 2) {
            return O(bArr, i2, iVar) + iVar.f49726a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.a();
        }
        int i6 = (i & (-8)) | 4;
        int i21 = 0;
        while (i2 < i3) {
            i2 = O(bArr, i2, iVar);
            i21 = iVar.f49726a;
            if (i21 == i6) {
                break;
            }
            i2 = W(i21, bArr, i2, i3, iVar);
        }
        if (i2 > i3 || i21 != i6) {
            throw InvalidProtocolBufferException.f();
        }
        return i2;
    }

    public static void a(byte b4, byte b5, byte b7, byte b13, char[] cArr, int i) {
        if (!S(b5)) {
            if ((((b5 + ISO7816.INS_MANAGE_CHANNEL) + (b4 << 28)) >> 30) == 0 && !S(b7) && !S(b13)) {
                int i2 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b7 & 63) << 6) | (b13 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.b();
    }

    public static boolean b(byte b4) {
        return b4 >= 0;
    }

    public static void c(byte b4, char[] cArr, int i) {
        cArr[i] = (char) b4;
    }

    public static boolean d(byte b4) {
        return b4 < -32;
    }

    public static void e(byte b4, byte b5, char[] cArr, int i) {
        if (b4 < -62 || S(b5)) {
            throw InvalidProtocolBufferException.b();
        }
        cArr[i] = (char) (((b4 & Ascii.US) << 6) | (b5 & 63));
    }

    public static boolean f(byte b4) {
        return b4 < -16;
    }

    public static void g(byte b4, byte b5, byte b7, char[] cArr, int i) {
        if (S(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || S(b7)))) {
            throw InvalidProtocolBufferException.b();
        }
        cArr[i] = (char) (((b4 & 15) << 12) | ((b5 & 63) << 6) | (b7 & 63));
    }

    public static int h(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        k kVar = (k) i1Var;
        int iQ = Q(bArr, i2, iVar);
        kVar.b(iVar.f49727b != 0);
        while (iQ < i3) {
            int iO = O(bArr, iQ, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iQ = Q(bArr, iO, iVar);
            kVar.b(iVar.f49727b != 0);
        }
        return iQ;
    }

    public static int i(byte[] bArr, int i, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 > bArr.length - iO) {
            throw InvalidProtocolBufferException.h();
        }
        if (i2 == 0) {
            iVar.f49728c = p.f49757b;
            return iO;
        }
        iVar.f49728c = p.c(iO, i2, bArr);
        return iO + i2;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        int iO = O(bArr, i2, iVar);
        int i5 = iVar.f49726a;
        if (i5 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i5 > bArr.length - iO) {
            throw InvalidProtocolBufferException.h();
        }
        if (i5 == 0) {
            i1Var.add(p.f49757b);
        } else {
            i1Var.add(p.c(iO, i5, bArr));
            iO += i5;
        }
        while (iO < i3) {
            int iO2 = O(bArr, iO, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iO = O(bArr, iO2, iVar);
            int i6 = iVar.f49726a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i6 > bArr.length - iO) {
                throw InvalidProtocolBufferException.h();
            }
            if (i6 == 0) {
                i1Var.add(p.f49757b);
            } else {
                i1Var.add(p.c(iO, i6, bArr));
                iO += i6;
            }
        }
        return iO;
    }

    public static double k(int i, byte[] bArr) {
        return Double.longBitsToDouble(p(i, bArr));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        z zVar = (z) i1Var;
        zVar.b(k(i2, bArr));
        int i5 = i2 + 8;
        while (i5 < i3) {
            int iO = O(bArr, i5, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            zVar.b(Double.longBitsToDouble(p(iO, bArr)));
            i5 = iO + 8;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(int r7, byte[] r8, int r9, int r10, java.lang.Object r11, com.google.protobuf.d2 r12, com.google.protobuf.l3 r13, com.google.protobuf.i r14) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.m(int, byte[], int, int, java.lang.Object, com.google.protobuf.d2, com.google.protobuf.l3, com.google.protobuf.i):int");
    }

    public static int n(int i, byte[] bArr) {
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static int o(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        x0 x0Var = (x0) i1Var;
        x0Var.b(n(i2, bArr));
        int i5 = i2 + 4;
        while (i5 < i3) {
            int iO = O(bArr, i5, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            x0Var.b(n(iO, bArr));
            i5 = iO + 4;
        }
        return i5;
    }

    public static long p(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int q(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        t1 t1Var = (t1) i1Var;
        t1Var.b(p(i2, bArr));
        int i5 = i2 + 8;
        while (i5 < i3) {
            int iO = O(bArr, i5, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            t1Var.b(p(iO, bArr));
            i5 = iO + 8;
        }
        return i5;
    }

    public static float r(int i, byte[] bArr) {
        return Float.intBitsToFloat(n(i, bArr));
    }

    public static int s(int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        m0 m0Var = (m0) i1Var;
        m0Var.b(r(i2, bArr));
        int i5 = i2 + 4;
        while (i5 < i3) {
            int iO = O(bArr, i5, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            m0Var.b(Float.intBitsToFloat(n(iO, bArr)));
            i5 = iO + 4;
        }
        return i5;
    }

    public static int t(t2 t2Var, byte[] bArr, int i, int i2, int i3, i iVar) {
        w0 w0VarNewInstance = t2Var.newInstance();
        int iT = T(w0VarNewInstance, t2Var, bArr, i, i2, i3, iVar);
        t2Var.makeImmutable(w0VarNewInstance);
        iVar.f49728c = w0VarNewInstance;
        return iT;
    }

    public static int u(t2 t2Var, int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) {
        int i5 = (i & (-8)) | 4;
        int iT = t(t2Var, bArr, i2, i3, i5, iVar);
        i1Var.add(iVar.f49728c);
        while (iT < i3) {
            int iO = O(bArr, iT, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iT = t(t2Var, bArr, iO, i3, i5, iVar);
            i1Var.add(iVar.f49728c);
        }
        return iT;
    }

    public static int v(t2 t2Var, byte[] bArr, int i, int i2, i iVar) throws InvalidProtocolBufferException {
        w0 w0VarNewInstance = t2Var.newInstance();
        int iU = U(w0VarNewInstance, t2Var, bArr, i, i2, iVar);
        t2Var.makeImmutable(w0VarNewInstance);
        iVar.f49728c = w0VarNewInstance;
        return iU;
    }

    public static int w(t2 t2Var, int i, byte[] bArr, int i2, int i3, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        int iV = v(t2Var, bArr, i2, i3, iVar);
        i1Var.add(iVar.f49728c);
        while (iV < i3) {
            int iO = O(bArr, iV, iVar);
            if (i != iVar.f49726a) {
                break;
            }
            iV = v(t2Var, bArr, iO, i3, iVar);
            i1Var.add(iVar.f49728c);
        }
        return iV;
    }

    public static int x(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        k kVar = (k) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            iO = Q(bArr, iO, iVar);
            kVar.b(iVar.f49727b != 0);
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int y(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        z zVar = (z) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            zVar.b(Double.longBitsToDouble(p(iO, bArr)));
            iO += 8;
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int z(byte[] bArr, int i, i1 i1Var, i iVar) throws InvalidProtocolBufferException {
        x0 x0Var = (x0) i1Var;
        int iO = O(bArr, i, iVar);
        int i2 = iVar.f49726a + iO;
        while (iO < i2) {
            x0Var.b(n(iO, bArr));
            iO += 4;
        }
        if (iO == i2) {
            return iO;
        }
        throw InvalidProtocolBufferException.h();
    }
}
