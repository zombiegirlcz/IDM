package p8;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import c8.k;
import c8.m;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m {
    public static final af.f f = new af.f(11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final yf.c f233793g = new yf.c(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f233794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f233795b;
    public final cpi.g e;
    public final af.f d = f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yf.c f233796c = f233793g;

    public a(Context context, ArrayList arrayList, f8.a aVar, f8.f fVar) {
        this.f233794a = context.getApplicationContext();
        this.f233795b = arrayList;
        this.e = new cpi.g(aVar, fVar, 21);
    }

    public static int d(a8.c cVar, int i, int i2) {
        int iMin = Math.min(cVar.a() / i2, cVar.d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("Downsampling GIF, sampleSize: ", iMax, i, ", target dimens: [", "x");
            sbW.append(i2);
            sbW.append("], actual dimens: [");
            sbW.append(cVar.d());
            sbW.append("x");
            sbW.append(cVar.a());
            sbW.append("]");
            sbW.toString();
        }
        return iMax;
    }

    @Override // c8.m
    public final boolean a(Object obj2, k kVar) {
        return !((Boolean) kVar.a(h.f233812b)).booleanValue() && hb9.b.r(this.f233795b, (ByteBuffer) obj2) == ImageHeaderParser$ImageType.GIF;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:38:0x0056
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // c8.m
    public final e8.e0 b(java.lang.Object r8, int r9, int r10, c8.k r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            yf.c r8 = r7.f233796c
            monitor-enter(r8)
            java.lang.Object r0 = r8.b     // Catch: java.lang.Throwable -> L51
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L51
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L51
            a8.d r0 = (a8.d) r0     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L17
            a8.d r0 = new a8.d     // Catch: java.lang.Throwable -> L19
            r0.<init>()     // Catch: java.lang.Throwable -> L19
        L17:
            r5 = r0
            goto L1d
        L19:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L54
        L1d:
            r5.g(r2)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            n8.c r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c
            yf.c r9 = r1.f233796c
            monitor-enter(r9)
            r5.a()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r9.b     // Catch: java.lang.Throwable -> L38
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L38
            r10.offer(r5)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r9)
            return r8
        L38:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L38
            throw r8
        L3c:
            r0 = move-exception
            r8 = r0
            yf.c r9 = r1.f233796c
            monitor-enter(r9)
            r5.a()     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r10 = r9.b     // Catch: java.lang.Throwable -> L4d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L4d
            r10.offer(r5)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r9)
            throw r8
        L4d:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L4d
            throw r8
        L51:
            r0 = move-exception
            r1 = r7
        L53:
            r9 = r0
        L54:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L56:
            r0 = move-exception
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.a.b(java.lang.Object, int, int, c8.k):e8.e0");
    }

    public final n8.c c(ByteBuffer byteBuffer, int i, int i2, a8.d dVar, k kVar) {
        StringBuilder sb6;
        int i3 = y8.h.f311602b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            a8.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = kVar.a(h.f233811a) == c8.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iD = d(cVarC, i, i2);
                af.f fVar = this.d;
                cpi.g gVar = this.e;
                fVar.getClass();
                a8.e eVar = new a8.e(gVar, cVarC, byteBuffer, iD);
                eVar.d(config);
                eVar.a();
                Bitmap bitmapC = eVar.c();
                if (bitmapC == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb6 = new StringBuilder("Decoded GIF from stream in ");
                        sb6.append(y8.h.a(jElapsedRealtimeNanos));
                        sb6.toString();
                        return null;
                    }
                    return null;
                }
                n8.c cVar = new n8.c(new GifDrawable(new b(new g(com.bumptech.glide.b.a(this.f233794a), eVar, i, i2, k8.d.f182078a, bitmapC))), 1);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    String str = "Decoded GIF from stream in " + y8.h.a(jElapsedRealtimeNanos);
                }
                return cVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb6 = new StringBuilder("Decoded GIF from stream in ");
                sb6.append(y8.h.a(jElapsedRealtimeNanos));
                sb6.toString();
                return null;
            }
            return null;
        } catch (Throwable th10) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                String str2 = "Decoded GIF from stream in " + y8.h.a(jElapsedRealtimeNanos);
            }
            throw th10;
        }
    }
}
