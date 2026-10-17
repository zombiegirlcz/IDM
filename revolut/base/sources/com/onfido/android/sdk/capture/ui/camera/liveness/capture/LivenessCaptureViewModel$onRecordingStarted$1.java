package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import a10.b;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import vkm.q;
import vkm.v1;
import vkm.y;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1", f = "LivenessCaptureViewModel.kt", l = {181}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LivenessCaptureViewModel$onRecordingStarted$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ VideoCaptureConfig $videoCaptureConfig;
    int label;
    final /* synthetic */ LivenessCaptureViewModel this$0;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$1", f = "LivenessCaptureViewModel.kt", l = {171, 172}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LivenessCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LivenessCaptureViewModel livenessCaptureViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = livenessCaptureViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj2;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[PHI: r1
          0x0046: PHI (r1v3 kotlinx.coroutines.flow.FlowCollector) = (r1v4 kotlinx.coroutines.flow.FlowCollector), (r1v6 kotlinx.coroutines.flow.FlowCollector) binds: [B:12:0x0043, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:11:0x002c). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                yhm.o.b(r7)
                goto L2c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                yhm.o.b(r7)
                goto L46
            L24:
                yhm.o.b(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            L2c:
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel r7 = r6.this$0
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessInteractor r7 = com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel.access$getLivenessInteractor$p(r7)
                long r4 = r7.getAvailableStorageSpace()
                java.lang.Long r7 = new java.lang.Long
                r7.<init>(r4)
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L46
                goto L52
            L46:
                r6.L$0 = r1
                r6.label = r2
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = skm.k0.b(r4, r6)
                if (r7 != r0) goto L2c
            L52:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$2", f = "LivenessCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Throwable th10 = (Throwable) this.L$0;
            Timber.INSTANCE.e(th10, b.u(new StringBuilder("Error on available storage calculation: "), th10), new Object[0]);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull Throwable th10, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = th10;
            return anonymousClass2.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessCaptureViewModel$onRecordingStarted$1(LivenessCaptureViewModel livenessCaptureViewModel, VideoCaptureConfig videoCaptureConfig, Continuation<? super LivenessCaptureViewModel$onRecordingStarted$1> continuation) {
        super(2, continuation);
        this.this$0 = livenessCaptureViewModel;
        this.$videoCaptureConfig = videoCaptureConfig;
    }

    @Override // gim.a
    @NotNull
    public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
        return new LivenessCaptureViewModel$onRecordingStarted$1(this.this$0, this.$videoCaptureConfig, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            final y yVar = new y(new v1(new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null));
            final VideoCaptureConfig videoCaptureConfig = this.$videoCaptureConfig;
            Flow flowC = q.C(q.P(new Flow() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ VideoCaptureConfig $videoCaptureConfig$inlined;

                    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2", f = "LivenessCaptureViewModel.kt", l = {PassportService.DEFAULT_MAX_BLOCKSIZE}, m = "emit")
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // gim.a
                        public final Object invokeSuspend(@NotNull Object obj2) {
                            this.result = obj2;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, VideoCaptureConfig videoCaptureConfig) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$videoCaptureConfig$inlined = videoCaptureConfig;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r10) {
                        /*
                            r8 = this;
                            boolean r0 = r10 instanceof com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r10
                            com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r10)
                        L18:
                            java.lang.Object r10 = r0.result
                            fim.a r1 = fim.a.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            yhm.o.b(r10)
                            goto L4e
                        L27:
                            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                            r9.<init>(r10)
                            throw r9
                        L2f:
                            yhm.o.b(r10)
                            kotlinx.coroutines.flow.FlowCollector r10 = r8.$this_unsafeFlow
                            r2 = r9
                            java.lang.Number r2 = (java.lang.Number) r2
                            long r4 = r2.longValue()
                            com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig r2 = r8.$videoCaptureConfig$inlined
                            long r6 = r2.getOutOfStorageThreshold()
                            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r2 >= 0) goto L4e
                            r0.label = r3
                            java.lang.Object r9 = r10.emit(r9, r0)
                            if (r9 != r1) goto L4e
                            return r1
                        L4e:
                            kotlin.Unit r9 = kotlin.Unit.f186387a
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = yVar.collect(new AnonymousClass2(flowCollector, videoCaptureConfig), continuation);
                    return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
                }
            }, 1), this.this$0.dispatchersProvider.mo3706getDefault());
            final LivenessCaptureViewModel livenessCaptureViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureViewModel$onRecordingStarted$1.4
                public final Object emit(long j2, @NotNull Continuation<? super Unit> continuation) {
                    livenessCaptureViewModel.getStorageThresholdReachedLiveData$onfido_capture_sdk_core_release().postValue(Boolean.TRUE);
                    return Unit.f186387a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                    return emit(((Number) obj3).longValue(), (Continuation<? super Unit>) continuation);
                }
            };
            this.label = 1;
            if (flowC.collect(flowCollector, this) == aVar) {
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
        return ((LivenessCaptureViewModel$onRecordingStarted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
