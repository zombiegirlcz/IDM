package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.api.client.data.DocSide;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/validation/RealTimeDocLivenessValidationManager;", "Lcom/onfido/android/sdk/capture/validation/OnDeviceDocumentValidationsManager;", "()V", "getRequiredValidations", "", "Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "documentType", "Lcom/onfido/android/sdk/capture/DocumentType;", "countryCode", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "documentSide", "Lcom/onfido/api/client/data/DocSide;", "(Lcom/onfido/android/sdk/capture/DocumentType;Lcom/onfido/android/sdk/capture/utils/CountryCode;Lcom/onfido/api/client/data/DocSide;)[Lcom/onfido/android/sdk/capture/validation/OnDeviceValidationType;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealTimeDocLivenessValidationManager implements OnDeviceDocumentValidationsManager {
    @Override // com.onfido.android.sdk.capture.validation.OnDeviceDocumentValidationsManager
    @NotNull
    public OnDeviceValidationType[] getRequiredValidations(@NotNull DocumentType documentType, CountryCode countryCode, DocSide documentSide) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return documentSide != null ? documentSide.equals(DocSide.FRONT) : false ? new OnDeviceValidationType[]{OnDeviceValidationType.EDGES_DETECTION, OnDeviceValidationType.FACE_ON_DOCUMENT_DETECTION, OnDeviceValidationType.GLARE_DETECTION} : new OnDeviceValidationType[]{OnDeviceValidationType.EDGES_DETECTION, OnDeviceValidationType.GLARE_DETECTION};
    }
}
