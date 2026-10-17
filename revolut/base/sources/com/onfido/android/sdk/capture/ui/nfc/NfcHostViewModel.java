package com.onfido.android.sdk.capture.ui.nfc;

import a0.d;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.nfc.NfcFailedScreen;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ®\u00012\u00020\u0001:\u0006®\u0001¯\u0001°\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0016¢\u0006\u0004\b%\u0010\u0018J\r\u0010&\u001a\u00020\u0016¢\u0006\u0004\b&\u0010\u0018J\r\u0010'\u001a\u00020\u0016¢\u0006\u0004\b'\u0010\u0018J\u001d\u0010,\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u0010 \u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b \u00101J\u0015\u00103\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u0012¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001b¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\b\u0012\u0004\u0012\u00020!07¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u0016¢\u0006\u0004\b@\u0010\u0018J\r\u0010A\u001a\u00020\u0012¢\u0006\u0004\bA\u0010\u0014J\r\u0010B\u001a\u00020\u0016¢\u0006\u0004\bB\u0010\u0018J\r\u0010C\u001a\u00020\u0016¢\u0006\u0004\bC\u0010\u0018J\r\u0010D\u001a\u00020*¢\u0006\u0004\bD\u0010EJ\r\u0010G\u001a\u00020F¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u00162\u0006\u0010.\u001a\u00020I¢\u0006\u0004\bJ\u0010KJ\u001d\u0010N\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*2\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u001f\u0010S\u001a\u00020\u00162\b\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010R\u001a\u00020!¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020!¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020!¢\u0006\u0004\bW\u0010VJ\r\u0010X\u001a\u00020\u0016¢\u0006\u0004\bX\u0010\u0018J\r\u0010Y\u001a\u00020\u0016¢\u0006\u0004\bY\u0010\u0018J\r\u0010Z\u001a\u00020\u0016¢\u0006\u0004\bZ\u0010\u0018J\r\u0010[\u001a\u00020\u0016¢\u0006\u0004\b[\u0010\u0018J\r\u0010\\\u001a\u00020\u0016¢\u0006\u0004\b\\\u0010\u0018J\u000f\u0010]\u001a\u00020!H\u0007¢\u0006\u0004\b]\u0010VJ\r\u0010^\u001a\u00020\u0016¢\u0006\u0004\b^\u0010\u0018J\r\u0010_\u001a\u00020\u0016¢\u0006\u0004\b_\u0010\u0018J\r\u0010`\u001a\u00020\u0016¢\u0006\u0004\b`\u0010\u0018J\r\u0010a\u001a\u00020\u0016¢\u0006\u0004\ba\u0010\u0018J\r\u0010b\u001a\u00020\u0012¢\u0006\u0004\bb\u0010\u0014J\u000f\u0010c\u001a\u00020\u0016H\u0002¢\u0006\u0004\bc\u0010\u0018J\u000f\u0010d\u001a\u00020\u0012H\u0002¢\u0006\u0004\bd\u0010\u0014J\u001b\u0010e\u001a\u00020\u00162\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\be\u0010fJ\u001b\u0010j\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i0gH\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020hH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020iH\u0002¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i0gH\u0002¢\u0006\u0004\bp\u0010kJ\u000f\u0010q\u001a\u00020hH\u0002¢\u0006\u0004\bq\u0010mJ\u000f\u0010r\u001a\u00020iH\u0002¢\u0006\u0004\br\u0010oJ\u0017\u0010s\u001a\u00020\u00162\u0006\u0010.\u001a\u00020IH\u0002¢\u0006\u0004\bs\u0010KJ\u000f\u0010t\u001a\u00020\u0016H\u0002¢\u0006\u0004\bt\u0010\u0018J\u000f\u0010v\u001a\u00020uH\u0002¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020!H\u0002¢\u0006\u0004\bx\u0010VJ\u000f\u0010y\u001a\u00020!H\u0002¢\u0006\u0004\by\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010zR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010{R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010|R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010}R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010~R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001a\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R$\u0010\u0094\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I070\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001e\u0010\u0096\u0001\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u008f\u0001\u001a\u0005\b\u0097\u0001\u0010\u0014R\u001d\u0010\u0099\u0001\u001a\u00030\u0098\u00018\u0006¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001d\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R)\u0010£\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020I070¢\u00018\u0006¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0019\u0010ª\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010\u008f\u0001R+\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\t\u0010«\u0001\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¬\u0001\u00106\"\u0005\b\u00ad\u0001\u0010\u001e¨\u0006±\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "nfcInteractor", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "storage", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;Landroidx/lifecycle/SavedStateHandle;)V", "", "canNFCScanStart", "()Z", "shouldStartScanningAutomatically", "", "trackNFCScanClicked", "()V", "resolveNFCArguments", "onNfcSettingsActivityResult", "", "pin", "onPinEntered", "(Ljava/lang/String;)V", "reason", "onNfcScanFailed", "", "attemptsLeft", "onPinVerificationFailed", "(I)V", "onOpenNfcSettingClicked", "onSkipNfcScanAtInitialPromptClicked", "onSkipNfcScanAtRetryClicked", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcData", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "nfcFlowType", "onNfcScanSucceeded", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "message", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$ErrorState;", "errorState", "(Ljava/lang/String;Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$ErrorState;)V", "isIntro", "getInstructionVideoPath", "(Z)Ljava/lang/String;", "getInstructionVideoCountryPostfix", "()Ljava/lang/String;", "", "getFailureInstructions", "()Ljava/util/List;", "Landroid/content/res/Resources;", "resources", "getPinHelperText", "(Landroid/content/res/Resources;Ljava/lang/Integer;)Ljava/lang/String;", "canSkipPin", "(Ljava/lang/Integer;)Z", "onSkipPinClicked", "isDarkModeEnabled", "onRetryNfcClicked", "onNfcIntro", "getExpectedNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "getNfcOptions", "()Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "consumeUIMessage", "(Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;)V", "", "scanDuration", "onNfcChipRead", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;J)V", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "lastScreen", "currentStackSize", "onBackClicked", "(Lcom/onfido/android/sdk/capture/internal/navigation/Screen;I)V", "getRetriesLeft", "()I", "nfcScanAttempt", "goToDocumentSelection", "exitFlow", "exitFlowAtRetryClicked", "exitFlowAtDocumentNotSupportedClicked", "restartDocumentCapture", "getNfcCanMaxAttemptsButtonText", "onNfcCanMaxAttemptsButtonClicked", "onChipBlockedExitClicked", "onChipBlockedContinueClicked", "onUnlockChipClicked", "canUnlockChip", "initScanScreen", "shouldShowPinEntryScreen", "navigateToPinEntryScreen", "(Ljava/lang/Integer;)V", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$Actions$Primary;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$Actions$Secondary;", "getFailedScreenActionsForScanFailure", "()Lkotlin/Pair;", "getPrimaryActionForScanFailure", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$Actions$Primary;", "getSecondaryActionForScanFailure", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcFailedScreen$Actions$Secondary;", "getFailedScreenActionsForVerificationFailure", "getPrimaryActionForVerificationFailure", "getSecondaryActionForVerificationFailure", "emitUIMessage", "navigateToNfcPermissionsScreen", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanScreen;", "nfcScanScreen", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcScanScreen;", "getAttemptsLeft", "retriesAttempts", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "Landroidx/lifecycle/SavedStateHandle;", "Lcom/onfido/android/sdk/capture/internal/navigation/OnfidoNavigation;", "onfidoNavigation", "Lcom/onfido/android/sdk/capture/internal/navigation/OnfidoNavigation;", "Lcom/onfido/android/sdk/capture/DocumentType;", "docType", "Lcom/onfido/android/sdk/capture/DocumentType;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "isPinEnabled", "Z", "pinRecoveryUrl", "Ljava/lang/String;", "hasPin", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "uiMessageSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "isOnlyOneDocAvailable", "isOnlyOneDocAvailable$onfido_capture_sdk_core_release", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "navigator", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "getNavigator", "()Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "navigationManagerHolder", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "getNavigationManagerHolder", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "Lio/reactivex/rxjava3/core/Observable;", "uiMessages", "Lio/reactivex/rxjava3/core/Observable;", "getUiMessages", "()Lio/reactivex/rxjava3/core/Observable;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nfcAttemptsCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "scanAutomatically", "value", "getPin", "setPin", "Companion", "Factory", "UIMessage", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcHostViewModel extends ViewModel {
    private static final int SKIP_PIN_ATTEMPTS_LEFT = 2;
    private final CountryCode countryCode;

    @NotNull
    private final DocumentType docType;
    private final boolean hasPin;
    private final boolean isOnlyOneDocAvailable;
    private final boolean isPinEnabled;

    @NotNull
    private final NavigationManagerHolder navigationManagerHolder;

    @NotNull
    private final Navigator navigator;

    @NotNull
    private final AtomicInteger nfcAttemptsCount;

    @NotNull
    private final NfcInteractor nfcInteractor;

    @NotNull
    private final NFCOptions.Enabled nfcOptions;

    @NotNull
    private final NfcProperties nfcProperties;

    @NotNull
    private final NfcTracker nfcTracker;

    @NotNull
    private final OnfidoNavigation onfidoNavigation;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;
    private final String pinRecoveryUrl;

    @NotNull
    private final SavedStateHandle savedStateHandle;
    private boolean scanAutomatically;

    @NotNull
    private final ScreenTracker screenTracker;

    @NotNull
    private final SharedPreferencesDataSource storage;

    @NotNull
    private final BehaviorSubject uiMessageSubject;

    @NotNull
    private final Observable uiMessages;

    @NotNull
    private static final String KEY_PIN = "key_pin";

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    @NotNull
    private static final String KEY_NAVIGATOR_INITIALIZED = "key_navigator_initialized";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$Companion;", "", "()V", "KEY_NAVIGATOR_INITIALIZED", "", "KEY_PIN", "NFC_LOGGER", "SKIP_PIN_ATTEMPTS_LEFT", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        NfcHostViewModel create(@NotNull SavedStateHandle savedStateHandle);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "", "()V", "id", "", "getId", "()J", "Exit", "ExitOnfidoFlow", "NfcScanSkipped", "NfcScanSuccess", "OpenNfcSettings", "OpenUrl", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$Exit;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$ExitOnfidoFlow;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$NfcScanSkipped;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$NfcScanSuccess;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$OpenNfcSettings;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$OpenUrl;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class UIMessage {
        private final long id;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$Exit;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit extends UIMessage {

            @NotNull
            public static final Exit INSTANCE = new Exit();

            private Exit() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$ExitOnfidoFlow;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ExitOnfidoFlow extends UIMessage {

            @NotNull
            public static final ExitOnfidoFlow INSTANCE = new ExitOnfidoFlow();

            private ExitOnfidoFlow() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$NfcScanSkipped;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcScanSkipped extends UIMessage {

            @NotNull
            public static final NfcScanSkipped INSTANCE = new NfcScanSkipped();

            private NfcScanSkipped() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$NfcScanSuccess;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcData", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NfcScanSuccess extends UIMessage {

            @NotNull
            private final NfcPassportExtraction nfcData;

            @NotNull
            private final NfcFlowType nfcFlowType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NfcScanSuccess(@NotNull NfcPassportExtraction nfcData, @NotNull NfcFlowType nfcFlowType) {
                super(null);
                Intrinsics.checkNotNullParameter(nfcData, "nfcData");
                Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
                this.nfcData = nfcData;
                this.nfcFlowType = nfcFlowType;
            }

            public static /* synthetic */ NfcScanSuccess copy$default(NfcScanSuccess nfcScanSuccess, NfcPassportExtraction nfcPassportExtraction, NfcFlowType nfcFlowType, int i, Object obj2) {
                if ((i & 1) != 0) {
                    nfcPassportExtraction = nfcScanSuccess.nfcData;
                }
                if ((i & 2) != 0) {
                    nfcFlowType = nfcScanSuccess.nfcFlowType;
                }
                return nfcScanSuccess.copy(nfcPassportExtraction, nfcFlowType);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final NfcPassportExtraction getNfcData() {
                return this.nfcData;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final NfcFlowType getNfcFlowType() {
                return this.nfcFlowType;
            }

            @NotNull
            public final NfcScanSuccess copy(@NotNull NfcPassportExtraction nfcData, @NotNull NfcFlowType nfcFlowType) {
                Intrinsics.checkNotNullParameter(nfcData, "nfcData");
                Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
                return new NfcScanSuccess(nfcData, nfcFlowType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NfcScanSuccess)) {
                    return false;
                }
                NfcScanSuccess nfcScanSuccess = (NfcScanSuccess) other;
                return Intrinsics.f(this.nfcData, nfcScanSuccess.nfcData) && this.nfcFlowType == nfcScanSuccess.nfcFlowType;
            }

            @NotNull
            public final NfcPassportExtraction getNfcData() {
                return this.nfcData;
            }

            @NotNull
            public final NfcFlowType getNfcFlowType() {
                return this.nfcFlowType;
            }

            public int hashCode() {
                return this.nfcFlowType.hashCode() + (this.nfcData.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "NfcScanSuccess(nfcData=" + this.nfcData + ", nfcFlowType=" + this.nfcFlowType + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$OpenNfcSettings;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OpenNfcSettings extends UIMessage {

            @NotNull
            public static final OpenNfcSettings INSTANCE = new OpenNfcSettings();

            private OpenNfcSettings() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage$OpenUrl;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends UIMessage {

            @NotNull
            private final String url;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenUrl(@NotNull String url2) {
                super(null);
                Intrinsics.checkNotNullParameter(url2, "url");
                this.url = url2;
            }

            public static /* synthetic */ OpenUrl copy$default(OpenUrl openUrl, String str, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = openUrl.url;
                }
                return openUrl.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            @NotNull
            public final OpenUrl copy(@NotNull String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                return new OpenUrl(url2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenUrl) && Intrinsics.f(this.url, ((OpenUrl) other).url);
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return this.url.hashCode();
            }

            @NotNull
            public String toString() {
                return j6.a.u(new StringBuilder("OpenUrl(url="), this.url, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        private UIMessage() {
            this.id = UUID.randomUUID().getMostSignificantBits();
        }

        public final long getId() {
            return this.id;
        }

        public /* synthetic */ UIMessage(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcFailedScreen.ErrorState.values().length];
            try {
                iArr[NfcFailedScreen.ErrorState.ScanningFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcFailedScreen.ErrorState.VerificationFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NfcHostViewModel(@NotNull SchedulersProvider schedulersProvider, @NotNull NfcInteractor nfcInteractor, @NotNull NfcTracker nfcTracker, @NotNull ScreenTracker screenTracker, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull SharedPreferencesDataSource storage, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.nfcInteractor = nfcInteractor;
        this.nfcTracker = nfcTracker;
        this.screenTracker = screenTracker;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.storage = storage;
        this.savedStateHandle = savedStateHandle;
        OnfidoNavigation onfidoNavigation = new OnfidoNavigation(schedulersProvider);
        this.onfidoNavigation = onfidoNavigation;
        Object obj2 = savedStateHandle.get("key_doc_type");
        if (obj2 == null) {
            throw new IllegalArgumentException("docType == null");
        }
        this.docType = (DocumentType) obj2;
        Object obj3 = savedStateHandle.get("key_nfc_options");
        if (obj3 == null) {
            throw new IllegalArgumentException("NFC flow can not be launched without NFCOptions. \nmake sure correct value is passed for this param.   ");
        }
        this.nfcOptions = (NFCOptions.Enabled) obj3;
        this.countryCode = (CountryCode) savedStateHandle.get("key_country_code");
        Object obj4 = savedStateHandle.get("key_nfc_properties");
        if (obj4 == null) {
            throw new IllegalArgumentException("nfcProperties == null");
        }
        NfcProperties nfcProperties = (NfcProperties) obj4;
        this.nfcProperties = nfcProperties;
        this.isPinEnabled = onfidoRemoteConfig.getDocumentCapture().isPinEnabled();
        this.pinRecoveryUrl = onfidoRemoteConfig.getDocumentCapture().getNfc().getPinRecoveryUrl();
        this.hasPin = nfcProperties.getHasPin() && nfcProperties.getPinLength() > 0;
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.uiMessageSubject = behaviorSubjectD;
        Boolean bool = (Boolean) savedStateHandle.get("key_is_only_one_doc");
        this.isOnlyOneDocAvailable = bool != null ? bool.booleanValue() : false;
        this.navigator = onfidoNavigation.getNavigator();
        this.navigationManagerHolder = onfidoNavigation.getNavigationManagerHolder();
        Observable observableHide = behaviorSubjectD.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.uiMessages = observableHide;
        this.nfcAttemptsCount = new AtomicInteger(1);
        if (savedStateHandle.contains("key_navigator_initialized")) {
            return;
        }
        initScanScreen();
        savedStateHandle.set("key_navigator_initialized", Boolean.TRUE);
    }

    private final void emitUIMessage(UIMessage message) {
        BehaviorSubject behaviorSubject = this.uiMessageSubject;
        Collection collection = (List) behaviorSubject.e();
        if (collection == null) {
            collection = f0.f322471a;
        }
        behaviorSubject.onNext(d0.E0(u.c(message), collection));
    }

    private final int getAttemptsLeft() {
        int maxRetries = this.onfidoRemoteConfig.getDocumentCapture().getNfc().getMaxRetries() - this.nfcAttemptsCount.get();
        Timber.INSTANCE.d(d.n("NFC Logger - Attempts left= ", maxRetries), new Object[0]);
        return maxRetries;
    }

    private final Pair<NfcFailedScreen.Actions.Primary, NfcFailedScreen.Actions.Secondary> getFailedScreenActionsForScanFailure() {
        return new Pair<>(getPrimaryActionForScanFailure(), getSecondaryActionForScanFailure());
    }

    private final Pair<NfcFailedScreen.Actions.Primary, NfcFailedScreen.Actions.Secondary> getFailedScreenActionsForVerificationFailure() {
        return new Pair<>(getPrimaryActionForVerificationFailure(), getSecondaryActionForVerificationFailure());
    }

    private final NfcFailedScreen.Actions.Primary getPrimaryActionForScanFailure() {
        return NfcFailedScreen.Actions.Primary.Retry;
    }

    private final NfcFailedScreen.Actions.Primary getPrimaryActionForVerificationFailure() {
        return NfcFailedScreen.Actions.Primary.Retry;
    }

    private final NfcFailedScreen.Actions.Secondary getSecondaryActionForScanFailure() {
        return NfcFailedScreen.Actions.Secondary.Hide;
    }

    private final NfcFailedScreen.Actions.Secondary getSecondaryActionForVerificationFailure() {
        NFCOptions.Enabled enabled = this.nfcOptions;
        if (enabled instanceof NFCOptions.Enabled.Optional) {
            return NfcFailedScreen.Actions.Secondary.Skip;
        }
        if (enabled instanceof NFCOptions.Enabled.Required) {
            return NfcFailedScreen.Actions.Secondary.Exit;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void initScanScreen() {
        Navigator navigator;
        Screen screenNfcScanScreen;
        if (this.nfcProperties.getIsNfcSupported()) {
            navigator = this.navigator;
            screenNfcScanScreen = nfcScanScreen();
        } else {
            navigator = this.navigator;
            screenNfcScanScreen = DocumentNotNfcCompatibleScreen.INSTANCE;
        }
        navigator.navigateTo(screenNfcScanScreen);
    }

    private final void navigateToNfcPermissionsScreen() {
        this.navigator.navigateTo(NfcPermissionsScreen.INSTANCE);
    }

    private final void navigateToPinEntryScreen(Integer attemptsLeft) {
        this.navigator.navigateTo(new NfcPinEntryScreen(this.nfcProperties.getPinLength(), attemptsLeft));
        this.screenTracker.trackNfcPinEntry$onfido_capture_sdk_core_release(attemptsLeft);
    }

    public static /* synthetic */ void navigateToPinEntryScreen$default(NfcHostViewModel nfcHostViewModel, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = null;
        }
        nfcHostViewModel.navigateToPinEntryScreen(num);
    }

    private final NfcScanScreen nfcScanScreen() {
        return new NfcScanScreen(this.docType, this.countryCode, getExpectedNfcFlowType(), new PassportBACKey(this.nfcProperties.getNumber$onfido_capture_sdk_core_release(), this.nfcProperties.getDateOfBirth$onfido_capture_sdk_core_release(), this.nfcProperties.getExpireDate$onfido_capture_sdk_core_release()), this.nfcProperties.getAaChallenge(), this.isPinEnabled ? this.nfcProperties.getPinLength() : 0);
    }

    private final int retriesAttempts() {
        int iNfcScanAttempt = nfcScanAttempt() - 1;
        Timber.INSTANCE.d(d.n("NFC Logger - Retries attempt= ", iNfcScanAttempt), new Object[0]);
        return iNfcScanAttempt;
    }

    private final boolean shouldShowPinEntryScreen() {
        if (!this.isPinEnabled || !this.hasPin) {
            return false;
        }
        String pin = getPin();
        return pin == null || pin.length() == 0;
    }

    public final boolean canNFCScanStart() {
        return this.nfcInteractor.isNfcEnabled() && !shouldShowPinEntryScreen();
    }

    public final boolean canSkipPin(Integer attemptsLeft) {
        return (attemptsLeft == null || attemptsLeft.intValue() > 2 || NFCOptionsKt.isRequired(this.nfcOptions)) ? false : true;
    }

    public final boolean canUnlockChip() {
        String str = this.pinRecoveryUrl;
        return !(str == null || str.length() == 0);
    }

    public final void consumeUIMessage(@NotNull UIMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Iterable iterable = (List) this.uiMessageSubject.e();
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            if (((UIMessage) obj2).getId() != message.getId()) {
                arrayList.add(obj2);
            }
        }
        this.uiMessageSubject.onNext(arrayList);
    }

    public final void exitFlow() {
        emitUIMessage(UIMessage.ExitOnfidoFlow.INSTANCE);
    }

    public final void exitFlowAtDocumentNotSupportedClicked() {
        this.nfcTracker.trackNfcExitVerificationClicked$onfido_capture_sdk_core_release();
        exitFlow();
    }

    public final void exitFlowAtRetryClicked() {
        this.nfcTracker.trackNfcExitVerificationClicked$onfido_capture_sdk_core_release();
        exitFlow();
    }

    @NotNull
    public final NfcFlowType getExpectedNfcFlowType() {
        return (this.nfcProperties.getHasCan() || this.nfcProperties.getHasPin()) ? NfcFlowType.PACE : NfcFlowType.BAC;
    }

    @NotNull
    public final List<Integer> getFailureInstructions() {
        DocumentType documentType = this.docType;
        DocumentType documentType2 = DocumentType.PASSPORT;
        return (documentType == documentType2 && this.countryCode == CountryCode.US) ? v.k(Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_1), Integer.valueOf(R.string.onfido_nfc_fail_passport_usa_list_item_2), Integer.valueOf(R.string.onfido_nfc_fail_passport_usa_list_item_3), Integer.valueOf(R.string.onfido_nfc_fail_passport_usa_list_item_4), Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_5)) : documentType == documentType2 ? v.k(Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_1), Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_2), Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_3), Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_4), Integer.valueOf(R.string.onfido_nfc_fail_passport_list_item_5)) : v.k(Integer.valueOf(R.string.onfido_nfc_fail_card_list_item_1), Integer.valueOf(R.string.onfido_nfc_fail_card_list_item_2), Integer.valueOf(R.string.onfido_nfc_fail_card_list_item_3), Integer.valueOf(R.string.onfido_nfc_fail_card_list_item_4));
    }

    @NotNull
    public final String getInstructionVideoCountryPostfix() {
        String alpha3;
        CountryCode countryCode = this.countryCode;
        String lowerCase = null;
        if (countryCode != null) {
            if (countryCode != CountryCode.US) {
                countryCode = null;
            }
            if (countryCode != null && (alpha3 = countryCode.getAlpha3()) != null) {
                lowerCase = alpha3.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
        }
        return (lowerCase == null || lowerCase.length() == 0) ? "" : "-".concat(lowerCase);
    }

    @NotNull
    public final String getInstructionVideoPath(boolean isIntro) {
        String str = this.docType == DocumentType.PASSPORT ? "passport" : "card";
        String str2 = isDarkModeEnabled() ? "dark" : "light";
        String str3 = isIntro ? "intro" : "scan";
        String instructionVideoCountryPostfix = getInstructionVideoCountryPostfix();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(str);
        sb6.append(CoreConstants.DASH_CHAR);
        sb6.append(str3);
        sb6.append(CoreConstants.DASH_CHAR);
        sb6.append(str2);
        String strI = v0.a.i(sb6, instructionVideoCountryPostfix, ".mp4");
        String animationVersion = this.onfidoRemoteConfig.getDocumentCapture().getNfc().getAnimationVersion();
        StringBuilder sb9 = new StringBuilder();
        String str4 = String.format("https://assets.onfido.com/mobile-sdk-assets/android/%s/nfc/", Arrays.copyOf(new Object[]{animationVersion}, 1));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        sb9.append(str4);
        sb9.append(strI);
        return sb9.toString();
    }

    @NotNull
    public final NavigationManagerHolder getNavigationManagerHolder() {
        return this.navigationManagerHolder;
    }

    @NotNull
    public final Navigator getNavigator() {
        return this.navigator;
    }

    public final int getNfcCanMaxAttemptsButtonText() {
        return Intrinsics.f(this.nfcOptions, NFCOptions.Enabled.Required.INSTANCE) ? R.string.onfido_nfc_scan_error_can_primary_button : R.string.onfido_nfc_scan_error_final_possible_card_secondary_button;
    }

    @NotNull
    public final NFCOptions.Enabled getNfcOptions() {
        return this.nfcOptions;
    }

    public final String getPin() {
        return (String) this.savedStateHandle.get("key_pin");
    }

    @NotNull
    public final String getPinHelperText(@NotNull Resources resources, Integer attemptsLeft) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (attemptsLeft == null) {
            return "";
        }
        String string = (attemptsLeft.intValue() == 1 && NFCOptionsKt.isRequired(this.nfcOptions)) ? resources.getString(R.string.onfido_enter_pin_helper_final_attempt) : attemptsLeft.intValue() == 1 ? resources.getString(R.string.onfido_enter_pin_optional_helper_final_attempt, 1) : (attemptsLeft.intValue() > 2 || NFCOptionsKt.isRequired(this.nfcOptions)) ? resources.getString(R.string.onfido_enter_pin_helper_attempts_left, attemptsLeft) : resources.getString(R.string.onfido_enter_pin_optional_helper_attempts_left, attemptsLeft);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final int getRetriesLeft() {
        int attemptsLeft = getAttemptsLeft() + 1;
        Timber.INSTANCE.d(d.n("NFC Logger - Retries left= ", attemptsLeft), new Object[0]);
        return attemptsLeft;
    }

    @NotNull
    public final Observable getUiMessages() {
        return this.uiMessages;
    }

    public final void goToDocumentSelection() {
        emitUIMessage(UIMessage.Exit.INSTANCE);
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

    /* JADX INFO: renamed from: isOnlyOneDocAvailable$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsOnlyOneDocAvailable() {
        return this.isOnlyOneDocAvailable;
    }

    public final int nfcScanAttempt() {
        int i = this.nfcAttemptsCount.get();
        Timber.INSTANCE.d(d.n("NFC Logger - nfcScanAttempt= ", i), new Object[0]);
        return i;
    }

    public final void onBackClicked(Screen lastScreen, int currentStackSize) {
        if (!(lastScreen instanceof NfcFailedScreen) && !(lastScreen instanceof NfcPermissionsScreen)) {
            if (lastScreen instanceof DocumentNotNfcCompatibleScreen) {
                goToDocumentSelection();
                return;
            } else if (lastScreen instanceof NfcChipBlockedScreen) {
                exitFlow();
                return;
            } else if (currentStackSize <= 1) {
                this.uiMessageSubject.onNext(u.c(UIMessage.Exit.INSTANCE));
                return;
            }
        }
        this.navigator.exitCurrentScreen();
    }

    public final void onChipBlockedContinueClicked() {
        this.nfcTracker.trackContinueAtChipBlockedClicked$onfido_capture_sdk_core_release();
        emitUIMessage(UIMessage.NfcScanSkipped.INSTANCE);
    }

    public final void onChipBlockedExitClicked() {
        this.nfcTracker.trackExitAtChipBlockedClicked$onfido_capture_sdk_core_release();
        exitFlow();
    }

    public final void onNfcCanMaxAttemptsButtonClicked() {
        if (Intrinsics.f(this.nfcOptions, NFCOptions.Enabled.Required.INSTANCE)) {
            this.nfcTracker.trackNfcExitVerificationClicked$onfido_capture_sdk_core_release();
            exitFlow();
        } else {
            this.nfcTracker.trackNfcSkipAtManualCanEntryClicked$onfido_capture_sdk_core_release();
            emitUIMessage(UIMessage.NfcScanSkipped.INSTANCE);
        }
    }

    public final void onNfcChipRead(@NotNull NfcFlowType nfcFlowType, long scanDuration) {
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        this.screenTracker.trackNfcReadSuccess$onfido_capture_sdk_core_release(scanDuration, nfcScanAttempt(), nfcFlowType, this.nfcOptions);
    }

    public final void onNfcIntro() {
        this.screenTracker.trackNfcIntro$onfido_capture_sdk_core_release(this.docType, this.countryCode, getExpectedNfcFlowType(), this.nfcOptions);
    }

    public final void onNfcScanFailed(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Timber.Companion companion = Timber.INSTANCE;
        companion.d(p.a.l(CoreConstants.DOT, "NFC Logger - Scan failed because= ", reason), new Object[0]);
        companion.d("NFC Logger - retryAttemptsLeft= " + getAttemptsLeft(), new Object[0]);
        onNfcScanFailed(reason, getAttemptsLeft() > 0 ? NfcFailedScreen.ErrorState.ScanningFailed : NfcFailedScreen.ErrorState.VerificationFailed);
        this.nfcAttemptsCount.incrementAndGet();
    }

    public final void onNfcScanSucceeded(@NotNull NfcPassportExtraction nfcData, @NotNull NfcFlowType nfcFlowType) {
        Intrinsics.checkNotNullParameter(nfcData, "nfcData");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        emitUIMessage(new UIMessage.NfcScanSuccess(nfcData, nfcFlowType));
    }

    public final void onNfcSettingsActivityResult() {
        if (this.nfcInteractor.isNfcEnabled()) {
            if (shouldShowPinEntryScreen()) {
                this.navigator.exitCurrentScreen();
                navigateToPinEntryScreen$default(this, null, 1, null);
            } else {
                this.scanAutomatically = true;
                this.navigator.exitCurrentScreen();
            }
        }
    }

    public final void onOpenNfcSettingClicked() {
        this.nfcTracker.trackNfcOpenSettingsClicked$onfido_capture_sdk_core_release();
        emitUIMessage(UIMessage.OpenNfcSettings.INSTANCE);
    }

    public final void onPinEntered(@NotNull String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.nfcTracker.trackContinueAtPinEntryClicked$onfido_capture_sdk_core_release();
        setPin(pin);
        if (!this.nfcInteractor.isNfcEnabled()) {
            this.navigator.replace(NfcPermissionsScreen.INSTANCE);
        } else {
            this.scanAutomatically = true;
            this.navigator.exitCurrentScreen();
        }
    }

    public final void onPinVerificationFailed(int attemptsLeft) {
        if (attemptsLeft > 0) {
            navigateToPinEntryScreen(Integer.valueOf(attemptsLeft));
        } else {
            this.navigator.navigateTo(new NfcChipBlockedScreen(this.nfcOptions));
            this.screenTracker.trackNfcChipBlocked$onfido_capture_sdk_core_release();
        }
    }

    public final void onRetryNfcClicked() {
        this.scanAutomatically = true;
        this.navigator.exitCurrentScreen();
        this.nfcTracker.trackNfcRetryScanSelected$onfido_capture_sdk_core_release(getExpectedNfcFlowType(), this.docType, this.countryCode, retriesAttempts(), this.nfcOptions);
    }

    public final void onSkipNfcScanAtInitialPromptClicked() {
        emitUIMessage(UIMessage.NfcScanSkipped.INSTANCE);
        this.nfcTracker.trackSkipNfcScanAtInitialPrompt$onfido_capture_sdk_core_release(this.nfcOptions);
    }

    public final void onSkipNfcScanAtRetryClicked() {
        emitUIMessage(UIMessage.NfcScanSkipped.INSTANCE);
        this.nfcTracker.trackSkipNfcScanAtRetry$onfido_capture_sdk_core_release(getExpectedNfcFlowType(), retriesAttempts(), this.nfcOptions);
    }

    public final void onSkipPinClicked() {
        this.nfcTracker.trackSkipAtPinEntryClicked$onfido_capture_sdk_core_release();
        emitUIMessage(UIMessage.NfcScanSkipped.INSTANCE);
    }

    public final void onUnlockChipClicked() {
        this.nfcTracker.trackUnlockChipClicked$onfido_capture_sdk_core_release();
        String str = this.pinRecoveryUrl;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        emitUIMessage(new UIMessage.OpenUrl(str));
    }

    public final void resolveNFCArguments() {
        if (!this.nfcInteractor.isNfcEnabled()) {
            navigateToNfcPermissionsScreen();
        } else if (shouldShowPinEntryScreen()) {
            navigateToPinEntryScreen$default(this, null, 1, null);
        }
    }

    public final void restartDocumentCapture() {
        this.nfcTracker.trackNfcChooseAnotherDocumentClicked$onfido_capture_sdk_core_release();
        emitUIMessage(UIMessage.Exit.INSTANCE);
    }

    public final void setPin(String str) {
        this.savedStateHandle.set("key_pin", str);
    }

    public final boolean shouldStartScanningAutomatically() {
        if (!this.scanAutomatically) {
            return false;
        }
        this.scanAutomatically = false;
        return true;
    }

    public final void trackNFCScanClicked() {
        this.nfcTracker.trackContinueToNfcScanSelected$onfido_capture_sdk_core_release(getExpectedNfcFlowType());
    }

    public final void onNfcScanFailed(@NotNull String message, @NotNull NfcFailedScreen.ErrorState errorState) {
        Pair<NfcFailedScreen.Actions.Primary, NfcFailedScreen.Actions.Secondary> failedScreenActionsForScanFailure;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        int i = WhenMappings.$EnumSwitchMapping$0[errorState.ordinal()];
        if (i == 1) {
            failedScreenActionsForScanFailure = getFailedScreenActionsForScanFailure();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            failedScreenActionsForScanFailure = getFailedScreenActionsForVerificationFailure();
        }
        this.navigator.navigateTo(new NfcFailedScreen(this.docType, message, errorState, (NfcFailedScreen.Actions.Primary) failedScreenActionsForScanFailure.f186385a, (NfcFailedScreen.Actions.Secondary) failedScreenActionsForScanFailure.f186386b));
    }
}
