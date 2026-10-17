package tfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends ofm.a {
    public final Collection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kfm.o f270695g;

    public o1(efm.y yVar, kfm.o oVar, Collection collection) {
        super(yVar);
        this.f270695g = oVar;
        this.f = collection;
    }

    @Override // ofm.a, nfm.j
    public final void clear() {
        this.f.clear();
        super.clear();
    }

    @Override // ofm.a, efm.y
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f.clear();
        this.f224907a.onComplete();
    }

    @Override // ofm.a, efm.y
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
            return;
        }
        this.d = true;
        this.f.clear();
        this.f224907a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        efm.y yVar = this.f224907a;
        if (i != 0) {
            yVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f270695g.apply(obj2);
            mfm.f.b(objApply, "The keySelector returned a null key");
            if (this.f.add(objApply)) {
                yVar.onNext(obj2);
            }
        } catch (Throwable th10) {
            c(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll;
        Object objApply;
        do {
            objPoll = this.f224909c.poll();
            if (objPoll == null) {
                break;
            }
            objApply = this.f270695g.apply(objPoll);
            mfm.f.b(objApply, "The keySelector returned a null key");
        } while (!this.f.add(objApply));
        return objPoll;
    }
}
