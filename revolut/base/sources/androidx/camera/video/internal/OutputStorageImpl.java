package androidx.camera.video.internal;

import androidx.camera.core.Logger;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.OutputOptions;
import androidx.camera.video.internal.utils.StorageUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl;", "Landroidx/camera/video/internal/OutputStorage;", "Landroidx/camera/video/OutputOptions;", "outputOptions", "<init>", "(Landroidx/camera/video/OutputOptions;)V", "", "getAvailableBytes", "()J", "Landroidx/camera/video/OutputOptions;", "Companion", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutputStorageImpl implements OutputStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final OutputOptions outputOptions;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/camera/video/internal/OutputStorageImpl$Companion;", "", "<init>", "()V", "TAG", "", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OutputStorageImpl(@NotNull OutputOptions outputOptions) {
        Intrinsics.checkNotNullParameter(outputOptions, "outputOptions");
        this.outputOptions = outputOptions;
    }

    @Override // androidx.camera.video.internal.OutputStorage
    public long getAvailableBytes() {
        try {
            OutputOptions outputOptions = this.outputOptions;
            if (outputOptions instanceof FileOutputOptions) {
                File parentFile = ((FileOutputOptions) outputOptions).getFile().getParentFile();
                Intrinsics.h(parentFile);
                return StorageUtil.getAvailableBytes(parentFile);
            }
            if (outputOptions instanceof FileDescriptorOutputOptions) {
                return Long.MAX_VALUE;
            }
            throw new AssertionError("Unknown OutputOptions: " + this.outputOptions);
        } catch (RuntimeException e) {
            Logger.w("OutputStorageImpl", "Fail to access the available bytes.", e);
            return Long.MAX_VALUE;
        }
    }
}
