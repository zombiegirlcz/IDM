package androidx.camera.camera2.pipe.media;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;", "Landroidx/camera/camera2/pipe/media/ImageSources;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "cameraPipeConfig", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraPipe$Config;)V", "Landroidx/camera/camera2/pipe/core/Threads;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageReaderImageSources implements ImageSources {

    @NotNull
    private final Threads threads;

    public ImageReaderImageSources(@NotNull Threads threads, @NotNull CameraPipe.Config cameraPipeConfig) {
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(cameraPipeConfig, "cameraPipeConfig");
        this.threads = threads;
        cameraPipeConfig.getPlatformApiCompat();
    }
}
