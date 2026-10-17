package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rkm.b;
import skm.e0;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b(\u0010)J!\u00100\u001a\u00020$2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/Jc\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\u000e\u00109\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000208\u0018\u0001072\u000e\u0010;\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010&J\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bH\u0010IJE\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000<\"\u0004\b\u0000\u0010J2(\u0010N\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0L\u0012\u0006\u0012\u0004\u0018\u00010M0KH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010QR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010SR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010WR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010XR\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010cR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR*\u0010j\u001a\u00020h2\u0006\u0010i\u001a\u00020h8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bj\u0010l\"\u0004\bm\u0010nR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010q¨\u0006s"}, d2 = {"Landroidx/camera/camera2/pipe/graph/CameraGraphImpl;", "Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraMetadata;", "metadata", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "graphProcessor", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "surfaceGraph", "Landroidx/camera/camera2/pipe/CameraController;", "cameraController", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "frameDistributor", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "frameCaptureQueue", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "audioRestrictionController", "Landroidx/camera/camera2/pipe/CameraGraphId;", "id", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "parameters", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "listeners", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "sessionLock", "Lkotlinx/coroutines/CoroutineScope;", "graphScope", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "controller3A", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/graph/GraphProcessor;Landroidx/camera/camera2/pipe/graph/GraphListener;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/graph/SurfaceGraph;Landroidx/camera/camera2/pipe/CameraController;Landroidx/camera/camera2/pipe/internal/FrameDistributor;Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;Landroidx/camera/camera2/pipe/internal/GraphSessionLock;Lkotlinx/coroutines/CoroutineScope;Landroidx/camera/camera2/pipe/graph/Controller3A;)V", "", "start", "()V", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "acquireSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/StreamId;", "stream", "Landroid/view/Surface;", "surface", "setSurface-NYG5g8E", "(ILandroid/view/Surface;)V", "setSurface", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "Landroidx/camera/camera2/pipe/AfMode;", "afMode", "Landroidx/camera/camera2/pipe/AwbMode;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "update3A-ydBZfZg", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "update3A", "close", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/core/Token;", "token", "Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "createSessionFromToken", "(Landroidx/camera/camera2/pipe/core/Token;)Landroidx/camera/camera2/pipe/graph/CameraGraphSessionImpl;", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "withSessionLockAsync", "(Lkotlin/jvm/functions/Function2;)Lskm/g0;", "Landroidx/camera/camera2/pipe/graph/GraphProcessor;", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Landroidx/camera/camera2/pipe/graph/SurfaceGraph;", "Landroidx/camera/camera2/pipe/CameraController;", "Landroidx/camera/camera2/pipe/internal/FrameDistributor;", "Landroidx/camera/camera2/pipe/internal/FrameCaptureQueue;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "getId", "()Landroidx/camera/camera2/pipe/CameraGraphId;", "Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "getParameters", "()Landroidx/camera/camera2/pipe/internal/CameraGraphParametersImpl;", "Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "getListeners", "()Landroidx/camera/camera2/pipe/internal/CameraGraphRequestListenersImpl;", "Landroidx/camera/camera2/pipe/internal/GraphSessionLock;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/camera/camera2/pipe/graph/Controller3A;", "Lrkm/b;", "closed", "Lrkm/b;", "", "value", "isForeground", "Z", "()Z", "setForeground", "(Z)V", "Landroidx/camera/camera2/pipe/StreamGraph;", "getStreams", "()Landroidx/camera/camera2/pipe/StreamGraph;", "streams", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraGraphImpl implements CameraGraph {

    @NotNull
    private final AudioRestrictionController audioRestrictionController;

    @NotNull
    private final CameraController cameraController;

    @NotNull
    private final b closed;

    @NotNull
    private final Controller3A controller3A;

    @NotNull
    private final FrameCaptureQueue frameCaptureQueue;

    @NotNull
    private final FrameDistributor frameDistributor;

    @NotNull
    private final GraphListener graphListener;

    @NotNull
    private final GraphProcessor graphProcessor;

    @NotNull
    private final CoroutineScope graphScope;

    @NotNull
    private final CameraGraphId id;
    private boolean isForeground;

    @NotNull
    private final CameraGraphRequestListenersImpl listeners;

    @NotNull
    private final CameraGraphParametersImpl parameters;

    @NotNull
    private final GraphSessionLock sessionLock;

    @NotNull
    private final StreamGraphImpl streamGraph;

    @NotNull
    private final SurfaceGraph surfaceGraph;

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl", f = "CameraGraphImpl.kt", l = {175}, m = "acquireSession", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CameraGraphImpl.this.acquireSession(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1", f = "CameraGraphImpl.kt", l = {344}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/camera/camera2/pipe/core/Token;", "it", "Lskm/g0;", "<anonymous>", "(Landroidx/camera/camera2/pipe/core/Token;)Lskm/g0;"}, k = 3, mv = {2, 1, 0})
    public static final class C18431 extends i implements Function2<Token, Continuation<? super g0>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super g0>, Object> $block;
        int label;

        /* JADX INFO: renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1$1", f = "CameraGraphImpl.kt", l = {344}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lskm/g0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lskm/g0;"}, k = 3, mv = {2, 1, 0})
        public static final class C00241 extends i implements Function2<CoroutineScope, Continuation<? super g0>, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super g0>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C00241(Function2<? super CoroutineScope, ? super Continuation<? super g0>, ? extends Object> function2, Continuation<? super C00241> continuation) {
                super(2, continuation);
                this.$block = function2;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                C00241 c00241 = new C00241(this.$block, continuation);
                c00241.L$0 = obj2;
                return c00241;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Function2<CoroutineScope, Continuation<? super g0>, Object> function2 = this.$block;
                this.label = 1;
                Object objInvoke = function2.invoke(coroutineScope, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super g0> continuation) {
                return ((C00241) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18431(Function2<? super CoroutineScope, ? super Continuation<? super g0>, ? extends Object> function2, Continuation<? super C18431> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new C18431(this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Token token, Continuation<? super g0> continuation) {
            return ((C18431) create(token, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            C00241 c00241 = new C00241(this.$block, null);
            this.label = 1;
            Object objO = e0.o(c00241, this);
            return objO == aVar ? aVar : objO;
        }
    }

    public CameraGraphImpl(@NotNull CameraGraph.Config graphConfig, @NotNull CameraMetadata metadata, @NotNull GraphProcessor graphProcessor, @NotNull GraphListener graphListener, @NotNull StreamGraphImpl streamGraph, @NotNull SurfaceGraph surfaceGraph, @NotNull CameraController cameraController, @NotNull FrameDistributor frameDistributor, @NotNull FrameCaptureQueue frameCaptureQueue, @NotNull AudioRestrictionController audioRestrictionController, @NotNull CameraGraphId id10, @NotNull CameraGraphParametersImpl parameters, @NotNull CameraGraphRequestListenersImpl listeners, @NotNull GraphSessionLock sessionLock, @NotNull CoroutineScope graphScope, @NotNull Controller3A controller3A) {
        CameraGraph.Config config;
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(graphProcessor, "graphProcessor");
        Intrinsics.checkNotNullParameter(graphListener, "graphListener");
        Intrinsics.checkNotNullParameter(streamGraph, "streamGraph");
        Intrinsics.checkNotNullParameter(surfaceGraph, "surfaceGraph");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(frameDistributor, "frameDistributor");
        Intrinsics.checkNotNullParameter(frameCaptureQueue, "frameCaptureQueue");
        Intrinsics.checkNotNullParameter(audioRestrictionController, "audioRestrictionController");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(sessionLock, "sessionLock");
        Intrinsics.checkNotNullParameter(graphScope, "graphScope");
        Intrinsics.checkNotNullParameter(controller3A, "controller3A");
        this.graphProcessor = graphProcessor;
        this.graphListener = graphListener;
        this.streamGraph = streamGraph;
        this.surfaceGraph = surfaceGraph;
        this.cameraController = cameraController;
        this.frameDistributor = frameDistributor;
        this.frameCaptureQueue = frameCaptureQueue;
        this.audioRestrictionController = audioRestrictionController;
        this.id = id10;
        this.parameters = parameters;
        this.listeners = listeners;
        this.sessionLock = sessionLock;
        this.graphScope = graphScope;
        this.controller3A = controller3A;
        this.closed = hx7.b.g(false);
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            config = graphConfig;
            Debug.INSTANCE.formatCameraGraphProperties(metadata, config, this);
        } else {
            config = graphConfig;
        }
        if (CameraGraph.OperatingMode.m170equalsimpl0(config.getSessionMode(), CameraGraph.OperatingMode.INSTANCE.m175getHIGH_SPEED2uNL3no())) {
            if (streamGraph.getOutputs().isEmpty()) {
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.");
            }
            if (streamGraph.getOutputs().size() > 2) {
                throw new IllegalArgumentException(("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are " + streamGraph.getOutputs()).toString());
            }
            List<OutputStream> outputs = streamGraph.getOutputs();
            if (!(outputs instanceof Collection) || !outputs.isEmpty()) {
                Iterator<T> it8 = outputs.iterator();
                while (it8.hasNext()) {
                    if (!((OutputStream) it8.next()).isValidForHighSpeedOperatingMode()) {
                        throw new IllegalArgumentException(("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + this.streamGraph.getOutputs()).toString());
                    }
                }
            }
        }
        if (config.getInput() != null) {
            if (config.getInput().isEmpty()) {
                throw new IllegalArgumentException("At least one InputConfiguration is required for reprocessing");
            }
            if (Build.VERSION.SDK_INT < 31 && config.getInput().size() > 1) {
                throw new IllegalArgumentException("Multi resolution reprocessing not supported under Android S");
            }
        }
        if (!this.streamGraph.getImageSourceMap$camera_camera2_pipe().isEmpty()) {
            this.surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
        }
        this.isForeground = true;
    }

    private final CameraGraphSessionImpl createSessionFromToken(Token token) {
        return new CameraGraphSessionImpl(token, this.graphProcessor, this.controller3A, this.frameCaptureQueue, getParameters(), getListeners());
    }

    private final <T> g0 withSessionLockAsync(Function2<? super CoroutineScope, ? super Continuation<? super g0>, ? extends Object> block) {
        return this.sessionLock.withTokenInAsync$camera_camera2_pipe(this.graphScope, new C18431(block, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireSession(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.CameraGraph.Session> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.graph.CameraGraphImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1 r0 = (androidx.camera.camera2.pipe.graph.CameraGraphImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1 r0 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            androidx.camera.camera2.pipe.internal.GraphSessionLock r5 = r4.sessionLock
            r0.label = r3
            java.lang.Object r5 = r5.acquireToken$camera_camera2_pipe(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.camera.camera2.pipe.core.Token r5 = (androidx.camera.camera2.pipe.core.Token) r5
            androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl r5 = r4.createSessionFromToken(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.CameraGraphImpl.acquireSession(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        if (this.closed.a()) {
            Debug debug = Debug.INSTANCE;
            Trace.beginSection(this + "#close");
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                String str = "Closing " + this;
            }
            this.graphProcessor.close();
            this.cameraController.close();
            this.frameDistributor.close();
            this.frameCaptureQueue.close();
            this.surfaceGraph.close();
            this.streamGraph.close();
            this.audioRestrictionController.removeCameraGraph(this);
            e0.k(this.graphScope, null);
            Trace.endSection();
        }
    }

    @NotNull
    public CameraGraphId getId() {
        return this.id;
    }

    @NotNull
    public CameraGraphRequestListenersImpl getListeners() {
        return this.listeners;
    }

    @NotNull
    public CameraGraphParametersImpl getParameters() {
        return this.parameters;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    @NotNull
    public StreamGraph getStreams() {
        return this.streamGraph;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void setForeground(boolean z) {
        this.isForeground = z;
        this.cameraController.setForeground(z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* JADX INFO: renamed from: setSurface-NYG5g8E */
    public void mo180setSurfaceNYG5g8E(int stream, Surface surface) throws Exception {
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(((Object) StreamId.m360toStringimpl(stream)) + "#setSurface");
        if (surface != null && !surface.isValid() && Log.INSTANCE.getWARN_LOGGABLE()) {
            String str = this + "#setSurface: " + surface + " is invalid";
        }
        this.surfaceGraph.m485setNYG5g8E(stream, surface);
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void start() {
        if (this.closed.b()) {
            throw new IllegalStateException(("Cannot start " + this + " after calling close()").toString());
        }
        Debug debug = Debug.INSTANCE;
        Trace.beginSection(this + "#start");
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            String str = "Starting " + this;
        }
        this.graphListener.onGraphStarting();
        this.cameraController.start();
        Trace.endSection();
    }

    @NotNull
    public String toString() {
        return getId().getName();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    @NotNull
    /* JADX INFO: renamed from: update3A-ydBZfZg */
    public g0 mo120update3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        return withSessionLockAsync(new CameraGraphImpl$update3A$1(this, aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions, null));
    }
}
