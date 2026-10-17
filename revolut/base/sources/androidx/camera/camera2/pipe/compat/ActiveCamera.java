package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.core.WakeLock;
import gim.d;
import gim.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.q;
import vqd.b;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/camera/camera2/pipe/compat/ActiveCamera;", "", "androidCameraState", "Landroidx/camera/camera2/pipe/compat/AndroidCameraState;", "allCameraIds", "", "Landroidx/camera/camera2/pipe/CameraId;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "closeCallback", "Lkotlin/Function1;", "", "<init>", "(Landroidx/camera/camera2/pipe/compat/AndroidCameraState;Ljava/util/Set;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "getAllCameraIds$camera_camera2_pipe", "()Ljava/util/Set;", "cameraId", "getCameraId-Dz_R5H8", "()Ljava/lang/String;", "current", "Landroidx/camera/camera2/pipe/compat/VirtualCameraState;", "wakelock", "Landroidx/camera/camera2/pipe/core/WakeLock;", "acquire", "Landroidx/camera/camera2/pipe/core/Token;", "connectTo", "virtualCameraState", "token", "(Landroidx/camera/camera2/pipe/compat/VirtualCameraState;Landroidx/camera/camera2/pipe/core/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "awaitClosed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ActiveCamera {

    @NotNull
    private final Set<CameraId> allCameraIds;

    @NotNull
    private final AndroidCameraState androidCameraState;
    private VirtualCameraState current;

    @NotNull
    private final WakeLock wakelock;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.compat.ActiveCamera$1", f = "Camera2DeviceManager.kt", l = {137}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: androidx.camera.camera2.pipe.compat.ActiveCamera$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.camera.camera2.pipe.compat.ActiveCamera$1$1", f = "Camera2DeviceManager.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C00201 extends i implements Function2<CameraState, Continuation<? super Boolean>, Object> {
            /* synthetic */ Object L$0;
            int label;

            public C00201(Continuation<? super C00201> continuation) {
                super(2, continuation);
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                C00201 c00201 = new C00201(continuation);
                c00201.L$0 = obj2;
                return c00201;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CameraState cameraState, Continuation<? super Boolean> continuation) {
                return ((C00201) create(cameraState, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                CameraState cameraState = (CameraState) this.L$0;
                return Boolean.valueOf((cameraState instanceof CameraStateClosing) || (cameraState instanceof CameraStateClosed));
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return ActiveCamera.this.new AnonymousClass1(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                StateFlow state = ActiveCamera.this.androidCameraState.getState();
                C00201 c00201 = new C00201(null);
                this.label = 1;
                if (q.y(state, c00201, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            ActiveCamera.this.wakelock.release();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public ActiveCamera(@NotNull AndroidCameraState androidCameraState, @NotNull Set<CameraId> allCameraIds, @NotNull CoroutineScope scope, @NotNull Function1<? super ActiveCamera, Unit> closeCallback) {
        Intrinsics.checkNotNullParameter(androidCameraState, "androidCameraState");
        Intrinsics.checkNotNullParameter(allCameraIds, "allCameraIds");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(closeCallback, "closeCallback");
        this.androidCameraState = androidCameraState;
        this.allCameraIds = allCameraIds;
        this.wakelock = new WakeLock(scope, 1000L, true, new b(closeCallback, this, 21));
        e0.C(scope, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wakelock$lambda$0(Function1 function1, ActiveCamera activeCamera) {
        function1.invoke(activeCamera);
        return Unit.f186387a;
    }

    public final Token acquire() {
        return this.wakelock.acquire();
    }

    public final Object awaitClosed(@NotNull Continuation<? super Unit> continuation) {
        Object objAwaitClosed = this.androidCameraState.awaitClosed(continuation);
        return objAwaitClosed == fim.a.COROUTINE_SUSPENDED ? objAwaitClosed : Unit.f186387a;
    }

    public final void close() throws Throwable {
        this.wakelock.release();
        this.androidCameraState.close();
    }

    public final Object connectTo(@NotNull VirtualCameraState virtualCameraState, Token token, @NotNull Continuation<? super Unit> continuation) {
        VirtualCameraState virtualCameraState2 = this.current;
        this.current = virtualCameraState;
        if (virtualCameraState2 != null) {
            VirtualCamera.m431disconnectTPqeGZw$default(virtualCameraState2, null, 1, null);
        }
        Object objConnect$camera_camera2_pipe = virtualCameraState.connect$camera_camera2_pipe(this.androidCameraState.getState(), token, continuation);
        return objConnect$camera_camera2_pipe == fim.a.COROUTINE_SUSPENDED ? objConnect$camera_camera2_pipe : Unit.f186387a;
    }

    @NotNull
    public final Set<CameraId> getAllCameraIds$camera_camera2_pipe() {
        return this.allCameraIds;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m362getCameraIdDz_R5H8() {
        return this.androidCameraState.getCameraId();
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ActiveCamera(cameraId=");
        sb6.append((Object) CameraId.m186toStringimpl(m362getCameraIdDz_R5H8()));
        sb6.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        return sb6.toString();
    }
}
