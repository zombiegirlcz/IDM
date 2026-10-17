package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

import android.net.Uri;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.ui.proofOfAddress.network.PoaRepository;
import com.onfido.android.sdk.capture.ui.proofOfAddress.network.PoaResponseItem;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.CountryCodeExtensionsKt;
import com.onfido.android.sdk.capture.utils.RawResourceReader;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.data.PoaDocumentType;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jh.d;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import rlm.b;
import tlm.e;
import yhm.j;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0003\\]^B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00100\"j\b\u0012\u0004\u0012\u00020\u0010`#¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J-\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\"j\b\u0012\u0004\u0012\u00020\u000e`#2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020\u0016H\u0014¢\u0006\u0004\b0\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0*0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00140<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R!\u0010E\u001a\b\u0012\u0004\u0012\u00020A0@8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010DR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u000e8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010\u001a\"\u0004\bH\u0010IR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bJ\u0010\u001c\"\u0004\bK\u0010LR$\u0010M\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010OR(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010F\u001a\u0004\u0018\u00010\u00128B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010RR(\u0010V\u001a\u0004\u0018\u00010\u00142\b\u0010F\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bS\u0010'\"\u0004\bT\u0010UR0\u0010[\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020+0*8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z¨\u0006_"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaRepository;", "poaRepository", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/utils/RawResourceReader;", "resourceReader", "Lkotlinx/serialization/json/Json;", "jsonParser", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaRepository;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/utils/RawResourceReader;Lkotlinx/serialization/json/Json;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/api/client/data/PoaDocumentType;", "documentType", "Landroid/net/Uri;", "documentUri", "", "poaDocumentFileName", "", "setPoaData", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/PoaDocumentType;Landroid/net/Uri;Ljava/lang/String;)V", "getPoaCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getPoaDocumentType", "()Lcom/onfido/api/client/data/PoaDocumentType;", "", "isPoaTakePhoto", "()Z", "getPoaDocumentUri", "()Landroid/net/Uri;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getPoaSupportedDocuments", "()Ljava/util/ArrayList;", "getPoaDocumentFileName", "()Ljava/lang/String;", "getPoaSupportedCountries", "()V", "", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaResponseItem;", "poaListItems", "getPoaCountryCodes$onfido_capture_sdk_core_release", "(Ljava/util/List;)Ljava/util/ArrayList;", "getPoaCountryCodes", "onCleared", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/network/PoaRepository;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/utils/RawResourceReader;", "Lkotlinx/serialization/json/Json;", "Landroidx/lifecycle/SavedStateHandle;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "poaCountriesSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "errorMessageSubject", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$GetCountriesResponse;", "getCountriesResponse$delegate", "getGetCountriesResponse$onfido_capture_sdk_core_release", "()Lio/reactivex/rxjava3/core/Observable;", "getCountriesResponse", "value", "getCountryCode", "setCountryCode", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "getDocumentType", "setDocumentType", "(Lcom/onfido/api/client/data/PoaDocumentType;)V", "isTakePhoto", "setTakePhoto", "(Z)V", "getDocumentUri", "setDocumentUri", "(Landroid/net/Uri;)V", "getDocumentFileName", "setDocumentFileName", "(Ljava/lang/String;)V", "documentFileName", "getListOfSupportedCountries$onfido_capture_sdk_core_release", "()Ljava/util/List;", "setListOfSupportedCountries$onfido_capture_sdk_core_release", "(Ljava/util/List;)V", "listOfSupportedCountries", "Companion", "Factory", "GetCountriesResponse", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaHostViewModel extends ViewModel {

    /* JADX INFO: renamed from: compositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeDisposable;

    @NotNull
    private final BehaviorSubject errorMessageSubject;

    /* JADX INFO: renamed from: getCountriesResponse$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy getCountriesResponse;

    @NotNull
    private final Json jsonParser;

    @NotNull
    private final BehaviorSubject poaCountriesSubject;

    @NotNull
    private final PoaRepository poaRepository;

    @NotNull
    private final RawResourceReader resourceReader;

    @NotNull
    private final SavedStateHandle savedStateHandle;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private static final String KEY_DOCUMENT_TYPE = "document_type";

    @NotNull
    private static final String KEY_DOCUMENT_FILE_NAME = "document_file_name";

    @NotNull
    private static final String KEY_COUNTRY_CODE = "country_code";

    @NotNull
    private static final String KEY_DOCUMENT_URI = "document_uri";

    @NotNull
    private static final String KEY_LIST_OF_SUPPORTED_COUNTRIES = "list_of_supported_countries";

    @NotNull
    private static final String KEY_IS_TAKE_PHOTO = "is_take_photo";

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        PoaHostViewModel create(@NotNull SavedStateHandle savedStateHandle);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/host/PoaHostViewModel$GetCountriesResponse;", "", "poaCountries", "", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "errorString", "", "(Ljava/util/List;Ljava/lang/String;)V", "getErrorString", "()Ljava/lang/String;", "getPoaCountries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GetCountriesResponse {
        private final String errorString;

        @NotNull
        private final List<CountryCode> poaCountries;

        public GetCountriesResponse() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GetCountriesResponse copy$default(GetCountriesResponse getCountriesResponse, List list, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = getCountriesResponse.poaCountries;
            }
            if ((i & 2) != 0) {
                str = getCountriesResponse.errorString;
            }
            return getCountriesResponse.copy(list, str);
        }

        @NotNull
        public final List<CountryCode> component1() {
            return this.poaCountries;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getErrorString() {
            return this.errorString;
        }

        @NotNull
        public final GetCountriesResponse copy(@NotNull List<? extends CountryCode> poaCountries, String errorString) {
            Intrinsics.checkNotNullParameter(poaCountries, "poaCountries");
            return new GetCountriesResponse(poaCountries, errorString);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GetCountriesResponse)) {
                return false;
            }
            GetCountriesResponse getCountriesResponse = (GetCountriesResponse) other;
            return Intrinsics.f(this.poaCountries, getCountriesResponse.poaCountries) && Intrinsics.f(this.errorString, getCountriesResponse.errorString);
        }

        public final String getErrorString() {
            return this.errorString;
        }

        @NotNull
        public final List<CountryCode> getPoaCountries() {
            return this.poaCountries;
        }

        public int hashCode() {
            int iHashCode = this.poaCountries.hashCode() * 31;
            String str = this.errorString;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("GetCountriesResponse(poaCountries=");
            sb6.append(this.poaCountries);
            sb6.append(", errorString=");
            return j6.a.u(sb6, this.errorString, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GetCountriesResponse(@NotNull List<? extends CountryCode> poaCountries, String str) {
            Intrinsics.checkNotNullParameter(poaCountries, "poaCountries");
            this.poaCountries = poaCountries;
            this.errorString = str;
        }

        public GetCountriesResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? null : str);
        }
    }

    public PoaHostViewModel(@NotNull PoaRepository poaRepository, @NotNull SchedulersProvider schedulersProvider, @NotNull RawResourceReader resourceReader, @NotNull Json jsonParser, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(poaRepository, "poaRepository");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(resourceReader, "resourceReader");
        Intrinsics.checkNotNullParameter(jsonParser, "jsonParser");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.poaRepository = poaRepository;
        this.schedulersProvider = schedulersProvider;
        this.resourceReader = resourceReader;
        this.jsonParser = jsonParser;
        this.savedStateHandle = savedStateHandle;
        this.compositeDisposable = j.b(PoaHostViewModel$compositeDisposable$2.INSTANCE);
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.poaCountriesSubject = behaviorSubjectD;
        BehaviorSubject behaviorSubjectD2 = BehaviorSubject.d("");
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD2, "createDefault(...)");
        this.errorMessageSubject = behaviorSubjectD2;
        this.getCountriesResponse = j.b(new PoaHostViewModel$getCountriesResponse$2(this));
    }

    private final CompositeDisposable getCompositeDisposable() {
        return (CompositeDisposable) this.compositeDisposable.getValue();
    }

    private final CountryCode getCountryCode() {
        Object obj2 = this.savedStateHandle.get("country_code");
        if (obj2 != null) {
            return (CountryCode) obj2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String getDocumentFileName() {
        return (String) this.savedStateHandle.get("document_file_name");
    }

    private final PoaDocumentType getDocumentType() {
        Object obj2 = this.savedStateHandle.get("document_type");
        if (obj2 != null) {
            return (PoaDocumentType) obj2;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Uri getDocumentUri() {
        return (Uri) this.savedStateHandle.get("document_uri");
    }

    private final boolean isTakePhoto() {
        Boolean bool = (Boolean) this.savedStateHandle.get("is_take_photo");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void setCountryCode(CountryCode countryCode) {
        this.savedStateHandle.set("country_code", countryCode);
    }

    private final void setDocumentFileName(String str) {
        this.savedStateHandle.set("document_file_name", str);
    }

    private final void setDocumentType(PoaDocumentType poaDocumentType) {
        this.savedStateHandle.set("document_type", poaDocumentType);
    }

    private final void setDocumentUri(Uri uri2) {
        this.savedStateHandle.set("document_uri", uri2);
    }

    public static /* synthetic */ void setPoaData$default(PoaHostViewModel poaHostViewModel, CountryCode countryCode, PoaDocumentType poaDocumentType, Uri uri2, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            countryCode = null;
        }
        if ((i & 2) != 0) {
            poaDocumentType = null;
        }
        if ((i & 4) != 0) {
            uri2 = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        poaHostViewModel.setPoaData(countryCode, poaDocumentType, uri2, str);
    }

    private final void setTakePhoto(boolean z) {
        this.savedStateHandle.set("is_take_photo", Boolean.valueOf(z));
    }

    @NotNull
    public final Observable getGetCountriesResponse$onfido_capture_sdk_core_release() {
        Object value = this.getCountriesResponse.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Observable) value;
    }

    @NotNull
    public final List<PoaResponseItem> getListOfSupportedCountries$onfido_capture_sdk_core_release() {
        Object obj2 = this.savedStateHandle.get("list_of_supported_countries");
        if (obj2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b bVar = Json.d;
        e eVar = bVar.f187949b;
        KTypeProjection.Companion aVar = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(PoaResponseItem.class);
        aVar.getClass();
        return (List) bVar.b(d.v(eVar, o0.c(List.class, KTypeProjection.Companion.a(kTypeB))), (String) obj2);
    }

    @NotNull
    public final CountryCode getPoaCountryCode() {
        return getCountryCode();
    }

    @NotNull
    public final ArrayList<CountryCode> getPoaCountryCodes$onfido_capture_sdk_core_release(@NotNull List<PoaResponseItem> poaListItems) {
        Intrinsics.checkNotNullParameter(poaListItems, "poaListItems");
        setListOfSupportedCountries$onfido_capture_sdk_core_release(poaListItems);
        ArrayList arrayList = new ArrayList();
        for (PoaResponseItem poaResponseItem : poaListItems) {
            CountryCode countryCodeValueOf = CountryCode.valueOf(poaResponseItem.getCountryAlpha2());
            Json json = this.jsonParser;
            Map map = (Map) json.b(d.v(json.f187949b, o0.d(ch.qos.logback.core.util.a.s(String.class, KTypeProjection.INSTANCE), KTypeProjection.Companion.a(o0.b(String.class)))), this.resourceReader.read(R.raw.onfido_country_code_native_name_map));
            countryCodeValueOf.setLocaleName(poaResponseItem.getCountryLocaleName());
            String str = (String) map.get(countryCodeValueOf.getAlpha3());
            if (str == null) {
                str = "";
            }
            countryCodeValueOf.setNativeName(str);
            arrayList.add(countryCodeValueOf);
        }
        List listP0 = d0.P0(arrayList, new Comparator() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel$getPoaCountryCodes$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return cim.b.b(CountryCodeExtensionsKt.getDisplayName((CountryCode) t2), CountryCodeExtensionsKt.getDisplayName((CountryCode) t3));
            }
        });
        ArrayList<CountryCode> arrayList2 = new ArrayList<>();
        arrayList2.addAll(listP0);
        return arrayList2;
    }

    public final String getPoaDocumentFileName() {
        return getDocumentFileName();
    }

    @NotNull
    public final PoaDocumentType getPoaDocumentType() {
        return getDocumentType();
    }

    public final Uri getPoaDocumentUri() {
        return getDocumentUri();
    }

    public final void getPoaSupportedCountries() {
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Disposable disposableI = this.poaRepository.getPoaSupportedCountries$onfido_capture_sdk_core_release().k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()).g(new o() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel.getPoaSupportedCountries.1
            @Override // igm.o
            @NotNull
            public final ArrayList<CountryCode> apply(@NotNull List<PoaResponseItem> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return PoaHostViewModel.this.getPoaCountryCodes$onfido_capture_sdk_core_release(it8);
            }
        }).i(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel.getPoaSupportedCountries.2
            @Override // igm.g
            public final void accept(@NotNull ArrayList<CountryCode> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaHostViewModel.this.poaCountriesSubject.onNext(it8);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostViewModel.getPoaSupportedCountries.3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaHostViewModel.this.errorMessageSubject.onNext(it8.getMessage());
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    @NotNull
    public final ArrayList<PoaDocumentType> getPoaSupportedDocuments() {
        for (PoaResponseItem poaResponseItem : getListOfSupportedCountries$onfido_capture_sdk_core_release()) {
            if (Intrinsics.f(poaResponseItem.getCountryAlpha2(), getCountryCode().name())) {
                List<PoaDocumentType> documentTypes = poaResponseItem.getDocumentTypes();
                ArrayList<PoaDocumentType> arrayList = new ArrayList<>();
                arrayList.addAll(documentTypes);
                return arrayList;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final boolean isPoaTakePhoto() {
        return isTakePhoto();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        getCompositeDisposable().d();
    }

    public final void setListOfSupportedCountries$onfido_capture_sdk_core_release(@NotNull List<PoaResponseItem> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SavedStateHandle savedStateHandle = this.savedStateHandle;
        b bVar = Json.d;
        e eVar = bVar.f187949b;
        KTypeProjection.Companion aVar = KTypeProjection.INSTANCE;
        KType kTypeB = o0.b(PoaResponseItem.class);
        aVar.getClass();
        savedStateHandle.set("list_of_supported_countries", bVar.c(d.v(eVar, o0.c(List.class, KTypeProjection.Companion.a(kTypeB))), value));
    }

    public final void setPoaData(CountryCode countryCode, PoaDocumentType documentType, Uri documentUri, String poaDocumentFileName) {
        if (countryCode != null) {
            setCountryCode(countryCode);
        }
        if (documentType != null) {
            setDocumentType(documentType);
        }
        if (documentUri != null) {
            setDocumentUri(documentUri);
            setTakePhoto(false);
        }
        if (poaDocumentFileName != null) {
            setDocumentFileName(poaDocumentFileName);
            setTakePhoto(true);
        }
    }
}
