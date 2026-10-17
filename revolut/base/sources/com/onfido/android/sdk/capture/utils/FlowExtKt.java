package com.onfido.android.sdk.capture.utils;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import eg.n0;
import gim.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.k0;
import vkm.q;
import vkm.v1;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080@¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\t*\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\nH\u0000\u001a.\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\t*\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000eH\u0080@¢\u0006\u0002\u0010\u000f\u001a&\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012*\b\u0012\u0004\u0012\u00020\u00060\u00122\u001c\u0010\u0018\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019H\u0000¢\u0006\u0002\u0010\u001c\u001a2\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\t0\u0012\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00060\u0019H\u0000¨\u0006 "}, d2 = {"delayUntil", "", "timeout", "", "condition", "Lkotlin/Function0;", "", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clear", "T", "Lkotlinx/coroutines/flow/MutableStateFlow;", "collectNotNull", "Lkotlinx/coroutines/flow/StateFlow;", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchInAndRepeat", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/flow/Flow;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "repeatState", "Landroidx/lifecycle/Lifecycle$State;", "onTrue", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "skipWhile", "Lkotlinx/coroutines/flow/SharedFlow;", "predicate", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt", f = "FlowExt.kt", l = {30, 37}, m = "delayUntil")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return FlowExtKt.delayUntil(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$2", f = "FlowExt.kt", l = {32}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<Boolean> $condition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Boolean> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$condition = function0;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$condition, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            while (!((Boolean) this.$condition.invoke()).booleanValue()) {
                this.label = 1;
                if (k0.b(1L, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$launchInAndRepeat$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt$launchInAndRepeat$1", f = "FlowExt.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21581 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ Lifecycle.State $repeatState;
        final /* synthetic */ Flow $this_launchInAndRepeat;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$launchInAndRepeat$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt$launchInAndRepeat$1$1", f = "FlowExt.kt", l = {47}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03801 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Flow $this_launchInAndRepeat;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03801(Flow flow, Continuation<? super C03801> continuation) {
                super(2, continuation);
                this.$this_launchInAndRepeat = flow;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03801(this.$this_launchInAndRepeat, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    Flow flow = this.$this_launchInAndRepeat;
                    this.label = 1;
                    if (q.n(flow, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03801) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21581(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow flow, Continuation<? super C21581> continuation) {
            super(2, continuation);
            this.$lifecycleOwner = lifecycleOwner;
            this.$repeatState = state;
            this.$this_launchInAndRepeat = flow;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new C21581(this.$lifecycleOwner, this.$repeatState, this.$this_launchInAndRepeat, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
                Lifecycle.State state = this.$repeatState;
                C03801 c03801 = new C03801(this.$this_launchInAndRepeat, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c03801, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21581) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final <T> void clear(@NotNull MutableStateFlow mutableStateFlow) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<this>");
        while (!mutableStateFlow.h(mutableStateFlow.getValue(), null)) {
        }
    }

    public static final <T> Object collectNotNull(@NotNull StateFlow stateFlow, @NotNull FlowCollector flowCollector, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = stateFlow.collect(new n0(flowCollector, 7), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (skm.h2.b(r7, r10, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object delayUntil(long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.onfido.android.sdk.capture.utils.FlowExtKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$1 r0 = (com.onfido.android.sdk.capture.utils.FlowExtKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$1 r0 = new com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.L$0
            r9 = r7
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            yhm.o.b(r10)
            goto L56
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            yhm.o.b(r10)
            goto L53
        L3b:
            yhm.o.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 <= 0) goto L56
            com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$2 r10 = new com.onfido.android.sdk.capture.utils.FlowExtKt$delayUntil$2
            r2 = 0
            r10.<init>(r9, r2)
            r0.label = r4
            java.lang.Object r7 = skm.h2.b(r7, r10, r0)
            if (r7 != r1) goto L53
            goto L6e
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L56:
            java.lang.Object r7 = r9.invoke()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6f
            r0.L$0 = r9
            r0.label = r3
            r7 = 1
            java.lang.Object r7 = skm.k0.b(r7, r0)
            if (r7 != r1) goto L56
        L6e:
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.utils.FlowExtKt.delayUntil(long, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object delayUntil$default(long j2, Function0 function0, Continuation continuation, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = -1;
        }
        return delayUntil(j2, function0, continuation);
    }

    @NotNull
    public static final <T> Job launchInAndRepeat(@NotNull Flow flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State repeatState) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(repeatState, "repeatState");
        return e0.C(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new C21581(lifecycleOwner, repeatState, flow, null), 3);
    }

    @NotNull
    public static final Flow onTrue(@NotNull Flow flow, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        return new v1(new FlowExtKt$onTrue$$inlined$transform$1(flow, null, action));
    }

    @NotNull
    public static final <T> Flow skipWhile(@NotNull SharedFlow sharedFlow, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(sharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new v1(new FlowExtKt$skipWhile$$inlined$transform$1(sharedFlow, null, predicate));
    }
}
