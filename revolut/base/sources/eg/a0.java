package eg;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes17.dex */
public final class a0 implements hg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg.c f125395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f125396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f125397c;
    public final phm.a d;

    public a0(hg.c cVar, phm.a aVar, phm.a aVar2, phm.a aVar3) {
        this.f125395a = cVar;
        this.f125396b = aVar;
        this.f125397c = aVar2;
        this.d = aVar3;
    }

    @Override // phm.a
    public final Object get() {
        return new q((pd.g) this.f125395a.f152040a, (ig.k) this.f125396b.get(), (CoroutineContext) this.f125397c.get(), (m1) this.d.get());
    }
}
