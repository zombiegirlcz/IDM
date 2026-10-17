package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CapturePipeline;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraModule;", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class UseCaseCameraModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraModule$Companion;", "", "<init>", "()V", "Lphm/a;", "Landroidx/camera/camera2/impl/CapturePipelineImpl;", "capturePipelineImplProvider", "Landroidx/camera/camera2/compat/workaround/CapturePipelineTorchCorrection;", "capturePipelineTorchCorrectionProvider", "Landroidx/camera/camera2/impl/CapturePipeline;", "provideCapturePipeline", "(Lphm/a;Lphm/a;)Landroidx/camera/camera2/impl/CapturePipeline;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CapturePipeline provideCapturePipeline(@NotNull a capturePipelineImplProvider, @NotNull a capturePipelineTorchCorrectionProvider) {
            Intrinsics.checkNotNullParameter(capturePipelineImplProvider, "capturePipelineImplProvider");
            Intrinsics.checkNotNullParameter(capturePipelineTorchCorrectionProvider, "capturePipelineTorchCorrectionProvider");
            if (CapturePipelineTorchCorrection.INSTANCE.isEnabled()) {
                Object obj2 = capturePipelineTorchCorrectionProvider.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                return (CapturePipeline) obj2;
            }
            Object obj3 = capturePipelineImplProvider.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            return (CapturePipeline) obj3;
        }

        private Companion() {
        }
    }
}
