package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import android.graphics.RectF;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.FallbackStrategy;
import androidx.camera.video.Quality;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.EmulatorDetector;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.capture.PhotoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.api.client.data.SdkConfiguration;
import gim.d;
import gim.i;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u0097\u00012\u00020\u0001:\u0004\u0097\u0001\u0098\u0001B¯\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0001\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0 ¢\u0006\u0004\b\"\u0010#J+\u0010*\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&H\u0016¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u0004\u0018\u00010-2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(0&H\u0017¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020(H\u0016¢\u0006\u0004\b0\u00101J+\u00105\u001a\u00020(2\u0006\u00103\u001a\u0002022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020(0&H\u0017¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e07H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=JC\u0010E\u001a\u00020(2\u0006\u0010?\u001a\u00020>2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&2\b\b\u0002\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJC\u0010G\u001a\u00020(2\u0006\u0010?\u001a\u00020>2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0@2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020(0&2\b\b\u0002\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bG\u0010FJ#\u0010H\u001a\u00020(2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020(0&H\u0002¢\u0006\u0004\bH\u0010IJ\u001c\u0010M\u001a\u0004\u0018\u00010L2\b\b\u0002\u0010K\u001a\u00020JH\u0082@¢\u0006\u0004\bM\u0010NJ/\u0010P\u001a\u00020(2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010L2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020(0&H\u0002¢\u0006\u0004\bP\u0010QJ\u001d\u0010U\u001a\u00020C2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020S0RH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020(H\u0002¢\u0006\u0004\bZ\u00101J\u001b\u0010\\\u001a\u00020(2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010JH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020(H\u0002¢\u0006\u0004\b^\u00101J\u000f\u0010_\u001a\u00020(H\u0002¢\u0006\u0004\b_\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010dR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010fR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010gR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010hR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010iR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010jR\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010kR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010lR\u001c\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010mR\u001c\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u0010wR\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010|\u001a\u00020{8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b|\u0010}R0\u0010\u007f\u001a\u0004\u0018\u00010~8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0085\u0001\u00101\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R#\u0010\u0088\u0001\u001a\f\u0012\u0005\u0012\u00030\u0087\u0001\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "Landroid/content/Context;", "applicationContext", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase;", "cameraXTakeVideoUseCase", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakePictureUseCase;", "cameraXTakePictureUseCase", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXImageAnalysisUseCase;", "cameraXImageAnalysisUseCase", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "dispatchersProvider", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraProviderFuture", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/camera/view/PreviewView;", "previewView", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "previewConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageCaptureConfig;", "imageCaptureConfig", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "imageAnalysisConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "", "imageAnalyzer", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "frameSampler", "<init>", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase;Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakePictureUseCase;Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXImageAnalysisUseCase;Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;Lcom/google/common/util/concurrent/ListenableFuture;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/view/PreviewView;Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageCaptureConfig;Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;)V", "Lcom/onfido/android/sdk/capture/ui/camera/capture/PhotoCaptureConfig;", "photoCaptureConfig", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "", "callback", "takePicture", "(Lcom/onfido/android/sdk/capture/ui/camera/capture/PhotoCaptureConfig;Lkotlin/jvm/functions/Function1;)V", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "takeVideo", "(Lkotlin/jvm/functions/Function1;)Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "stop", "()V", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "cameraFacing", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "start", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;Lkotlin/jvm/functions/Function1;)V", "Lio/reactivex/rxjava3/core/Observable;", "observeFrame", "()Lio/reactivex/rxjava3/core/Observable;", "Landroid/graphics/RectF;", "rectF", "centerPreviewAccordingTo", "(Landroid/graphics/RectF;)V", "", "e", "Landroidx/lifecycle/Observer;", "Landroidx/camera/core/CameraState;", "observer", "", "shouldInterrupt", "handleFailedImageCapture", "(Ljava/lang/Throwable;Landroidx/lifecycle/Observer;Lkotlin/jvm/functions/Function1;Z)V", "handleFailedVideoRecording", "setupCameraUseCasesWithViewPort", "(Lkotlin/jvm/functions/Function1;)V", "", "currentRetry", "Landroidx/camera/core/ViewPort;", "getViewPortWithRetry", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "viewPort", "setupCameraUseCases", "(Landroidx/camera/core/ViewPort;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/camera/core/UseCase;", "useCases", "isUseCasesCombinationSupported", "(Ljava/util/List;)Z", "Lkotlin/Function0;", "setupPreview", "(Lkotlin/jvm/functions/Function0;)V", "setupImageCapture", "aspectRatio", "setupVideoCapture", "(Ljava/lang/Integer;)V", "setupImageAnalysis", "adjustPreviewViewCenter", "Landroid/content/Context;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakePictureUseCase;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXImageAnalysisUseCase;", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/camera/view/PreviewView;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageCaptureConfig;", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "Ljava/util/concurrent/Executor;", "mainExecutor", "Ljava/util/concurrent/Executor;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "Landroidx/camera/core/Camera;", "camera", "Landroidx/camera/core/Camera;", "Landroidx/camera/core/Preview;", "preview", "Landroidx/camera/core/Preview;", "Landroidx/camera/core/ImageCapture;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture$onfido_capture_sdk_core_release", "()Landroidx/camera/core/ImageCapture;", "setImageCapture$onfido_capture_sdk_core_release", "(Landroidx/camera/core/ImageCapture;)V", "getImageCapture$onfido_capture_sdk_core_release$annotations", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/video/Recorder;", "videoCapture", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/core/ImageAnalysis;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "previewViewCenter", "Landroid/graphics/RectF;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraControl;", "getCameraControl", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraControl;", "cameraControl", "Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "getCameraXConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "cameraXConfiguration", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraX implements OnfidoCamera {

    @NotNull
    private static final Quality DEFAULT_VIDEO_QUALITY;

    @Deprecated
    public static final int MAX_RETRY_COUNT_FOR_VIEWPORT = 30;

    @Deprecated
    public static final long RETRY_PERIOD_VIEW_PORT_IN_MS = 100;

    @NotNull
    private final Context applicationContext;
    private Camera camera;
    private OnfidoCamera.CameraFacing cameraFacing;
    private ProcessCameraProvider cameraProvider;

    @NotNull
    private final ListenableFuture<ProcessCameraProvider> cameraProviderFuture;

    @NotNull
    private final CameraXImageAnalysisUseCase cameraXImageAnalysisUseCase;

    @NotNull
    private final CameraXTakePictureUseCase cameraXTakePictureUseCase;

    @NotNull
    private final CameraXTakeVideoUseCase cameraXTakeVideoUseCase;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final DispatchersProvider dispatchersProvider;

    @NotNull
    private final FrameSampler<? extends Object> frameSampler;
    private ImageAnalysis imageAnalysis;
    private final ImageAnalysisConfig imageAnalysisConfig;

    @NotNull
    private final ImageAnalyzer<? extends Object> imageAnalyzer;
    private ImageCapture imageCapture;
    private final ImageCaptureConfig imageCaptureConfig;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final Executor mainExecutor;
    private Preview preview;

    @NotNull
    private final PreviewConfig previewConfig;

    @NotNull
    private final PreviewView previewView;
    private RectF previewViewCenter;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;
    private VideoCapture<Recorder> videoCapture;
    private final VideoCaptureConfig videoCaptureConfig;

    @Deprecated
    @NotNull
    public static final String ERROR_MESSAGE_FOR_CAMERA_PICTURE = "Unable to setup CameraX for taking picture";

    @Deprecated
    @NotNull
    public static final String ERROR_VIEW_PORT_NOT_READY = "ViewPort is not ready";

    @Deprecated
    @NotNull
    public static final String ERROR_MESSAGE_FOR_CAMERA_START = "Starting CameraX failed";

    @Deprecated
    @NotNull
    public static final String ERROR_MESSAGE_FOR_CAMERA_RECORDING = "Unable to setup CameraX for recording";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX$Companion;", "", "()V", "DEFAULT_VIDEO_QUALITY", "Landroidx/camera/video/Quality;", "getDEFAULT_VIDEO_QUALITY", "()Landroidx/camera/video/Quality;", "ERROR_MESSAGE_FOR_CAMERA_PICTURE", "", "ERROR_MESSAGE_FOR_CAMERA_RECORDING", "ERROR_MESSAGE_FOR_CAMERA_START", "ERROR_VIEW_PORT_NOT_READY", "MAX_RETRY_COUNT_FOR_VIEWPORT", "", "RETRY_PERIOD_VIEW_PORT_IN_MS", "", "toCameraSelector", "Landroidx/camera/core/CameraSelector;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Quality getDEFAULT_VIDEO_QUALITY() {
            return CameraX.DEFAULT_VIDEO_QUALITY;
        }

        @NotNull
        public final CameraSelector toCameraSelector(@NotNull OnfidoCamera.CameraFacing cameraFacing) {
            Intrinsics.checkNotNullParameter(cameraFacing, "<this>");
            CameraSelector cameraSelectorBuild = EmulatorDetector.INSTANCE.isEmulator() ? new CameraSelector.Builder().build() : cameraFacing == OnfidoCamera.CameraFacing.FRONT ? CameraSelector.DEFAULT_FRONT_CAMERA : CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.h(cameraSelectorBuild);
            return cameraSelectorBuild;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jd\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraX;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "previewView", "Landroidx/camera/view/PreviewView;", "previewConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/PreviewConfig;", "imageCaptureConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageCaptureConfig;", "videoCaptureConfig", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "imageAnalysisConfig", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalysisConfig;", "imageAnalyzer", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/ImageAnalyzer;", "frameSampler", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/FrameSampler;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ CameraX create$default(Factory factory, LifecycleOwner lifecycleOwner, PreviewView previewView, PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, ImageAnalyzer imageAnalyzer, FrameSampler frameSampler, int i, Object obj2) {
                if (obj2 != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
                }
                if ((i & 8) != 0) {
                    imageCaptureConfig = null;
                }
                if ((i & 16) != 0) {
                    videoCaptureConfig = null;
                }
                if ((i & 32) != 0) {
                    imageAnalysisConfig = null;
                }
                return factory.create(lifecycleOwner, previewView, previewConfig, imageCaptureConfig, videoCaptureConfig, imageAnalysisConfig, imageAnalyzer, frameSampler);
            }
        }

        @NotNull
        CameraX create(@NotNull LifecycleOwner lifecycleOwner, @NotNull PreviewView previewView, @NotNull PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, @NotNull ImageAnalyzer<? extends Object> imageAnalyzer, @NotNull FrameSampler<? extends Object> frameSampler);
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2", f = "CameraX.kt", l = {328, 331, 332}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/camera/core/ViewPort;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super ViewPort>, Object> {
        final /* synthetic */ int $currentRetry;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2$1, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2$1", f = "CameraX.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/camera/core/ViewPort;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super ViewPort>, Object> {
            int label;
            final /* synthetic */ CameraX this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CameraX cameraX, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cameraX;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return this.this$0.previewView.getViewPort();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ViewPort> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$currentRetry = i;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return CameraX.this.new AnonymousClass2(this.$currentRetry, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        
            if (r8 != r0) goto L25;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                yhm.o.b(r8)
                goto L6e
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                yhm.o.b(r8)
                goto L60
            L20:
                yhm.o.b(r8)
                goto L41
            L24:
                yhm.o.b(r8)
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX r8 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.this
                com.onfido.android.sdk.capture.internal.util.DispatchersProvider r8 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.access$getDispatchersProvider$p(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = r8.getMain()
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2$1 r1 = new com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$getViewPortWithRetry$2$1
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX r6 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.this
                r1.<init>(r6, r2)
                r7.label = r5
                java.lang.Object r8 = skm.e0.J(r8, r1, r7)
                if (r8 != r0) goto L41
                goto L6d
            L41:
                androidx.camera.core.ViewPort r8 = (androidx.camera.core.ViewPort) r8
                if (r8 != 0) goto L72
                int r8 = r7.$currentRetry
                r1 = 30
                if (r8 >= r1) goto L71
                com.onfido.android.sdk.capture.internal.util.logging.Timber$Forest r8 = com.onfido.android.sdk.capture.internal.util.logging.Timber.INSTANCE
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "CameraX Preview was not ready, trying again..."
                r8.e(r2, r1)
                r7.label = r4
                r1 = 100
                java.lang.Object r8 = skm.k0.b(r1, r7)
                if (r8 != r0) goto L60
                goto L6d
            L60:
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX r8 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.this
                int r1 = r7.$currentRetry
                int r1 = r1 + r5
                r7.label = r3
                java.lang.Object r8 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.access$getViewPortWithRetry(r8, r1, r7)
                if (r8 != r0) goto L6e
            L6d:
                return r0
            L6e:
                androidx.camera.core.ViewPort r8 = (androidx.camera.core.ViewPort) r8
                return r8
            L71:
                return r2
            L72:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ViewPort> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1", f = "CameraX.kt", l = {314, 315}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ViewPort, Unit> $viewPortSetup;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1$1", f = "CameraX.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03621 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ ViewPort $viewPort;
            final /* synthetic */ Function1<ViewPort, Unit> $viewPortSetup;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03621(Function1<? super ViewPort, Unit> function1, ViewPort viewPort, Continuation<? super C03621> continuation) {
                super(2, continuation);
                this.$viewPortSetup = function1;
                this.$viewPort = viewPort;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03621(this.$viewPortSetup, this.$viewPort, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                this.$viewPortSetup.invoke(this.$viewPort);
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03621) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super ViewPort, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$viewPortSetup = function1;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return CameraX.this.new AnonymousClass1(this.$viewPortSetup, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (skm.e0.J(r1, r4, r6) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                yhm.o.b(r7)
                goto L48
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                yhm.o.b(r7)
                goto L2c
            L1d:
                yhm.o.b(r7)
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX r7 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.this
                r6.label = r4
                r1 = 0
                java.lang.Object r7 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.getViewPortWithRetry$default(r7, r1, r6, r4, r2)
                if (r7 != r0) goto L2c
                goto L47
            L2c:
                androidx.camera.core.ViewPort r7 = (androidx.camera.core.ViewPort) r7
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX r1 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.this
                com.onfido.android.sdk.capture.internal.util.DispatchersProvider r1 = com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.access$getDispatchersProvider$p(r1)
                kotlinx.coroutines.CoroutineDispatcher r1 = r1.getMain()
                com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1$1 r4 = new com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupCameraUseCasesWithViewPort$1$1
                kotlin.jvm.functions.Function1<androidx.camera.core.ViewPort, kotlin.Unit> r5 = r6.$viewPortSetup
                r4.<init>(r5, r7, r2)
                r6.label = r3
                java.lang.Object r7 = skm.e0.J(r1, r4, r6)
                if (r7 != r0) goto L48
            L47:
                return r0
            L48:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takePicture$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20111 extends u implements Function1<OnfidoCamera.PictureCaptureEvent, Unit> {
        final /* synthetic */ Function1<OnfidoCamera.PictureCaptureEvent, Unit> $callback;
        final /* synthetic */ CameraX$takePicture$cameraStateObserver$1 $cameraStateObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20111(CameraX$takePicture$cameraStateObserver$1 cameraX$takePicture$cameraStateObserver$1, Function1<? super OnfidoCamera.PictureCaptureEvent, Unit> function1) {
            super(1);
            this.$cameraStateObserver = cameraX$takePicture$cameraStateObserver$1;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.PictureCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.PictureCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Camera camera = CameraX.this.camera;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            camera.getCameraInfo().getCameraState().removeObserver(this.$cameraStateObserver);
            this.$callback.invoke(event);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takeVideo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20121 extends u implements Function1<OnfidoCamera.VideoCaptureEvent, Unit> {
        final /* synthetic */ Function1<OnfidoCamera.VideoCaptureEvent, Unit> $callback;
        final /* synthetic */ CameraX$takeVideo$cameraStateObserver$1 $cameraStateObserver;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20121(CameraX$takeVideo$cameraStateObserver$1 cameraX$takeVideo$cameraStateObserver$1, Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> function1) {
            super(1);
            this.$cameraStateObserver = cameraX$takeVideo$cameraStateObserver$1;
            this.$callback = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.VideoCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.VideoCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Camera camera = CameraX.this.camera;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            camera.getCameraInfo().getCameraState().removeObserver(this.$cameraStateObserver);
            this.$callback.invoke(event);
        }
    }

    static {
        Quality SD = Quality.SD;
        Intrinsics.checkNotNullExpressionValue(SD, "SD");
        DEFAULT_VIDEO_QUALITY = SD;
    }

    public CameraX(@ApplicationContext @NotNull Context applicationContext, @NotNull CameraXTakeVideoUseCase cameraXTakeVideoUseCase, @NotNull CameraXTakePictureUseCase cameraXTakePictureUseCase, @NotNull CameraXImageAnalysisUseCase cameraXImageAnalysisUseCase, @NotNull DispatchersProvider dispatchersProvider, @NotNull ListenableFuture<ProcessCameraProvider> cameraProviderFuture, @NotNull OnfidoRemoteConfig remoteConfig, @NotNull LifecycleOwner lifecycleOwner, @NotNull PreviewView previewView, @NotNull PreviewConfig previewConfig, ImageCaptureConfig imageCaptureConfig, VideoCaptureConfig videoCaptureConfig, ImageAnalysisConfig imageAnalysisConfig, @NotNull ImageAnalyzer<? extends Object> imageAnalyzer, @NotNull FrameSampler<? extends Object> frameSampler) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXTakeVideoUseCase, "cameraXTakeVideoUseCase");
        Intrinsics.checkNotNullParameter(cameraXTakePictureUseCase, "cameraXTakePictureUseCase");
        Intrinsics.checkNotNullParameter(cameraXImageAnalysisUseCase, "cameraXImageAnalysisUseCase");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "cameraProviderFuture");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(previewConfig, "previewConfig");
        Intrinsics.checkNotNullParameter(imageAnalyzer, "imageAnalyzer");
        Intrinsics.checkNotNullParameter(frameSampler, "frameSampler");
        this.applicationContext = applicationContext;
        this.cameraXTakeVideoUseCase = cameraXTakeVideoUseCase;
        this.cameraXTakePictureUseCase = cameraXTakePictureUseCase;
        this.cameraXImageAnalysisUseCase = cameraXImageAnalysisUseCase;
        this.dispatchersProvider = dispatchersProvider;
        this.cameraProviderFuture = cameraProviderFuture;
        this.remoteConfig = remoteConfig;
        this.lifecycleOwner = lifecycleOwner;
        this.previewView = previewView;
        this.previewConfig = previewConfig;
        this.imageCaptureConfig = imageCaptureConfig;
        this.videoCaptureConfig = videoCaptureConfig;
        this.imageAnalysisConfig = imageAnalysisConfig;
        this.imageAnalyzer = imageAnalyzer;
        this.frameSampler = frameSampler;
        Executor mainExecutor = ContextCompat.getMainExecutor(applicationContext);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.mainExecutor = mainExecutor;
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustPreviewViewCenter() {
        RectF rectF = this.previewViewCenter;
        if (rectF != null) {
            this.previewView.setX(BitmapDescriptorFactory.HUE_RED);
            this.previewView.setY(BitmapDescriptorFactory.HUE_RED);
            float fCenterX = rectF.centerX();
            float fCenterY = rectF.centerY();
            int width = this.previewView.getWidth();
            int height = this.previewView.getHeight();
            float x3 = this.previewView.getX() + (width / 2);
            float y2 = fCenterY - (this.previewView.getY() + (height / 2));
            this.previewView.setTranslationX(fCenterX - x3);
            this.previewView.setTranslationY(y2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SdkConfiguration.CameraXConfiguration getCameraXConfiguration() {
        return this.remoteConfig.getCameraXConfiguration();
    }

    public static /* synthetic */ void getImageCapture$onfido_capture_sdk_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getViewPortWithRetry(int i, Continuation<? super ViewPort> continuation) {
        return e0.J(this.dispatchersProvider.mo3706getDefault(), new AnonymousClass2(i, null), continuation);
    }

    public static /* synthetic */ Object getViewPortWithRetry$default(CameraX cameraX, int i, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return cameraX.getViewPortWithRetry(i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailedImageCapture(Throwable e, Observer<CameraState> observer, Function1<? super OnfidoCamera.PictureCaptureEvent, Unit> callback, boolean shouldInterrupt) {
        Timber.INSTANCE.e(e, "Unable to setup CameraX for taking picture", new Object[0]);
        if (shouldInterrupt) {
            Camera camera = this.camera;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            camera.getCameraInfo().getCameraState().removeObserver(observer);
            callback.invoke(new OnfidoCamera.PictureCaptureEvent.Error(e));
        }
    }

    public static /* synthetic */ void handleFailedImageCapture$default(CameraX cameraX, Throwable th10, Observer observer, Function1 function1, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = true;
        }
        cameraX.handleFailedImageCapture(th10, observer, function1, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFailedVideoRecording(Throwable e, Observer<CameraState> observer, Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> callback, boolean shouldInterrupt) {
        Timber.INSTANCE.e(e, "Unable to setup CameraX for recording", new Object[0]);
        if (shouldInterrupt) {
            Camera camera = this.camera;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            camera.getCameraInfo().getCameraState().removeObserver(observer);
            callback.invoke(new OnfidoCamera.VideoCaptureEvent.Error(e));
        }
    }

    public static /* synthetic */ void handleFailedVideoRecording$default(CameraX cameraX, Throwable th10, Observer observer, Function1 function1, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = true;
        }
        cameraX.handleFailedVideoRecording(th10, observer, function1, z);
    }

    private final boolean isUseCasesCombinationSupported(List<? extends UseCase> useCases) {
        Camera camera = this.camera;
        if (camera == null) {
            Timber.INSTANCE.e("CameraX: Camera is not initialized, cannot check use cases combination support", new Object[0]);
            return false;
        }
        UseCase[] useCaseArr = (UseCase[]) useCases.toArray(new UseCase[0]);
        return camera.isUseCasesCombinationSupported((UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupCameraUseCases(ViewPort viewPort, Function1<? super OnfidoCamera.CameraStatus, Unit> callback) {
        try {
            Companion companion = Companion;
            OnfidoCamera.CameraFacing cameraFacing = this.cameraFacing;
            if (cameraFacing == null) {
                Intrinsics.r("cameraFacing");
                throw null;
            }
            CameraSelector cameraSelector = companion.toCameraSelector(cameraFacing);
            UseCaseGroup.Builder builder = new UseCaseGroup.Builder();
            Preview preview = this.preview;
            if (preview == null) {
                Intrinsics.r("preview");
                throw null;
            }
            UseCase[] elements = {preview, this.imageCapture, this.videoCapture, this.imageAnalysis};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List<? extends UseCase> listL = kotlin.collections.d.L(elements);
            if (isUseCasesCombinationSupported(listL)) {
                Iterator it8 = ((ArrayList) listL).iterator();
                while (it8.hasNext()) {
                    builder.addUseCase((UseCase) it8.next());
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) listL) {
                    if (!Intrinsics.f((UseCase) obj2, this.videoCapture)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    builder.addUseCase((UseCase) it9.next());
                }
            }
            if (viewPort != null) {
                builder.setViewPort(viewPort);
            }
            ProcessCameraProvider processCameraProvider = this.cameraProvider;
            if (processCameraProvider == null) {
                Intrinsics.r("cameraProvider");
                throw null;
            }
            processCameraProvider.unbindAll();
            ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
            if (processCameraProvider2 == null) {
                Intrinsics.r("cameraProvider");
                throw null;
            }
            LifecycleOwner lifecycleOwner = this.lifecycleOwner;
            UseCaseGroup useCaseGroupBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(useCaseGroupBuild, "build(...)");
            this.camera = processCameraProvider2.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroupBuild);
        } catch (IllegalArgumentException e) {
            Timber.INSTANCE.e(e, "Starting CameraX failed", new Object[0]);
            callback.invoke(OnfidoCamera.CameraStatus.NotAvailable.INSTANCE);
        } catch (IllegalStateException e2) {
            Timber.INSTANCE.e(e2, "Starting CameraX failed", new Object[0]);
            callback.invoke(new OnfidoCamera.CameraStatus.Failed(e2));
        }
    }

    public static /* synthetic */ void setupCameraUseCases$default(CameraX cameraX, ViewPort viewPort, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            viewPort = null;
        }
        cameraX.setupCameraUseCases(viewPort, function1);
    }

    private final void setupCameraUseCasesWithViewPort(Function1<? super OnfidoCamera.CameraStatus, Unit> callback) {
        CameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1 cameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1 = new CameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1(this, callback);
        if (getCameraXConfiguration().getShouldRetryViewPortFailure()) {
            e0.C(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(cameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1, null), 3);
        } else {
            cameraX$setupCameraUseCasesWithViewPort$viewPortSetup$1.invoke((Object) this.previewView.getViewPort());
        }
    }

    private final void setupImageAnalysis() {
        ImageAnalysisConfig imageAnalysisConfig;
        if (!this.remoteConfig.isCameraxStreamSharingEnabled() || (imageAnalysisConfig = this.imageAnalysisConfig) == null) {
            return;
        }
        CameraXImageAnalysisUseCase cameraXImageAnalysisUseCase = this.cameraXImageAnalysisUseCase;
        PreviewView previewView = this.previewView;
        OnfidoCamera.CameraFacing cameraFacing = this.cameraFacing;
        if (cameraFacing != null) {
            this.imageAnalysis = CameraXImageAnalysisUseCase.invoke$default(cameraXImageAnalysisUseCase, previewView, cameraFacing, imageAnalysisConfig, this.imageAnalyzer, null, 16, null);
        } else {
            Intrinsics.r("cameraFacing");
            throw null;
        }
    }

    private final void setupImageCapture() {
        if (this.imageCaptureConfig != null) {
            ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionStrategy(new ResolutionStrategy(this.imageCaptureConfig.getTargetResolution(), 1)).build();
            Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
            ImageCapture.Builder builder = new ImageCapture.Builder();
            if (getCameraXConfiguration().getShouldUseResolutionStrategy()) {
                builder.setResolutionSelector(resolutionSelectorBuild);
            }
            if (!getCameraXConfiguration().getShouldUseResolutionStrategy()) {
                builder.setTargetResolution(this.imageCaptureConfig.getTargetResolution());
            }
            this.imageCapture = builder.setCaptureMode(this.imageCaptureConfig.getCaptureMode()).setFlashMode(this.imageCaptureConfig.getFlashMode()).build();
        }
    }

    private final void setupPreview(final Function0<Unit> callback) {
        Preview previewBuild = new Preview.Builder().build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "build(...)");
        previewBuild.setSurfaceProvider(this.previewView.getSurfaceProvider());
        this.preview = previewBuild;
        this.previewView.getPreviewStreamState().observe(this.lifecycleOwner, new Observer<PreviewView.StreamState>() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$setupPreview$observer$1
            @Override // androidx.lifecycle.Observer
            public void onChanged(PreviewView.StreamState state) {
                if (state == PreviewView.StreamState.STREAMING) {
                    callback.invoke();
                    this.previewView.getPreviewStreamState().removeObserver(this);
                }
            }
        });
    }

    private final void setupVideoCapture(Integer aspectRatio) {
        if (this.videoCaptureConfig != null) {
            Quality quality = CameraXExtKt.getQUALITY_MAPPER().get(Integer.valueOf(this.videoCaptureConfig.getQualityProfile()));
            if (quality == null) {
                quality = DEFAULT_VIDEO_QUALITY;
            }
            Quality quality2 = quality;
            QualitySelector qualitySelectorFrom = QualitySelector.from(quality2, FallbackStrategy.higherQualityOrLowerThan(quality2));
            Intrinsics.checkNotNullExpressionValue(qualitySelectorFrom, "from(...)");
            Recorder recorderBuild = new Recorder.Builder().setAspectRatio(aspectRatio != null ? aspectRatio.intValue() : this.videoCaptureConfig.getAspectRatio()).setTargetVideoEncodingBitRate(this.videoCaptureConfig.getBitrate()).setQualitySelector(qualitySelectorFrom).build();
            Intrinsics.checkNotNullExpressionValue(recorderBuild, "build(...)");
            this.videoCapture = VideoCapture.withOutput(recorderBuild);
            if (this.remoteConfig.getCameraXConfiguration().isVideoAspectRatioFallbackEnabled()) {
                UseCase[] elements = {this.imageCapture, this.videoCapture};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (isUseCasesCombinationSupported(kotlin.collections.d.L(elements)) || aspectRatio != null) {
                    return;
                }
                setupVideoCapture(1);
                Timber.INSTANCE.e("CameraX: Aspect ratio is not supported, using default 16:9", new Object[0]);
            }
        }
    }

    public static /* synthetic */ void setupVideoCapture$default(CameraX cameraX, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = null;
        }
        cameraX.setupVideoCapture(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(CameraX this$0, OnfidoCamera.CameraFacing cameraFacing, Function1 callback) throws ExecutionException, InterruptedException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraFacing, "$cameraFacing");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        ProcessCameraProvider processCameraProvider = this$0.cameraProviderFuture.get();
        Intrinsics.checkNotNullExpressionValue(processCameraProvider, "get(...)");
        this$0.cameraProvider = processCameraProvider;
        CameraSelector cameraSelector = Companion.toCameraSelector(cameraFacing);
        ProcessCameraProvider processCameraProvider2 = this$0.cameraProvider;
        if (processCameraProvider2 == null) {
            Intrinsics.r("cameraProvider");
            throw null;
        }
        this$0.camera = processCameraProvider2.bindToLifecycle(this$0.lifecycleOwner, cameraSelector, new UseCase[0]);
        this$0.setupPreview(new CameraX$start$1$1(callback, this$0));
        this$0.setupImageCapture();
        this$0.setupImageAnalysis();
        setupVideoCapture$default(this$0, null, 1, null);
        if (this$0.previewConfig.getViewPortEnabled()) {
            this$0.setupCameraUseCasesWithViewPort(callback);
        } else {
            setupCameraUseCases$default(this$0, null, callback, 1, null);
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void centerPreviewAccordingTo(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.previewViewCenter = rectF;
        if (this.previewView.getHeight() != 0) {
            adjustPreviewViewCenter();
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    @NotNull
    public OnfidoCamera.CameraControl getCameraControl() {
        return new OnfidoCamera.CameraControl() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$cameraControl$1
            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.CameraControl
            public void enableTorch(boolean enabled) {
                Camera camera = this.this$0.camera;
                if (camera == null) {
                    Intrinsics.r("camera");
                    throw null;
                }
                if (camera.getCameraInfo().hasFlashUnit()) {
                    Camera camera2 = this.this$0.camera;
                    if (camera2 != null) {
                        camera2.getCameraControl().enableTorch(enabled);
                    } else {
                        Intrinsics.r("camera");
                        throw null;
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: getImageCapture$onfido_capture_sdk_core_release, reason: from getter */
    public final ImageCapture getImageCapture() {
        return this.imageCapture;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    @NotNull
    public Observable observeFrame() {
        return this.remoteConfig.isCameraxStreamSharingEnabled() ? this.imageAnalyzer.observeFrame() : this.frameSampler.observeFrame();
    }

    public final void setImageCapture$onfido_capture_sdk_core_release(ImageCapture imageCapture) {
        this.imageCapture = imageCapture;
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void start(@NotNull OnfidoCamera.CameraFacing cameraFacing, @NotNull Function1<? super OnfidoCamera.CameraStatus, Unit> callback) {
        Intrinsics.checkNotNullParameter(cameraFacing, "cameraFacing");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.previewView.setScaleType(this.previewConfig.getScaleType());
        ViewExtensionsKt.toVisible$default(this.previewView, false, 1, null);
        this.cameraFacing = cameraFacing;
        try {
            this.cameraProviderFuture.addListener(new b0.d(this, 3, cameraFacing, callback), this.mainExecutor);
        } catch (IllegalArgumentException e) {
            callback.invoke(OnfidoCamera.CameraStatus.NotFound.INSTANCE);
            Timber.INSTANCE.e(e, "Starting CameraX failed", new Object[0]);
        } catch (IllegalStateException e2) {
            callback.invoke(new OnfidoCamera.CameraStatus.Failed(e2));
            Timber.INSTANCE.e(e2, "Starting CameraX failed", new Object[0]);
        } catch (RejectedExecutionException e4) {
            callback.invoke(new OnfidoCamera.CameraStatus.Failed(e4));
            Timber.INSTANCE.e(e4, "Starting CameraX failed", new Object[0]);
        }
    }

    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void stop() {
        this.compositeDisposable.d();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            try {
                processCameraProvider.unbindAll();
            } catch (IllegalArgumentException e) {
                Timber.INSTANCE.e(e, "Unable to stop CameraX because of failing to unbind", new Object[0]);
            }
        }
        this.frameSampler.close();
        this.cameraXImageAnalysisUseCase.close(this.imageAnalysis);
        ViewExtensionsKt.toGone$default(this.previewView, false, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.Observer, com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takePicture$cameraStateObserver$1] */
    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public void takePicture(@NotNull PhotoCaptureConfig photoCaptureConfig, @NotNull final Function1<? super OnfidoCamera.PictureCaptureEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(photoCaptureConfig, "photoCaptureConfig");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture == null) {
            return;
        }
        ?? r3 = new Observer<CameraState>() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takePicture$cameraStateObserver$1
            @Override // androidx.lifecycle.Observer
            public void onChanged(@NotNull CameraState state) {
                Throwable th10;
                Intrinsics.checkNotNullParameter(state, "state");
                CameraState.StateError error = state.getError();
                if (error == null || error.getCode() != 3) {
                    return;
                }
                CameraState.StateError error2 = state.getError();
                if (error2 == null || (th10 = error2.getCause()) == null) {
                    StringBuilder sb6 = new StringBuilder("CameraX failed to capture image with error code : ");
                    CameraState.StateError error3 = state.getError();
                    sb6.append(error3 != null ? Integer.valueOf(error3.getCode()) : null);
                    th10 = new Throwable(sb6.toString());
                }
                CameraX cameraX = this.this$0;
                cameraX.handleFailedImageCapture(th10, this, callback, cameraX.getCameraXConfiguration().getShouldInterruptImageRecoverableError());
            }
        };
        try {
            ProcessCameraProvider processCameraProvider = this.cameraProvider;
            if (processCameraProvider == null) {
                Intrinsics.r("cameraProvider");
                throw null;
            }
            if (!processCameraProvider.isBound(imageCapture)) {
                ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
                if (processCameraProvider2 == null) {
                    Intrinsics.r("cameraProvider");
                    throw null;
                }
                processCameraProvider2.unbind(this.videoCapture);
                Companion companion = Companion;
                OnfidoCamera.CameraFacing cameraFacing = this.cameraFacing;
                if (cameraFacing == null) {
                    Intrinsics.r("cameraFacing");
                    throw null;
                }
                CameraSelector cameraSelector = companion.toCameraSelector(cameraFacing);
                ProcessCameraProvider processCameraProvider3 = this.cameraProvider;
                if (processCameraProvider3 == null) {
                    Intrinsics.r("cameraProvider");
                    throw null;
                }
                this.camera = processCameraProvider3.bindToLifecycle(this.lifecycleOwner, cameraSelector, imageCapture);
            }
            Camera camera = this.camera;
            if (camera == null) {
                Intrinsics.r("camera");
                throw null;
            }
            camera.getCameraInfo().getCameraState().observe(this.lifecycleOwner, r3);
            this.cameraXTakePictureUseCase.invoke(imageCapture, this.previewView, new C20111(r3, callback));
        } catch (IllegalArgumentException e) {
            e = e;
            handleFailedImageCapture$default(this, e, r3, callback, false, 8, null);
        } catch (IllegalStateException e2) {
            e = e2;
            handleFailedImageCapture$default(this, e, r3, callback, false, 8, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.lifecycle.Observer, com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takeVideo$cameraStateObserver$1] */
    @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera
    public OnfidoCamera.VideoRecorder takeVideo(@NotNull final Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        VideoCapture<Recorder> videoCapture = this.videoCapture;
        if (videoCapture == null) {
            return null;
        }
        ?? r4 = new Observer<CameraState>() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraX$takeVideo$cameraStateObserver$1
            @Override // androidx.lifecycle.Observer
            public void onChanged(@NotNull CameraState state) {
                Throwable th10;
                Intrinsics.checkNotNullParameter(state, "state");
                CameraState.StateError error = state.getError();
                if (error == null || error.getCode() != 3) {
                    return;
                }
                CameraState.StateError error2 = state.getError();
                if (error2 == null || (th10 = error2.getCause()) == null) {
                    StringBuilder sb6 = new StringBuilder("CameraX failed to record video with error code : ");
                    CameraState.StateError error3 = state.getError();
                    sb6.append(error3 != null ? Integer.valueOf(error3.getCode()) : null);
                    th10 = new Throwable(sb6.toString());
                }
                CameraX cameraX = this.this$0;
                cameraX.handleFailedVideoRecording(th10, this, callback, cameraX.getCameraXConfiguration().getShouldInterruptVideoRecoverableError());
            }
        };
        try {
            ProcessCameraProvider processCameraProvider = this.cameraProvider;
            if (processCameraProvider == null) {
                Intrinsics.r("cameraProvider");
                throw null;
            }
            if (!processCameraProvider.isBound(videoCapture)) {
                ProcessCameraProvider processCameraProvider2 = this.cameraProvider;
                if (processCameraProvider2 == null) {
                    Intrinsics.r("cameraProvider");
                    throw null;
                }
                processCameraProvider2.unbind(this.imageCapture);
                OnfidoCamera.CameraFacing cameraFacing = this.cameraFacing;
                if (cameraFacing == null) {
                    Intrinsics.r("cameraFacing");
                    throw null;
                }
                if (cameraFacing == OnfidoCamera.CameraFacing.BACK && getCameraXConfiguration().getShouldRemovePreviewVideoRecording()) {
                    ProcessCameraProvider processCameraProvider3 = this.cameraProvider;
                    if (processCameraProvider3 == null) {
                        Intrinsics.r("cameraProvider");
                        throw null;
                    }
                    Preview preview = this.preview;
                    if (preview == null) {
                        Intrinsics.r("preview");
                        throw null;
                    }
                    processCameraProvider3.unbind(preview);
                    ProcessCameraProvider processCameraProvider4 = this.cameraProvider;
                    if (processCameraProvider4 == null) {
                        Intrinsics.r("cameraProvider");
                        throw null;
                    }
                    processCameraProvider4.unbind(this.imageAnalysis);
                    this.frameSampler.close();
                }
                Companion companion = Companion;
                OnfidoCamera.CameraFacing cameraFacing2 = this.cameraFacing;
                if (cameraFacing2 == null) {
                    Intrinsics.r("cameraFacing");
                    throw null;
                }
                CameraSelector cameraSelector = companion.toCameraSelector(cameraFacing2);
                ProcessCameraProvider processCameraProvider5 = this.cameraProvider;
                if (processCameraProvider5 == null) {
                    Intrinsics.r("cameraProvider");
                    throw null;
                }
                Camera cameraBindToLifecycle = processCameraProvider5.bindToLifecycle(this.lifecycleOwner, cameraSelector, videoCapture);
                this.camera = cameraBindToLifecycle;
                if (cameraBindToLifecycle == null) {
                    Intrinsics.r("camera");
                    throw null;
                }
                cameraBindToLifecycle.getCameraInfo().getCameraState().observe(this.lifecycleOwner, r4);
            }
            CameraXTakeVideoUseCase cameraXTakeVideoUseCase = this.cameraXTakeVideoUseCase;
            VideoCaptureConfig videoCaptureConfig = this.videoCaptureConfig;
            Intrinsics.h(videoCaptureConfig);
            return cameraXTakeVideoUseCase.invoke(videoCapture, videoCaptureConfig, new C20121(r4, callback));
        } catch (IllegalArgumentException e) {
            e = e;
            handleFailedVideoRecording$default(this, e, r4, callback, false, 8, null);
            return null;
        } catch (IllegalStateException e2) {
            e = e2;
            handleFailedVideoRecording$default(this, e, r4, callback, false, 8, null);
            return null;
        }
    }
}
