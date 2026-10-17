package eg;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes17.dex */
public final class a1 implements hg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125398a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f125399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f125400c;
    public final phm.a d;
    public final phm.a e;
    public final phm.a f;

    public a1(hg.c cVar, phm.a aVar, phm.a aVar2, phm.a aVar3, phm.a aVar4) {
        this.f = cVar;
        this.f125399b = aVar;
        this.f125400c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f125398a) {
            case 0:
                return new z0((pd.g) ((hg.c) this.f).f152040a, (df.e) this.f125399b.get(), (ig.k) this.f125400c.get(), (m) this.d.get(), (CoroutineContext) this.e.get());
            default:
                CoroutineContext coroutineContext = (CoroutineContext) this.f125399b.get();
                df.e eVar = (df.e) this.f125400c.get();
                b bVar = (b) this.d.get();
                ig.g gVar = (ig.g) this.e.get();
                phm.a aVar = this.f;
                return new ig.e(coroutineContext, eVar, bVar, gVar, aVar instanceof gg.a ? (gg.a) aVar : new hg.a(aVar));
        }
    }

    public a1(phm.a aVar, phm.a aVar2, phm.a aVar3, phm.a aVar4, phm.a aVar5) {
        this.f125399b = aVar;
        this.f125400c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
    }
}
