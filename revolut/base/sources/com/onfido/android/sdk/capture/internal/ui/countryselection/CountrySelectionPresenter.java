package com.onfido.android.sdk.capture.internal.ui.countryselection;

import a09.r;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.b;
import tgm.e;
import tgm.g;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 -2\u00020\u0001:\u0002-.B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00100\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00172\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter;", "", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "supportedDocumentsRepository", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;", "getCurrentCountryCodeUseCase", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "<init>", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;)V", "", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "supportedCountries", "Lio/reactivex/rxjava3/core/Single;", "Lkotlin/Pair;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountryAvailability;", "getCountryAvailabilitiesWithSuggestion", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", "getCountryAvailabilities", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter$View;", "view", "", "attachView", "(Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter$View;)V", "detachView", "()V", "getCountrySuggestion", "(Ljava/util/List;)V", "", "isForProofOfAddress", "onStart", "(Z)V", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/SupportedDocumentsRepository;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/GetCurrentCountryCodeUseCase;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter$View;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "subscriptions$delegate", "Lkotlin/Lazy;", "getSubscriptions", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "subscriptions", "Companion", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CountrySelectionPresenter {
    private static final long COUNTRY_LIST_ITEMS_DELAY_MS = 250;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int SIZE_PADDING = 4;

    @NotNull
    private final GetCurrentCountryCodeUseCase getCurrentCountryCodeUseCase;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final ScreenTracker screenTracker;

    /* JADX INFO: renamed from: subscriptions$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy subscriptions;

    @NotNull
    private final SupportedDocumentsRepository supportedDocumentsRepository;
    private View view;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter$Companion;", "", "()V", "COUNTRY_LIST_ITEMS_DELAY_MS", "", "SIZE_PADDING", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/ui/countryselection/CountrySelectionPresenter$View;", "", "enterLoadingState", "", "setCountries", "countries", "", "Lcom/onfido/android/sdk/capture/internal/ui/countryselection/BaseAdapterItem;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        void enterLoadingState();

        void setCountries(@NotNull List<? extends BaseAdapterItem> countries);
    }

    public CountrySelectionPresenter(@NotNull SupportedDocumentsRepository supportedDocumentsRepository, @NotNull ScreenTracker screenTracker, @NotNull GetCurrentCountryCodeUseCase getCurrentCountryCodeUseCase, @NotNull SchedulersProvider schedulersProvider) {
        Intrinsics.checkNotNullParameter(supportedDocumentsRepository, "supportedDocumentsRepository");
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(getCurrentCountryCodeUseCase, "getCurrentCountryCodeUseCase");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        this.supportedDocumentsRepository = supportedDocumentsRepository;
        this.screenTracker = screenTracker;
        this.getCurrentCountryCodeUseCase = getCurrentCountryCodeUseCase;
        this.schedulersProvider = schedulersProvider;
        this.subscriptions = j.b(CountrySelectionPresenter$subscriptions$2.INSTANCE);
    }

    private final Single<List<CountryAvailability>> getCountryAvailabilities(List<? extends CountryCode> supportedCountries) {
        b bVar = new b(new r(supportedCountries, this, 15), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getCountryAvailabilities$lambda$1(List list, CountrySelectionPresenter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list != null) {
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new CountryAvailability((CountryCode) it8.next()));
            }
            return arrayList;
        }
        List<CountryCode> listFindAllSupportedCountries = this$0.supportedDocumentsRepository.findAllSupportedCountries();
        ArrayList arrayList2 = new ArrayList(w.t(listFindAllSupportedCountries, 10));
        Iterator<T> it9 = listFindAllSupportedCountries.iterator();
        while (it9.hasNext()) {
            arrayList2.add(new CountryAvailability((CountryCode) it9.next()));
        }
        return arrayList2;
    }

    private final Single<Pair<CountryAvailability, List<CountryAvailability>>> getCountryAvailabilitiesWithSuggestion(List<? extends CountryCode> supportedCountries) {
        Single<List<CountryAvailability>> countryAvailabilities = getCountryAvailabilities(supportedCountries);
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter.getCountryAvailabilitiesWithSuggestion.1
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull final List<CountryAvailability> countryAvailabilities2) {
                Intrinsics.checkNotNullParameter(countryAvailabilities2, "countryAvailabilities");
                return CountrySelectionPresenter.this.getCurrentCountryCodeUseCase.build().g(new o() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter.getCountryAvailabilitiesWithSuggestion.1.1
                    @Override // igm.o
                    @NotNull
                    public final Pair<CountryAvailability, List<CountryAvailability>> apply(@NotNull String suggestedCountryCode) {
                        T next;
                        Intrinsics.checkNotNullParameter(suggestedCountryCode, "suggestedCountryCode");
                        Iterator<T> it8 = countryAvailabilities2.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                next = (T) null;
                                break;
                            }
                            next = it8.next();
                            String strName = ((CountryAvailability) next).getCountryCode().name();
                            Locale locale = Locale.ROOT;
                            String lowerCase = strName.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            String lowerCase2 = suggestedCountryCode.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            if (Intrinsics.f(lowerCase, lowerCase2)) {
                                break;
                            }
                        }
                        CountryAvailability countryAvailability = next;
                        List<CountryAvailability> list = countryAvailabilities2;
                        ArrayList arrayList = new ArrayList();
                        for (T t2 : list) {
                            if (((CountryAvailability) t2).getCountryCode() != (countryAvailability != null ? countryAvailability.getCountryCode() : null)) {
                                arrayList.add(t2);
                            }
                        }
                        return new Pair<>(countryAvailability, arrayList);
                    }
                });
            }
        };
        countryAvailabilities.getClass();
        g gVar = new g(countryAvailabilities, oVar, 0);
        Intrinsics.checkNotNullExpressionValue(gVar, "flatMap(...)");
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCountrySuggestion$default(CountrySelectionPresenter countrySelectionPresenter, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = null;
        }
        countrySelectionPresenter.getCountrySuggestion(list);
    }

    private final CompositeDisposable getSubscriptions() {
        return (CompositeDisposable) this.subscriptions.getValue();
    }

    public static /* synthetic */ void onStart$default(CountrySelectionPresenter countrySelectionPresenter, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        countrySelectionPresenter.onStart(z);
    }

    public final void attachView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void detachView() {
        getSubscriptions().d();
    }

    public final void getCountrySuggestion(List<? extends CountryCode> supportedCountries) {
        CompositeDisposable subscriptions = getSubscriptions();
        Disposable disposableI = new e(getCountryAvailabilitiesWithSuggestion(supportedCountries).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()).d(COUNTRY_LIST_ITEMS_DELAY_MS, TimeUnit.MILLISECONDS, this.schedulersProvider.getUi()), new igm.g() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter.getCountrySuggestion.1
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                View view = CountrySelectionPresenter.this.view;
                if (view != null) {
                    view.enterLoadingState();
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, 1).i(new igm.g() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter.getCountrySuggestion.2
            @Override // igm.g
            public final void accept(@NotNull Pair<CountryAvailability, ? extends List<CountryAvailability>> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                CountryAvailability countryAvailability = (CountryAvailability) pair.f186385a;
                List list = (List) pair.f186386b;
                ArrayList arrayList = new ArrayList(list.size() + 4);
                if (countryAvailability != null) {
                    arrayList.add(new CountrySelectionSeparator(CountrySelectionSeparatorType.SUGGESTED_COUNTRY));
                    arrayList.add(countryAvailability);
                    arrayList.add(new CountrySelectionSeparator(CountrySelectionSeparatorType.SEPARATOR));
                    arrayList.add(new CountrySelectionSeparator(CountrySelectionSeparatorType.ALL_COUNTRIES));
                }
                arrayList.addAll(list);
                View view = CountrySelectionPresenter.this.view;
                if (view != null) {
                    view.setCountries(arrayList);
                } else {
                    Intrinsics.r("view");
                    throw null;
                }
            }
        }, new igm.g() { // from class: com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionPresenter.getCountrySuggestion.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Failed to getCountrySuggestion", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(subscriptions, disposableI);
    }

    public final void onStart(boolean isForProofOfAddress) {
        this.screenTracker.trackCountrySelection$onfido_capture_sdk_core_release(isForProofOfAddress);
    }
}
