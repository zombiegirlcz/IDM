package l8;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f192732g = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(c8.g.f);

    @Override // c8.g
    public final boolean equals(Object obj2) {
        return obj2 instanceof g;
    }

    @Override // c8.g
    public final int hashCode() {
        return -599754482;
    }

    @Override // l8.d
    public final Bitmap transform(f8.a aVar, Bitmap bitmap, int i, int i2) {
        float width;
        float fA;
        Paint paint = a0.f192713a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float fA2 = BitmapDescriptorFactory.HUE_RED;
        if (width2 > height) {
            width = i2 / bitmap.getHeight();
            fA2 = kii.e.a(bitmap.getWidth(), width, i, 0.5f);
            fA = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fA = kii.e.a(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fA2 + 0.5f), (int) (fA + 0.5f));
        Bitmap bitmapF = aVar.f(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapF.setHasAlpha(bitmap.hasAlpha());
        a0.a(bitmap, bitmapF, matrix);
        return bitmapF;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f192732g);
    }
}
