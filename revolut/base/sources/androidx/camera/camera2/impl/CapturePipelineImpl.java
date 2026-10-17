package androidx.camera.camera2.impl;

import android.view.Surface;
import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.compat.workaround.FlashAvailabilityCheckerKt;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.config.UseCaseGraphContext;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestNumber;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConvergenceUtils;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import gim.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import l3d.f;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import phm.a;
import rtl.y;
import ryd.k;
import skm.e0;
import skm.g0;
import skm.r;
import vc.s;
import yhm.j;
import yhm.o;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000Ï\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\b\u0006*\u0001x\b\u0007\u0018\u00002\u00020\u0001:\u0002{|B_\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018JT\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0096@¢\u0006\u0004\b&\u0010'J(\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0096@¢\u0006\u0004\b*\u0010+J\u0018\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020 H\u0087@¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020,2\u0006\u0010!\u001a\u00020 H\u0087@¢\u0006\u0004\b/\u0010.J\u0012\u00101\u001a\u0004\u0018\u000100H\u0082@¢\u0006\u0004\b1\u00102JN\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00192\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u000105H\u0082@¢\u0006\u0004\b7\u00108JF\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0082@¢\u0006\u0004\b9\u0010:JF\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0082@¢\u0006\u0004\b;\u0010:J>\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0082@¢\u0006\u0004\b<\u0010=JN\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020 2\u0006\u0010?\u001a\u00020>2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00192\u0006\u0010A\u001a\u00020@H\u0082@¢\u0006\u0004\bB\u0010CJF\u0010D\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010?\u001a\u00020>2\u0006\u0010!\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0082@¢\u0006\u0004\bD\u0010EJ>\u0010F\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\b\u00106\u001a\u0004\u0018\u0001052\u0006\u0010!\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0019H\u0082@¢\u0006\u0004\bF\u0010=J \u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020@H\u0082@¢\u0006\u0004\bJ\u0010KJ#\u0010M\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020@0L2\u0006\u0010H\u001a\u00020@H\u0002¢\u0006\u0004\bM\u0010NJ\u0013\u0010P\u001a\u00020O*\u000200H\u0002¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\u00020I2\u0006\u0010?\u001a\u00020>H\u0082@¢\u0006\u0004\bR\u0010SJ%\u0010U\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010%0$0\u00192\u0006\u0010T\u001a\u000205H\u0002¢\u0006\u0004\bU\u0010VJ\u0018\u0010W\u001a\u00020@2\u0006\u0010#\u001a\u00020 H\u0082@¢\u0006\u0004\bW\u0010.J0\u0010[\u001a\u0004\u0018\u00010Y2\u0006\u0010X\u001a\u00020>2\u0014\b\u0002\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020@0LH\u0082@¢\u0006\u0004\b[\u0010\\J\u0018\u0010H\u001a\u00020@2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\bH\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010`R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010cR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010dR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010eR\u001b\u0010j\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR#\u0010o\u001a\n k*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010nR\"\u0010p\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010v\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006}"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl;", "Landroidx/camera/camera2/impl/CapturePipeline;", "Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "configAdapter", "Landroidx/camera/camera2/impl/FlashControl;", "flashControl", "Landroidx/camera/camera2/impl/TorchControl;", "torchControl", "Landroidx/camera/camera2/impl/VideoUsageControl;", "videoUsageControl", "Landroidx/camera/camera2/impl/UseCaseThreads;", "threads", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "useTorchAsFlash", "Landroidx/camera/camera2/impl/CameraProperties;", "cameraProperties", "Lphm/a;", "Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraStateProvider", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "useCaseGraphContext", "<init>", "(Landroidx/camera/camera2/adapter/CaptureConfigAdapter;Landroidx/camera/camera2/impl/FlashControl;Landroidx/camera/camera2/impl/TorchControl;Landroidx/camera/camera2/impl/VideoUsageControl;Landroidx/camera/camera2/impl/UseCaseThreads;Landroidx/camera/camera2/impl/ComboRequestListener;Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;Landroidx/camera/camera2/impl/CameraProperties;Lphm/a;Landroidx/camera/camera2/config/UseCaseGraphContext;)V", "", "Landroidx/camera/core/impl/CaptureConfig;", "configs", "Landroidx/camera/camera2/pipe/RequestTemplate;", "requestTemplate", "Landroidx/camera/core/impl/Config;", "sessionConfigOptions", "", "captureMode", "flashType", "flashMode", "Lskm/g0;", "Ljava/lang/Void;", "submitStillCaptures-BvXKQx0", "(Ljava/util/List;ILandroidx/camera/core/impl/Config;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitStillCaptures", "Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "getCameraCapturePipeline", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "invokeScreenFlashPreCaptureTasks", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeScreenFlashPostCaptureTasks", "Landroidx/camera/camera2/pipe/FrameMetadata;", "getFrameMetadata", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/impl/CapturePipelineImpl$PipelineTask;", "pipelineTasks", "Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;", "mainCaptureParams", "invokeCaptureTasks", "(Ljava/util/List;IIILandroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "torchAsFlashCapture", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;IILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultCapture", "defaultNoFlashCapture", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "timeLimitNs", "", "triggerAePreCapture", "torchApplyCapture", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;IJLjava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aePreCaptureApplyCapture", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;JILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "screenFlashCapture", "convergedTimeLimitNs", "isTorchAsFlash", "Landroidx/camera/camera2/pipe/Result3A;", "lockAf", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "getConvergeCondition", "(Z)Lkotlin/jvm/functions/Function1;", "Landroidx/camera/core/impl/CameraCaptureResult;", "toCameraCaptureResult", "(Landroidx/camera/camera2/pipe/FrameMetadata;)Landroidx/camera/core/impl/CameraCaptureResult;", "unlockAf", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "params", "submitRequestInternal", "(Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;)Ljava/util/List;", "isPhysicalFlashRequired", "waitTimeoutNanos", "Landroidx/camera/camera2/pipe/FrameInfo;", "checker", "waitForResult", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/camera/camera2/adapter/CaptureConfigAdapter;", "Landroidx/camera/camera2/impl/FlashControl;", "Landroidx/camera/camera2/impl/TorchControl;", "Landroidx/camera/camera2/impl/VideoUsageControl;", "Landroidx/camera/camera2/impl/UseCaseThreads;", "Landroidx/camera/camera2/impl/ComboRequestListener;", "Landroidx/camera/camera2/compat/workaround/UseTorchAsFlash;", "Lphm/a;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "hasFlashUnit$delegate", "Lkotlin/Lazy;", "getHasFlashUnit", "()Z", "hasFlashUnit", "kotlin.jvm.PlatformType", "useCaseCameraState$delegate", "getUseCaseCameraState", "()Landroidx/camera/camera2/impl/UseCaseCameraState;", "useCaseCameraState", "template", "I", "getTemplate", "()I", "setTemplate", "(I)V", "frameMetadata", "Landroidx/camera/camera2/pipe/FrameMetadata;", "androidx/camera/camera2/impl/CapturePipelineImpl$emptyRequestMetadata$1", "emptyRequestMetadata", "Landroidx/camera/camera2/impl/CapturePipelineImpl$emptyRequestMetadata$1;", "PipelineTask", "MainCaptureParams", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CapturePipelineImpl implements CapturePipeline {

    @NotNull
    private final CaptureConfigAdapter configAdapter;

    @NotNull
    private final CapturePipelineImpl$emptyRequestMetadata$1 emptyRequestMetadata;

    @NotNull
    private final FlashControl flashControl;
    private FrameMetadata frameMetadata;

    /* JADX INFO: renamed from: hasFlashUnit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasFlashUnit;

    @NotNull
    private final ComboRequestListener requestListener;
    private int template;

    @NotNull
    private final UseCaseThreads threads;

    @NotNull
    private final TorchControl torchControl;

    /* JADX INFO: renamed from: useCaseCameraState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy useCaseCameraState;

    @NotNull
    private final a useCaseCameraStateProvider;

    @NotNull
    private final UseCaseGraphContext useCaseGraphContext;

    @NotNull
    private final UseTorchAsFlash useTorchAsFlash;

    @NotNull
    private final VideoUsageControl videoUsageControl;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl$MainCaptureParams;", "", "", "Landroidx/camera/core/impl/CaptureConfig;", "configs", "Landroidx/camera/camera2/pipe/RequestTemplate;", "requestTemplate", "Landroidx/camera/core/impl/Config;", "sessionConfigOptions", "<init>", "(Ljava/util/List;ILandroidx/camera/core/impl/Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConfigs", "()Ljava/util/List;", "I", "getRequestTemplate-fGx8uWA", "Landroidx/camera/core/impl/Config;", "getSessionConfigOptions", "()Landroidx/camera/core/impl/Config;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MainCaptureParams {

        @NotNull
        private final List<CaptureConfig> configs;
        private final int requestTemplate;

        @NotNull
        private final Config sessionConfigOptions;

        public /* synthetic */ MainCaptureParams(List list, int i, Config config, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, config);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainCaptureParams)) {
                return false;
            }
            MainCaptureParams mainCaptureParams = (MainCaptureParams) other;
            return Intrinsics.f(this.configs, mainCaptureParams.configs) && RequestTemplate.m327equalsimpl0(this.requestTemplate, mainCaptureParams.requestTemplate) && Intrinsics.f(this.sessionConfigOptions, mainCaptureParams.sessionConfigOptions);
        }

        @NotNull
        public final List<CaptureConfig> getConfigs() {
            return this.configs;
        }

        /* JADX INFO: renamed from: getRequestTemplate-fGx8uWA, reason: not valid java name and from getter */
        public final int getRequestTemplate() {
            return this.requestTemplate;
        }

        @NotNull
        public final Config getSessionConfigOptions() {
            return this.sessionConfigOptions;
        }

        public int hashCode() {
            return this.sessionConfigOptions.hashCode() + ((RequestTemplate.m329hashCodeimpl(this.requestTemplate) + (this.configs.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "MainCaptureParams(configs=" + this.configs + ", requestTemplate=" + ((Object) RequestTemplate.m330toStringimpl(this.requestTemplate)) + ", sessionConfigOptions=" + this.sessionConfigOptions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private MainCaptureParams(List<CaptureConfig> configs, int i, Config sessionConfigOptions) {
            Intrinsics.checkNotNullParameter(configs, "configs");
            Intrinsics.checkNotNullParameter(sessionConfigOptions, "sessionConfigOptions");
            this.configs = configs;
            this.requestTemplate = i;
            this.sessionConfigOptions = sessionConfigOptions;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/camera/camera2/impl/CapturePipelineImpl$PipelineTask;", "", "<init>", "(Ljava/lang/String;I)V", "PRE_CAPTURE", "MAIN_CAPTURE", "POST_CAPTURE", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PipelineTask {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PipelineTask[] $VALUES;
        public static final PipelineTask PRE_CAPTURE = new PipelineTask("PRE_CAPTURE", 0);
        public static final PipelineTask MAIN_CAPTURE = new PipelineTask("MAIN_CAPTURE", 1);
        public static final PipelineTask POST_CAPTURE = new PipelineTask("POST_CAPTURE", 2);

        private static final /* synthetic */ PipelineTask[] $values() {
            return new PipelineTask[]{PRE_CAPTURE, MAIN_CAPTURE, POST_CAPTURE};
        }

        static {
            PipelineTask[] pipelineTaskArr$values = $values();
            $VALUES = pipelineTaskArr$values;
            $ENTRIES = s.n(pipelineTaskArr$values);
        }

        private PipelineTask(String str, int i) {
        }

        public static PipelineTask valueOf(String str) {
            return (PipelineTask) Enum.valueOf(PipelineTask.class, str);
        }

        public static PipelineTask[] values() {
            return (PipelineTask[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$aePreCaptureApplyCapture$1, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {887, 494, 499}, m = "aePreCaptureApplyCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.aePreCaptureApplyCapture(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {352, 357, 359, 362}, m = "defaultCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18111 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18111(Continuation<? super C18111> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.defaultCapture(null, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$defaultNoFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {378}, m = "defaultNoFlashCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18121 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C18121(Continuation<? super C18121> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.defaultNoFlashCapture(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "getFrameMetadata", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18131 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18131(Continuation<? super C18131> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.getFrameMetadata(this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {Constants.TAG_EMV_L2_CHECKSUM, Constants.TAG_BOOT_LOADER_VERSION, Constants.TAG_BOOT_LOADER_CHECKSUM, 220}, m = "invokeCaptureTasks", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18141 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18141(Continuation<? super C18141> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeCaptureTasks(null, 0, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {563, 875, 570}, m = "invokeScreenFlashPostCaptureTasks", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18151 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18151(Continuation<? super C18151> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeScreenFlashPostCaptureTasks(0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPreCaptureTasks$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {544, 871, 551, 556}, m = "invokeScreenFlashPreCaptureTasks", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18161 extends c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18161(Continuation<? super C18161> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.invokeScreenFlashPreCaptureTasks(0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {772}, m = "isPhysicalFlashRequired", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18171 extends c {
        int label;
        /* synthetic */ Object result;

        public C18171(Continuation<? super C18171> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.isPhysicalFlashRequired(0, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$isTorchAsFlash$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$isTorchAsFlash$2", f = "CapturePipeline.kt", l = {808}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/FrameMetadata;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18182 extends i implements Function1<Continuation<? super FrameMetadata>, Object> {
        int label;

        public C18182(Continuation<? super C18182> continuation) {
            super(1, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CapturePipelineImpl.this.new C18182(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            CapturePipelineImpl capturePipelineImpl = CapturePipelineImpl.this;
            this.label = 1;
            Object frameMetadata = capturePipelineImpl.getFrameMetadata(this);
            return frameMetadata == aVar ? aVar : frameMetadata;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FrameMetadata> continuation) {
            return ((C18182) create(continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$lockAf$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {871, 585, 594}, m = "lockAf", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18191 extends c {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C18191(Continuation<? super C18191> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.lockAf(0L, false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$screenFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {528}, m = "screenFlashCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18201 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C18201(Continuation<? super C18201> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.screenFlashCapture(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$torchApplyCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {408, 895, 416, 421, 436, 440}, m = "torchApplyCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18211 extends c {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C18211(Continuation<? super C18211> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.torchApplyCapture(null, 0, 0L, null, false, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {330, 331, 341}, m = "torchAsFlashCapture", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18221 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C18221(Continuation<? super C18221> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.torchAsFlashCapture(null, 0, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {871, 648, 649}, m = "unlockAf", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18231 extends c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18231(Continuation<? super C18231> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.unlockAf(0L, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl", f = "CapturePipeline.kt", l = {793}, m = "waitForResult", v = 1)
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C18241 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C18241(Continuation<? super C18241> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePipelineImpl.this.waitForResult(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3, reason: invalid class name */
    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3", f = "CapturePipeline.kt", l = {796}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/FrameInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<CoroutineScope, Continuation<? super FrameInfo>, Object> {
        final /* synthetic */ ResultListener $resultListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ResultListener resultListener, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$resultListener = resultListener;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return new AnonymousClass3(this.$resultListener, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            g0 result = this.$resultListener.getResult();
            this.label = 1;
            Object objI = result.i(this);
            return objI == aVar ? aVar : objI;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FrameInfo> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1] */
    public CapturePipelineImpl(@NotNull CaptureConfigAdapter configAdapter, @NotNull FlashControl flashControl, @NotNull TorchControl torchControl, @NotNull VideoUsageControl videoUsageControl, @NotNull UseCaseThreads threads, @NotNull ComboRequestListener requestListener, @NotNull UseTorchAsFlash useTorchAsFlash, @NotNull CameraProperties cameraProperties, @NotNull a useCaseCameraStateProvider, @NotNull UseCaseGraphContext useCaseGraphContext) {
        Intrinsics.checkNotNullParameter(configAdapter, "configAdapter");
        Intrinsics.checkNotNullParameter(flashControl, "flashControl");
        Intrinsics.checkNotNullParameter(torchControl, "torchControl");
        Intrinsics.checkNotNullParameter(videoUsageControl, "videoUsageControl");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(useTorchAsFlash, "useTorchAsFlash");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(useCaseCameraStateProvider, "useCaseCameraStateProvider");
        Intrinsics.checkNotNullParameter(useCaseGraphContext, "useCaseGraphContext");
        this.configAdapter = configAdapter;
        this.flashControl = flashControl;
        this.torchControl = torchControl;
        this.videoUsageControl = videoUsageControl;
        this.threads = threads;
        this.requestListener = requestListener;
        this.useTorchAsFlash = useTorchAsFlash;
        this.useCaseCameraStateProvider = useCaseCameraStateProvider;
        this.useCaseGraphContext = useCaseGraphContext;
        this.hasFlashUnit = j.b(new q.a(cameraProperties, 1));
        this.useCaseCameraState = j.b(new y(this, 8));
        this.template = 1;
        this.emptyRequestMetadata = new RequestMetadata() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$emptyRequestMetadata$1
            private final int template = RequestTemplate.m325constructorimpl(0);
            private final Map<StreamId, Surface> streams = r0.g();
            private final boolean repeating = true;
            private final Request request = new Request(f0.f322471a, null, null, null, null, null, 62, null);
            private final long requestNumber = RequestNumber.m319constructorimpl(0);

            @Override // androidx.camera.camera2.pipe.Metadata
            public <T> T get(Metadata.Key<T> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return null;
            }

            @Override // androidx.camera.camera2.pipe.Metadata
            public <T> T getOrDefault(Metadata.Key<T> key, T t2) {
                Intrinsics.checkNotNullParameter(key, "key");
                return t2;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public boolean getRepeating() {
                return this.repeating;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public Request getRequest() {
                return this.request;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            /* JADX INFO: renamed from: getRequestNumber-my6kx4g, reason: not valid java name and from getter */
            public long getRequestNumber() {
                return this.requestNumber;
            }

            @Override // androidx.camera.camera2.pipe.RequestMetadata
            public Map<StreamId, Surface> getStreams() {
                return this.streams;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public <T> T unwrapAs(KClass type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return null;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177 A[Catch: all -> 0x004a, TryCatch #4 {all -> 0x004a, blocks: (B:15:0x0045, B:68:0x016f, B:70:0x0177, B:71:0x017e), top: B:110:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, skm.d0] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aePreCaptureApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r22, long r23, int r25, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r26, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.aePreCaptureApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, long, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object defaultCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r9, int r10, int r11, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r12, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r13) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18111
            if (r0 == 0) goto L14
            r0 = r13
            androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$defaultCapture$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.result
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L54
            if (r1 == r5) goto L42
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            yhm.o.b(r13)
            return r13
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            yhm.o.b(r13)
            return r13
        L3e:
            yhm.o.b(r13)
            return r13
        L42:
            int r10 = r7.I$0
            java.lang.Object r9 = r7.L$1
            r12 = r9
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r9 = r7.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams r9 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) r9
            yhm.o.b(r13)
        L50:
            r2 = r9
            r5 = r10
            r6 = r12
            goto L6d
        L54:
            yhm.o.b(r13)
            boolean r13 = r8.getHasFlashUnit()
            if (r13 == 0) goto La2
            r7.L$0 = r9
            r7.L$1 = r12
            r7.I$0 = r10
            r7.label = r5
            java.lang.Object r13 = r8.isPhysicalFlashRequired(r11, r7)
            if (r13 != r0) goto L50
        L6b:
            r1 = r8
            goto Lab
        L6d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r9 = r13.booleanValue()
            if (r9 == 0) goto L7a
            long r10 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_WITH_FLASH_TIMEOUT_IN_NS$p()
            goto L7e
        L7a:
            long r10 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_TIMEOUT_IN_NS$p()
        L7e:
            r12 = 0
            if (r9 != 0) goto L92
            if (r5 != 0) goto L84
            goto L92
        L84:
            r7.L$0 = r12
            r7.L$1 = r12
            r7.label = r3
            java.lang.Object r9 = r8.defaultNoFlashCapture(r2, r5, r6, r7)
            if (r9 != r0) goto L91
            goto L6b
        L91:
            return r9
        L92:
            r7.L$0 = r12
            r7.L$1 = r12
            r7.label = r4
            r1 = r8
            r3 = r10
            java.lang.Object r9 = r1.aePreCaptureApplyCapture(r2, r3, r5, r6, r7)
            if (r9 != r0) goto La1
            goto Lab
        La1:
            return r9
        La2:
            r1 = r8
            r7.label = r2
            java.lang.Object r9 = r8.defaultNoFlashCapture(r9, r10, r12, r7)
            if (r9 != r0) goto Lac
        Lab:
            return r0
        Lac:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.defaultCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object defaultNoFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r10, int r11, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r12, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r13) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.defaultNoFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Function1<FrameMetadata, Boolean> getConvergeCondition(boolean isTorchAsFlash) {
        return new f(this, isTorchAsFlash, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getConvergeCondition$lambda$0(CapturePipelineImpl capturePipelineImpl, boolean z, FrameMetadata frameMetadata) {
        Intrinsics.checkNotNullParameter(frameMetadata, "frameMetadata");
        return ConvergenceUtils.is3AConverged(capturePipelineImpl.toCameraCaptureResult(frameMetadata), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFrameMetadata(kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameMetadata> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18131
            if (r0 == 0) goto L14
            r0 = r10
            androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18131) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$getFrameMetadata$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.result
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.label
            java.lang.String r8 = "CXCP"
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r0 = r5.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl r0 = (androidx.camera.camera2.impl.CapturePipelineImpl) r0
            yhm.o.b(r10)
            r1 = r9
            goto L63
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            yhm.o.b(r10)
            androidx.camera.camera2.pipe.FrameMetadata r10 = r9.frameMetadata
            if (r10 != 0) goto L70
            androidx.camera.camera2.impl.Camera2Logger r10 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r10 = androidx.camera.core.Logger.isDebugEnabled(r8)
            if (r10 == 0) goto L4e
            java.lang.String r10 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "getFrameMetadata: waiting for result"
        L4e:
            r10 = r2
            long r2 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_FLASH_REQUIRED_TIMEOUT_IN_NS$p()
            r5.L$0 = r9
            r5.label = r10
            r4 = 0
            r6 = 2
            r7 = 0
            r1 = r9
            java.lang.Object r10 = waitForResult$default(r1, r2, r4, r5, r6, r7)
            if (r10 != r0) goto L62
            return r0
        L62:
            r0 = r1
        L63:
            androidx.camera.camera2.pipe.FrameInfo r10 = (androidx.camera.camera2.pipe.FrameInfo) r10
            if (r10 == 0) goto L6c
            androidx.camera.camera2.pipe.FrameMetadata r10 = r10.getMetadata()
            goto L6d
        L6c:
            r10 = 0
        L6d:
            r0.frameMetadata = r10
            goto L71
        L70:
            r1 = r9
        L71:
            androidx.camera.camera2.impl.Camera2Logger r10 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r10 = androidx.camera.core.Logger.isDebugEnabled(r8)
            if (r10 == 0) goto L90
            java.lang.String r10 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getFrameMetadata: frameMetadata = "
            r0.<init>(r2)
            androidx.camera.camera2.pipe.FrameMetadata r2 = access$getFrameMetadata$p(r9)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L90:
            androidx.camera.camera2.pipe.FrameMetadata r10 = r1.frameMetadata
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.getFrameMetadata(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean getHasFlashUnit() {
        return ((Boolean) this.hasFlashUnit.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UseCaseCameraState getUseCaseCameraState() {
        return (UseCaseCameraState) this.useCaseCameraState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasFlashUnit_delegate$lambda$0(CameraProperties cameraProperties) {
        return FlashAvailabilityCheckerKt.isFlashAvailable$default(cameraProperties, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeCaptureTasks(java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r10, int r11, int r12, int r13, androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r14, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeCaptureTasks(java.util.List, int, int, int, androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isPhysicalFlashRequired(int r6, kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18171
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18171) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$isPhysicalFlashRequired$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4f
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            if (r6 == 0) goto L46
            if (r6 == r4) goto L44
            r7 = 2
            if (r6 == r7) goto L6b
            r7 = 3
            if (r6 != r7) goto L3e
            goto L6b
        L3e:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>(r6)
            throw r7
        L44:
            r3 = r4
            goto L6b
        L46:
            r0.label = r4
            java.lang.Object r7 = r5.getFrameMetadata(r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            androidx.camera.camera2.pipe.FrameMetadata r7 = (androidx.camera.camera2.pipe.FrameMetadata) r7
            if (r7 == 0) goto L6b
            android.hardware.camera2.CaptureResult$Key r6 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.String r0 = "CONTROL_AE_STATE"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.Object r6 = r7.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 != 0) goto L63
            goto L6b
        L63:
            int r6 = r6.intValue()
            r7 = 4
            if (r6 != r7) goto L6b
            goto L44
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.isPhysicalFlashRequired(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object isTorchAsFlash(int i, Continuation<? super Boolean> continuation) {
        return (getTemplate() == 3 || i == 1) ? Boolean.TRUE : this.useTorchAsFlash.shouldUseTorchAsFlash(new C18182(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lockAf(long r26, boolean r28, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Result3A> r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.lockAf(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object screenFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r7, int r8, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r9, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r10) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.screenFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final List<g0> submitRequestInternal(MainCaptureParams params) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled("CXCP")) {
            String unused = Camera2Logger.TRUNCATED_TAG;
            String str = "CapturePipeline#submitRequestInternal; Submitting " + params.getConfigs() + " with CameraPipe";
        }
        ArrayList arrayList = new ArrayList();
        List<CaptureConfig> configs = params.getConfigs();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it8 = configs.iterator();
        while (true) {
            Request requestM4mapToRequestnAberiA = null;
            if (!it8.hasNext()) {
                break;
            }
            CaptureConfig captureConfig = (CaptureConfig) it8.next();
            final r rVarB = e0.b();
            arrayList.add(rVarB);
            try {
                requestM4mapToRequestnAberiA = this.configAdapter.m4mapToRequestnAberiA(captureConfig, params.getRequestTemplate(), params.getSessionConfigOptions(), u.c(new Request.Listener() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$submitRequestInternal$requests$1$1
                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    public void onAborted(Request request) {
                        Intrinsics.checkNotNullParameter(request, "request");
                        ((r) rVarB).h0(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* JADX INFO: renamed from: onFailed-CcXjc1I */
                    public void mo7onFailedCcXjc1I(RequestMetadata requestMetadata, long frameNumber, RequestFailure requestFailure) {
                        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                        Intrinsics.checkNotNullParameter(requestFailure, "requestFailure");
                        ((r) rVarB).h0(new ImageCaptureException(2, "Capture request failed with reason " + requestFailure.getReason(), null));
                    }

                    @Override // androidx.camera.camera2.pipe.Request.Listener
                    /* JADX INFO: renamed from: onTotalCaptureResult-CcXjc1I */
                    public void mo8onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long frameNumber, FrameInfo totalCaptureResult) {
                        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
                        Intrinsics.checkNotNullParameter(totalCaptureResult, "totalCaptureResult");
                        ((r) rVarB).U(null);
                    }
                }));
            } catch (IllegalStateException e) {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isInfoEnabled("CXCP")) {
                    String unused2 = Camera2Logger.TRUNCATED_TAG;
                }
                rVarB.h0(new ImageCaptureException(2, "Capture request failed with reason " + e.getMessage(), e));
            }
            if (requestM4mapToRequestnAberiA != null) {
                arrayList2.add(requestM4mapToRequestnAberiA);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        e0.C(this.threads.getSequentialScope(), null, null, new CapturePipelineImpl$submitRequestInternal$$inlined$confineLaunch$1(null, this, arrayList, arrayList2), 3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraCaptureResult toCameraCaptureResult(final FrameMetadata frameMetadata) {
        return new CaptureResultAdapter(this.emptyRequestMetadata, frameMetadata.mo220getFrameNumberUgla2oM(), new FrameInfo(frameMetadata, this) { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$toCameraCaptureResult$frameInfo$1
            private final String camera;
            private final FrameMetadata frameMetadata;
            private final long frameNumber;
            private final FrameMetadata metadata;
            private final RequestMetadata requestMetadata;

            {
                this.frameMetadata = frameMetadata;
                this.metadata = frameMetadata;
                this.camera = frameMetadata.getCamera();
                this.frameNumber = frameMetadata.mo220getFrameNumberUgla2oM();
                this.requestMetadata = this.emptyRequestMetadata;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            public FrameMetadata getMetadata() {
                return this.metadata;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public <T> T unwrapAs(KClass type) {
                Intrinsics.checkNotNullParameter(type, "type");
                return null;
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a1  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object, kotlin.coroutines.CoroutineContext, skm.d0] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object torchApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r26, int r27, long r28, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r30, boolean r31, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r32) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.torchApplyCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, long, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object torchAsFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams r10, int r11, int r12, java.util.List<? extends androidx.camera.camera2.impl.CapturePipelineImpl.PipelineTask> r13, kotlin.coroutines.Continuation<? super java.util.List<? extends skm.g0>> r14) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18221
            if (r0 == 0) goto L14
            r0 = r14
            androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$torchAsFlashCapture$1
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.result
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            yhm.o.b(r14)
            return r14
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            yhm.o.b(r14)
            return r14
        L3c:
            int r11 = r8.I$0
            java.lang.Object r10 = r8.L$1
            r13 = r10
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r10 = r8.L$0
            androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams r10 = (androidx.camera.camera2.impl.CapturePipelineImpl.MainCaptureParams) r10
            yhm.o.b(r14)
        L4a:
            r6 = r13
            goto L76
        L4c:
            yhm.o.b(r14)
            androidx.camera.camera2.impl.Camera2Logger r14 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            java.lang.String r14 = "CXCP"
            boolean r14 = androidx.camera.core.Logger.isDebugEnabled(r14)
            if (r14 == 0) goto L60
            java.lang.String r14 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r1 = "CapturePipeline#torchAsFlashCapture"
        L60:
            boolean r14 = r9.getHasFlashUnit()
            if (r14 == 0) goto Lab
            r8.L$0 = r10
            r8.L$1 = r13
            r8.I$0 = r11
            r8.label = r4
            java.lang.Object r14 = r9.isPhysicalFlashRequired(r12, r8)
            if (r14 != r0) goto L4a
            r1 = r9
            goto Lb9
        L76:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r12 = r14.booleanValue()
            if (r12 == 0) goto La9
            r12 = r4
            r14 = r5
            long r4 = androidx.camera.camera2.impl.CapturePipelineKt.access$getCHECK_3A_WITH_FLASH_TIMEOUT_IN_NS$p()
            androidx.camera.camera2.compat.workaround.UseTorchAsFlash r13 = r9.useTorchAsFlash
            boolean r13 = r13.shouldDisableAePrecapture()
            if (r13 != 0) goto L96
            androidx.camera.camera2.impl.VideoUsageControl r13 = r9.videoUsageControl
            boolean r13 = r13.isInVideoUsage()
            if (r13 != 0) goto L96
        L94:
            r7 = r12
            goto L98
        L96:
            r12 = 0
            goto L94
        L98:
            r8.L$0 = r14
            r8.L$1 = r14
            r8.label = r3
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r10 = r1.torchApplyCapture(r2, r3, r4, r6, r7, r8)
            if (r10 != r0) goto La8
            goto Lb9
        La8:
            return r10
        La9:
            r3 = r11
            r13 = r6
        Lab:
            r1 = r9
            r14 = r5
            r8.L$0 = r14
            r8.L$1 = r14
            r8.label = r2
            java.lang.Object r10 = r9.defaultNoFlashCapture(r10, r11, r13, r8)
            if (r10 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.torchAsFlashCapture(androidx.camera.camera2.impl.CapturePipelineImpl$MainCaptureParams, int, int, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlockAf(long r17, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.Result3A> r19) throws java.lang.Exception {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            boolean r2 = r0 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18231
            if (r2 == 0) goto L18
            r2 = r0
            androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1 r2 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18231) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.label = r3
        L16:
            r11 = r2
            goto L1e
        L18:
            androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1 r2 = new androidx.camera.camera2.impl.CapturePipelineImpl$unlockAf$1
            r2.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.result
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.label
            r14 = 3
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L4d
            if (r3 == r5) goto L46
            if (r3 == r4) goto L3b
            if (r3 != r14) goto L33
            yhm.o.b(r0)
            return r0
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3b:
            java.lang.Object r3 = r11.L$0
            java.lang.AutoCloseable r3 = (java.lang.AutoCloseable) r3
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L43
            goto L7f
        L43:
            r0 = move-exception
            r2 = r0
            goto L94
        L46:
            long r5 = r11.J$0
            yhm.o.b(r0)
            r9 = r5
            goto L64
        L4d:
            yhm.o.b(r0)
            androidx.camera.camera2.config.UseCaseGraphContext r0 = r1.useCaseGraphContext
            androidx.camera.camera2.pipe.CameraGraph r0 = r0.getGraph()
            r6 = r17
            r11.J$0 = r6
            r11.label = r5
            java.lang.Object r0 = r0.acquireSession(r11)
            if (r0 != r2) goto L63
            goto L8f
        L63:
            r9 = r6
        L64:
            r15 = r0
            java.lang.AutoCloseable r15 = (java.lang.AutoCloseable) r15
            r3 = r15
            androidx.camera.camera2.pipe.CameraGraph$Session r3 = (androidx.camera.camera2.pipe.CameraGraph.Session) r3     // Catch: java.lang.Throwable -> L91
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L91
            r11.L$0 = r15     // Catch: java.lang.Throwable -> L91
            r11.label = r4     // Catch: java.lang.Throwable -> L91
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 29
            r13 = 0
            java.lang.Object r0 = androidx.camera.camera2.pipe.CameraGraph.Session.unlock3A$default(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> L91
            if (r0 != r2) goto L7e
            goto L8f
        L7e:
            r3 = r15
        L7f:
            skm.g0 r0 = (skm.g0) r0     // Catch: java.lang.Throwable -> L43
            r4 = 0
            mra.d.l(r3, r4)
            r11.L$0 = r4
            r11.label = r14
            java.lang.Object r0 = r0.i(r11)
            if (r0 != r2) goto L90
        L8f:
            return r2
        L90:
            return r0
        L91:
            r0 = move-exception
            r2 = r0
            r3 = r15
        L94:
            throw r2     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = move-exception
            mra.d.l(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.unlockAf(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UseCaseCameraState useCaseCameraState_delegate$lambda$0(CapturePipelineImpl capturePipelineImpl) {
        return (UseCaseCameraState) capturePipelineImpl.useCaseCameraStateProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForResult(long r8, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameInfo, java.lang.Boolean> r10, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.FrameInfo> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18241
            if (r0 == 0) goto L13
            r0 = r11
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18241) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.L$0
            androidx.camera.camera2.impl.ResultListener r8 = (androidx.camera.camera2.impl.ResultListener) r8
            yhm.o.b(r11)
            goto L6f
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r11)
            androidx.camera.camera2.impl.ResultListener r11 = new androidx.camera.camera2.impl.ResultListener
            r11.<init>(r8, r10)
            androidx.camera.camera2.impl.ComboRequestListener r10 = r7.requestListener
            androidx.camera.camera2.impl.UseCaseThreads r2 = r7.threads
            java.util.concurrent.Executor r2 = r2.getSequentialExecutor()
            r10.addListener(r11, r2)
            androidx.camera.camera2.impl.UseCaseThreads r10 = r7.threads
            kotlinx.coroutines.CoroutineScope r10 = r10.getSequentialScope()
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$resultListener$1$1 r2 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$resultListener$1$1
            r4 = 0
            r2.<init>(r11, r7, r4)
            r5 = 3
            skm.e0.C(r10, r4, r4, r2, r5)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r8 = r10.toMillis(r8)
            androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3 r10 = new androidx.camera.camera2.impl.CapturePipelineImpl$waitForResult$3
            r10.<init>(r11, r4)
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r8 = skm.h2.d(r8, r10, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            r6 = r11
            r11 = r8
            r8 = r6
        L6f:
            r9 = r11
            androidx.camera.camera2.pipe.FrameInfo r9 = (androidx.camera.camera2.pipe.FrameInfo) r9
            if (r9 != 0) goto L79
            androidx.camera.camera2.impl.ComboRequestListener r9 = r7.requestListener
            r9.removeListener(r8)
        L79:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.waitForResult(long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object waitForResult$default(CapturePipelineImpl capturePipelineImpl, long j2, Function1 function1, Continuation continuation, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = new k(12);
        }
        return capturePipelineImpl.waitForResult(j2, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean waitForResult$lambda$0(FrameInfo frameInfo) {
        Intrinsics.checkNotNullParameter(frameInfo, "<unused var>");
        return true;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public Object getCameraCapturePipeline(final int i, final int i2, final int i3, @NotNull Continuation<? super CameraCapturePipeline> continuation) {
        return new CameraCapturePipeline() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl.getCameraCapturePipeline.2
            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public ListenableFuture<Void> invokePostCapture() {
                final CoroutineScope scope = CapturePipelineImpl.this.threads.getScope();
                final CapturePipelineImpl capturePipelineImpl = CapturePipelineImpl.this;
                final int i5 = i;
                final int i6 = i2;
                final int i21 = i3;
                ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1

                    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1$1, reason: invalid class name */
                    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePostCapture$$inlined$future$1$1", f = "CapturePipeline.kt", l = {104, LDSFile.EF_DG15_TAG}, m = "invokeSuspend", v = 1)
                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
                    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ int $captureMode$inlined;
                        final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                        final /* synthetic */ int $flashMode$inlined;
                        final /* synthetic */ int $flashType$inlined;
                        Object L$0;
                        int label;
                        final /* synthetic */ CapturePipelineImpl this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(CallbackToFutureAdapter.Completer completer, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i, int i2, int i3) {
                            super(2, continuation);
                            this.$completer = completer;
                            this.this$0 = capturePipelineImpl;
                            this.$captureMode$inlined = i;
                            this.$flashMode$inlined = i2;
                            this.$flashType$inlined = i3;
                        }

                        @Override // gim.a
                        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$completer, continuation, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, this.$flashType$inlined);
                        }

                        @Override // gim.a
                        public final Object invokeSuspend(Object obj2) throws Exception {
                            AnonymousClass1 anonymousClass1;
                            CallbackToFutureAdapter.Completer completer;
                            CallbackToFutureAdapter.Completer completer2;
                            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                o.b(obj2);
                                CallbackToFutureAdapter.Completer completer3 = this.$completer;
                                CapturePipelineImpl capturePipelineImpl = this.this$0;
                                List listC = u.c(CapturePipelineImpl.PipelineTask.POST_CAPTURE);
                                int i2 = this.$captureMode$inlined;
                                int i3 = this.$flashMode$inlined;
                                int i5 = this.$flashType$inlined;
                                this.L$0 = completer3;
                                this.label = 1;
                                anonymousClass1 = this;
                                Object objInvokeCaptureTasks = capturePipelineImpl.invokeCaptureTasks(listC, i2, i3, i5, null, anonymousClass1);
                                if (objInvokeCaptureTasks != aVar) {
                                    completer = completer3;
                                    obj2 = objInvokeCaptureTasks;
                                }
                                return aVar;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                completer2 = (CallbackToFutureAdapter.Completer) this.L$0;
                                o.b(obj2);
                                completer2.set(null);
                                return Unit.f186387a;
                            }
                            completer = (CallbackToFutureAdapter.Completer) this.L$0;
                            o.b(obj2);
                            anonymousClass1 = this;
                            anonymousClass1.L$0 = completer;
                            anonymousClass1.label = 2;
                            if (e0.z((Collection) obj2, this) != aVar) {
                                completer2 = completer;
                                completer2.set(null);
                                return Unit.f186387a;
                            }
                            return aVar;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                        }
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                        Intrinsics.checkNotNullParameter(completer, "completer");
                        return e0.C(scope, null, null, new AnonymousClass1(completer, null, capturePipelineImpl, i5, i6, i21), 3);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
                return future;
            }

            @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
            public ListenableFuture<Void> invokePreCapture() {
                final CoroutineScope scope = CapturePipelineImpl.this.threads.getScope();
                final CapturePipelineImpl capturePipelineImpl = CapturePipelineImpl.this;
                final int i5 = i;
                final int i6 = i2;
                final int i21 = i3;
                ListenableFuture<Void> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1

                    /* JADX INFO: renamed from: androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1, reason: invalid class name */
                    @d(c = "androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2$invokePreCapture$$inlined$future$1$1", f = "CapturePipeline.kt", l = {104, LDSFile.EF_DG15_TAG}, m = "invokeSuspend", v = 1)
                    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
                    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ int $captureMode$inlined;
                        final /* synthetic */ CallbackToFutureAdapter.Completer $completer;
                        final /* synthetic */ int $flashMode$inlined;
                        final /* synthetic */ int $flashType$inlined;
                        Object L$0;
                        int label;
                        final /* synthetic */ CapturePipelineImpl this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(CallbackToFutureAdapter.Completer completer, Continuation continuation, CapturePipelineImpl capturePipelineImpl, int i, int i2, int i3) {
                            super(2, continuation);
                            this.$completer = completer;
                            this.this$0 = capturePipelineImpl;
                            this.$captureMode$inlined = i;
                            this.$flashMode$inlined = i2;
                            this.$flashType$inlined = i3;
                        }

                        @Override // gim.a
                        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$completer, continuation, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, this.$flashType$inlined);
                        }

                        @Override // gim.a
                        public final Object invokeSuspend(Object obj2) throws Exception {
                            AnonymousClass1 anonymousClass1;
                            CallbackToFutureAdapter.Completer completer;
                            CallbackToFutureAdapter.Completer completer2;
                            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                o.b(obj2);
                                CallbackToFutureAdapter.Completer completer3 = this.$completer;
                                CapturePipelineImpl capturePipelineImpl = this.this$0;
                                List listC = u.c(CapturePipelineImpl.PipelineTask.PRE_CAPTURE);
                                int i2 = this.$captureMode$inlined;
                                int i3 = this.$flashMode$inlined;
                                int i5 = this.$flashType$inlined;
                                this.L$0 = completer3;
                                this.label = 1;
                                anonymousClass1 = this;
                                Object objInvokeCaptureTasks = capturePipelineImpl.invokeCaptureTasks(listC, i2, i3, i5, null, anonymousClass1);
                                if (objInvokeCaptureTasks != aVar) {
                                    completer = completer3;
                                    obj2 = objInvokeCaptureTasks;
                                }
                                return aVar;
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                completer2 = (CallbackToFutureAdapter.Completer) this.L$0;
                                o.b(obj2);
                                completer2.set(null);
                                return Unit.f186387a;
                            }
                            completer = (CallbackToFutureAdapter.Completer) this.L$0;
                            o.b(obj2);
                            anonymousClass1 = this;
                            anonymousClass1.L$0 = completer;
                            anonymousClass1.label = 2;
                            if (e0.z((Collection) obj2, this) != aVar) {
                                completer2 = completer;
                                completer2.set(null);
                                return Unit.f186387a;
                            }
                            return aVar;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                        }
                    }

                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer<T> completer) {
                        Intrinsics.checkNotNullParameter(completer, "completer");
                        return e0.C(scope, null, null, new AnonymousClass1(completer, null, capturePipelineImpl, i5, i6, i21), 3);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(future, "getFuture(...)");
                return future;
            }
        };
    }

    public int getTemplate() {
        return this.template;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:32:0x007d, B:34:0x0088, B:40:0x0099), top: B:54:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:14:0x002f, B:44:0x00a5, B:46:0x00ad, B:47:0x00b4), top: B:56:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeScreenFlashPostCaptureTasks(int r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r11 instanceof androidx.camera.camera2.impl.CapturePipelineImpl.C18151
            if (r0 == 0) goto L13
            r0 = r11
            androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 r0 = (androidx.camera.camera2.impl.CapturePipelineImpl.C18151) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1 r0 = new androidx.camera.camera2.impl.CapturePipelineImpl$invokeScreenFlashPostCaptureTasks$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            java.lang.String r5 = "CXCP"
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L45
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r10 = r0.L$0
            java.lang.AutoCloseable r10 = (java.lang.AutoCloseable) r10
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L34
            goto La5
        L34:
            r11 = move-exception
            goto Lbd
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            int r10 = r0.I$0
            yhm.o.b(r11)
            goto L7b
        L45:
            int r10 = r0.I$0
            yhm.o.b(r11)
            goto L5b
        L4b:
            yhm.o.b(r11)
            androidx.camera.camera2.impl.FlashControl r11 = r9.flashControl
            r0.I$0 = r10
            r0.label = r6
            java.lang.Object r11 = r11.stopScreenFlashCaptureTasks(r0)
            if (r11 != r1) goto L5b
            goto La3
        L5b:
            androidx.camera.camera2.impl.Camera2Logger r11 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE
            boolean r11 = androidx.camera.core.Logger.isDebugEnabled(r5)
            if (r11 == 0) goto L6a
            java.lang.String r11 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()
            java.lang.String r2 = "screenFlashPostCapture: Acquiring session for unlocking 3A"
        L6a:
            androidx.camera.camera2.config.UseCaseGraphContext r11 = r9.useCaseGraphContext
            androidx.camera.camera2.pipe.CameraGraph r11 = r11.getGraph()
            r0.I$0 = r10
            r0.label = r4
            java.lang.Object r11 = r11.acquireSession(r0)
            if (r11 != r1) goto L7b
            goto La3
        L7b:
            java.lang.AutoCloseable r11 = (java.lang.AutoCloseable) r11
            r2 = r11
            androidx.camera.camera2.pipe.CameraGraph$Session r2 = (androidx.camera.camera2.pipe.CameraGraph.Session) r2     // Catch: java.lang.Throwable -> L90
            androidx.camera.camera2.impl.Camera2Logger r4 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L90
            boolean r4 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L95
            java.lang.String r4 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L90
            java.lang.String r7 = "screenFlashPostCapture: Unlocking 3A"
            goto L95
        L90:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto Lbd
        L95:
            if (r10 != 0) goto L98
            goto L99
        L98:
            r6 = 0
        L99:
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L90
            r0.label = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r10 = r2.unlock3APostCapture(r6, r0)     // Catch: java.lang.Throwable -> L90
            if (r10 != r1) goto La4
        La3:
            return r1
        La4:
            r10 = r11
        La5:
            androidx.camera.camera2.impl.Camera2Logger r11 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE     // Catch: java.lang.Throwable -> L34
            boolean r11 = androidx.camera.core.Logger.isDebugEnabled(r5)     // Catch: java.lang.Throwable -> L34
            if (r11 == 0) goto Lb4
            java.lang.String r11 = androidx.camera.camera2.impl.Camera2Logger.access$getTRUNCATED_TAG$p()     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "screenFlashPostCapture: Unlocking 3A done"
        Lb4:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r11 = 0
            mra.d.l(r10, r11)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lbd:
            throw r11     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r0 = move-exception
            mra.d.l(r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeScreenFlashPostCaptureTasks(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:48:0x00bc, B:36:0x008d, B:38:0x0098, B:41:0x00a4, B:45:0x00ac), top: B:62:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc A[Catch: all -> 0x00a0, PHI: r0 r15
      0x00bc: PHI (r0v11 java.lang.Object) = (r0v9 java.lang.Object), (r0v1 java.lang.Object) binds: [B:46:0x00b9, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x00bc: PHI (r15v3 java.lang.AutoCloseable) = (r15v1 java.lang.AutoCloseable), (r15v4 java.lang.AutoCloseable) binds: [B:46:0x00b9, B:24:0x0052] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:48:0x00bc, B:36:0x008d, B:38:0x0098, B:41:0x00a4, B:45:0x00ac), top: B:62:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4 A[Catch: all -> 0x003f, TryCatch #3 {all -> 0x003f, blocks: (B:16:0x003a, B:52:0x00ca, B:54:0x00d4, B:55:0x00e5), top: B:68:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeScreenFlashPreCaptureTasks(int r17, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.CapturePipelineImpl.invokeScreenFlashPreCaptureTasks(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public void setTemplate(int i) {
        this.template = i;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* JADX INFO: renamed from: submitStillCaptures-BvXKQx0 */
    public Object mo11submitStillCapturesBvXKQx0(@NotNull List<CaptureConfig> list, int i, @NotNull Config config, int i2, int i3, int i5, @NotNull Continuation<? super List<? extends g0>> continuation) {
        return invokeCaptureTasks(v.k(PipelineTask.PRE_CAPTURE, PipelineTask.MAIN_CAPTURE, PipelineTask.POST_CAPTURE), i2, i5, i3, new MainCaptureParams(list, i, config, null), continuation);
    }
}
