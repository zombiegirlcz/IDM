package com.onfido.android.sdk.capture.utils;

import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import lgm.c;
import ogm.q;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import pgm.m;
import pgm.o1;
import pgm.s0;
import pgm.t1;
import rim.d;
import tgm.b;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\fH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\fH\u0080\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0010H\u0080\b¢\u0006\u0004\b\r\u0010\u0011\u001aK\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a[\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0007¢\u0006\u0004\b\"\u0010#\u001a*\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\fH\u0080\b¢\u0006\u0004\b$\u0010\u000e¨\u0006%"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/Single;", "asSingle", "(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Single;", "defer", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/disposables/Disposable;", "disposable", "", "plusAssign", "(Lio/reactivex/rxjava3/disposables/CompositeDisposable;Lio/reactivex/rxjava3/disposables/Disposable;)V", "Lio/reactivex/rxjava3/core/Observable;", "filterIsInstance", "(Lio/reactivex/rxjava3/core/Observable;)Lio/reactivex/rxjava3/core/Observable;", "filterIsNotInstance", "Lio/reactivex/rxjava3/core/Flowable;", "(Lio/reactivex/rxjava3/core/Flowable;)Lio/reactivex/rxjava3/core/Flowable;", "", "retryCount", "retryDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lio/reactivex/rxjava3/core/Scheduler;", "scheduler", "retryWithDelay", "(Lio/reactivex/rxjava3/core/Single;JJLjava/util/concurrent/TimeUnit;Lio/reactivex/rxjava3/core/Scheduler;)Lio/reactivex/rxjava3/core/Single;", "", "retryFactor", "maxNumberOfRetries", "Lkotlin/Function1;", "", "", "skipRetry", "retryWithExponentialBackOff", "(Lio/reactivex/rxjava3/core/Observable;IILio/reactivex/rxjava3/core/Scheduler;Lkotlin/jvm/functions/Function1;)Lio/reactivex/rxjava3/core/Observable;", "cast", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RxExtensionsKt {

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.RxExtensionsKt$filterIsInstance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1<T> implements p {
        public static final AnonymousClass1<T> INSTANCE = new AnonymousClass1<>();

        @Override // igm.p
        public final boolean test(@NotNull Object it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            Intrinsics.q();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.RxExtensionsKt$filterIsNotInstance$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class C21611<T> implements p {
        public static final C21611<T> INSTANCE = new C21611<>();

        @Override // igm.p
        public final boolean test(@NotNull Object it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            Intrinsics.q();
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.RxExtensionsKt$retryWithExponentialBackOff$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "", "it", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21631 extends u implements Function1<Throwable, Boolean> {
        public static final C21631 INSTANCE = new C21631();

        public C21631() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Throwable it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return Boolean.FALSE;
        }
    }

    @NotNull
    public static final <T> Single<T> asSingle(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        b bVarF = Single.f(t2);
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    public static final <T> Observable cast(Observable observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.q();
        throw null;
    }

    @NotNull
    public static final <T> Single<T> defer(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        b bVarF = Single.f(t2);
        Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
        return bVarF;
    }

    public static final <T> Flowable filterIsInstance(Flowable flowable) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.q();
        throw null;
    }

    public static final <T> Observable filterIsNotInstance(Observable observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.q();
        throw null;
    }

    @InternalOnfidoApi
    public static final void plusAssign(@NotNull CompositeDisposable compositeDisposable, @NotNull Disposable disposable) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "<this>");
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        compositeDisposable.a(disposable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Single<T> retryWithDelay(@NotNull Single<T> single, final long j2, final long j3, @NotNull final TimeUnit timeUnit, @NotNull final Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.utils.RxExtensionsKt.retryWithDelay.1
            @Override // igm.o
            @NotNull
            public final Publisher apply(@NotNull Flowable f) {
                Intrinsics.checkNotNullParameter(f, "f");
                t1 t1VarM = f.m(j2);
                long j5 = j3;
                TimeUnit timeUnit2 = timeUnit;
                Scheduler scheduler2 = scheduler;
                Objects.requireNonNull(timeUnit2, "unit is null");
                Objects.requireNonNull(scheduler2, "scheduler is null");
                return new m(t1VarM, Math.max(0L, j5), timeUnit2, scheduler2);
            }
        };
        single.getClass();
        o1 o1Var = new o1(new s0(single instanceof c ? ((c) single).b() : new q(single, 5), oVar, 1));
        Intrinsics.checkNotNullExpressionValue(o1Var, "retryWhen(...)");
        return o1Var;
    }

    public static /* synthetic */ Single retryWithDelay$default(Single single, long j2, long j3, TimeUnit timeUnit, Scheduler scheduler, int i, Object obj2) {
        if ((i & 4) != 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        }
        return retryWithDelay(single, j2, j3, timeUnit, scheduler);
    }

    @InternalOnfidoApi
    @NotNull
    public static final <T> Observable retryWithExponentialBackOff(@NotNull Observable observable, final int i, final int i2, @NotNull final Scheduler scheduler, @NotNull final Function1<? super Throwable, Boolean> skipRetry) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(skipRetry, "skipRetry");
        Observable observableRetryWhen = observable.retryWhen(new o() { // from class: com.onfido.android.sdk.capture.utils.RxExtensionsKt.retryWithExponentialBackOff.2
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Observable errors) {
                Intrinsics.checkNotNullParameter(errors, "errors");
                Observable observableZipWith = errors.zipWith(Observable.range(1, i2 + 1), new igm.c() { // from class: com.onfido.android.sdk.capture.utils.RxExtensionsKt.retryWithExponentialBackOff.2.1
                    @Override // igm.c
                    @NotNull
                    public final Pair<Throwable, Integer> apply(@NotNull Throwable p0, @NotNull Integer p17) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Intrinsics.checkNotNullParameter(p17, "p1");
                        return new Pair<>(p0, p17);
                    }
                });
                final int i3 = i2;
                final Function1<Throwable, Boolean> function1 = skipRetry;
                final int i5 = i;
                final Scheduler scheduler2 = scheduler;
                return observableZipWith.flatMap(new o() { // from class: com.onfido.android.sdk.capture.utils.RxExtensionsKt.retryWithExponentialBackOff.2.2
                    @Override // igm.o
                    @NotNull
                    public final ObservableSource apply(@NotNull Pair<? extends Throwable, Integer> pair) {
                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                        Throwable th10 = (Throwable) pair.f186385a;
                        Integer num = (Integer) pair.f186386b;
                        int i6 = i3 + 1;
                        if (num == null || num.intValue() != i6) {
                            Function1<Throwable, Boolean> function12 = function1;
                            Intrinsics.h(th10);
                            if (!((Boolean) function12.invoke(th10)).booleanValue()) {
                                return Observable.timer(d.d(Math.pow(i5, num.intValue())), TimeUnit.SECONDS, scheduler2);
                            }
                        }
                        return Observable.error(th10);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableRetryWhen, "retryWhen(...)");
        return observableRetryWhen;
    }

    public static /* synthetic */ Observable retryWithExponentialBackOff$default(Observable observable, int i, int i2, Scheduler scheduler, Function1 function1, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = 2;
        }
        if ((i3 & 2) != 0) {
            i2 = 3;
        }
        if ((i3 & 8) != 0) {
            function1 = C21631.INSTANCE;
        }
        return retryWithExponentialBackOff(observable, i, i2, scheduler, function1);
    }

    @InternalOnfidoApi
    public static final <T> Observable filterIsInstance(Observable observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.q();
        throw null;
    }
}
