package io.reactivex.rxjava3.core;

import ce9.m;
import fgm.b;
import igm.a;
import java.util.Objects;
import jb3.l;
import lgm.d;
import mgm.j;
import ngm.g;
import ogm.e;
import ogm.k;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Completable implements CompletableSource {
    public static Completable l(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "source is null");
        return completableSource instanceof Completable ? (Completable) completableSource : new e(completableSource, 6);
    }

    @Override // io.reactivex.rxjava3.core.CompletableSource
    public final void c(b bVar) {
        Objects.requireNonNull(bVar, "observer is null");
        try {
            i(bVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m.F(th10);
            l.v(th10);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public final mgm.b d(Observable observable) {
        Objects.requireNonNull(observable, "next is null");
        return new mgm.b(this, observable, 1);
    }

    public final void e() {
        ngm.e eVar = new ngm.e(1);
        c(eVar);
        eVar.a();
    }

    public final Completable f(CompletableTransformer completableTransformer) {
        Objects.requireNonNull(completableTransformer, "transformer is null");
        return l(completableTransformer.b(this));
    }

    public final k g(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new k(this, scheduler, 0);
    }

    public final g h(igm.g gVar, a aVar) {
        Objects.requireNonNull(gVar, "onError is null");
        g gVar2 = new g(gVar, aVar, 0);
        c(gVar2);
        return gVar2;
    }

    public abstract void i(b bVar);

    public final k j(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new k(this, scheduler, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable k() {
        return this instanceof d ? ((d) this).a() : new j(this, 2);
    }
}
