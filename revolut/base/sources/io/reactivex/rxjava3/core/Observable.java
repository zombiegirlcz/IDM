package io.reactivex.rxjava3.core;

import a0.d;
import ce9.m;
import ehm.e;
import fgm.g;
import fgm.k;
import fmc.z;
import fnc.s;
import g2e.t;
import igm.a;
import igm.o;
import igm.p;
import igm.q;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kgm.c;
import kgm.j;
import mgm.b;
import ngm.i;
import om4.d0;
import org.reactivestreams.Publisher;
import pgm.b0;
import pgm.v;
import pgm.x0;
import sgm.a1;
import sgm.a3;
import sgm.a4;
import sgm.a6;
import sgm.b1;
import sgm.b2;
import sgm.b3;
import sgm.b4;
import sgm.c2;
import sgm.c3;
import sgm.c4;
import sgm.d3;
import sgm.d5;
import sgm.d7;
import sgm.e3;
import sgm.e4;
import sgm.f1;
import sgm.f2;
import sgm.f3;
import sgm.g0;
import sgm.g3;
import sgm.g4;
import sgm.h;
import sgm.h1;
import sgm.h2;
import sgm.i0;
import sgm.i1;
import sgm.i3;
import sgm.j2;
import sgm.k3;
import sgm.l;
import sgm.l0;
import sgm.l1;
import sgm.l3;
import sgm.l5;
import sgm.m2;
import sgm.n;
import sgm.n3;
import sgm.n5;
import sgm.n6;
import sgm.o2;
import sgm.o3;
import sgm.p0;
import sgm.p4;
import sgm.p5;
import sgm.q6;
import sgm.r;
import sgm.r0;
import sgm.r2;
import sgm.s3;
import sgm.s4;
import sgm.s5;
import sgm.t1;
import sgm.t6;
import sgm.u0;
import sgm.u3;
import sgm.u5;
import sgm.v2;
import sgm.w0;
import sgm.w4;
import sgm.y;
import sgm.y0;
import sgm.y3;
import sgm.z1;
import sgm.z4;
import ygm.f;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Observable implements ObservableSource {
    public static <T> Observable amb(Iterable<? extends ObservableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return new b(null, iterable, 3);
    }

    @SafeVarargs
    public static <T> Observable ambArray(ObservableSource... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        int length = observableSourceArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(observableSourceArr[0]) : new b(observableSourceArr, null, 3);
    }

    public static int bufferSize() {
        return Flowable.f163113a;
    }

    public static <T, R> Observable combineLatest(Iterable<? extends ObservableSource> iterable, o oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> Observable combineLatestArray(ObservableSource[] observableSourceArr, o oVar) {
        return combineLatestArray(observableSourceArr, oVar, bufferSize());
    }

    public static <T, R> Observable combineLatestArrayDelayError(ObservableSource[] observableSourceArr, o oVar) {
        return combineLatestArrayDelayError(observableSourceArr, oVar, bufferSize());
    }

    public static <T, R> Observable combineLatestDelayError(Iterable<? extends ObservableSource> iterable, o oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static <T> Observable concat(Iterable<? extends ObservableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(j.f184025a, false, bufferSize());
    }

    @SafeVarargs
    public static <T> Observable concatArray(ObservableSource... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        return observableSourceArr.length == 0 ? empty() : observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : new p0(fromArray(observableSourceArr), j.f184025a, bufferSize(), f.BOUNDARY);
    }

    @SafeVarargs
    public static <T> Observable concatArrayDelayError(ObservableSource... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        return observableSourceArr.length == 0 ? empty() : observableSourceArr.length == 1 ? wrap(observableSourceArr[0]) : concatDelayError(fromArray(observableSourceArr));
    }

    @SafeVarargs
    public static <T> Observable concatArrayEager(ObservableSource... observableSourceArr) {
        return concatArrayEager(bufferSize(), bufferSize(), observableSourceArr);
    }

    @SafeVarargs
    public static <T> Observable concatArrayEagerDelayError(ObservableSource... observableSourceArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), observableSourceArr);
    }

    public static <T> Observable concatDelayError(Iterable<? extends ObservableSource> iterable) {
        Objects.requireNonNull(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> Observable concatEager(Iterable<? extends ObservableSource> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> Observable concatEagerDelayError(Iterable<? extends ObservableSource> iterable) {
        return concatEagerDelayError(iterable, bufferSize(), bufferSize());
    }

    public static <T> Observable create(fgm.j jVar) {
        Objects.requireNonNull(jVar, "source is null");
        return new mgm.j(jVar, 4);
    }

    public static <T> Observable defer(q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return new i1(0, qVar);
    }

    public static <T> Observable empty() {
        return c2.f262735a;
    }

    public static <T> Observable error(q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return new i1(1, qVar);
    }

    public static <T> Observable fromAction(a aVar) {
        Objects.requireNonNull(aVar, "action is null");
        return new m2(aVar, 0);
    }

    @SafeVarargs
    public static <T> Observable fromArray(T... tArr) {
        Objects.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : new mgm.j(tArr, 5);
    }

    public static <T> Observable fromCallable(Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return new m2(callable, 1);
    }

    public static <T> Observable fromCompletable(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return new mgm.j(completableSource, 6);
    }

    public static <T> Observable fromCompletionStage(CompletionStage<T> completionStage) {
        Objects.requireNonNull(completionStage, "stage is null");
        return new mgm.j(completionStage, 0);
    }

    public static <T> Observable fromFuture(Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return new o2(future, 0L, (TimeUnit) null);
    }

    public static <T> Observable fromIterable(Iterable<? extends T> iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new mgm.j(iterable, 7);
    }

    public static <T> Observable fromMaybe(MaybeSource maybeSource) {
        Objects.requireNonNull(maybeSource, "maybe is null");
        return new mgm.j(maybeSource, 3);
    }

    public static <T> Observable fromOptional(Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (Observable) optional.map(new com.google.android.material.color.utilities.f(3)).orElseGet(new g(0));
    }

    public static <T> Observable fromPublisher(Publisher publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return new mgm.j(publisher, 8);
    }

    public static <T> Observable fromRunnable(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new m2(runnable, 2);
    }

    public static <T> Observable fromSingle(SingleSource singleSource) {
        Objects.requireNonNull(singleSource, "source is null");
        return new mgm.j(singleSource, 10);
    }

    public static <T> Observable fromStream(Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return new mgm.j(stream, 1);
    }

    public static <T> Observable fromSupplier(q qVar) {
        Objects.requireNonNull(qVar, "supplier is null");
        return new m2(qVar, 3);
    }

    public static <T> Observable generate(igm.g gVar) {
        Objects.requireNonNull(gVar, "generator is null");
        return generate(j.f184029h, new d0(gVar, 16), j.d);
    }

    public static Observable interval(long j2, long j3, TimeUnit timeUnit) {
        return interval(j2, j3, timeUnit, e.f126319b);
    }

    public static Observable intervalRange(long j2, long j3, long j5, long j16, TimeUnit timeUnit) {
        return intervalRange(j2, j3, j5, j16, timeUnit, e.f126319b);
    }

    public static <T> Observable just(T t2) {
        Objects.requireNonNull(t2, "item is null");
        return new l3(t2);
    }

    public static <T> Observable merge(Iterable<? extends ObservableSource> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap((o) j.f184025a, false, i, i2);
    }

    @SafeVarargs
    public static <T> Observable mergeArray(int i, int i2, ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap((o) j.f184025a, false, i, i2);
    }

    @SafeVarargs
    public static <T> Observable mergeArrayDelayError(int i, int i2, ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap((o) j.f184025a, true, i, i2);
    }

    public static <T> Observable mergeDelayError(Iterable<? extends ObservableSource> iterable) {
        return fromIterable(iterable).flatMap((o) j.f184025a, true);
    }

    public static <T> Observable never() {
        return s3.f263148a;
    }

    public static Observable range(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(d.n("count >= 0 required but it was ", i2));
        }
        if (i2 == 0) {
            return empty();
        }
        if (i2 == 1) {
            return just(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new a4(i, i2);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static Observable rangeLong(long j2, long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException(p.a.m(j3, "count >= 0 required but it was "));
        }
        if (j3 == 0) {
            return empty();
        }
        if (j3 == 1) {
            return just(Long.valueOf(j2));
        }
        long j5 = (j3 - 1) + j2;
        if (j2 <= 0 || j5 >= 0) {
            return new b4(j2, j3);
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource observableSource, ObservableSource observableSource2) {
        return sequenceEqual(observableSource, observableSource2, j.i, bufferSize());
    }

    public static <T> Observable switchOnNext(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "bufferSize");
        return new u3(observableSource, (o) j.f184025a, i, false);
    }

    public static <T> Observable switchOnNextDelayError(ObservableSource observableSource) {
        return switchOnNextDelayError(observableSource, bufferSize());
    }

    public static Observable timer(long j2, TimeUnit timeUnit) {
        return timer(j2, timeUnit, e.f126319b);
    }

    public static <T> Observable unsafeCreate(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "onSubscribe is null");
        if (observableSource instanceof Observable) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return new mgm.j(observableSource, 9);
    }

    public static <T, D> Observable using(q qVar, o oVar, igm.g gVar) {
        return using(qVar, oVar, gVar, true);
    }

    public static <T> Observable wrap(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "source is null");
        return observableSource instanceof Observable ? (Observable) observableSource : new mgm.j(observableSource, 9);
    }

    public static <T, R> Observable zip(Iterable<? extends ObservableSource> iterable, o oVar) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        return new l0(null, iterable, oVar, bufferSize(), false, 1);
    }

    @SafeVarargs
    public static <T, R> Observable zipArray(o oVar, boolean z, int i, ObservableSource... observableSourceArr) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(oVar, "zipper is null");
        j.a(i, "bufferSize");
        return new l0(observableSourceArr, null, oVar, i, z, 1);
    }

    public final a3 a(igm.g gVar, igm.g gVar2, a aVar, a aVar2) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        return new a3(this, gVar, gVar2, aVar, aVar2, 2);
    }

    public final Single<Boolean> all(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new n(this, pVar, 0);
    }

    public final Observable ambWith(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return ambArray(this, observableSource);
    }

    public final Single<Boolean> any(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new n(this, pVar, 1);
    }

    public final h1 b(long j2, TimeUnit timeUnit, Scheduler scheduler, ObservableSource observableSource) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new h1(this, j2, timeUnit, scheduler, observableSource, 2);
    }

    public final Object blockingFirst() {
        ngm.d dVar = new ngm.d(1, 0);
        subscribe(dVar);
        Object objA = dVar.a();
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(igm.g gVar) {
        blockingForEach(gVar, bufferSize());
    }

    public final Iterable<Object> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final Object blockingLast() {
        ngm.d dVar = new ngm.d(1, 1);
        subscribe(dVar);
        Object objA = dVar.a();
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<Object> blockingLatest() {
        return new sgm.e(this, 0);
    }

    public final Iterable<Object> blockingMostRecent(Object obj2) {
        Objects.requireNonNull(obj2, "initialItem is null");
        return new h(this, obj2, 0);
    }

    public final Iterable<Object> blockingNext() {
        return new sgm.e(this, 1);
    }

    public final Object blockingSingle() {
        Maybe maybeSingleElement = singleElement();
        maybeSingleElement.getClass();
        ngm.e eVar = new ngm.e(1);
        maybeSingleElement.c(eVar);
        Object objA = eVar.a();
        if (objA != null) {
            return objA;
        }
        throw new NoSuchElementException();
    }

    public final Stream<Object> blockingStream() {
        return blockingStream(bufferSize());
    }

    public final void blockingSubscribe() {
        ygm.d dVar = new ygm.d(1);
        i iVar = new i(j.d, dVar, dVar);
        subscribe(iVar);
        if (dVar.getCount() != 0) {
            try {
                dVar.await();
            } catch (InterruptedException e) {
                jgm.b.a(iVar);
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
        Throwable th10 = dVar.f313671a;
        if (th10 != null) {
            throw ygm.g.f(th10);
        }
    }

    public final Observable buffer(int i, int i2) {
        return buffer(i, i2, ygm.b.INSTANCE);
    }

    public final Observable cache() {
        return cacheWithInitialCapacity(16);
    }

    public final Observable cacheWithInitialCapacity(int i) {
        j.a(i, "initialCapacity");
        return new g0(this, i);
    }

    public final <U> Observable cast(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return map(new t(cls, 25));
    }

    public final <U> Single<U> collect(q qVar, igm.b bVar) {
        Objects.requireNonNull(qVar, "initialItemSupplier is null");
        Objects.requireNonNull(bVar, "collector is null");
        return new i0(this, qVar, bVar);
    }

    public final <U> Single<U> collectInto(U u, igm.b bVar) {
        Objects.requireNonNull(u, "initialItem is null");
        return collect(new kgm.e(u), bVar);
    }

    public final <R> Observable compose(ObservableTransformer observableTransformer) {
        Objects.requireNonNull(observableTransformer, "composer is null");
        return wrap(observableTransformer.b(this));
    }

    public final <R> Observable concatMap(o oVar) {
        return concatMap(oVar, 2);
    }

    public final Completable concatMapCompletable(o oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final Completable concatMapCompletableDelayError(o oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> Observable concatMapDelayError(o oVar) {
        return concatMapDelayError(oVar, true, bufferSize());
    }

    public final <R> Observable concatMapEager(o oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> Observable concatMapEagerDelayError(o oVar, boolean z) {
        return concatMapEagerDelayError(oVar, z, Integer.MAX_VALUE, bufferSize());
    }

    public final <U> Observable concatMapIterable(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new f1(this, oVar, 2);
    }

    public final <R> Observable concatMapMaybe(o oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> Observable concatMapMaybeDelayError(o oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> Observable concatMapSingle(o oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> Observable concatMapSingleDelayError(o oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final <R> Observable concatMapStream(o oVar) {
        return flatMapStream(oVar);
    }

    public final Observable concatWith(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concat(this, observableSource);
    }

    public final Single<Boolean> contains(Object obj2) {
        Objects.requireNonNull(obj2, "item is null");
        return any(new c(obj2, 0));
    }

    public final Single<Long> count() {
        return new b1(this);
    }

    public final Observable debounce(long j2, TimeUnit timeUnit) {
        return debounce(j2, timeUnit, e.f126319b);
    }

    public final Observable defaultIfEmpty(Object obj2) {
        Objects.requireNonNull(obj2, "defaultItem is null");
        return switchIfEmpty(just(obj2));
    }

    public final Observable delay(long j2, TimeUnit timeUnit) {
        return delay(j2, timeUnit, e.f126319b, false);
    }

    public final Observable delaySubscription(long j2, TimeUnit timeUnit) {
        return delaySubscription(j2, timeUnit, e.f126319b);
    }

    public final <R> Observable dematerialize(o oVar) {
        Objects.requireNonNull(oVar, "selector is null");
        return new f1(this, oVar, 1);
    }

    public final <K> Observable distinct(o oVar) {
        return distinct(oVar, kgm.d.INSTANCE);
    }

    public final Observable distinctUntilChanged() {
        return distinctUntilChanged(j.f184025a);
    }

    public final Observable doAfterNext(igm.g gVar) {
        Objects.requireNonNull(gVar, "onAfterNext is null");
        return new t1(this, gVar, 0);
    }

    public final Observable doAfterTerminate(a aVar) {
        Objects.requireNonNull(aVar, "onAfterTerminate is null");
        he2.b bVar = j.d;
        return a(bVar, bVar, j.f184027c, aVar);
    }

    public final Observable doFinally(a aVar) {
        Objects.requireNonNull(aVar, "onFinally is null");
        return new t1(this, aVar, 1);
    }

    public final Observable doOnComplete(a aVar) {
        he2.b bVar = j.d;
        return a(bVar, bVar, aVar, j.f184027c);
    }

    public final Observable doOnDispose(a aVar) {
        return doOnLifecycle(j.d, aVar);
    }

    public final Observable doOnEach(igm.g gVar) {
        Objects.requireNonNull(gVar, "onNotification is null");
        return a(new z(gVar, 29), new s(gVar, 25), new kgm.g(gVar, 0), j.f184027c);
    }

    public final Observable doOnError(igm.g gVar) {
        he2.b bVar = j.d;
        kgm.b bVar2 = j.f184027c;
        return a(bVar, gVar, bVar2, bVar2);
    }

    public final Observable doOnLifecycle(igm.g gVar, a aVar) {
        Objects.requireNonNull(gVar, "onSubscribe is null");
        Objects.requireNonNull(aVar, "onDispose is null");
        return new y(this, gVar, aVar, 4);
    }

    public final Observable doOnNext(igm.g gVar) {
        he2.b bVar = j.d;
        kgm.b bVar2 = j.f184027c;
        return a(gVar, bVar, bVar2, bVar2);
    }

    public final Observable doOnSubscribe(igm.g gVar) {
        return doOnLifecycle(gVar, j.f184027c);
    }

    public final Observable doOnTerminate(a aVar) {
        Objects.requireNonNull(aVar, "onTerminate is null");
        return a(j.d, new s(aVar, 24), aVar, j.f184027c);
    }

    public final Maybe elementAt(long j2) {
        if (j2 >= 0) {
            return new z1(this, j2);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final Single<Object> elementAtOrError(long j2) {
        if (j2 >= 0) {
            return new b2(this, j2, null);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final Observable filter(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new l(this, pVar, 2);
    }

    public final Single<Object> first(Object obj2) {
        return elementAt(0L, obj2);
    }

    public final Maybe firstElement() {
        return elementAt(0L);
    }

    public final Single<Object> firstOrError() {
        return elementAtOrError(0L);
    }

    public final CompletionStage<Object> firstOrErrorStage() {
        return (CompletionStage) subscribeWith(new mgm.e(false, null, 0));
    }

    public final CompletionStage<Object> firstStage(Object obj2) {
        return (CompletionStage) subscribeWith(new mgm.e(true, obj2, 0));
    }

    public final <R> Observable flatMap(o oVar) {
        return flatMap(oVar, false);
    }

    public final Completable flatMapCompletable(o oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> Observable flatMapIterable(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new f1(this, oVar, 2);
    }

    public final <R> Observable flatMapMaybe(o oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> Observable flatMapSingle(o oVar) {
        return flatMapSingle(oVar, false);
    }

    public final <R> Observable flatMapStream(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new mgm.g(this, oVar, 0);
    }

    public final Disposable forEach(igm.g gVar) {
        return subscribe(gVar);
    }

    public final Disposable forEachWhile(p pVar) {
        return forEachWhile(pVar, j.e, j.f184027c);
    }

    public final <K> Observable groupBy(o oVar) {
        return groupBy(oVar, j.f184025a, false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable groupJoin(ObservableSource observableSource, o oVar, o oVar2, igm.c cVar) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(oVar, "leftEnd is null");
        Objects.requireNonNull(oVar2, "rightEnd is null");
        Objects.requireNonNull(cVar, "resultSelector is null");
        return new a3(this, observableSource, oVar, oVar2, cVar, 0);
    }

    public final Observable hide() {
        return new a1(this, 2);
    }

    public final Completable ignoreElements() {
        return new b3(this);
    }

    public final Single<Boolean> isEmpty() {
        return all(j.f184028g);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> Observable join(ObservableSource observableSource, o oVar, o oVar2, igm.c cVar) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(oVar, "leftEnd is null");
        Objects.requireNonNull(oVar2, "rightEnd is null");
        Objects.requireNonNull(cVar, "resultSelector is null");
        return new a3(this, observableSource, oVar, oVar2, cVar, 1);
    }

    public final Single<Object> last(Object obj2) {
        Objects.requireNonNull(obj2, "defaultItem is null");
        return new o3(this, obj2, 0);
    }

    public final Maybe lastElement() {
        return new n3(this, 0);
    }

    public final Single<Object> lastOrError() {
        return new o3(this, null, 0);
    }

    public final CompletionStage<Object> lastOrErrorStage() {
        return (CompletionStage) subscribeWith(new mgm.e(false, null, 1));
    }

    public final CompletionStage<Object> lastStage(Object obj2) {
        return (CompletionStage) subscribeWith(new mgm.e(true, obj2, 1));
    }

    public final <R> Observable lift(k kVar) {
        Objects.requireNonNull(kVar, "lifter is null");
        return new a1(this, 4);
    }

    public final <R> Observable map(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new f1(this, oVar, 3);
    }

    public final <R> Observable mapOptional(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new mgm.g(this, oVar, 1);
    }

    public final Observable materialize() {
        return new a1(this, 5);
    }

    public final Observable mergeWith(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return merge(this, observableSource);
    }

    public final Observable observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    public final <U> Observable ofType(Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return filter(new fkg.a(cls, 26)).cast(cls);
    }

    public final Observable onErrorComplete() {
        return onErrorComplete(j.f);
    }

    public final Observable onErrorResumeNext(o oVar) {
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return new f1(this, oVar, 4);
    }

    public final Observable onErrorResumeWith(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return onErrorResumeNext(new kgm.e(observableSource));
    }

    public final Observable onErrorReturn(o oVar) {
        Objects.requireNonNull(oVar, "itemSupplier is null");
        return new f1(this, oVar, 5);
    }

    public final Observable onErrorReturnItem(Object obj2) {
        Objects.requireNonNull(obj2, "item is null");
        return onErrorReturn(new kgm.e(obj2));
    }

    public final Observable onTerminateDetach() {
        return new a1(this, 1);
    }

    public final zgm.a publish() {
        return new y3(this);
    }

    public final Maybe reduce(igm.c cVar) {
        Objects.requireNonNull(cVar, "reducer is null");
        return new qgm.d(this, cVar, 1);
    }

    public final <R> Single<R> reduceWith(q qVar, igm.c cVar) {
        Objects.requireNonNull(qVar, "seedSupplier is null");
        Objects.requireNonNull(cVar, "reducer is null");
        return new c4(this, qVar, cVar, 1);
    }

    public final Observable repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final Observable repeatUntil(igm.e eVar) {
        Objects.requireNonNull(eVar, "stop is null");
        return new a1(this, 6);
    }

    public final Observable repeatWhen(o oVar) {
        Objects.requireNonNull(oVar, "handler is null");
        return new f1(this, oVar, 7);
    }

    public final zgm.a replay() {
        return w4.e(this, w4.e);
    }

    public final Observable retry() {
        return retry(Long.MAX_VALUE, j.f);
    }

    public final Observable retryUntil(igm.e eVar) {
        Objects.requireNonNull(eVar, "stop is null");
        return retry(Long.MAX_VALUE, new dcl.q());
    }

    public final Observable retryWhen(o oVar) {
        Objects.requireNonNull(oVar, "handler is null");
        return new f1(this, oVar, 8);
    }

    public final void safeSubscribe(fgm.l lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        if (lVar instanceof ahm.b) {
            subscribe(lVar);
        } else {
            subscribe(new ahm.b(lVar));
        }
    }

    public final Observable sample(long j2, TimeUnit timeUnit) {
        return sample(j2, timeUnit, e.f126319b);
    }

    public final Observable scan(igm.c cVar) {
        Objects.requireNonNull(cVar, "accumulator is null");
        return new t1(this, cVar, 3);
    }

    public final <R> Observable scanWith(q qVar, igm.c cVar) {
        Objects.requireNonNull(qVar, "seedSupplier is null");
        Objects.requireNonNull(cVar, "accumulator is null");
        return new y(this, qVar, cVar, 5, false);
    }

    public final Observable serialize() {
        return new a1(this, 7);
    }

    public final Observable share() {
        zgm.a aVarPublish = publish();
        aVarPublish.getClass();
        return new e4(aVarPublish);
    }

    public final Single<Object> single(Object obj2) {
        Objects.requireNonNull(obj2, "defaultItem is null");
        return new o3(this, obj2, 1);
    }

    public final Maybe singleElement() {
        return new n3(this, 1);
    }

    public final Single<Object> singleOrError() {
        return new o3(this, null, 1);
    }

    public final CompletionStage<Object> singleOrErrorStage() {
        return (CompletionStage) subscribeWith(new mgm.e(false, null, 2));
    }

    public final CompletionStage<Object> singleStage(Object obj2) {
        return (CompletionStage) subscribeWith(new mgm.e(true, obj2, 2));
    }

    public final Observable skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : new g4(this, j2, 1);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 expected but it was "));
    }

    public final Observable skipLast(long j2, TimeUnit timeUnit) {
        return skipLast(j2, timeUnit, e.d, false, bufferSize());
    }

    public final <U> Observable skipUntil(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new s5(this, observableSource, 0);
    }

    public final Observable skipWhile(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new l(this, pVar, 4);
    }

    public final Observable sorted() {
        return toList().l().map(new fn2.c(kgm.f.INSTANCE, 27)).flatMapIterable(j.f184025a);
    }

    public final Observable startWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return concat(Completable.l(completableSource).k(), this);
    }

    @SafeVarargs
    public final Observable startWithArray(Object... objArr) {
        Observable observableFromArray = fromArray(objArr);
        return observableFromArray == empty() ? this : concatArray(observableFromArray, this);
    }

    public final Observable startWithItem(Object obj2) {
        return concatArray(just(obj2), this);
    }

    public final Observable startWithIterable(Iterable<Object> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final Disposable subscribe() {
        return subscribe(j.d, j.e, j.f184027c);
    }

    public abstract void subscribeActual(fgm.l lVar);

    public final Observable subscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new u5(this, scheduler, 0);
    }

    public final <E extends fgm.l> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final Observable switchIfEmpty(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new s5(this, observableSource, 1);
    }

    public final <R> Observable switchMap(o oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final Completable switchMapCompletable(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.k(this, oVar, false);
    }

    public final Completable switchMapCompletableDelayError(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.k(this, oVar, true);
    }

    public final <R> Observable switchMapDelayError(o oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> Observable switchMapMaybe(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.n(this, oVar, false, 0);
    }

    public final <R> Observable switchMapMaybeDelayError(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.n(this, oVar, true, 0);
    }

    public final <R> Observable switchMapSingle(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.n(this, oVar, false, 1);
    }

    public final <R> Observable switchMapSingleDelayError(o oVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new rgm.n(this, oVar, true, 1);
    }

    public final Observable take(long j2) {
        if (j2 >= 0) {
            return new g4(this, j2, 2);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 required but it was "));
    }

    public final Observable takeLast(long j2, long j3, TimeUnit timeUnit) {
        return takeLast(j2, j3, timeUnit, e.d, false, bufferSize());
    }

    public final <U> Observable takeUntil(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return new s5(this, observableSource, 2);
    }

    public final Observable takeWhile(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new l(this, pVar, 6);
    }

    public final ahm.e test() {
        ahm.e eVar = new ahm.e();
        subscribe(eVar);
        return eVar;
    }

    public final Observable throttleFirst(long j2, TimeUnit timeUnit) {
        return throttleFirst(j2, timeUnit, e.f126319b);
    }

    public final Observable throttleLast(long j2, TimeUnit timeUnit) {
        return sample(j2, timeUnit);
    }

    public final Observable throttleLatest(long j2, TimeUnit timeUnit) {
        return throttleLatest(j2, timeUnit, e.f126319b, false);
    }

    public final Observable throttleWithTimeout(long j2, TimeUnit timeUnit) {
        return debounce(j2, timeUnit);
    }

    public final Observable timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, e.f126319b);
    }

    public final Observable timeout(long j2, TimeUnit timeUnit) {
        return b(j2, timeUnit, e.f126319b, null);
    }

    public final Observable timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, e.f126319b);
    }

    public final <R> R to(fgm.i iVar) {
        Objects.requireNonNull(iVar, "converter is null");
        throw new ClassCastException();
    }

    public final Flowable toFlowable(fgm.a aVar) {
        Objects.requireNonNull(aVar, "strategy is null");
        ogm.q qVar = new ogm.q(this, 3);
        int i = fgm.h.f135109a[aVar.ordinal()];
        if (i == 1) {
            return new b0(qVar);
        }
        if (i == 2) {
            return new v(qVar, 2);
        }
        if (i == 3) {
            return qVar;
        }
        if (i == 4) {
            return new v(qVar, 1);
        }
        int i2 = Flowable.f163113a;
        j.a(i2, "capacity");
        return new x0(qVar, i2);
    }

    public final Future<Object> toFuture() {
        return (Future) subscribeWith(new ngm.l());
    }

    public final Single<List<Object>> toList() {
        return toList(16);
    }

    public final <K> Single<Map<K, Object>> toMap(o oVar) {
        Objects.requireNonNull(oVar, "keySelector is null");
        return collect(ygm.h.INSTANCE, new f4h.a(oVar, 28));
    }

    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(o oVar, o oVar2) {
        return toMultimap(oVar, oVar2, ygm.h.INSTANCE, ygm.b.INSTANCE);
    }

    public final Single<List<Object>> toSortedList() {
        return toSortedList(kgm.f.INSTANCE);
    }

    public final Observable unsubscribeOn(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new u5(this, scheduler, 1);
    }

    public final Observable window(long j2, long j3, TimeUnit timeUnit) {
        return window(j2, j3, timeUnit, e.f126319b, bufferSize());
    }

    public final <U, R> Observable withLatestFrom(ObservableSource observableSource, igm.c cVar) {
        Objects.requireNonNull(observableSource, "other is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return new y(this, cVar, observableSource, 7, false);
    }

    public final <U, R> Observable zipWith(Iterable<U> iterable, igm.c cVar) {
        Objects.requireNonNull(iterable, "other is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return new r2(this, iterable, cVar);
    }

    public static <T, R> Observable combineLatest(Iterable<? extends ObservableSource> iterable, o oVar, int i) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(oVar, "combiner is null");
        j.a(i, "bufferSize");
        return new l0(null, iterable, oVar, i << 1, false, 0);
    }

    public static <T, R> Observable combineLatestArray(ObservableSource[] observableSourceArr, o oVar, int i) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        Objects.requireNonNull(oVar, "combiner is null");
        j.a(i, "bufferSize");
        return new l0(observableSourceArr, null, oVar, i << 1, false, 0);
    }

    public static <T, R> Observable combineLatestArrayDelayError(ObservableSource[] observableSourceArr, o oVar, int i) {
        Objects.requireNonNull(observableSourceArr, "sources is null");
        Objects.requireNonNull(oVar, "combiner is null");
        j.a(i, "bufferSize");
        if (observableSourceArr.length == 0) {
            return empty();
        }
        return new l0(observableSourceArr, null, oVar, i << 1, true, 0);
    }

    public static <T, R> Observable combineLatestDelayError(Iterable<? extends ObservableSource> iterable, o oVar, int i) {
        Objects.requireNonNull(iterable, "sources is null");
        Objects.requireNonNull(oVar, "combiner is null");
        j.a(i, "bufferSize");
        return new l0(null, iterable, oVar, i << 1, true, 0);
    }

    @SafeVarargs
    public static <T> Observable concatArrayEager(int i, int i2, ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(j.f184025a, false, i, i2);
    }

    @SafeVarargs
    public static <T> Observable concatArrayEagerDelayError(int i, int i2, ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).concatMapEagerDelayError(j.f184025a, true, i, i2);
    }

    public static <T> Observable concatEager(Iterable<? extends ObservableSource> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(j.f184025a, false, i, i2);
    }

    public static <T> Observable concatEagerDelayError(Iterable<? extends ObservableSource> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(j.f184025a, true, i, i2);
    }

    public static <T> Observable merge(Iterable<? extends ObservableSource> iterable) {
        return fromIterable(iterable).flatMap(j.f184025a);
    }

    @SafeVarargs
    public static <T> Observable mergeArray(ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap(j.f184025a, observableSourceArr.length);
    }

    @SafeVarargs
    public static <T> Observable mergeArrayDelayError(ObservableSource... observableSourceArr) {
        return fromArray(observableSourceArr).flatMap((o) j.f184025a, true, observableSourceArr.length);
    }

    public static <T> Observable mergeDelayError(Iterable<? extends ObservableSource> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap((o) j.f184025a, true, i, i2);
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource observableSource, ObservableSource observableSource2, igm.d dVar) {
        return sequenceEqual(observableSource, observableSource2, dVar, bufferSize());
    }

    public static <T> Observable switchOnNextDelayError(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "bufferSize");
        return new u3(observableSource, (o) j.f184025a, i, true);
    }

    public static <T, D> Observable using(q qVar, o oVar, igm.g gVar, boolean z) {
        Objects.requireNonNull(qVar, "resourceSupplier is null");
        Objects.requireNonNull(oVar, "sourceSupplier is null");
        Objects.requireNonNull(gVar, "resourceCleanup is null");
        return new n6(qVar, oVar, gVar, z);
    }

    public final void blockingForEach(igm.g gVar, int i) {
        Objects.requireNonNull(gVar, "onNext is null");
        Iterator<Object> it8 = blockingIterable(i).iterator();
        while (it8.hasNext()) {
            try {
                gVar.accept(it8.next());
            } catch (Throwable th10) {
                m.F(th10);
                ((Disposable) it8).dispose();
                throw ygm.g.f(th10);
            }
        }
    }

    public final Iterable<Object> blockingIterable(int i) {
        j.a(i, "capacityHint");
        return new sgm.c(this, i, 0);
    }

    public final Stream<Object> blockingStream(int i) {
        Iterator<Object> it8 = blockingIterable(i).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it8, 0), false);
        Disposable disposable = (Disposable) it8;
        disposable.getClass();
        return (Stream) stream.onClose(new a0.a(disposable, 29));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable concatMap(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        if (!(this instanceof bhm.e)) {
            return new p0(this, oVar, i, f.IMMEDIATE);
        }
        Object obj2 = ((bhm.e) this).get();
        return obj2 == null ? empty() : new b(obj2, oVar, 6);
    }

    public final Completable concatMapCompletable(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "capacityHint");
        return new rgm.f(this, oVar, f.IMMEDIATE, i);
    }

    public final Completable concatMapCompletableDelayError(o oVar, boolean z) {
        return concatMapCompletableDelayError(oVar, z, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable concatMapDelayError(o oVar, boolean z, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        if (!(this instanceof bhm.e)) {
            return new p0(this, oVar, i, z ? f.END : f.BOUNDARY);
        }
        Object obj2 = ((bhm.e) this).get();
        return obj2 == null ? empty() : new b(obj2, oVar, 6);
    }

    public final <R> Observable concatMapEager(o oVar, int i, int i2) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "maxConcurrency");
        j.a(i2, "bufferSize");
        return new r0(this, oVar, f.IMMEDIATE, i, i2);
    }

    public final <R> Observable concatMapEagerDelayError(o oVar, boolean z, int i, int i2) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "maxConcurrency");
        j.a(i2, "bufferSize");
        return new r0(this, oVar, z ? f.END : f.BOUNDARY, i, i2);
    }

    public final <R> Observable concatMapMaybe(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        return new rgm.h(this, oVar, f.IMMEDIATE, i, 0);
    }

    public final <R> Observable concatMapMaybeDelayError(o oVar, boolean z) {
        return concatMapMaybeDelayError(oVar, z, 2);
    }

    public final <R> Observable concatMapSingle(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        return new rgm.h(this, oVar, f.IMMEDIATE, i, 1);
    }

    public final <R> Observable concatMapSingleDelayError(o oVar, boolean z) {
        return concatMapSingleDelayError(oVar, z, 2);
    }

    public final <K> Observable distinctUntilChanged(o oVar) {
        Objects.requireNonNull(oVar, "keySelector is null");
        return new y(this, oVar, j.i, 3);
    }

    public final <R> Observable flatMap(o oVar, boolean z) {
        return flatMap(oVar, z, Integer.MAX_VALUE);
    }

    public final Completable flatMapCompletable(o oVar, boolean z) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new j2(this, oVar, z);
    }

    public final <R> Observable flatMapMaybe(o oVar, boolean z) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new h2(this, oVar, z, 1);
    }

    public final <R> Observable flatMapSingle(o oVar, boolean z) {
        Objects.requireNonNull(oVar, "mapper is null");
        return new h2(this, oVar, z, 2);
    }

    public final Disposable forEachWhile(p pVar, igm.g gVar) {
        return forEachWhile(pVar, gVar, j.f184027c);
    }

    public final <K> Observable groupBy(o oVar, boolean z) {
        return groupBy(oVar, j.f184025a, z, bufferSize());
    }

    public final Observable observeOn(Scheduler scheduler, boolean z) {
        return observeOn(scheduler, z, bufferSize());
    }

    public final Observable onErrorComplete(p pVar) {
        Objects.requireNonNull(pVar, "predicate is null");
        return new l(this, pVar, 3);
    }

    public final <R> Observable publish(o oVar) {
        Objects.requireNonNull(oVar, "selector is null");
        return new f1(this, oVar, 6);
    }

    public final Observable repeat(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? empty() : new g4(this, j2, 0);
        }
        throw new IllegalArgumentException(p.a.m(j2, "times >= 0 required but it was "));
    }

    public final <R> Observable replay(o oVar, int i, long j2, TimeUnit timeUnit) {
        return replay(oVar, i, j2, timeUnit, e.f126319b);
    }

    public final Observable retry(igm.d dVar) {
        Objects.requireNonNull(dVar, "predicate is null");
        return new t1(this, dVar, 2);
    }

    public final Disposable subscribe(igm.g gVar) {
        return subscribe(gVar, j.e, j.f184027c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable switchMap(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        if (!(this instanceof bhm.e)) {
            return new u3((ObservableSource) this, oVar, i, false);
        }
        Object obj2 = ((bhm.e) this).get();
        return obj2 == null ? empty() : new b(obj2, oVar, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable switchMapDelayError(o oVar, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        if (!(this instanceof bhm.e)) {
            return new u3((ObservableSource) this, oVar, i, true);
        }
        Object obj2 = ((bhm.e) this).get();
        return obj2 == null ? empty() : new b(obj2, oVar, 6);
    }

    public final Observable throttleLast(long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        return sample(j2, timeUnit, scheduler, false, gVar);
    }

    public final Observable throttleWithTimeout(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j2, timeUnit, scheduler);
    }

    public final Single<List<Object>> toList(int i) {
        j.a(i, "capacityHint");
        return new mgm.d(this, i);
    }

    public static <T> Observable concat(ObservableSource observableSource) {
        return concat(observableSource, bufferSize());
    }

    public static <T> Observable concatDelayError(ObservableSource observableSource) {
        return concatDelayError(observableSource, bufferSize(), true);
    }

    public static <T> Observable concatEager(ObservableSource observableSource) {
        return concatEager(observableSource, bufferSize(), bufferSize());
    }

    public static <T> Observable concatEagerDelayError(ObservableSource observableSource) {
        return concatEagerDelayError(observableSource, bufferSize(), bufferSize());
    }

    public static <T> Observable error(Throwable th10) {
        Objects.requireNonNull(th10, "throwable is null");
        return error(new kgm.e(th10));
    }

    public static <T> Observable fromFuture(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return new o2(future, j2, timeUnit);
    }

    public static Observable interval(long j2, TimeUnit timeUnit) {
        return interval(j2, j2, timeUnit, e.f126319b);
    }

    public static Observable intervalRange(long j2, long j3, long j5, long j16, TimeUnit timeUnit, Scheduler scheduler) {
        if (j3 < 0) {
            throw new IllegalArgumentException(p.a.m(j3, "count >= 0 required but it was "));
        }
        if (j3 == 0) {
            return empty().delay(j5, timeUnit, scheduler);
        }
        long j22 = (j3 - 1) + j2;
        if (j2 > 0 && j22 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new k3(j2, j22, Math.max(0L, j5), Math.max(0L, j16), timeUnit, scheduler);
    }

    public static <T> Observable just(T t2, T t3) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        return fromArray(t2, t3);
    }

    public static <T> Observable merge(Iterable<? extends ObservableSource> iterable, int i) {
        return fromIterable(iterable).flatMap(j.f184025a, i);
    }

    public static <T> Observable mergeDelayError(Iterable<? extends ObservableSource> iterable, int i) {
        return fromIterable(iterable).flatMap((o) j.f184025a, true, i);
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource observableSource, ObservableSource observableSource2, igm.d dVar, int i) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(dVar, "isEqual is null");
        j.a(i, "bufferSize");
        return new l5(observableSource, observableSource2, dVar, i);
    }

    public static Observable timer(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new o2(Math.max(j2, 0L), timeUnit, scheduler);
    }

    public final Observable buffer(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        return buffer(j2, j3, timeUnit, scheduler, ygm.b.INSTANCE);
    }

    public final Completable concatMapCompletableDelayError(o oVar, boolean z, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        return new rgm.f(this, oVar, z ? f.END : f.BOUNDARY, i);
    }

    public final <R> Observable concatMapMaybeDelayError(o oVar, boolean z, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        return new rgm.h(this, oVar, z ? f.END : f.BOUNDARY, i, 0);
    }

    public final <R> Observable concatMapSingleDelayError(o oVar, boolean z, int i) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        return new rgm.h(this, oVar, z ? f.END : f.BOUNDARY, i, 1);
    }

    public final Observable concatWith(SingleSource singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return new y0(this, singleSource, 0);
    }

    public final <U> Observable debounce(o oVar) {
        Objects.requireNonNull(oVar, "debounceIndicator is null");
        return new f1(this, oVar, 0);
    }

    public final Observable delay(long j2, TimeUnit timeUnit, boolean z) {
        return delay(j2, timeUnit, e.f126319b, z);
    }

    public final <U> Observable delaySubscription(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "subscriptionIndicator is null");
        return new b(this, observableSource, 4);
    }

    public final Observable distinct() {
        return distinct(j.f184025a, kgm.d.INSTANCE);
    }

    public final <R> Observable flatMap(o oVar, boolean z, int i) {
        return flatMap(oVar, z, i, bufferSize());
    }

    public final <U, V> Observable flatMapIterable(o oVar, igm.c cVar) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return flatMap(new qr0.i(oVar, 10), cVar, false, bufferSize(), bufferSize());
    }

    public final Disposable forEachWhile(p pVar, igm.g gVar, a aVar) {
        Objects.requireNonNull(pVar, "onNext is null");
        Objects.requireNonNull(gVar, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        ngm.k kVar = new ngm.k(pVar, gVar, aVar);
        subscribe(kVar);
        return kVar;
    }

    public final <K, V> Observable groupBy(o oVar, o oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final Observable mergeWith(SingleSource singleSource) {
        Objects.requireNonNull(singleSource, "other is null");
        return new y0(this, singleSource, 1);
    }

    public final Observable observeOn(Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        j.a(i, "bufferSize");
        return new u3(this, scheduler, z, i);
    }

    public final <R> Single<R> reduce(R r2, igm.c cVar) {
        Objects.requireNonNull(r2, "seed is null");
        Objects.requireNonNull(cVar, "reducer is null");
        return new c4(this, r2, cVar, 0);
    }

    public final Observable sample(long j2, TimeUnit timeUnit, boolean z) {
        return sample(j2, timeUnit, e.f126319b, z);
    }

    public final <R> Observable scan(R r2, igm.c cVar) {
        Objects.requireNonNull(r2, "initialValue is null");
        return scanWith(new kgm.e(r2), cVar);
    }

    public final Observable skipLast(long j2, TimeUnit timeUnit, boolean z) {
        return skipLast(j2, timeUnit, e.d, z, bufferSize());
    }

    public final Observable startWith(SingleSource singleSource) {
        Single bVar;
        Objects.requireNonNull(singleSource, "other is null");
        if (singleSource instanceof Single) {
            bVar = (Single) singleSource;
        } else {
            bVar = new tgm.b(singleSource, 4);
        }
        return concat(bVar.l(), this);
    }

    public final Disposable subscribe(igm.g gVar, igm.g gVar2) {
        return subscribe(gVar, gVar2, j.f184027c);
    }

    public final Observable takeLast(long j2, TimeUnit timeUnit) {
        return takeLast(j2, timeUnit, e.d, false, bufferSize());
    }

    public final Observable takeUntil(p pVar) {
        Objects.requireNonNull(pVar, "stopPredicate is null");
        return new l(this, pVar, 5);
    }

    public final ahm.e test(boolean z) {
        ahm.e eVar = new ahm.e();
        if (z) {
            eVar.dispose();
        }
        subscribe(eVar);
        return eVar;
    }

    public final Observable throttleFirst(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new h1(this, j2, timeUnit, scheduler, null, 1);
    }

    public final Observable throttleLast(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j2, timeUnit, scheduler);
    }

    public final Observable throttleLatest(long j2, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j2, timeUnit, e.f126319b, z);
    }

    public final Observable throttleWithTimeout(long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        return debounce(j2, timeUnit, scheduler, gVar);
    }

    public final Observable timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, e.f126319b);
    }

    public final <V> Observable timeout(o oVar, ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        Objects.requireNonNull(oVar, "itemTimeoutIndicator is null");
        return new sgm.v(this, null, oVar, observableSource, 2);
    }

    public final Observable timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, e.f126319b);
    }

    public final Single<List<Object>> toSortedList(int i) {
        return toSortedList(kgm.f.INSTANCE, i);
    }

    public final Observable window(long j2, TimeUnit timeUnit) {
        return window(j2, timeUnit, (Scheduler) e.f126319b, Long.MAX_VALUE, false);
    }

    public static <T> Observable concat(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "bufferSize");
        return new p0(observableSource, j.f184025a, i, f.IMMEDIATE);
    }

    public static <T> Observable concatDelayError(ObservableSource observableSource, int i, boolean z) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "bufferSize is null");
        return new p0(observableSource, j.f184025a, i, z ? f.END : f.BOUNDARY);
    }

    public static <T> Observable concatEager(ObservableSource observableSource, int i, int i2) {
        return wrap(observableSource).concatMapEager(j.f184025a, i, i2);
    }

    public static <T> Observable concatEagerDelayError(ObservableSource observableSource, int i, int i2) {
        return wrap(observableSource).concatMapEagerDelayError(j.f184025a, true, i, i2);
    }

    public static <T> Observable merge(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new f2(observableSource, j.f184025a, false, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> Observable mergeDelayError(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "sources is null");
        return new f2(observableSource, j.f184025a, true, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> Observable switchOnNext(ObservableSource observableSource) {
        return switchOnNext(observableSource, bufferSize());
    }

    public static <T, R> Observable zip(Iterable<? extends ObservableSource> iterable, o oVar, boolean z, int i) {
        Objects.requireNonNull(oVar, "zipper is null");
        Objects.requireNonNull(iterable, "sources is null");
        j.a(i, "bufferSize");
        return new l0(null, iterable, oVar, i, z, 1);
    }

    public final <R, A> Single<R> collect(Collector<Object, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return new mgm.d(this, collector, 0);
    }

    public final Observable distinctUntilChanged(igm.d dVar) {
        Objects.requireNonNull(dVar, "comparer is null");
        return new y(this, j.f184025a, dVar, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> Observable flatMap(o oVar, boolean z, int i, int i2) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "maxConcurrency");
        j.a(i2, "bufferSize");
        if (this instanceof bhm.e) {
            Object obj2 = ((bhm.e) this).get();
            if (obj2 == null) {
                return empty();
            }
            return new b(obj2, oVar, 6);
        }
        return new f2(this, oVar, z, i, i2);
    }

    public final <K, V> Observable groupBy(o oVar, o oVar2, boolean z) {
        return groupBy(oVar, oVar2, z, bufferSize());
    }

    public final <R> Observable replay(o oVar, long j2, TimeUnit timeUnit) {
        return replay(oVar, j2, timeUnit, e.f126319b);
    }

    public final Observable retry(long j2) {
        return retry(j2, j.f);
    }

    public final Disposable subscribe(igm.g gVar, igm.g gVar2, a aVar) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        i iVar = new i(gVar, gVar2, aVar);
        subscribe(iVar);
        return iVar;
    }

    public final <U extends Collection<Object>> Single<U> toList(q qVar) {
        Objects.requireNonNull(qVar, "collectionSupplier is null");
        return new mgm.d(this, qVar, 1);
    }

    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(o oVar, o oVar2, q qVar) {
        return toMultimap(oVar, oVar2, qVar, ygm.b.INSTANCE);
    }

    public final <T1, T2, R> Observable withLatestFrom(ObservableSource observableSource, ObservableSource observableSource2, igm.h hVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(hVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2}, new dcl.q());
    }

    public final <U, R> Observable zipWith(ObservableSource observableSource, igm.c cVar) {
        Objects.requireNonNull(observableSource, "other is null");
        return zip(this, observableSource, cVar);
    }

    public static Observable interval(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new i3(Math.max(0L, j2), Math.max(0L, j3), timeUnit, scheduler);
    }

    public final Observable buffer(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return buffer(j2, timeUnit, scheduler, Integer.MAX_VALUE, ygm.b.INSTANCE, false);
    }

    public final Observable concatWith(MaybeSource maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return new sgm.x0(this, maybeSource, 0);
    }

    public final Observable debounce(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new h1(this, j2, timeUnit, scheduler, null, 0);
    }

    public final <U> Observable delay(o oVar) {
        Objects.requireNonNull(oVar, "itemDelayIndicator is null");
        return flatMap(new os2.g(oVar, 21));
    }

    public final Observable delaySubscription(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j2, timeUnit, scheduler));
    }

    public final <K, V> Observable groupBy(o oVar, o oVar2, boolean z, int i) {
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(oVar2, "valueSelector is null");
        j.a(i, "bufferSize");
        return new v2(this, oVar, oVar2, i, z);
    }

    public final Observable mergeWith(MaybeSource maybeSource) {
        Objects.requireNonNull(maybeSource, "other is null");
        return new sgm.x0(this, maybeSource, 1);
    }

    public final Observable retry(long j2, p pVar) {
        if (j2 >= 0) {
            Objects.requireNonNull(pVar, "predicate is null");
            return new z4(this, j2, pVar);
        }
        throw new IllegalArgumentException(p.a.m(j2, "times >= 0 required but it was "));
    }

    public final Observable sample(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new d5(this, j2, timeUnit, scheduler, false, null, 0);
    }

    public final Observable skipLast(int i) {
        if (i >= 0) {
            return i == 0 ? this : new n5(this, i, 0);
        }
        throw new IllegalArgumentException(d.n("count >= 0 required but it was ", i));
    }

    public final Observable sorted(Comparator<Object> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().l().map(new fn2.c(comparator, 27)).flatMapIterable(j.f184025a);
    }

    public final Observable takeLast(long j2, TimeUnit timeUnit, boolean z) {
        return takeLast(j2, timeUnit, e.d, z, bufferSize());
    }

    public final Observable throttleLatest(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j2, timeUnit, scheduler, false);
    }

    public final <K, V> Single<Map<K, V>> toMap(o oVar, o oVar2) {
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(oVar2, "valueSelector is null");
        return collect(ygm.h.INSTANCE, new kgm.i(oVar2, oVar, 0));
    }

    public final Single<List<Object>> toSortedList(Comparator<Object> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().g(new fn2.c(comparator, 27));
    }

    public final Observable window(long j2, TimeUnit timeUnit, long j3) {
        return window(j2, timeUnit, (Scheduler) e.f126319b, j3, false);
    }

    public static <T1, T2, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, igm.c cVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2}, new z(cVar, 28), bufferSize());
    }

    public static <T, S> Observable generate(q qVar, igm.b bVar) {
        Objects.requireNonNull(bVar, "generator is null");
        return generate(qVar, new ogm.i(bVar, 25), j.d);
    }

    public static <T> Observable just(T t2, T t3, T t5) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        return fromArray(t2, t3, t5);
    }

    public static <T> Observable merge(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "maxConcurrency");
        return new f2(observableSource, j.f184025a, false, i, bufferSize());
    }

    public static <T> Observable mergeDelayError(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "sources is null");
        j.a(i, "maxConcurrency");
        return new f2(observableSource, j.f184025a, true, i, bufferSize());
    }

    public final Object blockingFirst(Object obj2) {
        Objects.requireNonNull(obj2, "defaultItem is null");
        ngm.d dVar = new ngm.d(1, 0);
        subscribe(dVar);
        Object objA = dVar.a();
        return objA != null ? objA : obj2;
    }

    public final Object blockingLast(Object obj2) {
        Objects.requireNonNull(obj2, "defaultItem is null");
        ngm.d dVar = new ngm.d(1, 1);
        subscribe(dVar);
        Object objA = dVar.a();
        return objA != null ? objA : obj2;
    }

    public final <K> Observable distinct(o oVar, q qVar) {
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(qVar, "collectionSupplier is null");
        return new y(this, oVar, qVar, 2);
    }

    public final zgm.a replay(int i, long j2, TimeUnit timeUnit) {
        return replay(i, j2, timeUnit, e.f126319b);
    }

    public final Observable throttleFirst(long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(gVar, "onDropped is null");
        return new h1(this, j2, timeUnit, scheduler, gVar, 1);
    }

    public final Observable throttleLatest(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new d5(this, j2, timeUnit, scheduler, z, null, 1);
    }

    public final Observable timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    public final Observable timeout(long j2, TimeUnit timeUnit, ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return b(j2, timeUnit, e.f126319b, observableSource);
    }

    public final Observable timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    public final <K> Single<Map<K, Collection<Object>>> toMultimap(o oVar) {
        return toMultimap(oVar, j.f184025a, ygm.h.INSTANCE, ygm.b.INSTANCE);
    }

    public final <U, R> Observable zipWith(ObservableSource observableSource, igm.c cVar, boolean z) {
        return zip(this, observableSource, cVar, z);
    }

    public static <T> Observable concat(ObservableSource observableSource, ObservableSource observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return concatArray(observableSource, observableSource2);
    }

    public final Object blockingSingle(Object obj2) {
        Single<Object> single = single(obj2);
        single.getClass();
        ngm.e eVar = new ngm.e(1);
        single.c(eVar);
        return eVar.a();
    }

    public final Observable buffer(long j2, TimeUnit timeUnit, Scheduler scheduler, int i) {
        return buffer(j2, timeUnit, scheduler, i, ygm.b.INSTANCE, false);
    }

    public final Observable concatWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return new w0(this, completableSource, 0);
    }

    public final Observable doOnEach(fgm.l lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        return a(new onh.b(lVar, 21), new p56.a(lVar, 20), new kgm.g(lVar, 1), j.f184027c);
    }

    public final Observable mergeWith(CompletableSource completableSource) {
        Objects.requireNonNull(completableSource, "other is null");
        return new w0(this, completableSource, 1);
    }

    public final Observable takeLast(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(d.n("count >= 0 required but it was ", i));
        }
        if (i == 0) {
            return new a1(this, 3);
        }
        if (i == 1) {
            return new a1(this, 8);
        }
        return new n5(this, i, 1);
    }

    public final Observable timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new y(this, timeUnit, scheduler, 6, false);
    }

    public final Observable timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return map(new jid.z(timeUnit, scheduler, 3));
    }

    public final Observable window(long j2, TimeUnit timeUnit, long j3, boolean z) {
        return window(j2, timeUnit, e.f126319b, j3, z);
    }

    public final <U, R> Observable zipWith(ObservableSource observableSource, igm.c cVar, boolean z, int i) {
        return zip(this, observableSource, cVar, z, i);
    }

    public static Observable interval(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j2, j2, timeUnit, scheduler);
    }

    public static <T> Single<Boolean> sequenceEqual(ObservableSource observableSource, ObservableSource observableSource2, int i) {
        return sequenceEqual(observableSource, observableSource2, j.i, i);
    }

    public static <T1, T2, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, igm.c cVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return zipArray(new z(cVar, 28), false, bufferSize(), observableSource, observableSource2);
    }

    public final Observable debounce(long j2, TimeUnit timeUnit, Scheduler scheduler, igm.g gVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(gVar, "onDropped is null");
        return new h1(this, j2, timeUnit, scheduler, gVar, 0);
    }

    public final Observable delay(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j2, timeUnit, scheduler, false);
    }

    public final zgm.a replay(long j2, TimeUnit timeUnit) {
        return replay(j2, timeUnit, e.f126319b);
    }

    public final Observable sample(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new d5(this, j2, timeUnit, scheduler, z, null, 0);
    }

    public final Observable startWith(MaybeSource maybeSource) {
        Object lVar;
        Observable jVar;
        Objects.requireNonNull(maybeSource, "other is null");
        if (maybeSource instanceof Maybe) {
            lVar = (Maybe) maybeSource;
        } else {
            lVar = new qgm.l(maybeSource);
        }
        if (lVar instanceof lgm.d) {
            jVar = ((lgm.d) lVar).a();
        } else {
            jVar = new mgm.j(lVar, 3);
        }
        return concat(jVar, this);
    }

    public static <T, S> Observable generate(q qVar, igm.b bVar, igm.g gVar) {
        Objects.requireNonNull(bVar, "generator is null");
        return generate(qVar, new ogm.i(bVar, 25), gVar);
    }

    public static <T> Observable merge(ObservableSource observableSource, ObservableSource observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap((o) j.f184025a, false, 2);
    }

    public static <T> Observable mergeDelayError(ObservableSource observableSource, ObservableSource observableSource2) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        return fromArray(observableSource, observableSource2).flatMap((o) j.f184025a, true, 2);
    }

    public final <B> Observable buffer(ObservableSource observableSource) {
        return buffer(observableSource, (q) ygm.b.INSTANCE);
    }

    public final <R> Observable concatMap(o oVar, int i, Scheduler scheduler) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new u0(this, oVar, i, f.IMMEDIATE, scheduler);
    }

    public final <R> Observable concatMapDelayError(o oVar, boolean z, int i, Scheduler scheduler) {
        Objects.requireNonNull(oVar, "mapper is null");
        j.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new u0(this, oVar, i, z ? f.END : f.BOUNDARY, scheduler);
    }

    public final Observable delay(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new l1(this, j2, timeUnit, scheduler, z);
    }

    public final Single<Object> elementAt(long j2, Object obj2) {
        if (j2 >= 0) {
            Objects.requireNonNull(obj2, "defaultItem is null");
            return new b2(this, j2, obj2);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final Observable skip(long j2, TimeUnit timeUnit) {
        return skipUntil(timer(j2, timeUnit));
    }

    public final Disposable subscribe(igm.g gVar, igm.g gVar2, a aVar, ggm.a aVar2) {
        Objects.requireNonNull(gVar, "onNext is null");
        Objects.requireNonNull(gVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        Objects.requireNonNull(aVar2, "container is null");
        i iVar = new i(gVar, gVar2, aVar, aVar2);
        aVar2.a(iVar);
        subscribe(iVar);
        return iVar;
    }

    public final Observable take(long j2, TimeUnit timeUnit) {
        return takeUntil(timer(j2, timeUnit));
    }

    public final Observable throttleLatest(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, igm.g gVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(gVar, "onDropped is null");
        return new d5(this, j2, timeUnit, scheduler, z, gVar, 1);
    }

    public final Observable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler, ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "fallback is null");
        return b(j2, timeUnit, scheduler, observableSource);
    }

    public final Single<List<Object>> toSortedList(Comparator<Object> comparator, int i) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList(i).g(new fn2.c(comparator, 27));
    }

    public final Observable window(long j2) {
        return window(j2, j2, bufferSize());
    }

    public static <T> Observable concat(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return concatArray(observableSource, observableSource2, observableSource3);
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        return fromArray(t2, t3, t5, t7);
    }

    public final <R> Observable replay(o oVar) {
        Objects.requireNonNull(oVar, "selector is null");
        return new b(new f3(this), oVar, 5);
    }

    public final Observable skip(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j2, timeUnit, scheduler));
    }

    public final Observable take(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j2, timeUnit, scheduler));
    }

    public final <K, V> Single<Map<K, V>> toMap(o oVar, o oVar2, q qVar) {
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(oVar2, "valueSelector is null");
        Objects.requireNonNull(qVar, "mapSupplier is null");
        return collect(qVar, new kgm.i(oVar2, oVar, 0));
    }

    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(o oVar, o oVar2, q qVar, o oVar3) {
        Objects.requireNonNull(oVar, "keySelector is null");
        Objects.requireNonNull(oVar2, "valueSelector is null");
        Objects.requireNonNull(qVar, "mapSupplier is null");
        Objects.requireNonNull(oVar3, "collectionFactory is null");
        return collect(qVar, new jt0.b(oVar3, 2, oVar2, oVar));
    }

    public final Observable window(long j2, long j3) {
        return window(j2, j3, bufferSize());
    }

    public final <T1, T2, T3, R> Observable withLatestFrom(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, igm.i iVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(iVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3}, new f4h.a(iVar, 27));
    }

    public final <TOpening, TClosing> Observable buffer(ObservableSource observableSource, o oVar) {
        return buffer(observableSource, oVar, ygm.b.INSTANCE);
    }

    public final Observable sample(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, igm.g gVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(gVar, "onDropped is null");
        return new d5(this, j2, timeUnit, scheduler, z, gVar, 0);
    }

    public final Observable timeout(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return b(j2, timeUnit, scheduler, null);
    }

    public final Observable window(long j2, long j3, int i) {
        j.b(j2, "count");
        j.b(j3, "skip");
        j.a(i, "bufferSize");
        return new q6(this, j2, j3, i);
    }

    public static <T1, T2, T3, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, igm.h hVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(hVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3}, new dcl.q(), bufferSize());
    }

    public static <T, S> Observable generate(q qVar, igm.c cVar) {
        return generate(qVar, cVar, j.d);
    }

    public static <T> Observable merge(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap((o) j.f184025a, false, 3);
    }

    public static <T> Observable mergeDelayError(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        return fromArray(observableSource, observableSource2, observableSource3).flatMap((o) j.f184025a, true, 3);
    }

    public final <U, V> Observable delay(ObservableSource observableSource, o oVar) {
        return delaySubscription(observableSource).delay(oVar);
    }

    public final <R> Observable flatMap(o oVar, o oVar2, q qVar) {
        Objects.requireNonNull(oVar, "onNextMapper is null");
        Objects.requireNonNull(oVar2, "onErrorMapper is null");
        Objects.requireNonNull(qVar, "onCompleteSupplier is null");
        return merge(new sgm.v(this, oVar, oVar2, qVar));
    }

    public final <U, V> Observable timeout(ObservableSource observableSource, o oVar) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        Objects.requireNonNull(oVar, "itemTimeoutIndicator is null");
        return new sgm.v(this, observableSource, oVar, null, 2);
    }

    public static <T, S> Observable generate(q qVar, igm.c cVar, igm.g gVar) {
        Objects.requireNonNull(qVar, "initialState is null");
        Objects.requireNonNull(cVar, "generator is null");
        Objects.requireNonNull(gVar, "disposeState is null");
        return new r2(qVar, cVar, gVar);
    }

    public static <T1, T2, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, igm.c cVar, boolean z) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return zipArray(new z(cVar, 28), z, bufferSize(), observableSource, observableSource2);
    }

    public final void blockingSubscribe(igm.g gVar) {
        cj9.c.N(this, gVar, j.e, j.f184027c);
    }

    public final Observable buffer(long j2, long j3, TimeUnit timeUnit) {
        return buffer(j2, j3, timeUnit, e.f126319b, ygm.b.INSTANCE);
    }

    public final <R> Observable replay(o oVar, int i) {
        Objects.requireNonNull(oVar, "selector is null");
        j.a(i, "bufferSize");
        return new b(new c3(this, i, false), oVar, 5);
    }

    public final Observable skipLast(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j2, timeUnit, scheduler, false, bufferSize());
    }

    public static <T> Observable concat(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return concatArray(observableSource, observableSource2, observableSource3, observableSource4);
    }

    public final void blockingSubscribe(igm.g gVar, igm.g gVar2) {
        cj9.c.N(this, gVar, gVar2, j.f184027c);
    }

    public final Observable retry(p pVar) {
        return retry(Long.MAX_VALUE, pVar);
    }

    public final Observable skipLast(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return skipLast(j2, timeUnit, scheduler, z, bufferSize());
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        return fromArray(t2, t3, t5, t7, t16);
    }

    public final void blockingSubscribe(igm.g gVar, igm.g gVar2, a aVar) {
        cj9.c.N(this, gVar, gVar2, aVar);
    }

    public final <U> Observable sample(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return new h2(this, observableSource, false, 3);
    }

    public final Observable skipLast(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        j.a(i, "bufferSize");
        return new p5(i << 1, j2, this, scheduler, timeUnit, z);
    }

    public final <U, V> Observable timeout(ObservableSource observableSource, o oVar, ObservableSource observableSource2) {
        Objects.requireNonNull(observableSource, "firstTimeoutIndicator is null");
        Objects.requireNonNull(observableSource2, "fallback is null");
        Objects.requireNonNull(oVar, "itemTimeoutIndicator is null");
        return new sgm.v(this, observableSource, oVar, observableSource2, 2);
    }

    public final Observable window(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j2, j3, timeUnit, scheduler, bufferSize());
    }

    public static <T> Observable merge(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap((o) j.f184025a, false, 4);
    }

    public static <T> Observable mergeDelayError(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        return fromArray(observableSource, observableSource2, observableSource3, observableSource4).flatMap((o) j.f184025a, true, 4);
    }

    public final void blockingSubscribe(fgm.l lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        cj9.c.M(this, lVar);
    }

    public final Observable buffer(long j2, TimeUnit timeUnit) {
        return buffer(j2, timeUnit, e.f126319b, Integer.MAX_VALUE);
    }

    public final <R> Observable flatMap(o oVar, o oVar2, q qVar, int i) {
        Objects.requireNonNull(oVar, "onNextMapper is null");
        Objects.requireNonNull(oVar2, "onErrorMapper is null");
        Objects.requireNonNull(qVar, "onCompleteSupplier is null");
        return merge(new sgm.v(this, oVar, oVar2, qVar), i);
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(fgm.l lVar) {
        Objects.requireNonNull(lVar, "observer is null");
        try {
            subscribeActual(lVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m.F(th10);
            jb3.l.v(th10);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public final Observable window(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, int i) {
        j.b(j2, "timespan");
        j.b(j3, "timeskip");
        j.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        return new d7(this, j2, j3, timeUnit, scheduler, Long.MAX_VALUE, i, false);
    }

    public final <T1, T2, T3, T4, R> Observable withLatestFrom(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, igm.j jVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(jVar, "combiner is null");
        return withLatestFrom(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, new he2.b(21));
    }

    public final <R> Observable replay(o oVar, int i, boolean z) {
        Objects.requireNonNull(oVar, "selector is null");
        j.a(i, "bufferSize");
        return new b(new c3(this, i, z), oVar, 5);
    }

    public final <U> Observable sample(ObservableSource observableSource, boolean z) {
        Objects.requireNonNull(observableSource, "sampler is null");
        return new h2(this, observableSource, z, 3);
    }

    public final Observable startWith(ObservableSource observableSource) {
        Objects.requireNonNull(observableSource, "other is null");
        return concatArray(observableSource, this);
    }

    public static <T1, T2, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, igm.c cVar, boolean z, int i) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(cVar, "zipper is null");
        return zipArray(new z(cVar, 28), z, i, observableSource, observableSource2);
    }

    public final Observable buffer(long j2, TimeUnit timeUnit, int i) {
        return buffer(j2, timeUnit, e.f126319b, i);
    }

    public final Observable takeLast(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j2, j3, timeUnit, scheduler, false, bufferSize());
    }

    public final <V> Observable timeout(o oVar) {
        Objects.requireNonNull(oVar, "itemTimeoutIndicator is null");
        ObservableSource observableSource = null;
        return new sgm.v(this, observableSource, oVar, observableSource, 2);
    }

    public static <T1, T2, T3, T4, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, igm.i iVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(iVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4}, new f4h.a(iVar, 27), bufferSize());
    }

    public final Observable buffer(int i) {
        return buffer(i, i);
    }

    public final <R> Observable flatMap(o oVar, int i) {
        return flatMap(oVar, false, i, bufferSize());
    }

    public final Observable takeLast(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        j.a(i, "bufferSize");
        if (j2 >= 0) {
            return new a6(this, j2, j3, timeUnit, scheduler, i, z);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 required but it was "));
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16, T t19) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        Objects.requireNonNull(t19, "item6 is null");
        return fromArray(t2, t3, t5, t7, t16, t19);
    }

    public final <U extends Collection<Object>> Observable buffer(int i, int i2, q qVar) {
        j.a(i, "count");
        j.a(i2, "skip");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        return new r(this, i, i2, qVar);
    }

    public final <U, R> Observable flatMap(o oVar, igm.c cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <R> Observable replay(o oVar, int i, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(oVar, "selector is null");
        j.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new b(new d3(i, j2, this, scheduler, timeUnit, false), oVar, 5);
    }

    public final <U, R> Observable flatMap(o oVar, igm.c cVar, boolean z) {
        return flatMap(oVar, cVar, z, bufferSize(), bufferSize());
    }

    public final Observable window(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j2, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    public static <T1, T2, T3, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, igm.h hVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(hVar, "zipper is null");
        return zipArray(new dcl.q(), false, bufferSize(), observableSource, observableSource2, observableSource3);
    }

    public final <U, R> Observable flatMap(o oVar, igm.c cVar, boolean z, int i) {
        return flatMap(oVar, cVar, z, i, bufferSize());
    }

    public final Observable window(long j2, TimeUnit timeUnit, Scheduler scheduler, long j3) {
        return window(j2, timeUnit, scheduler, j3, false);
    }

    public final <U, R> Observable flatMap(o oVar, igm.c cVar, boolean z, int i, int i2) {
        Objects.requireNonNull(oVar, "mapper is null");
        Objects.requireNonNull(cVar, "combiner is null");
        return flatMap(new e3(cVar, oVar, 0), z, i, i2);
    }

    public final Observable window(long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, boolean z) {
        return window(j2, timeUnit, scheduler, j3, z, bufferSize());
    }

    public final <R> Observable withLatestFrom(ObservableSource[] observableSourceArr, o oVar) {
        Objects.requireNonNull(observableSourceArr, "others is null");
        Objects.requireNonNull(oVar, "combiner is null");
        return new sgm.v(this, observableSourceArr, oVar);
    }

    public final <U extends Collection<Object>> Observable buffer(int i, q qVar) {
        return buffer(i, i, qVar);
    }

    public final Observable window(long j2, TimeUnit timeUnit, Scheduler scheduler, long j3, boolean z, int i) {
        j.a(i, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        j.b(j3, "count");
        return new d7(this, j2, j2, timeUnit, scheduler, j3, i, z);
    }

    public final <U extends Collection<Object>> Observable buffer(long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, q qVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        return new sgm.d0(this, j2, j3, timeUnit, scheduler, qVar, Integer.MAX_VALUE, false);
    }

    public final <R> Observable replay(o oVar, int i, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(oVar, "selector is null");
        j.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new b(new d3(i, j2, this, scheduler, timeUnit, z), oVar, 5);
    }

    public final <R> Observable withLatestFrom(Iterable<? extends ObservableSource> iterable, o oVar) {
        Objects.requireNonNull(iterable, "others is null");
        Objects.requireNonNull(oVar, "combiner is null");
        return new sgm.v(this, iterable, oVar);
    }

    public static <T1, T2, T3, T4, T5, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, igm.j jVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(jVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5}, new he2.b(21), bufferSize());
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16, T t19, T t23) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        Objects.requireNonNull(t19, "item6 is null");
        Objects.requireNonNull(t23, "item7 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23);
    }

    public final <U, R> Observable flatMap(o oVar, igm.c cVar, int i) {
        return flatMap(oVar, cVar, false, i, bufferSize());
    }

    public static <T1, T2, T3, T4, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, igm.i iVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(iVar, "zipper is null");
        return zipArray(new f4h.a(iVar, 27), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4);
    }

    public final <U extends Collection<Object>> Observable buffer(long j2, TimeUnit timeUnit, Scheduler scheduler, int i, q qVar, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        j.a(i, "count");
        return new sgm.d0(this, j2, j2, timeUnit, scheduler, qVar, i, z);
    }

    public final <B> Observable window(ObservableSource observableSource) {
        return window(observableSource, bufferSize());
    }

    public final Observable takeLast(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j2, timeUnit, scheduler, false, bufferSize());
    }

    public final <B> Observable window(ObservableSource observableSource, int i) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        j.a(i, "bufferSize");
        return new t6(this, observableSource, i);
    }

    public final Observable takeLast(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        return takeLast(j2, timeUnit, scheduler, z, bufferSize());
    }

    public final <R> Observable replay(o oVar, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(oVar, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new b(new g3(this, j2, timeUnit, scheduler, false), oVar, 5);
    }

    public final Observable takeLast(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j2, timeUnit, scheduler, z, i);
    }

    public final <U, V> Observable window(ObservableSource observableSource, o oVar) {
        return window(observableSource, oVar, bufferSize());
    }

    public final <TOpening, TClosing, U extends Collection<Object>> Observable buffer(ObservableSource observableSource, o oVar, q qVar) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(oVar, "closingIndicator is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        return new sgm.v(this, observableSource, oVar, qVar, 0);
    }

    public final <U, V> Observable window(ObservableSource observableSource, o oVar, int i) {
        Objects.requireNonNull(observableSource, "openingIndicator is null");
        Objects.requireNonNull(oVar, "closingIndicator is null");
        j.a(i, "bufferSize");
        return new p0(this, observableSource, oVar, i);
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        Objects.requireNonNull(t19, "item6 is null");
        Objects.requireNonNull(t23, "item7 is null");
        Objects.requireNonNull(t32, "item8 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32);
    }

    public static <T1, T2, T3, T4, T5, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, igm.j jVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(jVar, "zipper is null");
        return zipArray(new he2.b(21), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, igm.k kVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(kVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6}, new p96.a(21), bufferSize());
    }

    public final <R> Observable replay(o oVar, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(oVar, "selector is null");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new b(new g3(this, j2, timeUnit, scheduler, z), oVar, 5);
    }

    public final <B> Observable buffer(ObservableSource observableSource, int i) {
        j.a(i, "initialCapacity");
        return buffer(observableSource, new kgm.a(i));
    }

    public final <B, U extends Collection<Object>> Observable buffer(ObservableSource observableSource, q qVar) {
        Objects.requireNonNull(observableSource, "boundaryIndicator is null");
        Objects.requireNonNull(qVar, "bufferSupplier is null");
        return new y(this, observableSource, qVar, 0);
    }

    public final zgm.a replay(int i) {
        j.a(i, "bufferSize");
        if (i == Integer.MAX_VALUE) {
            return w4.e(this, w4.e);
        }
        return w4.e(this, new p4(i, false));
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32, T t35) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        Objects.requireNonNull(t19, "item6 is null");
        Objects.requireNonNull(t23, "item7 is null");
        Objects.requireNonNull(t32, "item8 is null");
        Objects.requireNonNull(t35, "item9 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32, t35);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, igm.k kVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(kVar, "zipper is null");
        return zipArray(new p96.a(21), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    public final zgm.a replay(int i, boolean z) {
        j.a(i, "bufferSize");
        if (i == Integer.MAX_VALUE) {
            return w4.e(this, w4.e);
        }
        return w4.e(this, new p4(i, z));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, igm.l lVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(lVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7}, new qy5.a(21), bufferSize());
    }

    public final zgm.a replay(int i, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        j.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return w4.e(this, new s4(i, j2, timeUnit, scheduler, false));
    }

    public final zgm.a replay(int i, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        j.a(i, "bufferSize");
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return w4.e(this, new s4(i, j2, timeUnit, scheduler, z));
    }

    public static <T> Observable just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32, T t35, T t39) {
        Objects.requireNonNull(t2, "item1 is null");
        Objects.requireNonNull(t3, "item2 is null");
        Objects.requireNonNull(t5, "item3 is null");
        Objects.requireNonNull(t7, "item4 is null");
        Objects.requireNonNull(t16, "item5 is null");
        Objects.requireNonNull(t19, "item6 is null");
        Objects.requireNonNull(t23, "item7 is null");
        Objects.requireNonNull(t32, "item8 is null");
        Objects.requireNonNull(t35, "item9 is null");
        Objects.requireNonNull(t39, "item10 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32, t35, t39);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, igm.l lVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(lVar, "zipper is null");
        return zipArray(new qy5.a(21), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7);
    }

    public final zgm.a replay(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return w4.e(this, new s4(Integer.MAX_VALUE, j2, timeUnit, scheduler, false));
    }

    public final zgm.a replay(long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return w4.e(this, new s4(Integer.MAX_VALUE, j2, timeUnit, scheduler, z));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, igm.m mVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(mVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8}, new r39.a(), bufferSize());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, igm.m mVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(mVar, "zipper is null");
        return zipArray(new r39.a(), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable combineLatest(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, ObservableSource observableSource9, igm.n nVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(nVar, "combiner is null");
        return combineLatestArray(new ObservableSource[]{observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9}, new by5.a(22), bufferSize());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Observable zip(ObservableSource observableSource, ObservableSource observableSource2, ObservableSource observableSource3, ObservableSource observableSource4, ObservableSource observableSource5, ObservableSource observableSource6, ObservableSource observableSource7, ObservableSource observableSource8, ObservableSource observableSource9, igm.n nVar) {
        Objects.requireNonNull(observableSource, "source1 is null");
        Objects.requireNonNull(observableSource2, "source2 is null");
        Objects.requireNonNull(observableSource3, "source3 is null");
        Objects.requireNonNull(observableSource4, "source4 is null");
        Objects.requireNonNull(observableSource5, "source5 is null");
        Objects.requireNonNull(observableSource6, "source6 is null");
        Objects.requireNonNull(observableSource7, "source7 is null");
        Objects.requireNonNull(observableSource8, "source8 is null");
        Objects.requireNonNull(observableSource9, "source9 is null");
        Objects.requireNonNull(nVar, "zipper is null");
        return zipArray(new by5.a(22), false, bufferSize(), observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6, observableSource7, observableSource8, observableSource9);
    }
}
