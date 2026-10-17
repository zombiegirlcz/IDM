package l8;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements c8.o {
    public abstract Bitmap transform(f8.a aVar, Bitmap bitmap, int i, int i2);

    @Override // c8.o
    @NonNull
    public final e8.e0 transform(@NonNull Context context, @NonNull e8.e0 e0Var, int i, int i2) {
        if (!y8.l.i(i, i2)) {
            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.m("Cannot apply transformation on width: ", i, i2, " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        f8.a aVar = com.bumptech.glide.b.a(context).f26073b;
        Bitmap bitmap = (Bitmap) e0Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(aVar, bitmap, i, i2);
        return bitmap.equals(bitmapTransform) ? e0Var : c.c(bitmapTransform, aVar);
    }
}
