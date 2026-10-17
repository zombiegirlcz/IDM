package ti3;

import e4m.b;
import jk3.c;
import l70.e;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f271408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q8b.a f271409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f271410c;
    public final e4m.e d;
    public final e4m.e e;

    public a(c cVar, e eVar, q8b.a aVar) {
        this.f271408a = eVar;
        this.f271409b = aVar;
        this.f271410c = cVar;
        int i = 12;
        this.d = b.b(new sse.a(this, 1, i));
        this.e = b.b(new sse.a(this, 0, i));
    }

    public final dj3.a a() {
        return (dj3.a) this.e.get();
    }
}
