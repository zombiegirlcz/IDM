package sgm;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class q1 extends ngm.a {
    public final Collection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final igm.o f263095g;

    public q1(fgm.l lVar, igm.o oVar, Collection collection) {
        super(lVar);
        this.f263095g = oVar;
        this.f = collection;
    }

    @Override // ngm.a, bhm.g
    public final void clear() {
        this.f.clear();
        super.clear();
    }

    @Override // ngm.a, fgm.l
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f.clear();
        this.f215230a.onComplete();
    }

    @Override // ngm.a, fgm.l
    public final void onError(Throwable th10) {
        if (this.d) {
            jb3.l.v(th10);
            return;
        }
        this.d = true;
        this.f.clear();
        this.f215230a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        fgm.l lVar = this.f215230a;
        if (i != 0) {
            lVar.onNext(null);
            return;
        }
        try {
            Object objApply = this.f263095g.apply(obj2);
            Objects.requireNonNull(objApply, "The keySelector returned a null key");
            if (this.f.add(objApply)) {
                lVar.onNext(obj2);
            }
        } catch (Throwable th10) {
            a(th10);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll;
        Object objApply;
        do {
            objPoll = this.f215232c.poll();
            if (objPoll == null) {
                break;
            }
            objApply = this.f263095g.apply(objPoll);
            Objects.requireNonNull(objApply, "The keySelector returned a null key");
        } while (!this.f.add(objApply));
        return objPoll;
    }
}
