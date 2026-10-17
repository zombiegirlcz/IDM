package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk;
import androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk;
import androidx.camera.camera2.compat.workaround.CloseCameraOnCameraGraphClose;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.internal.DynamicRangeConversions;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001IB[\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015Jk\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0002J5\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u00020(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\b7J+\u00108\u001a\u0004\u0018\u0001092\u0006\u00105\u001a\u00020(2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H\u0002¢\u0006\u0002\b:J\u0018\u0010;\u001a\u00020<2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010=\u001a\u00020!H\u0002J\u0013\u0010>\u001a\u0004\u0018\u00010?*\u00020@H\u0002¢\u0006\u0002\bAJ\f\u0010B\u001a\u00020C*\u00020\u001fH\u0002J\u0017\u0010D\u001a\u0004\u0018\u00010%2\u0006\u0010E\u001a\u00020FH\u0002¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u000202H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "", "callbackMap", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "requestListener", "Landroidx/camera/camera2/impl/ComboRequestListener;", "cameraConfig", "Landroidx/camera/camera2/config/CameraConfig;", "cameraQuirks", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "zslControl", "Landroidx/camera/camera2/adapter/ZslControl;", "templateParamsOverride", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraXConfig", "Landroidx/camera/core/CameraXConfig;", "cameraInteropStateCallbackRepository", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "<init>", "(Landroidx/camera/camera2/impl/CameraCallbackMap;Landroidx/camera/camera2/impl/ComboRequestListener;Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/core/CameraXConfig;Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;)V", "closeCameraOnCameraGraphClose", "Landroidx/camera/camera2/compat/workaround/CloseCameraOnCameraGraphClose;", "supportedDynamicRangeProfiles", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "create", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "operatingMode", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "sessionConfig", "Landroidx/camera/core/impl/SessionConfig;", "setOutputType", "", "graphStateToCameraStateAdapter", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "camera2ExtensionMode", "", "surfaceToStreamUseCaseMap", "", "Landroidx/camera/core/impl/DeferrableSurface;", "", "surfaceToStreamUseHintMap", "create-79VDu0o", "(ILandroidx/camera/core/impl/SessionConfig;ZLandroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "createPostviewStream", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "postviewConfig", "Landroidx/camera/core/impl/SessionConfig$OutputConfig;", "physicalCameraIdForAllStreams", "", "getStreamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "deferrableSurface", "mapping", "getStreamUseCase-MhLBY4I", "getStreamUseHint", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-kVKJKLA", "createCameraGraphFlags", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "isExtensions", "toDynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "Landroidx/camera/core/DynamicRange;", "toDynamicRangeProfile--zsJmt4", "toCamera2ImplConfig", "Landroidx/camera/camera2/impl/Camera2ImplConfig;", "getVideoStabilizationModeFromCaptureConfig", "captureConfig", "Landroidx/camera/core/impl/CaptureConfig;", "(Landroidx/camera/core/impl/CaptureConfig;)Ljava/lang/Integer;", "toString", "CameraGraphCreationResult", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraGraphConfigProvider {

    @NotNull
    private final CameraCallbackMap callbackMap;

    @NotNull
    private final CameraConfig cameraConfig;
    private final CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository;
    private final CameraMetadata cameraMetadata;

    @NotNull
    private final CameraQuirks cameraQuirks;
    private final CameraXConfig cameraXConfig;

    @NotNull
    private final CloseCameraOnCameraGraphClose closeCameraOnCameraGraphClose;

    @NotNull
    private final ComboRequestListener requestListener;
    private final DynamicRangeProfiles supportedDynamicRangeProfiles;

    @NotNull
    private final TemplateParamsOverride templateParamsOverride;

    @NotNull
    private final ZslControl zslControl;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "Landroidx/camera/core/impl/DeferrableSurface;", "streamConfigMap", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Ljava/util/Map;", "getStreamConfigMap", "()Ljava/util/Map;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraGraphCreationResult {

        @NotNull
        private final CameraGraph.Config config;

        @NotNull
        private final Map<CameraStream.Config, DeferrableSurface> streamConfigMap;

        /* JADX WARN: Multi-variable type inference failed */
        public CameraGraphCreationResult(@NotNull CameraGraph.Config config, @NotNull Map<CameraStream.Config, ? extends DeferrableSurface> streamConfigMap) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(streamConfigMap, "streamConfigMap");
            this.config = config;
            this.streamConfigMap = streamConfigMap;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraGraphCreationResult)) {
                return false;
            }
            CameraGraphCreationResult cameraGraphCreationResult = (CameraGraphCreationResult) other;
            return Intrinsics.f(this.config, cameraGraphCreationResult.config) && Intrinsics.f(this.streamConfigMap, cameraGraphCreationResult.streamConfigMap);
        }

        @NotNull
        public final CameraGraph.Config getConfig() {
            return this.config;
        }

        @NotNull
        public final Map<CameraStream.Config, DeferrableSurface> getStreamConfigMap() {
            return this.streamConfigMap;
        }

        public int hashCode() {
            return this.streamConfigMap.hashCode() + (this.config.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CameraGraphCreationResult(config=" + this.config + ", streamConfigMap=" + this.streamConfigMap + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public CameraGraphConfigProvider(@NotNull CameraCallbackMap callbackMap, @NotNull ComboRequestListener requestListener, @NotNull CameraConfig cameraConfig, @NotNull CameraQuirks cameraQuirks, @NotNull ZslControl zslControl, @NotNull TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        DynamicRangeProfilesCompat dynamicRangeProfilesCompatFromCameraMetaData;
        Intrinsics.checkNotNullParameter(callbackMap, "callbackMap");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
        Intrinsics.checkNotNullParameter(zslControl, "zslControl");
        Intrinsics.checkNotNullParameter(templateParamsOverride, "templateParamsOverride");
        this.callbackMap = callbackMap;
        this.requestListener = requestListener;
        this.cameraConfig = cameraConfig;
        this.cameraQuirks = cameraQuirks;
        this.zslControl = zslControl;
        this.templateParamsOverride = templateParamsOverride;
        this.cameraMetadata = cameraMetadata;
        this.cameraXConfig = cameraXConfig;
        this.cameraInteropStateCallbackRepository = cameraInteropStateCallbackRepository;
        this.closeCameraOnCameraGraphClose = new CloseCameraOnCameraGraphClose();
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (Build.VERSION.SDK_INT >= 33 && cameraMetadata != null && (dynamicRangeProfilesCompatFromCameraMetaData = DynamicRangeProfilesCompat.INSTANCE.fromCameraMetaData(cameraMetadata)) != null) {
            dynamicRangeProfiles = dynamicRangeProfilesCompatFromCameraMetaData.toDynamicRangeProfiles();
        }
        this.supportedDynamicRangeProfiles = dynamicRangeProfiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: create-79VDu0o$default, reason: not valid java name */
    public static /* synthetic */ CameraGraphCreationResult m20create79VDu0o$default(CameraGraphConfigProvider cameraGraphConfigProvider, int i, SessionConfig sessionConfig, boolean z, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, Integer num, Map map, Map map2, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            graphStateToCameraStateAdapter = null;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            map = r0.g();
        }
        if ((i2 & 64) != 0) {
            map2 = r0.g();
        }
        return cameraGraphConfigProvider.m24create79VDu0o(i, sessionConfig, z, graphStateToCameraStateAdapter, num, map, map2);
    }

    private final CameraGraph.Flags createCameraGraphFlags(CameraQuirks cameraQuirks, boolean isExtensions) {
        if (cameraQuirks.getQuirks().contains(CaptureSessionStuckQuirk.class)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
            }
        }
        int iM9getBehaviorBm6Tfm4 = FinalizeSessionOnCloseQuirk.INSTANCE.m9getBehaviorBm6Tfm4();
        boolean zShouldCloseCameraDevice = this.closeCameraOnCameraGraphClose.shouldCloseCameraDevice(isExtensions);
        boolean z = false;
        if ((!isExtensions || DeviceQuirks.INSTANCE.get(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && DeviceQuirks.INSTANCE.get(DisableAbortCapturesOnStopQuirk.class) == null && Build.VERSION.SDK_INT >= 30) {
            z = true;
        }
        return new CameraGraph.Flags(false, z, new CameraGraph.RepeatingRequestRequirementsBeforeCapture(cameraQuirks.getQuirks().contains(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST, null), null, iM9getBehaviorBm6Tfm4, true, zShouldCloseCameraDevice, true, 9, null);
    }

    private final CameraStream.Config createPostviewStream(SessionConfig.OutputConfig postviewConfig, String physicalCameraIdForAllStreams) {
        OutputStream.MirrorMode mirrorModeM287boximpl;
        OutputStream.MirrorMode mirrorMode;
        DeferrableSurface surface = postviewConfig.getSurface();
        Intrinsics.checkNotNullExpressionValue(surface, "getSurface(...)");
        String physicalCameraId = physicalCameraIdForAllStreams == null ? postviewConfig.getPhysicalCameraId() : physicalCameraIdForAllStreams;
        int mirrorMode2 = postviewConfig.getMirrorMode();
        OutputStream.Config.Companion companion = OutputStream.Config.INSTANCE;
        Size prescribedSize = surface.getPrescribedSize();
        Intrinsics.checkNotNullExpressionValue(prescribedSize, "getPrescribedSize(...)");
        int iM344constructorimpl = StreamFormat.m344constructorimpl(surface.getPrescribedStreamFormat());
        String strM182constructorimpl = physicalCameraId == null ? null : CameraId.m182constructorimpl(physicalCameraId);
        if (mirrorMode2 == 0) {
            mirrorModeM287boximpl = OutputStream.MirrorMode.m287boximpl(OutputStream.MirrorMode.m288constructorimpl(1));
        } else {
            if (mirrorMode2 != 1) {
                mirrorMode = null;
                return CameraStream.Config.Companion.create$default(CameraStream.Config.INSTANCE, OutputStream.Config.Companion.m277createvBYXiEU$default(companion, prescribedSize, iM344constructorimpl, strM182constructorimpl, null, mirrorMode, null, null, null, null, null, 1000, null), null, 2, null);
            }
            mirrorModeM287boximpl = OutputStream.MirrorMode.m287boximpl(OutputStream.MirrorMode.m288constructorimpl(2));
        }
        mirrorMode = mirrorModeM287boximpl;
        return CameraStream.Config.Companion.create$default(CameraStream.Config.INSTANCE, OutputStream.Config.Companion.m277createvBYXiEU$default(companion, prescribedSize, iM344constructorimpl, strM182constructorimpl, null, mirrorMode, null, null, null, null, null, 1000, null), null, 2, null);
    }

    /* JADX INFO: renamed from: getStreamUseCase-MhLBY4I, reason: not valid java name */
    private final OutputStream.StreamUseCase m21getStreamUseCaseMhLBY4I(DeferrableSurface deferrableSurface, Map<DeferrableSurface, Long> mapping, CameraMetadata cameraMetadata) {
        Long l2 = mapping.get(deferrableSurface);
        OutputStream.StreamUseCase streamUseCaseM295boximpl = l2 != null ? OutputStream.StreamUseCase.m295boximpl(OutputStream.StreamUseCase.m296constructorimpl(l2.longValue())) : null;
        if (Build.VERSION.SDK_INT >= 33 && streamUseCaseM295boximpl != null && cameraMetadata != null) {
            CameraCharacteristics.Key SCALER_AVAILABLE_STREAM_USE_CASES = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            Intrinsics.checkNotNullExpressionValue(SCALER_AVAILABLE_STREAM_USE_CASES, "SCALER_AVAILABLE_STREAM_USE_CASES");
            long[] jArr = (long[]) cameraMetadata.get(SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && d.H(jArr, streamUseCaseM295boximpl.getValue())) {
                return streamUseCaseM295boximpl;
            }
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isWarnEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Expected stream use case for " + deferrableSurface + ", " + streamUseCaseM295boximpl + " cannot be set!";
        }
        return null;
    }

    /* JADX INFO: renamed from: getStreamUseHint-kVKJKLA, reason: not valid java name */
    private final OutputStream.StreamUseHint m22getStreamUseHintkVKJKLA(DeferrableSurface deferrableSurface, Map<DeferrableSurface, Long> mapping) {
        Long l2 = mapping.get(deferrableSurface);
        if (l2 != null) {
            return OutputStream.StreamUseHint.m305boximpl(OutputStream.StreamUseHint.m306constructorimpl(l2.longValue()));
        }
        return null;
    }

    private final Integer getVideoStabilizationModeFromCaptureConfig(CaptureConfig captureConfig) {
        int previewStabilizationMode = captureConfig.getPreviewStabilizationMode();
        int videoStabilizationMode = captureConfig.getVideoStabilizationMode();
        if (previewStabilizationMode == 1 || videoStabilizationMode == 1) {
            return 0;
        }
        if (previewStabilizationMode == 2) {
            return 2;
        }
        return videoStabilizationMode == 2 ? 1 : null;
    }

    private final Camera2ImplConfig toCamera2ImplConfig(SessionConfig sessionConfig) {
        Config implementationOptions = sessionConfig.getImplementationOptions();
        Intrinsics.checkNotNullExpressionValue(implementationOptions, "getImplementationOptions(...)");
        return new Camera2ImplConfig(implementationOptions);
    }

    /* JADX INFO: renamed from: toDynamicRangeProfile--zsJmt4, reason: not valid java name */
    private final OutputStream.DynamicRangeProfile m23toDynamicRangeProfilezsJmt4(DynamicRange dynamicRange) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        OutputStream.DynamicRangeProfile dynamicRangeProfileM279boximpl = OutputStream.DynamicRangeProfile.m279boximpl(OutputStream.DynamicRangeProfile.INSTANCE.m286getSTANDARDfFAQAUE());
        DynamicRangeProfiles dynamicRangeProfiles = this.supportedDynamicRangeProfiles;
        if (dynamicRangeProfiles != null) {
            Long lDynamicRangeToFirstSupportedProfile = DynamicRangeConversions.INSTANCE.dynamicRangeToFirstSupportedProfile(dynamicRange, dynamicRangeProfiles);
            if (lDynamicRangeToFirstSupportedProfile != null) {
                return OutputStream.DynamicRangeProfile.m279boximpl(OutputStream.DynamicRangeProfile.m280constructorimpl(lDynamicRangeToFirstSupportedProfile.longValue()));
            }
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isErrorEnabled("CXCP")) {
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n " + dynamicRange;
            }
        }
        return dynamicRangeProfileM279boximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    @org.jetbrains.annotations.NotNull
    /* JADX INFO: renamed from: create-79VDu0o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult m24create79VDu0o(int r36, androidx.camera.core.impl.SessionConfig r37, boolean r38, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter r39, java.lang.Integer r40, @org.jetbrains.annotations.NotNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r41, @org.jetbrains.annotations.NotNull java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> r42) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CameraGraphConfigProvider.m24create79VDu0o(int, androidx.camera.core.impl.SessionConfig, boolean, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter, java.lang.Integer, java.util.Map, java.util.Map):androidx.camera.camera2.impl.CameraGraphConfigProvider$CameraGraphCreationResult");
    }

    @NotNull
    public String toString() {
        return "CameraGraphConfigProvider<" + ((Object) CameraId.m186toStringimpl(this.cameraConfig.getCameraId())) + '>';
    }

    public /* synthetic */ CameraGraphConfigProvider(CameraCallbackMap cameraCallbackMap, ComboRequestListener comboRequestListener, CameraConfig cameraConfig, CameraQuirks cameraQuirks, ZslControl zslControl, TemplateParamsOverride templateParamsOverride, CameraMetadata cameraMetadata, CameraXConfig cameraXConfig, CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraCallbackMap, comboRequestListener, cameraConfig, cameraQuirks, zslControl, templateParamsOverride, cameraMetadata, (i & 128) != 0 ? null : cameraXConfig, (i & 256) != 0 ? null : cameraInteropStateCallbackRepository);
    }
}
