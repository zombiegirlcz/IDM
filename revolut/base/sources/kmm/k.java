package kmm;

import kotlin.jvm.internal.Intrinsics;
import mmm.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k {
    public static void a(h.a cursor, byte[] key) {
        long j2;
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        Intrinsics.checkNotNullParameter(key, "key");
        int length = key.length;
        int i = 0;
        do {
            byte[] bArr = cursor.e;
            int i2 = cursor.f;
            int i3 = cursor.f207270g;
            if (bArr != null) {
                while (i2 < i3) {
                    int i5 = i % length;
                    bArr[i2] = (byte) (bArr[i2] ^ key[i5]);
                    i2++;
                    i = i5 + 1;
                }
            }
            long j3 = cursor.d;
            mmm.h hVar = cursor.f207267a;
            Intrinsics.h(hVar);
            if (j3 == hVar.f207266b) {
                throw new IllegalStateException("no more bytes");
            }
            j2 = cursor.d;
        } while (cursor.f(j2 == -1 ? 0L : j2 + ((long) (cursor.f207270g - cursor.f))) != -1);
    }
}
