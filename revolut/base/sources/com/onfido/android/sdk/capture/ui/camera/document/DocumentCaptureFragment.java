package com.onfido.android.sdk.capture.ui.camera.document;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.camera.view.PreviewView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.view.OnBackPressedCallback;
import au0.b2;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.imageview.ShapeableImageView;
import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.databinding.OnfidoCaptureButtonPictureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoDummyAccessibilityViewBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentDocumentCaptureBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoViewDocumentFormatSelectionBinding;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.camera.factory.CameraFactory;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.service.VibratorService;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.BaseActivity;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.ZoomImageView;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.ui.camera.OverlayView;
import com.onfido.android.sdk.capture.ui.camera.capture.PhotoCaptureConfig;
import com.onfido.android.sdk.capture.ui.camera.document.CameraState;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotAvailableException;
import com.onfido.android.sdk.capture.ui.camera.exception.CameraNotFoundException;
import com.onfido.android.sdk.capture.ui.camera.exception.UnknownCameraException;
import com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster;
import com.onfido.android.sdk.capture.ui.camera.util.ValidationBubblesOffsetDelegate;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ErrorTypeUtilsKt;
import com.onfido.android.sdk.capture.utils.FileUtils;
import com.onfido.android.sdk.capture.utils.FlowExtKt;
import com.onfido.android.sdk.capture.utils.FragmentExtentionsKt;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.ImageUtilsExtKt;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.StringRepresentation;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewUtil;
import com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.api.client.data.DocSide;
import com.onfido.javax.inject.Provider;
import com.youTransactor.uCube.rpc.Constants;
import eg.n0;
import gim.c;
import gim.d;
import gim.i;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.k0;
import yhm.j;
import yhm.k;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 \u0096\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0096\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0006J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u000bH\u0082@¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b%\u0010\u001dJ\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0002¢\u0006\u0004\b2\u0010\u0006J\u000f\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b3\u0010\u0006J\u0010\u00104\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b4\u0010\u001dJ\u0010\u00105\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b5\u0010\u001dJ\u0017\u00108\u001a\u00020\u000b2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020*H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000bH\u0002¢\u0006\u0004\b?\u0010\u0006J\u000f\u0010@\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010\u0006J\u000f\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010-J\u000f\u0010F\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010\u0006J\u000f\u0010G\u001a\u00020\u000bH\u0002¢\u0006\u0004\bG\u0010\u0006J\u0017\u0010I\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020*H\u0002¢\u0006\u0004\bI\u0010-J\u0017\u0010L\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020JH\u0002¢\u0006\u0004\bO\u0010MJ\u000f\u0010P\u001a\u00020\u000bH\u0002¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010Q\u001a\u00020\u000bH\u0002¢\u0006\u0004\bQ\u0010\u0006J\u0017\u0010T\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u000bH\u0002¢\u0006\u0004\bY\u0010\u0006J\u0017\u0010\\\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010`\u001a\u00020\u000b2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^H\u0002¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u000bH\u0002¢\u0006\u0004\bb\u0010\u0006J\u000f\u0010c\u001a\u00020\u000bH\u0002¢\u0006\u0004\bc\u0010\u0006J\u0017\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u000bH\u0002¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u000bH\u0002¢\u0006\u0004\bi\u0010\u0006J\u0017\u0010k\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020ZH\u0002¢\u0006\u0004\bk\u0010]J\u000f\u0010l\u001a\u00020\u000bH\u0002¢\u0006\u0004\bl\u0010\u0006J\u000f\u0010m\u001a\u00020\u000bH\u0002¢\u0006\u0004\bm\u0010\u0006J\u000f\u0010n\u001a\u00020\u000bH\u0002¢\u0006\u0004\bn\u0010\u0006J\u0017\u0010q\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020\u000bH\u0002¢\u0006\u0004\bs\u0010\u0006J\u000f\u0010t\u001a\u00020\u000bH\u0002¢\u0006\u0004\bt\u0010\u0006J\u0017\u0010w\u001a\u00020\u000b2\u0006\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u000bH\u0002¢\u0006\u0004\by\u0010\u0006J\u000f\u0010z\u001a\u00020\u000bH\u0002¢\u0006\u0004\bz\u0010\u0006J\u0019\u0010}\u001a\u00020\u000b2\b\b\u0001\u0010|\u001a\u00020{H\u0002¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u007f\u0010\u0006J\u0011\u0010\u0080\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u0006J\u0011\u0010\u0081\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0081\u0001\u0010\u0006J\u001c\u0010\u0084\u0001\u001a\u00020\u000b2\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0006J\u001a\u0010\u0088\u0001\u001a\u00020\u000b2\u0007\u0010\u0087\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u0088\u0001\u0010-J\u0011\u0010\u0089\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\u0006J\u0011\u0010\u008a\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0006J\u001a\u0010\u008c\u0001\u001a\u00020\u000b2\u0007\u0010\u008b\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u008c\u0001\u0010-J\u001a\u0010\u008e\u0001\u001a\u00020\u000b2\u0007\u0010\u008d\u0001\u001a\u00020*H\u0002¢\u0006\u0005\b\u008e\u0001\u0010-J\u0011\u0010\u008f\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0006J\u0013\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0093\u0001\u0010\u0006J\u0011\u0010\u0094\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0094\u0001\u0010\u0006J\u001a\u0010\u0096\u0001\u001a\u00020\u000b2\u0007\u0010\u0095\u0001\u001a\u00020ZH\u0002¢\u0006\u0005\b\u0096\u0001\u0010]J\u001a\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0095\u0001\u001a\u00020ZH\u0002¢\u0006\u0005\b\u0097\u0001\u0010]J\u0011\u0010\u0098\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0006J\u0011\u0010\u0099\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0006J\u0011\u0010\u009a\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0006J\u0011\u0010\u009b\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u0006J\u0011\u0010\u009c\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u009c\u0001\u0010\u0006J\u001c\u0010\u009e\u0001\u001a\u00020\u000b2\t\b\u0001\u0010\u009d\u0001\u001a\u00020{H\u0002¢\u0006\u0005\b\u009e\u0001\u0010~J\u0019\u0010\u009f\u0001\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020VH\u0002¢\u0006\u0005\b\u009f\u0001\u0010XJ!\u0010£\u0001\u001a\u00020\u000b2\r\u0010¢\u0001\u001a\b0 \u0001j\u0003`¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J>\u0010©\u0001\u001a\u00020\u000b2\t\b\u0001\u0010¥\u0001\u001a\u00020{2\t\b\u0001\u0010¦\u0001\u001a\u00020{2\u0014\u0010¨\u0001\u001a\u000f\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u000b0§\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0011\u0010«\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b«\u0001\u0010\u0006J\u001c\u0010®\u0001\u001a\u00020\u000b2\b\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001R1\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010°\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R!\u0010¼\u0001\u001a\u00030±\u00018@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\bº\u0001\u0010»\u0001R*\u0010¾\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R*\u0010Å\u0001\u001a\u00030Ä\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R*\u0010Ì\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R*\u0010Ó\u0001\u001a\u00030Ò\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R*\u0010Ú\u0001\u001a\u00030Ù\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010à\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u001c\u0010ã\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u001c\u0010æ\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010ë\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001c\u0010î\u0001\u001a\u0005\u0018\u00010í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0019\u0010ð\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0001\u0010ì\u0001R\u0019\u0010ñ\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ì\u0001R\u0019\u0010ò\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ì\u0001R\u0018\u0010ô\u0001\u001a\u00030ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u001a\u0010÷\u0001\u001a\u00030ö\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R\u001a\u0010ú\u0001\u001a\u00030ù\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0017\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0015\u0010ü\u0001R\u001a\u0010þ\u0001\u001a\u00030ý\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0019\u0010\u0080\u0002\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0002\u0010ì\u0001R!\u0010\u0085\u0002\u001a\u00030\u0081\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0002\u0010¹\u0001\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002R\u0018\u0010\u0088\u0002\u001a\u00030à\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0018\u0010\u008a\u0002\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0002\u0010\u0092\u0001R\u0018\u0010\u008d\u0002\u001a\u00030å\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R\u0018\u0010\u0090\u0002\u001a\u00030è\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0017\u0010\u0093\u0002\u001a\u00020{8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0017\u0010\u0095\u0002\u001a\u00020{8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0092\u0002¨\u0006\u0097\u0002"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView$Listener;", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Listener;", "Lcom/onfido/android/sdk/capture/utils/WorkflowToolbarUpdateListener;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onResume", "onStop", "onDestroyView", "onCaptureConfirmed", "onCaptureDiscarded", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetrics", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "onWorkflowToolbarUpdated", "setupUiElements", "(Landroid/view/View;)V", "openCaptureScreen", "setupObservers", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeConfirmation", "observeVideoRecordingState", "observeVideoRecordingInfo", "observeLoading", "observeErrorMessages", "observeCaptureErrorDialog", "observeAccessibilityRectangleDetection", "observeAccessibilityCaptureResult", "Lcom/onfido/android/sdk/capture/ui/camera/document/CameraState;", "state", "changeCameraState", "(Lcom/onfido/android/sdk/capture/ui/camera/document/CameraState;)V", "", "shouldShow", "showPostCaptureValidationBubble", "(Z)V", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$BinaryUploadWarningEvent;", "event", "handleBinaryUploadWarning", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$BinaryUploadWarningEvent;)V", "initDocumentTypeUIModel", "initLayoutAdjuster", "observeLiveValidationBubbleContent", "observeLiveValidationBubbleVisibility", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;", "content", "setLiveValidationBubbleContent", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;)V", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "command", "shouldIgnoreLock", "setLiveValidationBubbleVisibilityCommand", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;Z)V", "onManualFallbackDelayFinished", "onImageProcessingFinished", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "getOrientation", "()Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "isEnabled", "enableTorch", "inflateCaptureButton", "setupCaptureButton", "playSingleFrameAutoCapturedAnimation", "capture", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "applyValidations", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "onfidoImage", "setImagePreview", "updateConfirmationImageTranslationAndScale", "runAutoCaptureAccessibilityEvents", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult$Completed;", "result", "onDocumentCreated", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult$Completed;)V", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;", "processCaptureResult", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;)V", "inflateDummyAccessibilityView", "Landroid/graphics/RectF;", "visibleCaptureRect", "adjustDummyAccessibilityView", "(Landroid/graphics/RectF;)V", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "forFormat", "setCaptureFrameContentDescriptionAndTitle", "(Lcom/onfido/android/sdk/capture/DocumentFormat;)V", "startCamera", "onCameraStarted", "", "frame", "onNextFrame", "(Ljava/lang/Object;)V", "onCameraNotFound", "onCameraUnavailable", "captureRect", "setVideoRecordingIndicatorMargin", "startDocumentVideoRecording", "stopDocumentVideoRecording", "startVideoRecording", "", "filePath", "onVideoCaptured", "(Ljava/lang/String;)V", "onVideoCanceled", "onVideoTimeoutExceeded", "Landroid/content/DialogInterface;", "dialog", "onVideoTimeoutRetryClick", "(Landroid/content/DialogInterface;)V", "showVideoRecordingProgressBar", "hideVideoRecordingProgressBar", "", "dialogTitle", "showDocumentFormatSelectionDialog", "(I)V", "onCardFormatSelected", "onFoldedFormatSelected", "hideLoading", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "dialogMode", "showLoading", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "showConfirmationStep", "visible", "setConfirmationStepVisibility", "prepareColorsForConfirmationStep", "setupConfirmationButtonsListener", "isWarning", "setConfirmationButtons", "isError", "setConfirmationButtonsForError", "setButtonsForForceRetry", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "inflateOverlayView", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "setupOverlayView", "updateOverlayView", "rect", "setCaptureRegion", "showDocumentOverlay", "hideDocumentOverlay", "setColorsForCaptureScreen", "initValidationBubbleDelegate", "setupToolbar", "updateColorsForConfirmationScreen", "color", "changeStatusBarColor", "finishWithResult", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "finishWithException", "(Ljava/lang/Exception;)V", "titleResId", "messageResId", "Lkotlin/Function1;", "listener", "showErrorMessage", "(IILkotlin/jvm/functions/Function1;)V", "showCaptureErrorDialog", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "descriptor", "showErrorInValidationBubble", "(Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;)V", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;", "viewModelProvider", "Lcom/onfido/javax/inject/Provider;", "getViewModelProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/javax/inject/Provider;", "setViewModelProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/javax/inject/Provider;)V", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;", "viewModel", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "permissionsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "getPermissionsManager$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "setPermissionsManager$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;)V", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "vibratorService", "Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "getVibratorService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/VibratorService;", "setVibratorService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/VibratorService;)V", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "cameraFactory", "Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "getCameraFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;", "setCameraFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/factory/CameraFactory;)V", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentDocumentCaptureBinding;", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentDocumentCaptureBinding;", "_overlayView", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayView;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "_captureButtonBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "_dummyAccessibilityBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "isCameraViewInitialised", "Z", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "recorder", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "isOnConfirmationStep", "wasConfirmationNotShown", "hasOngoingCaptureRequest", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "onfidoCamera", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster;", "layoutAdjuster", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster;", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "validationBubbleOffsetDelegate", "Lcom/onfido/android/sdk/capture/ui/camera/util/ValidationBubblesOffsetDelegate;", "isProofOfAddress", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "documentFormatBottomDialog$delegate", "getDocumentFormatBottomDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "documentFormatBottomDialog", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentDocumentCaptureBinding;", "binding", "getOverlayView", "overlayView", "getCaptureButtonBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoCaptureButtonPictureBinding;", "captureButtonBinding", "getDummyAccessibilityBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoDummyAccessibilityViewBinding;", "dummyAccessibilityBinding", "getBackgroundColorCaptureScreen", "()I", "backgroundColorCaptureScreen", "getBackgroundColorConfirmationScreen", "backgroundColorConfirmationScreen", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureFragment extends BaseFragment implements OverlayView.Listener, ConfirmationStepButtons.Listener, WorkflowToolbarUpdateListener {
    private static final long GLARE_BUBBLE_FINAL_ANIMATION_DELAY_MS = 300;
    private static final float IMAGE_PREVIEW_SCALE_X = 1.0f;
    private OnfidoFragmentDocumentCaptureBinding _binding;
    private OnfidoCaptureButtonPictureBinding _captureButtonBinding;
    private OnfidoDummyAccessibilityViewBinding _dummyAccessibilityBinding;
    private OverlayView _overlayView;
    public AnnouncementService announcementService;
    public CameraFactory cameraFactory;

    /* JADX INFO: renamed from: documentFormatBottomDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy documentFormatBottomDialog;
    private boolean hasOngoingCaptureRequest;
    public ImageUtils imageUtils;
    private boolean isCameraViewInitialised;
    private boolean isOnConfirmationStep;
    private boolean isProofOfAddress;
    private CaptureLayoutAdjuster layoutAdjuster;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    private OnfidoCamera onfidoCamera;
    private OverlayMetrics overlayMetrics;
    public RuntimePermissionsManager permissionsManager;
    private OnfidoCamera.VideoRecorder recorder;
    private ValidationBubblesOffsetDelegate validationBubbleOffsetDelegate;
    public VibratorService vibratorService;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;
    public Provider viewModelProvider;
    private boolean wasConfirmationNotShown;

    @NotNull
    private static final String KEY_DATA_BUNDLE = "key_data_bundle";

    @NotNull
    private static final String KEY_NFC_ARGUMENTS = "key_nfc_arguments";

    @NotNull
    private static final String KEY_FRONT_SIDE = "key_front_side";

    @NotNull
    public static final String KEY_DOCUMENT_CAPTURE_FRAGMENT_TAG = "DocumentCapture";

    @NotNull
    private static final String KEY_PROOF_OF_ADDRESS = "key_proof_of_address";

    @NotNull
    private static final String KEY_REQUEST = "key_request";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureFragment$Companion;", "", "()V", "GLARE_BUBBLE_FINAL_ANIMATION_DELAY_MS", "", "IMAGE_PREVIEW_SCALE_X", "", "KEY_DATA_BUNDLE", "", "KEY_DOCUMENT_CAPTURE_FRAGMENT_TAG", "KEY_FRONT_SIDE", "KEY_NFC_ARGUMENTS", "KEY_PROOF_OF_ADDRESS", "KEY_REQUEST", "newInstance", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureFragment;", "requestKey", "captureDataBundle", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "isFrontSide", "", "isProofOfAddress", "nfcArguments", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DocumentCaptureFragment newInstance(@NotNull String requestKey, @NotNull CaptureStepDataBundle captureDataBundle, boolean isFrontSide, boolean isProofOfAddress, @NotNull NfcArguments nfcArguments) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(captureDataBundle, "captureDataBundle");
            Intrinsics.checkNotNullParameter(nfcArguments, "nfcArguments");
            DocumentCaptureFragment documentCaptureFragment = new DocumentCaptureFragment();
            documentCaptureFragment.setArguments(BundleKt.bundleOf(new Pair("key_request", requestKey), new Pair("key_data_bundle", captureDataBundle), new Pair("key_front_side", Boolean.valueOf(isFrontSide)), new Pair("key_proof_of_address", Boolean.valueOf(isProofOfAddress)), new Pair("key_nfc_arguments", nfcArguments)));
            return documentCaptureFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$capture$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Unit> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3723invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3723invoke() {
            DocumentCaptureFragment.this.runAutoCaptureAccessibilityEvents();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$capture$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$PictureCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<OnfidoCamera.PictureCaptureEvent, Unit> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.PictureCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.PictureCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event instanceof OnfidoCamera.PictureCaptureEvent.Captured) {
                DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().onPictureCaptured$onfido_capture_sdk_core_release(((OnfidoCamera.PictureCaptureEvent.Captured) event).getImage());
            } else if (event instanceof OnfidoCamera.PictureCaptureEvent.Error) {
                DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().onPictureCaptureFailed$onfido_capture_sdk_core_release();
            }
            DocumentCaptureFragment.this.hasOngoingCaptureRequest = false;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {517}, m = "observeAccessibilityCaptureResult")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20531 extends c {
        int label;
        /* synthetic */ Object result;

        public C20531(Continuation<? super C20531> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeAccessibilityCaptureResult(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {510}, m = "observeAccessibilityRectangleDetection")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20551 extends c {
        int label;
        /* synthetic */ Object result;

        public C20551(Continuation<? super C20551> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeAccessibilityRectangleDetection(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {505}, m = "observeCaptureErrorDialog")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20571 extends c {
        int label;
        /* synthetic */ Object result;

        public C20571(Continuation<? super C20571> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeCaptureErrorDialog(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {442}, m = "observeConfirmation")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20591 extends c {
        int label;
        /* synthetic */ Object result;

        public C20591(Continuation<? super C20591> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeConfirmation(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {492}, m = "observeErrorMessages")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20611 extends c {
        int label;
        /* synthetic */ Object result;

        public C20611(Continuation<? super C20611> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeErrorMessages(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment", f = "DocumentCaptureFragment.kt", l = {481}, m = "observeLoading")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20651 extends c {
        int label;
        /* synthetic */ Object result;

        public C20651(Continuation<? super C20651> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureFragment.this.observeLoading(this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onCameraNotFound$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20691 extends u implements Function1<DialogInterface, Unit> {
        public C20691() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            DocumentCaptureFragment.this.finishWithException(CameraNotFoundException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onCameraUnavailable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20711 extends u implements Function1<DialogInterface, Unit> {
        public C20711() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            DocumentCaptureFragment.this.finishWithException(CameraNotAvailableException.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onImageProcessingFinished$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onImageProcessingFinished$1", f = "DocumentCaptureFragment.kt", l = {642}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20721 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20721(Continuation<? super C20721> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureFragment.this.new C20721(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                this.label = 1;
                if (k0.b(300L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            DocumentCaptureFragment.setLiveValidationBubbleVisibilityCommand$default(DocumentCaptureFragment.this, OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, false, 2, null);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20721) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onVideoTimeoutExceeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20731 extends u implements Function1<DialogInterface, Unit> {
        public C20731() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            DocumentCaptureFragment.this.onVideoTimeoutRetryClick(dialog);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onViewCreated$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onViewCreated$2", f = "DocumentCaptureFragment.kt", l = {Constants.TAG_E5_FUNCTION_LOG_CONFIGURATION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20752 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onViewCreated$2$1, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$onViewCreated$2$1", f = "DocumentCaptureFragment.kt", l = {230}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.setupObservers(this) == aVar) {
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

        public C20752(Continuation<? super C20752> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureFragment.this.new C20752(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                DocumentCaptureFragment documentCaptureFragment = DocumentCaptureFragment.this;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(documentCaptureFragment, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(documentCaptureFragment, state, anonymousClass1, this) == aVar) {
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
            return ((C20752) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$runAutoCaptureAccessibilityEvents$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$runAutoCaptureAccessibilityEvents$1", f = "DocumentCaptureFragment.kt", l = {744, 745, 748}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20761 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20761(Continuation<? super C20761> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureFragment.this.new C20761(continuation);
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
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.VibratorService r7 = r7.getVibratorService$onfido_capture_sdk_core_release()
                io.reactivex.rxjava3.core.Completable r7 = r7.vibrateForSuccess()
                r6.label = r3
                java.lang.Object r7 = tz4.d.f(r7, r6)
                if (r7 != r0) goto L39
                goto L71
            L39:
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r7 = r7.getAnnouncementService$onfido_capture_sdk_core_release()
                io.reactivex.rxjava3.core.Completable r7 = r7.interruptAnnouncement()
                r6.label = r4
                java.lang.Object r7 = tz4.d.f(r7, r6)
                if (r7 != r0) goto L4c
                goto L71
            L4c:
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r7 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r7 = r7.getAnnouncementService$onfido_capture_sdk_core_release()
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r1 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                int r3 = com.onfido.android.sdk.capture.R.string.onfido_doc_capture_frame_success_accessibility
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
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20761.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20761) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2", f = "DocumentCaptureFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20772 extends i implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$1, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$1", f = "DocumentCaptureFragment.kt", l = {350}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$showDocumentFormatSelectionDialog(DocumentCaptureFragment documentCaptureFragment, int i, Continuation continuation) {
                documentCaptureFragment.showDocumentFormatSelectionDialog(i);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow docFormatDialogTitleFlow$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getDocFormatDialogTitleFlow();
                    C03651 c03651 = new C03651(this.this$0);
                    this.label = 1;
                    if (FlowExtKt.collectNotNull(docFormatDialogTitleFlow$onfido_capture_sdk_core_release, c03651, this) == aVar) {
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

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class C03651 implements FlowCollector, n {
                final /* synthetic */ DocumentCaptureFragment $tmp0;

                public C03651(DocumentCaptureFragment documentCaptureFragment) {
                    this.$tmp0 = documentCaptureFragment;
                }

                public final Object emit(int i, @NotNull Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$showDocumentFormatSelectionDialog = AnonymousClass1.invokeSuspend$showDocumentFormatSelectionDialog(this.$tmp0, i, continuation);
                    return objInvokeSuspend$showDocumentFormatSelectionDialog == fim.a.COROUTINE_SUSPENDED ? objInvokeSuspend$showDocumentFormatSelectionDialog : Unit.f186387a;
                }

                public final boolean equals(Object obj2) {
                    if ((obj2 instanceof FlowCollector) && (obj2 instanceof n)) {
                        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.n
                @NotNull
                public final Function getFunctionDelegate() {
                    return new kotlin.jvm.internal.a(2, 4, DocumentCaptureFragment.class, this.$tmp0, "showDocumentFormatSelectionDialog", "showDocumentFormatSelectionDialog(I)V");
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$10, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$10", f = "DocumentCaptureFragment.kt", l = {396}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass10 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass10(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow startCapture$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getStartCapture();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.10.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.capture(z);
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    Object objCollect = startCapture$onfido_capture_sdk_core_release.collect(new n0(flowCollector, 7), this);
                    if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
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
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$11, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$11", f = "DocumentCaptureFragment.kt", l = {400}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass11 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass11(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow imageProcessingFinished$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getImageProcessingFinished();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.11.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.onImageProcessingFinished();
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (imageProcessingFinished$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$12, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$12", f = "DocumentCaptureFragment.kt", l = {WalletConstants.ERROR_CODE_INVALID_PARAMETERS}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass12 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass12(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow manualFallbackDelayFinished$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getManualFallbackDelayFinished();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.12.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.onManualFallbackDelayFinished();
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (manualFallbackDelayFinished$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$13, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$13", f = "DocumentCaptureFragment.kt", l = {WalletConstants.ERROR_CODE_BUYER_ACCOUNT_ERROR}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass13 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass13(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow captureButtonVisibility$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getCaptureButtonVisibility();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.13.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            if (z) {
                                ImageView captureButton = documentCaptureFragment.getCaptureButtonBinding().captureButton;
                                Intrinsics.checkNotNullExpressionValue(captureButton, "captureButton");
                                ViewExtensionsKt.toVisible$default(captureButton, false, 1, null);
                            } else {
                                ImageView captureButton2 = documentCaptureFragment.getCaptureButtonBinding().captureButton;
                                Intrinsics.checkNotNullExpressionValue(captureButton2, "captureButton");
                                ViewExtensionsKt.toGone$default(captureButton2, false, 1, null);
                            }
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (captureButtonVisibility$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$14, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$14", f = "DocumentCaptureFragment.kt", l = {420}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass14 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass14(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow shouldOpenCaptureScreen$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getShouldOpenCaptureScreen();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.14.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            if (z) {
                                documentCaptureFragment.openCaptureScreen();
                            }
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (shouldOpenCaptureScreen$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$15, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$15", f = "DocumentCaptureFragment.kt", l = {424}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass15 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleBinaryUploadWarning(DocumentCaptureFragment documentCaptureFragment, DocumentCaptureViewModel.BinaryUploadWarningEvent binaryUploadWarningEvent, Continuation continuation) {
                documentCaptureFragment.handleBinaryUploadWarning(binaryUploadWarningEvent);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass15(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow binaryUploadWarning$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getBinaryUploadWarning();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (binaryUploadWarning$onfido_capture_sdk_core_release.collect(anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$15$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class AnonymousClass1 implements FlowCollector, n {
                final /* synthetic */ DocumentCaptureFragment $tmp0;

                public AnonymousClass1(DocumentCaptureFragment documentCaptureFragment) {
                    this.$tmp0 = documentCaptureFragment;
                }

                public final Object emit(@NotNull DocumentCaptureViewModel.BinaryUploadWarningEvent binaryUploadWarningEvent, @NotNull Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleBinaryUploadWarning = AnonymousClass15.invokeSuspend$handleBinaryUploadWarning(this.$tmp0, binaryUploadWarningEvent, continuation);
                    return objInvokeSuspend$handleBinaryUploadWarning == fim.a.COROUTINE_SUSPENDED ? objInvokeSuspend$handleBinaryUploadWarning : Unit.f186387a;
                }

                public final boolean equals(Object obj2) {
                    if ((obj2 instanceof FlowCollector) && (obj2 instanceof n)) {
                        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.n
                @NotNull
                public final Function getFunctionDelegate() {
                    return new kotlin.jvm.internal.a(2, 4, DocumentCaptureFragment.class, this.$tmp0, "handleBinaryUploadWarning", "handleBinaryUploadWarning(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$BinaryUploadWarningEvent;)V");
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((DocumentCaptureViewModel.BinaryUploadWarningEvent) obj2, (Continuation<? super Unit>) continuation);
                }
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$16, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$16", f = "DocumentCaptureFragment.kt", l = {427}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass16 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass16(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeConfirmation(this) == aVar) {
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
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$17, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$17", f = "DocumentCaptureFragment.kt", l = {428}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass17 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass17(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass17> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass17(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeLoading(this) == aVar) {
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
                return ((AnonymousClass17) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$18, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$18", f = "DocumentCaptureFragment.kt", l = {429}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass18 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass18(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass18> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass18(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeErrorMessages(this) == aVar) {
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
                return ((AnonymousClass18) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$19, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$19", f = "DocumentCaptureFragment.kt", l = {430}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass19 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass19(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass19> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass19(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeCaptureErrorDialog(this) == aVar) {
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
                return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$2, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$2", f = "DocumentCaptureFragment.kt", l = {354}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03662 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03662(DocumentCaptureFragment documentCaptureFragment, Continuation<? super C03662> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$changeCameraState(DocumentCaptureFragment documentCaptureFragment, CameraState cameraState, Continuation continuation) {
                documentCaptureFragment.changeCameraState(cameraState);
                return Unit.f186387a;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03662(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow cameraState$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getCameraState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
                    this.label = 1;
                    if (cameraState$onfido_capture_sdk_core_release.collect(anonymousClass1, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03662) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class AnonymousClass1 implements FlowCollector, n {
                final /* synthetic */ DocumentCaptureFragment $tmp0;

                public AnonymousClass1(DocumentCaptureFragment documentCaptureFragment) {
                    this.$tmp0 = documentCaptureFragment;
                }

                public final Object emit(@NotNull CameraState cameraState, @NotNull Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$changeCameraState = C03662.invokeSuspend$changeCameraState(this.$tmp0, cameraState, continuation);
                    return objInvokeSuspend$changeCameraState == fim.a.COROUTINE_SUSPENDED ? objInvokeSuspend$changeCameraState : Unit.f186387a;
                }

                public final boolean equals(Object obj2) {
                    if ((obj2 instanceof FlowCollector) && (obj2 instanceof n)) {
                        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.n
                @NotNull
                public final Function getFunctionDelegate() {
                    return new kotlin.jvm.internal.a(2, 4, DocumentCaptureFragment.class, this.$tmp0, "changeCameraState", "changeCameraState(Lcom/onfido/android/sdk/capture/ui/camera/document/CameraState;)V");
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((CameraState) obj2, (Continuation<? super Unit>) continuation);
                }
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$20, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$20", f = "DocumentCaptureFragment.kt", l = {431}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass20 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass20(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass20> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass20(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeVideoRecordingState(this) == aVar) {
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
                return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$21, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$21", f = "DocumentCaptureFragment.kt", l = {432}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass21 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass21(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass21> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass21(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeVideoRecordingInfo(this) == aVar) {
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
                return ((AnonymousClass21) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$22, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$22", f = "DocumentCaptureFragment.kt", l = {OnfidoActivity.ONFIDO_RECREATE}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass22 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass22(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass22> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass22(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeLiveValidationBubbleContent(this) == aVar) {
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
                return ((AnonymousClass22) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$23, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$23", f = "DocumentCaptureFragment.kt", l = {434}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass23 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass23(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass23> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass23(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeLiveValidationBubbleVisibility(this) == aVar) {
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
                return ((AnonymousClass23) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$24, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$24", f = "DocumentCaptureFragment.kt", l = {435}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass24 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass24(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass24> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass24(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeAccessibilityRectangleDetection(this) == aVar) {
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
                return ((AnonymousClass24) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$25, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$25", f = "DocumentCaptureFragment.kt", l = {436}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass25 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass25(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass25> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass25(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    this.label = 1;
                    if (documentCaptureFragment.observeAccessibilityCaptureResult(this) == aVar) {
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
                return ((AnonymousClass25) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$3, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$3", f = "DocumentCaptureFragment.kt", l = {358}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass3 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow applyValidationsFlow$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getApplyValidationsFlow();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.3.1
                        public final Object emit(@NotNull OnfidoImage onfidoImage, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.applyValidations(onfidoImage);
                            return Unit.f186387a;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((OnfidoImage) obj3, (Continuation<? super Unit>) continuation);
                        }
                    };
                    this.label = 1;
                    if (applyValidationsFlow$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$4, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$4", f = "DocumentCaptureFragment.kt", l = {363}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass4 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow hidePostCaptureValidationBubbleFlow$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getHidePostCaptureValidationBubbleFlow();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.4.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.showPostCaptureValidationBubble(false);
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (hidePostCaptureValidationBubbleFlow$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$5, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$5", f = "DocumentCaptureFragment.kt", l = {368}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass5 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass5(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow validCaptureFlow$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getValidCaptureFlow();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.5.1
                        public final Object emit(@NotNull DocumentCaptureViewModel.ValidCaptureEvent validCaptureEvent, @NotNull Continuation<? super Unit> continuation) {
                            if (validCaptureEvent.isValid()) {
                                documentCaptureFragment.setConfirmationButtons(false);
                            } else {
                                documentCaptureFragment.onCaptureDiscarded();
                            }
                            return Unit.f186387a;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((DocumentCaptureViewModel.ValidCaptureEvent) obj3, (Continuation<? super Unit>) continuation);
                        }
                    };
                    this.label = 1;
                    if (validCaptureFlow$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$6, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$6", f = "DocumentCaptureFragment.kt", l = {378}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass6 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass6> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass6(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    StateFlow shouldEnableTorch$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getShouldEnableTorch();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.6.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.enableTorch(z);
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (shouldEnableTorch$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$7, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$7", f = "DocumentCaptureFragment.kt", l = {382}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass7 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass7(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow captureResult$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getCaptureResult();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.7.1
                        public final Object emit(@NotNull DocumentCaptureScreen.DocumentCaptureResult documentCaptureResult, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.processCaptureResult(documentCaptureResult);
                            return Unit.f186387a;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((DocumentCaptureScreen.DocumentCaptureResult) obj3, (Continuation<? super Unit>) continuation);
                        }
                    };
                    this.label = 1;
                    if (captureResult$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$8, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$8", f = "DocumentCaptureFragment.kt", l = {386}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass8 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass8(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow errorDescriptorFlow$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getErrorDescriptorFlow();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.8.1
                        public final Object emit(@NotNull ErrorDescriptor errorDescriptor, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.showErrorInValidationBubble(errorDescriptor);
                            return Unit.f186387a;
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit((ErrorDescriptor) obj3, (Continuation<? super Unit>) continuation);
                        }
                    };
                    this.label = 1;
                    if (errorDescriptorFlow$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$9, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$setupObservers$2$9", f = "DocumentCaptureFragment.kt", l = {390}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass9 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(DocumentCaptureFragment documentCaptureFragment, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass9(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow shouldHideOverlay$onfido_capture_sdk_core_release = this.this$0.getViewModel$onfido_capture_sdk_core_release().getShouldHideOverlay();
                    final DocumentCaptureFragment documentCaptureFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.setupObservers.2.9.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                            return emit(((Boolean) obj3).booleanValue(), (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation) {
                            documentCaptureFragment.hideDocumentOverlay();
                            return Unit.f186387a;
                        }
                    };
                    this.label = 1;
                    if (shouldHideOverlay$onfido_capture_sdk_core_release.collect(flowCollector, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public C20772(Continuation<? super C20772> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C20772 c20772 = DocumentCaptureFragment.this.new C20772(continuation);
            c20772.L$0 = obj2;
            return c20772;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            e0.C(coroutineScope, null, null, new AnonymousClass1(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new C03662(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass3(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass4(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass5(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass6(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass7(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass8(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass9(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass10(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass11(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass12(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass13(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass14(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass15(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass16(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass17(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass18(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass19(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass20(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass21(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass22(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass23(DocumentCaptureFragment.this, null), 3);
            e0.C(coroutineScope, null, null, new AnonymousClass24(DocumentCaptureFragment.this, null), 3);
            return e0.C(coroutineScope, null, null, new AnonymousClass25(DocumentCaptureFragment.this, null), 3);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C20772) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$showCaptureErrorDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20781 extends u implements Function1<DialogInterface, Unit> {
        public C20781() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().onCaptureErrorConfirmed$onfido_capture_sdk_core_release();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$showVideoRecordingProgressBar$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$showVideoRecordingProgressBar$1", f = "DocumentCaptureFragment.kt", l = {974, 977}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20791 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20791(Continuation<? super C20791> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureFragment.this.new C20791(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        
            if (tz4.d.f(r6, r5) == r0) goto L15;
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
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1c
                if (r1 == r2) goto L18
                if (r1 != r3) goto L10
                yhm.o.b(r6)
                goto L58
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L32
            L1c:
                yhm.o.b(r6)
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r6 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r6 = r6.getAnnouncementService$onfido_capture_sdk_core_release()
                io.reactivex.rxjava3.core.Completable r6 = r6.interruptAnnouncement()
                r5.label = r2
                java.lang.Object r6 = tz4.d.f(r6, r5)
                if (r6 != r0) goto L32
                goto L57
            L32:
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r6 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                com.onfido.android.sdk.capture.internal.service.AnnouncementService r6 = r6.getAnnouncementService$onfido_capture_sdk_core_release()
                com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r1 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.this
                int r2 = com.onfido.android.sdk.capture.R.string.onfido_doc_capture_header_capturing
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "getString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r2 = 0
                r4 = 0
                io.reactivex.rxjava3.core.Completable r6 = com.onfido.android.sdk.capture.internal.service.AnnouncementService.announceString$default(r6, r1, r2, r3, r4)
                r5.label = r3
                java.lang.Object r6 = tz4.d.f(r6, r5)
                if (r6 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20791.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20791) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$startCamera$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cameraStatus", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$CameraStatus;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20801 extends u implements Function1<OnfidoCamera.CameraStatus, Unit> {
        final /* synthetic */ OnfidoCamera $camera;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20801(OnfidoCamera onfidoCamera) {
            super(1);
            this.$camera = onfidoCamera;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.CameraStatus) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.CameraStatus cameraStatus) {
            Intrinsics.checkNotNullParameter(cameraStatus, "cameraStatus");
            if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.Started.INSTANCE)) {
                DocumentCaptureFragment.this.onfidoCamera = this.$camera;
                DocumentCaptureFragment.this.onCameraStarted();
            } else {
                if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotAvailable.INSTANCE)) {
                    DocumentCaptureFragment.this.onCameraUnavailable();
                    return;
                }
                if (Intrinsics.f(cameraStatus, OnfidoCamera.CameraStatus.NotFound.INSTANCE)) {
                    DocumentCaptureFragment.this.onCameraNotFound();
                    return;
                }
                if (cameraStatus instanceof OnfidoCamera.CameraStatus.Failed) {
                    DocumentCaptureFragment documentCaptureFragment = DocumentCaptureFragment.this;
                    String message = ((OnfidoCamera.CameraStatus.Failed) cameraStatus).getError().getMessage();
                    if (message == null) {
                        message = "";
                    }
                    documentCaptureFragment.finishWithException(new UnknownCameraException(message));
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$startVideoRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "event", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20811 extends u implements Function1<OnfidoCamera.VideoCaptureEvent, Unit> {

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$startVideoRecording$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03671 extends u implements Function0<Boolean> {
            final /* synthetic */ DocumentCaptureFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03671(DocumentCaptureFragment documentCaptureFragment) {
                super(0);
                this.this$0 = documentCaptureFragment;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
            @Override // kotlin.jvm.functions.Function0
            @org.jetbrains.annotations.NotNull
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() {
                /*
                    r2 = this;
                    com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment r0 = r2.this$0
                    com.onfido.android.sdk.capture.internal.camera.OnfidoCamera$VideoRecorder r0 = com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.access$getRecorder$p(r0)
                    if (r0 == 0) goto L10
                    boolean r0 = r0.getHasValidRecording()
                    r1 = 1
                    if (r0 != r1) goto L10
                    goto L11
                L10:
                    r1 = 0
                L11:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20811.C03671.invoke():java.lang.Boolean");
            }
        }

        public C20811() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((OnfidoCamera.VideoCaptureEvent) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull OnfidoCamera.VideoCaptureEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE)) {
                DocumentCaptureFragment.this.onVideoCanceled();
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Error) {
                DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().onErrorVideoRecording$onfido_capture_sdk_core_release();
                return;
            }
            if (event instanceof OnfidoCamera.VideoCaptureEvent.Recorded) {
                DocumentCaptureFragment.this.onVideoCaptured(((OnfidoCamera.VideoCaptureEvent.Recorded) event).getFilePath());
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Started.INSTANCE)) {
                DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release(new C03671(DocumentCaptureFragment.this));
            } else if (Intrinsics.f(event, OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE)) {
                DocumentCaptureFragment.this.onVideoTimeoutExceeded();
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$stopDocumentVideoRecording$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20821 extends u implements Function0<Unit> {
        public C20821() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m3724invoke();
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3724invoke() {
            DocumentCaptureFragment.this.runAutoCaptureAccessibilityEvents();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentCaptureFragment() {
        super(R.layout.onfido_fragment_document_capture);
        DocumentCaptureFragment$viewModel$2 documentCaptureFragment$viewModel$2 = new DocumentCaptureFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new DocumentCaptureFragment$special$$inlined$viewModels$default$2(new DocumentCaptureFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(DocumentCaptureViewModel.class), new DocumentCaptureFragment$special$$inlined$viewModels$default$3(lazyC), new DocumentCaptureFragment$special$$inlined$viewModels$default$4(null, lazyC), documentCaptureFragment$viewModel$2);
        this.wasConfirmationNotShown = true;
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        this.documentFormatBottomDialog = j.b(new DocumentCaptureFragment$documentFormatBottomDialog$2(this));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyValidations(OnfidoImage image) {
        setImagePreview(image);
        if (getViewModel$onfido_capture_sdk_core_release().getDocumentType$onfido_capture_sdk_core_release() == null) {
            showConfirmationStep();
            return;
        }
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics != null) {
            viewModel$onfido_capture_sdk_core_release.applyPostCaptureValidations$onfido_capture_sdk_core_release(image, overlayMetrics.getRealCaptureRect());
        } else {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(boolean playSingleFrameAutoCapturedAnimation) {
        if (this.hasOngoingCaptureRequest) {
            Timber.INSTANCE.i("There is an ongoing capture request! This request has been ignored!", new Object[0]);
            return;
        }
        this.hasOngoingCaptureRequest = true;
        if (!getViewModel$onfido_capture_sdk_core_release().isCutoffImprovementsEnabled$onfido_capture_sdk_core_release() && playSingleFrameAutoCapturedAnimation) {
            getOverlayView().onSingleFrameAutoCaptured(new AnonymousClass1());
        }
        getViewModel$onfido_capture_sdk_core_release().onCaptureButtonClicked$onfido_capture_sdk_core_release();
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.takePicture(new PhotoCaptureConfig(false), new AnonymousClass2());
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeCameraState(CameraState state) {
        if (Intrinsics.f(state, CameraState.OFF.INSTANCE)) {
            OnfidoCamera onfidoCamera = this.onfidoCamera;
            if (onfidoCamera != null) {
                onfidoCamera.stop();
                return;
            }
            return;
        }
        if (!Intrinsics.f(state, CameraState.ON.INSTANCE)) {
            Intrinsics.f(state, CameraState.Uninitialized.INSTANCE);
        } else {
            if (this.isOnConfirmationStep) {
                return;
            }
            startCamera();
        }
    }

    private final void changeStatusBarColor(int color) {
        Window window = requireActivity().getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableTorch(boolean isEnabled) {
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            onfidoCamera.getCameraControl().enableTorch(isEnabled);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithException(Exception exception) {
        if (FragmentExtentionsKt.isAttached(this)) {
            finishWithResult(new DocumentCaptureScreen.DocumentCaptureResult.Error(exception));
        }
    }

    private final void finishWithResult(DocumentCaptureScreen.DocumentCaptureResult result) {
        getViewModel$onfido_capture_sdk_core_release().onCaptureCompleted$onfido_capture_sdk_core_release(result);
        String string = requireArguments().getString("key_request");
        if (string == null) {
            throw new IllegalArgumentException("request key key_request argument is missing");
        }
        FragmentKt.setFragmentResult(this, string, DocumentCaptureScreen.INSTANCE.toBundle$onfido_capture_sdk_core_release(result));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentDocumentCaptureBinding getBinding() {
        OnfidoFragmentDocumentCaptureBinding onfidoFragmentDocumentCaptureBinding = this._binding;
        Intrinsics.h(onfidoFragmentDocumentCaptureBinding);
        return onfidoFragmentDocumentCaptureBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoCaptureButtonPictureBinding getCaptureButtonBinding() {
        OnfidoCaptureButtonPictureBinding onfidoCaptureButtonPictureBinding = this._captureButtonBinding;
        Intrinsics.h(onfidoCaptureButtonPictureBinding);
        return onfidoCaptureButtonPictureBinding;
    }

    private final BottomSheetDialog getDocumentFormatBottomDialog() {
        return (BottomSheetDialog) this.documentFormatBottomDialog.getValue();
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
    public final void handleBinaryUploadWarning(DocumentCaptureViewModel.BinaryUploadWarningEvent event) {
        if (this.isOnConfirmationStep) {
            processCaptureResult(event.getResult());
            return;
        }
        showConfirmationStep();
        setConfirmationButtons(false);
        showErrorInValidationBubble(event.getErrorDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideDocumentOverlay() {
        OnfidoFragmentDocumentCaptureBinding binding = getBinding();
        ShapeableImageView[] shapeableImageViewArr = {binding.passportOverlay, binding.frenchDLOverlay, binding.germanDLOverlay, binding.italianIDOverlay};
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        if (FragmentExtentionsKt.isAttached(this)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BaseActivity");
            ((BaseActivity) fragmentActivityRequireActivity).dismissLoadingDialog$onfido_capture_sdk_core_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideVideoRecordingProgressBar() {
        LinearLayout root = getBinding().videoRecordingContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.toGone(root, false);
    }

    private final void inflateCaptureButton() {
        this._captureButtonBinding = OnfidoCaptureButtonPictureBinding.inflate(getLayoutInflater(), getBinding().content, true);
        getCaptureButtonBinding().captureButton.setContentDescription(getString(R.string.onfido_doc_capture_button_accessibility));
    }

    private final void inflateDummyAccessibilityView() {
        this._dummyAccessibilityBinding = OnfidoDummyAccessibilityViewBinding.inflate(getLayoutInflater(), getBinding().content, true);
        setCaptureFrameContentDescriptionAndTitle$default(this, null, 1, null);
    }

    private final OverlayView inflateOverlayView() {
        View viewInflate = getLayoutInflater().inflate(getViewModel$onfido_capture_sdk_core_release().getOverlayLayout$onfido_capture_sdk_core_release(), (ViewGroup) getBinding().contentLayout, false);
        Intrinsics.i(viewInflate, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.camera.OverlayView");
        return (OverlayView) viewInflate;
    }

    private final void initDocumentTypeUIModel() {
        getViewModel$onfido_capture_sdk_core_release().initDocumentTypeUIModel$onfido_capture_sdk_core_release(this.isProofOfAddress);
    }

    private final void initLayoutAdjuster() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        WatermarkView watermarkView = getBinding().watermark;
        CaptureLayoutAdjuster.ViewHolder viewHolder = new CaptureLayoutAdjuster.ViewHolder(fragmentActivityRequireActivity, getBinding().overlayTextContainer, getBinding().postCaptureValidationBubble, getBinding().confirmationButtons, getDummyAccessibilityBinding().dummyAccessibility, getCaptureButtonBinding().captureButton, getBinding().flipArrow, watermarkView, getBinding().videoRecordingContainer.getRoot());
        CaptureType captureType = CaptureType.DOCUMENT;
        DocSide documentSide$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getDocumentSide();
        if (documentSide$onfido_capture_sdk_core_release == null) {
            documentSide$onfido_capture_sdk_core_release = DocSide.FRONT;
        }
        this.layoutAdjuster = new CaptureLayoutAdjuster(captureType, documentSide$onfido_capture_sdk_core_release, viewHolder, getViewModel$onfido_capture_sdk_core_release().isAddressPageBackCapture$onfido_capture_sdk_core_release());
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
        this.validationBubbleOffsetDelegate = new ValidationBubblesOffsetDelegate(content, v.k(Integer.valueOf(R.id.liveValidationBubble), Integer.valueOf(R.id.postCaptureValidationBubble)), CaptureType.DOCUMENT);
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate == null) {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
        lifecycle.addObserver(validationBubblesOffsetDelegate);
        showPostCaptureValidationBubble(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeAccessibilityCaptureResult(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20531
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.getAccessibleCaptureResult()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityCaptureResult$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeAccessibilityCaptureResult(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeAccessibilityRectangleDetection(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20551
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.getAccessibleCaptureRectangleDetection()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeAccessibilityRectangleDetection$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeAccessibilityRectangleDetection(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeCaptureErrorDialog(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20571
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.StateFlow r5 = r5.getShouldShowCaptureErrorDialog()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeCaptureErrorDialog$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeCaptureErrorDialog(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeConfirmation(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20591
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.getShowConfirmationFlow()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeConfirmation$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeConfirmation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeErrorMessages(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20611
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20611) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.MutableSharedFlow r5 = r5.getErrorMessageFlow()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeErrorMessages$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeErrorMessages(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeLiveValidationBubbleContent(Continuation<? super Unit> continuation) {
        Object objCollect = getViewModel$onfido_capture_sdk_core_release().getShowLiveValidation().collect(new n0(new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeLiveValidationBubbleContent.2
            public final Object emit(@NotNull OnfidoCaptureValidationBubble.Content content, @NotNull Continuation<? super Unit> continuation2) {
                DocumentCaptureFragment.this.setLiveValidationBubbleContent(content);
                return Unit.f186387a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                return emit((OnfidoCaptureValidationBubble.Content) obj2, (Continuation<? super Unit>) continuation2);
            }
        }, 7), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeLiveValidationBubbleVisibility(Continuation<? super Unit> continuation) {
        Object objCollect = getViewModel$onfido_capture_sdk_core_release().getLiveValidationBubbleVisibility().collect(new n0(new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeLiveValidationBubbleVisibility.2
            public final Object emit(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand visibilityCommand, @NotNull Continuation<? super Unit> continuation2) {
                DocumentCaptureFragment.setLiveValidationBubbleVisibilityCommand$default(DocumentCaptureFragment.this, visibilityCommand, false, 2, null);
                return Unit.f186387a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                return emit((OnfidoCaptureValidationBubble.VisibilityCommand) obj2, (Continuation<? super Unit>) continuation2);
            }
        }, 7), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object observeLoading(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20651
            if (r0 == 0) goto L13
            r0 = r5
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.C20651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2b:
            yhm.o.b(r5)
            goto L48
        L2f:
            yhm.o.b(r5)
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r5 = r4.getViewModel$onfido_capture_sdk_core_release()
            kotlinx.coroutines.flow.MutableStateFlow r5 = r5.getLoadingFlow()
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$2 r2 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment$observeLoading$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeLoading(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeVideoRecordingInfo(Continuation<? super Unit> continuation) {
        Object objCollect = getViewModel$onfido_capture_sdk_core_release().getShowVideoRecordingInfo().collect(new n0(new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeVideoRecordingInfo.2
            public final Object emit(@NotNull DocumentCaptureViewModel.VideoRecordingEvent videoRecordingEvent, @NotNull Continuation<? super Unit> continuation2) {
                if (videoRecordingEvent.getShouldShow()) {
                    DocumentCaptureFragment.this.showVideoRecordingProgressBar();
                    OverlayTextView overlayTextContainer = DocumentCaptureFragment.this.getBinding().overlayTextContainer;
                    Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
                    OverlayTextView.setMainText$onfido_capture_sdk_core_release$default(overlayTextContainer, videoRecordingEvent.getWithMessage(), 0, false, 6, null);
                } else {
                    DocumentCaptureFragment.this.hideVideoRecordingProgressBar();
                }
                return Unit.f186387a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                return emit((DocumentCaptureViewModel.VideoRecordingEvent) obj2, (Continuation<? super Unit>) continuation2);
            }
        }, 7), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeVideoRecordingState(Continuation<? super Unit> continuation) {
        Object objCollect = getViewModel$onfido_capture_sdk_core_release().getStartVideoRecording().collect(new n0(new FlowCollector() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.observeVideoRecordingState.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation2) {
                return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(boolean z, @NotNull Continuation<? super Unit> continuation2) {
                if (z) {
                    DocumentCaptureFragment.this.startDocumentVideoRecording();
                } else {
                    DocumentCaptureFragment.this.stopDocumentVideoRecording();
                }
                return Unit.f186387a;
            }
        }, 7), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraNotFound() {
        getViewModel$onfido_capture_sdk_core_release().trackCaptureError$onfido_capture_sdk_core_release();
        hideLoading();
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_generic_error_title), R.string.onfido_generic_error_camera_unavailable, 0, (Integer) null, false, (Function1) null, (Function1) new C20691(), 60, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStarted() {
        getViewModel$onfido_capture_sdk_core_release().onCameraStarted$onfido_capture_sdk_core_release();
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera == null) {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
        Disposable disposableSubscribe = onfidoCamera.observeFrame().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.onCameraStarted.1
            @Override // igm.g
            public final void accept(@NotNull Object p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                DocumentCaptureFragment.this.onNextFrame(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnDestroy(disposableSubscribe, viewLifecycleOwner);
        if (this.isCameraViewInitialised && !this.isOnConfirmationStep && this.onfidoCamera != null && getViewModel$onfido_capture_sdk_core_release().shouldRecordDocumentVideo$onfido_capture_sdk_core_release()) {
            hideVideoRecordingProgressBar();
            ViewUtil.setViewVisibilityWithoutAnimation(getBinding().overlayTextContainer, true);
            getOverlayView().resetDocumentOverlay();
            getBinding().confirmationImage.setImageBitmap(null);
        }
        this.isCameraViewInitialised = true;
        if (getViewModel$onfido_capture_sdk_core_release().isFourByThreeEnabled$onfido_capture_sdk_core_release()) {
            OnfidoCamera onfidoCamera2 = this.onfidoCamera;
            if (onfidoCamera2 == null) {
                Intrinsics.r("onfidoCamera");
                throw null;
            }
            OverlayMetrics overlayMetrics = this.overlayMetrics;
            if (overlayMetrics != null) {
                onfidoCamera2.centerPreviewAccordingTo(overlayMetrics.getVisibleCaptureRect());
            } else {
                Intrinsics.r("overlayMetrics");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraUnavailable() {
        if (FragmentExtentionsKt.isAttached(this)) {
            getViewModel$onfido_capture_sdk_core_release().trackCaptureError$onfido_capture_sdk_core_release();
            hideLoading();
            LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_generic_error_title), R.string.onfido_generic_error_camera_used_by_other_app, 0, (Integer) null, false, (Function1) null, (Function1) new C20711(), 60, (Object) null);
        }
    }

    private final void onCardFormatSelected() {
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        DocumentFormat documentFormat = DocumentFormat.CARD;
        viewModel$onfido_capture_sdk_core_release.onDocumentFormatSelected$onfido_capture_sdk_core_release(documentFormat);
        setCaptureFrameContentDescriptionAndTitle(documentFormat);
    }

    private final void onDocumentCreated(DocumentCaptureScreen.DocumentCaptureResult.Completed result) {
        ErrorType currentCaptureFlowError$onfido_capture_sdk_core_release;
        if (this.isOnConfirmationStep) {
            hideLoading();
            finishWithResult(result);
            return;
        }
        showConfirmationStep();
        setConfirmationButtons(false);
        if (!result.getWithWarning() || (currentCaptureFlowError$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getCurrentCaptureFlowError()) == null) {
            return;
        }
        showErrorInValidationBubble(ErrorTypeUtilsKt.mapErrorType(currentCaptureFlowError$onfido_capture_sdk_core_release));
    }

    private final void onFoldedFormatSelected() {
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        DocumentFormat documentFormat = DocumentFormat.FOLDED;
        viewModel$onfido_capture_sdk_core_release.onDocumentFormatSelected$onfido_capture_sdk_core_release(documentFormat);
        setCaptureFrameContentDescriptionAndTitle(documentFormat);
        updateOverlayView();
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics != null) {
            setCaptureRegion(overlayMetrics.getVisibleCaptureRect());
        } else {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageProcessingFinished() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C20721(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onManualFallbackDelayFinished() {
        if (this.isOnConfirmationStep || !getViewModel$onfido_capture_sdk_core_release().shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
            return;
        }
        getViewModel$onfido_capture_sdk_core_release().onManualFallbackDelayFinished$onfido_capture_sdk_core_release();
        setLiveValidationBubbleContent(new OnfidoCaptureValidationBubble.Content.Info(R.string.onfido_doc_capture_alert_manual_capture_title, Integer.valueOf(R.string.onfido_doc_capture_alert_manual_capture_detail)));
        setLiveValidationBubbleVisibilityCommand$default(this, new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(true)), false, 2, null);
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding().liveValidationBubble;
        onfidoCaptureValidationBubble.setState$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble.State.HARD_LOCK);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DocumentCaptureFragment$onManualFallbackDelayFinished$1$1(onfidoCaptureValidationBubble, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNextFrame(Object frame) {
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        Intrinsics.i(frame, "null cannot be cast to non-null type com.onfido.android.sdk.capture.internal.camera.OnfidoImage");
        OnfidoImage onfidoImage = (OnfidoImage) frame;
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics != null) {
            viewModel$onfido_capture_sdk_core_release.onNextFrame$onfido_capture_sdk_core_release(onfidoImage, overlayMetrics);
        } else {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCanceled() {
        if (getViewModel$onfido_capture_sdk_core_release().shouldRecordDocumentVideo$onfido_capture_sdk_core_release()) {
            hideVideoRecordingProgressBar();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCaptured(String filePath) {
        getViewModel$onfido_capture_sdk_core_release().onVideoCaptured$onfido_capture_sdk_core_release(filePath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoTimeoutExceeded() {
        getViewModel$onfido_capture_sdk_core_release().reset$onfido_capture_sdk_core_release();
        getViewModel$onfido_capture_sdk_core_release().trackVideoCaptureTimeout();
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_video_capture_prompt_title_timeout), R.string.onfido_video_capture_prompt_detail_timeout, R.string.onfido_video_capture_prompt_button_timeout, (Integer) null, false, (Function1) null, (Function1) new C20731(), 56, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoTimeoutRetryClick(DialogInterface dialog) {
        dialog.dismiss();
        getViewModel$onfido_capture_sdk_core_release().trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release();
        if (FragmentExtentionsKt.isAttached(this)) {
            requireActivity().onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCaptureScreen() {
        getViewModel$onfido_capture_sdk_core_release().onCaptureScreenOpened$onfido_capture_sdk_core_release();
        hideLoading();
        getBinding().confirmationImage.setImageBitmap(null);
        this.isOnConfirmationStep = false;
        setConfirmationStepVisibility(false);
        getOverlayView().switchConfirmationMode(false);
        getBinding().overlayTextContainer.setDocumentOverlayText$onfido_capture_sdk_core_release(getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release(), getViewModel$onfido_capture_sdk_core_release().getDocumentSide());
        showPostCaptureValidationBubble(false);
        getBinding().confirmationButtons.setListener$onfido_capture_sdk_core_release(this);
        setConfirmationButtonsForError(false);
        setColorsForCaptureScreen();
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        captureLayoutAdjuster.adjustLayoutParams(false);
        setCaptureFrameContentDescriptionAndTitle$default(this, null, 1, null);
        getViewModel$onfido_capture_sdk_core_release().prepareCaptureStart$onfido_capture_sdk_core_release(false, getOrientation());
        if (this.isOnConfirmationStep) {
            return;
        }
        startCamera();
    }

    private final void prepareColorsForConfirmationStep() {
        if (getViewModel$onfido_capture_sdk_core_release().isDarkModeEnabled$onfido_capture_sdk_core_release()) {
            OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorConfirmationScreen(), false, 2, null);
        } else {
            updateColorsForConfirmationScreen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processCaptureResult(DocumentCaptureScreen.DocumentCaptureResult result) {
        if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.Completed) {
            onDocumentCreated((DocumentCaptureScreen.DocumentCaptureResult.Completed) result);
            return;
        }
        if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.POACompleted) {
            hideLoading();
            finishWithResult(result);
        } else if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.Error) {
            finishWithResult(result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAutoCaptureAccessibilityEvents() {
        e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C20761(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonsForForceRetry() {
        getBinding().confirmationButtons.setWarningState(false, getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release());
        setConfirmationButtonsForError(true);
    }

    private final void setCaptureFrameContentDescriptionAndTitle(DocumentFormat forFormat) {
        StringRepresentation captureFrameContentDescription$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getCaptureFrameContentDescription$onfido_capture_sdk_core_release(forFormat);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        String string = captureFrameContentDescription$onfido_capture_sdk_core_release.getString(contextRequireContext);
        getDummyAccessibilityBinding().dummyAccessibility.setContentDescription(string);
        requireActivity().setTitle(string);
    }

    public static /* synthetic */ void setCaptureFrameContentDescriptionAndTitle$default(DocumentCaptureFragment documentCaptureFragment, DocumentFormat documentFormat, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentFormat = null;
        }
        documentCaptureFragment.setCaptureFrameContentDescriptionAndTitle(documentFormat);
    }

    private final void setCaptureRegion(RectF rect) {
        showDocumentOverlay(rect);
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
    public final void setConfirmationButtons(boolean isWarning) {
        DocumentTypeUIModel documentTypeUIModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release();
        getBinding().confirmationButtons.setWarningState(isWarning, documentTypeUIModel$onfido_capture_sdk_core_release);
        ConfirmationStepButtons confirmationButtons = getBinding().confirmationButtons;
        Intrinsics.checkNotNullExpressionValue(confirmationButtons, "confirmationButtons");
        ConfirmationStepButtons.setDocumentCaptureCopy$default(confirmationButtons, documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityConfirmationLabel(), documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityDiscardLabel(), false, 4, null);
    }

    private final void setConfirmationButtonsForError(boolean isError) {
        DocumentTypeUIModel documentTypeUIModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release();
        getBinding().confirmationButtons.setDocumentErrorState(isError, documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityDiscardLabel(), documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityConfirmationLabel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConfirmationStepVisibility(boolean visible) {
        ViewUtil.setViewVisibility(getBinding().confirmationImage, visible);
        ViewUtil.setViewVisibility(getBinding().confirmationButtons, visible);
    }

    private final void setImagePreview(OnfidoImage onfidoImage) {
        Bitmap bitmap;
        getBinding().confirmationImage.setScaleX(1.0f);
        Bitmap bitmapDecodeScaledResource$default = ImageUtils.decodeScaledResource$default(getImageUtils$onfido_capture_sdk_core_release(), onfidoImage.getData(), getBinding().confirmationImage.getWidth(), getBinding().confirmationImage.getHeight(), null, null, 24, null);
        Drawable drawable = getBinding().confirmationImage.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.recycle();
        }
        getBinding().confirmationImage.setImageBitmap(bitmapDecodeScaledResource$default);
        updateConfirmationImageTranslationAndScale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLiveValidationBubbleContent(OnfidoCaptureValidationBubble.Content content) {
        OnfidoCaptureValidationBubble liveValidationBubble = getBinding().liveValidationBubble;
        Intrinsics.checkNotNullExpressionValue(liveValidationBubble, "liveValidationBubble");
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(liveValidationBubble, content, false, 2, null);
    }

    private final void setLiveValidationBubbleVisibilityCommand(OnfidoCaptureValidationBubble.VisibilityCommand command, boolean shouldIgnoreLock) {
        getBinding().liveValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release(command, shouldIgnoreLock);
    }

    public static /* synthetic */ void setLiveValidationBubbleVisibilityCommand$default(DocumentCaptureFragment documentCaptureFragment, OnfidoCaptureValidationBubble.VisibilityCommand visibilityCommand, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        documentCaptureFragment.setLiveValidationBubbleVisibilityCommand(visibilityCommand, z);
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

    private final void setupCaptureButton() {
        getCaptureButtonBinding().captureButton.setOnClickListener(new b2(this, 8));
        setupConfirmationButtonsListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCaptureButton$lambda$6(DocumentCaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.capture(false);
    }

    private final void setupConfirmationButtonsListener() {
        getBinding().confirmationButtons.setListener$onfido_capture_sdk_core_release(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setupObservers(Continuation<? super Unit> continuation) {
        Object objO = e0.o(new C20772(null), continuation);
        return objO == fim.a.COROUTINE_SUSPENDED ? objO : Unit.f186387a;
    }

    private final void setupOverlayView() {
        if (this._overlayView != null) {
            getBinding().contentLayout.removeView(getOverlayView());
        }
        OverlayView overlayViewInflateOverlayView = inflateOverlayView();
        overlayViewInflateOverlayView.setUp(CaptureType.DOCUMENT, this);
        OverlayView.setColorOutsideOverlay$default(overlayViewInflateOverlayView, getBackgroundColorCaptureScreen(), false, 2, null);
        this._overlayView = overlayViewInflateOverlayView;
        getBinding().overlayTextContainer.setDocumentOverlayText$onfido_capture_sdk_core_release(getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release(), getViewModel$onfido_capture_sdk_core_release().getDocumentSide());
        getOverlayView().setIsProofOfAddress(this.isProofOfAddress);
        getBinding().contentLayout.addView(getOverlayView());
    }

    private final void setupToolbar() {
        ContextUtilsKt.requireToolbarHost(this).enableImmersiveFragment();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        changeStatusBarColor(ContextUtilsKt.colorFromAttr(contextRequireContext, android.R.attr.colorPrimaryDark));
    }

    private final void setupUiElements(View view) {
        this._binding = OnfidoFragmentDocumentCaptureBinding.bind(view);
        inflateCaptureButton();
        inflateDummyAccessibilityView();
        initDocumentTypeUIModel();
        initLayoutAdjuster();
        initValidationBubbleDelegate();
        setConfirmationStepVisibility(false);
        DocumentTypeUIModel documentTypeUIModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release();
        getBinding().confirmationButtons.setDocumentCapture$onfido_capture_sdk_core_release(documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityDiscardLabel(), documentTypeUIModel$onfido_capture_sdk_core_release.getReadabilityConfirmationLabel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCaptureErrorDialog() {
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_title, R.string.onfido_generic_error_doc_capture, new C20781());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmationStep() {
        this.isOnConfirmationStep = true;
        hideLoading();
        this.wasConfirmationNotShown = false;
        getViewModel$onfido_capture_sdk_core_release().trackDocumentConfirmationStep$onfido_capture_sdk_core_release();
        prepareColorsForConfirmationStep();
        setConfirmationStepVisibility(true);
        if (getBinding().confirmationButtons.getIsConfirmationButtonsHorizontal()) {
            getBinding().confirmationButtons.enableAdaptableHorizontalButtonHeight();
            getBinding().confirmationButtons.forceInnerButtonsMeasurement();
        }
        getBinding().overlayTextContainer.setConfirmationOverlayText(CaptureType.DOCUMENT, getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release());
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        captureLayoutAdjuster.adjustLayoutParams(true);
        getOverlayView().switchConfirmationMode(true);
        hideDocumentOverlay();
        OverlayTextView overlayTextContainer = getBinding().overlayTextContainer;
        Intrinsics.checkNotNullExpressionValue(overlayTextContainer, "overlayTextContainer");
        ViewExtensionsKt.toVisible$default(overlayTextContainer, false, 1, null);
        int i = R.string.onfido_doc_confirmation_image_accessibility;
        View dummyAccessibility = getDummyAccessibilityBinding().dummyAccessibility;
        Intrinsics.checkNotNullExpressionValue(dummyAccessibility, "dummyAccessibility");
        ViewExtensionsKt.setContentDescription(dummyAccessibility, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDocumentFormatSelectionDialog(int dialogTitle) {
        final BottomSheetDialog documentFormatBottomDialog = getDocumentFormatBottomDialog();
        OnfidoViewDocumentFormatSelectionBinding onfidoViewDocumentFormatSelectionBindingInflate = OnfidoViewDocumentFormatSelectionBinding.inflate(documentFormatBottomDialog.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(onfidoViewDocumentFormatSelectionBindingInflate, "inflate(...)");
        documentFormatBottomDialog.setCancelable(false);
        documentFormatBottomDialog.setContentView(onfidoViewDocumentFormatSelectionBindingInflate.getRoot());
        onfidoViewDocumentFormatSelectionBindingInflate.title.setText(dialogTitle);
        final int i = 0;
        onfidoViewDocumentFormatSelectionBindingInflate.cardFormat.setOnClickListener(new View.OnClickListener() { // from class: com.onfido.android.sdk.capture.ui.camera.document.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        DocumentCaptureFragment.showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$11(documentFormatBottomDialog, this, view);
                        break;
                    default:
                        DocumentCaptureFragment.showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$12(documentFormatBottomDialog, this, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        onfidoViewDocumentFormatSelectionBindingInflate.foldedFormat.setOnClickListener(new View.OnClickListener() { // from class: com.onfido.android.sdk.capture.ui.camera.document.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        DocumentCaptureFragment.showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$11(documentFormatBottomDialog, this, view);
                        break;
                    default:
                        DocumentCaptureFragment.showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$12(documentFormatBottomDialog, this, view);
                        break;
                }
            }
        });
        documentFormatBottomDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$11(BottomSheetDialog this_with, DocumentCaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.dismiss();
        this$0.onCardFormatSelected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDocumentFormatSelectionDialog$lambda$14$lambda$13$lambda$12(BottomSheetDialog this_with, DocumentCaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.dismiss();
        this$0.onFoldedFormatSelected();
    }

    private final void showDocumentOverlay(RectF rect) {
        ShapeableImageView italianIDOverlay;
        boolean z = requireArguments().getBoolean("key_front_side");
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        ShapeableImageView frenchDLOverlay = getBinding().frenchDLOverlay;
        Intrinsics.checkNotNullExpressionValue(frenchDLOverlay, "frenchDLOverlay");
        boolean zShouldShowFrenchDLOverlay$onfido_capture_sdk_core_release = viewModel$onfido_capture_sdk_core_release.shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release(z, ViewExtensionsKt.isGone(frenchDLOverlay));
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release2 = getViewModel$onfido_capture_sdk_core_release();
        ShapeableImageView germanDLOverlay = getBinding().germanDLOverlay;
        Intrinsics.checkNotNullExpressionValue(germanDLOverlay, "germanDLOverlay");
        boolean zShouldShowGermanDLOverlay$onfido_capture_sdk_core_release = viewModel$onfido_capture_sdk_core_release2.shouldShowGermanDLOverlay$onfido_capture_sdk_core_release(z, ViewExtensionsKt.isGone(germanDLOverlay));
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release3 = getViewModel$onfido_capture_sdk_core_release();
        ShapeableImageView italianIDOverlay2 = getBinding().italianIDOverlay;
        Intrinsics.checkNotNullExpressionValue(italianIDOverlay2, "italianIDOverlay");
        boolean zShouldShowItalianIDOverlay$onfido_capture_sdk_core_release = viewModel$onfido_capture_sdk_core_release3.shouldShowItalianIDOverlay$onfido_capture_sdk_core_release(z, ViewExtensionsKt.isGone(italianIDOverlay2));
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release4 = getViewModel$onfido_capture_sdk_core_release();
        ShapeableImageView italianIDOverlay3 = getBinding().italianIDOverlay;
        Intrinsics.checkNotNullExpressionValue(italianIDOverlay3, "italianIDOverlay");
        boolean zShouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release = viewModel$onfido_capture_sdk_core_release4.shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release(z, ViewExtensionsKt.isGone(italianIDOverlay3));
        ShapeableImageView passportOverlay = getBinding().passportOverlay;
        Intrinsics.checkNotNullExpressionValue(passportOverlay, "passportOverlay");
        boolean z3 = !ViewExtensionsKt.isGone(passportOverlay) && getViewModel$onfido_capture_sdk_core_release().shouldShowInitialOverlay$onfido_capture_sdk_core_release() && getViewModel$onfido_capture_sdk_core_release().shouldAutoCaptureDocument$onfido_capture_sdk_core_release() && !getViewModel$onfido_capture_sdk_core_release().isAddressPageBackCapture$onfido_capture_sdk_core_release();
        if (zShouldShowFrenchDLOverlay$onfido_capture_sdk_core_release) {
            italianIDOverlay = getBinding().frenchDLOverlay;
            Intrinsics.checkNotNullExpressionValue(italianIDOverlay, "frenchDLOverlay");
        } else if (zShouldShowGermanDLOverlay$onfido_capture_sdk_core_release) {
            italianIDOverlay = getBinding().germanDLOverlay;
            Intrinsics.checkNotNullExpressionValue(italianIDOverlay, "germanDLOverlay");
        } else if (zShouldShowItalianIDOverlay$onfido_capture_sdk_core_release || zShouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release) {
            italianIDOverlay = getBinding().italianIDOverlay;
            Intrinsics.checkNotNullExpressionValue(italianIDOverlay, "italianIDOverlay");
        } else {
            if (!z3) {
                return;
            }
            italianIDOverlay = getBinding().passportOverlay;
            Intrinsics.checkNotNullExpressionValue(italianIDOverlay, "passportOverlay");
        }
        ImageUtilsExtKt.showOverlay(italianIDOverlay, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorInValidationBubble(ErrorDescriptor descriptor) {
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding().postCaptureValidationBubble;
        Intrinsics.h(onfidoCaptureValidationBubble);
        OnfidoCaptureValidationBubble.setContent$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.Content.Error(descriptor.getTitle(), descriptor.getSubtitle()), false, 2, null);
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(false, 1, null)), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(int titleResId, int messageResId, Function1<? super DialogInterface, Unit> listener) {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(titleResId), messageResId, 0, (Integer) null, false, (Function1) null, (Function1) listener, 60, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoading(LoadingFragment.Companion.DialogMode dialogMode) {
        if (FragmentExtentionsKt.isAttached(this)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.i(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.BaseActivity");
            ((BaseActivity) fragmentActivityRequireActivity).showLoadingDialog$onfido_capture_sdk_core_release(dialogMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPostCaptureValidationBubble(boolean shouldShow) {
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble = getBinding().postCaptureValidationBubble;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z = false;
        Intrinsics.h(onfidoCaptureValidationBubble);
        OnfidoCaptureValidationBubble.setVisibilityCommand$onfido_capture_sdk_core_release$default(onfidoCaptureValidationBubble, shouldShow ? new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(z, 1, defaultConstructorMarker)) : OnfidoCaptureValidationBubble.VisibilityCommand.Gone.INSTANCE, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showVideoRecordingProgressBar() {
        ImageView flipArrow = getBinding().flipArrow;
        Intrinsics.checkNotNullExpressionValue(flipArrow, "flipArrow");
        flipArrow.setVisibility(8);
        LinearLayout root = getBinding().videoRecordingContainer.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.toVisible$default(root, false, 1, null);
        e0.C(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C20791(null), 3);
    }

    private final void startCamera() {
        CameraFactory cameraFactory$onfido_capture_sdk_core_release = getCameraFactory$onfido_capture_sdk_core_release();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        CameraSourcePreview cameraSourcePreview = getBinding().cameraViewCamera1;
        PreviewView previewView = getBinding().cameraViewCameraX;
        CaptureType captureType = CaptureType.DOCUMENT;
        OverlayView overlayView = getOverlayView();
        Intrinsics.h(viewLifecycleOwner);
        OnfidoCamera onfidoCameraCreate = cameraFactory$onfido_capture_sdk_core_release.create(viewLifecycleOwner, cameraSourcePreview, previewView, overlayView, captureType);
        onfidoCameraCreate.start(OnfidoCamera.CameraFacing.BACK, new C20801(onfidoCameraCreate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startDocumentVideoRecording() {
        getOverlayView().onDocumentVideoRecordStarted();
        startVideoRecording();
    }

    private final void startVideoRecording() {
        FileUtils fileUtils = FileUtils.INSTANCE;
        File cacheDir = requireContext().getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        fileUtils.deleteFilesWithPrefixFromFolder(cacheDir, "onfido-video");
        OnfidoCamera onfidoCamera = this.onfidoCamera;
        if (onfidoCamera != null) {
            this.recorder = onfidoCamera.takeVideo(new C20811());
        } else {
            Intrinsics.r("onfidoCamera");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopDocumentVideoRecording() {
        getViewModel$onfido_capture_sdk_core_release().onVideoRecordingStopped$onfido_capture_sdk_core_release();
        OnfidoCamera.VideoRecorder videoRecorder = this.recorder;
        if (videoRecorder != null) {
            videoRecorder.finish();
        }
        hideVideoRecordingProgressBar();
        ZoomImageView confirmationImage = getBinding().confirmationImage;
        Intrinsics.checkNotNullExpressionValue(confirmationImage, "confirmationImage");
        ViewExtensionsKt.toVisible$default(confirmationImage, false, 1, null);
        getOverlayView().onDocumentVideoRecordFinished();
        getOverlayView().inflateDocumentDetectionTick(new C20821());
    }

    private final void updateColorsForConfirmationScreen() {
        ContextUtilsKt.requireToolbarHost(this).setToolbarColor(R.attr.onfidoColorToolbarBackground, R.attr.onfidoColorContentToolbarTitle, R.attr.onfidoColorContentToolbarSubtitle, R.attr.onfidoColorToolbarIconDark);
        OverlayView.setColorOutsideOverlay$default(getOverlayView(), getBackgroundColorConfirmationScreen(), false, 2, null);
        getBinding().watermark.setLightBackground();
    }

    private final void updateConfirmationImageTranslationAndScale() {
        if (getViewModel$onfido_capture_sdk_core_release().isFourByThreeEnabled$onfido_capture_sdk_core_release()) {
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

    private final void updateOverlayView() {
        OverlayView overlayView = getOverlayView();
        OverlayView overlayViewInflateOverlayView = inflateOverlayView();
        CaptureType captureType = CaptureType.DOCUMENT;
        overlayViewInflateOverlayView.setUp(captureType, this);
        overlayViewInflateOverlayView.setColorOutsideOverlay(getBackgroundColorCaptureScreen(), false);
        this._overlayView = overlayViewInflateOverlayView;
        OnfidoFragmentDocumentCaptureBinding binding = getBinding();
        binding.overlayTextContainer.setCaptureOverlayText$onfido_capture_sdk_core_release(captureType, getViewModel$onfido_capture_sdk_core_release().getDocumentTypeUIModel$onfido_capture_sdk_core_release(), getViewModel$onfido_capture_sdk_core_release().getDocumentSide());
        binding.contentLayout.removeView(overlayView);
        binding.contentLayout.addView(getOverlayView());
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
    public final RuntimePermissionsManager getPermissionsManager$onfido_capture_sdk_core_release() {
        RuntimePermissionsManager runtimePermissionsManager = this.permissionsManager;
        if (runtimePermissionsManager != null) {
            return runtimePermissionsManager;
        }
        Intrinsics.r("permissionsManager");
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
    public final DocumentCaptureViewModel getViewModel$onfido_capture_sdk_core_release() {
        return (DocumentCaptureViewModel) this.viewModel.getValue();
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

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureConfirmed() {
        getViewModel$onfido_capture_sdk_core_release().onCaptureConfirmed$onfido_capture_sdk_core_release();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureDiscarded() {
        getViewModel$onfido_capture_sdk_core_release().onCaptureDiscarded$onfido_capture_sdk_core_release();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        this._overlayView = null;
        this._captureButtonBinding = null;
        this._dummyAccessibilityBinding = null;
        this.isCameraViewInitialised = false;
        this.recorder = null;
        this.isOnConfirmationStep = false;
        this.wasConfirmationNotShown = true;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.OverlayView.Listener
    public void onOverlayMetrics(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.overlayMetrics = overlayMetrics;
        getViewModel$onfido_capture_sdk_core_release().onOverlayMetrics$onfido_capture_sdk_core_release(overlayMetrics);
        RectF visibleCaptureRect = overlayMetrics.getVisibleCaptureRect();
        CaptureLayoutAdjuster captureLayoutAdjuster = this.layoutAdjuster;
        if (captureLayoutAdjuster == null) {
            Intrinsics.r("layoutAdjuster");
            throw null;
        }
        captureLayoutAdjuster.adjustLayoutParams(this.isOnConfirmationStep);
        ValidationBubblesOffsetDelegate validationBubblesOffsetDelegate = this.validationBubbleOffsetDelegate;
        if (validationBubblesOffsetDelegate == null) {
            Intrinsics.r("validationBubbleOffsetDelegate");
            throw null;
        }
        validationBubblesOffsetDelegate.onCaptureRegionSet(visibleCaptureRect);
        setCaptureRegion(visibleCaptureRect);
        setVideoRecordingIndicatorMargin(visibleCaptureRect);
        if (getViewModel$onfido_capture_sdk_core_release().shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release() && this.wasConfirmationNotShown) {
            setLiveValidationBubbleVisibilityCommand$default(this, OnfidoCaptureValidationBubble.VisibilityCommand.Invisible.INSTANCE, false, 2, null);
        }
        adjustDummyAccessibilityView(overlayMetrics.getVisibleCaptureRect());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!getPermissionsManager$onfido_capture_sdk_core_release().hasPermission("android.permission.CAMERA")) {
            FragmentKt.setFragmentResult(this, "capture_missing_permissions", BundleKt.bundleOf(new Pair("capture_missing_permissions_capture_data", getViewModel$onfido_capture_sdk_core_release().getDocumentData$onfido_capture_sdk_core_release())));
            return;
        }
        if (!this.isOnConfirmationStep) {
            setupOverlayView();
            setColorsForCaptureScreen();
        }
        setupCaptureButton();
        getViewModel$onfido_capture_sdk_core_release().onViewResumed$onfido_capture_sdk_core_release();
        View view = getView();
        if (view == null) {
            return;
        }
        view.setImportantForAccessibility(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setupToolbar();
        getViewModel$onfido_capture_sdk_core_release().prepareCaptureStart$onfido_capture_sdk_core_release(this.wasConfirmationNotShown, getOrientation());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ContextUtilsKt.requireToolbarHost(this).disableImmersiveFragment();
        ContextUtilsKt.requireToolbarHost(this).resetToolbar();
        getDocumentFormatBottomDialog().hide();
        getViewModel$onfido_capture_sdk_core_release().reset$onfido_capture_sdk_core_release();
        if (this.isCameraViewInitialised) {
            OverlayView.resetFaceDetectedState$default(getOverlayView(), false, false, false, 2, null);
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
        Serializable serializable = requireArguments().getSerializable("key_data_bundle");
        CaptureStepDataBundle captureStepDataBundle = serializable instanceof CaptureStepDataBundle ? (CaptureStepDataBundle) serializable : null;
        if (captureStepDataBundle == null) {
            throw new IllegalArgumentException("key_data_bundle parameter is missing");
        }
        Parcelable parcelable = requireArguments().getParcelable("key_nfc_arguments");
        NfcArguments nfcArguments = parcelable instanceof NfcArguments ? (NfcArguments) parcelable : null;
        if (nfcArguments == null) {
            throw new IllegalArgumentException("key_nfc_arguments parameter is missing");
        }
        getViewModel$onfido_capture_sdk_core_release().setCaptureData$onfido_capture_sdk_core_release(captureStepDataBundle, nfcArguments);
        getViewModel$onfido_capture_sdk_core_release().setDocumentSide$onfido_capture_sdk_core_release(requireArguments().getBoolean("key_front_side", false) ? DocSide.FRONT : DocSide.BACK);
        this.isProofOfAddress = requireArguments().getBoolean("key_proof_of_address", false);
        getViewModel$onfido_capture_sdk_core_release().setProofOfAddress$onfido_capture_sdk_core_release(this.isProofOfAddress);
        DocumentCaptureViewModel viewModel$onfido_capture_sdk_core_release = getViewModel$onfido_capture_sdk_core_release();
        File filesDir = requireActivity().getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        viewModel$onfido_capture_sdk_core_release.setCapturedFilesDir$onfido_capture_sdk_core_release(filesDir);
        setupUiElements(view);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureFragment.onViewCreated.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                DocumentCaptureFragment.this.getViewModel$onfido_capture_sdk_core_release().trackCaptureBackButtonClicked$onfido_capture_sdk_core_release();
                if (!DocumentCaptureFragment.this.isOnConfirmationStep) {
                    setEnabled(false);
                    DocumentCaptureFragment.this.requireActivity().onBackPressed();
                } else {
                    DocumentCaptureFragment.this.setConfirmationStepVisibility(false);
                    DocumentCaptureFragment.this.isOnConfirmationStep = false;
                    DocumentCaptureFragment.this.openCaptureScreen();
                }
            }
        });
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C20752(null), 3);
    }

    @Override // com.onfido.android.sdk.capture.utils.WorkflowToolbarUpdateListener
    public void onWorkflowToolbarUpdated() {
        if (this.isOnConfirmationStep) {
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

    public final void setPermissionsManager$onfido_capture_sdk_core_release(@NotNull RuntimePermissionsManager runtimePermissionsManager) {
        Intrinsics.checkNotNullParameter(runtimePermissionsManager, "<set-?>");
        this.permissionsManager = runtimePermissionsManager;
    }

    public final void setVibratorService$onfido_capture_sdk_core_release(@NotNull VibratorService vibratorService) {
        Intrinsics.checkNotNullParameter(vibratorService, "<set-?>");
        this.vibratorService = vibratorService;
    }

    public final void setViewModelProvider$onfido_capture_sdk_core_release(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.viewModelProvider = provider;
    }
}
