package mmm;

import kotlin.jvm.internal.Intrinsics;
import mmm.h;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h.a f207248a = new h.a();

    public static final boolean a(int i, byte[] a7, int i2, byte[] b4, int i3) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        for (int i5 = 0; i5 < i3; i5++) {
            if (a7[i5 + i] != b4[i5 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j2, long j3, long j5) {
        if ((j3 | j5) < 0 || j3 > j2 || j2 - j3 < j5) {
            StringBuilder sbV = com.google.android.gms.internal.mlkit_vision_face.a.v(j2, "size=", " offset=");
            sbV.append(j3);
            sbV.append(" byteCount=");
            sbV.append(j5);
            throw new ArrayIndexOutOfBoundsException(sbV.toString());
        }
    }

    public static final String c(byte b4) {
        char[] cArr = nmm.b.f217394a;
        return kotlin.text.a0.r(new char[]{cArr[(b4 >> 4) & 15], cArr[b4 & 15]});
    }

    public static final String d(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = nmm.b.f217394a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return kotlin.text.a0.s(cArr2, i2, 8);
    }
}
