package efm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements f {
    public static pfm.w A(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new pfm.w(j2, timeUnit, c0Var);
    }

    public static b E(f fVar) {
        mfm.f.b(fVar, "source is null");
        return fVar instanceof b ? (b) fVar : new pfm.n(fVar, 2);
    }

    public static pfm.f i(Iterable iterable) {
        mfm.f.b(iterable, "sources is null");
        return new pfm.f(iterable, 0);
    }

    public static b j(f... fVarArr) {
        return fVarArr.length == 0 ? pfm.m.f235744a : fVarArr.length == 1 ? E(fVarArr[0]) : new pfm.d(fVarArr, 0);
    }

    public static pfm.n n(Throwable th10) {
        mfm.f.b(th10, "error is null");
        return new pfm.n(th10, 0);
    }

    public static pfm.f o(Iterable iterable) {
        mfm.f.b(iterable, "sources is null");
        return new pfm.f(iterable, 2);
    }

    public static b p(f... fVarArr) {
        mfm.f.b(fVarArr, "sources is null");
        return fVarArr.length == 0 ? pfm.m.f235744a : fVarArr.length == 1 ? E(fVarArr[0]) : new pfm.d(fVarArr, 1);
    }

    public static pfm.d q(f... fVarArr) {
        mfm.f.b(fVarArr, "sources is null");
        return new pfm.d(fVarArr, 2);
    }

    public static pfm.f r(Iterable iterable) {
        mfm.f.b(iterable, "sources is null");
        return new pfm.f(iterable, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i B() {
        return this instanceof nfm.b ? ((nfm.b) this).b() : new pfm.x(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r C() {
        return this instanceof nfm.d ? ((nfm.d) this).a() : new j01.b(this, 1);
    }

    public final pfm.z D(Object obj2) {
        mfm.f.b(obj2, "completionValue is null");
        return new pfm.z(this, 0, null, obj2);
    }

    @Override // efm.f
    public final void d(d dVar) {
        mfm.f.b(dVar, "observer is null");
        try {
            x(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public final pfm.a e(f fVar) {
        mfm.f.b(fVar, "next is null");
        return new pfm.a(this, fVar, 0);
    }

    public final rfm.f0 f(d0 d0Var) {
        mfm.f.b(d0Var, "next is null");
        return new rfm.f0(d0Var, this, 2);
    }

    public final sfm.b g(r rVar) {
        mfm.f.b(rVar, "next is null");
        return new sfm.b(this, rVar, 0);
    }

    public final b h(g gVar) {
        mfm.f.b(gVar, "transformer is null");
        return E(gVar.d(this));
    }

    public final pfm.j k(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new pfm.j(this, j2, timeUnit, c0Var, 0);
    }

    public final pfm.t l(kfm.a aVar) {
        dfm.c cVar = mfm.f.d;
        en.a aVar2 = mfm.f.f205043c;
        return new pfm.t(this, cVar, cVar, aVar, aVar2, aVar2, aVar2);
    }

    public final pfm.t m(kfm.g gVar) {
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        return new pfm.t(this, cVar, gVar, aVar, aVar, aVar, aVar);
    }

    public final b s(b bVar) {
        return p(this, bVar);
    }

    public final pfm.r t(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new pfm.r(this, c0Var, 0);
    }

    public final pfm.a u(kfm.o oVar) {
        return new pfm.a(this, oVar, 2);
    }

    public final ifm.c v() {
        lfm.b bVar = new lfm.b(2);
        d(bVar);
        return bVar;
    }

    public final ofm.h w(kfm.g gVar, kfm.a aVar) {
        mfm.f.b(gVar, "onError is null");
        mfm.f.b(aVar, "onComplete is null");
        ofm.h hVar = new ofm.h(gVar, aVar, 0);
        d(hVar);
        return hVar;
    }

    public abstract void x(d dVar);

    public final pfm.r y(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new pfm.r(this, c0Var, 1);
    }

    public final pfm.j z(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new pfm.j(this, j2, timeUnit, c0Var, 1);
    }
}
