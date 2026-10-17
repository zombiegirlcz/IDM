package so0;

import android.graphics.Bitmap;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f264662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f264663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f264664c;

    public final Bitmap a(int i, int i2) {
        Bitmap bitmap = this.f264662a;
        if (bitmap != null && -1 == i && -1 == i2) {
            return bitmap;
        }
        if (bitmap != null) {
            bitmap.recycle();
        }
        float f = i;
        float f4 = i2;
        int iCeil = (int) Math.ceil(f / 6.0f);
        int i3 = iCeil % 64;
        if (i3 != 0) {
            iCeil = (iCeil - i3) + 64;
        }
        Size size = new Size(iCeil, (int) Math.ceil(f4 / (f / iCeil)));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        this.f264662a = bitmapCreateBitmap;
        this.f264663b = f / size.getWidth();
        this.f264664c = f4 / size.getHeight();
        return bitmapCreateBitmap;
    }
}
