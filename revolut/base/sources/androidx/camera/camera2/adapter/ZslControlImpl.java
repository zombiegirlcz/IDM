package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.SizesKt;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import b0.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import mx0.x8;
import n.d;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010+\u001a\u00020*8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\b\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R*\u00104\u001a\u0004\u0018\u0001038\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b:\u0010\b\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Landroidx/camera/camera2/adapter/ZslControlImpl;", "Landroidx/camera/camera2/adapter/ZslControl;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;)V", "", "reset", "()V", "clearRingBuffer", "Landroidx/camera/core/impl/SessionConfig$Builder;", "sessionConfigBuilder", "addZslConfig", "(Landroidx/camera/core/impl/SessionConfig$Builder;)V", "Landroidx/camera/core/impl/DeferrableSurface;", "surface", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "isZslSurface", "(Landroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/core/impl/SessionConfig;)Z", "disabled", "setZslDisabledByUserCaseConfig", "(Z)V", "isZslDisabledByUserCaseConfig", "()Z", "setZslDisabledByFlashMode", "isZslDisabledByFlashMode", "Landroidx/camera/core/ImageProxy;", "dequeueImageFromBuffer", "()Landroidx/camera/core/ImageProxy;", "clearZslConfig", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap$delegate", "Lkotlin/Lazy;", "getStreamConfigurationMap", "()Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "Landroidx/camera/core/internal/utils/ZslRingBuffer;", "zslRingBuffer", "Landroidx/camera/core/internal/utils/ZslRingBuffer;", "getZslRingBuffer$camera_camera2", "()Landroidx/camera/core/internal/utils/ZslRingBuffer;", "getZslRingBuffer$camera_camera2$annotations", "isZslDisabledByUseCaseConfig", "Z", "isZslDisabledByQuirks", "Landroidx/camera/core/SafeCloseImageReaderProxy;", "reprocessingImageReader", "Landroidx/camera/core/SafeCloseImageReaderProxy;", "getReprocessingImageReader$camera_camera2", "()Landroidx/camera/core/SafeCloseImageReaderProxy;", "setReprocessingImageReader$camera_camera2", "(Landroidx/camera/core/SafeCloseImageReaderProxy;)V", "getReprocessingImageReader$camera_camera2$annotations", "Landroidx/camera/core/impl/CameraCaptureCallback;", "metadataMatchingCaptureCallback", "Landroidx/camera/core/impl/CameraCaptureCallback;", "reprocessingImageDeferrableSurface", "Landroidx/camera/core/impl/DeferrableSurface;", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZslControlImpl implements ZslControl {

    @NotNull
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final CameraProperties cameraProperties;
    private boolean isZslDisabledByFlashMode;
    private boolean isZslDisabledByQuirks;
    private boolean isZslDisabledByUseCaseConfig;
    private CameraCaptureCallback metadataMatchingCaptureCallback;
    private DeferrableSurface reprocessingImageDeferrableSurface;
    private SafeCloseImageReaderProxy reprocessingImageReader;

    /* JADX INFO: renamed from: streamConfigurationMap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy streamConfigurationMap;

    @NotNull
    private final ZslRingBuffer zslRingBuffer;

    public ZslControlImpl(@NotNull CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        this.cameraProperties = cameraProperties;
        this.cameraMetadata = cameraProperties.getMetadata();
        this.streamConfigurationMap = j.b(new x8(this, 8));
        this.zslRingBuffer = new ZslRingBuffer(3, new o0(19));
        this.isZslDisabledByQuirks = DeviceQuirks.INSTANCE.get(ZslDisablerQuirk.class) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addZslConfig$lambda$5(ZslControlImpl zslControlImpl, ImageReaderProxy reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            ImageProxy imageProxyAcquireLatestImage = reader.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                zslControlImpl.zslRingBuffer.enqueue(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException unused) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
            }
        }
    }

    private final void clearRingBuffer() {
        ZslRingBuffer zslRingBuffer = this.zslRingBuffer;
        while (!zslRingBuffer.isEmpty()) {
            zslRingBuffer.dequeue().close();
        }
    }

    private final StreamConfigurationMap getStreamConfigurationMap() {
        return (StreamConfigurationMap) this.streamConfigurationMap.getValue();
    }

    private final void reset() {
        DeferrableSurface deferrableSurface = this.reprocessingImageDeferrableSurface;
        if (deferrableSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.reprocessingImageReader;
            if (safeCloseImageReaderProxy != null) {
                deferrableSurface.getTerminationFuture().addListener(new d(safeCloseImageReaderProxy, 1), CameraXExecutors.mainThreadExecutor());
                safeCloseImageReaderProxy.clearOnImageAvailableListener();
                this.reprocessingImageReader = null;
            }
            deferrableSurface.close();
            this.reprocessingImageDeferrableSurface = null;
        }
        clearRingBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StreamConfigurationMap streamConfigurationMap_delegate$lambda$0(ZslControlImpl zslControlImpl) {
        CameraMetadata cameraMetadata = zslControlImpl.cameraMetadata;
        CameraCharacteristics.Key SCALER_STREAM_CONFIGURATION_MAP = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
        Intrinsics.checkNotNullExpressionValue(SCALER_STREAM_CONFIGURATION_MAP, "SCALER_STREAM_CONFIGURATION_MAP");
        Object obj2 = cameraMetadata.get((CameraCharacteristics.Key<Object>) SCALER_STREAM_CONFIGURATION_MAP);
        if (obj2 != null) {
            return (StreamConfigurationMap) obj2;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zslRingBuffer$lambda$0(ImageProxy imageProxy) {
        Intrinsics.checkNotNullParameter(imageProxy, "imageProxy");
        imageProxy.close();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void addZslConfig(@NotNull SessionConfig.Builder sessionConfigBuilder) {
        Intrinsics.checkNotNullParameter(sessionConfigBuilder, "sessionConfigBuilder");
        reset();
        int i = 1;
        if (this.isZslDisabledByUseCaseConfig) {
            sessionConfigBuilder.setTemplateType(1);
            return;
        }
        if (this.isZslDisabledByQuirks) {
            sessionConfigBuilder.setTemplateType(1);
            return;
        }
        if (!CameraMetadata.INSTANCE.getSupportsPrivateReprocessing(this.cameraMetadata)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isInfoEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
            sessionConfigBuilder.setTemplateType(1);
            return;
        }
        Size[] inputSizes = getStreamConfigurationMap().getInputSizes(34);
        Intrinsics.checkNotNullExpressionValue(inputSizes, "getInputSizes(...)");
        Iterator it8 = kotlin.collections.d.v0(inputSizes).iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            Size size = (Size) next;
            Intrinsics.h(size);
            int iArea = SizesKt.area(size);
            do {
                Object next2 = it8.next();
                Size size2 = (Size) next2;
                Intrinsics.h(size2);
                int iArea2 = SizesKt.area(size2);
                if (iArea < iArea2) {
                    next = next2;
                    iArea = iArea2;
                }
            } while (it8.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled("CXCP")) {
                String unused2 = Camera2Logger.TRUNCATED_TAG;
                return;
            }
            return;
        }
        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused3 = Camera2Logger.TRUNCATED_TAG;
            String str = "ZslControlImpl: Selected ZSL size: " + size3;
        }
        int[] validOutputFormatsForInput = getStreamConfigurationMap().getValidOutputFormatsForInput(34);
        Intrinsics.checkNotNullExpressionValue(validOutputFormatsForInput, "getValidOutputFormatsForInput(...)");
        if (!kotlin.collections.d.G(validOutputFormatsForInput, 256)) {
            if (Logger.isWarnEnabled("CXCP")) {
                String unused4 = Camera2Logger.TRUNCATED_TAG;
                return;
            }
            return;
        }
        MetadataImageReader metadataImageReader = new MetadataImageReader(size3.getWidth(), size3.getHeight(), 34, 9);
        CameraCaptureCallback cameraCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        Intrinsics.checkNotNullExpressionValue(cameraCaptureCallback, "getCameraCaptureCallback(...)");
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(metadataImageReader);
        metadataImageReader.setOnImageAvailableListener(new i(this, i), CameraXExecutors.ioExecutor());
        Surface surface = safeCloseImageReaderProxy.getSurface();
        if (surface == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(surface, new Size(safeCloseImageReaderProxy.getWidth(), safeCloseImageReaderProxy.getHeight()), 34);
        immediateSurface.getTerminationFuture().addListener(new d(safeCloseImageReaderProxy, 0), CameraXExecutors.mainThreadExecutor());
        sessionConfigBuilder.addSurface(immediateSurface);
        sessionConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
        sessionConfigBuilder.setInputConfiguration(new InputConfiguration(safeCloseImageReaderProxy.getWidth(), safeCloseImageReaderProxy.getHeight(), safeCloseImageReaderProxy.getImageFormat()));
        this.metadataMatchingCaptureCallback = cameraCaptureCallback;
        this.reprocessingImageReader = safeCloseImageReaderProxy;
        this.reprocessingImageDeferrableSurface = immediateSurface;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void clearZslConfig() {
        reset();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public ImageProxy dequeueImageFromBuffer() {
        try {
            return this.zslRingBuffer.dequeue();
        } catch (NoSuchElementException unused) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (!Logger.isWarnEnabled("CXCP")) {
                return null;
            }
            String unused2 = Camera2Logger.TRUNCATED_TAG;
            return null;
        }
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    /* JADX INFO: renamed from: isZslDisabledByFlashMode, reason: from getter */
    public boolean getIsZslDisabledByFlashMode() {
        return this.isZslDisabledByFlashMode;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    /* JADX INFO: renamed from: isZslDisabledByUserCaseConfig, reason: from getter */
    public boolean getIsZslDisabledByUseCaseConfig() {
        return this.isZslDisabledByUseCaseConfig;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public boolean isZslSurface(@NotNull DeferrableSurface surface, @NotNull SessionConfig sessionConfig) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        InputConfiguration inputConfiguration = sessionConfig.getInputConfiguration();
        return inputConfiguration != null && surface.getPrescribedStreamFormat() == inputConfiguration.getFormat() && surface.getPrescribedSize().getWidth() == inputConfiguration.getWidth() && surface.getPrescribedSize().getHeight() == inputConfiguration.getHeight();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void setZslDisabledByFlashMode(boolean disabled) {
        this.isZslDisabledByFlashMode = disabled;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public void setZslDisabledByUserCaseConfig(boolean disabled) {
        if (this.isZslDisabledByUseCaseConfig != disabled && disabled) {
            clearRingBuffer();
        }
        this.isZslDisabledByUseCaseConfig = disabled;
    }
}
