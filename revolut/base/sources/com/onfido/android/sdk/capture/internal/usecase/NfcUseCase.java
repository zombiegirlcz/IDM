package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.flow.NfcArguments;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.model.NFCOptions;
import com.onfido.android.sdk.capture.model.NFCOptionsKt;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.DocumentUploadResult;
import com.onfido.android.sdk.capture.ui.camera.DocumentValidationWarningsBundleUtilsKt;
import com.onfido.android.sdk.capture.ui.camera.ErrorTypeException;
import com.onfido.android.sdk.capture.ui.camera.IQSUploadErrorParser;
import com.onfido.android.sdk.capture.ui.camera.NfcPropertiesService;
import com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult;
import com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.utils.DocumentUtilsKt;
import com.onfido.android.sdk.capture.validation.MRZData;
import com.onfido.android.sdk.capture.validation.MRZDataType;
import com.onfido.android.sdk.capture.validation.device.MRZValidationResult;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.DocumentFeatures;
import com.onfido.api.client.data.DocumentValidationWarningsBundle;
import com.onfido.api.client.exception.GeoblockedException;
import com.onfido.api.client.exception.HttpParsedException;
import com.onfido.api.client.exception.TokenExpiredException;
import gim.d;
import java.util.HashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0012\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\fH\u0002J*\u0010\"\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020%H\u0082@¢\u0006\u0002\u0010&J!\u0010'\u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010(\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0002\b*JC\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\"\u00100\u001a\u001e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020301j\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203`4H\u0000¢\u0006\u0002\b5J<\u00106\u001a\u0002072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0018H\u0082@¢\u0006\u0002\u0010;J<\u0010<\u001a\u0002072\u0006\u0010\u001d\u001a\u00020%2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u00108\u001a\u0002092\u0006\u0010,\u001a\u00020-H\u0080@¢\u0006\u0004\b=\u0010>J\u001a\u0010?\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J3\u0010B\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\bCJ!\u0010D\u001a\u00020\u00102\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010,\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0002\bGR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/usecase/NfcUseCase;", "", "nfcInteractor", "Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;", "documentConfigurationManager", "Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;", "nfcPropertiesService", "Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;", "nfcTracker", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;", "(Lcom/onfido/android/sdk/capture/internal/nfc/NfcInteractor;Lcom/onfido/android/sdk/capture/document/DocumentConfigurationManager;Lcom/onfido/android/sdk/capture/ui/camera/NfcPropertiesService;Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/NfcTracker;)V", "getDocumentFeatures", "Lcom/onfido/api/client/data/DocumentFeatures;", "nfcProperties", "Lcom/onfido/android/sdk/capture/ui/nfc/model/NfcProperties;", "hasNfc", "", "getDocumentIdsForDocumentResponse", "", "", "nfcArguments", "Lcom/onfido/android/sdk/capture/flow/NfcArguments;", "uploadedMediaId", "getErrorTypeFromResult", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "uploadBinaryResult", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult$Error;", "getErrorTypeFromResult$onfido_capture_sdk_core_release", "getMRZResult", "result", "Lcom/onfido/android/sdk/capture/validation/device/MRZValidationResult;", "getMRZResult$onfido_capture_sdk_core_release", "getMediaNfcClassified", "documentFeatures", "getNfcProperties", "mrzDocument", "Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentUploadResult;", "(Lcom/onfido/android/sdk/capture/flow/NfcArguments;Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;Lcom/onfido/android/sdk/capture/ui/camera/DocumentUploadResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDocumentNfcClassified", "capturedData", "Lcom/onfido/android/sdk/capture/flow/NfcArguments$CapturedNfcData;", "isDocumentNfcClassified$onfido_capture_sdk_core_release", "isMRZExtracted", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "mrzExtractionResultMap", "Ljava/util/HashMap;", "Lcom/onfido/android/sdk/capture/validation/MRZDataType;", "Lcom/onfido/android/sdk/capture/validation/MRZData;", "Lkotlin/collections/HashMap;", "isMRZExtracted$onfido_capture_sdk_core_release", "nfcPropertiesToBinaryResult", "Lcom/onfido/android/sdk/capture/ui/camera/UploadBinaryResult;", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "iqsWarning", "(Lcom/onfido/android/sdk/capture/flow/NfcArguments;Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;Lcom/onfido/android/sdk/capture/ui/camera/DocumentUploadResult;Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;Lcom/onfido/android/sdk/capture/upload/ErrorType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processDocumentUploadResult", "processDocumentUploadResult$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/DocumentUploadResult;Lcom/onfido/android/sdk/capture/flow/NfcArguments;Lcom/onfido/android/sdk/capture/detector/mrzextraction/MRZDocument;Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;Lcom/onfido/android/sdk/capture/DocumentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldGetNfcProperties", "docSide", "Lcom/onfido/api/client/data/DocSide;", "shouldProceedWithNfc", "shouldProceedWithNfc$onfido_capture_sdk_core_release", "shouldScanNfc", "nfcOptions", "Lcom/onfido/android/sdk/capture/model/NFCOptions;", "shouldScanNfc$onfido_capture_sdk_core_release", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NfcUseCase {

    @NotNull
    private static final List<MRZDataType> DUTCH_ID_MRZ_REQUIRED_FIELDS;

    @NotNull
    private static final List<MRZDataType> PASSPORT_MRZ_REQUIRED_FIELDS;

    @NotNull
    private final DocumentConfigurationManager documentConfigurationManager;

    @NotNull
    private final NfcInteractor nfcInteractor;

    @NotNull
    private final NfcPropertiesService nfcPropertiesService;

    @NotNull
    private final NfcTracker nfcTracker;

    @NotNull
    private static final String MRZ_IS_NOT_READABLE = "0";

    @NotNull
    private static final String MRZ_IS_READABLE = "1";

    @NotNull
    private static final String NFC_LOGGER = "NFC Logger";

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.internal.usecase.NfcUseCase$nfcPropertiesToBinaryResult$1, reason: invalid class name */
    @d(c = "com.onfido.android.sdk.capture.internal.usecase.NfcUseCase", f = "NfcUseCase.kt", l = {86}, m = "nfcPropertiesToBinaryResult")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends gim.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return NfcUseCase.this.nfcPropertiesToBinaryResult(null, null, null, null, null, this);
        }
    }

    static {
        MRZDataType mRZDataType = MRZDataType.DATE_OF_BIRTH;
        MRZDataType mRZDataType2 = MRZDataType.EXPIRY_DATE;
        PASSPORT_MRZ_REQUIRED_FIELDS = v.k(MRZDataType.PASSPORT_NUMBER, mRZDataType, mRZDataType2);
        DUTCH_ID_MRZ_REQUIRED_FIELDS = v.k(MRZDataType.DOCUMENT_NUMBER, MRZDataType.PERSONAL_NUMBER, mRZDataType, mRZDataType2);
    }

    public NfcUseCase(@NotNull NfcInteractor nfcInteractor, @NotNull DocumentConfigurationManager documentConfigurationManager, @NotNull NfcPropertiesService nfcPropertiesService, @NotNull NfcTracker nfcTracker) {
        Intrinsics.checkNotNullParameter(nfcInteractor, "nfcInteractor");
        Intrinsics.checkNotNullParameter(documentConfigurationManager, "documentConfigurationManager");
        Intrinsics.checkNotNullParameter(nfcPropertiesService, "nfcPropertiesService");
        Intrinsics.checkNotNullParameter(nfcTracker, "nfcTracker");
        this.nfcInteractor = nfcInteractor;
        this.documentConfigurationManager = documentConfigurationManager;
        this.nfcPropertiesService = nfcPropertiesService;
        this.nfcTracker = nfcTracker;
    }

    private final DocumentFeatures getDocumentFeatures(NfcProperties nfcProperties, boolean hasNfc) {
        return new DocumentFeatures(hasNfc, nfcProperties.getHasCan(), nfcProperties.getHasPin(), nfcProperties.getCanLength(), nfcProperties.getPinLength());
    }

    public static /* synthetic */ DocumentFeatures getDocumentFeatures$default(NfcUseCase nfcUseCase, NfcProperties nfcProperties, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        return nfcUseCase.getDocumentFeatures(nfcProperties, z);
    }

    private final List<String> getDocumentIdsForDocumentResponse(NfcArguments nfcArguments, String uploadedMediaId) {
        NfcArguments.CapturedNfcData capturedData;
        String[] elements = {(nfcArguments == null || (capturedData = nfcArguments.getCapturedData()) == null) ? null : capturedData.getFrontId$onfido_capture_sdk_core_release(), uploadedMediaId};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    private final boolean getMediaNfcClassified(DocumentFeatures documentFeatures) {
        if (documentFeatures != null) {
            return documentFeatures.getHasNFC();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getNfcProperties(NfcArguments nfcArguments, MRZDocument mRZDocument, DocumentUploadResult documentUploadResult, Continuation<? super NfcProperties> continuation) {
        return tz4.d.g(this.nfcPropertiesService.get(getDocumentIdsForDocumentResponse(nfcArguments, documentUploadResult.getMediaId()), mRZDocument, documentUploadResult.getDocumentFeatures()), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object nfcPropertiesToBinaryResult(com.onfido.android.sdk.capture.flow.NfcArguments r14, com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument r15, com.onfido.android.sdk.capture.ui.camera.DocumentUploadResult r16, com.onfido.android.sdk.capture.flow.CaptureStepDataBundle r17, com.onfido.android.sdk.capture.upload.ErrorType r18, kotlin.coroutines.Continuation<? super com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult> r19) {
        /*
            r13 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof com.onfido.android.sdk.capture.internal.usecase.NfcUseCase.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            com.onfido.android.sdk.capture.internal.usecase.NfcUseCase$nfcPropertiesToBinaryResult$1 r2 = (com.onfido.android.sdk.capture.internal.usecase.NfcUseCase.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            com.onfido.android.sdk.capture.internal.usecase.NfcUseCase$nfcPropertiesToBinaryResult$1 r2 = new com.onfido.android.sdk.capture.internal.usecase.NfcUseCase$nfcPropertiesToBinaryResult$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.result
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L47
            if (r4 != r5) goto L3f
            java.lang.Object r14 = r2.L$3
            com.onfido.android.sdk.capture.upload.ErrorType r14 = (com.onfido.android.sdk.capture.upload.ErrorType) r14
            java.lang.Object r15 = r2.L$2
            com.onfido.android.sdk.capture.flow.CaptureStepDataBundle r15 = (com.onfido.android.sdk.capture.flow.CaptureStepDataBundle) r15
            java.lang.Object r0 = r2.L$1
            com.onfido.android.sdk.capture.ui.camera.DocumentUploadResult r0 = (com.onfido.android.sdk.capture.ui.camera.DocumentUploadResult) r0
            java.lang.Object r2 = r2.L$0
            com.onfido.android.sdk.capture.internal.usecase.NfcUseCase r2 = (com.onfido.android.sdk.capture.internal.usecase.NfcUseCase) r2
            yhm.o.b(r1)     // Catch: java.lang.Throwable -> L3c
            goto L6c
        L3c:
            r0 = move-exception
            r14 = r0
            goto La3
        L3f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L47:
            yhm.o.b(r1)
            com.onfido.android.sdk.capture.internal.util.logging.Timber$Forest r1 = com.onfido.android.sdk.capture.internal.util.logging.Timber.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r7 = "NFC Logger - Attempting to get NFC properties"
            r1.i(r7, r4)
            r2.L$0 = r13     // Catch: java.lang.Throwable -> La0
            r2.L$1 = r0     // Catch: java.lang.Throwable -> La0
            r1 = r17
            r2.L$2 = r1     // Catch: java.lang.Throwable -> La0
            r4 = r18
            r2.L$3 = r4     // Catch: java.lang.Throwable -> La0
            r2.label = r5     // Catch: java.lang.Throwable -> La0
            java.lang.Object r14 = r13.getNfcProperties(r14, r15, r0, r2)     // Catch: java.lang.Throwable -> La0
            if (r14 != r3) goto L68
            return r3
        L68:
            r2 = r13
            r15 = r1
            r1 = r14
            r14 = r4
        L6c:
            com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties r1 = (com.onfido.android.sdk.capture.ui.nfc.model.NfcProperties) r1     // Catch: java.lang.Throwable -> L3c
            com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker r7 = r2.nfcTracker     // Catch: java.lang.Throwable -> L3c
            boolean r8 = r1.getIsNfcSupported()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r1.getNfcKey()     // Catch: java.lang.Throwable -> L3c
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L3c
            if (r3 <= 0) goto L80
            r9 = r5
            goto L81
        L80:
            r9 = r6
        L81:
            com.onfido.android.sdk.capture.DocumentType r10 = r15.getDocumentType()     // Catch: java.lang.Throwable -> L3c
            com.onfido.android.sdk.capture.utils.CountryCode r11 = r15.getCountryCode()     // Catch: java.lang.Throwable -> L3c
            r15 = 2
            r3 = 0
            com.onfido.api.client.data.DocumentFeatures r12 = getDocumentFeatures$default(r2, r1, r6, r15, r3)     // Catch: java.lang.Throwable -> L3c
            r7.trackDocumentNfcSupported$onfido_capture_sdk_core_release(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3c
            com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult$NfcPropertiesFetched r15 = new com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult$NfcPropertiesFetched     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = r0.getMediaId()     // Catch: java.lang.Throwable -> L3c
            com.onfido.api.client.data.DocumentValidationWarningsBundle r0 = r0.getWarningsBundle()     // Catch: java.lang.Throwable -> L3c
            r15.<init>(r3, r1, r14, r0)     // Catch: java.lang.Throwable -> L3c
            return r15
        La0:
            r0 = move-exception
            r14 = r0
            r2 = r13
        La3:
            com.onfido.android.sdk.capture.internal.util.logging.Timber$Forest r15 = com.onfido.android.sdk.capture.internal.util.logging.Timber.INSTANCE
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r1 = "NFC Logger - Error on getting nfcProperties"
            r15.e(r1, r0)
            com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker r15 = r2.nfcTracker
            java.lang.String r0 = r14.getMessage()
            r15.trackPropertiesError$onfido_capture_sdk_core_release(r0)
            com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult$Error r15 = new com.onfido.android.sdk.capture.ui.camera.UploadBinaryResult$Error
            r15.<init>(r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.internal.usecase.NfcUseCase.nfcPropertiesToBinaryResult(com.onfido.android.sdk.capture.flow.NfcArguments, com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocument, com.onfido.android.sdk.capture.ui.camera.DocumentUploadResult, com.onfido.android.sdk.capture.flow.CaptureStepDataBundle, com.onfido.android.sdk.capture.upload.ErrorType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean shouldGetNfcProperties(DocumentType documentType, DocSide docSide) {
        return docSide == this.documentConfigurationManager.getDocSideForNfcProperties(documentType);
    }

    @NotNull
    public final ErrorType getErrorTypeFromResult$onfido_capture_sdk_core_release(@NotNull UploadBinaryResult.Error uploadBinaryResult) {
        Intrinsics.checkNotNullParameter(uploadBinaryResult, "uploadBinaryResult");
        Timber.INSTANCE.e("NFC Logger - UploadBinaryResult Error: " + uploadBinaryResult.getThrowable().getMessage(), new Object[0]);
        IQSUploadErrorParser iQSUploadErrorParser = new IQSUploadErrorParser();
        Throwable throwable = uploadBinaryResult.getThrowable();
        if (throwable instanceof ErrorTypeException) {
            return ((ErrorTypeException) throwable).getErrorType();
        }
        if (throwable instanceof HttpParsedException) {
            return iQSUploadErrorParser.parseUploadError(((HttpParsedException) throwable).f50134a, CaptureType.DOCUMENT);
        }
        if (throwable instanceof TokenExpiredException) {
            return ErrorType.TokenExpired.INSTANCE;
        }
        if (throwable instanceof SSLPeerUnverifiedException) {
            String localizedMessage = ((SSLPeerUnverifiedException) throwable).getLocalizedMessage();
            return new ErrorType.InvalidCertificate(localizedMessage != null ? localizedMessage : "");
        }
        if (!(throwable instanceof HttpException)) {
            return throwable instanceof GeoblockedException ? ErrorType.Geoblocked.INSTANCE : ErrorType.Generic.INSTANCE;
        }
        String message = throwable.getMessage();
        return new ErrorType.Network(message != null ? message : "");
    }

    public final String getMRZResult$onfido_capture_sdk_core_release(MRZValidationResult result) {
        if (result == null || !result.getWasExecuted()) {
            return null;
        }
        if (result.isMrzReadable()) {
            Timber.INSTANCE.i("NFC Logger - MRZ is readable", new Object[0]);
            return "1";
        }
        Timber.INSTANCE.i("NFC Logger - MRZ is not readable", new Object[0]);
        return "0";
    }

    public final boolean isDocumentNfcClassified$onfido_capture_sdk_core_release(DocumentFeatures documentFeatures, NfcArguments.CapturedNfcData capturedData) {
        return (capturedData != null ? capturedData.getNfcSupported$onfido_capture_sdk_core_release() : false) || getMediaNfcClassified(documentFeatures);
    }

    public final boolean isMRZExtracted$onfido_capture_sdk_core_release(@NotNull DocumentType documentType, CountryCode countryCode, @NotNull HashMap<MRZDataType, MRZData> mrzExtractionResultMap) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(mrzExtractionResultMap, "mrzExtractionResultMap");
        if (documentType == DocumentType.PASSPORT) {
            boolean zHasRequiredFields = DocumentUtilsKt.hasRequiredFields(mrzExtractionResultMap, PASSPORT_MRZ_REQUIRED_FIELDS);
            Timber.INSTANCE.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - MRZ detected [Passport] : ", zHasRequiredFields), new Object[0]);
            return zHasRequiredFields;
        }
        if (documentType != DocumentType.NATIONAL_IDENTITY_CARD || countryCode != CountryCode.NL) {
            Timber.INSTANCE.i("NFC Logger - MRZ not detected", new Object[0]);
            return false;
        }
        boolean zHasRequiredFields2 = DocumentUtilsKt.hasRequiredFields(mrzExtractionResultMap, DUTCH_ID_MRZ_REQUIRED_FIELDS);
        Timber.INSTANCE.i(com.google.android.gms.internal.mlkit_vision_face.a.r("NFC Logger - MRZ detected [Dutch ID] : ", zHasRequiredFields2), new Object[0]);
        return zHasRequiredFields2;
    }

    public final Object processDocumentUploadResult$onfido_capture_sdk_core_release(@NotNull DocumentUploadResult documentUploadResult, NfcArguments nfcArguments, MRZDocument mRZDocument, @NotNull CaptureStepDataBundle captureStepDataBundle, @NotNull DocumentType documentType, @NotNull Continuation<? super UploadBinaryResult> continuation) {
        DocumentValidationWarningsBundle warningsBundle = documentUploadResult.getWarningsBundle();
        ErrorType errorTypeFirstRemoteWarningOrNull = warningsBundle != null ? DocumentValidationWarningsBundleUtilsKt.firstRemoteWarningOrNull(warningsBundle) : null;
        return shouldProceedWithNfc$onfido_capture_sdk_core_release(documentType, captureStepDataBundle.getDocSide(), documentUploadResult.getDocumentFeatures(), nfcArguments) ? nfcPropertiesToBinaryResult(nfcArguments, mRZDocument, documentUploadResult, captureStepDataBundle, errorTypeFirstRemoteWarningOrNull, continuation) : new UploadBinaryResult.BinaryUploaded(documentUploadResult.getMediaId(), errorTypeFirstRemoteWarningOrNull, getMediaNfcClassified(documentUploadResult.getDocumentFeatures()), documentUploadResult.getWarningsBundle());
    }

    public final boolean shouldProceedWithNfc$onfido_capture_sdk_core_release(@NotNull DocumentType documentType, DocSide docSide, DocumentFeatures documentFeatures, NfcArguments nfcArguments) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        if (shouldScanNfc$onfido_capture_sdk_core_release(nfcArguments != null ? nfcArguments.getNfcOptions() : null, documentType)) {
            return isDocumentNfcClassified$onfido_capture_sdk_core_release(documentFeatures, nfcArguments != null ? nfcArguments.getCapturedData() : null) && shouldGetNfcProperties(documentType, docSide);
        }
        return false;
    }

    public final boolean shouldScanNfc$onfido_capture_sdk_core_release(NFCOptions nfcOptions, DocumentType documentType) {
        if (Intrinsics.f(nfcOptions, NFCOptions.Enabled.Required.INSTANCE)) {
            return true;
        }
        return nfcOptions != null && NFCOptionsKt.isEnabled(nfcOptions) && Intrinsics.f(documentType != null ? Boolean.valueOf(this.documentConfigurationManager.shouldScanNfc(documentType)) : null, Boolean.TRUE) && this.nfcInteractor.isNfcSupported();
    }
}
