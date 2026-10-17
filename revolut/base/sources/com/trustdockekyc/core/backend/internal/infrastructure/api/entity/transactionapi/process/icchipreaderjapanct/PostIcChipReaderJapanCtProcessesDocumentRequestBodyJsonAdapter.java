package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import k1m.e0;
import k1m.l;
import k1m.o;
import k1m.q;
import k1m.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1m.b;
import ngm.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBodyJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/PostIcChipReaderJapanCtProcessesDocumentRequestBody;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "iCChipReaderJapanCTDocumentTypeAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSignatureVerifyingParams;", "iCChipReaderJapanCTDocumentSignatureVerifyingParamsAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestDriversLicense;", "nullableICChipReaderJapanCTSubmitDocumentRequestDriversLicenseAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestResidenceCard;", "nullableICChipReaderJapanCTSubmitDocumentRequestResidenceCardAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;", "nullableICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificateAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;", "nullableICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCardAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostIcChipReaderJapanCtProcessesDocumentRequestBodyJsonAdapter extends l {
    private volatile Constructor<PostIcChipReaderJapanCtProcessesDocumentRequestBody> constructorRef;

    @NotNull
    private final l iCChipReaderJapanCTDocumentSignatureVerifyingParamsAdapter;

    @NotNull
    private final l iCChipReaderJapanCTDocumentTypeAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTSubmitDocumentRequestDriversLicenseAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCardAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTSubmitDocumentRequestResidenceCardAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificateAdapter;

    @NotNull
    private final o options;

    public PostIcChipReaderJapanCtProcessesDocumentRequestBodyJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"document_type", "signature_verifying_params", "drivers_license", "residence_card", "special_permanent_resident_certificate", "individual_number_card"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.iCChipReaderJapanCTDocumentTypeAdapter = n.a(moshi, ICChipReaderJapanCTDocumentType.class, "documentType");
        this.iCChipReaderJapanCTDocumentSignatureVerifyingParamsAdapter = n.a(moshi, ICChipReaderJapanCTDocumentSignatureVerifyingParams.class, "signatureVerifyingParams");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestDriversLicenseAdapter = n.a(moshi, ICChipReaderJapanCTSubmitDocumentRequestDriversLicense.class, "driversLicense");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestResidenceCardAdapter = n.a(moshi, ICChipReaderJapanCTSubmitDocumentRequestResidenceCard.class, "residenceCard");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificateAdapter = n.a(moshi, ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.class, "specialPermanentResidentCertificate");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCardAdapter = n.a(moshi, ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard.class, "individualNumberCard");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType = null;
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams = null;
        ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense = null;
        ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard = null;
        ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate = null;
        ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard = null;
        while (reader.i()) {
            switch (reader.p(this.options)) {
                case -1:
                    reader.q();
                    reader.r();
                    break;
                case 0:
                    iCChipReaderJapanCTDocumentType = (ICChipReaderJapanCTDocumentType) this.iCChipReaderJapanCTDocumentTypeAdapter.a(reader);
                    if (iCChipReaderJapanCTDocumentType == null) {
                        JsonDataException jsonDataExceptionJ = b.j("documentType", "document_type", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ, "unexpectedNull(...)");
                        throw jsonDataExceptionJ;
                    }
                    break;
                    break;
                case 1:
                    iCChipReaderJapanCTDocumentSignatureVerifyingParams = (ICChipReaderJapanCTDocumentSignatureVerifyingParams) this.iCChipReaderJapanCTDocumentSignatureVerifyingParamsAdapter.a(reader);
                    if (iCChipReaderJapanCTDocumentSignatureVerifyingParams == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("signatureVerifyingParams", "signature_verifying_params", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    break;
                    break;
                case 2:
                    iCChipReaderJapanCTSubmitDocumentRequestDriversLicense = (ICChipReaderJapanCTSubmitDocumentRequestDriversLicense) this.nullableICChipReaderJapanCTSubmitDocumentRequestDriversLicenseAdapter.a(reader);
                    i &= -5;
                    break;
                case 3:
                    iCChipReaderJapanCTSubmitDocumentRequestResidenceCard = (ICChipReaderJapanCTSubmitDocumentRequestResidenceCard) this.nullableICChipReaderJapanCTSubmitDocumentRequestResidenceCardAdapter.a(reader);
                    i &= -9;
                    break;
                case 4:
                    iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate = (ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate) this.nullableICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificateAdapter.a(reader);
                    i &= -17;
                    break;
                case 5:
                    iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard = (ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard) this.nullableICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCardAdapter.a(reader);
                    i &= -33;
                    break;
            }
        }
        reader.h();
        if (i == -61) {
            ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard2 = iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;
            ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate2 = iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;
            ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard2 = iCChipReaderJapanCTSubmitDocumentRequestResidenceCard;
            ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense2 = iCChipReaderJapanCTSubmitDocumentRequestDriversLicense;
            ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams2 = iCChipReaderJapanCTDocumentSignatureVerifyingParams;
            ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType2 = iCChipReaderJapanCTDocumentType;
            if (iCChipReaderJapanCTDocumentType2 == null) {
                JsonDataException jsonDataExceptionE = b.e("documentType", "document_type", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (iCChipReaderJapanCTDocumentSignatureVerifyingParams2 != null) {
                return new PostIcChipReaderJapanCtProcessesDocumentRequestBody(iCChipReaderJapanCTDocumentType2, iCChipReaderJapanCTDocumentSignatureVerifyingParams2, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense2, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard2, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate2, iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard2);
            }
            JsonDataException jsonDataExceptionE2 = b.e("signatureVerifyingParams", "signature_verifying_params", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard3 = iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;
        ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate3 = iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate;
        ICChipReaderJapanCTSubmitDocumentRequestResidenceCard iCChipReaderJapanCTSubmitDocumentRequestResidenceCard3 = iCChipReaderJapanCTSubmitDocumentRequestResidenceCard;
        ICChipReaderJapanCTSubmitDocumentRequestDriversLicense iCChipReaderJapanCTSubmitDocumentRequestDriversLicense3 = iCChipReaderJapanCTSubmitDocumentRequestDriversLicense;
        ICChipReaderJapanCTDocumentSignatureVerifyingParams iCChipReaderJapanCTDocumentSignatureVerifyingParams3 = iCChipReaderJapanCTDocumentSignatureVerifyingParams;
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType3 = iCChipReaderJapanCTDocumentType;
        Constructor<PostIcChipReaderJapanCtProcessesDocumentRequestBody> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = PostIcChipReaderJapanCtProcessesDocumentRequestBody.class.getDeclaredConstructor(ICChipReaderJapanCTDocumentType.class, ICChipReaderJapanCTDocumentSignatureVerifyingParams.class, ICChipReaderJapanCTSubmitDocumentRequestDriversLicense.class, ICChipReaderJapanCTSubmitDocumentRequestResidenceCard.class, ICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate.class, ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard.class, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<PostIcChipReaderJapanCtProcessesDocumentRequestBody> constructor = declaredConstructor;
        if (iCChipReaderJapanCTDocumentType3 == null) {
            JsonDataException jsonDataExceptionE3 = b.e("documentType", "document_type", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (iCChipReaderJapanCTDocumentSignatureVerifyingParams3 != null) {
            PostIcChipReaderJapanCtProcessesDocumentRequestBody postIcChipReaderJapanCtProcessesDocumentRequestBodyNewInstance = constructor.newInstance(iCChipReaderJapanCTDocumentType3, iCChipReaderJapanCTDocumentSignatureVerifyingParams3, iCChipReaderJapanCTSubmitDocumentRequestDriversLicense3, iCChipReaderJapanCTSubmitDocumentRequestResidenceCard3, iCChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificate3, iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(postIcChipReaderJapanCtProcessesDocumentRequestBodyNewInstance, "newInstance(...)");
            return postIcChipReaderJapanCtProcessesDocumentRequestBodyNewInstance;
        }
        JsonDataException jsonDataExceptionE4 = b.e("signatureVerifyingParams", "signature_verifying_params", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        PostIcChipReaderJapanCtProcessesDocumentRequestBody postIcChipReaderJapanCtProcessesDocumentRequestBody = (PostIcChipReaderJapanCtProcessesDocumentRequestBody) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (postIcChipReaderJapanCtProcessesDocumentRequestBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("document_type");
        this.iCChipReaderJapanCTDocumentTypeAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.f107500a);
        writer.h("signature_verifying_params");
        this.iCChipReaderJapanCTDocumentSignatureVerifyingParamsAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.f107501b);
        writer.h("drivers_license");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestDriversLicenseAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.f107502c);
        writer.h("residence_card");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestResidenceCardAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.d);
        writer.h("special_permanent_resident_certificate");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestSpecialPermanentResidentCertificateAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.e);
        writer.h("individual_number_card");
        this.nullableICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCardAdapter.c(writer, postIcChipReaderJapanCtProcessesDocumentRequestBody.f);
        writer.g();
    }

    public final String toString() {
        return l9.l.a(73, "GeneratedJsonAdapter(PostIcChipReaderJapanCtProcessesDocumentRequestBody)");
    }
}
