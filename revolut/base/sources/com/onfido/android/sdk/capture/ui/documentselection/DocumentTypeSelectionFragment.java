package com.onfido.android.sdk.capture.ui.documentselection;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.ViewExtensionsKt;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentRestrictedDocumentSelectionBinding;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionState;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment;
import com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostViewModel;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.javax.inject.Provider;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;
import zhm.f0;
import zsc.p;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 02\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\u001a\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentRestrictedDocumentSelectionBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentRestrictedDocumentSelectionBinding;", "documentsAdapter", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentAdapter;", "viewModel", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelHost", "Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "getViewModelHost", "()Lcom/onfido/android/sdk/capture/ui/documentselection/host/DocumentSelectionHostViewModel;", "viewModelHost$delegate", "viewModelProvider", "Lcom/onfido/javax/inject/Provider;", "getViewModelProvider", "()Lcom/onfido/javax/inject/Provider;", "setViewModelProvider", "(Lcom/onfido/javax/inject/Provider;)V", "hideDocumentViews", "", "observeState", "onDocumentSelected", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "genericDocumentTitle", "", "genericDocPages", "Lcom/onfido/android/sdk/capture/document/DocumentPages;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickCountry", "setupViews", "showDocumentViews", "updateView", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentTypeSelectionFragment extends Fragment {
    private OnfidoFragmentRestrictedDocumentSelectionBinding _binding;

    @NotNull
    private final DocumentAdapter documentsAdapter;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: viewModelHost$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModelHost;
    public Provider viewModelProvider;

    @NotNull
    private static final String KEY_NFC_WARNING_VISIBLE = "KEY_NFC_WARNING_VISIBLE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionFragment$Companion;", "", "()V", "KEY_NFC_WARNING_VISIBLE", "", "createInstance", "Lcom/onfido/android/sdk/capture/ui/documentselection/DocumentTypeSelectionFragment;", "nfcRequiredWarningVisible", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final DocumentTypeSelectionFragment createInstance(boolean nfcRequiredWarningVisible) {
            DocumentTypeSelectionFragment documentTypeSelectionFragment = new DocumentTypeSelectionFragment();
            documentTypeSelectionFragment.setArguments(BundleKt.bundleOf(new Pair("KEY_NFC_WARNING_VISIBLE", Boolean.valueOf(nfcRequiredWarningVisible))));
            return documentTypeSelectionFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentTypeSelectionFragment() {
        super(R.layout.onfido_fragment_restricted_document_selection);
        DocumentTypeSelectionFragment$viewModel$2 documentTypeSelectionFragment$viewModel$2 = new DocumentTypeSelectionFragment$viewModel$2(this);
        DocumentTypeSelectionFragment$special$$inlined$viewModels$default$1 documentTypeSelectionFragment$special$$inlined$viewModels$default$1 = new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$1(this);
        k kVar = k.NONE;
        Lazy lazyC = j.c(kVar, new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$2(documentTypeSelectionFragment$special$$inlined$viewModels$default$1));
        p0 p0Var = o0.f186429a;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, p0Var.b(DocumentTypeSelectionViewModel.class), new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$3(lazyC), new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$4(null, lazyC), documentTypeSelectionFragment$viewModel$2);
        Lazy lazyC2 = j.c(kVar, new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$6(new DocumentTypeSelectionFragment$viewModelHost$2(this)));
        this.viewModelHost = FragmentViewModelLazyKt.createViewModelLazy(this, p0Var.b(DocumentSelectionHostViewModel.class), new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$7(lazyC2), new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$8(null, lazyC2), new DocumentTypeSelectionFragment$special$$inlined$viewModels$default$9(this, lazyC2));
        this.documentsAdapter = new DocumentAdapter(new DocumentTypeSelectionFragment$documentsAdapter$1(this), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentRestrictedDocumentSelectionBinding getBinding() {
        OnfidoFragmentRestrictedDocumentSelectionBinding onfidoFragmentRestrictedDocumentSelectionBinding = this._binding;
        Intrinsics.h(onfidoFragmentRestrictedDocumentSelectionBinding);
        return onfidoFragmentRestrictedDocumentSelectionBinding;
    }

    private final DocumentTypeSelectionViewModel getViewModel() {
        return (DocumentTypeSelectionViewModel) this.viewModel.getValue();
    }

    private final DocumentSelectionHostViewModel getViewModelHost() {
        return (DocumentSelectionHostViewModel) this.viewModelHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideDocumentViews() {
        OnfidoFragmentRestrictedDocumentSelectionBinding binding = getBinding();
        binding.headerDocumentType.setVisibility(8);
        binding.documentList.setVisibility(8);
    }

    private final void observeState() {
        Disposable disposableSubscribe = getViewModelHost().getState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.documentselection.DocumentTypeSelectionFragment.observeState.1
            @Override // igm.g
            public final void accept(DocumentTypeSelectionState documentTypeSelectionState) {
                if (documentTypeSelectionState instanceof DocumentTypeSelectionState.DocumentTypeSelected) {
                    DocumentTypeSelectionFragment.this.updateView(((DocumentTypeSelectionState.DocumentTypeSelected) documentTypeSelectionState).getCountryCode());
                    return;
                }
                if (documentTypeSelectionState instanceof DocumentTypeSelectionState.CountrySelected) {
                    DocumentTypeSelectionFragment.this.updateView(((DocumentTypeSelectionState.CountrySelected) documentTypeSelectionState).getCountryCode());
                    return;
                }
                if (!Intrinsics.f(documentTypeSelectionState, DocumentTypeSelectionState.NoCountrySelected.INSTANCE)) {
                    if (Intrinsics.f(documentTypeSelectionState, DocumentTypeSelectionState.LoadingDocumentsFailed.INSTANCE)) {
                        TextView tvSelectedCountryTitle = DocumentTypeSelectionFragment.this.getBinding().tvSelectedCountryTitle;
                        Intrinsics.checkNotNullExpressionValue(tvSelectedCountryTitle, "tvSelectedCountryTitle");
                        tvSelectedCountryTitle.setVisibility(8);
                        ConstraintLayout root = DocumentTypeSelectionFragment.this.getBinding().countryPicker.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                        root.setVisibility(8);
                        OnfidoButton btRetry = DocumentTypeSelectionFragment.this.getBinding().btRetry;
                        Intrinsics.checkNotNullExpressionValue(btRetry, "btRetry");
                        btRetry.setVisibility(0);
                        return;
                    }
                    return;
                }
                DocumentTypeSelectionFragment.this.getBinding().countryPicker.getRoot().setContentDescription(DocumentTypeSelectionFragment.this.getString(R.string.onfido_doc_select_section_header_country) + ". " + DocumentTypeSelectionFragment.this.getString(R.string.onfido_country_selection_select_hint_accessibility));
                DocumentTypeSelectionFragment.this.getBinding().countryPicker.countryName.setText(DocumentTypeSelectionFragment.this.getString(R.string.onfido_doc_select_section_input_placeholder_country));
                DocumentTypeSelectionFragment.this.documentsAdapter.submitList(f0.f322471a);
                DocumentTypeSelectionFragment.this.hideDocumentViews();
                OnfidoButton btRetry2 = DocumentTypeSelectionFragment.this.getBinding().btRetry;
                Intrinsics.checkNotNullExpressionValue(btRetry2, "btRetry");
                btRetry2.setVisibility(8);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDocumentSelected(DocumentType documentType, String genericDocumentTitle, DocumentPages genericDocPages) {
        getViewModelHost().onDocumentSelected(documentType, genericDocumentTitle, genericDocPages);
    }

    private final void pickCountry() {
        getViewModelHost().onCountrySelectionClicked();
    }

    private final void setupViews() {
        OnfidoFragmentRestrictedDocumentSelectionBinding binding = getBinding();
        hideDocumentViews();
        RecyclerView recyclerView = binding.documentList;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.documentsAdapter);
        final int i = 0;
        binding.countryPicker.getRoot().setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.documentselection.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentTypeSelectionFragment f50059b;

            {
                this.f50059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        DocumentTypeSelectionFragment.setupViews$lambda$3$lambda$1(this.f50059b, view);
                        break;
                    default:
                        DocumentTypeSelectionFragment.setupViews$lambda$3$lambda$2(this.f50059b, view);
                        break;
                }
            }
        });
        ConstraintLayout root = binding.countryPicker.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtensionsKt.removeAccessibilityAction(root);
        final int i2 = 1;
        binding.btRetry.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.documentselection.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentTypeSelectionFragment f50059b;

            {
                this.f50059b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        DocumentTypeSelectionFragment.setupViews$lambda$3$lambda$1(this.f50059b, view);
                        break;
                    default:
                        DocumentTypeSelectionFragment.setupViews$lambda$3$lambda$2(this.f50059b, view);
                        break;
                }
            }
        });
        TextView tvNfcRequiredWarning = binding.tvNfcRequiredWarning;
        Intrinsics.checkNotNullExpressionValue(tvNfcRequiredWarning, "tvNfcRequiredWarning");
        tvNfcRequiredWarning.setVisibility(requireArguments().getBoolean("KEY_NFC_WARNING_VISIBLE") ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$3$lambda$1(DocumentTypeSelectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.pickCountry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$lambda$3$lambda$2(DocumentTypeSelectionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView tvSelectedCountryTitle = this$0.getBinding().tvSelectedCountryTitle;
        Intrinsics.checkNotNullExpressionValue(tvSelectedCountryTitle, "tvSelectedCountryTitle");
        tvSelectedCountryTitle.setVisibility(0);
        ConstraintLayout root = this$0.getBinding().countryPicker.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(0);
        OnfidoButton btRetry = this$0.getBinding().btRetry;
        Intrinsics.checkNotNullExpressionValue(btRetry, "btRetry");
        btRetry.setVisibility(8);
        this$0.getViewModelHost().retryFetchingDocuments(true);
    }

    private final void showDocumentViews() {
        OnfidoFragmentRestrictedDocumentSelectionBinding binding = getBinding();
        binding.headerDocumentType.setVisibility(0);
        binding.documentList.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateView(CountryCode countryCode) {
        OnfidoButton btRetry = getBinding().btRetry;
        Intrinsics.checkNotNullExpressionValue(btRetry, "btRetry");
        btRetry.setVisibility(8);
        DisplayCountry displayCountryFrom$onfido_capture_sdk_core_release = DisplayCountry.INSTANCE.from$onfido_capture_sdk_core_release(countryCode);
        getBinding().countryPicker.countryName.setText(displayCountryFrom$onfido_capture_sdk_core_release.getDisplayName());
        getBinding().countryPicker.getRoot().setContentDescription(getString(R.string.onfido_doc_select_section_header_country) + p.SPACE_CHAR + countryCode.getLocaleName() + ". " + getString(R.string.onfido_country_selection_select_hint_accessibility));
        this.documentsAdapter.submitList(getViewModel().getFullListOfDocumentsToDisplay(displayCountryFrom$onfido_capture_sdk_core_release.getCountryCode()));
        showDocumentViews();
    }

    @NotNull
    public final Provider getViewModelProvider() {
        Provider provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.documentselection.host.DocumentSelectionHostFragment");
        ((DocumentSelectionHostFragment) parentFragment).getRdsComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentRestrictedDocumentSelectionBinding.bind(view);
        setupViews();
        observeState();
    }

    public final void setViewModelProvider(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.viewModelProvider = provider;
    }
}
