package l8;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c8.m {
    public static final c8.j d = new c8.j("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new mp.r(20));
    public static final c8.j e = new c8.j("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new yf.c(15));
    public static final qf.b f = new qf.b(7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f192726g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f192727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f8.a f192728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf.b f192729c = f;

    public e0(f8.a aVar, d0 d0Var) {
        this.f192728b = aVar;
        this.f192727a = d0Var;
    }

    @Override // c8.m
    public final boolean a(Object obj2, c8.k kVar) {
        return true;
    }

    @Override // c8.m
    public final e8.e0 b(Object obj2, int i, int i2, c8.k kVar) throws Exception {
        long jLongValue = ((Long) kVar.a(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(p.a.m(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) kVar.a(e);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) kVar.a(n.f);
        if (nVar == null) {
            nVar = n.e;
        }
        n nVar2 = nVar;
        this.f192729c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f192727a.l(mediaMetadataRetriever, obj2);
            try {
                Bitmap bitmapC = c(obj2, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, nVar2);
                if (Build.VERSION.SDK_INT >= 29) {
                    kii.e.v(mediaMetadataRetriever);
                } else {
                    mediaMetadataRetriever.release();
                }
                return c.c(bitmapC, this.f192728b);
            } catch (Throwable th10) {
                th = th10;
                Throwable th11 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    kii.e.v(mediaMetadataRetriever);
                    throw th11;
                }
                mediaMetadataRetriever.release();
                throw th11;
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap c(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, l8.n r21) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.e0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, l8.n):android.graphics.Bitmap");
    }
}
