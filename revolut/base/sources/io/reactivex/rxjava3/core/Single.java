package io.reactivex.rxjava3.core;

import ce9.m;
import fgm.p;
import igm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kgm.e;
import lgm.d;
import mgm.j;
import tgm.b;
import tgm.c;
import tgm.g;
import tgm.h;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Single<T> implements SingleSource {
    public static b e(Throwable th10) {
        Objects.requireNonNull(th10, "throwable is null");
        return new b(new e(th10), 2);
    }

    public static b f(Object obj2) {
        Objects.requireNonNull(obj2, "item is null");
        return new b(obj2, 5);
    }

    @Override // io.reactivex.rxjava3.core.SingleSource
    public final void c(p pVar) {
        Objects.requireNonNull(pVar, "observer is null");
        try {
            j(pVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m.F(th10);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public final c d(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new c(this, j2, timeUnit, scheduler);
    }

    public final g g(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new g(this, oVar, 1);
    }

    public final h h(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new h(this, scheduler, 0);
    }

    public final Disposable i(igm.g gVar, igm.g gVar2) {
        Objects.requireNonNull(gVar, "onSuccess is null");
        Objects.requireNonNull(gVar2, "onError is null");
        ngm.g gVar3 = new ngm.g(gVar, gVar2, 1);
        c(gVar3);
        return gVar3;
    }

    public abstract void j(p pVar);

    public final h k(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new h(this, scheduler, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Observable l() {
        return this instanceof d ? ((d) this).a() : new j(this, 10);
    }
}
