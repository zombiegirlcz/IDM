package oi9;

/* JADX INFO: loaded from: classes13.dex */
public final class y implements wh9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usg.a f225584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bpj.a f225585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uq3.b f225586c;
    public final e4m.e d;
    public final e4m.e e;

    public y(bpj.a aVar, usg.a aVar2, uq3.b bVar) {
        this.f225584a = aVar2;
        this.f225585b = aVar;
        this.f225586c = bVar;
        int i = 5;
        this.d = e4m.g.a(new of3.e(this, 1, i));
        this.e = e4m.g.a(new of3.e(this, 0, i));
    }

    @Override // wh9.b
    public final ti9.i a() {
        return (ti9.i) this.d.get();
    }

    @Override // wh9.b
    public final ti9.h b() {
        return (ti9.h) this.e.get();
    }
}
