package f8;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import y8.l;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Bitmap.Config f132676j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f132677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f132678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf.b f132679c;
    public final long d;
    public long e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f132680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f132681h;
    public int i;

    public g(long j2) {
        k kVar = new k();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.f132677a = kVar;
        this.f132678b = setUnmodifiableSet;
        this.f132679c = new qf.b(4);
    }

    @Override // f8.a
    public final synchronized void a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f132677a.getClass();
                if (l.c(bitmap) <= this.d && this.f132678b.contains(bitmap.getConfig())) {
                    this.f132677a.getClass();
                    int iC = l.c(bitmap);
                    this.f132677a.e(bitmap);
                    this.f132679c.getClass();
                    this.f132681h++;
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb6 = new StringBuilder("Put bitmap in pool=");
                        this.f132677a.getClass();
                        sb6.append(k.c(l.c(bitmap), bitmap.getConfig()));
                        sb6.toString();
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        b();
                    }
                    h(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb9 = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.f132677a.getClass();
                sb9.append(k.c(l.c(bitmap), bitmap.getConfig()));
                sb9.append(", is mutable: ");
                sb9.append(bitmap.isMutable());
                sb9.append(", is allowed config: ");
                sb9.append(this.f132678b.contains(bitmap.getConfig()));
                sb9.toString();
            }
            bitmap.recycle();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void b() {
        String str = "Hits=" + this.f + ", misses=" + this.f132680g + ", puts=" + this.f132681h + ", evictions=" + this.i + ", currentSize=" + this.e + ", maxSize=" + this.d + "\nStrategy=" + this.f132677a;
    }

    @Override // f8.a
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            return bitmapG;
        }
        if (config == null) {
            config = f132676j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // f8.a
    public final void d(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            p.a.z(i, "trimMemory, level=", "LruBitmapPool");
        }
        if (i >= 40 || i >= 20) {
            e();
        } else if (i >= 20 || i == 15) {
            h(this.d / 2);
        }
    }

    @Override // f8.a
    public final void e() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
        }
        h(0L);
    }

    @Override // f8.a
    public final Bitmap f(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapG = g(i, i2, config);
        if (bitmapG != null) {
            bitmapG.eraseColor(0);
            return bitmapG;
        }
        if (config == null) {
            config = f132676j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap g(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f132677a.b(i, i2, config != null ? config : f132676j);
            if (bitmapB == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb6 = new StringBuilder("Missing bitmap=");
                    this.f132677a.getClass();
                    sb6.append(k.c(l.d(config) * i * i2, config));
                    sb6.toString();
                }
                this.f132680g++;
            } else {
                this.f++;
                long j2 = this.e;
                this.f132677a.getClass();
                this.e = j2 - ((long) l.c(bitmapB));
                this.f132679c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb9 = new StringBuilder("Get bitmap=");
                this.f132677a.getClass();
                sb9.append(k.c(l.d(config) * i * i2, config));
                sb9.toString();
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                b();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return bitmapB;
    }

    public final synchronized void h(long j2) {
        while (this.e > j2) {
            try {
                k kVar = this.f132677a;
                Bitmap bitmap = (Bitmap) kVar.f132689b.u();
                if (bitmap != null) {
                    kVar.a(bitmap, Integer.valueOf(l.c(bitmap)));
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        b();
                    }
                    this.e = 0L;
                    return;
                }
                this.f132679c.getClass();
                long j3 = this.e;
                this.f132677a.getClass();
                this.e = j3 - ((long) l.c(bitmap));
                this.i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Evicting bitmap=");
                    this.f132677a.getClass();
                    sb6.append(k.c(l.c(bitmap), bitmap.getConfig()));
                    sb6.toString();
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    b();
                }
                bitmap.recycle();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
