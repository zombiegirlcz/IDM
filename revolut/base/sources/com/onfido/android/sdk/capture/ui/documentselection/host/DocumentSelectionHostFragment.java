package com.onfido.android.sdk.capture.ui.documentselection.host;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.android.sdk.capture.internal.ui.countryselection.CountrySelectionFragment;
import com.onfido.android.sdk.capture.internal.util.FragmentManagerExtKt;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionState;
import com.onfido.android.sdk.capture.ui.documentselection.di.RestrictedDocumentSelectionHostComponent;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002%&B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u001aH\u0002J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "factory", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel$Factory;", "getFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel$Factory;", "setFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel$Factory;)V", "navigationManager", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "getNavigationManager", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "navigationManager$delegate", "Lkotlin/Lazy;", "rdsComponent", "Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent;", "getRdsComponent$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/documentselection/di/RestrictedDocumentSelectionHostComponent;", "rdsComponent$delegate", "viewModel", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "viewModel$delegate", "handleBackNavigation", "", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setListenerForCountrySelection", "submitResult", "result", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "Companion", "DocumentSelectionResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentSelectionHostFragment extends BaseFragment {
    public DocumentSelectionHostViewModel.Factory factory;

    /* JADX INFO: renamed from: navigationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationManager;

    /* JADX INFO: renamed from: rdsComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rdsComponent;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private static final String KEY_SELECTED_COUNTRY = "key_selected_country";

    @NotNull
    private static final String KEY_NFC_REQUIRED_WARNING_VISIBLE = "key_nfc_warning";

    @NotNull
    private static final String KEY_RDS_HOST_RESULT = "key_rds_host_result";

    @NotNull
    private static final String KEY_IS_IN_WORKFLOW = "key_is_in_workflow";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$Companion;", "", "()V", "KEY_IS_IN_WORKFLOW", "", "KEY_NFC_REQUIRED_WARNING_VISIBLE", "KEY_RDS_HOST_RESULT", "KEY_SELECTED_COUNTRY", "createInstance", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment;", "selectedCountryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "resultKey", "nfcRequiredWarningVisible", "", "isInWorkflow", "getResult", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ DocumentSelectionHostFragment createInstance$default(Companion companion, CountryCode countryCode, String str, boolean z, boolean z3, int i, Object obj2) {
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z3 = false;
            }
            return companion.createInstance(countryCode, str, z, z3);
        }

        @NotNull
        public final DocumentSelectionHostFragment createInstance(CountryCode selectedCountryCode, @NotNull String resultKey, boolean nfcRequiredWarningVisible, boolean isInWorkflow) {
            Intrinsics.checkNotNullParameter(resultKey, "resultKey");
            DocumentSelectionHostFragment documentSelectionHostFragment = new DocumentSelectionHostFragment();
            documentSelectionHostFragment.setArguments(BundleKt.bundleOf(new Pair("key_rds_host_result", resultKey), new Pair("key_selected_country", selectedCountryCode), new Pair("key_nfc_warning", Boolean.valueOf(nfcRequiredWarningVisible)), new Pair("key_is_in_workflow", Boolean.valueOf(isInWorkflow))));
            return documentSelectionHostFragment;
        }

        @NotNull
        public final DocumentSelectionResult getResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_rds_host_result");
            if (parcelable != null) {
                return (DocumentSelectionResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "Landroid/os/Parcelable;", "Completed", "Exit", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Completed;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Exit;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface DocumentSelectionResult extends Parcelable {

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Completed;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "genericDocTitle", "", "genericDocPages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/android/sdk/capture/DocumentType;Ljava/lang/String;Lcom/onfido/android/sdk/capture/document/DocumentPages;)V", "getCountryCode", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getDocumentType", "()Lcom/onfido/android/sdk/capture/DocumentType;", "getGenericDocPages", "()Lcom/onfido/android/sdk/capture/document/DocumentPages;", "getGenericDocTitle", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Completed implements DocumentSelectionResult {

            @NotNull
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();

            @NotNull
            private final CountryCode countryCode;

            @NotNull
            private final DocumentType documentType;
            private final DocumentPages genericDocPages;
            private final String genericDocTitle;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Completed createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Completed(CountryCode.valueOf(parcel.readString()), DocumentType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : DocumentPages.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Completed[] newArray(int i) {
                    return new Completed[i];
                }
            }

            public Completed(@NotNull CountryCode countryCode, @NotNull DocumentType documentType, String str, DocumentPages documentPages) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                this.countryCode = countryCode;
                this.documentType = documentType;
                this.genericDocTitle = str;
                this.genericDocPages = documentPages;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @NotNull
            public final CountryCode getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public final DocumentPages getGenericDocPages() {
                return this.genericDocPages;
            }

            public final String getGenericDocTitle() {
                return this.genericDocTitle;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.countryCode.name());
                parcel.writeString(this.documentType.name());
                parcel.writeString(this.genericDocTitle);
                DocumentPages documentPages = this.genericDocPages;
                if (documentPages == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(documentPages.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostFragment$DocumentSelectionResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit implements DocumentSelectionResult {

            @NotNull
            public static final Exit INSTANCE = new Exit();

            @NotNull
            public static final Parcelable.Creator<Exit> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Exit> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Exit createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Exit.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final Exit[] newArray(int i) {
                    return new Exit[i];
                }
            }

            private Exit() {
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment$setListenerForCountrySelection$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "bundle", "Landroid/os/Bundle;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21291 extends u implements Function2<String, Bundle, Unit> {
        public C21291() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            invoke((String) obj2, (Bundle) obj3);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull String str, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            DocumentSelectionHostFragment.this.getViewModel().onCountrySelectionScreenResult(CountrySelectionFragment.INSTANCE.getResult(bundle).getCountryCode());
        }
    }

    public DocumentSelectionHostFragment() {
        super(R.layout.onfido_fragment_restricted_document_host);
        this.rdsComponent = j.b(new DocumentSelectionHostFragment$rdsComponent$2(this));
        DocumentSelectionHostFragment$viewModel$2 documentSelectionHostFragment$viewModel$2 = new DocumentSelectionHostFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new DocumentSelectionHostFragment$special$$inlined$viewModels$default$2(new DocumentSelectionHostFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(DocumentSelectionHostViewModel.class), new DocumentSelectionHostFragment$special$$inlined$viewModels$default$3(lazyC), new DocumentSelectionHostFragment$special$$inlined$viewModels$default$4(null, lazyC), documentSelectionHostFragment$viewModel$2);
        this.navigationManager = j.b(new DocumentSelectionHostFragment$navigationManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNavigationManager getNavigationManager() {
        return (FragmentNavigationManager) this.navigationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocumentSelectionHostViewModel getViewModel() {
        return (DocumentSelectionHostViewModel) this.viewModel.getValue();
    }

    private final void handleBackNavigation() {
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment.handleBackNavigation.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                if (DocumentSelectionHostFragment.this.getNavigationManager().getCurrentScreensSnapshot().size() > 1) {
                    DocumentSelectionHostFragment.this.getViewModel().getNavigator().exitCurrentScreen();
                    return;
                }
                DocumentSelectionHostFragment.this.submitResult(DocumentSelectionResult.Exit.INSTANCE);
                Bundle arguments = DocumentSelectionHostFragment.this.getArguments();
                if (arguments != null ? arguments.getBoolean("key_is_in_workflow") : false) {
                    return;
                }
                DocumentSelectionHostFragment.this.getParentFragmentManager().popBackStack();
            }
        });
    }

    private final void setListenerForCountrySelection() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FragmentManagerExtKt.setFragmentResultsListeners(childFragmentManager, this, new String[]{"rds_country_picker_result_key"}, new C21291());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitResult(DocumentSelectionResult result) {
        String string = requireArguments().getString("key_rds_host_result");
        if (string == null) {
            string = "";
        }
        getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("key_rds_host_result", result)));
    }

    @NotNull
    public final DocumentSelectionHostViewModel.Factory getFactory$onfido_capture_sdk_core_release() {
        DocumentSelectionHostViewModel.Factory factory = this.factory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("factory");
        throw null;
    }

    @NotNull
    public final RestrictedDocumentSelectionHostComponent getRdsComponent$onfido_capture_sdk_core_release() {
        return (RestrictedDocumentSelectionHostComponent) this.rdsComponent.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().getNavigationManagerHolder().setNavigationManager(getNavigationManager());
        getViewModel().onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getRdsComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        handleBackNavigation();
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("key_selected_country") : null;
        CountryCode countryCode = serializable instanceof CountryCode ? (CountryCode) serializable : null;
        if (countryCode != null) {
            getViewModel().onCountrySelected(countryCode);
        }
        getViewModel().setNfcRquiredWarning(requireArguments().getBoolean("key_nfc_warning"));
        getViewModel().loadScreens();
        Disposable disposableSubscribe = getViewModel().getState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment.onViewCreated.1
            @Override // igm.g
            public final void accept(DocumentTypeSelectionState documentTypeSelectionState) {
                if (documentTypeSelectionState instanceof DocumentTypeSelectionState.DocumentTypeSelected) {
                    DocumentTypeSelectionState.DocumentTypeSelected documentTypeSelected = (DocumentTypeSelectionState.DocumentTypeSelected) documentTypeSelectionState;
                    DocumentSelectionHostFragment.this.getViewModel().onCountrySelected(documentTypeSelected.getCountryCode());
                    DocumentSelectionHostFragment.this.submitResult(new DocumentSelectionResult.Completed(documentTypeSelected.getCountryCode(), documentTypeSelected.getDocumentType(), documentTypeSelected.getGenericDocTitle(), documentTypeSelected.getGenericDocPages()));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnDestroy(disposableSubscribe, viewLifecycleOwner);
        setListenerForCountrySelection();
    }

    public final void setFactory$onfido_capture_sdk_core_release(@NotNull DocumentSelectionHostViewModel.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.factory = factory;
    }
}
