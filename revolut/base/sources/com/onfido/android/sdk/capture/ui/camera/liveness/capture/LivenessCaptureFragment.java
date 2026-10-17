package com.onfido.android.sdk.capture.ui.camera.liveness.capture;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.view.OnBackPressedCallback;
import au0.b2;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoDummyAccessibilityViewBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentLivenessCaptureBinding;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionRect;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.BaseActivity;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.FaceDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.Frame;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotAvailableException;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotFoundException;
import com.onfido.android.sdk.capture.ui.camera.exception.InvalidCertificateException;
import com.onfido.android.sdk.capture.ui.camera.exception.TokenExpiredException;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView;
import com.onfido.android.sdk.capture.ui.camera.util.CameraPermissionsUtils;
import com.onfido.android.sdk.capture.ui.camera.util.LivenessCaptureLayoutAdjuster;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.FileUtils;
import com.onfido.android.sdk.capture.utils.FragmentExtentionsKt;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.android.sdk.capture.utils.StringRepresentation;
import com.onfido.android.sdk.capture.utils.ToolbarExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewUtil;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import com.onfido.javax.inject.Provider;
import fim.a;
import gim.d;
import gim.i;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
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
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.k0;
import yhm.j;
import yhm.k;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 Ù\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ù\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u0007J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u0007J\u000f\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b%\u0010\u0007J\u000f\u0010&\u001a\u00020\fH\u0016¢\u0006\u0004\b&\u0010\u0007J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0007J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0007J\u0019\u00107\u001a\u00020\f2\b\b\u0001\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0002¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010\u0007J\u0017\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010\u0007J\u000f\u0010@\u001a\u00020\fH\u0002¢\u0006\u0004\b@\u0010\u0007J\u000f\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bA\u0010\u0007J\u000f\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010\u0007J\u000f\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010\u0007J\u000f\u0010D\u001a\u00020\fH\u0002¢\u0006\u0004\bD\u0010\u0007J\u0017\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HJ\u001b\u0010L\u001a\u00020K*\u00020E2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010Q\u001a\u00020\f2\u0006\u0010N\u001a\u00020 2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010S\u001a\u00020KH\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u00020\f2\u000e\b\u0002\u0010W\u001a\b\u0012\u0004\u0012\u00020\f0VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020 H\u0002¢\u0006\u0004\b[\u0010#J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010b\u001a\u00020\f2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\fH\u0002¢\u0006\u0004\bd\u0010\u0007J\u0017\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020\f2\u0006\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u001b\u0010p\u001a\u00020\f2\n\u0010o\u001a\u00060mj\u0002`nH\u0002¢\u0006\u0004\bp\u0010qJ\u000f\u0010r\u001a\u00020\fH\u0002¢\u0006\u0004\br\u0010\u0007J\u0017\u0010u\u001a\u00020\f2\u0006\u0010t\u001a\u00020sH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\fH\u0002¢\u0006\u0004\bw\u0010\u0007J\u000f\u0010x\u001a\u00020\fH\u0002¢\u0006\u0004\bx\u0010\u0007J\u0017\u0010z\u001a\u00020\f2\u0006\u0010y\u001a\u000200H\u0002¢\u0006\u0004\bz\u00103J\u0017\u0010{\u001a\u00020\f2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b{\u00103J\u000f\u0010|\u001a\u00020\fH\u0002¢\u0006\u0004\b|\u0010\u0007J\u000f\u0010}\u001a\u00020\fH\u0002¢\u0006\u0004\b}\u0010\u0007JC\u0010\u0083\u0001\u001a\u00020\f2\u0006\u0010~\u001a\u0002052\u0006\u0010\u007f\u001a\u0002052\t\b\u0002\u0010\u0080\u0001\u001a\u0002052\u0014\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\f0\u0081\u0001H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R1\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0091\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R*\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R*\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¡\u0001\u001a\u00030 \u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010¨\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001c\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0019\u0010´\u0001\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010·\u0001\u001a\u00030¶\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0017\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0015\u0010¹\u0001R\u001b\u0010º\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001c\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010É\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Í\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010Ì\u0001R\u0016\u0010Ï\u0001\u001a\u00020-8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010/R\u0018\u0010Ò\u0001\u001a\u00030¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Õ\u0001\u001a\u00030Â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001R\u0017\u0010Ø\u0001\u001a\u0002058BX\u0082\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001¨\u0006Ú\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayView$ChallengesListener;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$Listener;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "Lcom/onfido/android/sdk/capture/utils/WorkflowToolbarUpdateListener;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetrics", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "showLivenessControlButtonWithAccessibilityEvent", "onErrorObservingHeadTurnResults", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "screenState", "onChallengeLoadingViewStateChanged", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;)V", "onLivenessChallengeFinished", "onChallengesErrorBackPressed", "", "message", "onInvalidCertificateDetected", "(Ljava/lang/String;)V", "onTokenExpired", "onVideoTimeoutExceeded", "onWorkflowToolbarUpdated", "setupUiElements", "(Landroid/view/View;)V", "setupObservers", "startTrackingLivenessCapture", "setOverlay", "setupOverlayView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "inflateOverlayView", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Landroid/graphics/RectF;", "captureRect", "setOverlayMargin", "(Landroid/graphics/RectF;)V", "setColorsForCaptureScreen", "", "color", "changeStatusBarColor", "(I)V", "startCamera", "onCameraStarted", "", "frame", "onNextFrame", "(Ljava/lang/Object;)V", "onCameraNotFound", "onCameraUnavailable", "hideLoading", "inflateCaptureButton", "showLivenessButtonAndFocusWithDelay", "hideLivenessControlButton", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "faceDetectionResult", "onFaceDetected", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;)V", "Lcom/onfido/android/sdk/capture/ui/camera/Frame;", "ovalFrame", "", "isInsideOval", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;Lcom/onfido/android/sdk/capture/ui/camera/Frame;)Z", "videoPath", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "performedChallenges", "showFaceLivenessConfirmationScreen", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;)V", "isStartedManually", "startLivenessVideoRecording", "(Z)V", "Lkotlin/Function0;", "videoRecordingStarted", "startVideoRecording", "(Lkotlin/jvm/functions/Function0;)V", "filePath", "onVideoCaptured", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "livenessChallengeViewModel", "onNextChallenge", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;)V", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "livenessChallengesViewModel", "onChallengesAvailable", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;)V", "onChallengesCompleted", "", "error", "onErrorTakingPicture", "(Ljava/lang/Throwable;)V", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureScreen$LivenessCaptureResult;", "result", "finishWithResult", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureScreen$LivenessCaptureResult;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "finishWithException", "(Ljava/lang/Exception;)V", "onFaceOutTimeout", "Landroid/content/DialogInterface;", "dialog", "onVideoTimeoutRetryClick", "(Landroid/content/DialogInterface;)V", "onStorageThresholdReached", "inflateDummyAccessibilityView", "visibleCaptureRect", "adjustDummyAccessibilityView", "setVideoRecordingIndicatorMargin", "setCaptureFrameContentDescriptionAndTitle", "removeViewsAccessibility", "titleResId", "messageResId", "positiveButtonResId", "Lkotlin/Function1;", "callback", "showDialog", "(IIILkotlin/jvm/functions/Function1;)V", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureViewModel;", "viewModelProvider", "Lcom/onfido/javax/inject/Provider;", "getViewModelProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/javax/inject/Provider;", "setViewModelProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/javax/inject/Provider;)V", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureViewModel;", "viewModel", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "cameraFactory", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "getCameraFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "setCameraFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;)V", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "vibratorService", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "getVibratorService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "setVibratorService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/VibratorService;)V", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentLivenessCaptureBinding;", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentLivenessCaptureBinding;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "recorder", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "isCameraViewInitialised", "Z", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "onfidoCamera", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "_overlayView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Lcom/onfido/android/sdk/capture/ui/widget/OnfidoButton;", "captureButton", "Lcom/onfido/android/sdk/capture/ui/widget/OnfidoButton;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "_dummyAccessibilityBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "Lcom/onfido/android/sdk/capture/ui/camera/util/LivenessCaptureLayoutAdjuster;", "_layoutAdjuster", "Lcom/onfido/android/sdk/capture/ui/camera/util/LivenessCaptureLayoutAdjuster;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "livenessChallengesLoadingView", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentLivenessCaptureBinding;", "binding", "getOverlayView", "overlayView", "getDummyAccessibilityBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "dummyAccessibilityBinding", "getLayoutAdjuster", "()Lcom/onfido/android/sdk/capture/ui/camera/util/LivenessCaptureLayoutAdjuster;", "layoutAdjuster", "getBackgroundColorCaptureScreen", "()I", "backgroundColorCaptureScreen", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessCaptureFragment extends BaseFragment implements LivenessOverlayView.ChallengesListener, LivenessChallengesLoadingView.Listener, OverlayView.Listener, WorkflowToolbarUpdateListener {
    private static final float FACE_DETECTION_OVAL_THRESHOLD_PERCENTAGE = 0.3f;
    private static final long LIVENESS_CHALLENGE_FINISHED_DELAY_MS = 500;
    private OnfidoFragmentLivenessCaptureBinding _binding;
    private OnfidoDummyAccessibilityViewBinding _dummyAccessibilityBinding;
    private LivenessCaptureLayoutAdjuster _layoutAdjuster;
    private OverlayView _overlayView;
    public AnnouncementService announcementService;
    public CameraFactory cameraFactory;
    private OnfidoButton captureButton;
    public ImageUtils imageUtils;
    private boolean isCameraViewInitialised;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    private LivenessChallengesLoadingView livenessChallengesLoadingView;
    private OnfidoCamera onfidoCamera;
    private OverlayMetrics overlayMetrics;
    private OnfidoCamera.VideoRecorder recorder;
    public VibratorService vibratorService;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public Provider viewModelProvider;

    @NotNull
    public static final String VIDEO_PATH = "video_path";

    @NotNull
    private static final String KEY_REQUEST = "key_request";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureFragment$Companion;", "", "()V", "FACE_DETECTION_OVAL_THRESHOLD_PERCENTAGE", "", "KEY_REQUEST", "", "LIVENESS_CHALLENGE_FINISHED_DELAY_MS", "", "VIDEO_PATH", "getVIDEO_PATH$annotations", "createInstance", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessCaptureFragment;", "requestKey", "createInstance$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @InternalOnfidoApi
        public static /* synthetic */ void getVIDEO_PATH$annotations() {
        }

        @NotNull
        public final LivenessCaptureFragment createInstance$onfido_capture_sdk_core_release(@NotNull String requestKey) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            LivenessCaptureFragment livenessCaptureFragment = new LivenessCaptureFragment();
            livenessCaptureFragment.setArguments(BundleKt.bundleOf(new Pair("key_request", requestKey)));
            return livenessCaptureFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onCameraNotFound$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<DialogInterface, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            LivenessCaptureFragment.this.finishWithException(CameraNotFoundException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onCameraUnavailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20961 extends u implements Function1<DialogInterface, Unit> {
        public C20961() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            LivenessCaptureFragment.this.finishWithException(CameraNotAvailableException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onErrorTakingPicture$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20971 extends u implements Function1<DialogInterface, Unit> {
        final /* synthetic */ Throwable $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20971(Throwable th10) {
            super(1);
            this.$error = th10;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            LivenessCaptureFragment livenessCaptureFragment = LivenessCaptureFragment.this;
            Throwable th10 = this.$error;
            Intrinsics.i(th10, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            livenessCaptureFragment.finishWithException((Exception) th10);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onFaceDetected$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onFaceDetected$1", f = "LivenessCaptureFragment.kt", l = {496, 497, 500}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20981 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20981(Continuation<? super C20981> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return LivenessCaptureFragment.this.new C20981(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        
            if (tz4.d.f(r7, r6) != r0) goto L21;
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
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                yhm.o.b(r7)
                goto L72
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                yhm.o.b(r7)
                goto L4c
            L1f:
                yhm.o.b(r7)
                goto L39
            L23:
                yhm.o.b(r7)
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.VibratorService r7 = r7.getVibratorService$onfido_capture_sdk_core_release()
                io.reactivex.rxjava3.core.Completable r7 = r7.vibrateForSuccess()
                r6.label = r3
                java.lang.Object r7 = tz4.d.f(r7, r6)
                if (r7 != r0) goto L39
                goto L71
            L39:
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r7 = r7.getAnnouncementService$onfido_capture_sdk_core_release()
                io.reactivex.rxjava3.core.Completable r7 = r7.interruptAnnouncement()
                r6.label = r4
                java.lang.Object r7 = tz4.d.f(r7, r6)
                if (r7 != r0) goto L4c
                goto L71
            L4c:
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r7 = r7.getAnnouncementService$onfido_capture_sdk_core_release()
                com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment r1 = com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.this
                int r3 = com.onfido.android.sdk.capture.R.string.onfido_video_capture_frame_success_accessibility
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r3 = 0
                r5 = 0
                io.reactivex.rxjava3.core.Completable r7 = com.onfido.android.sdk.capture.internal.service.AnnouncementService.announceString$default(r7, r1, r3, r4, r5)
                r6.label = r2
                java.lang.Object r7 = tz4.d.f(r7, r6)
                if (r7 != r0) goto L72
            L71:
                return r0
            L72:
                kotlin.Unit r7 = kotlin.Unit.f186387a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.C20981.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20981) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onFaceDetected$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onFaceDetected$2", f = "LivenessCaptureFragment.kt", l = {507}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return LivenessCaptureFragment.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                String string = LivenessCaptureFragment.this.getString(R.string.onfido_video_capture_frame_success_accessibility);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                long j2 = StringExtensionsKt.readingTimeMilliseconds(string);
                this.label = 1;
                if (k0.b(j2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            OnfidoCamera.VideoRecorder videoRecorder = LivenessCaptureFragment.this.recorder;
            if (videoRecorder == null || !videoRecorder.isRecording()) {
                OverlayView.resetFaceDetectedState$default(LivenessCaptureFragment.this.getOverlayView(), false, false, false, 7, null);
                LivenessCaptureFragment.this.getViewModel().onAutoLivenessRecordingStart$onfido_capture_sdk_core_release();
                LivenessCaptureFragment.this.startLivenessVideoRecording(false);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onFaceOutTimeout$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20991 extends u implements Function1<DialogInterface, Unit> {
        public C20991() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            LivenessCaptureFragment.this.onVideoTimeoutRetryClick(dialog);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onLivenessChallengeFinished$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21001 extends u implements Function0<Unit> {

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onLivenessChallengeFinished$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onLivenessChallengeFinished$1$1", f = "LivenessCaptureFragment.kt", l = {649}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03701 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ LivenessCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03701(LivenessCaptureFragment livenessCaptureFragment, Continuation<? super C03701> continuation) {
                super(2, continuation);
                this.this$0 = livenessCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03701(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    this.label = 1;
                    if (k0.b(500L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                this.this$0.getViewModel().issueNextChallenge$onfido_capture_sdk_core_release();
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03701) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public C21001() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3727invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3727invoke() {
            OverlayView.resetFaceDetectedState$default(LivenessCaptureFragment.this.getOverlayView(), false, false, false, 4, null);
            LifecycleOwner viewLifecycleOwner = LivenessCaptureFragment.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C03701(LivenessCaptureFragment.this, null), 3);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onStorageThresholdReached$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21011 extends u implements Function1<DialogInterface, Unit> {
        public C21011() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            if (FragmentExtentionsKt.isAttached(LivenessCaptureFragment.this)) {
                LivenessCaptureFragment.this.requireActivity().onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onVideoCaptured$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onVideoCaptured$1", f = "LivenessCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21021 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filePath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21021(String str, Continuation<? super C21021> continuation) {
            super(2, continuation);
            this.$filePath = str;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return LivenessCaptureFragment.this.new C21021(this.$filePath, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            LivenessCaptureFragment livenessCaptureFragment = LivenessCaptureFragment.this;
            livenessCaptureFragment.showFaceLivenessConfirmationScreen(this.$filePath, livenessCaptureFragment.getViewModel().getUploadChallengesList$onfido_capture_sdk_core_release());
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21021) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$onVideoTimeoutExceeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21031 extends u implements Function1<DialogInterface, Unit> {
        public C21031() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            LivenessCaptureFragment.this.onVideoTimeoutRetryClick(dialog);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "shouldShow", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21051 extends u implements Function1<Boolean, Unit> {
        public C21051() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Boolean) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Boolean bool) {
            Intrinsics.h(bool);
            if (bool.booleanValue()) {
                LivenessCaptureFragment.this.showLivenessControlButtonWithAccessibilityEvent();
            } else {
                LivenessCaptureFragment.this.hideLivenessControlButton();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21062 extends u implements Function1<Boolean, Unit> {
        public C21062() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Boolean) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Boolean bool) {
            LivenessCaptureFragment.this.showLivenessButtonAndFocusWithDelay();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends u implements Function1<Boolean, Unit> {
        public AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Boolean) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Boolean bool) {
            LivenessCaptureFragment.this.onFaceOutTimeout();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass4 extends u implements Function1<Boolean, Unit> {
        public AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Boolean) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Boolean bool) {
            LivenessCaptureFragment.this.onStorageThresholdReached();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function1<Boolean, Unit> {
        public AnonymousClass5() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Boolean) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Boolean bool) {
            LivenessCaptureFragment.this.onChallengesCompleted();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass6 extends u implements Function1<LivenessChallengeViewModel, Unit> {
        public AnonymousClass6() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((LivenessChallengeViewModel) obj2);
            return Unit.f186387a;
        }

        public final void invoke(LivenessChallengeViewModel livenessChallengeViewModel) {
            LivenessCaptureFragment livenessCaptureFragment = LivenessCaptureFragment.this;
            Intrinsics.h(livenessChallengeViewModel);
            livenessCaptureFragment.onNextChallenge(livenessChallengeViewModel);
            LivenessCaptureFragment.this.removeViewsAccessibility();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$setupObservers$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass7 extends u implements Function1<FaceDetectionResult, Unit> {
        public AnonymousClass7() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((FaceDetectionResult) obj2);
            return Unit.f186387a;
        }

        public final void invoke(FaceDetectionResult faceDetectionResult) {
            LivenessCaptureFragment livenessCaptureFragment = LivenessCaptureFragment.this;
            Intrinsics.h(faceDetectionResult);
            livenessCaptureFragment.onFaceDetected(faceDetectionResult);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$showLivenessButtonAndFocusWithDelay$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$showLivenessButtonAndFocusWithDelay$1", f = "LivenessCaptureFragment.kt", l = {458}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21071 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $delayTime;
        int label;
        final /* synthetic */ LivenessCaptureFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21071(long j2, LivenessCaptureFragment livenessCaptureFragment, Continuation<? super C21071> continuation) {
            super(2, continuation);
            this.$delayTime = j2;
            this.this$0 = livenessCaptureFragment;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new C21071(this.$delayTime, this.this$0, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = this.$delayTime;
                this.label = 1;
                if (k0.b(j2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            this.this$0.showLivenessControlButtonWithAccessibilityEvent();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C21071) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$startCamera$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraStatus", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21081 extends u implements Function1<OnfidoCamera.CameraStatus, Unit> {
        public C21081() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.CameraStatus) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.CameraStatus cameraStatus) {
            Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.Started.INSTANCE)) {
                LivenessCaptureFragment.this.onCameraStarted();
                return;
            }
            if (cameraStatus instanceof OnfidoCamera.CameraStatus.Failed) {
                LivenessCaptureFragment livenessCaptureFragment = LivenessCaptureFragment.this;
                String message = ((OnfidoCamera.CameraStatus.Failed) cameraStatus).getError().getMessage();
                if (message == null) {
                    message = "";
                }
                livenessCaptureFragment.finishWithException(new UnknownCameraException(message));
                return;
            }
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotFound.INSTANCE)) {
                LivenessCaptureFragment.this.onCameraNotFound();
            } else if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotAvailable.INSTANCE)) {
                LivenessCaptureFragment.this.onCameraUnavailable();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$startVideoRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21091 extends u implements Function0<Unit> {
        public static final C21091 INSTANCE = new C21091();

        public C21091() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3729invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3729invoke();
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment$startVideoRecording$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21102 extends u implements Function1<OnfidoCamera.VideoCaptureEvent, Unit> {
        final /* synthetic */ Function0<Unit> $videoRecordingStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21102(Function0<Unit> function0) {
            super(1);
            this.$videoRecordingStarted = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.VideoCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.VideoCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE)) {
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Error) {
                LivenessCaptureFragment.this.onErrorTakingPicture(((OnfidoCamera.VideoCaptureEvent.Error) event).getError());
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Recorded) {
                LivenessCaptureFragment.this.onVideoCaptured(((OnfidoCamera.VideoCaptureEvent.Recorded) event).getFilePath());
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Started.INSTANCE)) {
                this.$videoRecordingStarted.invoke();
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE)) {
                LivenessCaptureFragment.this.onVideoTimeoutExceeded();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LivenessCaptureFragment() {
        super(R.layout.onfido_fragment_liveness_capture);
        LivenessCaptureFragment$viewModel$2 livenessCaptureFragment$viewModel$2 = new LivenessCaptureFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new LivenessCaptureFragment$special$$inlined$viewModels$default$2(new LivenessCaptureFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(LivenessCaptureViewModel.class), new LivenessCaptureFragment$special$$inlined$viewModels$default$3(lazyC), new LivenessCaptureFragment$special$$inlined$viewModels$default$4(null, lazyC), livenessCaptureFragment$viewModel$2);
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private final void adjustDummyAccessibilityView(RectF visibleCaptureRect) {
        Rect rect = new Rect();
        visibleCaptureRect.roundOut(rect);
        View dummyAccessibility = getDummyAccessibilityBinding().dummyAccessibility;
        Intrinsics.checkNotNullExpressionValue(dummyAccessibility, "dummyAccessibility");
        ViewGroup.LayoutParams layoutParams = dummyAccessibility.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.width = rect.width();
        layoutParams2.height = rect.height();
        layoutParams2.leftMargin = rect.left;
        layoutParams2.topMargin = rect.top;
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.onfido_capture_instructions_outer_top_margin);
        dummyAccessibility.setLayoutParams(layoutParams2);
    }

    private final void changeStatusBarColor(int color) {
        Window window = requireActivity().getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithException(Exception exception) {
        finishWithResult(new LivenessCaptureScreen.LivenessCaptureResult.Error(exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(LivenessCaptureScreen.LivenessCaptureResult result) {
        if (FragmentExtentionsKt.isAttached(this)) {
            String string = requireArguments().getString("key_request");
            if (string == null) {
                throw new IllegalArgumentException("request key argument is missing");
            }
            FragmentKt.setFragmentResult(this, string, LivenessCaptureScreen.INSTANCE.storeResult(result));
        }
    }

    private final int getBackgroundColorCaptureScreen() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ContextUtilsKt.color(contextRequireContext, R.color.onfido_camera_blur);
    }

    private final OnfidoFragmentLivenessCaptureBinding getBinding() {
        OnfidoFragmentLivenessCaptureBinding onfidoFragmentLivenessCaptureBinding = this._binding;
        Intrinsics.h(onfidoFragmentLivenessCaptureBinding);
        return onfidoFragmentLivenessCaptureBinding;
    }

    private final OnfidoDummyAccessibilityViewBinding getDummyAccessibilityBinding() {
        OnfidoDummyAccessibilityViewBinding onfidoDummyAccessibilityViewBinding = this._dummyAccessibilityBinding;
        Intrinsics.h(onfidoDummyAccessibilityViewBinding);
        return onfidoDummyAccessibilityViewBinding;
    }

    private final LivenessCaptureLayoutAdjuster getLayoutAdjuster() {
        LivenessCaptureLayoutAdjuster livenessCaptureLayoutAdjuster = this._layoutAdjuster;
        Intrinsics.h(livenessCaptureLayoutAdjuster);
        return livenessCaptureLayoutAdjuster;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OverlayView getOverlayView() {
        OverlayView overlayView = this._overlayView;
        Intrinsics.h(overlayView);
        return overlayView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LivenessCaptureViewModel getViewModel() {
        return (LivenessCaptureViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLivenessControlButton() {
        OnfidoButton onfidoButton = this.captureButton;
        if (onfidoButton != null) {
            ViewExtensionsKt.toInvisible(onfidoButton, false);
        }
    }

    private final void hideLoading() {
        if (FragmentExtentionsKt.isAttached(this)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BaseActivity");
            ((BaseActivity) fragmentActivityRequireActivity).dismissLoadingDialog$onfido_capture_sdk_core_release();
        }
    }

    private final void inflateCaptureButton() {
        this.captureButton = (OnfidoButton) getLayoutInflater().inflate(R.layout.onfido_capture_button_video, (ViewGroup) getBinding().content, true).findViewById(R.id.livenessControlButton);
        LivenessCaptureLayoutAdjuster layoutAdjuster = getLayoutAdjuster();
        OnfidoButton onfidoButton = this.captureButton;
        Intrinsics.h(onfidoButton);
        layoutAdjuster.setCaptureInstructionsAboveView(onfidoButton);
        OnfidoButton onfidoButton2 = this.captureButton;
        if (onfidoButton2 != null) {
            onfidoButton2.setOnClickListener(new b2(this, 10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inflateCaptureButton$lambda$11(LivenessCaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnfidoCamera.VideoRecorder videoRecorder = this$0.recorder;
        if (videoRecorder == null || !videoRecorder.isRecording()) {
            this$0.getViewModel().onManualLivenessRecordingStart$onfido_capture_sdk_core_release();
            this$0.startLivenessVideoRecording(true);
        } else {
            this$0.getViewModel().onManualLivenessNextClick$onfido_capture_sdk_core_release();
            this$0.getViewModel().issueNextChallenge$onfido_capture_sdk_core_release();
        }
    }

    private final void inflateDummyAccessibilityView() {
        this._dummyAccessibilityBinding = OnfidoDummyAccessibilityViewBinding.inflate(getLayoutInflater(), getBinding().content, true);
        setCaptureFrameContentDescriptionAndTitle();
    }

    private final OverlayView inflateOverlayView() {
        View viewInflate = getLayoutInflater().inflate(R.layout.onfido_view_overlay_video, (ViewGroup) getBinding().contentLayout, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.OverlayView");
        return (OverlayView) viewInflate;
    }

    private final boolean isInsideOval(FaceDetectionResult faceDetectionResult, Frame frame) {
        if (!(faceDetectionResult instanceof FaceDetectionResult.FaceDetected)) {
            return false;
        }
        float width = frame.getWidth() * FACE_DETECTION_OVAL_THRESHOLD_PERCENTAGE;
        float left = frame.getLeft() - width;
        float width2 = frame.getWidth() + frame.getLeft() + width;
        float top = frame.getTop() - width;
        float height = frame.getHeight() + frame.getTop() + width;
        FaceDetectionRect faceRect = ((FaceDetectionResult.FaceDetected) faceDetectionResult).getFaceRect();
        if (faceRect.getLeft() < left || faceRect.getTop() < top) {
            return false;
        }
        if (faceRect.height$onfido_capture_sdk_core_release() + faceRect.getTop() <= height) {
            return ((float) (faceRect.width$onfido_capture_sdk_core_release() + faceRect.getLeft())) <= width2;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraNotFound() {
        getViewModel().trackCaptureError$onfido_capture_sdk_core_release();
        hideLoading();
        showDialog$default(this, R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_unavailable, 0, new AnonymousClass1(), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStarted() {
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        Disposable disposableSubscribe = onfidoCamera.observeFrame().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.onCameraStarted.1
            @Override // igm.g
            public final void accept(@NotNull Object p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                LivenessCaptureFragment.this.onNextFrame(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnDestroy(disposableSubscribe, viewLifecycleOwner);
        this.isCameraViewInitialised = true;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LivenessChallengesLoadingView livenessChallengesLoadingView = new LivenessChallengesLoadingView(contextRequireContext, null, 0, 6, null);
        livenessChallengesLoadingView.setListener(this);
        livenessChallengesLoadingView.fetchChallenges();
        this.livenessChallengesLoadingView = livenessChallengesLoadingView;
        getBinding().content.addView(this.livenessChallengesLoadingView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraUnavailable() {
        getViewModel().trackCaptureError$onfido_capture_sdk_core_release();
        hideLoading();
        showDialog$default(this, R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_used_by_other_app, 0, new C20961(), 4, null);
    }

    private final void onChallengesAvailable(LivenessChallengesViewModel livenessChallengesViewModel) {
        getBinding().content.removeView(this.livenessChallengesLoadingView);
        LivenessCaptureLayoutAdjuster layoutAdjuster = getLayoutAdjuster();
        OnfidoButton onfidoButton = this.captureButton;
        Intrinsics.h(onfidoButton);
        layoutAdjuster.setCaptureInstructionsAboveView(onfidoButton);
        ViewExtensionsKt.toVisible$default(getOverlayView(), false, 1, null);
        OverlayTextView overlayTextContainer = getBinding().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        ViewExtensionsKt.toVisible$default(overlayTextContainer, false, 1, null);
        getViewModel().startLivenessProcessing$onfido_capture_sdk_core_release(livenessChallengesViewModel);
        AnnouncementService announcementService$onfido_capture_sdk_core_release = getAnnouncementService$onfido_capture_sdk_core_release();
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(2048);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(...)");
        announcementService$onfido_capture_sdk_core_release.sendEvent(accessibilityEventObtain).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChallengesCompleted() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorTakingPicture(Throwable error) {
        hideLoading();
        showDialog$default(this, R.string.onfido_generic_error_title, R.string.onfido_generic_error_video_capture, 0, new C20971(error), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFaceDetected(FaceDetectionResult faceDetectionResult) {
        if (faceDetectionResult instanceof FaceDetectionResult.FaceDetected) {
            ImageUtils imageUtils$onfido_capture_sdk_core_release = getImageUtils$onfido_capture_sdk_core_release();
            OverlayMetrics overlayMetrics = this.overlayMetrics;
            if (overlayMetrics == null) {
                Intrinsics.r("overlayMetrics");
                throw null;
            }
            Frame frameLimitRect$onfido_capture_sdk_core_release = imageUtils$onfido_capture_sdk_core_release.limitRect$onfido_capture_sdk_core_release(overlayMetrics.getRealCaptureRect(), ((FaceDetectionResult.FaceDetected) faceDetectionResult).getCropRect());
            OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
            if ((videoRecorder == null || !videoRecorder.isRecording()) && isInsideOval(faceDetectionResult, frameLimitRect$onfido_capture_sdk_core_release) && !getViewModel().isManualCapture$onfido_capture_sdk_core_release()) {
                OnfidoButton onfidoButton = this.captureButton;
                if (onfidoButton != null) {
                    ViewExtensionsKt.toInvisible(onfidoButton, false);
                }
                e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C20981(null), 3);
                ViewUtil.setViewVisibilityWithoutAnimation(getBinding().overlayTextContainer, false);
                OverlayView.showFaceConfirmationTick$default(getOverlayView(), null, 1, null);
                getViewModel().cancelFaceDetectionJobs$onfido_capture_sdk_core_release();
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AnonymousClass2(null), 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFaceOutTimeout() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
        getBinding().livenessOverlayView.stopFaceTracking$onfido_capture_sdk_core_release();
        showDialog(R.string.onfido_video_capture_prompt_header_restart, R.string.onfido_video_capture_prompt_detail_restart, R.string.onfido_video_capture_prompt_button_restart, new C20991());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextChallenge(LivenessChallengeViewModel livenessChallengeViewModel) {
        LivenessChallenge challenge = livenessChallengeViewModel.getChallenge();
        boolean zIsLastChallenge = livenessChallengeViewModel.isLastChallenge();
        getBinding().livenessOverlayView.updateInfo$onfido_capture_sdk_core_release(challenge, getViewModel().isManualCapture$onfido_capture_sdk_core_release());
        String string = getString(zIsLastChallenge ? R.string.onfido_video_capture_button_primary_finish : R.string.onfido_video_capture_button_primary_fallback);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        OnfidoButton onfidoButton = this.captureButton;
        if (onfidoButton != null) {
            onfidoButton.setText(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextFrame(Object frame) {
        Intrinsics.i(frame, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.camera.OnfidoImage");
        OnfidoImage onfidoImage = (OnfidoImage) frame;
        getViewModel().onNextFaceDetectionFrame$onfido_capture_sdk_core_release(new FaceDetectionFrame(onfidoImage.getData(), onfidoImage.getWidth(), onfidoImage.getHeight(), onfidoImage.getRotation(), onfidoImage.getCropRect(), onfidoImage.getBitmap()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStorageThresholdReached() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
        showDialog(R.string.onfido_video_capture_error_storage_title, R.string.onfido_video_capture_error_storage_detail, R.string.onfido_ok, new C21011());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCaptured(String filePath) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C21021(filePath, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoTimeoutRetryClick(DialogInterface dialog) {
        dialog.dismiss();
        getViewModel().trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release();
        if (FragmentExtentionsKt.isAttached(this)) {
            requireActivity().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeViewsAccessibility() {
        getDummyAccessibilityBinding().dummyAccessibility.setImportantForAccessibility(2);
        ToolbarExtensionsKt.makeTitleNotImportantForAccessibility(ContextUtilsKt.requireToolbarHost(this).getToolbar());
    }

    private final void setCaptureFrameContentDescriptionAndTitle() {
        if (FragmentExtentionsKt.isAttached(this)) {
            StringRepresentation.SingleStringResIdRepresentation singleStringResIdRepresentation = new StringRepresentation.SingleStringResIdRepresentation(R.string.onfido_video_capture_frame_accessibility);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            getDummyAccessibilityBinding().dummyAccessibility.setContentDescription(singleStringResIdRepresentation.getString(fragmentActivityRequireActivity));
            fragmentActivityRequireActivity.setTitle(singleStringResIdRepresentation.getString(fragmentActivityRequireActivity));
        }
    }

    private final void setColorsForCaptureScreen() {
        ContextUtilsKt.requireToolbarHost(this).setToolbarColor(R.attr.onfidoColorToolbarBackgroundDark, R.attr.onfidoColorContentToolbarTitleDark, R.attr.onfidoColorContentToolbarSubtitleDark, R.attr.onfidoColorToolbarIconDark);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        changeStatusBarColor(ContextUtilsKt.colorFromAttr(contextRequireContext, android.R.attr.colorPrimaryDark));
        OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorCaptureScreen(), false, 2, null);
    }

    private final void setOverlay() {
        setupOverlayView();
        setColorsForCaptureScreen();
    }

    private final void setOverlayMargin(RectF captureRect) {
        getBinding().livenessOverlayView.updateTextPosition$onfido_capture_sdk_core_release(captureRect);
    }

    private final void setVideoRecordingIndicatorMargin(RectF captureRect) {
        LinearLayout root = getBinding().videoRecordingContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        float f = 2;
        layoutParams2.setMargins(0, (int) (((captureRect.height() / f) + captureRect.top) - (getResources().getDimension(R.dimen.onfido_document_capture_video_indicator_height) / f)), 0, 0);
        root.setLayoutParams(layoutParams2);
    }

    private final void setupObservers() {
        getViewModel().getLivenessControlButtonLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(1, new C21051()));
        getViewModel().getLivenessControlButtonWithDelayLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(2, new C21062()));
        getViewModel().getFaceOutTimeoutLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(3, new AnonymousClass3()));
        getViewModel().getStorageThresholdReachedLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(4, new AnonymousClass4()));
        getViewModel().getChallengesCompletedLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(5, new AnonymousClass5()));
        getViewModel().getChallengeProviderLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(6, new AnonymousClass6()));
        getViewModel().getFaceDetectionResultLiveData$onfido_capture_sdk_core_release().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(7, new AnonymousClass7()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$1(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$2(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$3(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$4(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$5(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupObservers$lambda$6(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    private final void setupOverlayView() {
        if (this._overlayView != null) {
            getBinding().contentLayout.removeView(getOverlayView());
        }
        OverlayView overlayViewInflateOverlayView = inflateOverlayView();
        overlayViewInflateOverlayView.setUp(CaptureType.VIDEO, this);
        OverlayView.setColorOutsideOverlay$default(overlayViewInflateOverlayView, getBackgroundColorCaptureScreen(), false, 2, null);
        ViewExtensionsKt.runOnMeasured(overlayViewInflateOverlayView, new LivenessCaptureFragment$setupOverlayView$1$1(this));
        this._overlayView = overlayViewInflateOverlayView;
        getBinding().overlayTextContainer.setLivenessOverlayText$onfido_capture_sdk_core_release();
        getOverlayView().setIsProofOfAddress(false);
        getBinding().contentLayout.addView(getOverlayView());
    }

    private final void setupUiElements(View view) {
        this._binding = OnfidoFragmentLivenessCaptureBinding.bind(view);
        inflateDummyAccessibilityView();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this._layoutAdjuster = new LivenessCaptureLayoutAdjuster(contextRequireContext, getBinding().overlayTextContainer, getDummyAccessibilityBinding().dummyAccessibility);
        getLifecycle().addObserver(getLayoutAdjuster());
    }

    private final void showDialog(int titleResId, int messageResId, int positiveButtonResId, Function1<? super DialogInterface, Unit> callback) {
        if (FragmentExtentionsKt.isAttached(this)) {
            LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(titleResId), messageResId, positiveButtonResId, (Integer) null, false, (Function1) null, (Function1) callback, 56, (Object) null);
        }
    }

    public static /* synthetic */ void showDialog$default(LivenessCaptureFragment livenessCaptureFragment, int i, int i2, int i3, Function1 function1, int i5, Object obj2) {
        if ((i5 & 4) != 0) {
            i3 = R.string.onfido_ok;
        }
        livenessCaptureFragment.showDialog(i, i2, i3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFaceLivenessConfirmationScreen(String videoPath, LivenessPerformedChallenges performedChallenges) {
        finishWithResult(new LivenessCaptureScreen.LivenessCaptureResult.Completed(videoPath, performedChallenges));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLivenessButtonAndFocusWithDelay() {
        long livenessButtonDisplayDelay$onfido_capture_sdk_core_release = getViewModel().getLivenessButtonDisplayDelay$onfido_capture_sdk_core_release();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C21071(livenessButtonDisplayDelay$onfido_capture_sdk_core_release, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCamera() {
        OnfidoCamera onfidoCameraCreate = getCameraFactory$onfido_capture_sdk_core_release().create(this, getBinding().cameraViewCamera1, getBinding().cameraViewCameraX, getOverlayView(), CaptureType.VIDEO);
        this.onfidoCamera = onfidoCameraCreate;
        if (onfidoCameraCreate != null) {
            onfidoCameraCreate.start(OnfidoCamera.CameraFacing.FRONT, new C21081());
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLivenessVideoRecording(boolean isStartedManually) {
        getViewModel().onRecordingStarted$onfido_capture_sdk_core_release(isStartedManually);
        getViewModel().issueNextChallenge$onfido_capture_sdk_core_release();
        ViewUtil.setViewVisibilityWithoutAnimation(getBinding().overlayTextContainer, false);
        LivenessOverlayView livenessOverlayView = getBinding().livenessOverlayView;
        Intrinsics.checkNotNullExpressionValue(livenessOverlayView, "livenessOverlayView");
        ViewExtensionsKt.toVisible$default(livenessOverlayView, false, 1, null);
        getBinding().livenessOverlayView.setListener$onfido_capture_sdk_core_release(this);
        getOverlayView().paintCaptureArea();
        startVideoRecording$default(this, null, 1, null);
    }

    private final void startTrackingLivenessCapture() {
        getViewModel().trackCapture$onfido_capture_sdk_core_release((getResources().getConfiguration().orientation == 2 ? Orientation.LANDSCAPE : Orientation.PORTRAIT).isPortrait$onfido_capture_sdk_core_release());
    }

    private final void startVideoRecording(Function0<Unit> videoRecordingStarted) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        File cacheDir = requireContext().getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        fileUtils.deleteFilesWithPrefixFromFolder(cacheDir, "onfido-video");
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            this.recorder = onfidoCamera.takeVideo(new C21102(videoRecordingStarted));
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startVideoRecording$default(LivenessCaptureFragment livenessCaptureFragment, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            function0 = C21091.INSTANCE;
        }
        livenessCaptureFragment.startVideoRecording(function0);
    }

    @NotNull
    public final AnnouncementService getAnnouncementService$onfido_capture_sdk_core_release() {
        AnnouncementService announcementService = this.announcementService;
        if (announcementService != null) {
            return announcementService;
        }
        Intrinsics.r("announcementService");
        throw null;
    }

    @NotNull
    public final CameraFactory getCameraFactory$onfido_capture_sdk_core_release() {
        CameraFactory cameraFactory = this.cameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        Intrinsics.r("cameraFactory");
        throw null;
    }

    @NotNull
    public final ImageUtils getImageUtils$onfido_capture_sdk_core_release() {
        ImageUtils imageUtils = this.imageUtils;
        if (imageUtils != null) {
            return imageUtils;
        }
        Intrinsics.r("imageUtils");
        throw null;
    }

    @NotNull
    public final VibratorService getVibratorService$onfido_capture_sdk_core_release() {
        VibratorService vibratorService = this.vibratorService;
        if (vibratorService != null) {
            return vibratorService;
        }
        Intrinsics.r("vibratorService");
        throw null;
    }

    @NotNull
    public final Provider getViewModelProvider$onfido_capture_sdk_core_release() {
        Provider provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("viewModelProvider");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onChallengeLoadingViewStateChanged(@NotNull LivenessChallengesLoadingView.ScreenState screenState) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        if (Intrinsics.f(screenState, LivenessChallengesLoadingView.ScreenState.Loading.INSTANCE)) {
            ViewExtensionsKt.toGone$default(getOverlayView(), false, 1, null);
        } else if (screenState instanceof LivenessChallengesLoadingView.ScreenState.Success) {
            onChallengesAvailable(((LivenessChallengesLoadingView.ScreenState.Success) screenState).getLivenessChallengesViewModel());
        } else {
            Intrinsics.f(screenState, LivenessChallengesLoadingView.ScreenState.Error.INSTANCE);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onChallengesErrorBackPressed() {
        requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._layoutAdjuster = null;
        this._overlayView = null;
        this.captureButton = null;
        this._dummyAccessibilityBinding = null;
        this.livenessChallengesLoadingView = null;
        this._binding = null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView.ChallengesListener
    public void onErrorObservingHeadTurnResults() {
        getViewModel().stopFaceTracking$onfido_capture_sdk_core_release();
        showLivenessControlButtonWithAccessibilityEvent();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onInvalidCertificateDetected(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        finishWithResult(new LivenessCaptureScreen.LivenessCaptureResult.Error(new InvalidCertificateException(message)));
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView.ChallengesListener
    public void onLivenessChallengeFinished() {
        getOverlayView().showFaceConfirmationTick(new C21001());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.OverlayView.Listener
    public void onOverlayMetrics(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.overlayMetrics = overlayMetrics;
        RectF visibleCaptureRect = overlayMetrics.getVisibleCaptureRect();
        setOverlayMargin(visibleCaptureRect);
        setVideoRecordingIndicatorMargin(visibleCaptureRect);
        LivenessChallengesLoadingView livenessChallengesLoadingView = this.livenessChallengesLoadingView;
        if (livenessChallengesLoadingView != null) {
            livenessChallengesLoadingView.setTopLimit(overlayMetrics.getVisibleCaptureRect().bottom);
        }
        adjustDummyAccessibilityView(overlayMetrics.getVisibleCaptureRect());
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CameraPermissionsUtils cameraPermissionsUtils = new CameraPermissionsUtils(contextRequireContext);
        CaptureType captureType = CaptureType.VIDEO;
        if (!(cameraPermissionsUtils.getMissingPermissions$onfido_capture_sdk_core_release(captureType).length == 0)) {
            FragmentKt.setFragmentResult(this, "capture_missing_permissions", BundleKt.bundleOf(new Pair("capture_missing_permissions_capture_type", captureType)));
            return;
        }
        startTrackingLivenessCapture();
        setOverlay();
        View view = getView();
        if (view == null) {
            return;
        }
        view.setImportantForAccessibility(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        inflateCaptureButton();
        ContextUtilsKt.requireToolbarHost(this).enableImmersiveFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ContextUtilsKt.requireToolbarHost(this).disableImmersiveFragment();
        ContextUtilsKt.requireToolbarHost(this).resetToolbar();
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        onfidoCamera.stop();
        LivenessOverlayView livenessOverlayView = getBinding().livenessOverlayView;
        Intrinsics.checkNotNullExpressionValue(livenessOverlayView, "livenessOverlayView");
        ViewExtensionsKt.toGone$default(livenessOverlayView, false, 1, null);
        getBinding().content.removeView(this.captureButton);
        inflateCaptureButton();
        getViewModel().reset$onfido_capture_sdk_core_release();
        if (this.isCameraViewInitialised) {
            OverlayView.resetFaceDetectedState$default(getOverlayView(), false, false, false, 2, null);
        }
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder == null || videoRecorder.isRecording()) {
            return;
        }
        ViewUtil.setViewVisibility(this.captureButton, true);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onTokenExpired() {
        finishWithResult(new LivenessCaptureScreen.LivenessCaptureResult.Error(TokenExpiredException.INSTANCE));
    }

    public final void onVideoTimeoutExceeded() {
        getViewModel().reset$onfido_capture_sdk_core_release();
        getBinding().livenessOverlayView.stopFaceTracking$onfido_capture_sdk_core_release();
        getViewModel().trackVideoCaptureTimeout$onfido_capture_sdk_core_release();
        showDialog(R.string.onfido_video_capture_prompt_title_timeout, R.string.onfido_video_capture_prompt_detail_timeout, R.string.onfido_video_capture_prompt_button_timeout, new C21031());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        setupUiElements(view);
        setupObservers();
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessCaptureFragment.onViewCreated.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                LivenessCaptureFragment.this.finishWithResult(LivenessCaptureScreen.LivenessCaptureResult.Back.INSTANCE);
            }
        });
    }

    @Override // com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener
    public void onWorkflowToolbarUpdated() {
        setColorsForCaptureScreen();
    }

    public final void setAnnouncementService$onfido_capture_sdk_core_release(@NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(announcementService, "<set-?>");
        this.announcementService = announcementService;
    }

    public final void setCameraFactory$onfido_capture_sdk_core_release(@NotNull CameraFactory cameraFactory) {
        Intrinsics.checkNotNullParameter(cameraFactory, "<set-?>");
        this.cameraFactory = cameraFactory;
    }

    public final void setImageUtils$onfido_capture_sdk_core_release(@NotNull ImageUtils imageUtils) {
        Intrinsics.checkNotNullParameter(imageUtils, "<set-?>");
        this.imageUtils = imageUtils;
    }

    public final void setVibratorService$onfido_capture_sdk_core_release(@NotNull VibratorService vibratorService) {
        Intrinsics.checkNotNullParameter(vibratorService, "<set-?>");
        this.vibratorService = vibratorService;
    }

    public final void setViewModelProvider$onfido_capture_sdk_core_release(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.viewModelProvider = provider;
    }

    public final void showLivenessControlButtonWithAccessibilityEvent() {
        OnfidoButton onfidoButton = this.captureButton;
        if (onfidoButton != null) {
            ViewExtensionsKt.toVisible$default(onfidoButton, false, 1, null);
            AccessibilityExtensionsKt.sendAccessibilityFocusEvent(onfidoButton);
        }
    }
}
