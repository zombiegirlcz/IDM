package com.onfido.android.sdk.capture.ui.nfc.scan;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.common.result.HapticFeedback;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentNfcScanBinding;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.nfc.NfcTagDelegate;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.nfc.data.PassportBACKey;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.ui.camera.view.PlaybackControlsVideoPlayerView;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanBottomDialog;
import com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanPresenter;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import igm.g;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import yhm.j;
import yhm.k;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010A\u001a\u00020<H\u0002J\b\u0010B\u001a\u00020<H\u0002J\b\u0010C\u001a\u00020<H\u0016J\u0018\u0010D\u001a\u00020<2\u0006\u0010?\u001a\u00020@2\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020<H\u0002J\b\u0010H\u001a\u00020<H\u0016J\u0010\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u00020<H\u0002J\b\u0010M\u001a\u00020<H\u0002J\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0002J\b\u0010Q\u001a\u00020<H\u0016J\b\u0010R\u001a\u00020<H\u0016J\b\u0010S\u001a\u00020<H\u0016J\b\u0010T\u001a\u00020<H\u0016J\u001a\u0010U\u001a\u00020<2\u0006\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010Z\u001a\u00020<H\u0002J\b\u0010[\u001a\u00020<H\u0002J\b\u0010\\\u001a\u00020<H\u0002J\b\u0010]\u001a\u00020<H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b0\u00101R\u001e\u00103\u001a\u0002048\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog$NfcScanBottomActions;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentNfcScanBinding;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "getAnnouncementService$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "setAnnouncementService$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;)V", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentNfcScanBinding;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "dispatchersProvider", "Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "getDispatchersProvider$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;", "setDispatchersProvider$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/util/DispatchersProvider;)V", "hapticFeedback", "Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;", "getHapticFeedback$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;", "setHapticFeedback$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/common/result/HapticFeedback;)V", "nfcInteractor", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "getNfcInteractor$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "setNfcInteractor$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;)V", "nfcScanBottomDialog", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog;", "getNfcScanBottomDialog", "()Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanBottomDialog;", "nfcScanBottomDialog$delegate", "Lkotlin/Lazy;", "nfcViewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getNfcViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "nfcViewModel$delegate", "presenter", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "getPresenter", "()Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter;", "presenter$delegate", "presenterFactory", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter$Factory;", "getPresenterFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter$Factory;", "setPresenterFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanPresenter$Factory;)V", "readerModeStarted", "", "finishNFCScanning", "", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "observeNfcScanState", "observeViewState", "onDestroyView", "onNfcChipRead", "duration", "", "onNfcConnectionLost", "onNfcDialogDismissedByDialog", "onNfcScanFailed", "reason", "", "onNfcScanRetry", "onNfcScanTimeout", "onNfcScanning", "state", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/Scanning;", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setInstructions", "setPinDisclaimer", "startEnableReaderMode", "startScanning", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcScanFragment extends Fragment implements NfcScanBottomDialog.NfcScanBottomActions {
    private OnfidoFragmentNfcScanBinding _binding;
    public AnnouncementService announcementService;

    @NotNull
    private final CompositeDisposable compositeDisposable;
    public DispatchersProvider dispatchersProvider;
    public HapticFeedback hapticFeedback;
    public NfcInteractor nfcInteractor;

    /* JADX INFO: renamed from: nfcScanBottomDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcScanBottomDialog;

    /* JADX INFO: renamed from: nfcViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy nfcViewModel;

    /* JADX INFO: renamed from: presenter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy presenter;
    public NfcScanPresenter.Factory presenterFactory;
    private boolean readerModeStarted;

    @NotNull
    private static final String NFC_FLOW_TYPE_KEY = "nfc_flow_type_key";

    @NotNull
    private static final String PASSPORT_BAC_KEY = "key_passport_bac_key";

    @NotNull
    private static final String DOCUMENT_TYPE_KEY = "document_type_key";

    @NotNull
    private static final String PIN_LENGTH_KEY = "pin_length_key";

    @NotNull
    private static final String AA_CHALLENGE = "key_aa_challenge";

    @NotNull
    private static final String COUNTRY_CODE_KEY = "country_code_key";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanFragment$Companion;", "", "()V", "AA_CHALLENGE", "", "COUNTRY_CODE_KEY", "DOCUMENT_TYPE_KEY", "NFC_FLOW_TYPE_KEY", "PASSPORT_BAC_KEY", "PIN_LENGTH_KEY", "createInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanFragment;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "passportBACKey", "Lcom/onfido/android/sdk/capture/internal/nfc/data/PassportBACKey;", "aaChallenge", "", "pinLength", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcScanFragment createInstance(@NotNull DocumentType documentType, CountryCode countryCode, @NotNull NfcFlowType nfcFlowType, @NotNull PassportBACKey passportBACKey, byte[] aaChallenge, int pinLength) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
            Intrinsics.checkNotNullParameter(passportBACKey, "passportBACKey");
            NfcScanFragment nfcScanFragment = new NfcScanFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("document_type_key", documentType);
            bundle.putSerializable("country_code_key", countryCode);
            bundle.putSerializable("nfc_flow_type_key", nfcFlowType);
            bundle.putSerializable("key_passport_bac_key", passportBACKey);
            bundle.putByteArray("key_aa_challenge", aaChallenge);
            bundle.putInt("pin_length_key", pinLength);
            nfcScanFragment.setArguments(bundle);
            return nfcScanFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$observeViewState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "viewState", "Lcom/onfido/android/sdk/capture/ui/nfc/scan/NfcScanViewState;", "accept"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21361<T> implements g {
        public C21361() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void accept$lambda$1$lambda$0(NfcScanFragment this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.getNfcViewModel().trackNFCScanClicked();
            this$0.startScanning();
        }

        @Override // igm.g
        public final void accept(@NotNull NfcScanViewState viewState) {
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            OnfidoFragmentNfcScanBinding binding = NfcScanFragment.this.getBinding();
            NfcScanFragment nfcScanFragment = NfcScanFragment.this;
            binding.title.setText(viewState.getTitleResId());
            binding.btnStartScanning.setOnClickListener(new e(nfcScanFragment, 0));
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onPause$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onPause$1", f = "NfcScanFragment.kt", l = {Constants.TAG_EMV_ICC_CONFIG_VERSION}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21371 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onPause$1$1, reason: invalid class name and collision with other inner class name */
        @gim.d(c = "com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onPause$1$1", f = "NfcScanFragment.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03771 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ NfcScanFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03771(NfcScanFragment nfcScanFragment, Continuation<? super C03771> continuation) {
                super(2, continuation);
                this.this$0 = nfcScanFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03771(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                this.this$0.readerModeStarted = false;
                NfcInteractor nfcInteractor$onfido_capture_sdk_core_release = this.this$0.getNfcInteractor$onfido_capture_sdk_core_release();
                FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                nfcInteractor$onfido_capture_sdk_core_release.disableReaderMode(fragmentActivityRequireActivity);
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03771) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public C21371(Continuation<? super C21371> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return NfcScanFragment.this.new C21371(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineDispatcher coroutineDispatcherMo3706getDefault = NfcScanFragment.this.getDispatchersProvider$onfido_capture_sdk_core_release().mo3706getDefault();
                C03771 c03771 = new C03771(NfcScanFragment.this, null);
                this.label = 1;
                if (e0.J(coroutineDispatcherMo3706getDefault, c03771, this) == aVar) {
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
            return ((C21371) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1, reason: invalid class name and case insensitive filesystem */
    @gim.d(c = "com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1", f = "NfcScanFragment.kt", l = {Constants.TAG_EMV_L2_CHECKSUM}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21381 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1$1, reason: invalid class name and collision with other inner class name */
        @gim.d(c = "com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1$1", f = "NfcScanFragment.kt", l = {221}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class C03781 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ NfcScanFragment this$0;

            /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1$1$1, reason: invalid class name and collision with other inner class name */
            @gim.d(c = "com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$onResume$1$1$1", f = "NfcScanFragment.kt", l = {}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class C03791 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ NfcScanFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03791(NfcScanFragment nfcScanFragment, Continuation<? super C03791> continuation) {
                    super(2, continuation);
                    this.this$0 = nfcScanFragment;
                }

                @Override // gim.a
                @NotNull
                public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                    return new C03791(this.this$0, continuation);
                }

                @Override // gim.a
                public final Object invokeSuspend(@NotNull Object obj2) {
                    fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    this.this$0.getBinding().btnStartScanning.setEnabled(true);
                    return Unit.f186387a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C03791) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03781(NfcScanFragment nfcScanFragment, Continuation<? super C03781> continuation) {
                super(2, continuation);
                this.this$0 = nfcScanFragment;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new C03781(this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    if (this.this$0.getNfcViewModel().canNFCScanStart()) {
                        this.this$0.startEnableReaderMode();
                    }
                    CoroutineDispatcher main = this.this$0.getDispatchersProvider$onfido_capture_sdk_core_release().getMain();
                    C03791 c03791 = new C03791(this.this$0, null);
                    this.label = 1;
                    if (e0.J(main, c03791, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (this.this$0.getNfcViewModel().shouldStartScanningAutomatically()) {
                    this.this$0.startScanning();
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03781) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public C21381(Continuation<? super C21381> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return NfcScanFragment.this.new C21381(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineDispatcher coroutineDispatcherMo3706getDefault = NfcScanFragment.this.getDispatchersProvider$onfido_capture_sdk_core_release().mo3706getDefault();
                C03781 c03781 = new C03781(NfcScanFragment.this, null);
                this.label = 1;
                if (e0.J(coroutineDispatcherMo3706getDefault, c03781, this) == aVar) {
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
            return ((C21381) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment$startEnableReaderMode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "tag", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcTagDelegate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21391 extends u implements Function1<NfcTagDelegate, Unit> {
        public C21391() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((NfcTagDelegate) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull NfcTagDelegate tag2) {
            Intrinsics.checkNotNullParameter(tag2, "tag");
            NfcScanFragment.this.getPresenter().onNfcTagDetected(tag2, NfcScanFragment.this.getNfcViewModel().getPin());
        }
    }

    public NfcScanFragment() {
        super(R.layout.onfido_fragment_nfc_scan);
        Lazy lazyC = j.c(k.NONE, new NfcScanFragment$special$$inlined$viewModels$default$1(new NfcScanFragment$nfcViewModel$2(this)));
        this.nfcViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcScanFragment$special$$inlined$viewModels$default$2(lazyC), new NfcScanFragment$special$$inlined$viewModels$default$3(null, lazyC), new NfcScanFragment$special$$inlined$viewModels$default$4(this, lazyC));
        this.presenter = j.b(new NfcScanFragment$presenter$2(this));
        this.nfcScanBottomDialog = j.b(new NfcScanFragment$nfcScanBottomDialog$2(this));
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishNFCScanning(NfcPassportExtraction nfcData, NfcFlowType nfcFlowType) {
        getNfcScanBottomDialog().dismissDialog();
        getNfcViewModel().onNfcScanSucceeded(nfcData, nfcFlowType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnfidoFragmentNfcScanBinding getBinding() {
        OnfidoFragmentNfcScanBinding onfidoFragmentNfcScanBinding = this._binding;
        Intrinsics.h(onfidoFragmentNfcScanBinding);
        return onfidoFragmentNfcScanBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NfcScanBottomDialog getNfcScanBottomDialog() {
        return (NfcScanBottomDialog) this.nfcScanBottomDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NfcHostViewModel getNfcViewModel() {
        return (NfcHostViewModel) this.nfcViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NfcScanPresenter getPresenter() {
        return (NfcScanPresenter) this.presenter.getValue();
    }

    private final void observeNfcScanState() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getPresenter().getScanState().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanFragment.observeNfcScanState.1
            @Override // igm.g
            public final void accept(@NotNull NfcScanState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                if (Intrinsics.f(state, ScanReady.INSTANCE)) {
                    NfcScanFragment.this.getNfcScanBottomDialog().showNfcScanReadyView();
                } else if (state instanceof Scanning) {
                    NfcScanFragment.this.onNfcScanning((Scanning) state);
                } else if (state instanceof Scanned) {
                    Scanned scanned = (Scanned) state;
                    NfcScanFragment.this.onNfcChipRead(scanned.getNfcFlowType(), scanned.getDuration());
                } else if (Intrinsics.f(state, ScanRetry.INSTANCE)) {
                    NfcScanFragment.this.onNfcScanRetry();
                } else if (Intrinsics.f(state, ScanningTimeout.INSTANCE)) {
                    NfcScanFragment.this.onNfcScanTimeout();
                } else if (state instanceof ScanFailed) {
                    NfcScanFragment.this.onNfcScanFailed(((ScanFailed) state).getMessage());
                } else if (state instanceof ScanCompleted) {
                    ScanCompleted scanCompleted = (ScanCompleted) state;
                    NfcScanFragment.this.finishNFCScanning(scanCompleted.getNfcData(), scanCompleted.getNfcFlowType());
                } else if (state instanceof ConnectionLost) {
                    NfcScanFragment.this.onNfcConnectionLost();
                } else if (state instanceof PinVerificationFailed) {
                    NfcScanFragment.this.getNfcViewModel().onPinVerificationFailed(((PinVerificationFailed) state).getAttemptsLeft());
                }
                if (Intrinsics.f(state, NotStarted.INSTANCE)) {
                    NfcScanFragment.this.getBinding().videoView.start();
                } else {
                    NfcScanFragment.this.getBinding().videoView.pause();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    private final void observeViewState() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Disposable disposableSubscribe = getPresenter().getViewState().subscribe(new C21361());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcChipRead(NfcFlowType nfcFlowType, long duration) {
        getNfcViewModel().onNfcChipRead(nfcFlowType, duration);
        getNfcScanBottomDialog().showNfcSuccessView();
        HapticFeedback hapticFeedback$onfido_capture_sdk_core_release = getHapticFeedback$onfido_capture_sdk_core_release();
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        hapticFeedback$onfido_capture_sdk_core_release.performSuccess(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcConnectionLost() {
        getNfcScanBottomDialog().showConnectionLost();
        HapticFeedback hapticFeedback$onfido_capture_sdk_core_release = getHapticFeedback$onfido_capture_sdk_core_release();
        LinearLayout root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        hapticFeedback$onfido_capture_sdk_core_release.performError(root);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcScanFailed(String reason) {
        getNfcViewModel().onNfcScanFailed(reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcScanRetry() {
        getNfcScanBottomDialog().showNfcScanRetry();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcScanTimeout() {
        getNfcScanBottomDialog().dismissDialog();
        onNfcScanFailed("timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNfcScanning(Scanning state) {
        getNfcScanBottomDialog().showNfcScanningView(state.getProgress());
        if (state.getConnectionReestablished()) {
            HapticFeedback hapticFeedback$onfido_capture_sdk_core_release = getHapticFeedback$onfido_capture_sdk_core_release();
            LinearLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            hapticFeedback$onfido_capture_sdk_core_release.performSuccess(root);
        }
    }

    private final void setInstructions() {
        LinearLayout stepsContainer = getBinding().stepsContainer;
        Intrinsics.checkNotNullExpressionValue(stepsContainer, "stepsContainer");
        ViewExtensionsKt.setInstructions(stepsContainer, getPresenter().getNfcInstructions());
    }

    private final void setPinDisclaimer() {
        TextView tvPinDisclaimer = getBinding().tvPinDisclaimer;
        Intrinsics.checkNotNullExpressionValue(tvPinDisclaimer, "tvPinDisclaimer");
        tvPinDisclaimer.setVisibility(getPresenter().getPinDisclaimer().length() > 0 ? 0 : 8);
        getBinding().tvPinDisclaimer.setText(getPresenter().getPinDisclaimer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startEnableReaderMode() {
        this.readerModeStarted = true;
        NfcInteractor nfcInteractor$onfido_capture_sdk_core_release = getNfcInteractor$onfido_capture_sdk_core_release();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        nfcInteractor$onfido_capture_sdk_core_release.enableReaderMode(fragmentActivityRequireActivity, new C21391());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startScanning() {
        if (!getNfcViewModel().canNFCScanStart()) {
            getNfcViewModel().resolveNFCArguments();
            return;
        }
        getPresenter().onNfcScanClicked();
        if (this.readerModeStarted) {
            return;
        }
        startEnableReaderMode();
    }

    @NotNull
    public final AnnouncementService getAnnouncementService$onfido_capture_sdk_core_release() {
        AnnouncementService announcementService = this.announcementService;
        if (announcementService != null) {
            return announcementService;
        }
        Intrinsics.r("announcementService");
        throw null;
    }

    @NotNull
    public final DispatchersProvider getDispatchersProvider$onfido_capture_sdk_core_release() {
        DispatchersProvider dispatchersProvider = this.dispatchersProvider;
        if (dispatchersProvider != null) {
            return dispatchersProvider;
        }
        Intrinsics.r("dispatchersProvider");
        throw null;
    }

    @NotNull
    public final HapticFeedback getHapticFeedback$onfido_capture_sdk_core_release() {
        HapticFeedback hapticFeedback = this.hapticFeedback;
        if (hapticFeedback != null) {
            return hapticFeedback;
        }
        Intrinsics.r("hapticFeedback");
        throw null;
    }

    @NotNull
    public final NfcInteractor getNfcInteractor$onfido_capture_sdk_core_release() {
        NfcInteractor nfcInteractor = this.nfcInteractor;
        if (nfcInteractor != null) {
            return nfcInteractor;
        }
        Intrinsics.r("nfcInteractor");
        throw null;
    }

    @NotNull
    public final NfcScanPresenter.Factory getPresenterFactory$onfido_capture_sdk_core_release() {
        NfcScanPresenter.Factory factory = this.presenterFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("presenterFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getBinding().videoView.release();
        this._binding = null;
    }

    @Override // com.onfido.android.sdk.capture.ui.nfc.scan.NfcScanBottomDialog.NfcScanBottomActions
    public void onNfcDialogDismissedByDialog() {
        getPresenter().nfcScanDialogDismissed();
        getNfcViewModel().onNfcScanFailed("UserCanceled");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new C21371(null), 3);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getBinding().btnStartScanning.setEnabled(false);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        e0.C(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new C21381(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getNfcViewModel().onNfcIntro();
        observeNfcScanState();
        observeViewState();
        PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = getBinding().videoView;
        playbackControlsVideoPlayerView.restartVideo();
        playbackControlsVideoPlayerView.resume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getBinding().videoView.pause();
        getNfcScanBottomDialog().dismissDialog();
        this.compositeDisposable.d();
        getPresenter().onClean();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentNfcScanBinding.bind(view);
        PlaybackControlsVideoPlayerView playbackControlsVideoPlayerView = getBinding().videoView;
        Intrinsics.h(playbackControlsVideoPlayerView);
        ViewExtensionsKt.toVisible$default(playbackControlsVideoPlayerView, false, 1, null);
        playbackControlsVideoPlayerView.setLoading(false);
        playbackControlsVideoPlayerView.setVideoUrl(getNfcViewModel().getInstructionVideoPath(true));
        setInstructions();
        setPinDisclaimer();
    }

    public final void setAnnouncementService$onfido_capture_sdk_core_release(@NotNull AnnouncementService announcementService) {
        Intrinsics.checkNotNullParameter(announcementService, "<set-?>");
        this.announcementService = announcementService;
    }

    public final void setDispatchersProvider$onfido_capture_sdk_core_release(@NotNull DispatchersProvider dispatchersProvider) {
        Intrinsics.checkNotNullParameter(dispatchersProvider, "<set-?>");
        this.dispatchersProvider = dispatchersProvider;
    }

    public final void setHapticFeedback$onfido_capture_sdk_core_release(@NotNull HapticFeedback hapticFeedback) {
        Intrinsics.checkNotNullParameter(hapticFeedback, "<set-?>");
        this.hapticFeedback = hapticFeedback;
    }

    public final void setNfcInteractor$onfido_capture_sdk_core_release(@NotNull NfcInteractor nfcInteractor) {
        Intrinsics.checkNotNullParameter(nfcInteractor, "<set-?>");
        this.nfcInteractor = nfcInteractor;
    }

    public final void setPresenterFactory$onfido_capture_sdk_core_release(@NotNull NfcScanPresenter.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.presenterFactory = factory;
    }
}
