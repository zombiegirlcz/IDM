package efm;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import qfm.b1;
import qfm.j0;
import qfm.p1;
import tfm.a6;
import tfm.b2;
import tfm.b4;
import tfm.b7;
import tfm.b8;
import tfm.c1;
import tfm.c2;
import tfm.c3;
import tfm.c4;
import tfm.c7;
import tfm.d5;
import tfm.d6;
import tfm.e2;
import tfm.e3;
import tfm.f1;
import tfm.f3;
import tfm.f6;
import tfm.f7;
import tfm.g5;
import tfm.h2;
import tfm.i4;
import tfm.i7;
import tfm.j1;
import tfm.j2;
import tfm.j4;
import tfm.j6;
import tfm.k0;
import tfm.k4;
import tfm.k7;
import tfm.l2;
import tfm.l3;
import tfm.m5;
import tfm.n2;
import tfm.n3;
import tfm.n6;
import tfm.o3;
import tfm.o7;
import tfm.p0;
import tfm.p3;
import tfm.p4;
import tfm.q1;
import tfm.q2;
import tfm.q3;
import tfm.q6;
import tfm.r0;
import tfm.r2;
import tfm.s6;
import tfm.t0;
import tfm.t1;
import tfm.u0;
import tfm.u3;
import tfm.u5;
import tfm.v0;
import tfm.v1;
import tfm.v2;
import tfm.v7;
import tfm.w3;
import tfm.w5;
import tfm.x0;
import tfm.x2;
import tfm.x4;
import tfm.y0;
import tfm.y5;
import tfm.z1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class r<T> implements w {
    public static <T> r<T> amb(Iterable<? extends w> iterable) {
        mfm.f.b(iterable, "sources is null");
        return new tfm.l(null, iterable, 0);
    }

    public static <T> r<T> ambArray(w... wVarArr) {
        mfm.f.b(wVarArr, "sources is null");
        int length = wVarArr.length;
        return length == 0 ? empty() : length == 1 ? wrap(wVarArr[0]) : new tfm.l(wVarArr, null, 0);
    }

    public static int bufferSize() {
        return i.f125385a;
    }

    public static <T, R> r<R> combineLatest(kfm.o oVar, int i, w... wVarArr) {
        return combineLatest(wVarArr, oVar, i);
    }

    public static <T, R> r<R> combineLatestDelayError(w[] wVarArr, kfm.o oVar) {
        return combineLatestDelayError(wVarArr, oVar, bufferSize());
    }

    public static <T> r<T> concat(Iterable<? extends w> iterable) {
        mfm.f.b(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(mfm.f.f205041a, bufferSize(), false);
    }

    public static <T> r<T> concatArray(w... wVarArr) {
        return wVarArr.length == 0 ? empty() : wVarArr.length == 1 ? wrap(wVarArr[0]) : new p0(fromArray(wVarArr), mfm.f.f205041a, bufferSize(), zfm.f.BOUNDARY);
    }

    public static <T> r<T> concatArrayDelayError(w... wVarArr) {
        return wVarArr.length == 0 ? empty() : wVarArr.length == 1 ? wrap(wVarArr[0]) : concatDelayError(fromArray(wVarArr));
    }

    public static <T> r<T> concatArrayEager(w... wVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), wVarArr);
    }

    public static <T> r<T> concatArrayEagerDelayError(w... wVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), wVarArr);
    }

    public static <T> r<T> concatDelayError(Iterable<? extends w> iterable) {
        mfm.f.b(iterable, "sources is null");
        return concatDelayError(fromIterable(iterable));
    }

    public static <T> r<T> concatEager(w wVar) {
        return concatEager(wVar, bufferSize(), bufferSize());
    }

    public static <T> r<T> create(u uVar) {
        mfm.f.b(uVar, "source is null");
        return new j01.b(uVar, 3);
    }

    public static <T> r<T> defer(Callable<? extends w> callable) {
        mfm.f.b(callable, "supplier is null");
        return new j01.b(callable, 4);
    }

    public static <T> r<T> empty() {
        return c2.f270383g;
    }

    public static <T> r<T> error(Callable<? extends Throwable> callable) {
        mfm.f.b(callable, "errorSupplier is null");
        return new fk.b(callable, 1);
    }

    public static <T> r<T> fromArray(T... tArr) {
        mfm.f.b(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : new j01.b(tArr, 5);
    }

    public static <T> r<T> fromCallable(Callable<? extends T> callable) {
        mfm.f.b(callable, "supplier is null");
        return new q2(callable);
    }

    public static <T> r<T> fromFuture(Future<? extends T> future) {
        mfm.f.b(future, "future is null");
        return new r2(future, 0L, null);
    }

    public static <T> r<T> fromIterable(Iterable<? extends T> iterable) {
        mfm.f.b(iterable, "source is null");
        return new j01.b(iterable, 6);
    }

    public static <T> r<T> fromPublisher(Publisher publisher) {
        mfm.f.b(publisher, "publisher is null");
        return new j01.b(publisher, 7);
    }

    public static <T> r<T> generate(kfm.g gVar) {
        mfm.f.b(gVar, "generator is null");
        return generate(mfm.f.i, cj9.c.L(gVar), mfm.f.d);
    }

    public static r<Long> interval(long j2, long j3, TimeUnit timeUnit) {
        return interval(j2, j3, timeUnit, hhm.f.f152430b);
    }

    public static r<Long> intervalRange(long j2, long j3, long j5, long j16, TimeUnit timeUnit) {
        return intervalRange(j2, j3, j5, j16, timeUnit, hhm.f.f152430b);
    }

    public static <T> r<T> just(T t2) {
        mfm.f.b(t2, "item is null");
        return new o3(t2);
    }

    public static <T> r<T> merge(Iterable<? extends w> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap((kfm.o) mfm.f.f205041a, false, i, i2);
    }

    public static <T> r<T> mergeArray(int i, int i2, w... wVarArr) {
        return fromArray(wVarArr).flatMap((kfm.o) mfm.f.f205041a, false, i, i2);
    }

    public static <T> r<T> mergeArrayDelayError(int i, int i2, w... wVarArr) {
        return fromArray(wVarArr).flatMap((kfm.o) mfm.f.f205041a, true, i, i2);
    }

    public static <T> r<T> mergeDelayError(Iterable<? extends w> iterable) {
        return fromIterable(iterable).flatMap((kfm.o) mfm.f.f205041a, true);
    }

    public static <T> r<T> never() {
        return u3.f270863g;
    }

    public static r<Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a0.d.n("count >= 0 required but it was ", i2));
        }
        if (i2 == 0) {
            return empty();
        }
        if (i2 == 1) {
            return just(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return new i4(i, i2);
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    public static r<Long> rangeLong(long j2, long j3) {
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
            return new j4(j2, j3);
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    public static <T> d0<Boolean> sequenceEqual(w wVar, w wVar2) {
        return sequenceEqual(wVar, wVar2, mfm.f.k, bufferSize());
    }

    public static <T> r<T> switchOnNext(w wVar, int i) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "bufferSize");
        return new j6(wVar, mfm.f.f205041a, i, false);
    }

    public static <T> r<T> switchOnNextDelayError(w wVar) {
        return switchOnNextDelayError(wVar, bufferSize());
    }

    public static r<Long> timer(long j2, TimeUnit timeUnit) {
        return timer(j2, timeUnit, hhm.f.f152430b);
    }

    public static <T> r<T> unsafeCreate(w wVar) {
        mfm.f.b(wVar, "onSubscribe is null");
        if (wVar instanceof r) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return new fk.b(wVar, 2);
    }

    public static <T, D> r<T> using(Callable<? extends D> callable, kfm.o oVar, kfm.g gVar) {
        return using(callable, oVar, gVar, true);
    }

    public static <T> r<T> wrap(w wVar) {
        mfm.f.b(wVar, "source is null");
        return wVar instanceof r ? (r) wVar : new fk.b(wVar, 2);
    }

    public static <T, R> r<R> zip(Iterable<? extends w> iterable, kfm.o oVar) {
        mfm.f.b(oVar, "zipper is null");
        mfm.f.b(iterable, "sources is null");
        return new b8(null, iterable, oVar, bufferSize(), false);
    }

    public static <T, R> r<R> zipArray(kfm.o oVar, boolean z, int i, w... wVarArr) {
        if (wVarArr.length == 0) {
            return empty();
        }
        mfm.f.b(oVar, "zipper is null");
        mfm.f.e(i, "bufferSize");
        return new b8(wVarArr, null, oVar, i, z);
    }

    public static <T, R> r<R> zipIterable(Iterable<? extends w> iterable, kfm.o oVar, boolean z, int i) {
        mfm.f.b(oVar, "zipper is null");
        mfm.f.b(iterable, "sources is null");
        mfm.f.e(i, "bufferSize");
        return new b8(null, iterable, oVar, i, z);
    }

    public final d0<Boolean> all(kfm.p pVar) {
        mfm.f.b(pVar, "predicate is null");
        return new tfm.j(this, pVar, 0);
    }

    public final r<T> ambWith(w wVar) {
        mfm.f.b(wVar, "other is null");
        return ambArray(this, wVar);
    }

    public final d0<Boolean> any(kfm.p pVar) {
        mfm.f.b(pVar, "predicate is null");
        return new tfm.j(this, pVar, 1);
    }

    public final <R> R as(s sVar) {
        mfm.f.b(sVar, "converter is null");
        com.revolut.data.database.models.openbanking.d.C(sVar);
        throw null;
    }

    public final v1 b(kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.a aVar2) {
        mfm.f.b(gVar, "onNext is null");
        mfm.f.b(gVar2, "onError is null");
        mfm.f.b(aVar, "onComplete is null");
        return new v1(this, gVar, gVar2, aVar, aVar2);
    }

    public final T blockingFirst() {
        ofm.e eVar = new ofm.e(0);
        subscribe(eVar);
        T t2 = (T) eVar.a();
        if (t2 != null) {
            return t2;
        }
        throw new NoSuchElementException();
    }

    public final void blockingForEach(kfm.g gVar) {
        Iterator<T> it8 = blockingIterable().iterator();
        while (it8.hasNext()) {
            try {
                gVar.accept(it8.next());
            } catch (Throwable th10) {
                m70.a.u(th10);
                ((ifm.c) it8).dispose();
                throw zfm.h.d(th10);
            }
        }
    }

    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    public final T blockingLast() {
        ofm.e eVar = new ofm.e(1);
        subscribe(eVar);
        T t2 = (T) eVar.a();
        if (t2 != null) {
            return t2;
        }
        throw new NoSuchElementException();
    }

    public final Iterable<T> blockingLatest() {
        return new tfm.d(this, 0);
    }

    public final Iterable<T> blockingMostRecent(T t2) {
        return new sgm.h(this, t2, 1);
    }

    public final Iterable<T> blockingNext() {
        return new tfm.d(this, 1);
    }

    public final T blockingSingle() {
        k<T> kVarSingleElement = singleElement();
        kVarSingleElement.getClass();
        ofm.f fVar = new ofm.f(1);
        kVarSingleElement.i(fVar);
        T t2 = (T) fVar.a();
        if (t2 != null) {
            return t2;
        }
        throw new NoSuchElementException();
    }

    public final void blockingSubscribe() {
        ce9.m.C(this);
    }

    public final r<List<T>> buffer(long j2, long j3, TimeUnit timeUnit) {
        return (r<List<T>>) buffer(j2, j3, timeUnit, hhm.f.f152430b, zfm.b.a());
    }

    public final b7 c(long j2, TimeUnit timeUnit, c0 c0Var, w wVar) {
        mfm.f.b(timeUnit, "timeUnit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new b7(this, j2, timeUnit, c0Var, wVar);
    }

    public final r<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    public final r<T> cacheWithInitialCapacity(int i) {
        mfm.f.e(i, "initialCapacity");
        return new tfm.f0(this, i);
    }

    public final <U> r<U> cast(Class<U> cls) {
        mfm.f.b(cls, "clazz is null");
        return (r<U>) map(new a31.a(cls, 17));
    }

    public final <U> d0<U> collect(Callable<? extends U> callable, kfm.b bVar) {
        mfm.f.b(callable, "initialValueSupplier is null");
        mfm.f.b(bVar, "collector is null");
        return new tfm.h0(this, callable, bVar);
    }

    public final <U> d0<U> collectInto(U u, kfm.b bVar) {
        mfm.f.b(u, "initialValue is null");
        return collect(new mfm.d(u), bVar);
    }

    public final <R> r<R> compose(x xVar) {
        mfm.f.b(xVar, "composer is null");
        return wrap(xVar.apply(this));
    }

    public final <R> r<R> concatMap(kfm.o oVar) {
        return concatMap(oVar, 2);
    }

    public final b concatMapCompletable(kfm.o oVar) {
        return concatMapCompletable(oVar, 2);
    }

    public final b concatMapCompletableDelayError(kfm.o oVar) {
        return concatMapCompletableDelayError(oVar, true, 2);
    }

    public final <R> r<R> concatMapDelayError(kfm.o oVar) {
        return concatMapDelayError(oVar, bufferSize(), true);
    }

    public final <R> r<R> concatMapEager(kfm.o oVar) {
        return concatMapEager(oVar, Integer.MAX_VALUE, bufferSize());
    }

    public final <R> r<R> concatMapEagerDelayError(kfm.o oVar, boolean z) {
        return concatMapEagerDelayError(oVar, Integer.MAX_VALUE, bufferSize(), z);
    }

    public final <U> r<U> concatMapIterable(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new c1(this, oVar, 2);
    }

    public final <R> r<R> concatMapMaybe(kfm.o oVar) {
        return concatMapMaybe(oVar, 2);
    }

    public final <R> r<R> concatMapMaybeDelayError(kfm.o oVar) {
        return concatMapMaybeDelayError(oVar, true, 2);
    }

    public final <R> r<R> concatMapSingle(kfm.o oVar) {
        return concatMapSingle(oVar, 2);
    }

    public final <R> r<R> concatMapSingleDelayError(kfm.o oVar) {
        return concatMapSingleDelayError(oVar, true, 2);
    }

    public final r<T> concatWith(w wVar) {
        mfm.f.b(wVar, "other is null");
        return concat(this, wVar);
    }

    public final d0<Boolean> contains(Object obj2) {
        mfm.f.b(obj2, "element is null");
        return any(new com.bumptech.glide.load.data.i(obj2));
    }

    public final d0<Long> count() {
        return new y0(this);
    }

    public final r<T> debounce(long j2, TimeUnit timeUnit) {
        return debounce(j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> defaultIfEmpty(T t2) {
        mfm.f.b(t2, "defaultItem is null");
        return switchIfEmpty(just(t2));
    }

    public final r<T> delay(long j2, TimeUnit timeUnit) {
        return delay(j2, timeUnit, hhm.f.f152430b, false);
    }

    public final r<T> delaySubscription(long j2, TimeUnit timeUnit) {
        return delaySubscription(j2, timeUnit, hhm.f.f152430b);
    }

    @Deprecated
    public final <T2> r<T2> dematerialize() {
        return new c1(this, mfm.f.f205041a, 1);
    }

    public final <K> r<T> distinct(kfm.o oVar) {
        return distinct(oVar, mfm.c.INSTANCE);
    }

    public final r<T> distinctUntilChanged() {
        return distinctUntilChanged(mfm.f.f205041a);
    }

    public final r<T> doAfterNext(kfm.g gVar) {
        mfm.f.b(gVar, "onAfterNext is null");
        return new t0(this, gVar, 1);
    }

    public final r<T> doAfterTerminate(kfm.a aVar) {
        mfm.f.b(aVar, "onFinally is null");
        dfm.c cVar = mfm.f.d;
        return b(cVar, cVar, mfm.f.f205043c, aVar);
    }

    public final r<T> doFinally(kfm.a aVar) {
        mfm.f.b(aVar, "onFinally is null");
        return new t1(this, aVar, 0);
    }

    public final r<T> doOnComplete(kfm.a aVar) {
        dfm.c cVar = mfm.f.d;
        return b(cVar, cVar, aVar, mfm.f.f205043c);
    }

    public final r<T> doOnDispose(kfm.a aVar) {
        return doOnLifecycle(mfm.f.d, aVar);
    }

    public final r<T> doOnEach(kfm.g gVar) {
        mfm.f.b(gVar, "onNotification is null");
        return b(new yf.c(gVar, 18), new mp.r(gVar, 23), new c86.f(gVar), mfm.f.f205043c);
    }

    public final r<T> doOnError(kfm.g gVar) {
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        return b(cVar, gVar, aVar, aVar);
    }

    public final r<T> doOnLifecycle(kfm.g gVar, kfm.a aVar) {
        mfm.f.b(gVar, "onSubscribe is null");
        mfm.f.b(aVar, "onDispose is null");
        return new q1(this, gVar, aVar, 1);
    }

    public final r<T> doOnNext(kfm.g gVar) {
        dfm.c cVar = mfm.f.d;
        en.a aVar = mfm.f.f205043c;
        return b(gVar, cVar, aVar, aVar);
    }

    public final r<T> doOnSubscribe(kfm.g gVar) {
        return doOnLifecycle(gVar, mfm.f.f205043c);
    }

    public final r<T> doOnTerminate(kfm.a aVar) {
        mfm.f.b(aVar, "onTerminate is null");
        return b(mfm.f.d, new kl.c0(aVar, 15), aVar, mfm.f.f205043c);
    }

    public final k<T> elementAt(long j2) {
        if (j2 >= 0) {
            return new z1(this, j2);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final d0<T> elementAtOrError(long j2) {
        if (j2 >= 0) {
            return new b2(this, j2, null);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final r<T> filter(kfm.p pVar) {
        mfm.f.b(pVar, "predicate is null");
        return new e2(this, pVar, 0);
    }

    public final d0<T> first(T t2) {
        return elementAt(0L, t2);
    }

    public final k<T> firstElement() {
        return elementAt(0L);
    }

    public final d0<T> firstOrError() {
        return elementAtOrError(0L);
    }

    public final <R> r<R> flatMap(kfm.o oVar) {
        return flatMap(oVar, false);
    }

    public final b flatMapCompletable(kfm.o oVar) {
        return flatMapCompletable(oVar, false);
    }

    public final <U> r<U> flatMapIterable(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new c1(this, oVar, 2);
    }

    public final <R> r<R> flatMapMaybe(kfm.o oVar) {
        return flatMapMaybe(oVar, false);
    }

    public final <R> r<R> flatMapSingle(kfm.o oVar) {
        return flatMapSingle(oVar, false);
    }

    public final ifm.c forEach(kfm.g gVar) {
        return subscribe(gVar);
    }

    public final ifm.c forEachWhile(kfm.p pVar) {
        return forEachWhile(pVar, mfm.f.e, mfm.f.f205043c);
    }

    public final <K> r<v2> groupBy(kfm.o oVar) {
        return groupBy(oVar, mfm.f.f205041a, false, bufferSize());
    }

    public final <TRight, TLeftEnd, TRightEnd, R> r<R> groupJoin(w wVar, kfm.o oVar, kfm.o oVar2, kfm.c cVar) {
        mfm.f.b(wVar, "other is null");
        mfm.f.b(oVar, "leftEnd is null");
        mfm.f.b(oVar2, "rightEnd is null");
        mfm.f.b(cVar, "resultSelector is null");
        return new c3(this, wVar, oVar, oVar2, cVar, 0);
    }

    public final r<T> hide() {
        return new e3(this);
    }

    public final b ignoreElements() {
        return new f3(this);
    }

    public final d0<Boolean> isEmpty() {
        return all(mfm.f.f205045h);
    }

    public final <TRight, TLeftEnd, TRightEnd, R> r<R> join(w wVar, kfm.o oVar, kfm.o oVar2, kfm.c cVar) {
        mfm.f.b(wVar, "other is null");
        mfm.f.b(oVar, "leftEnd is null");
        mfm.f.b(oVar2, "rightEnd is null");
        mfm.f.b(cVar, "resultSelector is null");
        return new c3(this, wVar, oVar, oVar2, cVar, 1);
    }

    public final d0<T> last(T t2) {
        mfm.f.b(t2, "defaultItem is null");
        return new rfm.l(this, t2, 2);
    }

    public final k<T> lastElement() {
        return new p3(this, 0);
    }

    public final d0<T> lastOrError() {
        return new rfm.l(this, null, 2);
    }

    public final <R> r<R> lift(v vVar) {
        mfm.f.b(vVar, "lifter is null");
        return new t1(this, vVar, 1);
    }

    public final <R> r<R> map(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new q3(this, oVar, 0);
    }

    public final r<p> materialize() {
        return new x0(this, 3);
    }

    public final r<T> mergeWith(w wVar) {
        mfm.f.b(wVar, "other is null");
        return merge(this, wVar);
    }

    public final r<T> observeOn(c0 c0Var) {
        return observeOn(c0Var, false, bufferSize());
    }

    public final <U> r<U> ofType(Class<U> cls) {
        mfm.f.b(cls, "clazz is null");
        return filter(new ce.e(cls)).cast(cls);
    }

    public final r<T> onErrorResumeNext(kfm.o oVar) {
        mfm.f.b(oVar, "resumeFunction is null");
        return new n2(this, oVar, false, 2);
    }

    public final r<T> onErrorReturn(kfm.o oVar) {
        mfm.f.b(oVar, "valueSupplier is null");
        return new q3(this, oVar, 1);
    }

    public final r<T> onErrorReturnItem(T t2) {
        mfm.f.b(t2, "item is null");
        return onErrorReturn(new mfm.d(t2));
    }

    public final r<T> onExceptionResumeNext(w wVar) {
        mfm.f.b(wVar, "next is null");
        return new n2(this, new mfm.d(wVar), true, 2);
    }

    public final r<T> onTerminateDetach() {
        return new x0(this, 1);
    }

    public final agm.a publish() {
        AtomicReference atomicReference = new AtomicReference();
        return new c4(new b4(atomicReference), this, atomicReference);
    }

    public final k<T> reduce(kfm.c cVar) {
        mfm.f.b(cVar, "reducer is null");
        return new rfm.e(this, cVar, 2);
    }

    public final <R> d0<R> reduceWith(Callable<R> callable, kfm.c cVar) {
        mfm.f.b(callable, "seedSupplier is null");
        mfm.f.b(cVar, "reducer is null");
        return new k4(this, callable, cVar, 1);
    }

    public final r<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    public final r<T> repeatUntil(kfm.e eVar) {
        mfm.f.b(eVar, "stop is null");
        return new x0(this, 4);
    }

    public final r<T> repeatWhen(kfm.o oVar) {
        mfm.f.b(oVar, "handler is null");
        return new c1(this, oVar, 4);
    }

    public final agm.a replay() {
        return d5.f(this, d5.k);
    }

    public final r<T> retry() {
        return retry(Long.MAX_VALUE, mfm.f.f205044g);
    }

    public final r<T> retryUntil(kfm.e eVar) {
        mfm.f.b(eVar, "stop is null");
        return retry(Long.MAX_VALUE, new r39.a());
    }

    public final r<T> retryWhen(kfm.o oVar) {
        mfm.f.b(oVar, "handler is null");
        return new q3(this, oVar, 2);
    }

    public final void safeSubscribe(y yVar) {
        mfm.f.b(yVar, "observer is null");
        if (yVar instanceof bgm.c) {
            subscribe(yVar);
        } else {
            subscribe(new bgm.c(yVar));
        }
    }

    public final r<T> sample(long j2, TimeUnit timeUnit) {
        return sample(j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> scan(kfm.c cVar) {
        mfm.f.b(cVar, "accumulator is null");
        return new t0(this, cVar, 3);
    }

    public final <R> r<R> scanWith(Callable<R> callable, kfm.c cVar) {
        mfm.f.b(callable, "seedSupplier is null");
        mfm.f.b(cVar, "accumulator is null");
        return new q1(this, callable, cVar);
    }

    public final r<T> serialize() {
        return new x0(this, 5);
    }

    public final r<T> share() {
        return publish().e();
    }

    public final d0<T> single(T t2) {
        mfm.f.b(t2, "defaultItem is null");
        return new rfm.f0(this, t2, 1);
    }

    public final k<T> singleElement() {
        return new p3(this, 1);
    }

    public final d0<T> singleOrError() {
        return new rfm.f0(this, null, 1);
    }

    public final r<T> skip(long j2) {
        return j2 <= 0 ? this : new w5(this, j2, 0);
    }

    public final r<T> skipLast(long j2, TimeUnit timeUnit) {
        return skipLast(j2, timeUnit, hhm.f.d, false, bufferSize());
    }

    public final <U> r<T> skipUntil(w wVar) {
        mfm.f.b(wVar, "other is null");
        return new d6(this, wVar, 0);
    }

    public final r<T> skipWhile(kfm.p pVar) {
        mfm.f.b(pVar, "predicate is null");
        return new e2(this, pVar, 1);
    }

    public final r<T> sorted() {
        return toList().x().map(new kpj.f(mfm.e.INSTANCE, 13)).flatMapIterable(mfm.f.f205041a);
    }

    public final r<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    public final r<T> startWithArray(T... tArr) {
        r rVarFromArray = fromArray(tArr);
        return rVarFromArray == empty() ? this : concatArray(rVarFromArray, this);
    }

    public final ifm.c subscribe() {
        dfm.c cVar = mfm.f.d;
        return subscribe(cVar, mfm.f.e, mfm.f.f205043c, cVar);
    }

    public abstract void subscribeActual(y yVar);

    public final r<T> subscribeOn(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new f6(this, c0Var, 0);
    }

    public final <E extends y> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    public final r<T> switchIfEmpty(w wVar) {
        mfm.f.b(wVar, "other is null");
        return new t1(this, wVar, 3);
    }

    public final <R> r<R> switchMap(kfm.o oVar) {
        return switchMap(oVar, bufferSize());
    }

    public final b switchMapCompletable(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.m(this, oVar, false);
    }

    public final b switchMapCompletableDelayError(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.m(this, oVar, true);
    }

    public final <R> r<R> switchMapDelayError(kfm.o oVar) {
        return switchMapDelayError(oVar, bufferSize());
    }

    public final <R> r<R> switchMapMaybe(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.p(this, oVar, false);
    }

    public final <R> r<R> switchMapMaybeDelayError(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.p(this, oVar, true);
    }

    public final <R> r<R> switchMapSingle(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.s(this, oVar, false);
    }

    public final <R> r<R> switchMapSingleDelayError(kfm.o oVar) {
        mfm.f.b(oVar, "mapper is null");
        return new sfm.s(this, oVar, true);
    }

    public final r<T> take(long j2) {
        if (j2 >= 0) {
            return new w5(this, j2, 1);
        }
        throw new IllegalArgumentException(p.a.m(j2, "count >= 0 required but it was "));
    }

    public final r<T> takeLast(long j2, long j3, TimeUnit timeUnit) {
        return takeLast(j2, j3, timeUnit, hhm.f.d, false, bufferSize());
    }

    public final <U> r<T> takeUntil(w wVar) {
        mfm.f.b(wVar, "other is null");
        return new d6(this, wVar, 1);
    }

    public final r<T> takeWhile(kfm.p pVar) {
        mfm.f.b(pVar, "predicate is null");
        return new tfm.h(this, pVar, 2);
    }

    public final bgm.f test() {
        bgm.f fVar = new bgm.f();
        subscribe(fVar);
        return fVar;
    }

    public final r<T> throttleFirst(long j2, TimeUnit timeUnit) {
        return throttleFirst(j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> throttleLast(long j2, TimeUnit timeUnit) {
        return sample(j2, timeUnit);
    }

    public final r<T> throttleLatest(long j2, TimeUnit timeUnit) {
        return throttleLatest(j2, timeUnit, hhm.f.f152430b, false);
    }

    public final r<T> throttleWithTimeout(long j2, TimeUnit timeUnit) {
        return debounce(j2, timeUnit);
    }

    public final r<hhm.g> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, hhm.f.f152430b);
    }

    public final r<T> timeout(long j2, TimeUnit timeUnit) {
        return c(j2, timeUnit, hhm.f.f152430b, null);
    }

    public final r<hhm.g> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, hhm.f.f152430b);
    }

    public final <R> R to(kfm.o oVar) {
        try {
            mfm.f.b(oVar, "converter is null");
            return (R) oVar.apply(this);
        } catch (Throwable th10) {
            m70.a.u(th10);
            throw zfm.h.d(th10);
        }
    }

    public final i toFlowable(a aVar) {
        pfm.x xVar = new pfm.x(this, 3);
        int i = q.f125388a[aVar.ordinal()];
        if (i == 1) {
            return new j0(xVar);
        }
        if (i == 2) {
            return new b1(xVar, 2);
        }
        if (i == 3) {
            return xVar;
        }
        if (i == 4) {
            return new b1(xVar, 1);
        }
        int i2 = i.f125385a;
        mfm.f.e(i2, "capacity");
        return new p1(xVar, i2);
    }

    public final Future<T> toFuture() {
        return (Future) subscribeWith(new ofm.m());
    }

    public final d0<List<T>> toList() {
        return toList(16);
    }

    public final <K> d0<Map<K, T>> toMap(kfm.o oVar) {
        mfm.f.b(oVar, "keySelector is null");
        return (d0<Map<K, T>>) collect(zfm.i.a(), new ks0.n(oVar, 10));
    }

    public final <K> d0<Map<K, Collection<T>>> toMultimap(kfm.o oVar) {
        return (d0<Map<K, Collection<T>>>) toMultimap(oVar, mfm.f.f205041a, zfm.i.a(), zfm.b.b());
    }

    public final d0<List<T>> toSortedList() {
        return toSortedList(mfm.f.f205046j);
    }

    public final r<T> unsubscribeOn(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return new f6(this, c0Var, 1);
    }

    public final r<r<T>> window(long j2, long j3, TimeUnit timeUnit) {
        return window(j2, j3, timeUnit, hhm.f.f152430b, bufferSize());
    }

    public final <U, R> r<R> withLatestFrom(w wVar, kfm.c cVar) {
        mfm.f.b(wVar, "other is null");
        mfm.f.b(cVar, "combiner is null");
        return new q1(this, cVar, wVar, 3);
    }

    public final <U, R> r<R> zipWith(Iterable<U> iterable, kfm.c cVar) {
        mfm.f.b(iterable, "other is null");
        mfm.f.b(cVar, "zipper is null");
        return new tfm.m(this, 2, iterable, cVar);
    }

    public static <T, R> r<R> combineLatest(Iterable<? extends w> iterable, kfm.o oVar) {
        return combineLatest(iterable, oVar, bufferSize());
    }

    public static <T, R> r<R> combineLatestDelayError(kfm.o oVar, int i, w... wVarArr) {
        return combineLatestDelayError(wVarArr, oVar, i);
    }

    public static <T> r<T> concatArrayEager(int i, int i2, w... wVarArr) {
        return fromArray(wVarArr).concatMapEagerDelayError(mfm.f.f205041a, i, i2, false);
    }

    public static <T> r<T> concatArrayEagerDelayError(int i, int i2, w... wVarArr) {
        return fromArray(wVarArr).concatMapEagerDelayError(mfm.f.f205041a, i, i2, true);
    }

    public static <T> r<T> concatEager(w wVar, int i, int i2) {
        return wrap(wVar).concatMapEager(mfm.f.f205041a, i, i2);
    }

    public static <T> r<T> merge(Iterable<? extends w> iterable) {
        return fromIterable(iterable).flatMap(mfm.f.f205041a);
    }

    public static <T> r<T> mergeArray(w... wVarArr) {
        return fromArray(wVarArr).flatMap(mfm.f.f205041a, wVarArr.length);
    }

    public static <T> r<T> mergeArrayDelayError(w... wVarArr) {
        return fromArray(wVarArr).flatMap((kfm.o) mfm.f.f205041a, true, wVarArr.length);
    }

    public static <T> r<T> mergeDelayError(Iterable<? extends w> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap((kfm.o) mfm.f.f205041a, true, i, i2);
    }

    public static <T> d0<Boolean> sequenceEqual(w wVar, w wVar2, kfm.d dVar) {
        return sequenceEqual(wVar, wVar2, dVar, bufferSize());
    }

    public static <T> r<T> switchOnNextDelayError(w wVar, int i) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "prefetch");
        return new j6(wVar, mfm.f.f205041a, i, true);
    }

    public static <T, D> r<T> using(Callable<? extends D> callable, kfm.o oVar, kfm.g gVar, boolean z) {
        mfm.f.b(callable, "resourceSupplier is null");
        mfm.f.b(oVar, "sourceSupplier is null");
        mfm.f.b(gVar, "disposer is null");
        return new f7(callable, oVar, gVar, z);
    }

    public final Iterable<T> blockingIterable(int i) {
        mfm.f.e(i, "bufferSize");
        return new sgm.c(this, i, 1);
    }

    public final void blockingSubscribe(kfm.g gVar) {
        ce9.m.E(this, gVar, mfm.f.e, mfm.f.f205043c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> r<R> concatMap(kfm.o oVar, int i) throws Exception {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        if (!(this instanceof nfm.h)) {
            return new p0(this, oVar, i, zfm.f.IMMEDIATE);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? empty() : new tfm.l(objCall, oVar, 3);
    }

    public final b concatMapCompletable(kfm.o oVar, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "capacityHint");
        return new sfm.f(this, oVar, zfm.f.IMMEDIATE, i);
    }

    public final b concatMapCompletableDelayError(kfm.o oVar, boolean z) {
        return concatMapCompletableDelayError(oVar, z, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> r<R> concatMapDelayError(kfm.o oVar, int i, boolean z) throws Exception {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        if (!(this instanceof nfm.h)) {
            return new p0(this, oVar, i, z ? zfm.f.END : zfm.f.BOUNDARY);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? empty() : new tfm.l(objCall, oVar, 3);
    }

    public final <R> r<R> concatMapEager(kfm.o oVar, int i, int i2) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "maxConcurrency");
        mfm.f.e(i2, "prefetch");
        return new r0(this, oVar, zfm.f.IMMEDIATE, i, i2);
    }

    public final <R> r<R> concatMapEagerDelayError(kfm.o oVar, int i, int i2, boolean z) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "maxConcurrency");
        mfm.f.e(i2, "prefetch");
        return new r0(this, oVar, z ? zfm.f.END : zfm.f.BOUNDARY, i, i2);
    }

    public final <R> r<R> concatMapMaybe(kfm.o oVar, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return new sfm.h(this, oVar, zfm.f.IMMEDIATE, i, 0);
    }

    public final <R> r<R> concatMapMaybeDelayError(kfm.o oVar, boolean z) {
        return concatMapMaybeDelayError(oVar, z, 2);
    }

    public final <R> r<R> concatMapSingle(kfm.o oVar, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return new sfm.j(this, oVar, zfm.f.IMMEDIATE, i);
    }

    public final <R> r<R> concatMapSingleDelayError(kfm.o oVar, boolean z) {
        return concatMapSingleDelayError(oVar, z, 2);
    }

    public final <R> r<R> dematerialize(kfm.o oVar) {
        mfm.f.b(oVar, "selector is null");
        return new c1(this, oVar, 1);
    }

    public final <K> r<T> distinctUntilChanged(kfm.o oVar) {
        mfm.f.b(oVar, "keySelector is null");
        return new q1(this, oVar, mfm.f.k, 0);
    }

    public final <R> r<R> flatMap(kfm.o oVar, boolean z) {
        return flatMap(oVar, z, Integer.MAX_VALUE);
    }

    public final b flatMapCompletable(kfm.o oVar, boolean z) {
        mfm.f.b(oVar, "mapper is null");
        return new l2(this, oVar, z);
    }

    public final <R> r<R> flatMapMaybe(kfm.o oVar, boolean z) {
        mfm.f.b(oVar, "mapper is null");
        return new n2(this, oVar, z, 0);
    }

    public final <R> r<R> flatMapSingle(kfm.o oVar, boolean z) {
        mfm.f.b(oVar, "mapper is null");
        return new n2(this, oVar, z, 1);
    }

    public final ifm.c forEachWhile(kfm.p pVar, kfm.g gVar) {
        return forEachWhile(pVar, gVar, mfm.f.f205043c);
    }

    public final <K> r<v2> groupBy(kfm.o oVar, boolean z) {
        return groupBy(oVar, mfm.f.f205041a, z, bufferSize());
    }

    public final r<T> observeOn(c0 c0Var, boolean z) {
        return observeOn(c0Var, z, bufferSize());
    }

    public final r<T> repeat(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? empty() : new p4(this, j2);
        }
        throw new IllegalArgumentException(p.a.m(j2, "times >= 0 required but it was "));
    }

    public final agm.a replay(int i, long j2, TimeUnit timeUnit) {
        return replay(i, j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> retry(kfm.d dVar) {
        mfm.f.b(dVar, "predicate is null");
        return new t0(this, dVar, 2);
    }

    public final r<T> skip(long j2, TimeUnit timeUnit) {
        return skipUntil(timer(j2, timeUnit));
    }

    public final r<T> startWith(w wVar) {
        mfm.f.b(wVar, "other is null");
        return concatArray(wVar, this);
    }

    public final ifm.c subscribe(kfm.g gVar) {
        return subscribe(gVar, mfm.f.e, mfm.f.f205043c, mfm.f.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> r<R> switchMap(kfm.o oVar, int i) throws Exception {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "bufferSize");
        if (!(this instanceof nfm.h)) {
            return new j6(this, oVar, i, false);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? empty() : new tfm.l(objCall, oVar, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> r<R> switchMapDelayError(kfm.o oVar, int i) throws Exception {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "bufferSize");
        if (!(this instanceof nfm.h)) {
            return new j6(this, oVar, i, true);
        }
        Object objCall = ((nfm.h) this).call();
        return objCall == null ? empty() : new tfm.l(objCall, oVar, 3);
    }

    public final r<T> throttleLast(long j2, TimeUnit timeUnit, c0 c0Var) {
        return sample(j2, timeUnit, c0Var);
    }

    public final r<T> throttleWithTimeout(long j2, TimeUnit timeUnit, c0 c0Var) {
        return debounce(j2, timeUnit, c0Var);
    }

    public final d0<List<T>> toList(int i) {
        mfm.f.e(i, "capacityHint");
        return new tfm.j(this, i);
    }

    public final d0<List<T>> toSortedList(Comparator<? super T> comparator) {
        mfm.f.b(comparator, "comparator is null");
        d0<List<T>> list = toList();
        kpj.f fVar = new kpj.f(comparator, 13);
        list.getClass();
        return new ufm.i(list, fVar, 1);
    }

    public static <T, R> r<R> combineLatest(Iterable<? extends w> iterable, kfm.o oVar, int i) {
        mfm.f.b(iterable, "sources is null");
        mfm.f.b(oVar, "combiner is null");
        mfm.f.e(i, "bufferSize");
        return new k0(null, iterable, oVar, i << 1, false);
    }

    public static <T, R> r<R> combineLatestDelayError(w[] wVarArr, kfm.o oVar, int i) {
        mfm.f.e(i, "bufferSize");
        mfm.f.b(oVar, "combiner is null");
        if (wVarArr.length == 0) {
            return empty();
        }
        return new k0(wVarArr, null, oVar, i << 1, true);
    }

    public static <T> r<T> concat(w wVar) {
        return concat(wVar, bufferSize());
    }

    public static <T> r<T> concatDelayError(w wVar) {
        return concatDelayError(wVar, bufferSize(), true);
    }

    public static <T> r<T> concatEager(Iterable<? extends w> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    public static <T> r<T> error(Throwable th10) {
        mfm.f.b(th10, "exception is null");
        return error(new mfm.d(th10));
    }

    public static <T> r<T> fromFuture(Future<? extends T> future, long j2, TimeUnit timeUnit) {
        mfm.f.b(future, "future is null");
        mfm.f.b(timeUnit, "unit is null");
        return new r2(future, j2, timeUnit);
    }

    public static r<Long> interval(long j2, TimeUnit timeUnit) {
        return interval(j2, j2, timeUnit, hhm.f.f152430b);
    }

    public static r<Long> intervalRange(long j2, long j3, long j5, long j16, TimeUnit timeUnit, c0 c0Var) {
        if (j3 < 0) {
            throw new IllegalArgumentException(p.a.m(j3, "count >= 0 required but it was "));
        }
        if (j3 == 0) {
            return empty().delay(j5, timeUnit, c0Var);
        }
        long j22 = (j3 - 1) + j2;
        if (j2 > 0 && j22 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new n3(j2, j22, Math.max(0L, j5), Math.max(0L, j16), timeUnit, c0Var);
    }

    public static <T> r<T> just(T t2, T t3) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        return fromArray(t2, t3);
    }

    public static <T> r<T> merge(Iterable<? extends w> iterable, int i) {
        return fromIterable(iterable).flatMap(mfm.f.f205041a, i);
    }

    public static <T> r<T> mergeDelayError(Iterable<? extends w> iterable, int i) {
        return fromIterable(iterable).flatMap((kfm.o) mfm.f.f205041a, true, i);
    }

    public static <T> d0<Boolean> sequenceEqual(w wVar, w wVar2, kfm.d dVar, int i) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(dVar, "isEqual is null");
        mfm.f.e(i, "bufferSize");
        return new u5(wVar, wVar2, dVar, i);
    }

    public static r<Long> timer(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new c7(Math.max(j2, 0L), timeUnit, c0Var);
    }

    public final void blockingSubscribe(kfm.g gVar, kfm.g gVar2) {
        ce9.m.E(this, gVar, gVar2, mfm.f.f205043c);
    }

    public final r<List<T>> buffer(long j2, TimeUnit timeUnit) {
        return buffer(j2, timeUnit, hhm.f.f152430b, Integer.MAX_VALUE);
    }

    public final b concatMapCompletableDelayError(kfm.o oVar, boolean z, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return new sfm.f(this, oVar, z ? zfm.f.END : zfm.f.BOUNDARY, i);
    }

    public final <U> r<U> concatMapIterable(kfm.o oVar, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return (r<U>) concatMap(cj9.c.e(oVar), i);
    }

    public final <R> r<R> concatMapMaybeDelayError(kfm.o oVar, boolean z, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return new sfm.h(this, oVar, z ? zfm.f.END : zfm.f.BOUNDARY, i, 0);
    }

    public final <R> r<R> concatMapSingleDelayError(kfm.o oVar, boolean z, int i) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "prefetch");
        return new sfm.j(this, oVar, z ? zfm.f.END : zfm.f.BOUNDARY, i);
    }

    public final r<T> concatWith(h0 h0Var) {
        mfm.f.b(h0Var, "other is null");
        return new v0(this, h0Var, 0);
    }

    public final <U> r<T> debounce(kfm.o oVar) {
        mfm.f.b(oVar, "debounceSelector is null");
        return new c1(this, oVar, 0);
    }

    public final r<T> delay(long j2, TimeUnit timeUnit, boolean z) {
        return delay(j2, timeUnit, hhm.f.f152430b, z);
    }

    public final <U> r<T> delaySubscription(w wVar) {
        mfm.f.b(wVar, "other is null");
        return new tfm.l(this, wVar, 1);
    }

    public final r<T> distinct() {
        return distinct(mfm.f.f205041a, mfm.c.INSTANCE);
    }

    public final <R> r<R> flatMap(kfm.o oVar, boolean z, int i) {
        return flatMap(oVar, z, i, bufferSize());
    }

    public final <U, V> r<V> flatMapIterable(kfm.o oVar, kfm.c cVar) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.b(cVar, "resultSelector is null");
        return (r<V>) flatMap(cj9.c.e(oVar), cVar, false, bufferSize(), bufferSize());
    }

    public final ifm.c forEachWhile(kfm.p pVar, kfm.g gVar, kfm.a aVar) {
        mfm.f.b(pVar, "onNext is null");
        mfm.f.b(gVar, "onError is null");
        mfm.f.b(aVar, "onComplete is null");
        ofm.l lVar = new ofm.l(pVar, gVar, aVar);
        subscribe(lVar);
        return lVar;
    }

    public final <K, V> r<v2> groupBy(kfm.o oVar, kfm.o oVar2) {
        return groupBy(oVar, oVar2, false, bufferSize());
    }

    public final r<T> mergeWith(h0 h0Var) {
        mfm.f.b(h0Var, "other is null");
        return new v0(this, h0Var, 1);
    }

    public final r<T> observeOn(c0 c0Var, boolean z, int i) {
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.e(i, "bufferSize");
        return new w3(this, c0Var, z, i);
    }

    public final r<T> onErrorResumeNext(w wVar) {
        mfm.f.b(wVar, "next is null");
        return onErrorResumeNext(new mfm.d(wVar));
    }

    public final <R> d0<R> reduce(R r2, kfm.c cVar) {
        mfm.f.b(r2, "seed is null");
        mfm.f.b(cVar, "reducer is null");
        return new k4(this, r2, cVar, 0);
    }

    public final r<T> sample(long j2, TimeUnit timeUnit, boolean z) {
        return sample(j2, timeUnit, hhm.f.f152430b, z);
    }

    public final <R> r<R> scan(R r2, kfm.c cVar) {
        mfm.f.b(r2, "initialValue is null");
        return scanWith(new mfm.d(r2), cVar);
    }

    public final r<T> skip(long j2, TimeUnit timeUnit, c0 c0Var) {
        return skipUntil(timer(j2, timeUnit, c0Var));
    }

    public final r<T> skipLast(long j2, TimeUnit timeUnit, boolean z) {
        return skipLast(j2, timeUnit, hhm.f.d, z, bufferSize());
    }

    public final ifm.c subscribe(kfm.g gVar, kfm.g gVar2) {
        return subscribe(gVar, gVar2, mfm.f.f205043c, mfm.f.d);
    }

    public final r<T> takeLast(long j2, TimeUnit timeUnit) {
        return takeLast(j2, timeUnit, hhm.f.d, false, bufferSize());
    }

    public final r<T> takeUntil(kfm.p pVar) {
        mfm.f.b(pVar, "stopPredicate is null");
        return new e2(this, pVar, 2);
    }

    public final bgm.f test(boolean z) {
        bgm.f fVar = new bgm.f();
        if (z) {
            fVar.dispose();
        }
        subscribe(fVar);
        return fVar;
    }

    public final r<T> throttleFirst(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new q6(this, j2, timeUnit, c0Var);
    }

    public final r<T> throttleLatest(long j2, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j2, timeUnit, hhm.f.f152430b, z);
    }

    public final r<hhm.g> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, hhm.f.f152430b);
    }

    public final <V> r<T> timeout(kfm.o oVar, w wVar) {
        mfm.f.b(wVar, "other is null");
        mfm.f.b(oVar, "itemTimeoutIndicator is null");
        return new tfm.t(this, null, oVar, wVar, 2);
    }

    public final r<hhm.g> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, hhm.f.f152430b);
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit) {
        return window(j2, timeUnit, hhm.f.f152430b, Long.MAX_VALUE, false);
    }

    public static <T> r<T> concat(w wVar, int i) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "prefetch");
        return new p0(wVar, mfm.f.f205041a, i, zfm.f.IMMEDIATE);
    }

    public static <T> r<T> concatDelayError(w wVar, int i, boolean z) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "prefetch is null");
        return new p0(wVar, mfm.f.f205041a, i, z ? zfm.f.END : zfm.f.BOUNDARY);
    }

    public static <T> r<T> concatEager(Iterable<? extends w> iterable, int i, int i2) {
        return fromIterable(iterable).concatMapEagerDelayError(mfm.f.f205041a, i, i2, false);
    }

    public static <T> r<T> merge(w wVar) {
        mfm.f.b(wVar, "sources is null");
        return new h2(wVar, mfm.f.f205041a, false, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> r<T> mergeDelayError(w wVar) {
        mfm.f.b(wVar, "sources is null");
        return new h2(wVar, mfm.f.f205041a, true, Integer.MAX_VALUE, bufferSize());
    }

    public static <T> r<T> switchOnNext(w wVar) {
        return switchOnNext(wVar, bufferSize());
    }

    public static <T, R> r<R> zip(w wVar, kfm.o oVar) {
        mfm.f.b(oVar, "zipper is null");
        mfm.f.b(wVar, "sources is null");
        return new t0(wVar).flatMap(cj9.c.a0(oVar));
    }

    public final void blockingSubscribe(kfm.g gVar, kfm.g gVar2, kfm.a aVar) {
        ce9.m.E(this, gVar, gVar2, aVar);
    }

    public final r<T> distinctUntilChanged(kfm.d dVar) {
        mfm.f.b(dVar, "comparer is null");
        return new q1(this, mfm.f.f205041a, dVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> r<R> flatMap(kfm.o oVar, boolean z, int i, int i2) throws Exception {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.e(i, "maxConcurrency");
        mfm.f.e(i2, "bufferSize");
        if (this instanceof nfm.h) {
            Object objCall = ((nfm.h) this).call();
            if (objCall == null) {
                return empty();
            }
            return new tfm.l(objCall, oVar, 3);
        }
        return new h2(this, oVar, z, i, i2);
    }

    public final <K, V> r<v2> groupBy(kfm.o oVar, kfm.o oVar2, boolean z) {
        return groupBy(oVar, oVar2, z, bufferSize());
    }

    public final <R> r<R> publish(kfm.o oVar) {
        mfm.f.b(oVar, "selector is null");
        return new c1(this, oVar, 3);
    }

    public final agm.a replay(long j2, TimeUnit timeUnit) {
        return replay(j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> retry(long j2) {
        return retry(j2, mfm.f.f205044g);
    }

    public final r<T> startWith(T t2) {
        mfm.f.b(t2, "item is null");
        return concatArray(just(t2), this);
    }

    public final ifm.c subscribe(kfm.g gVar, kfm.g gVar2, kfm.a aVar) {
        return subscribe(gVar, gVar2, aVar, mfm.f.d);
    }

    public final <U extends Collection<? super T>> d0<U> toList(Callable<U> callable) {
        mfm.f.b(callable, "collectionSupplier is null");
        return new tfm.j(this, callable, 2);
    }

    public final <T1, T2, R> r<R> withLatestFrom(w wVar, w wVar2, kfm.h hVar) {
        mfm.f.b(wVar, "o1 is null");
        mfm.f.b(wVar2, "o2 is null");
        mfm.f.b(hVar, "combiner is null");
        return withLatestFrom(new w[]{wVar, wVar2}, (kfm.o) mfm.f.d(hVar));
    }

    public final <U, R> r<R> zipWith(w wVar, kfm.c cVar) {
        mfm.f.b(wVar, "other is null");
        return zip(this, wVar, cVar);
    }

    public static <T, S> r<T> generate(Callable<S> callable, kfm.b bVar) {
        mfm.f.b(bVar, "generator is null");
        return generate(callable, cj9.c.K(bVar), mfm.f.d);
    }

    public static r<Long> interval(long j2, long j3, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new l3(Math.max(0L, j2), Math.max(0L, j3), timeUnit, c0Var);
    }

    public final T blockingFirst(T t2) {
        ofm.e eVar = new ofm.e(0);
        subscribe(eVar);
        T t3 = (T) eVar.a();
        return t3 != null ? t3 : t2;
    }

    public final T blockingLast(T t2) {
        ofm.e eVar = new ofm.e(1);
        subscribe(eVar);
        T t3 = (T) eVar.a();
        return t3 != null ? t3 : t2;
    }

    public final void blockingSubscribe(y yVar) {
        ce9.m.D(this, yVar);
    }

    public final r<List<T>> buffer(long j2, TimeUnit timeUnit, int i) {
        return buffer(j2, timeUnit, hhm.f.f152430b, i);
    }

    public final r<T> concatWith(n nVar) {
        mfm.f.b(nVar, "other is null");
        return new u0(this, nVar, 0);
    }

    public final r<T> debounce(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new f1(this, j2, timeUnit, c0Var);
    }

    public final <U> r<T> delay(kfm.o oVar) {
        mfm.f.b(oVar, "itemDelay is null");
        return (r<T>) flatMap(cj9.c.p(oVar));
    }

    public final r<T> delaySubscription(long j2, TimeUnit timeUnit, c0 c0Var) {
        return delaySubscription(timer(j2, timeUnit, c0Var));
    }

    public final <K, V> r<v2> groupBy(kfm.o oVar, kfm.o oVar2, boolean z, int i) {
        mfm.f.b(oVar, "keySelector is null");
        mfm.f.b(oVar2, "valueSelector is null");
        mfm.f.e(i, "bufferSize");
        return new x2(this, oVar, oVar2, i, z);
    }

    public final r<T> mergeWith(n nVar) {
        mfm.f.b(nVar, "other is null");
        return new u0(this, nVar, 1);
    }

    public final r<T> retry(long j2, kfm.p pVar) {
        if (j2 >= 0) {
            mfm.f.b(pVar, "predicate is null");
            return new g5(this, j2, pVar);
        }
        throw new IllegalArgumentException(p.a.m(j2, "times >= 0 required but it was "));
    }

    public final r<T> sample(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new m5(this, j2, timeUnit, c0Var, false);
    }

    public final r<T> skipLast(int i) {
        if (i >= 0) {
            return i == 0 ? this : new y5(this, i, 0);
        }
        throw new IndexOutOfBoundsException(a0.d.n("count >= 0 required but it was ", i));
    }

    public final r<T> sorted(Comparator<? super T> comparator) {
        mfm.f.b(comparator, "sortFunction is null");
        return toList().x().map(new kpj.f(comparator, 13)).flatMapIterable(mfm.f.f205041a);
    }

    public final ifm.c subscribe(kfm.g gVar, kfm.g gVar2, kfm.a aVar, kfm.g gVar3) {
        mfm.f.b(gVar, "onNext is null");
        mfm.f.b(gVar2, "onError is null");
        mfm.f.b(aVar, "onComplete is null");
        mfm.f.b(gVar3, "onSubscribe is null");
        ofm.p pVar = new ofm.p(gVar, gVar2, aVar, gVar3);
        subscribe(pVar);
        return pVar;
    }

    public final r<T> takeLast(long j2, TimeUnit timeUnit, boolean z) {
        return takeLast(j2, timeUnit, hhm.f.d, z, bufferSize());
    }

    public final r<T> throttleLatest(long j2, TimeUnit timeUnit, c0 c0Var) {
        return throttleLatest(j2, timeUnit, c0Var, false);
    }

    public final <K, V> d0<Map<K, V>> toMap(kfm.o oVar, kfm.o oVar2) {
        mfm.f.b(oVar, "keySelector is null");
        mfm.f.b(oVar2, "valueSelector is null");
        return (d0<Map<K, V>>) collect(zfm.i.a(), new jul.o(oVar2, oVar, 10));
    }

    public final <K, V> d0<Map<K, Collection<V>>> toMultimap(kfm.o oVar, kfm.o oVar2) {
        return toMultimap(oVar, oVar2, zfm.i.a(), zfm.b.b());
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, long j3) {
        return window(j2, timeUnit, hhm.f.f152430b, j3, false);
    }

    public static <T> r<T> fromFuture(Future<? extends T> future, long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return fromFuture(future, j2, timeUnit).subscribeOn(c0Var);
    }

    public static <T> r<T> just(T t2, T t3, T t5) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        return fromArray(t2, t3, t5);
    }

    public static <T> r<T> merge(w wVar, int i) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "maxConcurrency");
        return new h2(wVar, mfm.f.f205041a, false, i, bufferSize());
    }

    public static <T> r<T> mergeDelayError(w wVar, int i) {
        mfm.f.b(wVar, "sources is null");
        mfm.f.e(i, "maxConcurrency");
        return new h2(wVar, mfm.f.f205041a, true, i, bufferSize());
    }

    public final <K> r<T> distinct(kfm.o oVar, Callable<? extends Collection<? super K>> callable) {
        mfm.f.b(oVar, "keySelector is null");
        mfm.f.b(callable, "collectionSupplier is null");
        return new tfm.w(this, oVar, callable, 3);
    }

    public final <R> r<R> replay(kfm.o oVar, int i, long j2, TimeUnit timeUnit) {
        return replay(oVar, i, j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> throttleLatest(long j2, TimeUnit timeUnit, c0 c0Var, boolean z) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new s6(this, j2, timeUnit, c0Var, z);
    }

    public final r<hhm.g> timeInterval(c0 c0Var) {
        return timeInterval(TimeUnit.MILLISECONDS, c0Var);
    }

    public final r<T> timeout(long j2, TimeUnit timeUnit, w wVar) {
        mfm.f.b(wVar, "other is null");
        return c(j2, timeUnit, hhm.f.f152430b, wVar);
    }

    public final r<hhm.g> timestamp(c0 c0Var) {
        return timestamp(TimeUnit.MILLISECONDS, c0Var);
    }

    public final <U, R> r<R> zipWith(w wVar, kfm.c cVar, boolean z) {
        return zip(this, wVar, cVar, z);
    }

    public static <T, R> r<R> combineLatest(w[] wVarArr, kfm.o oVar) {
        return combineLatest(wVarArr, oVar, bufferSize());
    }

    public static <T> r<T> concat(w wVar, w wVar2) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return concatArray(wVar, wVar2);
    }

    public static <T, S> r<T> generate(Callable<S> callable, kfm.b bVar, kfm.g gVar) {
        mfm.f.b(bVar, "generator is null");
        return generate(callable, cj9.c.K(bVar), gVar);
    }

    public final T blockingSingle(T t2) {
        return (T) single(t2).e();
    }

    public final r<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final r<T> concatWith(f fVar) {
        mfm.f.b(fVar, "other is null");
        return new t0(this, fVar, 0);
    }

    public final r<T> delay(long j2, TimeUnit timeUnit, c0 c0Var) {
        return delay(j2, timeUnit, c0Var, false);
    }

    public final r<T> doOnEach(y yVar) {
        mfm.f.b(yVar, "observer is null");
        return b(cj9.c.v(yVar), cj9.c.u(yVar), cj9.c.t(yVar), mfm.f.f205043c);
    }

    public final r<T> mergeWith(f fVar) {
        mfm.f.b(fVar, "other is null");
        return new t1(this, fVar, 2);
    }

    public final r<T> takeLast(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(a0.d.n("count >= 0 required but it was ", i));
        }
        if (i == 0) {
            return new x0(this, 2);
        }
        if (i == 1) {
            return new x0(this, 6);
        }
        return new y5(this, i, 1);
    }

    public final r<hhm.g> timeInterval(TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new tfm.w(this, timeUnit, c0Var, 4);
    }

    public final r<hhm.g> timestamp(TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return map(new kgm.i(timeUnit, c0Var, 7));
    }

    public final d0<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        mfm.f.b(comparator, "comparator is null");
        d0<List<T>> list = toList(i);
        kpj.f fVar = new kpj.f(comparator, 13);
        list.getClass();
        return new ufm.i(list, fVar, 1);
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, long j3, boolean z) {
        return window(j2, timeUnit, hhm.f.f152430b, j3, z);
    }

    public final <U, R> r<R> zipWith(w wVar, kfm.c cVar, boolean z, int i) {
        return zip(this, wVar, cVar, z, i);
    }

    public static <T, R> r<R> combineLatest(w[] wVarArr, kfm.o oVar, int i) {
        mfm.f.b(wVarArr, "sources is null");
        if (wVarArr.length == 0) {
            return empty();
        }
        mfm.f.b(oVar, "combiner is null");
        mfm.f.e(i, "bufferSize");
        return new k0(wVarArr, null, oVar, i << 1, false);
    }

    public static <T, R> r<R> combineLatestDelayError(Iterable<? extends w> iterable, kfm.o oVar) {
        return combineLatestDelayError(iterable, oVar, bufferSize());
    }

    public static r<Long> interval(long j2, TimeUnit timeUnit, c0 c0Var) {
        return interval(j2, j2, timeUnit, c0Var);
    }

    public static <T> d0<Boolean> sequenceEqual(w wVar, w wVar2, int i) {
        return sequenceEqual(wVar, wVar2, mfm.f.k, i);
    }

    public static <T1, T2, R> r<R> zip(w wVar, w wVar2, kfm.c cVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return zipArray(mfm.f.c(cVar), false, bufferSize(), wVar, wVar2);
    }

    public final r<List<T>> buffer(int i, int i2) {
        return (r<List<T>>) buffer(i, i2, zfm.b.a());
    }

    public final r<T> delay(long j2, TimeUnit timeUnit, c0 c0Var, boolean z) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new j1(this, j2, timeUnit, c0Var, z);
    }

    public final <R> r<R> replay(kfm.o oVar, long j2, TimeUnit timeUnit) {
        return replay(oVar, j2, timeUnit, hhm.f.f152430b);
    }

    public final r<T> sample(long j2, TimeUnit timeUnit, c0 c0Var, boolean z) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new m5(this, j2, timeUnit, c0Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> d0<Map<K, Collection<V>>> toMultimap(kfm.o oVar, kfm.o oVar2, Callable<? extends Map<K, Collection<V>>> callable, kfm.o oVar3) {
        mfm.f.b(oVar, "keySelector is null");
        mfm.f.b(oVar2, "valueSelector is null");
        mfm.f.b(callable, "mapSupplier is null");
        mfm.f.b(oVar3, "collectionFactory is null");
        return (d0<Map<K, Collection<V>>>) collect(callable, new kbb.c(oVar3, 6, oVar2, oVar));
    }

    public static <T, R> r<R> combineLatestDelayError(Iterable<? extends w> iterable, kfm.o oVar, int i) {
        mfm.f.b(iterable, "sources is null");
        mfm.f.b(oVar, "combiner is null");
        mfm.f.e(i, "bufferSize");
        return new k0(null, iterable, oVar, i << 1, true);
    }

    public static <T> r<T> fromFuture(Future<? extends T> future, c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        return fromFuture(future).subscribeOn(c0Var);
    }

    public static <T, S> r<T> generate(Callable<S> callable, kfm.c cVar) {
        return generate(callable, cVar, mfm.f.d);
    }

    public static <T> r<T> merge(w wVar, w wVar2) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return fromArray(wVar, wVar2).flatMap((kfm.o) mfm.f.f205041a, false, 2);
    }

    public static <T> r<T> mergeDelayError(w wVar, w wVar2) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return fromArray(wVar, wVar2).flatMap((kfm.o) mfm.f.f205041a, true, 2);
    }

    public final <U extends Collection<? super T>> r<U> buffer(int i, int i2, Callable<U> callable) {
        mfm.f.e(i, "count");
        mfm.f.e(i2, "skip");
        mfm.f.b(callable, "bufferSupplier is null");
        return new tfm.p(this, i, i2, callable);
    }

    public final d0<T> elementAt(long j2, T t2) {
        if (j2 >= 0) {
            mfm.f.b(t2, "defaultItem is null");
            return new b2(this, j2, t2);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "index >= 0 required but it was "));
    }

    public final r<T> take(long j2, TimeUnit timeUnit) {
        return takeUntil(timer(j2, timeUnit));
    }

    public final r<T> timeout(long j2, TimeUnit timeUnit, c0 c0Var, w wVar) {
        mfm.f.b(wVar, "other is null");
        return c(j2, timeUnit, c0Var, wVar);
    }

    public final r<r<T>> window(long j2) {
        return window(j2, j2, bufferSize());
    }

    public final <T1, T2, T3, R> r<R> withLatestFrom(w wVar, w wVar2, w wVar3, kfm.i iVar) {
        mfm.f.b(wVar, "o1 is null");
        mfm.f.b(wVar2, "o2 is null");
        mfm.f.b(wVar3, "o3 is null");
        mfm.f.b(iVar, "combiner is null");
        return withLatestFrom(new w[]{wVar, wVar2, wVar3}, new kpj.f(iVar, 12));
    }

    public static <T> r<T> concat(w wVar, w wVar2, w wVar3) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        return concatArray(wVar, wVar2, wVar3);
    }

    public static <T, S> r<T> generate(Callable<S> callable, kfm.c cVar, kfm.g gVar) {
        mfm.f.b(callable, "initialState is null");
        mfm.f.b(cVar, "generator is null");
        mfm.f.b(gVar, "disposeState is null");
        return new tfm.m(callable, 1, cVar, gVar);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        return fromArray(t2, t3, t5, t7);
    }

    public final <R> r<R> replay(kfm.o oVar) {
        mfm.f.b(oVar, "selector is null");
        return new tfm.l(cj9.c.C(this), oVar, 2);
    }

    public final r<T> take(long j2, TimeUnit timeUnit, c0 c0Var) {
        return takeUntil(timer(j2, timeUnit, c0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> d0<Map<K, V>> toMap(kfm.o oVar, kfm.o oVar2, Callable<? extends Map<K, V>> callable) {
        mfm.f.b(oVar, "keySelector is null");
        mfm.f.b(oVar2, "valueSelector is null");
        mfm.f.b(callable, "mapSupplier is null");
        return (d0<Map<K, V>>) collect(callable, new jul.o(oVar2, oVar, 10));
    }

    public final r<r<T>> window(long j2, long j3) {
        return window(j2, j3, bufferSize());
    }

    public static <T1, T2, R> r<R> zip(w wVar, w wVar2, kfm.c cVar, boolean z) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return zipArray(mfm.f.c(cVar), z, bufferSize(), wVar, wVar2);
    }

    public final <U, V> r<T> delay(w wVar, kfm.o oVar) {
        return delaySubscription(wVar).delay(oVar);
    }

    public final <U> r<T> sample(w wVar) {
        mfm.f.b(wVar, "sampler is null");
        return new j2(this, wVar, false, 1);
    }

    @Override // efm.w
    public final void subscribe(y yVar) {
        mfm.f.b(yVar, "observer is null");
        try {
            subscribeActual(yVar);
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

    public final r<T> timeout(long j2, TimeUnit timeUnit, c0 c0Var) {
        return c(j2, timeUnit, c0Var, null);
    }

    public final r<r<T>> window(long j2, long j3, int i) {
        mfm.f.f(j2, "count");
        mfm.f.f(j3, "skip");
        mfm.f.e(i, "bufferSize");
        return new i7(this, j2, j3, i);
    }

    public static <T> r<T> merge(w wVar, w wVar2, w wVar3) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        return fromArray(wVar, wVar2, wVar3).flatMap((kfm.o) mfm.f.f205041a, false, 3);
    }

    public static <T> r<T> mergeDelayError(w wVar, w wVar2, w wVar3) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        return fromArray(wVar, wVar2, wVar3).flatMap((kfm.o) mfm.f.f205041a, true, 3);
    }

    public final <R> r<R> flatMap(kfm.o oVar, kfm.o oVar2, Callable<? extends w> callable) {
        mfm.f.b(oVar, "onNextMapper is null");
        mfm.f.b(oVar2, "onErrorMapper is null");
        mfm.f.b(callable, "onCompleteSupplier is null");
        return merge(new tfm.t(this, oVar, oVar2, callable));
    }

    public final <U, V> r<T> timeout(w wVar, kfm.o oVar) {
        mfm.f.b(wVar, "firstTimeoutIndicator is null");
        mfm.f.b(oVar, "itemTimeoutIndicator is null");
        return new tfm.t(this, wVar, oVar, null, 2);
    }

    public final d0<List<T>> toSortedList(int i) {
        return toSortedList(mfm.f.f205046j, i);
    }

    public final <U extends Collection<? super T>> r<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    public final <R> r<R> replay(kfm.o oVar, int i) {
        mfm.f.b(oVar, "selector is null");
        mfm.f.e(i, "bufferSize");
        return new tfm.l(cj9.c.D(this, i), oVar, 2);
    }

    public final <U> r<T> sample(w wVar, boolean z) {
        mfm.f.b(wVar, "sampler is null");
        return new j2(this, wVar, z, 1);
    }

    public final r<T> skipLast(long j2, TimeUnit timeUnit, c0 c0Var) {
        return skipLast(j2, timeUnit, c0Var, false, bufferSize());
    }

    public static <T1, T2, R> r<R> combineLatest(w wVar, w wVar2, kfm.c cVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return combineLatest(mfm.f.c(cVar), bufferSize(), wVar, wVar2);
    }

    public static <T> r<T> concat(w wVar, w wVar2, w wVar3, w wVar4) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        return concatArray(wVar, wVar2, wVar3, wVar4);
    }

    public static <T1, T2, R> r<R> zip(w wVar, w wVar2, kfm.c cVar, boolean z, int i) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        return zipArray(mfm.f.c(cVar), z, i, wVar, wVar2);
    }

    public final r<List<T>> buffer(long j2, long j3, TimeUnit timeUnit, c0 c0Var) {
        return (r<List<T>>) buffer(j2, j3, timeUnit, c0Var, zfm.b.a());
    }

    public final r<T> retry(kfm.p pVar) {
        return retry(Long.MAX_VALUE, pVar);
    }

    public final r<T> skipLast(long j2, TimeUnit timeUnit, c0 c0Var, boolean z) {
        return skipLast(j2, timeUnit, c0Var, z, bufferSize());
    }

    public final <K, V> d0<Map<K, Collection<V>>> toMultimap(kfm.o oVar, kfm.o oVar2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(oVar, oVar2, callable, zfm.b.b());
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        return fromArray(t2, t3, t5, t7, t16);
    }

    public final <U extends Collection<? super T>> r<U> buffer(long j2, long j3, TimeUnit timeUnit, c0 c0Var, Callable<U> callable) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.b(callable, "bufferSupplier is null");
        return new tfm.d0(this, j2, j3, timeUnit, c0Var, callable, Integer.MAX_VALUE, false);
    }

    public final r<T> skipLast(long j2, TimeUnit timeUnit, c0 c0Var, boolean z, int i) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.e(i, "bufferSize");
        return new a6(this, j2, timeUnit, c0Var, i << 1, z);
    }

    public final <U, V> r<T> timeout(w wVar, kfm.o oVar, w wVar2) {
        mfm.f.b(wVar, "firstTimeoutIndicator is null");
        mfm.f.b(wVar2, "other is null");
        mfm.f.b(oVar, "itemTimeoutIndicator is null");
        return new tfm.t(this, wVar, oVar, wVar2, 2);
    }

    public final r<r<T>> window(long j2, long j3, TimeUnit timeUnit, c0 c0Var) {
        return window(j2, j3, timeUnit, c0Var, bufferSize());
    }

    public final <T1, T2, T3, T4, R> r<R> withLatestFrom(w wVar, w wVar2, w wVar3, w wVar4, kfm.j jVar) {
        mfm.f.b(wVar, "o1 is null");
        mfm.f.b(wVar2, "o2 is null");
        mfm.f.b(wVar3, "o3 is null");
        mfm.f.b(wVar4, "o4 is null");
        mfm.f.b(jVar, "combiner is null");
        return withLatestFrom(new w[]{wVar, wVar2, wVar3, wVar4}, new ks0.n(jVar, 9));
    }

    public static <T> r<T> merge(w wVar, w wVar2, w wVar3, w wVar4) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        return fromArray(wVar, wVar2, wVar3, wVar4).flatMap((kfm.o) mfm.f.f205041a, false, 4);
    }

    public static <T> r<T> mergeDelayError(w wVar, w wVar2, w wVar3, w wVar4) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        return fromArray(wVar, wVar2, wVar3, wVar4).flatMap((kfm.o) mfm.f.f205041a, true, 4);
    }

    public final <R> r<R> flatMap(kfm.o oVar, kfm.o oVar2, Callable<? extends w> callable, int i) {
        mfm.f.b(oVar, "onNextMapper is null");
        mfm.f.b(oVar2, "onErrorMapper is null");
        mfm.f.b(callable, "onCompleteSupplier is null");
        return merge(new tfm.t(this, oVar, oVar2, callable), i);
    }

    public final r<r<T>> window(long j2, long j3, TimeUnit timeUnit, c0 c0Var, int i) {
        mfm.f.f(j2, "timespan");
        mfm.f.f(j3, "timeskip");
        mfm.f.e(i, "bufferSize");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.b(timeUnit, "unit is null");
        return new v7(this, j2, j3, timeUnit, c0Var, Long.MAX_VALUE, i, false);
    }

    public static <T1, T2, T3, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, kfm.h hVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        return combineLatest((kfm.o) mfm.f.d(hVar), bufferSize(), wVar, wVar2, wVar3);
    }

    public static <T1, T2, T3, R> r<R> zip(w wVar, w wVar2, w wVar3, kfm.h hVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        return zipArray(mfm.f.d(hVar), false, bufferSize(), wVar, wVar2, wVar3);
    }

    public final <R> r<R> replay(kfm.o oVar, int i, long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(oVar, "selector is null");
        mfm.f.e(i, "bufferSize");
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new tfm.l(cj9.c.E(this, i, j2, timeUnit, c0Var), oVar, 2);
    }

    public final r<T> takeLast(long j2, long j3, TimeUnit timeUnit, c0 c0Var) {
        return takeLast(j2, j3, timeUnit, c0Var, false, bufferSize());
    }

    public final r<T> takeLast(long j2, long j3, TimeUnit timeUnit, c0 c0Var, boolean z, int i) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.e(i, "bufferSize");
        if (j2 >= 0) {
            return new n6(this, j2, j3, timeUnit, c0Var, i, z);
        }
        throw new IndexOutOfBoundsException(p.a.m(j2, "count >= 0 required but it was "));
    }

    public final r<List<T>> buffer(long j2, TimeUnit timeUnit, c0 c0Var, int i) {
        return (r<List<T>>) buffer(j2, timeUnit, c0Var, i, zfm.b.a(), false);
    }

    public final <V> r<T> timeout(kfm.o oVar) {
        mfm.f.b(oVar, "itemTimeoutIndicator is null");
        w wVar = null;
        return new tfm.t(this, wVar, oVar, wVar, 2);
    }

    public final <U extends Collection<? super T>> r<U> buffer(long j2, TimeUnit timeUnit, c0 c0Var, int i, Callable<U> callable, boolean z) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.b(callable, "bufferSupplier is null");
        mfm.f.e(i, "count");
        return new tfm.d0(this, j2, j2, timeUnit, c0Var, callable, i, z);
    }

    public final <R> r<R> flatMap(kfm.o oVar, int i) {
        return flatMap(oVar, false, i, bufferSize());
    }

    public static <T1, T2, T3, T4, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, kfm.i iVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(iVar, "f is null");
        return combineLatest(new kpj.f(iVar, 12), bufferSize(), wVar, wVar2, wVar3, wVar4);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16, T t19) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        mfm.f.b(t19, "item6 is null");
        return fromArray(t2, t3, t5, t7, t16, t19);
    }

    public static <T1, T2, T3, T4, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, kfm.i iVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(iVar, "f is null");
        return zipArray(new kpj.f(iVar, 12), false, bufferSize(), wVar, wVar2, wVar3, wVar4);
    }

    public final <U, R> r<R> flatMap(kfm.o oVar, kfm.c cVar) {
        return flatMap(oVar, cVar, false, bufferSize(), bufferSize());
    }

    public final <U, R> r<R> flatMap(kfm.o oVar, kfm.c cVar, boolean z) {
        return flatMap(oVar, cVar, z, bufferSize(), bufferSize());
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, c0 c0Var) {
        return window(j2, timeUnit, c0Var, Long.MAX_VALUE, false);
    }

    public final <R> r<R> withLatestFrom(w[] wVarArr, kfm.o oVar) {
        mfm.f.b(wVarArr, "others is null");
        mfm.f.b(oVar, "combiner is null");
        return new tfm.t(this, wVarArr, oVar);
    }

    public final <U, R> r<R> flatMap(kfm.o oVar, kfm.c cVar, boolean z, int i) {
        return flatMap(oVar, cVar, z, i, bufferSize());
    }

    public final <R> r<R> replay(kfm.o oVar, int i, c0 c0Var) {
        mfm.f.b(oVar, "selector is null");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.e(i, "bufferSize");
        return new tfm.l(cj9.c.D(this, i), cj9.c.G(oVar, c0Var), 2);
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, c0 c0Var, long j3) {
        return window(j2, timeUnit, c0Var, j3, false);
    }

    public final <U, R> r<R> flatMap(kfm.o oVar, kfm.c cVar, boolean z, int i, int i2) {
        mfm.f.b(oVar, "mapper is null");
        mfm.f.b(cVar, "combiner is null");
        return flatMap(cj9.c.f(oVar, cVar), z, i, i2);
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, c0 c0Var, long j3, boolean z) {
        return window(j2, timeUnit, c0Var, j3, z, bufferSize());
    }

    public final r<List<T>> buffer(long j2, TimeUnit timeUnit, c0 c0Var) {
        return (r<List<T>>) buffer(j2, timeUnit, c0Var, Integer.MAX_VALUE, zfm.b.a(), false);
    }

    public final r<r<T>> window(long j2, TimeUnit timeUnit, c0 c0Var, long j3, boolean z, int i) {
        mfm.f.e(i, "bufferSize");
        mfm.f.b(c0Var, "scheduler is null");
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.f(j3, "count");
        return new v7(this, j2, j2, timeUnit, c0Var, j3, i, z);
    }

    public final <R> r<R> withLatestFrom(Iterable<? extends w> iterable, kfm.o oVar) {
        mfm.f.b(iterable, "others is null");
        mfm.f.b(oVar, "combiner is null");
        return new tfm.t(this, iterable, oVar);
    }

    public final <TOpening, TClosing> r<List<T>> buffer(w wVar, kfm.o oVar) {
        return (r<List<T>>) buffer(wVar, oVar, zfm.b.a());
    }

    public final <TOpening, TClosing, U extends Collection<? super T>> r<U> buffer(w wVar, kfm.o oVar, Callable<U> callable) {
        mfm.f.b(wVar, "openingIndicator is null");
        mfm.f.b(oVar, "closingIndicator is null");
        mfm.f.b(callable, "bufferSupplier is null");
        return new tfm.t(this, wVar, oVar, callable, 0);
    }

    public final <U, R> r<R> flatMap(kfm.o oVar, kfm.c cVar, int i) {
        return flatMap(oVar, cVar, false, i, bufferSize());
    }

    public static <T1, T2, T3, T4, T5, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, kfm.j jVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(jVar, "f is null");
        return combineLatest(new ks0.n(jVar, 9), bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16, T t19, T t23) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        mfm.f.b(t19, "item6 is null");
        mfm.f.b(t23, "item7 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23);
    }

    public static <T1, T2, T3, T4, T5, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, kfm.j jVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(jVar, "f is null");
        return zipArray(new ks0.n(jVar, 9), false, bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5);
    }

    public final <R> r<R> replay(kfm.o oVar, long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(oVar, "selector is null");
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new tfm.l(cj9.c.F(this, j2, timeUnit, c0Var), oVar, 2);
    }

    public final r<T> takeLast(long j2, TimeUnit timeUnit, c0 c0Var) {
        return takeLast(j2, timeUnit, c0Var, false, bufferSize());
    }

    public final r<T> takeLast(long j2, TimeUnit timeUnit, c0 c0Var, boolean z) {
        return takeLast(j2, timeUnit, c0Var, z, bufferSize());
    }

    public final <B> r<r<T>> window(w wVar) {
        return window(wVar, bufferSize());
    }

    public final <B> r<List<T>> buffer(w wVar) {
        return (r<List<T>>) buffer(wVar, (Callable) zfm.b.a());
    }

    public final r<T> takeLast(long j2, TimeUnit timeUnit, c0 c0Var, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j2, timeUnit, c0Var, z, i);
    }

    public final <B> r<r<T>> window(w wVar, int i) {
        mfm.f.b(wVar, "boundary is null");
        mfm.f.e(i, "bufferSize");
        return new k7(this, wVar, i, 0);
    }

    public final <B> r<List<T>> buffer(w wVar, int i) {
        mfm.f.e(i, "initialCapacity");
        return (r<List<T>>) buffer(wVar, new mfm.a(i));
    }

    public final <R> r<R> replay(kfm.o oVar, c0 c0Var) {
        mfm.f.b(oVar, "selector is null");
        mfm.f.b(c0Var, "scheduler is null");
        return new tfm.l(cj9.c.C(this), cj9.c.G(oVar, c0Var), 2);
    }

    public final <U, V> r<r<T>> window(w wVar, kfm.o oVar) {
        return window(wVar, oVar, bufferSize());
    }

    public final <B, U extends Collection<? super T>> r<U> buffer(w wVar, Callable<U> callable) {
        mfm.f.b(wVar, "boundary is null");
        mfm.f.b(callable, "bufferSupplier is null");
        return new tfm.w(this, wVar, callable, 1);
    }

    public final <U, V> r<r<T>> window(w wVar, kfm.o oVar, int i) {
        mfm.f.b(wVar, "openingIndicator is null");
        mfm.f.b(oVar, "closingIndicator is null");
        mfm.f.e(i, "bufferSize");
        return new o7(this, wVar, oVar, i);
    }

    public static <T1, T2, T3, T4, T5, T6, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, kfm.k kVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(kVar, "f is null");
        return combineLatest(new kgm.c(kVar, 13), bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        mfm.f.b(t19, "item6 is null");
        mfm.f.b(t23, "item7 is null");
        mfm.f.b(t32, "item8 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32);
    }

    public static <T1, T2, T3, T4, T5, T6, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, kfm.k kVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(kVar, "f is null");
        return zipArray(new kgm.c(kVar, 13), false, bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6);
    }

    public final <B> r<List<T>> buffer(Callable<? extends w> callable) {
        return (r<List<T>>) buffer(callable, zfm.b.a());
    }

    public final <B, U extends Collection<? super T>> r<U> buffer(Callable<? extends w> callable, Callable<U> callable2) {
        mfm.f.b(callable, "boundarySupplier is null");
        mfm.f.b(callable2, "bufferSupplier is null");
        return new tfm.w((r) this, (Callable) callable, (Object) callable2, 0);
    }

    public final agm.a replay(int i) {
        mfm.f.e(i, "bufferSize");
        if (i == Integer.MAX_VALUE) {
            return d5.f(this, d5.k);
        }
        return d5.f(this, new ag.w(i));
    }

    public final <B> r<r<T>> window(Callable<? extends w> callable) {
        return window(callable, bufferSize());
    }

    public final <B> r<r<T>> window(Callable<? extends w> callable, int i) {
        mfm.f.b(callable, "boundary is null");
        mfm.f.e(i, "bufferSize");
        return new k7(this, callable, i, 1);
    }

    public final agm.a replay(int i, long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.e(i, "bufferSize");
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return d5.f(this, new com.google.protobuf.i(i, j2, timeUnit, c0Var));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, kfm.l lVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(lVar, "f is null");
        return combineLatest(new kl.t1(lVar, 12), bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32, T t35) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        mfm.f.b(t19, "item6 is null");
        mfm.f.b(t23, "item7 is null");
        mfm.f.b(t32, "item8 is null");
        mfm.f.b(t35, "item9 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32, t35);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, kfm.l lVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(lVar, "f is null");
        return zipArray(new kl.t1(lVar, 12), false, bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7);
    }

    public final agm.a replay(int i, c0 c0Var) {
        mfm.f.e(i, "bufferSize");
        agm.a aVarReplay = replay(i);
        return new x4(aVarReplay, aVarReplay.observeOn(c0Var));
    }

    public final agm.a replay(long j2, TimeUnit timeUnit, c0 c0Var) {
        mfm.f.b(timeUnit, "unit is null");
        mfm.f.b(c0Var, "scheduler is null");
        return d5.f(this, new com.google.protobuf.i(Integer.MAX_VALUE, j2, timeUnit, c0Var));
    }

    public final agm.a replay(c0 c0Var) {
        mfm.f.b(c0Var, "scheduler is null");
        agm.a aVarReplay = replay();
        return new x4(aVarReplay, aVarReplay.observeOn(c0Var));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, kfm.m mVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(wVar8, "source8 is null");
        mfm.f.b(mVar, "f is null");
        return combineLatest(new kye.e(mVar, 12), bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8);
    }

    public static <T> r<T> just(T t2, T t3, T t5, T t7, T t16, T t19, T t23, T t32, T t35, T t39) {
        mfm.f.b(t2, "item1 is null");
        mfm.f.b(t3, "item2 is null");
        mfm.f.b(t5, "item3 is null");
        mfm.f.b(t7, "item4 is null");
        mfm.f.b(t16, "item5 is null");
        mfm.f.b(t19, "item6 is null");
        mfm.f.b(t23, "item7 is null");
        mfm.f.b(t32, "item8 is null");
        mfm.f.b(t35, "item9 is null");
        mfm.f.b(t39, "item10 is null");
        return fromArray(t2, t3, t5, t7, t16, t19, t23, t32, t35, t39);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, kfm.m mVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(wVar8, "source8 is null");
        mfm.f.b(mVar, "f is null");
        return zipArray(new kye.e(mVar, 12), false, bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r<R> combineLatest(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, w wVar9, kfm.n nVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(wVar8, "source8 is null");
        mfm.f.b(wVar9, "source9 is null");
        mfm.f.b(nVar, "f is null");
        return combineLatest(new kl.b0(nVar, 15), bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r<R> zip(w wVar, w wVar2, w wVar3, w wVar4, w wVar5, w wVar6, w wVar7, w wVar8, w wVar9, kfm.n nVar) {
        mfm.f.b(wVar, "source1 is null");
        mfm.f.b(wVar2, "source2 is null");
        mfm.f.b(wVar3, "source3 is null");
        mfm.f.b(wVar4, "source4 is null");
        mfm.f.b(wVar5, "source5 is null");
        mfm.f.b(wVar6, "source6 is null");
        mfm.f.b(wVar7, "source7 is null");
        mfm.f.b(wVar8, "source8 is null");
        mfm.f.b(wVar9, "source9 is null");
        mfm.f.b(nVar, "f is null");
        return zipArray(new kl.b0(nVar, 15), false, bufferSize(), wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9);
    }
}
