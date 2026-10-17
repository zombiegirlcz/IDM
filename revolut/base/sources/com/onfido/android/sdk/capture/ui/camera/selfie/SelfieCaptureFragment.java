package com.onfido.android.sdk.capture.ui.camera.selfie;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.camera.view.PreviewView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.view.OnBackPressedCallback;
import au0.b2;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.databinding.OnfidoCaptureButtonPictureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoDummyAccessibilityViewBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentSelfieCaptureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoViewOverlayFaceBinding;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.AggregatedPerformanceAnalytics;
import com.onfido.android.sdk.capture.internal.performance.trackers.PerformanceEvents;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.BaseActivity;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureConfirmationScreen;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.onfido.android.sdk.capture.ui.camera.capture.PhotoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotAvailableException;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotFoundException;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureViewModel;
import com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster;
import com.onfido.android.sdk.capture.ui.camera.util.ValidationBubblesOffsetDelegate;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel;
import com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.StringRepresentation;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewUtil;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.api.client.data.DocSide;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.d;
import gim.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import vkm.q;
import vkm.q0;
import yhm.j;
import yhm.k;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002Ú\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0007J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0007J\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0007J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0007J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u0007J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0007J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u0007J\u0019\u0010'\u001a\u00020\f2\b\b\u0001\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u0007J\u000f\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010\u0007J\u000f\u0010+\u001a\u00020\fH\u0002¢\u0006\u0004\b+\u0010\u0007J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010\u0007J\u000f\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010\u0007J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0007J\u000f\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u0010\u0007J\u000f\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0007J\u000f\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u0010\u0007J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010\u0007J\u000f\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u0010\u0007J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010\u0007J\u000f\u00105\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u0010\u0007J\u000f\u00106\u001a\u00020\fH\u0002¢\u0006\u0004\b6\u0010\u0007J\u000f\u00107\u001a\u00020\fH\u0002¢\u0006\u0004\b7\u0010\u0007J\u000f\u00108\u001a\u00020\fH\u0002¢\u0006\u0004\b8\u0010\u0007J\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J%\u0010?\u001a\u00020\f2\b\b\u0001\u0010=\u001a\u00020%2\n\b\u0003\u0010>\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010\u0016J\u000f\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010\u0007J\u000f\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\bC\u0010\u0007J\u0011\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u0013H\u0002¢\u0006\u0004\bK\u0010\u0016J\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010\u0007J\u0017\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010\u0007J\u000f\u0010R\u001a\u00020\fH\u0002¢\u0006\u0004\bR\u0010\u0007J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0007J\u000f\u0010T\u001a\u00020\fH\u0002¢\u0006\u0004\bT\u0010\u0007J\u000f\u0010U\u001a\u00020\fH\u0002¢\u0006\u0004\bU\u0010\u0007J\u0017\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\f2\u0006\u0010Z\u001a\u00020VH\u0002¢\u0006\u0004\b[\u0010YJ\u000f\u0010\\\u001a\u00020\fH\u0002¢\u0006\u0004\b\\\u0010\u0007J\u000f\u0010]\u001a\u00020\fH\u0002¢\u0006\u0004\b]\u0010\u0007J\u000f\u0010^\u001a\u00020\fH\u0002¢\u0006\u0004\b^\u0010\u0007J\u000f\u0010_\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010\u0007J\u0017\u0010b\u001a\u00020\f2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\bb\u0010cJ7\u0010i\u001a\u00020\f2\b\b\u0001\u0010d\u001a\u00020%2\b\b\u0001\u0010e\u001a\u00020%2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\f0fH\u0002¢\u0006\u0004\bi\u0010jJ\u001b\u0010n\u001a\u00020\f2\n\u0010m\u001a\u00060kj\u0002`lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\f2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010x\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0018\u0010\u0080\u0001R\u001a\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010¦\u0001\u001a\u00030¥\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R!\u0010¸\u0001\u001a\u00030³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R*\u0010º\u0001\u001a\u00030¹\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\u001a\u0010Á\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ç\u0001\u001a\u00030Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ë\u0001\u001a\u00020t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0017\u0010Î\u0001\u001a\u00020w8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0017\u0010Ñ\u0001\u001a\u00020z8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ô\u0001\u001a\u00020}8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0017\u0010×\u0001\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0017\u0010Ù\u0001\u001a\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ö\u0001¨\u0006Û\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "Lcom/onfido/android/sdk/capture/ui/camera/face/FaceConfirmationFragmentContainer;", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Listener;", "Lcom/onfido/android/sdk/capture/utils/WorkflowToolbarUpdateListener;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onDestroyView", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "onPictureCaptured", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetrics", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "getPreviewImage", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "onUploadSelfieButtonClick", "onRetakeSelfieButtonClick", "onCaptureConfirmed", "onCaptureDiscarded", "onWorkflowToolbarUpdated", "setupToolbar", "setColorsForCaptureScreen", "updateColorsForConfirmationScreen", "", "color", "changeStatusBarColor", "(I)V", "observeViewModel", "observeLoading", "observeErrors", "observeCaptureResult", "observeShowConfirmation", "observeErrorDescription", "inflateCaptureButton", "inflateDummyAccessibilityView", "setCaptureFrameContentDescriptionAndTitle", "initLayoutAdjuster", "initValidationBubbleDelegate", "setupOverlayView", "setupCaptureButton", "setConfirmationButtons", "setForceRetryButton", "capture", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "descriptor", "showConfirmationError", "(Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;)V", "title", "subtitle", "setValidationBubbleContent", "(ILjava/lang/Integer;)V", "applyValidations", "showConfirmationStep", "showFaceConfirmationFragment", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureConfirmationScreen;", "getConfirmationScreen", "()Lcom/onfido/android/sdk/capture/ui/camera/CaptureConfirmationScreen;", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "getOrientation", "()Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "onfidoImage", "setImagePreview", "updateConfirmationImageTranslationAndScale", "", "error", "onErrorTakingPicture", "(Ljava/lang/Throwable;)V", "setupConfirmationButtons", "startCamera", "onCameraUnavailable", "onCameraNotFound", "onCameraStarted", "Landroid/graphics/RectF;", "rect", "setCaptureRegion", "(Landroid/graphics/RectF;)V", "visibleCaptureRect", "adjustDummyAccessibilityView", "openCaptureScreen", "closeConfirmationScreen", "hideConfirmationStep", "hideLoading", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "dialogMode", "showLoading", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "titleResId", "messageResId", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "listener", "showErrorMessage", "(IILkotlin/jvm/functions/Function1;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "finishWithException", "(Ljava/lang/Exception;)V", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureScreen$SelfieCaptureResult;", "result", "finishWithResult", "(Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureScreen$SelfieCaptureResult;)V", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentSelfieCaptureBinding;", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentSelfieCaptureBinding;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "_captureButtonBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "_dummyAccessibilityBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "_overlayView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster;", "layoutAdjuster", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster;", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "validationBubbleOffsetDelegate", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "previewImage", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "Lcom/onfido/android/sdk/capture/internal/performance/AggregatedPerformanceAnalytics;", "performanceAnalytics", "Lcom/onfido/android/sdk/capture/internal/performance/AggregatedPerformanceAnalytics;", "getPerformanceAnalytics$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/performance/AggregatedPerformanceAnalytics;", "setPerformanceAnalytics$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/performance/AggregatedPerformanceAnalytics;)V", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "getOnfidoRemoteConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "setOnfidoRemoteConfig$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$Factory;", "viewModelFactory", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$Factory;", "getViewModelFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$Factory;", "setViewModelFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$Factory;)V", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "permissionsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "getPermissionsManager$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "setPermissionsManager$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;)V", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel;", "viewModel", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "cameraFactory", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "getCameraFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "setCameraFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;)V", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "onfidoCamera", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "", "isCameraViewInitialised", "Z", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentSelfieCaptureBinding;", "binding", "getCaptureButtonBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "captureButtonBinding", "getDummyAccessibilityBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "dummyAccessibilityBinding", "getOverlayView", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "overlayView", "getBackgroundColorCaptureScreen", "()I", "backgroundColorCaptureScreen", "getBackgroundColorConfirmationScreen", "backgroundColorConfirmationScreen", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelfieCaptureFragment extends BaseFragment implements OverlayView.Listener, FaceConfirmationFragmentContainer, ConfirmationStepButtons.Listener, WorkflowToolbarUpdateListener {
    private OnfidoFragmentSelfieCaptureBinding _binding;
    private OnfidoCaptureButtonPictureBinding _captureButtonBinding;
    private OnfidoDummyAccessibilityViewBinding _dummyAccessibilityBinding;
    private OverlayView _overlayView;
    public AnnouncementService announcementService;
    public CameraFactory cameraFactory;
    public ImageUtils imageUtils;
    private boolean isCameraViewInitialised;
    private CaptureLayoutAdjuster layoutAdjuster;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    private OnfidoCamera onfidoCamera;
    public OnfidoRemoteConfig onfidoRemoteConfig;
    private OverlayMetrics overlayMetrics;
    public AggregatedPerformanceAnalytics performanceAnalytics;
    public RuntimePermissionsManager permissionsManager;
    private OnfidoImage previewImage;
    private ValidationBubblesOffsetDelegate validationBubbleOffsetDelegate;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public SelfieCaptureViewModel.Factory viewModelFactory;

    @NotNull
    private static final String FRAGMENT_TAG_CONFIRMATION = "FRAGMENT_TAG_CONFIRMATION";

    @NotNull
    private static final String KEY_REQUEST = "KEY_REQUEST";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureFragment$Companion;", "", "()V", "FRAGMENT_TAG_CONFIRMATION", "", "KEY_REQUEST", "newInstance", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureFragment;", "requestKey", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final SelfieCaptureFragment newInstance(@NotNull String requestKey) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            SelfieCaptureFragment selfieCaptureFragment = new SelfieCaptureFragment();
            selfieCaptureFragment.setArguments(BundleKt.bundleOf(new Pair("KEY_REQUEST", requestKey)));
            return selfieCaptureFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$capture$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<OnfidoCamera.PictureCaptureEvent, Unit> {
        final /* synthetic */ String $traceName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(1);
            this.$traceName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.PictureCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.PictureCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            SelfieCaptureFragment.this.getPerformanceAnalytics$onfido_capture_sdk_core_release().trackEnd(new PerformanceEvents.TraceEnd(this.$traceName));
            if (event instanceof OnfidoCamera.PictureCaptureEvent.Captured) {
                SelfieCaptureFragment.this.onPictureCaptured(((OnfidoCamera.PictureCaptureEvent.Captured) event).getImage());
            } else if (event instanceof OnfidoCamera.PictureCaptureEvent.Error) {
                SelfieCaptureFragment.this.onErrorTakingPicture(((OnfidoCamera.PictureCaptureEvent.Error) event).getError());
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeCaptureResult$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeCaptureResult$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureScreen$SelfieCaptureResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21161 extends i implements Function2<SelfieCaptureScreen.SelfieCaptureResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C21161(Continuation<? super C21161> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C21161 c21161 = SelfieCaptureFragment.this.new C21161(continuation);
            c21161.L$0 = obj2;
            return c21161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull SelfieCaptureScreen.SelfieCaptureResult selfieCaptureResult, Continuation<? super Unit> continuation) {
            return ((C21161) create(selfieCaptureResult, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            SelfieCaptureFragment.this.finishWithResult((SelfieCaptureScreen.SelfieCaptureResult) this.L$0);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeErrorDescription$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeErrorDescription$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21171 extends i implements Function2<ErrorDescriptor, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C21171(Continuation<? super C21171> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C21171 c21171 = SelfieCaptureFragment.this.new C21171(continuation);
            c21171.L$0 = obj2;
            return c21171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull ErrorDescriptor errorDescriptor, Continuation<? super Unit> continuation) {
            return ((C21171) create(errorDescriptor, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            SelfieCaptureFragment.this.showConfirmationError((ErrorDescriptor) this.L$0);
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeErrors$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeErrors$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ErrorMessageEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21181 extends i implements Function2<SelfieCaptureViewModel.ErrorMessageEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeErrors$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03751 extends u implements Function1<DialogInterface, Unit> {
            final /* synthetic */ SelfieCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03751(SelfieCaptureFragment selfieCaptureFragment) {
                super(1);
                this.this$0 = selfieCaptureFragment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((DialogInterface) obj2);
                return Unit.f186387a;
            }

            public final void invoke(@NotNull DialogInterface it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                if (this.this$0.getConfirmationScreen() == null) {
                    this.this$0.openCaptureScreen();
                }
            }
        }

        public C21181(Continuation<? super C21181> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C21181 c21181 = SelfieCaptureFragment.this.new C21181(continuation);
            c21181.L$0 = obj2;
            return c21181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull SelfieCaptureViewModel.ErrorMessageEvent errorMessageEvent, Continuation<? super Unit> continuation) {
            return ((C21181) create(errorMessageEvent, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            SelfieCaptureViewModel.ErrorMessageEvent errorMessageEvent = (SelfieCaptureViewModel.ErrorMessageEvent) this.L$0;
            SelfieCaptureFragment.this.showErrorMessage(errorMessageEvent.getTitle(), errorMessageEvent.getMessage(), new C03751(SelfieCaptureFragment.this));
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeLoading$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeLoading$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21191 extends i implements Function2<SelfieCaptureViewModel.LoadingEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C21191(Continuation<? super C21191> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C21191 c21191 = SelfieCaptureFragment.this.new C21191(continuation);
            c21191.L$0 = obj2;
            return c21191;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull SelfieCaptureViewModel.LoadingEvent loadingEvent, Continuation<? super Unit> continuation) {
            return ((C21191) create(loadingEvent, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            SelfieCaptureViewModel.LoadingEvent loadingEvent = (SelfieCaptureViewModel.LoadingEvent) this.L$0;
            if (Intrinsics.f(loadingEvent, SelfieCaptureViewModel.LoadingEvent.Hide.INSTANCE)) {
                SelfieCaptureFragment.this.hideLoading();
            } else if (loadingEvent instanceof SelfieCaptureViewModel.LoadingEvent.Show) {
                SelfieCaptureFragment.this.showLoading(((SelfieCaptureViewModel.LoadingEvent.Show) loadingEvent).getMode());
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeShowConfirmation$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$observeShowConfirmation$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ShowConfirmationEvent;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21201 extends i implements Function2<SelfieCaptureViewModel.ShowConfirmationEvent, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C21201(Continuation<? super C21201> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C21201 c21201 = SelfieCaptureFragment.this.new C21201(continuation);
            c21201.L$0 = obj2;
            return c21201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull SelfieCaptureViewModel.ShowConfirmationEvent showConfirmationEvent, Continuation<? super Unit> continuation) {
            return ((C21201) create(showConfirmationEvent, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            SelfieCaptureViewModel.ShowConfirmationEvent showConfirmationEvent = (SelfieCaptureViewModel.ShowConfirmationEvent) this.L$0;
            SelfieCaptureFragment.this.showConfirmationStep();
            if (showConfirmationEvent.getShowForceRetry()) {
                SelfieCaptureFragment.this.setForceRetryButton();
            } else {
                SelfieCaptureFragment.this.setConfirmationButtons();
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onCameraNotFound$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21211 extends u implements Function1<DialogInterface, Unit> {
        public C21211() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            SelfieCaptureFragment.this.finishWithException(CameraNotFoundException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onCameraUnavailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21221 extends u implements Function1<DialogInterface, Unit> {
        public C21221() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            SelfieCaptureFragment.this.finishWithException(CameraNotAvailableException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onErrorTakingPicture$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21231 extends u implements Function1<DialogInterface, Unit> {
        final /* synthetic */ Throwable $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21231(Throwable th10) {
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
            SelfieCaptureFragment selfieCaptureFragment = SelfieCaptureFragment.this;
            Throwable th10 = this.$error;
            Intrinsics.i(th10, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            selfieCaptureFragment.finishWithException((Exception) th10);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2", f = "SelfieCaptureFragment.kt", l = {211}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2$1, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2$1", f = "SelfieCaptureFragment.kt", l = {Constants.TAG_PCI_PED_CHECKSUM}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SelfieCaptureFragment this$0;

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            @d(c = "com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$onViewCreated$2$1$1", f = "SelfieCaptureFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "isVisible", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C03761 extends i implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ SelfieCaptureFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03761(SelfieCaptureFragment selfieCaptureFragment, Continuation<? super C03761> continuation) {
                    super(2, continuation);
                    this.this$0 = selfieCaptureFragment;
                }

                @Override // gim.a
                @NotNull
                public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                    C03761 c03761 = new C03761(this.this$0, continuation);
                    c03761.Z$0 = ((Boolean) obj2).booleanValue();
                    return c03761;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) obj3);
                }

                @Override // gim.a
                public final Object invokeSuspend(@NotNull Object obj2) {
                    a aVar = a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    if (this.Z$0) {
                        ImageView captureButton = this.this$0.getCaptureButtonBinding().captureButton;
                        Intrinsics.checkNotNullExpressionValue(captureButton, "captureButton");
                        ViewExtensionsKt.toVisible$default(captureButton, false, 1, null);
                    } else {
                        ImageView captureButton2 = this.this$0.getCaptureButtonBinding().captureButton;
                        Intrinsics.checkNotNullExpressionValue(captureButton2, "captureButton");
                        ViewExtensionsKt.toGone$default(captureButton2, false, 1, null);
                    }
                    return Unit.f186387a;
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((C03761) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.f186387a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SelfieCaptureFragment selfieCaptureFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = selfieCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow captureButtonVisibility$onfido_capture_sdk_core_release = this.this$0.getViewModel().getCaptureButtonVisibility();
                    C03761 c03761 = new C03761(this.this$0, null);
                    this.label = 1;
                    if (q.o(captureButtonVisibility$onfido_capture_sdk_core_release, c03761, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return SelfieCaptureFragment.this.new AnonymousClass2(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                LifecycleOwner viewLifecycleOwner = SelfieCaptureFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SelfieCaptureFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$startCamera$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraStatus", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21251 extends u implements Function1<OnfidoCamera.CameraStatus, Unit> {
        public C21251() {
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
                SelfieCaptureFragment.this.onCameraStarted();
                return;
            }
            if (cameraStatus instanceof OnfidoCamera.CameraStatus.Failed) {
                SelfieCaptureFragment selfieCaptureFragment = SelfieCaptureFragment.this;
                String message = ((OnfidoCamera.CameraStatus.Failed) cameraStatus).getError().getMessage();
                if (message == null) {
                    message = "";
                }
                selfieCaptureFragment.finishWithException(new UnknownCameraException(message));
                return;
            }
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotFound.INSTANCE)) {
                SelfieCaptureFragment.this.onCameraNotFound();
            } else if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotAvailable.INSTANCE)) {
                SelfieCaptureFragment.this.onCameraUnavailable();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelfieCaptureFragment() {
        super(R.layout.onfido_fragment_selfie_capture);
        SelfieCaptureFragment$viewModel$2 selfieCaptureFragment$viewModel$2 = new SelfieCaptureFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new SelfieCaptureFragment$special$$inlined$viewModels$default$2(new SelfieCaptureFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(SelfieCaptureViewModel.class), new SelfieCaptureFragment$special$$inlined$viewModels$default$3(lazyC), new SelfieCaptureFragment$special$$inlined$viewModels$default$4(null, lazyC), selfieCaptureFragment$viewModel$2);
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    private final void adjustDummyAccessibilityView(RectF visibleCaptureRect) {
        Rect rect = new Rect();
        visibleCaptureRect.roundOut(rect);
        View root = getDummyAccessibilityBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.width = rect.width();
        layoutParams2.height = rect.height();
        layoutParams2.leftMargin = rect.left;
        layoutParams2.topMargin = rect.top;
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.onfido_capture_instructions_outer_top_margin);
        root.setLayoutParams(layoutParams2);
    }

    private final void applyValidations(OnfidoImage image) {
        this.previewImage = image;
        setImagePreview(image);
        showConfirmationStep();
    }

    private final void capture() {
        getViewModel().onCaptureRequested$onfido_capture_sdk_core_release();
        getPerformanceAnalytics$onfido_capture_sdk_core_release().trackStart(new PerformanceEvents.TraceStart("selfie_capture"));
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.takePicture(new PhotoCaptureConfig(true), new AnonymousClass1("selfie_capture"));
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    private final void changeStatusBarColor(int color) {
        Window window = requireActivity().getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(color);
    }

    private final void closeConfirmationScreen() {
        Object confirmationScreen = getConfirmationScreen();
        Fragment fragment = confirmationScreen instanceof Fragment ? (Fragment) confirmationScreen : null;
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().remove(fragment).commitNowAllowingStateLoss();
        }
        FragmentContainerView fragmentContainer = getBinding().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        ViewExtensionsKt.toGone$default(fragmentContainer, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithException(Exception exception) {
        finishWithResult(new SelfieCaptureScreen.SelfieCaptureResult.Error(exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(SelfieCaptureScreen.SelfieCaptureResult result) {
        getViewModel().onCaptureCompleted(result, this.previewImage);
        String string = requireArguments().getString("KEY_REQUEST");
        if (string == null) {
            throw new IllegalArgumentException("request key argument is missing");
        }
        FragmentKt.setFragmentResult(this, string, SelfieCaptureScreen.INSTANCE.storeResult(result));
    }

    private final int getBackgroundColorCaptureScreen() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ContextUtilsKt.color(contextRequireContext, R.color.onfido_camera_blur);
    }

    private final int getBackgroundColorConfirmationScreen() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ContextUtilsKt.colorFromAttr(contextRequireContext, R.attr.onfidoColorBackground);
    }

    private final OnfidoFragmentSelfieCaptureBinding getBinding() {
        OnfidoFragmentSelfieCaptureBinding onfidoFragmentSelfieCaptureBinding = this._binding;
        Intrinsics.h(onfidoFragmentSelfieCaptureBinding);
        return onfidoFragmentSelfieCaptureBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoCaptureButtonPictureBinding getCaptureButtonBinding() {
        OnfidoCaptureButtonPictureBinding onfidoCaptureButtonPictureBinding = this._captureButtonBinding;
        Intrinsics.h(onfidoCaptureButtonPictureBinding);
        return onfidoCaptureButtonPictureBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CaptureConfirmationScreen getConfirmationScreen() {
        LifecycleOwner lifecycleOwnerFindFragmentByTag = getChildFragmentManager().findFragmentByTag("FRAGMENT_TAG_CONFIRMATION");
        if (lifecycleOwnerFindFragmentByTag instanceof CaptureConfirmationScreen) {
            return (CaptureConfirmationScreen) lifecycleOwnerFindFragmentByTag;
        }
        return null;
    }

    private final OnfidoDummyAccessibilityViewBinding getDummyAccessibilityBinding() {
        OnfidoDummyAccessibilityViewBinding onfidoDummyAccessibilityViewBinding = this._dummyAccessibilityBinding;
        Intrinsics.h(onfidoDummyAccessibilityViewBinding);
        return onfidoDummyAccessibilityViewBinding;
    }

    private final Orientation getOrientation() {
        return getResources().getConfiguration().orientation == 2 ? Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    private final OverlayView getOverlayView() {
        OverlayView overlayView = this._overlayView;
        Intrinsics.h(overlayView);
        return overlayView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelfieCaptureViewModel getViewModel() {
        return (SelfieCaptureViewModel) this.viewModel.getValue();
    }

    private final void hideConfirmationStep() {
        ViewUtil.setViewVisibility(getBinding().confirmationImage, false);
        ViewUtil.setViewVisibility(getBinding().confirmationButtons, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BaseActivity");
        ((BaseActivity) fragmentActivityRequireActivity).dismissLoadingDialog$onfido_capture_sdk_core_release();
    }

    private final void inflateCaptureButton() {
        this._captureButtonBinding = OnfidoCaptureButtonPictureBinding.inflate(getLayoutInflater(), getBinding().content, true);
        getCaptureButtonBinding().captureButton.setContentDescription(getString(R.string.onfido_selfie_capture_button_accessibility));
    }

    private final void inflateDummyAccessibilityView() {
        this._dummyAccessibilityBinding = OnfidoDummyAccessibilityViewBinding.inflate(getLayoutInflater(), getBinding().content, true);
        setCaptureFrameContentDescriptionAndTitle();
    }

    private final void initLayoutAdjuster() {
        this.layoutAdjuster = new CaptureLayoutAdjuster(CaptureType.FACE, DocSide.FRONT, new CaptureLayoutAdjuster.ViewHolder(requireActivity(), getBinding().overlayTextContainer, getBinding().postCaptureValidationBubble, getBinding().confirmationButtons, getDummyAccessibilityBinding().dummyAccessibility, getCaptureButtonBinding().captureButton, getBinding().flipArrow, null, null, 384, null), false, 8, null);
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        lifecycle.addObserver(captureLayoutAdjuster);
        CaptureLayoutAdjuster captureLayoutAdjuster2 = this.layoutAdjuster;
        if (captureLayoutAdjuster2 == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        ImageView captureButton = getCaptureButtonBinding().captureButton;
        Intrinsics.checkNotNullExpressionValue(captureButton, "captureButton");
        captureLayoutAdjuster2.setCaptureInstructionsAboveView(captureButton);
    }

    private final void initValidationBubbleDelegate() {
        RelativeLayout content = getBinding().content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        this.validationBubbleOffsetDelegate = new ValidationBubblesOffsetDelegate(content, v.k(Integer.valueOf(R.id.liveValidationBubble), Integer.valueOf(R.id.postCaptureValidationBubble)), CaptureType.FACE);
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate != null) {
            lifecycle.addObserver(validationBubblesOffsetDelegate);
        } else {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
    }

    private final void observeCaptureResult() {
        q0 q0Var = new q0(getViewModel().getCaptureResult(), new C21161(null), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    private final void observeErrorDescription() {
        q0 q0Var = new q0(getViewModel().getErrorDescriptorFlow(), new C21171(null), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    private final void observeErrors() {
        q0 q0Var = new q0(getViewModel().getErrorMessageFlow(), new C21181(null), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    private final void observeLoading() {
        q0 q0Var = new q0(getViewModel().getLoadingFlow(), new C21191(null), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    private final void observeShowConfirmation() {
        q0 q0Var = new q0(getViewModel().getShowConfirmationFlow(), new C21201(null), 1);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        q.G(q0Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    private final void observeViewModel() {
        observeLoading();
        observeErrors();
        observeCaptureResult();
        observeShowConfirmation();
        observeErrorDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraNotFound() {
        getViewModel().trackCaptureError(null);
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_unavailable, new C21211());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStarted() {
        getViewModel().onCameraStarted$onfido_capture_sdk_core_release();
        this.isCameraViewInitialised = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraUnavailable() {
        getViewModel().trackCaptureError(null);
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_used_by_other_app, new C21221());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorTakingPicture(Throwable error) {
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        onfidoCamera.stop();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_face_capture, new C21231(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCaptureScreen() {
        hideLoading();
        startCamera();
        closeConfirmationScreen();
        getBinding().confirmationImage.setImageBitmap(null);
        hideConfirmationStep();
        getOverlayView().switchConfirmationMode(false);
        getBinding().overlayTextContainer.setSelfieCaptureOverlayText$onfido_capture_sdk_core_release();
        OnfidoCaptureValidationBubble postCaptureValidationBubble = getBinding().postCaptureValidationBubble;
        Intrinsics.checkNotNullExpressionValue(postCaptureValidationBubble, "postCaptureValidationBubble");
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(postCaptureValidationBubble, OnfidoCaptureValidationBubble.VisibilityCommand.Gone.INSTANCE, false, 2, null);
        getBinding().confirmationButtons.setListener$onfido_capture_sdk_core_release(this);
        getBinding().confirmationButtons.setSelfieErrorState(false);
        setColorsForCaptureScreen();
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        captureLayoutAdjuster.adjustLayoutParams(false);
        setCaptureFrameContentDescriptionAndTitle();
        getViewModel().trackCapture$onfido_capture_sdk_core_release(getOrientation());
    }

    private final void setCaptureFrameContentDescriptionAndTitle() {
        StringRepresentation.SingleStringResIdRepresentation singleStringResIdRepresentation = new StringRepresentation.SingleStringResIdRepresentation(R.string.onfido_selfie_capture_frame_accessibility);
        View view = getDummyAccessibilityBinding().dummyAccessibility;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        view.setContentDescription(singleStringResIdRepresentation.getString(contextRequireContext));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        fragmentActivityRequireActivity.setTitle(singleStringResIdRepresentation.getString(contextRequireContext2));
    }

    private final void setCaptureRegion(RectF rect) {
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate != null) {
            validationBubblesOffsetDelegate.onCaptureRegionSet(rect);
        } else {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
    }

    private final void setColorsForCaptureScreen() {
        ContextUtilsKt.requireToolbarHost(this).setToolbarColor(R.attr.onfidoColorToolbarBackgroundDark, R.attr.onfidoColorContentToolbarTitleDark, R.attr.onfidoColorContentToolbarSubtitleDark, R.attr.onfidoColorToolbarIconDark);
        OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorCaptureScreen(), false, 2, null);
        getBinding().watermark.setDarkBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfirmationButtons() {
        DocumentTypeUIModel documentUIModel$default = DocumentUITextModelMapper.toDocumentUIModel$default(DocumentUITextModelMapper.INSTANCE, DocumentType.GENERIC, null, null, getAnnouncementService$onfido_capture_sdk_core_release().isEnabled(), false, false, 16, null);
        getBinding().confirmationButtons.setWarningState(false, documentUIModel$default);
        getBinding().confirmationButtons.setDocumentCaptureCopy(documentUIModel$default.getReadabilityConfirmationLabel(), documentUIModel$default.getReadabilityDiscardLabel(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setForceRetryButton() {
        CaptureConfirmationScreen confirmationScreen = getConfirmationScreen();
        if (confirmationScreen != null) {
            confirmationScreen.setForceRetryButton();
        } else {
            getBinding().confirmationButtons.setWarningState(false, DocumentUITextModelMapper.toDocumentUIModel$default(DocumentUITextModelMapper.INSTANCE, DocumentType.GENERIC, null, null, getAnnouncementService$onfido_capture_sdk_core_release().isEnabled(), false, false, 16, null));
            getBinding().confirmationButtons.setSelfieErrorState(true);
        }
    }

    private final void setImagePreview(OnfidoImage onfidoImage) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        getBinding().confirmationImage.setScaleX(-1);
        Bitmap bitmapDecodeScaledResource$default = ImageUtils.decodeScaledResource$default(getImageUtils$onfido_capture_sdk_core_release(), onfidoImage.getData(), getBinding().confirmationImage.getWidth(), getBinding().confirmationImage.getHeight(), null, null, 24, null);
        if (getBinding().confirmationImage.getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = getBinding().confirmationImage.getDrawable();
            Intrinsics.i(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.recycle();
        }
        getBinding().confirmationImage.setImageBitmap(bitmapDecodeScaledResource$default);
        updateConfirmationImageTranslationAndScale();
    }

    private final void setValidationBubbleContent(int title, Integer subtitle) {
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding().postCaptureValidationBubble;
        Intrinsics.h(onfidoCaptureValidationBubble);
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.Content.Error(title, subtitle), false, 2, null);
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(false, 1, null)), false, 2, null);
    }

    public static /* synthetic */ void setValidationBubbleContent$default(SelfieCaptureFragment selfieCaptureFragment, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        selfieCaptureFragment.setValidationBubbleContent(i, num);
    }

    private final void setupCaptureButton() {
        getCaptureButtonBinding().captureButton.setOnClickListener(new b2(this, 11));
        setupConfirmationButtons();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCaptureButton$lambda$2(SelfieCaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.capture();
        this$0.getViewModel().trackCaptureShutterClicked();
    }

    private final void setupConfirmationButtons() {
        getBinding().confirmationButtons.setListener$onfido_capture_sdk_core_release(this);
    }

    private final void setupOverlayView() {
        if (this._overlayView != null) {
            getBinding().contentLayout.removeView(getOverlayView());
        }
        OverlayView root = OnfidoViewOverlayFaceBinding.inflate(getLayoutInflater(), getBinding().contentLayout, false).getRoot();
        root.setUp(CaptureType.FACE, this);
        OverlayView.setColorOutsideOverlay$default(root, getBackgroundColorCaptureScreen(), false, 2, null);
        ViewExtensionsKt.runOnMeasured(root, new SelfieCaptureFragment$setupOverlayView$1$1(this));
        this._overlayView = root;
        getBinding().overlayTextContainer.setSelfieCaptureOverlayText$onfido_capture_sdk_core_release();
        getOverlayView().setIsProofOfAddress(false);
        getBinding().contentLayout.addView(getOverlayView());
    }

    private final void setupToolbar() {
        ContextUtilsKt.requireToolbarHost(this).enableImmersiveFragment();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        changeStatusBarColor(ContextUtilsKt.colorFromAttr(contextRequireContext, android.R.attr.colorPrimaryDark));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmationError(ErrorDescriptor descriptor) {
        CaptureConfirmationScreen confirmationScreen = getConfirmationScreen();
        if (confirmationScreen != null) {
            confirmationScreen.showError(descriptor);
        } else {
            setValidationBubbleContent(descriptor.getTitle(), descriptor.getSubtitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmationStep() {
        hideLoading();
        getViewModel().onConfirmationStepTracking$onfido_capture_sdk_core_release(getOrientation());
        if (getViewModel().isDarkModeEnabled()) {
            OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorConfirmationScreen(), false, 2, null);
        } else {
            updateColorsForConfirmationScreen();
        }
        showFaceConfirmationFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(int titleResId, int messageResId, Function1<? super DialogInterface, Unit> listener) {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(titleResId), messageResId, 0, (Integer) null, false, (Function1) null, (Function1) listener, 60, (Object) null);
    }

    private final void showFaceConfirmationFragment() {
        if (getConfirmationScreen() != null) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new FaceConfirmationFragment(), "FRAGMENT_TAG_CONFIRMATION").commit();
        FragmentContainerView fragmentContainer = getBinding().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        ViewExtensionsKt.toVisible$default(fragmentContainer, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(LoadingFragment.Companion.DialogMode dialogMode) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BaseActivity");
        ((BaseActivity) fragmentActivityRequireActivity).showLoadingDialog$onfido_capture_sdk_core_release(dialogMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCamera() {
        CameraFactory cameraFactory$onfido_capture_sdk_core_release = getCameraFactory$onfido_capture_sdk_core_release();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        CameraSourcePreview cameraSourcePreview = getBinding().cameraViewCamera1;
        PreviewView previewView = getBinding().cameraViewCameraX;
        CaptureType captureType = CaptureType.FACE;
        OverlayView overlayView = getOverlayView();
        Intrinsics.h(viewLifecycleOwner);
        OnfidoCamera onfidoCameraCreate = cameraFactory$onfido_capture_sdk_core_release.create(viewLifecycleOwner, cameraSourcePreview, previewView, overlayView, captureType);
        this.onfidoCamera = onfidoCameraCreate;
        if (onfidoCameraCreate != null) {
            onfidoCameraCreate.start(OnfidoCamera.CameraFacing.FRONT, new C21251());
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    private final void updateColorsForConfirmationScreen() {
        ContextUtilsKt.requireToolbarHost(this).setToolbarColor(R.attr.onfidoColorToolbarBackground, R.attr.onfidoColorContentToolbarTitle, R.attr.onfidoColorContentToolbarSubtitle, R.attr.onfidoColorToolbarIcon);
        OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorConfirmationScreen(), false, 2, null);
        getBinding().watermark.setDarkBackground();
    }

    private final void updateConfirmationImageTranslationAndScale() {
        if (getOnfidoRemoteConfig$onfido_capture_sdk_core_release().isFourByThreeEnabled()) {
            OverlayMetrics overlayMetrics = this.overlayMetrics;
            if (overlayMetrics == null) {
                Intrinsics.r("overlayMetrics");
                throw null;
            }
            float fCenterX = overlayMetrics.getVisibleCaptureRect().centerX();
            OverlayMetrics overlayMetrics2 = this.overlayMetrics;
            if (overlayMetrics2 == null) {
                Intrinsics.r("overlayMetrics");
                throw null;
            }
            float fCenterY = overlayMetrics2.getVisibleCaptureRect().centerY() - (getBinding().confirmationImage.getHeight() / 2);
            getBinding().confirmationImage.setTranslationX(fCenterX - (getBinding().confirmationImage.getWidth() / 2));
            getBinding().confirmationImage.setTranslationY(fCenterY);
            getBinding().confirmationImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
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
    public final OnfidoRemoteConfig getOnfidoRemoteConfig$onfido_capture_sdk_core_release() {
        OnfidoRemoteConfig onfidoRemoteConfig = this.onfidoRemoteConfig;
        if (onfidoRemoteConfig != null) {
            return onfidoRemoteConfig;
        }
        Intrinsics.r("onfidoRemoteConfig");
        throw null;
    }

    @NotNull
    public final AggregatedPerformanceAnalytics getPerformanceAnalytics$onfido_capture_sdk_core_release() {
        AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics = this.performanceAnalytics;
        if (aggregatedPerformanceAnalytics != null) {
            return aggregatedPerformanceAnalytics;
        }
        Intrinsics.r("performanceAnalytics");
        throw null;
    }

    @NotNull
    public final RuntimePermissionsManager getPermissionsManager$onfido_capture_sdk_core_release() {
        RuntimePermissionsManager runtimePermissionsManager = this.permissionsManager;
        if (runtimePermissionsManager != null) {
            return runtimePermissionsManager;
        }
        Intrinsics.r("permissionsManager");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public OnfidoImage getPreviewImage() {
        return this.previewImage;
    }

    @NotNull
    public final SelfieCaptureViewModel.Factory getViewModelFactory$onfido_capture_sdk_core_release() {
        SelfieCaptureViewModel.Factory factory = this.viewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("viewModelFactory");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureConfirmed() {
        OnfidoImage onfidoImage = this.previewImage;
        if (onfidoImage == null) {
            onCaptureDiscarded();
        } else {
            getViewModel().uploadSelfie(onfidoImage, false);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureDiscarded() {
        getViewModel().trackRetakeImage();
        openCaptureScreen();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        this._captureButtonBinding = null;
        this._dummyAccessibilityBinding = null;
        this._overlayView = null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.OverlayView.Listener
    public void onOverlayMetrics(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.overlayMetrics = overlayMetrics;
        RectF visibleCaptureRect = overlayMetrics.getVisibleCaptureRect();
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        captureLayoutAdjuster.adjustLayoutParams(false);
        setCaptureRegion(visibleCaptureRect);
        adjustDummyAccessibilityView(overlayMetrics.getVisibleCaptureRect());
    }

    public final void onPictureCaptured(@NotNull OnfidoImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getViewModel().onPictureCaptured();
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        onfidoCamera.stop();
        applyValidations(image);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!getPermissionsManager$onfido_capture_sdk_core_release().hasPermission("android.permission.CAMERA")) {
            FragmentKt.setFragmentResult(this, "capture_missing_permissions", BundleKt.bundleOf(new Pair("capture_missing_permissions_capture_type", CaptureType.FACE)));
        } else if (getConfirmationScreen() == null) {
            setupOverlayView();
            setColorsForCaptureScreen();
            setupCaptureButton();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public void onRetakeSelfieButtonClick() {
        onCaptureDiscarded();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setupToolbar();
        getViewModel().trackCapture$onfido_capture_sdk_core_release(getOrientation());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ContextUtilsKt.requireToolbarHost(this).disableImmersiveFragment();
        ContextUtilsKt.requireToolbarHost(this).resetToolbar();
        if (this.isCameraViewInitialised && getConfirmationScreen() == null) {
            OverlayView.resetFaceDetectedState$default(getOverlayView(), false, false, false, 2, null);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public void onUploadSelfieButtonClick() {
        OnfidoCaptureValidationBubble postCaptureValidationBubble = getBinding().postCaptureValidationBubble;
        Intrinsics.checkNotNullExpressionValue(postCaptureValidationBubble, "postCaptureValidationBubble");
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(postCaptureValidationBubble, OnfidoCaptureValidationBubble.VisibilityCommand.Gone.INSTANCE, false, 2, null);
        OnfidoImage onfidoImage = this.previewImage;
        if (onfidoImage == null) {
            onCaptureDiscarded();
        } else {
            getViewModel().uploadSelfie(onfidoImage, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        this._binding = OnfidoFragmentSelfieCaptureBinding.bind(view);
        if (savedInstanceState != null) {
            closeConfirmationScreen();
        }
        inflateCaptureButton();
        inflateDummyAccessibilityView();
        initLayoutAdjuster();
        initValidationBubbleDelegate();
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment.onViewCreated.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (SelfieCaptureFragment.this.getConfirmationScreen() != null) {
                    SelfieCaptureFragment.this.onCaptureDiscarded();
                } else {
                    SelfieCaptureFragment.this.finishWithResult(SelfieCaptureScreen.SelfieCaptureResult.Back.INSTANCE);
                }
            }
        });
        getBinding().confirmationButtons.setFaceCapture();
        getBinding().confirmationImage.setOnTouchListener(null);
        observeViewModel();
        e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener
    public void onWorkflowToolbarUpdated() {
        if (getConfirmationScreen() != null) {
            updateColorsForConfirmationScreen();
        } else {
            setColorsForCaptureScreen();
        }
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

    public final void setOnfidoRemoteConfig$onfido_capture_sdk_core_release(@NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "<set-?>");
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    public final void setPerformanceAnalytics$onfido_capture_sdk_core_release(@NotNull AggregatedPerformanceAnalytics aggregatedPerformanceAnalytics) {
        Intrinsics.checkNotNullParameter(aggregatedPerformanceAnalytics, "<set-?>");
        this.performanceAnalytics = aggregatedPerformanceAnalytics;
    }

    public final void setPermissionsManager$onfido_capture_sdk_core_release(@NotNull RuntimePermissionsManager runtimePermissionsManager) {
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "<set-?>");
        this.permissionsManager = runtimePermissionsManager;
    }

    public final void setViewModelFactory$onfido_capture_sdk_core_release(@NotNull SelfieCaptureViewModel.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.viewModelFactory = factory;
    }
}
