package p8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends v8.c {
    public final Handler d;
    public final int e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f233799g;

    public d(Handler handler, int i, long j2) {
        this.d = handler;
        this.e = i;
        this.f = j2;
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
        this.f233799g = null;
    }

    @Override // v8.l
    public final void d(Object obj2, w8.d dVar) {
        this.f233799g = (Bitmap) obj2;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }
}
