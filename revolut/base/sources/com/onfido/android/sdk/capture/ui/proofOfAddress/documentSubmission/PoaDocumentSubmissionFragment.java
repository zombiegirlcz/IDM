package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import ch.qos.logback.core.CoreConstants;
import cmc.d;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.databinding.OnfidoActivityOnfidoBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoFragmentPoaDocumentSubmissionBinding;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils;
import com.onfido.android.sdk.capture.ui.proofOfAddress.PoaZoomClass;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel;
import com.onfido.android.sdk.capture.ui.widget.ShadowedScrollView;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.javax.inject.Provider;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.File;
import java.io.FileNotFoundException;
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
import org.jmrtd.cbeff.ISO781611;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020+H\u0016J\b\u00102\u001a\u00020+H\u0016J\u001a\u00103\u001a\u00020+2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0017\u0010=\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\b>J\b\u0010?\u001a\u00020+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010'¨\u0006B"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "_binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentPoaDocumentSubmissionBinding;", "binding", "getBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoFragmentPoaDocumentSubmissionBinding;", "imageUtils", "Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "getImageUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/ImageUtils;", "setImageUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/ImageUtils;)V", "intentResultObserver", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "isTakePhoto", "", "lifecycleAwareDialog", "Lcom/onfido/android/sdk/capture/utils/LifecycleAwareDialog;", "poaUtils", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "getPoaUtils$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;", "setPoaUtils$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/proofOfAddress/PoaUtils;)V", "poaViewModelFactory", "Lcom/onfido/javax/inject/Provider;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel;", "getPoaViewModelFactory", "()Lcom/onfido/javax/inject/Provider;", "setPoaViewModelFactory", "(Lcom/onfido/javax/inject/Provider;)V", "selectedImageBitmap", "Landroid/graphics/Bitmap;", "viewModel", "getViewModel", "()Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getImageBitmap", "", "documentFileName", "", "handleViewState", "viewState", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "onDestroyView", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "renderFromMediaUpload", "uri", "Landroid/net/Uri;", "renderLargeImage", "renderSmallImage", "renderSmallImageAfterRetakePhoto", "renderSmallImageAfterRetakePhoto$onfido_capture_sdk_core_release", "showInvalidFileDialog", "Companion", "PoaSubmissionResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaDocumentSubmissionFragment extends BaseFragment {
    private OnfidoFragmentPoaDocumentSubmissionBinding _binding;
    public ImageUtils imageUtils;

    @NotNull
    private final ActivityResultLauncher<Intent> intentResultObserver;
    private boolean isTakePhoto;

    @NotNull
    private final LifecycleAwareDialog lifecycleAwareDialog;
    public PoaUtils poaUtils;
    public Provider poaViewModelFactory;
    private Bitmap selectedImageBitmap;

    /* JADX INFO: renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @NotNull
    private static final String DOCUMENT_FILE_NAME = "document_file_name";

    @NotNull
    private static final String KEY_RESULT = "key_result";

    @NotNull
    private static final String IS_TAKE_PHOTO = "is_take_photo";

    @NotNull
    private static final String DOCUMENT_URI = "document_uri";

    @NotNull
    private static final String DOCUMENT_TYPE = "document_type";

    @NotNull
    private static final String DOCUMENT_COUNTRY = "document_country";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$Companion;", "", "()V", "DOCUMENT_COUNTRY", "", "DOCUMENT_FILE_NAME", "DOCUMENT_TYPE", "DOCUMENT_URI", "IS_TAKE_PHOTO", "KEY_RESULT", "createInstance", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment;", "resultKey", "isTakePhoto", "", "documentUri", "Landroid/net/Uri;", "documentFileName", "documentCountry", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentType", "Lcom/onfido/api/client/data/PoaDocumentType;", "getResult", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult;", "bundle", "Landroid/os/Bundle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PoaDocumentSubmissionFragment createInstance(@NotNull String resultKey, boolean isTakePhoto, Uri documentUri, String documentFileName, @NotNull CountryCode documentCountry, @NotNull PoaDocumentType documentType) {
            Intrinsics.checkNotNullParameter(resultKey, "resultKey");
            Intrinsics.checkNotNullParameter(documentCountry, "documentCountry");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            PoaDocumentSubmissionFragment poaDocumentSubmissionFragment = new PoaDocumentSubmissionFragment();
            poaDocumentSubmissionFragment.setArguments(BundleKt.bundleOf(new Pair("key_result", resultKey), new Pair("is_take_photo", Boolean.valueOf(isTakePhoto)), new Pair("document_uri", String.valueOf(documentUri)), new Pair("document_file_name", documentFileName), new Pair("document_country", documentCountry), new Pair("document_type", documentType)));
            return poaDocumentSubmissionFragment;
        }

        @NotNull
        public final PoaSubmissionResult getResult(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Parcelable parcelable = bundle.getParcelable("key_result");
            if (parcelable != null) {
                return (PoaSubmissionResult) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult;", "Landroid/os/Parcelable;", "()V", "RepeatPhotoCapture", "SuccessfulDocumentInfo", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult$RepeatPhotoCapture;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult$SuccessfulDocumentInfo;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class PoaSubmissionResult implements Parcelable {

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult$RepeatPhotoCapture;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class RepeatPhotoCapture extends PoaSubmissionResult {

            @NotNull
            public static final RepeatPhotoCapture INSTANCE = new RepeatPhotoCapture();

            @NotNull
            public static final Parcelable.Creator<RepeatPhotoCapture> CREATOR = new Creator();

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RepeatPhotoCapture> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RepeatPhotoCapture createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RepeatPhotoCapture.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final RepeatPhotoCapture[] newArray(int i) {
                    return new RepeatPhotoCapture[i];
                }
            }

            private RepeatPhotoCapture() {
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult$SuccessfulDocumentInfo;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionFragment$PoaSubmissionResult;", "documentId", "", "type", "issuingCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "getIssuingCountry", "getType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SuccessfulDocumentInfo extends PoaSubmissionResult {

            @NotNull
            public static final Parcelable.Creator<SuccessfulDocumentInfo> CREATOR = new Creator();

            @NotNull
            private final String documentId;
            private final String issuingCountry;

            @NotNull
            private final String type;

            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SuccessfulDocumentInfo> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SuccessfulDocumentInfo createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SuccessfulDocumentInfo(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @NotNull
                public final SuccessfulDocumentInfo[] newArray(int i) {
                    return new SuccessfulDocumentInfo[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessfulDocumentInfo(@NotNull String documentId, @NotNull String type, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(type, "type");
                this.documentId = documentId;
                this.type = type;
                this.issuingCountry = str;
            }

            public static /* synthetic */ SuccessfulDocumentInfo copy$default(SuccessfulDocumentInfo successfulDocumentInfo, String str, String str2, String str3, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = successfulDocumentInfo.documentId;
                }
                if ((i & 2) != 0) {
                    str2 = successfulDocumentInfo.type;
                }
                if ((i & 4) != 0) {
                    str3 = successfulDocumentInfo.issuingCountry;
                }
                return successfulDocumentInfo.copy(str, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            @NotNull
            public final SuccessfulDocumentInfo copy(@NotNull String documentId, @NotNull String type, String issuingCountry) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(type, "type");
                return new SuccessfulDocumentInfo(documentId, type, issuingCountry);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessfulDocumentInfo)) {
                    return false;
                }
                SuccessfulDocumentInfo successfulDocumentInfo = (SuccessfulDocumentInfo) other;
                return Intrinsics.f(this.documentId, successfulDocumentInfo.documentId) && Intrinsics.f(this.type, successfulDocumentInfo.type) && Intrinsics.f(this.issuingCountry, successfulDocumentInfo.issuingCountry);
            }

            @NotNull
            public final String getDocumentId() {
                return this.documentId;
            }

            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int iC = p.a.c(this.documentId.hashCode() * 31, 31, this.type);
                String str = this.issuingCountry;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                StringBuilder sb6 = new StringBuilder("SuccessfulDocumentInfo(documentId=");
                sb6.append(this.documentId);
                sb6.append(", type=");
                sb6.append(this.type);
                sb6.append(", issuingCountry=");
                return j6.a.u(sb6, this.issuingCountry, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.documentId);
                parcel.writeString(this.type);
                parcel.writeString(this.issuingCountry);
            }
        }

        private PoaSubmissionResult() {
        }

        public /* synthetic */ PoaSubmissionResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment$showInvalidFileDialog$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C21451 extends u implements Function1<DialogInterface, Unit> {
        public static final C21451 INSTANCE = new C21451();

        public C21451() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((DialogInterface) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull DialogInterface dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            dialog.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoaDocumentSubmissionFragment() {
        super(R.layout.onfido_fragment_poa_document_submission);
        this.lifecycleAwareDialog = new LifecycleAwareDialog((Fragment) this, (Function1) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        PoaDocumentSubmissionFragment$viewModel$2 poaDocumentSubmissionFragment$viewModel$2 = new PoaDocumentSubmissionFragment$viewModel$2(this);
        Lazy lazyC = j.c(k.NONE, new PoaDocumentSubmissionFragment$special$$inlined$viewModels$default$2(new PoaDocumentSubmissionFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, o0.f186429a.b(PoaDocumentSubmissionViewModel.class), new PoaDocumentSubmissionFragment$special$$inlined$viewModels$default$3(lazyC), new PoaDocumentSubmissionFragment$special$$inlined$viewModels$default$4(null, lazyC), poaDocumentSubmissionFragment$viewModel$2);
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new d(this, 29));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.intentResultObserver = activityResultLauncherRegisterForActivityResult;
    }

    @NotNull
    public static final PoaDocumentSubmissionFragment createInstance(@NotNull String str, boolean z, Uri uri2, String str2, @NotNull CountryCode countryCode, @NotNull PoaDocumentType poaDocumentType) {
        return INSTANCE.createInstance(str, z, uri2, str2, countryCode, poaDocumentType);
    }

    private final OnfidoFragmentPoaDocumentSubmissionBinding getBinding() {
        OnfidoFragmentPoaDocumentSubmissionBinding onfidoFragmentPoaDocumentSubmissionBinding = this._binding;
        Intrinsics.h(onfidoFragmentPoaDocumentSubmissionBinding);
        return onfidoFragmentPoaDocumentSubmissionBinding;
    }

    private final void getImageBitmap(String documentFileName) {
        File file = new File(documentFileName);
        if (file.exists()) {
            getViewModel().getImageBitmapFromFileByteArray(file);
        }
    }

    private final PoaDocumentSubmissionViewModel getViewModel() {
        return (PoaDocumentSubmissionViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleViewState(PoaDocumentSubmissionViewModel.ViewState viewState) {
        String string;
        if (Intrinsics.f(viewState, PoaDocumentSubmissionViewModel.ViewState.Error.INSTANCE)) {
            LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, (Integer) null, R.string.onfido_generic_error_network_detail, 0, (Integer) null, false, (Function1) null, (Function1) null, ISO781611.SMT_TAG, (Object) null);
            return;
        }
        if (Intrinsics.f(viewState, PoaDocumentSubmissionViewModel.ViewState.ShowLoading.INSTANCE)) {
            showLoadingDialog$onfido_capture_sdk_core_release(new LoadingFragment.Companion.DialogMode.Uploading("POA_DOCUMENT_UPLOAD"));
            return;
        }
        if (Intrinsics.f(viewState, PoaDocumentSubmissionViewModel.ViewState.HideLoading.INSTANCE)) {
            dismissLoadingDialog$onfido_capture_sdk_core_release();
            return;
        }
        if (viewState instanceof PoaDocumentSubmissionViewModel.ViewState.UploadCompleted) {
            PoaDocumentSubmissionViewModel.ViewState.UploadCompleted uploadCompleted = (PoaDocumentSubmissionViewModel.ViewState.UploadCompleted) viewState;
            if (uploadCompleted.getDocumentId() == null || (string = requireArguments().getString("key_result")) == null) {
                return;
            }
            FragmentManager parentFragmentManager = getParentFragmentManager();
            String documentId = uploadCompleted.getDocumentId();
            String type = uploadCompleted.getType();
            if (type == null) {
                type = "";
            }
            parentFragmentManager.setFragmentResult(string, BundleKt.bundleOf(new Pair("key_result", new PoaSubmissionResult.SuccessfulDocumentInfo(documentId, type, uploadCompleted.getIssuingCountry()))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intentResultObserver$lambda$2(PoaDocumentSubmissionFragment this$0, ActivityResult activityResult) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent data = activityResult.getData();
        if (data != null) {
            if (!this$0.isTakePhoto) {
                Uri data2 = data.getData();
                Intrinsics.i(data2, "null cannot be cast to non-null type android.net.Uri");
                this$0.renderFromMediaUpload(data2);
            } else {
                String stringExtra = data.getStringExtra("poa_captured_file_name");
                if (stringExtra != null) {
                    this$0.getImageBitmap(stringExtra);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$11(PoaDocumentSubmissionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isTakePhoto) {
            String string = this$0.requireArguments().getString("key_result");
            if (string != null) {
                this$0.getParentFragmentManager().setFragmentResult(string, BundleKt.bundleOf(new Pair("key_result", PoaSubmissionResult.RepeatPhotoCapture.INSTANCE)));
                return;
            }
            return;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this$0.intentResultObserver;
        ImageUtils imageUtils$onfido_capture_sdk_core_release = this$0.getImageUtils$onfido_capture_sdk_core_release();
        String string2 = this$0.getString(R.string.onfido_poa_select_document_details_upload_text);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        activityResultLauncher.launch(imageUtils$onfido_capture_sdk_core_release.getUploadMediaPickerIntent$onfido_capture_sdk_core_release(string2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$12(PoaDocumentSubmissionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PoaDocumentSubmissionViewModel viewModel = this$0.getViewModel();
        Bitmap bitmap = this$0.selectedImageBitmap;
        if (bitmap != null) {
            viewModel.uploadPoaDocument(bitmap);
        } else {
            Intrinsics.r("selectedImageBitmap");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(PoaDocumentSubmissionFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.renderLargeImage(this$0.getBinding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(PoaDocumentSubmissionFragment this$0, View view) {
        OnfidoActivityOnfidoBinding binding$onfido_capture_sdk_core_release;
        Toolbar toolbar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Group poaImageLargeGroup = this$0.getBinding().poaImageLargeGroup;
        Intrinsics.checkNotNullExpressionValue(poaImageLargeGroup, "poaImageLargeGroup");
        ViewExtensionsKt.toGone$default(poaImageLargeGroup, false, 1, null);
        FragmentActivity activity = this$0.getActivity();
        OnfidoActivity onfidoActivity = activity instanceof OnfidoActivity ? (OnfidoActivity) activity : null;
        if (onfidoActivity != null && (binding$onfido_capture_sdk_core_release = onfidoActivity.getBinding$onfido_capture_sdk_core_release()) != null && (toolbar = binding$onfido_capture_sdk_core_release.toolbar) != null) {
            ViewExtensionsKt.toVisible$default(toolbar, false, 1, null);
        }
        new WindowInsetsControllerCompat(this$0.requireActivity().getWindow(), this$0.getBinding().getRoot()).show(WindowInsetsCompat.Type.systemBars());
        ShadowedScrollView poaImageSmallGroup = this$0.getBinding().poaImageSmallGroup;
        Intrinsics.checkNotNullExpressionValue(poaImageSmallGroup, "poaImageSmallGroup");
        ViewExtensionsKt.toVisible$default(poaImageSmallGroup, false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void renderFromMediaUpload(android.net.Uri r4) throws java.io.FileNotFoundException {
        /*
            r3 = this;
            com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils r0 = r3.getPoaUtils$onfido_capture_sdk_core_release()
            android.content.Context r1 = r3.getContext()
            r2 = 0
            if (r1 == 0) goto L10
            android.content.ContentResolver r1 = r1.getContentResolver()
            goto L11
        L10:
            r1 = r2
        L11:
            boolean r0 = r0.isPdfFile(r1, r4)
            if (r0 == 0) goto L51
            com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils r0 = r3.getPoaUtils$onfido_capture_sdk_core_release()
            android.content.Context r1 = r3.getContext()
            if (r1 == 0) goto L25
            android.content.ContentResolver r2 = r1.getContentResolver()
        L25:
            boolean r0 = r0.isPdfFileValid(r2, r4)
            if (r0 == 0) goto L60
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L50
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 == 0) goto L50
            android.content.res.Resources r1 = r3.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.densityDpi
            com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel r2 = r3.getViewModel()
            android.graphics.Bitmap r4 = r2.loadBitmapFromPdfUri(r4, r0, r1)
        L49:
            r3.selectedImageBitmap = r4
            boolean r4 = r3.isTakePhoto
            r3.renderSmallImage(r4)
        L50:
            return
        L51:
            com.onfido.android.sdk.capture.ui.proofOfAddress.PoaUtils r0 = r3.getPoaUtils$onfido_capture_sdk_core_release()
            android.content.Context r1 = r3.getContext()
            android.graphics.Bitmap r4 = r0.getBitmapFromUri(r1, r4)
            if (r4 == 0) goto L60
            goto L49
        L60:
            r3.showInvalidFileDialog()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment.renderFromMediaUpload(android.net.Uri):void");
    }

    private final void renderLargeImage(OnfidoFragmentPoaDocumentSubmissionBinding binding) {
        OnfidoActivityOnfidoBinding binding$onfido_capture_sdk_core_release;
        Toolbar toolbar;
        ShadowedScrollView poaImageSmallGroup = binding.poaImageSmallGroup;
        Intrinsics.checkNotNullExpressionValue(poaImageSmallGroup, "poaImageSmallGroup");
        ViewExtensionsKt.toGone$default(poaImageSmallGroup, false, 1, null);
        FragmentActivity activity = getActivity();
        OnfidoActivity onfidoActivity = activity instanceof OnfidoActivity ? (OnfidoActivity) activity : null;
        if (onfidoActivity != null && (binding$onfido_capture_sdk_core_release = onfidoActivity.getBinding$onfido_capture_sdk_core_release()) != null && (toolbar = binding$onfido_capture_sdk_core_release.toolbar) != null) {
            ViewExtensionsKt.toGone$default(toolbar, false, 1, null);
        }
        Window window = requireActivity().getWindow();
        window.getStatusBarColor();
        WindowCompat.setDecorFitsSystemWindows(window, true);
        window.addFlags(Integer.MIN_VALUE);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, binding.getRoot());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        Group poaImageLargeGroup = binding.poaImageLargeGroup;
        Intrinsics.checkNotNullExpressionValue(poaImageLargeGroup, "poaImageLargeGroup");
        ViewExtensionsKt.toVisible$default(poaImageLargeGroup, false, 1, null);
        binding.poaDocumentImageLarge.invalidate();
        PoaZoomClass poaZoomClass = binding.poaDocumentImageLarge;
        Bitmap bitmap = this.selectedImageBitmap;
        if (bitmap == null) {
            Intrinsics.r("selectedImageBitmap");
            throw null;
        }
        poaZoomClass.setImageBitmap(bitmap);
        binding.poaDocumentImageLarge.fitToScreen$onfido_capture_sdk_core_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderSmallImage(boolean isTakePhoto) {
        ImageView imageView = getBinding().poaDocumentImage;
        Bitmap bitmap = this.selectedImageBitmap;
        if (bitmap == null) {
            Intrinsics.r("selectedImageBitmap");
            throw null;
        }
        imageView.setImageBitmap(bitmap);
        getBinding().poaDocumentImage.setAdjustViewBounds(true);
        getBinding().poaDocumentImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        getBinding().poaRepeatButton.setText$onfido_capture_sdk_core_release(getViewModel().getTitleResId(isTakePhoto));
    }

    private final void showInvalidFileDialog() {
        LifecycleAwareDialog.show$default(this.lifecycleAwareDialog, Integer.valueOf(R.string.onfido_poa_err_invalid_file_title), R.string.onfido_poa_err_invalid_file_message, R.string.onfido_poa_err_invalid_file_ok, (Integer) null, false, (Function1) null, (Function1) C21451.INSTANCE, 56, (Object) null);
    }

    @NotNull
    public final ImageUtils getImageUtils$onfido_capture_sdk_core_release() {
        ImageUtils imageUtils = this.imageUtils;
        if (imageUtils != null) {
            return imageUtils;
        }
        Intrinsics.r("imageUtils");
        throw null;
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
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
        Bitmap bitmap = this.selectedImageBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Disposable disposableSubscribe = getViewModel().getViewState$onfido_capture_sdk_core_release().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment.onStart.1
            @Override // igm.g
            public final void accept(@NotNull PoaDocumentSubmissionViewModel.ViewState viewState) {
                Intrinsics.checkNotNullParameter(viewState, "viewState");
                PoaDocumentSubmissionFragment.this.handleViewState(viewState);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe, viewLifecycleOwner);
        Disposable disposableSubscribe2 = getViewModel().getImageReadResult().subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment.onStart.2
            @Override // igm.g
            public final void accept(@NotNull Bitmap it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaDocumentSubmissionFragment.this.selectedImageBitmap = it8;
                PoaDocumentSubmissionFragment poaDocumentSubmissionFragment = PoaDocumentSubmissionFragment.this;
                poaDocumentSubmissionFragment.renderSmallImage(poaDocumentSubmissionFragment.isTakePhoto);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleDisposableKt.disposeOnStop(disposableSubscribe2, viewLifecycleOwner2);
        getViewModel().trackPoaDocumentSubmission();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        SdkController companion = SdkController.INSTANCE.getInstance();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null).poaComponentFactory$onfido_capture_sdk_core_release().create().inject(this);
        super.onViewCreated(view, savedInstanceState);
        this._binding = OnfidoFragmentPoaDocumentSubmissionBinding.bind(view);
        PoaDocumentSubmissionViewModel viewModel = getViewModel();
        Object obj2 = requireArguments().get("document_country");
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.onfido.android.sdk.capture.utils.CountryCode");
        PoaDocumentSubmissionViewModel.setPoaData$onfido_capture_sdk_core_release$default(viewModel, (CountryCode) obj2, null, 2, null);
        PoaDocumentSubmissionViewModel viewModel2 = getViewModel();
        Object obj3 = requireArguments().get("document_type");
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.onfido.api.client.data.PoaDocumentType");
        PoaDocumentSubmissionViewModel.setPoaData$onfido_capture_sdk_core_release$default(viewModel2, null, (PoaDocumentType) obj3, 1, null);
        boolean z = requireArguments().getBoolean("is_take_photo");
        this.isTakePhoto = z;
        if (z) {
            String string = requireArguments().getString("document_file_name");
            if (string != null) {
                getImageBitmap(string);
            }
        } else {
            renderFromMediaUpload(getPoaUtils$onfido_capture_sdk_core_release().getDocumentUri(requireArguments().getString("document_uri")));
        }
        final int i = 0;
        getBinding().poaEnlargeButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentSubmissionFragment f50086b;

            {
                this.f50086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$7(this.f50086b, view2);
                        break;
                    case 1:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$9(this.f50086b, view2);
                        break;
                    case 2:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$11(this.f50086b, view2);
                        break;
                    default:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$12(this.f50086b, view2);
                        break;
                }
            }
        });
        final int i2 = 1;
        getBinding().poaCloseButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentSubmissionFragment f50086b;

            {
                this.f50086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$7(this.f50086b, view2);
                        break;
                    case 1:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$9(this.f50086b, view2);
                        break;
                    case 2:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$11(this.f50086b, view2);
                        break;
                    default:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$12(this.f50086b, view2);
                        break;
                }
            }
        });
        final int i3 = 2;
        getBinding().poaRepeatButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentSubmissionFragment f50086b;

            {
                this.f50086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i3) {
                    case 0:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$7(this.f50086b, view2);
                        break;
                    case 1:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$9(this.f50086b, view2);
                        break;
                    case 2:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$11(this.f50086b, view2);
                        break;
                    default:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$12(this.f50086b, view2);
                        break;
                }
            }
        });
        final int i5 = 3;
        getBinding().poaSubmitDocumentButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PoaDocumentSubmissionFragment f50086b;

            {
                this.f50086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i5) {
                    case 0:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$7(this.f50086b, view2);
                        break;
                    case 1:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$9(this.f50086b, view2);
                        break;
                    case 2:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$11(this.f50086b, view2);
                        break;
                    default:
                        PoaDocumentSubmissionFragment.onViewCreated$lambda$12(this.f50086b, view2);
                        break;
                }
            }
        });
    }

    public final void renderSmallImageAfterRetakePhoto$onfido_capture_sdk_core_release(String documentFileName) {
        if (documentFileName != null) {
            getImageBitmap(documentFileName);
        }
    }

    public final void setImageUtils$onfido_capture_sdk_core_release(@NotNull ImageUtils imageUtils) {
        Intrinsics.checkNotNullParameter(imageUtils, "<set-?>");
        this.imageUtils = imageUtils;
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
