package y67;

import android.content.Context;
import xf6.a1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ila.b f311207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f311208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f311209c;
    public final e4m.e d;
    public final e4m.e e;

    public a(ila.b bVar, Context context) {
        this.f311207a = bVar;
        this.f311208b = context;
        int i = 17;
        this.f311209c = e4m.b.b(new a1(this, 0, i));
        this.d = e4m.b.b(new a1(this, 2, i));
        this.e = e4m.b.b(new a1(this, 1, i));
    }

    public final v67.b a() {
        return (v67.b) this.f311209c.get();
    }
}
