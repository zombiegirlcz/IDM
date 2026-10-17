package pgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class r0 extends wgm.b {
    public final igm.o e;

    public r0(dom.a aVar, igm.o oVar) {
        super(aVar);
        this.e = oVar;
    }

    @Override // bhm.c
    public final int b(int i) {
        return f(7);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        try {
            Object objApply = this.e.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper function returned a null value.");
            this.f297348a.onNext(objApply);
        } catch (Throwable th10) {
            c(th10);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll = this.f297350c.poll();
        if (objPoll == null) {
            return null;
        }
        Object objApply = this.e.apply(objPoll);
        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
