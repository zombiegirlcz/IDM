package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.core.Log;
import gim.d;
import gim.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import skm.c2;
import skm.e0;
import skm.q;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"androidx/camera/camera2/pipe/compat/Camera2CameraAvailabilityMonitor$startMonitoring$2", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor$Session;", "", "timeoutMillis", "", "awaitAvailableCamera", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "close", "()V", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lskm/q;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2 implements CameraAvailabilityMonitor.Session {
    private final CopyOnWriteArrayList<q> listeners;
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$1", f = "RetryingCameraStateOpener.kt", l = {170}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $cameraId;
        int label;
        final /* synthetic */ Camera2CameraAvailabilityMonitor this$0;
        final /* synthetic */ Camera2CameraAvailabilityMonitor$startMonitoring$2 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, String str, Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = camera2CameraAvailabilityMonitor;
            this.$cameraId = str;
            this.this$1 = camera2CameraAvailabilityMonitor$startMonitoring$2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$cameraId, this.this$1, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Flow flow = this.this$0.availableCameraFlow;
                final String str = this.$cameraId;
                final Camera2CameraAvailabilityMonitor$startMonitoring$2 camera2CameraAvailabilityMonitor$startMonitoring$2 = this.this$1;
                FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor.startMonitoring.2.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                        return m381emit0r8Bogc(((CameraId) obj3).getValue(), continuation);
                    }

                    /* JADX INFO: renamed from: emit-0r8Bogc, reason: not valid java name */
                    public final Object m381emit0r8Bogc(String str2, Continuation<? super Unit> continuation) {
                        if (CameraId.m184equalsimpl0(str2, str)) {
                            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                String str3 = ((Object) CameraId.m186toStringimpl(str2)) + " has become available! Notifying listeners...";
                            }
                            Iterator it8 = camera2CameraAvailabilityMonitor$startMonitoring$2.listeners.iterator();
                            Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                            while (it8.hasNext()) {
                                ((r) ((q) it8.next())).U(Unit.f186387a);
                            }
                        }
                        return Unit.f186387a;
                    }
                };
                this.label = 1;
                if (flow.collect(flowCollector, this) == aVar) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public Camera2CameraAvailabilityMonitor$startMonitoring$2(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, String str) {
        zkm.d dVarC = e0.c(camera2CameraAvailabilityMonitor.threads.getBackgroundDispatcher().plus(new c2(camera2CameraAvailabilityMonitor.cameraPipeJob)));
        this.scope = dVarC;
        this.listeners = new CopyOnWriteArrayList<>();
        e0.C(dVarC, null, null, new AnonymousClass1(camera2CameraAvailabilityMonitor, str, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor.Session
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitAvailableCamera(long r7, kotlin.coroutines.Continuation<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.L$0
            skm.q r7 = (skm.q) r7
            yhm.o.b(r9)
            goto L53
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            skm.r r9 = skm.e0.b()
            java.util.concurrent.CopyOnWriteArrayList<skm.q> r2 = r6.listeners
            r2.add(r9)
            androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1 r2 = new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1
            r4 = 0
            r2.<init>(r9, r4)
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r7 = skm.h2.d(r7, r2, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r5 = r9
            r9 = r7
            r7 = r5
        L53:
            if (r9 == 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            java.util.concurrent.CopyOnWriteArrayList<skm.q> r8 = r6.listeners
            r8.remove(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2.awaitAvailableCamera(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e0.k(this.scope, null);
    }
}
