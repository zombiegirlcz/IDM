package com.onfido.android.sdk.capture.ui.model;

import com.onfido.android.sdk.capture.DocumentFormat;
import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.utils.CountryCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002J<\u0010\u0017\u001a\u00020\u0007*\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\u0004\u0012\u00020\n\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/model/DocumentUITextModelMapper;", "", "()V", "commonDocFormatModels", "", "Lcom/onfido/android/sdk/capture/DocumentFormat;", "Lcom/onfido/android/sdk/capture/DocumentType;", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "commonDocTypeModels", "docFormatModels", "Lcom/onfido/android/sdk/capture/utils/CountryCode;", "frenchDocFormatModels", "germanDocFormatModels", "italianDocFormatModels", "southAfricanDocFormatModels", "foldedDocModel", "label", "", "(Ljava/lang/Integer;)Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "getDocModel", "documentType", "documentFormat", "countryCode", "toDocumentUIModel", "isAccessibilityEnabled", "", "isForProofAddress", "isAddressPageCapture", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentUITextModelMapper {

    @NotNull
    public static final DocumentUITextModelMapper INSTANCE;

    @NotNull
    private static final Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> commonDocFormatModels;

    @NotNull
    private static final Map<DocumentType, DocumentTypeUIModel> commonDocTypeModels;

    @NotNull
    private static final Map<CountryCode, Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>>> docFormatModels;

    @NotNull
    private static final Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> frenchDocFormatModels;

    @NotNull
    private static final Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> germanDocFormatModels;

    @NotNull
    private static final Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> italianDocFormatModels;

    @NotNull
    private static final Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> southAfricanDocFormatModels;

    static {
        DocumentUITextModelMapper documentUITextModelMapper = new DocumentUITextModelMapper();
        INSTANCE = documentUITextModelMapper;
        DocumentFormat documentFormat = DocumentFormat.FOLDED;
        DocumentType documentType = DocumentType.NATIONAL_IDENTITY_CARD;
        Pair pair = new Pair(documentFormat, q0.c(new Pair(documentType, documentUITextModelMapper.foldedDocModel(Integer.valueOf(R.string.onfido_app_title_doc_capture_id_it)))));
        DocumentFormat documentFormat2 = DocumentFormat.CARD;
        DocumentTypeUIModels documentTypeUIModels = DocumentTypeUIModels.INSTANCE;
        Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> mapK = r0.k(pair, new Pair(documentFormat2, q0.c(new Pair(documentType, documentTypeUIModels.getIdDocModel$onfido_capture_sdk_core_release()))));
        italianDocFormatModels = mapK;
        Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> mapK2 = r0.k(new Pair(documentFormat, q0.c(new Pair(documentType, documentUITextModelMapper.foldedDocModel(Integer.valueOf(R.string.onfido_app_title_doc_capture_id_za))))), new Pair(documentFormat2, q0.c(new Pair(documentType, documentTypeUIModels.getIdDocModel$onfido_capture_sdk_core_release()))));
        southAfricanDocFormatModels = mapK2;
        DocumentType documentType2 = DocumentType.DRIVING_LICENCE;
        Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> mapK3 = r0.k(new Pair(documentFormat, q0.c(new Pair(documentType2, documentUITextModelMapper.foldedDocModel(Integer.valueOf(R.string.onfido_app_title_doc_capture_license_fr))))), new Pair(documentFormat2, q0.c(new Pair(documentType2, documentTypeUIModels.getDrivingLicenseDocModel$onfido_capture_sdk_core_release()))));
        frenchDocFormatModels = mapK3;
        Map<DocumentFormat, Map<DocumentType, DocumentTypeUIModel>> mapK4 = r0.k(new Pair(documentFormat, q0.c(new Pair(documentType2, documentUITextModelMapper.foldedDocModel(Integer.valueOf(R.string.onfido_app_title_doc_capture_license_de))))), new Pair(documentFormat2, q0.c(new Pair(documentType2, documentTypeUIModels.getDrivingLicenseDocModel$onfido_capture_sdk_core_release()))));
        germanDocFormatModels = mapK4;
        Map<DocumentType, DocumentTypeUIModel> mapK5 = r0.k(new Pair(DocumentType.PASSPORT, documentTypeUIModels.getPassportDocModel$onfido_capture_sdk_core_release()), new Pair(documentType, documentTypeUIModels.getIdDocModel$onfido_capture_sdk_core_release()), new Pair(documentType2, documentTypeUIModels.getDrivingLicenseDocModel$onfido_capture_sdk_core_release()), new Pair(DocumentType.RESIDENCE_PERMIT, documentTypeUIModels.getResidencePermitDocModel$onfido_capture_sdk_core_release()), new Pair(DocumentType.VISA, documentTypeUIModels.getVisaDocModel$onfido_capture_sdk_core_release()), new Pair(DocumentType.WORK_PERMIT, documentTypeUIModels.getWorkPermitDocModel$onfido_capture_sdk_core_release()), new Pair(DocumentType.GENERIC, documentTypeUIModels.getGenericDocModel$onfido_capture_sdk_core_release()), new Pair(DocumentType.PASSPORT_CARD, documentTypeUIModels.getGenericDocModel$onfido_capture_sdk_core_release()));
        commonDocTypeModels = mapK5;
        commonDocFormatModels = r0.k(new Pair(documentFormat2, mapK5), new Pair(documentFormat, mapK5));
        docFormatModels = r0.k(new Pair(CountryCode.IT, mapK), new Pair(CountryCode.ZA, mapK2), new Pair(CountryCode.FR, mapK3), new Pair(CountryCode.DE, mapK4));
    }

    private DocumentUITextModelMapper() {
    }

    private final DocumentTypeUIModel foldedDocModel(Integer label) {
        return new DocumentTypeUIModel(label, R.string.onfido_doc_capture_header_folded_doc_front, R.string.onfido_doc_capture_header_folded_doc_back, R.string.onfido_doc_capture_detail_folded_doc_front, R.string.onfido_doc_capture_detail_folded_doc_back, R.string.onfido_doc_confirmation_body_folded_doc, R.string.onfido_doc_confirmation_button_primary_folded_doc, R.string.onfido_doc_confirmation_button_secondary_folded_doc, 0, 256, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel getDocModel(com.onfido.android.sdk.capture.DocumentType r4, com.onfido.android.sdk.capture.DocumentFormat r5, com.onfido.android.sdk.capture.utils.CountryCode r6) {
        /*
            r3 = this;
            com.onfido.android.sdk.capture.utils.CountryCode r0 = com.onfido.android.sdk.capture.utils.CountryCode.IT
            com.onfido.android.sdk.capture.utils.CountryCode r1 = com.onfido.android.sdk.capture.utils.CountryCode.ZA
            com.onfido.android.sdk.capture.utils.CountryCode[] r0 = new com.onfido.android.sdk.capture.utils.CountryCode[]{r0, r1}
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Set r0 = kotlin.collections.d.y0(r0)
            boolean r0 = zhm.d0.T(r0, r6)
            if (r0 == 0) goto L1c
            com.onfido.android.sdk.capture.DocumentType r0 = com.onfido.android.sdk.capture.DocumentType.NATIONAL_IDENTITY_CARD
            if (r4 != r0) goto L1c
            goto L35
        L1c:
            com.onfido.android.sdk.capture.utils.CountryCode r0 = com.onfido.android.sdk.capture.utils.CountryCode.FR
            com.onfido.android.sdk.capture.utils.CountryCode r2 = com.onfido.android.sdk.capture.utils.CountryCode.DE
            com.onfido.android.sdk.capture.utils.CountryCode[] r0 = new com.onfido.android.sdk.capture.utils.CountryCode[]{r0, r2}
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Set r0 = kotlin.collections.d.y0(r0)
            boolean r0 = zhm.d0.T(r0, r6)
            if (r0 == 0) goto L3e
            com.onfido.android.sdk.capture.DocumentType r0 = com.onfido.android.sdk.capture.DocumentType.DRIVING_LICENCE
            if (r4 != r0) goto L3e
        L35:
            java.util.Map<com.onfido.android.sdk.capture.utils.CountryCode, java.util.Map<com.onfido.android.sdk.capture.DocumentFormat, java.util.Map<com.onfido.android.sdk.capture.DocumentType, com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel>>> r0 = com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper.docFormatModels
            java.lang.Object r0 = r0.get(r6)
            java.util.Map r0 = (java.util.Map) r0
            goto L40
        L3e:
            java.util.Map<com.onfido.android.sdk.capture.DocumentFormat, java.util.Map<com.onfido.android.sdk.capture.DocumentType, com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel>> r0 = com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper.commonDocFormatModels
        L40:
            if (r0 == 0) goto L49
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            goto L4a
        L49:
            r5 = 0
        L4a:
            if (r5 == 0) goto L55
            java.lang.Object r5 = r5.get(r4)
            com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel r5 = (com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel) r5
            if (r5 == 0) goto L55
            return r5
        L55:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No UI model found for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " of "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.model.DocumentUITextModelMapper.getDocModel(com.onfido.android.sdk.capture.DocumentType, com.onfido.android.sdk.capture.DocumentFormat, com.onfido.android.sdk.capture.utils.CountryCode):com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel");
    }

    public static /* synthetic */ DocumentTypeUIModel getDocModel$default(DocumentUITextModelMapper documentUITextModelMapper, DocumentType documentType, DocumentFormat documentFormat, CountryCode countryCode, int i, Object obj2) {
        if ((i & 4) != 0) {
            countryCode = null;
        }
        return documentUITextModelMapper.getDocModel(documentType, documentFormat, countryCode);
    }

    public static /* synthetic */ DocumentTypeUIModel toDocumentUIModel$default(DocumentUITextModelMapper documentUITextModelMapper, DocumentType documentType, DocumentFormat documentFormat, CountryCode countryCode, boolean z, boolean z3, boolean z4, int i, Object obj2) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        return documentUITextModelMapper.toDocumentUIModel(documentType, documentFormat, countryCode, z, z3, z4);
    }

    @NotNull
    public final DocumentTypeUIModel toDocumentUIModel(@NotNull DocumentType documentType, DocumentFormat documentFormat, CountryCode countryCode, boolean z, boolean z3, boolean z4) {
        DocumentTypeUIModel docModel;
        Intrinsics.checkNotNullParameter(documentType, "<this>");
        if (z3) {
            docModel = DocumentTypeUIModels.INSTANCE.getProofOfAddressDocModel$onfido_capture_sdk_core_release();
        } else {
            docModel = getDocModel(documentType, documentFormat == null ? DocumentFormat.CARD : documentFormat, countryCode);
        }
        DocumentTypeUIModel documentTypeUIModelCopy$default = docModel;
        if (z) {
            documentTypeUIModelCopy$default = DocumentTypeUIModel.copy$default(documentTypeUIModelCopy$default, null, documentType == DocumentType.PASSPORT ? R.string.onfido_doc_capture_header_live_guidance_intro_pp_photo : R.string.onfido_doc_capture_header_live_guidance_intro_doc_front, R.string.onfido_doc_capture_header_live_guidance_intro_doc_back, 0, 0, 0, 0, 0, 0, 505, null);
        }
        DocumentTypeUIModel documentTypeUIModel = documentTypeUIModelCopy$default;
        return (z4 && documentType == DocumentType.PASSPORT) ? DocumentTypeUIModel.copy$default(documentTypeUIModel, null, 0, R.string.onfido_doc_capture_header_address_page, 0, R.string.onfido_doc_capture_description_address_page, 0, 0, 0, 0, 491, null) : documentTypeUIModel;
    }
}
