package v8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.n;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends c {
    public static final Handler e = new Handler(Looper.getMainLooper(), new i());
    public final n d;

    public j(n nVar, int i, int i2) {
        super(i, i2);
        this.d = nVar;
    }

    public static j h(n nVar, int i, int i2) {
        return new j(nVar, i, i2);
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
    }

    @Override // v8.l
    public final void d(Object obj2, w8.d dVar) {
        u8.c cVar = this.f286689c;
        if (cVar == null || !cVar.isComplete()) {
            return;
        }
        e.obtainMessage(1, this).sendToTarget();
    }
}
