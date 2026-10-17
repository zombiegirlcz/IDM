package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.camera.viewfinder.CameraViewfinder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.b;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.di.capture.MotionCaptureComponent;
import com.onfido.android.sdk.capture.component.active.video.capture.di.capture.MotionCaptureComponentHolder;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraController;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.MotionCameraControllerFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvc;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.MotionFaceDetectorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.facealignment.FaceAlignmentView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.facealignment.FeedbackLabelView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnCompletedView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn.HeadTurnGuidanceView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.OvalRect;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.RectDebuggingView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.MotionCaptureViewModelImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.headturn.HeadTurnGuidanceViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.model.FaceAlignmentFeedback;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.AvcTimer;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util.WindowHelperKt;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionNoFaceDetectedScreen;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionUploadScreen;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentMotionCaptureBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import fim.a;
import gim.d;
import gim.i;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.k0;
import yhm.j;
import yhm.k;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000  \u00012\u00020\u00012\u00020\u0002:\u0002 \u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010s\u001a\u00020tH\u0002J\u0012\u0010u\u001a\u00020t2\b\u0010v\u001a\u0004\u0018\u00010wH\u0002J\b\u0010x\u001a\u00020yH\u0002J\u0010\u0010z\u001a\u00020t2\u0006\u0010{\u001a\u00020|H\u0002J\u0010\u0010}\u001a\u00020t2\u0006\u0010~\u001a\u00020\bH\u0002J\u0010\u0010\u007f\u001a\u00020t2\u0006\u0010~\u001a\u00020\bH\u0002J\t\u0010\u0080\u0001\u001a\u00020tH\u0002J\t\u0010\u0081\u0001\u001a\u00020tH\u0002J\t\u0010\u0082\u0001\u001a\u00020tH\u0002J\t\u0010\u0083\u0001\u001a\u00020tH\u0002J\t\u0010\u0084\u0001\u001a\u00020tH\u0002J\t\u0010\u0085\u0001\u001a\u00020tH\u0002J\t\u0010\u0086\u0001\u001a\u00020tH\u0002J\t\u0010\u0087\u0001\u001a\u00020tH\u0016J\t\u0010\u0088\u0001\u001a\u00020tH\u0016J\t\u0010\u0089\u0001\u001a\u00020tH\u0016J\t\u0010\u008a\u0001\u001a\u00020tH\u0016J\u001f\u0010\u008b\u0001\u001a\u00020t2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0016J\t\u0010\u0090\u0001\u001a\u00020tH\u0016J\t\u0010\u0091\u0001\u001a\u00020tH\u0002J\t\u0010\u0092\u0001\u001a\u00020tH\u0002J\t\u0010\u0093\u0001\u001a\u00020HH\u0002J:\u0010\u0094\u0001\u001a\u00020t2\t\b\u0001\u0010\u0095\u0001\u001a\u00020\t2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\t2\t\b\u0001\u0010\u0097\u0001\u001a\u00020\t2\u000e\u0010\u0098\u0001\u001a\t\u0012\u0004\u0012\u00020t0\u0099\u0001H\u0002J\u0014\u0010\u009a\u0001\u001a\u00020t2\t\b\u0001\u0010\u009b\u0001\u001a\u00020\tH\u0002J\u0019\u0010\u009c\u0001\u001a\u00020t2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020t0\u0099\u0001H\u0002J\u0019\u0010\u009e\u0001\u001a\u00020t2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020t0\u0099\u0001H\u0002J\t\u0010\u009f\u0001\u001a\u00020tH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010!\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R$\u00104\u001a\b\u0012\u0004\u0012\u000206058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010;\u001a\u00020<8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001b\u0010G\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010&\u001a\u0004\bG\u0010IR\u000e\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010M\u001a\u00020N8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001b\u0010S\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010&\u001a\u0004\bU\u0010VR\u001e\u0010X\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u00020_8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010d\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010&\u001a\u0004\be\u0010IR\u001a\u0010g\u001a\u00020hX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001e\u0010m\u001a\u00020n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r¨\u0006¡\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/MotionCaptureFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/onfido/android/sdk/capture/utils/WorkflowToolbarUpdateListener;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentMotionCaptureBinding;", "accessibilityAnnouncementMap", "", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/model/FaceAlignmentFeedback;", "", "analytics", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "getAnalytics", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;", "setAnalytics", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/OnfidoAnalytics;)V", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentMotionCaptureBinding;", "cameraController", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraController;", "cameraControllerFactory", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraControllerFactory;", "getCameraControllerFactory", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraControllerFactory;", "setCameraControllerFactory", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/MotionCameraControllerFactory;)V", "captureComponent", "Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionCaptureComponent;", "getCaptureComponent", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/di/capture/MotionCaptureComponent;", "captureComponent$delegate", "Lkotlin/Lazy;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "delayStartRecordingTimer", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;", "getDelayStartRecordingTimer", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;", "setDelayStartRecordingTimer", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/util/AvcTimer;)V", "delayTimer", "getDelayTimer", "setDelayTimer", "faceDetectorAvc", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvc;", "faceDetectorAvcResultMapperTestImpl", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapperTestImpl;", "", "getFaceDetectorAvcResultMapperTestImpl", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapperTestImpl;", "setFaceDetectorAvcResultMapperTestImpl", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/FaceDetectorAvcResultMapperTestImpl;)V", "hapticFeedback", "Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;", "getHapticFeedback", "()Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;", "setHapticFeedback", "(Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;)V", "headTurnGuidanceViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "getHeadTurnGuidanceViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;", "setHeadTurnGuidanceViewModel", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/headturn/HeadTurnGuidanceViewModel;)V", "isCameraXEnabled", "", "()Z", "isCameraXEnabled$delegate", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "motionFaceDetectorFactory", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/MotionFaceDetectorFactory;", "getMotionFaceDetectorFactory", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/MotionFaceDetectorFactory;", "setMotionFaceDetectorFactory", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/facedetector/MotionFaceDetectorFactory;)V", "motionHostViewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "getMotionHostViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/host/MotionHostViewModel;", "motionHostViewModel$delegate", "motionOptions", "Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "getMotionOptions", "()Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;", "setMotionOptions", "(Lcom/onfido/android/sdk/capture/ui/options/MotionCaptureVariantOptions;)V", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "getSchedulersProvider", "()Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "setSchedulersProvider", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "shouldUseMlKit", "getShouldUseMlKit", "shouldUseMlKit$delegate", "viewModel", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel;", "setViewModel", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel;)V", "viewModelFactory", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl$Factory;", "getViewModelFactory", "()Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl$Factory;", "setViewModelFactory", "(Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModelImpl$Factory;)V", "announceCameraInUse", "", "enableToolbarBackNavigation", "supportActionBar", "Landroidx/appcompat/app/ActionBar;", "getOvalRect", "Lcom/onfido/android/sdk/capture/internal/util/OnfidoRectF;", "handleErrorStates", "it", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/viewmodel/MotionCaptureViewModel$ViewState$Error;", "handleFaceAlignmentFeedback", "feedback", "handleFaceAlignmentFeedbackAccessibility", "handleTestEnvInFaceAlignment", "handleTestEnvInRecordingStarted", "hideFaceAlignmentFeedback", "observeDetectedFace", "observeFaceAlignmentFeedback", "observeFaceAlignmentFeedbackAccessibility", "observeViewState", "onDestroy", "onDestroyView", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onWorkflowToolbarUpdated", "setColorsForCaptureScreen", "setupToolbar", "shouldObserveAccessibilityFaceAlignmentFeedback", "showAlertDialog", "titleResId", "messageResId", "positiveButtonResId", "positiveButtonAction", "Lkotlin/Function0;", "showFaceAlignmentFeedback", "resId", "showRecordingIsTooShortDialog", "action", "showRecordingTimeoutDialog", "startCamera", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MotionCaptureFragment extends Fragment implements WorkflowToolbarUpdateListener {
    public static final long DELAY_FINISH_RECORDING_MILLISECONDS = 1000;
    private static final long DELAY_FLOW_COMPLETED_MILLISECONDS = 2000;
    public static final long DELAY_START_RECORDING_MILLISECONDS = 1000;
    private OnfidoFragmentMotionCaptureBinding _binding;

    @NotNull
    private final Map<FaceAlignmentFeedback, Integer> accessibilityAnnouncementMap;
    public OnfidoAnalytics analytics;
    public AnnouncementService announcementService;
    private MotionCameraController cameraController;
    public MotionCameraControllerFactory cameraControllerFactory;

    /* JADX INFO: renamed from: captureComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy captureComponent;

    @NotNull
    private final CompositeDisposable compositeDisposable;
    public AvcTimer delayStartRecordingTimer;
    public AvcTimer delayTimer;
    private FaceDetectorAvc faceDetectorAvc;
    public FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl;
    public HapticFeedback hapticFeedback;
    public HeadTurnGuidanceViewModel headTurnGuidanceViewModel;

    /* JADX INFO: renamed from: isCameraXEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isCameraXEnabled;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    public MotionFaceDetectorFactory motionFaceDetectorFactory;

    /* JADX INFO: renamed from: motionHostViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy motionHostViewModel;
    public MotionCaptureVariantOptions motionOptions;
    public SchedulersProvider schedulersProvider;

    /* JADX INFO: renamed from: shouldUseMlKit$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shouldUseMlKit;
    public MotionCaptureViewModel viewModel;
    public MotionCaptureViewModelImpl.Factory viewModelFactory;

    @NotNull
    private static final String KEY_IS_CAMERA_X_ENABLED = "is_camera_x_enabled";

    @NotNull
    private static final String KEY_SHOULD_USE_MLKIT = "should_use_mlkit";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/MotionCaptureFragment$Companion;", "", "()V", "DELAY_FINISH_RECORDING_MILLISECONDS", "", "DELAY_FLOW_COMPLETED_MILLISECONDS", "DELAY_START_RECORDING_MILLISECONDS", "KEY_IS_CAMERA_X_ENABLED", "", "KEY_SHOULD_USE_MLKIT", "createInstance", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/MotionCaptureFragment;", "shouldUseMlKit", "", "isCameraXEnabled", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final MotionCaptureFragment createInstance(boolean shouldUseMlKit, boolean isCameraXEnabled) {
            MotionCaptureFragment motionCaptureFragment = new MotionCaptureFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_use_mlkit", shouldUseMlKit);
            bundle.putBoolean("is_camera_x_enabled", isCameraXEnabled);
            motionCaptureFragment.setArguments(bundle);
            return motionCaptureFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleErrorStates$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3674invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3674invoke() {
            MotionCaptureFragment.this.getViewModel().onMicIsNotAvailableAlertDialogDismissed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleErrorStates$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function0<Unit> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3675invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3675invoke() {
            MotionCaptureFragment.this.getViewModel().onAudioConflictAlertDialogDismissed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleErrorStates$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function0<Unit> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3676invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3676invoke() {
            MotionCaptureFragment.this.getViewModel().onRecordingIsTooShortAlertDialogDismissed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleErrorStates$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function0<Unit> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3677invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3677invoke() {
            MotionCaptureFragment.this.getViewModel().onRecordingTimeoutAlertDialogDismissed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleTestEnvInFaceAlignment$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleTestEnvInFaceAlignment$1", f = "MotionCaptureFragment.kt", l = {340}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19741 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19741(Continuation<? super C19741> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return MotionCaptureFragment.this.new C19741(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                this.label = 1;
                if (k0.b(2000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            MotionCaptureFragment.this.getFaceDetectorAvcResultMapperTestImpl().alignFace(MotionCaptureFragment.this.getOvalRect());
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19741) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleTestEnvInRecordingStarted$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$handleTestEnvInRecordingStarted$1", f = "MotionCaptureFragment.kt", l = {350, 352}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19751 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C19751(Continuation<? super C19751> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return MotionCaptureFragment.this.new C19751(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (skm.k0.b(1500, r5) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L44
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L2a
            L1c:
                yhm.o.b(r6)
                r5.label = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = skm.k0.b(r3, r5)
                if (r6 != r0) goto L2a
                goto L43
            L2a:
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment r6 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.this
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl r6 = r6.getFaceDetectorAvcResultMapperTestImpl()
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment r1 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.this
                com.onfido.android.sdk.capture.internal.util.OnfidoRectF r1 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.access$getOvalRect(r1)
                r6.completeLeftTurn(r1)
                r5.label = r2
                r1 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r6 = skm.k0.b(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment r6 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.this
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcResultMapperTestImpl r6 = r6.getFaceDetectorAvcResultMapperTestImpl()
                com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment r0 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.this
                com.onfido.android.sdk.capture.internal.util.OnfidoRectF r0 = com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.access$getOvalRect(r0)
                r6.completeRightTurn(r0)
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.C19751.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19751) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$isCameraXEnabled$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19762 extends u implements Function0<Boolean> {
        public C19762() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(MotionCaptureFragment.this.requireArguments().getBoolean("is_camera_x_enabled"));
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$showAlertDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19801 extends u implements Function1<DialogInterface, Unit> {
        final /* synthetic */ Function0<Unit> $positiveButtonAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19801(Function0<Unit> function0) {
            super(1);
            this.$positiveButtonAction = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
            this.$positiveButtonAction.invoke();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$startCamera$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C19811 extends u implements Function0<Unit> {
        public C19811() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3681invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3681invoke() {
            MotionCaptureFragment.this.getViewModel().initialize(MotionCaptureFragment.this.getOvalRect());
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$startCamera$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C19822 extends q implements Function1<Throwable, Unit> {
        public C19822(Object obj2) {
            super(1, 0, MotionHostViewModel.class, obj2, "onError", "onError(Ljava/lang/Throwable;)V");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Throwable) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MotionHostViewModel) this.receiver).onError(p0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MotionCaptureFragment() {
        super(R.layout.onfido_fragment_motion_capture);
        Lazy lazyC = j.c(k.NONE, new MotionCaptureFragment$special$$inlined$viewModels$default$1(new MotionCaptureFragment$motionHostViewModel$2(this)));
        this.motionHostViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(MotionHostViewModel.class), new MotionCaptureFragment$special$$inlined$viewModels$default$2(lazyC), new MotionCaptureFragment$special$$inlined$viewModels$default$3(null, lazyC), new MotionCaptureFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.compositeDisposable = new CompositeDisposable();
        this.shouldUseMlKit = j.b(new MotionCaptureFragment$shouldUseMlKit$2(this));
        this.isCameraXEnabled = j.b(new C19762());
        this.captureComponent = j.b(new MotionCaptureFragment$captureComponent$2(this));
        this.accessibilityAnnouncementMap = r0.k(new Pair(FaceAlignmentFeedback.Idle.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_title_accessibility)), new Pair(FaceAlignmentFeedback.MoveDeviceLeft.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_left_accessibility)), new Pair(FaceAlignmentFeedback.MoveDeviceRight.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_right_accessibility)), new Pair(FaceAlignmentFeedback.MoveDeviceDown.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_down_accessibility)), new Pair(FaceAlignmentFeedback.MoveDeviceUp.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_up_accessibility)), new Pair(FaceAlignmentFeedback.MoveBack.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_back_accessibility)), new Pair(FaceAlignmentFeedback.MoveCloser.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_move_closer_accessibility)), new Pair(FaceAlignmentFeedback.FaceNotDetected.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_no_face_detected_accessibility)), new Pair(FaceAlignmentFeedback.FaceAligned.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_face_aligned_accessibility)), new Pair(FaceAlignmentFeedback.FaceNotCentered.INSTANCE, Integer.valueOf(R.string.onfido_avc_face_alignment_feedback_face_misaligned_accessibility)));
    }

    private final void announceCameraInUse() {
        getAnnouncementService().announceStringAsync(new int[]{R.string.onfido_avc_face_capture_frame_accessibility}, true);
    }

    private final void enableToolbarBackNavigation(ActionBar supportActionBar) {
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        if (supportActionBar != null) {
            supportActionBar.setHomeActionContentDescription(R.string.onfido_generic_back);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentMotionCaptureBinding getBinding() {
        OnfidoFragmentMotionCaptureBinding onfidoFragmentMotionCaptureBinding = this._binding;
        Intrinsics.h(onfidoFragmentMotionCaptureBinding);
        return onfidoFragmentMotionCaptureBinding;
    }

    private final MotionCaptureComponent getCaptureComponent() {
        return (MotionCaptureComponent) this.captureComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MotionHostViewModel getMotionHostViewModel() {
        return (MotionHostViewModel) this.motionHostViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoRectF getOvalRect() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        WindowSizeClass windowSizeClass = WindowHelperKt.getWindowSizeClass(contextRequireContext);
        FrameLayout frameLayout = getBinding().previewContainer;
        return OvalRect.INSTANCE.get(frameLayout.getWidth(), frameLayout.getHeight(), windowSizeClass);
    }

    private final boolean getShouldUseMlKit() {
        return ((Boolean) this.shouldUseMlKit.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleErrorStates(MotionCaptureViewModel.ViewState.Error it8) {
        if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Error.MicIsNotAvailable.INSTANCE)) {
            showAlertDialog(R.string.onfido_avc_face_capture_alert_mic_conflict_title, R.string.onfido_avc_face_capture_alert_mic_conflict_body, R.string.onfido_avc_face_capture_alert_mic_conflict_button_primary, new AnonymousClass1());
            return;
        }
        if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Error.AudioConflict.INSTANCE)) {
            showAlertDialog(R.string.onfido_avc_face_capture_alert_audio_conflict_title, R.string.onfido_avc_face_capture_alert_audio_conflict_body, R.string.onfido_avc_face_capture_alert_audio_conflict_button_primary, new AnonymousClass2());
            return;
        }
        if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Error.FaceAlignmentTimeout.INSTANCE)) {
            getMotionHostViewModel().getNavigator().replace(MotionNoFaceDetectedScreen.INSTANCE);
            return;
        }
        if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Error.RecordingIsTooShort.INSTANCE)) {
            HapticFeedback hapticFeedback = getHapticFeedback();
            HeadTurnCompletedView headTurnCompletedView = getBinding().headTurnCompletedView;
            Intrinsics.checkNotNullExpressionValue(headTurnCompletedView, "headTurnCompletedView");
            hapticFeedback.performError(headTurnCompletedView);
            showRecordingIsTooShortDialog(new AnonymousClass3());
            return;
        }
        if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Error.RecordingTimeout.INSTANCE)) {
            showRecordingTimeoutDialog(new AnonymousClass4());
        } else if (it8 instanceof MotionCaptureViewModel.ViewState.Error.RecordingFailed) {
            getMotionHostViewModel().onError(((MotionCaptureViewModel.ViewState.Error.RecordingFailed) it8).getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFaceAlignmentFeedback(FaceAlignmentFeedback feedback) {
        int i;
        if (Intrinsics.f(feedback, FaceAlignmentFeedback.MoveBack.INSTANCE)) {
            i = R.string.onfido_avc_face_alignment_feedback_move_back;
        } else if (Intrinsics.f(feedback, FaceAlignmentFeedback.MoveCloser.INSTANCE)) {
            i = R.string.onfido_avc_face_alignment_feedback_move_closer;
        } else if (Intrinsics.f(feedback, FaceAlignmentFeedback.FaceNotCentered.INSTANCE)) {
            i = R.string.onfido_avc_face_alignment_feedback_not_centered;
        } else {
            if (!Intrinsics.f(feedback, FaceAlignmentFeedback.FaceNotDetected.INSTANCE)) {
                if (Intrinsics.f(feedback, FaceAlignmentFeedback.FaceAligned.INSTANCE)) {
                    hideFaceAlignmentFeedback();
                    return;
                }
                return;
            }
            i = R.string.onfido_avc_face_alignment_feedback_no_face_detected;
        }
        showFaceAlignmentFeedback(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFaceAlignmentFeedbackAccessibility(FaceAlignmentFeedback feedback) {
        Integer num = this.accessibilityAnnouncementMap.get(feedback);
        if (num != null) {
            getAnnouncementService().announceStringAsync(new int[]{num.intValue()}, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTestEnvInFaceAlignment() {
        if (getMotionOptions().isTestEnv()) {
            e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19741(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTestEnvInRecordingStarted() {
        if (getMotionOptions().isTestEnv()) {
            e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C19751(null), 3);
        }
    }

    private final void hideFaceAlignmentFeedback() {
        FeedbackLabelView feedbackLabelView = getBinding().feedbackLabelView;
        Intrinsics.checkNotNullExpressionValue(feedbackLabelView, "feedbackLabelView");
        ViewExtensionsKt.hideWithAlphaAnim$default(feedbackLabelView, BitmapDescriptorFactory.HUE_RED, 0L, 3, null);
    }

    private final boolean isCameraXEnabled() {
        return ((Boolean) this.isCameraXEnabled.getValue()).booleanValue();
    }

    private final void observeDetectedFace() {
    }

    private final void observeFaceAlignmentFeedback() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getViewModel().getFaceAlignmentFeedback().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.observeFaceAlignmentFeedback.1
            @Override // igm.g
            public final void accept(@NotNull FaceAlignmentFeedback p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                MotionCaptureFragment.this.handleFaceAlignmentFeedback(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeFaceAlignmentFeedbackAccessibility() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getViewModel().getFaceAlignmentFeedbackAccessibility().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.observeFaceAlignmentFeedbackAccessibility.1
            @Override // igm.g
            public final void accept(@NotNull FaceAlignmentFeedback p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                MotionCaptureFragment.this.handleFaceAlignmentFeedbackAccessibility(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeViewState() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getViewModel().getViewState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment.observeViewState.1

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$observeViewState$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass2 extends u implements Function0<Unit> {
                final /* synthetic */ MotionCaptureFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(MotionCaptureFragment motionCaptureFragment) {
                    super(0);
                    this.this$0 = motionCaptureFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3678invoke();
                    return Unit.f186387a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3678invoke() {
                    this.this$0.getViewModel().startRecording();
                }
            }

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$observeViewState$1$4, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass4 extends u implements Function0<Unit> {
                final /* synthetic */ MotionCaptureFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(MotionCaptureFragment motionCaptureFragment) {
                    super(0);
                    this.this$0 = motionCaptureFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3679invoke();
                    return Unit.f186387a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3679invoke() {
                    this.this$0.getViewModel().finishRecording();
                }
            }

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment$observeViewState$1$6, reason: invalid class name */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class AnonymousClass6 extends u implements Function0<Unit> {
                final /* synthetic */ MotionCaptureFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(MotionCaptureFragment motionCaptureFragment) {
                    super(0);
                    this.this$0 = motionCaptureFragment;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m3680invoke();
                    return Unit.f186387a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m3680invoke() {
                    this.this$0.getViewModel().completeFlow();
                }
            }

            @Override // igm.g
            public final void accept(@NotNull MotionCaptureViewModel.ViewState it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.FaceNotPresent.INSTANCE) ? true : Intrinsics.f(it8, MotionCaptureViewModel.ViewState.FaceAlignment.INSTANCE)) {
                    MotionCaptureFragment.this.getDelayStartRecordingTimer().cancel();
                    OnfidoFragmentMotionCaptureBinding binding = MotionCaptureFragment.this.getBinding();
                    FaceAlignmentView faceAlignmentView = binding.faceAlignmentView;
                    Intrinsics.checkNotNullExpressionValue(faceAlignmentView, "faceAlignmentView");
                    ViewExtensionsKt.toVisible$default(faceAlignmentView, false, 1, null);
                    binding.headTurnGuidanceView.hide();
                    HeadTurnCompletedView headTurnCompletedView = binding.headTurnCompletedView;
                    Intrinsics.checkNotNullExpressionValue(headTurnCompletedView, "headTurnCompletedView");
                    ViewExtensionsKt.toGone$default(headTurnCompletedView, false, 1, null);
                    MotionCaptureFragment.this.handleTestEnvInFaceAlignment();
                    return;
                }
                if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.DelayStartRecording.INSTANCE)) {
                    MotionCaptureFragment.this.getDelayStartRecordingTimer().start(1000L, new AnonymousClass2(MotionCaptureFragment.this));
                    return;
                }
                if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.RecordingStarted.INSTANCE)) {
                    HapticFeedback hapticFeedback = MotionCaptureFragment.this.getHapticFeedback();
                    HeadTurnGuidanceView headTurnGuidanceView = MotionCaptureFragment.this.getBinding().headTurnGuidanceView;
                    Intrinsics.checkNotNullExpressionValue(headTurnGuidanceView, "headTurnGuidanceView");
                    hapticFeedback.performTap(headTurnGuidanceView);
                    MotionCaptureFragment.this.getAnnouncementService().announceStringAsync(new int[]{R.string.onfido_avc_face_capture_recording_started_accessibility, R.string.onfido_avc_face_capture_title_accessibility}, true);
                    OnfidoFragmentMotionCaptureBinding binding2 = MotionCaptureFragment.this.getBinding();
                    FaceAlignmentView faceAlignmentView2 = binding2.faceAlignmentView;
                    Intrinsics.checkNotNullExpressionValue(faceAlignmentView2, "faceAlignmentView");
                    ViewExtensionsKt.toGone$default(faceAlignmentView2, false, 1, null);
                    RectDebuggingView faceRectDebuggingView = binding2.faceRectDebuggingView;
                    Intrinsics.checkNotNullExpressionValue(faceRectDebuggingView, "faceRectDebuggingView");
                    ViewExtensionsKt.toGone$default(faceRectDebuggingView, false, 1, null);
                    TextView faceYawAngleDebuggingView = binding2.faceYawAngleDebuggingView;
                    Intrinsics.checkNotNullExpressionValue(faceYawAngleDebuggingView, "faceYawAngleDebuggingView");
                    ViewExtensionsKt.toGone$default(faceYawAngleDebuggingView, false, 1, null);
                    binding2.headTurnGuidanceView.show();
                    MotionCaptureFragment.this.handleTestEnvInRecordingStarted();
                    return;
                }
                if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.DelayFinishRecording.INSTANCE)) {
                    MotionCaptureFragment.this.getDelayTimer().start(1000L, new AnonymousClass4(MotionCaptureFragment.this));
                    return;
                }
                if (Intrinsics.f(it8, MotionCaptureViewModel.ViewState.RecordingFinished.INSTANCE)) {
                    OnfidoFragmentMotionCaptureBinding binding3 = MotionCaptureFragment.this.getBinding();
                    binding3.headTurnGuidanceView.hide();
                    HeadTurnCompletedView headTurnCompletedView2 = binding3.headTurnCompletedView;
                    Intrinsics.checkNotNullExpressionValue(headTurnCompletedView2, "headTurnCompletedView");
                    ViewExtensionsKt.toVisible$default(headTurnCompletedView2, false, 1, null);
                    MotionCaptureFragment.this.getDelayTimer().start(2000L, new AnonymousClass6(MotionCaptureFragment.this));
                    MotionCaptureFragment.this.getAnnouncementService().announceStringAsync(new int[]{R.string.onfido_avc_face_capture_title_completed}, true);
                    return;
                }
                if (!Intrinsics.f(it8, MotionCaptureViewModel.ViewState.Completed.INSTANCE)) {
                    if (it8 instanceof MotionCaptureViewModel.ViewState.Error) {
                        MotionCaptureFragment.this.handleErrorStates((MotionCaptureViewModel.ViewState.Error) it8);
                    }
                } else {
                    Navigator navigator = MotionCaptureFragment.this.getMotionHostViewModel().getNavigator();
                    MotionCameraController motionCameraController = MotionCaptureFragment.this.cameraController;
                    if (motionCameraController != null) {
                        navigator.replace(new MotionUploadScreen(motionCameraController.getVideoFilePath()));
                    } else {
                        Intrinsics.r("cameraController");
                        throw null;
                    }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void setColorsForCaptureScreen() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Toolbar avcCaptureToolbar = getBinding().avcCaptureToolbar;
        Intrinsics.checkNotNullExpressionValue(avcCaptureToolbar, "avcCaptureToolbar");
        int iColorFromAttr = ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorToolbarBackgroundDark);
        int iColorFromAttr2 = ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorContentToolbarTitleDark);
        int iColorFromAttr3 = ContextUtilsKt.colorFromAttr(context, R.attr.onfidoColorToolbarIconDark);
        avcCaptureToolbar.setBackgroundColor(iColorFromAttr);
        avcCaptureToolbar.setTitleTextColor(iColorFromAttr2);
        Drawable navigationIcon = avcCaptureToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setColorFilter(iColorFromAttr3, PorterDuff.Mode.SRC_ATOP);
        }
        avcCaptureToolbar.post(new b(avcCaptureToolbar, iColorFromAttr3, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setColorsForCaptureScreen$lambda$0(Toolbar toolbar, int i) {
        Drawable icon;
        Intrinsics.checkNotNullParameter(toolbar, "$toolbar");
        MenuItem menuItemFindItem = toolbar.getMenu().findItem(R.id.action_exit_flow);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        icon.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    private final void setupToolbar() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        appCompatActivity.setSupportActionBar(getBinding().avcCaptureToolbar);
        ActionBar supportActionBar2 = appCompatActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setTitle("");
        }
        enableToolbarBackNavigation(appCompatActivity.getSupportActionBar());
        setColorsForCaptureScreen();
    }

    private final boolean shouldObserveAccessibilityFaceAlignmentFeedback() {
        return getAnnouncementService().isEnabled();
    }

    private final void showAlertDialog(int titleResId, int messageResId, int positiveButtonResId, Function0<Unit> positiveButtonAction) {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(titleResId), messageResId, positiveButtonResId, (Integer) null, false, (Function1) null, (Function1) new C19801(positiveButtonAction), 56, (Object) null);
    }

    private final void showFaceAlignmentFeedback(int resId) {
        FeedbackLabelView feedbackLabelView = getBinding().feedbackLabelView;
        Intrinsics.h(feedbackLabelView);
        ViewExtensionsKt.showWithAlphaAnim$default(feedbackLabelView, BitmapDescriptorFactory.HUE_RED, 0L, 3, null);
        String string = feedbackLabelView.getContext().getString(resId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        feedbackLabelView.setText(string);
    }

    private final void showRecordingIsTooShortDialog(Function0<Unit> action) {
        showAlertDialog(R.string.onfido_avc_face_capture_alert_too_fast_title, R.string.onfido_avc_face_capture_alert_too_fast_body, R.string.onfido_avc_face_capture_alert_too_fast_button_primary, action);
    }

    private final void showRecordingTimeoutDialog(Function0<Unit> action) {
        showAlertDialog(R.string.onfido_avc_face_capture_alert_timeout_title, R.string.onfido_avc_face_capture_alert_timeout_body, R.string.onfido_avc_face_capture_alert_timeout_button_primary, action);
    }

    private final void startCamera() {
        if (getViewModel().isCompletedState()) {
            return;
        }
        MotionCameraController motionCameraController = this.cameraController;
        if (motionCameraController != null) {
            motionCameraController.start(new C19811(), new C19822(getMotionHostViewModel()));
        } else {
            Intrinsics.r("cameraController");
            throw null;
        }
    }

    @NotNull
    public final OnfidoAnalytics getAnalytics() {
        OnfidoAnalytics onfidoAnalytics = this.analytics;
        if (onfidoAnalytics != null) {
            return onfidoAnalytics;
        }
        Intrinsics.r("analytics");
        throw null;
    }

    @NotNull
    public final AnnouncementService getAnnouncementService() {
        AnnouncementService announcementService = this.announcementService;
        if (announcementService != null) {
            return announcementService;
        }
        Intrinsics.r("announcementService");
        throw null;
    }

    @NotNull
    public final MotionCameraControllerFactory getCameraControllerFactory() {
        MotionCameraControllerFactory motionCameraControllerFactory = this.cameraControllerFactory;
        if (motionCameraControllerFactory != null) {
            return motionCameraControllerFactory;
        }
        Intrinsics.r("cameraControllerFactory");
        throw null;
    }

    @NotNull
    public final AvcTimer getDelayStartRecordingTimer() {
        AvcTimer avcTimer = this.delayStartRecordingTimer;
        if (avcTimer != null) {
            return avcTimer;
        }
        Intrinsics.r("delayStartRecordingTimer");
        throw null;
    }

    @NotNull
    public final AvcTimer getDelayTimer() {
        AvcTimer avcTimer = this.delayTimer;
        if (avcTimer != null) {
            return avcTimer;
        }
        Intrinsics.r("delayTimer");
        throw null;
    }

    @NotNull
    public final FaceDetectorAvcResultMapperTestImpl<Object> getFaceDetectorAvcResultMapperTestImpl() {
        FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl = this.faceDetectorAvcResultMapperTestImpl;
        if (faceDetectorAvcResultMapperTestImpl != null) {
            return faceDetectorAvcResultMapperTestImpl;
        }
        Intrinsics.r("faceDetectorAvcResultMapperTestImpl");
        throw null;
    }

    @NotNull
    public final HapticFeedback getHapticFeedback() {
        HapticFeedback hapticFeedback = this.hapticFeedback;
        if (hapticFeedback != null) {
            return hapticFeedback;
        }
        Intrinsics.r("hapticFeedback");
        throw null;
    }

    @NotNull
    public final HeadTurnGuidanceViewModel getHeadTurnGuidanceViewModel() {
        HeadTurnGuidanceViewModel headTurnGuidanceViewModel = this.headTurnGuidanceViewModel;
        if (headTurnGuidanceViewModel != null) {
            return headTurnGuidanceViewModel;
        }
        Intrinsics.r("headTurnGuidanceViewModel");
        throw null;
    }

    @NotNull
    public final MotionFaceDetectorFactory getMotionFaceDetectorFactory() {
        MotionFaceDetectorFactory motionFaceDetectorFactory = this.motionFaceDetectorFactory;
        if (motionFaceDetectorFactory != null) {
            return motionFaceDetectorFactory;
        }
        Intrinsics.r("motionFaceDetectorFactory");
        throw null;
    }

    @NotNull
    public final MotionCaptureVariantOptions getMotionOptions() {
        MotionCaptureVariantOptions motionCaptureVariantOptions = this.motionOptions;
        if (motionCaptureVariantOptions != null) {
            return motionCaptureVariantOptions;
        }
        Intrinsics.r("motionOptions");
        throw null;
    }

    @NotNull
    public final SchedulersProvider getSchedulersProvider() {
        SchedulersProvider schedulersProvider = this.schedulersProvider;
        if (schedulersProvider != null) {
            return schedulersProvider;
        }
        Intrinsics.r("schedulersProvider");
        throw null;
    }

    @NotNull
    public final MotionCaptureViewModel getViewModel() {
        MotionCaptureViewModel motionCaptureViewModel = this.viewModel;
        if (motionCaptureViewModel != null) {
            return motionCaptureViewModel;
        }
        Intrinsics.r("viewModel");
        throw null;
    }

    @NotNull
    public final MotionCaptureViewModelImpl.Factory getViewModelFactory() {
        MotionCaptureViewModelImpl.Factory factory = this.viewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("viewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        getViewModel().onDestroy();
        MotionCaptureComponentHolder.INSTANCE.getInstance().onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getMotionHostViewModel().hasPermissions()) {
            startCamera();
        } else {
            getMotionHostViewModel().restorePermissions();
        }
        observeViewState();
        observeFaceAlignmentFeedback();
        if (shouldObserveAccessibilityFaceAlignmentFeedback()) {
            announceCameraInUse();
            observeFaceAlignmentFeedbackAccessibility();
        }
        observeDetectedFace();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.lifecycleAwareDialog.dismiss();
        hideFaceAlignmentFeedback();
        getDelayStartRecordingTimer().cancel();
        getDelayTimer().cancel();
        this.compositeDisposable.d();
        getViewModel().onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getCaptureComponent().inject(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentMotionCaptureBinding.bind(view);
        this.faceDetectorAvc = getMotionFaceDetectorFactory().create(getShouldUseMlKit());
        MotionCameraControllerFactory cameraControllerFactory = getCameraControllerFactory();
        boolean audioEnabled = getMotionHostViewModel().getAudioEnabled();
        boolean zIsCameraXEnabled = isCameraXEnabled();
        CameraViewfinder camera2PreviewView = getBinding().camera2PreviewView;
        Intrinsics.checkNotNullExpressionValue(camera2PreviewView, "camera2PreviewView");
        PreviewView cameraXPreviewView = getBinding().cameraXPreviewView;
        Intrinsics.checkNotNullExpressionValue(cameraXPreviewView, "cameraXPreviewView");
        FaceDetectorAvc faceDetectorAvc = this.faceDetectorAvc;
        if (faceDetectorAvc == null) {
            Intrinsics.r("faceDetectorAvc");
            throw null;
        }
        this.cameraController = cameraControllerFactory.create(this, audioEnabled, zIsCameraXEnabled, camera2PreviewView, cameraXPreviewView, faceDetectorAvc);
        MotionCaptureViewModelImpl.Factory viewModelFactory = getViewModelFactory();
        boolean audioEnabled2 = getMotionHostViewModel().getAudioEnabled();
        MotionCameraController motionCameraController = this.cameraController;
        if (motionCameraController == null) {
            Intrinsics.r("cameraController");
            throw null;
        }
        FaceDetectorAvc faceDetectorAvc2 = this.faceDetectorAvc;
        if (faceDetectorAvc2 == null) {
            Intrinsics.r("faceDetectorAvc");
            throw null;
        }
        setViewModel(viewModelFactory.create(audioEnabled2, motionCameraController, faceDetectorAvc2));
        setupToolbar();
        getBinding().headTurnGuidanceView.initialize(getHeadTurnGuidanceViewModel(), getHapticFeedback(), getAnnouncementService());
        getViewModel().trackScreenAnalyticsEvent();
    }

    @Override // com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener
    public void onWorkflowToolbarUpdated() {
        setColorsForCaptureScreen();
    }

    public final void setAnalytics(@NotNull OnfidoAnalytics onfidoAnalytics) {
        Intrinsics.checkNotNullParameter(onfidoAnalytics, "<set-?>");
        this.analytics = onfidoAnalytics;
    }

    public final void setAnnouncementService(@NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(announcementService, "<set-?>");
        this.announcementService = announcementService;
    }

    public final void setCameraControllerFactory(@NotNull MotionCameraControllerFactory motionCameraControllerFactory) {
        Intrinsics.checkNotNullParameter(motionCameraControllerFactory, "<set-?>");
        this.cameraControllerFactory = motionCameraControllerFactory;
    }

    public final void setDelayStartRecordingTimer(@NotNull AvcTimer avcTimer) {
        Intrinsics.checkNotNullParameter(avcTimer, "<set-?>");
        this.delayStartRecordingTimer = avcTimer;
    }

    public final void setDelayTimer(@NotNull AvcTimer avcTimer) {
        Intrinsics.checkNotNullParameter(avcTimer, "<set-?>");
        this.delayTimer = avcTimer;
    }

    public final void setFaceDetectorAvcResultMapperTestImpl(@NotNull FaceDetectorAvcResultMapperTestImpl<Object> faceDetectorAvcResultMapperTestImpl) {
        Intrinsics.checkNotNullParameter(faceDetectorAvcResultMapperTestImpl, "<set-?>");
        this.faceDetectorAvcResultMapperTestImpl = faceDetectorAvcResultMapperTestImpl;
    }

    public final void setHapticFeedback(@NotNull HapticFeedback hapticFeedback) {
        Intrinsics.checkNotNullParameter(hapticFeedback, "<set-?>");
        this.hapticFeedback = hapticFeedback;
    }

    public final void setHeadTurnGuidanceViewModel(@NotNull HeadTurnGuidanceViewModel headTurnGuidanceViewModel) {
        Intrinsics.checkNotNullParameter(headTurnGuidanceViewModel, "<set-?>");
        this.headTurnGuidanceViewModel = headTurnGuidanceViewModel;
    }

    public final void setMotionFaceDetectorFactory(@NotNull MotionFaceDetectorFactory motionFaceDetectorFactory) {
        Intrinsics.checkNotNullParameter(motionFaceDetectorFactory, "<set-?>");
        this.motionFaceDetectorFactory = motionFaceDetectorFactory;
    }

    public final void setMotionOptions(@NotNull MotionCaptureVariantOptions motionCaptureVariantOptions) {
        Intrinsics.checkNotNullParameter(motionCaptureVariantOptions, "<set-?>");
        this.motionOptions = motionCaptureVariantOptions;
    }

    public final void setSchedulersProvider(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "<set-?>");
        this.schedulersProvider = schedulersProvider;
    }

    public final void setViewModel(@NotNull MotionCaptureViewModel motionCaptureViewModel) {
        Intrinsics.checkNotNullParameter(motionCaptureViewModel, "<set-?>");
        this.viewModel = motionCaptureViewModel;
    }

    public final void setViewModelFactory(@NotNull MotionCaptureViewModelImpl.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }
}
