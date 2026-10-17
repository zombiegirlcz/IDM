package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "documentType", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;", "driversLicense", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;", "residenceCard", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;", "specialPermanentResidentCertificate", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;", "individualNumberCard", "", "valid", "<init>", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;Z)V", "copy", "(Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;Z)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTSubmittedDocument {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICChipReaderJapanCTDocumentType f107497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICChipReaderJapanCTDocumentDriversLicense f107498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ICChipReaderJapanCTDocumentResidenceCard f107499c;
    public final ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate d;
    public final ICChipReaderJapanCTDocumentIndividualNumberCard e;
    public final boolean f;

    public ICChipReaderJapanCTSubmittedDocument(@i(name = "document_type") @NotNull ICChipReaderJapanCTDocumentType documentType, @i(name = "drivers_license") ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense, @i(name = "residence_card") ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard, @i(name = "special_permanent_resident_certificate") ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate, @i(name = "individual_number_card") ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard, @i(name = "valid") boolean z) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f107497a = documentType;
        this.f107498b = iCChipReaderJapanCTDocumentDriversLicense;
        this.f107499c = iCChipReaderJapanCTDocumentResidenceCard;
        this.d = iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;
        this.e = iCChipReaderJapanCTDocumentIndividualNumberCard;
        this.f = z;
    }

    @NotNull
    public final ICChipReaderJapanCTSubmittedDocument copy(@i(name = "document_type") @NotNull ICChipReaderJapanCTDocumentType documentType, @i(name = "drivers_license") ICChipReaderJapanCTDocumentDriversLicense driversLicense, @i(name = "residence_card") ICChipReaderJapanCTDocumentResidenceCard residenceCard, @i(name = "special_permanent_resident_certificate") ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate specialPermanentResidentCertificate, @i(name = "individual_number_card") ICChipReaderJapanCTDocumentIndividualNumberCard individualNumberCard, @i(name = "valid") boolean valid) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return new ICChipReaderJapanCTSubmittedDocument(documentType, driversLicense, residenceCard, specialPermanentResidentCertificate, individualNumberCard, valid);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTSubmittedDocument)) {
            return false;
        }
        ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument = (ICChipReaderJapanCTSubmittedDocument) obj2;
        return this.f107497a == iCChipReaderJapanCTSubmittedDocument.f107497a && Intrinsics.f(this.f107498b, iCChipReaderJapanCTSubmittedDocument.f107498b) && Intrinsics.f(this.f107499c, iCChipReaderJapanCTSubmittedDocument.f107499c) && Intrinsics.f(this.d, iCChipReaderJapanCTSubmittedDocument.d) && Intrinsics.f(this.e, iCChipReaderJapanCTSubmittedDocument.e) && this.f == iCChipReaderJapanCTSubmittedDocument.f;
    }

    public final int hashCode() {
        int iHashCode = this.f107497a.hashCode() * 31;
        ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense = this.f107498b;
        int iHashCode2 = (iHashCode + (iCChipReaderJapanCTDocumentDriversLicense == null ? 0 : iCChipReaderJapanCTDocumentDriversLicense.hashCode())) * 31;
        ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard = this.f107499c;
        int iHashCode3 = (iHashCode2 + (iCChipReaderJapanCTDocumentResidenceCard == null ? 0 : iCChipReaderJapanCTDocumentResidenceCard.hashCode())) * 31;
        ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate = this.d;
        int iHashCode4 = (iHashCode3 + (iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate == null ? 0 : iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate.hashCode())) * 31;
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (iCChipReaderJapanCTDocumentIndividualNumberCard != null ? iCChipReaderJapanCTDocumentIndividualNumberCard.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTSubmittedDocument(documentType=");
        sb6.append(this.f107497a);
        sb6.append(", driversLicense=");
        sb6.append(this.f107498b);
        sb6.append(", residenceCard=");
        sb6.append(this.f107499c);
        sb6.append(", specialPermanentResidentCertificate=");
        sb6.append(this.d);
        sb6.append(", individualNumberCard=");
        sb6.append(this.e);
        sb6.append(", valid=");
        return a.x(sb6, this.f, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ICChipReaderJapanCTSubmittedDocument(ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType, ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense, ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard, ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate, ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard2;
        iCChipReaderJapanCTDocumentDriversLicense = (i & 2) != 0 ? null : iCChipReaderJapanCTDocumentDriversLicense;
        iCChipReaderJapanCTDocumentResidenceCard = (i & 4) != 0 ? null : iCChipReaderJapanCTDocumentResidenceCard;
        iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate = (i & 8) != 0 ? null : iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;
        if ((i & 16) != 0) {
            z3 = z;
            iCChipReaderJapanCTDocumentIndividualNumberCard2 = null;
        } else {
            z3 = z;
            iCChipReaderJapanCTDocumentIndividualNumberCard2 = iCChipReaderJapanCTDocumentIndividualNumberCard;
        }
        this(iCChipReaderJapanCTDocumentType, iCChipReaderJapanCTDocumentDriversLicense, iCChipReaderJapanCTDocumentResidenceCard, iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate, iCChipReaderJapanCTDocumentIndividualNumberCard2, z3);
    }
}
