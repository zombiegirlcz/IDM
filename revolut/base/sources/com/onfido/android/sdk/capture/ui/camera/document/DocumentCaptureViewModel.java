package com.onfido.android.sdk.capture.ui.camera.document;

import android.content.SharedPreferences;
import android.graphics.RectF;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor;
import com.onfido.android.sdk.capture.detector.rectangle.RectDetectionResult;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetectorEmpty;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.errors.ErrorDescriptor;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.config.DefaultOnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCaseResult;
import com.onfido.android.sdk.capture.internal.usecase.MediaCallbacksUseCase;
import com.onfido.android.sdk.capture.internal.usecase.NfcUseCase;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationResult;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationTargets;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.OnfidoRectF;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResultsFailureAnalyzer;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.ui.camera.DocumentService;
import com.onfido.android.sdk.capture.ui.camera.DocumentValidationWarningsBundleUtilsKt;
import com.onfido.android.sdk.capture.ui.camera.OverlayMetrics;
import com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult;
import com.onfido.android.sdk.capture.ui.camera.document.CameraState;
import com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureScreen;
import com.onfido.android.sdk.capture.ui.camera.exception.InvalidCertificateException;
import com.onfido.android.sdk.capture.ui.camera.exception.TokenExpiredException;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.ui.camera.util.DocumentValidationResultMapper;
import com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel;
import com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.DocumentUtils;
import com.onfido.android.sdk.capture.utils.ErrorTypeUtilsKt;
import com.onfido.android.sdk.capture.utils.FlowExtKt;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.ImageUtilsExtKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
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
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SdkUploadMetaData;
import dlk.k;
import gim.c;
import gim.d;
import gim.i;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import pkm.e;
import skm.e0;
import skm.k0;
import uc0.b;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.q0;
import vkm.t;
import vkm.t0;
import yhm.j;
import yhm.o;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000ò\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u0000 Â\u00042\u00020\u00012\u00020\u0002:\u000eÃ\u0004Â\u0004Ä\u0004Å\u0004Æ\u0004Ç\u0004È\u0004BÑ\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J!\u0010>\u001a\u00020;2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010A\u001a\u00020;H\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010F\u001a\u00020;2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010M\u001a\u00020;2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0004\bK\u0010LJ\u0019\u0010S\u001a\u00020P2\b\u0010O\u001a\u0004\u0018\u00010NH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010V\u001a\u00020GH\u0000¢\u0006\u0004\bT\u0010UJ\u000f\u0010X\u001a\u00020GH\u0000¢\u0006\u0004\bW\u0010UJ\u000f\u0010Z\u001a\u00020GH\u0000¢\u0006\u0004\bY\u0010UJ\u000f\u0010\\\u001a\u00020GH\u0000¢\u0006\u0004\b[\u0010UJ\u000f\u0010^\u001a\u00020GH\u0000¢\u0006\u0004\b]\u0010UJ\u0017\u0010b\u001a\u00020;2\u0006\u0010_\u001a\u00020GH\u0000¢\u0006\u0004\b`\u0010aJ\u0017\u0010f\u001a\u00020;2\u0006\u0010c\u001a\u00020NH\u0000¢\u0006\u0004\bd\u0010eJ\u000f\u0010h\u001a\u00020GH\u0000¢\u0006\u0004\bg\u0010UJ\u000f\u0010j\u001a\u00020GH\u0000¢\u0006\u0004\bi\u0010UJ\u0017\u0010o\u001a\u00020G2\u0006\u0010l\u001a\u00020kH\u0000¢\u0006\u0004\bm\u0010nJ\u000f\u0010q\u001a\u00020;H\u0000¢\u0006\u0004\bp\u0010@J\u000f\u0010s\u001a\u00020;H\u0000¢\u0006\u0004\br\u0010@J\u000f\u0010u\u001a\u00020;H\u0000¢\u0006\u0004\bt\u0010@J\u0017\u0010z\u001a\u00020;2\u0006\u0010w\u001a\u00020vH\u0000¢\u0006\u0004\bx\u0010yJ\u000f\u0010|\u001a\u00020;H\u0000¢\u0006\u0004\b{\u0010@J\u000f\u0010~\u001a\u00020;H\u0000¢\u0006\u0004\b}\u0010@J\u0010\u0010\u0080\u0001\u001a\u00020;H\u0000¢\u0006\u0004\b\u007f\u0010@J\u0011\u0010\u0082\u0001\u001a\u00020;H\u0000¢\u0006\u0005\b\u0081\u0001\u0010@J\u001c\u0010\u0087\u0001\u001a\u00020;2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J$\u0010\u008c\u0001\u001a\u00020;2\u0006\u0010w\u001a\u00020v2\b\u0010\u0089\u0001\u001a\u00030\u0088\u0001H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J-\u0010\u0094\u0001\u001a\u00020;2\u000f\u0010\u008f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001c\u0010\u0097\u0001\u001a\u00020;2\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J#\u0010\u009c\u0001\u001a\u00020;2\u0007\u0010\u0099\u0001\u001a\u00020v2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0011\u0010\u009e\u0001\u001a\u00020GH\u0000¢\u0006\u0005\b\u009d\u0001\u0010UJ\"\u0010£\u0001\u001a\u00020;2\u000e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020G0\u009f\u0001H\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0011\u0010¥\u0001\u001a\u00020;H\u0000¢\u0006\u0005\b¤\u0001\u0010@J\u0011\u0010§\u0001\u001a\u00020;H\u0000¢\u0006\u0005\b¦\u0001\u0010@J\u001c\u0010ª\u0001\u001a\u00020;2\b\u0010¨\u0001\u001a\u00030\u0095\u0001H\u0000¢\u0006\u0006\b©\u0001\u0010\u0098\u0001J\u0011\u0010¬\u0001\u001a\u00020GH\u0000¢\u0006\u0005\b«\u0001\u0010UJ$\u0010±\u0001\u001a\u00020G2\u0007\u0010\u00ad\u0001\u001a\u00020G2\u0007\u0010®\u0001\u001a\u00020GH\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J$\u0010³\u0001\u001a\u00020G2\u0007\u0010\u00ad\u0001\u001a\u00020G2\u0007\u0010®\u0001\u001a\u00020GH\u0000¢\u0006\u0006\b²\u0001\u0010°\u0001J$\u0010µ\u0001\u001a\u00020G2\u0007\u0010\u00ad\u0001\u001a\u00020G2\u0007\u0010®\u0001\u001a\u00020GH\u0000¢\u0006\u0006\b´\u0001\u0010°\u0001J$\u0010·\u0001\u001a\u00020G2\u0007\u0010\u00ad\u0001\u001a\u00020G2\u0007\u0010®\u0001\u001a\u00020GH\u0000¢\u0006\u0006\b¶\u0001\u0010°\u0001J\u0011\u0010¹\u0001\u001a\u00020;H\u0000¢\u0006\u0005\b¸\u0001\u0010@J\u0013\u0010½\u0001\u001a\u00030º\u0001H\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010À\u0001\u001a\u00020;2\u0006\u0010J\u001a\u00020IH\u0000¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u000f\u0010Á\u0001\u001a\u00020;¢\u0006\u0005\bÁ\u0001\u0010@J\u0011\u0010Ã\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÂ\u0001\u0010@J\u0011\u0010Å\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÄ\u0001\u0010@J\u0011\u0010Ç\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÆ\u0001\u0010@J\u000f\u0010È\u0001\u001a\u00020;¢\u0006\u0005\bÈ\u0001\u0010@J\u0011\u0010Ê\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÉ\u0001\u0010@J\u0011\u0010Ì\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bË\u0001\u0010@J\u0011\u0010Î\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÍ\u0001\u0010@J\u0011\u0010Ð\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÏ\u0001\u0010@J\u0011\u0010Ò\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÑ\u0001\u0010@J\u001c\u0010Õ\u0001\u001a\u00020;2\b\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0016¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0011\u0010Ø\u0001\u001a\u00020GH\u0000¢\u0006\u0005\b×\u0001\u0010UJ\u0011\u0010Ú\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÙ\u0001\u0010@J\u0011\u0010Ü\u0001\u001a\u00020;H\u0000¢\u0006\u0005\bÛ\u0001\u0010@J\u0011\u0010Ý\u0001\u001a\u00020;H\u0014¢\u0006\u0005\bÝ\u0001\u0010@J\u0011\u0010Þ\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bÞ\u0001\u0010@J\u0011\u0010ß\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bß\u0001\u0010@J\u0011\u0010à\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bà\u0001\u0010UJ\u0011\u0010á\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bá\u0001\u0010UJ\u0011\u0010â\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bâ\u0001\u0010UJ\u0011\u0010ã\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bã\u0001\u0010UJ\u0011\u0010ä\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bä\u0001\u0010UJ\u001b\u0010æ\u0001\u001a\u00030å\u00012\u0006\u0010_\u001a\u00020GH\u0002¢\u0006\u0006\bæ\u0001\u0010ç\u0001J\u0011\u0010è\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bè\u0001\u0010@J\u0011\u0010é\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bé\u0001\u0010UJ\u0011\u0010ê\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bê\u0001\u0010@J\u0011\u0010ë\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bë\u0001\u0010UJ\u0013\u0010í\u0001\u001a\u00030ì\u0001H\u0002¢\u0006\u0006\bí\u0001\u0010î\u0001J\u0011\u0010ï\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bï\u0001\u0010@J\u0011\u0010ð\u0001\u001a\u00020;H\u0002¢\u0006\u0005\bð\u0001\u0010@J\u0011\u0010ñ\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bñ\u0001\u0010UJ\u0011\u0010ò\u0001\u001a\u00020GH\u0002¢\u0006\u0005\bò\u0001\u0010UJ\u001c\u0010ô\u0001\u001a\u00020;2\b\u0010ó\u0001\u001a\u00030ì\u0001H\u0002¢\u0006\u0006\bô\u0001\u0010õ\u0001J\u001a\u0010÷\u0001\u001a\u00020;2\u0007\u0010ö\u0001\u001a\u00020vH\u0002¢\u0006\u0005\b÷\u0001\u0010yJ%\u0010ú\u0001\u001a\u00020;2\u0007\u0010ø\u0001\u001a\u00020k2\b\u0010\u0099\u0001\u001a\u00030ù\u0001H\u0002¢\u0006\u0006\bú\u0001\u0010û\u0001J\u001e\u0010ý\u0001\u001a\u00020;2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010ü\u0001H\u0002¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001a\u0010ÿ\u0001\u001a\u00020;2\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0006\bÿ\u0001\u0010\u0080\u0002J\u001a\u0010\u0081\u0002\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u0001H\u0002¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u0011\u0010\u0083\u0002\u001a\u00020GH\u0002¢\u0006\u0005\b\u0083\u0002\u0010UJ\u0011\u0010\u0084\u0002\u001a\u00020GH\u0002¢\u0006\u0005\b\u0084\u0002\u0010UJ\u001c\u0010\u0085\u0002\u001a\u00020;2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0085\u0002\u0010\u0086\u0002J\u001d\u0010\u0087\u0002\u001a\u00030\u0090\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002J\u001c\u0010\u0089\u0002\u001a\u00020;2\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0002¢\u0006\u0006\b\u0089\u0002\u0010\u0086\u0002J\u001c\u0010\u008c\u0002\u001a\u00030\u008b\u00022\u0007\u0010\u008a\u0002\u001a\u000207H\u0002¢\u0006\u0006\b\u008c\u0002\u0010\u008d\u0002J\u001c\u0010\u0090\u0002\u001a\u00020;2\b\u0010\u008f\u0002\u001a\u00030\u008e\u0002H\u0002¢\u0006\u0006\b\u0090\u0002\u0010\u0091\u0002J\u001c\u0010\u0092\u0002\u001a\u00020;2\b\u0010\u008f\u0002\u001a\u00030\u008e\u0002H\u0002¢\u0006\u0006\b\u0092\u0002\u0010\u0091\u0002J\u001c\u0010\u0094\u0002\u001a\u00020;2\b\u0010\u008f\u0002\u001a\u00030\u0093\u0002H\u0002¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u001c\u0010\u0097\u0002\u001a\u00020;2\b\u0010\u008f\u0002\u001a\u00030\u0096\u0002H\u0002¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J\u001c\u0010\u009a\u0002\u001a\u00020;2\b\u0010\u008f\u0002\u001a\u00030\u0099\u0002H\u0002¢\u0006\u0006\b\u009a\u0002\u0010\u009b\u0002JI\u0010£\u0002\u001a\u00020;2\b\u0010\u009c\u0002\u001a\u00030\u0095\u00012\b\u0010\u009d\u0002\u001a\u00030Ó\u00012\u0007\u0010\u009e\u0002\u001a\u00020G2\n\u0010 \u0002\u001a\u0005\u0018\u00010\u009f\u00022\f\b\u0002\u0010¢\u0002\u001a\u0005\u0018\u00010¡\u0002H\u0002¢\u0006\u0006\b£\u0002\u0010¤\u0002J\u001d\u0010¥\u0002\u001a\u00020;2\b\u0010\u0099\u0001\u001a\u00030ù\u0001H\u0082@¢\u0006\u0006\b¥\u0002\u0010¦\u0002J\u0011\u0010§\u0002\u001a\u00020;H\u0002¢\u0006\u0005\b§\u0002\u0010@J\u0011\u0010¨\u0002\u001a\u00020;H\u0002¢\u0006\u0005\b¨\u0002\u0010@J\u0011\u0010©\u0002\u001a\u00020;H\u0002¢\u0006\u0005\b©\u0002\u0010@J8\u0010®\u0002\u001a\u00020G2\u0007\u0010\u00ad\u0001\u001a\u00020G2\u0007\u0010®\u0001\u001a\u00020G2\b\u0010«\u0002\u001a\u00030ª\u00022\b\u0010\u00ad\u0002\u001a\u00030¬\u0002H\u0002¢\u0006\u0006\b®\u0002\u0010¯\u0002J-\u0010²\u0002\u001a\u00020G*\u0005\u0018\u00010ª\u00022\b\u0010°\u0002\u001a\u00030ª\u00022\b\u0010±\u0002\u001a\u00030¬\u0002H\u0002¢\u0006\u0006\b²\u0002\u0010³\u0002J\u001c\u0010¶\u0002\u001a\u00020;2\b\u0010µ\u0002\u001a\u00030´\u0002H\u0002¢\u0006\u0006\b¶\u0002\u0010·\u0002J\u0011\u0010¸\u0002\u001a\u00020;H\u0002¢\u0006\u0005\b¸\u0002\u0010@J*\u0010»\u0002\u001a\u00020;2\n\b\u0001\u0010¹\u0002\u001a\u00030º\u00012\n\b\u0001\u0010º\u0002\u001a\u00030º\u0001H\u0002¢\u0006\u0006\b»\u0002\u0010¼\u0002J\u001c\u0010½\u0002\u001a\u00020;2\b\u0010Ô\u0001\u001a\u00030Ó\u0001H\u0002¢\u0006\u0006\b½\u0002\u0010Ö\u0001J\u0011\u0010¾\u0002\u001a\u00020;H\u0002¢\u0006\u0005\b¾\u0002\u0010@J\u001c\u0010¿\u0002\u001a\u00020;2\b\u0010º\u0002\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b¿\u0002\u0010\u0098\u0001J\u0011\u0010À\u0002\u001a\u00020;H\u0002¢\u0006\u0005\bÀ\u0002\u0010@J\u0011\u0010Á\u0002\u001a\u00020;H\u0002¢\u0006\u0005\bÁ\u0002\u0010@J\u0011\u0010Â\u0002\u001a\u00020;H\u0002¢\u0006\u0005\bÂ\u0002\u0010@J\u001e\u0010Ã\u0002\u001a\u00020;2\n\u0010«\u0002\u001a\u0005\u0018\u00010ª\u0002H\u0002¢\u0006\u0006\bÃ\u0002\u0010Ä\u0002J#\u0010È\u0002\u001a\n\u0012\u0005\u0012\u00030Ç\u00020Æ\u00022\u0007\u0010Å\u0002\u001a\u00020GH\u0002¢\u0006\u0006\bÈ\u0002\u0010É\u0002J\u001c\u0010Ë\u0002\u001a\u00020;2\b\u0010\u0084\u0001\u001a\u00030Ê\u0002H\u0002¢\u0006\u0006\bË\u0002\u0010Ì\u0002J\u0011\u0010Í\u0002\u001a\u00020;H\u0002¢\u0006\u0005\bÍ\u0002\u0010@R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Î\u0002R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010Ï\u0002R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Ð\u0002R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Ñ\u0002R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ò\u0002R\u0015\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ó\u0002R\u0015\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010Ô\u0002R\u0015\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010Õ\u0002R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010Ö\u0002R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010×\u0002R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010Ø\u0002R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010Ù\u0002R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010Ú\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010Û\u0002R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010Ü\u0002R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010Ý\u0002R\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b$\u0010Þ\u0002R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010ß\u0002R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010à\u0002R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010á\u0002R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010â\u0002R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010ã\u0002R\u0015\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b0\u0010ä\u0002R\u0015\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010å\u0002R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010æ\u0002R*\u0010è\u0002\u001a\u00030ç\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bè\u0002\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002\"\u0006\bì\u0002\u0010í\u0002R\u001c\u0010î\u0002\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0002\u0010ï\u0002R\u0019\u0010ø\u0001\u001a\u00020k8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ð\u0002R\u001a\u0010ñ\u0002\u001a\u00030ù\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bñ\u0002\u0010ò\u0002R*\u0010ó\u0002\u001a\u00030å\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bó\u0002\u0010ô\u0002\u001a\u0006\bõ\u0002\u0010ö\u0002\"\u0006\b÷\u0002\u0010ø\u0002R)\u0010ù\u0002\u001a\u0002078\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bù\u0002\u0010ú\u0002\u001a\u0006\bû\u0002\u0010ü\u0002\"\u0006\bý\u0002\u0010þ\u0002R*\u0010«\u0002\u001a\u00030ª\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b«\u0002\u0010ÿ\u0002\u001a\u0006\b\u0080\u0003\u0010\u0081\u0003\"\u0006\b\u0082\u0003\u0010Ä\u0002R,\u0010\u00ad\u0002\u001a\u0005\u0018\u00010¬\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0002\u0010\u0083\u0003\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003\"\u0006\b\u0086\u0003\u0010\u0087\u0003R(\u0010c\u001a\u0004\u0018\u00010N8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bc\u0010\u0088\u0003\u001a\u0006\b\u0089\u0003\u0010\u008a\u0003\"\u0005\b\u008b\u0003\u0010eR,\u0010\u008d\u0003\u001a\u0005\u0018\u00010\u008c\u00038\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008d\u0003\u0010\u008e\u0003\u001a\u0006\b\u008f\u0003\u0010\u0090\u0003\"\u0006\b\u0091\u0003\u0010\u0092\u0003R\u0017\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bC\u0010\u0093\u0003R*\u0010\u0095\u0003\u001a\u00030\u0094\u00038\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0095\u0003\u0010\u0096\u0003\u001a\u0006\b\u0097\u0003\u0010\u0098\u0003\"\u0006\b\u0099\u0003\u0010\u009a\u0003R!\u0010\u009f\u0003\u001a\u00030\u0095\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0003\u0010\u009c\u0003\u001a\u0006\b\u009d\u0003\u0010\u009e\u0003R'\u0010 \u0003\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b \u0003\u0010¡\u0003\u001a\u0005\b¢\u0003\u0010U\"\u0005\b£\u0003\u0010aR%\u0010_\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b_\u0010¡\u0003\u001a\u0005\b¤\u0003\u0010U\"\u0005\b¥\u0003\u0010aR\u001a\u0010¦\u0003\u001a\u00030º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0003\u0010§\u0003R,\u0010¨\u0003\u001a\u0005\u0018\u00010Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0003\u0010©\u0003\u001a\u0006\bª\u0003\u0010«\u0003\"\u0006\b¬\u0003\u0010Ö\u0001R\u001c\u0010®\u0003\u001a\u0005\u0018\u00010\u00ad\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0003\u0010¯\u0003R3\u0010±\u0003\u001a\u00030º\u00012\b\u0010°\u0003\u001a\u00030º\u00018\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\b±\u0003\u0010§\u0003\u0012\u0005\b³\u0003\u0010@\u001a\u0006\b²\u0003\u0010¼\u0001R1\u0010ö\u0001\u001a\u0004\u0018\u00010v8\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\bö\u0001\u0010´\u0003\u0012\u0005\b¸\u0003\u0010@\u001a\u0006\bµ\u0003\u0010¶\u0003\"\u0005\b·\u0003\u0010yR3\u0010¹\u0003\u001a\u0005\u0018\u00010\u0090\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b¹\u0003\u0010º\u0003\u0012\u0005\b¾\u0003\u0010@\u001a\u0006\b»\u0003\u0010¼\u0003\"\u0006\b½\u0003\u0010\u0086\u0002R7\u0010À\u0003\u001a\u0005\u0018\u00010¿\u00032\n\u0010°\u0003\u001a\u0005\u0018\u00010¿\u00038\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\bÀ\u0003\u0010Á\u0003\u0012\u0005\bÄ\u0003\u0010@\u001a\u0006\bÂ\u0003\u0010Ã\u0003R\u001a\u0010Å\u0003\u001a\u00030ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0003\u0010Æ\u0003R\u001a\u0010Ç\u0003\u001a\u00030º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0003\u0010§\u0003R\u001a\u0010È\u0003\u001a\u00030º\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0003\u0010§\u0003R3\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008e\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008f\u0002\u0010É\u0003\u0012\u0005\bÍ\u0003\u0010@\u001a\u0006\bÊ\u0003\u0010Ë\u0003\"\u0006\bÌ\u0003\u0010\u0091\u0002R1\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0096\u0001\u0010ï\u0002\u0012\u0005\bÐ\u0003\u0010@\u001a\u0006\bÎ\u0003\u0010\u009e\u0003\"\u0006\bÏ\u0003\u0010\u0098\u0001R7\u0010Ñ\u0003\u001a\u0005\u0018\u00010\u0095\u00012\n\u0010°\u0003\u001a\u0005\u0018\u00010\u0095\u00018\u0000@BX\u0081\u000e¢\u0006\u0017\n\u0006\bÑ\u0003\u0010ï\u0002\u0012\u0005\bÓ\u0003\u0010@\u001a\u0006\bÒ\u0003\u0010\u009e\u0003R3\u0010:\u001a\u0004\u0018\u0001092\t\u0010°\u0003\u001a\u0004\u0018\u0001098\u0000@BX\u0081\u000e¢\u0006\u0016\n\u0005\b:\u0010Ô\u0003\u0012\u0005\b×\u0003\u0010@\u001a\u0006\bÕ\u0003\u0010Ö\u0003R\u0019\u0010Ø\u0003\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0003\u0010¡\u0003R\u0019\u0010Ù\u0003\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0003\u0010¡\u0003R9\u0010Þ\u0003\u001a$\u0012\u0005\u0012\u00030Û\u0003\u0012\u0005\u0012\u00030Ü\u00030Ú\u0003j\u0011\u0012\u0005\u0012\u00030Û\u0003\u0012\u0005\u0012\u00030Ü\u0003`Ý\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0003\u0010ß\u0003R\u0018\u0010á\u0003\u001a\u00030à\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0003\u0010â\u0003R\u001c\u0010ä\u0003\u001a\u0005\u0018\u00010ã\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0003\u0010å\u0003R\u001c\u0010æ\u0003\u001a\u0005\u0018\u00010ã\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0003\u0010å\u0003R\u001c\u0010ç\u0003\u001a\u0005\u0018\u00010ã\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0003\u0010å\u0003R\u001b\u0010è\u0003\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0003\u0010é\u0003R!\u0010î\u0003\u001a\u00030ê\u00038BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bë\u0003\u0010\u009c\u0003\u001a\u0006\bì\u0003\u0010í\u0003R!\u0010ð\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010º\u00010ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0003\u0010ñ\u0003R)\u0010ó\u0003\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010º\u00010ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bó\u0003\u0010ô\u0003\u001a\u0006\bõ\u0003\u0010ö\u0003R&\u0010ø\u0003\u001a\t\u0012\u0004\u0012\u00020G0÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bø\u0003\u0010ù\u0003\u001a\u0006\bú\u0003\u0010û\u0003R\u001f\u0010ý\u0003\u001a\n\u0012\u0005\u0012\u00030ü\u00030ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0003\u0010ñ\u0003R'\u0010þ\u0003\u001a\n\u0012\u0005\u0012\u00030ü\u00030ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bþ\u0003\u0010ô\u0003\u001a\u0006\bÿ\u0003\u0010ö\u0003R \u0010\u0080\u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0004\u0010ñ\u0003R(\u0010\u0081\u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0081\u0004\u0010ô\u0003\u001a\u0006\b\u0082\u0004\u0010ö\u0003R\u001f\u0010\u0084\u0004\u001a\n\u0012\u0005\u0012\u00030\u0083\u00040ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0004\u0010ñ\u0003R'\u0010\u0085\u0004\u001a\n\u0012\u0005\u0012\u00030\u0083\u00040ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0085\u0004\u0010ô\u0003\u001a\u0006\b\u0086\u0004\u0010ö\u0003R&\u0010\u0087\u0004\u001a\t\u0012\u0004\u0012\u00020v0÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0004\u0010ù\u0003\u001a\u0006\b\u0088\u0004\u0010û\u0003R&\u0010\u0089\u0004\u001a\t\u0012\u0004\u0012\u00020G0÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0004\u0010ù\u0003\u001a\u0006\b\u008a\u0004\u0010û\u0003R\u001e\u0010\u008b\u0004\u001a\t\u0012\u0004\u0012\u00020G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0004\u0010ñ\u0003R&\u0010\u008c\u0004\u001a\t\u0012\u0004\u0012\u00020G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0004\u0010ô\u0003\u001a\u0006\b\u008d\u0004\u0010ö\u0003R'\u0010\u008f\u0004\u001a\n\u0012\u0005\u0012\u00030\u008e\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008f\u0004\u0010ù\u0003\u001a\u0006\b\u0090\u0004\u0010û\u0003R'\u0010\u0092\u0004\u001a\n\u0012\u0005\u0012\u00030\u0091\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0004\u0010ù\u0003\u001a\u0006\b\u0093\u0004\u0010û\u0003R'\u0010\u0094\u0004\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0094\u0004\u0010ù\u0003\u001a\u0006\b\u0095\u0004\u0010û\u0003R'\u0010\u0097\u0004\u001a\n\u0012\u0005\u0012\u00030\u0096\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0097\u0004\u0010ù\u0003\u001a\u0006\b\u0098\u0004\u0010û\u0003R'\u0010\u009a\u0004\u001a\n\u0012\u0005\u0012\u00030\u0099\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009a\u0004\u0010ù\u0003\u001a\u0006\b\u009b\u0004\u0010û\u0003R'\u0010\u009d\u0004\u001a\n\u0012\u0005\u0012\u00030\u009c\u00040ï\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0004\u0010ñ\u0003\u001a\u0006\b\u009e\u0004\u0010\u009f\u0004R \u0010 \u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0004\u0010ñ\u0003R(\u0010¡\u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¡\u0004\u0010ô\u0003\u001a\u0006\b¢\u0004\u0010ö\u0003R!\u0010¤\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010£\u00040ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0004\u0010ñ\u0003R)\u0010¥\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010£\u00040ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¥\u0004\u0010ô\u0003\u001a\u0006\b¦\u0004\u0010ö\u0003R!\u0010¨\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010§\u00040ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0004\u0010ñ\u0003R)\u0010©\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010§\u00040ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b©\u0004\u0010ô\u0003\u001a\u0006\bª\u0004\u0010ö\u0003R&\u0010«\u0004\u001a\t\u0012\u0004\u0012\u00020G0÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b«\u0004\u0010ù\u0003\u001a\u0006\b¬\u0004\u0010û\u0003R&\u0010\u00ad\u0004\u001a\t\u0012\u0004\u0012\u00020G0÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0004\u0010ù\u0003\u001a\u0006\b®\u0004\u0010û\u0003R'\u0010¯\u0004\u001a\n\u0012\u0005\u0012\u00030Ç\u00020÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¯\u0004\u0010ù\u0003\u001a\u0006\b°\u0004\u0010û\u0003R'\u0010²\u0004\u001a\n\u0012\u0005\u0012\u00030±\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b²\u0004\u0010ù\u0003\u001a\u0006\b³\u0004\u0010û\u0003R'\u0010µ\u0004\u001a\n\u0012\u0005\u0012\u00030´\u00040÷\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bµ\u0004\u0010ù\u0003\u001a\u0006\b¶\u0004\u0010û\u0003R \u0010·\u0004\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010B0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0004\u0010ñ\u0003R!\u0010¸\u0004\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ù\u00010ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0004\u0010ñ\u0003R\u001e\u0010¹\u0004\u001a\t\u0012\u0004\u0012\u00020G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0004\u0010ñ\u0003R&\u0010º\u0004\u001a\t\u0012\u0004\u0012\u00020G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bº\u0004\u0010ô\u0003\u001a\u0006\b»\u0004\u0010ö\u0003R\u001e\u0010¼\u0004\u001a\t\u0012\u0004\u0012\u00020G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0004\u0010ñ\u0003R&\u0010½\u0004\u001a\t\u0012\u0004\u0012\u00020G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b½\u0004\u0010ô\u0003\u001a\u0006\b¾\u0004\u0010ö\u0003R\u001e\u0010¿\u0004\u001a\t\u0012\u0004\u0012\u00020G0ï\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0004\u0010ñ\u0003R&\u0010À\u0004\u001a\t\u0012\u0004\u0012\u00020G0ò\u00038\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÀ\u0004\u0010ô\u0003\u001a\u0006\bÁ\u0004\u0010ö\u0003¨\u0006É\u0004"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "documentConfigurationManager", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "nativeDetector", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "sdkUploadMetaDataHelper", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;", "documentService", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;", "uploadServiceFactory", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;", "rectangleDetector", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "storage", "Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;", "backendDocumentValidationsManager", "Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;", "postCaptureDocumentValidationsManager", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;", "documentProcessingFailureAnalyzer", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;", "documentDelayTransformer", "Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;", "mediaCallbacksUseCase", "Lcom/onfido/android/sdk/capture/internal/usecase/NfcUseCase;", "nfcUseCase", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;", "accessibleDocumentCaptureUseCase", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "timeProvider", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureTracker;", "documentCaptureTracker", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "barcodeValidationSuspender", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "retainableValidationsResult", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "dispatchersProvider", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "environmentIntegrityChecker", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "imageUtils", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;", "mrzDocumentExtractor", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;", "documentValidationUseCase", "<init>", "(Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;Lcom/onfido/android/sdk/capture/internal/usecase/NfcUseCase;Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureTracker;Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;Lcom/onfido/android/sdk/capture/utils/ImageUtils;Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;)V", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "captureDataBundle", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "nfcArguments", "", "setCaptureData$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;Lcom/onfido/android/sdk/capture/flow/NfcArguments;)V", "setCaptureData", "onViewResumed$onfido_capture_sdk_core_release", "()V", "onViewResumed", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "overlayMetrics", "onOverlayMetrics$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "onOverlayMetrics", "", "isFirstStart", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "orientation", "prepareCaptureStart$onfido_capture_sdk_core_release", "(ZLcom/onfido/android/sdk/capture/ui/options/Orientation;)V", "prepareCaptureStart", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "forFormat", "Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "getCaptureFrameContentDescription$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentFormat;)Lcom/onfido/android/sdk/capture/utils/StringRepresentation;", "getCaptureFrameContentDescription", "shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release", "()Z", "shouldHideManualDocumentCaptureButton", "isCutoffImprovementsEnabled$onfido_capture_sdk_core_release", "isCutoffImprovementsEnabled", "isFourByThreeEnabled$onfido_capture_sdk_core_release", "isFourByThreeEnabled", "hasNativeLibrary$onfido_capture_sdk_core_release", "hasNativeLibrary", "isAddressPageBackCapture$onfido_capture_sdk_core_release", "isAddressPageBackCapture", "isProofOfAddress", "initDocumentTypeUIModel$onfido_capture_sdk_core_release", "(Z)V", "initDocumentTypeUIModel", "documentFormat", "onDocumentFormatSelected$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/DocumentFormat;)V", "onDocumentFormatSelected", "shouldAutoCaptureDocument$onfido_capture_sdk_core_release", "shouldAutoCaptureDocument", "isDarkModeEnabled$onfido_capture_sdk_core_release", "isDarkModeEnabled", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "results", "isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)Z", "isDocumentFrameValidForAutoCapture", "onCameraStarted$onfido_capture_sdk_core_release", "onCameraStarted", "onManualFallbackDelayFinished$onfido_capture_sdk_core_release", "onManualFallbackDelayFinished", "onPictureCaptureFailed$onfido_capture_sdk_core_release", "onPictureCaptureFailed", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "image", "onPictureCaptured$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;)V", "onPictureCaptured", "onCaptureConfirmed$onfido_capture_sdk_core_release", "onCaptureConfirmed", "onCaptureErrorConfirmed$onfido_capture_sdk_core_release", "onCaptureErrorConfirmed", "onCaptureDiscarded$onfido_capture_sdk_core_release", "onCaptureDiscarded", "onCaptureScreenOpened$onfido_capture_sdk_core_release", "onCaptureScreenOpened", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;", "result", "onCaptureCompleted$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;)V", "onCaptureCompleted", "Landroid/graphics/RectF;", "outerLimits", "applyPostCaptureValidations$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;Landroid/graphics/RectF;)V", "applyPostCaptureValidations", "", "Lcom/onfido/android/sdk/capture/validation/Validation;", "validations", "", "jpegData", "uploadDocumentMedia$onfido_capture_sdk_core_release", "(Ljava/util/List;[B)V", "uploadDocumentMedia", "", "documentVideoId", "onDocumentVideoUploaded", "(Ljava/lang/String;)V", "frame", "onNextFrame$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;)V", "onNextFrame", "shouldRecordDocumentVideo$onfido_capture_sdk_core_release", "shouldRecordDocumentVideo", "Lkotlin/Function0;", "hasValidRecording", "startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release", "(Lkotlin/jvm/functions/Function0;)V", "startDocumentVideoRecordingTimer", "onVideoRecordingStopped$onfido_capture_sdk_core_release", "onVideoRecordingStopped", "onErrorVideoRecording$onfido_capture_sdk_core_release", "onErrorVideoRecording", "filePath", "onVideoCaptured$onfido_capture_sdk_core_release", "onVideoCaptured", "shouldShowInitialOverlay$onfido_capture_sdk_core_release", "shouldShowInitialOverlay", "isFrontSide", "isOverlayGone", "shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release", "(ZZ)Z", "shouldShowFrenchDLOverlay", "shouldShowGermanDLOverlay$onfido_capture_sdk_core_release", "shouldShowGermanDLOverlay", "shouldShowItalianIDOverlay$onfido_capture_sdk_core_release", "shouldShowItalianIDOverlay", "shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release", "shouldShowSouthAfricanIDOverlay", "startOverlayDisplayTimer$onfido_capture_sdk_core_release", "startOverlayDisplayTimer", "", "getOverlayLayout$onfido_capture_sdk_core_release", "()I", "getOverlayLayout", "trackCapture$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/options/Orientation;)V", "trackCapture", "trackWaitingScreenCompleted", "trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release", "trackVideoTimeoutRetryButtonClicked", "trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release", "trackAutocaptureShutterButtonClick", "trackCaptureError$onfido_capture_sdk_core_release", "trackCaptureError", "trackVideoCaptureTimeout", "trackStartPerformanceEvent$onfido_capture_sdk_core_release", "trackStartPerformanceEvent", "trackEndPerformanceEvent$onfido_capture_sdk_core_release", "trackEndPerformanceEvent", "trackDocumentConfirmationStep$onfido_capture_sdk_core_release", "trackDocumentConfirmationStep", "trackUploadStarted$onfido_capture_sdk_core_release", "trackUploadStarted", "trackCaptureBackButtonClicked$onfido_capture_sdk_core_release", "trackCaptureBackButtonClicked", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "errorType", "onUploadError", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "shouldEnableAccessibilityCapture$onfido_capture_sdk_core_release", "shouldEnableAccessibilityCapture", "reset$onfido_capture_sdk_core_release", "reset", "onCaptureButtonClicked$onfido_capture_sdk_core_release", "onCaptureButtonClicked", "onCleared", "startManualFallbackTimer", "checkDocumentFormat", "isCameraXEnabled", "isCheckingImageQuality", "shouldForceRetry", "isBackSideOfRomanianNationalId", "isMrzDetectionEnabled", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "getDocumentTypeUIModel", "(Z)Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "onFoldedFormat", "shouldAutocapture", "observeAutoCapture", "isMlModelAutoCaptureEnabled", "", "getPictureCapturedAnimationDelay", "()J", "callMediaCallback", "trackDocumentCaptureFlowCompleted", "isFinalStepForDocument", "backSideCaptureNeeded", "animationDelayMs", "applyValidationsAfterAnimationDelay", "(J)V", "capturedImage", "onCaptureForProofOfAddressDone", "processingResults", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "onPostCaptureValidationsFinished", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;)V", "Lcom/onfido/android/sdk/capture/validation/device/MRZValidationResult;", "setMRZResult", "(Lcom/onfido/android/sdk/capture/validation/device/MRZValidationResult;)V", "analyseProcessingResults", "(Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;)V", "getRequiredDocumentValidations", "()Ljava/util/List;", "shouldUploadDocument", "isDocumentUploaded", "uploadDocument", "([B)V", "cropImage", "([B)[B", "uploadImageForValidation", "captureStepDataBundle", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "sdkUploadMetadata", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)Lcom/onfido/api/client/data/SdkUploadMetaData;", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "uploadBinaryResult", "onBinaryUploaded", "(Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;)V", "checkUploadBinaryResult", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$BinaryUploaded;", "checkBinaryUploadedResult", "(Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$BinaryUploaded;)V", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$NfcPropertiesFetched;", "checkNfcPropertiesFetchedBinaryResult", "(Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$NfcPropertiesFetched;)V", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$Error;", "checkErrorBinaryResult", "(Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$Error;)V", "documentId", "warning", "nfcSupported", "Lcom/onfido/api/client/data/DocumentValidationWarningsBundle;", "warningsBundle", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcProperties", "showWarningBinaryResult", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/upload/ErrorType;ZLcom/onfido/api/client/data/DocumentValidationWarningsBundle;Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;)V", "processFrameForMRZ", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onErrorVideoTaking", "stopDocumentRecording", "stopDocumentVideoRecordingAndCameraFeed", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "shouldShowOverlay", "(ZZLcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "type", "country", "isFolded", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;)Z", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "mode", "showLoading", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "hideLoading", "title", "message", "showErrorMessage", "(II)V", "onUploadValidationError", "onTokenExpired", "onInvalidCertificateDetected", "onUploadFailure", "onUploadFailureWithGeoblocking", "onGeneralUploadError", "enableAccessibilityCapture", "(Lcom/onfido/android/sdk/capture/DocumentType;)V", "isPassport", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "getRectangleDetectorObservable", "(Z)Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult;", "processAccessibleDocumentCaptureResult", "(Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult;)V", "disposeAutocaptureSubscriptions", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "Lcom/onfido/android/sdk/capture/native_detector/NativeDetector;", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentService;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectangleDetector;", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "Lcom/onfido/android/sdk/capture/validation/BackendDocumentValidationsManager;", "Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResultsFailureAnalyzer;", "Lcom/onfido/android/sdk/capture/ui/camera/rx/DocumentCaptureDelayTransformer;", "Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;", "Lcom/onfido/android/sdk/capture/internal/usecase/NfcUseCase;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCase;", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureTracker;", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocumentExtractor;", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationUseCase;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureResultConsumer;", "documentCaptureResultConsumer", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureResultConsumer;", "getDocumentCaptureResultConsumer$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureResultConsumer;", "setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureResultConsumer;)V", "extraFileInfo", "Ljava/lang/String;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "docFrame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "documentTypeUIModel", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "getDocumentTypeUIModel$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "setDocumentTypeUIModel$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;)V", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "getDocumentData$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "setDocumentData$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;)V", "Lcom/onfido/android/sdk/capture/DocumentType;", "getDocumentType$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/DocumentType;", "setDocumentType$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getCountryCode$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "setCountryCode$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "getDocumentFormat$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/DocumentFormat;", "setDocumentFormat$onfido_capture_sdk_core_release", "Lcom/onfido/api/client/data/DocSide;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "getDocumentSide$onfido_capture_sdk_core_release", "()Lcom/onfido/api/client/data/DocSide;", "setDocumentSide$onfido_capture_sdk_core_release", "(Lcom/onfido/api/client/data/DocSide;)V", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayMetrics;", "Ljava/io/File;", "capturedFilesDir", "Ljava/io/File;", "getCapturedFilesDir$onfido_capture_sdk_core_release", "()Ljava/io/File;", "setCapturedFilesDir$onfido_capture_sdk_core_release", "(Ljava/io/File;)V", "poaCaptureSessionId$delegate", "Lkotlin/Lazy;", "getPoaCaptureSessionId", "()Ljava/lang/String;", "poaCaptureSessionId", "isAutoCaptured", "Z", "isAutoCaptured$onfido_capture_sdk_core_release", "setAutoCaptured$onfido_capture_sdk_core_release", "isProofOfAddress$onfido_capture_sdk_core_release", "setProofOfAddress$onfido_capture_sdk_core_release", "rejectionCount", "I", "currentCaptureFlowError", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "getCurrentCaptureFlowError$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "setCurrentCaptureFlowError$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "documentValidationTarget", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationTargets;", "<set-?>", "takenPhotoCount", "getTakenPhotoCount$onfido_capture_sdk_core_release", "getTakenPhotoCount$onfido_capture_sdk_core_release$annotations", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "getCapturedImage$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "setCapturedImage$onfido_capture_sdk_core_release", "getCapturedImage$onfido_capture_sdk_core_release$annotations", "croppedImage", "[B", "getCroppedImage$onfido_capture_sdk_core_release", "()[B", "setCroppedImage$onfido_capture_sdk_core_release", "getCroppedImage$onfido_capture_sdk_core_release$annotations", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "extractedMRZDocument", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "getExtractedMRZDocument$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "getExtractedMRZDocument$onfido_capture_sdk_core_release$annotations", "firstFrameEmitTime", "J", "emittedFramesCount", "processedFramesCount", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "getUploadBinaryResult$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "setUploadBinaryResult$onfido_capture_sdk_core_release", "getUploadBinaryResult$onfido_capture_sdk_core_release$annotations", "getDocumentVideoId$onfido_capture_sdk_core_release", "setDocumentVideoId$onfido_capture_sdk_core_release", "getDocumentVideoId$onfido_capture_sdk_core_release$annotations", "capturedVideoFilePath", "getCapturedVideoFilePath$onfido_capture_sdk_core_release", "getCapturedVideoFilePath$onfido_capture_sdk_core_release$annotations", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "getNfcArguments$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "getNfcArguments$onfido_capture_sdk_core_release$annotations", "isMRZExtractionTimeExceeded", "shouldWaitForMRZExtractionResult", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/validation/MRZDataType;", "Lcom/onfido/android/sdk/capture/validation/MRZData;", "Lkotlin/collections/HashMap;", "mrzExtractionResultMap", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/ui/camera/util/DocumentValidationResultMapper;", "documentValidaMapper", "Lcom/onfido/android/sdk/capture/ui/camera/util/DocumentValidationResultMapper;", "Lkotlinx/coroutines/Job;", "autocaptureFallbackJob", "Lkotlinx/coroutines/Job;", "autoCaptureJob", "imageProcessingJob", "edgeDetectionFallbackTimerReached", "Ljava/lang/Boolean;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "uploadService$delegate", "getUploadService", "()Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "uploadService", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_docFormatDialogTitleFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "docFormatDialogTitleFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getDocFormatDialogTitleFlow$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "shouldHideOverlay", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getShouldHideOverlay$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/onfido/android/sdk/capture/ui/camera/document/CameraState;", "_cameraState", "cameraState", "getCameraState$onfido_capture_sdk_core_release", "_startVideoRecording", "startVideoRecording", "getStartVideoRecording$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$VideoRecordingEvent;", "_showVideoRecordingInfo", "showVideoRecordingInfo", "getShowVideoRecordingInfo$onfido_capture_sdk_core_release", "applyValidationsFlow", "getApplyValidationsFlow$onfido_capture_sdk_core_release", "hidePostCaptureValidationBubbleFlow", "getHidePostCaptureValidationBubbleFlow$onfido_capture_sdk_core_release", "_shouldEnableTorch", "shouldEnableTorch", "getShouldEnableTorch$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ShowConfirmationEvent;", "showConfirmationFlow", "getShowConfirmationFlow$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ValidCaptureEvent;", "validCaptureFlow", "getValidCaptureFlow$onfido_capture_sdk_core_release", "captureResult", "getCaptureResult$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ErrorMessageEvent;", "errorMessageFlow", "getErrorMessageFlow$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "errorDescriptorFlow", "getErrorDescriptorFlow$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent;", "loadingFlow", "getLoadingFlow$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "_startCapture", "startCapture", "getStartCapture$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$Content;", "_showLiveValidation", "showLiveValidation", "getShowLiveValidation$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "_liveValidationBubbleVisibility", "liveValidationBubbleVisibility", "getLiveValidationBubbleVisibility$onfido_capture_sdk_core_release", "imageProcessingFinished", "getImageProcessingFinished$onfido_capture_sdk_core_release", "manualFallbackDelayFinished", "getManualFallbackDelayFinished$onfido_capture_sdk_core_release", "accessibleCaptureRectangleDetection", "getAccessibleCaptureRectangleDetection$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult$DocumentPositionChanged;", "accessibleCaptureResult", "getAccessibleCaptureResult$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$BinaryUploadWarningEvent;", "binaryUploadWarning", "getBinaryUploadWarning$onfido_capture_sdk_core_release", "overlayMetricsStateFlow", "documentFrame", "_captureButtonVisibility", "captureButtonVisibility", "getCaptureButtonVisibility$onfido_capture_sdk_core_release", "_shouldOpenCaptureScreen", "shouldOpenCaptureScreen", "getShouldOpenCaptureScreen$onfido_capture_sdk_core_release", "_shouldShowCaptureErrorDialog", "shouldShowCaptureErrorDialog", "getShouldShowCaptureErrorDialog$onfido_capture_sdk_core_release", "Companion", "BinaryUploadWarningEvent", "ErrorMessageEvent", "LoadingEvent", "ShowConfirmationEvent", "ValidCaptureEvent", "VideoRecordingEvent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentCaptureViewModel extends ViewModel implements CaptureUploadServiceListener {
    private static final long CONFIRMATION_VIEW_ANIM_DELAY = 1200;
    private static final long MANUAL_FALLBACK_DELAY_MS = 7000;
    private static final long OVERLAY_DELAY_MS = 4000;

    @NotNull
    private final MutableStateFlow _cameraState;

    @NotNull
    private final MutableStateFlow _captureButtonVisibility;

    @NotNull
    private final MutableStateFlow _docFormatDialogTitleFlow;

    @NotNull
    private final MutableStateFlow _liveValidationBubbleVisibility;

    @NotNull
    private final MutableStateFlow _shouldEnableTorch;

    @NotNull
    private final MutableStateFlow _shouldOpenCaptureScreen;

    @NotNull
    private final MutableStateFlow _shouldShowCaptureErrorDialog;

    @NotNull
    private final MutableStateFlow _showLiveValidation;

    @NotNull
    private final MutableStateFlow _showVideoRecordingInfo;

    @NotNull
    private final MutableStateFlow _startCapture;

    @NotNull
    private final MutableStateFlow _startVideoRecording;

    @NotNull
    private final MutableSharedFlow accessibleCaptureRectangleDetection;

    @NotNull
    private final MutableSharedFlow accessibleCaptureResult;

    @NotNull
    private final AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase;

    @NotNull
    private final AnnouncementService announcementService;

    @NotNull
    private final MutableSharedFlow applyValidationsFlow;
    private Job autoCaptureJob;
    private Job autocaptureFallbackJob;

    @NotNull
    private final BackendDocumentValidationsManager backendDocumentValidationsManager;

    @NotNull
    private final BarcodeValidationSuspender barcodeValidationSuspender;

    @NotNull
    private final MutableSharedFlow binaryUploadWarning;

    @NotNull
    private final StateFlow cameraState;

    @NotNull
    private final StateFlow captureButtonVisibility;

    @NotNull
    private final MutableSharedFlow captureResult;
    public File capturedFilesDir;
    private OnfidoImage capturedImage;
    private String capturedVideoFilePath;
    private CountryCode countryCode;
    private byte[] croppedImage;
    private ErrorType currentCaptureFlowError;

    @NotNull
    private final DispatchersProvider dispatchersProvider;

    @NotNull
    private final StateFlow docFormatDialogTitleFlow;
    private DocumentDetectionFrame docFrame;
    public DocumentCaptureResultConsumer documentCaptureResultConsumer;

    @NotNull
    private final DocumentCaptureTracker documentCaptureTracker;

    @NotNull
    private final DocumentConfigurationManager documentConfigurationManager;
    public CaptureStepDataBundle documentData;

    @NotNull
    private final DocumentCaptureDelayTransformer documentDelayTransformer;
    private DocumentFormat documentFormat;

    @NotNull
    private final MutableStateFlow documentFrame;

    @NotNull
    private final DocumentProcessingResultsFailureAnalyzer documentProcessingFailureAnalyzer;

    @NotNull
    private final DocumentService documentService;
    private DocSide documentSide;
    public DocumentType documentType;
    public DocumentTypeUIModel documentTypeUIModel;

    @NotNull
    private final DocumentValidationResultMapper documentValidaMapper;
    private DocumentValidationTargets documentValidationTarget;

    @NotNull
    private final DocumentValidationUseCase documentValidationUseCase;

    @NotNull
    private String documentVideoId;
    private Boolean edgeDetectionFallbackTimerReached;
    private int emittedFramesCount;

    @NotNull
    private final EnvironmentIntegrityChecker environmentIntegrityChecker;

    @NotNull
    private final MutableSharedFlow errorDescriptorFlow;

    @NotNull
    private final MutableSharedFlow errorMessageFlow;
    private String extraFileInfo;
    private MRZDocument extractedMRZDocument;
    private long firstFrameEmitTime;

    @NotNull
    private final MutableSharedFlow hidePostCaptureValidationBubbleFlow;

    @NotNull
    private final MutableSharedFlow imageProcessingFinished;
    private Job imageProcessingJob;

    @NotNull
    private final ImageUtils imageUtils;
    private boolean isAutoCaptured;
    private boolean isMRZExtractionTimeExceeded;
    private boolean isProofOfAddress;

    @NotNull
    private final StateFlow liveValidationBubbleVisibility;

    @NotNull
    private final MutableStateFlow loadingFlow;

    @NotNull
    private final MutableSharedFlow manualFallbackDelayFinished;

    @NotNull
    private final MediaCallbacksUseCase mediaCallbacksUseCase;

    @NotNull
    private final MRZDocumentExtractor mrzDocumentExtractor;

    @NotNull
    private final HashMap<MRZDataType, MRZData> mrzExtractionResultMap;

    @NotNull
    private final NativeDetector nativeDetector;
    private NfcArguments nfcArguments;

    @NotNull
    private final NfcUseCase nfcUseCase;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;
    private OverlayMetrics overlayMetrics;

    @NotNull
    private final MutableStateFlow overlayMetricsStateFlow;

    /* JADX INFO: renamed from: poaCaptureSessionId$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy poaCaptureSessionId;

    @NotNull
    private final PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager;
    private int processedFramesCount;

    @NotNull
    private DocumentProcessingResults processingResults;

    @NotNull
    private final RectangleDetector rectangleDetector;
    private int rejectionCount;

    @NotNull
    private final RetainableValidationsResult retainableValidationsResult;

    @NotNull
    private final SdkUploadMetadataHelper sdkUploadMetaDataHelper;

    @NotNull
    private final StateFlow shouldEnableTorch;

    @NotNull
    private final MutableSharedFlow shouldHideOverlay;

    @NotNull
    private final StateFlow shouldOpenCaptureScreen;

    @NotNull
    private final StateFlow shouldShowCaptureErrorDialog;
    private boolean shouldWaitForMRZExtractionResult;

    @NotNull
    private final MutableSharedFlow showConfirmationFlow;

    @NotNull
    private final StateFlow showLiveValidation;

    @NotNull
    private final StateFlow showVideoRecordingInfo;

    @NotNull
    private final StateFlow startCapture;

    @NotNull
    private final StateFlow startVideoRecording;

    @NotNull
    private final SharedPreferencesDataSource storage;
    private int takenPhotoCount;

    @NotNull
    private final TimeProvider timeProvider;
    private UploadBinaryResult uploadBinaryResult;

    /* JADX INFO: renamed from: uploadService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy uploadService;

    @NotNull
    private final CaptureUploadService.Factory uploadServiceFactory;

    @NotNull
    private final MutableSharedFlow validCaptureFlow;

    @NotNull
    public static final String TAG = "DOCCAP";

    @NotNull
    private static final String DOC_POA_PHOTO_PREFIX = "ONFIDO_POA_IMG_";

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$BinaryUploadWarningEvent;", "", "errorDescription", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "result", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;", "(Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;)V", "getErrorDescription", "()Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "getResult", "()Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureScreen$DocumentCaptureResult;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BinaryUploadWarningEvent {

        @NotNull
        private final ErrorDescriptor errorDescription;

        @NotNull
        private final DocumentCaptureScreen.DocumentCaptureResult result;

        public BinaryUploadWarningEvent(@NotNull ErrorDescriptor errorDescription, @NotNull DocumentCaptureScreen.DocumentCaptureResult result) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            Intrinsics.checkNotNullParameter(result, "result");
            this.errorDescription = errorDescription;
            this.result = result;
        }

        public static /* synthetic */ BinaryUploadWarningEvent copy$default(BinaryUploadWarningEvent binaryUploadWarningEvent, ErrorDescriptor errorDescriptor, DocumentCaptureScreen.DocumentCaptureResult documentCaptureResult, int i, Object obj2) {
            if ((i & 1) != 0) {
                errorDescriptor = binaryUploadWarningEvent.errorDescription;
            }
            if ((i & 2) != 0) {
                documentCaptureResult = binaryUploadWarningEvent.result;
            }
            return binaryUploadWarningEvent.copy(errorDescriptor, documentCaptureResult);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ErrorDescriptor getErrorDescription() {
            return this.errorDescription;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DocumentCaptureScreen.DocumentCaptureResult getResult() {
            return this.result;
        }

        @NotNull
        public final BinaryUploadWarningEvent copy(@NotNull ErrorDescriptor errorDescription, @NotNull DocumentCaptureScreen.DocumentCaptureResult result) {
            Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
            Intrinsics.checkNotNullParameter(result, "result");
            return new BinaryUploadWarningEvent(errorDescription, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BinaryUploadWarningEvent)) {
                return false;
            }
            BinaryUploadWarningEvent binaryUploadWarningEvent = (BinaryUploadWarningEvent) other;
            return Intrinsics.f(this.errorDescription, binaryUploadWarningEvent.errorDescription) && Intrinsics.f(this.result, binaryUploadWarningEvent.result);
        }

        @NotNull
        public final ErrorDescriptor getErrorDescription() {
            return this.errorDescription;
        }

        @NotNull
        public final DocumentCaptureScreen.DocumentCaptureResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode() + (this.errorDescription.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "BinaryUploadWarningEvent(errorDescription=" + this.errorDescription + ", result=" + this.result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ErrorMessageEvent;", "", "title", "", "message", "(II)V", "getMessage", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorMessageEvent {
        private final int message;
        private final int title;

        public ErrorMessageEvent(int i, int i2) {
            this.title = i;
            this.message = i2;
        }

        public static /* synthetic */ ErrorMessageEvent copy$default(ErrorMessageEvent errorMessageEvent, int i, int i2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = errorMessageEvent.title;
            }
            if ((i3 & 2) != 0) {
                i2 = errorMessageEvent.message;
            }
            return errorMessageEvent.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorMessageEvent copy(int title, int message) {
            return new ErrorMessageEvent(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorMessageEvent)) {
                return false;
            }
            ErrorMessageEvent errorMessageEvent = (ErrorMessageEvent) other;
            return this.title == errorMessageEvent.title && this.message == errorMessageEvent.message;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.message) + (Integer.hashCode(this.title) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ErrorMessageEvent(title=");
            sb6.append(this.title);
            sb6.append(", message=");
            return j6.a.t(sb6, this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent;", "", "()V", "Hide", "Show", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent$Hide;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent$Show;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LoadingEvent {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent$Hide;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Hide extends LoadingEvent {

            @NotNull
            public static final Hide INSTANCE = new Hide();

            private Hide() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent$Show;", "Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$LoadingEvent;", "mode", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "getMode", "()Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Show extends LoadingEvent {

            @NotNull
            private final LoadingFragment.Companion.DialogMode mode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Show(@NotNull LoadingFragment.Companion.DialogMode mode) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.mode = mode;
            }

            public static /* synthetic */ Show copy$default(Show show, LoadingFragment.Companion.DialogMode dialogMode, int i, Object obj2) {
                if ((i & 1) != 0) {
                    dialogMode = show.mode;
                }
                return show.copy(dialogMode);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoadingFragment.Companion.DialogMode getMode() {
                return this.mode;
            }

            @NotNull
            public final Show copy(@NotNull LoadingFragment.Companion.DialogMode mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                return new Show(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Show) && Intrinsics.f(this.mode, ((Show) other).mode);
            }

            @NotNull
            public final LoadingFragment.Companion.DialogMode getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            @NotNull
            public String toString() {
                return "Show(mode=" + this.mode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private LoadingEvent() {
        }

        public /* synthetic */ LoadingEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ShowConfirmationEvent;", "", "shouldShowForceRetry", "", "withWarning", "(ZZ)V", "getShouldShowForceRetry", "()Z", "getWithWarning", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationEvent {
        private final boolean shouldShowForceRetry;
        private final boolean withWarning;

        /* JADX WARN: Illegal instructions before constructor call */
        public ShowConfirmationEvent() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ ShowConfirmationEvent copy$default(ShowConfirmationEvent showConfirmationEvent, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = showConfirmationEvent.shouldShowForceRetry;
            }
            if ((i & 2) != 0) {
                z3 = showConfirmationEvent.withWarning;
            }
            return showConfirmationEvent.copy(z, z3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldShowForceRetry() {
            return this.shouldShowForceRetry;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getWithWarning() {
            return this.withWarning;
        }

        @NotNull
        public final ShowConfirmationEvent copy(boolean shouldShowForceRetry, boolean withWarning) {
            return new ShowConfirmationEvent(shouldShowForceRetry, withWarning);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowConfirmationEvent)) {
                return false;
            }
            ShowConfirmationEvent showConfirmationEvent = (ShowConfirmationEvent) other;
            return this.shouldShowForceRetry == showConfirmationEvent.shouldShowForceRetry && this.withWarning == showConfirmationEvent.withWarning;
        }

        public final boolean getShouldShowForceRetry() {
            return this.shouldShowForceRetry;
        }

        public final boolean getWithWarning() {
            return this.withWarning;
        }

        public int hashCode() {
            return Boolean.hashCode(this.withWarning) + (Boolean.hashCode(this.shouldShowForceRetry) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ShowConfirmationEvent(shouldShowForceRetry=");
            sb6.append(this.shouldShowForceRetry);
            sb6.append(", withWarning=");
            return j6.a.x(sb6, this.withWarning, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public ShowConfirmationEvent(boolean z, boolean z3) {
            this.shouldShowForceRetry = z;
            this.withWarning = z3;
        }

        public /* synthetic */ ShowConfirmationEvent(boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z3);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$ValidCaptureEvent;", "", "isValid", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidCaptureEvent {
        private final boolean isValid;

        public ValidCaptureEvent(boolean z) {
            this.isValid = z;
        }

        public static /* synthetic */ ValidCaptureEvent copy$default(ValidCaptureEvent validCaptureEvent, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = validCaptureEvent.isValid;
            }
            return validCaptureEvent.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        @NotNull
        public final ValidCaptureEvent copy(boolean isValid) {
            return new ValidCaptureEvent(isValid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidCaptureEvent) && this.isValid == ((ValidCaptureEvent) other).isValid;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isValid);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        @NotNull
        public String toString() {
            return j6.a.x(new StringBuilder("ValidCaptureEvent(isValid="), this.isValid, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/document/DocumentCaptureViewModel$VideoRecordingEvent;", "", "shouldShow", "", "withMessage", "", "(ZI)V", "getShouldShow", "()Z", "getWithMessage", "()I", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VideoRecordingEvent {
        private final boolean shouldShow;
        private final int withMessage;

        public VideoRecordingEvent(boolean z, int i) {
            this.shouldShow = z;
            this.withMessage = i;
        }

        public static /* synthetic */ VideoRecordingEvent copy$default(VideoRecordingEvent videoRecordingEvent, boolean z, int i, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                z = videoRecordingEvent.shouldShow;
            }
            if ((i2 & 2) != 0) {
                i = videoRecordingEvent.withMessage;
            }
            return videoRecordingEvent.copy(z, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldShow() {
            return this.shouldShow;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getWithMessage() {
            return this.withMessage;
        }

        @NotNull
        public final VideoRecordingEvent copy(boolean shouldShow, int withMessage) {
            return new VideoRecordingEvent(shouldShow, withMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoRecordingEvent)) {
                return false;
            }
            VideoRecordingEvent videoRecordingEvent = (VideoRecordingEvent) other;
            return this.shouldShow == videoRecordingEvent.shouldShow && this.withMessage == videoRecordingEvent.withMessage;
        }

        public final boolean getShouldShow() {
            return this.shouldShow;
        }

        public final int getWithMessage() {
            return this.withMessage;
        }

        public int hashCode() {
            return Integer.hashCode(this.withMessage) + (Boolean.hashCode(this.shouldShow) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("VideoRecordingEvent(shouldShow=");
            sb6.append(this.shouldShow);
            sb6.append(", withMessage=");
            return j6.a.t(sb6, this.withMessage, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        public /* synthetic */ VideoRecordingEvent(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i2 & 2) != 0 ? 0 : i);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.NATIONAL_IDENTITY_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$applyValidationsAfterAnimationDelay$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$applyValidationsAfterAnimationDelay$1", f = "DocumentCaptureViewModel.kt", l = {713}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $animationDelayMs;
        int label;
        final /* synthetic */ DocumentCaptureViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j2, DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$animationDelayMs = j2;
            this.this$0 = documentCaptureViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$animationDelayMs, this.this$0, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                long j2 = this.$animationDelayMs;
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
            this.this$0._showVideoRecordingInfo.setValue(new VideoRecordingEvent(false, 0 == true ? 1 : 0, 2, null));
            OnfidoImage capturedImage = this.this$0.getCapturedImage();
            if (capturedImage == null) {
                return Unit.f186387a;
            }
            if (this.this$0.getIsProofOfAddress()) {
                this.this$0.onCaptureForProofOfAddressDone(capturedImage);
            } else {
                this.this$0.getApplyValidationsFlow().k(capturedImage);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1", f = "DocumentCaptureViewModel.kt", l = {1431}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20831 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable $rectDetectionObservable;
        int label;
        final /* synthetic */ DocumentCaptureViewModel this$0;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1$1, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1$1", f = "DocumentCaptureViewModel.kt", l = {1429}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03681 extends i implements Function2<RectDetectionResult, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocumentCaptureViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03681(DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super C03681> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureViewModel;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                C03681 c03681 = new C03681(this.this$0, continuation);
                c03681.L$0 = obj2;
                return c03681;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull RectDetectionResult rectDetectionResult, Continuation<? super Unit> continuation) {
                return ((C03681) create(rectDetectionResult, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    RectDetectionResult rectDetectionResult = (RectDetectionResult) this.L$0;
                    MutableSharedFlow accessibleCaptureRectangleDetection = this.this$0.getAccessibleCaptureRectangleDetection();
                    Intrinsics.h(rectDetectionResult);
                    this.label = 1;
                    if (accessibleCaptureRectangleDetection.emit(rectDetectionResult, this) == aVar) {
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
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1$2, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$1$2", f = "DocumentCaptureViewModel.kt", l = {1430}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/detector/rectangle/RectDetectionResult;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass2 extends i implements Function3 {
            int label;
            final /* synthetic */ DocumentCaptureViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = documentCaptureViewModel;
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow accessibleCaptureRectangleDetection = this.this$0.getAccessibleCaptureRectangleDetection();
                    RectDetectionResult.NoRectDetected noRectDetected = RectDetectionResult.NoRectDetected.INSTANCE;
                    this.label = 1;
                    if (accessibleCaptureRectangleDetection.emit(noRectDetected, this) == aVar) {
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

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(@NotNull FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
                return new AnonymousClass2(this.this$0, continuation).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20831(Observable observable, DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super C20831> continuation) {
            super(2, continuation);
            this.$rectDetectionObservable = observable;
            this.this$0 = documentCaptureViewModel;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new C20831(this.$rectDetectionObservable, this.this$0, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                t tVar = new t(new q0(q.k(new k(this.$rectDetectionObservable, (Continuation) null, 4)), new C03681(this.this$0, null), 1), new AnonymousClass2(this.this$0, null));
                this.label = 1;
                if (q.n(tVar, this) == aVar) {
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
            return ((C20831) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2", f = "DocumentCaptureViewModel.kt", l = {DateTimeConstants.MINUTES_PER_DAY}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Observable $rectDetectionObservable;
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2$1, reason: invalid class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2$1", f = "DocumentCaptureViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<AccessibleDocumentCaptureUseCaseResult, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocumentCaptureViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = documentCaptureViewModel;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj2;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull AccessibleDocumentCaptureUseCaseResult accessibleDocumentCaptureUseCaseResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(accessibleDocumentCaptureUseCaseResult, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                AccessibleDocumentCaptureUseCaseResult accessibleDocumentCaptureUseCaseResult = (AccessibleDocumentCaptureUseCaseResult) this.L$0;
                DocumentCaptureViewModel documentCaptureViewModel = this.this$0;
                Intrinsics.h(accessibleDocumentCaptureUseCaseResult);
                documentCaptureViewModel.processAccessibleDocumentCaptureResult(accessibleDocumentCaptureUseCaseResult);
                return Unit.f186387a;
            }
        }

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2$2, reason: invalid class name and collision with other inner class name */
        @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$enableAccessibilityCapture$2$2", f = "DocumentCaptureViewModel.kt", l = {1439}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/internal/usecase/AccessibleDocumentCaptureUseCaseResult;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03692 extends i implements Function3 {
            int label;
            final /* synthetic */ DocumentCaptureViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03692(DocumentCaptureViewModel documentCaptureViewModel, Continuation<? super C03692> continuation) {
                super(3, continuation);
                this.this$0 = documentCaptureViewModel;
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    MutableSharedFlow accessibleCaptureRectangleDetection = this.this$0.getAccessibleCaptureRectangleDetection();
                    RectDetectionResult.NoRectDetected noRectDetected = RectDetectionResult.NoRectDetected.INSTANCE;
                    this.label = 1;
                    if (accessibleCaptureRectangleDetection.emit(noRectDetected, this) == aVar) {
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

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(@NotNull FlowCollector flowCollector, Throwable th10, Continuation<? super Unit> continuation) {
                return new C03692(this.this$0, continuation).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Observable observable, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$rectDetectionObservable = observable;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureViewModel.this.new AnonymousClass2(this.$rectDetectionObservable, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                t tVar = new t(new q0(q.k(new k(DocumentCaptureViewModel.this.accessibleDocumentCaptureUseCase.observeAccessibilityCapture$onfido_capture_sdk_core_release(this.$rectDetectionObservable), (Continuation) null, 4)), new AnonymousClass1(DocumentCaptureViewModel.this, null), 1), new C03692(DocumentCaptureViewModel.this, null));
                this.label = 1;
                if (q.n(tVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$observeAutoCapture$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;", "invoke", "(Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20851 extends u implements Function1<DocumentValidationResult, Boolean> {
        public C20851() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DocumentValidationResult it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            return Boolean.valueOf(DocumentCaptureViewModel.this._docFormatDialogTitleFlow.getValue() != null);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$observeAutoCapture$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$observeAutoCapture$2", f = "DocumentCaptureViewModel.kt", l = {577}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;", "result"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20862 extends i implements Function3 {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C20862(Continuation<? super C20862> continuation) {
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
            C20862 c20862 = new C20862(continuation);
            c20862.L$0 = flowCollector;
            c20862.L$1 = documentValidationResult;
            return c20862.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$observeAutoCapture$3, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$observeAutoCapture$3", f = "DocumentCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "result", "Lcom/onfido/android/sdk/capture/internal/usecase/validation/DocumentValidationResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<DocumentValidationResult, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = DocumentCaptureViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj2;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull DocumentValidationResult documentValidationResult, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(documentValidationResult, continuation)).invokeSuspend(Unit.f186387a);
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
                DocumentCaptureViewModel.this.setAutoCaptured$onfido_capture_sdk_core_release(true);
                DocumentCaptureViewModel.this._liveValidationBubbleVisibility.k(OnfidoCaptureValidationBubble.VisibilityCommand.Gone.INSTANCE);
                boolean z = !DocumentCaptureViewModel.this.onfidoRemoteConfig.isMultiImageCaptureEnabled();
                Job job2 = DocumentCaptureViewModel.this.autoCaptureJob;
                if (job2 != null) {
                    job2.f(null);
                }
                DocumentCaptureViewModel.this._startCapture.k(Boolean.valueOf(z));
            } else {
                OnfidoCaptureValidationBubble.Content contentInvoke = DocumentCaptureViewModel.this.documentValidaMapper.invoke(documentValidationResult);
                if (contentInvoke != null) {
                    DocumentCaptureViewModel.this._showLiveValidation.k(contentInvoke);
                }
                DocumentCaptureViewModel.this._liveValidationBubbleVisibility.k(new OnfidoCaptureValidationBubble.VisibilityCommand.Visible(new OnfidoCaptureValidationBubble.FocusType.AnnounceContent(true)));
            }
            return Unit.f186387a;
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$onCaptureForProofOfAddressDone$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$onCaptureForProofOfAddressDone$1", f = "DocumentCaptureViewModel.kt", l = {731}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20871 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ OnfidoImage $capturedImage;
        final /* synthetic */ DocumentDetectionFrame $documentDetectionFrame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20871(OnfidoImage onfidoImage, DocumentDetectionFrame documentDetectionFrame, Continuation<? super C20871> continuation) {
            super(2, continuation);
            this.$capturedImage = onfidoImage;
            this.$documentDetectionFrame = documentDetectionFrame;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureViewModel.this.new C20871(this.$capturedImage, this.$documentDetectionFrame, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            C20871 c20871;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                ImageUtils imageUtils = DocumentCaptureViewModel.this.imageUtils;
                byte[] data = this.$capturedImage.getData();
                DocumentDetectionFrame documentDetectionFrame = this.$documentDetectionFrame;
                String str = "ONFIDO_POA_IMG_" + DocumentCaptureViewModel.this.getPoaCaptureSessionId() + ".jpg";
                File capturedFilesDir$onfido_capture_sdk_core_release = DocumentCaptureViewModel.this.getCapturedFilesDir$onfido_capture_sdk_core_release();
                this.label = 1;
                c20871 = this;
                obj2 = imageUtils.getPoaFileNameAfterCropping$onfido_capture_sdk_core_release(data, documentDetectionFrame, str, capturedFilesDir$onfido_capture_sdk_core_release, c20871);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                c20871 = this;
            }
            String str2 = (String) obj2;
            if (str2 != null) {
                DocumentCaptureViewModel.this.getCaptureResult().k(new DocumentCaptureScreen.DocumentCaptureResult.POACompleted(str2));
            } else {
                Timber.INSTANCE.e("POA_Debug: failed cropping / saving POA file", new Object[0]);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20871) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$processFrameForMRZ$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel", f = "DocumentCaptureViewModel.kt", l = {1073}, m = "processFrameForMRZ")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20881 extends c {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C20881(Continuation<? super C20881> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return DocumentCaptureViewModel.this.processFrameForMRZ(null, this);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startManualFallbackTimer$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$startManualFallbackTimer$1", f = "DocumentCaptureViewModel.kt", l = {432}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20891 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C20891(Continuation<? super C20891> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureViewModel.this.new C20891(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o.b(obj2);
                    this.label = 1;
                    if (k0.b(7000L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                MutableSharedFlow manualFallbackDelayFinished = DocumentCaptureViewModel.this.getManualFallbackDelayFinished();
                Boolean bool = Boolean.TRUE;
                manualFallbackDelayFinished.k(bool);
                DocumentCaptureViewModel.this.edgeDetectionFallbackTimerReached = bool;
            } catch (CancellationException e) {
                Timber.INSTANCE.i(e, "Error on autocapture fallback: " + e.getMessage(), new Object[0]);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20891) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$uploadDocument$1, reason: invalid class name and case insensitive filesystem */
    @d(c = "com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$uploadDocument$1", f = "DocumentCaptureViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C20901 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $jpegData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20901(byte[] bArr, Continuation<? super C20901> continuation) {
            super(2, continuation);
            this.$jpegData = bArr;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return DocumentCaptureViewModel.this.new C20901(this.$jpegData, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            byte[] bArrCropImage = DocumentCaptureViewModel.this.onfidoRemoteConfig.isDocumentCropDisabled() ? this.$jpegData : DocumentCaptureViewModel.this.cropImage(this.$jpegData);
            if (!DocumentCaptureViewModel.this.onfidoRemoteConfig.isMediaCallbackCroppingDisabled()) {
                DocumentCaptureViewModel.this.setCroppedImage$onfido_capture_sdk_core_release(bArrCropImage);
            }
            DocumentCaptureViewModel.this.uploadImageForValidation(bArrCropImage);
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20901) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentCaptureViewModel(@NotNull DocumentConfigurationManager documentConfigurationManager, @NotNull NativeDetector nativeDetector, @NotNull AnnouncementService announcementService, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull SdkUploadMetadataHelper sdkUploadMetaDataHelper, @NotNull DocumentService documentService, @NotNull CaptureUploadService.Factory uploadServiceFactory, @NotNull RectangleDetector rectangleDetector, @NotNull SharedPreferencesDataSource storage, @NotNull BackendDocumentValidationsManager backendDocumentValidationsManager, @NotNull PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager, @NotNull DocumentProcessingResultsFailureAnalyzer documentProcessingFailureAnalyzer, @NotNull DocumentCaptureDelayTransformer documentDelayTransformer, @NotNull MediaCallbacksUseCase mediaCallbacksUseCase, @NotNull NfcUseCase nfcUseCase, @NotNull AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase, @NotNull TimeProvider timeProvider, @NotNull DocumentCaptureTracker documentCaptureTracker, @NotNull BarcodeValidationSuspender barcodeValidationSuspender, @NotNull RetainableValidationsResult retainableValidationsResult, @NotNull DispatchersProvider dispatchersProvider, @NotNull EnvironmentIntegrityChecker environmentIntegrityChecker, @NotNull ImageUtils imageUtils, @NotNull MRZDocumentExtractor mrzDocumentExtractor, @NotNull DocumentValidationUseCase documentValidationUseCase) {
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(nativeDetector, "nativeDetector");
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(sdkUploadMetaDataHelper, "sdkUploadMetaDataHelper");
        Intrinsics.checkNotNullParameter(documentService, "documentService");
        Intrinsics.checkNotNullParameter(uploadServiceFactory, "uploadServiceFactory");
        Intrinsics.checkNotNullParameter(rectangleDetector, "rectangleDetector");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(backendDocumentValidationsManager, "backendDocumentValidationsManager");
        Intrinsics.checkNotNullParameter(postCaptureDocumentValidationsManager, "postCaptureDocumentValidationsManager");
        Intrinsics.checkNotNullParameter(documentProcessingFailureAnalyzer, "documentProcessingFailureAnalyzer");
        Intrinsics.checkNotNullParameter(documentDelayTransformer, "documentDelayTransformer");
        Intrinsics.checkNotNullParameter(mediaCallbacksUseCase, "mediaCallbacksUseCase");
        Intrinsics.checkNotNullParameter(nfcUseCase, "nfcUseCase");
        Intrinsics.checkNotNullParameter(accessibleDocumentCaptureUseCase, "accessibleDocumentCaptureUseCase");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(documentCaptureTracker, "documentCaptureTracker");
        Intrinsics.checkNotNullParameter(barcodeValidationSuspender, "barcodeValidationSuspender");
        Intrinsics.checkNotNullParameter(retainableValidationsResult, "retainableValidationsResult");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(environmentIntegrityChecker, "environmentIntegrityChecker");
        Intrinsics.checkNotNullParameter(imageUtils, "imageUtils");
        Intrinsics.checkNotNullParameter(mrzDocumentExtractor, "mrzDocumentExtractor");
        Intrinsics.checkNotNullParameter(documentValidationUseCase, "documentValidationUseCase");
        this.documentConfigurationManager = documentConfigurationManager;
        this.nativeDetector = nativeDetector;
        this.announcementService = announcementService;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.sdkUploadMetaDataHelper = sdkUploadMetaDataHelper;
        this.documentService = documentService;
        this.uploadServiceFactory = uploadServiceFactory;
        this.rectangleDetector = rectangleDetector;
        this.storage = storage;
        this.backendDocumentValidationsManager = backendDocumentValidationsManager;
        this.postCaptureDocumentValidationsManager = postCaptureDocumentValidationsManager;
        this.documentProcessingFailureAnalyzer = documentProcessingFailureAnalyzer;
        this.documentDelayTransformer = documentDelayTransformer;
        this.mediaCallbacksUseCase = mediaCallbacksUseCase;
        this.nfcUseCase = nfcUseCase;
        this.accessibleDocumentCaptureUseCase = accessibleDocumentCaptureUseCase;
        this.timeProvider = timeProvider;
        this.documentCaptureTracker = documentCaptureTracker;
        this.barcodeValidationSuspender = barcodeValidationSuspender;
        this.retainableValidationsResult = retainableValidationsResult;
        this.dispatchersProvider = dispatchersProvider;
        this.environmentIntegrityChecker = environmentIntegrityChecker;
        this.imageUtils = imageUtils;
        this.mrzDocumentExtractor = mrzDocumentExtractor;
        this.documentValidationUseCase = documentValidationUseCase;
        this.processingResults = new DocumentProcessingResults(null, null, null, null, null, null, 63, null);
        this.poaCaptureSessionId = j.b(new DocumentCaptureViewModel$poaCaptureSessionId$2(this));
        this.documentVideoId = "";
        this.mrzExtractionResultMap = new HashMap<>();
        this.documentValidaMapper = new DocumentValidationResultMapper();
        this.uploadService = j.b(new DocumentCaptureViewModel$uploadService$2(this));
        j2 j2VarC = q.c(null);
        this._docFormatDialogTitleFlow = j2VarC;
        this.docFormatDialogTitleFlow = q.h(j2VarC);
        f fVar = f.DROP_OLDEST;
        this.shouldHideOverlay = q.b(1, 1, fVar);
        j2 j2VarC2 = q.c(CameraState.Uninitialized.INSTANCE);
        this._cameraState = j2VarC2;
        this.cameraState = j2VarC2;
        j2 j2VarC3 = q.c(null);
        this._startVideoRecording = j2VarC3;
        this.startVideoRecording = j2VarC3;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        j2 j2VarC4 = q.c(new VideoRecordingEvent(z, objArr, 2, null));
        this._showVideoRecordingInfo = j2VarC4;
        this.showVideoRecordingInfo = j2VarC4;
        this.applyValidationsFlow = q.b(1, 1, fVar);
        this.hidePostCaptureValidationBubbleFlow = q.b(1, 1, fVar);
        Boolean bool = Boolean.FALSE;
        j2 j2VarC5 = q.c(bool);
        this._shouldEnableTorch = j2VarC5;
        this.shouldEnableTorch = j2VarC5;
        this.showConfirmationFlow = q.b(1, 1, fVar);
        this.validCaptureFlow = q.b(1, 1, fVar);
        this.captureResult = q.b(1, 1, fVar);
        this.errorMessageFlow = q.b(1, 1, fVar);
        this.errorDescriptorFlow = q.b(1, 1, fVar);
        this.loadingFlow = q.c(LoadingEvent.Hide.INSTANCE);
        j2 j2VarC6 = q.c(null);
        this._startCapture = j2VarC6;
        this.startCapture = j2VarC6;
        j2 j2VarC7 = q.c(null);
        this._showLiveValidation = j2VarC7;
        this.showLiveValidation = j2VarC7;
        j2 j2VarC8 = q.c(null);
        this._liveValidationBubbleVisibility = j2VarC8;
        this.liveValidationBubbleVisibility = j2VarC8;
        this.imageProcessingFinished = q.b(1, 1, fVar);
        this.manualFallbackDelayFinished = q.b(1, 1, fVar);
        this.accessibleCaptureRectangleDetection = q.b(1, 1, fVar);
        this.accessibleCaptureResult = q.b(1, 1, fVar);
        this.binaryUploadWarning = q.b(1, 1, fVar);
        this.overlayMetricsStateFlow = q.c(null);
        this.documentFrame = q.c(null);
        j2 j2VarC9 = q.c(bool);
        this._captureButtonVisibility = j2VarC9;
        this.captureButtonVisibility = j2VarC9;
        j2 j2VarC10 = q.c(bool);
        this._shouldOpenCaptureScreen = j2VarC10;
        this.shouldOpenCaptureScreen = j2VarC10;
        j2 j2VarC11 = q.c(bool);
        this._shouldShowCaptureErrorDialog = j2VarC11;
        this.shouldShowCaptureErrorDialog = j2VarC11;
    }

    private final void analyseProcessingResults(DocumentProcessingResults results) {
        MutableSharedFlow mutableSharedFlow;
        ShowConfirmationEvent showConfirmationEvent;
        ErrorDescriptor errorDescriptorForProcessingResult$onfido_capture_sdk_core_release;
        boolean z = true;
        char c2 = 1;
        char c3 = 1;
        if (results.isValidDocumentImage()) {
            this.validCaptureFlow.k(new ValidCaptureEvent(true));
            return;
        }
        if (!isBackSideOfRomanianNationalId() && (errorDescriptorForProcessingResult$onfido_capture_sdk_core_release = DocumentUtils.INSTANCE.getErrorDescriptorForProcessingResult$onfido_capture_sdk_core_release(results, getDocumentType$onfido_capture_sdk_core_release(), isMrzDetectionEnabled())) != null) {
            this.errorDescriptorFlow.k(errorDescriptorForProcessingResult$onfido_capture_sdk_core_release);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z3 = false;
        if (shouldForceRetry()) {
            mutableSharedFlow = this.showConfirmationFlow;
            showConfirmationEvent = new ShowConfirmationEvent(z, z3, 2, defaultConstructorMarker);
        } else {
            mutableSharedFlow = this.showConfirmationFlow;
            showConfirmationEvent = new ShowConfirmationEvent(z3, c3 == true ? 1 : 0, c2 == true ? 1 : 0, defaultConstructorMarker);
        }
        mutableSharedFlow.k(showConfirmationEvent);
        this.rejectionCount++;
    }

    private final void applyValidationsAfterAnimationDelay(long animationDelayMs) {
        this._cameraState.setValue(CameraState.OFF.INSTANCE);
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new AnonymousClass1(animationDelayMs, this, null), 2);
    }

    private final boolean backSideCaptureNeeded() {
        DocumentType documentType = getDocumentData$onfido_capture_sdk_core_release().getDocumentType();
        if (documentType != null) {
            return DocumentConfigurationManager.backSideCaptureNeeded$default(this.documentConfigurationManager, documentType, getDocumentData$onfido_capture_sdk_core_release().getGenericDocPages(), null, 4, null);
        }
        return false;
    }

    private final void callMediaCallback() {
        byte[] data = this.croppedImage;
        if (data == null) {
            OnfidoImage onfidoImage = this.capturedImage;
            data = onfidoImage != null ? onfidoImage.getData() : null;
            if (data == null) {
                return;
            }
        }
        this.mediaCallbacksUseCase.callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release(CaptureType.DOCUMENT, data, getDocumentType$onfido_capture_sdk_core_release(), this.documentSide, this.countryCode);
    }

    private final void checkBinaryUploadedResult(UploadBinaryResult.BinaryUploaded uploadBinaryResult) {
        Timber.INSTANCE.i("DOCCAP - Binary uploaded", new Object[0]);
        if (uploadBinaryResult.getWarning() != null) {
            showWarningBinaryResult$default(this, uploadBinaryResult.getDocumentId(), uploadBinaryResult.getWarning(), uploadBinaryResult.getDocumentNfcSupported(), uploadBinaryResult.getWarningsBundle(), null, 16, null);
            return;
        }
        this.currentCaptureFlowError = null;
        MutableSharedFlow mutableSharedFlow = this.captureResult;
        String documentId = uploadBinaryResult.getDocumentId();
        String str = this.documentVideoId;
        CaptureStepDataBundle documentData$onfido_capture_sdk_core_release = getDocumentData$onfido_capture_sdk_core_release();
        DocSide docSide = this.documentSide;
        if (docSide == null) {
            docSide = DocSide.FRONT;
        }
        mutableSharedFlow.k(new DocumentCaptureScreen.DocumentCaptureResult.Completed(documentId, str, CaptureStepDataBundle.copy$default(documentData$onfido_capture_sdk_core_release, null, null, null, this.documentFormat, docSide, null, null, 103, null), uploadBinaryResult.getDocumentNfcSupported(), null, false, 48, null));
    }

    private final void checkDocumentFormat() {
        int i;
        Object value;
        boolean zIsFoldedFormatSupported$onfido_capture_sdk_core_release = DocumentUtils.INSTANCE.isFoldedFormatSupported$onfido_capture_sdk_core_release(getDocumentType$onfido_capture_sdk_core_release(), this.countryCode);
        DocumentFormat documentFormat = this.documentFormat;
        if (documentFormat == null) {
            if (zIsFoldedFormatSupported$onfido_capture_sdk_core_release) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[getDocumentType$onfido_capture_sdk_core_release().ordinal()];
                if (i2 == 1) {
                    i = R.string.onfido_doc_capture_prompt_title_id;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException(("documentFormatDialog shouldn't be showed for this " + getDocumentType$onfido_capture_sdk_core_release()).toString());
                    }
                    i = R.string.onfido_doc_capture_prompt_title_license;
                }
                MutableStateFlow mutableStateFlow = this._docFormatDialogTitleFlow;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.h(value, Integer.valueOf(i)));
            } else {
                this.documentFormat = DocumentFormat.CARD;
                initDocumentTypeUIModel$onfido_capture_sdk_core_release(false);
            }
        } else if (DocumentFormat.FOLDED == documentFormat && zIsFoldedFormatSupported$onfido_capture_sdk_core_release) {
            onFoldedFormat();
            return;
        }
        startOverlayDisplayTimer$onfido_capture_sdk_core_release();
    }

    private final void checkErrorBinaryResult(UploadBinaryResult.Error uploadBinaryResult) {
        ErrorType errorTypeFromResult$onfido_capture_sdk_core_release = this.nfcUseCase.getErrorTypeFromResult$onfido_capture_sdk_core_release(uploadBinaryResult);
        this.currentCaptureFlowError = errorTypeFromResult$onfido_capture_sdk_core_release;
        onUploadError(errorTypeFromResult$onfido_capture_sdk_core_release);
    }

    private final void checkNfcPropertiesFetchedBinaryResult(UploadBinaryResult.NfcPropertiesFetched uploadBinaryResult) {
        Timber.INSTANCE.i("DOCCAP - Nfc properties fetched", new Object[0]);
        if (uploadBinaryResult.getWarning() != null) {
            showWarningBinaryResult(uploadBinaryResult.getDocumentId(), uploadBinaryResult.getWarning(), true, uploadBinaryResult.getWarningsBundle(), uploadBinaryResult.getNfcProperties());
            return;
        }
        this.currentCaptureFlowError = null;
        MutableSharedFlow mutableSharedFlow = this.captureResult;
        String documentId = uploadBinaryResult.getDocumentId();
        String str = this.documentVideoId;
        CaptureStepDataBundle documentData$onfido_capture_sdk_core_release = getDocumentData$onfido_capture_sdk_core_release();
        DocSide docSide = this.documentSide;
        if (docSide == null) {
            docSide = DocSide.FRONT;
        }
        mutableSharedFlow.k(new DocumentCaptureScreen.DocumentCaptureResult.Completed(documentId, str, CaptureStepDataBundle.copy$default(documentData$onfido_capture_sdk_core_release, null, null, null, this.documentFormat, docSide, null, null, 103, null), true, uploadBinaryResult.getNfcProperties(), false, 32, null));
    }

    private final void checkUploadBinaryResult(UploadBinaryResult uploadBinaryResult) {
        if (uploadBinaryResult instanceof UploadBinaryResult.BinaryUploaded) {
            checkBinaryUploadedResult((UploadBinaryResult.BinaryUploaded) uploadBinaryResult);
        } else if (uploadBinaryResult instanceof UploadBinaryResult.NfcPropertiesFetched) {
            checkNfcPropertiesFetchedBinaryResult((UploadBinaryResult.NfcPropertiesFetched) uploadBinaryResult);
        } else if (uploadBinaryResult instanceof UploadBinaryResult.Error) {
            checkErrorBinaryResult((UploadBinaryResult.Error) uploadBinaryResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] cropImage(byte[] jpegData) {
        ImageUtils imageUtils = this.imageUtils;
        DocumentDetectionFrame documentDetectionFrame = this.docFrame;
        if (documentDetectionFrame != null) {
            return imageUtils.cropImage$onfido_capture_sdk_core_release(jpegData, documentDetectionFrame, this.onfidoRemoteConfig.getDocumentCapture().getImageCompressionQuality(), isCameraXEnabled(), isFourByThreeEnabled$onfido_capture_sdk_core_release(), !this.environmentIntegrityChecker.hasEnvironmentIntegrity()).getImageContent();
        }
        Intrinsics.r("docFrame");
        throw null;
    }

    private final void disposeAutocaptureSubscriptions() {
        Job job2 = this.autocaptureFallbackJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.edgeDetectionFallbackTimerReached = null;
    }

    private final void enableAccessibilityCapture(DocumentType documentType) {
        Observable rectangleDetectorObservable = getRectangleDetectorObservable(documentType == DocumentType.PASSPORT);
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new C20831(rectangleDetectorObservable, this, null), 2);
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new AnonymousClass2(rectangleDetectorObservable, null), 2);
    }

    public static /* synthetic */ void getCapturedImage$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getCapturedVideoFilePath$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getCroppedImage$onfido_capture_sdk_core_release$annotations() {
    }

    private final DocumentTypeUIModel getDocumentTypeUIModel(boolean isProofOfAddress) {
        return DocumentUITextModelMapper.INSTANCE.toDocumentUIModel(getDocumentType$onfido_capture_sdk_core_release(), this.documentFormat, this.countryCode, this.announcementService.isEnabled(), isProofOfAddress, isAddressPageBackCapture$onfido_capture_sdk_core_release());
    }

    public static /* synthetic */ void getDocumentVideoId$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getExtractedMRZDocument$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getNfcArguments$onfido_capture_sdk_core_release$annotations() {
    }

    private final long getPictureCapturedAnimationDelay() {
        return this.isAutoCaptured ? 1200L : 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPoaCaptureSessionId() {
        return (String) this.poaCaptureSessionId.getValue();
    }

    private final Observable getRectangleDetectorObservable(boolean isPassport) {
        RectangleDetector rectangleDetector = this.rectangleDetector;
        Observable observableHide = b.c(new t0(this.overlayMetricsStateFlow, 1)).hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        Observable observableHide2 = b.c(new t0(this.documentFrame, 1)).hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        Observable observableShare = rectangleDetector.observeRectDetection(observableHide, observableHide2, !isPassport && this.documentSide == DocSide.FRONT).map(new igm.o() { // from class: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.getRectangleDetectorObservable.1
            @Override // igm.o
            @NotNull
            public final RectDetectionResult apply(@NotNull RectDetectionResult rectDetectionResult) {
                Intrinsics.checkNotNullParameter(rectDetectionResult, "rectDetectionResult");
                if (!(rectDetectionResult instanceof RectDetectionResult.RectDetected)) {
                    return rectDetectionResult;
                }
                RectDetectionResult.RectDetected rectDetected = (RectDetectionResult.RectDetected) rectDetectionResult;
                return RectDetectionResult.RectDetected.copy$default(rectDetected, ImageUtilsExtKt.trimDocument(rectDetected.getRect(), DocumentCaptureViewModel.this.getDocumentType$onfido_capture_sdk_core_release()), null, null, 6, null);
            }
        }).share();
        Intrinsics.checkNotNullExpressionValue(observableShare, "share(...)");
        return observableShare;
    }

    private final List<Validation> getRequiredDocumentValidations() {
        BackendDocumentValidationsManager backendDocumentValidationsManager = this.backendDocumentValidationsManager;
        DocumentType documentType$onfido_capture_sdk_core_release = getDocumentType$onfido_capture_sdk_core_release();
        DocSide docSide = this.documentSide;
        if (docSide == null) {
            docSide = DocSide.FRONT;
        }
        return backendDocumentValidationsManager.getRequiredValidations(documentType$onfido_capture_sdk_core_release, docSide, this.rejectionCount);
    }

    public static /* synthetic */ void getTakenPhotoCount$onfido_capture_sdk_core_release$annotations() {
    }

    public static /* synthetic */ void getUploadBinaryResult$onfido_capture_sdk_core_release$annotations() {
    }

    private final CaptureUploadService getUploadService() {
        return (CaptureUploadService) this.uploadService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideLoading() {
        this.loadingFlow.k(LoadingEvent.Hide.INSTANCE);
    }

    private final boolean isBackSideOfRomanianNationalId() {
        return this.documentSide == DocSide.BACK && this.countryCode == CountryCode.RO && getDocumentType$onfido_capture_sdk_core_release() == DocumentType.NATIONAL_IDENTITY_CARD;
    }

    private final boolean isCameraXEnabled() {
        return this.onfidoRemoteConfig.isCameraXEnabled();
    }

    private final boolean isCheckingImageQuality() {
        return shouldForceRetry() && this.onfidoRemoteConfig.isImageQualityServiceEnabled();
    }

    private final boolean isDocumentUploaded() {
        UploadBinaryResult uploadBinaryResult = this.uploadBinaryResult;
        return (uploadBinaryResult instanceof UploadBinaryResult.BinaryUploaded) || (uploadBinaryResult instanceof UploadBinaryResult.NfcPropertiesFetched);
    }

    private final boolean isFinalStepForDocument() {
        return (getDocumentData$onfido_capture_sdk_core_release().getDocSide() == DocSide.FRONT && !backSideCaptureNeeded()) || getDocumentData$onfido_capture_sdk_core_release().getDocSide() == DocSide.BACK;
    }

    private final boolean isFolded(DocumentType documentType, DocumentType documentType2, CountryCode countryCode) {
        return DocumentFormat.FOLDED == this.documentFormat && documentType2 == documentType && countryCode == this.countryCode;
    }

    private final boolean isMlModelAutoCaptureEnabled() {
        return (!this.onfidoRemoteConfig.getDocumentDetectionExperiment().getEnabled() || shouldEnableAccessibilityCapture$onfido_capture_sdk_core_release() || this.documentFormat == DocumentFormat.FOLDED || this.isProofOfAddress) ? false : true;
    }

    private final boolean isMrzDetectionEnabled() {
        boolean zIsMrzDetectionEnabled = this.onfidoRemoteConfig.getDocumentCapture().isMrzDetectionEnabled();
        Timber.INSTANCE.d(com.google.android.gms.internal.mlkit_vision_face.a.r("MRZ detection validation enabled: ", zIsMrzDetectionEnabled), new Object[0]);
        return zIsMrzDetectionEnabled;
    }

    private final void observeAutoCapture() {
        this.autoCaptureJob = q.G(new q0(q.R(FlowExtKt.skipWhile(this.documentValidationUseCase.getValidationResult(), new C20851()), new C20862(null)), new AnonymousClass3(null), 1), ViewModelKt.getViewModelScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBinaryUploaded(UploadBinaryResult uploadBinaryResult) {
        this.uploadBinaryResult = uploadBinaryResult;
        String documentId = uploadBinaryResult.getDocumentId();
        if (!shouldRecordDocumentVideo$onfido_capture_sdk_core_release() || documentId == null) {
            checkUploadBinaryResult(uploadBinaryResult);
        } else {
            trackWaitingScreenCompleted();
            String str = this.capturedVideoFilePath;
            if (str != null) {
                CaptureUploadService uploadService = getUploadService();
                SdkUploadMetaData sdkUploadMetadata = sdkUploadMetadata(getDocumentData$onfido_capture_sdk_core_release());
                DocSide docSide = getDocumentData$onfido_capture_sdk_core_release().getDocSide();
                if (docSide == null) {
                    docSide = DocSide.FRONT;
                }
                DocSide docSide2 = docSide;
                DocumentType documentType = getDocumentData$onfido_capture_sdk_core_release().getDocumentType();
                if (documentType == null) {
                    documentType = DocumentType.UNKNOWN;
                }
                uploadService.uploadDocumentVideo$onfido_capture_sdk_core_release(documentId, str, sdkUploadMetadata, docSide2, documentType, getDocumentData$onfido_capture_sdk_core_release().getCountryCode());
            } else {
                this.validCaptureFlow.k(new ValidCaptureEvent(false));
            }
        }
        this.documentCaptureTracker.trackDocumentUploadCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCaptureForProofOfAddressDone(OnfidoImage capturedImage) {
        ImageUtils imageUtils = this.imageUtils;
        OverlayMetrics overlayMetrics = this.overlayMetrics;
        if (overlayMetrics == null) {
            Intrinsics.r("overlayMetrics");
            throw null;
        }
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new C20871(capturedImage, imageUtils.getDocumentDetectionFrame$onfido_capture_sdk_core_release(capturedImage, overlayMetrics.getVisibleCaptureRect()), null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorVideoTaking() {
        if (this.onfidoRemoteConfig.getDocumentCapture().getVideoRequired()) {
            onPictureCaptureFailed$onfido_capture_sdk_core_release();
        }
    }

    private final void onFoldedFormat() {
        initDocumentTypeUIModel$onfido_capture_sdk_core_release(false);
        startOverlayDisplayTimer$onfido_capture_sdk_core_release();
    }

    private final void onGeneralUploadError() {
        trackCaptureError$onfido_capture_sdk_core_release();
        trackWaitingScreenCompleted();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_network_title, R.string.onfido_generic_error_doc_capture);
    }

    private final void onInvalidCertificateDetected(String message) {
        this.captureResult.k(new DocumentCaptureScreen.DocumentCaptureResult.Error(new InvalidCertificateException(message)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPostCaptureValidationsFinished(DocumentProcessingResults processingResults, DocumentDetectionFrame frame) {
        setMRZResult(processingResults.getMrzValidationResult());
        this.processingResults = processingResults;
        if (this.onfidoRemoteConfig.isImageQualityServiceEnabled() && processingResults.isValidDocumentImage()) {
            trackWaitingScreenCompleted();
            uploadDocument(frame.getYuv());
        } else {
            boolean z = false;
            this.showConfirmationFlow.k(new ShowConfirmationEvent(z, z, 2, null));
            analyseProcessingResults(processingResults);
        }
    }

    private final void onTokenExpired() {
        this.captureResult.k(new DocumentCaptureScreen.DocumentCaptureResult.Error(TokenExpiredException.INSTANCE));
    }

    private final void onUploadFailure() {
        trackCaptureError$onfido_capture_sdk_core_release();
        trackWaitingScreenCompleted();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_network_title, R.string.onfido_generic_error_network_detail);
    }

    private final void onUploadFailureWithGeoblocking() {
        trackCaptureError$onfido_capture_sdk_core_release();
        trackWaitingScreenCompleted();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_errors_geoblocked_error_message, R.string.onfido_generic_errors_geoblocked_error_instruction);
    }

    private final void onUploadValidationError(ErrorType errorType) {
        this.documentCaptureTracker.trackDocumentConfirmationError(errorType, getDocumentData$onfido_capture_sdk_core_release().getDocSide());
        if (isCheckingImageQuality()) {
            trackWaitingScreenCompleted();
        }
        hideLoading();
        this.showConfirmationFlow.k(new ShowConfirmationEvent(shouldForceRetry(), false, 2, null));
        if (!isBackSideOfRomanianNationalId()) {
            this.errorDescriptorFlow.k(ErrorTypeUtilsKt.mapErrorType(errorType));
        }
        this.rejectionCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processAccessibleDocumentCaptureResult(AccessibleDocumentCaptureUseCaseResult result) {
        Object objValueOf;
        MutableSharedFlow mutableSharedFlow;
        if (result instanceof AccessibleDocumentCaptureUseCaseResult.AutoCaptured) {
            boolean z = !shouldRecordDocumentVideo$onfido_capture_sdk_core_release();
            mutableSharedFlow = this._startCapture;
            objValueOf = Boolean.valueOf(z);
        } else {
            if (!(result instanceof AccessibleDocumentCaptureUseCaseResult.DocumentPositionChanged)) {
                return;
            }
            mutableSharedFlow = this.accessibleCaptureResult;
            objValueOf = result;
        }
        mutableSharedFlow.k(objValueOf);
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
            boolean r0 = r14 instanceof com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.C20881
            if (r0 == 0) goto L13
            r0 = r14
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$processFrameForMRZ$1 r0 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.C20881) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$processFrameForMRZ$1 r0 = new com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel$processFrameForMRZ$1
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
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel r13 = (com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel) r13
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
            com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureTracker r5 = r13.documentCaptureTracker
            int r10 = r13.emittedFramesCount
            int r11 = r13.processedFramesCount
            r5.trackDocumentValidMRZExtracted(r6, r8, r10, r11)
        L85:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.document.DocumentCaptureViewModel.processFrameForMRZ(com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SdkUploadMetaData sdkUploadMetadata(CaptureStepDataBundle captureStepDataBundle) {
        return this.sdkUploadMetaDataHelper.create(this.processingResults, this.documentProcessingFailureAnalyzer.getProcessingFailureCounts().getBlurFailureCount(), this.nfcUseCase.isMRZExtracted$onfido_capture_sdk_core_release(getDocumentType$onfido_capture_sdk_core_release(), this.countryCode, this.mrzExtractionResultMap), this.takenPhotoCount, captureStepDataBundle);
    }

    private final void setMRZResult(MRZValidationResult result) {
        this.extraFileInfo = this.nfcUseCase.getMRZResult$onfido_capture_sdk_core_release(result);
    }

    private final boolean shouldAutocapture() {
        return this.documentConfigurationManager.shouldAutocapture(getDocumentType$onfido_capture_sdk_core_release(), this.countryCode);
    }

    private final boolean shouldForceRetry() {
        return this.rejectionCount < this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries() && !isBackSideOfRomanianNationalId();
    }

    private final boolean shouldShowOverlay(boolean isFrontSide, boolean isOverlayGone, DocumentType documentType, CountryCode countryCode) {
        return isFrontSide && !isOverlayGone && DocumentFormat.FOLDED == this.documentFormat && getDocumentType$onfido_capture_sdk_core_release() == documentType && this.countryCode == countryCode;
    }

    private final boolean shouldUploadDocument() {
        return (isDocumentUploaded() && this.onfidoRemoteConfig.isImageQualityServiceEnabled()) ? false : true;
    }

    private final void showErrorMessage(int title, int message) {
        this.errorMessageFlow.k(new ErrorMessageEvent(title, message));
    }

    private final void showLoading(LoadingFragment.Companion.DialogMode mode) {
        this.loadingFlow.k(new LoadingEvent.Show(mode));
    }

    private final void showWarningBinaryResult(String documentId, ErrorType warning, boolean nfcSupported, DocumentValidationWarningsBundle warningsBundle, NfcProperties nfcProperties) {
        Map<ErrorType, UiAlerts.UiAlertType> mapG;
        DocumentCaptureTracker documentCaptureTracker = this.documentCaptureTracker;
        CaptureStepDataBundle documentData$onfido_capture_sdk_core_release = getDocumentData$onfido_capture_sdk_core_release();
        int i = this.takenPhotoCount;
        int maxTotalRetries = this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries();
        if (warningsBundle == null || (mapG = DocumentValidationWarningsBundleUtilsKt.remoteWarnings(warningsBundle)) == null) {
            mapG = r0.g();
        }
        documentCaptureTracker.trackDocumentConfirmationWarning(documentData$onfido_capture_sdk_core_release, i, maxTotalRetries, mapG, warning);
        this.currentCaptureFlowError = warning;
        String str = this.documentVideoId;
        CaptureStepDataBundle documentData$onfido_capture_sdk_core_release2 = getDocumentData$onfido_capture_sdk_core_release();
        DocSide docSide = this.documentSide;
        if (docSide == null) {
            docSide = DocSide.FRONT;
        }
        this.binaryUploadWarning.k(new BinaryUploadWarningEvent(ErrorTypeUtilsKt.mapErrorType(warning), new DocumentCaptureScreen.DocumentCaptureResult.Completed(documentId, str, CaptureStepDataBundle.copy$default(documentData$onfido_capture_sdk_core_release2, null, null, null, this.documentFormat, docSide, null, null, 103, null), nfcSupported, nfcProperties, true)));
    }

    public static /* synthetic */ void showWarningBinaryResult$default(DocumentCaptureViewModel documentCaptureViewModel, String str, ErrorType errorType, boolean z, DocumentValidationWarningsBundle documentValidationWarningsBundle, NfcProperties nfcProperties, int i, Object obj2) {
        if ((i & 16) != 0) {
            nfcProperties = null;
        }
        documentCaptureViewModel.showWarningBinaryResult(str, errorType, z, documentValidationWarningsBundle, nfcProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startManualFallbackTimer() {
        if (this.autocaptureFallbackJob == null) {
            this.autocaptureFallbackJob = e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.getMain(), null, new C20891(null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void stopDocumentRecording() {
        this._shouldEnableTorch.setValue(Boolean.FALSE);
        this._showVideoRecordingInfo.setValue(new VideoRecordingEvent(false, 0 == true ? 1 : 0, 2, null));
        this._showVideoRecordingInfo.setValue(new VideoRecordingEvent(true, R.string.onfido_doc_capture_header_recording_complete));
        stopDocumentVideoRecordingAndCameraFeed();
    }

    private final void stopDocumentVideoRecordingAndCameraFeed() {
        this._startVideoRecording.setValue(Boolean.FALSE);
        applyValidationsAfterAnimationDelay(1200L);
    }

    private final void trackDocumentCaptureFlowCompleted() {
        if (isFinalStepForDocument()) {
            this.documentCaptureTracker.trackDocumentCaptureFlowCompleted(getDocumentData$onfido_capture_sdk_core_release());
        }
    }

    private final void uploadDocument(byte[] jpegData) {
        this.hidePostCaptureValidationBubbleFlow.k(Boolean.FALSE);
        showLoading(new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_DOCUMENT"));
        trackUploadStarted$onfido_capture_sdk_core_release();
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new C20901(jpegData, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadImageForValidation(byte[] jpegData) {
        List<Validation> requiredDocumentValidations = getRequiredDocumentValidations();
        ArrayList arrayList = new ArrayList(w.t(requiredDocumentValidations, 10));
        for (Validation validation : requiredDocumentValidations) {
            if (isBackSideOfRomanianNationalId()) {
                validation = new Validation(validation.getValidationType(), ValidationLevel.WARNING);
            }
            arrayList.add(validation);
        }
        uploadDocumentMedia$onfido_capture_sdk_core_release(arrayList, jpegData);
    }

    public final void applyPostCaptureValidations$onfido_capture_sdk_core_release(@NotNull OnfidoImage image, @NotNull RectF outerLimits) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(outerLimits, "outerLimits");
        DocumentDetectionFrame documentDetectionFrame$onfido_capture_sdk_core_release = this.imageUtils.getDocumentDetectionFrame$onfido_capture_sdk_core_release(image, outerLimits);
        this.docFrame = documentDetectionFrame$onfido_capture_sdk_core_release;
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new DocumentCaptureViewModel$applyPostCaptureValidations$1(this, documentDetectionFrame$onfido_capture_sdk_core_release, null), 2);
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessibleCaptureRectangleDetection$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getAccessibleCaptureRectangleDetection() {
        return this.accessibleCaptureRectangleDetection;
    }

    @NotNull
    /* JADX INFO: renamed from: getAccessibleCaptureResult$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getAccessibleCaptureResult() {
        return this.accessibleCaptureResult;
    }

    @NotNull
    /* JADX INFO: renamed from: getApplyValidationsFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getApplyValidationsFlow() {
        return this.applyValidationsFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getBinaryUploadWarning$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getBinaryUploadWarning() {
        return this.binaryUploadWarning;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraState$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getCameraState() {
        return this.cameraState;
    }

    @NotNull
    /* JADX INFO: renamed from: getCaptureButtonVisibility$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getCaptureButtonVisibility() {
        return this.captureButtonVisibility;
    }

    @NotNull
    public final StringRepresentation getCaptureFrameContentDescription$onfido_capture_sdk_core_release(DocumentFormat forFormat) {
        DocumentConfigurationManager documentConfigurationManager = this.documentConfigurationManager;
        DocumentType documentType$onfido_capture_sdk_core_release = getDocumentType$onfido_capture_sdk_core_release();
        CountryCode countryCode = this.countryCode;
        DocSide docSide = this.documentSide;
        if (forFormat == null) {
            forFormat = this.documentFormat;
        }
        return new StringRepresentation.SingleStringResIdRepresentation(documentConfigurationManager.captureFrameContentDescription(documentType$onfido_capture_sdk_core_release, countryCode, docSide, forFormat, this.announcementService.isEnabled()));
    }

    @NotNull
    /* JADX INFO: renamed from: getCaptureResult$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getCaptureResult() {
        return this.captureResult;
    }

    @NotNull
    public final File getCapturedFilesDir$onfido_capture_sdk_core_release() {
        File file = this.capturedFilesDir;
        if (file != null) {
            return file;
        }
        Intrinsics.r("capturedFilesDir");
        throw null;
    }

    /* JADX INFO: renamed from: getCapturedImage$onfido_capture_sdk_core_release, reason: from getter */
    public final OnfidoImage getCapturedImage() {
        return this.capturedImage;
    }

    /* JADX INFO: renamed from: getCapturedVideoFilePath$onfido_capture_sdk_core_release, reason: from getter */
    public final String getCapturedVideoFilePath() {
        return this.capturedVideoFilePath;
    }

    /* JADX INFO: renamed from: getCountryCode$onfido_capture_sdk_core_release, reason: from getter */
    public final CountryCode getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: getCroppedImage$onfido_capture_sdk_core_release, reason: from getter */
    public final byte[] getCroppedImage() {
        return this.croppedImage;
    }

    /* JADX INFO: renamed from: getCurrentCaptureFlowError$onfido_capture_sdk_core_release, reason: from getter */
    public final ErrorType getCurrentCaptureFlowError() {
        return this.currentCaptureFlowError;
    }

    @NotNull
    /* JADX INFO: renamed from: getDocFormatDialogTitleFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getDocFormatDialogTitleFlow() {
        return this.docFormatDialogTitleFlow;
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

    @NotNull
    public final CaptureStepDataBundle getDocumentData$onfido_capture_sdk_core_release() {
        CaptureStepDataBundle captureStepDataBundle = this.documentData;
        if (captureStepDataBundle != null) {
            return captureStepDataBundle;
        }
        Intrinsics.r("documentData");
        throw null;
    }

    /* JADX INFO: renamed from: getDocumentFormat$onfido_capture_sdk_core_release, reason: from getter */
    public final DocumentFormat getDocumentFormat() {
        return this.documentFormat;
    }

    /* JADX INFO: renamed from: getDocumentSide$onfido_capture_sdk_core_release, reason: from getter */
    public final DocSide getDocumentSide() {
        return this.documentSide;
    }

    @NotNull
    public final DocumentType getDocumentType$onfido_capture_sdk_core_release() {
        DocumentType documentType = this.documentType;
        if (documentType != null) {
            return documentType;
        }
        Intrinsics.r("documentType");
        throw null;
    }

    @NotNull
    public final DocumentTypeUIModel getDocumentTypeUIModel$onfido_capture_sdk_core_release() {
        DocumentTypeUIModel documentTypeUIModel = this.documentTypeUIModel;
        if (documentTypeUIModel != null) {
            return documentTypeUIModel;
        }
        Intrinsics.r("documentTypeUIModel");
        throw null;
    }

    @NotNull
    /* JADX INFO: renamed from: getDocumentVideoId$onfido_capture_sdk_core_release, reason: from getter */
    public final String getDocumentVideoId() {
        return this.documentVideoId;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorDescriptorFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getErrorDescriptorFlow() {
        return this.errorDescriptorFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorMessageFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getErrorMessageFlow() {
        return this.errorMessageFlow;
    }

    /* JADX INFO: renamed from: getExtractedMRZDocument$onfido_capture_sdk_core_release, reason: from getter */
    public final MRZDocument getExtractedMRZDocument() {
        return this.extractedMRZDocument;
    }

    @NotNull
    /* JADX INFO: renamed from: getHidePostCaptureValidationBubbleFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getHidePostCaptureValidationBubbleFlow() {
        return this.hidePostCaptureValidationBubbleFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getImageProcessingFinished$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getImageProcessingFinished() {
        return this.imageProcessingFinished;
    }

    @NotNull
    /* JADX INFO: renamed from: getLiveValidationBubbleVisibility$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getLiveValidationBubbleVisibility() {
        return this.liveValidationBubbleVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: getLoadingFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableStateFlow getLoadingFlow() {
        return this.loadingFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getManualFallbackDelayFinished$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getManualFallbackDelayFinished() {
        return this.manualFallbackDelayFinished;
    }

    /* JADX INFO: renamed from: getNfcArguments$onfido_capture_sdk_core_release, reason: from getter */
    public final NfcArguments getNfcArguments() {
        return this.nfcArguments;
    }

    public final int getOverlayLayout$onfido_capture_sdk_core_release() {
        if (this.isProofOfAddress) {
            return R.layout.onfido_view_overlay_poa_a4page;
        }
        DocumentType[] elements = {DocumentType.PASSPORT, DocumentType.VISA};
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (kotlin.collections.d.y0(elements).contains(getDocumentType$onfido_capture_sdk_core_release())) {
            return R.layout.onfido_view_overlay_passport;
        }
        DocumentType documentType$onfido_capture_sdk_core_release = getDocumentType$onfido_capture_sdk_core_release();
        DocumentType documentType = DocumentType.DRIVING_LICENCE;
        if (isFolded(documentType$onfido_capture_sdk_core_release, documentType, CountryCode.DE)) {
            return R.layout.onfido_view_overlay_german_dl;
        }
        if (isFolded(getDocumentType$onfido_capture_sdk_core_release(), documentType, CountryCode.FR)) {
            return R.layout.onfido_view_overlay_french_dl;
        }
        DocumentType documentType$onfido_capture_sdk_core_release2 = getDocumentType$onfido_capture_sdk_core_release();
        DocumentType documentType2 = DocumentType.NATIONAL_IDENTITY_CARD;
        return (isFolded(documentType$onfido_capture_sdk_core_release2, documentType2, CountryCode.IT) || isFolded(getDocumentType$onfido_capture_sdk_core_release(), documentType2, CountryCode.ZA)) ? R.layout.onfido_view_overlay_italian_id : getDocumentType$onfido_capture_sdk_core_release() == DocumentType.GENERIC ? R.layout.onfido_view_overlay_generic : R.layout.onfido_view_overlay_document;
    }

    @NotNull
    /* JADX INFO: renamed from: getShouldEnableTorch$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShouldEnableTorch() {
        return this.shouldEnableTorch;
    }

    @NotNull
    /* JADX INFO: renamed from: getShouldHideOverlay$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getShouldHideOverlay() {
        return this.shouldHideOverlay;
    }

    @NotNull
    /* JADX INFO: renamed from: getShouldOpenCaptureScreen$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShouldOpenCaptureScreen() {
        return this.shouldOpenCaptureScreen;
    }

    @NotNull
    /* JADX INFO: renamed from: getShouldShowCaptureErrorDialog$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShouldShowCaptureErrorDialog() {
        return this.shouldShowCaptureErrorDialog;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowConfirmationFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getShowConfirmationFlow() {
        return this.showConfirmationFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowLiveValidation$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShowLiveValidation() {
        return this.showLiveValidation;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowVideoRecordingInfo$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getShowVideoRecordingInfo() {
        return this.showVideoRecordingInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: getStartCapture$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getStartCapture() {
        return this.startCapture;
    }

    @NotNull
    /* JADX INFO: renamed from: getStartVideoRecording$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getStartVideoRecording() {
        return this.startVideoRecording;
    }

    /* JADX INFO: renamed from: getTakenPhotoCount$onfido_capture_sdk_core_release, reason: from getter */
    public final int getTakenPhotoCount() {
        return this.takenPhotoCount;
    }

    /* JADX INFO: renamed from: getUploadBinaryResult$onfido_capture_sdk_core_release, reason: from getter */
    public final UploadBinaryResult getUploadBinaryResult() {
        return this.uploadBinaryResult;
    }

    @NotNull
    /* JADX INFO: renamed from: getValidCaptureFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getValidCaptureFlow() {
        return this.validCaptureFlow;
    }

    public final boolean hasNativeLibrary$onfido_capture_sdk_core_release() {
        return this.nativeDetector.hasNativeLibrary();
    }

    public final void initDocumentTypeUIModel$onfido_capture_sdk_core_release(boolean isProofOfAddress) {
        setDocumentTypeUIModel$onfido_capture_sdk_core_release(getDocumentTypeUIModel(isProofOfAddress));
    }

    public final boolean isAddressPageBackCapture$onfido_capture_sdk_core_release() {
        return this.documentSide == DocSide.BACK && getDocumentType$onfido_capture_sdk_core_release() == DocumentType.PASSPORT && this.documentConfigurationManager.isAddressPageCountryEnabled(this.countryCode);
    }

    /* JADX INFO: renamed from: isAutoCaptured$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsAutoCaptured() {
        return this.isAutoCaptured;
    }

    public final boolean isCutoffImprovementsEnabled$onfido_capture_sdk_core_release() {
        return this.onfidoRemoteConfig.isCutoffImprovementsEnabled();
    }

    public final boolean isDarkModeEnabled$onfido_capture_sdk_core_release() {
        Boolean boolValueOf;
        Object locale;
        SharedPreferencesDataSource sharedPreferencesDataSource = this.storage;
        StorageKey storageKey = StorageKey.IS_IN_DARK_MODE;
        SharedPreferences prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        String strName = storageKey.name();
        if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(Boolean.class);
            if (kClassB.equals(p0Var.b(String.class))) {
                locale = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
            } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
            } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
            } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                locale = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
            } else {
                if (!kClassB.equals(p0Var.b(Locale.class))) {
                    throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                }
                locale = sharedPreferencesDataSource.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            boolValueOf = (Boolean) locale;
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final boolean isDocumentFrameValidForAutoCapture$onfido_capture_sdk_core_release(@NotNull DocumentProcessingResults results) {
        Intrinsics.checkNotNullParameter(results, "results");
        return this.shouldWaitForMRZExtractionResult ? this.isMRZExtractionTimeExceeded && results.isValidDocumentImage() : results.isValidDocumentImage();
    }

    public final boolean isFourByThreeEnabled$onfido_capture_sdk_core_release() {
        return this.onfidoRemoteConfig.isFourByThreeEnabled();
    }

    /* JADX INFO: renamed from: isProofOfAddress$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsProofOfAddress() {
        return this.isProofOfAddress;
    }

    public final void onCameraStarted$onfido_capture_sdk_core_release() {
        this.extractedMRZDocument = null;
        this.firstFrameEmitTime = 0L;
        this._captureButtonVisibility.setValue(Boolean.valueOf(!shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release()));
        if (isMlModelAutoCaptureEnabled()) {
            observeAutoCapture();
        }
    }

    public final void onCaptureButtonClicked$onfido_capture_sdk_core_release() {
        this._startCapture.k(null);
        this._captureButtonVisibility.setValue(Boolean.FALSE);
        trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release();
        trackStartPerformanceEvent$onfido_capture_sdk_core_release();
        disposeAutocaptureSubscriptions();
    }

    public final void onCaptureCompleted$onfido_capture_sdk_core_release(@NotNull DocumentCaptureScreen.DocumentCaptureResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof DocumentCaptureScreen.DocumentCaptureResult.Completed) {
            callMediaCallback();
        }
    }

    public final void onCaptureConfirmed$onfido_capture_sdk_core_release() {
        OnfidoImage onfidoImage = this.capturedImage;
        if (onfidoImage == null) {
            this.validCaptureFlow.k(new ValidCaptureEvent(false));
            return;
        }
        if (shouldUploadDocument()) {
            uploadDocument(onfidoImage.getData());
        } else {
            UploadBinaryResult uploadBinaryResult = this.uploadBinaryResult;
            if (uploadBinaryResult != null) {
                checkUploadBinaryResult(uploadBinaryResult);
            }
        }
        trackDocumentCaptureFlowCompleted();
    }

    public final void onCaptureDiscarded$onfido_capture_sdk_core_release() {
        reset$onfido_capture_sdk_core_release();
        this._shouldOpenCaptureScreen.setValue(Boolean.TRUE);
    }

    public final void onCaptureErrorConfirmed$onfido_capture_sdk_core_release() {
        if (this.onfidoRemoteConfig.getCameraXConfiguration().isFallbackEnabled()) {
            Timber.INSTANCE.e("CameraX encountered an issue, switching to Camera1 API", new Object[0]);
            DefaultOnfidoRemoteConfig.INSTANCE.setCameraXEnabled(false);
        }
        reset$onfido_capture_sdk_core_release();
        this._shouldOpenCaptureScreen.setValue(Boolean.TRUE);
    }

    public final void onCaptureScreenOpened$onfido_capture_sdk_core_release() {
        this.capturedImage = null;
        this._shouldOpenCaptureScreen.setValue(Boolean.FALSE);
        this._cameraState.setValue(CameraState.ON.INSTANCE);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.rectangleDetector.close();
    }

    public final void onDocumentFormatSelected$onfido_capture_sdk_core_release(@NotNull DocumentFormat documentFormat) {
        Intrinsics.checkNotNullParameter(documentFormat, "documentFormat");
        FlowExtKt.clear(this._docFormatDialogTitleFlow);
        this.documentFormat = documentFormat;
        if (documentFormat == DocumentFormat.FOLDED) {
            onFoldedFormat();
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onDocumentVideoUploaded(@NotNull String documentVideoId) {
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        this.documentVideoId = documentVideoId;
        trackWaitingScreenCompleted();
        UploadBinaryResult uploadBinaryResult = this.uploadBinaryResult;
        if (uploadBinaryResult != null) {
            checkUploadBinaryResult(uploadBinaryResult);
        } else {
            this.validCaptureFlow.k(new ValidCaptureEvent(false));
        }
    }

    public final void onErrorVideoRecording$onfido_capture_sdk_core_release() {
        this._shouldShowCaptureErrorDialog.setValue(Boolean.TRUE);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onLivePhotoUploaded(@NotNull LivePhotoUpload livePhotoUpload) {
        CaptureUploadServiceListener.DefaultImpls.onLivePhotoUploaded(this, livePhotoUpload);
    }

    public final void onManualFallbackDelayFinished$onfido_capture_sdk_core_release() {
        this._captureButtonVisibility.setValue(Boolean.TRUE);
    }

    public final void onNextFrame$onfido_capture_sdk_core_release(@NotNull OnfidoImage frame, @NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        boolean z = false;
        if (this.firstFrameEmitTime == 0) {
            this.emittedFramesCount = 0;
            this.processedFramesCount = 0;
            this.firstFrameEmitTime = this.timeProvider.getCurrentTimestamp();
        }
        this.emittedFramesCount++;
        DocumentDetectionFrame documentDetectionFrame$onfido_capture_sdk_core_release = this.imageUtils.getDocumentDetectionFrame$onfido_capture_sdk_core_release(frame, overlayMetrics.getRealCaptureRect(), overlayMetrics.getVisibleCaptureRect());
        if (isMlModelAutoCaptureEnabled()) {
            DocumentValidationTargets documentValidationTargets = this.documentValidationTarget;
            if (documentValidationTargets != null) {
                e0.C(ViewModelKt.getViewModelScope(this), null, null, new DocumentCaptureViewModel$onNextFrame$1$1(this, documentDetectionFrame$onfido_capture_sdk_core_release, documentValidationTargets, null), 3);
            }
        } else {
            frame.getBitmap().recycle();
            this.nativeDetector.getFrameData().onNext(documentDetectionFrame$onfido_capture_sdk_core_release);
            this.documentFrame.k(documentDetectionFrame$onfido_capture_sdk_core_release);
        }
        this.nativeDetector.getFrameData().onNext(documentDetectionFrame$onfido_capture_sdk_core_release);
        this.documentFrame.k(documentDetectionFrame$onfido_capture_sdk_core_release);
        MRZDocument mRZDocument = this.extractedMRZDocument;
        if (mRZDocument != null && mRZDocument.isValid()) {
            z = true;
        }
        if (!this.onfidoRemoteConfig.isOnDeviceMRZExtractionEnabled() || z) {
            return;
        }
        e0.C(ViewModelKt.getViewModelScope(this), null, null, new DocumentCaptureViewModel$onNextFrame$2(this, documentDetectionFrame$onfido_capture_sdk_core_release, null), 3);
    }

    public final void onOverlayMetrics$onfido_capture_sdk_core_release(@NotNull OverlayMetrics overlayMetrics) {
        Intrinsics.checkNotNullParameter(overlayMetrics, "overlayMetrics");
        this.overlayMetrics = overlayMetrics;
        this.overlayMetricsStateFlow.k(overlayMetrics);
        this._cameraState.setValue(CameraState.ON.INSTANCE);
        if (this.documentType != null) {
            DocumentType documentType$onfido_capture_sdk_core_release = getDocumentType$onfido_capture_sdk_core_release();
            DocSide docSide = this.documentSide;
            OnfidoRectF.Companion companion = OnfidoRectF.INSTANCE;
            OnfidoRectF onfidoRectF = companion.toOnfidoRectF(overlayMetrics.getVisibleCaptureRect());
            OnfidoRectF onfidoRectF2 = companion.toOnfidoRectF(overlayMetrics.getRealCaptureRect());
            b.Companion companion2 = kotlin.time.b.INSTANCE;
            this.documentValidationTarget = new DocumentValidationTargets(documentType$onfido_capture_sdk_core_release, docSide, onfidoRectF, onfidoRectF2, kotlin.time.c.g(this.onfidoRemoteConfig.getDocumentDetectionExperiment().getHoldDurationInMs(), e.MILLISECONDS), null);
        }
    }

    public final void onPictureCaptureFailed$onfido_capture_sdk_core_release() {
        if (this.capturedImage != null) {
            Timber.INSTANCE.i("An issue occurred after the image capture. But, it has been ignored!", new Object[0]);
            return;
        }
        trackEndPerformanceEvent$onfido_capture_sdk_core_release();
        this._shouldShowCaptureErrorDialog.setValue(Boolean.TRUE);
        this._cameraState.setValue(CameraState.OFF.INSTANCE);
    }

    public final void onPictureCaptured$onfido_capture_sdk_core_release(@NotNull OnfidoImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        trackEndPerformanceEvent$onfido_capture_sdk_core_release();
        this.takenPhotoCount++;
        this.capturedImage = image;
        this.uploadBinaryResult = null;
        this.documentVideoId = "";
        if (!shouldRecordDocumentVideo$onfido_capture_sdk_core_release()) {
            applyValidationsAfterAnimationDelay(getPictureCapturedAnimationDelay());
        } else {
            this._startVideoRecording.setValue(Boolean.TRUE);
            this._showVideoRecordingInfo.setValue(new VideoRecordingEvent(true, R.string.onfido_doc_capture_header_recording_video));
        }
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onUploadError(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        if (errorType instanceof ErrorType.Document ? true : Intrinsics.f(errorType, ErrorType.Cutoff.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Glare.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Blur.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Barcode.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.PhotoOfScreen.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Screenshot.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Photocopy.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Scan.INSTANCE)) {
            onUploadValidationError(errorType);
            return;
        }
        if (errorType instanceof ErrorType.Network) {
            onUploadFailure();
            return;
        }
        if (errorType instanceof ErrorType.InvalidCertificate) {
            onInvalidCertificateDetected(((ErrorType.InvalidCertificate) errorType).getMessage());
            return;
        }
        if (errorType instanceof ErrorType.TokenExpired) {
            onTokenExpired();
        } else if (errorType instanceof ErrorType.Geoblocked) {
            onUploadFailureWithGeoblocking();
        } else if (errorType instanceof ErrorType.Generic) {
            onGeneralUploadError();
        }
    }

    public final void onVideoCaptured$onfido_capture_sdk_core_release(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.capturedVideoFilePath = filePath;
    }

    public final void onVideoRecordingStopped$onfido_capture_sdk_core_release() {
        this._startVideoRecording.setValue(null);
    }

    public final void onViewResumed$onfido_capture_sdk_core_release() {
        if (hasNativeLibrary$onfido_capture_sdk_core_release()) {
            this._showLiveValidation.k(new OnfidoCaptureValidationBubble.Content.Info(R.string.onfido_doc_capture_alert_glare_title, Integer.valueOf(R.string.onfido_doc_capture_alert_glare_detail)));
        }
        checkDocumentFormat();
    }

    public final void prepareCaptureStart$onfido_capture_sdk_core_release(boolean isFirstStart, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        trackCapture$onfido_capture_sdk_core_release(orientation);
        if (shouldEnableAccessibilityCapture$onfido_capture_sdk_core_release()) {
            enableAccessibilityCapture(getDocumentType$onfido_capture_sdk_core_release());
        }
        this.mrzExtractionResultMap.clear();
        this.barcodeValidationSuspender.reset$onfido_capture_sdk_core_release();
        this.retainableValidationsResult.clear$onfido_capture_sdk_core_release();
        this.isAutoCaptured = false;
        setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release(new DocumentCaptureResultConsumer(this, this.onfidoRemoteConfig, shouldAutoCaptureDocument$onfido_capture_sdk_core_release(), this.shouldHideOverlay, this._startCapture, this._showLiveValidation, this._liveValidationBubbleVisibility));
        Job job2 = this.imageProcessingJob;
        if (job2 != null) {
            job2.f(null);
        }
        this.imageProcessingJob = e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.getIo(), null, new DocumentCaptureViewModel$prepareCaptureStart$1(this, isFirstStart, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void reset$onfido_capture_sdk_core_release() {
        this._cameraState.setValue(CameraState.OFF.INSTANCE);
        Job job2 = this.autoCaptureJob;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.imageProcessingJob;
        if (job3 != null) {
            job3.f(null);
        }
        this.nativeDetector.clearEdges();
        this.shouldHideOverlay.k(Boolean.TRUE);
        disposeAutocaptureSubscriptions();
        this.shouldWaitForMRZExtractionResult = false;
        this.isMRZExtractionTimeExceeded = false;
        MutableStateFlow mutableStateFlow = this._captureButtonVisibility;
        Boolean bool = Boolean.FALSE;
        mutableStateFlow.setValue(bool);
        this._startCapture.setValue(null);
        this._startVideoRecording.setValue(null);
        this._showVideoRecordingInfo.setValue(new VideoRecordingEvent(false, 0 == true ? 1 : 0, 2, defaultConstructorMarker));
        this._shouldEnableTorch.setValue(bool);
        this._showLiveValidation.setValue(null);
        this._liveValidationBubbleVisibility.setValue(null);
        this._shouldShowCaptureErrorDialog.setValue(bool);
    }

    public final void setAutoCaptured$onfido_capture_sdk_core_release(boolean z) {
        this.isAutoCaptured = z;
    }

    public final void setCaptureData$onfido_capture_sdk_core_release(@NotNull CaptureStepDataBundle captureDataBundle, NfcArguments nfcArguments) {
        Intrinsics.checkNotNullParameter(captureDataBundle, "captureDataBundle");
        setDocumentData$onfido_capture_sdk_core_release(captureDataBundle);
        DocumentType documentType = captureDataBundle.getDocumentType();
        if (documentType == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        setDocumentType$onfido_capture_sdk_core_release(documentType);
        this.countryCode = getDocumentData$onfido_capture_sdk_core_release().getCountryCode();
        this.documentFormat = getDocumentData$onfido_capture_sdk_core_release().getDocumentFormat();
        this.nfcArguments = nfcArguments;
    }

    public final void setCapturedFilesDir$onfido_capture_sdk_core_release(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.capturedFilesDir = file;
    }

    public final void setCapturedImage$onfido_capture_sdk_core_release(OnfidoImage onfidoImage) {
        this.capturedImage = onfidoImage;
    }

    public final void setCountryCode$onfido_capture_sdk_core_release(CountryCode countryCode) {
        this.countryCode = countryCode;
    }

    public final void setCroppedImage$onfido_capture_sdk_core_release(byte[] bArr) {
        this.croppedImage = bArr;
    }

    public final void setCurrentCaptureFlowError$onfido_capture_sdk_core_release(ErrorType errorType) {
        this.currentCaptureFlowError = errorType;
    }

    public final void setDocumentCaptureResultConsumer$onfido_capture_sdk_core_release(@NotNull DocumentCaptureResultConsumer documentCaptureResultConsumer) {
        Intrinsics.checkNotNullParameter(documentCaptureResultConsumer, "<set-?>");
        this.documentCaptureResultConsumer = documentCaptureResultConsumer;
    }

    public final void setDocumentData$onfido_capture_sdk_core_release(@NotNull CaptureStepDataBundle captureStepDataBundle) {
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "<set-?>");
        this.documentData = captureStepDataBundle;
    }

    public final void setDocumentFormat$onfido_capture_sdk_core_release(DocumentFormat documentFormat) {
        this.documentFormat = documentFormat;
    }

    public final void setDocumentSide$onfido_capture_sdk_core_release(DocSide docSide) {
        this.documentSide = docSide;
    }

    public final void setDocumentType$onfido_capture_sdk_core_release(@NotNull DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "<set-?>");
        this.documentType = documentType;
    }

    public final void setDocumentTypeUIModel$onfido_capture_sdk_core_release(@NotNull DocumentTypeUIModel documentTypeUIModel) {
        Intrinsics.checkNotNullParameter(documentTypeUIModel, "<set-?>");
        this.documentTypeUIModel = documentTypeUIModel;
    }

    public final void setDocumentVideoId$onfido_capture_sdk_core_release(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.documentVideoId = str;
    }

    public final void setProofOfAddress$onfido_capture_sdk_core_release(boolean z) {
        this.isProofOfAddress = z;
    }

    public final void setUploadBinaryResult$onfido_capture_sdk_core_release(UploadBinaryResult uploadBinaryResult) {
        this.uploadBinaryResult = uploadBinaryResult;
    }

    public final boolean shouldAutoCaptureDocument$onfido_capture_sdk_core_release() {
        return hasNativeLibrary$onfido_capture_sdk_core_release() && shouldAutocapture();
    }

    public final boolean shouldEnableAccessibilityCapture$onfido_capture_sdk_core_release() {
        return this.announcementService.isEnabled() && !(this.rectangleDetector instanceof RectangleDetectorEmpty);
    }

    public final boolean shouldHideManualDocumentCaptureButton$onfido_capture_sdk_core_release() {
        return !isAddressPageBackCapture$onfido_capture_sdk_core_release() && !this.announcementService.isEnabled() && this.announcementService.isEnabled() && shouldAutoCaptureDocument$onfido_capture_sdk_core_release();
    }

    public final boolean shouldRecordDocumentVideo$onfido_capture_sdk_core_release() {
        return this.onfidoRemoteConfig.isMultiImageCaptureEnabled();
    }

    public final boolean shouldShowFrenchDLOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.DRIVING_LICENCE, CountryCode.FR);
    }

    public final boolean shouldShowGermanDLOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.DRIVING_LICENCE, CountryCode.DE);
    }

    public final boolean shouldShowInitialOverlay$onfido_capture_sdk_core_release() {
        return this.documentConfigurationManager.shouldShowInitialOverlay(getDocumentType$onfido_capture_sdk_core_release());
    }

    public final boolean shouldShowItalianIDOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.NATIONAL_IDENTITY_CARD, CountryCode.IT);
    }

    public final boolean shouldShowSouthAfricanIDOverlay$onfido_capture_sdk_core_release(boolean isFrontSide, boolean isOverlayGone) {
        return shouldShowOverlay(isFrontSide, isOverlayGone, DocumentType.NATIONAL_IDENTITY_CARD, CountryCode.ZA);
    }

    public final void startDocumentVideoRecordingTimer$onfido_capture_sdk_core_release(@NotNull Function0<Boolean> hasValidRecording) {
        Intrinsics.checkNotNullParameter(hasValidRecording, "hasValidRecording");
        SdkConfiguration.DocumentCapture documentCapture = this.onfidoRemoteConfig.getDocumentCapture();
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.getIo(), null, new DocumentCaptureViewModel$startDocumentVideoRecordingTimer$1(documentCapture.getVideoTimeoutMs(), documentCapture.getTorchTurnOnTimeMs(), documentCapture.getVideoLengthMs(), this, hasValidRecording, null), 2);
    }

    public final void startOverlayDisplayTimer$onfido_capture_sdk_core_release() {
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.mo3706getDefault(), null, new DocumentCaptureViewModel$startOverlayDisplayTimer$1(this, null), 2);
    }

    public final void trackAutocaptureShutterButtonClick$onfido_capture_sdk_core_release() {
        if (shouldAutoCaptureDocument$onfido_capture_sdk_core_release()) {
            this.documentCaptureTracker.trackCaptureButtonClicked(this.currentCaptureFlowError, this.takenPhotoCount + 1, this.rejectionCount);
        }
    }

    public final void trackCapture$onfido_capture_sdk_core_release(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.documentCaptureTracker.trackDocumentCapture(orientation.isPortrait$onfido_capture_sdk_core_release(), getDocumentData$onfido_capture_sdk_core_release(), shouldAutoCaptureDocument$onfido_capture_sdk_core_release());
    }

    public final void trackCaptureBackButtonClicked$onfido_capture_sdk_core_release() {
        this.documentCaptureTracker.trackCaptureBackButtonClicked$onfido_capture_sdk_core_release(this.takenPhotoCount, this.rejectionCount, this.currentCaptureFlowError);
    }

    public final void trackCaptureError$onfido_capture_sdk_core_release() {
        this.documentCaptureTracker.trackDocumentCaptureError(this.documentSide);
    }

    public final void trackDocumentConfirmationStep$onfido_capture_sdk_core_release() {
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
        this.documentCaptureTracker.trackDocumentConfirmation(getDocumentData$onfido_capture_sdk_core_release(), this.takenPhotoCount, this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries(), this.isAutoCaptured, linkedHashMap);
    }

    public final void trackEndPerformanceEvent$onfido_capture_sdk_core_release() {
        this.documentCaptureTracker.trackEndTracingPerformance();
    }

    public final void trackStartPerformanceEvent$onfido_capture_sdk_core_release() {
        this.documentCaptureTracker.trackStartTracingPerformance();
    }

    public final void trackUploadStarted$onfido_capture_sdk_core_release() {
        NFCOptions nfcOptions;
        DocumentCaptureTracker documentCaptureTracker = this.documentCaptureTracker;
        CaptureStepDataBundle documentData$onfido_capture_sdk_core_release = getDocumentData$onfido_capture_sdk_core_release();
        int i = this.takenPhotoCount;
        int maxTotalRetries = this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries();
        boolean zShouldAutoCaptureDocument$onfido_capture_sdk_core_release = shouldAutoCaptureDocument$onfido_capture_sdk_core_release();
        boolean z = this.isAutoCaptured;
        boolean zIsValid = this.processingResults.getMrzValidationResult().isValid();
        NfcArguments nfcArguments = this.nfcArguments;
        documentCaptureTracker.trackUploadStarted(documentData$onfido_capture_sdk_core_release, i, maxTotalRetries, zShouldAutoCaptureDocument$onfido_capture_sdk_core_release, z, zIsValid, (nfcArguments == null || (nfcOptions = nfcArguments.getNfcOptions()) == null) ? false : NFCOptionsKt.isEnabled(nfcOptions));
    }

    public final void trackVideoCaptureTimeout() {
        this.documentCaptureTracker.trackVideoCaptureTimeout();
    }

    public final void trackVideoTimeoutRetryButtonClicked$onfido_capture_sdk_core_release() {
        this.documentCaptureTracker.trackVideoTimeoutRetryButtonClicked();
    }

    public final void trackWaitingScreenCompleted() {
        this.documentCaptureTracker.trackWaitingScreenCompletion((isCheckingImageQuality() ? new LoadingFragment.Companion.DialogMode.CheckingImageQuality("UPLOADING_DOCUMENT") : new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_DOCUMENT")).toTaskType(), "UPLOADING_DOCUMENT");
    }

    public final void uploadDocumentMedia$onfido_capture_sdk_core_release(@NotNull List<Validation> validations, @NotNull byte[] jpegData) {
        Intrinsics.checkNotNullParameter(validations, "validations");
        Intrinsics.checkNotNullParameter(jpegData, "jpegData");
        e0.C(ViewModelKt.getViewModelScope(this), this.dispatchersProvider.getIo(), null, new DocumentCaptureViewModel$uploadDocumentMedia$1(this, jpegData, validations, null), 2);
    }
}
