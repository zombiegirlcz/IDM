package l8;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes16.dex */
public final class y extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f192760h = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(c8.g.f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f192761g;

    public y(int i) {
        y8.f.a("roundingRadius must be greater than 0.", i > 0);
        this.f192761g = i;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return (obj2 instanceof y) && this.f192761g == ((y) obj2).f192761g;
    }

    @Override // c8.g
    public final int hashCode() {
        return y8.l.g(-569625254, y8.l.g(this.f192761g, 17));
    }

    @Override // l8.d
    public final Bitmap transform(f8.a aVar, Bitmap bitmap, int i, int i2) {
        Paint paint = a0.f192713a;
        int i3 = this.f192761g;
        y8.f.a("roundingRadius must be greater than 0.", i3 > 0);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapE = a0.e(bitmap, aVar);
        Bitmap bitmapF = aVar.f(bitmapE.getWidth(), bitmapE.getHeight(), config);
        bitmapF.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapE, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmapF.getWidth(), bitmapF.getHeight());
        Lock lock = a0.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapF);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapE.equals(bitmap)) {
                aVar.a(bitmapE);
            }
            return bitmapF;
        } catch (Throwable th10) {
            lock.unlock();
            throw th10;
        }
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f192760h);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f192761g).array());
    }
}
