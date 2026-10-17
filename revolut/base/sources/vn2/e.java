package vn2;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bpj.a f290655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f290656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f290657c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public e(Context context, bpj.a aVar, ite.a aVar2) {
        this.f290655a = aVar;
        this.f290656b = aVar2;
        this.f290657c = context;
        int i = 14;
        this.d = e4m.b.b(new v4d.a(this, 0, i));
        this.e = e4m.b.b(new v4d.a(this, 2, i));
        this.f = e4m.b.b(new v4d.a(this, 1, i));
    }

    public final on2.b a() {
        return (on2.b) this.d.get();
    }
}
