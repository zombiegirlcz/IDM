package com.onfido.android.sdk.capture.ui.camera;

import a9j.k;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.core.os.BundleKt;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.common.di.qualifier.MediaCallbackResultReceiver;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.detector.face.FaceDetectionResult;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionResult;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorEmpty;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.performance.domain.PerformanceAnalyticsScreen;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCaseResult;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCaseResult;
import com.onfido.android.sdk.capture.internal.usecase.FaceProcessingUseCase;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationResult;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationTargets;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingFailureCounts;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResultsFailureAnalyzer;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessInteractor;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeType;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengesViewModel;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.MovementLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.ReciteLivenessChallenge;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureResultConsumer;
import com.onfido.android.sdk.capture.ui.camera.util.DocumentValidationResultMapper;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.DocumentUtils;
import com.onfido.android.sdk.capture.utils.ErrorTypeUtilsKt;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.ImageUtilsExtKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.ResultReceiverExtensionsKt;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.StringRepresentation;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.validation.BackendDocumentValidationsManager;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.android.sdk.capture.validation.MRZData;
import com.onfido.android.sdk.capture.validation.MRZDataType;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager;
import com.onfido.android.sdk.capture.validation.Validation;
import com.onfido.android.sdk.capture.validation.device.MRZValidationResult;
import com.onfido.api.client.ValidationLevel;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.DocumentFeatures;
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SdkUploadMetaData;
import com.onfido.api.client.exception.GeoblockedException;
import com.onfido.api.client.exception.HttpParsedException;
import com.onfido.api.client.exception.TokenExpiredException;
import gim.i;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import ngm.g;
import ogm.p;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;
import pgm.m;
import pgm.w1;
import retrofit2.HttpException;
import skm.e0;
import vkm.q;
import vkm.q0;
import yhm.j;
import yhm.o;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000è\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 Ã\u00042\u00020\u0001:\u0006Ã\u0004Ä\u0004Å\u0004B\u009d\u0002\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\n\b\u0001\u0010?\u001a\u0004\u0018\u00010>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ;\u0010U\u001a\u00020R2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\b\u0002\u0010Q\u001a\u00020PH\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010Z\u001a\u00020R2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0004\bX\u0010YJ\u000f\u0010]\u001a\u00020RH\u0000¢\u0006\u0004\b[\u0010\\J\u000f\u0010_\u001a\u00020RH\u0000¢\u0006\u0004\b^\u0010\\J)\u0010f\u001a\u00020R2\u0006\u0010a\u001a\u00020`2\b\b\u0002\u0010b\u001a\u00020P2\u0006\u0010c\u001a\u00020PH\u0000¢\u0006\u0004\bd\u0010eJ\u0017\u0010k\u001a\u00020R2\u0006\u0010h\u001a\u00020gH\u0000¢\u0006\u0004\bi\u0010jJ\u000f\u0010m\u001a\u00020RH\u0000¢\u0006\u0004\bl\u0010\\J\u000f\u0010o\u001a\u00020RH\u0000¢\u0006\u0004\bn\u0010\\J\u0017\u0010t\u001a\u00020R2\u0006\u0010q\u001a\u00020pH\u0000¢\u0006\u0004\br\u0010sJ#\u0010{\u001a\u00020P2\b\u0010v\u001a\u0004\u0018\u00010u2\b\u0010x\u001a\u0004\u0018\u00010wH\u0000¢\u0006\u0004\by\u0010zJ\u0019\u0010~\u001a\u00020P2\b\u0010v\u001a\u0004\u0018\u00010uH\u0000¢\u0006\u0004\b|\u0010}J\u0010\u0010\u0080\u0001\u001a\u00020RH\u0000¢\u0006\u0004\b\u007f\u0010\\J\u0011\u0010\u0082\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b\u0081\u0001\u0010\\J\u0011\u0010\u0084\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b\u0083\u0001\u0010\\J\u0011\u0010\u0086\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b\u0085\u0001\u0010\\J\u0011\u0010\u0088\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b\u0087\u0001\u0010\\J\u0013\u0010\u008c\u0001\u001a\u00030\u0089\u0001H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J:\u0010\u0091\u0001\u001a\u00020R2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010v\u001a\u00020u2\b\b\u0002\u0010a\u001a\u00020`2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010wH\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001d\u0010\u0095\u0001\u001a\u00020R2\t\b\u0002\u0010\u0092\u0001\u001a\u00020PH\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001c\u0010\u009a\u0001\u001a\u00020R2\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009f\u0001\u001a\u00020R2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0000¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010¡\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b \u0001\u0010\\J\u0011\u0010£\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b¢\u0001\u0010\\J\u0011\u0010¥\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b¤\u0001\u0010\\J\u001b\u0010©\u0001\u001a\u00030¦\u00012\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u0011\u0010«\u0001\u001a\u00020RH\u0000¢\u0006\u0005\bª\u0001\u0010\\J\u0011\u0010\u00ad\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b¬\u0001\u0010\\J\u0011\u0010¯\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b®\u0001\u0010\\J&\u0010¶\u0001\u001a\u00020R2\b\u0010±\u0001\u001a\u00030°\u00012\b\u0010³\u0001\u001a\u00030²\u0001H\u0000¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u001b\u0010¹\u0001\u001a\u00020R2\u0007\u0010·\u0001\u001a\u00020PH\u0000¢\u0006\u0006\b¸\u0001\u0010\u0094\u0001J\u0011\u0010»\u0001\u001a\u00020RH\u0000¢\u0006\u0005\bº\u0001\u0010\\J\u0011\u0010½\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b¼\u0001\u0010\\J\u0011\u0010¿\u0001\u001a\u00020RH\u0000¢\u0006\u0005\b¾\u0001\u0010\\J\u0011\u0010Á\u0001\u001a\u00020RH\u0000¢\u0006\u0005\bÀ\u0001\u0010\\J\u001c\u0010Ä\u0001\u001a\u00020R2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001c\u0010É\u0001\u001a\u00020R2\b\u0010Æ\u0001\u001a\u00030Å\u0001H\u0000¢\u0006\u0006\bÇ\u0001\u0010È\u0001J&\u0010Î\u0001\u001a\u00020R2\u0006\u0010W\u001a\u00020V2\n\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u0001H\u0000¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u0019\u0010Î\u0001\u001a\u00020R2\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0005\bÌ\u0001\u0010YJ-\u0010Ô\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ð\u00012\b\u0010v\u001a\u0004\u0018\u00010u2\u0007\u0010Ï\u0001\u001a\u00020`H\u0000¢\u0006\u0006\bÒ\u0001\u0010Ó\u0001J\u0012\u0010×\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J$\u0010Ú\u0001\u001a\u00020R2\b\u0010Ë\u0001\u001a\u00030Ê\u00012\u0006\u0010W\u001a\u00020VH\u0000¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u001b\u0010Þ\u0001\u001a\u00030Û\u00012\u0006\u0010M\u001a\u00020LH\u0000¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0013\u0010Þ\u0001\u001a\u00030Û\u0001H\u0000¢\u0006\u0006\bÜ\u0001\u0010ß\u0001J\u001c\u0010ä\u0001\u001a\u00020R2\b\u0010á\u0001\u001a\u00030à\u0001H\u0000¢\u0006\u0006\bâ\u0001\u0010ã\u0001J\u001e\u0010é\u0001\u001a\u00020R2\n\u0010æ\u0001\u001a\u0005\u0018\u00010å\u0001H\u0000¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0015\u0010ì\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0000¢\u0006\u0006\bê\u0001\u0010ë\u0001J\u0012\u0010î\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bí\u0001\u0010Ö\u0001J\u0012\u0010ð\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bï\u0001\u0010Ö\u0001J$\u0010õ\u0001\u001a\u00020P2\u0007\u0010ñ\u0001\u001a\u00020P2\u0007\u0010ò\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bó\u0001\u0010ô\u0001J$\u0010÷\u0001\u001a\u00020P2\u0007\u0010ñ\u0001\u001a\u00020P2\u0007\u0010ò\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bö\u0001\u0010ô\u0001J$\u0010ù\u0001\u001a\u00020P2\u0007\u0010ñ\u0001\u001a\u00020P2\u0007\u0010ò\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bø\u0001\u0010ô\u0001J$\u0010û\u0001\u001a\u00020P2\u0007\u0010ñ\u0001\u001a\u00020P2\u0007\u0010ò\u0001\u001a\u00020PH\u0000¢\u0006\u0006\bú\u0001\u0010ô\u0001J\u001c\u0010\u0080\u0002\u001a\u00020P2\b\u0010ý\u0001\u001a\u00030ü\u0001H\u0000¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J\u001c\u0010\u0083\u0002\u001a\u00020R2\b\u0010ý\u0001\u001a\u00030ü\u0001H\u0000¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u001c\u0010\u0086\u0002\u001a\u00020R2\b\u0010Ë\u0001\u001a\u00030Ê\u0001H\u0000¢\u0006\u0006\b\u0084\u0002\u0010\u0085\u0002J\u0011\u0010\u0087\u0002\u001a\u00020RH\u0016¢\u0006\u0005\b\u0087\u0002\u0010\\J\u0011\u0010\u0089\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b\u0088\u0002\u0010\\J\u0011\u0010\u008a\u0002\u001a\u00020RH\u0016¢\u0006\u0005\b\u008a\u0002\u0010\\J\u0012\u0010\u008c\u0002\u001a\u00020PH\u0000¢\u0006\u0006\b\u008b\u0002\u0010Ö\u0001J\u0012\u0010\u008e\u0002\u001a\u00020PH\u0000¢\u0006\u0006\b\u008d\u0002\u0010Ö\u0001J\u0011\u0010\u0090\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b\u008f\u0002\u0010\\J\u001c\u0010\u0093\u0002\u001a\u00020R2\b\u0010\u0091\u0002\u001a\u00030\u009b\u0001H\u0000¢\u0006\u0006\b\u0092\u0002\u0010\u009e\u0001J\u001c\u0010\u0098\u0002\u001a\u00020R2\b\u0010\u0095\u0002\u001a\u00030\u0094\u0002H\u0000¢\u0006\u0006\b\u0096\u0002\u0010\u0097\u0002J\u001b\u0010\u009b\u0002\u001a\u00020R2\u0007\u0010\u0099\u0002\u001a\u00020PH\u0000¢\u0006\u0006\b\u009a\u0002\u0010\u0094\u0001J\u001b\u0010\u009d\u0002\u001a\u00020R2\u0007\u0010\u0099\u0002\u001a\u00020PH\u0000¢\u0006\u0006\b\u009c\u0002\u0010\u0094\u0001J\u0011\u0010\u009f\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b\u009e\u0002\u0010\\J\u001c\u0010¤\u0002\u001a\u00020R2\b\u0010¡\u0002\u001a\u00030 \u0002H\u0001¢\u0006\u0006\b¢\u0002\u0010£\u0002J\u001c\u0010§\u0002\u001a\u00020R2\b\u0010¥\u0002\u001a\u00030\u009b\u0001H\u0000¢\u0006\u0006\b¦\u0002\u0010\u009e\u0001J\u0011\u0010©\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b¨\u0002\u0010\\J\u0011\u0010«\u0002\u001a\u00020RH\u0000¢\u0006\u0005\bª\u0002\u0010\\J\u0011\u0010\u00ad\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b¬\u0002\u0010\\J\u001c\u0010²\u0002\u001a\u00020R2\b\u0010¯\u0002\u001a\u00030®\u0002H\u0000¢\u0006\u0006\b°\u0002\u0010±\u0002J\u001c\u0010´\u0002\u001a\u00020R2\b\u0010¯\u0002\u001a\u00030®\u0002H\u0000¢\u0006\u0006\b³\u0002\u0010±\u0002J\u0011\u0010¶\u0002\u001a\u00020RH\u0000¢\u0006\u0005\bµ\u0002\u0010\\J\u0011\u0010¸\u0002\u001a\u00020RH\u0000¢\u0006\u0005\b·\u0002\u0010\\J&\u0010»\u0002\u001a\u00020R2\b\u0010\u0095\u0002\u001a\u00030\u0094\u00022\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0000¢\u0006\u0006\b¹\u0002\u0010º\u0002J\u000f\u0010¼\u0002\u001a\u00020R¢\u0006\u0005\b¼\u0002\u0010\\J\u000f\u0010½\u0002\u001a\u00020R¢\u0006\u0005\b½\u0002\u0010\\J\u000f\u0010¾\u0002\u001a\u00020R¢\u0006\u0005\b¾\u0002\u0010\\J\"\u0010À\u0002\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010¿\u00022\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0006\bÀ\u0002\u0010Á\u0002J\u0013\u0010Ã\u0002\u001a\u00030Â\u0002H\u0002¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J\u0011\u0010Å\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bÅ\u0002\u0010\\J$\u0010Æ\u0002\u001a\u00020R2\b\u0010v\u001a\u0004\u0018\u00010u2\u0006\u0010a\u001a\u00020`H\u0002¢\u0006\u0006\bÆ\u0002\u0010Ç\u0002J\u0012\u0010È\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÈ\u0002\u0010Ö\u0001J\u0019\u0010É\u0002\u001a\u00020R2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0005\bÉ\u0002\u0010YJ\u001b\u0010Ë\u0002\u001a\u00020R2\u0007\u0010Ê\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bË\u0002\u0010\u0094\u0001J\u0012\u0010Ì\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÌ\u0002\u0010Ö\u0001J\u0012\u0010Í\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÍ\u0002\u0010Ö\u0001J\u001c\u0010Ï\u0002\u001a\u00020R2\b\u0010Î\u0002\u001a\u00030à\u0001H\u0002¢\u0006\u0006\bÏ\u0002\u0010ã\u0001J\u0012\u0010Ð\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÐ\u0002\u0010Ö\u0001J\u0011\u0010Ñ\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bÑ\u0002\u0010\\JC\u0010Ô\u0002\u001a\n\u0012\u0005\u0012\u00030ü\u00010Ó\u00022\u0006\u0010v\u001a\u00020u2\n\b\u0002\u0010x\u001a\u0004\u0018\u00010w2\b\u0010a\u001a\u0004\u0018\u00010`2\t\b\u0002\u0010Ò\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÔ\u0002\u0010Õ\u0002J\u0012\u0010Ö\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÖ\u0002\u0010Ö\u0001J\u0011\u0010×\u0002\u001a\u00020RH\u0002¢\u0006\u0005\b×\u0002\u0010\\J\u001c\u0010Ø\u0002\u001a\u00020R2\b\u0010\u0091\u0002\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\bØ\u0002\u0010\u009e\u0001J\u0011\u0010Ù\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bÙ\u0002\u0010\\J\u0012\u0010Ú\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bÚ\u0002\u0010Ö\u0001J&\u0010Ü\u0002\u001a\u00020R2\b\u0010Û\u0002\u001a\u00030ü\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\bÜ\u0002\u0010Ý\u0002J\u0011\u0010Þ\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bÞ\u0002\u0010\\J\u0011\u0010ß\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bß\u0002\u0010\\J\u0011\u0010à\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bà\u0002\u0010\\J\u0011\u0010á\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bá\u0002\u0010\\J\u0011\u0010â\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bâ\u0002\u0010\\J\u001c\u0010ä\u0002\u001a\u00020R2\b\u0010ã\u0002\u001a\u00030®\u0002H\u0002¢\u0006\u0006\bä\u0002\u0010±\u0002J\u0011\u0010å\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bå\u0002\u0010\\J\u0011\u0010æ\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bæ\u0002\u0010\\J\u0011\u0010ç\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bç\u0002\u0010\\J\u0011\u0010è\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bè\u0002\u0010\\J\u0012\u0010é\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bé\u0002\u0010Ö\u0001J\u001d\u0010ê\u0002\u001a\u00020R2\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0082@¢\u0006\u0006\bê\u0002\u0010ë\u0002J\u0011\u0010ì\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bì\u0002\u0010\\J$\u0010í\u0002\u001a\u00020R2\u0006\u0010W\u001a\u00020V2\b\u0010Ë\u0001\u001a\u00030Ê\u0001H\u0002¢\u0006\u0006\bí\u0002\u0010Í\u0001J\u0012\u0010î\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bî\u0002\u0010Ö\u0001J\u0011\u0010ï\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bï\u0002\u0010\\J4\u0010ð\u0002\u001a\u00020P2\u0007\u0010ñ\u0001\u001a\u00020P2\u0007\u0010ò\u0001\u001a\u00020P2\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0006\bð\u0002\u0010ñ\u0002J\u0012\u0010ò\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bò\u0002\u0010Ö\u0001J\u0011\u0010ó\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bó\u0002\u0010\\J\u0012\u0010ô\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bô\u0002\u0010Ö\u0001J\u0011\u0010õ\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bõ\u0002\u0010\\J\u0012\u0010ö\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bö\u0002\u0010Ö\u0001J\u0012\u0010÷\u0002\u001a\u00020PH\u0002¢\u0006\u0006\b÷\u0002\u0010Ö\u0001J\u0012\u0010ø\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bø\u0002\u0010Ö\u0001J\u0012\u0010ù\u0002\u001a\u00020PH\u0002¢\u0006\u0006\bù\u0002\u0010Ö\u0001J\u0011\u0010ú\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bú\u0002\u0010\\J\u0011\u0010û\u0002\u001a\u00020RH\u0002¢\u0006\u0005\bû\u0002\u0010\\J-\u0010ý\u0002\u001a\u00020R2\u000f\u0010ü\u0002\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ð\u00012\b\u0010\u0095\u0002\u001a\u00030\u0094\u0002H\u0002¢\u0006\u0006\bý\u0002\u0010þ\u0002J(\u0010\u0083\u0003\u001a\u00030\u0082\u00032\b\u0010\u0080\u0003\u001a\u00030ÿ\u00022\t\b\u0002\u0010\u0081\u0003\u001a\u00020PH\u0002¢\u0006\u0006\b\u0083\u0003\u0010\u0084\u0003J$\u0010\u0086\u0003\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010Ð\u00012\b\u0010\u0085\u0003\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u0086\u0003\u0010\u0087\u0003J\u001c\u0010\u0088\u0003\u001a\u00020R2\b\u0010¡\u0002\u001a\u00030 \u0002H\u0002¢\u0006\u0006\b\u0088\u0003\u0010£\u0002JI\u0010\u008e\u0003\u001a\u00020R2\b\u0010\u0089\u0003\u001a\u00030\u009b\u00012\b\u0010\u008a\u0003\u001a\u00030Ê\u00012\u0007\u0010\u008b\u0003\u001a\u00020P2\n\u0010\u008d\u0003\u001a\u0005\u0018\u00010\u008c\u00032\f\b\u0002\u0010\u0080\u0003\u001a\u0005\u0018\u00010ÿ\u0002H\u0002¢\u0006\u0006\b\u008e\u0003\u0010\u008f\u0003J\u001c\u0010\u0092\u0003\u001a\u00020R2\b\u0010\u0091\u0003\u001a\u00030\u0090\u0003H\u0002¢\u0006\u0006\b\u0092\u0003\u0010\u0093\u0003J\u0012\u0010\u0094\u0003\u001a\u00020PH\u0002¢\u0006\u0006\b\u0094\u0003\u0010Ö\u0001J\u0012\u0010\u0095\u0003\u001a\u00020PH\u0002¢\u0006\u0006\b\u0095\u0003\u0010Ö\u0001J\u0012\u0010\u0096\u0003\u001a\u00020PH\u0002¢\u0006\u0006\b\u0096\u0003\u0010Ö\u0001J\u001b\u0010\u0098\u0003\u001a\u00020R2\u0007\u0010\u0097\u0003\u001a\u00020LH\u0002¢\u0006\u0006\b\u0098\u0003\u0010\u0099\u0003J#\u0010\u009a\u0003\u001a\u00020R2\u0007\u0010Ê\u0002\u001a\u00020P2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0006\b\u009a\u0003\u0010\u009b\u0003J\u0013\u0010\u009c\u0003\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009c\u0003\u0010ë\u0001J\u001c\u0010\u009e\u0003\u001a\u00020R2\b\u0010\u009d\u0003\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b\u009e\u0003\u0010\u009e\u0001J8\u0010¡\u0003\u001a\u0014\u0012\u000f\u0012\r  \u0003*\u0005\u0018\u00010\u009b\u00010\u009b\u00010\u009f\u00032\b\u0010\u0095\u0002\u001a\u00030\u0094\u00022\b\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\b¡\u0003\u0010¢\u0003J\u0013\u0010£\u0003\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b£\u0003\u0010ë\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010¤\u0003R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010¥\u0003R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010¦\u0003R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010§\u0003R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010¨\u0003R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010©\u0003R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010ª\u0003R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010«\u0003R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0013\u0010¬\u0003R\u0015\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u00ad\u0003R\u0015\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0017\u0010®\u0003R\u0015\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010¯\u0003R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010°\u0003R\u0015\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010±\u0003R\u0015\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001f\u0010²\u0003R\u0015\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b!\u0010³\u0003R\u0015\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b#\u0010´\u0003R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b%\u0010µ\u0003R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¶\u0003R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010·\u0003R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010¸\u0003R\u0015\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010¹\u0003R\u0015\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010º\u0003R\u0015\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b1\u0010»\u0003R\u0015\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010¼\u0003R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010½\u0003R\u0015\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b7\u0010¾\u0003R\u0015\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b9\u0010¿\u0003R\u0015\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010À\u0003R\u0015\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b=\u0010Á\u0003R\u0017\u0010?\u001a\u0004\u0018\u00010>8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010Â\u0003R\u0015\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bA\u0010Ã\u0003R\u0015\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ä\u0003R\u001a\u0010Û\u0002\u001a\u00030ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010Å\u0003R!\u0010É\u0003\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÆ\u0003\u0010Ç\u0003\u001a\u0006\bÈ\u0003\u0010ë\u0001R!\u0010Î\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bË\u0003\u0010Ç\u0003\u001a\u0006\bÌ\u0003\u0010Í\u0003R!\u0010Ñ\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0003\u0010Ç\u0003\u001a\u0006\bÐ\u0003\u0010Í\u0003R!\u0010Ô\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÒ\u0003\u0010Ç\u0003\u001a\u0006\bÓ\u0003\u0010Í\u0003R!\u0010×\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0003\u0010Ç\u0003\u001a\u0006\bÖ\u0003\u0010Í\u0003R!\u0010Ú\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0003\u0010Ç\u0003\u001a\u0006\bÙ\u0003\u0010Í\u0003R\u001c\u0010Ü\u0003\u001a\u0005\u0018\u00010Û\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0003\u0010Ý\u0003R9\u0010â\u0003\u001a$\u0012\u0005\u0012\u00030ß\u0003\u0012\u0005\u0012\u00030à\u00030Þ\u0003j\u0011\u0012\u0005\u0012\u00030ß\u0003\u0012\u0005\u0012\u00030à\u0003`á\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0003\u0010ã\u0003R\u0018\u0010å\u0003\u001a\u00030ä\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0003\u0010æ\u0003R!\u0010é\u0003\u001a\u00030Ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bç\u0003\u0010Ç\u0003\u001a\u0006\bè\u0003\u0010Í\u0003R\u0017\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010ê\u0003R\u001a\u0010ì\u0003\u001a\u00030ë\u00038\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bì\u0003\u0010í\u0003R\u001c\u0010ï\u0003\u001a\u0005\u0018\u00010î\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0003\u0010ð\u0003R\u0018\u0010ò\u0003\u001a\u00030ñ\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0003\u0010ó\u0003R\u001c\u0010õ\u0003\u001a\u0005\u0018\u00010ô\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0003\u0010ö\u0003R\u0018\u0010ø\u0003\u001a\u00030÷\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0003\u0010ù\u0003R\u001c\u0010ú\u0003\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0003\u0010û\u0003R\u0019\u0010ü\u0003\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0003\u0010ê\u0003R\u0019\u0010ý\u0003\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0003\u0010ê\u0003R\u001a\u0010þ\u0003\u001a\u00030®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0003\u0010ÿ\u0003R)\u0010\u0080\u0004\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0080\u0004\u0010ê\u0003\u001a\u0006\b\u0081\u0004\u0010Ö\u0001\"\u0006\b\u0082\u0004\u0010\u0094\u0001R)\u0010\u0083\u0004\u001a\u00020P8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0004\u0010ê\u0003\u001a\u0006\b\u0084\u0004\u0010Ö\u0001\"\u0006\b\u0085\u0004\u0010\u0094\u0001R*\u0010\u0086\u0004\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0086\u0004\u0010\u0087\u0004\u001a\u0006\b\u0088\u0004\u0010\u0089\u0004\"\u0006\b\u008a\u0004\u0010\u008b\u0004R*\u0010\u008c\u0004\u001a\u00030°\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0004\u0010\u0087\u0004\u001a\u0006\b\u008d\u0004\u0010\u0089\u0004\"\u0006\b\u008e\u0004\u0010\u008b\u0004R,\u0010\u008f\u0004\u001a\u0005\u0018\u00010Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0004\u0010\u0090\u0004\u001a\u0006\b\u0091\u0004\u0010\u0092\u0004\"\u0006\b\u0093\u0004\u0010\u0085\u0002R\u001a\u0010\u0094\u0004\u001a\u00030®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0004\u0010ÿ\u0003R\u001c\u0010\u0095\u0004\u001a\u0005\u0018\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0004\u0010\u0096\u0004R\u001c\u0010\u0097\u0004\u001a\u0005\u0018\u00010\u0094\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0004\u0010\u0098\u0004R7\u0010\u009b\u0004\u001a\u0005\u0018\u00010\u0099\u00042\n\u0010\u009a\u0004\u001a\u0005\u0018\u00010\u0099\u00048\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\b\u009b\u0004\u0010\u009c\u0004\u0012\u0005\b\u009f\u0004\u0010\\\u001a\u0006\b\u009d\u0004\u0010\u009e\u0004R\u001a\u0010 \u0004\u001a\u00030®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0004\u0010ÿ\u0003R\u001a\u0010¡\u0004\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0004\u0010\u0087\u0004R\u001a\u0010¢\u0004\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0004\u0010\u0087\u0004R\u001c\u0010£\u0004\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0004\u0010û\u0003R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¤\u0004R\u001a\u0010¥\u0002\u001a\u00030\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010û\u0003R\u0017\u0010I\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bI\u0010¥\u0004R\u0017\u0010K\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bK\u0010¦\u0004R\u0017\u0010M\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bM\u0010§\u0004R\u0019\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010¨\u0004R,\u0010©\u0004\u001a\u00030\u008d\u00012\b\u0010\u009a\u0004\u001a\u00030\u008d\u00018\u0000@BX\u0080.¢\u0006\u0010\n\u0006\b©\u0004\u0010ª\u0004\u001a\u0006\b«\u0004\u0010¬\u0004R*\u0010®\u0004\u001a\u00030\u00ad\u00048\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b®\u0004\u0010¯\u0004\u001a\u0006\b°\u0004\u0010±\u0004\"\u0006\b²\u0004\u0010³\u0004R'\u0010µ\u0004\u001a\u0012\u0012\r\u0012\u000b  \u0003*\u0004\u0018\u00010g0g0´\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0004\u0010¶\u0004R)\u0010·\u0004\u001a\u0014\u0012\u000f\u0012\r  \u0003*\u0005\u0018\u00010\u008d\u00010\u008d\u00010´\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0004\u0010¶\u0004R,\u0010¾\u0004\u001a\u00030¸\u00042\b\u0010¹\u0004\u001a\u00030¸\u00048@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bº\u0004\u0010»\u0004\"\u0006\b¼\u0004\u0010½\u0004R\u0016\u0010W\u001a\u00020V8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0004\u0010À\u0004R\u0018\u0010Â\u0004\u001a\u00030°\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÁ\u0004\u0010\u0089\u0004¨\u0006Æ\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter;", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Listener;", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "nativeDetector", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;", "rectangleDetector", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;", "accessibleDocumentCaptureUseCase", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessInteractor;", "livenessInteractor", "Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;", "backendDocumentValidationsManager", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;", "documentProcessingUseCase", "Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;", "postCaptureDocumentValidationsManager", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "permissionsManager", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;", "faceDetector", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "identityInteractor", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "documentConfigurationManager", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "timeProvider", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "sdkUploadMetaDataHelper", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;", "documentService", "Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;", "nfcPropertiesService", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "nfcInteractor", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;", "documentDelayTransformer", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/usecase/FaceProcessingUseCase;", "faceProcessingUseCase", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;", "documentProcessingFailureAnalyzer", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "retainableValidationsResult", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "barcodeValidationSuspender", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureTracker;", "captureTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;", "livenessTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "flowTracker", "Landroid/os/ResultReceiver;", "mediaCallback", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;", "mrzDocumentExtractor", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;", "documentValidationUseCase", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "dispatchersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessInteractor;Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/usecase/FaceProcessingUseCase;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;Lcom/onfido/android/sdk/capture/utils/ImageUtils;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;Landroid/os/ResultReceiver;Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;)V", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "view", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "onfidoConfig", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "captureStepDataBundle", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "nfcArguments", "", "isProofOfAddress", "", "setup$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;Lcom/onfido/android/sdk/capture/OnfidoConfig;Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;Lcom/onfido/android/sdk/capture/flow/NfcArguments;Z)V", "setup", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "captureType", "onViewResumed$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;)V", "onViewResumed", "setupUIState$onfido_capture_sdk_core_release", "()V", "setupUIState", "onCameraStarted$onfido_capture_sdk_core_release", "onCameraStarted", "Lcom/onfido/api/client/data/DocSide;", "docSide", "isFirstStart", "isOnConfirmationStep", "onStart$onfido_capture_sdk_core_release", "(Lcom/onfido/api/client/data/DocSide;ZZ)V", "onStart", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetricsChanged$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "onOverlayMetricsChanged", "startOverlayDisplayTimer$onfido_capture_sdk_core_release", "startOverlayDisplayTimer", "trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release", "trackAutocaptureShutterButtonClick", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;", "livenessChallengesViewModel", "startLivenessProcessing$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengesViewModel;)V", "startLivenessProcessing", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "shouldAutocapture$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "shouldAutocapture", "shouldShowInitialOverlay$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentType;)Z", "shouldShowInitialOverlay", "onManualLivenessRecordingStart$onfido_capture_sdk_core_release", "onManualLivenessRecordingStart", "onAutoLivenessRecordingStart$onfido_capture_sdk_core_release", "onAutoLivenessRecordingStart", "onManualLivenessNextClick$onfido_capture_sdk_core_release", "onManualLivenessNextClick", "onFaceSelfieUploaded$onfido_capture_sdk_core_release", "onFaceSelfieUploaded", "trackUploadStarted$onfido_capture_sdk_core_release", "trackUploadStarted", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "getUploadChallengesList$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "getUploadChallengesList", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "frame", "applyPostCaptureValidations$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "applyPostCaptureValidations", "isStartedManually", "onRecordingStarted$onfido_capture_sdk_core_release", "(Z)V", "onRecordingStarted", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "onPictureCaptured$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "onPictureCaptured", "", "filePath", "onVideoCaptured$onfido_capture_sdk_core_release", "(Ljava/lang/String;)V", "onVideoCaptured", "startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release", "startDocumentVideoRecordingTimer", "onErrorVideoTaking$onfido_capture_sdk_core_release", "onErrorVideoTaking", "onErrorPictureTaking$onfido_capture_sdk_core_release", "onErrorPictureTaking", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "getOvalCaptureContentDescription$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "getOvalCaptureContentDescription", "stopFaceTracking$onfido_capture_sdk_core_release", "stopFaceTracking", "onFaceDetected$onfido_capture_sdk_core_release", "onFaceDetected", "issueNextChallenge$onfido_capture_sdk_core_release", "issueNextChallenge", "", "challengeIndex", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;", "challengeType", "trackLivenessChallenge$onfido_capture_sdk_core_release", "(ILcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;)V", "trackLivenessChallenge", "wasConfirmationScreenShown", "onCaptureScreenResumedAfterCameraInitialized$onfido_capture_sdk_core_release", "onCaptureScreenResumedAfterCameraInitialized", "onPause$onfido_capture_sdk_core_release", "onPause", "stop$onfido_capture_sdk_core_release", "stop", "onDestroy$onfido_capture_sdk_core_release", "onDestroy", "clearEdges$onfido_capture_sdk_core_release", "clearEdges", "onNextFrame$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)V", "onNextFrame", "Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;", "frameData", "onNextFaceDetectionFrame$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/FaceDetectionFrame;)V", "onNextFaceDetectionFrame", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "errorType", "trackCaptureError$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "trackCaptureError", "documentSide", "", "Lcom/onfido/android/sdk/capture/validation/Validation;", "getRequiredDocumentValidations$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/api/client/data/DocSide;)Ljava/util/List;", "getRequiredDocumentValidations", "shouldPerformFaceValidation$onfido_capture_sdk_core_release", "()Z", "shouldPerformFaceValidation", "onUploadValidationError$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;Lcom/onfido/android/sdk/capture/ui/CaptureType;)V", "onUploadValidationError", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "sdkUploadMetadata$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)Lcom/onfido/api/client/data/SdkUploadMetaData;", "sdkUploadMetadata", "()Lcom/onfido/api/client/data/SdkUploadMetaData;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;", "challenge", "onNextChallenge$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallenge;)V", "onNextChallenge", "Lcom/onfido/android/sdk/capture/validation/device/MRZValidationResult;", "result", "setMRZResult$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/validation/device/MRZValidationResult;)V", "setMRZResult", "getExtraFileInfo$onfido_capture_sdk_core_release", "()Ljava/lang/String;", "getExtraFileInfo", "shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release", "shouldHideManualDocumentCaptureButton", "shouldAutoCaptureDocument$onfido_capture_sdk_core_release", "shouldAutoCaptureDocument", "isFrontSide", "isOverlayGone", "shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release", "(ZZ)Z", "shouldShowFrenchDLOverlay", "shouldShowGermanDLOverlay$onfido_capture_sdk_core_release", "shouldShowGermanDLOverlay", "shouldShowItalianIDOverlay$onfido_capture_sdk_core_release", "shouldShowItalianIDOverlay", "shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release", "shouldShowSouthAfricanIDOverlay", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "results", "isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)Z", "isDocumentFrameValidForAutoCapture", "analyseProcessingResults$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)V", "analyseProcessingResults", "showErrorType$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "showErrorType", "onCaptureConfirmed", "callMediaCallback$onfido_capture_sdk_core_release", "callMediaCallback", "onCaptureDiscarded", "isCameraXEnabled$onfido_capture_sdk_core_release", "isCameraXEnabled", "isFourByThreeEnabled$onfido_capture_sdk_core_release", "isFourByThreeEnabled", "onVideoRecordingCanceled$onfido_capture_sdk_core_release", "onVideoRecordingCanceled", "reason", "showLoadingDialog$onfido_capture_sdk_core_release", "showLoadingDialog", "", "jpegData", "uploadImageForValidation$onfido_capture_sdk_core_release", "([B)V", "uploadImageForValidation", "isOnCaptureScreen", "onUploadFailure$onfido_capture_sdk_core_release", "onUploadFailure", "onUploadFailureWithGeoblocking$onfido_capture_sdk_core_release", "onUploadFailureWithGeoblocking", "onGeneralUploadError$onfido_capture_sdk_core_release", "onGeneralUploadError", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "uploadBinaryResult", "onBinaryUploaded$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;)V", "onBinaryUploaded", "documentVideoId", "onDocumentVideoUploaded$onfido_capture_sdk_core_release", "onDocumentVideoUploaded", "onConfirmationStepTracking$onfido_capture_sdk_core_release", "onConfirmationStepTracking", "trackCaptureBackButtonClicked$onfido_capture_sdk_core_release", "trackCaptureBackButtonClicked", "trackConfirmationBackButtonClicked$onfido_capture_sdk_core_release", "trackConfirmationBackButtonClicked", "", "duration", "trackVideoNextButtonClicked$onfido_capture_sdk_core_release", "(J)V", "trackVideoNextButtonClicked", "trackVideoFinishButtonClicked$onfido_capture_sdk_core_release", "trackVideoFinishButtonClicked", "trackVideoCaptureTimeout$onfido_capture_sdk_core_release", "trackVideoCaptureTimeout", "trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release", "trackVideoTimeoutRetryButtonClicked", "cropImageAndSaveToFile$onfido_capture_sdk_core_release", "([BLcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)V", "cropImageAndSaveToFile", "onFlowUserExit", "onFlowUserExitConfirmed", "onFlowUserExitCancel", "", "getMissingPermissions", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;)[Ljava/lang/String;", "Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;", "getPerformanceTrackingScreen", "()Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;", "observeAutoCapture", "enableAccessibilityCapture", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/api/client/data/DocSide;)V", "shouldEnableAccessibilityCapture", "trackCapture", "isPortrait", "trackDocumentCapture", "shouldRecordDocumentVideo", "isMRZExtracted", "livenessChallenge", "pushPerformedChallenge", "isBackSideOfRomanianNationalId", "trackVideoButtonClicked", "enableManualFallback", "Lio/reactivex/rxjava3/core/Observable;", "getImageProcessingObservable", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/DocSide;Z)Lio/reactivex/rxjava3/core/Observable;", "edgeDetectionTimeoutNotStarted", "startManualFallbackTimer", "showLoading", "trackDocumentCaptureFlowCompleted", "isFinalStepForDocument", "processingResults", "onPostCaptureValidationsFinished", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)V", "observeFaceOut", "startDocumentVideoRecording", "stopDocumentRecording", "stopDocumentVideoRecordingAndCameraFeed", "startVideoConfirmationTickTimer", "animationDelay", "applyValidationsAfterAnimationDelay", "applyValidations", "disposeFaceDetectionSubscriptions", "disposeAutocaptureSubscriptions", "stopDocumentVideoRecordingSubscription", "isMlModelAutoCaptureEnabled", "processFrameForMRZ", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackWaitingScreenCompleted", "trackUploadValidationError", "hasNativeLibrary", "checkDocumentFormat", "shouldShowOverlay", "(ZZLcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "isMrzDetectionEnabled", "showMRZWarning", "shouldForceRetry", "checkUploading", "shouldUploadDocument", "isDocumentUploaded", "isCheckingImageQuality", "isDocumentCapture", "startMovementChallengeTimeout", "stopMovementChallengeTimeout", "validations", "uploadDocumentMedia", "(Ljava/util/List;[B)V", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcProperties", "hasNfc", "Lcom/onfido/api/client/data/DocumentFeatures;", "getDocumentFeatures", "(Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;Z)Lcom/onfido/api/client/data/DocumentFeatures;", "uploadedMediaId", "getDocumentIdsForDocumentResponse", "(Ljava/lang/String;)Ljava/util/List;", "checkUploadBinaryResult", "documentId", "warning", "nfcSupported", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "warningsBundle", "showWarningBinaryResult", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ErrorType;ZLcom/onfido/api/client/data/DocumentValidationWarningsBundle;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "shouldGetNfcProperties", "shouldScanNfc", "backSideCaptureNeeded", "documentData", "trackDocumentConfirmation", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)V", "trackFaceConfirmation", "(ZLcom/onfido/android/sdk/capture/ui/CaptureType;)V", "getPoaCaptureName", "fileName", "imageSavedSuccessfully", "Lio/reactivex/rxjava3/core/Single;", "kotlin.jvm.PlatformType", "getPoaFileNameAfterCropping", "([BLcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)Lio/reactivex/rxjava3/core/Single;", "toStep", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/capture/LivenessInteractor;", "Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;", "Lcom/onfido/android/sdk/capture/internal/usecase/DocumentProcessingUseCase;", "Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;", "Lcom/onfido/android/sdk/capture/common/permissions/RuntimePermissionsManager;", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetector;", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;", "Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/usecase/FaceProcessingUseCase;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/CaptureTracker;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessTracker;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/FlowTracker;", "Landroid/os/ResultReceiver;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "poaCaptureSessionId$delegate", "Lkotlin/Lazy;", "getPoaCaptureSessionId", "poaCaptureSessionId", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeSubscription$delegate", "getCompositeSubscription", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeSubscription", "faceDetectionCompositeDisposable$delegate", "getFaceDetectionCompositeDisposable", "faceDetectionCompositeDisposable", "faceTrackingCompositeDisposable$delegate", "getFaceTrackingCompositeDisposable", "faceTrackingCompositeDisposable", "movementChallengeCompositeDisposable$delegate", "getMovementChallengeCompositeDisposable", "movementChallengeCompositeDisposable", "autocaptureCompositeDisposable$delegate", "getAutocaptureCompositeDisposable", "autocaptureCompositeDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "edgeDetectionFallbackTimerDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/validation/MRZDataType;", "Lcom/onfido/android/sdk/capture/validation/MRZData;", "Lkotlin/collections/HashMap;", "mrzExtractionResultMap", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser;", "iqsUploadParser", "Lcom/onfido/android/sdk/capture/ui/camera/IQSUploadErrorParser;", "documentVideoRecordingCompositeDisposable$delegate", "getDocumentVideoRecordingCompositeDisposable", "documentVideoRecordingCompositeDisposable", "Z", "Landroid/graphics/RectF;", "visibleRect", "Landroid/graphics/RectF;", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "documentValidationTarget", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "Lkotlinx/coroutines/CoroutineScope;", "presenterScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "autoCaptureJob", "Lkotlinx/coroutines/Job;", "Lcom/onfido/android/sdk/capture/ui/camera/util/DocumentValidationResultMapper;", "documentValidaMapper", "Lcom/onfido/android/sdk/capture/ui/camera/util/DocumentValidationResultMapper;", "extraFileInfo", "Ljava/lang/String;", "isMRZExtractionTimeExceeded", "shouldWaitForMRZExtractionResult", "faceSelfieUploadStartTime", "J", "isDisplayingOverlay", "isDisplayingOverlay$onfido_capture_sdk_core_release", "setDisplayingOverlay$onfido_capture_sdk_core_release", "isAutoCaptured", "isAutoCaptured$onfido_capture_sdk_core_release", "setAutoCaptured$onfido_capture_sdk_core_release", "rejectionCount", "I", "getRejectionCount$onfido_capture_sdk_core_release", "()I", "setRejectionCount$onfido_capture_sdk_core_release", "(I)V", "takenPhotoCount", "getTakenPhotoCount$onfido_capture_sdk_core_release", "setTakenPhotoCount$onfido_capture_sdk_core_release", "currentCaptureFlowError", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "getCurrentCaptureFlowError$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "setCurrentCaptureFlowError$onfido_capture_sdk_core_release", "livenessPreviousChallengeCompleted", "capturedImage", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "croppedImage", "[B", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "<set-?>", "extractedMRZDocument", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "getExtractedMRZDocument$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "getExtractedMRZDocument$onfido_capture_sdk_core_release$annotations", "firstFrameEmitTime", "emittedFramesCount", "processedFramesCount", "capturedVideoFilePath", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "Lcom/onfido/android/sdk/capture/OnfidoConfig;", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "docFrame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "getDocFrame$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureResultConsumer;", "documentCaptureResultConsumer", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureResultConsumer;", "getDocumentCaptureResultConsumer$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureResultConsumer;", "setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureResultConsumer;)V", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "overlayMetricsBehaviorSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "documentFrameBehaviorSubject", "Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$State;", "value", "getState$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$State;", "setState$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$State;)V", "state", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getCaptureErrorMessage", "captureErrorMessage", "Companion", "State", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CapturePresenter implements ConfirmationStepButtons.Listener {
    public static final long CONFIRMATION_VIEW_ANIM_DELAY = 1200;

    @NotNull
    private static final List<MRZDataType> DUTCH_ID_MRZ_REQUIRED_FIELDS;
    public static final long FACE_DETECTION_SAMPLING_PERIOD_MS = 200;
    public static final long FACE_DETECTION_TIMEOUT_MS = 5000;
    public static final long FACE_TRACKING_TIMEOUT_MS = 5000;
    public static final long FAILURE_RECORDING_INCREASE_IN_MS = 1500;
    public static final long MANUAL_FALLBACK_DELAY_MS = 7000;
    public static final long MAXIMUM_RECORDING_DURATION_IN_MS = 5000;
    public static final long OVERLAY_DELAY_MS = 4000;

    @NotNull
    private static final List<MRZDataType> PASSPORT_MRZ_REQUIRED_FIELDS;
    public static final long PASSPORT_OVERLAY_DELAY_MS = 3000;
    public static final long VIDEO_RECORDING_SIZE_CHECK_INTERVAL_MS = 1000;

    @NotNull
    private final AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase;

    @NotNull
    private final AnnouncementService announcementService;
    private Job autoCaptureJob;

    /* JADX INFO: renamed from: autocaptureCompositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy autocaptureCompositeDisposable;

    @NotNull
    private final BackendDocumentValidationsManager backendDocumentValidationsManager;

    @NotNull
    private final BarcodeValidationSuspender barcodeValidationSuspender;
    private CaptureStepDataBundle captureStepDataBundle;

    @NotNull
    private final CaptureTracker captureTracker;
    private OnfidoImage capturedImage;
    private String capturedVideoFilePath;

    /* JADX INFO: renamed from: compositeSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeSubscription;
    private byte[] croppedImage;
    private ErrorType currentCaptureFlowError;
    private DocumentDetectionFrame docFrame;
    public DocumentCaptureResultConsumer documentCaptureResultConsumer;

    @NotNull
    private final DocumentConfigurationManager documentConfigurationManager;

    @NotNull
    private final DocumentCaptureDelayTransformer documentDelayTransformer;

    @NotNull
    private final BehaviorSubject documentFrameBehaviorSubject;

    @NotNull
    private final DocumentProcessingResultsFailureAnalyzer documentProcessingFailureAnalyzer;

    @NotNull
    private final DocumentProcessingUseCase documentProcessingUseCase;

    @NotNull
    private final DocumentService documentService;

    @NotNull
    private final DocumentValidationResultMapper documentValidaMapper;
    private DocumentValidationTargets documentValidationTarget;

    @NotNull
    private final DocumentValidationUseCase documentValidationUseCase;

    @NotNull
    private String documentVideoId;

    /* JADX INFO: renamed from: documentVideoRecordingCompositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy documentVideoRecordingCompositeDisposable;
    private Disposable edgeDetectionFallbackTimerDisposable;
    private int emittedFramesCount;
    private String extraFileInfo;
    private MRZDocument extractedMRZDocument;

    /* JADX INFO: renamed from: faceDetectionCompositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceDetectionCompositeDisposable;

    @NotNull
    private final FaceDetector faceDetector;

    @NotNull
    private final FaceProcessingUseCase faceProcessingUseCase;
    private long faceSelfieUploadStartTime;

    /* JADX INFO: renamed from: faceTrackingCompositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy faceTrackingCompositeDisposable;
    private long firstFrameEmitTime;

    @NotNull
    private final FlowTracker flowTracker;

    @NotNull
    private final IdentityInteractor identityInteractor;

    @NotNull
    private final ImageUtils imageUtils;

    @NotNull
    private final IQSUploadErrorParser iqsUploadParser;
    private boolean isAutoCaptured;
    private boolean isDisplayingOverlay;
    private boolean isMRZExtractionTimeExceeded;
    private boolean isProofOfAddress;

    @NotNull
    private final LivenessInteractor livenessInteractor;
    private long livenessPreviousChallengeCompleted;

    @NotNull
    private final LivenessTracker livenessTracker;
    private final ResultReceiver mediaCallback;

    /* JADX INFO: renamed from: movementChallengeCompositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy movementChallengeCompositeDisposable;

    @NotNull
    private final MRZDocumentExtractor mrzDocumentExtractor;

    @NotNull
    private final HashMap<MRZDataType, MRZData> mrzExtractionResultMap;

    @NotNull
    private final NativeDetector nativeDetector;
    private NfcArguments nfcArguments;

    @NotNull
    private final NfcInteractor nfcInteractor;

    @NotNull
    private final NfcPropertiesService nfcPropertiesService;

    @NotNull
    private final NfcTracker nfcTracker;
    private OnfidoConfig onfidoConfig;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final BehaviorSubject overlayMetricsBehaviorSubject;

    @NotNull
    private final RuntimePermissionsManager permissionsManager;

    /* JADX INFO: renamed from: poaCaptureSessionId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy poaCaptureSessionId;

    @NotNull
    private final PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager;

    @NotNull
    private final CoroutineScope presenterScope;
    private int processedFramesCount;

    @NotNull
    private DocumentProcessingResults processingResults;

    @NotNull
    private final RectangleDetector rectangleDetector;
    private int rejectionCount;

    @NotNull
    private final RetainableValidationsResult retainableValidationsResult;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final SdkUploadMetadataHelper sdkUploadMetaDataHelper;
    private boolean shouldWaitForMRZExtractionResult;
    private int takenPhotoCount;

    @NotNull
    private final TimeProvider timeProvider;
    private UploadBinaryResult uploadBinaryResult;
    private View view;
    private RectF visibleRect;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @NotNull
    private static final String MRZ_IS_NOT_READABLE = "0";

    @NotNull
    private static final String MRZ_IS_READABLE = "1";

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    @NotNull
    private static final String POA_DEBUG = "POA_Debug";

    @NotNull
    public static final String SELFIE_PREFIX = "onfido-selfie";

    @NotNull
    private static final String JPEG_EXTENSION = "jpeg";

    @NotNull
    public static final String DOCUMENT_PREFIX = "onfido-document";

    @NotNull
    private static final String DOC_POA_PHOTO_PREFIX = "ONFIDO_POA_IMG_";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u001b\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001e`\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$Companion;", "", "()V", "CONFIRMATION_VIEW_ANIM_DELAY", "", "DOCUMENT_PREFIX", "", "DOC_POA_PHOTO_PREFIX", "DUTCH_ID_MRZ_REQUIRED_FIELDS", "", "Lcom/onfido/android/sdk/capture/validation/MRZDataType;", "FACE_DETECTION_SAMPLING_PERIOD_MS", "FACE_DETECTION_TIMEOUT_MS", "FACE_TRACKING_TIMEOUT_MS", "FAILURE_RECORDING_INCREASE_IN_MS", "JPEG_EXTENSION", "MANUAL_FALLBACK_DELAY_MS", "MAXIMUM_RECORDING_DURATION_IN_MS", "MRZ_IS_NOT_READABLE", "MRZ_IS_READABLE", "NFC_LOGGER", "OVERLAY_DELAY_MS", "PASSPORT_MRZ_REQUIRED_FIELDS", "PASSPORT_OVERLAY_DELAY_MS", "POA_DEBUG", "SELFIE_PREFIX", "VIDEO_RECORDING_SIZE_CHECK_INTERVAL_MS", "hasRequiredFields", "", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/validation/MRZData;", "Lkotlin/collections/HashMap;", "requiredFields", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean hasRequiredFields(HashMap<MRZDataType, MRZData> map, List<? extends MRZDataType> list) {
            return map.keySet().containsAll(list);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$State;", "Landroid/os/Parcelable;", "numValidationErrors", "", "numOfTakenPictures", "documentProcessingFailureCounts", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingFailureCounts;", "(IILcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingFailureCounts;)V", "getDocumentProcessingFailureCounts", "()Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingFailureCounts;", "getNumOfTakenPictures", "()I", "getNumValidationErrors", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class State implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        @NotNull
        private final DocumentProcessingFailureCounts documentProcessingFailureCounts;
        private final int numOfTakenPictures;
        private final int numValidationErrors;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<State> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final State createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new State(parcel.readInt(), parcel.readInt(), DocumentProcessingFailureCounts.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final State[] newArray(int i) {
                return new State[i];
            }
        }

        public State(int i, int i2, @NotNull DocumentProcessingFailureCounts documentProcessingFailureCounts) {
            Intrinsics.checkNotNullParameter(documentProcessingFailureCounts, "documentProcessingFailureCounts");
            this.numValidationErrors = i;
            this.numOfTakenPictures = i2;
            this.documentProcessingFailureCounts = documentProcessingFailureCounts;
        }

        public static /* synthetic */ State copy$default(State state, int i, int i2, DocumentProcessingFailureCounts documentProcessingFailureCounts, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = state.numValidationErrors;
            }
            if ((i3 & 2) != 0) {
                i2 = state.numOfTakenPictures;
            }
            if ((i3 & 4) != 0) {
                documentProcessingFailureCounts = state.documentProcessingFailureCounts;
            }
            return state.copy(i, i2, documentProcessingFailureCounts);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getNumValidationErrors() {
            return this.numValidationErrors;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getNumOfTakenPictures() {
            return this.numOfTakenPictures;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final DocumentProcessingFailureCounts getDocumentProcessingFailureCounts() {
            return this.documentProcessingFailureCounts;
        }

        @NotNull
        public final State copy(int numValidationErrors, int numOfTakenPictures, @NotNull DocumentProcessingFailureCounts documentProcessingFailureCounts) {
            Intrinsics.checkNotNullParameter(documentProcessingFailureCounts, "documentProcessingFailureCounts");
            return new State(numValidationErrors, numOfTakenPictures, documentProcessingFailureCounts);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.numValidationErrors == state.numValidationErrors && this.numOfTakenPictures == state.numOfTakenPictures && Intrinsics.f(this.documentProcessingFailureCounts, state.documentProcessingFailureCounts);
        }

        @NotNull
        public final DocumentProcessingFailureCounts getDocumentProcessingFailureCounts() {
            return this.documentProcessingFailureCounts;
        }

        public final int getNumOfTakenPictures() {
            return this.numOfTakenPictures;
        }

        public final int getNumValidationErrors() {
            return this.numValidationErrors;
        }

        public int hashCode() {
            return this.documentProcessingFailureCounts.hashCode() + j6.a.b(this.numOfTakenPictures, Integer.hashCode(this.numValidationErrors) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "State(numValidationErrors=" + this.numValidationErrors + ", numOfTakenPictures=" + this.numOfTakenPictures + ", documentProcessingFailureCounts=" + this.documentProcessingFailureCounts + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.numValidationErrors);
            parcel.writeInt(this.numOfTakenPictures);
            this.documentProcessingFailureCounts.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J9\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u001e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u0004J\u000f\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0004J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0002H&¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010+\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010\u0004J\u000f\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010\u0004J\u000f\u0010.\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010/\u001a\u00020\u0002H&¢\u0006\u0004\b/\u0010\u0004J\u000f\u00100\u001a\u00020\u0002H&¢\u0006\u0004\b0\u0010\u0004J\u000f\u00101\u001a\u00020\u0002H&¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\u0002H&¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\u0002H&¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\u0002H&¢\u0006\u0004\b4\u0010\u0004J\u0017\u00107\u001a\u00020\u00022\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0019H&¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0019H&¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0002H&¢\u0006\u0004\b=\u0010\u0004J\u000f\u0010>\u001a\u00020\u0002H&¢\u0006\u0004\b>\u0010\u0004J\u0017\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0019H&¢\u0006\u0004\b@\u0010;J\u000f\u0010A\u001a\u00020\u0002H&¢\u0006\u0004\bA\u0010\u0004J\u000f\u0010B\u001a\u00020\u0002H&¢\u0006\u0004\bB\u0010\u0004J\u000f\u0010C\u001a\u00020\u0002H&¢\u0006\u0004\bC\u0010\u0004J\u000f\u0010D\u001a\u00020\u0002H&¢\u0006\u0004\bD\u0010\u0004J\u0017\u0010G\u001a\u00020\u00022\u0006\u0010F\u001a\u00020EH&¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H&¢\u0006\u0004\bJ\u0010;J\u000f\u0010K\u001a\u00020\u0002H&¢\u0006\u0004\bK\u0010\u0004J\u000f\u0010L\u001a\u00020\u0002H&¢\u0006\u0004\bL\u0010\u0004J\u000f\u0010M\u001a\u00020\u0019H&¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\u00022\u0006\u0010P\u001a\u00020OH&¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0002H&¢\u0006\u0004\bS\u0010\u0004J\u000f\u0010T\u001a\u00020\u0002H&¢\u0006\u0004\bT\u0010\u0004J\u001f\u0010X\u001a\u00020\u00022\u0006\u0010U\u001a\u00020\f2\u0006\u0010W\u001a\u00020VH&¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00022\u0006\u0010[\u001a\u00020ZH&¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0002H&¢\u0006\u0004\b^\u0010\u0004J\u000f\u0010_\u001a\u00020\u0002H&¢\u0006\u0004\b_\u0010\u0004J9\u0010f\u001a\u00020\u00022\b\b\u0001\u0010a\u001a\u00020`2\b\b\u0001\u0010b\u001a\u00020`2\u0014\b\u0002\u0010e\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00020cH&¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0002H&¢\u0006\u0004\bh\u0010\u0004J'\u0010i\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\bi\u0010jJ'\u0010k\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\u00022\u0006\u0010m\u001a\u00020\u0019H&¢\u0006\u0004\bn\u0010;J\u0017\u0010q\u001a\u00020\u00022\u0006\u0010p\u001a\u00020oH&¢\u0006\u0004\bq\u0010rJ\u0017\u0010u\u001a\u00020\u00022\u0006\u0010t\u001a\u00020sH&¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0002H&¢\u0006\u0004\bw\u0010\u0004J\u000f\u0010m\u001a\u00020\u0002H&¢\u0006\u0004\bm\u0010\u0004J\u000f\u0010x\u001a\u00020\u0002H&¢\u0006\u0004\bx\u0010\u0004J\u000f\u0010y\u001a\u00020\u0002H&¢\u0006\u0004\by\u0010\u0004J\u0017\u0010|\u001a\u00020\u00022\u0006\u0010{\u001a\u00020zH&¢\u0006\u0004\b|\u0010}J&\u0010\u0080\u0001\u001a\u00020\u00022\b\b\u0001\u0010~\u001a\u00020`2\b\b\u0001\u0010\u007f\u001a\u00020`H&¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0013\u0010\u0083\u0001\u001a\u00030\u0082\u0001H&¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J$\u0010\u0087\u0001\u001a\u00020\u00022\u0006\u0010F\u001a\u00020E2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H&¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u00020\fH&¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0013\u0010\u008d\u0001\u001a\u00030\u008c\u0001H&¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001c\u0010\u0091\u0001\u001a\u00020\u00022\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H&¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u0093\u0001\u0010\u0004J\u0011\u0010\u0094\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u0094\u0001\u0010\u0004J\u0011\u0010\u0095\u0001\u001a\u00020\u0002H&¢\u0006\u0005\b\u0095\u0001\u0010\u0004R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¡\u0001\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R$\u0010§\u0001\u001a\u0005\u0018\u00010¢\u00018&@&X¦\u000e¢\u0006\u0010\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0016\u0010¬\u0001\u001a\u00020\u00198&X¦\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010NR\u001a\u0010°\u0001\u001a\u0005\u0018\u00010\u00ad\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001¨\u0006±\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/CapturePresenter$View;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "", "onImageProcessingFinished", "()V", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;", "livenessChallengeViewModel", "onNextChallenge", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeViewModel;)V", "onChallengesCompleted", "hideDocumentOverlay", "onManualFallbackDelayFinished", "", "documentId", "videoPath", "Lcom/onfido/api/client/data/DocSide;", "docSide", "Lcom/onfido/android/sdk/capture/DocumentType;", "docType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "issuingCountry", "uploadVideo", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "errorType", "", "nfcSupported", "documentVideoId", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcProperties", "onWarningBinaryResult", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ErrorType;ZLjava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "onStorageThresholdReached", "setupUploadService", "setOverlay", "destroyWithCanceledResult", "Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;", "faceDetectionResult", "onFaceDetected", "(Lcom/onfido/android/sdk/capture/detector/face/FaceDetectionResult;)V", "onFaceTrackingTimeout", "onFaceDetectionTimeout", "hideLivenessControlButton", "showLivenessButtonAndFocusWithDelay", "removeDummyViewsAccessibility", "makeToolbarTitleNotImportantForAccessibility", "deactivateCaptureButton", "displayCaptureButton", "hideCaptureButton", "setupCaptureButton", "setupConfirmationButtons", "setGlareWarningContent", "showDocumentFormatDialog", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "descriptor", "showError", "(Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;)V", "isGenericMessage", "setConfirmationButtons", "(Z)V", "setWarningConfirmationButtons", "setForceRetryButton", "startDocumentVideoRecording", "isStartedManually", "startLivenessVideoRecording", "showVideoRecordingProgressBar", "hideVideoRecordingProgressBar", "onDocumentVideoRecordingCompleted", "showVideoRecordCompletionTick", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "applyValidations", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "isEnabled", "enableTorch", "stopCamera", "startCamera", "hasValidRecording", "()Z", "", "jpegData", "uploadImage", "([B)V", "showConfirmationStep", "openCaptureScreen", "dirPath", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;", "performedChallanges", "showFaceLivenessConfirmationScreen", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessPerformedChallenges;)V", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "dialogMode", "showDialog", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "hideLoading", "cancelFlow", "", "titleResId", "messageResId", "Lkotlin/Function1;", "Landroid/content/DialogInterface;", "listener", "showErrorMessage", "(IILkotlin/jvm/functions/Function1;)V", "restart", "onNfcPropertiesFetched", "(Ljava/lang/String;Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "onDocumentCreated", "(Ljava/lang/String;Ljava/lang/String;Z)V", "playSingleFrameAutoCapturedAnimation", "capture", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;", "content", "setLiveValidationBubbleContent", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;)V", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "command", "setLiveValidationBubbleVisibilityCommand", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;)V", "resetDocumentRecordingState", "showConfirmationPreview", "onFaceOutTimeout", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "result", "onAccessibleCaptureRectangleDetectionResult", "(Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;)V", "mainTextResId", "mainTextContentDescriptionResId", "onAccessibleCaptureDocumentOverlayTextChanged", "(II)V", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "getCaptureStepDataBundle", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "Landroid/graphics/RectF;", "visibleRect", "onCaptureForProofOfAddressDone", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;Landroid/graphics/RectF;)V", "fileName", "onPoaImageCroppedAndSavedToFile", "(Ljava/lang/String;)V", "Ljava/io/File;", "getCapturedFilesDir", "()Ljava/io/File;", "Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;", "destination", "trackNavigationCompleted", "(Lcom/onfido/android/sdk/capture/internal/performance/domain/PerformanceAnalyticsScreen;)V", "showVideoRecordingInProgressMessage", "showVideoRecordingCompleteMessage", "finishWithResultExitUserFlow", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "getCaptureType", "()Lcom/onfido/android/sdk/capture/ui/CaptureType;", "captureType", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "getDocSide", "()Lcom/onfido/api/client/data/DocSide;", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "getDocumentFormat", "()Lcom/onfido/android/sdk/capture/DocumentFormat;", "setDocumentFormat", "(Lcom/onfido/android/sdk/capture/DocumentFormat;)V", "documentFormat", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "getScreenOrientation", "()Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "screenOrientation", "isOnConfirmationStep", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "getGenericDocPages", "()Lcom/onfido/android/sdk/capture/document/DocumentPages;", "genericDocPages", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View extends CaptureUploadServiceListener {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onDocumentVideoUploaded(@NotNull View view, @NotNull String documentVideoId) {
                Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
                CaptureUploadServiceListener.DefaultImpls.onDocumentVideoUploaded(view, documentVideoId);
            }

            public static void onLivePhotoUploaded(@NotNull View view, @NotNull LivePhotoUpload photoUpload) {
                Intrinsics.checkNotNullParameter(photoUpload, "photoUpload");
                CaptureUploadServiceListener.DefaultImpls.onLivePhotoUploaded(view, photoUpload);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ void showErrorMessage$default(View view, int i, int i2, Function1 function1, int i3, Object obj2) {
                if (obj2 != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorMessage");
                }
                if ((i3 & 4) != 0) {
                    function1 = CapturePresenter$View$showErrorMessage$1.INSTANCE;
                }
                view.showErrorMessage(i, i2, function1);
            }
        }

        void applyValidations(@NotNull OnfidoImage image);

        void cancelFlow();

        void capture(boolean playSingleFrameAutoCapturedAnimation);

        void deactivateCaptureButton();

        void destroyWithCanceledResult();

        void displayCaptureButton();

        void enableTorch(boolean isEnabled);

        void finishWithResultExitUserFlow();

        @NotNull
        CaptureStepDataBundle getCaptureStepDataBundle();

        @NotNull
        CaptureType getCaptureType();

        @NotNull
        File getCapturedFilesDir();

        CountryCode getCountryCode();

        @NotNull
        DocSide getDocSide();

        DocumentFormat getDocumentFormat();

        DocumentType getDocumentType();

        DocumentPages getGenericDocPages();

        @NotNull
        Orientation getScreenOrientation();

        boolean hasValidRecording();

        void hideCaptureButton();

        void hideDocumentOverlay();

        void hideLivenessControlButton();

        void hideLoading();

        void hideVideoRecordingProgressBar();

        /* JADX INFO: renamed from: isOnConfirmationStep */
        boolean getIsOnConfirmationStep();

        void makeToolbarTitleNotImportantForAccessibility();

        void onAccessibleCaptureDocumentOverlayTextChanged(int mainTextResId, int mainTextContentDescriptionResId);

        void onAccessibleCaptureRectangleDetectionResult(@NotNull RectDetectionResult result);

        void onCaptureForProofOfAddressDone(@NotNull OnfidoImage image, @NotNull RectF visibleRect);

        void onChallengesCompleted();

        void onDocumentCreated(@NotNull String documentId, @NotNull String documentVideoId, boolean nfcSupported);

        void onDocumentVideoRecordingCompleted();

        void onFaceDetected(@NotNull FaceDetectionResult faceDetectionResult);

        void onFaceDetectionTimeout();

        void onFaceOutTimeout();

        void onFaceTrackingTimeout();

        void onImageProcessingFinished();

        void onManualFallbackDelayFinished();

        void onNextChallenge(@NotNull LivenessChallengeViewModel livenessChallengeViewModel);

        void onNfcPropertiesFetched(@NotNull String documentId, @NotNull String documentVideoId, @NotNull NfcProperties nfcProperties);

        void onPoaImageCroppedAndSavedToFile(@NotNull String fileName);

        void onStorageThresholdReached();

        void onWarningBinaryResult(@NotNull String documentId, @NotNull ErrorType errorType, boolean nfcSupported, @NotNull String documentVideoId, NfcProperties nfcProperties);

        void openCaptureScreen();

        void playSingleFrameAutoCapturedAnimation();

        void removeDummyViewsAccessibility();

        void resetDocumentRecordingState();

        void restart();

        void setConfirmationButtons(boolean isGenericMessage);

        void setDocumentFormat(DocumentFormat documentFormat);

        void setForceRetryButton();

        void setGlareWarningContent();

        void setLiveValidationBubbleContent(@NotNull OnfidoCaptureValidationBubble.Content content);

        void setLiveValidationBubbleVisibilityCommand(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand command);

        void setOverlay();

        void setWarningConfirmationButtons(boolean isGenericMessage);

        void setupCaptureButton();

        void setupConfirmationButtons();

        void setupUploadService();

        void showConfirmationPreview();

        void showConfirmationStep();

        void showDialog(@NotNull LoadingFragment.Companion.DialogMode dialogMode);

        void showDocumentFormatDialog();

        void showError(@NotNull ErrorDescriptor descriptor);

        void showErrorMessage(int titleResId, int messageResId, @NotNull Function1<? super DialogInterface, Unit> listener);

        void showFaceLivenessConfirmationScreen(@NotNull String dirPath, @NotNull LivenessPerformedChallenges performedChallanges);

        void showLivenessButtonAndFocusWithDelay();

        void showVideoRecordCompletionTick();

        void showVideoRecordingCompleteMessage();

        void showVideoRecordingInProgressMessage();

        void showVideoRecordingProgressBar();

        void startCamera();

        void startDocumentVideoRecording();

        void startLivenessVideoRecording(boolean isStartedManually);

        void stopCamera();

        void trackNavigationCompleted(@NotNull PerformanceAnalyticsScreen destination);

        void uploadImage(@NotNull byte[] jpegData);

        void uploadVideo(@NotNull String documentId, @NotNull String videoPath, @NotNull DocSide docSide, @NotNull DocumentType docType, CountryCode issuingCountry);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$observeAutoCapture$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.camera.CapturePresenter$observeAutoCapture$1", f = "CapturePresenter.kt", l = {392}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;", "result"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20411 extends i implements Function3 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C20411(Continuation<? super C20411> continuation) {
            super(3, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            DocumentValidationResult documentValidationResult;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                DocumentValidationResult documentValidationResult2 = (DocumentValidationResult) this.L$1;
                this.L$0 = documentValidationResult2;
                this.label = 1;
                if (flowCollector.emit(documentValidationResult2, this) == aVar) {
                    return aVar;
                }
                documentValidationResult = documentValidationResult2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                documentValidationResult = (DocumentValidationResult) this.L$0;
                o.b(obj2);
            }
            return Boolean.valueOf(!Intrinsics.f(documentValidationResult, DocumentValidationResult.Success.INSTANCE));
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull DocumentValidationResult documentValidationResult, Continuation<? super Boolean> continuation) {
            C20411 c20411 = new C20411(continuation);
            c20411.L$0 = flowCollector;
            c20411.L$1 = documentValidationResult;
            return c20411.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$observeAutoCapture$2, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.camera.CapturePresenter$observeAutoCapture$2", f = "CapturePresenter.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20422 extends i implements Function2<DocumentValidationResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C20422(Continuation<? super C20422> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            C20422 c20422 = CapturePresenter.this.new C20422(continuation);
            c20422.L$0 = obj2;
            return c20422;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull DocumentValidationResult documentValidationResult, Continuation<? super Unit> continuation) {
            return ((C20422) create(documentValidationResult, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            DocumentValidationResult documentValidationResult = (DocumentValidationResult) this.L$0;
            if (Intrinsics.f(documentValidationResult, DocumentValidationResult.Success.INSTANCE)) {
                View view = CapturePresenter.this.view;
                if (view == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view.setLiveValidationBubbleVisibilityCommand(OnfidoCaptureValidationBubble.VisibilityCommand.Gone.INSTANCE);
                View view2 = CapturePresenter.this.view;
                if (view2 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view2.capture(!CapturePresenter.this.onfidoRemoteConfig.isMultiImageCaptureEnabled());
            } else {
                OnfidoCaptureValidationBubble.Content contentInvoke = CapturePresenter.this.documentValidaMapper.invoke(documentValidationResult);
                if (contentInvoke != null) {
                    View view3 = CapturePresenter.this.view;
                    if (view3 == null) {
                        Intrinsics.r("view");
                        throw null;
                    }
                    view3.setLiveValidationBubbleContent(contentInvoke);
                }
                View view4 = CapturePresenter.this.view;
                if (view4 == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view4.setLiveValidationBubbleVisibilityCommand(new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(true)));
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$processFrameForMRZ$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.camera.CapturePresenter", f = "CapturePresenter.kt", l = {1193}, m = "processFrameForMRZ")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20431 extends gim.c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C20431(Continuation<? super C20431> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return CapturePresenter.this.processFrameForMRZ(null, this);
        }
    }

    static {
        MRZDataType mRZDataType = MRZDataType.DATE_OF_BIRTH;
        MRZDataType mRZDataType2 = MRZDataType.EXPIRY_DATE;
        PASSPORT_MRZ_REQUIRED_FIELDS = v.k(MRZDataType.PASSPORT_NUMBER, mRZDataType, mRZDataType2);
        DUTCH_ID_MRZ_REQUIRED_FIELDS = v.k(MRZDataType.DOCUMENT_NUMBER, MRZDataType.PERSONAL_NUMBER, mRZDataType, mRZDataType2);
    }

    public CapturePresenter(@NotNull NativeDetector nativeDetector, @NotNull RectangleDetector rectangleDetector, @NotNull AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase, @NotNull LivenessInteractor livenessInteractor, @NotNull BackendDocumentValidationsManager backendDocumentValidationsManager, @NotNull DocumentProcessingUseCase documentProcessingUseCase, @NotNull PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager, @NotNull RuntimePermissionsManager permissionsManager, @NotNull FaceDetector faceDetector, @NotNull IdentityInteractor identityInteractor, @NotNull DocumentConfigurationManager documentConfigurationManager, @NotNull TimeProvider timeProvider, @NotNull SdkUploadMetadataHelper sdkUploadMetaDataHelper, @NotNull DocumentService documentService, @NotNull NfcPropertiesService nfcPropertiesService, @NotNull NfcInteractor nfcInteractor, @NotNull DocumentCaptureDelayTransformer documentDelayTransformer, @NotNull SchedulersProvider schedulersProvider, @NotNull FaceProcessingUseCase faceProcessingUseCase, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull AnnouncementService announcementService, @NotNull DocumentProcessingResultsFailureAnalyzer documentProcessingFailureAnalyzer, @NotNull RetainableValidationsResult retainableValidationsResult, @NotNull BarcodeValidationSuspender barcodeValidationSuspender, @NotNull ImageUtils imageUtils, @NotNull CaptureTracker captureTracker, @NotNull NfcTracker nfcTracker, @NotNull LivenessTracker livenessTracker, @NotNull WaitingScreenTracker waitingScreenTracker, @NotNull FlowTracker flowTracker, @MediaCallbackResultReceiver ResultReceiver resultReceiver, @NotNull MRZDocumentExtractor mrzDocumentExtractor, @NotNull DocumentValidationUseCase documentValidationUseCase, @NotNull DispatchersProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(nativeDetector, "nativeDetector");
        Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
        Intrinsics.checkNotNullParameter(accessibleDocumentCaptureUseCase, "accessibleDocumentCaptureUseCase");
        Intrinsics.checkNotNullParameter(livenessInteractor, "livenessInteractor");
        Intrinsics.checkNotNullParameter(backendDocumentValidationsManager, "backendDocumentValidationsManager");
        Intrinsics.checkNotNullParameter(documentProcessingUseCase, "documentProcessingUseCase");
        Intrinsics.checkNotNullParameter(postCaptureDocumentValidationsManager, "postCaptureDocumentValidationsManager");
        Intrinsics.checkNotNullParameter(permissionsManager, "permissionsManager");
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(sdkUploadMetaDataHelper, "sdkUploadMetaDataHelper");
        Intrinsics.checkNotNullParameter(documentService, "documentService");
        Intrinsics.checkNotNullParameter(nfcPropertiesService, "nfcPropertiesService");
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(documentDelayTransformer, "documentDelayTransformer");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(faceProcessingUseCase, "faceProcessingUseCase");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(documentProcessingFailureAnalyzer, "documentProcessingFailureAnalyzer");
        Intrinsics.checkNotNullParameter(retainableValidationsResult, "retainableValidationsResult");
        Intrinsics.checkNotNullParameter(barcodeValidationSuspender, "barcodeValidationSuspender");
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(captureTracker, "captureTracker");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        Intrinsics.checkNotNullParameter(livenessTracker, "livenessTracker");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        Intrinsics.checkNotNullParameter(flowTracker, "flowTracker");
        Intrinsics.checkNotNullParameter(mrzDocumentExtractor, "mrzDocumentExtractor");
        Intrinsics.checkNotNullParameter(documentValidationUseCase, "documentValidationUseCase");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        this.nativeDetector = nativeDetector;
        this.rectangleDetector = rectangleDetector;
        this.accessibleDocumentCaptureUseCase = accessibleDocumentCaptureUseCase;
        this.livenessInteractor = livenessInteractor;
        this.backendDocumentValidationsManager = backendDocumentValidationsManager;
        this.documentProcessingUseCase = documentProcessingUseCase;
        this.postCaptureDocumentValidationsManager = postCaptureDocumentValidationsManager;
        this.permissionsManager = permissionsManager;
        this.faceDetector = faceDetector;
        this.identityInteractor = identityInteractor;
        this.documentConfigurationManager = documentConfigurationManager;
        this.timeProvider = timeProvider;
        this.sdkUploadMetaDataHelper = sdkUploadMetaDataHelper;
        this.documentService = documentService;
        this.nfcPropertiesService = nfcPropertiesService;
        this.nfcInteractor = nfcInteractor;
        this.documentDelayTransformer = documentDelayTransformer;
        this.schedulersProvider = schedulersProvider;
        this.faceProcessingUseCase = faceProcessingUseCase;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.announcementService = announcementService;
        this.documentProcessingFailureAnalyzer = documentProcessingFailureAnalyzer;
        this.retainableValidationsResult = retainableValidationsResult;
        this.barcodeValidationSuspender = barcodeValidationSuspender;
        this.imageUtils = imageUtils;
        this.captureTracker = captureTracker;
        this.nfcTracker = nfcTracker;
        this.livenessTracker = livenessTracker;
        this.waitingScreenTracker = waitingScreenTracker;
        this.flowTracker = flowTracker;
        this.mediaCallback = resultReceiver;
        this.mrzDocumentExtractor = mrzDocumentExtractor;
        this.documentValidationUseCase = documentValidationUseCase;
        this.processingResults = new DocumentProcessingResults(null, null, null, null, null, null, 63, null);
        this.poaCaptureSessionId = j.b(new CapturePresenter$poaCaptureSessionId$2(this));
        this.compositeSubscription = j.b(CapturePresenter$compositeSubscription$2.INSTANCE);
        this.faceDetectionCompositeDisposable = j.b(CapturePresenter$faceDetectionCompositeDisposable$2.INSTANCE);
        this.faceTrackingCompositeDisposable = j.b(CapturePresenter$faceTrackingCompositeDisposable$2.INSTANCE);
        this.movementChallengeCompositeDisposable = j.b(CapturePresenter$movementChallengeCompositeDisposable$2.INSTANCE);
        this.autocaptureCompositeDisposable = j.b(CapturePresenter$autocaptureCompositeDisposable$2.INSTANCE);
        this.mrzExtractionResultMap = new HashMap<>();
        this.iqsUploadParser = new IQSUploadErrorParser();
        this.documentVideoRecordingCompositeDisposable = j.b(CapturePresenter$documentVideoRecordingCompositeDisposable$2.INSTANCE);
        this.presenterScope = e0.c(kotlin.coroutines.e.d(e0.e(), dispatchersProvider.getMain()));
        this.documentValidaMapper = new DocumentValidationResultMapper();
        this.documentVideoId = "";
        BehaviorSubject behaviorSubjectC = BehaviorSubject.c();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectC, "create(...)");
        this.overlayMetricsBehaviorSubject = behaviorSubjectC;
        BehaviorSubject behaviorSubjectC2 = BehaviorSubject.c();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectC2, "create(...)");
        this.documentFrameBehaviorSubject = behaviorSubjectC2;
    }

    public static /* synthetic */ void applyPostCaptureValidations$onfido_capture_sdk_core_release$default(CapturePresenter capturePresenter, DocumentDetectionFrame documentDetectionFrame, DocumentType documentType, DocSide docSide, CountryCode countryCode, int i, Object obj2) {
        if ((i & 4) != 0) {
            docSide = DocSide.FRONT;
        }
        if ((i & 8) != 0) {
            countryCode = null;
        }
        capturePresenter.applyPostCaptureValidations$onfido_capture_sdk_core_release(documentDetectionFrame, documentType, docSide, countryCode);
    }

    private final void applyValidations() {
        OnfidoImage onfidoImage = this.capturedImage;
        if (onfidoImage == null) {
            return;
        }
        View view = this.view;
        if (view != null) {
            view.applyValidations(onfidoImage);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void applyValidationsAfterAnimationDelay(long animationDelay) {
        OnfidoImage onfidoImage = this.capturedImage;
        if (onfidoImage == null) {
            return;
        }
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler timer = this.schedulersProvider.getTimer();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(timer, "scheduler is null");
        g gVarH = new p(animationDelay, timer).j(this.schedulersProvider.getTimer()).g(this.schedulersProvider.getUi()).h(kgm.j.e, new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(this, onfidoImage, 4));
        Intrinsics.checkNotNullExpressionValue(gVarH, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, gVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyValidationsAfterAnimationDelay$lambda$14(CapturePresenter this$0, OnfidoImage capturedImage) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(capturedImage, "$capturedImage");
        View view = this$0.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.stopCamera();
        if (!this$0.isProofOfAddress) {
            this$0.applyValidations();
            return;
        }
        View view2 = this$0.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        RectF rectF = this$0.visibleRect;
        if (rectF != null) {
            view2.onCaptureForProofOfAddressDone(capturedImage, rectF);
        } else {
            Intrinsics.r("visibleRect");
            throw null;
        }
    }

    private final boolean backSideCaptureNeeded() {
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        DocumentType documentType = captureStepDataBundle.getDocumentType();
        if (documentType == null) {
            return false;
        }
        DocumentConfigurationManager documentConfigurationManager = this.documentConfigurationManager;
        CaptureStepDataBundle captureStepDataBundle2 = this.captureStepDataBundle;
        if (captureStepDataBundle2 != null) {
            return DocumentConfigurationManager.backSideCaptureNeeded$default(documentConfigurationManager, documentType, captureStepDataBundle2.getGenericDocPages(), null, 4, null);
        }
        Intrinsics.r("captureStepDataBundle");
        throw null;
    }

    private final void checkDocumentFormat() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        boolean zIsFoldedFormatSupported$onfido_capture_sdk_core_release = DocumentUtils.INSTANCE.isFoldedFormatSupported$onfido_capture_sdk_core_release(view.getDocumentType(), view.getCountryCode());
        if (view.getDocumentFormat() == null) {
            if (zIsFoldedFormatSupported$onfido_capture_sdk_core_release) {
                view.showDocumentFormatDialog();
                return;
            } else {
                view.setDocumentFormat(DocumentFormat.CARD);
                return;
            }
        }
        if (zIsFoldedFormatSupported$onfido_capture_sdk_core_release && DocumentFormat.FOLDED == view.getDocumentFormat()) {
            startOverlayDisplayTimer$onfido_capture_sdk_core_release();
        }
    }

    private final void checkUploadBinaryResult(UploadBinaryResult uploadBinaryResult) {
        if (uploadBinaryResult instanceof UploadBinaryResult.BinaryUploaded) {
            Timber.INSTANCE.i("NFC Logger - Binary uploaded", new Object[0]);
            UploadBinaryResult.BinaryUploaded binaryUploaded = (UploadBinaryResult.BinaryUploaded) uploadBinaryResult;
            if (binaryUploaded.getWarning() != null) {
                showWarningBinaryResult$default(this, binaryUploaded.getDocumentId(), binaryUploaded.getWarning(), binaryUploaded.getDocumentNfcSupported(), binaryUploaded.getWarningsBundle(), null, 16, null);
                return;
            }
            View view = this.view;
            if (view != null) {
                view.onDocumentCreated(binaryUploaded.getDocumentId(), this.documentVideoId, binaryUploaded.getDocumentNfcSupported());
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (!(uploadBinaryResult instanceof UploadBinaryResult.NfcPropertiesFetched)) {
            if (uploadBinaryResult instanceof UploadBinaryResult.Error) {
                Timber.Companion forest = Timber.INSTANCE;
                StringBuilder sb6 = new StringBuilder("NFC Logger - UploadBinaryResult Error: ");
                UploadBinaryResult.Error error = (UploadBinaryResult.Error) uploadBinaryResult;
                sb6.append(error.getThrowable().getMessage());
                forest.e(sb6.toString(), new Object[0]);
                onError(error.getThrowable());
                return;
            }
            return;
        }
        Timber.INSTANCE.i("NFC Logger - Nfc properties fetched", new Object[0]);
        UploadBinaryResult.NfcPropertiesFetched nfcPropertiesFetched = (UploadBinaryResult.NfcPropertiesFetched) uploadBinaryResult;
        if (nfcPropertiesFetched.getWarning() != null) {
            showWarningBinaryResult(nfcPropertiesFetched.getDocumentId(), nfcPropertiesFetched.getWarning(), true, nfcPropertiesFetched.getWarningsBundle(), nfcPropertiesFetched.getNfcProperties());
            return;
        }
        View view2 = this.view;
        if (view2 != null) {
            view2.onNfcPropertiesFetched(nfcPropertiesFetched.getDocumentId(), this.documentVideoId, nfcPropertiesFetched.getNfcProperties());
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void checkUploading() {
        UploadBinaryResult uploadBinaryResult = this.uploadBinaryResult;
        if (uploadBinaryResult != null) {
            checkUploadBinaryResult(uploadBinaryResult);
        }
    }

    private final void disposeAutocaptureSubscriptions() {
        getAutocaptureCompositeDisposable().d();
        this.edgeDetectionFallbackTimerDisposable = null;
    }

    private final void disposeFaceDetectionSubscriptions() {
        getFaceDetectionCompositeDisposable().d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean edgeDetectionTimeoutNotStarted() {
        return this.edgeDetectionFallbackTimerDisposable == null;
    }

    private final void enableAccessibilityCapture(final DocumentType documentType, DocSide docSide) {
        RectangleDetector rectangleDetector = this.rectangleDetector;
        Observable observableHide = this.overlayMetricsBehaviorSubject.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable observableHide2 = this.documentFrameBehaviorSubject.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        Observable observableShare = rectangleDetector.observeRectDetection(observableHide, observableHide2, documentType != DocumentType.PASSPORT && docSide == DocSide.FRONT).map(new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$enableAccessibilityCapture$rectDetectionObservable$1
            @Override // igm.o
            @NotNull
            public final RectDetectionResult apply(@NotNull RectDetectionResult rectDetectionResult) {
                Intrinsics.checkNotNullParameter(rectDetectionResult, "rectDetectionResult");
                if (!(rectDetectionResult instanceof RectDetectionResult.RectDetected)) {
                    return rectDetectionResult;
                }
                RectDetectionResult.RectDetected rectDetected = (RectDetectionResult.RectDetected) rectDetectionResult;
                return RectDetectionResult.RectDetected.copy$default(rectDetected, ImageUtilsExtKt.trimDocument(rectDetected.getRect(), documentType), null, null, 6, null);
            }
        }).share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableSubscribe = observableShare.subscribeOn(this.schedulersProvider.getComputation()).observeOn(this.schedulersProvider.getUi()).doOnDispose(new c(this, 3)).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.enableAccessibilityCapture.2
            @Override // igm.g
            public final void accept(@NotNull RectDetectionResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                View view = CapturePresenter.this.view;
                if (view != null) {
                    view.onAccessibleCaptureRectangleDetectionResult(result);
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
        CompositeDisposable compositeSubscription2 = getCompositeSubscription();
        Disposable disposableSubscribe2 = this.accessibleDocumentCaptureUseCase.observeAccessibilityCapture$onfido_capture_sdk_core_release(observableShare).doOnDispose(new c(this, 4)).subscribeOn(this.schedulersProvider.getComputation()).observeOn(this.schedulersProvider.getUi()).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.enableAccessibilityCapture.4
            @Override // igm.g
            public final void accept(@NotNull AccessibleDocumentCaptureUseCaseResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof AccessibleDocumentCaptureUseCaseResult.AutoCaptured) {
                    View view = CapturePresenter.this.view;
                    if (view != null) {
                        view.capture(!CapturePresenter.this.onfidoRemoteConfig.isMultiImageCaptureEnabled());
                        return;
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }
                if (result instanceof AccessibleDocumentCaptureUseCaseResult.DocumentPositionChanged) {
                    View view2 = CapturePresenter.this.view;
                    if (view2 == null) {
                        Intrinsics.r("view");
                        throw null;
                    }
                    AccessibleDocumentCaptureUseCaseResult.DocumentPositionChanged documentPositionChanged = (AccessibleDocumentCaptureUseCaseResult.DocumentPositionChanged) result;
                    view2.onAccessibleCaptureDocumentOverlayTextChanged(documentPositionChanged.getMainTextResId(), documentPositionChanged.getContentDescriptionResId());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription2, disposableSubscribe2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableAccessibilityCapture$lambda$3(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.onAccessibleCaptureRectangleDetectionResult(RectDetectionResult.NoRectDetected.INSTANCE);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableAccessibilityCapture$lambda$4(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.onAccessibleCaptureRectangleDetectionResult(RectDetectionResult.NoRectDetected.INSTANCE);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final CompositeDisposable getAutocaptureCompositeDisposable() {
        return (CompositeDisposable) this.autocaptureCompositeDisposable.getValue();
    }

    private final int getCaptureErrorMessage() {
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            return R.string.onfido_generic_error_doc_capture;
        }
        if (i == 2) {
            return R.string.onfido_generic_error_face_capture;
        }
        if (i == 3) {
            return R.string.onfido_generic_error_video_capture;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final CaptureType getCaptureType() {
        View view = this.view;
        if (view != null) {
            return view.getCaptureType();
        }
        Intrinsics.r("view");
        throw null;
    }

    private final CompositeDisposable getCompositeSubscription() {
        return (CompositeDisposable) this.compositeSubscription.getValue();
    }

    private final DocumentFeatures getDocumentFeatures(NfcProperties nfcProperties, boolean hasNfc) {
        return new DocumentFeatures(hasNfc, nfcProperties.getHasCan(), nfcProperties.getHasPin(), nfcProperties.getCanLength(), nfcProperties.getPinLength());
    }

    public static /* synthetic */ DocumentFeatures getDocumentFeatures$default(CapturePresenter capturePresenter, NfcProperties nfcProperties, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return capturePresenter.getDocumentFeatures(nfcProperties, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> getDocumentIdsForDocumentResponse(String uploadedMediaId) {
        NfcArguments.CapturedNfcData capturedData;
        NfcArguments nfcArguments = this.nfcArguments;
        String[] elements = {(nfcArguments == null || (capturedData = nfcArguments.getCapturedData()) == null) ? null : capturedData.getFrontId$onfido_capture_sdk_core_release(), uploadedMediaId};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final CompositeDisposable getDocumentVideoRecordingCompositeDisposable() {
        return (CompositeDisposable) this.documentVideoRecordingCompositeDisposable.getValue();
    }

    public static /* synthetic */ void getExtractedMRZDocument$onfido_capture_sdk_core_release$annotations() {
    }

    private final CompositeDisposable getFaceDetectionCompositeDisposable() {
        return (CompositeDisposable) this.faceDetectionCompositeDisposable.getValue();
    }

    private final CompositeDisposable getFaceTrackingCompositeDisposable() {
        return (CompositeDisposable) this.faceTrackingCompositeDisposable.getValue();
    }

    private final Observable getImageProcessingObservable(DocumentType documentType, CountryCode countryCode, DocSide docSide, final boolean enableManualFallback) {
        Observable observableDoOnNext = this.documentProcessingUseCase.execute$onfido_capture_sdk_core_release(documentType, countryCode, docSide).doOnNext(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.getImageProcessingObservable.1
            @Override // igm.g
            public final void accept(@NotNull DocumentProcessingUseCaseResult documentProcessingUseCaseResult) {
                Intrinsics.checkNotNullParameter(documentProcessingUseCaseResult, "<name for destructuring parameter 0>");
                DocumentProcessingResults documentProcessingResultsComponent1 = documentProcessingUseCaseResult.getDocumentProcessingResults();
                if (enableManualFallback && this.edgeDetectionTimeoutNotStarted() && documentProcessingResultsComponent1.getEdgeDetectionResults().hasAny()) {
                    this.startManualFallbackTimer();
                }
            }
        });
        final C20402 c20402 = new h0() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.getImageProcessingObservable.2
            @Override // kotlin.jvm.internal.h0, wim.p
            public Object get(Object obj2) {
                return ((DocumentProcessingUseCaseResult) obj2).getDocumentProcessingResults();
            }
        };
        Observable map = observableDoOnNext.map(new igm.o(c20402) { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$sam$io_reactivex_rxjava3_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c20402, "function");
                this.function = c20402;
            }

            @Override // igm.o
            public final /* synthetic */ Object apply(Object obj2) {
                return this.function.invoke(obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static /* synthetic */ Observable getImageProcessingObservable$default(CapturePresenter capturePresenter, DocumentType documentType, CountryCode countryCode, DocSide docSide, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            countryCode = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return capturePresenter.getImageProcessingObservable(documentType, countryCode, docSide, z);
    }

    private final String[] getMissingPermissions(CaptureType captureType) {
        String[] strArr = captureType == CaptureType.VIDEO ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"};
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!this.permissionsManager.hasPermission(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final CompositeDisposable getMovementChallengeCompositeDisposable() {
        return (CompositeDisposable) this.movementChallengeCompositeDisposable.getValue();
    }

    private final PerformanceAnalyticsScreen getPerformanceTrackingScreen() {
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            return PerformanceAnalyticsScreen.DOCUMENT_CAPTURE;
        }
        if (i == 2) {
            return PerformanceAnalyticsScreen.FACE_SELFIE_CAPTURE;
        }
        if (i == 3) {
            return PerformanceAnalyticsScreen.FACE_VIDEO_CAPTURE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String getPoaCaptureName() {
        return v0.a.i(new StringBuilder("ONFIDO_POA_IMG_"), getPoaCaptureSessionId(), ".jpg");
    }

    private final String getPoaCaptureSessionId() {
        return (String) this.poaCaptureSessionId.getValue();
    }

    private final Single<String> getPoaFileNameAfterCropping(byte[] jpegData, DocumentDetectionFrame frame) {
        tgm.b bVar = new tgm.b(new k(this, 4, jpegData, frame), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPoaFileNameAfterCropping$lambda$28(CapturePresenter this$0, byte[] jpegData, DocumentDetectionFrame frame) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(jpegData, "$jpegData");
        Intrinsics.checkNotNullParameter(frame, "$frame");
        byte[] imageContent = this$0.imageUtils.cropImageForScreenShowOnly$onfido_capture_sdk_core_release(jpegData, frame).getImageContent();
        String poaCaptureName = this$0.getPoaCaptureName();
        View view = this$0.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        File file = new File(view.getCapturedFilesDir(), poaCaptureName);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file.getPath());
            fileOutputStream.write(imageContent);
            fileOutputStream.close();
        } catch (IOException e) {
            Timber.INSTANCE.e(e, "POA_Debug: Failed saving image", new Object[0]);
        }
        return file.getPath();
    }

    private final boolean hasNativeLibrary() {
        return this.nativeDetector.hasNativeLibrary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void imageSavedSuccessfully(String fileName) {
        View view = this.view;
        if (view != null) {
            view.onPoaImageCroppedAndSavedToFile(fileName);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final boolean isBackSideOfRomanianNationalId() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view.getDocSide() != DocSide.BACK) {
            return false;
        }
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view2.getCountryCode() != CountryCode.RO) {
            return false;
        }
        View view3 = this.view;
        if (view3 != null) {
            return view3.getDocumentType() == DocumentType.NATIONAL_IDENTITY_CARD;
        }
        Intrinsics.r("view");
        throw null;
    }

    private final boolean isCheckingImageQuality() {
        return isDocumentCapture() && shouldForceRetry() && this.onfidoRemoteConfig.isImageQualityServiceEnabled();
    }

    private final boolean isDocumentCapture() {
        return CaptureType.DOCUMENT == getCaptureType();
    }

    private final boolean isDocumentUploaded() {
        return this.uploadBinaryResult != null;
    }

    private final boolean isFinalStepForDocument() {
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        if (captureStepDataBundle.getDocSide() == DocSide.FRONT && !backSideCaptureNeeded()) {
            return true;
        }
        CaptureStepDataBundle captureStepDataBundle2 = this.captureStepDataBundle;
        if (captureStepDataBundle2 != null) {
            return captureStepDataBundle2.getDocSide() == DocSide.BACK;
        }
        Intrinsics.r("captureStepDataBundle");
        throw null;
    }

    private final boolean isMRZExtracted() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view.getDocumentType() == DocumentType.PASSPORT) {
            boolean zHasRequiredFields = INSTANCE.hasRequiredFields(this.mrzExtractionResultMap, PASSPORT_MRZ_REQUIRED_FIELDS);
            Timber.INSTANCE.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - MRZ detected [Passport] : ", zHasRequiredFields), new Object[0]);
            return zHasRequiredFields;
        }
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view2.getDocumentType() == DocumentType.NATIONAL_IDENTITY_CARD) {
            View view3 = this.view;
            if (view3 == null) {
                Intrinsics.r("view");
                throw null;
            }
            if (view3.getCountryCode() == CountryCode.NL) {
                boolean zHasRequiredFields2 = INSTANCE.hasRequiredFields(this.mrzExtractionResultMap, DUTCH_ID_MRZ_REQUIRED_FIELDS);
                Timber.INSTANCE.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - MRZ detected [Dutch ID] : ", zHasRequiredFields2), new Object[0]);
                return zHasRequiredFields2;
            }
        }
        Timber.INSTANCE.i("NFC Logger - MRZ not detected", new Object[0]);
        return false;
    }

    private final boolean isMlModelAutoCaptureEnabled() {
        if (!this.onfidoRemoteConfig.getDocumentDetectionExperiment().getEnabled() || shouldEnableAccessibilityCapture()) {
            return false;
        }
        View view = this.view;
        if (view != null) {
            return (view.getDocumentFormat() == DocumentFormat.FOLDED || this.isProofOfAddress) ? false : true;
        }
        Intrinsics.r("view");
        throw null;
    }

    private final boolean isMrzDetectionEnabled() {
        boolean zIsMrzDetectionEnabled = this.onfidoRemoteConfig.getDocumentCapture().isMrzDetectionEnabled();
        Timber.INSTANCE.d(com.google.android.gms.internal.mlkit_vision_face.a.r("MRZ detection validation enabled: ", zIsMrzDetectionEnabled), new Object[0]);
        return zIsMrzDetectionEnabled;
    }

    private final void observeAutoCapture() {
        this.autoCaptureJob = q.G(new q0(q.R(this.documentValidationUseCase.getValidationResult(), new C20411(null)), new C20422(null), 1), this.presenterScope);
    }

    private final void observeFaceOut() {
        CompositeDisposable faceTrackingCompositeDisposable = getFaceTrackingCompositeDisposable();
        g gVarH = this.faceProcessingUseCase.observeFaceOut$onfido_capture_sdk_core_release().j(this.schedulersProvider.getComputation()).g(this.schedulersProvider.getUi()).h(kgm.j.e, new c(this, 5));
        Intrinsics.checkNotNullExpressionValue(gVarH, "subscribe(...)");
        RxExtensionsKt.plusAssign(faceTrackingCompositeDisposable, gVarH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFaceOut$lambda$12(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.onFaceOutTimeout();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void onError(Throwable throwable) {
        ErrorType uploadError;
        ErrorType network;
        if (throwable instanceof ErrorTypeException) {
            uploadError = ((ErrorTypeException) throwable).getErrorType();
        } else if (throwable instanceof HttpParsedException) {
            uploadError = this.iqsUploadParser.parseUploadError(((HttpParsedException) throwable).f50134a, getCaptureType());
        } else if (throwable instanceof TokenExpiredException) {
            uploadError = ErrorType.TokenExpired.INSTANCE;
        } else {
            if (throwable instanceof SSLPeerUnverifiedException) {
                String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
                network = new ErrorType.InvalidCertificate(localizedMessage != null ? localizedMessage : "");
            } else if (throwable instanceof HttpException) {
                String message = throwable.getMessage();
                network = new ErrorType.Network(message != null ? message : "");
            } else {
                uploadError = throwable instanceof GeoblockedException ? ErrorType.Geoblocked.INSTANCE : ErrorType.Generic.INSTANCE;
            }
            uploadError = network;
        }
        View view = this.view;
        if (view != null) {
            view.onUploadError(uploadError);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPostCaptureValidationsFinished(DocumentProcessingResults processingResults, DocumentDetectionFrame frame) {
        String str;
        setMRZResult$onfido_capture_sdk_core_release(processingResults.getMrzValidationResult());
        this.processingResults = processingResults;
        if (!this.onfidoRemoteConfig.isImageQualityServiceEnabled() || !processingResults.isValidDocumentImage()) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            view.showConfirmationStep();
            analyseProcessingResults$onfido_capture_sdk_core_release(processingResults);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            str = "UPLOADING_DOCUMENT";
        } else if (i == 2) {
            str = "UPLOADING_FACE";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UPLOADING_VIDEO";
        }
        trackWaitingScreenCompleted();
        showLoading(str);
        View view2 = this.view;
        if (view2 != null) {
            view2.uploadImage(frame.getYuv());
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public static /* synthetic */ void onRecordingStarted$onfido_capture_sdk_core_release$default(CapturePresenter capturePresenter, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        capturePresenter.onRecordingStarted$onfido_capture_sdk_core_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStart$lambda$5(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.onImageProcessingFinished();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public static /* synthetic */ void onStart$onfido_capture_sdk_core_release$default(CapturePresenter capturePresenter, DocSide docSide, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        capturePresenter.onStart$onfido_capture_sdk_core_release(docSide, z, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processFrameForMRZ(com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20431
            if (r0 == 0) goto L13
            r0 = r14
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter$processFrameForMRZ$1 r0 = (com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter$processFrameForMRZ$1 r0 = new com.onfido.android.sdk.capture.ui.camera.CapturePresenter$processFrameForMRZ$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r1 = r0.J$0
            java.lang.Object r13 = r0.L$0
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter r13 = (com.onfido.android.sdk.capture.ui.camera.CapturePresenter) r13
            yhm.o.b(r14)
            goto L4f
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            yhm.o.b(r14)
            com.onfido.android.sdk.capture.utils.TimeProvider r14 = r12.timeProvider
            long r4 = r14.getCurrentTimestamp()
            com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor r14 = r12.mrzDocumentExtractor
            r0.L$0 = r12
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r14 = r14.detect(r13, r0)
            if (r14 != r1) goto L4d
            return r1
        L4d:
            r13 = r12
            r1 = r4
        L4f:
            com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult r14 = (com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult) r14
            com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult$Skipped r0 = com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult.Skipped.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r14, r0)
            if (r0 != 0) goto L5e
            int r0 = r13.processedFramesCount
            int r0 = r0 + r3
            r13.processedFramesCount = r0
        L5e:
            boolean r0 = r14 instanceof com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult.Success
            if (r0 == 0) goto L85
            com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult$Success r14 = (com.onfido.android.sdk.capture.detector.mrzextraction.MRZResult.Success) r14
            com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument r14 = r14.getDocument()
            boolean r0 = r14.isValid()
            if (r0 == 0) goto L85
            r13.extractedMRZDocument = r14
            com.onfido.android.sdk.capture.utils.TimeProvider r14 = r13.timeProvider
            long r3 = r14.getCurrentTimestamp()
            long r8 = r3 - r1
            long r0 = r13.firstFrameEmitTime
            long r6 = r3 - r0
            com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker r5 = r13.captureTracker
            int r10 = r13.emittedFramesCount
            int r11 = r13.processedFramesCount
            r5.trackDocumentValidMRZExtracted$onfido_capture_sdk_core_release(r6, r8, r10, r11)
        L85:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.processFrameForMRZ(com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pushPerformedChallenge(LivenessChallenge livenessChallenge) {
        this.livenessInteractor.pushPerformedChallenge(livenessChallenge);
    }

    public static /* synthetic */ void setup$onfido_capture_sdk_core_release$default(CapturePresenter capturePresenter, View view, OnfidoConfig onfidoConfig, CaptureStepDataBundle captureStepDataBundle, NfcArguments nfcArguments, boolean z, int i, Object obj2) {
        if ((i & 16) != 0) {
            z = false;
        }
        capturePresenter.setup$onfido_capture_sdk_core_release(view, onfidoConfig, captureStepDataBundle, nfcArguments, z);
    }

    private final boolean shouldEnableAccessibilityCapture() {
        return this.announcementService.isEnabled() && !(this.rectangleDetector instanceof RectangleDetectorEmpty);
    }

    private final boolean shouldForceRetry() {
        return this.rejectionCount < this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries() && !isBackSideOfRomanianNationalId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldGetNfcProperties() {
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        DocumentType documentType = captureStepDataBundle.getDocumentType();
        if (documentType == null) {
            return false;
        }
        CaptureStepDataBundle captureStepDataBundle2 = this.captureStepDataBundle;
        if (captureStepDataBundle2 != null) {
            return captureStepDataBundle2.getDocSide() == this.documentConfigurationManager.getDocSideForNfcProperties(documentType);
        }
        Intrinsics.r("captureStepDataBundle");
        throw null;
    }

    private final boolean shouldRecordDocumentVideo() {
        return getCaptureType() == CaptureType.DOCUMENT && this.onfidoRemoteConfig.isMultiImageCaptureEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldScanNfc() {
        NFCOptions nfcOptions;
        NfcArguments nfcArguments = this.nfcArguments;
        if (Intrinsics.f(nfcArguments != null ? nfcArguments.getNfcOptions() : null, NFCOptions.Enabled.Required.INSTANCE)) {
            return true;
        }
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        DocumentType documentType = captureStepDataBundle.getDocumentType();
        Boolean boolValueOf = documentType != null ? Boolean.valueOf(this.documentConfigurationManager.shouldScanNfc(documentType)) : null;
        NfcArguments nfcArguments2 = this.nfcArguments;
        return nfcArguments2 != null && (nfcOptions = nfcArguments2.getNfcOptions()) != null && NFCOptionsKt.isEnabled(nfcOptions) && Intrinsics.f(boolValueOf, Boolean.TRUE) && this.nfcInteractor.isNfcSupported();
    }

    private final boolean shouldShowOverlay(boolean isFrontSide, boolean isOverlayGone, DocumentType documentType, CountryCode countryCode) {
        if (!isFrontSide || isOverlayGone) {
            return false;
        }
        DocumentFormat documentFormat = DocumentFormat.FOLDED;
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (documentFormat != view.getDocumentFormat()) {
            return false;
        }
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view2.getDocumentType() != documentType) {
            return false;
        }
        View view3 = this.view;
        if (view3 != null) {
            return view3.getCountryCode() == countryCode;
        }
        Intrinsics.r("view");
        throw null;
    }

    private final boolean shouldUploadDocument() {
        return (getCaptureType().isDocument() && isDocumentUploaded() && this.onfidoRemoteConfig.isImageQualityServiceEnabled()) ? false : true;
    }

    private final void showLoading(String reason) {
        showLoadingDialog$onfido_capture_sdk_core_release(reason);
    }

    private final void showMRZWarning() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        ErrorDescriptor errorDescriptor = view.getDocumentType() == DocumentType.PASSPORT ? new ErrorDescriptor(R.string.onfido_doc_capture_alert_no_mrz_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_mrz_detail)) : new ErrorDescriptor(R.string.onfido_doc_capture_alert_no_mrz3_title, Integer.valueOf(R.string.onfido_doc_capture_alert_no_mrz_detail));
        View view2 = this.view;
        if (view2 != null) {
            view2.showError(errorDescriptor);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void showWarningBinaryResult(String documentId, ErrorType warning, boolean nfcSupported, DocumentValidationWarningsBundle warningsBundle, NfcProperties nfcProperties) {
        Map<ErrorType, UiAlerts.UiAlertType> mapG;
        CaptureTracker captureTracker = this.captureTracker;
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        int i = this.takenPhotoCount;
        int maxTotalRetries = this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries();
        if (warningsBundle == null || (mapG = DocumentValidationWarningsBundleUtilsKt.remoteWarnings(warningsBundle)) == null) {
            mapG = r0.g();
        }
        captureTracker.trackDocumentConfirmationWarning$onfido_capture_sdk_core_release(captureStepDataBundle, i, maxTotalRetries, mapG, warning);
        View view = this.view;
        if (view != null) {
            view.onWarningBinaryResult(documentId, warning, nfcSupported, this.documentVideoId, nfcProperties);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public static /* synthetic */ void showWarningBinaryResult$default(CapturePresenter capturePresenter, String str, ErrorType errorType, boolean z, DocumentValidationWarningsBundle documentValidationWarningsBundle, NfcProperties nfcProperties, int i, Object obj2) {
        if ((i & 16) != 0) {
            nfcProperties = null;
        }
        capturePresenter.showWarningBinaryResult(str, errorType, z, documentValidationWarningsBundle, nfcProperties);
    }

    private final void startDocumentVideoRecording() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.startDocumentVideoRecording();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view2.hideCaptureButton();
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view3.showVideoRecordingProgressBar();
        View view4 = this.view;
        if (view4 != null) {
            view4.showVideoRecordingInProgressMessage();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLivenessProcessing$lambda$8(LivenessChallengesViewModel livenessChallengesViewModel, CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(livenessChallengesViewModel, "$livenessChallengesViewModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pushPerformedChallenge((LivenessChallenge) d0.m0(livenessChallengesViewModel.getChallenges()));
        View view = this$0.view;
        if (view != null) {
            view.onChallengesCompleted();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startManualFallbackTimer() {
        CompositeDisposable autocaptureCompositeDisposable = getAutocaptureCompositeDisposable();
        Disposable disposableSubscribe = Observable.timer(MANUAL_FALLBACK_DELAY_MS, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).doOnSubscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startManualFallbackTimer.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                CapturePresenter.this.edgeDetectionFallbackTimerDisposable = it8;
            }
        }).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startManualFallbackTimer.2
            public final void accept(long j2) {
                View view = CapturePresenter.this.view;
                if (view != null) {
                    view.onManualFallbackDelayFinished();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startManualFallbackTimer.3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on autocapture fallback subscription: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(autocaptureCompositeDisposable, disposableSubscribe);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startMovementChallengeTimeout() {
        /*
            r5 = this;
            io.reactivex.rxjava3.disposables.CompositeDisposable r0 = r5.getMovementChallengeCompositeDisposable()
            com.onfido.android.sdk.capture.analytics.IdentityInteractor r1 = r5.identityInteractor
            boolean r1 = r1.isDeviceHighEnd()
            if (r1 == 0) goto L20
            com.onfido.android.sdk.capture.OnfidoConfig r1 = r5.onfidoConfig
            if (r1 == 0) goto L19
            boolean r1 = r1.getManualLivenessCapture()
            if (r1 != 0) goto L20
            r1 = 5000(0x1388, double:2.4703E-320)
            goto L22
        L19:
            java.lang.String r0 = "onfidoConfig"
            kotlin.jvm.internal.Intrinsics.r(r0)
            r0 = 0
            throw r0
        L20:
            r1 = 0
        L22:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.onfido.android.sdk.capture.internal.util.SchedulersProvider r4 = r5.schedulersProvider
            io.reactivex.rxjava3.core.Scheduler r4 = r4.getTimer()
            io.reactivex.rxjava3.core.Observable r1 = io.reactivex.rxjava3.core.Observable.timer(r1, r3, r4)
            com.onfido.android.sdk.capture.internal.util.SchedulersProvider r2 = r5.schedulersProvider
            io.reactivex.rxjava3.core.Scheduler r2 = r2.getIo()
            io.reactivex.rxjava3.core.Observable r1 = r1.subscribeOn(r2)
            com.onfido.android.sdk.capture.internal.util.SchedulersProvider r2 = r5.schedulersProvider
            io.reactivex.rxjava3.core.Scheduler r2 = r2.getUi()
            io.reactivex.rxjava3.core.Observable r1 = r1.observeOn(r2)
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$1 r2 = new com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$1
            r2.<init>()
            com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$2<T> r3 = new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startMovementChallengeTimeout.2
                static {
                    /*
                        com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$2 r0 = new com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$2
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$2<T>) com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startMovementChallengeTimeout.2.INSTANCE com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startMovementChallengeTimeout$2
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20472.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20472.<init>():void");
                }

                @Override // igm.g
                public /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
                    /*
                        r0 = this;
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        r0.accept(r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20472.accept(java.lang.Object):void");
                }

                @Override // igm.g
                public final void accept(@org.jetbrains.annotations.NotNull java.lang.Throwable r4) {
                    /*
                        r3 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                        com.onfido.android.sdk.capture.internal.util.logging.Timber$Forest r0 = com.onfido.android.sdk.capture.internal.util.logging.Timber.INSTANCE
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Error on face tracking timeout subscription: "
                        r1.<init>(r2)
                        java.lang.String r1 = a10.b.u(r1, r4)
                        r2 = 0
                        java.lang.Object[] r2 = new java.lang.Object[r2]
                        r0.e(r4, r1, r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.C20472.accept(java.lang.Throwable):void");
                }
            }
            io.reactivex.rxjava3.disposables.Disposable r1 = r1.subscribe(r2, r3)
            java.lang.String r2 = "subscribe(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            com.onfido.android.sdk.capture.utils.RxExtensionsKt.plusAssign(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.startMovementChallengeTimeout():void");
    }

    private final void startVideoConfirmationTickTimer() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.showVideoRecordCompletionTick();
        applyValidationsAfterAnimationDelay(CONFIRMATION_VIEW_ANIM_DELAY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopDocumentRecording() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.enableTorch(false);
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view2.hideVideoRecordingProgressBar();
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view3.showVideoRecordingCompleteMessage();
        stopDocumentVideoRecordingAndCameraFeed();
        startVideoConfirmationTickTimer();
    }

    private final void stopDocumentVideoRecordingAndCameraFeed() {
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableC = this.schedulersProvider.getComputation().c(new a0.a(this, 18));
        Intrinsics.checkNotNullExpressionValue(disposableC, "scheduleDirect(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopDocumentVideoRecordingAndCameraFeed$lambda$13(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.onDocumentVideoRecordingCompleted();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void stopDocumentVideoRecordingSubscription() {
        getDocumentVideoRecordingCompositeDisposable().d();
    }

    private final void stopMovementChallengeTimeout() {
        getMovementChallengeCompositeDisposable().d();
    }

    private final String toStep() {
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            return "document_capture";
        }
        if (i == 2) {
            return "face_capture";
        }
        if (i == 3) {
            return "video_capture";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void trackCapture(CaptureType captureType) {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        boolean zIsPortrait$onfido_capture_sdk_core_release = view.getScreenOrientation().isPortrait$onfido_capture_sdk_core_release();
        if (captureType == CaptureType.DOCUMENT) {
            trackDocumentCapture(zIsPortrait$onfido_capture_sdk_core_release);
        } else {
            this.livenessTracker.trackFaceCapture$onfido_capture_sdk_core_release(false, zIsPortrait$onfido_capture_sdk_core_release, captureType, this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
        }
    }

    private final void trackDocumentCapture(boolean isPortrait) {
        CaptureTracker captureTracker = this.captureTracker;
        View view = this.view;
        if (view != null) {
            captureTracker.trackDocumentCapture(isPortrait, view.getCaptureStepDataBundle(), shouldAutoCaptureDocument$onfido_capture_sdk_core_release());
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    private final void trackDocumentCaptureFlowCompleted() {
        if (isFinalStepForDocument()) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            if (view.getIsOnConfirmationStep()) {
                CaptureTracker captureTracker = this.captureTracker;
                CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
                if (captureStepDataBundle != null) {
                    captureTracker.trackDocumentCaptureFlowCompleted$onfido_capture_sdk_core_release(captureStepDataBundle);
                } else {
                    Intrinsics.r("captureStepDataBundle");
                    throw null;
                }
            }
        }
    }

    private final void trackDocumentConfirmation(CaptureStepDataBundle documentData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!this.processingResults.getBlurResults().isValid()) {
            linkedHashMap.put(ErrorType.Blur.INSTANCE, UiAlerts.UiAlertType.WARNING);
        }
        if (!this.processingResults.getBarcodeResults().isValid()) {
            linkedHashMap.put(ErrorType.Barcode.INSTANCE, UiAlerts.UiAlertType.WARNING);
        }
        if (!this.processingResults.getFaceOnDocumentDetectionResult().isValid()) {
            linkedHashMap.put(ErrorType.NoFace.INSTANCE, UiAlerts.UiAlertType.WARNING);
        }
        if (!this.processingResults.getMrzValidationResult().isValid()) {
            linkedHashMap.put(ErrorType.Generic.INSTANCE, UiAlerts.UiAlertType.WARNING);
        }
        this.captureTracker.trackDocumentConfirmation(documentData, this.takenPhotoCount, this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries(), this.isAutoCaptured, linkedHashMap);
    }

    private final void trackFaceConfirmation(boolean isPortrait, CaptureType captureType) {
        this.livenessTracker.trackFaceCapture$onfido_capture_sdk_core_release(true, isPortrait, captureType, this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
    }

    private final void trackUploadValidationError(CaptureType captureType, ErrorType errorType) {
        if (captureType != CaptureType.DOCUMENT) {
            trackCaptureError$onfido_capture_sdk_core_release(captureType, errorType);
            return;
        }
        CaptureTracker captureTracker = this.captureTracker;
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle != null) {
            captureTracker.trackDocumentConfirmationError$onfido_capture_sdk_core_release(errorType, captureStepDataBundle.getDocSide());
        } else {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
    }

    private final void trackVideoButtonClicked() {
        long currentTimestamp = this.timeProvider.getCurrentTimestamp() - this.livenessInteractor.getLivenessStartTimestamp();
        long j2 = this.livenessPreviousChallengeCompleted;
        long j3 = currentTimestamp - j2;
        this.livenessPreviousChallengeCompleted = j2 + j3;
        if (this.livenessInteractor.getLivenessPerformedChallenges().getChallenges().size() >= 1) {
            trackVideoFinishButtonClicked$onfido_capture_sdk_core_release(j3);
        } else {
            trackVideoNextButtonClicked$onfido_capture_sdk_core_release(j3);
        }
    }

    private final void trackWaitingScreenCompleted() {
        String str;
        WaitingScreenTracker waitingScreenTracker;
        LoadingFragment.Companion.DialogMode uploading;
        int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i == 1) {
            str = "UPLOADING_DOCUMENT";
        } else if (i == 2) {
            str = "UPLOADING_FACE";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "UPLOADING_VIDEO";
        }
        if (isCheckingImageQuality()) {
            waitingScreenTracker = this.waitingScreenTracker;
            uploading = new LoadingFragment.Companion.DialogMode.CheckingImageQuality(str);
        } else {
            waitingScreenTracker = this.waitingScreenTracker;
            uploading = new LoadingFragment.Companion.DialogMode.Uploading(str);
        }
        waitingScreenTracker.trackWaitingScreenCompletion(uploading.toTaskType(), str);
    }

    private final void uploadDocumentMedia(List<Validation> validations, byte[] jpegData) {
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        DocumentService documentService = this.documentService;
        String extraFileInfo = getExtraFileInfo();
        CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
        if (captureStepDataBundle == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        DocSide docSide = captureStepDataBundle.getDocSide();
        if (docSide == null) {
            docSide = DocSide.FRONT;
        }
        CaptureStepDataBundle captureStepDataBundle2 = this.captureStepDataBundle;
        if (captureStepDataBundle2 == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        DocumentType documentType = captureStepDataBundle2.getDocumentType();
        if (documentType == null) {
            documentType = DocumentType.UNKNOWN;
        }
        CaptureStepDataBundle captureStepDataBundle3 = this.captureStepDataBundle;
        if (captureStepDataBundle3 == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        SdkUploadMetaData sdkUploadMetaDataSdkUploadMetadata$onfido_capture_sdk_core_release = sdkUploadMetadata$onfido_capture_sdk_core_release(captureStepDataBundle3);
        CaptureStepDataBundle captureStepDataBundle4 = this.captureStepDataBundle;
        if (captureStepDataBundle4 == null) {
            Intrinsics.r("captureStepDataBundle");
            throw null;
        }
        Single<DocumentUploadResult> singleUploadDocumentMedia = documentService.uploadDocumentMedia(jpegData, extraFileInfo, docSide, documentType, validations, sdkUploadMetaDataSdkUploadMetadata$onfido_capture_sdk_core_release, captureStepDataBundle4.getCountryCode());
        igm.o oVar = new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.uploadDocumentMedia.1
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull final DocumentUploadResult result) {
                NfcArguments.CapturedNfcData capturedData;
                Intrinsics.checkNotNullParameter(result, "result");
                DocumentValidationWarningsBundle warningsBundle = result.getWarningsBundle();
                final ErrorType errorTypeFirstRemoteWarningOrNull = warningsBundle != null ? DocumentValidationWarningsBundleUtilsKt.firstRemoteWarningOrNull(warningsBundle) : null;
                DocumentFeatures documentFeatures = result.getDocumentFeatures();
                boolean hasNFC = documentFeatures != null ? documentFeatures.getHasNFC() : false;
                NfcArguments nfcArguments = CapturePresenter.this.nfcArguments;
                boolean z = ((nfcArguments == null || (capturedData = nfcArguments.getCapturedData()) == null) ? false : capturedData.getNfcSupported$onfido_capture_sdk_core_release()) || hasNFC;
                if (!CapturePresenter.this.shouldScanNfc() || !z || !CapturePresenter.this.shouldGetNfcProperties()) {
                    return Single.f(new UploadBinaryResult.BinaryUploaded(result.getMediaId(), errorTypeFirstRemoteWarningOrNull, hasNFC, result.getWarningsBundle()));
                }
                Timber.INSTANCE.i("NFC Logger - Attempting to get Nfc properties", new Object[0]);
                Single<NfcProperties> single = CapturePresenter.this.nfcPropertiesService.get(CapturePresenter.this.getDocumentIdsForDocumentResponse(result.getMediaId()), CapturePresenter.this.getExtractedMRZDocument(), result.getDocumentFeatures());
                final CapturePresenter capturePresenter = CapturePresenter.this;
                tgm.g gVarG = single.g(new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.uploadDocumentMedia.1.1
                    @Override // igm.o
                    @NotNull
                    public final UploadBinaryResult.NfcPropertiesFetched apply(@NotNull NfcProperties nfcProperties) {
                        Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
                        NfcTracker nfcTracker = capturePresenter.nfcTracker;
                        boolean zIsNfcSupported = nfcProperties.getIsNfcSupported();
                        boolean z3 = nfcProperties.getNfcKey().length() > 0;
                        CaptureStepDataBundle captureStepDataBundle5 = capturePresenter.captureStepDataBundle;
                        if (captureStepDataBundle5 == null) {
                            Intrinsics.r("captureStepDataBundle");
                            throw null;
                        }
                        DocumentType documentType2 = captureStepDataBundle5.getDocumentType();
                        CaptureStepDataBundle captureStepDataBundle6 = capturePresenter.captureStepDataBundle;
                        if (captureStepDataBundle6 != null) {
                            nfcTracker.trackDocumentNfcSupported$onfido_capture_sdk_core_release(zIsNfcSupported, z3, documentType2, captureStepDataBundle6.getCountryCode(), CapturePresenter.getDocumentFeatures$default(capturePresenter, nfcProperties, false, 2, null));
                            return new UploadBinaryResult.NfcPropertiesFetched(result.getMediaId(), nfcProperties, errorTypeFirstRemoteWarningOrNull, result.getWarningsBundle());
                        }
                        Intrinsics.r("captureStepDataBundle");
                        throw null;
                    }
                });
                final CapturePresenter capturePresenter2 = CapturePresenter.this;
                return new tgm.e(gVarG, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.uploadDocumentMedia.1.2
                    @Override // igm.g
                    public final void accept(@NotNull Throwable it8) {
                        Intrinsics.checkNotNullParameter(it8, "it");
                        capturePresenter2.nfcTracker.trackPropertiesError$onfido_capture_sdk_core_release(it8.getMessage());
                    }
                }, 0);
            }
        };
        singleUploadDocumentMedia.getClass();
        int i = 2;
        Disposable disposableI = new tgm.d(new tgm.g(new tgm.g(singleUploadDocumentMedia, oVar, 0), new cie.b(19), i).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()), new c(this, 0), i).i(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.uploadDocumentMedia.4
            @Override // igm.g
            public final void accept(@NotNull UploadBinaryResult it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                CapturePresenter.this.onBinaryUploaded$onfido_capture_sdk_core_release(it8);
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter.uploadDocumentMedia.5
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "NFC Logger - Error on uploadBinary", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableI);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UploadBinaryResult uploadDocumentMedia$lambda$22(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Timber.INSTANCE.e(throwable, "NFC Logger - Error on uploadBinary", new Object[0]);
        return new UploadBinaryResult.Error(throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadDocumentMedia$lambda$23(CapturePresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View view = this$0.view;
        if (view != null) {
            view.hideLoading();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void analyseProcessingResults$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults results) {
        ErrorType errorType;
        Intrinsics.checkNotNullParameter(results, "results");
        if (results.isValidDocumentImage()) {
            View view = this.view;
            if (view != null) {
                view.setConfirmationButtons(false);
                return;
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
        if (!isBackSideOfRomanianNationalId()) {
            if (results.getBlurResults().getHasBlur()) {
                errorType = ErrorType.Blur.INSTANCE;
            } else if (!results.getMrzValidationResult().isValid() && isMrzDetectionEnabled()) {
                showMRZWarning();
            } else if (!results.getBarcodeResults().isValid()) {
                errorType = ErrorType.Barcode.INSTANCE;
            } else if (!results.getFaceOnDocumentDetectionResult().isValid()) {
                errorType = ErrorType.NoFace.INSTANCE;
            }
            showErrorType$onfido_capture_sdk_core_release(errorType);
        }
        if (shouldForceRetry()) {
            View view2 = this.view;
            if (view2 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view2.setForceRetryButton();
        } else {
            View view3 = this.view;
            if (view3 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view3.setWarningConfirmationButtons(false);
        }
        this.rejectionCount++;
    }

    public final void applyPostCaptureValidations$onfido_capture_sdk_core_release(@NotNull final DocumentDetectionFrame frame, @NotNull DocumentType documentType, @NotNull DocSide docSide, CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        this.docFrame = frame;
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableI = this.postCaptureDocumentValidationsManager.validate$onfido_capture_sdk_core_release(frame, documentType, countryCode, docSide).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()).i(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$applyPostCaptureValidations$1
            @Override // igm.g
            public final void accept(@NotNull DocumentProcessingResults processingResults) {
                Intrinsics.checkNotNullParameter(processingResults, "processingResults");
                this.this$0.onPostCaptureValidationsFinished(processingResults, frame);
                this.this$0.documentProcessingFailureAnalyzer.analyzeDocumentProcessingResults(processingResults);
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$applyPostCaptureValidations$2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on post processing validations: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableI);
    }

    public final void callMediaCallback$onfido_capture_sdk_core_release() {
        byte[] data$onfido_capture_sdk_core_release = this.croppedImage;
        if (data$onfido_capture_sdk_core_release == null) {
            OnfidoImage onfidoImage = this.capturedImage;
            data$onfido_capture_sdk_core_release = onfidoImage != null ? onfidoImage.getData() : null;
            if (data$onfido_capture_sdk_core_release == null) {
                return;
            }
        }
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        String strName = view.getDocSide().name();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocumentType documentType = view2.getDocumentType();
        String strName2 = documentType != null ? documentType.name() : null;
        if (strName2 == null) {
            strName2 = "";
        }
        View view3 = this.view;
        if (view3 == null) {
            Intrinsics.r("view");
            throw null;
        }
        CountryCode countryCode = view3.getCountryCode();
        String alpha3 = countryCode != null ? countryCode.getAlpha3() : null;
        String str = (getCaptureType().isDocument() ? "onfido-document" : "onfido-selfie") + CoreConstants.DASH_CHAR + this.timeProvider.getCurrentTimestamp() + ".jpeg";
        ResultReceiver resultReceiver = this.mediaCallback;
        if (resultReceiver != null) {
            ResultReceiverExtensionsKt.sendMedia(resultReceiver, data$onfido_capture_sdk_core_release, this.schedulersProvider.getIo(), BundleKt.bundleOf(new Pair("isDocument", getCaptureType()), new Pair("file_type", "jpeg"), new Pair("file_name", str), new Pair("doc_side", strName), new Pair("doc_type", strName2), new Pair("country", alpha3)));
        }
    }

    public final void clearEdges$onfido_capture_sdk_core_release() {
        this.nativeDetector.clearEdges();
    }

    public final void cropImageAndSaveToFile$onfido_capture_sdk_core_release(@NotNull byte[] jpegData, @NotNull DocumentDetectionFrame frame) {
        Intrinsics.checkNotNullParameter(jpegData, "jpegData");
        Intrinsics.checkNotNullParameter(frame, "frame");
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableI = getPoaFileNameAfterCropping(jpegData, frame).k(this.schedulersProvider.getComputation()).h(this.schedulersProvider.getUi()).i(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$cropImageAndSaveToFile$1
            @Override // igm.g
            public final void accept(@NotNull String p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                this.$tmp0.imageSavedSuccessfully(p0);
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$cropImageAndSaveToFile$2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "POA_Debug: failed cropping / saving poa file", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableI);
    }

    /* JADX INFO: renamed from: getCurrentCaptureFlowError$onfido_capture_sdk_core_release, reason: from getter */
    public final ErrorType getCurrentCaptureFlowError() {
        return this.currentCaptureFlowError;
    }

    @NotNull
    public final DocumentDetectionFrame getDocFrame$onfido_capture_sdk_core_release() {
        DocumentDetectionFrame documentDetectionFrame = this.docFrame;
        if (documentDetectionFrame != null) {
            return documentDetectionFrame;
        }
        Intrinsics.r("docFrame");
        throw null;
    }

    @NotNull
    public final DocumentCaptureResultConsumer getDocumentCaptureResultConsumer$onfido_capture_sdk_core_release() {
        DocumentCaptureResultConsumer documentCaptureResultConsumer = this.documentCaptureResultConsumer;
        if (documentCaptureResultConsumer != null) {
            return documentCaptureResultConsumer;
        }
        Intrinsics.r("documentCaptureResultConsumer");
        throw null;
    }

    /* JADX INFO: renamed from: getExtraFileInfo$onfido_capture_sdk_core_release, reason: from getter */
    public final String getExtraFileInfo() {
        return this.extraFileInfo;
    }

    /* JADX INFO: renamed from: getExtractedMRZDocument$onfido_capture_sdk_core_release, reason: from getter */
    public final MRZDocument getExtractedMRZDocument() {
        return this.extractedMRZDocument;
    }

    @NotNull
    public final StringRepresentation getOvalCaptureContentDescription$onfido_capture_sdk_core_release(@NotNull CaptureStepDataBundle captureStepDataBundle) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        int i = WhenMappings.$EnumSwitchMapping$0[captureStepDataBundle.getCaptureType().ordinal()];
        if (i == 1) {
            if (captureStepDataBundle.getDocumentType() != null) {
                return new StringRepresentation.SingleStringResIdRepresentation(this.documentConfigurationManager.captureFrameContentDescription(captureStepDataBundle.getDocumentType(), captureStepDataBundle.getCountryCode(), captureStepDataBundle.getDocSide(), captureStepDataBundle.getDocumentFormat(), this.announcementService.isEnabled()));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (i == 2) {
            return new StringRepresentation.SingleStringResIdRepresentation(R.string.onfido_selfie_capture_frame_accessibility);
        }
        if (i == 3) {
            return new StringRepresentation.SingleStringResIdRepresentation(R.string.onfido_video_capture_frame_accessibility);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: getRejectionCount$onfido_capture_sdk_core_release, reason: from getter */
    public final int getRejectionCount() {
        return this.rejectionCount;
    }

    @NotNull
    public final List<Validation> getRequiredDocumentValidations$onfido_capture_sdk_core_release(DocumentType documentType, @NotNull DocSide documentSide) {
        Intrinsics.checkNotNullParameter(documentSide, "documentSide");
        return this.backendDocumentValidationsManager.getRequiredValidations(documentType, documentSide, this.rejectionCount);
    }

    @NotNull
    public final State getState$onfido_capture_sdk_core_release() {
        return new State(this.rejectionCount, this.takenPhotoCount, this.documentProcessingFailureAnalyzer.getProcessingFailureCounts());
    }

    /* JADX INFO: renamed from: getTakenPhotoCount$onfido_capture_sdk_core_release, reason: from getter */
    public final int getTakenPhotoCount() {
        return this.takenPhotoCount;
    }

    @NotNull
    public final LivenessPerformedChallenges getUploadChallengesList$onfido_capture_sdk_core_release() {
        return this.livenessInteractor.getLivenessPerformedChallenges();
    }

    /* JADX INFO: renamed from: isAutoCaptured$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsAutoCaptured() {
        return this.isAutoCaptured;
    }

    public final boolean isCameraXEnabled$onfido_capture_sdk_core_release() {
        return this.onfidoRemoteConfig.isCameraXEnabled();
    }

    /* JADX INFO: renamed from: isDisplayingOverlay$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsDisplayingOverlay() {
        return this.isDisplayingOverlay;
    }

    public final boolean isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults results) {
        Intrinsics.checkNotNullParameter(results, "results");
        return this.shouldWaitForMRZExtractionResult ? this.isMRZExtractionTimeExceeded && results.isValidDocumentImage() : results.isValidDocumentImage();
    }

    public final boolean isFourByThreeEnabled$onfido_capture_sdk_core_release() {
        return this.onfidoRemoteConfig.isFourByThreeEnabled();
    }

    public final void issueNextChallenge$onfido_capture_sdk_core_release() {
        this.livenessInteractor.getLivenessControlButtonSubject().onNext(Unit.f186387a);
    }

    public final void onAutoLivenessRecordingStart$onfido_capture_sdk_core_release() {
        this.captureTracker.trackVideoAutoRecordingStarted$onfido_capture_sdk_core_release();
        View view = this.view;
        if (view != null) {
            view.startLivenessVideoRecording(false);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onBinaryUploaded$onfido_capture_sdk_core_release(@NotNull UploadBinaryResult uploadBinaryResult) {
        Intrinsics.checkNotNullParameter(uploadBinaryResult, "uploadBinaryResult");
        this.uploadBinaryResult = uploadBinaryResult;
        String documentId = uploadBinaryResult.getDocumentId();
        if (!shouldRecordDocumentVideo() || documentId == null) {
            checkUploadBinaryResult(uploadBinaryResult);
        } else {
            trackWaitingScreenCompleted();
            String str = this.capturedVideoFilePath;
            Unit unit = null;
            if (str != null) {
                View view = this.view;
                if (view == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                CaptureStepDataBundle captureStepDataBundle = this.captureStepDataBundle;
                if (captureStepDataBundle == null) {
                    Intrinsics.r("captureStepDataBundle");
                    throw null;
                }
                DocSide docSide = captureStepDataBundle.getDocSide();
                if (docSide == null) {
                    docSide = DocSide.FRONT;
                }
                CaptureStepDataBundle captureStepDataBundle2 = this.captureStepDataBundle;
                if (captureStepDataBundle2 == null) {
                    Intrinsics.r("captureStepDataBundle");
                    throw null;
                }
                DocumentType documentType = captureStepDataBundle2.getDocumentType();
                if (documentType == null) {
                    documentType = DocumentType.UNKNOWN;
                }
                CaptureStepDataBundle captureStepDataBundle3 = this.captureStepDataBundle;
                if (captureStepDataBundle3 == null) {
                    Intrinsics.r("captureStepDataBundle");
                    throw null;
                }
                view.uploadVideo(documentId, str, docSide, documentType, captureStepDataBundle3.getCountryCode());
                unit = Unit.f186387a;
            }
            if (unit == null) {
                onDocumentVideoUploaded$onfido_capture_sdk_core_release("");
            }
        }
        this.captureTracker.trackDocumentUploadCompleted();
    }

    public final void onCameraStarted$onfido_capture_sdk_core_release() {
        this.extractedMRZDocument = null;
        this.firstFrameEmitTime = 0L;
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view.getCaptureType().isPicture()) {
            if (shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release()) {
                view.deactivateCaptureButton();
            } else {
                view.displayCaptureButton();
            }
            view.setupCaptureButton();
            if (hasNativeLibrary()) {
                view.setGlareWarningContent();
            }
        }
        if (isMlModelAutoCaptureEnabled()) {
            observeAutoCapture();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureConfirmed() {
        String str;
        this.livenessTracker.trackFaceConfirmationUploadButtonClicked$onfido_capture_sdk_core_release(getCaptureType(), this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
        OnfidoImage onfidoImage = this.capturedImage;
        if (onfidoImage == null) {
            onCaptureDiscarded();
            return;
        }
        if (shouldUploadDocument()) {
            int i = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
            if (i == 1) {
                str = "UPLOADING_DOCUMENT";
            } else if (i == 2) {
                str = "UPLOADING_FACE";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "UPLOADING_VIDEO";
            }
            showLoading(str);
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            view.uploadImage(onfidoImage.getData());
        } else {
            checkUploading();
        }
        trackDocumentCaptureFlowCompleted();
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.Listener
    public void onCaptureDiscarded() {
        this.livenessTracker.trackFaceConfirmationRetakeButtonClicked$onfido_capture_sdk_core_release(getCaptureType(), this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
        View view = this.view;
        if (view != null) {
            view.openCaptureScreen();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onCaptureScreenResumedAfterCameraInitialized$onfido_capture_sdk_core_release(boolean wasConfirmationScreenShown) {
        if (getCaptureType().isDocument() && this.onfidoRemoteConfig.isMultiImageCaptureEnabled()) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            view.hideVideoRecordingProgressBar();
            View view2 = this.view;
            if (view2 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view2.resetDocumentRecordingState();
            if (wasConfirmationScreenShown || !shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
                View view3 = this.view;
                if (view3 != null) {
                    view3.displayCaptureButton();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }
    }

    public final void onConfirmationStepTracking$onfido_capture_sdk_core_release() {
        CaptureType captureType = getCaptureType();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        CaptureStepDataBundle captureStepDataBundle = view.getCaptureStepDataBundle();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        boolean zIsPortrait$onfido_capture_sdk_core_release = view2.getScreenOrientation().isPortrait$onfido_capture_sdk_core_release();
        if (captureType == CaptureType.DOCUMENT) {
            trackDocumentConfirmation(captureStepDataBundle);
        } else {
            trackFaceConfirmation(zIsPortrait$onfido_capture_sdk_core_release, captureType);
        }
    }

    public final void onDestroy$onfido_capture_sdk_core_release() {
        this.rectangleDetector.close();
        e0.k(this.presenterScope, null);
    }

    public final void onDocumentVideoUploaded$onfido_capture_sdk_core_release(@NotNull String documentVideoId) {
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        this.documentVideoId = documentVideoId;
        View view = this.view;
        Unit unit = null;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        trackWaitingScreenCompleted();
        UploadBinaryResult uploadBinaryResult = this.uploadBinaryResult;
        if (uploadBinaryResult != null) {
            checkUploadBinaryResult(uploadBinaryResult);
            unit = Unit.f186387a;
        }
        if (unit == null) {
            onCaptureDiscarded();
        }
    }

    public final void onErrorPictureTaking$onfido_capture_sdk_core_release() {
        if (this.capturedImage != null) {
            Timber.INSTANCE.i("An issue occurred after the image capture. But, it has been ignored!", new Object[0]);
            return;
        }
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        View view2 = this.view;
        if (view2 != null) {
            view2.showErrorMessage(R.string.onfido_generic_error_title, getCaptureErrorMessage(), new CapturePresenter$onErrorPictureTaking$1(this));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onErrorVideoTaking$onfido_capture_sdk_core_release() {
        getDocumentVideoRecordingCompositeDisposable().d();
        if (getCaptureType() != CaptureType.DOCUMENT || this.onfidoRemoteConfig.getDocumentCapture().getVideoRequired()) {
            onErrorPictureTaking$onfido_capture_sdk_core_release();
        }
    }

    public final void onFaceDetected$onfido_capture_sdk_core_release() {
        disposeFaceDetectionSubscriptions();
    }

    public final void onFaceSelfieUploaded$onfido_capture_sdk_core_release() {
        trackWaitingScreenCompleted();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        long currentTimestamp = this.timeProvider.getCurrentTimestamp() - this.faceSelfieUploadStartTime;
        this.currentCaptureFlowError = null;
        this.captureTracker.trackFaceSelfieConfirmationUploadStatus$onfido_capture_sdk_core_release(currentTimestamp, null, this.takenPhotoCount, this.rejectionCount);
        this.captureTracker.trackFaceSelfieUploadCompleted$onfido_capture_sdk_core_release(currentTimestamp, this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
    }

    public final void onFlowUserExit() {
        this.flowTracker.trackFlowUserExitButtonClicked(toStep());
    }

    public final void onFlowUserExitCancel() {
        this.flowTracker.trackFlowUserExitCanceled(toStep());
    }

    public final void onFlowUserExitConfirmed() {
        this.flowTracker.trackFlowUserExitConfirmed(toStep());
        View view = this.view;
        if (view != null) {
            view.finishWithResultExitUserFlow();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onGeneralUploadError$onfido_capture_sdk_core_release() {
        int i;
        trackCaptureError$onfido_capture_sdk_core_release(getCaptureType(), ErrorType.Generic.INSTANCE);
        trackWaitingScreenCompleted();
        int i2 = WhenMappings.$EnumSwitchMapping$0[getCaptureType().ordinal()];
        if (i2 == 1) {
            i = R.string.onfido_generic_error_doc_capture;
        } else if (i2 == 2) {
            i = R.string.onfido_generic_error_face_capture;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.onfido_generic_error_video_capture;
        }
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        View view2 = this.view;
        if (view2 != null) {
            view2.showErrorMessage(R.string.onfido_generic_error_network_title, i, new CapturePresenter$onGeneralUploadError$1(this));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onManualLivenessNextClick$onfido_capture_sdk_core_release() {
        trackVideoButtonClicked();
        issueNextChallenge$onfido_capture_sdk_core_release();
    }

    public final void onManualLivenessRecordingStart$onfido_capture_sdk_core_release() {
        this.captureTracker.trackVideoManualRecordingStarted$onfido_capture_sdk_core_release();
        View view = this.view;
        if (view != null) {
            view.startLivenessVideoRecording(true);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onNextChallenge$onfido_capture_sdk_core_release(@NotNull LivenessChallenge challenge) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (challenge instanceof MovementLivenessChallenge) {
            view.hideLivenessControlButton();
            startMovementChallengeTimeout();
        } else if (challenge instanceof ReciteLivenessChallenge) {
            stopMovementChallengeTimeout();
            view.hideLivenessControlButton();
            view.showLivenessButtonAndFocusWithDelay();
        }
    }

    public final void onNextFaceDetectionFrame$onfido_capture_sdk_core_release(@NotNull FaceDetectionFrame frameData) {
        Intrinsics.checkNotNullParameter(frameData, "frameData");
        this.faceDetector.getFaceTrackingSubject().onNext(frameData);
    }

    public final void onNextFrame$onfido_capture_sdk_core_release(@NotNull DocumentDetectionFrame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        if (this.firstFrameEmitTime == 0) {
            this.emittedFramesCount = 0;
            this.processedFramesCount = 0;
            this.firstFrameEmitTime = this.timeProvider.getCurrentTimestamp();
        }
        this.emittedFramesCount++;
        if (isMlModelAutoCaptureEnabled()) {
            DocumentValidationTargets documentValidationTargets = this.documentValidationTarget;
            if (documentValidationTargets != null) {
                e0.C(this.presenterScope, null, null, new CapturePresenter$onNextFrame$1$1(this, frame, documentValidationTargets, null), 3);
            }
        } else {
            frame.getBitmap().recycle();
            this.nativeDetector.getFrameData().onNext(frame);
            this.documentFrameBehaviorSubject.onNext(frame);
        }
        e0.C(this.presenterScope, null, null, new CapturePresenter$onNextFrame$2(this, frame, null), 3);
    }

    public final void onOverlayMetricsChanged$onfido_capture_sdk_core_release(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.visibleRect = overlayMetrics.getRealCaptureRect();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocumentType documentType = view.getDocumentType();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocSide docSide = view2.getDocSide();
        OnfidoRectF.Companion companion = OnfidoRectF.INSTANCE;
        OnfidoRectF onfidoRectF = companion.toOnfidoRectF(overlayMetrics.getVisibleCaptureRect());
        OnfidoRectF onfidoRectF2 = companion.toOnfidoRectF(overlayMetrics.getRealCaptureRect());
        b.Companion aVar = kotlin.time.b.INSTANCE;
        this.documentValidationTarget = new DocumentValidationTargets(documentType, docSide, onfidoRectF, onfidoRectF2, kotlin.time.c.g(this.onfidoRemoteConfig.getDocumentDetectionExperiment().getHoldDurationInMs(), pkm.e.MILLISECONDS), null);
        this.overlayMetricsBehaviorSubject.onNext(overlayMetrics);
    }

    public final void onPause$onfido_capture_sdk_core_release() {
        stopDocumentVideoRecordingSubscription();
        Job job2 = this.autoCaptureJob;
        if (job2 != null) {
            job2.f(null);
        }
    }

    public final void onPictureCaptured$onfido_capture_sdk_core_release(@NotNull OnfidoImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.takenPhotoCount++;
        this.capturedImage = image;
        this.uploadBinaryResult = null;
        this.documentVideoId = "";
        if (shouldRecordDocumentVideo()) {
            startDocumentVideoRecording();
        } else {
            applyValidationsAfterAnimationDelay((getCaptureType() == CaptureType.DOCUMENT && this.isAutoCaptured) ? CONFIRMATION_VIEW_ANIM_DELAY : 0L);
        }
    }

    public final void onRecordingStarted$onfido_capture_sdk_core_release(boolean isStartedManually) {
        if (this.livenessInteractor.getAvailableStorageSpace() < 5500000) {
            CompositeDisposable compositeSubscription = getCompositeSubscription();
            Disposable disposableSubscribe = Observable.interval(1000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).map(new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onRecordingStarted$1
                @NotNull
                public final Long apply(long j2) {
                    return Long.valueOf(this.this$0.livenessInteractor.getAvailableStorageSpace());
                }

                @Override // igm.o
                public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                    return apply(((Number) obj2).longValue());
                }
            }).filter(new igm.p() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onRecordingStarted$2
                public final boolean test(long j2) {
                    return j2 < 500000;
                }

                @Override // igm.p
                public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                    return test(((Number) obj2).longValue());
                }
            }).take(1L).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onRecordingStarted$3
                public final void accept(long j2) {
                    CapturePresenter.View view = this.this$0.view;
                    if (view != null) {
                        view.onStorageThresholdReached();
                    } else {
                        Intrinsics.r("view");
                        throw null;
                    }
                }

                @Override // igm.g
                public /* bridge */ /* synthetic */ void accept(Object obj2) {
                    accept(((Number) obj2).longValue());
                }
            }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onRecordingStarted$4
                @Override // igm.g
                public final void accept(@NotNull Throwable it8) {
                    Intrinsics.checkNotNullParameter(it8, "it");
                    Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on available storage calculation: "), it8), new Object[0]);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
        }
        disposeFaceDetectionSubscriptions();
        if (isStartedManually) {
            return;
        }
        observeFaceOut();
    }

    public final void onStart$onfido_capture_sdk_core_release(@NotNull DocSide docSide, boolean isFirstStart, boolean isOnConfirmationStep) {
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        CaptureType captureType = getCaptureType();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocumentType documentType = view.getDocumentType();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        CountryCode countryCode = view2.getCountryCode();
        if (isOnConfirmationStep) {
            onConfirmationStepTracking$onfido_capture_sdk_core_release();
        } else {
            trackCapture(captureType);
        }
        if (shouldEnableAccessibilityCapture()) {
            enableAccessibilityCapture(documentType, docSide);
        }
        this.mrzExtractionResultMap.clear();
        this.barcodeValidationSuspender.reset$onfido_capture_sdk_core_release();
        this.retainableValidationsResult.clear$onfido_capture_sdk_core_release();
        this.isAutoCaptured = false;
        this.capturedImage = null;
        if (captureType != CaptureType.DOCUMENT || documentType == null || isMlModelAutoCaptureEnabled()) {
            return;
        }
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableSubscribe = getImageProcessingObservable(documentType, countryCode, docSide, isFirstStart).compose(this.documentDelayTransformer.transform$onfido_capture_sdk_core_release(documentType, countryCode, isFirstStart, shouldEnableAccessibilityCapture())).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).doFinally(new c(this, 2)).subscribe(getDocumentCaptureResultConsumer$onfido_capture_sdk_core_release(), new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$onStart$2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Error on glare detector", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
    }

    public final void onUploadFailure$onfido_capture_sdk_core_release(boolean isOnCaptureScreen) {
        trackCaptureError$onfido_capture_sdk_core_release(getCaptureType(), new ErrorType.Network(""));
        trackWaitingScreenCompleted();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        View view2 = this.view;
        if (view2 != null) {
            view2.showErrorMessage(R.string.onfido_generic_error_network_title, R.string.onfido_generic_error_network_detail, new CapturePresenter$onUploadFailure$1(isOnCaptureScreen, this));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onUploadFailureWithGeoblocking$onfido_capture_sdk_core_release(boolean isOnCaptureScreen) {
        trackCaptureError$onfido_capture_sdk_core_release(getCaptureType(), new ErrorType.Network(""));
        trackWaitingScreenCompleted();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        View view2 = this.view;
        if (view2 != null) {
            view2.showErrorMessage(R.string.onfido_generic_errors_geoblocked_error_message, R.string.onfido_generic_errors_geoblocked_error_instruction, new CapturePresenter$onUploadFailureWithGeoblocking$1(isOnCaptureScreen, this));
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void onUploadValidationError$onfido_capture_sdk_core_release(@NotNull ErrorType errorType, @NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        trackUploadValidationError(captureType, errorType);
        if (isCheckingImageQuality()) {
            trackWaitingScreenCompleted();
        }
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideLoading();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        view2.showConfirmationStep();
        if (!isBackSideOfRomanianNationalId()) {
            showErrorType$onfido_capture_sdk_core_release(errorType);
        }
        if (shouldForceRetry()) {
            View view3 = this.view;
            if (view3 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view3.setForceRetryButton();
        } else {
            View view4 = this.view;
            if (view4 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view4.setConfirmationButtons(false);
        }
        this.rejectionCount++;
    }

    public final void onVideoCaptured$onfido_capture_sdk_core_release(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.capturedVideoFilePath = filePath;
        if (getCaptureType() == CaptureType.VIDEO) {
            View view = this.view;
            if (view != null) {
                view.showFaceLivenessConfirmationScreen(filePath, getUploadChallengesList$onfido_capture_sdk_core_release());
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
    }

    public final void onVideoRecordingCanceled$onfido_capture_sdk_core_release() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (shouldRecordDocumentVideo()) {
            view.hideVideoRecordingProgressBar();
        }
    }

    public final void onViewResumed$onfido_capture_sdk_core_release(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        if (getMissingPermissions(captureType).length == 0) {
            View view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            view.setupUploadService();
            View view2 = this.view;
            if (view2 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view2.setOverlay();
            setupUIState$onfido_capture_sdk_core_release();
        } else {
            View view3 = this.view;
            if (view3 == null) {
                Intrinsics.r("view");
                throw null;
            }
            view3.destroyWithCanceledResult();
        }
        View view4 = this.view;
        if (view4 != null) {
            view4.trackNavigationCompleted(getPerformanceTrackingScreen());
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    @NotNull
    public final SdkUploadMetaData sdkUploadMetadata$onfido_capture_sdk_core_release() {
        return this.sdkUploadMetaDataHelper.create();
    }

    public final void setAutoCaptured$onfido_capture_sdk_core_release(boolean z) {
        this.isAutoCaptured = z;
    }

    public final void setCurrentCaptureFlowError$onfido_capture_sdk_core_release(ErrorType errorType) {
        this.currentCaptureFlowError = errorType;
    }

    public final void setDisplayingOverlay$onfido_capture_sdk_core_release(boolean z) {
        this.isDisplayingOverlay = z;
    }

    public final void setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release(@NotNull DocumentCaptureResultConsumer documentCaptureResultConsumer) {
        Intrinsics.checkNotNullParameter(documentCaptureResultConsumer, "<set-?>");
        this.documentCaptureResultConsumer = documentCaptureResultConsumer;
    }

    public final void setMRZResult$onfido_capture_sdk_core_release(MRZValidationResult result) {
        String str;
        if (result == null || !result.getWasExecuted()) {
            this.extraFileInfo = null;
            return;
        }
        if (result.isMrzReadable()) {
            Timber.INSTANCE.i("NFC Logger - MRZ is readable", new Object[0]);
            str = "1";
        } else {
            Timber.INSTANCE.i("NFC Logger - MRZ is not readable", new Object[0]);
            str = "0";
        }
        this.extraFileInfo = str;
    }

    public final void setRejectionCount$onfido_capture_sdk_core_release(int i) {
        this.rejectionCount = i;
    }

    public final void setState$onfido_capture_sdk_core_release(@NotNull State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.rejectionCount = value.getNumValidationErrors();
        this.takenPhotoCount = value.getNumOfTakenPictures();
        this.documentProcessingFailureAnalyzer.updateFailureCounts(value.getDocumentProcessingFailureCounts());
    }

    public final void setTakenPhotoCount$onfido_capture_sdk_core_release(int i) {
        this.takenPhotoCount = i;
    }

    public final void setup$onfido_capture_sdk_core_release(@NotNull View view, @NotNull OnfidoConfig onfidoConfig, @NotNull CaptureStepDataBundle captureStepDataBundle, NfcArguments nfcArguments, boolean isProofOfAddress) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onfidoConfig, "onfidoConfig");
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        this.view = view;
        this.onfidoConfig = onfidoConfig;
        this.captureStepDataBundle = captureStepDataBundle;
        this.nfcArguments = nfcArguments;
        this.rejectionCount = 0;
        setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release(new DocumentCaptureResultConsumer(view, this, this.onfidoRemoteConfig));
        this.retainableValidationsResult.clear$onfido_capture_sdk_core_release();
        this.barcodeValidationSuspender.reset$onfido_capture_sdk_core_release();
        this.isProofOfAddress = isProofOfAddress;
    }

    public final void setupUIState$onfido_capture_sdk_core_release() {
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view.getCaptureType().isPicture()) {
            view.setupConfirmationButtons();
        }
        checkDocumentFormat();
    }

    public final boolean shouldAutoCaptureDocument$onfido_capture_sdk_core_release() {
        if (!isDocumentCapture()) {
            return false;
        }
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        if (view.getDocumentType() == null || !hasNativeLibrary()) {
            return false;
        }
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocumentType documentType = view2.getDocumentType();
        View view3 = this.view;
        if (view3 != null) {
            return shouldAutocapture$onfido_capture_sdk_core_release(documentType, view3.getCountryCode());
        }
        Intrinsics.r("view");
        throw null;
    }

    public final boolean shouldAutocapture$onfido_capture_sdk_core_release(DocumentType documentType, CountryCode countryCode) {
        if (documentType != null) {
            return this.documentConfigurationManager.shouldAutocapture(documentType, countryCode);
        }
        return false;
    }

    public final boolean shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release() {
        return this.announcementService.isEnabled() && shouldAutoCaptureDocument$onfido_capture_sdk_core_release();
    }

    public final boolean shouldPerformFaceValidation$onfido_capture_sdk_core_release() {
        return this.backendDocumentValidationsManager.getShouldPerformFaceValidation();
    }

    public final boolean shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.DRIVING_LICENCE, CountryCode.FR);
    }

    public final boolean shouldShowGermanDLOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.DRIVING_LICENCE, CountryCode.DE);
    }

    public final boolean shouldShowInitialOverlay$onfido_capture_sdk_core_release(DocumentType documentType) {
        if (documentType != null) {
            return this.documentConfigurationManager.shouldShowInitialOverlay(documentType);
        }
        return false;
    }

    public final boolean shouldShowItalianIDOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.NATIONAL_IDENTITY_CARD, CountryCode.IT);
    }

    public final boolean shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.NATIONAL_IDENTITY_CARD, CountryCode.ZA);
    }

    public final void showErrorType$onfido_capture_sdk_core_release(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        ErrorDescriptor errorDescriptorMapErrorType = ErrorTypeUtilsKt.mapErrorType(errorType);
        View view = this.view;
        if (view != null) {
            view.showError(errorDescriptorMapErrorType);
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }

    public final void showLoadingDialog$onfido_capture_sdk_core_release(@NotNull String reason) {
        View view;
        LoadingFragment.Companion.DialogMode uploading;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (isCheckingImageQuality()) {
            view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            uploading = new LoadingFragment.Companion.DialogMode.CheckingImageQuality(reason);
        } else {
            view = this.view;
            if (view == null) {
                Intrinsics.r("view");
                throw null;
            }
            uploading = new LoadingFragment.Companion.DialogMode.Uploading(reason);
        }
        view.showDialog(uploading);
    }

    public final void startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release() {
        final SdkConfiguration.DocumentCapture documentCapture = this.onfidoRemoteConfig.getDocumentCapture();
        CompositeDisposable documentVideoRecordingCompositeDisposable = getDocumentVideoRecordingCompositeDisposable();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Maybe maybeFirstElement = Observable.interval(1L, timeUnit, this.schedulersProvider.getTimer()).subscribeOn(this.schedulersProvider.getComputation()).observeOn(this.schedulersProvider.getUi()).takeUntil(new igm.p() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$1
            public final boolean test(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    return view.hasValidRecording();
                }
                Intrinsics.r("view");
                throw null;
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }).filter(new igm.p() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$2
            public final boolean test(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    return view.hasValidRecording();
                }
                Intrinsics.r("view");
                throw null;
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }).timeout(documentCapture.getVideoTimeoutMs(), timeUnit, this.schedulersProvider.getTimer()).firstElement();
        igm.o oVar = new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$3
            @NotNull
            public final ObservableSource apply(long j2) {
                return Observable.intervalRange(0L, documentCapture.getVideoLengthMs(), 0L, 1L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer());
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }
        };
        maybeFirstElement.getClass();
        Disposable disposableSubscribe = new mgm.b(maybeFirstElement, oVar, 2).subscribeOn(this.schedulersProvider.getComputation()).observeOn(this.schedulersProvider.getUi()).filter(new igm.p() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$4
            public final boolean test(long j2) {
                return j2 == documentCapture.getTorchTurnOnTimeMs();
            }

            @Override // igm.p
            public /* bridge */ /* synthetic */ boolean test(Object obj2) {
                return test(((Number) obj2).longValue());
            }
        }).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$5
            public final void accept(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.enableTorch(true);
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startDocumentVideoRecordingTimer$6
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                this.this$0.onErrorVideoTaking$onfido_capture_sdk_core_release();
                Timber.INSTANCE.e(it8, "startDocumentVideoRecordingTimer failed", new Object[0]);
            }
        }, new c(this, 1));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(documentVideoRecordingCompositeDisposable, disposableSubscribe);
    }

    public final void startLivenessProcessing$onfido_capture_sdk_core_release(@NotNull final LivenessChallengesViewModel livenessChallengesViewModel) {
        Intrinsics.checkNotNullParameter(livenessChallengesViewModel, "livenessChallengesViewModel");
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableSubscribe = Observable.zip(this.livenessInteractor.getLivenessControlButtonSubject(), Observable.range(0, livenessChallengesViewModel.getChallenges().size() + 1), new igm.c() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$1
            @NotNull
            public final Integer apply(Unit unit, int i) {
                return Integer.valueOf(i);
            }

            @Override // igm.c
            public /* bridge */ /* synthetic */ Object apply(Object obj2, Object obj3) {
                return apply((Unit) obj2, ((Number) obj3).intValue());
            }
        }).concatMap(new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$2
            @NotNull
            public final ObservableSource apply(int i) {
                if (i >= livenessChallengesViewModel.getChallenges().size()) {
                    return Observable.empty();
                }
                return Observable.just(new Pair(new LivenessChallengeViewModel(i, livenessChallengesViewModel.getChallenges().get(i), i == v.j(livenessChallengesViewModel.getChallenges())), Long.valueOf(this.timeProvider.getCurrentTimestamp())));
            }

            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).intValue());
            }
        }).doOnNext(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$3
            @Override // igm.g
            public final void accept(@NotNull Pair<LivenessChallengeViewModel, Long> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                int index = ((LivenessChallengeViewModel) it8.f186385a).getIndex();
                if (index == 0) {
                    this.this$0.livenessInteractor.initializeLivenessVideoTimestamp();
                } else {
                    this.this$0.pushPerformedChallenge(livenessChallengesViewModel.getChallenges().get(index - 1));
                }
            }
        }).doOnSubscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$4
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                this.this$0.livenessInteractor.initializePerformedChallenges(livenessChallengesViewModel.getId());
            }
        }).doOnComplete(new com.onfido.android.sdk.capture.internal.analytics.inhouse.a(livenessChallengesViewModel, this, 3)).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$6
            @Override // igm.g
            public final void accept(@NotNull Pair<LivenessChallengeViewModel, Long> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                CapturePresenter.View view = this.this$0.view;
                if (view == null) {
                    Intrinsics.r("view");
                    throw null;
                }
                view.onNextChallenge((LivenessChallengeViewModel) it8.f186385a);
                view.removeDummyViewsAccessibility();
                view.makeToolbarTitleNotImportantForAccessibility();
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$7
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on liveness challenge provider: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
        CompositeDisposable faceDetectionCompositeDisposable = getFaceDetectionCompositeDisposable();
        long preRecordingInstructionsReadingTimeMilisseconds = this.livenessInteractor.getPreRecordingInstructionsReadingTimeMilisseconds();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Scheduler timer = this.schedulersProvider.getTimer();
        int i = Flowable.f163113a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(timer, "scheduler is null");
        w1 w1Var = new w1(Math.max(0L, preRecordingInstructionsReadingTimeMilisseconds), timer);
        igm.o oVar = new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$8$1
            @Override // igm.o
            public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                return apply(((Number) obj2).longValue());
            }

            @NotNull
            public final Publisher apply(long j2) {
                Flowable faceTrackingObservable = this.this$0.faceDetector.getFaceTrackingObservable();
                OnfidoConfig onfidoConfig = this.this$0.onfidoConfig;
                if (onfidoConfig == null) {
                    Intrinsics.r("onfidoConfig");
                    throw null;
                }
                long j3 = onfidoConfig.getManualLivenessCapture() ? 0L : 200L;
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                Scheduler timer2 = this.this$0.schedulersProvider.getTimer();
                faceTrackingObservable.getClass();
                Objects.requireNonNull(timeUnit2, "unit is null");
                Objects.requireNonNull(timer2, "scheduler is null");
                return new m(faceTrackingObservable, j3, timer2);
            }
        };
        int i2 = Flowable.f163113a;
        Disposable disposableI = w1Var.c(oVar, i2, i2).l(this.schedulersProvider.getComputation()).f(this.schedulersProvider.getUi()).i(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$8$2
            @Override // igm.g
            public final void accept(@NotNull FaceDetectionResult it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.onFaceDetected(it8);
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$8$3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on observing the face detection results: "), it8), new Object[0]);
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.onFaceDetectionTimeout();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(faceDetectionCompositeDisposable, disposableI);
        OnfidoConfig onfidoConfig = this.onfidoConfig;
        if (onfidoConfig == null) {
            Intrinsics.r("onfidoConfig");
            throw null;
        }
        Disposable disposableSubscribe2 = Observable.timer(onfidoConfig.getManualLivenessCapture() ? 0L : 5000L, timeUnit, this.schedulersProvider.getTimer()).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi()).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$8$4
            public final void accept(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.onFaceDetectionTimeout();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startLivenessProcessing$8$5
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on face detection timeout timer: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        RxExtensionsKt.plusAssign(faceDetectionCompositeDisposable, disposableSubscribe2);
    }

    public final void startOverlayDisplayTimer$onfido_capture_sdk_core_release() {
        CompositeDisposable compositeSubscription = getCompositeSubscription();
        Disposable disposableSubscribe = Observable.timer(4000L, TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).observeOn(this.schedulersProvider.getUi()).doOnNext(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startOverlayDisplayTimer$1
            public final void accept(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.hideDocumentOverlay();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }).subscribe(new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startOverlayDisplayTimer$2
            public final void accept(long j2) {
                CapturePresenter.View view = this.this$0.view;
                if (view != null) {
                    view.hideDocumentOverlay();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.ui.camera.CapturePresenter$startOverlayDisplayTimer$3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                Timber.INSTANCE.e(it8, a10.b.u(new StringBuilder("Error on startOverlayDisplayTimer: "), it8), new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeSubscription, disposableSubscribe);
    }

    public final void stop$onfido_capture_sdk_core_release() {
        getCompositeSubscription().d();
        this.nativeDetector.clearEdges();
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        view.hideDocumentOverlay();
        disposeAutocaptureSubscriptions();
        disposeFaceDetectionSubscriptions();
        stopFaceTracking$onfido_capture_sdk_core_release();
        stopMovementChallengeTimeout();
        this.shouldWaitForMRZExtractionResult = false;
        this.isMRZExtractionTimeExceeded = false;
        Job job2 = this.autoCaptureJob;
        if (job2 != null) {
            job2.f(null);
        }
    }

    public final void stopFaceTracking$onfido_capture_sdk_core_release() {
        getFaceTrackingCompositeDisposable().d();
        this.faceDetector.close();
    }

    public final void trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release() {
        this.captureTracker.trackCaptureButtonClicked$onfido_capture_sdk_core_release(getCaptureType(), this.currentCaptureFlowError, this.takenPhotoCount + 1, this.rejectionCount);
    }

    public final void trackCaptureBackButtonClicked$onfido_capture_sdk_core_release() {
        this.captureTracker.trackBackButtonClicked$onfido_capture_sdk_core_release(getCaptureType(), this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
    }

    public final void trackCaptureError$onfido_capture_sdk_core_release(@NotNull CaptureType captureType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        trackCaptureError$onfido_capture_sdk_core_release(captureType, null);
    }

    public final void trackConfirmationBackButtonClicked$onfido_capture_sdk_core_release() {
        this.livenessTracker.trackFaceConfirmationBackButtonClicked$onfido_capture_sdk_core_release(getCaptureType(), this.currentCaptureFlowError, this.takenPhotoCount, this.rejectionCount);
    }

    public final void trackLivenessChallenge$onfido_capture_sdk_core_release(int challengeIndex, @NotNull LivenessChallengeType challengeType) {
        Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        if (challengeIndex == 0) {
            this.captureTracker.trackVideoCaptureFirstChallenge$onfido_capture_sdk_core_release(challengeType);
        } else if (challengeIndex == 1) {
            this.captureTracker.trackVideoCaptureSecondChallenge$onfido_capture_sdk_core_release(challengeType);
        }
        String strName = challengeType.name();
        Locale locale = Locale.US;
        this.livenessTracker.trackLivenessChallenge$onfido_capture_sdk_core_release(challengeIndex + 1, p.a.r(locale, "US", strName, locale, "toLowerCase(...)"));
    }

    public final void trackUploadStarted$onfido_capture_sdk_core_release() {
        NFCOptions nfcOptions;
        CaptureTracker captureTracker = this.captureTracker;
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        CaptureStepDataBundle captureStepDataBundle = view.getCaptureStepDataBundle();
        int i = this.takenPhotoCount;
        int maxTotalRetries = this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries();
        boolean zShouldAutoCaptureDocument$onfido_capture_sdk_core_release = shouldAutoCaptureDocument$onfido_capture_sdk_core_release();
        boolean z = this.isAutoCaptured;
        boolean zIsValid = this.processingResults.getMrzValidationResult().isValid();
        NfcArguments nfcArguments = this.nfcArguments;
        captureTracker.trackUploadStarted(captureStepDataBundle, i, maxTotalRetries, zShouldAutoCaptureDocument$onfido_capture_sdk_core_release, z, zIsValid, (nfcArguments == null || (nfcOptions = nfcArguments.getNfcOptions()) == null) ? false : NFCOptionsKt.isEnabled(nfcOptions));
    }

    public final void trackVideoCaptureTimeout$onfido_capture_sdk_core_release() {
        this.captureTracker.trackVideoCaptureTimeout$onfido_capture_sdk_core_release();
    }

    public final void trackVideoFinishButtonClicked$onfido_capture_sdk_core_release(long duration) {
        this.captureTracker.trackVideoFinishButtonClicked$onfido_capture_sdk_core_release(duration);
    }

    public final void trackVideoNextButtonClicked$onfido_capture_sdk_core_release(long duration) {
        this.captureTracker.trackVideoNextButtonClicked$onfido_capture_sdk_core_release(duration);
    }

    public final void trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release() {
        this.captureTracker.trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release();
    }

    public final void uploadImageForValidation$onfido_capture_sdk_core_release(@NotNull byte[] jpegData) {
        Intrinsics.checkNotNullParameter(jpegData, "jpegData");
        View view = this.view;
        if (view == null) {
            Intrinsics.r("view");
            throw null;
        }
        DocumentType documentType = view.getDocumentType();
        View view2 = this.view;
        if (view2 == null) {
            Intrinsics.r("view");
            throw null;
        }
        List<Validation> requiredDocumentValidations$onfido_capture_sdk_core_release = getRequiredDocumentValidations$onfido_capture_sdk_core_release(documentType, view2.getDocSide());
        ArrayList arrayList = new ArrayList(w.t(requiredDocumentValidations$onfido_capture_sdk_core_release, 10));
        for (Validation validation : requiredDocumentValidations$onfido_capture_sdk_core_release) {
            if (isBackSideOfRomanianNationalId()) {
                validation = new Validation(validation.getValidationType(), ValidationLevel.WARNING);
            }
            arrayList.add(validation);
        }
        if (!this.onfidoRemoteConfig.isMediaCallbackCroppingDisabled()) {
            this.croppedImage = jpegData;
        }
        uploadDocumentMedia(arrayList, jpegData);
    }

    @NotNull
    public final SdkUploadMetaData sdkUploadMetadata$onfido_capture_sdk_core_release(@NotNull CaptureStepDataBundle captureStepDataBundle) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        return this.sdkUploadMetaDataHelper.create(this.processingResults, this.documentProcessingFailureAnalyzer.getProcessingFailureCounts().getBlurFailureCount(), isMRZExtracted(), this.takenPhotoCount, captureStepDataBundle);
    }

    public final void trackCaptureError$onfido_capture_sdk_core_release(@NotNull CaptureType captureType, ErrorType errorType) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        if (errorType != null) {
            if (captureType != CaptureType.DOCUMENT) {
                this.currentCaptureFlowError = errorType;
                if (captureType == CaptureType.FACE) {
                    this.captureTracker.trackFaceSelfieConfirmationUploadStatus$onfido_capture_sdk_core_release(this.timeProvider.getCurrentTimestamp() - this.faceSelfieUploadStartTime, errorType, this.takenPhotoCount, this.rejectionCount);
                    return;
                }
                return;
            }
            CaptureTracker captureTracker = this.captureTracker;
            View view = this.view;
            if (view != null) {
                captureTracker.trackDocumentCaptureError$onfido_capture_sdk_core_release(view.getDocSide());
            } else {
                Intrinsics.r("view");
                throw null;
            }
        }
    }
}
