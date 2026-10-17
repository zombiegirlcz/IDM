package p41;

import l70.e;
import p12.s0;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements lqi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f232801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f232802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f232803c;
    public final e4m.e d;

    public b(a aVar, e eVar) {
        this.f232801a = eVar;
        int i = 9;
        this.f232802b = e4m.b.b(new s0(this, 0, i));
        this.f232803c = e4m.b.b(new s0(this, 2, i));
        this.d = e4m.b.b(new s0(this, 1, i));
    }

    public final c90.c a() {
        return (c90.c) this.d.get();
    }
}
