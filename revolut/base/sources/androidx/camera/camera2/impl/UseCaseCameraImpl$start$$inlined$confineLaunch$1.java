package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import fim.a;
import gim.d;
import gim.i;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraImpl$start$$inlined$confineLaunch$1", f = "UseCaseCamera.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraImpl$start$$inlined$confineLaunch$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UseCaseCameraImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$start$$inlined$confineLaunch$1(Continuation continuation, UseCaseCameraImpl useCaseCameraImpl) {
        super(2, continuation);
        this.this$0 = useCaseCameraImpl;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new UseCaseCameraImpl$start$$inlined$confineLaunch$1(continuation, this.this$0);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        if (this.this$0.closed.b()) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
        } else {
            CameraGraph graph = this.this$0.useCaseGraphContext.getGraph();
            this.this$0.useCaseGraphContext.configureCameraStateListener();
            graph.start();
            Map<DeferrableSurface, StreamId> surfaceToStreamMap = this.this$0.useCaseGraphContext.getSurfaceToStreamMap();
            StreamId streamIdM54findStillCaptureStreamId4TVKcYk = this.this$0.m54findStillCaptureStreamId4TVKcYk();
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
            if (this.this$0.getSessionConfigAdapter().isSessionConfigValid()) {
                UseCaseSurfaceManager useCaseSurfaceManager = this.this$0.getUseCaseSurfaceManager();
                Intrinsics.checkNotNullExpressionValue(useCaseSurfaceManager, "access$getUseCaseSurfaceManager(...)");
                SessionConfigAdapter sessionConfigAdapter = this.this$0.getSessionConfigAdapter();
                Intrinsics.checkNotNullExpressionValue(sessionConfigAdapter, "access$getSessionConfigAdapter(...)");
                UseCaseSurfaceManager.setupAsync$default(useCaseSurfaceManager, graph, sessionConfigAdapter, surfaceToStreamMap, 0L, 8, null).k(new Function1<Throwable, Unit>() { // from class: androidx.camera.camera2.impl.UseCaseCameraImpl$start$1$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                        invoke((Throwable) obj3);
                        return Unit.f186387a;
                    }

                    public final void invoke(Throwable th10) {
                        if (th10 == null || (th10 instanceof CancellationException)) {
                            return;
                        }
                        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
                        if (Logger.isErrorEnabled("CXCP")) {
                            String unused3 = Camera2Logger.TRUNCATED_TAG;
                        }
                    }
                });
            } else if (Logger.isErrorEnabled("CXCP")) {
                String unused3 = Camera2Logger.TRUNCATED_TAG;
            }
            this.this$0.m55setCaptureSessionRequestProcessor9O56998(streamIdM54findStillCaptureStreamId4TVKcYk, graph);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UseCaseCameraImpl$start$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
