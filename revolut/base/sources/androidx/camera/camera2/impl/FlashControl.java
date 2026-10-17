package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import ryd.k;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b'\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u0010\u0010R*\u0010\u001b\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u001a8F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00101\u0012\u0004\b6\u0010\u0010\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R(\u0010!\u001a\u0004\u0018\u00010 2\b\u00103\u001a\u0004\u0018\u00010 8F@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b9\u0010:R\u001e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R0\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00132\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138F@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u0017R(\u0010E\u001a\u0004\u0018\u00010-2\b\u00103\u001a\u0004\u0018\u00010-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006F"}, d2 = {"Landroidx/camera/camera2/impl/FlashControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/impl/State3AControl;", "state3AControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;", "useFlashModeTorchFor3aUpdate", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/impl/State3AControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;)V", "", "stopRunningTask", "()V", "", "timeoutMillis", "Lskm/g0;", "applyScreenFlash", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setExternalFlashAeModeAsync", "()Lskm/g0;", "setTorchForScreenFlash", "reset", "", "flashMode", "", "cancelPreviousTask", "setFlashAsync", "(IZ)Lskm/g0;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "screenFlash", "setScreenFlash", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "startScreenFlashCaptureTasks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopScreenFlashCaptureTasks", "awaitFlashModeUpdate", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/impl/State3AControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/compat/workaround/UseFlashModeTorchFor3aUpdate;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "_flashMode", "I", "get_flashMode$annotations", "value", "getFlashMode", "()I", "getFlashMode$annotations", "_screenFlash", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "getScreenFlash", "()Landroidx/camera/core/ImageCapture$ScreenFlash;", "Lskm/q;", "_updateSignal", "Lskm/q;", "updateSignal", "Lskm/g0;", "getUpdateSignal", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlashControl implements UseCaseCameraControl {
    private volatile int _flashMode;
    private UseCaseCameraRequestControl _requestControl;
    private volatile ImageCapture.ScreenFlash _screenFlash;
    private q _updateSignal;

    @NotNull
    private final CameraProperties cameraProperties;
    private int flashMode;
    private ImageCapture.ScreenFlash screenFlash;

    @NotNull
    private final State3AControl state3AControl;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final TorchControl torchControl;

    @NotNull
    private g0 updateSignal;

    @NotNull
    private final UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate;

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", l = {171}, m = "applyScreenFlash", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        long J$0;
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
            return FlashControl.this.applyScreenFlash(0L, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2", f = "FlashControl.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageCapture.ScreenFlashListener $screenFlashListener;
        final /* synthetic */ long $timeoutMillis;
        int label;
        final /* synthetic */ FlashControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j2, FlashControl flashControl, ImageCapture.ScreenFlashListener screenFlashListener, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$timeoutMillis = j2;
            this.this$0 = flashControl;
            this.$screenFlashListener = screenFlashListener;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass2(this.$timeoutMillis, this.this$0, this.$screenFlashListener, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            long jCurrentTimeMillis = System.currentTimeMillis() + this.$timeoutMillis;
            ImageCapture.ScreenFlash screenFlash = this.this$0.get_screenFlash();
            if (screenFlash != null) {
                screenFlash.apply(jCurrentTimeMillis, this.$screenFlashListener);
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + jCurrentTimeMillis;
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3", f = "FlashControl.kt", l = {188}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ q $onApplyCompletedSignal;
        final /* synthetic */ long $timeoutMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(q qVar, long j2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$onApplyCompletedSignal = qVar;
            this.$timeoutMillis = j2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass3(this.$onApplyCompletedSignal, this.$timeoutMillis, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
                q qVar = this.$onApplyCompletedSignal;
                long j2 = this.$timeoutMillis;
                this.label = 1;
                obj2 = CoroutineAdaptersKt.awaitUntil(qVar, j2, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            if (((Boolean) obj2).booleanValue()) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
            } else {
                Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                long j3 = this.$timeoutMillis;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused3 = Camera2Logger.TRUNCATED_TAG;
                    String str = "applyScreenFlash: ScreenFlashListener completion timed out after " + j3 + " ms";
                }
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", l = {284}, m = "awaitFlashModeUpdate", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18251 extends c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C18251(Continuation<? super C18251> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.awaitFlashModeUpdate(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", l = {149, 160}, m = "startScreenFlashCaptureTasks", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18261 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18261(Continuation<? super C18261> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.startScreenFlashCaptureTasks(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.FlashControl", f = "FlashControl.kt", l = {260}, m = "stopScreenFlashCaptureTasks", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18271 extends c {
        int label;
        /* synthetic */ Object result;

        public C18271(Continuation<? super C18271> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return FlashControl.this.stopScreenFlashCaptureTasks(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2", f = "FlashControl.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18282 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C18282(Continuation<? super C18282> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return FlashControl.this.new C18282(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            ImageCapture.ScreenFlash screenFlash = FlashControl.this.get_screenFlash();
            if (screenFlash != null) {
                screenFlash.clear();
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18282) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public FlashControl(@NotNull CameraProperties cameraProperties, @NotNull State3AControl state3AControl, @NotNull UseCaseThreads threads, @NotNull TorchControl torchControl, @NotNull UseFlashModeTorchFor3aUpdate useFlashModeTorchFor3aUpdate) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(state3AControl, "state3AControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(torchControl, "torchControl");
        Intrinsics.checkNotNullParameter(useFlashModeTorchFor3aUpdate, "useFlashModeTorchFor3aUpdate");
        this.cameraProperties = cameraProperties;
        this.state3AControl = state3AControl;
        this.threads = threads;
        this.torchControl = torchControl;
        this.useFlashModeTorchFor3aUpdate = useFlashModeTorchFor3aUpdate;
        this._flashMode = 2;
        this.flashMode = this._flashMode;
        this.screenFlash = this._screenFlash;
        this.updateSignal = e0.a(Unit.f186387a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyScreenFlash(long r11, kotlin.coroutines.Continuation<? super skm.g0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.FlashControl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1 r0 = (androidx.camera.camera2.impl.FlashControl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1 r0 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            long r11 = r0.J$0
            java.lang.Object r0 = r0.L$0
            skm.q r0 = (skm.q) r0
            yhm.o.b(r13)
            r7 = r10
            goto L5f
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            yhm.o.b(r13)
            skm.r r13 = skm.e0.b()
            ryd.j r8 = new ryd.j
            r2 = 17
            r8.<init>(r13, r2)
            skm.p0 r2 = skm.p0.f264001a
            tkm.e r2 = zkm.o.f323119a
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2 r4 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2
            r9 = 0
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r0.L$0 = r13
            r0.J$0 = r5
            r0.label = r3
            java.lang.Object r11 = skm.e0.J(r2, r4, r0)
            if (r11 != r1) goto L5d
            return r1
        L5d:
            r0 = r13
            r11 = r5
        L5f:
            androidx.camera.camera2.impl.UseCaseThreads r13 = r7.threads
            kotlinx.coroutines.CoroutineScope r13 = r13.getScope()
            androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3 r1 = new androidx.camera.camera2.impl.FlashControl$applyScreenFlash$3
            r2 = 0
            r1.<init>(r0, r11, r2)
            r11 = 3
            skm.h0 r11 = skm.e0.g(r13, r2, r2, r1, r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.applyScreenFlash(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyScreenFlash$lambda$0(q qVar) {
        ((r) qVar).U(Unit.f186387a);
    }

    private final g0 setExternalFlashAeModeAsync() {
        boolean zIsExternalFlashAeModeSupported = CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(this.cameraProperties.getMetadata());
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "setExternalFlashAeModeAsync: isExternalFlashAeModeSupported = " + zIsExternalFlashAeModeSupported;
        }
        if (!zIsExternalFlashAeModeSupported) {
            return null;
        }
        g0 tryExternalFlashAeModeAsync = this.state3AControl.setTryExternalFlashAeModeAsync(true);
        if (Logger.isDebugEnabled("CXCP")) {
            String unused2 = Camera2Logger.TRUNCATED_TAG;
        }
        tryExternalFlashAeModeAsync.k(new k(14));
        return tryExternalFlashAeModeAsync;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setExternalFlashAeModeAsync$lambda$1$1(Throwable th10) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        return Unit.f186387a;
    }

    public static /* synthetic */ g0 setFlashAsync$default(FlashControl flashControl, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return flashControl.setFlashAsync(i, z);
    }

    private final g0 setTorchForScreenFlash() {
        boolean zShouldUseFlashModeTorch = this.useFlashModeTorchFor3aUpdate.shouldUseFlashModeTorch();
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "setTorchIfRequired: shouldUseFlashModeTorch = " + zShouldUseFlashModeTorch;
        }
        if (!zShouldUseFlashModeTorch) {
            return null;
        }
        g0 g0VarM39setTorchAsyncOup_wC0$camera_camera2$default = TorchControl.m39setTorchAsyncOup_wC0$camera_camera2$default(this.torchControl, TorchControl.TorchMode.INSTANCE.m51getUSED_AS_FLASHIRs_R8(), false, true, 2, null);
        if (Logger.isDebugEnabled("CXCP")) {
            String unused2 = Camera2Logger.TRUNCATED_TAG;
        }
        g0VarM39setTorchAsyncOup_wC0$camera_camera2$default.k(new k(13));
        return g0VarM39setTorchAsyncOup_wC0$camera_camera2$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setTorchForScreenFlash$lambda$1$1(Throwable th10) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        return Unit.f186387a;
    }

    private final void stopRunningTask() {
        q qVar = this._updateSignal;
        if (qVar != null) {
            ((r) qVar).h0(new CameraControl.OperationCanceledException("There is a new flash mode being set or camera was closed"));
        }
        this._updateSignal = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitFlashModeUpdate(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.impl.FlashControl.C18251
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1 r0 = (androidx.camera.camera2.impl.FlashControl.C18251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1 r0 = new androidx.camera.camera2.impl.FlashControl$awaitFlashModeUpdate$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            int r0 = r0.I$0
            yhm.o.b(r6)
            goto L59
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r6 == 0) goto L45
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r2 = "FlashControl: Waiting for any ongoing update to be completed"
        L45:
            int r6 = r5.get_flashMode()
            skm.g0 r2 = r5.getUpdateSignal()
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r0 = r2.u(r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r6
        L59:
            androidx.camera.camera2.impl.Camera2Logger r6 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r6 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r6 == 0) goto L6a
            java.lang.String r6 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "awaitFlashModeUpdate: initialFlashMode = "
            p.a.z(r0, r1, r6)
        L6a:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.awaitFlashModeUpdate(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: getFlashMode, reason: from getter */
    public final int get_flashMode() {
        return this._flashMode;
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    /* JADX INFO: renamed from: getScreenFlash, reason: from getter */
    public final ImageCapture.ScreenFlash get_screenFlash() {
        return this._screenFlash;
    }

    @NotNull
    public final g0 getUpdateSignal() {
        q qVar = this._updateSignal;
        return qVar != null ? qVar : e0.a(Unit.f186387a);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        this._flashMode = 2;
        this._screenFlash = null;
        stopRunningTask();
        setFlashAsync$default(this, 2, false, 2, null);
    }

    @NotNull
    public final g0 setFlashAsync(int flashMode, boolean cancelPreviousTask) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            StringBuilder sbW = a0.d.w(flashMode, "setFlashAsync: flashMode = ", ", requestControl = ");
            sbW.append(get_requestControl());
            sbW.toString();
        }
        r rVarB = e0.b();
        if (get_requestControl() == null) {
            rVarB.h0(new CameraControl.OperationCanceledException("Camera is not active."));
            return rVarB;
        }
        this._flashMode = flashMode;
        if (cancelPreviousTask) {
            stopRunningTask();
        } else {
            q qVar = this._updateSignal;
            if (qVar != null) {
                CoroutineAdaptersKt.propagateTo(rVarB, qVar);
            }
        }
        this._updateSignal = rVarB;
        CoroutineAdaptersKt.propagateTo(this.state3AControl.setFlashModeAsync(flashMode), rVarB);
        return rVarB;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        setFlashAsync(this._flashMode, false);
    }

    public final void setScreenFlash(ImageCapture.ScreenFlash screenFlash) {
        this._screenFlash = screenFlash;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (skm.e0.h(r4, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startScreenFlashCaptureTasks(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.impl.FlashControl.C18261
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1 r0 = (androidx.camera.camera2.impl.FlashControl.C18261) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1 r0 = new androidx.camera.camera2.impl.FlashControl$startScreenFlashCaptureTasks$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L7d
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            java.lang.Object r2 = r0.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            yhm.o.b(r8)
            goto L58
        L3e:
            java.util.ArrayList r2 = p.a.u(r8)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 3
            long r5 = r8.toMillis(r5)
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r4
            java.lang.Object r8 = r7.applyScreenFlash(r5, r0)
            if (r8 != r1) goto L57
            goto L7c
        L57:
            r4 = r2
        L58:
            r2.add(r8)
            skm.g0 r8 = r7.setExternalFlashAeModeAsync()
            if (r8 == 0) goto L64
            r4.add(r8)
        L64:
            skm.g0 r8 = r7.setTorchForScreenFlash()
            if (r8 == 0) goto L6d
            r4.add(r8)
        L6d:
            java.util.Collection r4 = (java.util.Collection) r4
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = skm.e0.h(r4, r0)
            if (r8 != r1) goto L7d
        L7c:
            return r1
        L7d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.startScreenFlashCaptureTasks(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopScreenFlashCaptureTasks(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.impl.FlashControl.C18271
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1 r0 = (androidx.camera.camera2.impl.FlashControl.C18271) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1 r0 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L45
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            skm.p0 r7 = skm.p0.f264001a
            tkm.e r7 = zkm.o.f323119a
            androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2 r2 = new androidx.camera.camera2.impl.FlashControl$stopScreenFlashCaptureTasks$2
            r4 = 0
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            androidx.camera.camera2.impl.CameraProperties r7 = r6.cameraProperties
            androidx.camera.camera2.pipe.CameraMetadata r7 = r7.getMetadata()
            boolean r7 = androidx.camera.camera2.impl.CameraMetadataIntegrationKt.isExternalFlashAeModeSupported(r7)
            if (r7 == 0) goto L57
            androidx.camera.camera2.impl.State3AControl r7 = r6.state3AControl
            r0 = 0
            r7.setTryExternalFlashAeModeAsync(r0)
        L57:
            androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate r7 = r6.useFlashModeTorchFor3aUpdate
            boolean r7 = r7.shouldUseFlashModeTorch()
            if (r7 == 0) goto L6e
            androidx.camera.camera2.impl.TorchControl r0 = r6.torchControl
            androidx.camera.camera2.impl.TorchControl$TorchMode$Companion r7 = androidx.camera.camera2.impl.TorchControl.TorchMode.INSTANCE
            int r1 = r7.m49getOFFIRs_R8()
            r4 = 2
            r5 = 0
            r2 = 0
            r3 = 1
            androidx.camera.camera2.impl.TorchControl.m39setTorchAsyncOup_wC0$camera_camera2$default(r0, r1, r2, r3, r4, r5)
        L6e:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.FlashControl.stopScreenFlashCaptureTasks(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
