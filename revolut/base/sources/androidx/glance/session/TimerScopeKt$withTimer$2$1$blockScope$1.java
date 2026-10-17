package androidx.glance.session;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import skm.e0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0017"}, d2 = {"androidx/glance/session/TimerScopeKt$withTimer$2$1$blockScope$1", "Landroidx/glance/session/TimerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/time/b;", "time", "", "addTime-LRDsOJo", "(J)V", "addTime", "initialTimeout", "startTimer-LRDsOJo", "startTimer", "Ljava/util/concurrent/atomic/AtomicReference;", "", "deadline", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getTimeLeft-UwyO8pc", "()J", "timeLeft", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TimerScopeKt$withTimer$2$1$blockScope$1 implements TimerScope, CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
    final /* synthetic */ TimeSource $timeSource;
    final /* synthetic */ AtomicReference<Job> $timerJob;
    final /* synthetic */ CoroutineScope $timerScope;

    @NotNull
    private final AtomicReference<Long> deadline = new AtomicReference<>(null);

    /* JADX WARN: Multi-variable type inference failed */
    public TimerScopeKt$withTimer$2$1$blockScope$1(CoroutineScope coroutineScope, TimeSource timeSource, CoroutineScope coroutineScope2, Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, AtomicReference<Job> atomicReference) {
        this.$timeSource = timeSource;
        this.$timerScope = coroutineScope2;
        this.$block = function2;
        this.$timerJob = atomicReference;
        this.$$delegate_0 = coroutineScope;
    }

    @Override // androidx.glance.session.TimerScope
    /* JADX INFO: renamed from: addTime-LRDsOJo */
    public void mo3580addTimeLRDsOJo(long time) {
        TimerScopeKt.update(this.deadline, new TimerScopeKt$withTimer$2$1$blockScope$1$addTime$1(time));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.$$delegate_0.getF74819h();
    }

    @Override // androidx.glance.session.TimerScope
    /* JADX INFO: renamed from: getTimeLeft-UwyO8pc */
    public long mo3581getTimeLeftUwyO8pc() {
        Long l2 = this.deadline.get();
        if (l2 == null) {
            b.INSTANCE.getClass();
            return b.f187922b;
        }
        long jLongValue = l2.longValue() - this.$timeSource.markNow();
        b.Companion companion = b.INSTANCE;
        return c.h(jLongValue, e.MILLISECONDS);
    }

    @Override // androidx.glance.session.TimerScope
    /* JADX INFO: renamed from: startTimer-LRDsOJo */
    public void mo3582startTimerLRDsOJo(long initialTimeout) {
        if (b.f(initialTimeout) <= 0) {
            e0.k(this.$timerScope, new TimeoutCancellationException("Timed out immediately", this.$block.hashCode()));
            return;
        }
        if (b.c(mo3581getTimeLeftUwyO8pc(), initialTimeout) < 0) {
            return;
        }
        this.deadline.set(Long.valueOf(b.f(initialTimeout) + this.$timeSource.markNow()));
        AtomicReference<Job> atomicReference = this.$timerJob;
        CoroutineScope coroutineScope = this.$timerScope;
        Job andSet = atomicReference.getAndSet(e0.C(coroutineScope, null, null, new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this, this.$timeSource, coroutineScope, this.$block, null), 3));
        if (andSet != null) {
            andSet.f(null);
        }
    }
}
