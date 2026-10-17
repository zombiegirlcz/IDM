package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBody;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "documentType", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;", "signatureVerifyingParams", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;", "driversLicense", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;", "residenceCard", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;", "specialPermanentResidentCertificate", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;", "individualNumberCard", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBody;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PostIcChipReaderJapanCtProcessesDocumentRequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICChipReaderJapanCTDocumentType f107500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTDocumentSignatureVerifyingParams f107501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICChipReaderJapanCTSubmitDocumentRequestDriversLicense f107502c;
    public final ICChipReaderJapanCTSubmitDocumentRequestResidenceCard d;
    public final ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate e;
    public final ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard f;

    public PostIcChipReaderJapanCtProcessesDocumentRequestBody(@i(name = "document_type") @NotNull ICChipReaderJapanCTDocumentType documentType, @i(name = "signature_verifying_params") @NotNull ICChipReaderJapanCTDocumentSignatureVerifyingParams signatureVerifyingParams, @i(name = "drivers_license") ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense, @i(name = "residence_card") ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard, @i(name = "special_permanent_resident_certificate") ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate, @i(name = "individual_number_card") ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        this.f107500a = documentType;
        this.f107501b = signatureVerifyingParams;
        this.f107502c = iCChipReaderJapanCTSubmitDocumentRequestDriversLicense;
        this.d = iCChipReaderJapanCTSubmitDocumentRequestResidenceCard;
        this.e = iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;
        this.f = iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;
    }

    @NotNull
    public final PostIcChipReaderJapanCtProcessesDocumentRequestBody copy(@i(name = "document_type") @NotNull ICChipReaderJapanCTDocumentType documentType, @i(name = "signature_verifying_params") @NotNull ICChipReaderJapanCTDocumentSignatureVerifyingParams signatureVerifyingParams, @i(name = "drivers_license") ICChipReaderJapanCTSubmitDocumentRequestDriversLicense driversLicense, @i(name = "residence_card") ICChipReaderJapanCTSubmitDocumentRequestResidenceCard residenceCard, @i(name = "special_permanent_resident_certificate") ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate specialPermanentResidentCertificate, @i(name = "individual_number_card") ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard individualNumberCard) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(signatureVerifyingParams, "signatureVerifyingParams");
        return new PostIcChipReaderJapanCtProcessesDocumentRequestBody(documentType, signatureVerifyingParams, driversLicense, residenceCard, specialPermanentResidentCertificate, individualNumberCard);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PostIcChipReaderJapanCtProcessesDocumentRequestBody)) {
            return false;
        }
        PostIcChipReaderJapanCtProcessesDocumentRequestBody postIcChipReaderJapanCtProcessesDocumentRequestBody = (PostIcChipReaderJapanCtProcessesDocumentRequestBody) obj2;
        return this.f107500a == postIcChipReaderJapanCtProcessesDocumentRequestBody.f107500a && Intrinsics.f(this.f107501b, postIcChipReaderJapanCtProcessesDocumentRequestBody.f107501b) && Intrinsics.f(this.f107502c, postIcChipReaderJapanCtProcessesDocumentRequestBody.f107502c) && Intrinsics.f(this.d, postIcChipReaderJapanCtProcessesDocumentRequestBody.d) && Intrinsics.f(this.e, postIcChipReaderJapanCtProcessesDocumentRequestBody.e) && Intrinsics.f(this.f, postIcChipReaderJapanCtProcessesDocumentRequestBody.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f107501b.hashCode() + (this.f107500a.hashCode() * 31)) * 31;
        ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense = this.f107502c;
        int iHashCode2 = (iHashCode + (iCChipReaderJapanCTSubmitDocumentRequestDriversLicense == null ? 0 : iCChipReaderJapanCTSubmitDocumentRequestDriversLicense.hashCode())) * 31;
        ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard = this.d;
        int iHashCode3 = (iHashCode2 + (iCChipReaderJapanCTSubmitDocumentRequestResidenceCard == null ? 0 : iCChipReaderJapanCTSubmitDocumentRequestResidenceCard.hashCode())) * 31;
        ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate = this.e;
        int iHashCode4 = (iHashCode3 + (iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate == null ? 0 : iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.hashCode())) * 31;
        ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard = this.f;
        return iHashCode4 + (iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard != null ? iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard.hashCode() : 0);
    }

    public final String toString() {
        return "PostIcChipReaderJapanCtProcessesDocumentRequestBody(documentType=" + this.f107500a + ", signatureVerifyingParams=" + this.f107501b + ", driversLicense=" + this.f107502c + ", residenceCard=" + this.d + ", specialPermanentResidentCertificate=" + this.e + ", individualNumberCard=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PostIcChipReaderJapanCtProcessesDocumentRequestBody(ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType, ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams, ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense, ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard, ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate, ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iCChipReaderJapanCTDocumentType, iCChipReaderJapanCTDocumentSignatureVerifyingParams, (i & 4) != 0 ? null : iCChipReaderJapanCTSubmitDocumentRequestDriversLicense, (i & 8) != 0 ? null : iCChipReaderJapanCTSubmitDocumentRequestResidenceCard, (i & 16) != 0 ? null : iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate, (i & 32) != 0 ? null : iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard);
    }
}
