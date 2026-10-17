package cl0;

import android.content.Context;
import l70.e;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ee0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d21.a f24920c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(e eVar, d21.a aVar, Context context) {
        this.f24918a = context;
        this.f24919b = eVar;
        this.f24920c = aVar;
        int i = 2;
        this.d = e4m.b.b(new cbb.b(this, 1, i));
        this.e = e4m.b.b(new cbb.b(this, 2, i));
        this.f = e4m.b.b(new cbb.b(this, 0, i));
    }

    public final de0.a a() {
        return (de0.a) this.f.get();
    }
}
