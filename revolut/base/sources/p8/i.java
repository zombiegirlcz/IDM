package p8;

import c8.k;
import c8.m;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f233813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f233814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f8.f f233815c;

    public i(ArrayList arrayList, a aVar, f8.f fVar) {
        this.f233813a = arrayList;
        this.f233814b = aVar;
        this.f233815c = fVar;
    }

    @Override // c8.m
    public final boolean a(Object obj2, k kVar) {
        return !((Boolean) kVar.a(h.f233812b)).booleanValue() && hb9.b.q(this.f233813a, (InputStream) obj2, this.f233815c) == ImageHeaderParser$ImageType.GIF;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // c8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e8.e0 b(java.lang.Object r6, int r7, int r8, c8.k r9) {
        /*
            r5 = this;
            java.io.InputStream r6 = (java.io.InputStream) r6
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.IOException -> L18
        Lc:
            int r3 = r6.read(r1)     // Catch: java.io.IOException -> L18
            r4 = -1
            if (r3 == r4) goto L1a
            r4 = 0
            r0.write(r1, r4, r3)     // Catch: java.io.IOException -> L18
            goto Lc
        L18:
            r6 = move-exception
            goto L22
        L1a:
            r0.flush()     // Catch: java.io.IOException -> L18
            byte[] r6 = r0.toByteArray()
            goto L2f
        L22:
            r0 = 5
            java.lang.String r1 = "StreamGifDecoder"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "Error reading data from stream"
        L2e:
            r6 = r2
        L2f:
            if (r6 != 0) goto L32
            goto L3c
        L32:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            p8.a r0 = r5.f233814b
            e8.e0 r2 = r0.b(r6, r7, r8, r9)
        L3c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.i.b(java.lang.Object, int, int, c8.k):e8.e0");
    }
}
