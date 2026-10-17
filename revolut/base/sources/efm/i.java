package efm;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Publisher;
import qfm.b2;
import qfm.f1;
import qfm.j1;
import qfm.m0;
import qfm.n2;
import qfm.p2;
import qfm.r0;
import qfm.t0;
import qfm.v2;
import qfm.w1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i implements Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f125385a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public static pfm.x c(Throwable th10) {
        mfm.f.b(th10, "throwable is null");
        return new pfm.x(new mfm.d(th10), 1);
    }

    public static pfm.x h(Iterable iterable) {
        mfm.f.b(iterable, "source is null");
        return new pfm.x(iterable, 2);
    }

    public static f1 i(Object obj2) {
        mfm.f.b(obj2, "item is null");
        return new f1(obj2);
    }

    public static i k(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a0.d.n("count >= 0 required but it was ", i2));
        }
        if (i2 == 0) {
            return qfm.g0.f245413b;
        }
        if (i2 == 1) {
            return i(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new w1(i, i2);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static v2 r(long j2, c0 c0Var) {
        mfm.f.b(TimeUnit.MILLISECONDS, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new v2(Math.max(0L, j2), c0Var);
    }

    public static t0 s(i iVar, i iVar2, kfm.c cVar) {
        mfm.f.b(iVar, "source1 is null");
        mp.r rVarC = mfm.f.c(cVar);
        Publisher[] publisherArr = {iVar, iVar2};
        int i = f125385a;
        mfm.f.e(i, "bufferSize");
        return new t0(publisherArr, rVarC, i, 1);
    }

    @Override // org.reactivestreams.Publisher
    public final void a(dom.a aVar) {
        if (aVar instanceof j) {
            n((j) aVar);
        } else {
            mfm.f.b(aVar, "s is null");
            n(new xfm.e(aVar));
        }
    }

    public final qfm.r b(long j2, TimeUnit timeUnit) {
        c0 c0Var = hhm.f.f152430b;
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new qfm.r(this, Math.max(0L, j2), timeUnit, c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i f(kfm.o oVar, int i, int i2) throws Exception {
        mfm.f.e(i, "maxConcurrency");
        mfm.f.e(i2, "bufferSize");
        if (!(this instanceof nfm.h)) {
            return new m0(this, oVar, i, i2);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? qfm.g0.f245413b : new qfm.u(objCall, oVar, 1);
    }

    public final r0 g(kfm.o oVar, int i) {
        mfm.f.e(i, "maxConcurrency");
        return new r0(this, oVar, i);
    }

    public final i j(j1 j1Var) {
        return new qfm.c(new Publisher[]{this, j1Var}, 1).f(mfm.f.f205041a, 2, f125385a);
    }

    public final b2 l(long j2, kfm.p pVar) {
        if (j2 >= 0) {
            return new b2(this, j2, pVar);
        }
        throw new IllegalArgumentException(p.a.m(j2, "times >= 0 required but it was "));
    }

    public final ifm.c m(kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.g gVar3) {
        mfm.f.b(gVar3, "onSubscribe is null");
        xfm.d dVar = new xfm.d(gVar, gVar2, aVar, gVar3);
        n(dVar);
        return dVar;
    }

    public final void n(j jVar) {
        mfm.f.b(jVar, "s is null");
        try {
            o(jVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public abstract void o(dom.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final i p(kfm.o oVar) throws Exception {
        int i = f125385a;
        mfm.f.e(i, "bufferSize");
        if (!(this instanceof nfm.h)) {
            return new n2(this, oVar, i);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? qfm.g0.f245413b : new qfm.u(objCall, oVar, 1);
    }

    public final p2 q(long j2) {
        if (j2 >= 0) {
            return new p2(this, j2);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 required but it was "));
    }
}
