package po0;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends fd0.d {
    @Override // fd0.d
    public final int g(Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) obj3;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return bitmap.getAllocationByteCount();
    }
}
