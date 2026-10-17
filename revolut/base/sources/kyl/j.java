package kyl;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends fd0.d {
    public j() {
        this(0);
    }

    @Override // fd0.d
    public final int g(Object obj2, Object obj3) {
        String key = (String) obj2;
        WeakReference bitmapRef = (WeakReference) obj3;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmapRef, "bitmapRef");
        Bitmap bitmap = (Bitmap) bitmapRef.get();
        if (bitmap != null) {
            return bitmap.getByteCount() / 1024;
        }
        return 0;
    }

    public j(int i) {
        super(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8);
    }
}
