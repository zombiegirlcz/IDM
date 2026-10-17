package com.onfido.android.sdk.capture.ui.camera;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.view.PreviewView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.imageview.ShapeableImageView;
import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.common.cryptography.PayloadHelper;
import com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoViewDocumentFormatSelectionBinding;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionRect;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionResult;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifact;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifactKt;
import com.onfido.android.sdk.capture.internal.performance.domain.PerformanceAnalyticsScreen;
import com.onfido.android.sdk.capture.internal.performance.trackers.PerformanceEvents;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.android.sdk.capture.ui.BaseActivity;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.ZoomImageView;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.onfido.android.sdk.capture.ui.camera.capture.PhotoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotAvailableException;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotFoundException;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragment;
import com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView;
import com.onfido.android.sdk.capture.ui.camera.util.CaptureActivityLayoutAdjuster;
import com.onfido.android.sdk.capture.ui.camera.util.IntentHelper;
import com.onfido.android.sdk.capture.ui.camera.util.ValidationBubblesOffsetDelegate;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel;
import com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.AccessibilityExtensionsKt;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.FileUtils;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.OnfidoConfigExtensionsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.StringExtensionsKt;
import com.onfido.android.sdk.capture.utils.StringRepresentation;
import com.onfido.android.sdk.capture.utils.ToolbarExtensionsKt;
import com.onfido.android.sdk.capture.utils.ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1;
import com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewUtil;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.token.TokenProvider;
import gim.i;
import igm.g;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.j;
import yhm.o;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000ð\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u008b\u00042\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u008b\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u000bH\u0014¢\u0006\u0004\b \u0010\bJ\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\bJ\u000f\u0010\"\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u0019\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000bH\u0016¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\bJ\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u0010\bJ\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010\bJ\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010\bJ\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\bJ\u0017\u0010;\u001a\u00020\u000b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\bJ\u000f\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\bJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u000bH\u0016¢\u0006\u0004\bM\u0010\bJ\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020\u001aH\u0014¢\u0006\u0004\bO\u0010\u001dJ\u000f\u0010P\u001a\u00020\u000bH\u0014¢\u0006\u0004\bP\u0010\bJ\u000f\u0010T\u001a\u00020QH\u0010¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020\u000bH\u0017¢\u0006\u0004\bU\u0010\bJ9\u0010^\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020I2\u0006\u0010W\u001a\u00020I2\u0006\u0010Y\u001a\u00020X2\u0006\u0010[\u001a\u00020Z2\b\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020IH\u0016¢\u0006\u0004\ba\u0010LJ9\u0010e\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020I2\u0006\u0010E\u001a\u00020D2\u0006\u0010b\u001a\u00020Q2\u0006\u0010`\u001a\u00020I2\b\u0010d\u001a\u0004\u0018\u00010cH\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\u000b2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010m\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010\bJ\u0017\u0010r\u001a\u00020\u000b2\u0006\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\br\u0010sJ\u0017\u0010v\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020tH\u0007¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0016¢\u0006\u0004\bx\u0010\bJ\u0017\u0010z\u001a\u00020\u000b2\u0006\u0010y\u001a\u00020QH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020QH\u0016¢\u0006\u0004\b}\u0010{J\u000f\u0010~\u001a\u00020\u000bH\u0016¢\u0006\u0004\b~\u0010\bJ\u000f\u0010\u007f\u001a\u00020QH\u0016¢\u0006\u0004\b\u007f\u0010SJ\u0011\u0010\u0080\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\bJ\u0011\u0010\u0081\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0081\u0001\u0010\bJ\u0011\u0010\u0082\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0082\u0001\u0010\bJ\u0011\u0010\u0083\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0083\u0001\u0010\bJ\u0011\u0010\u0084\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\bJ\u0011\u0010\u0085\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\bJ\u0011\u0010\u0086\u0001\u001a\u00020\u000bH\u0017¢\u0006\u0005\b\u0086\u0001\u0010\bJ\u0011\u0010\u0087\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0087\u0001\u0010\bJ\u0011\u0010\u0088\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0088\u0001\u0010\bJ\u0019\u0010\u0089\u0001\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020tH\u0016¢\u0006\u0005\b\u0089\u0001\u0010wJ\u0011\u0010\u008a\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\bJ\u0019\u0010\u008b\u0001\u001a\u00020\u000b2\u0006\u00103\u001a\u00020QH\u0016¢\u0006\u0005\b\u008b\u0001\u0010{J\u0011\u0010\u008c\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008c\u0001\u0010\bJ\u0011\u0010\u008d\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008d\u0001\u0010\bJ%\u0010\u0091\u0001\u001a\u00020\u000b2\u0007\u0010\u008e\u0001\u001a\u00020I2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0005\b\u0093\u0001\u0010\bJ\u0011\u0010\u0094\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0094\u0001\u0010\bJ\u0011\u0010\u0095\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0095\u0001\u0010\bJ\u0011\u0010\u0096\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0096\u0001\u0010\bJ\u001c\u0010\u0099\u0001\u001a\u00020\u000b2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u001a\u0010\u009c\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020QH\u0016¢\u0006\u0005\b\u009c\u0001\u0010{J\u001a\u0010\u009d\u0001\u001a\u00020\u000b2\u0007\u0010\u009b\u0001\u001a\u00020QH\u0016¢\u0006\u0005\b\u009d\u0001\u0010{J\u0011\u0010\u009e\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u009e\u0001\u0010\bJ\u001c\u0010¡\u0001\u001a\u00020\u000b2\b\u0010 \u0001\u001a\u00030\u009f\u0001H\u0016¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001c\u0010¥\u0001\u001a\u00020\u000b2\b\u0010¤\u0001\u001a\u00030£\u0001H\u0016¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b§\u0001\u0010\bJ\u0011\u0010¨\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¨\u0001\u0010\bJ\u0011\u0010©\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b©\u0001\u0010\bJ\u0011\u0010ª\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bª\u0001\u0010\bJ\u0011\u0010«\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b«\u0001\u0010\bJ*\u0010¬\u0001\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020I2\u0006\u0010`\u001a\u00020I2\u0006\u0010d\u001a\u00020cH\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J*\u0010®\u0001\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020I2\u0006\u0010`\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010²\u0001\u001a\u00020\u000b2\b\u0010±\u0001\u001a\u00030°\u0001H\u0016¢\u0006\u0006\b²\u0001\u0010³\u0001J&\u0010·\u0001\u001a\u00020\u000b2\b\u0010µ\u0001\u001a\u00030´\u00012\b\u0010¶\u0001\u001a\u00030´\u0001H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001JA\u0010¾\u0001\u001a\u00020\u000b2\n\b\u0001\u0010¹\u0001\u001a\u00030´\u00012\n\b\u0001\u0010º\u0001\u001a\u00030´\u00012\u0015\u0010½\u0001\u001a\u0010\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020\u000b0»\u0001H\u0016¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u0011\u0010Á\u0001\u001a\u00020\u000bH\u0010¢\u0006\u0005\bÀ\u0001\u0010\bJ$\u0010Ä\u0001\u001a\u00020\u000b2\u0006\u0010u\u001a\u00020t2\b\u0010Ã\u0001\u001a\u00030Â\u0001H\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001a\u0010Ç\u0001\u001a\u00020\u000b2\u0007\u0010Æ\u0001\u001a\u00020IH\u0016¢\u0006\u0005\bÇ\u0001\u0010LJ\u0014\u0010È\u0001\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u0011\u0010Ê\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bÊ\u0001\u0010\bJ\u0011\u0010Ë\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bË\u0001\u0010\bJ\u0011\u0010Ì\u0001\u001a\u00020QH\u0002¢\u0006\u0005\bÌ\u0001\u0010SJ\u0011\u0010Í\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÍ\u0001\u0010\bJ\u001c\u0010Ð\u0001\u001a\u00020\u000b2\b\u0010Ï\u0001\u001a\u00030Î\u0001H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0011\u0010Ò\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÒ\u0001\u0010\bJ\u0011\u0010Ó\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÓ\u0001\u0010\bJ\u0011\u0010Ô\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÔ\u0001\u0010\bJ\u0011\u0010Õ\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÕ\u0001\u0010\bJ\u0013\u0010×\u0001\u001a\u00030Ö\u0001H\u0002¢\u0006\u0006\b×\u0001\u0010Ø\u0001J\u001c\u0010Û\u0001\u001a\u00020\u000b2\b\u0010Ú\u0001\u001a\u00030Ù\u0001H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0011\u0010Ý\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÝ\u0001\u0010\bJ\u0011\u0010Þ\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bÞ\u0001\u0010\bJ\u0011\u0010ß\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bß\u0001\u0010\bJ\u0011\u0010à\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bà\u0001\u0010\bJ\u0011\u0010á\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bá\u0001\u0010\bJ'\u0010ã\u0001\u001a\u00020\u000b2\b\u0010Ú\u0001\u001a\u00030Ù\u00012\t\u0010â\u0001\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0006\bã\u0001\u0010ä\u0001J'\u0010å\u0001\u001a\u00020\u000b2\b\u0010Ú\u0001\u001a\u00030Ù\u00012\t\u0010â\u0001\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0006\bå\u0001\u0010ä\u0001J\u001c\u0010ç\u0001\u001a\u00020\u000b2\b\u0010æ\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001c\u0010ê\u0001\u001a\u00020\u000b2\b\u0010é\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bê\u0001\u0010è\u0001J\u001c\u0010ë\u0001\u001a\u00020\u000b2\b\u0010é\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bë\u0001\u0010è\u0001J\u001c\u0010í\u0001\u001a\u00020\u000b2\b\u0010ì\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bí\u0001\u0010è\u0001J\u001c\u0010î\u0001\u001a\u00020\u000b2\b\u0010ì\u0001\u001a\u00030Â\u0001H\u0002¢\u0006\u0006\bî\u0001\u0010è\u0001J\u0011\u0010ï\u0001\u001a\u00020QH\u0002¢\u0006\u0005\bï\u0001\u0010SJ\u001e\u0010ñ\u0001\u001a\u00030ð\u00012\t\u0010â\u0001\u001a\u0004\u0018\u00010ZH\u0002¢\u0006\u0006\bñ\u0001\u0010ò\u0001J*\u0010õ\u0001\u001a\u00020Q*\u0004\u0018\u00010Z2\u0007\u0010ó\u0001\u001a\u00020Z2\u0007\u0010ô\u0001\u001a\u00020\\H\u0002¢\u0006\u0006\bõ\u0001\u0010ö\u0001J\u001b\u0010÷\u0001\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0005\b÷\u0001\u0010\u001dJ\u0011\u0010ø\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\bø\u0001\u0010\bJ\u0011\u0010ù\u0001\u001a\u00020AH\u0002¢\u0006\u0005\bù\u0001\u0010CJ\u001b\u0010û\u0001\u001a\u00030ú\u00012\u0006\u0010h\u001a\u00020gH\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J'\u0010\u0080\u0002\u001a\u00030ÿ\u00012\b\u0010ì\u0001\u001a\u00030Â\u00012\b\u0010þ\u0001\u001a\u00030ý\u0001H\u0002¢\u0006\u0006\b\u0080\u0002\u0010\u0081\u0002J\u001c\u0010\u0084\u0002\u001a\u00020\u000b2\b\u0010\u0083\u0002\u001a\u00030\u0082\u0002H\u0002¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J$\u0010\u0088\u0002\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0087\u0002\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0086\u0002H\u0002¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J1\u0010\u008d\u0002\u001a\u00030\u008c\u00022\u0006\u0010u\u001a\u00020t2\b\u0010\u008a\u0002\u001a\u00030Â\u00012\n\b\u0002\u0010\u008b\u0002\u001a\u00030´\u0001H\u0002¢\u0006\u0006\b\u008d\u0002\u0010\u008e\u0002J\u0011\u0010\u008f\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008f\u0002\u0010\bJ\u0011\u0010\u0090\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0090\u0002\u0010\bJ!\u0010\u0094\u0002\u001a\u00020\u000b2\r\u0010\u0093\u0002\u001a\b0\u0091\u0002j\u0003`\u0092\u0002H\u0002¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001a\u0010\u0097\u0002\u001a\u00020\u000b2\u0007\u0010\u0096\u0002\u001a\u00020IH\u0002¢\u0006\u0005\b\u0097\u0002\u0010LJ\u001c\u0010\u0099\u0002\u001a\u00020\u000b2\b\u0010\u0098\u0002\u001a\u00030¼\u0001H\u0002¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J\u0011\u0010\u009b\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u009b\u0002\u0010\bJ\u001a\u0010\u009d\u0002\u001a\u00020\u000b2\u0007\u0010\u009c\u0002\u001a\u00020QH\u0002¢\u0006\u0005\b\u009d\u0002\u0010{J\u001a\u0010\u009f\u0002\u001a\u00020\u000b2\u0007\u0010\u009e\u0002\u001a\u00020tH\u0002¢\u0006\u0005\b\u009f\u0002\u0010wJ\u0011\u0010 \u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b \u0002\u0010\bJ\u001c\u0010¡\u0002\u001a\u00020\u000b2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b¡\u0002\u0010\u009a\u0001J\u001c\u0010¢\u0002\u001a\u00020\u000b2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b¢\u0002\u0010\u009a\u0001J\u0013\u0010¤\u0002\u001a\u00030£\u0002H\u0002¢\u0006\u0006\b¤\u0002\u0010¥\u0002J,\u0010¨\u0002\u001a\u00020\u000b2\n\b\u0001\u0010¦\u0002\u001a\u00030´\u00012\f\b\u0003\u0010§\u0002\u001a\u0005\u0018\u00010´\u0001H\u0002¢\u0006\u0006\b¨\u0002\u0010©\u0002J!\u0010«\u0002\u001a\u00020Q*\u00030£\u00012\b\u0010ª\u0002\u001a\u00030ÿ\u0001H\u0002¢\u0006\u0006\b«\u0002\u0010¬\u0002J\u0013\u0010\u00ad\u0002\u001a\u00030´\u0001H\u0002¢\u0006\u0006\b\u00ad\u0002\u0010®\u0002J\u0011\u0010¯\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b¯\u0002\u0010\bJ\u0011\u0010°\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b°\u0002\u0010\bJ\u0011\u0010±\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b±\u0002\u0010\bJ\u0011\u0010²\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b²\u0002\u0010\bJB\u0010·\u0002\u001a\u00020\u000b2\n\b\u0001\u0010³\u0002\u001a\u00030´\u00012\n\b\u0001\u0010´\u0002\u001a\u00030´\u00012\n\b\u0001\u0010µ\u0002\u001a\u00030´\u00012\n\b\u0001\u0010¶\u0002\u001a\u00030´\u0001H\u0002¢\u0006\u0006\b·\u0002\u0010¸\u0002J \u0010º\u0002\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010¹\u0002\u001a\u00030´\u0001H\u0002¢\u0006\u0006\bº\u0002\u0010»\u0002J\u001e\u0010¼\u0002\u001a\u00020\u000b2\n\b\u0001\u0010¹\u0002\u001a\u00030´\u0001H\u0002¢\u0006\u0006\b¼\u0002\u0010½\u0002J\u0011\u0010¾\u0002\u001a\u00020\u000bH\u0002¢\u0006\u0005\b¾\u0002\u0010\bJ+\u0010¿\u0002\u001a\u00030ú\u00012\u0006\u0010V\u001a\u00020I2\u0006\u0010`\u001a\u00020I2\u0006\u0010b\u001a\u00020QH\u0002¢\u0006\u0006\b¿\u0002\u0010À\u0002R*\u0010Â\u0002\u001a\u00030Á\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bÂ\u0002\u0010Ã\u0002\u001a\u0006\bÄ\u0002\u0010Å\u0002\"\u0006\bÆ\u0002\u0010Ç\u0002R\u0018\u0010É\u0002\u001a\u00030È\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Ê\u0002R\u001a\u0010Ì\u0002\u001a\u00030Ë\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÌ\u0002\u0010Í\u0002R\u001a\u0010Ï\u0002\u001a\u00030Î\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u0017\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b:\u0010Ñ\u0002R\u001a\u0010Ò\u0002\u001a\u00030ð\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002R\u001c\u0010Õ\u0002\u001a\u0005\u0018\u00010Ô\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0002\u0010Ö\u0002R\u001a\u0010Ø\u0002\u001a\u00030×\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Û\u0002\u001a\u00030Ú\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u001a\u0010Ý\u0002\u001a\u00030×\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÝ\u0002\u0010Ù\u0002R\u0019\u0010Þ\u0002\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u001c\u0010á\u0002\u001a\u0005\u0018\u00010à\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R,\u0010ä\u0002\u001a\u0005\u0018\u00010ã\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bä\u0002\u0010å\u0002\u001a\u0006\bæ\u0002\u0010ç\u0002\"\u0006\bè\u0002\u0010é\u0002R\u001a\u0010ë\u0002\u001a\u00030ê\u00028\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bë\u0002\u0010ì\u0002R\u0018\u0010î\u0002\u001a\u00030í\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0002\u0010ï\u0002R\u0018\u0010ñ\u0002\u001a\u00030ð\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bñ\u0002\u0010ò\u0002R*\u0010ô\u0002\u001a\u00030ó\u00028\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bô\u0002\u0010õ\u0002\u001a\u0006\bö\u0002\u0010÷\u0002\"\u0006\bø\u0002\u0010ù\u0002R*\u0010û\u0002\u001a\u00030ú\u00028\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bû\u0002\u0010ü\u0002\u001a\u0006\bý\u0002\u0010þ\u0002\"\u0006\bÿ\u0002\u0010\u0080\u0003R*\u0010\u0082\u0003\u001a\u00030\u0081\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0082\u0003\u0010\u0083\u0003\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003\"\u0006\b\u0086\u0003\u0010\u0087\u0003R*\u0010\u0089\u0003\u001a\u00030\u0088\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0089\u0003\u0010\u008a\u0003\u001a\u0006\b\u008b\u0003\u0010\u008c\u0003\"\u0006\b\u008d\u0003\u0010\u008e\u0003R*\u0010\u0090\u0003\u001a\u00030\u008f\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0090\u0003\u0010\u0091\u0003\u001a\u0006\b\u0092\u0003\u0010\u0093\u0003\"\u0006\b\u0094\u0003\u0010\u0095\u0003R*\u0010\u0097\u0003\u001a\u00030\u0096\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0097\u0003\u0010\u0098\u0003\u001a\u0006\b\u0099\u0003\u0010\u009a\u0003\"\u0006\b\u009b\u0003\u0010\u009c\u0003R*\u0010\u009e\u0003\u001a\u00030\u009d\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u009e\u0003\u0010\u009f\u0003\u001a\u0006\b \u0003\u0010¡\u0003\"\u0006\b¢\u0003\u0010£\u0003R*\u0010¥\u0003\u001a\u00030¤\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¥\u0003\u0010¦\u0003\u001a\u0006\b§\u0003\u0010¨\u0003\"\u0006\b©\u0003\u0010ª\u0003R*\u0010¬\u0003\u001a\u00030«\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¬\u0003\u0010\u00ad\u0003\u001a\u0006\b®\u0003\u0010¯\u0003\"\u0006\b°\u0003\u0010±\u0003R*\u0010³\u0003\u001a\u00030²\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b³\u0003\u0010´\u0003\u001a\u0006\bµ\u0003\u0010¶\u0003\"\u0006\b·\u0003\u0010¸\u0003R*\u0010º\u0003\u001a\u00030¹\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bº\u0003\u0010»\u0003\u001a\u0006\b¼\u0003\u0010½\u0003\"\u0006\b¾\u0003\u0010¿\u0003R*\u0010Á\u0003\u001a\u00030À\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÁ\u0003\u0010Â\u0003\u001a\u0006\bÃ\u0003\u0010Ä\u0003\"\u0006\bÅ\u0003\u0010Æ\u0003R*\u0010È\u0003\u001a\u00030Ç\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÈ\u0003\u0010É\u0003\u001a\u0006\bÊ\u0003\u0010Ë\u0003\"\u0006\bÌ\u0003\u0010Í\u0003R*\u0010Ï\u0003\u001a\u00030Î\u00038\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÏ\u0003\u0010Ð\u0003\u001a\u0006\bÑ\u0003\u0010Ò\u0003\"\u0006\bÓ\u0003\u0010Ô\u0003R\u001a\u0010Ö\u0003\u001a\u00030Õ\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÖ\u0003\u0010×\u0003R\u001a\u0010Ù\u0003\u001a\u00030Ø\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÙ\u0003\u0010Ú\u0003R\u0019\u0010Û\u0003\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0003\u0010ß\u0002R\u001b\u0010Ü\u0003\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0003\u0010Ý\u0003R)\u0010ß\u0003\u001a\u00020Q2\u0007\u0010Þ\u0003\u001a\u00020Q8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\bß\u0003\u0010ß\u0002\u001a\u0005\bß\u0003\u0010SR\u0019\u0010à\u0003\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0003\u0010ß\u0002R!\u0010æ\u0003\u001a\u00030á\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bâ\u0003\u0010ã\u0003\u001a\u0006\bä\u0003\u0010å\u0003R!\u0010ë\u0003\u001a\u00030ç\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bè\u0003\u0010ã\u0003\u001a\u0006\bé\u0003\u0010ê\u0003R\u0019\u0010â\u0001\u001a\u0004\u0018\u00010Z8VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0003\u0010í\u0003R\u0019\u0010ð\u0003\u001a\u0004\u0018\u00010\\8VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0003\u0010ï\u0003R\u0018\u0010ô\u0003\u001a\u00030ñ\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bò\u0003\u0010ó\u0003R\u0018\u0010Ú\u0001\u001a\u00030Ù\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bõ\u0003\u0010ö\u0003R\u0016\u0010Y\u001a\u00020X8VX\u0096\u0004¢\u0006\b\u001a\u0006\b÷\u0003\u0010ø\u0003R\u0018\u0010ü\u0003\u001a\u00030ù\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bú\u0003\u0010û\u0003R\u0019\u0010ÿ\u0003\u001a\u0004\u0018\u00010I8BX\u0082\u0004¢\u0006\b\u001a\u0006\bý\u0003\u0010þ\u0003R\u0016\u0010\u0081\u0004\u001a\u00020A8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0004\u0010CR\u0016\u0010\u0082\u0004\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0004\u0010SR\u001a\u0010\u0086\u0004\u001a\u0005\u0018\u00010\u0083\u00048BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0084\u0004\u0010\u0085\u0004R\u0018\u0010\u0088\u0004\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0004\u0010®\u0002R\u0018\u0010\u008a\u0004\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0004\u0010®\u0002¨\u0006\u008c\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CaptureActivity;", "Lcom/onfido/android/sdk/capture/ui/BaseActivity;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/LivenessOverlayView$ChallengesListener;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$Listener;", "Lcom/onfido/android/sdk/capture/ui/camera/face/FaceConfirmationFragmentContainer;", "<init>", "()V", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "livenessChallengeViewModel", "", "onNextChallenge", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;)V", "removeDummyViewsAccessibility", "makeToolbarTitleNotImportantForAccessibility", "hideLivenessControlButton", "showLivenessButtonAndFocusWithDelay", "onFaceTrackingTimeout", "onChallengesCompleted", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;", "screenState", "onChallengeLoadingViewStateChanged", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView$ScreenState;)V", "onChallengesErrorBackPressed", "destroyWithCanceledResult", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "showDocumentFormatDialog", "onStart", "onResume", "onPause", "onStop", "setOverlay", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setSupportActionBar", "(Landroidx/appcompat/widget/Toolbar;)V", "onLivenessChallengeFinished", "onErrorObservingHeadTurnResults", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;", "content", "setLiveValidationBubbleContent", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;)V", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "command", "setLiveValidationBubbleVisibilityCommand", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;)V", "resetDocumentRecordingState", "playSingleFrameAutoCapturedAnimation", "setupConfirmationButtons", "setGlareWarningContent", "deactivateCaptureButton", "setupCaptureButton", "onManualFallbackDelayFinished", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetrics", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "Ljava/io/File;", "getCapturedFilesDir", "()Ljava/io/File;", "hideDocumentOverlay", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "getCaptureStepDataBundle", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "errorType", "onUploadError", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "onTokenExpired", "", "message", "onInvalidCertificateDetected", "(Ljava/lang/String;)V", "setupUploadService", "outState", "onSaveInstanceState", "onDestroy", "", "onToolbarBackEvent$onfido_capture_sdk_core_release", "()Z", "onToolbarBackEvent", "onBackPressed", "documentId", "videoPath", "Lcom/onfido/api/client/data/DocSide;", "docSide", "Lcom/onfido/android/sdk/capture/DocumentType;", "docType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "issuingCountry", "uploadVideo", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "documentVideoId", "onDocumentVideoUploaded", "nfcSupported", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcProperties", "onWarningBinaryResult", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ErrorType;ZLjava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "Lcom/onfido/api/client/data/LivePhotoUpload;", "photoUpload", "onLivePhotoUploaded", "(Lcom/onfido/api/client/data/LivePhotoUpload;)V", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "dialogMode", "showDialog", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "hideLoading", "Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;", "destination", "trackNavigationCompleted", "(Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;)V", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "onPictureCaptured", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "startDocumentVideoRecording", "isStartedManually", "startLivenessVideoRecording", "(Z)V", "isEnabled", "enableTorch", "stopCamera", "hasValidRecording", "startCamera", "showVideoRecordingProgressBar", "hideVideoRecordingProgressBar", "showVideoRecordingInProgressMessage", "showVideoRecordingCompleteMessage", "finishWithResultExitUserFlow", "onDocumentVideoRecordingCompleted", "showVideoRecordCompletionTick", "showConfirmationPreview", "applyValidations", "onImageProcessingFinished", "capture", "restart", "recreate", "dirPath", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "performedChallanges", "showFaceLivenessConfirmationScreen", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;)V", "onVideoTimeoutExceeded", "onFaceOutTimeout", "cancelFlow", "onStorageThresholdReached", "", "jpegData", "uploadImage", "([B)V", "isGenericMessage", "setConfirmationButtons", "setWarningConfirmationButtons", "setForceRetryButton", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "descriptor", "showError", "(Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;)V", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "faceDetectionResult", "onFaceDetected", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;)V", "onFaceDetectionTimeout", "showConfirmationStep", "openCaptureScreen", "displayCaptureButton", "hideCaptureButton", "onNfcPropertiesFetched", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "onDocumentCreated", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "result", "onAccessibleCaptureRectangleDetectionResult", "(Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;)V", "", "mainTextResId", "mainTextContentDescriptionResId", "onAccessibleCaptureDocumentOverlayTextChanged", "(II)V", "titleResId", "messageResId", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "listener", "showErrorMessage", "(IILkotlin/jvm/functions/Function1;)V", "onStopDuringExitWhenSentToBackgroundMode$onfido_capture_sdk_core_release", "onStopDuringExitWhenSentToBackgroundMode", "Landroid/graphics/RectF;", "visibleRect", "onCaptureForProofOfAddressDone", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;Landroid/graphics/RectF;)V", "fileName", "onPoaImageCroppedAndSavedToFile", "getPreviewImage", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "onUploadSelfieButtonClick", "onRetakeSelfieButtonClick", "hasOnfidoConfig", "onCameraStarted", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "livenessChallengesViewModel", "onChallengesAvailable", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;)V", "initDocumentTypeUIModel", "initDocumentFormat", "onCardFormatSelected", "onFoldedFormatSelected", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "getCameraFace", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraFacing;", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "captureType", "inflateCaptureButton", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;)V", "inflateDummyAccessibilityView", "onStartLiveness", "setupPresenter", "runDocAutoCaptureAccessiblityEvents", "trackAutocaptureShutterButtonClick", "documentType", "setupOverlayView", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/android/sdk/capture/DocumentType;)V", "updateOverlayView", "visibleCaptureRect", "adjustDummyAccessibilityView", "(Landroid/graphics/RectF;)V", "captureRect", "setLivenessOverlayMargin", "setVideoRecordingIndicatorMargin", "rect", "setCaptureRegion", "showDocumentOverlay", "shouldShowPassportOverlay", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "inflateOverlayView", "(Lcom/onfido/android/sdk/capture/DocumentType;)Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "type", "country", "isFolded", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "recoverStateFrom", "closeConfirmationScreen", "captureStepDataBundleForDoc", "Landroid/content/Intent;", "getLivePhotoUploadResultIntent", "(Lcom/onfido/api/client/data/LivePhotoUpload;)Landroid/content/Intent;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;", "cropRect", "Lcom/onfido/android/sdk/capture/ui/camera/Frame;", "limitRect", "(Landroid/graphics/RectF;Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage$CropRect;)Lcom/onfido/android/sdk/capture/ui/camera/Frame;", "", "frame", "onNextFrame", "(Ljava/lang/Object;)V", "Lkotlin/Function0;", "videoRecordingStarted", "startVideoRecording", "(Lkotlin/jvm/functions/Function0;)V", "outerLimits", "rotation", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "createDocumentDetectionFrame", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;Landroid/graphics/RectF;I)Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "onCameraUnavailable", "onCameraNotFound", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "finishActivityWithException", "(Ljava/lang/Exception;)V", "filePath", "onVideoCaptured", "dialog", "onVideoTimeoutRetryClick", "(Landroid/content/DialogInterface;)V", "onVideoCanceled", "visible", "setConfirmationStepVisibility", "onfidoImage", "setImagePreview", "updateConfirmationImageTranslationAndScale", "uploadSelfieForValidation", "uploadDocument", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "getSdkUploadMetadata", "()Lcom/onfido/api/client/data/SdkUploadMetaData;", "title", "subtitle", "setValidationBubbleContent", "(ILjava/lang/Integer;)V", "ovalFrame", "isInsideOval", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;Lcom/onfido/android/sdk/capture/ui/camera/Frame;)Z", "getCaptureButtonContentDescription", "()I", "showFaceConfirmationFragment", "setCaptureFrameContentDescriptionAndTitle", "updateColorsForConfirmationScreen", "setColorsForCaptureScreen", "toolbarBackgroundColor", "toolbarTitleColor", "toolbarSubtitleColor", "screenBackgroundColor", "updateColors", "(IIII)V", "color", "changeBackArrowColor", "(I)Lkotlin/Unit;", "changeStatusBarColor", "(I)V", "breakIfDocTypeMissing", "getDocumentResultIntent", "(Ljava/lang/String;Ljava/lang/String;Z)Landroid/content/Intent;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoActivityCaptureBinding;", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoActivityCaptureBinding;", "getBinding$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoActivityCaptureBinding;", "setBinding$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/databinding/OnfidoActivityCaptureBinding;)V", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "captureUploadService", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "onfidoCamera", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "livenessChallengesLoadingView", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/loading/LivenessChallengesLoadingView;", "Landroid/view/View;", "captureButton", "Landroid/view/View;", "Lcom/onfido/android/sdk/capture/ui/widget/OnfidoButton;", "livenessControlButton", "Lcom/onfido/android/sdk/capture/ui/widget/OnfidoButton;", "dummyView", "hasOngoingCaptureRequest", "Z", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "recorder", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "documentFormat", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "getDocumentFormat", "()Lcom/onfido/android/sdk/capture/DocumentFormat;", "setDocumentFormat", "(Lcom/onfido/android/sdk/capture/DocumentFormat;)V", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "documentTypeUIModel", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "glareBubbleRunnable", "Ljava/lang/Runnable;", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "presenter", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "getPresenter$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "setPresenter$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;)V", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "onfidoApiService", "Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "getOnfidoApiService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/network/OnfidoApiService;", "setOnfidoApiService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/network/OnfidoApiService;)V", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "vibratorService", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "getVibratorService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "setVibratorService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/VibratorService;)V", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "getSchedulersProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "setSchedulersProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "screenLoadTracker", "Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "getScreenLoadTracker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "setScreenLoadTracker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;)V", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "getOnfidoRemoteConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "setOnfidoRemoteConfig$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;", "cryptography", "Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;", "getCryptography$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;", "setCryptography$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/cryptography/Cryptography;)V", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "payloadHelper", "Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "getPayloadHelper$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;", "setPayloadHelper$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/cryptography/PayloadHelper;)V", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "cameraFactory", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "getCameraFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "setCameraFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;)V", "Lcom/onfido/api/client/token/TokenProvider;", "tokenProvider", "Lcom/onfido/api/client/token/TokenProvider;", "getTokenProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/api/client/token/TokenProvider;", "setTokenProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/api/client/token/TokenProvider;)V", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "environmentIntegrityChecker", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "getEnvironmentIntegrityChecker$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "setEnvironmentIntegrityChecker$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;)V", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "dispatchersProvider", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "getDispatchersProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "setDispatchersProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;)V", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster;", "captureActivityLayoutAdjuster", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster;", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "validationBubbleOffsetDelegate", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "isCameraViewInitialised", "previewImage", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "<set-?>", "isOnConfirmationStep", "wasConfirmationNotShown", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "frameSubscription$delegate", "Lkotlin/Lazy;", "getFrameSubscription", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "frameSubscription", "Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "userExitFlowMenuProvider$delegate", "getUserExitFlowMenuProvider", "()Lcom/onfido/android/sdk/capture/utils/UserExitFlowMenuProvider;", "userExitFlowMenuProvider", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "getGenericDocPages", "()Lcom/onfido/android/sdk/capture/document/DocumentPages;", "genericDocPages", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getDocSide", "()Lcom/onfido/api/client/data/DocSide;", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "getScreenOrientation", "()Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "screenOrientation", "getGenericDocTitle", "()Ljava/lang/String;", "genericDocTitle", "getDocumentData", "documentData", "isDocumentFrontSide", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureConfirmationScreen;", "getCaptureConfirmationScreen", "()Lcom/onfido/android/sdk/capture/ui/camera/CaptureConfirmationScreen;", "captureConfirmationScreen", "getBackgroundColorCaptureScreen", "backgroundColorCaptureScreen", "getBackgroundColorConfirmationScreen", "backgroundColorConfirmationScreen", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureActivity extends BaseActivity implements OverlayView.Listener, CapturePresenter.View, LivenessOverlayView.ChallengesListener, LivenessChallengesLoadingView.Listener, FaceConfirmationFragmentContainer {
    private static final float FACE_DETECTION_OVAL_THRESHOLD_PERCENTAGE = 0.3f;
    private static final long GLARE_BUBBLE_FINAL_ANIMATION_DELAY_MS = 300;
    private static final boolean IS_FRONT_SIDE_DEFAULT = true;
    private static final long LIVENESS_CHALLENGE_FINISHED_DELAY_MS = 500;
    private static final long RECITE_LIVENESS_BUTTON_DELAY_MS = 5000;
    public static final int RESULT_EXIT_USER_FLOW = 448;
    public AnnouncementService announcementService;
    public OnfidoActivityCaptureBinding binding;
    public CameraFactory cameraFactory;
    private CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster;
    private View captureButton;
    private CaptureUploadService captureUploadService;
    public Cryptography cryptography;
    public DispatchersProvider dispatchersProvider;
    private DocumentFormat documentFormat;
    private DocumentTypeUIModel documentTypeUIModel;
    private View dummyView;
    public EnvironmentIntegrityChecker environmentIntegrityChecker;
    private boolean hasOngoingCaptureRequest;
    public ImageUtils imageUtils;
    private boolean isCameraViewInitialised;
    private boolean isOnConfirmationStep;
    private LivenessChallengesLoadingView livenessChallengesLoadingView;
    private OnfidoButton livenessControlButton;
    public OnfidoApiService onfidoApiService;
    private OnfidoCamera onfidoCamera;
    public OnfidoRemoteConfig onfidoRemoteConfig;
    private OverlayMetrics overlayMetrics;
    private OverlayView overlayView;
    public PayloadHelper payloadHelper;
    public CapturePresenter presenter;
    private OnfidoImage previewImage;
    private OnfidoCamera.VideoRecorder recorder;
    public SchedulersProvider schedulersProvider;
    public ScreenLoadTracker screenLoadTracker;
    public TokenProvider tokenProvider;
    private ValidationBubblesOffsetDelegate validationBubbleOffsetDelegate;
    public VibratorService vibratorService;

    @NotNull
    private static final String FRAGMENT_TAG_CONFIRMATION = "confirmation_fragment";

    @NotNull
    private static final String IS_RECREATING_KEY = "IS_RECREATING";

    @NotNull
    private static final String UPLOAD_ID = "upload_id";

    @NotNull
    public static final String DOC_COUNTRY = "doc_country";

    @NotNull
    private static final String KEY_STATE = "KEY_STATE";

    @NotNull
    private static final String IS_FRONT_SIDE = "is_front_side";

    @NotNull
    private static final String DOC_VIDEO_ID = "doc_video_id";

    @NotNull
    private static final String DOC_FORMAT = "doc_format";

    @NotNull
    public static final String CAPTURE_TYPE_PARAM = "type";

    @NotNull
    private static final String IS_PROOF_OF_ADDRESS = "is_proof_of_address";

    @NotNull
    private static final String UPLOAD_ARTIFACT = "upload_artifact";

    @NotNull
    public static final String DOC_TYPE = "doc_type";

    @NotNull
    private static final String DOC_PAGES = "doc_pages";

    @NotNull
    public static final String VIDEO_PATH = "video_path";

    @NotNull
    private static final String DOC_CUSTOM_TITLE = "doc_title";

    @NotNull
    private static final String NFC_SUPPORTED = "nfc_supported";

    @NotNull
    public static final String POA_CAPTURED_FILE_NAME = "poa_captured_file_name";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog = new LifecycleAwareDialog((AppCompatActivity) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));

    @NotNull
    private final Handler handler = new Handler();

    @NotNull
    private final Runnable glareBubbleRunnable = new a0.a(this, 17);
    private boolean wasConfirmationNotShown = IS_FRONT_SIDE_DEFAULT;

    /* JADX INFO: renamed from: frameSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy frameSubscription = j.b(new CaptureActivity$frameSubscription$2(this));

    /* JADX INFO: renamed from: userExitFlowMenuProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userExitFlowMenuProvider = j.b(new CaptureActivity$userExitFlowMenuProvider$2(this));

    @InternalOnfidoApi
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002Jf\u0010%\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020\u00122\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00101\u001a\u0004\u0018\u000102J \u00103\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010#\u001a\u00020$J\u0016\u00104\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0017\u00105\u001a\u0004\u0018\u00010(2\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0002\b7J\u0017\u00108\u001a\u0004\u0018\u00010*2\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0002\b9J\u0017\u0010:\u001a\u0004\u0018\u00010,2\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0002\b;J\u000e\u0010<\u001a\u00020\u00042\u0006\u00106\u001a\u00020 J\u000e\u0010=\u001a\u0002022\u0006\u00106\u001a\u00020 J\u0010\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020 J\u000e\u0010?\u001a\u00020\u00122\u0006\u00106\u001a\u00020 J\u0010\u0010@\u001a\u0004\u0018\u00010A2\u0006\u00106\u001a\u00020 J\u000e\u0010B\u001a\u00020\u00042\u0006\u00106\u001a\u00020 J\u0015\u0010/\u001a\u00020\u00122\u0006\u00106\u001a\u00020 H\u0000¢\u0006\u0002\bCR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CaptureActivity$Companion;", "", "()V", "CAPTURE_TYPE_PARAM", "", "DOC_COUNTRY", "DOC_CUSTOM_TITLE", "DOC_FORMAT", "DOC_PAGES", "DOC_TYPE", "DOC_VIDEO_ID", "FACE_DETECTION_OVAL_THRESHOLD_PERCENTAGE", "", "FRAGMENT_TAG_CONFIRMATION", "GLARE_BUBBLE_FINAL_ANIMATION_DELAY_MS", "", "IS_FRONT_SIDE", "IS_FRONT_SIDE_DEFAULT", "", "IS_PROOF_OF_ADDRESS", "IS_RECREATING_KEY", "KEY_STATE", "LIVENESS_CHALLENGE_FINISHED_DELAY_MS", "NFC_SUPPORTED", "POA_CAPTURED_FILE_NAME", "RECITE_LIVENESS_BUTTON_DELAY_MS", "RESULT_EXIT_USER_FLOW", "", "UPLOAD_ARTIFACT", "UPLOAD_ID", "VIDEO_PATH", "createBaseIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "createDocumentIntent", "isFrontSide", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentCountry", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentFormat", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "nfcArguments", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "isProofOfAddress", "genericDocTitle", "genericDocPages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "createFaceIntent", "createLivenessIntent", "getDocTypeFrom", "intent", "getDocTypeFrom$onfido_capture_sdk_core_release", "getDocumentCountryFrom", "getDocumentCountryFrom$onfido_capture_sdk_core_release", "getDocumentFormat", "getDocumentFormat$onfido_capture_sdk_core_release", "getDocumentVideoId", "getGenericDocumentPageSpecification", "getGenericDocumentTitle", "getMediaSupportedNFC", "getUploadedArtifact", "Lcom/onfido/android/sdk/capture/internal/model/UploadedArtifact;", "getUploadedFileId", "isProofOfAddress$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final Intent createBaseIntent(Context context, OnfidoConfig onfidoConfig) {
            Intent intentPutExtra = new Intent(context, (Class<?>) CaptureActivity.class).putExtra("onfido_config", onfidoConfig);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public static /* synthetic */ Intent createDocumentIntent$default(Companion companion, Context context, OnfidoConfig onfidoConfig, boolean z, DocumentType documentType, CountryCode countryCode, DocumentFormat documentFormat, NfcArguments nfcArguments, boolean z3, String str, DocumentPages documentPages, int i, Object obj2) {
            DocumentPages documentPages2;
            Companion companion2;
            Context context2;
            OnfidoConfig onfidoConfig2;
            boolean z4;
            DocumentType documentType2;
            CountryCode countryCode2;
            DocumentFormat documentFormat2;
            NfcArguments nfcArguments2;
            boolean z6 = (i & 128) != 0 ? false : z3;
            String str2 = (i & 256) != 0 ? null : str;
            if ((i & 512) != 0) {
                documentPages2 = null;
                context2 = context;
                onfidoConfig2 = onfidoConfig;
                z4 = z;
                documentType2 = documentType;
                countryCode2 = countryCode;
                documentFormat2 = documentFormat;
                nfcArguments2 = nfcArguments;
                companion2 = companion;
            } else {
                documentPages2 = documentPages;
                companion2 = companion;
                context2 = context;
                onfidoConfig2 = onfidoConfig;
                z4 = z;
                documentType2 = documentType;
                countryCode2 = countryCode;
                documentFormat2 = documentFormat;
                nfcArguments2 = nfcArguments;
            }
            return companion2.createDocumentIntent(context2, onfidoConfig2, z4, documentType2, countryCode2, documentFormat2, nfcArguments2, z6, str2, documentPages2);
        }

        @NotNull
        public final Intent createDocumentIntent(@NotNull Context context, @NotNull OnfidoConfig onfidoConfig, boolean isFrontSide, DocumentType documentType, CountryCode documentCountry, DocumentFormat documentFormat, @NotNull NfcArguments nfcArguments, boolean isProofOfAddress, String genericDocTitle, DocumentPages genericDocPages) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
            Intrinsics.checkNotNullParameter(nfcArguments, "nfcArguments");
            IntentHelper intentHelper = IntentHelper.INSTANCE;
            Intent intentPutExtra = createBaseIntent(context, onfidoConfig).putExtra("type", CaptureType.DOCUMENT).putExtra("is_front_side", isFrontSide).putExtra("doc_type", documentType).putExtra("doc_country", documentCountry).putExtra("doc_format", documentFormat).putExtra("is_proof_of_address", isProofOfAddress);
            if (genericDocTitle != null) {
                intentPutExtra.putExtra("doc_title", genericDocTitle);
            }
            if (genericDocPages != null) {
                intentPutExtra.putExtra("doc_pages", genericDocPages);
            }
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "apply(...)");
            return intentHelper.putNfcArguments$onfido_capture_sdk_core_release(intentPutExtra, nfcArguments);
        }

        @NotNull
        public final Intent createFaceIntent(@NotNull Context context, DocumentType documentType, @NotNull OnfidoConfig onfidoConfig) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
            Intent intentPutExtra = createBaseIntent(context, onfidoConfig).putExtra("type", CaptureType.FACE).putExtra("doc_type", documentType);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        @NotNull
        public final Intent createLivenessIntent(@NotNull Context context, @NotNull OnfidoConfig onfidoConfig) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
            Intent intentPutExtra = createBaseIntent(context, onfidoConfig).putExtra("type", CaptureType.VIDEO);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final DocumentType getDocTypeFrom$onfido_capture_sdk_core_release(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Serializable serializableExtra = intent.getSerializableExtra("doc_type");
            if (serializableExtra instanceof DocumentType) {
                return (DocumentType) serializableExtra;
            }
            return null;
        }

        public final CountryCode getDocumentCountryFrom$onfido_capture_sdk_core_release(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Serializable serializableExtra = intent.getSerializableExtra("doc_country");
            if (serializableExtra instanceof CountryCode) {
                return (CountryCode) serializableExtra;
            }
            return null;
        }

        public final DocumentFormat getDocumentFormat$onfido_capture_sdk_core_release(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Serializable serializableExtra = intent.getSerializableExtra("doc_format");
            if (serializableExtra instanceof DocumentFormat) {
                return (DocumentFormat) serializableExtra;
            }
            return null;
        }

        @NotNull
        public final String getDocumentVideoId(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("doc_video_id");
            return stringExtra == null ? "" : stringExtra;
        }

        @NotNull
        public final DocumentPages getGenericDocumentPageSpecification(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Serializable serializableExtra = intent.getSerializableExtra("doc_pages");
            DocumentPages documentPages = serializableExtra instanceof DocumentPages ? (DocumentPages) serializableExtra : null;
            return documentPages == null ? DocumentPages.FRONT_AND_BACK : documentPages;
        }

        public final String getGenericDocumentTitle(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getStringExtra("doc_title");
        }

        public final boolean getMediaSupportedNFC(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getBooleanExtra("nfc_supported", false);
        }

        public final UploadedArtifact getUploadedArtifact(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (UploadedArtifact) intent.getParcelableExtra("upload_artifact");
        }

        @NotNull
        public final String getUploadedFileId(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("upload_id");
            Intrinsics.h(stringExtra);
            return stringExtra;
        }

        public final boolean isProofOfAddress$onfido_capture_sdk_core_release(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getBooleanExtra("is_proof_of_address", false);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CaptureType.values().length];
            try {
                iArr[CaptureType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureType.FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CaptureType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DocumentType.values().length];
            try {
                iArr2[DocumentType.NATIONAL_IDENTITY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DocumentType.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$capture$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<OnfidoCamera.PictureCaptureEvent, Unit> {
        final /* synthetic */ boolean $playSingleFrameAutoCapturedAnimation;
        final /* synthetic */ String $traceName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, String str) {
            super(1);
            this.$playSingleFrameAutoCapturedAnimation = z;
            this.$traceName = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.PictureCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.PictureCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (CaptureActivity.this.getOnfidoRemoteConfig$onfido_capture_sdk_core_release().isCutoffImprovementsEnabled() && this.$playSingleFrameAutoCapturedAnimation) {
                CaptureActivity.this.playSingleFrameAutoCapturedAnimation();
            }
            CaptureActivity.this.getPerformanceAnalytics$onfido_capture_sdk_core_release().trackEnd(new PerformanceEvents.TraceEnd(this.$traceName));
            if (event instanceof OnfidoCamera.PictureCaptureEvent.Captured) {
                CaptureActivity.this.onPictureCaptured(((OnfidoCamera.PictureCaptureEvent.Captured) event).getImage());
            } else if (event instanceof OnfidoCamera.PictureCaptureEvent.Error) {
                CaptureActivity.this.getPresenter$onfido_capture_sdk_core_release().onErrorPictureTaking$onfido_capture_sdk_core_release();
            }
            CaptureActivity.this.hasOngoingCaptureRequest = false;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onCameraNotFound$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20271 extends u implements Function1<DialogInterface, Unit> {
        public C20271() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            CaptureActivity.this.finishActivityWithException(CameraNotFoundException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onCameraUnavailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20291 extends u implements Function1<DialogInterface, Unit> {
        public C20291() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            CaptureActivity.this.finishActivityWithException(CameraNotAvailableException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onFaceOutTimeout$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20301 extends u implements Function1<DialogInterface, Unit> {
        public C20301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            CaptureActivity.this.onVideoTimeoutRetryClick(dialog);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onLivenessChallengeFinished$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20311 extends u implements Function0<Unit> {
        public C20311() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3713invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3713invoke() {
            OverlayView overlayView = CaptureActivity.this.overlayView;
            if (overlayView == null) {
                Intrinsics.r("overlayView");
                throw null;
            }
            OverlayView.resetFaceDetectedState$default(overlayView, false, false, false, 4, null);
            Handler handler = CaptureActivity.this.handler;
            final CaptureActivity captureActivity = CaptureActivity.this;
            handler.postDelayed(new Runnable() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onLivenessChallengeFinished$1$invoke$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    captureActivity.getPresenter$onfido_capture_sdk_core_release().issueNextChallenge$onfido_capture_sdk_core_release();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onStorageThresholdReached$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20321 extends u implements Function1<DialogInterface, Unit> {
        public C20321() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            CaptureActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onVideoTimeoutExceeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20331 extends u implements Function1<DialogInterface, Unit> {
        public C20331() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            CaptureActivity.this.onVideoTimeoutRetryClick(dialog);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$playSingleFrameAutoCapturedAnimation$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20341 extends u implements Function0<Unit> {
        public C20341() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3714invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3714invoke() {
            CaptureActivity.this.runDocAutoCaptureAccessiblityEvents();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$showVideoRecordCompletionTick$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20351 extends u implements Function0<Unit> {
        public C20351() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3716invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3716invoke() {
            CaptureActivity.this.runDocAutoCaptureAccessiblityEvents();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$startCamera$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraStatus", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20361 extends u implements Function1<OnfidoCamera.CameraStatus, Unit> {
        public C20361() {
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
                CaptureActivity.this.onCameraStarted();
                return;
            }
            if (cameraStatus instanceof OnfidoCamera.CameraStatus.Failed) {
                CaptureActivity captureActivity = CaptureActivity.this;
                String message = ((OnfidoCamera.CameraStatus.Failed) cameraStatus).getError().getMessage();
                if (message == null) {
                    message = "";
                }
                captureActivity.finishActivityWithException(new UnknownCameraException(message));
                return;
            }
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotFound.INSTANCE)) {
                CaptureActivity.this.onCameraNotFound();
            } else if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotAvailable.INSTANCE)) {
                CaptureActivity.this.onCameraUnavailable();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$startDocumentVideoRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20371 extends u implements Function0<Unit> {
        public C20371() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3717invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3717invoke() {
            CaptureActivity.this.getPresenter$onfido_capture_sdk_core_release().startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$startVideoRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20381 extends u implements Function0<Unit> {
        public static final C20381 INSTANCE = new C20381();

        public C20381() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3718invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3718invoke();
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$startVideoRecording$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<OnfidoCamera.VideoCaptureEvent, Unit> {
        final /* synthetic */ Function0<Unit> $videoRecordingStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
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
                CaptureActivity.this.onVideoCanceled();
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Error) {
                CaptureActivity.this.getPresenter$onfido_capture_sdk_core_release().onErrorVideoTaking$onfido_capture_sdk_core_release();
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Recorded) {
                CaptureActivity.this.onVideoCaptured(((OnfidoCamera.VideoCaptureEvent.Recorded) event).getFilePath());
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Started.INSTANCE)) {
                this.$videoRecordingStarted.invoke();
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE)) {
                CaptureActivity.this.onVideoTimeoutExceeded();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$uploadDocument$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.camera.CaptureActivity$uploadDocument$1", f = "CaptureActivity.kt", l = {1570}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20391 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $jpegData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20391(byte[] bArr, Continuation<? super C20391> continuation) {
            super(2, continuation);
            this.$jpegData = bArr;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return CaptureActivity.this.new C20391(this.$jpegData, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) throws Throwable {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineDispatcher coroutineDispatcherMo3706getDefault = CaptureActivity.this.getDispatchersProvider$onfido_capture_sdk_core_release().mo3706getDefault();
                CaptureActivity$uploadDocument$1$croppedJpegData$1 captureActivity$uploadDocument$1$croppedJpegData$1 = new CaptureActivity$uploadDocument$1$croppedJpegData$1(CaptureActivity.this, this.$jpegData, null);
                this.label = 1;
                obj2 = e0.J(coroutineDispatcherMo3706getDefault, captureActivity$uploadDocument$1$croppedJpegData$1, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            CaptureActivity.this.getPresenter$onfido_capture_sdk_core_release().uploadImageForValidation$onfido_capture_sdk_core_release((byte[]) obj2);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20391) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    private final void adjustDummyAccessibilityView(RectF visibleCaptureRect) {
        Rect rect = new Rect();
        visibleCaptureRect.roundOut(rect);
        View view = this.dummyView;
        if (view == null) {
            Intrinsics.r("dummyView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.width = rect.width();
        layoutParams2.height = rect.height();
        layoutParams2.leftMargin = rect.left;
        layoutParams2.topMargin = rect.top;
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(R.dimen.onfido_capture_instructions_outer_top_margin);
        view.setLayoutParams(layoutParams2);
    }

    private final void breakIfDocTypeMissing() {
        if (!getIntent().hasExtra("type")) {
            throw new IllegalArgumentException("CaptureActivity should be created through createFor factory method");
        }
    }

    private final CaptureStepDataBundle captureStepDataBundleForDoc() {
        return new CaptureStepDataBundle(CaptureType.DOCUMENT, getDocumentType(), getCountryCode(), getDocumentFormat(), isDocumentFrontSide() ? DocSide.FRONT : DocSide.BACK, getGenericDocTitle(), getGenericDocPages());
    }

    private final Unit changeBackArrowColor(int color) {
        Drawable navigationIcon = getBinding$onfido_capture_sdk_core_release().toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        navigationIcon.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        return Unit.f186387a;
    }

    private final void changeStatusBarColor(int color) {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(color);
    }

    private final void closeConfirmationScreen() {
        Object captureConfirmationScreen = getCaptureConfirmationScreen();
        Fragment fragment = captureConfirmationScreen instanceof Fragment ? (Fragment) captureConfirmationScreen : null;
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().remove(fragment).commitNow();
        }
        FragmentContainerView fragmentContainer = getBinding$onfido_capture_sdk_core_release().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        ViewExtensionsKt.toGone$default(fragmentContainer, false, 1, null);
    }

    private final DocumentDetectionFrame createDocumentDetectionFrame(OnfidoImage image, RectF outerLimits, int rotation) {
        return new DocumentDetectionFrame(image.getData(), image.getWidth(), image.getHeight(), image.getWidth(), image.getHeight(), limitRect(outerLimits, image.getCropRect()), null, rotation, image.getCropRect(), image.getBitmap(), 64, null);
    }

    public static /* synthetic */ DocumentDetectionFrame createDocumentDetectionFrame$default(CaptureActivity captureActivity, OnfidoImage onfidoImage, RectF rectF, int i, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = captureActivity.getImageUtils$onfido_capture_sdk_core_release().getExifOrientationDegrees(Exif.exifOrientationIdentifier(onfidoImage.getData()));
        }
        return captureActivity.createDocumentDetectionFrame(onfidoImage, rectF, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishActivityWithException(Exception exception) {
        Intent intentPutExtra = new Intent().putExtra("onfido_exception_result", exception);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(-2, intentPutExtra);
    }

    private final int getBackgroundColorCaptureScreen() {
        return ContextUtilsKt.color(this, R.color.onfido_camera_blur);
    }

    private final int getBackgroundColorConfirmationScreen() {
        return ContextUtilsKt.colorFromAttr(this, R.attr.onfidoColorBackground);
    }

    private final OnfidoCamera.CameraFacing getCameraFace() {
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            return OnfidoCamera.CameraFacing.BACK;
        }
        if (i == 2 || i == 3) {
            return OnfidoCamera.CameraFacing.FRONT;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final int getCaptureButtonContentDescription() {
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            return R.string.onfido_doc_capture_button_accessibility;
        }
        if (i == 2 || i == 3) {
            return R.string.onfido_selfie_capture_button_accessibility;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final CaptureConfirmationScreen getCaptureConfirmationScreen() {
        LifecycleOwner lifecycleOwnerFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("confirmation_fragment");
        if (lifecycleOwnerFindFragmentByTag instanceof CaptureConfirmationScreen) {
            return (CaptureConfirmationScreen) lifecycleOwnerFindFragmentByTag;
        }
        return null;
    }

    private final CaptureStepDataBundle getDocumentData() {
        return new CaptureStepDataBundle(getCaptureType(), getDocumentType(), getCountryCode(), getDocumentFormat(), getDocSide(), getGenericDocTitle(), getGenericDocPages());
    }

    private final Intent getDocumentResultIntent(String documentId, String documentVideoId, boolean nfcSupported) {
        IntentHelper intentHelper = IntentHelper.INSTANCE;
        Intent intentPutExtra = new Intent().putExtra("upload_id", documentId).putExtra("doc_type", getDocumentType()).putExtra("doc_format", getDocumentFormat()).putExtra("is_front_side", isDocumentFrontSide()).putExtra("doc_country", getCountryCode()).putExtra("nfc_supported", nfcSupported).putExtra("doc_video_id", documentVideoId);
        if (getGenericDocTitle() != null) {
            intentPutExtra.putExtra("doc_title", getGenericDocTitle());
        }
        intentPutExtra.putExtra("doc_pages", getGenericDocPages());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "apply(...)");
        return intentHelper.putCaptureStepDataBundle$onfido_capture_sdk_core_release(intentPutExtra, captureStepDataBundleForDoc());
    }

    private final CompositeDisposable getFrameSubscription() {
        return (CompositeDisposable) this.frameSubscription.getValue();
    }

    private final String getGenericDocTitle() {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getGenericDocumentTitle(intent);
    }

    private final Intent getLivePhotoUploadResultIntent(LivePhotoUpload photoUpload) {
        Intent intentPutExtra = new Intent().putExtra("upload_id", photoUpload.getId()).putExtra("upload_artifact", UploadedArtifactKt.toUploadedArtifact(photoUpload));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private final SdkUploadMetaData getSdkUploadMetadata() {
        return getPresenter$onfido_capture_sdk_core_release().sdkUploadMetadata$onfido_capture_sdk_core_release(getDocumentData());
    }

    private final UserExitFlowMenuProvider getUserExitFlowMenuProvider() {
        return (UserExitFlowMenuProvider) this.userExitFlowMenuProvider.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void glareBubbleRunnable$lambda$0(CaptureActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding$onfido_capture_sdk_core_release().liveValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, IS_FRONT_SIDE_DEFAULT);
    }

    private final boolean hasOnfidoConfig() {
        return getIntent().hasExtra("onfido_config");
    }

    private final void inflateCaptureButton(CaptureType captureType) {
        if (captureType.isPicture()) {
            View viewFindViewById = getLayoutInflater().inflate(R.layout.onfido_capture_button_picture, getBinding$onfido_capture_sdk_core_release().content, IS_FRONT_SIDE_DEFAULT).findViewById(R.id.captureButton);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.captureButton = viewFindViewById;
            if (viewFindViewById == null) {
                Intrinsics.r("captureButton");
                throw null;
            }
            ViewExtensionsKt.setContentDescription(viewFindViewById, getCaptureButtonContentDescription());
            CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
            if (captureActivityLayoutAdjuster == null) {
                Intrinsics.r("captureActivityLayoutAdjuster");
                throw null;
            }
            View view = this.captureButton;
            if (view != null) {
                captureActivityLayoutAdjuster.setCaptureInstructionsAboveView(view);
                return;
            } else {
                Intrinsics.r("captureButton");
                throw null;
            }
        }
        View viewFindViewById2 = getLayoutInflater().inflate(R.layout.onfido_capture_button_video, getBinding$onfido_capture_sdk_core_release().content, IS_FRONT_SIDE_DEFAULT).findViewById(R.id.livenessControlButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        OnfidoButton onfidoButton = (OnfidoButton) viewFindViewById2;
        this.livenessControlButton = onfidoButton;
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster2 = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster2 == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        if (onfidoButton == null) {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
        captureActivityLayoutAdjuster2.setCaptureInstructionsAboveView(onfidoButton);
        OnfidoButton onfidoButton2 = this.livenessControlButton;
        if (onfidoButton2 != null) {
            onfidoButton2.setOnClickListener(new a(this, 1));
        } else {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inflateCaptureButton$lambda$8(CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnfidoCamera.VideoRecorder videoRecorder = this$0.recorder;
        if (videoRecorder == null || !videoRecorder.isRecording()) {
            this$0.getPresenter$onfido_capture_sdk_core_release().onManualLivenessRecordingStart$onfido_capture_sdk_core_release();
        } else {
            this$0.getPresenter$onfido_capture_sdk_core_release().onManualLivenessNextClick$onfido_capture_sdk_core_release();
        }
    }

    private final void inflateDummyAccessibilityView() {
        View viewFindViewById = getLayoutInflater().inflate(R.layout.onfido_dummy_accessibility_view, getBinding$onfido_capture_sdk_core_release().content, IS_FRONT_SIDE_DEFAULT).findViewById(R.id.dummyAccessibility);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.dummyView = viewFindViewById;
        setCaptureFrameContentDescriptionAndTitle();
    }

    private final OverlayView inflateOverlayView(DocumentType documentType) {
        int i;
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        if (companion.isProofOfAddress$onfido_capture_sdk_core_release(intent)) {
            View viewInflate = getLayoutInflater().inflate(R.layout.onfido_view_overlay_poa_a4page, (ViewGroup) getBinding$onfido_capture_sdk_core_release().contentLayout, false);
            Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.OverlayView");
            return (OverlayView) viewInflate;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i2 == 1) {
            DocumentType[] elements = {DocumentType.PASSPORT, DocumentType.VISA};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (d0.T(kotlin.collections.d.y0(elements), documentType)) {
                i = R.layout.onfido_view_overlay_passport;
            } else {
                DocumentType documentType2 = DocumentType.DRIVING_LICENCE;
                if (isFolded(documentType, documentType2, CountryCode.DE)) {
                    i = R.layout.onfido_view_overlay_german_dl;
                } else if (isFolded(documentType, documentType2, CountryCode.FR)) {
                    i = R.layout.onfido_view_overlay_french_dl;
                } else {
                    DocumentType documentType3 = DocumentType.NATIONAL_IDENTITY_CARD;
                    i = (isFolded(documentType, documentType3, CountryCode.IT) || isFolded(documentType, documentType3, CountryCode.ZA)) ? R.layout.onfido_view_overlay_italian_id : documentType == DocumentType.GENERIC ? R.layout.onfido_view_overlay_generic : R.layout.onfido_view_overlay_document;
                }
            }
        } else if (i2 == 2) {
            i = R.layout.onfido_view_overlay_face;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.layout.onfido_view_overlay_video;
        }
        View viewInflate2 = getLayoutInflater().inflate(i, (ViewGroup) getBinding$onfido_capture_sdk_core_release().contentLayout, false);
        Intrinsics.i(viewInflate2, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.OverlayView");
        return (OverlayView) viewInflate2;
    }

    private final void initDocumentFormat() {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        setDocumentFormat(companion.getDocumentFormat$onfido_capture_sdk_core_release(intent));
    }

    private final void initDocumentTypeUIModel() {
        DocumentUITextModelMapper documentUITextModelMapper = DocumentUITextModelMapper.INSTANCE;
        DocumentType documentType = getDocumentType();
        if (documentType == null) {
            documentType = DocumentType.GENERIC;
        }
        DocumentFormat documentFormat = getDocumentFormat();
        CountryCode countryCode = getCountryCode();
        boolean zIsEnabled = getAnnouncementService$onfido_capture_sdk_core_release().isEnabled();
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        this.documentTypeUIModel = DocumentUITextModelMapper.toDocumentUIModel$default(documentUITextModelMapper, documentType, documentFormat, countryCode, zIsEnabled, companion.isProofOfAddress$onfido_capture_sdk_core_release(intent), false, 16, null);
    }

    private final boolean isDocumentFrontSide() {
        IntentHelper intentHelper = IntentHelper.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return intentHelper.getIsDocumentFrontSide(intent, IS_FRONT_SIDE_DEFAULT);
    }

    private final boolean isFolded(DocumentType documentType, DocumentType documentType2, CountryCode countryCode) {
        if (DocumentFormat.FOLDED == getDocumentFormat() && documentType2 == documentType && countryCode == getCountryCode()) {
            return IS_FRONT_SIDE_DEFAULT;
        }
        return false;
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
        if (faceRect.height$onfido_capture_sdk_core_release() + faceRect.getTop() > height) {
            return false;
        }
        if (faceRect.width$onfido_capture_sdk_core_release() + faceRect.getLeft() <= width2) {
            return IS_FRONT_SIDE_DEFAULT;
        }
        return false;
    }

    private final Frame limitRect(RectF rect, OnfidoImage.CropRect cropRect) {
        float zoomFactor = cropRect.getZoomFactor();
        int verticalOffset = cropRect.getVerticalOffset();
        return new Frame((int) (rect.width() / zoomFactor), (int) (rect.height() / zoomFactor), (int) ((rect.left / zoomFactor) + cropRect.getHorizontalOffset()), (int) ((rect.top / zoomFactor) + verticalOffset));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraNotFound() {
        getPresenter$onfido_capture_sdk_core_release().trackCaptureError$onfido_capture_sdk_core_release(getCaptureType());
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_unavailable, new C20271());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStarted() {
        getPresenter$onfido_capture_sdk_core_release().onCameraStarted$onfido_capture_sdk_core_release();
        getFrameSubscription().d();
        CompositeDisposable frameSubscription = getFrameSubscription();
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        Disposable disposableSubscribe = onfidoCamera.observeFrame().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureActivity.onCameraStarted.1
            @Override // igm.g
            public final void accept(@NotNull Object p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                CaptureActivity.this.onNextFrame(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(frameSubscription, disposableSubscribe);
        if (this.isCameraViewInitialised && !getIsOnConfirmationStep() && this.onfidoCamera != null) {
            getPresenter$onfido_capture_sdk_core_release().onCaptureScreenResumedAfterCameraInitialized$onfido_capture_sdk_core_release(this.wasConfirmationNotShown ^ IS_FRONT_SIDE_DEFAULT);
        }
        this.isCameraViewInitialised = IS_FRONT_SIDE_DEFAULT;
        if (getCaptureType() == CaptureType.VIDEO) {
            LivenessChallengesLoadingView livenessChallengesLoadingView = new LivenessChallengesLoadingView(this, null, 0, 6, null);
            livenessChallengesLoadingView.setListener(this);
            livenessChallengesLoadingView.fetchChallenges();
            this.livenessChallengesLoadingView = livenessChallengesLoadingView;
            getBinding$onfido_capture_sdk_core_release().content.addView(this.livenessChallengesLoadingView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraUnavailable() {
        getPresenter$onfido_capture_sdk_core_release().trackCaptureError$onfido_capture_sdk_core_release(getCaptureType());
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_camera_used_by_other_app, new C20291());
    }

    private final void onCardFormatSelected() {
        setDocumentFormat(DocumentFormat.CARD);
        setCaptureFrameContentDescriptionAndTitle();
    }

    private final void onChallengesAvailable(LivenessChallengesViewModel livenessChallengesViewModel) {
        getBinding$onfido_capture_sdk_core_release().content.removeView(this.livenessChallengesLoadingView);
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton == null) {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
        captureActivityLayoutAdjuster.setCaptureInstructionsAboveView(onfidoButton);
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        ViewExtensionsKt.toVisible$default(overlayView, false, 1, null);
        OverlayTextView overlayTextContainer = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        ViewExtensionsKt.toVisible$default(overlayTextContainer, false, 1, null);
        getPresenter$onfido_capture_sdk_core_release().startLivenessProcessing$onfido_capture_sdk_core_release(livenessChallengesViewModel);
        AnnouncementService announcementService$onfido_capture_sdk_core_release = getAnnouncementService$onfido_capture_sdk_core_release();
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(2048);
        Intrinsics.checkNotNullExpressionValue(accessibilityEventObtain, "obtain(...)");
        announcementService$onfido_capture_sdk_core_release.sendEvent(accessibilityEventObtain).e();
    }

    private final void onFoldedFormatSelected() {
        setDocumentFormat(DocumentFormat.FOLDED);
        DocumentUITextModelMapper documentUITextModelMapper = DocumentUITextModelMapper.INSTANCE;
        DocumentType documentType = getDocumentType();
        Intrinsics.h(documentType);
        this.documentTypeUIModel = DocumentUITextModelMapper.toDocumentUIModel$default(documentUITextModelMapper, documentType, getDocumentFormat(), getCountryCode(), getAnnouncementService$onfido_capture_sdk_core_release().isEnabled(), false, false, 24, null);
        updateOverlayView(getCaptureType(), getDocumentType());
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics == null) {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
        setCaptureRegion(overlayMetrics.getVisibleCaptureRect());
        getPresenter$onfido_capture_sdk_core_release().startOverlayDisplayTimer$onfido_capture_sdk_core_release();
        setCaptureFrameContentDescriptionAndTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onManualFallbackDelayFinished$lambda$13$lambda$12(OnfidoCaptureValidationBubble this_apply) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this_apply.setState$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.State.SOFT_LOCK);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextFrame(Object frame) {
        Intrinsics.i(frame, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.camera.OnfidoImage");
        OnfidoImage onfidoImage = (OnfidoImage) frame;
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i != 1) {
            if (i != 3) {
                return;
            }
            getPresenter$onfido_capture_sdk_core_release().onNextFaceDetectionFrame$onfido_capture_sdk_core_release(new FaceDetectionFrame(onfidoImage.getData(), onfidoImage.getWidth(), onfidoImage.getHeight(), onfidoImage.getRotation(), onfidoImage.getCropRect(), onfidoImage.getBitmap()));
            return;
        }
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics == null) {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
        RectF realCaptureRect = overlayMetrics.getRealCaptureRect();
        OverlayMetrics overlayMetrics2 = this.overlayMetrics;
        if (overlayMetrics2 == null) {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
        getPresenter$onfido_capture_sdk_core_release().onNextFrame$onfido_capture_sdk_core_release(new DocumentDetectionFrame(onfidoImage.getData(), onfidoImage.getWidth(), onfidoImage.getHeight(), onfidoImage.getWidth(), onfidoImage.getHeight(), limitRect(realCaptureRect, onfidoImage.getCropRect()), limitRect(overlayMetrics2.getVisibleCaptureRect(), onfidoImage.getCropRect()), onfidoImage.getRotation(), onfidoImage.getCropRect(), onfidoImage.getBitmap()));
    }

    private final void onStartLiveness() {
        if (this.livenessChallengesLoadingView != null && getBinding$onfido_capture_sdk_core_release().content.indexOfChild(this.livenessChallengesLoadingView) < 0) {
            getBinding$onfido_capture_sdk_core_release().content.addView(this.livenessChallengesLoadingView);
        }
        OverlayTextView overlayTextContainer = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        ViewExtensionsKt.toGone$default(overlayTextContainer, false, 1, null);
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton == null) {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
        ViewExtensionsKt.toGone$default(onfidoButton, false, 1, null);
        LivenessChallengesLoadingView livenessChallengesLoadingView = this.livenessChallengesLoadingView;
        if (livenessChallengesLoadingView != null) {
            livenessChallengesLoadingView.fetchChallenges();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCanceled() {
        getPresenter$onfido_capture_sdk_core_release().onVideoRecordingCanceled$onfido_capture_sdk_core_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCaptured(String filePath) {
        this.handler.post(new a4.a(this, filePath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onVideoCaptured$lambda$23(CaptureActivity this$0, String filePath) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(filePath, "$filePath");
        this$0.getPresenter$onfido_capture_sdk_core_release().onVideoCaptured$onfido_capture_sdk_core_release(filePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoTimeoutRetryClick(DialogInterface dialog) {
        dialog.dismiss();
        getPresenter$onfido_capture_sdk_core_release().trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release();
        recreate();
    }

    private final void recoverStateFrom(Bundle savedInstanceState) {
        CapturePresenter.State state = savedInstanceState != null ? (CapturePresenter.State) savedInstanceState.getParcelable("KEY_STATE") : null;
        if (state != null) {
            getPresenter$onfido_capture_sdk_core_release().setState$onfido_capture_sdk_core_release(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runDocAutoCaptureAccessiblityEvents() {
        Completable completableVibrateForSuccess = getVibratorService$onfido_capture_sdk_core_release().vibrateForSuccess();
        Completable completableInterruptAnnouncement = getAnnouncementService$onfido_capture_sdk_core_release().interruptAnnouncement();
        AnnouncementService announcementService$onfido_capture_sdk_core_release = getAnnouncementService$onfido_capture_sdk_core_release();
        String string = getString(R.string.onfido_doc_capture_frame_success_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new ogm.c(new CompletableSource[]{completableVibrateForSuccess, completableInterruptAnnouncement, AnnouncementService.announceString$default(announcementService$onfido_capture_sdk_core_release, new String[]{string}, false, 2, (Object) null)}, 1).e();
    }

    private final void setCaptureFrameContentDescriptionAndTitle() {
        StringRepresentation ovalCaptureContentDescription$onfido_capture_sdk_core_release = getPresenter$onfido_capture_sdk_core_release().getOvalCaptureContentDescription$onfido_capture_sdk_core_release(getDocumentData());
        View view = this.dummyView;
        if (view == null) {
            Intrinsics.r("dummyView");
            throw null;
        }
        view.setContentDescription(ovalCaptureContentDescription$onfido_capture_sdk_core_release.getString(this));
        setTitle(ovalCaptureContentDescription$onfido_capture_sdk_core_release.getString(this));
    }

    private final void setCaptureRegion(RectF rect) {
        if (getCaptureType() == CaptureType.DOCUMENT) {
            showDocumentOverlay(rect);
        }
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate != null) {
            validationBubblesOffsetDelegate.onCaptureRegionSet(rect);
        } else {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
    }

    private final void setColorsForCaptureScreen() {
        updateColors(R.attr.onfidoColorToolbarBackgroundDark, R.attr.onfidoColorContentToolbarTitleDark, R.attr.onfidoColorContentToolbarSubtitleDark, getBackgroundColorCaptureScreen());
    }

    private final void setConfirmationStepVisibility(boolean visible) {
        ViewUtil.setViewVisibility(getBinding$onfido_capture_sdk_core_release().confirmationImage, visible);
        ViewUtil.setViewVisibility(getBinding$onfido_capture_sdk_core_release().confirmationButtons, visible);
        if (visible) {
            View view = this.captureButton;
            if (view != null) {
                ViewExtensionsKt.toGone(view, false);
            } else {
                Intrinsics.r("captureButton");
                throw null;
            }
        }
    }

    private final void setImagePreview(OnfidoImage onfidoImage) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        getBinding$onfido_capture_sdk_core_release().confirmationImage.setScaleX(getCameraFace() == OnfidoCamera.CameraFacing.FRONT ? -1 : 1);
        Bitmap bitmapDecodeScaledResource$default = ImageUtils.decodeScaledResource$default(getImageUtils$onfido_capture_sdk_core_release(), onfidoImage.getData(), getBinding$onfido_capture_sdk_core_release().confirmationImage.getWidth(), getBinding$onfido_capture_sdk_core_release().confirmationImage.getHeight(), null, null, 24, null);
        if (getBinding$onfido_capture_sdk_core_release().confirmationImage.getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = getBinding$onfido_capture_sdk_core_release().confirmationImage.getDrawable();
            Intrinsics.i(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.recycle();
        }
        getBinding$onfido_capture_sdk_core_release().confirmationImage.setImageBitmap(bitmapDecodeScaledResource$default);
        updateConfirmationImageTranslationAndScale();
    }

    private final void setLivenessOverlayMargin(RectF captureRect) {
        getBinding$onfido_capture_sdk_core_release().livenessOverlayView.updateTextPosition$onfido_capture_sdk_core_release(captureRect);
    }

    private final void setValidationBubbleContent(int title, Integer subtitle) {
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding$onfido_capture_sdk_core_release().postCaptureValidationBubble;
        Intrinsics.h(onfidoCaptureValidationBubble);
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.Content.Error(title, subtitle), false, 2, null);
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(false, 1, null)), false, 2, null);
    }

    public static /* synthetic */ void setValidationBubbleContent$default(CaptureActivity captureActivity, int i, Integer num, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        captureActivity.setValidationBubbleContent(i, num);
    }

    private final void setVideoRecordingIndicatorMargin(RectF captureRect) {
        LinearLayout root = getBinding$onfido_capture_sdk_core_release().videoRecordingContainer.getRoot();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCaptureButton$lambda$11(CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.capture(false);
        this$0.trackAutocaptureShutterButtonClick();
    }

    private final void setupOverlayView(CaptureType captureType, DocumentType documentType) {
        if (this.overlayView != null) {
            FrameLayout frameLayout = getBinding$onfido_capture_sdk_core_release().contentLayout;
            OverlayView overlayView = this.overlayView;
            if (overlayView == null) {
                Intrinsics.r("overlayView");
                throw null;
            }
            frameLayout.removeView(overlayView);
        }
        OverlayView overlayViewInflateOverlayView = inflateOverlayView(documentType);
        overlayViewInflateOverlayView.setUp(captureType, this);
        OverlayView.setColorOutsideOverlay$default(overlayViewInflateOverlayView, getBackgroundColorCaptureScreen(), false, 2, null);
        ViewExtensionsKt.runOnMeasured(overlayViewInflateOverlayView, new CaptureActivity$setupOverlayView$1$1(this));
        this.overlayView = overlayViewInflateOverlayView;
        OverlayTextView overlayTextView = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        overlayTextView.setCaptureOverlayText$onfido_capture_sdk_core_release(captureType, documentTypeUIModel, getDocSide());
        OverlayView overlayView2 = this.overlayView;
        if (overlayView2 == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        overlayView2.setIsProofOfAddress(companion.isProofOfAddress$onfido_capture_sdk_core_release(intent));
        FrameLayout frameLayout2 = getBinding$onfido_capture_sdk_core_release().contentLayout;
        OverlayView overlayView3 = this.overlayView;
        if (overlayView3 != null) {
            frameLayout2.addView(overlayView3);
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    private final void setupPresenter() {
        CapturePresenter presenter$onfido_capture_sdk_core_release = getPresenter$onfido_capture_sdk_core_release();
        OnfidoConfig onfidoConfig$onfido_capture_sdk_core_release = getOnfidoConfig$onfido_capture_sdk_core_release();
        CaptureStepDataBundle documentData = getDocumentData();
        IntentHelper intentHelper = IntentHelper.INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        NfcArguments nfcArguments = intentHelper.getNfcArguments(intent);
        Companion companion = INSTANCE;
        Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        presenter$onfido_capture_sdk_core_release.setup$onfido_capture_sdk_core_release(this, onfidoConfig$onfido_capture_sdk_core_release, documentData, nfcArguments, companion.isProofOfAddress$onfido_capture_sdk_core_release(intent2));
    }

    private final boolean shouldShowPassportOverlay() {
        ShapeableImageView passportOverlay = getBinding$onfido_capture_sdk_core_release().passportOverlay;
        Intrinsics.checkNotNullExpressionValue(passportOverlay, "passportOverlay");
        if (!ViewExtensionsKt.isGone(passportOverlay) && getPresenter$onfido_capture_sdk_core_release().shouldShowInitialOverlay$onfido_capture_sdk_core_release(getDocumentType()) && getPresenter$onfido_capture_sdk_core_release().shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
            return IS_FRONT_SIDE_DEFAULT;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDocumentFormatDialog$lambda$7$lambda$5(BottomSheetDialog this_with, CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.dismiss();
        this$0.onCardFormatSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDocumentFormatDialog$lambda$7$lambda$6(BottomSheetDialog this_with, CaptureActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.dismiss();
        this$0.onFoldedFormatSelected();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void showDocumentOverlay(android.graphics.RectF r10) {
        /*
            r9 = this;
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r0 = r9.getPresenter$onfido_capture_sdk_core_release()
            r1 = 1
            r0.setDisplayingOverlay$onfido_capture_sdk_core_release(r1)
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r0 = r9.getPresenter$onfido_capture_sdk_core_release()
            boolean r1 = r9.isDocumentFrontSide()
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r2 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r2 = r2.frenchDLOverlay
            java.lang.String r3 = "frenchDLOverlay"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r2 = com.onfido.android.sdk.capture.utils.ViewExtensionsKt.isGone(r2)
            boolean r0 = r0.shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release(r1, r2)
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r1 = r9.getPresenter$onfido_capture_sdk_core_release()
            boolean r2 = r9.isDocumentFrontSide()
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r4 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r4 = r4.germanDLOverlay
            java.lang.String r5 = "germanDLOverlay"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r4 = com.onfido.android.sdk.capture.utils.ViewExtensionsKt.isGone(r4)
            boolean r1 = r1.shouldShowGermanDLOverlay$onfido_capture_sdk_core_release(r2, r4)
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r2 = r9.getPresenter$onfido_capture_sdk_core_release()
            boolean r4 = r9.isDocumentFrontSide()
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r6 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r6 = r6.italianIDOverlay
            java.lang.String r7 = "italianIDOverlay"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            boolean r6 = com.onfido.android.sdk.capture.utils.ViewExtensionsKt.isGone(r6)
            boolean r2 = r2.shouldShowItalianIDOverlay$onfido_capture_sdk_core_release(r4, r6)
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r4 = r9.getPresenter$onfido_capture_sdk_core_release()
            boolean r6 = r9.isDocumentFrontSide()
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r8 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r8 = r8.italianIDOverlay
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            boolean r8 = com.onfido.android.sdk.capture.utils.ViewExtensionsKt.isGone(r8)
            boolean r4 = r4.shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release(r6, r8)
            if (r0 == 0) goto L81
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r0 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r0 = r0.frenchDLOverlay
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
        L7d:
            com.onfido.android.sdk.capture.utils.ImageUtilsExtKt.showOverlay(r0, r10)
            goto Lae
        L81:
            if (r1 == 0) goto L8d
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r0 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r0 = r0.germanDLOverlay
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            goto L7d
        L8d:
            if (r2 == 0) goto L90
            goto L92
        L90:
            if (r4 == 0) goto L9c
        L92:
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r0 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r0 = r0.italianIDOverlay
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            goto L7d
        L9c:
            boolean r0 = r9.shouldShowPassportOverlay()
            if (r0 == 0) goto Lae
            com.onfido.android.sdk.capture.databinding.OnfidoActivityCaptureBinding r0 = r9.getBinding$onfido_capture_sdk_core_release()
            com.google.android.material.imageview.ShapeableImageView r0 = r0.passportOverlay
            java.lang.String r1 = "passportOverlay"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L7d
        Lae:
            com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig r0 = r9.getOnfidoRemoteConfig$onfido_capture_sdk_core_release()
            boolean r0 = r0.isFourByThreeEnabled()
            if (r0 == 0) goto Lc7
            com.onfido.android.sdk.capture.internal.camera.OnfidoCamera r0 = r9.onfidoCamera
            if (r0 == 0) goto Lc0
            r0.centerPreviewAccordingTo(r10)
            return
        Lc0:
            java.lang.String r10 = "onfidoCamera"
            kotlin.jvm.internal.Intrinsics.r(r10)
            r10 = 0
            throw r10
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CaptureActivity.showDocumentOverlay(android.graphics.RectF):void");
    }

    private final void showFaceConfirmationFragment() {
        if (getCaptureConfirmationScreen() != null) {
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new FaceConfirmationFragment(), "confirmation_fragment").commit();
        FragmentContainerView fragmentContainer = getBinding$onfido_capture_sdk_core_release().fragmentContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentContainer, "fragmentContainer");
        ViewExtensionsKt.toVisible$default(fragmentContainer, false, 1, null);
    }

    private final void startVideoRecording(Function0<Unit> videoRecordingStarted) {
        FileUtils fileUtils = FileUtils.INSTANCE;
        File cacheDir = getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        fileUtils.deleteFilesWithPrefixFromFolder(cacheDir, "onfido-video");
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            this.recorder = onfidoCamera.takeVideo(new AnonymousClass2(videoRecordingStarted));
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startVideoRecording$default(CaptureActivity captureActivity, Function0 function0, int i, Object obj2) {
        if ((i & 1) != 0) {
            function0 = C20381.INSTANCE;
        }
        captureActivity.startVideoRecording(function0);
    }

    private final void trackAutocaptureShutterButtonClick() {
        if (getPresenter$onfido_capture_sdk_core_release().shouldAutoCaptureDocument$onfido_capture_sdk_core_release() || getDocumentData().getCaptureType() != CaptureType.DOCUMENT) {
            getPresenter$onfido_capture_sdk_core_release().trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release();
        }
    }

    private final void updateColors(int toolbarBackgroundColor, int toolbarTitleColor, int toolbarSubtitleColor, int screenBackgroundColor) {
        if (getSupportActionBar() != null) {
            int iColorFromAttr = ContextUtilsKt.colorFromAttr(this, android.R.attr.colorPrimaryDark);
            int iColorFromAttr2 = ContextUtilsKt.colorFromAttr(this, toolbarBackgroundColor);
            int iColorFromAttr3 = ContextUtilsKt.colorFromAttr(this, toolbarTitleColor);
            int iColorFromAttr4 = ContextUtilsKt.colorFromAttr(this, toolbarSubtitleColor);
            changeStatusBarColor(iColorFromAttr);
            getBinding$onfido_capture_sdk_core_release().toolbar.setBackgroundColor(iColorFromAttr2);
            getBinding$onfido_capture_sdk_core_release().toolbar.setTitleTextColor(iColorFromAttr3);
            changeBackArrowColor(iColorFromAttr3);
            getBinding$onfido_capture_sdk_core_release().toolbar.setSubtitleTextColor(iColorFromAttr4);
        }
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        OverlayView.setColorOutsideOverlay$default(overlayView, screenBackgroundColor, false, 2, null);
        if (getIsOnConfirmationStep()) {
            getBinding$onfido_capture_sdk_core_release().watermark.setLightBackground();
        } else {
            getBinding$onfido_capture_sdk_core_release().watermark.setDarkBackground();
        }
    }

    private final void updateColorsForConfirmationScreen() {
        updateColors(R.attr.onfidoColorToolbarBackground, R.attr.onfidoColorContentToolbarTitle, R.attr.onfidoColorContentToolbarSubtitle, getBackgroundColorConfirmationScreen());
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
            float fCenterY = overlayMetrics2.getVisibleCaptureRect().centerY() - (getBinding$onfido_capture_sdk_core_release().confirmationImage.getHeight() / 2);
            getBinding$onfido_capture_sdk_core_release().confirmationImage.setTranslationX(fCenterX - (getBinding$onfido_capture_sdk_core_release().confirmationImage.getWidth() / 2));
            getBinding$onfido_capture_sdk_core_release().confirmationImage.setTranslationY(fCenterY);
            getBinding$onfido_capture_sdk_core_release().confirmationImage.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    private final void updateOverlayView(CaptureType captureType, DocumentType documentType) {
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        OverlayView overlayViewInflateOverlayView = inflateOverlayView(documentType);
        overlayViewInflateOverlayView.setUp(captureType, this);
        overlayViewInflateOverlayView.setColorOutsideOverlay(getBackgroundColorCaptureScreen(), false);
        this.overlayView = overlayViewInflateOverlayView;
        OverlayTextView overlayTextView = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        overlayTextView.setCaptureOverlayText$onfido_capture_sdk_core_release(captureType, documentTypeUIModel, getDocSide());
        getBinding$onfido_capture_sdk_core_release().contentLayout.removeView(overlayView);
        FrameLayout frameLayout = getBinding$onfido_capture_sdk_core_release().contentLayout;
        OverlayView overlayView2 = this.overlayView;
        if (overlayView2 != null) {
            frameLayout.addView(overlayView2);
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    private final void uploadDocument(byte[] jpegData) {
        e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C20391(jpegData, null), 3);
    }

    private final void uploadSelfieForValidation(byte[] jpegData) {
        boolean zShouldPerformFaceValidation$onfido_capture_sdk_core_release = getPresenter$onfido_capture_sdk_core_release().shouldPerformFaceValidation$onfido_capture_sdk_core_release();
        boolean zIsPayloadSigningEnabled = getOnfidoRemoteConfig$onfido_capture_sdk_core_release().getSelfieCapture().isPayloadSigningEnabled();
        CaptureUploadService captureUploadService = this.captureUploadService;
        if (captureUploadService != null) {
            captureUploadService.uploadSelfie$onfido_capture_sdk_core_release(zShouldPerformFaceValidation$onfido_capture_sdk_core_release, jpegData, getPresenter$onfido_capture_sdk_core_release().sdkUploadMetadata$onfido_capture_sdk_core_release(), zIsPayloadSigningEnabled);
        } else {
            Intrinsics.r("captureUploadService");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void applyValidations(@NotNull OnfidoImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.previewImage = image;
        setImagePreview(image);
        DocumentType documentType = getDocumentType();
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics == null) {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
        RectF realCaptureRect = overlayMetrics.getRealCaptureRect();
        if (getCaptureType() != CaptureType.DOCUMENT || documentType == null) {
            showConfirmationStep();
        } else {
            getPresenter$onfido_capture_sdk_core_release().applyPostCaptureValidations$onfido_capture_sdk_core_release(createDocumentDetectionFrame$default(this, image, realCaptureRect, 0, 4, null), documentType, getDocSide(), getCountryCode());
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void cancelFlow() {
        BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, 0, null, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void capture(boolean playSingleFrameAutoCapturedAnimation) {
        if (this.hasOngoingCaptureRequest) {
            Timber.INSTANCE.i("There is an ongoing capture request! This request has been ignored!", new Object[0]);
            return;
        }
        this.hasOngoingCaptureRequest = IS_FRONT_SIDE_DEFAULT;
        getFrameSubscription().d();
        if (!getOnfidoRemoteConfig$onfido_capture_sdk_core_release().isCutoffImprovementsEnabled() && playSingleFrameAutoCapturedAnimation) {
            playSingleFrameAutoCapturedAnimation();
        }
        View view = this.captureButton;
        if (view == null) {
            Intrinsics.r("captureButton");
            throw null;
        }
        ViewExtensionsKt.toInvisible(view, false);
        getPresenter$onfido_capture_sdk_core_release().stop$onfido_capture_sdk_core_release();
        CaptureType captureType = getCaptureType();
        CaptureType captureType2 = CaptureType.DOCUMENT;
        boolean z = captureType != captureType2;
        String str = getCaptureType() == captureType2 ? "document_capture" : "selfie_capture";
        getPerformanceAnalytics$onfido_capture_sdk_core_release().trackStart(new PerformanceEvents.TraceStart(str));
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.takePicture(new PhotoCaptureConfig(z), new AnonymousClass1(playSingleFrameAutoCapturedAnimation, str));
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void deactivateCaptureButton() {
        View view = this.captureButton;
        if (view != null) {
            ViewExtensionsKt.deactivate(view);
        } else {
            Intrinsics.r("captureButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void destroyWithCanceledResult() {
        BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, 0, null, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void displayCaptureButton() {
        if (getIsOnConfirmationStep()) {
            return;
        }
        View view = this.captureButton;
        if (view != null) {
            ViewExtensionsKt.toVisible$default(view, false, 1, null);
        } else {
            Intrinsics.r("captureButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void enableTorch(boolean isEnabled) {
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.getCameraControl().enableTorch(isEnabled);
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void finishWithResultExitUserFlow() {
        BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, RESULT_EXIT_USER_FLOW, null, 2, null);
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
    public final OnfidoActivityCaptureBinding getBinding$onfido_capture_sdk_core_release() {
        OnfidoActivityCaptureBinding onfidoActivityCaptureBinding = this.binding;
        if (onfidoActivityCaptureBinding != null) {
            return onfidoActivityCaptureBinding;
        }
        Intrinsics.r("binding");
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

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public CaptureStepDataBundle getCaptureStepDataBundle() {
        return getDocumentData();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public CaptureType getCaptureType() {
        Bundle extras = getIntent().getExtras();
        Intrinsics.h(extras);
        Serializable serializable = extras.getSerializable("type");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.CaptureType");
        return (CaptureType) serializable;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public File getCapturedFilesDir() {
        File filesDir = getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return filesDir;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public CountryCode getCountryCode() {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getDocumentCountryFrom$onfido_capture_sdk_core_release(intent);
    }

    @NotNull
    public final Cryptography getCryptography$onfido_capture_sdk_core_release() {
        Cryptography cryptography = this.cryptography;
        if (cryptography != null) {
            return cryptography;
        }
        Intrinsics.r("cryptography");
        throw null;
    }

    @NotNull
    public final DispatchersProvider getDispatchersProvider$onfido_capture_sdk_core_release() {
        DispatchersProvider dispatchersProvider = this.dispatchersProvider;
        if (dispatchersProvider != null) {
            return dispatchersProvider;
        }
        Intrinsics.r("dispatchersProvider");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public DocSide getDocSide() {
        return isDocumentFrontSide() ? DocSide.FRONT : DocSide.BACK;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public DocumentFormat getDocumentFormat() {
        return this.documentFormat;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public DocumentType getDocumentType() {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getDocTypeFrom$onfido_capture_sdk_core_release(intent);
    }

    @NotNull
    public final EnvironmentIntegrityChecker getEnvironmentIntegrityChecker$onfido_capture_sdk_core_release() {
        EnvironmentIntegrityChecker environmentIntegrityChecker = this.environmentIntegrityChecker;
        if (environmentIntegrityChecker != null) {
            return environmentIntegrityChecker;
        }
        Intrinsics.r("environmentIntegrityChecker");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public DocumentPages getGenericDocPages() {
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.getGenericDocumentPageSpecification(intent);
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
    public final OnfidoApiService getOnfidoApiService$onfido_capture_sdk_core_release() {
        OnfidoApiService onfidoApiService = this.onfidoApiService;
        if (onfidoApiService != null) {
            return onfidoApiService;
        }
        Intrinsics.r("onfidoApiService");
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
    public final PayloadHelper getPayloadHelper$onfido_capture_sdk_core_release() {
        PayloadHelper payloadHelper = this.payloadHelper;
        if (payloadHelper != null) {
            return payloadHelper;
        }
        Intrinsics.r("payloadHelper");
        throw null;
    }

    @NotNull
    public final CapturePresenter getPresenter$onfido_capture_sdk_core_release() {
        CapturePresenter capturePresenter = this.presenter;
        if (capturePresenter != null) {
            return capturePresenter;
        }
        Intrinsics.r("presenter");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public OnfidoImage getPreviewImage() {
        return this.previewImage;
    }

    @NotNull
    public final SchedulersProvider getSchedulersProvider$onfido_capture_sdk_core_release() {
        SchedulersProvider schedulersProvider = this.schedulersProvider;
        if (schedulersProvider != null) {
            return schedulersProvider;
        }
        Intrinsics.r("schedulersProvider");
        throw null;
    }

    @NotNull
    public final ScreenLoadTracker getScreenLoadTracker$onfido_capture_sdk_core_release() {
        ScreenLoadTracker screenLoadTracker = this.screenLoadTracker;
        if (screenLoadTracker != null) {
            return screenLoadTracker;
        }
        Intrinsics.r("screenLoadTracker");
        throw null;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    @NotNull
    public Orientation getScreenOrientation() {
        return getResources().getConfiguration().orientation == 2 ? Orientation.LANDSCAPE : Orientation.PORTRAIT;
    }

    @NotNull
    public final TokenProvider getTokenProvider$onfido_capture_sdk_core_release() {
        TokenProvider tokenProvider = this.tokenProvider;
        if (tokenProvider != null) {
            return tokenProvider;
        }
        Intrinsics.r("tokenProvider");
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

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public boolean hasValidRecording() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder == null || !videoRecorder.getHasValidRecording()) {
            return false;
        }
        return IS_FRONT_SIDE_DEFAULT;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void hideCaptureButton() {
        View view = this.captureButton;
        if (view != null) {
            ViewExtensionsKt.toInvisible$default(view, false, 1, null);
        } else {
            Intrinsics.r("captureButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void hideDocumentOverlay() {
        getPresenter$onfido_capture_sdk_core_release().setDisplayingOverlay$onfido_capture_sdk_core_release(false);
        ShapeableImageView[] shapeableImageViewArr = {getBinding$onfido_capture_sdk_core_release().passportOverlay, getBinding$onfido_capture_sdk_core_release().frenchDLOverlay, getBinding$onfido_capture_sdk_core_release().germanDLOverlay, getBinding$onfido_capture_sdk_core_release().italianIDOverlay};
        ArrayList<ShapeableImageView> arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            ShapeableImageView shapeableImageView = shapeableImageViewArr[i];
            Intrinsics.h(shapeableImageView);
            if (ViewExtensionsKt.isVisible(shapeableImageView)) {
                arrayList.add(shapeableImageView);
            }
        }
        for (ShapeableImageView shapeableImageView2 : arrayList) {
            Intrinsics.h(shapeableImageView2);
            ViewExtensionsKt.toGone$default(shapeableImageView2, false, 1, null);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void hideLivenessControlButton() {
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton != null) {
            ViewExtensionsKt.toInvisible(onfidoButton, false);
        } else {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void hideLoading() {
        dismissLoadingDialog$onfido_capture_sdk_core_release();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void hideVideoRecordingProgressBar() {
        LinearLayout root = getBinding$onfido_capture_sdk_core_release().videoRecordingContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.toGone(root, false);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    /* JADX INFO: renamed from: isOnConfirmationStep, reason: from getter */
    public boolean getIsOnConfirmationStep() {
        return this.isOnConfirmationStep;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void makeToolbarTitleNotImportantForAccessibility() {
        Toolbar toolbar = getBinding$onfido_capture_sdk_core_release().toolbar;
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        ToolbarExtensionsKt.makeTitleNotImportantForAccessibility(toolbar);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onAccessibleCaptureDocumentOverlayTextChanged(int mainTextResId, int mainTextContentDescriptionResId) {
        getBinding$onfido_capture_sdk_core_release().overlayTextContainer.setMainText$onfido_capture_sdk_core_release(mainTextResId, mainTextContentDescriptionResId, IS_FRONT_SIDE_DEFAULT);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onAccessibleCaptureRectangleDetectionResult(@NotNull RectDetectionResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        getBinding$onfido_capture_sdk_core_release().onfidoAccessibleRectDetectorFrame.update$onfido_capture_sdk_core_release(result);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    @yhm.d
    public void onBackPressed() {
        if (!getIsOnConfirmationStep()) {
            getPresenter$onfido_capture_sdk_core_release().trackCaptureBackButtonClicked$onfido_capture_sdk_core_release();
            BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, 0, null, 2, null);
        } else {
            getPresenter$onfido_capture_sdk_core_release().trackConfirmationBackButtonClicked$onfido_capture_sdk_core_release();
            closeConfirmationScreen();
            openCaptureScreen();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onCaptureForProofOfAddressDone(@NotNull OnfidoImage image, @NotNull RectF visibleRect) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        getPresenter$onfido_capture_sdk_core_release().cropImageAndSaveToFile$onfido_capture_sdk_core_release(image.getData(), createDocumentDetectionFrame$default(this, image, visibleRect, 0, 4, null));
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onChallengeLoadingViewStateChanged(@NotNull LivenessChallengesLoadingView.ScreenState screenState) {
        Intrinsics.checkNotNullParameter(screenState, "screenState");
        if (!Intrinsics.f(screenState, LivenessChallengesLoadingView.ScreenState.Loading.INSTANCE)) {
            if (screenState instanceof LivenessChallengesLoadingView.ScreenState.Success) {
                onChallengesAvailable(((LivenessChallengesLoadingView.ScreenState.Success) screenState).getLivenessChallengesViewModel());
                return;
            } else {
                Intrinsics.f(screenState, LivenessChallengesLoadingView.ScreenState.Error.INSTANCE);
                return;
            }
        }
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            ViewExtensionsKt.toGone$default(overlayView, false, 1, null);
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onChallengesCompleted() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.finish();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onChallengesErrorBackPressed() {
        onBackPressed();
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OnfidoActivityCaptureBinding onfidoActivityCaptureBindingInflate = OnfidoActivityCaptureBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(onfidoActivityCaptureBindingInflate, "inflate(...)");
        setBinding$onfido_capture_sdk_core_release(onfidoActivityCaptureBindingInflate);
        setContentView(getBinding$onfido_capture_sdk_core_release().getRoot());
        SdkController.getSdkComponent$default(SdkController.INSTANCE.getInstance(), this, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        this.captureActivityLayoutAdjuster = new CaptureActivityLayoutAdjuster(this, getCaptureType(), getDocSide());
        RelativeLayout content = getBinding$onfido_capture_sdk_core_release().content;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        this.validationBubbleOffsetDelegate = new ValidationBubblesOffsetDelegate(content, v.k(Integer.valueOf(R.id.liveValidationBubble), Integer.valueOf(R.id.postCaptureValidationBubble)), getCaptureType());
        Lifecycle lifecycle = getLifecycle();
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        lifecycle.addObserver(captureActivityLayoutAdjuster);
        Lifecycle lifecycle2 = getLifecycle();
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate == null) {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
        lifecycle2.addObserver(validationBubblesOffsetDelegate);
        breakIfDocTypeMissing();
        initDocumentFormat();
        initDocumentTypeUIModel();
        inflateCaptureButton(getCaptureType());
        inflateDummyAccessibilityView();
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            ConfirmationStepButtons confirmationStepButtons = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
            DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
            if (documentTypeUIModel == null) {
                Intrinsics.r("documentTypeUIModel");
                throw null;
            }
            int readabilityDiscardLabel = documentTypeUIModel.getReadabilityDiscardLabel();
            DocumentTypeUIModel documentTypeUIModel2 = this.documentTypeUIModel;
            if (documentTypeUIModel2 == null) {
                Intrinsics.r("documentTypeUIModel");
                throw null;
            }
            confirmationStepButtons.setDocumentCapture$onfido_capture_sdk_core_release(readabilityDiscardLabel, documentTypeUIModel2.getReadabilityConfirmationLabel());
        } else if (i == 2) {
            getBinding$onfido_capture_sdk_core_release().confirmationButtons.setFaceCapture();
            getBinding$onfido_capture_sdk_core_release().confirmationImage.setOnTouchListener(null);
        }
        setupPresenter();
        closeConfirmationScreen();
        recoverStateFrom(savedInstanceState);
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (hasOnfidoConfig()) {
            CaptureUploadService captureUploadService = this.captureUploadService;
            if (captureUploadService != null) {
                captureUploadService.stop$onfido_capture_sdk_core_release();
            }
            hideLoading();
            this.handler.removeCallbacksAndMessages(null);
            getPresenter$onfido_capture_sdk_core_release().onDestroy$onfido_capture_sdk_core_release();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onDocumentCreated(@NotNull String documentId, @NotNull String documentVideoId, boolean nfcSupported) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        if (!getIsOnConfirmationStep()) {
            showConfirmationStep();
            setConfirmationButtons(false);
        } else {
            getPresenter$onfido_capture_sdk_core_release().callMediaCallback$onfido_capture_sdk_core_release();
            hideLoading();
            finishWithResult$onfido_capture_sdk_core_release(-1, getDocumentResultIntent(documentId, documentVideoId, nfcSupported));
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onDocumentVideoRecordingCompleted() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.finish();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onDocumentVideoUploaded(@NotNull String documentVideoId) {
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        getPresenter$onfido_capture_sdk_core_release().onDocumentVideoUploaded$onfido_capture_sdk_core_release(documentVideoId);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView.ChallengesListener
    public void onErrorObservingHeadTurnResults() {
        getPresenter$onfido_capture_sdk_core_release().stopFaceTracking$onfido_capture_sdk_core_release();
        onFaceTrackingTimeout();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onFaceDetected(@NotNull FaceDetectionResult faceDetectionResult) {
        Intrinsics.checkNotNullParameter(faceDetectionResult, "faceDetectionResult");
        if (faceDetectionResult instanceof FaceDetectionResult.FaceDetected) {
            OverlayMetrics overlayMetrics = this.overlayMetrics;
            if (overlayMetrics == null) {
                Intrinsics.r("overlayMetrics");
                throw null;
            }
            Frame frameLimitRect = limitRect(overlayMetrics.getRealCaptureRect(), ((FaceDetectionResult.FaceDetected) faceDetectionResult).getCropRect());
            OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
            if ((videoRecorder == null || !videoRecorder.isRecording()) && isInsideOval(faceDetectionResult, frameLimitRect) && !getOnfidoConfig$onfido_capture_sdk_core_release().getManualLivenessCapture()) {
                OnfidoButton onfidoButton = this.livenessControlButton;
                if (onfidoButton == null) {
                    Intrinsics.r("livenessControlButton");
                    throw null;
                }
                ViewExtensionsKt.toInvisible(onfidoButton, false);
                Completable completableVibrateForSuccess = getVibratorService$onfido_capture_sdk_core_release().vibrateForSuccess();
                Completable completableInterruptAnnouncement = getAnnouncementService$onfido_capture_sdk_core_release().interruptAnnouncement();
                AnnouncementService announcementService$onfido_capture_sdk_core_release = getAnnouncementService$onfido_capture_sdk_core_release();
                String string = getString(R.string.onfido_video_capture_frame_success_accessibility);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                new ogm.c(new CompletableSource[]{completableVibrateForSuccess, completableInterruptAnnouncement, AnnouncementService.announceString$default(announcementService$onfido_capture_sdk_core_release, new String[]{string}, false, 2, (Object) null)}, 0).e();
                ViewUtil.setViewVisibilityWithoutAnimation(getBinding$onfido_capture_sdk_core_release().overlayTextContainer, false);
                OverlayView overlayView = this.overlayView;
                if (overlayView == null) {
                    Intrinsics.r("overlayView");
                    throw null;
                }
                OverlayView.showFaceConfirmationTick$default(overlayView, null, 1, null);
                getPresenter$onfido_capture_sdk_core_release().onFaceDetected$onfido_capture_sdk_core_release();
                Handler handler = this.handler;
                String string2 = getString(R.string.onfido_video_capture_frame_success_accessibility);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                handler.postDelayed(new Runnable() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$onFaceDetected$$inlined$postDelayed$default$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        OnfidoCamera.VideoRecorder videoRecorder2 = this.this$0.recorder;
                        if (videoRecorder2 == null || !videoRecorder2.isRecording()) {
                            OverlayView overlayView2 = this.this$0.overlayView;
                            if (overlayView2 == null) {
                                Intrinsics.r("overlayView");
                                throw null;
                            }
                            OverlayView.resetFaceDetectedState$default(overlayView2, false, false, false, 7, null);
                            this.this$0.getPresenter$onfido_capture_sdk_core_release().onAutoLivenessRecordingStart$onfido_capture_sdk_core_release();
                        }
                    }
                }, StringExtensionsKt.readingTimeMilliseconds(string2));
            }
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onFaceDetectionTimeout() {
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton == null) {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
        ViewExtensionsKt.toVisible$default(onfidoButton, false, 1, null);
        AccessibilityExtensionsKt.sendAccessibilityFocusEvent(onfidoButton);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onFaceOutTimeout() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
        getPresenter$onfido_capture_sdk_core_release().stop$onfido_capture_sdk_core_release();
        getBinding$onfido_capture_sdk_core_release().livenessOverlayView.stopFaceTracking$onfido_capture_sdk_core_release();
        getPresenter$onfido_capture_sdk_core_release().trackVideoCaptureTimeout$onfido_capture_sdk_core_release();
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_video_capture_prompt_header_restart), R.string.onfido_video_capture_prompt_detail_restart, R.string.onfido_video_capture_prompt_button_restart, (Integer) null, false, (Function1) null, (Function1) new C20301(), 56, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onFaceTrackingTimeout() {
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton == null) {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
        ViewExtensionsKt.toVisible$default(onfidoButton, false, 1, null);
        AccessibilityExtensionsKt.sendAccessibilityFocusEvent(onfidoButton);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onImageProcessingFinished() {
        this.handler.postDelayed(this.glareBubbleRunnable, 300L);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onInvalidCertificateDetected(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intent intentPutExtra = new Intent().putExtra("INVALID_CERTIFICATE_MESSAGE", message);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(OnfidoActivity.RESULT_EXIT_INVALID_CERTIFICATE, intentPutExtra);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onLivePhotoUploaded(@NotNull LivePhotoUpload photoUpload) {
        Intrinsics.checkNotNullParameter(photoUpload, "photoUpload");
        getPresenter$onfido_capture_sdk_core_release().onFaceSelfieUploaded$onfido_capture_sdk_core_release();
        getPresenter$onfido_capture_sdk_core_release().callMediaCallback$onfido_capture_sdk_core_release();
        finishWithResult$onfido_capture_sdk_core_release(-1, getLivePhotoUploadResultIntent(photoUpload));
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayView.ChallengesListener
    public void onLivenessChallengeFinished() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.showFaceConfirmationTick(new C20311());
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onManualFallbackDelayFinished() {
        if (getIsOnConfirmationStep() || !getPresenter$onfido_capture_sdk_core_release().shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
            return;
        }
        View view = this.captureButton;
        if (view == null) {
            Intrinsics.r("captureButton");
            throw null;
        }
        ViewExtensionsKt.toVisible$default(view, false, 1, null);
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding$onfido_capture_sdk_core_release().liveValidationBubble;
        onfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release(new OnfidoCaptureValidationBubble.Content.Info(R.string.onfido_doc_capture_alert_manual_capture_title, Integer.valueOf(R.string.onfido_doc_capture_alert_manual_capture_detail)), IS_FRONT_SIDE_DEFAULT);
        onfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release(new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(IS_FRONT_SIDE_DEFAULT)), IS_FRONT_SIDE_DEFAULT);
        onfidoCaptureValidationBubble.setState$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.State.HARD_LOCK);
        onfidoCaptureValidationBubble.getHandler().postDelayed(new a0.a(onfidoCaptureValidationBubble, 16), onfidoCaptureValidationBubble.readingTimeMilliseconds$onfido_capture_sdk_core_release());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onNextChallenge(@NotNull LivenessChallengeViewModel livenessChallengeViewModel) {
        Intrinsics.checkNotNullParameter(livenessChallengeViewModel, "livenessChallengeViewModel");
        int index = livenessChallengeViewModel.getIndex();
        LivenessChallenge challenge = livenessChallengeViewModel.getChallenge();
        boolean zIsLastChallenge = livenessChallengeViewModel.isLastChallenge();
        getPresenter$onfido_capture_sdk_core_release().onNextChallenge$onfido_capture_sdk_core_release(challenge);
        getBinding$onfido_capture_sdk_core_release().livenessOverlayView.updateInfo$onfido_capture_sdk_core_release(challenge, getOnfidoConfig$onfido_capture_sdk_core_release().getManualLivenessCapture());
        getPresenter$onfido_capture_sdk_core_release().trackLivenessChallenge$onfido_capture_sdk_core_release(index, challenge.getType());
        String string = getString(zIsLastChallenge ? R.string.onfido_video_capture_button_primary_finish : R.string.onfido_video_capture_button_primary_fallback);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        OnfidoButton onfidoButton = this.livenessControlButton;
        if (onfidoButton != null) {
            onfidoButton.setText(string);
        } else {
            Intrinsics.r("livenessControlButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onNfcPropertiesFetched(@NotNull String documentId, @NotNull String documentVideoId, @NotNull NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
        if (!getIsOnConfirmationStep()) {
            showConfirmationStep();
            setConfirmationButtons(false);
        } else {
            getPresenter$onfido_capture_sdk_core_release().callMediaCallback$onfido_capture_sdk_core_release();
            hideLoading();
            finishWithResult$onfido_capture_sdk_core_release(-1, IntentHelper.INSTANCE.putNfcProperties$onfido_capture_sdk_core_release(getDocumentResultIntent(documentId, documentVideoId, false), nfcProperties));
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.OverlayView.Listener
    public void onOverlayMetrics(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.overlayMetrics = overlayMetrics;
        getPresenter$onfido_capture_sdk_core_release().onOverlayMetricsChanged$onfido_capture_sdk_core_release(overlayMetrics);
        RectF visibleCaptureRect = overlayMetrics.getVisibleCaptureRect();
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        captureActivityLayoutAdjuster.adjustLayoutParams(getIsOnConfirmationStep());
        setCaptureRegion(visibleCaptureRect);
        setLivenessOverlayMargin(visibleCaptureRect);
        setVideoRecordingIndicatorMargin(visibleCaptureRect);
        LivenessChallengesLoadingView livenessChallengesLoadingView = this.livenessChallengesLoadingView;
        if (livenessChallengesLoadingView != null) {
            livenessChallengesLoadingView.setTopLimit(overlayMetrics.getVisibleCaptureRect().bottom);
        }
        if (getPresenter$onfido_capture_sdk_core_release().shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release() && this.wasConfirmationNotShown) {
            View view = this.captureButton;
            if (view == null) {
                Intrinsics.r("captureButton");
                throw null;
            }
            ViewExtensionsKt.toInvisible$default(view, false, 1, null);
            getBinding$onfido_capture_sdk_core_release().liveValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, IS_FRONT_SIDE_DEFAULT);
        }
        adjustDummyAccessibilityView(overlayMetrics.getVisibleCaptureRect());
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        getPresenter$onfido_capture_sdk_core_release().onPause$onfido_capture_sdk_core_release();
        super.onPause();
    }

    public final void onPictureCaptured(@NotNull OnfidoImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getPresenter$onfido_capture_sdk_core_release().onPictureCaptured$onfido_capture_sdk_core_release(image);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onPoaImageCroppedAndSavedToFile(@NotNull String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intent intentPutExtra = new Intent().putExtra("poa_captured_file_name", fileName);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(-1, intentPutExtra);
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getPresenter$onfido_capture_sdk_core_release().onViewResumed$onfido_capture_sdk_core_release(getCaptureType());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public void onRetakeSelfieButtonClick() {
        getPresenter$onfido_capture_sdk_core_release().onCaptureDiscarded();
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("KEY_STATE", getPresenter$onfido_capture_sdk_core_release().getState$onfido_capture_sdk_core_release());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (getIsOnConfirmationStep()) {
            return;
        }
        getPresenter$onfido_capture_sdk_core_release().onStart$onfido_capture_sdk_core_release(getDocSide(), this.wasConfirmationNotShown, getIsOnConfirmationStep());
        if (getCaptureType() == CaptureType.VIDEO) {
            onStartLiveness();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        OnfidoCamera.VideoRecorder videoRecorder;
        super.onStop();
        getPresenter$onfido_capture_sdk_core_release().stop$onfido_capture_sdk_core_release();
        if (this.isCameraViewInitialised) {
            OverlayView overlayView = this.overlayView;
            if (overlayView == null) {
                Intrinsics.r("overlayView");
                throw null;
            }
            OverlayView.resetFaceDetectedState$default(overlayView, false, false, false, 2, null);
        }
        if (getCaptureType().isVideo() && (videoRecorder = this.recorder) != null && !videoRecorder.isRecording()) {
            OnfidoButton onfidoButton = this.livenessControlButton;
            if (onfidoButton == null) {
                Intrinsics.r("livenessControlButton");
                throw null;
            }
            ViewUtil.setViewVisibility(onfidoButton, IS_FRONT_SIDE_DEFAULT);
        }
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity
    public void onStopDuringExitWhenSentToBackgroundMode$onfido_capture_sdk_core_release() {
        BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP, null, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onStorageThresholdReached() {
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.cancel();
        }
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_video_capture_error_storage_title), R.string.onfido_video_capture_error_storage_detail, R.string.onfido_ok, (Integer) null, false, (Function1) null, (Function1) new C20321(), 56, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.liveness.challenges.loading.LivenessChallengesLoadingView.Listener
    public void onTokenExpired() {
        BaseActivity.finishWithResult$onfido_capture_sdk_core_release$default(this, OnfidoActivity.RESULT_EXIT_TOKEN_EXPIRED, null, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity
    public boolean onToolbarBackEvent$onfido_capture_sdk_core_release() {
        onBackPressed();
        return IS_FRONT_SIDE_DEFAULT;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onUploadError(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        if (errorType instanceof ErrorType.Document ? true : Intrinsics.f(errorType, ErrorType.Cutoff.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Glare.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Blur.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Barcode.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.PhotoOfScreen.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Screenshot.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Photocopy.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Scan.INSTANCE)) {
            getPresenter$onfido_capture_sdk_core_release().onUploadValidationError$onfido_capture_sdk_core_release(errorType, getCaptureType());
            return;
        }
        if (errorType instanceof ErrorType.Network) {
            getPresenter$onfido_capture_sdk_core_release().onUploadFailure$onfido_capture_sdk_core_release(getIsOnConfirmationStep() ^ IS_FRONT_SIDE_DEFAULT);
            return;
        }
        if (errorType instanceof ErrorType.InvalidCertificate) {
            onInvalidCertificateDetected(((ErrorType.InvalidCertificate) errorType).getMessage());
            return;
        }
        if (errorType instanceof ErrorType.TokenExpired) {
            onTokenExpired();
        } else if (errorType instanceof ErrorType.Geoblocked) {
            getPresenter$onfido_capture_sdk_core_release().onUploadFailureWithGeoblocking$onfido_capture_sdk_core_release(getIsOnConfirmationStep() ^ IS_FRONT_SIDE_DEFAULT);
        } else if (errorType instanceof ErrorType.Generic) {
            getPresenter$onfido_capture_sdk_core_release().onGeneralUploadError$onfido_capture_sdk_core_release();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.face.FaceConfirmationFragmentContainer
    public void onUploadSelfieButtonClick() {
        getPresenter$onfido_capture_sdk_core_release().onCaptureConfirmed();
    }

    public final void onVideoTimeoutExceeded() {
        getPresenter$onfido_capture_sdk_core_release().stop$onfido_capture_sdk_core_release();
        getBinding$onfido_capture_sdk_core_release().livenessOverlayView.stopFaceTracking$onfido_capture_sdk_core_release();
        getPresenter$onfido_capture_sdk_core_release().trackVideoCaptureTimeout$onfido_capture_sdk_core_release();
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_video_capture_prompt_title_timeout), R.string.onfido_video_capture_prompt_detail_timeout, R.string.onfido_video_capture_prompt_button_timeout, (Integer) null, false, (Function1) null, (Function1) new C20331(), 56, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void onWarningBinaryResult(@NotNull String documentId, @NotNull ErrorType errorType, boolean nfcSupported, @NotNull String documentVideoId, NfcProperties nfcProperties) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        if (getIsOnConfirmationStep()) {
            getPresenter$onfido_capture_sdk_core_release().callMediaCallback$onfido_capture_sdk_core_release();
            finishWithResult$onfido_capture_sdk_core_release(-1, IntentHelper.INSTANCE.putNfcProperties$onfido_capture_sdk_core_release(getDocumentResultIntent(documentId, documentVideoId, nfcSupported), nfcProperties));
        } else {
            showConfirmationStep();
            setConfirmationButtons(false);
            getPresenter$onfido_capture_sdk_core_release().showErrorType$onfido_capture_sdk_core_release(errorType);
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void openCaptureScreen() {
        this.isOnConfirmationStep = false;
        hideLoading();
        startCamera();
        closeConfirmationScreen();
        getBinding$onfido_capture_sdk_core_release().confirmationImage.setImageBitmap(null);
        setConfirmationStepVisibility(false);
        getPresenter$onfido_capture_sdk_core_release().clearEdges$onfido_capture_sdk_core_release();
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        overlayView.switchConfirmationMode(false);
        OverlayTextView overlayTextView = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        CaptureType captureType = getCaptureType();
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        overlayTextView.setCaptureOverlayText$onfido_capture_sdk_core_release(captureType, documentTypeUIModel, getDocSide());
        OnfidoCaptureValidationBubble postCaptureValidationBubble = getBinding$onfido_capture_sdk_core_release().postCaptureValidationBubble;
        Intrinsics.checkNotNullExpressionValue(postCaptureValidationBubble, "postCaptureValidationBubble");
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(postCaptureValidationBubble, OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, false, 2, null);
        getBinding$onfido_capture_sdk_core_release().confirmationButtons.setListener$onfido_capture_sdk_core_release(getPresenter$onfido_capture_sdk_core_release());
        ConfirmationStepButtons confirmationStepButtons = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        CaptureType captureType2 = getCaptureType();
        DocumentTypeUIModel documentTypeUIModel2 = this.documentTypeUIModel;
        if (documentTypeUIModel2 == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(documentTypeUIModel2.getReadabilityDiscardLabel());
        DocumentTypeUIModel documentTypeUIModel3 = this.documentTypeUIModel;
        if (documentTypeUIModel3 == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        confirmationStepButtons.setErrorState(false, captureType2, numValueOf, Integer.valueOf(documentTypeUIModel3.getReadabilityConfirmationLabel()));
        setColorsForCaptureScreen();
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        captureActivityLayoutAdjuster.adjustLayoutParams(getIsOnConfirmationStep());
        setCaptureFrameContentDescriptionAndTitle();
        getPresenter$onfido_capture_sdk_core_release().onStart$onfido_capture_sdk_core_release(getDocSide(), false, getIsOnConfirmationStep());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void playSingleFrameAutoCapturedAnimation() {
        OverlayView overlayView = this.overlayView;
        if (overlayView != null) {
            overlayView.onSingleFrameAutoCaptured(new C20341());
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    @Override // android.app.Activity
    public void recreate() {
        Intent intentPutExtra = new Intent().putExtra("IS_RECREATING", IS_FRONT_SIDE_DEFAULT).putExtra("onfido_intent_extra", getIntent());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(OnfidoActivity.ONFIDO_RECREATE, intentPutExtra);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void removeDummyViewsAccessibility() {
        View view = this.dummyView;
        if (view != null) {
            view.setImportantForAccessibility(2);
        } else {
            Intrinsics.r("dummyView");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void resetDocumentRecordingState() {
        ViewUtil.setViewVisibilityWithoutAnimation(getBinding$onfido_capture_sdk_core_release().overlayTextContainer, IS_FRONT_SIDE_DEFAULT);
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        overlayView.resetDocumentOverlay();
        getBinding$onfido_capture_sdk_core_release().confirmationImage.setImageBitmap(null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void restart() {
        recreate();
    }

    public final void setAnnouncementService$onfido_capture_sdk_core_release(@NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(announcementService, "<set-?>");
        this.announcementService = announcementService;
    }

    public final void setBinding$onfido_capture_sdk_core_release(@NotNull OnfidoActivityCaptureBinding onfidoActivityCaptureBinding) {
        Intrinsics.checkNotNullParameter(onfidoActivityCaptureBinding, "<set-?>");
        this.binding = onfidoActivityCaptureBinding;
    }

    public final void setCameraFactory$onfido_capture_sdk_core_release(@NotNull CameraFactory cameraFactory) {
        Intrinsics.checkNotNullParameter(cameraFactory, "<set-?>");
        this.cameraFactory = cameraFactory;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setConfirmationButtons(boolean isGenericMessage) {
        ConfirmationStepButtons confirmationStepButtons = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        confirmationStepButtons.setWarningState(false, documentTypeUIModel);
        ConfirmationStepButtons confirmationStepButtons2 = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        DocumentTypeUIModel documentTypeUIModel2 = this.documentTypeUIModel;
        if (documentTypeUIModel2 == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        int readabilityConfirmationLabel = documentTypeUIModel2.getReadabilityConfirmationLabel();
        DocumentTypeUIModel documentTypeUIModel3 = this.documentTypeUIModel;
        if (documentTypeUIModel3 != null) {
            confirmationStepButtons2.setDocumentCaptureCopy(readabilityConfirmationLabel, documentTypeUIModel3.getReadabilityDiscardLabel(), isGenericMessage);
        } else {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
    }

    public final void setCryptography$onfido_capture_sdk_core_release(@NotNull Cryptography cryptography) {
        Intrinsics.checkNotNullParameter(cryptography, "<set-?>");
        this.cryptography = cryptography;
    }

    public final void setDispatchersProvider$onfido_capture_sdk_core_release(@NotNull DispatchersProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(dispatchersProvider, "<set-?>");
        this.dispatchersProvider = dispatchersProvider;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setDocumentFormat(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat;
    }

    public final void setEnvironmentIntegrityChecker$onfido_capture_sdk_core_release(@NotNull EnvironmentIntegrityChecker environmentIntegrityChecker) {
        Intrinsics.checkNotNullParameter(environmentIntegrityChecker, "<set-?>");
        this.environmentIntegrityChecker = environmentIntegrityChecker;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setForceRetryButton() {
        CaptureConfirmationScreen captureConfirmationScreen = getCaptureConfirmationScreen();
        if (captureConfirmationScreen != null) {
            captureConfirmationScreen.setForceRetryButton();
            return;
        }
        ConfirmationStepButtons confirmationStepButtons = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        confirmationStepButtons.setWarningState(false, documentTypeUIModel);
        ConfirmationStepButtons confirmationStepButtons2 = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        CaptureType captureType = getCaptureType();
        DocumentTypeUIModel documentTypeUIModel2 = this.documentTypeUIModel;
        if (documentTypeUIModel2 == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        Integer numValueOf = Integer.valueOf(documentTypeUIModel2.getReadabilityDiscardLabel());
        DocumentTypeUIModel documentTypeUIModel3 = this.documentTypeUIModel;
        if (documentTypeUIModel3 != null) {
            confirmationStepButtons2.setErrorState(IS_FRONT_SIDE_DEFAULT, captureType, numValueOf, Integer.valueOf(documentTypeUIModel3.getReadabilityConfirmationLabel()));
        } else {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setGlareWarningContent() {
        OnfidoCaptureValidationBubble liveValidationBubble = getBinding$onfido_capture_sdk_core_release().liveValidationBubble;
        Intrinsics.checkNotNullExpressionValue(liveValidationBubble, "liveValidationBubble");
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(liveValidationBubble, new OnfidoCaptureValidationBubble.Content.Info(R.string.onfido_doc_capture_alert_glare_title, Integer.valueOf(R.string.onfido_doc_capture_alert_glare_detail)), false, 2, null);
    }

    public final void setImageUtils$onfido_capture_sdk_core_release(@NotNull ImageUtils imageUtils) {
        Intrinsics.checkNotNullParameter(imageUtils, "<set-?>");
        this.imageUtils = imageUtils;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setLiveValidationBubbleContent(@NotNull OnfidoCaptureValidationBubble.Content content) {
        Intrinsics.checkNotNullParameter(content, "content");
        OnfidoCaptureValidationBubble liveValidationBubble = getBinding$onfido_capture_sdk_core_release().liveValidationBubble;
        Intrinsics.checkNotNullExpressionValue(liveValidationBubble, "liveValidationBubble");
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(liveValidationBubble, content, false, 2, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setLiveValidationBubbleVisibilityCommand(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        OnfidoCaptureValidationBubble liveValidationBubble = getBinding$onfido_capture_sdk_core_release().liveValidationBubble;
        Intrinsics.checkNotNullExpressionValue(liveValidationBubble, "liveValidationBubble");
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(liveValidationBubble, command, false, 2, null);
    }

    public final void setOnfidoApiService$onfido_capture_sdk_core_release(@NotNull OnfidoApiService onfidoApiService) {
        Intrinsics.checkNotNullParameter(onfidoApiService, "<set-?>");
        this.onfidoApiService = onfidoApiService;
    }

    public final void setOnfidoRemoteConfig$onfido_capture_sdk_core_release(@NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "<set-?>");
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setOverlay() {
        setSupportActionBar(getBinding$onfido_capture_sdk_core_release().toolbar);
        if (getIsOnConfirmationStep()) {
            return;
        }
        setupOverlayView(getCaptureType(), getDocumentType());
        setColorsForCaptureScreen();
    }

    public final void setPayloadHelper$onfido_capture_sdk_core_release(@NotNull PayloadHelper payloadHelper) {
        Intrinsics.checkNotNullParameter(payloadHelper, "<set-?>");
        this.payloadHelper = payloadHelper;
    }

    public final void setPresenter$onfido_capture_sdk_core_release(@NotNull CapturePresenter capturePresenter) {
        Intrinsics.checkNotNullParameter(capturePresenter, "<set-?>");
        this.presenter = capturePresenter;
    }

    public final void setSchedulersProvider$onfido_capture_sdk_core_release(@NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "<set-?>");
        this.schedulersProvider = schedulersProvider;
    }

    public final void setScreenLoadTracker$onfido_capture_sdk_core_release(@NotNull ScreenLoadTracker screenLoadTracker) {
        Intrinsics.checkNotNullParameter(screenLoadTracker, "<set-?>");
        this.screenLoadTracker = screenLoadTracker;
    }

    @Override // com.onfido.android.sdk.capture.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity
    public void setSupportActionBar(Toolbar toolbar) {
        TextView textView;
        super.setSupportActionBar(toolbar);
        if (toolbar != null && (textView = (TextView) y.r(y.n(ViewGroupKt.getChildren(toolbar), ToolbarExtensionsKt$performActionOnTitleTextView$$inlined$filterIsInstance$1.INSTANCE))) != null) {
            ViewCompat.setAccessibilityHeading(textView, IS_FRONT_SIDE_DEFAULT);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(IS_FRONT_SIDE_DEFAULT);
            supportActionBar.setHomeActionContentDescription(R.string.onfido_generic_back);
        }
        if (OnfidoConfigExtensionsKt.inWorkflowMode(getOnfidoConfig$onfido_capture_sdk_core_release()) && getOnfidoRemoteConfig$onfido_capture_sdk_core_release().isStudioUserFlowExitEnabled()) {
            removeMenuProvider(getUserExitFlowMenuProvider());
            addMenuProvider(getUserExitFlowMenuProvider());
        }
    }

    public final void setTokenProvider$onfido_capture_sdk_core_release(@NotNull TokenProvider tokenProvider) {
        Intrinsics.checkNotNullParameter(tokenProvider, "<set-?>");
        this.tokenProvider = tokenProvider;
    }

    public final void setVibratorService$onfido_capture_sdk_core_release(@NotNull VibratorService vibratorService) {
        Intrinsics.checkNotNullParameter(vibratorService, "<set-?>");
        this.vibratorService = vibratorService;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setWarningConfirmationButtons(boolean isGenericMessage) {
        ConfirmationStepButtons confirmationStepButtons = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        confirmationStepButtons.setWarningState(IS_FRONT_SIDE_DEFAULT, documentTypeUIModel);
        ConfirmationStepButtons confirmationStepButtons2 = getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        DocumentTypeUIModel documentTypeUIModel2 = this.documentTypeUIModel;
        if (documentTypeUIModel2 == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        int readabilityConfirmationLabel = documentTypeUIModel2.getReadabilityConfirmationLabel();
        DocumentTypeUIModel documentTypeUIModel3 = this.documentTypeUIModel;
        if (documentTypeUIModel3 != null) {
            confirmationStepButtons2.setDocumentCaptureCopy(readabilityConfirmationLabel, documentTypeUIModel3.getReadabilityDiscardLabel(), isGenericMessage);
        } else {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setupCaptureButton() {
        View view = this.captureButton;
        if (view != null) {
            view.setOnClickListener(new a(this, 0));
        } else {
            Intrinsics.r("captureButton");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setupConfirmationButtons() {
        getBinding$onfido_capture_sdk_core_release().confirmationButtons.setListener$onfido_capture_sdk_core_release(getPresenter$onfido_capture_sdk_core_release());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void setupUploadService() {
        this.captureUploadService = new CaptureUploadService(getCaptureType(), getOnfidoApiService$onfido_capture_sdk_core_release(), this, getSchedulersProvider$onfido_capture_sdk_core_release(), getPayloadHelper$onfido_capture_sdk_core_release());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showConfirmationPreview() {
        ZoomImageView confirmationImage = getBinding$onfido_capture_sdk_core_release().confirmationImage;
        Intrinsics.checkNotNullExpressionValue(confirmationImage, "confirmationImage");
        ViewExtensionsKt.toVisible$default(confirmationImage, false, 1, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showConfirmationStep() {
        hideLoading();
        this.wasConfirmationNotShown = false;
        this.isOnConfirmationStep = IS_FRONT_SIDE_DEFAULT;
        getPresenter$onfido_capture_sdk_core_release().onConfirmationStepTracking$onfido_capture_sdk_core_release();
        if (getIsDarkModeEnabled()) {
            OverlayView overlayView = this.overlayView;
            if (overlayView == null) {
                Intrinsics.r("overlayView");
                throw null;
            }
            OverlayView.setColorOutsideOverlay$default(overlayView, getBackgroundColorConfirmationScreen(), false, 2, null);
        } else {
            updateColorsForConfirmationScreen();
        }
        if (getCaptureType() == CaptureType.FACE) {
            showFaceConfirmationFragment();
            return;
        }
        setConfirmationStepVisibility(IS_FRONT_SIDE_DEFAULT);
        if (getBinding$onfido_capture_sdk_core_release().confirmationButtons.getIsConfirmationButtonsHorizontal()) {
            getBinding$onfido_capture_sdk_core_release().confirmationButtons.enableAdaptableHorizontalButtonHeight();
            getBinding$onfido_capture_sdk_core_release().confirmationButtons.forceInnerButtonsMeasurement();
        }
        OverlayTextView overlayTextView = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        CaptureType captureType = getCaptureType();
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel == null) {
            Intrinsics.r("documentTypeUIModel");
            throw null;
        }
        overlayTextView.setConfirmationOverlayText(captureType, documentTypeUIModel);
        CaptureActivityLayoutAdjuster captureActivityLayoutAdjuster = this.captureActivityLayoutAdjuster;
        if (captureActivityLayoutAdjuster == null) {
            Intrinsics.r("captureActivityLayoutAdjuster");
            throw null;
        }
        captureActivityLayoutAdjuster.adjustLayoutParams(getIsOnConfirmationStep());
        if (getCaptureType() == CaptureType.DOCUMENT) {
            OverlayView overlayView2 = this.overlayView;
            if (overlayView2 == null) {
                Intrinsics.r("overlayView");
                throw null;
            }
            overlayView2.switchConfirmationMode(IS_FRONT_SIDE_DEFAULT);
            OverlayTextView overlayTextContainer = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
            Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
            ViewExtensionsKt.toVisible$default(overlayTextContainer, false, 1, null);
        }
        int i = getDocumentType() != null ? R.string.onfido_doc_confirmation_image_accessibility : R.string.onfido_selfie_confirmation_image_accessibility;
        View view = this.dummyView;
        if (view == null) {
            Intrinsics.r("dummyView");
            throw null;
        }
        ViewExtensionsKt.setContentDescription(view, i);
        setTitle(i);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showDialog(@NotNull LoadingFragment.Companion.DialogMode dialogMode) {
        Intrinsics.checkNotNullParameter(dialogMode, "dialogMode");
        hideLoading();
        showLoadingDialog$onfido_capture_sdk_core_release(dialogMode);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showDocumentFormatDialog() {
        int i;
        DocumentType documentType = getDocumentType();
        int i2 = documentType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[documentType.ordinal()];
        if (i2 == 1) {
            i = R.string.onfido_doc_capture_prompt_title_id;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException(("showDocumentFormatDialog() shouldn't be showed for this " + getDocumentType()).toString());
            }
            i = R.string.onfido_doc_capture_prompt_title_license;
        }
        setDocumentFormat(DocumentFormat.CARD);
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        OnfidoViewDocumentFormatSelectionBinding onfidoViewDocumentFormatSelectionBindingInflate = OnfidoViewDocumentFormatSelectionBinding.inflate(bottomSheetDialog.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(onfidoViewDocumentFormatSelectionBindingInflate, "inflate(...)");
        bottomSheetDialog.setContentView(onfidoViewDocumentFormatSelectionBindingInflate.getRoot());
        bottomSheetDialog.setCancelable(false);
        onfidoViewDocumentFormatSelectionBindingInflate.title.setText(i);
        final int i3 = 0;
        onfidoViewDocumentFormatSelectionBindingInflate.cardFormat.setOnClickListener(new View.OnClickListener() { // from class: com.onfido.android.sdk.capture.ui.camera.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CaptureActivity.showDocumentFormatDialog$lambda$7$lambda$5(bottomSheetDialog, this, view);
                        break;
                    default:
                        CaptureActivity.showDocumentFormatDialog$lambda$7$lambda$6(bottomSheetDialog, this, view);
                        break;
                }
            }
        });
        final int i5 = 1;
        onfidoViewDocumentFormatSelectionBindingInflate.foldedFormat.setOnClickListener(new View.OnClickListener() { // from class: com.onfido.android.sdk.capture.ui.camera.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        CaptureActivity.showDocumentFormatDialog$lambda$7$lambda$5(bottomSheetDialog, this, view);
                        break;
                    default:
                        CaptureActivity.showDocumentFormatDialog$lambda$7$lambda$6(bottomSheetDialog, this, view);
                        break;
                }
            }
        });
        bottomSheetDialog.show();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showError(@NotNull ErrorDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        CaptureConfirmationScreen captureConfirmationScreen = getCaptureConfirmationScreen();
        if (captureConfirmationScreen != null) {
            captureConfirmationScreen.showError(descriptor);
        } else {
            setValidationBubbleContent(descriptor.getTitle(), descriptor.getSubtitle());
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showErrorMessage(int titleResId, int messageResId, @NotNull Function1<? super DialogInterface, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(titleResId), messageResId, 0, (Integer) null, false, (Function1) null, (Function1) listener, 60, (Object) null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showFaceLivenessConfirmationScreen(@NotNull String dirPath, @NotNull LivenessPerformedChallenges performedChallanges) {
        Intrinsics.checkNotNullParameter(dirPath, "dirPath");
        Intrinsics.checkNotNullParameter(performedChallanges, "performedChallanges");
        Intent intentPutExtra = new Intent().putExtra("video_path", dirPath).putExtra("onfido_liveness_challenges", getPresenter$onfido_capture_sdk_core_release().getUploadChallengesList$onfido_capture_sdk_core_release());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        finishWithResult$onfido_capture_sdk_core_release(-1, intentPutExtra);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showLivenessButtonAndFocusWithDelay() {
        this.handler.postDelayed(new Runnable() { // from class: com.onfido.android.sdk.capture.ui.camera.CaptureActivity$showLivenessButtonAndFocusWithDelay$$inlined$postDelayed$default$1
            @Override // java.lang.Runnable
            public final void run() {
                OnfidoButton onfidoButton = this.this$0.livenessControlButton;
                if (onfidoButton == null) {
                    Intrinsics.r("livenessControlButton");
                    throw null;
                }
                ViewExtensionsKt.toVisible$default(onfidoButton, false, 1, null);
                AccessibilityExtensionsKt.sendAccessibilityFocusEvent(onfidoButton);
            }
        }, getOnfidoConfig$onfido_capture_sdk_core_release().getManualLivenessCapture() ? 0L : 5000L);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showVideoRecordCompletionTick() {
        showConfirmationPreview();
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        overlayView.onDocumentVideoRecordFinished();
        OverlayView overlayView2 = this.overlayView;
        if (overlayView2 != null) {
            overlayView2.inflateDocumentDetectionTick(new C20351());
        } else {
            Intrinsics.r("overlayView");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showVideoRecordingCompleteMessage() {
        OverlayTextView overlayTextContainer = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        OverlayTextView.setMainText$onfido_capture_sdk_core_release$default(overlayTextContainer, R.string.onfido_doc_capture_header_recording_complete, 0, false, 6, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showVideoRecordingInProgressMessage() {
        OverlayTextView overlayTextContainer = getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        OverlayTextView.setMainText$onfido_capture_sdk_core_release$default(overlayTextContainer, R.string.onfido_doc_capture_header_recording_video, 0, false, 6, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void showVideoRecordingProgressBar() {
        ImageView flipArrow = getBinding$onfido_capture_sdk_core_release().flipArrow;
        Intrinsics.checkNotNullExpressionValue(flipArrow, "flipArrow");
        flipArrow.setVisibility(8);
        LinearLayout root = getBinding$onfido_capture_sdk_core_release().videoRecordingContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.toVisible$default(root, false, 1, null);
        Completable completableInterruptAnnouncement = getAnnouncementService$onfido_capture_sdk_core_release().interruptAnnouncement();
        AnnouncementService announcementService$onfido_capture_sdk_core_release = getAnnouncementService$onfido_capture_sdk_core_release();
        String string = getString(R.string.onfido_doc_capture_header_capturing);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        new ogm.c(new CompletableSource[]{completableInterruptAnnouncement, AnnouncementService.announceString$default(announcementService$onfido_capture_sdk_core_release, new String[]{string}, false, 2, (Object) null)}, 0).e();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void startCamera() {
        CameraFactory cameraFactory$onfido_capture_sdk_core_release = getCameraFactory$onfido_capture_sdk_core_release();
        CameraSourcePreview cameraSourcePreview = getBinding$onfido_capture_sdk_core_release().cameraViewCamera1;
        PreviewView previewView = getBinding$onfido_capture_sdk_core_release().cameraViewCameraX;
        CaptureType captureType = getCaptureType();
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        OnfidoCamera onfidoCameraCreate = cameraFactory$onfido_capture_sdk_core_release.create(this, cameraSourcePreview, previewView, overlayView, captureType);
        this.onfidoCamera = onfidoCameraCreate;
        if (onfidoCameraCreate != null) {
            onfidoCameraCreate.start(getCameraFace(), new C20361());
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void startDocumentVideoRecording() {
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        overlayView.onDocumentVideoRecordStarted();
        startVideoRecording(new C20371());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void startLivenessVideoRecording(boolean isStartedManually) {
        getPresenter$onfido_capture_sdk_core_release().onRecordingStarted$onfido_capture_sdk_core_release(isStartedManually);
        getPresenter$onfido_capture_sdk_core_release().issueNextChallenge$onfido_capture_sdk_core_release();
        ViewUtil.setViewVisibilityWithoutAnimation(getBinding$onfido_capture_sdk_core_release().overlayTextContainer, false);
        LivenessOverlayView livenessOverlayView = getBinding$onfido_capture_sdk_core_release().livenessOverlayView;
        Intrinsics.checkNotNullExpressionValue(livenessOverlayView, "livenessOverlayView");
        ViewExtensionsKt.toVisible$default(livenessOverlayView, false, 1, null);
        getBinding$onfido_capture_sdk_core_release().livenessOverlayView.setListener$onfido_capture_sdk_core_release(this);
        OverlayView overlayView = this.overlayView;
        if (overlayView == null) {
            Intrinsics.r("overlayView");
            throw null;
        }
        overlayView.paintCaptureArea();
        startVideoRecording$default(this, null, 1, null);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void stopCamera() {
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.stop();
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void trackNavigationCompleted(@NotNull PerformanceAnalyticsScreen destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        getScreenLoadTracker$onfido_capture_sdk_core_release().trackNavigationCompleted$onfido_capture_sdk_core_release(destination);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void uploadImage(@NotNull byte[] jpegData) {
        Intrinsics.checkNotNullParameter(jpegData, "jpegData");
        OnfidoCaptureValidationBubble postCaptureValidationBubble = getBinding$onfido_capture_sdk_core_release().postCaptureValidationBubble;
        Intrinsics.checkNotNullExpressionValue(postCaptureValidationBubble, "postCaptureValidationBubble");
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(postCaptureValidationBubble, OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, false, 2, null);
        if (getCaptureType() == CaptureType.DOCUMENT) {
            uploadDocument(jpegData);
        } else {
            uploadSelfieForValidation(jpegData);
        }
        getPresenter$onfido_capture_sdk_core_release().trackUploadStarted$onfido_capture_sdk_core_release();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CapturePresenter.View
    public void uploadVideo(@NotNull String documentId, @NotNull String videoPath, @NotNull DocSide docSide, @NotNull DocumentType docType, CountryCode issuingCountry) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(docType, "docType");
        CaptureUploadService captureUploadService = this.captureUploadService;
        if (captureUploadService != null) {
            captureUploadService.uploadDocumentVideo$onfido_capture_sdk_core_release(documentId, videoPath, getSdkUploadMetadata(), docSide, docType, issuingCountry);
        } else {
            Intrinsics.r("captureUploadService");
            throw null;
        }
    }
}
