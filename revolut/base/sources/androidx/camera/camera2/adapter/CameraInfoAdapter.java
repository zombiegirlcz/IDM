package androidx.camera.camera2.adapter;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.adapter.CameraInfoAdapter;
import androidx.camera.camera2.compat.DynamicRangeProfilesCompat;
import androidx.camera.camera2.compat.StreamConfigurationMapCompat;
import androidx.camera.camera2.compat.quirk.CameraQuirks;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.DeviceInfoLogger;
import androidx.camera.camera2.impl.FocusMeteringControl;
import androidx.camera.camera2.internal.IntrinsicZoomCalculator;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraState;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.DynamicRanges;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.internal.StreamSpecsCalculator;
import androidx.core.util.Consumer;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ¤\u00012\u00020\u00012\u00020\u0002:\u0002¤\u0001Ba\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001dJ\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010'J\u000f\u0010-\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010\u001dJ\u0017\u0010,\u001a\u00020%2\u0006\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010/J\u0015\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020%00H\u0016¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u001bH\u0016¢\u0006\u0004\b5\u0010\u001dJ\u000f\u00106\u001a\u00020%H\u0016¢\u0006\u0004\b6\u0010'J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020%00H\u0016¢\u0006\u0004\b7\u00103J\u000f\u00108\u001a\u00020\u001bH\u0016¢\u0006\u0004\b8\u0010\u001dJ\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020%00H\u0016¢\u0006\u0004\b9\u00103J\u000f\u0010;\u001a\u00020:H\u0017¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020=00H\u0016¢\u0006\u0004\b>\u00103J%\u0010D\u001a\u00020C2\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020=0AH\u0017¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020C2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020=0AH\u0017¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u00020C2\u0006\u0010@\u001a\u00020?2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020C2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\"H\u0016¢\u0006\u0004\bN\u0010$J\u000f\u0010O\u001a\u00020\u0011H\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SJ\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00020%0\u001eH\u0016¢\u0006\u0004\bT\u0010!J\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020W0V2\u0006\u0010U\u001a\u00020%H\u0016¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020W0V2\u0006\u0010U\u001a\u00020%H\u0016¢\u0006\u0004\bZ\u0010YJ)\u0010_\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\\*\u00020[2\f\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000]H\u0017¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\"H\u0016¢\u0006\u0004\ba\u0010$J\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0i0\u001eH\u0016¢\u0006\u0004\bj\u0010!J\u000f\u0010k\u001a\u00020\u001bH\u0017¢\u0006\u0004\bk\u0010\u001dJ\u000f\u0010l\u001a\u00020\u001bH\u0016¢\u0006\u0004\bl\u0010\u001dJ\u0015\u0010n\u001a\b\u0012\u0004\u0012\u00020m0\u001eH\u0016¢\u0006\u0004\bn\u0010!J\u000f\u0010o\u001a\u00020\u001bH\u0016¢\u0006\u0004\bo\u0010\u001dJ\u001b\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0i0\u001eH\u0016¢\u0006\u0004\bp\u0010!J\u0015\u0010q\u001a\b\u0012\u0004\u0012\u00020W0VH\u0016¢\u0006\u0004\bq\u0010rJ#\u0010t\u001a\b\u0012\u0004\u0012\u00020W0V2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020%0iH\u0016¢\u0006\u0004\bt\u0010uJ\u000f\u0010w\u001a\u00020vH\u0016¢\u0006\u0004\bw\u0010xJ#\u0010z\u001a\b\u0012\u0004\u0012\u00020m0\u001e2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020m0\u001eH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\u001bH\u0016¢\u0006\u0004\b|\u0010\u001dJ\u000f\u0010}\u001a\u00020\u001bH\u0016¢\u0006\u0004\b}\u0010\u001dJ\u0010\u0010\u007f\u001a\u00020~H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J=\u0010\u0086\u0001\u001a\u00020\u001b2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010V2\u0007\u0010\u0083\u0001\u001a\u00020%2\u0007\u0010\u0084\u0001\u001a\u00020\u001b2\u0007\u0010\u0006\u001a\u00030\u0085\u0001H\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0017\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u001eH\u0016¢\u0006\u0005\b\u0088\u0001\u0010!J\u001a\u0010\u008a\u0001\u001a\u00020%2\u0007\u0010\u0089\u0001\u001a\u00020%H\u0003¢\u0006\u0005\b\u008a\u0001\u0010/R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u008b\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u008c\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010\u008d\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008e\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u008f\u0001R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0090\u0001R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0091\u0001R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0092\u0001R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0093\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0094\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0095\u0001R&\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u001f0\u0096\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010!R\u001f\u0010\u009c\u0001\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u0098\u0001\u001a\u0005\b\u009c\u0001\u0010\u001dR)\u0010£\u0001\u001a\u00030\u009d\u00018@X\u0081\u0084\u0002¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u0012\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001¨\u0006¥\u0001"}, d2 = {"Landroidx/camera/camera2/adapter/CameraInfoAdapter;", "Landroidx/camera/core/impl/CameraInfoInternal;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Landroidx/camera/camera2/config/CameraConfig;", "cameraConfig", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "cameraStateAdapter", "Landroidx/camera/camera2/adapter/CameraControlStateAdapter;", "cameraControlStateAdapter", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "cameraCallbackMap", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "focusMeteringControl", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "encoderProfilesProvider", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "streamConfigurationMapCompat", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "intrinsicZoomCalculator", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "<init>", "(Landroidx/camera/camera2/impl/CameraProperties;Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/adapter/CameraStateAdapter;Landroidx/camera/camera2/adapter/CameraControlStateAdapter;Landroidx/camera/camera2/impl/CameraCallbackMap;Landroidx/camera/camera2/impl/FocusMeteringControl;Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/core/impl/EncoderProfilesProvider;Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;Landroidx/camera/core/internal/StreamSpecsCalculator;)V", "", "isLogicalMultiCameraSupported", "()Z", "", "Landroidx/camera/core/CameraInfo;", "getPhysicalCameraInfos", "()Ljava/util/Set;", "", "getCameraId", "()Ljava/lang/String;", "", "getLensFacing", "()I", "isExternalCamera", "Landroid/hardware/camera2/CameraCharacteristics;", "getCameraCharacteristics", "()Landroid/hardware/camera2/CameraCharacteristics;", "getSensorRotationDegrees", "hasFlashUnit", "relativeRotation", "(I)I", "Landroidx/lifecycle/LiveData;", "Landroidx/camera/core/ZoomState;", "getZoomState", "()Landroidx/lifecycle/LiveData;", "getTorchState", "isTorchStrengthSupported", "getMaxTorchStrengthLevel", "getTorchStrengthLevel", "isLowLightBoostSupported", "getLowLightBoostState", "Landroidx/camera/core/ExposureState;", "getExposureState", "()Landroidx/camera/core/ExposureState;", "Landroidx/camera/core/CameraState;", "getCameraState", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "listener", "", "addCameraStateListener", "(Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "removeCameraStateListener", "(Landroidx/core/util/Consumer;)V", "Landroidx/camera/core/impl/CameraCaptureCallback;", "callback", "addSessionCaptureCallback", "(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/CameraCaptureCallback;)V", "removeSessionCaptureCallback", "(Landroidx/camera/core/impl/CameraCaptureCallback;)V", "getImplementationType", "getEncoderProfilesProvider", "()Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/core/impl/Timebase;", "getTimebase", "()Landroidx/camera/core/impl/Timebase;", "getSupportedOutputFormats", "format", "", "Landroid/util/Size;", "getSupportedResolutions", "(I)Ljava/util/List;", "getSupportedHighResolutions", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "toString", "Landroidx/camera/core/impl/Quirks;", "getCameraQuirks", "()Landroidx/camera/core/impl/Quirks;", "Landroidx/camera/core/FocusMeteringAction;", "action", "isFocusMeteringSupported", "(Landroidx/camera/core/FocusMeteringAction;)Z", "Landroid/util/Range;", "getSupportedFrameRateRanges", "isZslSupported", "isPrivateReprocessingSupported", "Landroidx/camera/core/DynamicRange;", "getSupportedDynamicRanges", "isHighSpeedSupported", "getSupportedHighSpeedFrameRateRanges", "getSupportedHighSpeedResolutions", "()Ljava/util/List;", "fpsRange", "getSupportedHighSpeedResolutionsFor", "(Landroid/util/Range;)Ljava/util/List;", "Landroid/graphics/Rect;", "getSensorRect", "()Landroid/graphics/Rect;", "candidateDynamicRanges", "querySupportedDynamicRanges", "(Ljava/util/Set;)Ljava/util/Set;", "isPreviewStabilizationSupported", "isVideoStabilizationSupported", "", "getIntrinsicZoomRatio", "()F", "Landroidx/camera/core/UseCase;", "useCases", "cameraMode", "isFeatureComboInvocation", "Landroidx/camera/core/impl/CameraConfig;", "isUseCaseCombinationSupported", "(Ljava/util/List;IZLandroidx/camera/core/impl/CameraConfig;)Z", "getAvailableCapabilities", "lensFacingInt", "getCameraSelectorLensFacing", "Landroidx/camera/camera2/impl/CameraProperties;", "Landroidx/camera/camera2/config/CameraConfig;", "Landroidx/camera/camera2/adapter/CameraStateAdapter;", "Landroidx/camera/camera2/adapter/CameraControlStateAdapter;", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "Landroidx/camera/camera2/impl/FocusMeteringControl;", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "Landroidx/camera/core/impl/EncoderProfilesProvider;", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "Landroidx/camera/camera2/internal/IntrinsicZoomCalculator;", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "", "_physicalCameraInfos$delegate", "Lkotlin/Lazy;", "get_physicalCameraInfos", "_physicalCameraInfos", "isLegacyDevice$delegate", "isLegacyDevice", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "camera2CameraInfo$delegate", "getCamera2CameraInfo$camera_camera2", "()Landroidx/camera/camera2/interop/Camera2CameraInfo;", "getCamera2CameraInfo$camera_camera2$annotations", "()V", "camera2CameraInfo", "Companion", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraInfoAdapter implements CameraInfoInternal, UnsafeWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: _physicalCameraInfos$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy _physicalCameraInfos;

    /* JADX INFO: renamed from: camera2CameraInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy camera2CameraInfo;

    @NotNull
    private final CameraCallbackMap cameraCallbackMap;

    @NotNull
    private final CameraConfig cameraConfig;

    @NotNull
    private final CameraControlStateAdapter cameraControlStateAdapter;

    @NotNull
    private final CameraProperties cameraProperties;

    @NotNull
    private final CameraQuirks cameraQuirks;

    @NotNull
    private final CameraStateAdapter cameraStateAdapter;

    @NotNull
    private final EncoderProfilesProvider encoderProfilesProvider;

    @NotNull
    private final FocusMeteringControl focusMeteringControl;

    @NotNull
    private final IntrinsicZoomCalculator intrinsicZoomCalculator;

    /* JADX INFO: renamed from: isLegacyDevice$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isLegacyDevice;

    @NotNull
    private final StreamConfigurationMapCompat streamConfigurationMapCompat;

    @NotNull
    private final StreamSpecsCalculator streamSpecsCalculator;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u0001*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\u0002\u0010\tR\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/camera2/adapter/CameraInfoAdapter$Companion;", "", "<init>", "()V", "unwrapAs", "T", "Landroidx/camera/core/CameraInfo;", "type", "Lkotlin/reflect/KClass;", "(Landroidx/camera/core/CameraInfo;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "cameraId", "Landroidx/camera/camera2/pipe/CameraId;", "getCameraId-zjxgSG8", "(Landroidx/camera/core/CameraInfo;)Ljava/lang/String;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getCameraId-zjxgSG8, reason: not valid java name */
        public final String m1getCameraIdzjxgSG8(@NotNull CameraInfo cameraId) {
            Intrinsics.checkNotNullParameter(cameraId, "$this$cameraId");
            CameraMetadata cameraMetadata = (CameraMetadata) unwrapAs(cameraId, o0.f186429a.b(CameraMetadata.class));
            if (cameraMetadata != null) {
                return cameraMetadata.getCamera();
            }
            return null;
        }

        public final <T> T unwrapAs(@NotNull CameraInfo cameraInfo, @NotNull KClass type) {
            Intrinsics.checkNotNullParameter(cameraInfo, "<this>");
            Intrinsics.checkNotNullParameter(type, "type");
            if (cameraInfo instanceof UnsafeWrapper) {
                return (T) ((UnsafeWrapper) cameraInfo).unwrapAs(type);
            }
            if (cameraInfo instanceof CameraInfoInternal) {
                CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
                if (cameraInfoInternal.getImplementation() != cameraInfo) {
                    CameraInfoInternal implementation = cameraInfoInternal.getImplementation();
                    Intrinsics.checkNotNullExpressionValue(implementation, "getImplementation(...)");
                    return (T) unwrapAs(implementation, type);
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    public CameraInfoAdapter(@NotNull CameraProperties cameraProperties, @NotNull CameraConfig cameraConfig, @NotNull CameraStateAdapter cameraStateAdapter, @NotNull CameraControlStateAdapter cameraControlStateAdapter, @NotNull CameraCallbackMap cameraCallbackMap, @NotNull FocusMeteringControl focusMeteringControl, @NotNull CameraQuirks cameraQuirks, @NotNull EncoderProfilesProvider encoderProfilesProvider, @NotNull StreamConfigurationMapCompat streamConfigurationMapCompat, @NotNull IntrinsicZoomCalculator intrinsicZoomCalculator, @NotNull StreamSpecsCalculator streamSpecsCalculator) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        Intrinsics.checkNotNullParameter(cameraStateAdapter, "cameraStateAdapter");
        Intrinsics.checkNotNullParameter(cameraControlStateAdapter, "cameraControlStateAdapter");
        Intrinsics.checkNotNullParameter(cameraCallbackMap, "cameraCallbackMap");
        Intrinsics.checkNotNullParameter(focusMeteringControl, "focusMeteringControl");
        Intrinsics.checkNotNullParameter(cameraQuirks, "cameraQuirks");
        Intrinsics.checkNotNullParameter(encoderProfilesProvider, "encoderProfilesProvider");
        Intrinsics.checkNotNullParameter(streamConfigurationMapCompat, "streamConfigurationMapCompat");
        Intrinsics.checkNotNullParameter(intrinsicZoomCalculator, "intrinsicZoomCalculator");
        Intrinsics.checkNotNullParameter(streamSpecsCalculator, "streamSpecsCalculator");
        this.cameraProperties = cameraProperties;
        this.cameraConfig = cameraConfig;
        this.cameraStateAdapter = cameraStateAdapter;
        this.cameraControlStateAdapter = cameraControlStateAdapter;
        this.cameraCallbackMap = cameraCallbackMap;
        this.focusMeteringControl = focusMeteringControl;
        this.cameraQuirks = cameraQuirks;
        this.encoderProfilesProvider = encoderProfilesProvider;
        this.streamConfigurationMapCompat = streamConfigurationMapCompat;
        this.intrinsicZoomCalculator = intrinsicZoomCalculator;
        this.streamSpecsCalculator = streamSpecsCalculator;
        DeviceInfoLogger.INSTANCE.logDeviceInfo(cameraProperties);
        final int i = 0;
        this._physicalCameraInfos = j.b(new Function0(this) { // from class: n.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraInfoAdapter f210818b;

            {
                this.f210818b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return CameraInfoAdapter._physicalCameraInfos_delegate$lambda$0(this.f210818b);
                    case 1:
                        return Boolean.valueOf(CameraInfoAdapter.isLegacyDevice_delegate$lambda$0(this.f210818b));
                    default:
                        return CameraInfoAdapter.camera2CameraInfo_delegate$lambda$0(this.f210818b);
                }
            }
        });
        final int i2 = 1;
        this.isLegacyDevice = j.b(new Function0(this) { // from class: n.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraInfoAdapter f210818b;

            {
                this.f210818b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return CameraInfoAdapter._physicalCameraInfos_delegate$lambda$0(this.f210818b);
                    case 1:
                        return Boolean.valueOf(CameraInfoAdapter.isLegacyDevice_delegate$lambda$0(this.f210818b));
                    default:
                        return CameraInfoAdapter.camera2CameraInfo_delegate$lambda$0(this.f210818b);
                }
            }
        });
        final int i3 = 2;
        this.camera2CameraInfo = j.b(new Function0(this) { // from class: n.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CameraInfoAdapter f210818b;

            {
                this.f210818b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return CameraInfoAdapter._physicalCameraInfos_delegate$lambda$0(this.f210818b);
                    case 1:
                        return Boolean.valueOf(CameraInfoAdapter.isLegacyDevice_delegate$lambda$0(this.f210818b));
                    default:
                        return CameraInfoAdapter.camera2CameraInfo_delegate$lambda$0(this.f210818b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _physicalCameraInfos_delegate$lambda$0(CameraInfoAdapter cameraInfoAdapter) {
        Set<CameraId> physicalCameraIds = cameraInfoAdapter.cameraProperties.getMetadata().getPhysicalCameraIds();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = physicalCameraIds.iterator();
        while (it8.hasNext()) {
            String value = ((CameraId) it8.next()).getValue();
            linkedHashSet.add(new PhysicalCameraInfoAdapter(new CameraPipeCameraProperties(new CameraConfig(value, null), cameraInfoAdapter.cameraProperties.getMetadata().mo190awaitPhysicalMetadataEfqyGwQ(value))));
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Camera2CameraInfo camera2CameraInfo_delegate$lambda$0(CameraInfoAdapter cameraInfoAdapter) {
        return Camera2CameraInfo.INSTANCE.create(cameraInfoAdapter.cameraProperties);
    }

    private final int getCameraSelectorLensFacing(int lensFacingInt) {
        if (lensFacingInt == 0) {
            return 0;
        }
        int i = 1;
        if (lensFacingInt != 1) {
            i = 2;
            if (lensFacingInt != 2) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (!Logger.isWarnEnabled("CXCP")) {
                    return -1;
                }
                String unused = Camera2Logger.TRUNCATED_TAG;
                String str = "Unrecognized lens facing: " + lensFacingInt + '!';
                return -1;
            }
        }
        return i;
    }

    private final Set<CameraInfo> get_physicalCameraInfos() {
        return (Set) this._physicalCameraInfos.getValue();
    }

    private final boolean isLegacyDevice() {
        return ((Boolean) this.isLegacyDevice.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLegacyDevice_delegate$lambda$0(CameraInfoAdapter cameraInfoAdapter) {
        return CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraInfoAdapter.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public void addCameraStateListener(@NotNull Executor executor, @NotNull Consumer<CameraState> listener) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.cameraStateAdapter.addCameraStateListener$camera_camera2(executor, listener);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(@NotNull Executor executor, @NotNull CameraCaptureCallback callback) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cameraCallbackMap.addCaptureCallback(callback, executor);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Set<Integer> getAvailableCapabilities() {
        Set<Integer> destination;
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) metadata.get(REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    destination = new LinkedHashSet<>(q0.b(iArr.length));
                    Intrinsics.checkNotNullParameter(iArr, "<this>");
                    Intrinsics.checkNotNullParameter(destination, "destination");
                    for (int i : iArr) {
                        destination.add(Integer.valueOf(i));
                    }
                } else {
                    destination = y0.b(Integer.valueOf(iArr[0]));
                }
            } else {
                destination = h0.f322473a;
            }
            if (destination != null) {
                return destination;
            }
        }
        return h0.f322473a;
    }

    @NotNull
    public final Camera2CameraInfo getCamera2CameraInfo$camera_camera2() {
        return (Camera2CameraInfo) this.camera2CameraInfo.getValue();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public String getCameraId() {
        return this.cameraConfig.getCameraId();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Quirks getCameraQuirks() {
        return this.cameraQuirks.getQuirks();
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public LiveData<CameraState> getCameraState() {
        return this.cameraStateAdapter.getCameraState$camera_camera2();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.encoderProfilesProvider;
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public ExposureState getExposureState() {
        return this.cameraControlStateAdapter.getExposureState();
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public String getImplementationType() {
        return isLegacyDevice() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        Float fCalculateIntrinsicZoomRatio = this.intrinsicZoomCalculator.calculateIntrinsicZoomRatio(this.cameraProperties.getMetadata());
        if (fCalculateIntrinsicZoomRatio != null) {
            return fCalculateIntrinsicZoomRatio.floatValue();
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (!Logger.isWarnEnabled("CXCP")) {
            return 1.0f;
        }
        String unused = Camera2Logger.TRUNCATED_TAG;
        String str = "Failed to calculate intrinsic zoom ratio for " + ((Object) CameraId.m186toStringimpl(this.cameraProperties.mo31getCameraIdDz_R5H8()));
        return 1.0f;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.checkNotNullExpressionValue(LENS_FACING, "LENS_FACING");
        Object obj2 = metadata.get((CameraCharacteristics.Key<Object>) LENS_FACING);
        Intrinsics.h(obj2);
        return getCameraSelectorLensFacing(((Number) obj2).intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public LiveData<Integer> getLowLightBoostState() {
        return this.cameraControlStateAdapter.getLowLightBoostState();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getMaxTorchStrengthLevel() {
        if (isTorchStrengthSupported()) {
            return CameraMetadata.INSTANCE.getMaxTorchStrengthLevel(this.cameraProperties.getMetadata());
        }
        return 0;
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public Set<CameraInfo> getPhysicalCameraInfos() {
        return get_physicalCameraInfos();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Rect getSensorRect() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key SENSOR_INFO_ACTIVE_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_ACTIVE_ARRAY_SIZE, "SENSOR_INFO_ACTIVE_ARRAY_SIZE");
        Rect rect = (Rect) metadata.get(SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        Intrinsics.h(rect);
        return rect;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Set<DynamicRange> getSupportedDynamicRanges() {
        return DynamicRangeProfilesCompat.INSTANCE.fromCameraMetaData(this.cameraProperties.getMetadata()).getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public Set<Range<Integer>> getSupportedFrameRateRanges() {
        Set<Range<Integer>> setY0;
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        Range[] rangeArr = (Range[]) metadata.get(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        return (rangeArr == null || (setY0 = d.y0(rangeArr)) == null) ? h0.f322473a : setY0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public List<Size> getSupportedHighResolutions(int format) {
        List<Size> listV0;
        Size[] highResolutionOutputSizes = this.streamConfigurationMapCompat.getHighResolutionOutputSizes(format);
        return (highResolutionOutputSizes == null || (listV0 = d.v0(highResolutionOutputSizes)) == null) ? f0.f322471a : listV0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Set<Range<Integer>> getSupportedHighSpeedFrameRateRanges() {
        Set<Range<Integer>> setY0;
        Range<Integer>[] highSpeedVideoFpsRanges = this.streamConfigurationMapCompat.getHighSpeedVideoFpsRanges();
        return (highSpeedVideoFpsRanges == null || (setY0 = d.y0(highSpeedVideoFpsRanges)) == null) ? h0.f322473a : setY0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public List<Size> getSupportedHighSpeedResolutions() {
        List<Size> listV0;
        Size[] highSpeedVideoSizes = this.streamConfigurationMapCompat.getHighSpeedVideoSizes();
        return (highSpeedVideoSizes == null || (listV0 = d.v0(highSpeedVideoSizes)) == null) ? f0.f322471a : listV0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public List<Size> getSupportedHighSpeedResolutionsFor(@NotNull Range<Integer> fpsRange) {
        Object objA;
        Intrinsics.checkNotNullParameter(fpsRange, "fpsRange");
        try {
            m.Companion companion = m.INSTANCE;
            Size[] highSpeedVideoSizesFor = this.streamConfigurationMapCompat.getHighSpeedVideoSizesFor(fpsRange);
            objA = highSpeedVideoSizesFor != null ? d.v0(highSpeedVideoSizesFor) : null;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        List<Size> list = (List) (objA instanceof n ? null : objA);
        return list == null ? f0.f322471a : list;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Set<Integer> getSupportedOutputFormats() {
        Set<Integer> setY0;
        Integer[] outputFormats = this.streamConfigurationMapCompat.getOutputFormats();
        return (outputFormats == null || (setY0 = d.y0(outputFormats)) == null) ? h0.f322473a : setY0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public List<Size> getSupportedResolutions(int format) {
        List<Size> listV0;
        Size[] outputSizes = this.streamConfigurationMapCompat.getOutputSizes(format);
        return (outputSizes == null || (listV0 = d.v0(outputSizes)) == null) ? f0.f322471a : listV0;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public Timebase getTimebase() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key SENSOR_INFO_TIMESTAMP_SOURCE = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_TIMESTAMP_SOURCE, "SENSOR_INFO_TIMESTAMP_SOURCE");
        Object obj2 = metadata.get((CameraCharacteristics.Key<Object>) SENSOR_INFO_TIMESTAMP_SOURCE);
        Intrinsics.h(obj2);
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue != 0 && iIntValue == 1) {
            return Timebase.REALTIME;
        }
        return Timebase.UPTIME;
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public LiveData<Integer> getTorchState() {
        return this.cameraControlStateAdapter.getTorchStateLiveData();
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public LiveData<Integer> getTorchStrengthLevel() {
        return isTorchStrengthSupported() ? this.cameraControlStateAdapter.getTorchStrengthLiveData() : new MutableLiveData(0);
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public LiveData<ZoomState> getZoomState() {
        return this.cameraControlStateAdapter.getZoomStateLiveData();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return FlashAvailabilityCheckerKt.isFlashAvailable$default(this.cameraProperties, false, 1, null);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isExternalCamera() {
        if (getLensFacing() == 2) {
            return true;
        }
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num = (Integer) metadata.get(INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 4;
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@NotNull FocusMeteringAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return this.focusMeteringControl.isFocusMeteringSupported(action);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isHighSpeedSupported() {
        return CameraMetadata.INSTANCE.getSupportsHighSpeedVideo(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return CameraMetadata.INSTANCE.getSupportsLogicalMultiCamera(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLowLightBoostSupported() {
        return CameraMetadata.INSTANCE.getSupportsLowLightBoost(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        return CameraMetadata.INSTANCE.getSupportsPreviewStabilization(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return CameraMetadata.INSTANCE.getSupportsPrivateReprocessing(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isTorchStrengthSupported() {
        return CameraMetadata.INSTANCE.getSupportsTorchStrength(this.cameraProperties.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isUseCaseCombinationSupported(@NotNull List<? extends UseCase> useCases, int cameraMode, boolean isFeatureComboInvocation, @NotNull androidx.camera.core.impl.CameraConfig cameraConfig) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
        try {
            StreamSpecsCalculator.calculateSuggestedStreamSpecs$default(this.streamSpecsCalculator, cameraMode, this, useCases, null, cameraConfig, 0, null, isFeatureComboInvocation, false, 360, null);
            return true;
        } catch (IllegalArgumentException e) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (!Logger.isDebugEnabled("CXCP")) {
                return false;
            }
            String unused = Camera2Logger.TRUNCATED_TAG;
            return false;
        }
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, "CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES");
        int[] iArr = (int[]) metadata.get(CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        return iArr != null && d.G(iArr, 1);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        return isPrivateReprocessingSupported() && DeviceQuirks.INSTANCE.get(ZslDisablerQuirk.class) == null;
    }

    @Override // androidx.camera.core.CameraInfo
    @NotNull
    public Set<DynamicRange> querySupportedDynamicRanges(@NotNull Set<DynamicRange> candidateDynamicRanges) {
        Intrinsics.checkNotNullParameter(candidateDynamicRanges, "candidateDynamicRanges");
        return DynamicRanges.findAllPossibleMatches(candidateDynamicRanges, getSupportedDynamicRanges());
    }

    @Override // androidx.camera.core.CameraInfo
    public void removeCameraStateListener(@NotNull Consumer<CameraState> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.cameraStateAdapter.removeCameraStateListener$camera_camera2(listener);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(@NotNull CameraCaptureCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cameraCallbackMap.removeCaptureCallback(callback);
    }

    @NotNull
    public String toString() {
        return "CameraInfoAdapter<" + this.cameraConfig + ".cameraId>";
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(type, p0Var.b(Camera2CameraInfo.class))) {
            T t2 = (T) getCamera2CameraInfo$camera_camera2();
            Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
            return t2;
        }
        if (Intrinsics.f(type, p0Var.b(CameraProperties.class))) {
            T t3 = (T) this.cameraProperties;
            Intrinsics.i(t3, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
            return t3;
        }
        if (!Intrinsics.f(type, p0Var.b(CameraMetadata.class))) {
            return (T) this.cameraProperties.getMetadata().unwrapAs(type);
        }
        T t5 = (T) this.cameraProperties.getMetadata();
        Intrinsics.i(t5, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CameraInfoAdapter.unwrapAs");
        return t5;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    @NotNull
    public CameraCharacteristics getCameraCharacteristics() {
        Object objUnwrapAs = this.cameraProperties.getMetadata().unwrapAs(o0.f186429a.b(CameraCharacteristics.class));
        Intrinsics.h(objUnwrapAs);
        return (CameraCharacteristics) objUnwrapAs;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int relativeRotation) {
        CameraMetadata metadata = this.cameraProperties.getMetadata();
        CameraCharacteristics.Key SENSOR_ORIENTATION = CameraCharacteristics.SENSOR_ORIENTATION;
        Intrinsics.checkNotNullExpressionValue(SENSOR_ORIENTATION, "SENSOR_ORIENTATION");
        Object obj2 = metadata.get((CameraCharacteristics.Key<Object>) SENSOR_ORIENTATION);
        Intrinsics.h(obj2);
        return CameraOrientationUtil.getRelativeImageRotation(CameraOrientationUtil.surfaceRotationToDegrees(relativeRotation), ((Number) obj2).intValue(), 1 == getLensFacing());
    }
}
