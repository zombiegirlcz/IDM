package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CoroutineAdaptersKt;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.util.concurrent.ListenableFuture;
import gim.c;
import gim.d;
import gim.i;
import hlm.a;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import q2k.b;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0016\u001a\u00020\b*\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\nJ9\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010+\u001a\u0004\u0018\u00010\r8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Landroidx/camera/camera2/impl/StillCaptureRequestControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "<init>", "(Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/UseCaseThreads;)V", "", "trySubmitPendingRequests", "()V", "Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;", "request", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Lskm/g0;", "", "Ljava/lang/Void;", "submitRequest", "(Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submittedRequest", "currentRequestControl", "propagateResultOrEnqueueRequest", "(Lskm/g0;Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "reset", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "", "captureMode", "flashType", "Lcom/google/common/util/concurrent/ListenableFuture;", "issueCaptureRequests", "(Ljava/util/List;II)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/camera2/impl/FlashControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Lhlm/a;", "mutex", "Lhlm/a;", "_requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Ljava/util/LinkedList;", "pendingRequests", "Ljava/util/LinkedList;", "value", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "CaptureRequest", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StillCaptureRequestControl implements UseCaseCameraControl {
    private UseCaseCameraRequestControl _requestControl;

    @NotNull
    private final FlashControl flashControl;

    @NotNull
    private final a mutex;

    @NotNull
    private final LinkedList<CaptureRequest> pendingRequests;

    @NotNull
    private final UseCaseThreads threads;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011R%\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/camera/camera2/impl/StillCaptureRequestControl$CaptureRequest;", "", "", "Landroidx/camera/core/impl/CaptureConfig;", "captureConfigs", "", "captureMode", "flashType", "Lskm/q;", "Ljava/lang/Void;", "result", "<init>", "(Ljava/util/List;IILskm/q;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCaptureConfigs", "()Ljava/util/List;", "I", "getCaptureMode", "getFlashType", "Lskm/q;", "getResult", "()Lskm/q;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CaptureRequest {

        @NotNull
        private final List<CaptureConfig> captureConfigs;
        private final int captureMode;
        private final int flashType;

        @NotNull
        private final q result;

        public CaptureRequest(@NotNull List<CaptureConfig> captureConfigs, int i, int i2, @NotNull q result) {
            Intrinsics.checkNotNullParameter(captureConfigs, "captureConfigs");
            Intrinsics.checkNotNullParameter(result, "result");
            this.captureConfigs = captureConfigs;
            this.captureMode = i;
            this.flashType = i2;
            this.result = result;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CaptureRequest)) {
                return false;
            }
            CaptureRequest captureRequest = (CaptureRequest) other;
            return Intrinsics.f(this.captureConfigs, captureRequest.captureConfigs) && this.captureMode == captureRequest.captureMode && this.flashType == captureRequest.flashType && Intrinsics.f(this.result, captureRequest.result);
        }

        @NotNull
        public final List<CaptureConfig> getCaptureConfigs() {
            return this.captureConfigs;
        }

        public final int getCaptureMode() {
            return this.captureMode;
        }

        public final int getFlashType() {
            return this.flashType;
        }

        @NotNull
        public final q getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + j6.a.b(this.flashType, j6.a.b(this.captureMode, this.captureConfigs.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "CaptureRequest(captureConfigs=" + this.captureConfigs + ", captureMode=" + this.captureMode + ", flashType=" + this.flashType + ", result=" + this.result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$issueCaptureRequests$1", f = "StillCaptureRequestControl.kt", l = {99, 100, 222}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<CaptureConfig> $captureConfigs;
        final /* synthetic */ int $captureMode;
        final /* synthetic */ int $flashType;
        final /* synthetic */ q $signal;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ StillCaptureRequestControl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<CaptureConfig> list, int i, int i2, q qVar, StillCaptureRequestControl stillCaptureRequestControl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$captureConfigs = list;
            this.$captureMode = i;
            this.$flashType = i2;
            this.$signal = qVar;
            this.this$0 = stillCaptureRequestControl;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass1(this.$captureConfigs, this.$captureMode, this.$flashType, this.$signal, this.this$0, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$reset$1", f = "StillCaptureRequestControl.kt", l = {222}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18311 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C18311(Continuation<? super C18311> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return StillCaptureRequestControl.this.new C18311(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar;
            StillCaptureRequestControl stillCaptureRequestControl;
            q result;
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                aVar = StillCaptureRequestControl.this.mutex;
                StillCaptureRequestControl stillCaptureRequestControl2 = StillCaptureRequestControl.this;
                this.L$0 = aVar;
                this.L$1 = stillCaptureRequestControl2;
                this.label = 1;
                if (aVar.lock(null, this) == aVar2) {
                    return aVar2;
                }
                stillCaptureRequestControl = stillCaptureRequestControl2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stillCaptureRequestControl = (StillCaptureRequestControl) this.L$1;
                aVar = (a) this.L$0;
                o.b(obj2);
            }
            while (!stillCaptureRequestControl.pendingRequests.isEmpty()) {
                try {
                    CaptureRequest captureRequest = (CaptureRequest) stillCaptureRequestControl.pendingRequests.poll();
                    if (captureRequest != null && (result = captureRequest.getResult()) != null) {
                        ((r) result).h0(new ImageCaptureException(3, "Capture request is cancelled due to a reset", null));
                    }
                } catch (Throwable th10) {
                    aVar.unlock(null);
                    throw th10;
                }
            }
            Unit unit = Unit.f186387a;
            aVar.unlock(null);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18311) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.StillCaptureRequestControl", f = "StillCaptureRequestControl.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "submitRequest", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18321 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18321(Continuation<? super C18321> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return StillCaptureRequestControl.this.submitRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4", f = "StillCaptureRequestControl.kt", l = {160}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Ljava/lang/Void;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function2<CoroutineScope, Continuation<? super List<? extends Void>>, Object> {
        final /* synthetic */ List<g0> $deferredList;
        final /* synthetic */ CaptureRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(List<? extends g0> list, CaptureRequest captureRequest, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$deferredList = list;
            this.$request = captureRequest;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass4(this.$deferredList, this.$request, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                CaptureRequest captureRequest = this.$request;
                if (Logger.isDebugEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "StillCaptureRequestControl: Waiting for deferred list from " + captureRequest;
                }
                List<g0> list = this.$deferredList;
                this.label = 1;
                obj2 = e0.h(list, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            CaptureRequest captureRequest2 = this.$request;
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                String str2 = "StillCaptureRequestControl: Waiting for deferred list from " + captureRequest2 + " done";
            }
            return obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<Void>> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.StillCaptureRequestControl$trySubmitPendingRequests$1", f = "StillCaptureRequestControl.kt", l = {LDSFile.EF_DG4_TAG, 222, 123}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18331 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public C18331(Continuation<? super C18331> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return StillCaptureRequestControl.this.new C18331(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:8:0x0028, B:39:0x00bc, B:31:0x008e, B:33:0x0098, B:35:0x00a5, B:40:0x00c4), top: B:46:0x0028 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ba -> B:39:0x00bc). Please report as a decompilation issue!!! */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 209
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.C18331.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18331) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public StillCaptureRequestControl(@NotNull FlashControl flashControl, @NotNull UseCaseThreads threads) {
        Intrinsics.checkNotNullParameter(flashControl, "flashControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.flashControl = flashControl;
        this.threads = threads;
        this.mutex = hlm.d.a();
        this.pendingRequests = new LinkedList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateResultOrEnqueueRequest(g0 g0Var, CaptureRequest captureRequest, UseCaseCameraRequestControl useCaseCameraRequestControl) {
        g0Var.k(new b(this, g0Var, captureRequest, useCaseCameraRequestControl, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit propagateResultOrEnqueueRequest$lambda$0(StillCaptureRequestControl stillCaptureRequestControl, g0 g0Var, CaptureRequest captureRequest, UseCaseCameraRequestControl useCaseCameraRequestControl, Throwable th10) {
        if ((th10 instanceof ImageCaptureException) && ((ImageCaptureException) th10).getImageCaptureError() == 3) {
            e0.C(stillCaptureRequestControl.threads.getSequentialScope(), null, null, new StillCaptureRequestControl$propagateResultOrEnqueueRequest$1$1(stillCaptureRequestControl, useCaseCameraRequestControl, captureRequest, null), 3);
        } else {
            CoroutineAdaptersKt.propagateCompletion(g0Var, captureRequest.getResult(), th10);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitRequest(androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest r7, androidx.camera.camera2.impl.UseCaseCameraRequestControl r8, kotlin.coroutines.Continuation<? super skm.g0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.camera.camera2.impl.StillCaptureRequestControl.C18321
            if (r0 == 0) goto L13
            r0 = r9
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1 r0 = (androidx.camera.camera2.impl.StillCaptureRequestControl.C18321) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1 r0 = new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = "CXCP"
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$1
            r8 = r7
            androidx.camera.camera2.impl.UseCaseCameraRequestControl r8 = (androidx.camera.camera2.impl.UseCaseCameraRequestControl) r8
            java.lang.Object r7 = r0.L$0
            androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest r7 = (androidx.camera.camera2.impl.StillCaptureRequestControl.CaptureRequest) r7
            yhm.o.b(r9)
            goto L6f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            yhm.o.b(r9)
            androidx.camera.camera2.impl.Camera2Logger r9 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r9 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r9 == 0) goto L60
            java.lang.String r9 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "StillCaptureRequestControl: submitting "
            r2.<init>(r5)
            r2.append(r7)
            java.lang.String r5 = " at "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
        L60:
            androidx.camera.camera2.impl.FlashControl r9 = r6.flashControl
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.awaitFlashModeUpdate(r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            androidx.camera.camera2.impl.Camera2Logger r0 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r0 = androidx.camera.core.Logger.isDebugEnabled(r3)
            if (r0 == 0) goto L84
            java.lang.String r0 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "StillCaptureRequestControl: Issuing single capture"
        L84:
            java.util.List r0 = r7.getCaptureConfigs()
            int r1 = r7.getCaptureMode()
            int r2 = r7.getFlashType()
            java.util.List r8 = r8.issueSingleCaptureAsync(r0, r1, r2, r9)
            androidx.camera.camera2.impl.UseCaseThreads r9 = r6.threads
            kotlinx.coroutines.CoroutineScope r9 = r9.getSequentialScope()
            androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4 r0 = new androidx.camera.camera2.impl.StillCaptureRequestControl$submitRequest$4
            r1 = 0
            r0.<init>(r8, r7, r1)
            r7 = 3
            skm.h0 r7 = skm.e0.g(r9, r1, r1, r0, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.StillCaptureRequestControl.submitRequest(androidx.camera.camera2.impl.StillCaptureRequestControl$CaptureRequest, androidx.camera.camera2.impl.UseCaseCameraRequestControl, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void trySubmitPendingRequests() {
        e0.C(this.threads.getSequentialScope(), null, null, new C18331(null), 3);
    }

    /* JADX INFO: renamed from: getRequestControl, reason: from getter */
    public UseCaseCameraRequestControl get_requestControl() {
        return this._requestControl;
    }

    @NotNull
    public final ListenableFuture<List<Void>> issueCaptureRequests(@NotNull List<CaptureConfig> captureConfigs, int captureMode, int flashType) {
        Intrinsics.checkNotNullParameter(captureConfigs, "captureConfigs");
        r rVarB = e0.b();
        e0.C(this.threads.getSequentialScope(), null, null, new AnonymousClass1(captureConfigs, captureMode, flashType, rVarB, this, null), 3);
        ListenableFuture<List<Void>> listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(CoroutineAdaptersKt.asListenableFuture$default((g0) rVarB, (Object) null, 1, (Object) null));
        Intrinsics.checkNotNullExpressionValue(listenableFutureNonCancellationPropagating, "nonCancellationPropagating(...)");
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void reset() {
        e0.C(this.threads.getSequentialScope(), null, null, new C18311(null), 3);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public void setRequestControl(UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this._requestControl = useCaseCameraRequestControl;
        trySubmitPendingRequests();
    }
}
