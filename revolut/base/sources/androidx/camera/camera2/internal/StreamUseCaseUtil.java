package androidx.camera.camera2.internal;

import aim.f;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.adapter.SupportedSurfaceCombination;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.AttachedSurfaceInfo;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.streamsharing.StreamSharingConfig;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J=\u0010 \u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%JA\u0010-\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0&2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00060*¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u0002002\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:JO\u0010>\u001a\u00020\n2\u0006\u00104\u001a\u0002032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0016\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020;0*2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020;0*¢\u0006\u0004\b>\u0010?J#\u0010B\u001a\u00020\n2\u0006\u00104\u001a\u0002032\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bB\u0010CJI\u0010H\u001a\u00020\n2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u001b0D2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bH\u0010IJs\u0010J\u001a\u00020\u00192\u0016\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020;0*2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020;0*2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0D2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bJ\u0010KJ-\u0010L\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\b¢\u0006\u0004\bL\u0010MR&\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010\u0003\u001a\u0004\bQ\u0010RR&\u0010T\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010U¨\u0006W"}, d2 = {"Landroidx/camera/camera2/internal/StreamUseCaseUtil;", "", "<init>", "()V", "Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "captureType", "", "streamUseCase", "", "streamSharingTypes", "", "isEligibleCaptureType", "(Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;JLjava/util/List;)Z", "Landroidx/camera/core/impl/Config;", "oldImplementationOptions", "getUpdatedImplementationOptionsWithUseCaseStreamSpecOption", "(Landroidx/camera/core/impl/Config;Ljava/lang/Long;)Landroidx/camera/core/impl/Config;", "config", "isZslUseCase", "(Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;)Z", "", "availableStreamUseCasesSet", "streamUseCases", "areStreamUseCasesAvailable", "(Ljava/util/Set;Ljava/util/Set;)Z", "", "throwInvalidCamera2InteropOverrideException", "Landroidx/camera/core/impl/AttachedSurfaceInfo;", "attachedSurfaces", "Landroidx/camera/core/impl/UseCaseConfig;", "newUseCaseConfigs", "availableStreamUseCases", "isValidCamera2InteropOverride", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z", "", "captureMode", "getSessionConfigTemplateType", "(Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;I)I", "", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfigs", "useCaseConfigs", "", "Landroidx/camera/core/impl/DeferrableSurface;", "streamUseCaseMap", "populateSurfaceToStreamUseCaseMapping", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V", "useCaseConfig", "Landroidx/camera/camera2/impl/Camera2ImplConfig;", "getStreamSpecImplementationOptions", "(Landroidx/camera/core/impl/UseCaseConfig;)Landroidx/camera/camera2/impl/Camera2ImplConfig;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "isStreamUseCaseSupported", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z", "Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;", "featureSettings", "shouldUseStreamUseCase", "(Landroidx/camera/camera2/adapter/SupportedSurfaceCombination$FeatureSettings;)Z", "Landroidx/camera/core/impl/StreamSpec;", "suggestedStreamSpecMap", "attachedSurfaceStreamSpecMap", "populateStreamUseCaseStreamSpecOptionWithInteropOverride", "(Landroidx/camera/camera2/pipe/CameraMetadata;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z", "Landroidx/camera/core/impl/SurfaceConfig;", "surfaceConfigs", "areStreamUseCasesAvailableForSurfaceConfigs", "(Landroidx/camera/camera2/pipe/CameraMetadata;Ljava/util/List;)Z", "", "surfaceConfigIndexAttachedSurfaceInfoMap", "surfaceConfigIndexUseCaseConfigMap", "surfaceConfigsWithStreamUseCase", "areCaptureTypesEligible", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "containsZslUseCase", "(Ljava/util/List;Ljava/util/List;)Z", "Landroidx/camera/core/impl/Config$Option;", "STREAM_USE_CASE_STREAM_SPEC_OPTION", "Landroidx/camera/core/impl/Config$Option;", "getSTREAM_USE_CASE_STREAM_SPEC_OPTION", "()Landroidx/camera/core/impl/Config$Option;", "getSTREAM_USE_CASE_STREAM_SPEC_OPTION$annotations", "STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP", "Ljava/util/Map;", "STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreamUseCaseUtil {

    @NotNull
    public static final StreamUseCaseUtil INSTANCE = new StreamUseCaseUtil();

    @NotNull
    private static final Config.Option<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION;

    @NotNull
    private static final Map<Long, Set<UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;

    @NotNull
    private static final Map<Long, Set<UseCaseConfigFactory.CaptureType>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Class cls = Long.TYPE;
        Intrinsics.h(cls);
        Config.Option<Long> optionCreate = Config.Option.create("camera2.streamSpec.streamUseCase", cls);
        Intrinsics.checkNotNullExpressionValue(optionCreate, "create(...)");
        STREAM_USE_CASE_STREAM_SPEC_OPTION = optionCreate;
        f builder = new f();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            UseCaseConfigFactory.CaptureType captureType = UseCaseConfigFactory.CaptureType.PREVIEW;
            UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.METERING_REPEATING;
            UseCaseConfigFactory.CaptureType captureType3 = UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS;
            UseCaseConfigFactory.CaptureType[] elements = {captureType, captureType2, captureType3};
            Intrinsics.checkNotNullParameter(elements, "elements");
            builder.put(4L, d.y0(elements));
            UseCaseConfigFactory.CaptureType[] elements2 = {captureType, captureType2, captureType3};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            builder.put(1L, d.y0(elements2));
            builder.put(2L, y0.b(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE));
            builder.put(3L, y0.b(UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = builder.b();
        f builder2 = new f();
        if (i >= 33) {
            UseCaseConfigFactory.CaptureType captureType4 = UseCaseConfigFactory.CaptureType.PREVIEW;
            UseCaseConfigFactory.CaptureType captureType5 = UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE;
            UseCaseConfigFactory.CaptureType captureType6 = UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE;
            UseCaseConfigFactory.CaptureType[] elements3 = {captureType4, captureType5, captureType6};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            builder2.put(4L, d.y0(elements3));
            UseCaseConfigFactory.CaptureType[] elements4 = {captureType4, captureType6};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            builder2.put(3L, d.y0(elements4));
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = builder2.b();
    }

    private StreamUseCaseUtil() {
    }

    private final boolean areStreamUseCasesAvailable(Set<Long> availableStreamUseCasesSet, Set<Long> streamUseCases) {
        Iterator<Long> it8 = streamUseCases.iterator();
        while (it8.hasNext()) {
            if (!availableStreamUseCasesSet.contains(Long.valueOf(it8.next().longValue()))) {
                return false;
            }
        }
        return true;
    }

    private final int getSessionConfigTemplateType(UseCaseConfigFactory.CaptureType captureType, int captureMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        return i != 1 ? (i == 2 || i == 3) ? 3 : 1 : captureMode == 2 ? 5 : 1;
    }

    private final Config getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(Config oldImplementationOptions, Long streamUseCase) {
        Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (oldImplementationOptions.containsOption(option) && Intrinsics.f(oldImplementationOptions.retrieveOption(option), streamUseCase)) {
            return null;
        }
        MutableOptionsBundle mutableOptionsBundleFrom = MutableOptionsBundle.from(oldImplementationOptions);
        Intrinsics.checkNotNullExpressionValue(mutableOptionsBundleFrom, "from(...)");
        mutableOptionsBundleFrom.insertOption(option, streamUseCase);
        return new Camera2ImplConfig(mutableOptionsBundleFrom);
    }

    private final boolean isEligibleCaptureType(UseCaseConfigFactory.CaptureType captureType, long streamUseCase, List<? extends UseCaseConfigFactory.CaptureType> streamSharingTypes) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            Map<Long, Set<UseCaseConfigFactory.CaptureType>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            if (map.containsKey(Long.valueOf(streamUseCase))) {
                Set<UseCaseConfigFactory.CaptureType> set = map.get(Long.valueOf(streamUseCase));
                Intrinsics.h(set);
                if (set.contains(captureType)) {
                    return true;
                }
            }
            return false;
        }
        Map<Long, Set<UseCaseConfigFactory.CaptureType>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!map2.containsKey(Long.valueOf(streamUseCase))) {
            return false;
        }
        Set<UseCaseConfigFactory.CaptureType> set2 = map2.get(Long.valueOf(streamUseCase));
        Intrinsics.h(set2);
        Set<UseCaseConfigFactory.CaptureType> set3 = set2;
        if (streamSharingTypes.size() != set3.size()) {
            return false;
        }
        Iterator<? extends UseCaseConfigFactory.CaptureType> it8 = streamSharingTypes.iterator();
        while (it8.hasNext()) {
            if (!set3.contains(it8.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isValidCamera2InteropOverride(java.util.List<? extends androidx.camera.core.impl.AttachedSurfaceInfo> r10, java.util.List<? extends androidx.camera.core.impl.UseCaseConfig<?>> r11, java.util.Set<java.lang.Long> r12) {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
            boolean r1 = r10.hasNext()
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L47
            java.lang.Object r10 = r10.next()
            androidx.camera.core.impl.AttachedSurfaceInfo r10 = (androidx.camera.core.impl.AttachedSurfaceInfo) r10
            androidx.camera.core.impl.Config r1 = r10.getImplementationOptions()
            kotlin.jvm.internal.Intrinsics.h(r1)
            androidx.camera.core.impl.Config$Option<java.lang.Long> r6 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r1 = r1.containsOption(r6)
            if (r1 != 0) goto L2b
        L28:
            r1 = r4
            r10 = r5
            goto L49
        L2b:
            androidx.camera.core.impl.Config r10 = r10.getImplementationOptions()
            kotlin.jvm.internal.Intrinsics.h(r10)
            java.lang.Object r10 = r10.retrieveOption(r6)
            kotlin.jvm.internal.Intrinsics.h(r10)
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 != 0) goto L44
            goto L28
        L44:
            r10 = r4
            r1 = r5
            goto L49
        L47:
            r10 = r5
            r1 = r10
        L49:
            java.util.Iterator r11 = r11.iterator()
        L4d:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r6 = r11.next()
            androidx.camera.core.impl.UseCaseConfig r6 = (androidx.camera.core.impl.UseCaseConfig) r6
            androidx.camera.core.impl.Config$Option<java.lang.Long> r7 = androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION
            boolean r8 = r6.containsOption(r7)
            if (r8 != 0) goto L68
            if (r10 == 0) goto L66
            r9.throwInvalidCamera2InteropOverrideException()
        L66:
            r1 = r4
            goto L4d
        L68:
            java.lang.Object r6 = r6.retrieveOption(r7)
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.Number r6 = (java.lang.Number) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L7f
            if (r10 == 0) goto L66
            r9.throwInvalidCamera2InteropOverrideException()
            goto L66
        L7f:
            if (r1 == 0) goto L84
            r9.throwInvalidCamera2InteropOverrideException()
        L84:
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r0.add(r10)
            r10 = r4
            goto L4d
        L8d:
            if (r1 != 0) goto L96
            boolean r10 = r9.areStreamUseCasesAvailable(r12, r0)
            if (r10 == 0) goto L96
            return r4
        L96:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.StreamUseCaseUtil.isValidCamera2InteropOverride(java.util.List, java.util.List, java.util.Set):boolean");
    }

    private final boolean isZslUseCase(Config config, UseCaseConfigFactory.CaptureType captureType) {
        Object objRetrieveOption = config.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.FALSE);
        Intrinsics.h(objRetrieveOption);
        if (((Boolean) objRetrieveOption).booleanValue()) {
            return false;
        }
        Config.Option<Integer> option = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (!config.containsOption(option)) {
            return false;
        }
        Object objRetrieveOption2 = config.retrieveOption(option);
        Intrinsics.h(objRetrieveOption2);
        return getSessionConfigTemplateType(captureType, ((Number) objRetrieveOption2).intValue()) == 5;
    }

    private final void throwInvalidCamera2InteropOverrideException() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public final boolean areCaptureTypesEligible(@NotNull Map<Integer, ? extends AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        List<UseCaseConfigFactory.CaptureType> captureTypes;
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i = 0; i < size; i++) {
            long value = surfaceConfigsWithStreamUseCase.get(i).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i))) {
                AttachedSurfaceInfo attachedSurfaceInfo = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i));
                Intrinsics.h(attachedSurfaceInfo);
                UseCaseConfigFactory.CaptureType captureType = attachedSurfaceInfo.getCaptureTypes().size() == 1 ? attachedSurfaceInfo.getCaptureTypes().get(0) : UseCaseConfigFactory.CaptureType.STREAM_SHARING;
                Intrinsics.h(captureType);
                List<UseCaseConfigFactory.CaptureType> captureTypes2 = attachedSurfaceInfo.getCaptureTypes();
                Intrinsics.checkNotNullExpressionValue(captureTypes2, "getCaptureTypes(...)");
                if (!isEligibleCaptureType(captureType, value, captureTypes2)) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                UseCaseConfig<?> useCaseConfig = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i));
                Intrinsics.h(useCaseConfig);
                UseCaseConfig<?> useCaseConfig2 = useCaseConfig;
                UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig2.getCaptureType();
                Intrinsics.checkNotNullExpressionValue(captureType2, "getCaptureType(...)");
                if (useCaseConfig2.getCaptureType() == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
                    captureTypes = ((StreamSharingConfig) useCaseConfig2).getCaptureTypes();
                    Intrinsics.checkNotNullExpressionValue(captureTypes, "getCaptureTypes(...)");
                } else {
                    captureTypes = f0.f322471a;
                }
                if (!isEligibleCaptureType(captureType2, value, captureTypes)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean areStreamUseCasesAvailableForSurfaceConfigs(@NotNull CameraMetadata cameraMetadata, @NotNull List<SurfaceConfig> surfaceConfigs) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(surfaceConfigs, "surfaceConfigs");
        if (Build.VERSION.SDK_INT >= 33) {
            CameraCharacteristics.Key SCALER_AVAILABLE_STREAM_USE_CASES = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            Intrinsics.checkNotNullExpressionValue(SCALER_AVAILABLE_STREAM_USE_CASES, "SCALER_AVAILABLE_STREAM_USE_CASES");
            long[] jArr = (long[]) cameraMetadata.get(SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j2 : jArr) {
                    hashSet.add(Long.valueOf(j2));
                }
                Iterator<SurfaceConfig> it8 = surfaceConfigs.iterator();
                while (it8.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(it8.next().getStreamUseCase().getValue()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean containsZslUseCase(@NotNull List<? extends AttachedSurfaceInfo> attachedSurfaces, @NotNull List<? extends UseCaseConfig<?>> newUseCaseConfigs) {
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(newUseCaseConfigs, "newUseCaseConfigs");
        for (AttachedSurfaceInfo attachedSurfaceInfo : attachedSurfaces) {
            List<UseCaseConfigFactory.CaptureType> captureTypes = attachedSurfaceInfo.getCaptureTypes();
            Intrinsics.checkNotNullExpressionValue(captureTypes, "getCaptureTypes(...)");
            UseCaseConfigFactory.CaptureType captureType = captureTypes.get(0);
            Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
            Intrinsics.h(implementationOptions);
            Intrinsics.h(captureType);
            if (isZslUseCase(implementationOptions, captureType)) {
                return true;
            }
        }
        for (UseCaseConfig<?> useCaseConfig : newUseCaseConfigs) {
            UseCaseConfigFactory.CaptureType captureType2 = useCaseConfig.getCaptureType();
            Intrinsics.checkNotNullExpressionValue(captureType2, "getCaptureType(...)");
            if (isZslUseCase(useCaseConfig, captureType2)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Camera2ImplConfig getStreamSpecImplementationOptions(@NotNull UseCaseConfig<?> useCaseConfig) {
        Intrinsics.checkNotNullParameter(useCaseConfig, "useCaseConfig");
        MutableOptionsBundle mutableOptionsBundleCreate = MutableOptionsBundle.create();
        Intrinsics.checkNotNullExpressionValue(mutableOptionsBundleCreate, "create(...)");
        Config.Option<?> option = Camera2ImplConfig.STREAM_USE_CASE_OPTION;
        if (useCaseConfig.containsOption(option)) {
            mutableOptionsBundleCreate.insertOption(option, useCaseConfig.retrieveOption(option));
        }
        Config.Option<?> option2 = UseCaseConfig.OPTION_ZSL_DISABLED;
        if (useCaseConfig.containsOption(option2)) {
            mutableOptionsBundleCreate.insertOption(option2, useCaseConfig.retrieveOption(option2));
        }
        Config.Option<?> option3 = ImageCaptureConfig.OPTION_IMAGE_CAPTURE_MODE;
        if (useCaseConfig.containsOption(option3)) {
            mutableOptionsBundleCreate.insertOption(option3, useCaseConfig.retrieveOption(option3));
        }
        Config.Option<?> option4 = ImageInputConfig.OPTION_INPUT_FORMAT;
        if (useCaseConfig.containsOption(option4)) {
            mutableOptionsBundleCreate.insertOption(option4, useCaseConfig.retrieveOption(option4));
        }
        return new Camera2ImplConfig(mutableOptionsBundleCreate);
    }

    public final boolean isStreamUseCaseSupported(@NotNull CameraMetadata cameraMetadata) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        CameraCharacteristics.Key SCALER_AVAILABLE_STREAM_USE_CASES = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
        Intrinsics.checkNotNullExpressionValue(SCALER_AVAILABLE_STREAM_USE_CASES, "SCALER_AVAILABLE_STREAM_USE_CASES");
        long[] jArr = (long[]) cameraMetadata.get(SCALER_AVAILABLE_STREAM_USE_CASES);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public final boolean populateStreamUseCaseStreamSpecOptionWithInteropOverride(@NotNull CameraMetadata cameraMetadata, @NotNull List<? extends AttachedSurfaceInfo> attachedSurfaces, @NotNull Map<UseCaseConfig<?>, StreamSpec> suggestedStreamSpecMap, @NotNull Map<AttachedSurfaceInfo, StreamSpec> attachedSurfaceStreamSpecMap) {
        Intrinsics.checkNotNullParameter(cameraMetadata, "cameraMetadata");
        Intrinsics.checkNotNullParameter(attachedSurfaces, "attachedSurfaces");
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList<UseCaseConfig<?>> arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
            Iterator<? extends AttachedSurfaceInfo> it8 = attachedSurfaces.iterator();
            while (it8.hasNext()) {
                if (it8.next().getImplementationOptions() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                StreamSpec streamSpec = suggestedStreamSpecMap.get((UseCaseConfig) it9.next());
                if (streamSpec == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (streamSpec.getImplementationOptions() == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            CameraCharacteristics.Key SCALER_AVAILABLE_STREAM_USE_CASES = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
            Intrinsics.checkNotNullExpressionValue(SCALER_AVAILABLE_STREAM_USE_CASES, "SCALER_AVAILABLE_STREAM_USE_CASES");
            long[] jArr = (long[]) cameraMetadata.get(SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j2 : jArr) {
                    hashSet.add(Long.valueOf(j2));
                }
                if (isValidCamera2InteropOverride(attachedSurfaces, arrayList, hashSet)) {
                    for (AttachedSurfaceInfo attachedSurfaceInfo : attachedSurfaces) {
                        Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
                        Intrinsics.h(implementationOptions);
                        Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions, (Long) implementationOptions.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                        if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                            attachedSurfaceStreamSpecMap.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                        }
                    }
                    for (UseCaseConfig<?> useCaseConfig : arrayList) {
                        StreamSpec streamSpec2 = suggestedStreamSpecMap.get(useCaseConfig);
                        Intrinsics.h(streamSpec2);
                        Config implementationOptions2 = streamSpec2.getImplementationOptions();
                        Intrinsics.h(implementationOptions2);
                        Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions2, (Long) implementationOptions2.retrieveOption(Camera2ImplConfig.STREAM_USE_CASE_OPTION));
                        if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                            suggestedStreamSpecMap.put(useCaseConfig, streamSpec2.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void populateStreamUseCaseStreamSpecOptionWithSupportedSurfaceConfigs(@NotNull Map<UseCaseConfig<?>, StreamSpec> suggestedStreamSpecMap, @NotNull Map<AttachedSurfaceInfo, StreamSpec> attachedSurfaceStreamSpecMap, @NotNull Map<Integer, ? extends AttachedSurfaceInfo> surfaceConfigIndexAttachedSurfaceInfoMap, @NotNull Map<Integer, ? extends UseCaseConfig<?>> surfaceConfigIndexUseCaseConfigMap, @NotNull List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        Intrinsics.checkNotNullParameter(suggestedStreamSpecMap, "suggestedStreamSpecMap");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecMap, "attachedSurfaceStreamSpecMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexAttachedSurfaceInfoMap, "surfaceConfigIndexAttachedSurfaceInfoMap");
        Intrinsics.checkNotNullParameter(surfaceConfigIndexUseCaseConfigMap, "surfaceConfigIndexUseCaseConfigMap");
        Intrinsics.checkNotNullParameter(surfaceConfigsWithStreamUseCase, "surfaceConfigsWithStreamUseCase");
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i = 0; i < size; i++) {
            long value = surfaceConfigsWithStreamUseCase.get(i).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i))) {
                AttachedSurfaceInfo attachedSurfaceInfo = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i));
                Intrinsics.h(attachedSurfaceInfo);
                Config implementationOptions = attachedSurfaceInfo.getImplementationOptions();
                Intrinsics.h(implementationOptions);
                Config updatedImplementationOptionsWithUseCaseStreamSpecOption = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions, Long.valueOf(value));
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption != null) {
                    attachedSurfaceStreamSpecMap.put(attachedSurfaceInfo, attachedSurfaceInfo.toStreamSpec(updatedImplementationOptionsWithUseCaseStreamSpecOption));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                UseCaseConfig<?> useCaseConfig = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i));
                Intrinsics.h(useCaseConfig);
                UseCaseConfig<?> useCaseConfig2 = useCaseConfig;
                StreamSpec streamSpec = suggestedStreamSpecMap.get(useCaseConfig2);
                Intrinsics.h(streamSpec);
                Config implementationOptions2 = streamSpec.getImplementationOptions();
                Intrinsics.h(implementationOptions2);
                Config updatedImplementationOptionsWithUseCaseStreamSpecOption2 = getUpdatedImplementationOptionsWithUseCaseStreamSpecOption(implementationOptions2, Long.valueOf(value));
                if (updatedImplementationOptionsWithUseCaseStreamSpecOption2 != null) {
                    StreamSpec streamSpecBuild = streamSpec.toBuilder().setImplementationOptions(updatedImplementationOptionsWithUseCaseStreamSpecOption2).build();
                    Intrinsics.checkNotNullExpressionValue(streamSpecBuild, "build(...)");
                    suggestedStreamSpecMap.put(useCaseConfig2, streamSpecBuild);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void populateSurfaceToStreamUseCaseMapping(@NotNull Collection<SessionConfig> sessionConfigs, @NotNull Collection<? extends UseCaseConfig<?>> useCaseConfigs, @NotNull Map<DeferrableSurface, Long> streamUseCaseMap) {
        Intrinsics.checkNotNullParameter(sessionConfigs, "sessionConfigs");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(streamUseCaseMap, "streamUseCaseMap");
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        Iterator<SessionConfig> it8 = sessionConfigs.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            SessionConfig next = it8.next();
            Config implementationOptions = next.getImplementationOptions();
            Config.Option<Long> option = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (implementationOptions.containsOption(option) && next.getSurfaces().size() != 1) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isErrorEnabled("CXCP")) {
                    String unused = Camera2Logger.TRUNCATED_TAG;
                    String str = "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + next.getSurfaces().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().";
                    return;
                }
                return;
            }
            if (next.getImplementationOptions().containsOption(option)) {
                int i = 0;
                for (SessionConfig sessionConfig : sessionConfigs) {
                    if (((UseCaseConfig) arrayList.get(i)).getCaptureType() == UseCaseConfigFactory.CaptureType.METERING_REPEATING) {
                        Intrinsics.checkNotNullExpressionValue(sessionConfig.getSurfaces(), "getSurfaces(...)");
                        Preconditions.checkState(!r4.isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(sessionConfig.getSurfaces().get(0), 1L);
                    } else {
                        Config implementationOptions2 = sessionConfig.getImplementationOptions();
                        Config.Option<Long> option2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (implementationOptions2.containsOption(option2)) {
                            List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
                            Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
                            if (!surfaces.isEmpty()) {
                                DeferrableSurface deferrableSurface = sessionConfig.getSurfaces().get(0);
                                Object objRetrieveOption = sessionConfig.getImplementationOptions().retrieveOption(option2);
                                Intrinsics.h(objRetrieveOption);
                                streamUseCaseMap.put(deferrableSurface, objRetrieveOption);
                            }
                        }
                    }
                    i++;
                }
            }
        }
        Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused2 = Camera2Logger.TRUNCATED_TAG;
            String str2 = "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + streamUseCaseMap;
        }
    }

    public final boolean shouldUseStreamUseCase(@NotNull SupportedSurfaceCombination.FeatureSettings featureSettings) {
        Intrinsics.checkNotNullParameter(featureSettings, "featureSettings");
        return featureSettings.getCameraMode() == 0 && featureSettings.getRequiredMaxBitDepth() == 8 && !featureSettings.getIsHighSpeedOn();
    }
}
