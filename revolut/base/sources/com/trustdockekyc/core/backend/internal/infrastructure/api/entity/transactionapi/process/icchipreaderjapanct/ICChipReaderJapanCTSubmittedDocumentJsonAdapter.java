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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocumentJsonAdapter;", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmittedDocument;", "Lk1m/e0;", "moshi", "<init>", "(Lk1m/e0;)V", "Lk1m/o;", "options", "Lk1m/o;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentType;", "iCChipReaderJapanCTDocumentTypeAdapter", "Lk1m/l;", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicense;", "nullableICChipReaderJapanCTDocumentDriversLicenseAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentResidenceCard;", "nullableICChipReaderJapanCTDocumentResidenceCardAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;", "nullableICChipReaderJapanCTDocumentSpecialPermanentResidentCertificateAdapter", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentIndividualNumberCard;", "nullableICChipReaderJapanCTDocumentIndividualNumberCardAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ICChipReaderJapanCTSubmittedDocumentJsonAdapter extends l {

    @NotNull
    private final l booleanAdapter;
    private volatile Constructor<ICChipReaderJapanCTSubmittedDocument> constructorRef;

    @NotNull
    private final l iCChipReaderJapanCTDocumentTypeAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDocumentDriversLicenseAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDocumentIndividualNumberCardAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDocumentResidenceCardAdapter;

    @NotNull
    private final l nullableICChipReaderJapanCTDocumentSpecialPermanentResidentCertificateAdapter;

    @NotNull
    private final o options;

    public ICChipReaderJapanCTSubmittedDocumentJsonAdapter(@NotNull e0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        o oVarA = o.a(new String[]{"document_type", "drivers_license", "residence_card", "special_permanent_resident_certificate", "individual_number_card", "valid"});
        Intrinsics.checkNotNullExpressionValue(oVarA, "of(...)");
        this.options = oVarA;
        this.iCChipReaderJapanCTDocumentTypeAdapter = n.a(moshi, ICChipReaderJapanCTDocumentType.class, "documentType");
        this.nullableICChipReaderJapanCTDocumentDriversLicenseAdapter = n.a(moshi, ICChipReaderJapanCTDocumentDriversLicense.class, "driversLicense");
        this.nullableICChipReaderJapanCTDocumentResidenceCardAdapter = n.a(moshi, ICChipReaderJapanCTDocumentResidenceCard.class, "residenceCard");
        this.nullableICChipReaderJapanCTDocumentSpecialPermanentResidentCertificateAdapter = n.a(moshi, ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate.class, "specialPermanentResidentCertificate");
        this.nullableICChipReaderJapanCTDocumentIndividualNumberCardAdapter = n.a(moshi, ICChipReaderJapanCTDocumentIndividualNumberCard.class, "individualNumberCard");
        this.booleanAdapter = n.a(moshi, Boolean.TYPE, "valid");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.squareup.moshi.JsonDataException */
    public final Object a(q reader) throws IllegalAccessException, NoSuchMethodException, JsonDataException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.f();
        int i = -1;
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType = null;
        ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense = null;
        ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard = null;
        ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate = null;
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard = null;
        Boolean bool = null;
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
                    iCChipReaderJapanCTDocumentDriversLicense = (ICChipReaderJapanCTDocumentDriversLicense) this.nullableICChipReaderJapanCTDocumentDriversLicenseAdapter.a(reader);
                    i &= -3;
                    break;
                case 2:
                    iCChipReaderJapanCTDocumentResidenceCard = (ICChipReaderJapanCTDocumentResidenceCard) this.nullableICChipReaderJapanCTDocumentResidenceCardAdapter.a(reader);
                    i &= -5;
                    break;
                case 3:
                    iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate = (ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate) this.nullableICChipReaderJapanCTDocumentSpecialPermanentResidentCertificateAdapter.a(reader);
                    i &= -9;
                    break;
                case 4:
                    iCChipReaderJapanCTDocumentIndividualNumberCard = (ICChipReaderJapanCTDocumentIndividualNumberCard) this.nullableICChipReaderJapanCTDocumentIndividualNumberCardAdapter.a(reader);
                    i &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.booleanAdapter.a(reader);
                    if (bool == null) {
                        JsonDataException jsonDataExceptionJ2 = b.j("valid", "valid", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionJ2, "unexpectedNull(...)");
                        throw jsonDataExceptionJ2;
                    }
                    break;
                    break;
            }
        }
        reader.h();
        if (i == -31) {
            Boolean bool2 = bool;
            ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard2 = iCChipReaderJapanCTDocumentIndividualNumberCard;
            ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate2 = iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;
            ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard2 = iCChipReaderJapanCTDocumentResidenceCard;
            ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense2 = iCChipReaderJapanCTDocumentDriversLicense;
            ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType2 = iCChipReaderJapanCTDocumentType;
            if (iCChipReaderJapanCTDocumentType2 == null) {
                JsonDataException jsonDataExceptionE = b.e("documentType", "document_type", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE, "missingProperty(...)");
                throw jsonDataExceptionE;
            }
            if (bool2 != null) {
                return new ICChipReaderJapanCTSubmittedDocument(iCChipReaderJapanCTDocumentType2, iCChipReaderJapanCTDocumentDriversLicense2, iCChipReaderJapanCTDocumentResidenceCard2, iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate2, iCChipReaderJapanCTDocumentIndividualNumberCard2, bool2.booleanValue());
            }
            JsonDataException jsonDataExceptionE2 = b.e("valid", "valid", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE2, "missingProperty(...)");
            throw jsonDataExceptionE2;
        }
        Boolean bool3 = bool;
        ICChipReaderJapanCTDocumentIndividualNumberCard iCChipReaderJapanCTDocumentIndividualNumberCard3 = iCChipReaderJapanCTDocumentIndividualNumberCard;
        ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate3 = iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate;
        ICChipReaderJapanCTDocumentResidenceCard iCChipReaderJapanCTDocumentResidenceCard3 = iCChipReaderJapanCTDocumentResidenceCard;
        ICChipReaderJapanCTDocumentDriversLicense iCChipReaderJapanCTDocumentDriversLicense3 = iCChipReaderJapanCTDocumentDriversLicense;
        ICChipReaderJapanCTDocumentType iCChipReaderJapanCTDocumentType3 = iCChipReaderJapanCTDocumentType;
        Constructor<ICChipReaderJapanCTSubmittedDocument> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ICChipReaderJapanCTSubmittedDocument.class.getDeclaredConstructor(ICChipReaderJapanCTDocumentType.class, ICChipReaderJapanCTDocumentDriversLicense.class, ICChipReaderJapanCTDocumentResidenceCard.class, ICChipReaderJapanCTDocumentSpecialPermanentResidentCertificate.class, ICChipReaderJapanCTDocumentIndividualNumberCard.class, Boolean.TYPE, Integer.TYPE, b.c);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<ICChipReaderJapanCTSubmittedDocument> constructor = declaredConstructor;
        if (iCChipReaderJapanCTDocumentType3 == null) {
            JsonDataException jsonDataExceptionE3 = b.e("documentType", "document_type", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE3, "missingProperty(...)");
            throw jsonDataExceptionE3;
        }
        if (bool3 != null) {
            ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocumentNewInstance = constructor.newInstance(iCChipReaderJapanCTDocumentType3, iCChipReaderJapanCTDocumentDriversLicense3, iCChipReaderJapanCTDocumentResidenceCard3, iCChipReaderJapanCTDocumentSpecialPermanentResidentCertificate3, iCChipReaderJapanCTDocumentIndividualNumberCard3, bool3, Integer.valueOf(i), null);
            Intrinsics.checkNotNullExpressionValue(iCChipReaderJapanCTSubmittedDocumentNewInstance, "newInstance(...)");
            return iCChipReaderJapanCTSubmittedDocumentNewInstance;
        }
        JsonDataException jsonDataExceptionE4 = b.e("valid", "valid", reader);
        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionE4, "missingProperty(...)");
        throw jsonDataExceptionE4;
    }

    public final void c(t writer, Object obj2) {
        ICChipReaderJapanCTSubmittedDocument iCChipReaderJapanCTSubmittedDocument = (ICChipReaderJapanCTSubmittedDocument) obj2;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (iCChipReaderJapanCTSubmittedDocument == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.f();
        writer.h("document_type");
        this.iCChipReaderJapanCTDocumentTypeAdapter.c(writer, iCChipReaderJapanCTSubmittedDocument.f107497a);
        writer.h("drivers_license");
        this.nullableICChipReaderJapanCTDocumentDriversLicenseAdapter.c(writer, iCChipReaderJapanCTSubmittedDocument.f107498b);
        writer.h("residence_card");
        this.nullableICChipReaderJapanCTDocumentResidenceCardAdapter.c(writer, iCChipReaderJapanCTSubmittedDocument.f107499c);
        writer.h("special_permanent_resident_certificate");
        this.nullableICChipReaderJapanCTDocumentSpecialPermanentResidentCertificateAdapter.c(writer, iCChipReaderJapanCTSubmittedDocument.d);
        writer.h("individual_number_card");
        this.nullableICChipReaderJapanCTDocumentIndividualNumberCardAdapter.c(writer, iCChipReaderJapanCTSubmittedDocument.e);
        writer.h("valid");
        this.booleanAdapter.c(writer, Boolean.valueOf(iCChipReaderJapanCTSubmittedDocument.f));
        writer.g();
    }

    public final String toString() {
        return l9.l.a(58, "GeneratedJsonAdapter(ICChipReaderJapanCTSubmittedDocument)");
    }
}
