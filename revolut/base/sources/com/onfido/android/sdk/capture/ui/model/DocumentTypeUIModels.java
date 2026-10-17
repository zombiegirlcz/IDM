package com.onfido.android.sdk.capture.ui.model;

import com.onfido.android.sdk.capture.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModels;", "", "()V", "drivingLicenseDocModel", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "getDrivingLicenseDocModel$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "genericDocModel", "getGenericDocModel$onfido_capture_sdk_core_release", "idDocModel", "getIdDocModel$onfido_capture_sdk_core_release", "passportDocModel", "getPassportDocModel$onfido_capture_sdk_core_release", "proofOfAddressDocModel", "getProofOfAddressDocModel$onfido_capture_sdk_core_release", "residencePermitDocModel", "getResidencePermitDocModel$onfido_capture_sdk_core_release", "visaDocModel", "getVisaDocModel$onfido_capture_sdk_core_release", "workPermitDocModel", "getWorkPermitDocModel$onfido_capture_sdk_core_release", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DocumentTypeUIModels {

    @NotNull
    public static final DocumentTypeUIModels INSTANCE = new DocumentTypeUIModels();

    @NotNull
    private static final DocumentTypeUIModel drivingLicenseDocModel;

    @NotNull
    private static final DocumentTypeUIModel genericDocModel;

    @NotNull
    private static final DocumentTypeUIModel idDocModel;

    @NotNull
    private static final DocumentTypeUIModel passportDocModel;

    @NotNull
    private static final DocumentTypeUIModel proofOfAddressDocModel;

    @NotNull
    private static final DocumentTypeUIModel residencePermitDocModel;

    @NotNull
    private static final DocumentTypeUIModel visaDocModel;

    @NotNull
    private static final DocumentTypeUIModel workPermitDocModel;

    static {
        int i = R.string.onfido_doc_capture_header_passport;
        int i2 = R.string.onfido_doc_capture_detail_passport;
        passportDocModel = new DocumentTypeUIModel(null, i, i, i2, i2, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_passport, R.string.onfido_doc_confirmation_button_secondary_passport, R.drawable.onfido_passport);
        idDocModel = new DocumentTypeUIModel(null, R.string.onfido_doc_capture_header_id_front, R.string.onfido_doc_capture_header_id_back, R.string.onfido_doc_capture_detail_id_front, R.string.onfido_doc_capture_detail_id_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_id, R.string.onfido_doc_confirmation_button_secondary_id, R.drawable.onfido_national_id);
        drivingLicenseDocModel = new DocumentTypeUIModel(null, R.string.onfido_doc_capture_header_license_front, R.string.onfido_doc_capture_header_license_back, R.string.onfido_doc_capture_detail_license_front, R.string.onfido_doc_capture_detail_license_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_license, R.string.onfido_doc_confirmation_button_secondary_license, R.drawable.onfido_driving_licence);
        residencePermitDocModel = new DocumentTypeUIModel(null, R.string.onfido_doc_capture_header_permit_front, R.string.onfido_doc_capture_header_permit_back, R.string.onfido_doc_capture_detail_permit_front, R.string.onfido_doc_capture_detail_permit_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_permit, R.string.onfido_doc_confirmation_button_secondary_permit, R.drawable.onfido_ic_residence_card);
        int i3 = R.string.onfido_doc_capture_header_visa_front;
        visaDocModel = new DocumentTypeUIModel(null, i3, i3, R.string.onfido_doc_capture_detail_visa_front, R.string.onfido_doc_capture_detail_visa_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_visa, R.string.onfido_doc_confirmation_button_secondary_visa, 0, 256, null);
        workPermitDocModel = new DocumentTypeUIModel(null, R.string.onfido_doc_capture_header_permit_work_front, R.string.onfido_doc_capture_header_permit_work_back, R.string.onfido_doc_capture_detail_permit_work_front, R.string.onfido_doc_capture_detail_permit_work_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_permit_work, R.string.onfido_doc_confirmation_button_secondary_permit_work, 0, 256, null);
        genericDocModel = new DocumentTypeUIModel(null, R.string.onfido_doc_capture_header_generic_front, R.string.onfido_doc_capture_header_generic_back, R.string.onfido_doc_capture_detail_generic_front, R.string.onfido_doc_capture_detail_generic_back, R.string.onfido_doc_confirmation_body_generic, R.string.onfido_doc_confirmation_button_primary_generic, R.string.onfido_doc_confirmation_button_secondary_generic, 0, 256, null);
        int i5 = R.string.onfido_poa_capture_instructions;
        int i6 = R.string.onfido_poa_doc_capture_empty;
        proofOfAddressDocModel = new DocumentTypeUIModel(null, i5, i6, i6, i6, i6, i6, i6, 0, 256, null);
    }

    private DocumentTypeUIModels() {
    }

    @NotNull
    public final DocumentTypeUIModel getDrivingLicenseDocModel$onfido_capture_sdk_core_release() {
        return drivingLicenseDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getGenericDocModel$onfido_capture_sdk_core_release() {
        return genericDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getIdDocModel$onfido_capture_sdk_core_release() {
        return idDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getPassportDocModel$onfido_capture_sdk_core_release() {
        return passportDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getProofOfAddressDocModel$onfido_capture_sdk_core_release() {
        return proofOfAddressDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getResidencePermitDocModel$onfido_capture_sdk_core_release() {
        return residencePermitDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getVisaDocModel$onfido_capture_sdk_core_release() {
        return visaDocModel;
    }

    @NotNull
    public final DocumentTypeUIModel getWorkPermitDocModel$onfido_capture_sdk_core_release() {
        return workPermitDocModel;
    }
}
