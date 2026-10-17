package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "", "", "index", "", "Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDriversLicenseRawExternalCharacter;", "externalCharacters", "<init>", "(ILjava/util/List;)V", "copy", "(ILjava/util/List;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f107438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107439b;

    public ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters(@i(name = "index") int i, @i(name = "external_characters") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharacters) {
        Intrinsics.checkNotNullParameter(externalCharacters, "externalCharacters");
        this.f107438a = i;
        this.f107439b = externalCharacters;
    }

    @NotNull
    public final ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters copy(@i(name = "index") int index, @i(name = "external_characters") @NotNull List<ICChipReaderJapanCTDriversLicenseRawExternalCharacter> externalCharacters) {
        Intrinsics.checkNotNullParameter(externalCharacters, "externalCharacters");
        return new ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters(index, externalCharacters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters)) {
            return false;
        }
        ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters = (ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters) obj2;
        return this.f107438a == iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.f107438a && Intrinsics.f(this.f107439b, iCChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters.f107439b);
    }

    public final int hashCode() {
        return this.f107439b.hashCode() + (Integer.hashCode(this.f107438a) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTDocumentDriversLicenseMultipleAndRawExternalCharacters(index=");
        sb6.append(this.f107438a);
        sb6.append(", externalCharacters=");
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f107439b, sb6);
    }
}
