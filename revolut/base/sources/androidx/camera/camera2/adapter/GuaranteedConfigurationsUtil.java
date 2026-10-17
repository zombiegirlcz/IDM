package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceCombination;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.SurfaceSizeDefinition;
import androidx.camera.core.impl.stabilization.VideoStabilization;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import mw1.a;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0007J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0002J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0000¢\u0006\u0002\b0R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u00061"}, d2 = {"Landroidx/camera/camera2/adapter/GuaranteedConfigurationsUtil;", "", "<init>", "()V", "QUERYABLE_VIC_FCQ_COMBINATIONS", "", "Landroidx/camera/core/impl/SurfaceCombination;", "getQUERYABLE_VIC_FCQ_COMBINATIONS", "()Ljava/util/List;", "QUERYABLE_VIC_FCQ_COMBINATIONS$delegate", "Lkotlin/Lazy;", "QUERYABLE_BAKLAVA_FCQ_COMBINATIONS", "getQUERYABLE_BAKLAVA_FCQ_COMBINATIONS", "QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate", "getLegacySupportedCombinationList", "getLimitedSupportedCombinationList", "getFullSupportedCombinationList", "getRAWSupportedCombinationList", "getBurstSupportedCombinationList", "getLevel3SupportedCombinationList", "getUltraHighResolutionSupportedCombinationList", "getUltraHdrSupportedCombinationList", "getConcurrentSupportedCombinationList", "generateSupportedCombinationList", "hardwareLevel", "", "isRawSupported", "", "isBurstCaptureSupported", "get10BitSupportedCombinationList", "getStreamUseCaseSupportedCombinationList", "getPreviewStabilizationSupportedCombinationList", "generateHighSpeedSupportedCombinationList", "maxSupportedSize", "Landroid/util/Size;", "surfaceSizeDefinition", "Landroidx/camera/core/impl/SurfaceSizeDefinition;", "generateVicQueryableFcqCombinations", "generateBaklavaQueryableFcqCombinations", "createPrivJpegXCombinations", "privSize", "Landroidx/camera/core/impl/SurfaceConfig$ConfigSize;", "jpegXSize", "getQueryableFcqCombinations", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "videoStabilization", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getQueryableFcqCombinations$camera_camera2", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuaranteedConfigurationsUtil {

    @NotNull
    public static final GuaranteedConfigurationsUtil INSTANCE = new GuaranteedConfigurationsUtil();

    /* JADX INFO: renamed from: QUERYABLE_VIC_FCQ_COMBINATIONS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy QUERYABLE_VIC_FCQ_COMBINATIONS = j.b(new a(26));

    /* JADX INFO: renamed from: QUERYABLE_BAKLAVA_FCQ_COMBINATIONS$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy QUERYABLE_BAKLAVA_FCQ_COMBINATIONS = j.b(new a(27));

    private GuaranteedConfigurationsUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List QUERYABLE_BAKLAVA_FCQ_COMBINATIONS_delegate$lambda$0() {
        return INSTANCE.generateBaklavaQueryableFcqCombinations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List QUERYABLE_VIC_FCQ_COMBINATIONS_delegate$lambda$0() {
        return INSTANCE.generateVicQueryableFcqCombinations();
    }

    private final List<SurfaceCombination> createPrivJpegXCombinations(SurfaceConfig.ConfigSize privSize, SurfaceConfig.ConfigSize jpegXSize) {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, privSize, null, 4, null));
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.JPEG, jpegXSize, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, privSize, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.JPEG_R, jpegXSize, null, 4, null));
        arrayList.add(surfaceCombinationG);
        return arrayList;
    }

    private final List<SurfaceCombination> generateBaklavaQueryableFcqCombinations() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1080P_16_9;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType, SurfaceConfig.ConfigSize.S1440P_16_9, null, 4, null), arrayList, surfaceCombinationG);
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType, SurfaceConfig.ConfigSize.UHD, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.YUV, configSize, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG3);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> generateHighSpeedSupportedCombinationList(@NotNull Size maxSupportedSize, @NotNull SurfaceSizeDefinition surfaceSizeDefinition) {
        Intrinsics.checkNotNullParameter(maxSupportedSize, "maxSupportedSize");
        Intrinsics.checkNotNullParameter(surfaceSizeDefinition, "surfaceSizeDefinition");
        ArrayList arrayList = new ArrayList();
        SurfaceConfig surfaceConfigTransformSurfaceConfig$default = SurfaceConfig.Companion.transformSurfaceConfig$default(SurfaceConfig.INSTANCE, 34, maxSupportedSize, surfaceSizeDefinition, 0, null, null, 56, null);
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        surfaceCombination.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        arrayList.add(surfaceCombination);
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        surfaceCombination2.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        surfaceCombination2.addSurfaceConfig(surfaceConfigTransformSurfaceConfig$default);
        arrayList.add(surfaceCombination2);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> generateSupportedCombinationList(int hardwareLevel, boolean isRawSupported, boolean isBurstCaptureSupported) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getLegacySupportedCombinationList());
        if (hardwareLevel == 0 || hardwareLevel == 1 || hardwareLevel == 3 || hardwareLevel == 4) {
            arrayList.addAll(getLimitedSupportedCombinationList());
        }
        if (hardwareLevel == 1 || hardwareLevel == 3) {
            arrayList.addAll(getFullSupportedCombinationList());
        }
        if (isRawSupported) {
            arrayList.addAll(getRAWSupportedCombinationList());
        }
        if (isBurstCaptureSupported && hardwareLevel == 0) {
            arrayList.addAll(getBurstSupportedCombinationList());
        }
        if (hardwareLevel == 3) {
            arrayList.addAll(getLevel3SupportedCombinationList());
        }
        return arrayList;
    }

    private final List<SurfaceCombination> generateVicQueryableFcqCombinations() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1080P_16_9;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.S720P_16_9;
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        arrayList.add(surfaceCombinationG);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM_16_9;
        arrayList.addAll(createPrivJpegXCombinations(configSize, configSize3));
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.UHD;
        arrayList.addAll(createPrivJpegXCombinations(configSize, configSize4));
        arrayList.addAll(createPrivJpegXCombinations(configSize, SurfaceConfig.ConfigSize.S1440P_16_9));
        arrayList.addAll(createPrivJpegXCombinations(configSize, configSize));
        arrayList.addAll(createPrivJpegXCombinations(configSize2, configSize3));
        arrayList.addAll(createPrivJpegXCombinations(configSize2, configSize4));
        arrayList.addAll(createPrivJpegXCombinations(configSize2, configSize));
        SurfaceConfig.ConfigSize configSize5 = SurfaceConfig.ConfigSize.X_VGA;
        SurfaceConfig.ConfigSize configSize6 = SurfaceConfig.ConfigSize.MAXIMUM_4_3;
        arrayList.addAll(createPrivJpegXCombinations(configSize5, configSize6));
        arrayList.addAll(createPrivJpegXCombinations(SurfaceConfig.ConfigSize.S1080P_4_3, configSize6));
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> get10BitSupportedCombinationList() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        Unit unit = Unit.f186387a;
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombination3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null));
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        surfaceCombination4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        surfaceCombination5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        surfaceCombination6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize3, null, 4, null));
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize3, null, 4, null));
        surfaceCombination7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize3, null, 4, null));
        surfaceCombination8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize3, null, 4, null));
        return v.k(surfaceCombination, surfaceCombination2, surfaceCombination3, surfaceCombination4, surfaceCombination5, surfaceCombination6, surfaceCombination7, surfaceCombination8);
    }

    @NotNull
    public static final List<SurfaceCombination> getBurstSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG);
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        arrayList.add(surfaceCombinationG2);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getConcurrentSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1440P_4_3;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null), arrayList, surfaceCombinationG2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.S720P_16_9;
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG6 = b.g(surfaceCombinationG5, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG5);
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG7 = b.g(surfaceCombinationG6, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG6);
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG8 = b.g(surfaceCombinationG7, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG7);
        surfaceCombinationG8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        surfaceCombinationG8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG8);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getFullSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG);
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.JPEG, configSize2, null, 4, null), arrayList, surfaceCombinationG3);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        arrayList.add(surfaceCombinationG5);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getLegacySupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null), arrayList, surfaceCombinationG2);
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG6 = b.g(surfaceCombinationG5, SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null), arrayList, surfaceCombinationG5);
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG7 = b.g(surfaceCombinationG6, SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null), arrayList, surfaceCombinationG6);
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG7);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getLevel3SupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.VGA;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.RAW;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType3, configSize3, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.JPEG, configSize3, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize3, null, 4, null));
        arrayList.add(surfaceCombinationG);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getLimitedSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG);
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize2, null, 4, null));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, SurfaceConfig.ConfigSize.MAXIMUM, null, 4, null));
        arrayList.add(surfaceCombinationG5);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getPreviewStabilizationSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1440P_4_3;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG);
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG6 = b.g(surfaceCombinationG5, SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null), arrayList, surfaceCombinationG5);
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize3, null, 4, null));
        SurfaceCombination surfaceCombinationG7 = b.g(surfaceCombinationG6, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG6);
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        SurfaceCombination surfaceCombinationG8 = b.g(surfaceCombinationG7, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG7);
        surfaceCombinationG8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize3, null, 4, null));
        SurfaceCombination surfaceCombinationG9 = b.g(surfaceCombinationG8, SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null), arrayList, surfaceCombinationG8);
        surfaceCombinationG9.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null));
        surfaceCombinationG9.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG9);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getRAWSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.RAW;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.YUV;
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG6 = b.g(surfaceCombinationG5, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG5);
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        SurfaceCombination surfaceCombinationG7 = b.g(surfaceCombinationG6, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombinationG6);
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize2, null, 4, null));
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG7);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getUltraHdrSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.JPEG_R;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null), arrayList, surfaceCombination);
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, SurfaceConfig.ConfigType.PRIV, SurfaceConfig.ConfigSize.PREVIEW, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        arrayList.add(surfaceCombinationG);
        return arrayList;
    }

    @NotNull
    public static final List<SurfaceCombination> getUltraHighResolutionSupportedCombinationList() {
        ArrayList arrayList = new ArrayList();
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.YUV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.ULTRA_MAXIMUM;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.PREVIEW;
        surfaceCombination.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.RECORD;
        SurfaceCombination surfaceCombinationG = b.g(surfaceCombination, SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null), arrayList, surfaceCombination);
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null));
        surfaceCombinationG.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG2 = b.g(surfaceCombinationG, SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null), arrayList, surfaceCombinationG);
        SurfaceConfig.ConfigType configType4 = SurfaceConfig.ConfigType.RAW;
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        surfaceCombinationG2.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG3 = b.g(surfaceCombinationG2, SurfaceConfig.Companion.create$default(companion, configType2, configSize3, null, 4, null), arrayList, surfaceCombinationG2);
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG3.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.MAXIMUM;
        SurfaceCombination surfaceCombinationG4 = b.g(surfaceCombinationG3, SurfaceConfig.Companion.create$default(companion, configType3, configSize4, null, 4, null), arrayList, surfaceCombinationG3);
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null));
        surfaceCombinationG4.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG5 = b.g(surfaceCombinationG4, SurfaceConfig.Companion.create$default(companion, configType3, configSize4, null, 4, null), arrayList, surfaceCombinationG4);
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        surfaceCombinationG5.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG6 = b.g(surfaceCombinationG5, SurfaceConfig.Companion.create$default(companion, configType3, configSize4, null, 4, null), arrayList, surfaceCombinationG5);
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG6.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG7 = b.g(surfaceCombinationG6, SurfaceConfig.Companion.create$default(companion, configType, configSize4, null, 4, null), arrayList, surfaceCombinationG6);
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null));
        surfaceCombinationG7.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG8 = b.g(surfaceCombinationG7, SurfaceConfig.Companion.create$default(companion, configType, configSize4, null, 4, null), arrayList, surfaceCombinationG7);
        surfaceCombinationG8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        surfaceCombinationG8.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG9 = b.g(surfaceCombinationG8, SurfaceConfig.Companion.create$default(companion, configType, configSize4, null, 4, null), arrayList, surfaceCombinationG8);
        surfaceCombinationG9.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType, configSize, null, 4, null));
        surfaceCombinationG9.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG10 = b.g(surfaceCombinationG9, SurfaceConfig.Companion.create$default(companion, configType4, configSize4, null, 4, null), arrayList, surfaceCombinationG9);
        surfaceCombinationG10.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType3, configSize, null, 4, null));
        surfaceCombinationG10.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        SurfaceCombination surfaceCombinationG11 = b.g(surfaceCombinationG10, SurfaceConfig.Companion.create$default(companion, configType4, configSize4, null, 4, null), arrayList, surfaceCombinationG10);
        surfaceCombinationG11.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize, null, 4, null));
        surfaceCombinationG11.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType2, configSize2, null, 4, null));
        surfaceCombinationG11.addSurfaceConfig(SurfaceConfig.Companion.create$default(companion, configType4, configSize4, null, 4, null));
        arrayList.add(surfaceCombinationG11);
        return arrayList;
    }

    @NotNull
    public final List<SurfaceCombination> getQUERYABLE_BAKLAVA_FCQ_COMBINATIONS() {
        return (List) QUERYABLE_BAKLAVA_FCQ_COMBINATIONS.getValue();
    }

    @NotNull
    public final List<SurfaceCombination> getQUERYABLE_VIC_FCQ_COMBINATIONS() {
        return (List) QUERYABLE_VIC_FCQ_COMBINATIONS.getValue();
    }

    @NotNull
    public final List<SurfaceCombination> getQueryableFcqCombinations$camera_camera2(@NotNull CameraMetadata cameraMetadata, @NotNull VideoStabilization videoStabilization) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(videoStabilization, "videoStabilization");
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key INFO_SESSION_CONFIGURATION_QUERY_VERSION = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            Intrinsics.checkNotNullExpressionValue(INFO_SESSION_CONFIGURATION_QUERY_VERSION, "INFO_SESSION_CONFIGURATION_QUERY_VERSION");
            Object obj2 = cameraMetadata.get((CameraCharacteristics.Key<Object>) INFO_SESSION_CONFIGURATION_QUERY_VERSION);
            if (obj2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 35 && videoStabilization != VideoStabilization.ON) {
                arrayList.addAll(getQUERYABLE_VIC_FCQ_COMBINATIONS());
            }
            if (iIntValue >= 36 && videoStabilization != VideoStabilization.PREVIEW) {
                arrayList.addAll(getQUERYABLE_BAKLAVA_FCQ_COMBINATIONS());
                return arrayList;
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SurfaceCombination> getStreamUseCaseSupportedCombinationList() {
        SurfaceCombination surfaceCombination = new SurfaceCombination();
        SurfaceConfig.Companion companion = SurfaceConfig.INSTANCE;
        SurfaceConfig.ConfigType configType = SurfaceConfig.ConfigType.PRIV;
        SurfaceConfig.ConfigSize configSize = SurfaceConfig.ConfigSize.S1440P_4_3;
        StreamUseCase streamUseCase = StreamUseCase.PREVIEW_VIDEO_STILL;
        surfaceCombination.addSurfaceConfig(companion.create(configType, configSize, streamUseCase));
        Unit unit = Unit.f186387a;
        SurfaceCombination surfaceCombination2 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType2 = SurfaceConfig.ConfigType.YUV;
        surfaceCombination2.addSurfaceConfig(companion.create(configType2, configSize, streamUseCase));
        SurfaceCombination surfaceCombination3 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize2 = SurfaceConfig.ConfigSize.RECORD;
        StreamUseCase streamUseCase2 = StreamUseCase.VIDEO_RECORD;
        surfaceCombination3.addSurfaceConfig(companion.create(configType, configSize2, streamUseCase2));
        SurfaceCombination surfaceCombination4 = new SurfaceCombination();
        surfaceCombination4.addSurfaceConfig(companion.create(configType2, configSize2, streamUseCase2));
        SurfaceCombination surfaceCombination5 = new SurfaceCombination();
        SurfaceConfig.ConfigType configType3 = SurfaceConfig.ConfigType.JPEG;
        SurfaceConfig.ConfigSize configSize3 = SurfaceConfig.ConfigSize.MAXIMUM;
        StreamUseCase streamUseCase3 = StreamUseCase.STILL_CAPTURE;
        surfaceCombination5.addSurfaceConfig(companion.create(configType3, configSize3, streamUseCase3));
        SurfaceCombination surfaceCombination6 = new SurfaceCombination();
        surfaceCombination6.addSurfaceConfig(companion.create(configType2, configSize3, streamUseCase3));
        SurfaceCombination surfaceCombination7 = new SurfaceCombination();
        SurfaceConfig.ConfigSize configSize4 = SurfaceConfig.ConfigSize.PREVIEW;
        StreamUseCase streamUseCase4 = StreamUseCase.PREVIEW;
        surfaceCombination7.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination7.addSurfaceConfig(companion.create(configType3, configSize3, streamUseCase3));
        SurfaceCombination surfaceCombination8 = new SurfaceCombination();
        surfaceCombination8.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination8.addSurfaceConfig(companion.create(configType2, configSize3, streamUseCase3));
        SurfaceCombination surfaceCombination9 = new SurfaceCombination();
        surfaceCombination9.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination9.addSurfaceConfig(companion.create(configType, configSize2, streamUseCase2));
        SurfaceCombination surfaceCombination10 = new SurfaceCombination();
        surfaceCombination10.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination10.addSurfaceConfig(companion.create(configType2, configSize2, streamUseCase2));
        SurfaceCombination surfaceCombination11 = new SurfaceCombination();
        surfaceCombination11.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination11.addSurfaceConfig(companion.create(configType2, configSize4, streamUseCase4));
        SurfaceCombination surfaceCombination12 = new SurfaceCombination();
        surfaceCombination12.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination12.addSurfaceConfig(companion.create(configType, configSize2, streamUseCase2));
        surfaceCombination12.addSurfaceConfig(companion.create(configType3, configSize2, streamUseCase3));
        SurfaceCombination surfaceCombination13 = new SurfaceCombination();
        surfaceCombination13.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination13.addSurfaceConfig(companion.create(configType2, configSize2, streamUseCase2));
        surfaceCombination13.addSurfaceConfig(companion.create(configType3, configSize2, streamUseCase3));
        SurfaceCombination surfaceCombination14 = new SurfaceCombination();
        surfaceCombination14.addSurfaceConfig(companion.create(configType, configSize4, streamUseCase4));
        surfaceCombination14.addSurfaceConfig(companion.create(configType2, configSize4, streamUseCase4));
        surfaceCombination14.addSurfaceConfig(companion.create(configType3, configSize3, streamUseCase3));
        return v.k(surfaceCombination, surfaceCombination2, surfaceCombination3, surfaceCombination4, surfaceCombination5, surfaceCombination6, surfaceCombination7, surfaceCombination8, surfaceCombination9, surfaceCombination10, surfaceCombination11, surfaceCombination12, surfaceCombination13, surfaceCombination14);
    }
}
