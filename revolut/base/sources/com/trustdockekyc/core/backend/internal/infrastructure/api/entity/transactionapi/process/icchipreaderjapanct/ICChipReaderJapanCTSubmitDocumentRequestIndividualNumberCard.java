package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.icchipreaderjapanct;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import k1m.i;
import k1m.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@m(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;", "", "", "expireDate", "cardPrintInfoAllRawData", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/trustdockekyc/core/backend/internal/infrastructure/api/entity/transactionapi/process/icchipreaderjapanct/ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard;", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107489b;

    public ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard(@i(name = "expire_date") @NotNull String expireDate, @i(name = "card_print_info_all_raw_data") @NotNull String cardPrintInfoAllRawData) {
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cardPrintInfoAllRawData, "cardPrintInfoAllRawData");
        this.f107488a = expireDate;
        this.f107489b = cardPrintInfoAllRawData;
    }

    @NotNull
    public final ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard copy(@i(name = "expire_date") @NotNull String expireDate, @i(name = "card_print_info_all_raw_data") @NotNull String cardPrintInfoAllRawData) {
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        Intrinsics.checkNotNullParameter(cardPrintInfoAllRawData, "cardPrintInfoAllRawData");
        return new ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard(expireDate, cardPrintInfoAllRawData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard)) {
            return false;
        }
        ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard = (ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard) obj2;
        return Intrinsics.f(this.f107488a, iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard.f107488a) && Intrinsics.f(this.f107489b, iCChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard.f107489b);
    }

    public final int hashCode() {
        return this.f107489b.hashCode() + (this.f107488a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ICChipReaderJapanCTSubmitDocumentRequestIndividualNumberCard(expireDate=");
        sb6.append(this.f107488a);
        sb6.append(", cardPrintInfoAllRawData=");
        return a.u(sb6, this.f107489b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
