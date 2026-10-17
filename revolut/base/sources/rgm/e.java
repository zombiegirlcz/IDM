package rgm;

import io.reactivex.rxjava3.core.CompletableSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fgm.b f254236h;
    public final igm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f254237j;
    public volatile boolean k;

    public e(fgm.b bVar, igm.o oVar, ygm.f fVar, int i) {
        super(i, fVar);
        this.f254236h = bVar;
        this.i = oVar;
        this.f254237j = new d(this, 0);
    }

    @Override // rgm.c
    public final void b() {
        d dVar = this.f254237j;
        dVar.getClass();
        jgm.b.a(dVar);
    }

    @Override // rgm.c
    public final void c() {
        CompletableSource completableSource;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        ygm.c cVar = this.f254230a;
        ygm.f fVar = this.f254232c;
        bhm.g gVar = this.d;
        while (!this.f254233g) {
            if (cVar.get() != null && (fVar == ygm.f.IMMEDIATE || (fVar == ygm.f.BOUNDARY && !this.k))) {
                this.f254233g = true;
                gVar.clear();
                cVar.d(this.f254236h);
                return;
            }
            if (!this.k) {
                boolean z3 = this.f;
                try {
                    Object objPoll = gVar.poll();
                    if (objPoll != null) {
                        Object objApply = this.i.apply(objPoll);
                        Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                        completableSource = (CompletableSource) objApply;
                        z = false;
                    } else {
                        completableSource = null;
                        z = true;
                    }
                    if (z3 && z) {
                        this.f254233g = true;
                        cVar.d(this.f254236h);
                        return;
                    } else if (!z) {
                        this.k = true;
                        completableSource.c(this.f254237j);
                    }
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    this.f254233g = true;
                    gVar.clear();
                    this.e.dispose();
                    cVar.a(th10);
                    cVar.d(this.f254236h);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        gVar.clear();
    }

    @Override // rgm.c
    public final void d() {
        this.f254236h.onSubscribe(this);
    }
}
