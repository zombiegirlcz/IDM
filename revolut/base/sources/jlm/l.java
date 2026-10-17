package jlm;

import ch.qos.logback.core.CoreConstants;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f175889a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final void a(long j2, long j3, long j5) {
        if (j3 >= 0 && j5 <= j2) {
            if (j3 > j5) {
                throw new IllegalArgumentException(a0.d.t(com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "startIndex (", ") > endIndex ("), j5, CoreConstants.RIGHT_PARENTHESIS_CHAR));
            }
            return;
        }
        StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j3, "startIndex (", ") and endIndex (");
        sbV.append(j5);
        sbV.append(") are not within the range [0..size(");
        sbV.append(j2);
        sbV.append("))");
        throw new IndexOutOfBoundsException(sbV.toString());
    }

    public static final String b(a aVar, long j2) throws EOFException {
        if (j2 == 0) {
            return "";
        }
        i iVar = aVar.f175869a;
        if (iVar == null) {
            throw new IllegalStateException("Unreacheable");
        }
        if (iVar.b() < j2) {
            byte[] bArrE = e(aVar, (int) j2);
            return c8g.a.e(0, bArrE.length, bArrE);
        }
        byte[] bArr = iVar.f175881a;
        int i = iVar.f175882b;
        String strE = c8g.a.e(i, Math.min(iVar.f175883c, ((int) j2) + i), bArr);
        aVar.skip(j2);
        return strE;
    }

    public static final int c(i iVar, byte b4, int i, int i2) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        if (i < 0 || i >= iVar.b()) {
            throw new IllegalArgumentException(String.valueOf(i).toString());
        }
        if (i > i2 || i2 > iVar.b()) {
            throw new IllegalArgumentException(String.valueOf(i2).toString());
        }
        int i3 = iVar.f175882b;
        byte[] bArr = iVar.f175881a;
        while (i < i2) {
            if (bArr[i3 + i] == b4) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final boolean d(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return iVar.b() == 0;
    }

    public static final byte[] e(k kVar, int i) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        long j2 = i;
        if (j2 >= 0) {
            return f(kVar, i);
        }
        throw new IllegalArgumentException(p.a.n(j2, "byteCount (", ") < 0").toString());
    }

    public static final byte[] f(k kVar, int i) throws EOFException {
        if (i == -1) {
            for (long j2 = 2147483647L; kVar.getBuffer().f175871c < 2147483647L && kVar.a(j2); j2 *= (long) 2) {
            }
            if (kVar.getBuffer().f175871c >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + kVar.getBuffer().f175871c).toString());
            }
            i = (int) kVar.getBuffer().f175871c;
        } else {
            kVar.b(i);
        }
        byte[] sink = new byte[i];
        a buffer = kVar.getBuffer();
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = i;
        int i2 = 0;
        a(j3, 0, j3);
        while (i2 < i) {
            int iU5 = buffer.u5(i2, i, sink);
            if (iU5 == -1) {
                throw new EOFException(com.google.android.gms.internal.mlkit_vision_face.a.m("Source exhausted before reading ", i, iU5, " bytes. Only ", " bytes were read."));
            }
            i2 += iU5;
        }
        return sink;
    }

    public static final String g(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        kVar.a(Long.MAX_VALUE);
        return b(kVar.getBuffer(), kVar.getBuffer().f175871c);
    }
}
