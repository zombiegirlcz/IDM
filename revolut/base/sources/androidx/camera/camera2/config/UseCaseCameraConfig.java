package androidx.camera.camera2.config;

import android.util.Pair;
import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kul.b;
import org.jetbrains.annotations.NotNull;
import phm.a;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 JV\u0010!\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010)R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraConfig;", "", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/CameraGraph;", "cameraGraphFactory", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "graphStateToCameraStateAdapter", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "sessionConfigAdapter", "Landroidx/camera/core/impl/SessionProcessor;", "sessionProcessor", "Lkotlin/Lazy;", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "lazyCreationResult", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Landroidx/camera/camera2/adapter/SessionConfigAdapter;Landroidx/camera/core/impl/SessionProcessor;Lkotlin/Lazy;)V", "provideSessionConfigAdapter", "()Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "provideSessionProcessor", "()Landroidx/camera/core/impl/SessionProcessor;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "provideUseCaseGraphContext", "(Landroidx/camera/camera2/adapter/CameraStateAdapter;)Landroidx/camera/camera2/config/UseCaseGraphContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "copy", "(Lkotlin/jvm/functions/Function1;Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Landroidx/camera/camera2/adapter/SessionConfigAdapter;Landroidx/camera/core/impl/SessionProcessor;Lkotlin/Lazy;)Landroidx/camera/camera2/config/UseCaseCameraConfig;", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "Lkotlin/Lazy;", "getCameraGraphConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraGraphConfig", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class UseCaseCameraConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function1<CameraGraph.Config, CameraGraph> cameraGraphFactory;

    @NotNull
    private final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter;

    @NotNull
    private final Lazy lazyCreationResult;

    @NotNull
    private final SessionConfigAdapter sessionConfigAdapter;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraConfig$Companion;", "", "<init>", "()V", "create", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "sessionConfigAdapter", "Landroidx/camera/camera2/adapter/SessionConfigAdapter;", "cameraGraphConfigProvider", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "cameraGraphFactory", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/CameraGraph;", "graphStateToCameraStateAdapter", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "sessionProcessor", "Landroidx/camera/core/impl/SessionProcessor;", "isExtensions", "", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CameraGraphConfigProvider.CameraGraphCreationResult create$lambda$0(SessionConfigAdapter sessionConfigAdapter, boolean z, SessionProcessor sessionProcessor, CameraGraphConfigProvider cameraGraphConfigProvider, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter) {
            Pair<Integer, Integer> implementationType;
            SessionConfig validSessionConfigOrNull = sessionConfigAdapter.getValidSessionConfigOrNull();
            int iM174getEXTENSION2uNL3no = z ? CameraGraph.OperatingMode.INSTANCE.m174getEXTENSION2uNL3no() : validSessionConfigOrNull == null ? CameraGraph.OperatingMode.INSTANCE.m176getNORMAL2uNL3no() : validSessionConfigOrNull.getSessionType() == 1 ? CameraGraph.OperatingMode.INSTANCE.m175getHIGH_SPEED2uNL3no() : validSessionConfigOrNull.getSessionType() == 0 ? CameraGraph.OperatingMode.INSTANCE.m176getNORMAL2uNL3no() : CameraGraph.OperatingMode.INSTANCE.m173customEP6OhB0(validSessionConfigOrNull.getSessionType());
            Integer num = null;
            if (z && sessionProcessor != null && (implementationType = sessionProcessor.getImplementationType()) != null) {
                num = (Integer) implementationType.second;
            }
            return cameraGraphConfigProvider.m24create79VDu0o(iM174getEXTENSION2uNL3no, validSessionConfigOrNull, false, graphStateToCameraStateAdapter, num, sessionConfigAdapter.getSurfaceToStreamUseCaseMap(), sessionConfigAdapter.getSurfaceToStreamUseHintMap());
        }

        @NotNull
        public final UseCaseCameraConfig create(@NotNull SessionConfigAdapter sessionConfigAdapter, @NotNull CameraGraphConfigProvider cameraGraphConfigProvider, @NotNull Function1<? super CameraGraph.Config, ? extends CameraGraph> cameraGraphFactory, @NotNull GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, SessionProcessor sessionProcessor, boolean isExtensions) {
            Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
            Intrinsics.checkNotNullParameter(cameraGraphConfigProvider, "cameraGraphConfigProvider");
            Intrinsics.checkNotNullParameter(cameraGraphFactory, "cameraGraphFactory");
            Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
            return new UseCaseCameraConfig(cameraGraphFactory, graphStateToCameraStateAdapter, sessionConfigAdapter, sessionProcessor, j.b(new b(sessionConfigAdapter, isExtensions, cameraGraphConfigProvider, graphStateToCameraStateAdapter, 5)));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UseCaseCameraConfig(@NotNull Function1<? super CameraGraph.Config, ? extends CameraGraph> cameraGraphFactory, @NotNull GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, @NotNull SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, @NotNull Lazy lazyCreationResult) {
        Intrinsics.checkNotNullParameter(cameraGraphFactory, "cameraGraphFactory");
        Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
        Intrinsics.checkNotNullParameter(lazyCreationResult, "lazyCreationResult");
        this.cameraGraphFactory = cameraGraphFactory;
        this.graphStateToCameraStateAdapter = graphStateToCameraStateAdapter;
        this.sessionConfigAdapter = sessionConfigAdapter;
        this.lazyCreationResult = lazyCreationResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UseCaseCameraConfig copy$default(UseCaseCameraConfig useCaseCameraConfig, Function1 function1, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, Lazy lazy, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = useCaseCameraConfig.cameraGraphFactory;
        }
        if ((i & 2) != 0) {
            graphStateToCameraStateAdapter = useCaseCameraConfig.graphStateToCameraStateAdapter;
        }
        if ((i & 4) != 0) {
            sessionConfigAdapter = useCaseCameraConfig.sessionConfigAdapter;
        }
        if ((i & 8) != 0) {
            useCaseCameraConfig.getClass();
            sessionProcessor = null;
        }
        if ((i & 16) != 0) {
            lazy = useCaseCameraConfig.lazyCreationResult;
        }
        Lazy lazy2 = lazy;
        SessionConfigAdapter sessionConfigAdapter2 = sessionConfigAdapter;
        return useCaseCameraConfig.copy(function1, graphStateToCameraStateAdapter, sessionConfigAdapter2, sessionProcessor, lazy2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraGraph provideUseCaseGraphContext$lambda$1(UseCaseCameraConfig useCaseCameraConfig) {
        return (CameraGraph) useCaseCameraConfig.cameraGraphFactory.invoke(useCaseCameraConfig.getCameraGraphConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map provideUseCaseGraphContext$lambda$2(UseCaseCameraConfig useCaseCameraConfig) {
        return ((CameraGraphConfigProvider.CameraGraphCreationResult) useCaseCameraConfig.lazyCreationResult.getValue()).getStreamConfigMap();
    }

    @NotNull
    public final UseCaseCameraConfig copy(@NotNull Function1<? super CameraGraph.Config, ? extends CameraGraph> cameraGraphFactory, @NotNull GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, @NotNull SessionConfigAdapter sessionConfigAdapter, SessionProcessor sessionProcessor, @NotNull Lazy lazyCreationResult) {
        Intrinsics.checkNotNullParameter(cameraGraphFactory, "cameraGraphFactory");
        Intrinsics.checkNotNullParameter(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        Intrinsics.checkNotNullParameter(sessionConfigAdapter, "sessionConfigAdapter");
        Intrinsics.checkNotNullParameter(lazyCreationResult, "lazyCreationResult");
        return new UseCaseCameraConfig(cameraGraphFactory, graphStateToCameraStateAdapter, sessionConfigAdapter, sessionProcessor, lazyCreationResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UseCaseCameraConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.i(other, "null cannot be cast to non-null type androidx.camera.camera2.config.UseCaseCameraConfig");
        UseCaseCameraConfig useCaseCameraConfig = (UseCaseCameraConfig) other;
        return Intrinsics.f(this.sessionConfigAdapter, useCaseCameraConfig.sessionConfigAdapter) && Intrinsics.f(this.graphStateToCameraStateAdapter, useCaseCameraConfig.graphStateToCameraStateAdapter);
    }

    @NotNull
    public final CameraGraph.Config getCameraGraphConfig() {
        return ((CameraGraphConfigProvider.CameraGraphCreationResult) this.lazyCreationResult.getValue()).getConfig();
    }

    public int hashCode() {
        return (this.graphStateToCameraStateAdapter.hashCode() + (this.sessionConfigAdapter.hashCode() * 31)) * 31;
    }

    @NotNull
    /* JADX INFO: renamed from: provideSessionConfigAdapter, reason: from getter */
    public final SessionConfigAdapter getSessionConfigAdapter() {
        return this.sessionConfigAdapter;
    }

    public final SessionProcessor provideSessionProcessor() {
        return null;
    }

    @NotNull
    public final UseCaseGraphContext provideUseCaseGraphContext(@NotNull CameraStateAdapter cameraStateAdapter) {
        Intrinsics.checkNotNullParameter(cameraStateAdapter, "cameraStateAdapter");
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        final int i = 0;
        a aVar = new a(this) { // from class: r.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraConfig f250666b;

            {
                this.f250666b = this;
            }

            @Override // phm.a
            public final Object get() {
                switch (i) {
                    case 0:
                        return UseCaseCameraConfig.provideUseCaseGraphContext$lambda$1(this.f250666b);
                    default:
                        return UseCaseCameraConfig.provideUseCaseGraphContext$lambda$2(this.f250666b);
                }
            }
        };
        final int i2 = 1;
        return new UseCaseGraphContext(aVar, cameraStateAdapter, this.graphStateToCameraStateAdapter, new a(this) { // from class: r.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraConfig f250666b;

            {
                this.f250666b = this;
            }

            @Override // phm.a
            public final Object get() {
                switch (i2) {
                    case 0:
                        return UseCaseCameraConfig.provideUseCaseGraphContext$lambda$1(this.f250666b);
                    default:
                        return UseCaseCameraConfig.provideUseCaseGraphContext$lambda$2(this.f250666b);
                }
            }
        }, null, 16, null);
    }

    @NotNull
    public String toString() {
        return "UseCaseCameraConfig(cameraGraphFactory=" + this.cameraGraphFactory + ", graphStateToCameraStateAdapter=" + this.graphStateToCameraStateAdapter + ", sessionConfigAdapter=" + this.sessionConfigAdapter + ", sessionProcessor=null, lazyCreationResult=" + this.lazyCreationResult + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
