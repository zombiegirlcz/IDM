package com.google.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2 f49681a = new y2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z2 f49682b = new z2();

    public static String b(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (i < i3) {
            byte b4 = byteBuffer.get(i);
            if (!j.b(b4)) {
                break;
            }
            i++;
            j.c(b4, cArr, i5);
            i5++;
        }
        int i6 = i5;
        while (i < i3) {
            int i21 = i + 1;
            byte b5 = byteBuffer.get(i);
            if (j.b(b5)) {
                int i22 = i6 + 1;
                j.c(b5, cArr, i6);
                int i32 = i21;
                while (i32 < i3) {
                    byte b7 = byteBuffer.get(i32);
                    if (!j.b(b7)) {
                        break;
                    }
                    i32++;
                    j.c(b7, cArr, i22);
                    i22++;
                }
                i6 = i22;
                i = i32;
            } else if (j.d(b5)) {
                if (i21 >= i3) {
                    throw InvalidProtocolBufferException.b();
                }
                i += 2;
                j.e(b5, byteBuffer.get(i21), cArr, i6);
                i6++;
            } else if (j.f(b5)) {
                if (i21 >= i3 - 1) {
                    throw InvalidProtocolBufferException.b();
                }
                int i33 = i + 2;
                i += 3;
                j.g(b5, byteBuffer.get(i21), byteBuffer.get(i33), cArr, i6);
                i6++;
            } else {
                if (i21 >= i3 - 2) {
                    throw InvalidProtocolBufferException.b();
                }
                byte b13 = byteBuffer.get(i21);
                int i43 = i + 3;
                byte b15 = byteBuffer.get(i + 2);
                i += 4;
                j.a(b5, b13, b15, byteBuffer.get(i43), cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    public static String e(p pVar) {
        StringBuilder sb6 = new StringBuilder(pVar.size());
        for (int i = 0; i < pVar.size(); i++) {
            byte bA = pVar.a(i);
            if (bA == 34) {
                sb6.append("\\\"");
            } else if (bA == 39) {
                sb6.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb6.append("\\a");
                        break;
                    case 8:
                        sb6.append("\\b");
                        break;
                    case 9:
                        sb6.append("\\t");
                        break;
                    case 10:
                        sb6.append("\\n");
                        break;
                    case 11:
                        sb6.append("\\v");
                        break;
                    case 12:
                        sb6.append("\\f");
                        break;
                    case 13:
                        sb6.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb6.append(CoreConstants.ESCAPE_CHAR);
                            sb6.append((char) (((bA >>> 6) & 3) + 48));
                            sb6.append((char) (((bA >>> 3) & 7) + 48));
                            sb6.append((char) ((bA & 7) + 48));
                        } else {
                            sb6.append((char) bA);
                        }
                        break;
                }
            } else {
                sb6.append("\\\\");
            }
        }
        return sb6.toString();
    }

    public static Object h(t tVar, k4 k4Var, p4 p4Var) {
        switch (f4.f49705a[k4Var.ordinal()]) {
            case 1:
                return Double.valueOf(tVar.n());
            case 2:
                return Float.valueOf(tVar.r());
            case 3:
                return Long.valueOf(tVar.u());
            case 4:
                return Long.valueOf(tVar.G());
            case 5:
                return Integer.valueOf(tVar.t());
            case 6:
                return Long.valueOf(tVar.q());
            case 7:
                return Integer.valueOf(tVar.p());
            case 8:
                return Boolean.valueOf(tVar.l());
            case 9:
                return tVar.m();
            case 10:
                return Integer.valueOf(tVar.F());
            case 11:
                return Integer.valueOf(tVar.y());
            case 12:
                return Long.valueOf(tVar.z());
            case 13:
                return Integer.valueOf(tVar.A());
            case 14:
                return Long.valueOf(tVar.B());
            case 15:
                return p4Var.a(tVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public abstract String a(byte[] bArr, int i, int i2);

    public abstract String c(ByteBuffer byteBuffer, int i, int i2);

    public abstract int d(String str, byte[] bArr, int i, int i2);

    public boolean f(byte[] bArr, int i, int i2) {
        return g(bArr, i, i2) == 0;
    }

    public abstract int g(byte[] bArr, int i, int i2);

    public abstract void i(byte[] bArr, int i, int i2);
}
