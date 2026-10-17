package ld1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f193919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f193920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193921c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(Context context) {
        this.f193919a = context;
        int i = 2;
        this.f193920b = e4m.b.b(new lal.j(this, 1, i));
        this.f193921c = e4m.b.b(new lal.j(this, 3, i));
        this.d = e4m.b.b(new lal.j(this, 2, i));
        this.e = e4m.b.b(new lal.j(this, 0, i));
        this.f = e4m.b.b(new lal.j(this, 4, i));
    }

    public final bd1.a a() {
        return (bd1.a) this.e.get();
    }
}
