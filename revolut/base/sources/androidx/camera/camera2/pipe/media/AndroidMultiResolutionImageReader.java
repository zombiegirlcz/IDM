package androidx.camera.camera2.pipe.media;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u00012\u00020\u00022\u00020\u0001:\u0001\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidMultiResolutionImageReader;", "", "Landroid/media/ImageReader$OnImageAvailableListener;", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfigurations", "Ljava/util/List;", "getOutputConfigurations$camera_camera2_pipe", "()Ljava/util/List;", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AndroidMultiResolutionImageReader implements UnsafeWrapper, AutoCloseable, ImageReader.OnImageAvailableListener {
    @NotNull
    public abstract List<OutputConfiguration> getOutputConfigurations$camera_camera2_pipe();
}
