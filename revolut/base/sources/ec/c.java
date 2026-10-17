package ec;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f124397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f124398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f124399c;
    public final phm.a d;
    public final phm.a e;

    public c(phm.a aVar, phm.a aVar2, f fVar, phm.a aVar3, phm.a aVar4) {
        this.f124397a = aVar;
        this.f124398b = aVar2;
        this.f124399c = fVar;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // phm.a
    public final Object get() {
        return new b((Executor) this.f124397a.get(), (ac.f) this.f124398b.get(), (gpk.c) this.f124399c.get(), (gc.d) this.d.get(), (hc.b) this.e.get());
    }
}
