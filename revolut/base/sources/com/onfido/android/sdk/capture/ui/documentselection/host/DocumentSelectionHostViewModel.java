package com.onfido.android.sdk.capture.ui.documentselection.host;

import a31.l;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.navigator.NavigationManagerHolder;
import com.onfido.android.sdk.capture.internal.performance.domain.PerformanceAnalyticsScreen;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.internal.ui.countryselection.GetCurrentCountryCodeUseCase;
import com.onfido.android.sdk.capture.internal.ui.countryselection.SupportedDocumentsRepository;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionState;
import com.onfido.android.sdk.capture.utils.CountryCode;
import egm.b;
import ehm.e;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import qgm.c;
import qgm.d;
import qgm.f;
import qgm.h;
import vgm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 Q2\u00020\u0001:\u0002QRBC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010\u001b0\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0016J\u0015\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0016J\u0015\u0010'\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u001b¢\u0006\u0004\b'\u0010$J\r\u0010(\u001a\u00020\u0014¢\u0006\u0004\b(\u0010 J)\u0010/\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u0010 J\u000f\u00102\u001a\u00020\u0014H\u0014¢\u0006\u0004\b2\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR(\u0010H\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00010D0D0G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR$\u0010P\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u0016¨\u0006S"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "navigator", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "navigationManagerHolder", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;", "currentCountryCodeUseCase", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "supportedDocumentsRepository", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "screenLoadTracker", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;Landroidx/lifecycle/SavedStateHandle;)V", "", "loadSuggestCountry", "", "cacheAllDocuments", "(Z)V", "Lio/reactivex/rxjava3/disposables/Disposable;", "loadSuggestedCountry", "()Lio/reactivex/rxjava3/disposables/Disposable;", "Lio/reactivex/rxjava3/core/Maybe;", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "kotlin.jvm.PlatformType", "getSuggestedCountry", "()Lio/reactivex/rxjava3/core/Maybe;", "loadScreens", "()V", "retryFetchingDocuments", "selectedCountryCode", "onCountrySelected", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "warningVisible", "setNfcRquiredWarning", "onCountrySelectionScreenResult", "onCountrySelectionClicked", "Lcom/onfido/android/sdk/capture/DocumentType;", "documentType", "", "genericDocTitle", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "genericDocPages", "onDocumentSelected", "(Lcom/onfido/android/sdk/capture/DocumentType;Ljava/lang/String;Lcom/onfido/android/sdk/capture/document/DocumentPages;)V", "onStart", "onCleared", "Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "getNavigator", "()Lcom/onfido/android/sdk/capture/internal/navigation/Navigator;", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "getNavigationManagerHolder", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/NavigationManagerHolder;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/performance/trackers/ScreenLoadTracker;", "Landroidx/lifecycle/SavedStateHandle;", "defaultCountry", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "disposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionState;", "stateBehaviourSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/core/Observable;", "state", "Lio/reactivex/rxjava3/core/Observable;", "getState$onfido_capture_sdk_core_release", "()Lio/reactivex/rxjava3/core/Observable;", "value", "getNfcWarningVisible", "()Z", "setNfcWarningVisible", "nfcWarningVisible", "Companion", "Factory", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentSelectionHostViewModel extends ViewModel {

    @NotNull
    private final GetCurrentCountryCodeUseCase currentCountryCodeUseCase;
    private CountryCode defaultCountry;

    @NotNull
    private final CompositeDisposable disposable;

    @NotNull
    private final NavigationManagerHolder navigationManagerHolder;

    @NotNull
    private final Navigator navigator;

    @NotNull
    private final SavedStateHandle savedStateHandle;

    @NotNull
    private final ScreenLoadTracker screenLoadTracker;

    @NotNull
    private final ScreenTracker screenTracker;

    @NotNull
    private final Observable state;

    @NotNull
    private final BehaviorSubject stateBehaviourSubject;

    @NotNull
    private final SupportedDocumentsRepository supportedDocumentsRepository;

    @NotNull
    public static final String KEY_COUNTRY_PICKER_RESULT = "rds_country_picker_result_key";

    @NotNull
    public static final String KEY_NFC_WARNING_VISIBLE = "nfc_warning_visible";

    @NotNull
    private static final String KEY_NAVIGATOR_INITIALIZED = "rds_key_navigator_initialized";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        DocumentSelectionHostViewModel create(@NotNull SavedStateHandle savedStateHandle);
    }

    public DocumentSelectionHostViewModel(@NotNull Navigator navigator, @NotNull NavigationManagerHolder navigationManagerHolder, @NotNull GetCurrentCountryCodeUseCase currentCountryCodeUseCase, @NotNull SupportedDocumentsRepository supportedDocumentsRepository, @NotNull ScreenTracker screenTracker, @NotNull ScreenLoadTracker screenLoadTracker, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationManagerHolder, "navigationManagerHolder");
        Intrinsics.checkNotNullParameter(currentCountryCodeUseCase, "currentCountryCodeUseCase");
        Intrinsics.checkNotNullParameter(supportedDocumentsRepository, "supportedDocumentsRepository");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(screenLoadTracker, "screenLoadTracker");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.navigator = navigator;
        this.navigationManagerHolder = navigationManagerHolder;
        this.currentCountryCodeUseCase = currentCountryCodeUseCase;
        this.supportedDocumentsRepository = supportedDocumentsRepository;
        this.screenTracker = screenTracker;
        this.screenLoadTracker = screenLoadTracker;
        this.savedStateHandle = savedStateHandle;
        this.disposable = new CompositeDisposable();
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(DocumentTypeSelectionState.NoCountrySelected.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.stateBehaviourSubject = behaviorSubjectD;
        Observable observableObserveOn = behaviorSubjectD.hide().distinctUntilChanged().observeOn(b.a());
        Intrinsics.checkNotNullExpressionValue(observableObserveOn, "observeOn(...)");
        this.state = observableObserveOn;
    }

    private final void cacheAllDocuments(final boolean loadSuggestCountry) {
        CompositeDisposable compositeDisposable = this.disposable;
        f fVar = new f(new l(this, 11));
        j jVar = e.f126320c;
        Objects.requireNonNull(jVar, "scheduler is null");
        compositeDisposable.a(new qgm.j(fVar, jVar, 1).d(new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.cacheAllDocuments.2
            @Override // igm.g
            public final void accept(List<? extends CountryCode> list) {
                if (loadSuggestCountry) {
                    this.disposable.a(this.loadSuggestedCountry());
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.cacheAllDocuments.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Failed to findAllSupportedCountries", new Object[0]);
                DocumentSelectionHostViewModel.this.stateBehaviourSubject.onNext(DocumentTypeSelectionState.LoadingDocumentsFailed.INSTANCE);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List cacheAllDocuments$lambda$0(DocumentSelectionHostViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.supportedDocumentsRepository.findAllSupportedCountries();
    }

    private final boolean getNfcWarningVisible() {
        Boolean bool = (Boolean) this.savedStateHandle.get("nfc_warning_visible");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final Maybe getSuggestedCountry() {
        Single<String> singleBuild = this.currentCountryCodeUseCase.build();
        p pVar = new p() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.getSuggestedCountry.1
            @Override // igm.p
            public final boolean test(@NotNull String it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return !d0.W(it8);
            }
        };
        singleBuild.getClass();
        Objects.requireNonNull(pVar, "predicate is null");
        qgm.j jVar = new qgm.j(new d(singleBuild, pVar, 0), new o() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.getSuggestedCountry.2
            @Override // igm.o
            @NotNull
            public final MaybeSource apply(@NotNull String currentCountCode) {
                T next;
                Intrinsics.checkNotNullParameter(currentCountCode, "currentCountCode");
                Iterator<T> it8 = DocumentSelectionHostViewModel.this.supportedDocumentsRepository.findAllSupportedCountries().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it8.next();
                    if (a0.z(((CountryCode) next).name(), currentCountCode, true)) {
                        break;
                    }
                }
                CountryCode countryCode = next;
                if (DocumentSelectionHostViewModel.this.defaultCountry == null) {
                    return countryCode == null ? c.f246367a : new h(countryCode);
                }
                CountryCode countryCode2 = DocumentSelectionHostViewModel.this.defaultCountry;
                Intrinsics.h(countryCode2);
                return new h(countryCode2);
            }
        }, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMap(...)");
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Disposable loadSuggestedCountry() {
        Disposable disposableD = getSuggestedCountry().d(new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.loadSuggestedCountry.1
            @Override // igm.g
            public final void accept(CountryCode countryCode) {
                if (DocumentSelectionHostViewModel.this.stateBehaviourSubject.e() instanceof DocumentTypeSelectionState.NoCountrySelected) {
                    BehaviorSubject behaviorSubject = DocumentSelectionHostViewModel.this.stateBehaviourSubject;
                    Intrinsics.h(countryCode);
                    behaviorSubject.onNext(new DocumentTypeSelectionState.CountrySelected(countryCode));
                }
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel.loadSuggestedCountry.2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Failed to getSuggestedCountry", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableD, "subscribe(...)");
        return disposableD;
    }

    private final void setNfcWarningVisible(boolean z) {
        this.savedStateHandle.set("nfc_warning_visible", Boolean.valueOf(z));
    }

    @NotNull
    public final NavigationManagerHolder getNavigationManagerHolder() {
        return this.navigationManagerHolder;
    }

    @NotNull
    public final Navigator getNavigator() {
        return this.navigator;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$onfido_capture_sdk_core_release, reason: from getter */
    public final Observable getState() {
        return this.state;
    }

    public final void loadScreens() {
        if (!this.savedStateHandle.contains("rds_key_navigator_initialized")) {
            this.navigator.navigateTo(new DocumentTypeSelectionScreen(getNfcWarningVisible()));
            this.savedStateHandle.set("rds_key_navigator_initialized", Boolean.TRUE);
        }
        cacheAllDocuments(true);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.disposable.d();
    }

    public final void onCountrySelected(@NotNull CountryCode selectedCountryCode) {
        Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
        this.defaultCountry = selectedCountryCode;
        this.stateBehaviourSubject.onNext(new DocumentTypeSelectionState.CountrySelected(selectedCountryCode));
    }

    public final void onCountrySelectionClicked() {
        this.navigator.navigateTo(new CountrySelectionScreen("rds_country_picker_result_key"));
    }

    public final void onCountrySelectionScreenResult(@NotNull CountryCode selectedCountryCode) {
        Intrinsics.checkNotNullParameter(selectedCountryCode, "selectedCountryCode");
        this.navigator.backTo(new DocumentTypeSelectionScreen(getNfcWarningVisible()));
        onCountrySelected(selectedCountryCode);
    }

    public final void onDocumentSelected(@NotNull DocumentType documentType, String genericDocTitle, DocumentPages genericDocPages) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        DocumentTypeSelectionState documentTypeSelectionState = (DocumentTypeSelectionState) this.stateBehaviourSubject.e();
        if (documentTypeSelectionState instanceof DocumentTypeSelectionState.CountrySelected) {
            this.stateBehaviourSubject.onNext(new DocumentTypeSelectionState.DocumentTypeSelected(((DocumentTypeSelectionState.CountrySelected) documentTypeSelectionState).getCountryCode(), documentType, genericDocTitle, genericDocPages));
        }
    }

    public final void onStart() {
        this.screenTracker.trackDocumentTypeSelection$onfido_capture_sdk_core_release();
        this.screenLoadTracker.trackNavigationCompleted$onfido_capture_sdk_core_release(PerformanceAnalyticsScreen.DOCUMENT_TYPE_SELECTION);
    }

    public final void retryFetchingDocuments(boolean loadSuggestCountry) {
        this.screenTracker.trackDocumentListFetchRetried$onfido_capture_sdk_core_release();
        cacheAllDocuments(loadSuggestCountry);
    }

    public final void setNfcRquiredWarning(boolean warningVisible) {
        setNfcWarningVisible(warningVisible);
    }
}
