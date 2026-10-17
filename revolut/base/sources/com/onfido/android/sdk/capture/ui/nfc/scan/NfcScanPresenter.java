package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.nfc.Error;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.NfcReadState;
import com.onfido.android.sdk.capture.internal.nfc.NfcTagDelegate;
import com.onfido.android.sdk.capture.internal.nfc.NfcTimeouts;
import com.onfido.android.sdk.capture.internal.nfc.PassportAuthAccess;
import com.onfido.android.sdk.capture.internal.nfc.PinVerificationError;
import com.onfido.android.sdk.capture.internal.nfc.Reading;
import com.onfido.android.sdk.capture.internal.nfc.RealtimeNfcEvents;
import com.onfido.android.sdk.capture.internal.nfc.Retrying;
import com.onfido.android.sdk.capture.internal.nfc.Success;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.nfc.MRTDDataGroup;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 x2\u00020\u0001:\u0002xyB©\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020'2\u0006\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020'H\u0002¢\u0006\u0004\b0\u0010+J\u0017\u00103\u001a\u00020'2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020'2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b5\u00104J\u0019\u00108\u001a\u00020\f2\b\u00107\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020'2\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020'¢\u0006\u0004\bB\u0010+J\r\u0010C\u001a\u00020'¢\u0006\u0004\bC\u0010+J\r\u0010D\u001a\u00020\f¢\u0006\u0004\bD\u0010;J\r\u0010E\u001a\u00020'¢\u0006\u0004\bE\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010FR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010GR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010IR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010JR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010KR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010MR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010NR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010PR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010QR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010RR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010SR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010TR\u001a\u0010\"\u001a\u00020!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u0002010_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010d\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010<0<0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010KR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u0002010g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00130l8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010q\u001a\u00020>8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020u0g8\u0006¢\u0006\f\n\u0004\bv\u0010i\u001a\u0004\bw\u0010k¨\u0006z"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "passportBACKey", "", "aaChallenge", "", "chipAuthentication", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "fileIDs", "Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;", "realtimeNfcEvents", "", "pinLength", "Landroid/content/res/Resources;", "resources", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "nfcInteractor", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcTimeouts;", "nfcTimeouts", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "storage", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "remoteConfig", "<init>", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;[BZ[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;ILandroid/content/res/Resources;Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;Lcom/onfido/android/sdk/capture/internal/nfc/NfcTimeouts;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "Lcom/onfido/android/sdk/capture/internal/nfc/Success;", "successReadState", "", "onNfcTagRead", "(Lcom/onfido/android/sdk/capture/internal/nfc/Success;)V", "startNfcScanTimeout", "()V", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcData", "startNfcScanSuccessTimeout", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "stopScanningTimeoutTimer", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;", "nfcScanState", "setScanningStateTo", "(Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanState;)V", "logScanningState", "Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;", "auth", "shouldSkipPace", "(Lcom/onfido/android/sdk/capture/internal/nfc/PassportAuthAccess;)Z", "isDocumentWithPin", "()Z", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcTagDelegate;", "tag", "", "pin", "onNfcTagDetected", "(Lcom/onfido/android/sdk/capture/internal/nfc/NfcTagDelegate;Ljava/lang/String;)V", "onNfcScanClicked", "nfcScanDialogDismissed", "isDarkModeEnabled", "onClean", "Lcom/onfido/android/sdk/capture/DocumentType;", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "[B", "Z", "[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;", "I", "Landroid/content/res/Resources;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcTimeouts;", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "getRemoteConfig$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lio/reactivex/rxjava3/disposables/Disposable;", "readDisposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "scanningTimeoutDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "allDisposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "scanStateSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "nfcTagRetrySubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "shouldTryPace", "Lio/reactivex/rxjava3/core/Observable;", "scanState", "Lio/reactivex/rxjava3/core/Observable;", "getScanState", "()Lio/reactivex/rxjava3/core/Observable;", "", "nfcInstructions", "Ljava/util/List;", "getNfcInstructions", "()Ljava/util/List;", "pinDisclaimer", "Ljava/lang/String;", "getPinDisclaimer", "()Ljava/lang/String;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanViewState;", "viewState", "getViewState", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcScanPresenter {
    private final byte[] aaChallenge;

    @NotNull
    private final CompositeDisposable allDisposables;
    private final boolean chipAuthentication;
    private final CountryCode countryCode;

    @NotNull
    private final DocumentType documentType;

    @NotNull
    private final MRTDDataGroup[] fileIDs;

    @NotNull
    private final NfcFlowType nfcFlowType;

    @NotNull
    private final List<Integer> nfcInstructions;

    @NotNull
    private final NfcInteractor nfcInteractor;

    @NotNull
    private final PublishSubject nfcTagRetrySubject;

    @NotNull
    private final NfcTimeouts nfcTimeouts;

    @NotNull
    private final NfcTracker nfcTracker;

    @NotNull
    private final PassportBACKey passportBACKey;

    @NotNull
    private final String pinDisclaimer;
    private final int pinLength;
    private Disposable readDisposable;
    private final RealtimeNfcEvents realtimeNfcEvents;

    @NotNull
    private final OnfidoRemoteConfig remoteConfig;

    @NotNull
    private final Resources resources;

    @NotNull
    private final Observable scanState;

    @NotNull
    private final BehaviorSubject scanStateSubject;
    private Disposable scanningTimeoutDisposable;

    @NotNull
    private final SchedulersProvider schedulersProvider;
    private boolean shouldTryPace;

    @NotNull
    private final SharedPreferencesDataSource storage;

    @NotNull
    private final Observable viewState;

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001Ji\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "passportBACKey", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "aaChallenge", "", "chipAuthentication", "", "fileIDs", "", "Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;", "realtimeNfcEvents", "Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;", "pinLength", "", "resources", "Landroid/content/res/Resources;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;[BZ[Lcom/onfido/android/sdk/capture/nfc/MRTDDataGroup;Lcom/onfido/android/sdk/capture/internal/nfc/RealtimeNfcEvents;ILandroid/content/res/Resources;)Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        NfcScanPresenter create(@NotNull DocumentType documentType, CountryCode countryCode, @NotNull NfcFlowType nfcFlowType, @NotNull PassportBACKey passportBACKey, byte[] aaChallenge, boolean chipAuthentication, @NotNull MRTDDataGroup[] fileIDs, RealtimeNfcEvents realtimeNfcEvents, int pinLength, @NotNull Resources resources);
    }

    public NfcScanPresenter(@NotNull DocumentType documentType, CountryCode countryCode, @NotNull NfcFlowType nfcFlowType, @NotNull PassportBACKey passportBACKey, byte[] bArr, boolean z, @NotNull MRTDDataGroup[] fileIDs, RealtimeNfcEvents realtimeNfcEvents, int i, @NotNull Resources resources, @NotNull NfcInteractor nfcInteractor, @NotNull SchedulersProvider schedulersProvider, @NotNull NfcTracker nfcTracker, @NotNull NfcTimeouts nfcTimeouts, @NotNull SharedPreferencesDataSource storage, @NotNull OnfidoRemoteConfig remoteConfig) {
        String string;
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        Intrinsics.checkNotNullParameter(passportBACKey, "passportBACKey");
        Intrinsics.checkNotNullParameter(fileIDs, "fileIDs");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        Intrinsics.checkNotNullParameter(nfcTimeouts, "nfcTimeouts");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.documentType = documentType;
        this.countryCode = countryCode;
        this.nfcFlowType = nfcFlowType;
        this.passportBACKey = passportBACKey;
        this.aaChallenge = bArr;
        this.chipAuthentication = z;
        this.fileIDs = fileIDs;
        this.realtimeNfcEvents = realtimeNfcEvents;
        this.pinLength = i;
        this.resources = resources;
        this.nfcInteractor = nfcInteractor;
        this.schedulersProvider = schedulersProvider;
        this.nfcTracker = nfcTracker;
        this.nfcTimeouts = nfcTimeouts;
        this.storage = storage;
        this.remoteConfig = remoteConfig;
        this.allDisposables = new CompositeDisposable();
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(NotStarted.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.scanStateSubject = behaviorSubjectD;
        this.nfcTagRetrySubject = ch.qos.logback.core.util.a.n("create(...)");
        this.shouldTryPace = true;
        Observable observableObserveOn = behaviorSubjectD.hide().distinctUntilChanged().observeOn(schedulersProvider.getUi());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        this.scanState = observableObserveOn;
        DocumentType documentType2 = DocumentType.PASSPORT;
        this.nfcInstructions = (documentType == documentType2 && countryCode == CountryCode.US) ? v.k(Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_usa_scan_guide_1), Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_usa_scan_guide_2), Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_scan_guide_android_3)) : documentType == documentType2 ? v.k(Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_scan_guide_1), Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_scan_guide_android_2), Integer.valueOf(R.string.onfido_nfc_capture_scan_intro_passport_scan_guide_android_3)) : v.k(Integer.valueOf(R.string.onfido_nfc_scan_welcome_card_list_item), Integer.valueOf(R.string.onfido_nfc_scan_welcome_card_list_item_2), Integer.valueOf(R.string.onfido_nfc_scan_welcome_card_list_item_3));
        if (isDocumentWithPin()) {
            string = resources.getString(R.string.onfido_nfc_scan_pin_disclaimer, Integer.valueOf(i));
            Intrinsics.h(string);
        } else {
            string = "";
        }
        this.pinDisclaimer = string;
        Observable observableFromCallable = Observable.fromCallable(new Callable() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NfcScanPresenter.viewState$lambda$0(this.f50078a);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFromCallable, "fromCallable(...)");
        this.viewState = observableFromCallable;
    }

    private final boolean isDocumentWithPin() {
        return this.pinLength > 0;
    }

    private final void logScanningState(NfcScanState nfcScanState) {
        if (nfcScanState instanceof ScanningTimeout) {
            Timber.INSTANCE.e("NFC Logger - Scan FAIL - Timeout", new Object[0]);
            return;
        }
        if (!(nfcScanState instanceof ScanFailed)) {
            Timber.INSTANCE.i("NFC Logger - Scan state: ".concat(nfcScanState.getClass().getSimpleName()), new Object[0]);
            return;
        }
        Timber.INSTANCE.e("NFC Logger - Scan FAIL - " + ((ScanFailed) nfcScanState).getMessage(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNfcTagRead(com.onfido.android.sdk.capture.internal.nfc.Success r8) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.onNfcTagRead(com.onfido.android.sdk.capture.internal.nfc.Success):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScanningStateTo(NfcScanState nfcScanState) {
        logScanningState(nfcScanState);
        this.scanStateSubject.onNext(nfcScanState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldSkipPace(PassportAuthAccess auth) {
        return ((auth != null ? auth.getSelectAppletException() : null) == null || auth.getPaceException() == null || isDocumentWithPin()) ? false : true;
    }

    private final void startNfcScanSuccessTimeout(final NfcPassportExtraction nfcData, final NfcFlowType nfcFlowType) {
        CompositeDisposable compositeDisposable = this.allDisposables;
        Disposable disposableSubscribe = Observable.timer(this.nfcTimeouts.successScanTimeoutMs(), TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.startNfcScanSuccessTimeout.1
            public final void accept(long j2) {
                NfcScanPresenter.this.setScanningStateTo(new ScanCompleted(nfcData, nfcFlowType));
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.startNfcScanSuccessTimeout.2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                NfcScanPresenter nfcScanPresenter = NfcScanPresenter.this;
                String message = it8.getMessage();
                if (message == null) {
                    message = "";
                }
                nfcScanPresenter.setScanningStateTo(new ScanFailed(message));
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNfcScanTimeout() {
        Disposable disposableSubscribe = Observable.timer(this.nfcTimeouts.nfcScanTimeoutMs(), TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.startNfcScanTimeout.1
            public final void accept(long j2) {
                NfcScanPresenter.this.setScanningStateTo(ScanningTimeout.INSTANCE);
            }

            @Override // igm.g
            public /* bridge */ /* synthetic */ void accept(Object obj2) {
                accept(((Number) obj2).longValue());
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.startNfcScanTimeout.2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                NfcScanPresenter nfcScanPresenter = NfcScanPresenter.this;
                String message = it8.getMessage();
                if (message == null) {
                    message = "";
                }
                nfcScanPresenter.setScanningStateTo(new ScanFailed(message));
            }
        });
        CompositeDisposable compositeDisposable = this.allDisposables;
        Intrinsics.h(disposableSubscribe);
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
        this.scanningTimeoutDisposable = disposableSubscribe;
    }

    private final void stopScanningTimeoutTimer() {
        Disposable disposable = this.scanningTimeoutDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NfcScanViewState viewState$lambda$0(NfcScanPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DocumentType documentType = this$0.documentType;
        DocumentType documentType2 = DocumentType.PASSPORT;
        return new NfcScanViewState(documentType == documentType2 ? R.string.onfido_nfc_intro_title_passport : R.string.onfido_nfc_scan_welcome_card_title, R.string.onfido_nfc_intro_button_primary, documentType == documentType2 ? R.string.onfido_nfc_scan_welcome_passport_secondary_button : R.string.onfido_nfc_scan_welcome_card_secondary_button, false);
    }

    @NotNull
    public final List<Integer> getNfcInstructions() {
        return this.nfcInstructions;
    }

    @NotNull
    public final String getPinDisclaimer() {
        return this.pinDisclaimer;
    }

    @NotNull
    /* JADX INFO: renamed from: getRemoteConfig$onfido_capture_sdk_core_release, reason: from getter */
    public final OnfidoRemoteConfig getRemoteConfig() {
        return this.remoteConfig;
    }

    @NotNull
    public final Observable getScanState() {
        return this.scanState;
    }

    @NotNull
    public final Observable getViewState() {
        return this.viewState;
    }

    public final boolean isDarkModeEnabled() {
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

    public final void nfcScanDialogDismissed() {
        Timber.INSTANCE.i("NFC Logger - NFC Scan cancelled (dialog dismissed)", new Object[0]);
        setScanningStateTo(NotStarted.INSTANCE);
        this.allDisposables.d();
    }

    public final void onClean() {
        setScanningStateTo(NotStarted.INSTANCE);
        this.allDisposables.d();
    }

    public final void onNfcScanClicked() {
        this.nfcTracker.trackStartNfcScanSelected$onfido_capture_sdk_core_release(this.documentType, this.countryCode, this.nfcFlowType);
        setScanningStateTo(ScanReady.INSTANCE);
        startNfcScanTimeout();
    }

    public final void onNfcTagDetected(@NotNull NfcTagDelegate tag2, String pin) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        Timber.INSTANCE.i("NFC Logger - NFC Tag detected", new Object[0]);
        this.nfcTracker.trackNfcChipDiscovered$onfido_capture_sdk_core_release();
        if (this.scanStateSubject.e() instanceof ConnectionLost) {
            this.nfcTagRetrySubject.onNext(tag2);
            return;
        }
        setScanningStateTo(ScanReady.INSTANCE);
        stopScanningTimeoutTimer();
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Disposable disposable = this.readDisposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposableSubscribe = this.nfcInteractor.readNfcTag(this.nfcTagRetrySubject, tag2, this.passportBACKey, this.aaChallenge, this.fileIDs, pin, this.shouldTryPace, this.nfcFlowType, this.chipAuthentication, this.realtimeNfcEvents).delaySubscription(this.nfcTimeouts.nfcScanTagDelayMs(), TimeUnit.MILLISECONDS, this.schedulersProvider.getTimer()).doOnSubscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.onNfcTagDetected.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                NfcScanPresenter.this.setScanningStateTo(new Scanning(0, false, 3, null));
            }
        }).observeOn(this.schedulersProvider.getUi()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.onNfcTagDetected.2
            @Override // igm.g
            public final void accept(@NotNull NfcReadState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (state instanceof Success) {
                    NfcScanPresenter.this.onNfcTagRead((Success) state);
                    return;
                }
                if (state instanceof Error) {
                    NfcScanPresenter.this.setScanningStateTo(new ScanFailed(((Error) state).getMessage()));
                    NfcScanPresenter.this.shouldTryPace = !r0.shouldSkipPace(r5.getAuthAccess());
                    return;
                }
                if (state instanceof Retrying) {
                    NfcScanPresenter.this.setScanningStateTo(ScanRetry.INSTANCE);
                    NfcScanPresenter.this.startNfcScanTimeout();
                    return;
                }
                if (state instanceof Reading) {
                    NfcScanPresenter.this.setScanningStateTo(new Scanning(((Reading) state).getProgress(), ref$BooleanRef.f186407a));
                    ref$BooleanRef.f186407a = false;
                } else if (state instanceof com.onfido.android.sdk.capture.internal.nfc.ConnectionLost) {
                    ref$BooleanRef.f186407a = true;
                    NfcScanPresenter.this.setScanningStateTo(ConnectionLost.INSTANCE);
                    NfcScanPresenter.this.nfcTracker.trackNfcChipConnectionLost$onfido_capture_sdk_core_release();
                } else if (state instanceof PinVerificationError) {
                    NfcScanPresenter.this.setScanningStateTo(new PinVerificationFailed(((PinVerificationError) state).getAttemptsLeft()));
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter.onNfcTagDetected.3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                NfcScanPresenter nfcScanPresenter = NfcScanPresenter.this;
                String message = it8.getMessage();
                if (message == null) {
                    message = "";
                }
                nfcScanPresenter.setScanningStateTo(new ScanFailed(message));
            }
        });
        CompositeDisposable compositeDisposable = this.allDisposables;
        Intrinsics.h(disposableSubscribe);
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
        this.readDisposable = disposableSubscribe;
    }
}
