package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.data.PoaDocumentType;
import com.onfido.api.client.data.PoaDocumentUpload;
import igm.g;
import igm.o;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.d;
import tgm.e;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 X2\u00020\u0001:\u0002XYB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0018\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J%\u0010'\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b%\u0010&J%\u0010-\u001a\u00020#2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020#¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010K\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010J0J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010N\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010#0#0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010Q\u001a\b\u0012\u0004\u0012\u00020#0P8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR!\u0010W\u001a\b\u0012\u0004\u0012\u00020J0P8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bV\u0010T¨\u0006Z"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "screenTracker", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/CompressPoaDocumentUseCase;", "compressPoaDocumentUseCase", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/UploadPoaDocumentUseCase;", "uploadPoaDocumentUseCase", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "waitingScreenTracker", "<init>", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/CompressPoaDocumentUseCase;Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/UploadPoaDocumentUseCase;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;)V", "", "onCleared", "()V", "trackPoaDocumentSubmission", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "countryCode", "Lcom/onfido/api/client/data/PoaDocumentType;", "documentType", "setPoaData$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/PoaDocumentType;)V", "setPoaData", "", "isTakePhoto", "", "getTitleResId", "(Z)I", "Ljava/io/File;", "file", "getImageBitmapFromFileByteArray", "(Ljava/io/File;)V", "Lio/reactivex/rxjava3/core/Single;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "getImageFromFileAsBitmap$onfido_capture_sdk_core_release", "(Ljava/io/File;)Lio/reactivex/rxjava3/core/Single;", "getImageFromFileAsBitmap", "Landroid/net/Uri;", "uri", "Landroid/content/ContentResolver;", "contentResolver", "densityDpi", "loadBitmapFromPdfUri", "(Landroid/net/Uri;Landroid/content/ContentResolver;I)Landroid/graphics/Bitmap;", "bitmap", "uploadPoaDocument", "(Landroid/graphics/Bitmap;)V", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/ScreenTracker;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/CompressPoaDocumentUseCase;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/UploadPoaDocumentUseCase;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "getCompositeDisposable", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "poaDocumentType", "Lcom/onfido/api/client/data/PoaDocumentType;", "getPoaDocumentType$onfido_capture_sdk_core_release", "()Lcom/onfido/api/client/data/PoaDocumentType;", "setPoaDocumentType$onfido_capture_sdk_core_release", "(Lcom/onfido/api/client/data/PoaDocumentType;)V", "issuingCountryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "getIssuingCountryCode$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/utils/CountryCode;", "setIssuingCountryCode$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/utils/CountryCode;)V", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "uploadResultSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "imageReadSubject", "Lio/reactivex/rxjava3/subjects/PublishSubject;", "Lio/reactivex/rxjava3/core/Observable;", "imageReadResult", "Lio/reactivex/rxjava3/core/Observable;", "getImageReadResult$onfido_capture_sdk_core_release", "()Lio/reactivex/rxjava3/core/Observable;", "viewState$delegate", "getViewState$onfido_capture_sdk_core_release", "viewState", "Companion", "ViewState", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PoaDocumentSubmissionViewModel extends ViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int PDF_DEFAULT_RESOLUTION_DPI = 72;

    /* JADX INFO: renamed from: compositeDisposable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeDisposable;

    @NotNull
    private final CompressPoaDocumentUseCase compressPoaDocumentUseCase;

    @NotNull
    private final Observable imageReadResult;

    @NotNull
    private final PublishSubject imageReadSubject;
    private CountryCode issuingCountryCode;
    private PoaDocumentType poaDocumentType;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final ScreenTracker screenTracker;

    @NotNull
    private final UploadPoaDocumentUseCase uploadPoaDocumentUseCase;

    @NotNull
    private final BehaviorSubject uploadResultSubject;

    /* JADX INFO: renamed from: viewState$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewState;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$Companion;", "", "()V", "PDF_DEFAULT_RESOLUTION_DPI", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "", "()V", "Error", "HideLoading", "ShowLoading", "UploadCompleted", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$Error;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$HideLoading;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$ShowLoading;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$UploadCompleted;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ViewState {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$Error;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Error extends ViewState {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$HideLoading;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class HideLoading extends ViewState {

            @NotNull
            public static final HideLoading INSTANCE = new HideLoading();

            private HideLoading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$ShowLoading;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ShowLoading extends ViewState {

            @NotNull
            public static final ShowLoading INSTANCE = new ShowLoading();

            private ShowLoading() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState$UploadCompleted;", "Lcom/onfido/android/sdk/capture/ui/proofOfAddress/documentSubmission/PoaDocumentSubmissionViewModel$ViewState;", "documentId", "", "type", "issuingCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentId", "()Ljava/lang/String;", "getIssuingCountry", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UploadCompleted extends ViewState {
            private final String documentId;
            private final String issuingCountry;
            private final String type;

            public UploadCompleted() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ UploadCompleted copy$default(UploadCompleted uploadCompleted, String str, String str2, String str3, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = uploadCompleted.documentId;
                }
                if ((i & 2) != 0) {
                    str2 = uploadCompleted.type;
                }
                if ((i & 4) != 0) {
                    str3 = uploadCompleted.issuingCountry;
                }
                return uploadCompleted.copy(str, str2, str3);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            @NotNull
            public final UploadCompleted copy(String documentId, String type, String issuingCountry) {
                return new UploadCompleted(documentId, type, issuingCountry);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadCompleted)) {
                    return false;
                }
                UploadCompleted uploadCompleted = (UploadCompleted) other;
                return Intrinsics.f(this.documentId, uploadCompleted.documentId) && Intrinsics.f(this.type, uploadCompleted.type) && Intrinsics.f(this.issuingCountry, uploadCompleted.issuingCountry);
            }

            public final String getDocumentId() {
                return this.documentId;
            }

            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.documentId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.type;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.issuingCountry;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StringBuilder sb6 = new StringBuilder("UploadCompleted(documentId=");
                sb6.append(this.documentId);
                sb6.append(", type=");
                sb6.append(this.type);
                sb6.append(", issuingCountry=");
                return j6.a.u(sb6, this.issuingCountry, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }

            public UploadCompleted(String str, String str2, String str3) {
                super(null);
                this.documentId = str;
                this.type = str2;
                this.issuingCountry = str3;
            }

            public /* synthetic */ UploadCompleted(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        private ViewState() {
        }

        public /* synthetic */ ViewState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PoaDocumentSubmissionViewModel(@NotNull ScreenTracker screenTracker, @NotNull SchedulersProvider schedulersProvider, @NotNull CompressPoaDocumentUseCase compressPoaDocumentUseCase, @NotNull UploadPoaDocumentUseCase uploadPoaDocumentUseCase, @NotNull WaitingScreenTracker waitingScreenTracker) {
        Intrinsics.checkNotNullParameter(screenTracker, "screenTracker");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(compressPoaDocumentUseCase, "compressPoaDocumentUseCase");
        Intrinsics.checkNotNullParameter(uploadPoaDocumentUseCase, "uploadPoaDocumentUseCase");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        this.screenTracker = screenTracker;
        this.schedulersProvider = schedulersProvider;
        this.compressPoaDocumentUseCase = compressPoaDocumentUseCase;
        this.uploadPoaDocumentUseCase = uploadPoaDocumentUseCase;
        this.waitingScreenTracker = waitingScreenTracker;
        this.compositeDisposable = j.b(PoaDocumentSubmissionViewModel$compositeDisposable$2.INSTANCE);
        BehaviorSubject behaviorSubjectC = BehaviorSubject.c();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectC, "create(...)");
        this.uploadResultSubject = behaviorSubjectC;
        PublishSubject publishSubjectN = ch.qos.logback.core.util.a.n("create(...)");
        this.imageReadSubject = publishSubjectN;
        Observable observableHide = publishSubjectN.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.imageReadResult = observableHide;
        this.viewState = j.b(new PoaDocumentSubmissionViewModel$viewState$2(this));
    }

    private final CompositeDisposable getCompositeDisposable() {
        return (CompositeDisposable) this.compositeDisposable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap getImageFromFileAsBitmap$lambda$2(File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "$file");
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        new DataInputStream(new BufferedInputStream(new FileInputStream(file))).readFully(bArr);
        file.delete();
        return BitmapFactory.decodeByteArray(bArr, 0, length);
    }

    public static /* synthetic */ void setPoaData$onfido_capture_sdk_core_release$default(PoaDocumentSubmissionViewModel poaDocumentSubmissionViewModel, CountryCode countryCode, PoaDocumentType poaDocumentType, int i, Object obj2) {
        if ((i & 1) != 0) {
            countryCode = null;
        }
        if ((i & 2) != 0) {
            poaDocumentType = null;
        }
        poaDocumentSubmissionViewModel.setPoaData$onfido_capture_sdk_core_release(countryCode, poaDocumentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadPoaDocument$lambda$4(PoaDocumentSubmissionViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.uploadResultSubject.onNext(ViewState.HideLoading.INSTANCE);
        this$0.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Uploading("POA_DOCUMENT_UPLOAD").toTaskType(), "POA_DOCUMENT_UPLOAD");
    }

    public final void getImageBitmapFromFileByteArray(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Disposable disposableI = getImageFromFileAsBitmap$onfido_capture_sdk_core_release(file).k(this.schedulersProvider.getComputation()).h(this.schedulersProvider.getUi()).i(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.getImageBitmapFromFileByteArray.1
            @Override // igm.g
            public final void accept(Bitmap bitmap) {
                PoaDocumentSubmissionViewModel.this.imageReadSubject.onNext(bitmap);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.getImageBitmapFromFileByteArray.2
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "failed getting image from file", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }

    @NotNull
    public final Single<Bitmap> getImageFromFileAsBitmap$onfido_capture_sdk_core_release(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        tgm.b bVar = new tgm.b(new c(file, 0), 3);
        Intrinsics.checkNotNullExpressionValue(bVar, "fromCallable(...)");
        return bVar;
    }

    @NotNull
    /* JADX INFO: renamed from: getImageReadResult$onfido_capture_sdk_core_release, reason: from getter */
    public final Observable getImageReadResult() {
        return this.imageReadResult;
    }

    /* JADX INFO: renamed from: getIssuingCountryCode$onfido_capture_sdk_core_release, reason: from getter */
    public final CountryCode getIssuingCountryCode() {
        return this.issuingCountryCode;
    }

    /* JADX INFO: renamed from: getPoaDocumentType$onfido_capture_sdk_core_release, reason: from getter */
    public final PoaDocumentType getPoaDocumentType() {
        return this.poaDocumentType;
    }

    public final int getTitleResId(boolean isTakePhoto) {
        return isTakePhoto ? R.string.onfido_poa_capture_redo : R.string.onfido_poa_capture_choose_another;
    }

    @NotNull
    public final Observable getViewState$onfido_capture_sdk_core_release() {
        Object value = this.viewState.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Observable) value;
    }

    @NotNull
    public final Bitmap loadBitmapFromPdfUri(@NotNull Uri uri2, @NotNull ContentResolver contentResolver, int densityDpi) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri2, "r");
        Intrinsics.h(parcelFileDescriptorOpenFileDescriptor);
        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((pageOpenPage.getWidth() * densityDpi) / 72, (pageOpenPage.getHeight() * densityDpi) / 72, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-1);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "apply(...)");
        pageOpenPage.render(bitmapCreateBitmap, null, null, 2);
        pageOpenPage.close();
        pdfRenderer.close();
        return bitmapCreateBitmap;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        getCompositeDisposable().d();
    }

    public final void setIssuingCountryCode$onfido_capture_sdk_core_release(CountryCode countryCode) {
        this.issuingCountryCode = countryCode;
    }

    public final void setPoaData$onfido_capture_sdk_core_release(CountryCode countryCode, PoaDocumentType documentType) {
        if (countryCode != null) {
            this.issuingCountryCode = countryCode;
        }
        if (documentType != null) {
            this.poaDocumentType = documentType;
        }
    }

    public final void setPoaDocumentType$onfido_capture_sdk_core_release(PoaDocumentType poaDocumentType) {
        this.poaDocumentType = poaDocumentType;
    }

    public final void trackPoaDocumentSubmission() {
        this.screenTracker.trackPoaDocumentSubmission$onfido_capture_sdk_core_release();
    }

    public final void uploadPoaDocument(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Single<byte[]> singleInvoke = this.compressPoaDocumentUseCase.invoke(bitmap);
        o oVar = new o() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.uploadPoaDocument.1
            @Override // igm.o
            @NotNull
            public final SingleSource apply(@NotNull byte[] image) {
                Intrinsics.checkNotNullParameter(image, "image");
                return PoaDocumentSubmissionViewModel.this.uploadPoaDocumentUseCase.invoke(image, PoaDocumentSubmissionViewModel.this.getPoaDocumentType(), PoaDocumentSubmissionViewModel.this.getIssuingCountryCode());
            }
        };
        singleInvoke.getClass();
        int i = 0;
        int i2 = 1;
        Disposable disposableI = new d(new e(new e(new tgm.g(singleInvoke, oVar, i).k(this.schedulersProvider.getIo()).h(this.schedulersProvider.getUi()), new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.uploadPoaDocument.2
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaDocumentSubmissionViewModel.this.uploadResultSubject.onNext(ViewState.Error.INSTANCE);
            }
        }, i), new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.uploadPoaDocument.3
            @Override // igm.g
            public final void accept(@NotNull Disposable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaDocumentSubmissionViewModel.this.uploadResultSubject.onNext(ViewState.ShowLoading.INSTANCE);
            }
        }, i2), new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(this, 11), i2).i(new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.uploadPoaDocument.5
            @Override // igm.g
            public final void accept(@NotNull PoaDocumentUpload poaDocumentUpload) {
                Intrinsics.checkNotNullParameter(poaDocumentUpload, "poaDocumentUpload");
                PoaDocumentSubmissionViewModel.this.uploadResultSubject.onNext(new ViewState.UploadCompleted(poaDocumentUpload.getId(), poaDocumentUpload.getType(), poaDocumentUpload.getIssuingCountry()));
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionViewModel.uploadPoaDocument.6
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                PoaDocumentSubmissionViewModel.this.uploadResultSubject.onNext(ViewState.Error.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableI);
    }
}
