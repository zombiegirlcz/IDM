package e79;

import android.content.Context;
import dw3.f6;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f123104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c21.e f123105c;
    public final l70.e d;
    public final ite.a e;
    public final u06.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f123106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f123107h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f123108j;
    public final e4m.e k;

    public a(l70.e eVar, c21.e eVar2, u06.a aVar, ite.a aVar2, an0.c cVar, Context context) {
        this.f123103a = context;
        this.f123104b = cVar;
        this.f123105c = eVar2;
        this.d = eVar;
        this.e = aVar2;
        this.f = aVar;
        int i = 12;
        this.f123106g = e4m.b.b(new f6(this, 3, i));
        this.f123107h = e4m.b.b(new f6(this, 2, i));
        this.i = e4m.b.b(new f6(this, 4, i));
        this.f123108j = e4m.b.b(new f6(this, 1, i));
        this.k = e4m.b.b(new f6(this, 0, i));
    }

    public final r69.a a() {
        return (r69.a) this.k.get();
    }
}
