package com.onfido.android.sdk.capture.utils;

import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1", f = "FlowExt.kt", l = {40}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 9, 0})
public final class FlowExtKt$onTrue$$inlined$transform$1 extends i implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $action$inlined;
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $$this$flow;
        final /* synthetic */ Function1 $action$inlined;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1", f = "FlowExt.kt", l = {BERTags.FLAGS, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION}, m = "emit")
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03811 extends c {
            Object L$0;
            boolean Z$0;
            int label;
            /* synthetic */ Object result;

            public C03811(Continuation continuation) {
                super(continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                this.result = obj2;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, Function1 function1) {
            this.$action$inlined = function1;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r2.emit(r6, r0) == r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1.AnonymousClass1.C03811
                if (r0 == 0) goto L13
                r0 = r7
                com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1$1 r0 = (com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1.AnonymousClass1.C03811) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1$1 r0 = new com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1$1$1
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.result
                fim.a r1 = fim.a.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                yhm.o.b(r7)
                goto L68
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                boolean r6 = r0.Z$0
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                yhm.o.b(r7)
                goto L58
            L3c:
                yhm.o.b(r7)
                kotlinx.coroutines.flow.FlowCollector r2 = r5.$$this$flow
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L58
                kotlin.jvm.functions.Function1 r7 = r5.$action$inlined
                r0.L$0 = r2
                r0.Z$0 = r6
                r0.label = r4
                java.lang.Object r7 = r7.invoke(r0)
                if (r7 != r1) goto L58
                goto L67
            L58:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                r7 = 0
                r0.L$0 = r7
                r0.label = r3
                java.lang.Object r6 = r2.emit(r6, r0)
                if (r6 != r1) goto L68
            L67:
                return r1
            L68:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.utils.FlowExtKt$onTrue$$inlined$transform$1.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$onTrue$$inlined$transform$1(Flow flow, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.$this_transform = flow;
        this.$action$inlined = function1;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        FlowExtKt$onTrue$$inlined$transform$1 flowExtKt$onTrue$$inlined$transform$1 = new FlowExtKt$onTrue$$inlined$transform$1(this.$this_transform, continuation, this.$action$inlined);
        flowExtKt$onTrue$$inlined$transform$1.L$0 = obj2;
        return flowExtKt$onTrue$$inlined$transform$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = this.$this_transform;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(flowCollector, this.$action$inlined);
            this.label = 1;
            if (flow.collect(anonymousClass1, this) == aVar) {
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
    public final Object invoke(@NotNull FlowCollector flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$onTrue$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
    }
}
