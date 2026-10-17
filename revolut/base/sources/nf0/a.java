package nf0;

import android.content.Context;
import e4m.e;
import e4m.g;
import qf0.c;
import sf0.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f214793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f214794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f214795c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f214796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f214797h;

    public a(Context context) {
        this.f214793a = context;
        int i = 11;
        this.f214794b = e4m.b.b(new mva.a(this, 1, i));
        this.f214795c = g.a(new mva.a(this, 3, i));
        this.d = e4m.b.b(new mva.a(this, 2, i));
        this.e = e4m.b.b(new mva.a(this, 0, i));
        this.f = g.a(new mva.a(this, 5, i));
        this.f214796g = g.a(new mva.a(this, 4, i));
        this.f214797h = g.a(new mva.a(this, 6, i));
    }

    public final c a() {
        return (c) this.f214794b.get();
    }

    public final h b() {
        return (h) this.f214796g.get();
    }
}
