package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.detector.mrz.DutchIDMRZValidator;
import com.onfido.android.sdk.capture.detector.mrz.MRZValidator;
import com.onfido.android.sdk.capture.detector.mrz.PassportMRZValidator;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.ui.camera.DocumentDetectionFrame;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.validation.device.OnDeviceValidationResult;
import com.onfido.api.client.data.DocSide;
import igm.o;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tgm.g;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B/\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0012¢\u0006\u0002\u0010\u0016J,\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u000fH\u0012J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0012¢\u0006\u0002\u0010\u001bJ<\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001e0\u001dH\u0012J5\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010&\u001a\u00020\u0015H\u0010¢\u0006\u0002\b'R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/validation/PostCaptureDocumentValidationsManager;", "", "identityInteractor", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "onDeviceValidationTransformer", "Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationTransformer;", "retainableValidationsResult", "Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;", "barcodeValidationSuspender", "Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "(Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationTransformer;Lcom/onfido/android/sdk/capture/internal/validation/RetainableValidationsResult;Lcom/onfido/android/sdk/capture/validation/BarcodeValidationSuspender;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;)V", "getRequiredValidations", "", "Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/DocSide;)[Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "getValidator", "Lcom/onfido/android/sdk/capture/validation/DocumentCodeValidator;", "validationType", "passportValidations", "(Lcom/onfido/api/client/data/DocSide;)[Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "replaceValidationResultsByRetainedResults", "", "Lcom/onfido/android/sdk/capture/validation/device/OnDeviceValidationResult;", "actualValidations", "retainedValidationResults", "validate", "Lio/reactivex/rxjava3/core/Single;", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "frame", "Lcom/onfido/android/sdk/capture/ui/camera/DocumentDetectionFrame;", "docSide", "validate$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class PostCaptureDocumentValidationsManager {

    @NotNull
    private final BarcodeValidationSuspender barcodeValidationSuspender;

    @NotNull
    private final IdentityInteractor identityInteractor;

    @NotNull
    private final OnDeviceValidationTransformer onDeviceValidationTransformer;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final RetainableValidationsResult retainableValidationsResult;

    public PostCaptureDocumentValidationsManager(@NotNull IdentityInteractor identityInteractor, @NotNull OnDeviceValidationTransformer onDeviceValidationTransformer, @NotNull RetainableValidationsResult retainableValidationsResult, @NotNull BarcodeValidationSuspender barcodeValidationSuspender, @NotNull OnfidoRemoteConfig onfidoRemoteConfig) {
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(onDeviceValidationTransformer, "onDeviceValidationTransformer");
        Intrinsics.checkNotNullParameter(retainableValidationsResult, "retainableValidationsResult");
        Intrinsics.checkNotNullParameter(barcodeValidationSuspender, "barcodeValidationSuspender");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        this.identityInteractor = identityInteractor;
        this.onDeviceValidationTransformer = onDeviceValidationTransformer;
        this.retainableValidationsResult = retainableValidationsResult;
        this.barcodeValidationSuspender = barcodeValidationSuspender;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
    }

    private OnDeviceValidationType[] getRequiredValidations(DocumentType documentType, CountryCode countryCode, DocSide documentSide) {
        return documentType == DocumentType.PASSPORT ? passportValidations(documentSide) : documentType == DocumentType.GENERIC ? new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION} : documentSide == DocSide.FRONT ? new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION, OnDeviceValidationType.FACE_ON_DOCUMENT_DETECTION} : documentType == DocumentType.DRIVING_LICENCE && countryCode == CountryCode.US && documentSide == DocSide.BACK ? new OnDeviceValidationType[]{OnDeviceValidationType.PDF_417_BARCODE_DETECTION} : documentType == DocumentType.NATIONAL_IDENTITY_CARD && countryCode == CountryCode.NL && documentSide == DocSide.BACK && this.identityInteractor.isDeviceHighEnd() ? new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION, OnDeviceValidationType.MRZ_DETECTION} : new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION};
    }

    private DocumentCodeValidator getValidator(DocumentType documentType, CountryCode countryCode, DocSide documentSide, OnDeviceValidationType validationType) {
        if (validationType == OnDeviceValidationType.MRZ_DETECTION) {
            boolean z = false;
            boolean z3 = documentType == DocumentType.PASSPORT;
            if (documentType == DocumentType.NATIONAL_IDENTITY_CARD && countryCode == CountryCode.NL && documentSide == DocSide.BACK) {
                z = true;
            }
            if ((z3 || z) && this.onfidoRemoteConfig.isGenericMrzValidatorEnabled()) {
                return new MRZValidator(documentType);
            }
            if (z3) {
                return new PassportMRZValidator();
            }
            if (z) {
                return new DutchIDMRZValidator();
            }
        }
        return DocumentCodeValidator.INSTANCE.getNone();
    }

    private OnDeviceValidationType[] passportValidations(DocSide documentSide) {
        return documentSide == DocSide.BACK ? new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION} : this.identityInteractor.isDeviceHighEnd() ? new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION, OnDeviceValidationType.MRZ_DETECTION, OnDeviceValidationType.FACE_ON_DOCUMENT_DETECTION} : new OnDeviceValidationType[]{OnDeviceValidationType.BLUR_DETECTION, OnDeviceValidationType.FACE_ON_DOCUMENT_DETECTION};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<OnDeviceValidationType, OnDeviceValidationResult> replaceValidationResultsByRetainedResults(Map<OnDeviceValidationType, ? extends OnDeviceValidationResult> actualValidations, Map<OnDeviceValidationType, ? extends OnDeviceValidationResult> retainedValidationResults) {
        LinkedHashMap linkedHashMapZ = r0.z(actualValidations);
        for (Map.Entry<OnDeviceValidationType, ? extends OnDeviceValidationResult> entry : retainedValidationResults.entrySet()) {
            linkedHashMapZ.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMapZ;
    }

    @NotNull
    public Single<DocumentProcessingResults> validate$onfido_capture_sdk_core_release(@NotNull DocumentDetectionFrame frame, @NotNull DocumentType documentType, CountryCode countryCode, @NotNull DocSide docSide) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        OnDeviceValidationType[] requiredValidations = getRequiredValidations(documentType, countryCode, docSide);
        BarcodeValidationSuspender barcodeValidationSuspender = this.barcodeValidationSuspender;
        ArrayList arrayList = new ArrayList();
        for (OnDeviceValidationType onDeviceValidationType : requiredValidations) {
            if (!barcodeValidationSuspender.isValidationSuspended$onfido_capture_sdk_core_release(onDeviceValidationType)) {
                arrayList.add(onDeviceValidationType);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            OnDeviceValidationType onDeviceValidationType2 = (OnDeviceValidationType) obj2;
            if (this.onfidoRemoteConfig.getDocumentCapture().isMrzDetectionEnabled() || onDeviceValidationType2 != OnDeviceValidationType.MRZ_DETECTION) {
                arrayList2.add(obj2);
            }
        }
        final OnDeviceValidationType[] onDeviceValidationTypeArr = (OnDeviceValidationType[]) arrayList2.toArray(new OnDeviceValidationType[0]);
        final Map<OnDeviceValidationType, OnDeviceValidationResult> retainedValidationResults$onfido_capture_sdk_core_release = this.retainableValidationsResult.getRetainedValidationResults$onfido_capture_sdk_core_release();
        if (retainedValidationResults$onfido_capture_sdk_core_release.keySet().containsAll(kotlin.collections.d.v0(onDeviceValidationTypeArr))) {
            tgm.b bVarF = Single.f(DocumentProcessingResults.INSTANCE.mapFromValidationTypeToResult(retainedValidationResults$onfido_capture_sdk_core_release));
            Intrinsics.checkNotNullExpressionValue(bVarF, "just(...)");
            return bVarF;
        }
        ArrayList<OnDeviceValidationType> arrayList3 = new ArrayList();
        for (OnDeviceValidationType onDeviceValidationType3 : onDeviceValidationTypeArr) {
            if (!retainedValidationResults$onfido_capture_sdk_core_release.containsKey(onDeviceValidationType3)) {
                arrayList3.add(onDeviceValidationType3);
            }
        }
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        for (OnDeviceValidationType onDeviceValidationType4 : arrayList3) {
            arrayList4.add(this.onDeviceValidationTransformer.transformPostCaptureValidations$onfido_capture_sdk_core_release(frame, onDeviceValidationType4, getValidator(documentType, countryCode, docSide, onDeviceValidationType4)));
        }
        g gVarG = new tgm.d(arrayList4, new o() { // from class: com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager$validate$3
            @Override // igm.o
            @NotNull
            public final Map<OnDeviceValidationType, OnDeviceValidationResult> apply(@NotNull Object[] results) {
                Intrinsics.checkNotNullParameter(results, "results");
                return this.this$0.onDeviceValidationTransformer.getResults(onDeviceValidationTypeArr, results);
            }
        }, 4).g(new o() { // from class: com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager$validate$4
            @Override // igm.o
            @NotNull
            public final Map<OnDeviceValidationType, OnDeviceValidationResult> apply(@NotNull Map<OnDeviceValidationType, ? extends OnDeviceValidationResult> it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.this$0.replaceValidationResultsByRetainedResults(it8, retainedValidationResults$onfido_capture_sdk_core_release);
            }
        });
        final DocumentProcessingResults.Companion companion = DocumentProcessingResults.INSTANCE;
        g gVarG2 = gVarG.g(new o() { // from class: com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager$validate$5
            @Override // igm.o
            @NotNull
            public final DocumentProcessingResults apply(@NotNull Map<OnDeviceValidationType, ? extends OnDeviceValidationResult> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return companion.mapFromValidationTypeToResult(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(gVarG2, "map(...)");
        return gVarG2;
    }
}
