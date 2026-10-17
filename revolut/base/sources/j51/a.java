package j51;

import android.content.Context;
import asi.d;
import l70.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements asi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final an0.c f171455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f171456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jqb.a f171457c;
    public final hcb.a d;
    public final Context e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f171458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f171459h;

    public a(e eVar, an0.c cVar, jqb.a aVar, hcb.a aVar2, Context context) {
        this.f171455a = cVar;
        this.f171456b = eVar;
        this.f171457c = aVar;
        this.d = aVar2;
        this.e = context;
        int i = 8;
        this.f = e4m.b.b(new ix5.b(this, 1, i));
        this.f171458g = e4m.b.b(new ix5.b(this, 0, i));
        this.f171459h = e4m.b.b(new ix5.b(this, 2, i));
    }

    public final mli.e a() {
        return (mli.e) this.f171459h.get();
    }

    public final mli.e b() {
        return (mli.e) this.f171459h.get();
    }

    public final d c() {
        return (d) this.f171458g.get();
    }
}
