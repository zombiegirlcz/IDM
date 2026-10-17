package gsl;

import e4m.b;
import e4m.e;
import fsl.m;
import fsl.t;
import fw2.l;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ktl.a f146553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f146554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f146555c;
    public final e d;

    public a(ite.a aVar, ktl.a aVar2) {
        this.f146553a = aVar2;
        this.f146554b = aVar;
        int i = 10;
        this.f146555c = b.b(new l(this, 1, i));
        this.d = b.b(new l(this, 0, i));
    }

    public final t a() {
        return (t) this.d.get();
    }

    public final m b() {
        return (m) this.f146555c.get();
    }
}
