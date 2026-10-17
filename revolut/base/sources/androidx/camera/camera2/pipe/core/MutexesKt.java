package androidx.camera.camera2.pipe.core;

import fim.h;
import gim.d;
import gim.i;
import hlm.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import skm.d0;
import skm.e0;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0005*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u0005*\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/core/CoroutineMutex;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlinx/coroutines/Job;", "withLockLaunch", "(Landroidx/camera/camera2/pipe/core/CoroutineMutex;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "Lhlm/a;", "lockWithoutOwner", "(Lhlm/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockAndSuspend", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class MutexesKt {

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.core.MutexesKt$withLockLaunch$1", f = "Mutexes.kt", l = {177, 90}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ CoroutineMutex $this_withLockLaunch;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CoroutineMutex coroutineMutex, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_withLockLaunch = coroutineMutex;
            this.$block = function2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_withLockLaunch, this.$block, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws Throwable {
            a mutex;
            Function2<CoroutineScope, Continuation<? super Unit>, Object> function2;
            a aVar;
            Throwable th10;
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o.b(obj2);
                    e0.q((CoroutineScope) this.L$0);
                    mutex = this.$this_withLockLaunch.getMutex();
                    function2 = this.$block;
                    this.L$0 = mutex;
                    this.L$1 = function2;
                    this.label = 1;
                    if (MutexesKt.lockAndSuspend(mutex, this) != aVar2) {
                    }
                    return aVar2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) this.L$0;
                    try {
                        o.b(obj2);
                        Unit unit = Unit.f186387a;
                        aVar.unlock(null);
                        return Unit.f186387a;
                    } catch (Throwable th11) {
                        th10 = th11;
                        aVar.unlock(null);
                        throw th10;
                    }
                }
                function2 = (Function2) this.L$1;
                a aVar3 = (a) this.L$0;
                o.b(obj2);
                mutex = aVar3;
                this.L$0 = mutex;
                this.L$1 = null;
                this.label = 2;
                if (e0.o(function2, this) != aVar2) {
                    aVar = mutex;
                    Unit unit2 = Unit.f186387a;
                    aVar.unlock(null);
                    return Unit.f186387a;
                }
                return aVar2;
            } catch (Throwable th12) {
                aVar = mutex;
                th10 = th12;
                aVar.unlock(null);
                throw th10;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lockAndSuspend(a aVar, Continuation<? super Unit> continuation) {
        Object objC = h.c(MutexesKt$lockAndSuspend$lockFn$1.INSTANCE, aVar, continuation);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objC != aVar2) {
            Continuation continuationB = h.b(continuation);
            Unit unit = Unit.f186387a;
            m.Companion companion = m.INSTANCE;
            continuationB.resumeWith(unit);
        }
        nim.a.C(continuation);
        return aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object lockWithoutOwner(a aVar, Continuation<? super Unit> continuation) {
        Object objLock = aVar.lock(null, continuation);
        return objLock == fim.a.COROUTINE_SUSPENDED ? objLock : Unit.f186387a;
    }

    @NotNull
    public static final Job withLockLaunch(@NotNull CoroutineMutex coroutineMutex, @NotNull CoroutineScope scope, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(coroutineMutex, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(block, "block");
        return e0.C(scope, null, d0.UNDISPATCHED, new AnonymousClass1(coroutineMutex, block, null), 1);
    }
}
