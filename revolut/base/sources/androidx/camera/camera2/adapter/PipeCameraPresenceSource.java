package androidx.camera.camera2.adapter;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.impl.AbstractCameraPresenceSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.concurrent.futures.ListenableFutureKt;
import com.google.common.util.concurrent.ListenableFuture;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mzj.j;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.q;
import vkm.q0;
import vkm.y;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB9\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0018H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/camera/camera2/adapter/PipeCameraPresenceSource;", "Landroidx/camera/core/impl/AbstractCameraPresenceSource;", "idFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/camera/camera2/pipe/CameraId;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "initialCameraIds", "", "context", "Landroid/content/Context;", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Ljava/util/List;Landroid/content/Context;)V", "isMonitoring", "Ljava/util/concurrent/atomic/AtomicBoolean;", "flowCollectionJob", "Lkotlinx/coroutines/Job;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "startMonitoring", "", "stopMonitoring", "fetchData", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/core/CameraIdentifier;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PipeCameraPresenceSource extends AbstractCameraPresenceSource {

    @NotNull
    private final CameraManager cameraManager;

    @NotNull
    private final CoroutineScope coroutineScope;
    private Job flowCollectionJob;

    @NotNull
    private final Flow idFlow;

    @NotNull
    private final AtomicBoolean isMonitoring;

    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$2", f = "PipeCameraPresenceSource.kt", l = {84}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "identifiers", "", "Landroidx/camera/core/CameraIdentifier;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<List<? extends CameraIdentifier>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref$BooleanRef $isFirstEmission;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref$BooleanRef ref$BooleanRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isFirstEmission = ref$BooleanRef;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = PipeCameraPresenceSource.this.new AnonymousClass2(this.$isFirstEmission, continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                List list = (List) this.L$0;
                j6.a.C(new StringBuilder("Flow emitted new camera set: "), d0.k0(list, null, null, null, 0, null, 63), "PipePresenceSrc");
                if (!PipeCameraPresenceSource.this.isMonitoring.get()) {
                    mo3.a.b(0);
                } else if (this.$isFirstEmission.f186407a) {
                    ListenableFuture<List<CameraIdentifier>> listenableFutureFetchData = PipeCameraPresenceSource.this.fetchData();
                    this.label = 1;
                    if (ListenableFutureKt.await(listenableFutureFetchData, this) == aVar) {
                        return aVar;
                    }
                } else {
                    PipeCameraPresenceSource.this.updateData(list);
                }
                return Unit.f186387a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            this.$isFirstEmission.f186407a = false;
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<CameraIdentifier> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3, reason: invalid class name */
    @d(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$3", f = "PipeCameraPresenceSource.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Landroidx/camera/core/CameraIdentifier;", "e", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(3, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            Throwable th10 = (Throwable) this.L$0;
            if (PipeCameraPresenceSource.this.isMonitoring.get()) {
                PipeCameraPresenceSource.this.updateError(th10);
            } else {
                mo3.a.b(0);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = PipeCameraPresenceSource.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = th10;
            return anonymousClass3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipeCameraPresenceSource(@NotNull Flow idFlow, @NotNull CoroutineScope coroutineScope, @NotNull List<String> initialCameraIds, @NotNull Context context) {
        super(initialCameraIds);
        Intrinsics.checkNotNullParameter(idFlow, "idFlow");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(initialCameraIds, "initialCameraIds");
        Intrinsics.checkNotNullParameter(context, "context");
        this.idFlow = idFlow;
        this.coroutineScope = coroutineScope;
        this.isMonitoring = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        this.cameraManager = (CameraManager) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object fetchData$lambda$0(PipeCameraPresenceSource pipeCameraPresenceSource, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(completer, "completer");
        e0.C(pipeCameraPresenceSource.coroutineScope, null, null, new PipeCameraPresenceSource$fetchData$1$1(pipeCameraPresenceSource, completer, null), 3);
        return "FetchData for PipeCameraPresence0";
    }

    @Override // androidx.camera.core.impl.Observable
    @NotNull
    public ListenableFuture<List<CameraIdentifier>> fetchData() {
        ListenableFuture<List<CameraIdentifier>> future = CallbackToFutureAdapter.getFuture(new j(this, 6));
        Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
        return future;
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public void startMonitoring() {
        if (this.isMonitoring.compareAndSet(false, true)) {
            Job job2 = this.flowCollectionJob;
            if (job2 != null) {
                job2.f(null);
            }
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.f186407a = true;
            final Flow flow = this.idFlow;
            this.flowCollectionJob = q.G(new y(new q0(new Flow() { // from class: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1

                /* JADX INFO: renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1, reason: invalid class name */
                    @d(c = "androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2", f = "PipeCameraPresenceSource.kt", l = {50}, m = "emit", v = 1)
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class AnonymousClass1 extends c {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // gim.a
                        public final Object invokeSuspend(Object obj2) {
                            this.result = obj2;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                        /*
                            r9 = this;
                            boolean r0 = r11 instanceof androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r11
                            androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 r0 = (androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1 r0 = new androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1$2$1
                            r0.<init>(r11)
                        L18:
                            java.lang.Object r11 = r0.result
                            fim.a r1 = fim.a.COROUTINE_SUSPENDED
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            yhm.o.b(r11)
                            goto L79
                        L27:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r11)
                            throw r10
                        L2f:
                            yhm.o.b(r11)
                            kotlinx.coroutines.flow.FlowCollector r11 = r9.$this_unsafeFlow
                            java.util.List r10 = (java.util.List) r10
                            java.lang.Iterable r10 = (java.lang.Iterable) r10
                            java.util.ArrayList r2 = new java.util.ArrayList
                            r2.<init>()
                            java.util.Iterator r10 = r10.iterator()
                        L41:
                            boolean r4 = r10.hasNext()
                            if (r4 == 0) goto L70
                            java.lang.Object r4 = r10.next()
                            androidx.camera.camera2.pipe.CameraId r4 = (androidx.camera.camera2.pipe.CameraId) r4
                            java.lang.String r4 = r4.getValue()
                            r5 = 6
                            r6 = 0
                            androidx.camera.core.CameraIdentifier r6 = androidx.camera.core.CameraIdentifier.Factory.create$default(r4, r6, r6, r5, r6)     // Catch: java.lang.Exception -> L58
                            goto L6a
                        L58:
                            r5 = move-exception
                            java.lang.StringBuilder r7 = new java.lang.StringBuilder
                            java.lang.String r8 = "Failed to create CameraIdentifier for pipeId: "
                            r7.<init>(r8)
                            r7.append(r4)
                            java.lang.String r4 = r7.toString()
                            java.lang.String r7 = "PipePresenceSrc"
                        L6a:
                            if (r6 == 0) goto L41
                            r2.add(r6)
                            goto L41
                        L70:
                            r0.label = r3
                            java.lang.Object r10 = r11.emit(r2, r0)
                            if (r10 != r1) goto L79
                            return r1
                        L79:
                            kotlin.Unit r10 = kotlin.Unit.f186387a
                            return r10
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.PipeCameraPresenceSource$startMonitoring$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
                }
            }, new AnonymousClass2(ref$BooleanRef, null), 1), new AnonymousClass3(null)), this.coroutineScope);
        }
    }

    @Override // androidx.camera.core.impl.AbstractCameraPresenceSource
    public void stopMonitoring() {
        if (this.isMonitoring.compareAndSet(true, false)) {
            Job job2 = this.flowCollectionJob;
            if (job2 != null) {
                job2.f(null);
            }
            this.flowCollectionJob = null;
        }
    }
}
