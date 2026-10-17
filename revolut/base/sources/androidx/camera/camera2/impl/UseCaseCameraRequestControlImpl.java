package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.TagBundle;
import ch.qos.logback.core.CoreConstants;
import gim.c;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import phm.a;
import skm.d0;
import skm.e0;
import skm.g0;
import skm.q;
import skm.r;
import yhm.j;
import zhm.r0;
import zhm.z0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0090\u00012\u00020\u0001:\u0004\u0091\u0001\u0090\u0001BO\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ=\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010!J+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J1\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010*\u001a\u00020)2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00130\u0011H\u0016¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0019H\u0016¢\u0006\u0004\b0\u00101J\u001d\u00106\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105Ju\u0010D\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e2\u000e\u00109\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e2\b\u0010<\u001a\u0004\u0018\u00010;2\b\u0010=\u001a\u0004\u0018\u00010;2\b\u0010>\u001a\u0004\u0018\u00010;2\b\u0010?\u001a\u0004\u0018\u0001022\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020/0\u0019H\u0016¢\u0006\u0004\bE\u00101JC\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010L0\u00190\u001e2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u001e2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010K\u001a\u00020HH\u0016¢\u0006\u0004\bM\u0010NJE\u0010O\u001a\b\u0012\u0004\u0012\u00020/0\u00192\u000e\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e2\u000e\u00109\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001e2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\u001eH\u0016¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\"H\u0096@¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001aH\u0016¢\u0006\u0004\bS\u0010TJ\u0013\u0010X\u001a\u00020U*\u00020\u000bH\u0000¢\u0006\u0004\bV\u0010WJ3\u0010Z\u001a\u00020Y*\u00020Y2\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bZ\u0010[J%\u0010\\\u001a\u00020Y*\u00020Y2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u001eH\u0002¢\u0006\u0004\b\\\u0010]J>\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b^\u0010_J-\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010L0\u00190\u001e2\u0006\u0010`\u001a\u00020H2\u0006\u0010a\u001a\u00020+H\u0002¢\u0006\u0004\bb\u0010cJ\u0019\u0010d\u001a\u00020\"*\b\u0012\u0004\u0012\u00020F0\u001eH\u0002¢\u0006\u0004\bd\u0010eJ\u001f\u0010f\u001a\u00020Y*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020Y0\u0011H\u0002¢\u0006\u0004\bf\u0010gJ\u0013\u0010i\u001a\u00020h*\u00020YH\u0002¢\u0006\u0004\bi\u0010jJ,\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020Y2\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020l\u0018\u00010kH\u0082@¢\u0006\u0004\bn\u0010oJ?\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010p2\"\u0010s\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190r\u0012\u0006\u0012\u0004\u0018\u00010\u00130qH\u0002¢\u0006\u0004\bt\u0010uJS\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u001e\"\u0004\b\u0000\u0010p2\u0006\u0010v\u001a\u00020H2(\u0010s\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00190\u001e0r\u0012\u0006\u0012\u0004\u0018\u00010\u00130qH\u0002¢\u0006\u0004\bw\u0010xR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010yR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010yR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010zR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010yR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010{R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010|R\u0016\u0010}\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R(\u0010\u0084\u0001\u001a\n \u007f*\u0004\u0018\u00010\u00030\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R(\u0010\u0088\u0001\u001a\n \u007f*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0081\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u008c\u0001\u001a\n \u007f*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0081\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R$\u0010\u008e\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020Y0\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl;", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "Lphm/a;", "Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipelineProvider", "Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraStateProvider", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManagerProvider", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "<init>", "(Lphm/a;Lphm/a;Landroidx/camera/camera2/config/UseCaseGraphContext;Lphm/a;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/core/CameraXConfig;)V", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "values", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;", "type", "Landroidx/camera/core/impl/Config$OptionPriority;", "optionPriority", "Lskm/g0;", "", "setParametersAsync", "(Ljava/util/Map;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Landroidx/camera/core/impl/Config$OptionPriority;)Lskm/g0;", "submitParameters", "", "keys", "removeParametersAsync", "(Ljava/util/List;Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;)Lskm/g0;", "", "isPrimary", "", "Landroidx/camera/core/UseCase;", "runningUseCases", "updateRepeatingRequestAsync", "(ZLjava/util/Collection;)Lskm/g0;", "Landroidx/camera/core/impl/Config;", "config", "", "tags", "updateCamera2ConfigAsync", "(Landroidx/camera/core/impl/Config;Ljava/util/Map;)Lskm/g0;", "Landroidx/camera/camera2/pipe/Result3A;", "setTorchOnAsync", "()Lskm/g0;", "Landroidx/camera/camera2/pipe/AeMode;", "aeMode", "setTorchOffAsync-MtizInI", "(I)Lskm/g0;", "setTorchOffAsync", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "aeLockBehavior", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "", "timeLimitNs", "startFocusAndMeteringAsync-NxRnBj4", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;J)Lskm/g0;", "startFocusAndMeteringAsync", "cancelFocusAndMeteringAsync", "Landroidx/camera/core/impl/CaptureConfig;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "issueSingleCaptureAsync", "(Ljava/util/List;III)Ljava/util/List;", "update3aRegions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lskm/g0;", "awaitSurfaceSetup", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "()V", "Lskm/d0;", "determineStartStrategy$camera_camera2", "(Landroidx/camera/camera2/impl/UseCaseThreads;)Lskm/d0;", "determineStartStrategy", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "withParameters", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;Ljava/util/Map;Landroidx/camera/core/impl/Config$OptionPriority;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "withoutParameters", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;Ljava/util/List;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "setParametersInternal", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl$Type;Ljava/util/Map;Landroidx/camera/core/impl/Config$OptionPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "message", "failedResults", "(ILjava/lang/String;)Ljava/util/List;", "hasInvalidSurface", "(Ljava/util/List;)Z", "merge", "(Ljava/util/Map;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "Landroidx/camera/core/impl/TagBundle;", "toTagBundle", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;)Landroidx/camera/core/impl/TagBundle;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streams", "updateCameraStateAsync", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "runOnSequential", "(Lkotlin/jvm/functions/Function1;)Lskm/g0;", "size", "runOnSequentialList", "(ILkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lphm/a;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/core/CameraXConfig;", "closed", "Z", "kotlin.jvm.PlatformType", "capturePipeline$delegate", "Lkotlin/Lazy;", "getCapturePipeline", "()Landroidx/camera/camera2/impl/CapturePipeline;", "capturePipeline", "useCaseSurfaceManager$delegate", "getUseCaseSurfaceManager", "()Landroidx/camera/camera2/impl/UseCaseSurfaceManager;", "useCaseSurfaceManager", "useCaseCameraState$delegate", "getUseCaseCameraState", "()Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraState", "", "infoBundleMap", "Ljava/util/Map;", "Companion", "InfoBundle", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UseCaseCameraRequestControlImpl implements UseCaseCameraRequestControl {

    @NotNull
    private static final q canceledResult;
    private final CameraXConfig cameraXConfig;

    /* JADX INFO: renamed from: capturePipeline$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy capturePipeline;

    @NotNull
    private final a capturePipelineProvider;
    private volatile boolean closed;

    @NotNull
    private final Map<UseCaseCameraRequestControl.Type, InfoBundle> infoBundleMap;

    @NotNull
    private final UseCaseThreads threads;

    /* JADX INFO: renamed from: useCaseCameraState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCaseCameraState;

    @NotNull
    private final a useCaseCameraStateProvider;

    @NotNull
    private final UseCaseGraphContext useCaseGraphContext;

    /* JADX INFO: renamed from: useCaseSurfaceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCaseSurfaceManager;

    @NotNull
    private final a useCaseSurfaceManagerProvider;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final q submitFailedResult = e0.a(new Result3A(Result3A.Status.INSTANCE.m340getSUBMIT_FAILEDJvTi9ms(), null, 2, null));

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\f\u001a\u00020\u000b*\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001a\u001a\u00020\u0017*\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$Companion;", "", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig;", "Ljava/util/concurrent/Executor;", "callbackExecutor", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "toInfoBundle", "(Landroidx/camera/core/impl/SessionConfig;Ljava/util/concurrent/Executor;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "Landroidx/camera/core/impl/Config;", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "extractCamera2ImplConfigBuilder", "(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "(Landroidx/camera/core/impl/SessionConfig;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "", "", "extractTags", "(Landroidx/camera/core/impl/SessionConfig;)Ljava/util/Map;", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "extractListeners", "(Landroidx/camera/core/impl/SessionConfig;Ljava/util/concurrent/Executor;)Ljava/util/Set;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "extractTemplate-ARED-Gk", "(Landroidx/camera/core/impl/SessionConfig;)I", "extractTemplate", "Lskm/q;", "Landroidx/camera/camera2/pipe/Result3A;", "submitFailedResult", "Lskm/q;", "", "canceledResult", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InfoBundle toInfoBundle(SessionConfig sessionConfig, Executor executor) {
            return new InfoBundle(extractCamera2ImplConfigBuilder(sessionConfig), extractTags(sessionConfig), extractListeners(sessionConfig, executor), RequestTemplate.m324boximpl(m57extractTemplateAREDGk(sessionConfig)), null);
        }

        @NotNull
        public final Camera2ImplConfig.Builder extractCamera2ImplConfigBuilder(@NotNull SessionConfig sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            if (!Intrinsics.f(sessionConfig.getExpectedFrameRateRange(), StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                CaptureRequest.Key CONTROL_AE_TARGET_FPS_RANGE = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                Intrinsics.checkNotNullExpressionValue(CONTROL_AE_TARGET_FPS_RANGE, "CONTROL_AE_TARGET_FPS_RANGE");
                builder.setCaptureRequestOption(CONTROL_AE_TARGET_FPS_RANGE, sessionConfig.getExpectedFrameRateRange());
            }
            Config implementationOptions = sessionConfig.getImplementationOptions();
            Intrinsics.checkNotNullExpressionValue(implementationOptions, "getImplementationOptions(...)");
            builder.insertAllOptions(implementationOptions);
            return builder;
        }

        @NotNull
        public final Set<Request.Listener> extractListeners(@NotNull SessionConfig sessionConfig, @NotNull Executor callbackExecutor) {
            Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
            Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
            CameraCallbackMap.Companion companion = CameraCallbackMap.INSTANCE;
            List<CameraCaptureCallback> repeatingCameraCaptureCallbacks = sessionConfig.getRepeatingCameraCaptureCallbacks();
            Intrinsics.checkNotNullExpressionValue(repeatingCameraCaptureCallbacks, "getRepeatingCameraCaptureCallbacks(...)");
            return z0.g(companion.createFor(repeatingCameraCaptureCallbacks, callbackExecutor));
        }

        @NotNull
        public final Map<String, Object> extractTags(@NotNull SessionConfig sessionConfig) {
            Intrinsics.checkNotNullParameter(sessionConfig, "<this>");
            TagBundle tagBundle = sessionConfig.getRepeatingCaptureConfig().getTagBundle();
            Intrinsics.checkNotNullExpressionValue(tagBundle, "getTagBundle(...)");
            return r0.z(UseCaseCameraRequestControlKt.toMap(tagBundle));
        }

        /* JADX INFO: renamed from: extractTemplate-ARED-Gk, reason: not valid java name */
        public final int m57extractTemplateAREDGk(@NotNull SessionConfig extractTemplate) {
            Intrinsics.checkNotNullParameter(extractTemplate, "$this$extractTemplate");
            return RequestTemplate.m325constructorimpl(extractTemplate.getTemplateType());
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Camera2ImplConfig.Builder extractCamera2ImplConfigBuilder(Config config) {
            Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
            builder.insertAllOptions(config);
            return builder;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJL\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "options", "", "", "tags", "", "Landroidx/camera/camera2/pipe/Request$Listener;", "listeners", "Landroidx/camera/camera2/pipe/RequestTemplate;", "template", "<init>", "(Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;Ljava/util/Map;Ljava/util/Set;Landroidx/camera/camera2/pipe/RequestTemplate;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-0am55g4", "(Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;Ljava/util/Map;Ljava/util/Set;Landroidx/camera/camera2/pipe/RequestTemplate;)Landroidx/camera/camera2/impl/UseCaseCameraRequestControlImpl$InfoBundle;", "copy", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "getOptions", "()Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;", "Ljava/util/Map;", "getTags", "()Ljava/util/Map;", "Ljava/util/Set;", "getListeners", "()Ljava/util/Set;", "Landroidx/camera/camera2/pipe/RequestTemplate;", "getTemplate-ejQnlcg", "()Landroidx/camera/camera2/pipe/RequestTemplate;", "setTemplate-xlOpshk", "(Landroidx/camera/camera2/pipe/RequestTemplate;)V", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoBundle {

        @NotNull
        private final Set<Request.Listener> listeners;

        @NotNull
        private final Camera2ImplConfig.Builder options;

        @NotNull
        private final Map<String, Object> tags;
        private RequestTemplate template;

        public /* synthetic */ InfoBundle(Camera2ImplConfig.Builder builder, Map map, Set set, RequestTemplate requestTemplate, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder, map, set, requestTemplate);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-0am55g4$default, reason: not valid java name */
        public static /* synthetic */ InfoBundle m58copy0am55g4$default(InfoBundle infoBundle, Camera2ImplConfig.Builder builder, Map map, Set set, RequestTemplate requestTemplate, int i, Object obj2) {
            if ((i & 1) != 0) {
                builder = infoBundle.options;
            }
            if ((i & 2) != 0) {
                map = infoBundle.tags;
            }
            if ((i & 4) != 0) {
                set = infoBundle.listeners;
            }
            if ((i & 8) != 0) {
                requestTemplate = infoBundle.template;
            }
            return infoBundle.m59copy0am55g4(builder, map, set, requestTemplate);
        }

        @NotNull
        /* JADX INFO: renamed from: copy-0am55g4, reason: not valid java name */
        public final InfoBundle m59copy0am55g4(@NotNull Camera2ImplConfig.Builder options, @NotNull Map<String, Object> tags, @NotNull Set<Request.Listener> listeners, RequestTemplate template) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(listeners, "listeners");
            return new InfoBundle(options, tags, listeners, template, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBundle)) {
                return false;
            }
            InfoBundle infoBundle = (InfoBundle) other;
            return Intrinsics.f(this.options, infoBundle.options) && Intrinsics.f(this.tags, infoBundle.tags) && Intrinsics.f(this.listeners, infoBundle.listeners) && Intrinsics.f(this.template, infoBundle.template);
        }

        @NotNull
        public final Set<Request.Listener> getListeners() {
            return this.listeners;
        }

        @NotNull
        public final Camera2ImplConfig.Builder getOptions() {
            return this.options;
        }

        @NotNull
        public final Map<String, Object> getTags() {
            return this.tags;
        }

        /* JADX INFO: renamed from: getTemplate-ejQnlcg, reason: not valid java name and from getter */
        public final RequestTemplate getTemplate() {
            return this.template;
        }

        public int hashCode() {
            int iF = p.a.f(p.a.e(this.options.hashCode() * 31, 31, this.tags), 31, this.listeners);
            RequestTemplate requestTemplate = this.template;
            return iF + (requestTemplate == null ? 0 : RequestTemplate.m329hashCodeimpl(requestTemplate.getValue()));
        }

        /* JADX INFO: renamed from: setTemplate-xlOpshk, reason: not valid java name */
        public final void m61setTemplatexlOpshk(RequestTemplate requestTemplate) {
            this.template = requestTemplate;
        }

        @NotNull
        public String toString() {
            return "InfoBundle(options=" + this.options + ", tags=" + this.tags + ", listeners=" + this.listeners + ", template=" + this.template + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private InfoBundle(Camera2ImplConfig.Builder options, Map<String, Object> tags, Set<Request.Listener> listeners, RequestTemplate requestTemplate) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(listeners, "listeners");
            this.options = options;
            this.tags = tags;
            this.listeners = listeners;
            this.template = requestTemplate;
        }

        public /* synthetic */ InfoBundle(Camera2ImplConfig.Builder builder, Map map, Set set, RequestTemplate requestTemplate, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new Camera2ImplConfig.Builder() : builder, (i & 2) != 0 ? new LinkedHashMap() : map, (i & 4) != 0 ? new LinkedHashSet() : set, (i & 8) != 0 ? null : requestTemplate, null);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$submitParameters$1", f = "UseCaseCameraRequestControl.kt", l = {365, 365}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Config.OptionPriority $optionPriority;
        final /* synthetic */ UseCaseCameraRequestControl.Type $type;
        final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = type;
            this.$values = map;
            this.$optionPriority = optionPriority;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return UseCaseCameraRequestControlImpl.this.new AnonymousClass1(this.$type, this.$values, this.$optionPriority, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            if (((skm.g0) r7).i(r6) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r7)
                goto L3b
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                yhm.o.b(r7)
                goto L30
            L1c:
                yhm.o.b(r7)
                androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl r7 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.this
                androidx.camera.camera2.impl.UseCaseCameraRequestControl$Type r1 = r6.$type
                java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, java.lang.Object> r4 = r6.$values
                androidx.camera.core.impl.Config$OptionPriority r5 = r6.$optionPriority
                r6.label = r3
                java.lang.Object r7 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.access$setParametersInternal(r7, r1, r4, r5, r6)
                if (r7 != r0) goto L30
                goto L3a
            L30:
                skm.g0 r7 = (skm.g0) r7
                r6.label = r2
                java.lang.Object r7 = r7.i(r6)
                if (r7 != r0) goto L3b
            L3a:
                return r0
            L3b:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl", f = "UseCaseCameraRequestControl.kt", l = {638}, m = "updateCameraStateAsync", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18341 extends c {
        int label;
        /* synthetic */ Object result;

        public C18341(Continuation<? super C18341> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return UseCaseCameraRequestControlImpl.this.updateCameraStateAsync(null, null, this);
        }
    }

    static {
        r rVarB = e0.b();
        rVarB.f(null);
        canceledResult = rVarB;
    }

    public UseCaseCameraRequestControlImpl(@NotNull a capturePipelineProvider, @NotNull a useCaseCameraStateProvider, @NotNull UseCaseGraphContext useCaseGraphContext, @NotNull a useCaseSurfaceManagerProvider, @NotNull UseCaseThreads threads, CameraXConfig cameraXConfig) {
        Intrinsics.checkNotNullParameter(capturePipelineProvider, "capturePipelineProvider");
        Intrinsics.checkNotNullParameter(useCaseCameraStateProvider, "useCaseCameraStateProvider");
        Intrinsics.checkNotNullParameter(useCaseGraphContext, "useCaseGraphContext");
        Intrinsics.checkNotNullParameter(useCaseSurfaceManagerProvider, "useCaseSurfaceManagerProvider");
        Intrinsics.checkNotNullParameter(threads, "threads");
        this.capturePipelineProvider = capturePipelineProvider;
        this.useCaseCameraStateProvider = useCaseCameraStateProvider;
        this.useCaseGraphContext = useCaseGraphContext;
        this.useCaseSurfaceManagerProvider = useCaseSurfaceManagerProvider;
        this.threads = threads;
        this.cameraXConfig = cameraXConfig;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "Configured " + this;
        }
        final int i = 0;
        this.capturePipeline = j.b(new Function0(this) { // from class: s.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraRequestControlImpl f258731b;

            {
                this.f258731b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return UseCaseCameraRequestControlImpl.capturePipeline_delegate$lambda$0(this.f258731b);
                    case 1:
                        return UseCaseCameraRequestControlImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258731b);
                    default:
                        return UseCaseCameraRequestControlImpl.useCaseCameraState_delegate$lambda$0(this.f258731b);
                }
            }
        });
        final int i2 = 1;
        this.useCaseSurfaceManager = j.b(new Function0(this) { // from class: s.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraRequestControlImpl f258731b;

            {
                this.f258731b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return UseCaseCameraRequestControlImpl.capturePipeline_delegate$lambda$0(this.f258731b);
                    case 1:
                        return UseCaseCameraRequestControlImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258731b);
                    default:
                        return UseCaseCameraRequestControlImpl.useCaseCameraState_delegate$lambda$0(this.f258731b);
                }
            }
        });
        final int i3 = 2;
        this.useCaseCameraState = j.b(new Function0(this) { // from class: s.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UseCaseCameraRequestControlImpl f258731b;

            {
                this.f258731b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return UseCaseCameraRequestControlImpl.capturePipeline_delegate$lambda$0(this.f258731b);
                    case 1:
                        return UseCaseCameraRequestControlImpl.useCaseSurfaceManager_delegate$lambda$0(this.f258731b);
                    default:
                        return UseCaseCameraRequestControlImpl.useCaseCameraState_delegate$lambda$0(this.f258731b);
                }
            }
        });
        this.infoBundleMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CapturePipeline capturePipeline_delegate$lambda$0(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl) {
        return (CapturePipeline) useCaseCameraRequestControlImpl.capturePipelineProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<g0> failedResults(int count, String message) {
        ArrayList arrayList = new ArrayList(count);
        for (int i = 0; i < count; i++) {
            r rVarB = e0.b();
            rVarB.h0(new ImageCaptureException(2, message, null));
            arrayList.add(rVarB);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CapturePipeline getCapturePipeline() {
        return (CapturePipeline) this.capturePipeline.getValue();
    }

    private final UseCaseCameraState getUseCaseCameraState() {
        return (UseCaseCameraState) this.useCaseCameraState.getValue();
    }

    private final UseCaseSurfaceManager getUseCaseSurfaceManager() {
        return (UseCaseSurfaceManager) this.useCaseSurfaceManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasInvalidSurface(List<CaptureConfig> list) {
        for (CaptureConfig captureConfig : list) {
            if (captureConfig.getSurfaces().isEmpty()) {
                return true;
            }
            List<DeferrableSurface> surfaces = captureConfig.getSurfaces();
            Intrinsics.checkNotNullExpressionValue(surfaces, "getSurfaces(...)");
            Iterator<T> it8 = surfaces.iterator();
            while (it8.hasNext()) {
                if (this.useCaseGraphContext.getSurfaceToStreamMap().get((DeferrableSurface) it8.next()) == null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle merge(Map<UseCaseCameraRequestControl.Type, InfoBundle> map) {
        InfoBundle infoBundle = new InfoBundle(null, null, null, RequestTemplate.m324boximpl(RequestTemplate.m325constructorimpl(1)), 7, null);
        Iterator<E> it8 = UseCaseCameraRequestControl.Type.getEntries().iterator();
        while (it8.hasNext()) {
            InfoBundle infoBundle2 = map.get((UseCaseCameraRequestControl.Type) it8.next());
            if (infoBundle2 != null) {
                infoBundle.getOptions().insertAllOptions(infoBundle2.getOptions().getMutableConfig());
                infoBundle.getTags().putAll(infoBundle2.getTags());
                infoBundle.getListeners().addAll(infoBundle2.getListeners());
                RequestTemplate template = infoBundle2.getTemplate();
                if (template != null) {
                    infoBundle.m61setTemplatexlOpshk(RequestTemplate.m324boximpl(template.getValue()));
                }
            }
        }
        return infoBundle;
    }

    private final <T> g0 runOnSequential(Function1<? super Continuation<? super g0>, ? extends Object> block) {
        d0 d0VarDetermineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(this.threads);
        UseCaseThreads useCaseThreads = this.threads;
        r rVarB = e0.b();
        e0.C(useCaseThreads.getSequentialScope(), null, d0VarDetermineStartStrategy$camera_camera2, new UseCaseCameraRequestControlImpl$runOnSequential$$inlined$confineDeferredSuspend$1(block, rVarB, null), 1);
        return rVarB;
    }

    private final <T> List<g0> runOnSequentialList(int size, Function1<? super Continuation<? super List<? extends g0>>, ? extends Object> block) {
        d0 d0VarDetermineStartStrategy$camera_camera2 = determineStartStrategy$camera_camera2(this.threads);
        UseCaseThreads useCaseThreads = this.threads;
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(e0.b());
        }
        e0.C(useCaseThreads.getSequentialScope(), null, d0VarDetermineStartStrategy$camera_camera2, new UseCaseCameraRequestControlImpl$runOnSequentialList$$inlined$confineDeferredListSuspend$1(block, arrayList, null), 1);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setParametersInternal(UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, Continuation<? super g0> continuation) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "UseCaseCameraRequestControlImpl#setParametersAsync: [" + type + "] values = " + map + ", optionPriority = " + optionPriority;
        }
        Map<UseCaseCameraRequestControl.Type, InfoBundle> map2 = this.infoBundleMap;
        InfoBundle infoBundle = map2.get(type);
        if (infoBundle == null) {
            InfoBundle infoBundle2 = new InfoBundle(null, null, null, null, 15, null);
            map2.put(type, infoBundle2);
            infoBundle = infoBundle2;
        }
        this.infoBundleMap.put(type, withParameters(infoBundle, map, optionPriority));
        return updateCameraStateAsync$default(this, merge(this.infoBundleMap), null, continuation, 1, null);
    }

    private final TagBundle toTagBundle(InfoBundle infoBundle) {
        MutableTagBundle mutableTagBundleCreate = MutableTagBundle.create();
        for (Map.Entry<String, Object> entry : infoBundle.getTags().entrySet()) {
            mutableTagBundleCreate.putTag(entry.getKey(), entry.getValue());
        }
        Intrinsics.checkNotNullExpressionValue(mutableTagBundleCreate, "also(...)");
        return mutableTagBundleCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCameraStateAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.InfoBundle r11, java.util.Set<androidx.camera.camera2.pipe.StreamId> r12, kotlin.coroutines.Continuation<? super skm.g0> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.C18341
            if (r0 == 0) goto L14
            r0 = r13
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 r0 = (androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.C18341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1 r0 = new androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$updateCameraStateAsync$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r9.result
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r13)
            goto L97
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r13)
            boolean r13 = r10.closed
            if (r13 != 0) goto L9a
            androidx.camera.core.CameraXConfig r13 = r10.cameraXConfig
            if (r13 == 0) goto L3f
            androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.getCamera2CaptureRequestConfigurator(r13)
        L3f:
            androidx.camera.camera2.impl.CapturePipeline r13 = r10.getCapturePipeline()
            androidx.camera.camera2.pipe.RequestTemplate r1 = r11.getTemplate()
            kotlin.jvm.internal.Intrinsics.h(r1)
            int r1 = r1.getValue()
            r3 = -1
            if (r1 == r3) goto L5d
            androidx.camera.camera2.pipe.RequestTemplate r1 = r11.getTemplate()
            kotlin.jvm.internal.Intrinsics.h(r1)
            int r1 = r1.getValue()
            goto L5e
        L5d:
            r1 = r2
        L5e:
            r13.setTemplate(r1)
            androidx.camera.camera2.impl.UseCaseCameraState r1 = r10.getUseCaseCameraState()
            androidx.camera.camera2.impl.Camera2ImplConfig$Builder r13 = r11.getOptions()
            androidx.camera.camera2.impl.Camera2ImplConfig r13 = r13.build()
            java.util.Map r13 = androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(r13)
            androidx.camera.camera2.pipe.Metadata$Key r3 = androidx.camera.camera2.impl.TagsKt.getCAMERAX_TAG_BUNDLE()
            androidx.camera.core.impl.TagBundle r4 = r10.toTagBundle(r11)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r4)
            java.util.Map r4 = zhm.q0.c(r5)
            androidx.camera.camera2.pipe.RequestTemplate r7 = r11.getTemplate()
            java.util.Set r8 = r11.getListeners()
            r9.label = r2
            r3 = 0
            r5 = 0
            r6 = r12
            r2 = r13
            java.lang.Object r13 = r1.m62updateAsyncTp9XwKQ(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r0) goto L97
            return r0
        L97:
            skm.g0 r13 = (skm.g0) r13
            goto L9b
        L9a:
            r13 = 0
        L9b:
            if (r13 != 0) goto La0
            skm.q r11 = androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.canceledResult
            return r11
        La0:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl.updateCameraStateAsync(androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$InfoBundle, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateCameraStateAsync$default(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, InfoBundle infoBundle, Set set, Continuation continuation, int i, Object obj2) {
        if ((i & 1) != 0) {
            set = null;
        }
        return useCaseCameraRequestControlImpl.updateCameraStateAsync(infoBundle, set, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseCaseCameraState useCaseCameraState_delegate$lambda$0(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl) {
        return (UseCaseCameraState) useCaseCameraRequestControlImpl.useCaseCameraStateProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseCaseSurfaceManager useCaseSurfaceManager_delegate$lambda$0(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl) {
        return (UseCaseSurfaceManager) useCaseCameraRequestControlImpl.useCaseSurfaceManagerProvider.get();
    }

    private final InfoBundle withParameters(InfoBundle infoBundle, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle.getOptions().getMutableConfig());
        builder.addAllCaptureRequestOptionsWithPriority(map, optionPriority);
        return InfoBundle.m58copy0am55g4$default(infoBundle, builder, r0.z(infoBundle.getTags()), zhm.d0.h1(infoBundle.getListeners()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InfoBundle withoutParameters(InfoBundle infoBundle, List<? extends CaptureRequest.Key<?>> list) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(infoBundle.getOptions().getMutableConfig());
        builder.removeCaptureRequestOptions(list);
        return InfoBundle.m58copy0am55g4$default(infoBundle, builder, r0.z(infoBundle.getTags()), zhm.d0.h1(infoBundle.getListeners()), null, 8, null);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public Object awaitSurfaceSetup(@NotNull Continuation<? super Boolean> continuation) {
        return getUseCaseSurfaceManager().awaitSetupCompletion(continuation);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 cancelFocusAndMeteringAsync() {
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$cancelFocusAndMeteringAsync$1$1(this, null));
        return g0VarRunOnSequential == null ? submitFailedResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    public void close() {
        this.closed = true;
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
        }
        getUseCaseCameraState().close();
    }

    @NotNull
    public final d0 determineStartStrategy$camera_camera2(@NotNull UseCaseThreads useCaseThreads) {
        Intrinsics.checkNotNullParameter(useCaseThreads, "<this>");
        return useCaseThreads.isOnSequentialThread() ? d0.UNDISPATCHED : d0.DEFAULT;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public List<g0> issueSingleCaptureAsync(@NotNull List<CaptureConfig> captureSequence, int captureMode, int flashType, int flashMode) {
        List<CaptureConfig> list;
        List<g0> listRunOnSequentialList;
        Intrinsics.checkNotNullParameter(captureSequence, "captureSequence");
        if (this.closed) {
            list = captureSequence;
            listRunOnSequentialList = null;
        } else {
            list = captureSequence;
            listRunOnSequentialList = runOnSequentialList(captureSequence.size(), new UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this, list, captureMode, flashType, flashMode, null));
        }
        return listRunOnSequentialList == null ? failedResults(list.size(), "Capture request is cancelled on closed CameraGraph") : listRunOnSequentialList;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 removeParametersAsync(@NotNull List<? extends CaptureRequest.Key<?>> keys, @NotNull UseCaseCameraRequestControl.Type type) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(type, "type");
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$removeParametersAsync$1$1(this, type, keys, null));
        return g0VarRunOnSequential == null ? canceledResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 setParametersAsync(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull UseCaseCameraRequestControl.Type type, @NotNull Config.OptionPriority optionPriority) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(optionPriority, "optionPriority");
        g0 g0VarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this, type, values, optionPriority, null)) : null;
        return g0VarRunOnSequential == null ? canceledResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    /* JADX INFO: renamed from: setTorchOffAsync-MtizInI */
    public g0 mo34setTorchOffAsyncMtizInI(int aeMode) {
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$setTorchOffAsync$1$1(this, aeMode, null));
        return g0VarRunOnSequential == null ? submitFailedResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 setTorchOnAsync() {
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$setTorchOnAsync$1$1(this, null));
        return g0VarRunOnSequential == null ? submitFailedResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    /* JADX INFO: renamed from: startFocusAndMeteringAsync-NxRnBj4 */
    public g0 mo35startFocusAndMeteringAsyncNxRnBj4(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions, Lock3ABehavior aeLockBehavior, Lock3ABehavior afLockBehavior, Lock3ABehavior awbLockBehavior, AeMode afTriggerStartAeMode, long timeLimitNs) {
        g0 g0VarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$startFocusAndMeteringAsync$1$1(this, aeRegions, afRegions, awbRegions, aeLockBehavior, afLockBehavior, awbLockBehavior, afTriggerStartAeMode, timeLimitNs, null)) : null;
        return g0VarRunOnSequential == null ? submitFailedResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 submitParameters(@NotNull Map<CaptureRequest.Key<?>, ? extends Object> values, @NotNull UseCaseCameraRequestControl.Type type, @NotNull Config.OptionPriority optionPriority) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(optionPriority, "optionPriority");
        if (this.closed) {
            return canceledResult;
        }
        this.threads.checkOnSequentialThread();
        return e0.g(this.threads.getSequentialScope(), null, d0.UNDISPATCHED, new AnonymousClass1(type, values, optionPriority, null), 1);
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 update3aRegions(List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        g0 g0VarRunOnSequential = !this.closed ? runOnSequential(new UseCaseCameraRequestControlImpl$update3aRegions$1$1(this, aeRegions, afRegions, awbRegions, null)) : null;
        return g0VarRunOnSequential == null ? submitFailedResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 updateCamera2ConfigAsync(@NotNull Config config, @NotNull Map<String, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tags, "tags");
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$updateCamera2ConfigAsync$1$1(this, config, tags, null));
        return g0VarRunOnSequential == null ? canceledResult : g0VarRunOnSequential;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraRequestControl
    @NotNull
    public g0 updateRepeatingRequestAsync(boolean isPrimary, @NotNull Collection<? extends UseCase> runningUseCases) {
        Intrinsics.checkNotNullParameter(runningUseCases, "runningUseCases");
        g0 g0VarRunOnSequential = this.closed ? null : runOnSequential(new UseCaseCameraRequestControlImpl$updateRepeatingRequestAsync$1$1(runningUseCases, isPrimary, this, null));
        return g0VarRunOnSequential == null ? canceledResult : g0VarRunOnSequential;
    }
}
