package efm;

import qfm.h1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k<T> implements n {
    public static h1 f(Throwable th10) {
        mfm.f.b(th10, "exception is null");
        return new h1(th10, 1);
    }

    public static rfm.u g(Object obj2) {
        mfm.f.b(obj2, "item is null");
        return new rfm.u(obj2);
    }

    public final Object c(Object obj2) {
        ofm.f fVar = new ofm.f(1);
        i(fVar);
        if (fVar.getCount() != 0) {
            try {
                fVar.await();
            } catch (InterruptedException e) {
                fVar.d = true;
                ifm.c cVar = fVar.f224916c;
                if (cVar != null) {
                    cVar.dispose();
                }
                throw zfm.h.d(e);
            }
        }
        Throwable th10 = fVar.f224915b;
        if (th10 != null) {
            throw zfm.h.d(th10);
        }
        Object obj3 = fVar.f224914a;
        return obj3 != null ? obj3 : obj2;
    }

    public final k d(o oVar) {
        mfm.f.b(oVar, "transformer is null");
        n nVarApply = oVar.apply(this);
        if (nVarApply instanceof k) {
            return (k) nVarApply;
        }
        mfm.f.b(nVarApply, "onSubscribe is null");
        return new rfm.r(nVarApply, 2);
    }

    public final rfm.z e(Object obj2) {
        mfm.f.b(obj2, "defaultItem is null");
        return m(g(obj2));
    }

    public final rfm.w h(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new rfm.w(this, c0Var, 0);
    }

    public final void i(l lVar) {
        mfm.f.b(lVar, "observer is null");
        try {
            j(lVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m70.a.u(th10);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public abstract void j(l lVar);

    public final rfm.w k(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new rfm.w(this, c0Var, 1);
    }

    public final rfm.l l(d0 d0Var) {
        mfm.f.b(d0Var, "other is null");
        return new rfm.l(this, d0Var, 1);
    }

    public final rfm.z m(k kVar) {
        mfm.f.b(kVar, "other is null");
        return new rfm.z(this, kVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r n() {
        return this instanceof nfm.d ? ((nfm.d) this).a() : new j01.b(this, 2);
    }

    public final rfm.f0 o() {
        return new rfm.f0(this, null, 0);
    }

    public final rfm.f0 p(Object obj2) {
        mfm.f.b(obj2, "defaultValue is null");
        return new rfm.f0(this, obj2, 0);
    }
}
