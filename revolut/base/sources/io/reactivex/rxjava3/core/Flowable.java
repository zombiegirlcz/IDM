package io.reactivex.rxjava3.core;

import bhm.e;
import ce9.m;
import dom.a;
import fgm.d;
import g2e.t;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import jb3.l;
import kgm.j;
import org.reactivestreams.Publisher;
import pgm.b;
import pgm.b0;
import pgm.e0;
import pgm.g0;
import pgm.i1;
import pgm.n0;
import pgm.r1;
import pgm.s0;
import pgm.t1;
import pgm.y;
import wgm.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Flowable implements Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f163113a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    @Override // org.reactivestreams.Publisher
    public final void a(a aVar) {
        if (aVar instanceof d) {
            j((d) aVar);
        } else {
            Objects.requireNonNull(aVar, "subscriber is null");
            j(new wgm.d(aVar));
        }
    }

    public final b0 b(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new b0(this, pVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Flowable c(o oVar, int i, int i2) {
        j.a(i, "maxConcurrency");
        j.a(i2, "bufferSize");
        if (!(this instanceof e)) {
            return new e0(this, oVar, i, i2);
        }
        Object obj2 = ((e) this).get();
        return obj2 == null ? y.f236178b : new b(obj2, oVar, 1);
    }

    public final g0 f(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        int i = f163113a;
        j.a(i, "bufferSize");
        return new g0(this, scheduler, i, 2);
    }

    public final s0 g(Class cls) {
        return new s0(b(new fkg.a(cls, 26)), new t(cls, 25), 0);
    }

    public final i1 h(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new i1(this, pVar);
    }

    public final Disposable i(g gVar, g gVar2) {
        Objects.requireNonNull(gVar2, "onError is null");
        c cVar = new c(gVar, gVar2, n0.INSTANCE);
        j(cVar);
        return cVar;
    }

    public final void j(d dVar) {
        Objects.requireNonNull(dVar, "subscriber is null");
        try {
            k(dVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m.F(th10);
            l.v(th10);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public abstract void k(a aVar);

    public final r1 l(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new r1(this, scheduler);
    }

    public final t1 m(long j2) {
        if (j2 >= 0) {
            return new t1(this, j2);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 required but it was "));
    }
}
