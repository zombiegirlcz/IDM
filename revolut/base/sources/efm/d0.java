package efm;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import qfm.i2;
import qfm.j0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d0<T> implements h0 {
    public static d0 A(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, kfm.j jVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        mfm.f.b(d0Var3, "source3 is null");
        mfm.f.b(d0Var4, "source4 is null");
        mfm.f.b(d0Var5, "source5 is null");
        return F(new ks0.n(jVar, 9), d0Var, d0Var2, d0Var3, d0Var4, d0Var5);
    }

    public static d0 B(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, kfm.i iVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        mfm.f.b(d0Var3, "source3 is null");
        mfm.f.b(d0Var4, "source4 is null");
        return F(new kpj.f(iVar, 12), d0Var, d0Var2, d0Var3, d0Var4);
    }

    public static d0 C(d0 d0Var, d0 d0Var2, d0 d0Var3, kfm.h hVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        mfm.f.b(d0Var3, "source3 is null");
        return F(mfm.f.d(hVar), d0Var, d0Var2, d0Var3);
    }

    public static d0 D(d0 d0Var, d0 d0Var2, kfm.c cVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        return F(mfm.f.c(cVar), d0Var, d0Var2);
    }

    public static rfm.f0 E(Iterable iterable, kfm.o oVar) {
        mfm.f.b(iterable, "sources is null");
        return new rfm.f0(iterable, oVar, 5);
    }

    public static d0 F(kfm.o oVar, h0... h0VarArr) {
        return h0VarArr.length == 0 ? l(new NoSuchElementException()) : new rfm.f0(h0VarArr, oVar, 4);
    }

    public static qfm.l h(i iVar) {
        mfm.f.e(2, "prefetch");
        return new qfm.l(iVar, ufm.l.INSTANCE, zfm.f.IMMEDIATE);
    }

    public static ufm.c l(Throwable th10) {
        mfm.f.b(th10, "exception is null");
        return new ufm.c(new mfm.d(th10), 1);
    }

    public static ufm.b m(Object obj2) {
        mfm.f.b(obj2, "item is null");
        return new ufm.b(obj2, 1);
    }

    public static ufm.e u(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new ufm.e(j2, timeUnit, c0Var);
    }

    public static d0 y(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, d0 d0Var7, d0 d0Var8, d0 d0Var9, kfm.n nVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        mfm.f.b(d0Var3, "source3 is null");
        mfm.f.b(d0Var4, "source4 is null");
        mfm.f.b(d0Var5, "source5 is null");
        mfm.f.b(d0Var6, "source6 is null");
        mfm.f.b(d0Var7, "source7 is null");
        mfm.f.b(d0Var8, "source8 is null");
        mfm.f.b(d0Var9, "source9 is null");
        return F(new kl.b0(nVar, 15), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8, d0Var9);
    }

    public static d0 z(d0 d0Var, d0 d0Var2, d0 d0Var3, d0 d0Var4, d0 d0Var5, d0 d0Var6, kfm.k kVar) {
        mfm.f.b(d0Var, "source1 is null");
        mfm.f.b(d0Var2, "source2 is null");
        mfm.f.b(d0Var3, "source3 is null");
        mfm.f.b(d0Var4, "source4 is null");
        mfm.f.b(d0Var5, "source5 is null");
        mfm.f.b(d0Var6, "source6 is null");
        return F(new kgm.c(kVar, 13), d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6);
    }

    public final rfm.l d(d0 d0Var) {
        mfm.f.b(d0Var, "other is null");
        return new rfm.l(new h0[]{this, d0Var}, null, 3);
    }

    public final Object e() {
        ofm.f fVar = new ofm.f(1);
        q(fVar);
        return fVar.a();
    }

    public final ufm.i f(Class cls) {
        return new ufm.i(this, new a31.a(cls, 17), 1);
    }

    public final d0 g(i0 i0Var) {
        mfm.f.b(i0Var, "transformer is null");
        h0 h0VarI = i0Var.i(this);
        mfm.f.b(h0VarI, "source is null");
        return h0VarI instanceof d0 ? (d0) h0VarI : new ufm.k(h0VarI);
    }

    public final ufm.e i(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return j(j2, hhm.f.f152430b);
    }

    public final ufm.e j(long j2, c0 c0Var) {
        mfm.f.b(TimeUnit.MILLISECONDS, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new ufm.e(this, j2, c0Var);
    }

    public final rfm.l k(long j2, c0 c0Var) {
        r<Long> rVarTimer = r.timer(j2, TimeUnit.MILLISECONDS, c0Var);
        mfm.f.b(rVarTimer, "other is null");
        return new rfm.l(this, rVarTimer, 4);
    }

    public final ufm.n n(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new ufm.n(this, c0Var, 0);
    }

    public final pfm.z o(Object obj2) {
        mfm.f.b(obj2, "value is null");
        return new pfm.z(this, 1, null, obj2);
    }

    public final i2 p(kfm.o oVar) {
        return new i2(new j0(v(), oVar, 2));
    }

    public final void q(f0 f0Var) {
        mfm.f.b(f0Var, "observer is null");
        try {
            r(f0Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m70.a.u(th10);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public abstract void r(f0 f0Var);

    public final ufm.n s(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new ufm.n(this, c0Var, 1);
    }

    public final ufm.p t(long j2, TimeUnit timeUnit) {
        c0 c0Var = hhm.f.f152430b;
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new ufm.p(this, j2, timeUnit, c0Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i v() {
        return this instanceof nfm.b ? ((nfm.b) this).b() : new pfm.x(this, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k w() {
        return this instanceof nfm.c ? ((nfm.c) this).c() : new rfm.d(this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r x() {
        return this instanceof nfm.d ? ((nfm.d) this).a() : new j01.b(this, 8);
    }
}
