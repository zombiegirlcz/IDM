package to0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends fd0.d {
    public g() {
        super(10);
    }

    @Override // fd0.d
    public final void b(Object obj2, Object obj3, Object obj4) {
        e eVar = (e) obj3;
        e eVar2 = (e) obj4;
        if ((eVar != null ? eVar.d : null) != null) {
            Bitmap bitmap = eVar.d;
            if (bitmap != (eVar2 != null ? eVar2.d : null)) {
                bitmap.recycle();
            }
        }
    }
}
