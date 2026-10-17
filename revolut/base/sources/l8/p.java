package l8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final c8.j f = c8.j.a(c8.b.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c8.j f192742g = new c8.j("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, c8.j.e);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c8.j f192743h;
    public static final c8.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ah.a f192744j;
    public static final ArrayDeque k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8.a f192745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f192746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f8.f f192747c;
    public final ArrayList d;
    public final v e = v.a();

    static {
        l lVar = n.f192738a;
        Boolean bool = Boolean.FALSE;
        f192743h = c8.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = c8.j.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f192744j = new ah.a(7);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = y8.l.f311609a;
        k = new ArrayDeque(0);
    }

    public p(ArrayList arrayList, DisplayMetrics displayMetrics, f8.a aVar, f8.f fVar) {
        this.d = arrayList;
        y8.f.c(displayMetrics, "Argument must not be null");
        this.f192746b = displayMetrics;
        y8.f.c(aVar, "Argument must not be null");
        this.f192745a = aVar;
        y8.f.c(fVar, "Argument must not be null");
        this.f192747c = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap c(l8.w r9, android.graphics.BitmapFactory.Options r10, l8.o r11, f8.a r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.g()
            r9.i()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = l8.a0.f()
            r4.lock()
            android.graphics.Bitmap r9 = r9.B(r10)     // Catch: java.lang.IllegalArgumentException -> L25 java.lang.Throwable -> L65
        L1d:
            java.util.concurrent.locks.Lock r10 = l8.a0.f()
            r10.unlock()
            return r9
        L25:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = com.google.android.gms.internal.mlkit_vision_face.a.w(r6, r1, r2, r7, r8)     // Catch: java.lang.Throwable -> L65
            r1.append(r3)     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L65
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L65
            java.lang.String r2 = d(r2)     // Catch: java.lang.Throwable -> L65
            r1.append(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L65
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L65
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L54
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
        L54:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L65
            if (r0 == 0) goto L64
            r12.a(r0)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
            android.graphics.Bitmap r9 = c(r9, r10, r11, r12)     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L65
            goto L1d
        L63:
            throw r5     // Catch: java.lang.Throwable -> L65
        L64:
            throw r5     // Catch: java.lang.Throwable -> L65
        L65:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = l8.a0.f()
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.p.c(l8.w, android.graphics.BitmapFactory$Options, l8.o, f8.a):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final c a(w wVar, int i2, int i3, c8.k kVar, o oVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.f192747c.c(65536, byte[].class);
        synchronized (p.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                e(options);
            }
        }
        options.inTempStorage = bArr;
        c8.b bVar = (c8.b) kVar.a(f);
        c8.l lVar = (c8.l) kVar.a(f192742g);
        n nVar = (n) kVar.a(n.f);
        boolean zBooleanValue = ((Boolean) kVar.a(f192743h)).booleanValue();
        c8.j jVar = i;
        try {
            c cVarC = c.c(b(wVar, options, nVar, bVar, lVar, kVar.a(jVar) != null && ((Boolean) kVar.a(jVar)).booleanValue(), i2, i3, zBooleanValue, oVar), this.f192745a);
            e(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.f192747c.g(bArr);
            return cVarC;
        } catch (Throwable th10) {
            e(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.f192747c.g(bArr);
                throw th10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap b(l8.w r41, android.graphics.BitmapFactory.Options r42, l8.n r43, c8.b r44, c8.l r45, boolean r46, int r47, int r48, boolean r49, l8.o r50) {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.p.b(l8.w, android.graphics.BitmapFactory$Options, l8.n, c8.b, c8.l, boolean, int, int, boolean, l8.o):android.graphics.Bitmap");
    }
}
