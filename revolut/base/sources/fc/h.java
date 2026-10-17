package fc;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f133584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f133585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f133586c;
    public final ec.f d;
    public final phm.a e;
    public final phm.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final phm.a f133587g;

    public h(ac.e eVar, phm.a aVar, phm.a aVar2, ec.f fVar, phm.a aVar3, phm.a aVar4, phm.a aVar5) {
        this.f133584a = eVar;
        this.f133585b = aVar;
        this.f133586c = aVar2;
        this.d = fVar;
        this.e = aVar3;
        this.f = aVar4;
        this.f133587g = aVar5;
    }

    @Override // phm.a
    public final Object get() {
        Context context = (Context) this.f133584a.get();
        ac.f fVar = (ac.f) this.f133585b.get();
        gc.d dVar = (gc.d) this.f133586c.get();
        gpk.c cVar = (gpk.c) this.d.get();
        Executor executor = (Executor) this.e.get();
        hc.b bVar = (hc.b) this.f.get();
        ah.a aVar = new ah.a(6);
        af.f fVar2 = new af.f(6);
        gc.c cVar2 = (gc.c) this.f133587g.get();
        g gVar = new g();
        gVar.f133579a = context;
        gVar.f133580b = fVar;
        gVar.f133581c = dVar;
        gVar.d = cVar;
        gVar.e = executor;
        gVar.f = bVar;
        gVar.f133582g = aVar;
        gVar.f133583h = fVar2;
        gVar.i = cVar2;
        return gVar;
    }
}
