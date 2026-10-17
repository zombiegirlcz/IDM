package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import ch.qos.logback.core.CoreConstants;
import fim.a;
import gim.c;
import hx7.b;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.d;
import skm.q;
import skm.r;
import zhm.a0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002OPB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\b*\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0092\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0!2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001a\b\u0002\u0010\u0018\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\b\b\u0002\u0010\u0019\u001a\u00020\u00152\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001aH\u0086@¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020\bH\u0086@¢\u0006\u0004\b%\u0010\nJ\r\u0010&\u001a\u00020\b¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010*\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R$\u00109\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u0001088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010;\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0001088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010:R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001b0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001f0<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u00060KR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00101¨\u0006Q"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState;", "", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "templateParamsOverride", "<init>", "(Landroidx/camera/camera2/config/UseCaseGraphContext;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;)V", "", "submitLatest", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "parameters", "update3A", "(Landroidx/camera/camera2/pipe/CameraGraph$Session;Ljava/util/Map;)V", "key", "", "getIntOrNull", "(Ljava/util/Map;Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Integer;", "", "appendParameters", "Landroidx/camera/camera2/pipe/Metadata$Key;", "internalParameters", "appendInternalParameters", "", "Landroidx/camera/camera2/pipe/StreamId;", "streams", "Landroidx/camera/camera2/pipe/RequestTemplate;", "template", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "Lskm/g0;", "updateAsync-Tp9XwKQ", "(Ljava/util/Map;ZLjava/util/Map;ZLjava/util/Set;Landroidx/camera/camera2/pipe/RequestTemplate;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAsync", "tryStartRepeating", "close", "()V", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "lock", "Ljava/lang/Object;", "Lskm/q;", "updateSignal", "Lskm/q;", "Lrkm/d;", "submittedRequestCounter", "Lrkm/d;", "Lkotlin/collections/ArrayDeque;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "updateSignals", "Lkotlin/collections/ArrayDeque;", "updating", "Z", "", "currentParameters", "Ljava/util/Map;", "currentInternalParameters", "", "currentStreams", "Ljava/util/Set;", "currentListeners", "currentTemplate", "Landroidx/camera/camera2/pipe/RequestTemplate;", "Landroidx/camera/camera2/pipe/AeMode;", "lastAeMode", "Landroidx/camera/camera2/pipe/AeMode;", "Landroidx/camera/camera2/pipe/AfMode;", "lastAfMode", "Landroidx/camera/camera2/pipe/AfMode;", "Landroidx/camera/camera2/pipe/AwbMode;", "lastAwbMode", "Landroidx/camera/camera2/pipe/AwbMode;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "requestListener", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "pendingSignalCount", "RequestSignal", "RequestListener", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseCameraState {

    @NotNull
    private final Map<Metadata.Key<?>, Object> currentInternalParameters;

    @NotNull
    private final Set<Request.Listener> currentListeners;

    @NotNull
    private final Map<CaptureRequest.Key<?>, Object> currentParameters;

    @NotNull
    private final Set<StreamId> currentStreams;
    private RequestTemplate currentTemplate;
    private AeMode lastAeMode;
    private AfMode lastAfMode;
    private AwbMode lastAwbMode;

    @NotNull
    private final Object lock;

    @NotNull
    private final d pendingSignalCount;

    @NotNull
    private final RequestListener requestListener;

    @NotNull
    private final d submittedRequestCounter;

    @NotNull
    private final TemplateParamsOverride templateParamsOverride;
    private q updateSignal;

    @NotNull
    private ArrayDeque<RequestSignal> updateSignals;
    private boolean updating;

    @NotNull
    private final UseCaseGraphContext useCaseGraphContext;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "", "", "requestNo", "Lskm/q;", "", "signal", "<init>", "(ILskm/q;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRequestNo", "Lskm/q;", "getSignal", "()Lskm/q;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RequestSignal {
        private final int requestNo;

        @NotNull
        private final q signal;

        public RequestSignal(int i, @NotNull q signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.requestNo = i;
            this.signal = signal;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestSignal)) {
                return false;
            }
            RequestSignal requestSignal = (RequestSignal) other;
            return this.requestNo == requestSignal.requestNo && Intrinsics.f(this.signal, requestSignal.signal);
        }

        public final int getRequestNo() {
            return this.requestNo;
        }

        @NotNull
        public final q getSignal() {
            return this.signal;
        }

        public int hashCode() {
            return this.signal.hashCode() + (Integer.hashCode(this.requestNo) * 31);
        }

        @NotNull
        public String toString() {
            return "RequestSignal(requestNo=" + this.requestNo + ", signal=" + this.signal + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1, reason: invalid class name */
    @gim.d(c = "androidx.camera.camera2.impl.UseCaseCameraState", f = "UseCaseCameraState.kt", l = {400}, m = "submitLatest", v = 1)
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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
            return UseCaseCameraState.this.submitLatest(this);
        }
    }

    public UseCaseCameraState(@NotNull UseCaseGraphContext useCaseGraphContext, @NotNull TemplateParamsOverride templateParamsOverride) {
        Intrinsics.checkNotNullParameter(useCaseGraphContext, "useCaseGraphContext");
        Intrinsics.checkNotNullParameter(templateParamsOverride, "templateParamsOverride");
        this.useCaseGraphContext = useCaseGraphContext;
        this.templateParamsOverride = templateParamsOverride;
        this.lock = new Object();
        this.submittedRequestCounter = b.h(0);
        this.updateSignals = new ArrayDeque<>();
        this.currentParameters = new LinkedHashMap();
        this.currentInternalParameters = new LinkedHashMap();
        this.currentStreams = new LinkedHashSet();
        this.currentListeners = new LinkedHashSet();
        this.requestListener = new RequestListener();
        this.pendingSignalCount = b.h(0);
    }

    private final Integer getIntOrNull(Map<CaptureRequest.Key<?>, ? extends Object> map, CaptureRequest.Key<?> key) {
        Object obj2 = map != null ? map.get(key) : null;
        if (obj2 instanceof Integer) {
            return (Integer) obj2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitLatest(kotlin.coroutines.Continuation<? super kotlin.Unit> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraState.submitLatest(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void update3A(CameraGraph.Session session, Map<CaptureRequest.Key<?>, ? extends Object> map) {
        CaptureRequest.Key<?> CONTROL_AE_MODE = CaptureRequest.CONTROL_AE_MODE;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AE_MODE, "CONTROL_AE_MODE");
        Integer intOrNull = getIntOrNull(map, CONTROL_AE_MODE);
        AeMode aeModeM71fromIntOrNullkQd0u18 = intOrNull != null ? AeMode.INSTANCE.m71fromIntOrNullkQd0u18(intOrNull.intValue()) : null;
        CaptureRequest.Key<?> CONTROL_AF_MODE = CaptureRequest.CONTROL_AF_MODE;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AF_MODE, "CONTROL_AF_MODE");
        Integer intOrNull2 = getIntOrNull(map, CONTROL_AF_MODE);
        AfMode afModeM82fromIntOrNullMKXwA8g = intOrNull2 != null ? AfMode.INSTANCE.m82fromIntOrNullMKXwA8g(intOrNull2.intValue()) : null;
        CaptureRequest.Key<?> CONTROL_AWB_MODE = CaptureRequest.CONTROL_AWB_MODE;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AWB_MODE, "CONTROL_AWB_MODE");
        Integer intOrNull3 = getIntOrNull(map, CONTROL_AWB_MODE);
        AwbMode awbModeM101fromIntOrNullSaEiwI = intOrNull3 != null ? AwbMode.INSTANCE.m101fromIntOrNullSaEiwI(intOrNull3.intValue()) : null;
        boolean z = false;
        boolean z3 = (aeModeM71fromIntOrNullkQd0u18 == null || aeModeM71fromIntOrNullkQd0u18.equals(this.lastAeMode)) ? false : true;
        boolean z4 = (afModeM82fromIntOrNullMKXwA8g == null || afModeM82fromIntOrNullMKXwA8g.equals(this.lastAfMode)) ? false : true;
        if (awbModeM101fromIntOrNullSaEiwI != null && !awbModeM101fromIntOrNullSaEiwI.equals(this.lastAwbMode)) {
            z = true;
        }
        if (z3 || z4 || z) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "UseCaseCameraState: Updating 3A modes: AE(" + aeModeM71fromIntOrNullkQd0u18 + ", changed=" + z3 + "), AF(" + afModeM82fromIntOrNullMKXwA8g + ", changed=" + z4 + "), AWB(" + awbModeM101fromIntOrNullSaEiwI + ", changed=" + z + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
            CameraControls3A.m118update3AydBZfZg$default(session, aeModeM71fromIntOrNullkQd0u18, afModeM82fromIntOrNullMKXwA8g, awbModeM101fromIntOrNullSaEiwI, null, null, null, 56, null);
            if (aeModeM71fromIntOrNullkQd0u18 != null) {
                this.lastAeMode = aeModeM71fromIntOrNullkQd0u18;
            }
            if (afModeM82fromIntOrNullMKXwA8g != null) {
                this.lastAfMode = afModeM82fromIntOrNullMKXwA8g;
            }
            if (awbModeM101fromIntOrNullSaEiwI != null) {
                this.lastAwbMode = awbModeM101fromIntOrNullSaEiwI;
            }
        }
    }

    public final void close() {
        synchronized (this.lock) {
            try {
                if (this.updating) {
                    this.updating = false;
                    q qVar = this.updateSignal;
                    if (qVar != null) {
                        ((r) qVar).h0(new CancellationException("UseCaseCameraState closed"));
                    }
                    this.updateSignal = null;
                }
                while (!this.updateSignals.isEmpty()) {
                    ((r) ((RequestSignal) this.updateSignals.removeFirst()).getSignal()).h0(new CancellationException("UseCaseCameraState closed"));
                    this.pendingSignalCount.a();
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final Object tryStartRepeating(@NotNull Continuation<? super Unit> continuation) throws Exception {
        Object objSubmitLatest = submitLatest(continuation);
        return objSubmitLatest == a.COROUTINE_SUSPENDED ? objSubmitLatest : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: updateAsync-Tp9XwKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m62updateAsyncTp9XwKQ(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> r8, boolean r9, java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, ? extends java.lang.Object> r10, boolean r11, java.util.Set<androidx.camera.camera2.pipe.StreamId> r12, androidx.camera.camera2.pipe.RequestTemplate r13, java.util.Set<? extends androidx.camera.camera2.pipe.Request.Listener> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super skm.g0> r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraState.m62updateAsyncTp9XwKQ(java.util.Map, boolean, java.util.Map, boolean, java.util.Set, androidx.camera.camera2.pipe.RequestTemplate, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u001a\u0010\u0014\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u0013\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\u001b"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraState$RequestListener;", "Landroidx/camera/camera2/pipe/Request$Listener;", "<init>", "(Landroidx/camera/camera2/impl/UseCaseCameraState;)V", "onTotalCaptureResult", "", "requestMetadata", "Landroidx/camera/camera2/pipe/RequestMetadata;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameNumber;", "totalCaptureResult", "Landroidx/camera/camera2/pipe/FrameInfo;", "onTotalCaptureResult-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;)V", "onFailed", "requestFailure", "Landroidx/camera/camera2/pipe/RequestFailure;", "onFailed-CcXjc1I", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/RequestFailure;)V", "completeExceptionally", "complete", "Lkotlin/collections/ArrayDeque;", "Landroidx/camera/camera2/impl/UseCaseCameraState$RequestSignal;", "requestNo", "", "throwable", "", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RequestListener implements Request.Listener {
        public RequestListener() {
        }

        private final void complete(ArrayDeque<RequestSignal> arrayDeque, int i) {
            while (!arrayDeque.isEmpty() && ((RequestSignal) arrayDeque.first()).getRequestNo() <= i) {
                ((r) ((RequestSignal) arrayDeque.first()).getSignal()).U(Unit.f186387a);
                a0.F(arrayDeque);
                UseCaseCameraState.this.pendingSignalCount.a();
            }
        }

        private final void completeExceptionally(RequestMetadata requestMetadata, RequestFailure requestFailure) {
            String str;
            Integer num = (Integer) requestMetadata.get(TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG());
            if (num != null) {
                UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
                int iIntValue = num.intValue();
                synchronized (useCaseCameraState.lock) {
                    try {
                        ArrayDeque<RequestSignal> arrayDeque = useCaseCameraState.updateSignals;
                        if (requestFailure != null) {
                            str = " with CaptureFailure.reason = " + requestFailure.getReason();
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = "";
                        }
                        completeExceptionally(arrayDeque, iIntValue, new Throwable("Failed in framework level".concat(str)));
                        Unit unit = Unit.f186387a;
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            }
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* JADX INFO: renamed from: onFailed-CcXjc1I */
        public void mo7onFailedCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull RequestFailure requestFailure) {
            Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
            Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
            if (UseCaseCameraState.this.pendingSignalCount.f254896a == 0) {
                return;
            }
            completeExceptionally(requestMetadata, requestFailure);
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I */
        public void mo8onTotalCaptureResultCcXjc1I(@NotNull RequestMetadata requestMetadata, long frameNumber, @NotNull FrameInfo totalCaptureResult) {
            Integer num;
            Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
            Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
            if (UseCaseCameraState.this.pendingSignalCount.f254896a == 0 || (num = (Integer) requestMetadata.get(TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG())) == null) {
                return;
            }
            UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
            int iIntValue = num.intValue();
            synchronized (useCaseCameraState.lock) {
                complete(useCaseCameraState.updateSignals, iIntValue);
                Unit unit = Unit.f186387a;
            }
        }

        private final void completeExceptionally(ArrayDeque<RequestSignal> arrayDeque, int i, Throwable th10) {
            while (!arrayDeque.isEmpty() && ((RequestSignal) arrayDeque.first()).getRequestNo() <= i) {
                ((r) ((RequestSignal) arrayDeque.first()).getSignal()).h0(th10);
                a0.F(arrayDeque);
                UseCaseCameraState.this.pendingSignalCount.a();
            }
        }
    }
}
