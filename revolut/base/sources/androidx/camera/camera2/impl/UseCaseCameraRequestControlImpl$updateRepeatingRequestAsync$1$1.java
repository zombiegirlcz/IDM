package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import fim.a;
import gim.d;
import gim.i;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1", f = "UseCaseCameraRequestControl.kt", l = {428}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    final /* synthetic */ boolean $isPrimary;
    final /* synthetic */ Collection<UseCase> $runningUseCases;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(Collection<? extends UseCase> collection, boolean z, UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, Continuation<? super UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1> continuation) {
        super(1, continuation);
        this.$runningUseCases = collection;
        this.$isPrimary = z;
        this.this$0 = useCaseCameraRequestControlImpl;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(this.$runningUseCases, this.$isPrimary, this.this$0, continuation);
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
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        SessionConfig validSessionConfigOrNull = new SessionConfigAdapter(this.$runningUseCases, this.$isPrimary).getValidSessionConfigOrNull();
        if (validSessionConfigOrNull == null) {
            if (Logger.isDebugEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
            SessionConfig.Builder builder = new SessionConfig.Builder();
            builder.setTemplateType(1);
            validSessionConfigOrNull = builder.build();
            Intrinsics.checkNotNullExpressionValue(validSessionConfigOrNull, "build(...)");
        }
        if (Logger.isDebugEnabled("CXCP")) {
            String unused3 = Camera2Logger.TRUNCATED_TAG;
        }
        this.this$0.infoBundleMap.put(UseCaseCameraRequestControl.Type.SESSION_CONFIG, UseCaseCameraRequestControlImpl.INSTANCE.toInfoBundle(validSessionConfigOrNull, this.this$0.threads.getSequentialExecutor()));
        UseCaseGraphContext useCaseGraphContext = this.this$0.useCaseGraphContext;
        List<DeferrableSurface> surfaces = validSessionConfigOrNull.getRepeatingCaptureConfig().getSurfaces();
        Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
        Set<StreamId> streamIdsFromSurfaces = useCaseGraphContext.getStreamIdsFromSurfaces(surfaces);
        if (Logger.isDebugEnabled("CXCP")) {
            String unused4 = Camera2Logger.TRUNCATED_TAG;
        }
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        UseCaseCameraRequestControlImpl.InfoBundle infoBundleMerge = useCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap);
        this.label = 1;
        Object objUpdateCameraStateAsync = useCaseCameraRequestControlImpl.updateCameraStateAsync(infoBundleMerge, streamIdsFromSurfaces, this);
        return objUpdateCameraStateAsync == aVar ? aVar : objUpdateCameraStateAsync;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super g0> continuation) {
        return ((UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
