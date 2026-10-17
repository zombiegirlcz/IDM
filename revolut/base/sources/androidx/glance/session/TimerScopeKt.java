package androidx.glance.session;

import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aG\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aI\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a3\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"T", "Landroidx/glance/session/TimeSource;", "timeSource", "Lkotlin/Function2;", "Landroidx/glance/session/TimerScope;", "Lkotlin/coroutines/Continuation;", "", "block", "withTimer", "(Landroidx/glance/session/TimeSource;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimerOrNull", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlin/Function1;", "updater", "", "update", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class TimerScopeKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.glance.session.TimerScopeKt$withTimer$2, reason: invalid class name */
    @d(c = "androidx.glance.session.TimerScopeKt$withTimer$2", f = "TimerScope.kt", l = {86}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2<T> extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
        final /* synthetic */ TimeSource $timeSource;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.glance.session.TimerScopeKt$withTimer$2$1, reason: invalid class name */
        @d(c = "androidx.glance.session.TimerScopeKt$withTimer$2$1", f = "TimerScope.kt", l = {CertificateBody.profileType}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super T>, Object> {
            final /* synthetic */ Function2<TimerScope, Continuation<? super T>, Object> $block;
            final /* synthetic */ TimeSource $timeSource;
            final /* synthetic */ AtomicReference<Job> $timerJob;
            final /* synthetic */ CoroutineScope $timerScope;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, TimeSource timeSource, CoroutineScope coroutineScope, AtomicReference<Job> atomicReference, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function2;
                this.$timeSource = timeSource;
                this.$timerScope = coroutineScope;
                this.$timerJob = atomicReference;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, this.$timerScope, this.$timerJob, continuation);
                anonymousClass1.L$0 = obj2;
                return anonymousClass1;
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                TimerScopeKt$withTimer$2$1$blockScope$1 timerScopeKt$withTimer$2$1$blockScope$1 = new TimerScopeKt$withTimer$2$1$blockScope$1((CoroutineScope) this.L$0, this.$timeSource, this.$timerScope, this.$block, this.$timerJob);
                Function2<TimerScope, Continuation<? super T>, Object> function2 = this.$block;
                this.label = 1;
                Object objInvoke = function2.invoke(timerScopeKt$withTimer$2$1$blockScope$1, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, TimeSource timeSource, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
            this.$timeSource = timeSource;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.$timeSource, continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            AtomicReference atomicReference;
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AtomicReference atomicReference2 = new AtomicReference(null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$timeSource, coroutineScope, atomicReference2, null);
                this.L$0 = atomicReference2;
                this.label = 1;
                obj2 = e0.o(anonymousClass1, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                atomicReference = atomicReference2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atomicReference = (AtomicReference) this.L$0;
                o.b(obj2);
            }
            Job job2 = (Job) atomicReference.get();
            if (job2 != null) {
                job2.f(null);
            }
            return obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.TimerScopeKt$withTimerOrNull$1, reason: invalid class name */
    @d(c = "androidx.glance.session.TimerScopeKt", f = "TimerScope.kt", l = {137}, m = "withTimerOrNull")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return TimerScopeKt.withTimerOrNull(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(AtomicReference<T> atomicReference, Function1<? super T, ? extends T> function1) {
        while (true) {
            Object obj2 = atomicReference.get();
            Object objInvoke = function1.invoke(obj2);
            while (!atomicReference.compareAndSet(obj2, objInvoke)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            return;
        }
    }

    public static final <T> Object withTimer(@NotNull TimeSource timeSource, @NotNull Function2<? super TimerScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return e0.o(new AnonymousClass2(function2, timeSource, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object withTimerOrNull(@org.jetbrains.annotations.NotNull androidx.glance.session.TimeSource r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.glance.session.TimerScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof androidx.glance.session.TimerScopeKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.glance.session.TimerScopeKt$withTimerOrNull$1 r0 = (androidx.glance.session.TimerScopeKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.TimerScopeKt$withTimerOrNull$1 r0 = new androidx.glance.session.TimerScopeKt$withTimerOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            yhm.o.b(r6)     // Catch: androidx.glance.session.TimeoutCancellationException -> L2c
            return r6
        L2c:
            r4 = move-exception
            goto L45
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            yhm.o.b(r6)
            r0.L$0 = r5     // Catch: androidx.glance.session.TimeoutCancellationException -> L2c
            r0.label = r3     // Catch: androidx.glance.session.TimeoutCancellationException -> L2c
            java.lang.Object r4 = withTimer(r4, r5, r0)     // Catch: androidx.glance.session.TimeoutCancellationException -> L2c
            if (r4 != r1) goto L44
            return r1
        L44:
            return r4
        L45:
            int r6 = r4.getBlock()
            int r5 = r5.hashCode()
            if (r6 != r5) goto L51
            r4 = 0
            return r4
        L51:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.TimerScopeKt.withTimerOrNull(androidx.glance.session.TimeSource, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
