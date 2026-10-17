package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.camera2.compat.workaround.SupportedRepeatingSurfaceSizeKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import cim.b;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b*\u00020\u0004H\u0002¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_PREVIEW_SIZE", "Landroid/util/Size;", "getProperPreviewSize", "cameraProperties", "Landroidx/camera/camera2/impl/CameraProperties;", "displayInfoManager", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getOutputSizes", "", "(Landroidx/camera/camera2/impl/CameraProperties;)[Landroid/util/Size;", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public abstract class MeteringRepeatingKt {

    @NotNull
    private static final Size DEFAULT_PREVIEW_SIZE = new Size(640, DefaultFrameSampler.DESIRED_FRAME_WIDTH);

    private static final Size[] getOutputSizes(CameraProperties cameraProperties) {
        CameraMetadata metadata = cameraProperties.getMetadata();
        CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) metadata.get(SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return streamConfigurationMap.getOutputSizes(34);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isErrorEnabled("CXCP")) {
            return null;
        }
        String unused = Camera2Logger.TRUNCATED_TAG;
        return null;
    }

    @NotNull
    public static final Size getProperPreviewSize(@NotNull CameraProperties cameraProperties, @NotNull DisplayInfoManager displayInfoManager) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(displayInfoManager, "displayInfoManager");
        Size[] outputSizes = getOutputSizes(cameraProperties);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] supportedRepeatingSurfaceSizes = SupportedRepeatingSurfaceSizeKt.getSupportedRepeatingSurfaceSizes(outputSizes);
            if (supportedRepeatingSurfaceSizes.length == 0) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                }
            } else {
                outputSizes = supportedRepeatingSurfaceSizes;
            }
            if (outputSizes.length > 1) {
                p.B(new Comparator() { // from class: androidx.camera.camera2.impl.MeteringRepeatingKt$getProperPreviewSize$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t2, T t3) {
                        Size size = (Size) t2;
                        Size size2 = (Size) t3;
                        return b.b(Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())), Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
                    }
                }, outputSizes);
            }
            Size previewSize = displayInfoManager.getPreviewSize();
            long jMin = Math.min(307200L, ((long) previewSize.getWidth()) * ((long) previewSize.getHeight()));
            int length = outputSizes.length;
            Size size = null;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size2 = outputSizes[i];
                long width = ((long) size2.getWidth()) * ((long) size2.getHeight());
                if (width == jMin) {
                    return size2;
                }
                if (width <= jMin) {
                    i++;
                    size = size2;
                } else if (size != null) {
                    return size;
                }
            }
            return size == null ? outputSizes[0] : size;
        }
        return DEFAULT_PREVIEW_SIZE;
    }
}
