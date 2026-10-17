package p8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c8.o;
import com.bumptech.glide.j;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.n;
import e8.p;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import y8.l;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8.e f233801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f233802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f233803c;
    public final n d;
    public final f8.a e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f233804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f233805h;
    public d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f233806j;
    public d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f233807l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f233808m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f233809n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f233810p;

    public g(com.bumptech.glide.b bVar, a8.e eVar, int i, int i2, k8.d dVar, Bitmap bitmap) {
        f8.a aVar = bVar.f26073b;
        com.bumptech.glide.f fVar = bVar.d;
        n nVarD = com.bumptech.glide.b.d(fVar.getBaseContext());
        j jVarO = com.bumptech.glide.b.d(fVar.getBaseContext()).i().a(((u8.h) ((u8.h) ((u8.h) new u8.h().g(p.f123506b)).M()).F(true)).w(i, i2));
        this.f233803c = new ArrayList();
        this.d = nVarD;
        Handler handler = new Handler(Looper.getMainLooper(), new f(this));
        this.e = aVar;
        this.f233802b = handler;
        this.f233805h = jVarO;
        this.f233801a = eVar;
        i(dVar, bitmap);
    }

    public final ByteBuffer a() {
        return this.f233801a.d.asReadOnlyBuffer();
    }

    public final Bitmap b() {
        d dVar = this.i;
        return dVar != null ? dVar.f233799g : this.f233807l;
    }

    public final Bitmap c() {
        return this.f233807l;
    }

    public final int d() {
        return this.f233801a.f1971l.f1958c;
    }

    public final int e() {
        return this.f233810p;
    }

    public final int f() {
        return this.o;
    }

    public final void g() {
        int i;
        if (!this.f || this.f233804g) {
            return;
        }
        d dVar = this.f233808m;
        if (dVar != null) {
            this.f233808m = null;
            h(dVar);
            return;
        }
        this.f233804g = true;
        a8.e eVar = this.f233801a;
        a8.c cVar = eVar.f1971l;
        int i2 = cVar.f1958c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) ((i2 <= 0 || (i = eVar.k) < 0) ? 0 : (i < 0 || i >= i2) ? -1 : ((a8.b) cVar.e.get(i)).i));
        eVar.a();
        this.k = new d(this.f233802b, eVar.k, jUptimeMillis);
        j jVarZ = this.f233805h.a((u8.h) new u8.h().E(new x8.e(Double.valueOf(Math.random())))).Z(eVar);
        jVarZ.S(this.k, null, jVarZ, y8.f.f311599a);
    }

    public final void h(d dVar) {
        this.f233804g = false;
        boolean z = this.f233806j;
        Handler handler = this.f233802b;
        if (z) {
            handler.obtainMessage(2, dVar).sendToTarget();
            return;
        }
        if (!this.f) {
            this.f233808m = dVar;
            return;
        }
        if (dVar.f233799g != null) {
            Bitmap bitmap = this.f233807l;
            if (bitmap != null) {
                this.e.a(bitmap);
                this.f233807l = null;
            }
            d dVar2 = this.i;
            this.i = dVar;
            ArrayList arrayList = this.f233803c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                GifDrawable gifDrawable = (GifDrawable) ((e) arrayList.get(size));
                b bVar = gifDrawable.f26125a;
                Object callback = gifDrawable.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    gifDrawable.stop();
                    gifDrawable.invalidateSelf();
                } else {
                    gifDrawable.invalidateSelf();
                    d dVar3 = bVar.f233797a.i;
                    if ((dVar3 != null ? dVar3.e : -1) == r5.d() - 1) {
                        gifDrawable.f++;
                    }
                    int i = gifDrawable.f26128g;
                    if (i != -1 && gifDrawable.f >= i) {
                        gifDrawable.stop();
                    }
                }
            }
            if (dVar2 != null) {
                handler.obtainMessage(2, dVar2).sendToTarget();
            }
        }
        g();
    }

    public final void i(o oVar, Bitmap bitmap) {
        y8.f.c(oVar, "Argument must not be null");
        y8.f.c(bitmap, "Argument must not be null");
        this.f233807l = bitmap;
        this.f233805h = this.f233805h.a(new u8.h().I(oVar, true));
        this.f233809n = l.c(bitmap);
        this.o = bitmap.getWidth();
        this.f233810p = bitmap.getHeight();
    }

    public final void j(GifDrawable gifDrawable) {
        if (this.f233806j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = this.f233803c;
        if (arrayList.contains(gifDrawable)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(gifDrawable);
        if (!zIsEmpty || this.f) {
            return;
        }
        this.f = true;
        this.f233806j = false;
        g();
    }

    public final void k(GifDrawable gifDrawable) {
        ArrayList arrayList = this.f233803c;
        arrayList.remove(gifDrawable);
        if (arrayList.isEmpty()) {
            this.f = false;
        }
    }
}
