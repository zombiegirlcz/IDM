package com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentPoaDocumentDetailsBinding;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.PoaDocumentDetailsViewModel;
import com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment;
import com.onfido.android.sdk.capture.ui.userconsent.htmlutil.TextViewExtensionKt;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.javax.inject.Provider;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "poaUtils", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "getPoaUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "setPoaUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;)V", "poaViewModelFactory", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel;", "getPoaViewModelFactory", "()Lcom/onfido/javax/inject/Provider;", "setPoaViewModelFactory", "(Lcom/onfido/javax/inject/Provider;)V", "viewModel", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "submitActionButtonPressed", "isTakePhoto", "", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaDocumentDetailsFragment extends BaseFragment {
    public PoaUtils poaUtils;
    public Provider poaViewModelFactory;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private static final String KEY_RESULT = "key_result";

    @NotNull
    private static final String IS_TAKE_PHOTO = "is_take_photo";

    @NotNull
    private static final String POA_DOCUMENT_TYPE = "document_type";

    @NotNull
    private static final String COUNTRY_CODE = "poa_country_code";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsFragment$Companion;", "", "()V", "COUNTRY_CODE", "", "IS_TAKE_PHOTO", "KEY_RESULT", "POA_DOCUMENT_TYPE", "createInstance", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsFragment;", "resultKey", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentType", "Lcom/onfido/api/client/data/PoaDocumentType;", "isTakePhotoButton", "", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PoaDocumentDetailsFragment createInstance(@NotNull String resultKey, @NotNull CountryCode countryCode, @NotNull PoaDocumentType documentType) {
            Intrinsics.checkNotNullParameter(resultKey, "resultKey");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            PoaDocumentDetailsFragment poaDocumentDetailsFragment = new PoaDocumentDetailsFragment();
            poaDocumentDetailsFragment.setArguments(BundleKt.bundleOf(new Pair("key_result", resultKey), new Pair("poa_country_code", countryCode), new Pair("document_type", documentType)));
            return poaDocumentDetailsFragment;
        }

        public final boolean isTakePhotoButton(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getBoolean("is_take_photo");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.PoaDocumentDetailsFragment$onViewCreated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "viewState", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentDetails/PoaDocumentDetailsViewModel$PoaDocumentDetailsViewState;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<PoaDocumentDetailsViewModel.PoaDocumentDetailsViewState, Unit> {
        final /* synthetic */ OnfidoFragmentPoaDocumentDetailsBinding $binding;
        final /* synthetic */ PoaDocumentDetailsFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnfidoFragmentPoaDocumentDetailsBinding onfidoFragmentPoaDocumentDetailsBinding, PoaDocumentDetailsFragment poaDocumentDetailsFragment) {
            super(1);
            this.$binding = onfidoFragmentPoaDocumentDetailsBinding;
            this.this$0 = poaDocumentDetailsFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((PoaDocumentDetailsViewModel.PoaDocumentDetailsViewState) obj2);
            return Unit.f186387a;
        }

        public final void invoke(PoaDocumentDetailsViewModel.PoaDocumentDetailsViewState poaDocumentDetailsViewState) {
            OnfidoFragmentPoaDocumentDetailsBinding onfidoFragmentPoaDocumentDetailsBinding = this.$binding;
            PoaDocumentDetailsFragment poaDocumentDetailsFragment = this.this$0;
            onfidoFragmentPoaDocumentDetailsBinding.poaDocumentDetailsTitle.setText(poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getTitleResId()));
            TextView poaDocumentDetailsSubTitle = onfidoFragmentPoaDocumentDetailsBinding.poaDocumentDetailsSubTitle;
            Intrinsics.checkNotNullExpressionValue(poaDocumentDetailsSubTitle, "poaDocumentDetailsSubTitle");
            String string = poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getSubtitleResId());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            TextViewExtensionKt.setTextFromHtml(poaDocumentDetailsSubTitle, string);
            onfidoFragmentPoaDocumentDetailsBinding.poaCaptureBullet1.setText(poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getInstructions().getBullet1()));
            onfidoFragmentPoaDocumentDetailsBinding.poaCaptureBullet2.setText(poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getInstructions().getBullet2()));
            onfidoFragmentPoaDocumentDetailsBinding.poaCaptureBullet3.setText(poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getInstructions().getBullet3()));
            onfidoFragmentPoaDocumentDetailsBinding.poaCaptureBullet4.setText(poaDocumentDetailsFragment.getString(poaDocumentDetailsViewState.getInstructions().getBullet4()));
        }
    }

    public PoaDocumentDetailsFragment() {
        super(R.layout.onfido_fragment_poa_document_details);
        PoaDocumentDetailsFragment$viewModel$2 poaDocumentDetailsFragment$viewModel$2 = new PoaDocumentDetailsFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new PoaDocumentDetailsFragment$special$$inlined$viewModels$default$2(new PoaDocumentDetailsFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(PoaDocumentDetailsViewModel.class), new PoaDocumentDetailsFragment$special$$inlined$viewModels$default$3(lazyC), new PoaDocumentDetailsFragment$special$$inlined$viewModels$default$4(null, lazyC), poaDocumentDetailsFragment$viewModel$2);
    }

    @NotNull
    public static final PoaDocumentDetailsFragment createInstance(@NotNull String str, @NotNull CountryCode countryCode, @NotNull PoaDocumentType poaDocumentType) {
        return INSTANCE.createInstance(str, countryCode, poaDocumentType);
    }

    private final PoaDocumentDetailsViewModel getViewModel() {
        return (PoaDocumentDetailsViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(Function1 tmp0, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(PoaDocumentDetailsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.submitActionButtonPressed(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(PoaDocumentDetailsFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.submitActionButtonPressed(true);
    }

    private final void submitActionButtonPressed(boolean isTakePhoto) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        String string = requireArguments().getString("key_result");
        Intrinsics.h(string);
        parentFragmentManager.setFragmentResult(string, BundleKt.bundleOf(new Pair("is_take_photo", Boolean.valueOf(isTakePhoto))));
    }

    @NotNull
    public final PoaUtils getPoaUtils$onfido_capture_sdk_core_release() {
        PoaUtils poaUtils = this.poaUtils;
        if (poaUtils != null) {
            return poaUtils;
        }
        Intrinsics.r("poaUtils");
        throw null;
    }

    @NotNull
    public final Provider getPoaViewModelFactory() {
        Provider provider = this.poaViewModelFactory;
        if (provider != null) {
            return provider;
        }
        Intrinsics.r("poaViewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().trackPoaDocumentDetails();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        Fragment parentFragment = getParentFragment();
        Intrinsics.i(parentFragment, "null cannot be cast to non-null type com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment");
        ((PoaHostFragment) parentFragment).getPoaComponent$onfido_capture_sdk_core_release().inject(this);
        super.onViewCreated(view, savedInstanceState);
        OnfidoFragmentPoaDocumentDetailsBinding onfidoFragmentPoaDocumentDetailsBindingBind = OnfidoFragmentPoaDocumentDetailsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoFragmentPoaDocumentDetailsBindingBind, "bind(...)");
        Serializable serializable = requireArguments().getSerializable("poa_country_code");
        Intrinsics.i(serializable, "null cannot be cast to non-null type com.onfido.android.sdk.capture.utils.CountryCode");
        Serializable serializable2 = requireArguments().getSerializable("document_type");
        Intrinsics.i(serializable2, "null cannot be cast to non-null type com.onfido.api.client.data.PoaDocumentType");
        getViewModel().init((CountryCode) serializable, (PoaDocumentType) serializable2);
        getViewModel().getViewState().observe(getViewLifecycleOwner(), new com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload.a(8, new AnonymousClass1(onfidoFragmentPoaDocumentDetailsBindingBind, this)));
        final int i = 0;
        onfidoFragmentPoaDocumentDetailsBindingBind.uploadButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentDetailsFragment f50080b;

            {
                this.f50080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        PoaDocumentDetailsFragment.onViewCreated$lambda$1(this.f50080b, view2);
                        break;
                    default:
                        PoaDocumentDetailsFragment.onViewCreated$lambda$2(this.f50080b, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        onfidoFragmentPoaDocumentDetailsBindingBind.takePhotoButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentDetails.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentDetailsFragment f50080b;

            {
                this.f50080b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        PoaDocumentDetailsFragment.onViewCreated$lambda$1(this.f50080b, view2);
                        break;
                    default:
                        PoaDocumentDetailsFragment.onViewCreated$lambda$2(this.f50080b, view2);
                        break;
                }
            }
        });
    }

    public final void setPoaUtils$onfido_capture_sdk_core_release(@NotNull PoaUtils poaUtils) {
        Intrinsics.checkNotNullParameter(poaUtils, "<set-?>");
        this.poaUtils = poaUtils;
    }

    public final void setPoaViewModelFactory(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<set-?>");
        this.poaViewModelFactory = provider;
    }
}
