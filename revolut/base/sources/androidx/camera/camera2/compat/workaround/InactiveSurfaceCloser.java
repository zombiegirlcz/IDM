package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u000eJ'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "", "configure", "", "streamId", "Landroidx/camera/camera2/pipe/StreamId;", "deferrableSurface", "Landroidx/camera/core/impl/DeferrableSurface;", "graph", "Landroidx/camera/camera2/pipe/CameraGraph;", "configure-hB7JTeY", "(ILandroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/camera2/pipe/CameraGraph;)V", "onSurfaceInactive", "closeAll", "Bindings", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface InactiveSurfaceCloser {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser$Bindings;", "", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Bindings {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser$Bindings$Companion;", "", "<init>", "()V", "provideInactiveSurfaceCloser", "Landroidx/camera/camera2/compat/workaround/InactiveSurfaceCloser;", "cameraQuirks", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InactiveSurfaceCloser provideInactiveSurfaceCloser(@NotNull CameraQuirks cameraQuirks) {
                Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
                Quirks quirks = cameraQuirks.getQuirks();
                return (quirks.contains(ConfigureSurfaceToSecondarySessionFailQuirk.class) || quirks.contains(PreviewOrientationIncorrectQuirk.class) || quirks.contains(TextureViewIsClosedQuirk.class)) ? new InactiveSurfaceCloserImpl() : NoOpInactiveSurfaceCloser.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    void closeAll();

    /* JADX INFO: renamed from: configure-hB7JTeY, reason: not valid java name */
    void mo12configurehB7JTeY(int streamId, @NotNull DeferrableSurface deferrableSurface, @NotNull CameraGraph graph);

    void onSurfaceInactive(@NotNull DeferrableSurface deferrableSurface);
}
