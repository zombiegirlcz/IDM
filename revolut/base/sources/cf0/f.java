package cf0;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f23519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f23520c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f(Context context) {
        this.f23518a = context;
        int i = 6;
        this.f23519b = e4m.b.b(new c63.b(this, 1, i));
        this.f23520c = e4m.b.b(new c63.b(this, 0, i));
        this.d = e4m.b.b(new c63.b(this, 3, i));
        this.e = e4m.b.b(new c63.b(this, 2, i));
        this.f = e4m.b.b(new c63.b(this, 4, i));
    }

    public final df0.b a() {
        return (df0.b) this.e.get();
    }

    public final ef0.b b() {
        return (ef0.b) this.d.get();
    }
}
