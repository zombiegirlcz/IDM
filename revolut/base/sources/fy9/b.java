package fy9;

import android.content.Context;
import fw2.l;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f138968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy9.a f138969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f138970c;
    public final an0.c d;
    public final ee0.c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f138971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f138972h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f138973j;

    public b(gy9.a aVar, nj0.a aVar2, ee0.c cVar, an0.c cVar2, Context context) {
        this.f138968a = aVar2;
        this.f138969b = aVar;
        this.f138970c = context;
        this.d = cVar2;
        this.e = cVar;
        int i = 1;
        this.f = e4m.b.b(new l(this, 1, i));
        this.f138971g = e4m.b.b(new l(this, 3, i));
        this.f138972h = e4m.b.b(new l(this, 2, i));
        this.i = e4m.b.b(new l(this, 0, i));
        this.f138973j = e4m.b.b(new l(this, 4, i));
    }

    public final ay9.a a() {
        return (ay9.a) this.f138973j.get();
    }
}
