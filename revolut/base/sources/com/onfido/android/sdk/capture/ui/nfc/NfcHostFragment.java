package com.onfido.android.sdk.capture.ui.nfc;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.core.config.FailureReason;
import com.onfido.android.sdk.capture.core.config.FlowFragment;
import com.onfido.android.sdk.capture.core.features.nfc.NfcFlow;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import yhm.j;
import yhm.k;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0017J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0015H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012¨\u0006+"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment;", "Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "()V", "navigationManager", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "getNavigationManager", "()Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "navigationManager$delegate", "Lkotlin/Lazy;", "nfcViewModelFactory", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$Factory;", "getNfcViewModelFactory$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$Factory;", "setNfcViewModelFactory$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$Factory;)V", "viewModel", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel;", "viewModel$delegate", "handleUIMessage", "", "uiMessage", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostViewModel$UIMessage;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "registerBackPressDispatcher", "submitResult", "nfcHostResult", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "Companion", "NfcHostResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcHostFragment extends FlowFragment {
    private static final int REQUEST_CODE_NFC_SETTINGS = 1;

    /* JADX INFO: renamed from: navigationManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationManager;
    public NfcHostViewModel.Factory nfcViewModelFactory;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private static final String KEY_ARG_IS_IN_WORKFLOW = "key_is_in_workflow";

    @NotNull
    public static final String KEY_ARG_REQUEST = "key_request";

    @NotNull
    public static final String KEY_ARG_NFC_PROPERTIES = "key_nfc_properties";

    @NotNull
    public static final String KEY_ARG_DOC_TYPE = "key_doc_type";

    @NotNull
    public static final String KEY_ARG_COUNTRY_CODE = "key_country_code";

    @NotNull
    public static final String KEY_IS_ONLY_ONE_DOC_AVAILABLE = "key_is_only_one_doc";

    @NotNull
    private static final String KEY_HOST_RESULT = "key_host_result";

    @NotNull
    public static final String KEY_NFC_OPTIONS = "key_nfc_options";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011JD\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$Companion;", "", "()V", "KEY_ARG_COUNTRY_CODE", "", "KEY_ARG_DOC_TYPE", "KEY_ARG_IS_IN_WORKFLOW", "KEY_ARG_NFC_PROPERTIES", "KEY_ARG_REQUEST", "KEY_HOST_RESULT", "KEY_IS_ONLY_ONE_DOC_AVAILABLE", "KEY_NFC_OPTIONS", "REQUEST_CODE_NFC_SETTINGS", "", "getNfcHostResult", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "bundle", "Landroid/os/Bundle;", "newInstance", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment;", "requestKey", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions$Enabled;", "isOnlyOneDocAvailable", "", "isInWorkflow", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final NfcHostResult getNfcHostResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_host_result");
            if (parcelable != null) {
                return (NfcHostResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @NotNull
        public final NfcHostFragment newInstance(@NotNull String requestKey, DocumentType documentType, CountryCode countryCode, @NotNull NfcProperties nfcProperties, @NotNull NFCOptions.Enabled nfcOptions, boolean isOnlyOneDocAvailable, boolean isInWorkflow) {
            Intrinsics.checkNotNullParameter(requestKey, "requestKey");
            Intrinsics.checkNotNullParameter(nfcProperties, "nfcProperties");
            Intrinsics.checkNotNullParameter(nfcOptions, "nfcOptions");
            NfcHostFragment nfcHostFragment = new NfcHostFragment();
            nfcHostFragment.setArguments(BundleKt.bundleOf(new Pair("key_nfc_properties", nfcProperties), new Pair("key_doc_type", documentType), new Pair("key_country_code", countryCode), new Pair("key_request", requestKey), new Pair("key_nfc_options", nfcOptions), new Pair("key_is_only_one_doc", Boolean.valueOf(isOnlyOneDocAvailable)), new Pair("key_is_in_workflow", Boolean.valueOf(isInWorkflow))));
            return nfcHostFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "Landroid/os/Parcelable;", "()V", "Exit", "ExitOnfidoFlow", "NfcScanSkipped", "NfcScanSuccess", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$ExitOnfidoFlow;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$NfcScanSkipped;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$NfcScanSuccess;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class NfcHostResult implements Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$Exit;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Exit extends NfcHostResult {

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
                super(null);
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

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$ExitOnfidoFlow;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ExitOnfidoFlow extends NfcHostResult {

            @NotNull
            public static final ExitOnfidoFlow INSTANCE = new ExitOnfidoFlow();

            @NotNull
            public static final Parcelable.Creator<ExitOnfidoFlow> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExitOnfidoFlow> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ExitOnfidoFlow createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ExitOnfidoFlow.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final ExitOnfidoFlow[] newArray(int i) {
                    return new ExitOnfidoFlow[i];
                }
            }

            private ExitOnfidoFlow() {
                super(null);
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

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$NfcScanSkipped;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class NfcScanSkipped extends NfcHostResult {

            @NotNull
            public static final NfcScanSkipped INSTANCE = new NfcScanSkipped();

            @NotNull
            public static final Parcelable.Creator<NfcScanSkipped> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NfcScanSkipped> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NfcScanSkipped createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NfcScanSkipped.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NfcScanSkipped[] newArray(int i) {
                    return new NfcScanSkipped[i];
                }
            }

            private NfcScanSkipped() {
                super(null);
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

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult$NfcScanSuccess;", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcHostFragment$NfcHostResult;", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "(Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;)V", "getNfcData", "()Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "getNfcFlowType", "()Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NfcScanSuccess extends NfcHostResult {

            @NotNull
            public static final Parcelable.Creator<NfcScanSuccess> CREATOR = new Creator();

            @NotNull
            private final NfcPassportExtraction nfcData;

            @NotNull
            private final NfcFlowType nfcFlowType;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<NfcScanSuccess> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NfcScanSuccess createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NfcScanSuccess(NfcPassportExtraction.CREATOR.createFromParcel(parcel), NfcFlowType.valueOf(parcel.readString()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final NfcScanSuccess[] newArray(int i) {
                    return new NfcScanSuccess[i];
                }
            }

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

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
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

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                this.nfcData.writeToParcel(parcel, flags);
                parcel.writeString(this.nfcFlowType.name());
            }
        }

        private NfcHostResult() {
        }

        public /* synthetic */ NfcHostResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NfcHostFragment() {
        super(R.layout.onfido_nfc_fragment_host);
        this.navigationManager = j.b(new NfcHostFragment$navigationManager$2(this));
        NfcHostFragment$viewModel$2 nfcHostFragment$viewModel$2 = new NfcHostFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new NfcHostFragment$special$$inlined$viewModels$default$2(new NfcHostFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(NfcHostViewModel.class), new NfcHostFragment$special$$inlined$viewModels$default$3(lazyC), new NfcHostFragment$special$$inlined$viewModels$default$4(null, lazyC), nfcHostFragment$viewModel$2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNavigationManager getNavigationManager() {
        return (FragmentNavigationManager) this.navigationManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NfcHostViewModel getViewModel() {
        return (NfcHostViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUIMessage(NfcHostViewModel.UIMessage uiMessage) {
        NfcHostResult nfcScanSuccess;
        if (Intrinsics.f(uiMessage, NfcHostViewModel.UIMessage.OpenNfcSettings.INSTANCE)) {
            startActivityForResult(new Intent("android.settings.NFC_SETTINGS"), 1);
        } else {
            if (Intrinsics.f(uiMessage, NfcHostViewModel.UIMessage.NfcScanSkipped.INSTANCE)) {
                nfcScanSuccess = NfcHostResult.NfcScanSkipped.INSTANCE;
            } else if (uiMessage instanceof NfcHostViewModel.UIMessage.NfcScanSuccess) {
                NfcHostViewModel.UIMessage.NfcScanSuccess nfcScanSuccess2 = (NfcHostViewModel.UIMessage.NfcScanSuccess) uiMessage;
                nfcScanSuccess = new NfcHostResult.NfcScanSuccess(nfcScanSuccess2.getNfcData(), nfcScanSuccess2.getNfcFlowType());
            } else if (Intrinsics.f(uiMessage, NfcHostViewModel.UIMessage.Exit.INSTANCE)) {
                nfcScanSuccess = NfcHostResult.Exit.INSTANCE;
            } else if (uiMessage instanceof NfcHostViewModel.UIMessage.OpenUrl) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((NfcHostViewModel.UIMessage.OpenUrl) uiMessage).getUrl())));
            } else {
                if (!Intrinsics.f(uiMessage, NfcHostViewModel.UIMessage.ExitOnfidoFlow.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                nfcScanSuccess = NfcHostResult.ExitOnfidoFlow.INSTANCE;
            }
            submitResult(nfcScanSuccess);
        }
        Unit unit = Unit.f186387a;
        getViewModel().consumeUIMessage(uiMessage);
    }

    private final void registerBackPressDispatcher() {
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment.registerBackPressDispatcher.1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public void handleOnBackPressed() {
                List<Screen> currentScreensSnapshot = NfcHostFragment.this.getNavigationManager().getCurrentScreensSnapshot();
                NfcHostFragment.this.getViewModel().onBackClicked((Screen) d0.o0(currentScreensSnapshot), currentScreensSnapshot.size());
            }
        });
    }

    private final void submitResult(NfcHostResult nfcHostResult) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("key_request") : null;
        if (string == null) {
            if (nfcHostResult instanceof NfcHostResult.NfcScanSuccess) {
                finishFlow(NfcFlow.Result.Success.INSTANCE);
                return;
            } else {
                finishFlow(new NfcFlow.Result.Failed(FailureReason.Canceled.INSTANCE));
                return;
            }
        }
        getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("key_host_result", nfcHostResult)));
        Bundle arguments2 = getArguments();
        if (arguments2 != null ? arguments2.getBoolean("key_is_in_workflow") : false) {
            return;
        }
        getParentFragmentManager().popBackStack();
    }

    @NotNull
    public final NfcHostViewModel.Factory getNfcViewModelFactory$onfido_capture_sdk_core_release() {
        NfcHostViewModel.Factory factory = this.nfcViewModelFactory;
        if (factory != null) {
            return factory;
        }
        Intrinsics.r("nfcViewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @d
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            getViewModel().onNfcSettingsActivityResult();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getViewModel().getNavigationManagerHolder().setNavigationManager(getNavigationManager());
        Disposable disposableSubscribe = getViewModel().getUiMessages().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.nfc.NfcHostFragment.onStart.1
            @Override // igm.g
            public final void accept(@NotNull List<? extends NfcHostViewModel.UIMessage> messages) {
                Intrinsics.checkNotNullParameter(messages, "messages");
                NfcHostFragment nfcHostFragment = NfcHostFragment.this;
                Iterator<T> it8 = messages.iterator();
                while (it8.hasNext()) {
                    nfcHostFragment.handleUIMessage((NfcHostViewModel.UIMessage) it8.next());
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getViewModel().getNavigationManagerHolder().resetNavigationManager();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).inject$onfido_capture_sdk_core_release(this);
        registerBackPressDispatcher();
    }

    public final void setNfcViewModelFactory$onfido_capture_sdk_core_release(@NotNull NfcHostViewModel.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<set-?>");
        this.nfcViewModelFactory = factory;
    }
}
