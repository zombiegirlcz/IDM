package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.NfcFlowType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.nfc.data.NfcPassportExtraction;
import com.onfido.android.sdk.capture.ui.nfc.NfcDataRepository;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.api.client.data.DocumentMediaUploadResponse;
import com.onfido.api.client.exception.TokenExpiredException;
import igm.g;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0012J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0012J\"\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001b\u0010\f\u001a\u00020\r8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/NfcDataService;", "", "nfcDataRepository", "Lcom/onfido/android/sdk/capture/ui/nfc/NfcDataRepository;", "listener", "Lcom/onfido/android/sdk/capture/ui/NfcDataServiceListener;", "subscriber", "Lio/reactivex/rxjava3/core/Scheduler;", "observer", "waitingScreenTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;", "(Lcom/onfido/android/sdk/capture/ui/nfc/NfcDataRepository;Lcom/onfido/android/sdk/capture/ui/NfcDataServiceListener;Lio/reactivex/rxjava3/core/Scheduler;Lio/reactivex/rxjava3/core/Scheduler;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/WaitingScreenTracker;)V", "compositeRequestSubscription", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getCompositeRequestSubscription", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeRequestSubscription$delegate", "Lkotlin/Lazy;", "onBinaryUploadCompleted", "", "documentMediaUpload", "Lcom/onfido/api/client/data/DocumentMediaUploadResponse;", "nfcFlowType", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/NfcFlowType;", "onUploadFailed", "throwable", "", "stop", "trackWaitingScreenCompleted", "reason", "", "uploadBinary", "nfcData", "Lcom/onfido/android/sdk/capture/internal/nfc/data/NfcPassportExtraction;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class NfcDataService {

    /* JADX INFO: renamed from: compositeRequestSubscription$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy compositeRequestSubscription;

    @NotNull
    private final NfcDataServiceListener listener;

    @NotNull
    private final NfcDataRepository nfcDataRepository;

    @NotNull
    private final Scheduler observer;

    @NotNull
    private final Scheduler subscriber;

    @NotNull
    private final WaitingScreenTracker waitingScreenTracker;

    public NfcDataService(@NotNull NfcDataRepository nfcDataRepository, @NotNull NfcDataServiceListener listener, @NotNull Scheduler subscriber, @NotNull Scheduler observer, @NotNull WaitingScreenTracker waitingScreenTracker) {
        Intrinsics.checkNotNullParameter(nfcDataRepository, "nfcDataRepository");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(waitingScreenTracker, "waitingScreenTracker");
        this.nfcDataRepository = nfcDataRepository;
        this.listener = listener;
        this.subscriber = subscriber;
        this.observer = observer;
        this.waitingScreenTracker = waitingScreenTracker;
        this.compositeRequestSubscription = j.b(NfcDataService$compositeRequestSubscription$2.INSTANCE);
    }

    private CompositeDisposable getCompositeRequestSubscription() {
        return (CompositeDisposable) this.compositeRequestSubscription.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBinaryUploadCompleted(DocumentMediaUploadResponse documentMediaUpload, NfcFlowType nfcFlowType) {
        this.listener.onDataUploaded(documentMediaUpload, nfcFlowType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUploadFailed(Throwable throwable) {
        ErrorType errorType;
        ErrorType network;
        if (throwable instanceof TokenExpiredException) {
            errorType = ErrorType.TokenExpired.INSTANCE;
        } else {
            if (throwable instanceof SSLPeerUnverifiedException) {
                String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
                network = new ErrorType.InvalidCertificate(localizedMessage != null ? localizedMessage : "");
            } else if (throwable instanceof HttpException) {
                String message = throwable.getMessage();
                network = new ErrorType.Network(message != null ? message : "");
            } else {
                errorType = ErrorType.Generic.INSTANCE;
            }
            errorType = network;
        }
        this.listener.onUploadError(errorType);
    }

    private void trackWaitingScreenCompleted(String reason) {
        this.waitingScreenTracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Loading(reason).toTaskType(), reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uploadBinary$lambda$0(NfcDataService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.trackWaitingScreenCompleted("UPLOAD_NFC_DATA");
    }

    public void stop() {
        getCompositeRequestSubscription().d();
    }

    public void uploadBinary(@NotNull NfcPassportExtraction nfcData, DocumentType documentType, @NotNull final NfcFlowType nfcFlowType) {
        Intrinsics.checkNotNullParameter(nfcData, "nfcData");
        Intrinsics.checkNotNullParameter(nfcFlowType, "nfcFlowType");
        Disposable disposableI = new tgm.d(this.nfcDataRepository.uploadData(nfcData, documentType).k(this.subscriber).h(this.observer), new com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b(this, 7), 1).i(new g() { // from class: com.onfido.android.sdk.capture.ui.NfcDataService$uploadBinary$binaryUploadSingle$2
            @Override // igm.g
            public final void accept(@NotNull DocumentMediaUploadResponse it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                this.this$0.onBinaryUploadCompleted(it8, nfcFlowType);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.ui.NfcDataService$uploadBinary$binaryUploadSingle$3
            @Override // igm.g
            public final void accept(@NotNull Throwable it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                this.this$0.onUploadFailed(it8);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableI, "subscribe(...)");
        RxExtensionsKt.plusAssign(getCompositeRequestSubscription(), disposableI);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NfcDataService(NfcDataRepository nfcDataRepository, NfcDataServiceListener nfcDataServiceListener, Scheduler scheduler, Scheduler scheduler2, WaitingScreenTracker waitingScreenTracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            scheduler = ehm.e.f126320c;
            Intrinsics.checkNotNullExpressionValue(scheduler, "io(...)");
        }
        Scheduler scheduler3 = scheduler;
        if ((i & 8) != 0) {
            scheduler2 = egm.b.a();
            Intrinsics.checkNotNullExpressionValue(scheduler2, "mainThread(...)");
        }
        this(nfcDataRepository, nfcDataServiceListener, scheduler3, scheduler2, waitingScreenTracker);
    }
}
