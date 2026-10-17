package gff;

import e4m.e;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f49.a f143401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f143402b = e4m.b.b(new a(this, 0, 0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f143403c = e4m.b.b(new a(this, 1, 0));

    public b(f49.a aVar) {
        this.f143401a = aVar;
    }

    @Override // gff.c
    public final hef.a a() {
        return (hef.a) this.f143402b.get();
    }

    @Override // gff.c
    public final hff.c b() {
        return (hff.c) this.f143403c.get();
    }
}
