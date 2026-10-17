package wz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e8.e0;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements c8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f301326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PorterDuff.Mode f301327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f301328c;
    public final Integer d;
    public final Paint e;

    public m(int i, PorterDuff.Mode maskPorterDuffMode, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(maskPorterDuffMode, "maskPorterDuffMode");
        this.f301326a = i;
        this.f301327b = maskPorterDuffMode;
        this.f301328c = num;
        this.d = num2;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setXfermode(new PorterDuffXfermode(maskPorterDuffMode));
        this.e = paintC;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return mVar.f301326a == this.f301326a && mVar.f301327b == this.f301327b && Intrinsics.f(mVar.f301328c, this.f301328c) && Intrinsics.f(mVar.d, this.d);
    }

    @Override // c8.g
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f301326a), this.f301327b, this.f301328c, this.d);
    }

    @Override // c8.o
    public final e0 transform(Context context, e0 e0Var, int i, int i2) {
        if (!y8.l.i(i, i2)) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.m("Cannot apply transformation on width: ", i, i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        f8.a pool = com.bumptech.glide.b.a(context).f26073b;
        Bitmap toTransform = (Bitmap) e0Var.get();
        if (i == Integer.MIN_VALUE) {
            toTransform.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            toTransform.getHeight();
        }
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        int density = toTransform.getDensity();
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context2.getResources(), this.f301326a);
        Integer num = this.f301328c;
        int iK = num == null ? width : kli.a.k(context2, num.intValue());
        Integer num2 = this.d;
        int iK2 = num2 == null ? height : kli.a.k(context2, num2.intValue());
        float f = num == null ? 0.0f : (width - iK) / 2.0f;
        float f4 = num2 == null ? 0.0f : (height - iK2) / 2.0f;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeResource, iK, iK2, true);
        bitmapCreateScaledBitmap.setDensity(density);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "apply(...)");
        Bitmap bitmapF = pool.f(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapF, "get(...)");
        Canvas canvas = new Canvas(bitmapF);
        canvas.setDensity(density);
        canvas.drawBitmap(toTransform, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        canvas.drawBitmap(bitmapCreateScaledBitmap, f, f4, this.e);
        return toTransform.equals(bitmapF) ? e0Var : l8.c.c(bitmapF, pool);
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update((byte) this.f301326a);
    }
}
