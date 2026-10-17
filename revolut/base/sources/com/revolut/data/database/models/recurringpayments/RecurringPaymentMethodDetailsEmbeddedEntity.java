package com.revolut.data.database.models.recurringpayments;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentMethodDetailsEmbeddedEntity;", "", "creditor", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;", "debtor", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;", "documentDescription", "", "documentNumber", "additionalInformation", "", "<init>", "(Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCreditor", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;", "getDebtor", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;", "getDocumentDescription", "()Ljava/lang/String;", "getDocumentNumber", "getAdditionalInformation", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentMethodDetailsEmbeddedEntity {

    @NotNull
    private final List<String> additionalInformation;
    private final RecurringPaymentCreditorEmbeddedEntity creditor;
    private final RecurringPaymentDebtorEmbeddedEntity debtor;
    private final String documentDescription;
    private final String documentNumber;

    public RecurringPaymentMethodDetailsEmbeddedEntity(RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity, RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity, String str, String str2, @NotNull List<String> additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        this.creditor = recurringPaymentCreditorEmbeddedEntity;
        this.debtor = recurringPaymentDebtorEmbeddedEntity;
        this.documentDescription = str;
        this.documentNumber = str2;
        this.additionalInformation = additionalInformation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPaymentMethodDetailsEmbeddedEntity copy$default(RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntity, RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity, RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity, String str, String str2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            recurringPaymentCreditorEmbeddedEntity = recurringPaymentMethodDetailsEmbeddedEntity.creditor;
        }
        if ((i & 2) != 0) {
            recurringPaymentDebtorEmbeddedEntity = recurringPaymentMethodDetailsEmbeddedEntity.debtor;
        }
        if ((i & 4) != 0) {
            str = recurringPaymentMethodDetailsEmbeddedEntity.documentDescription;
        }
        if ((i & 8) != 0) {
            str2 = recurringPaymentMethodDetailsEmbeddedEntity.documentNumber;
        }
        if ((i & 16) != 0) {
            list = recurringPaymentMethodDetailsEmbeddedEntity.additionalInformation;
        }
        List list2 = list;
        String str3 = str;
        return recurringPaymentMethodDetailsEmbeddedEntity.copy(recurringPaymentCreditorEmbeddedEntity, recurringPaymentDebtorEmbeddedEntity, str3, str2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecurringPaymentCreditorEmbeddedEntity getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentDebtorEmbeddedEntity getDebtor() {
        return this.debtor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    @NotNull
    public final List<String> component5() {
        return this.additionalInformation;
    }

    @NotNull
    public final RecurringPaymentMethodDetailsEmbeddedEntity copy(RecurringPaymentCreditorEmbeddedEntity creditor, RecurringPaymentDebtorEmbeddedEntity debtor, String documentDescription, String documentNumber, @NotNull List<String> additionalInformation) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        return new RecurringPaymentMethodDetailsEmbeddedEntity(creditor, debtor, documentDescription, documentNumber, additionalInformation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentMethodDetailsEmbeddedEntity)) {
            return false;
        }
        RecurringPaymentMethodDetailsEmbeddedEntity recurringPaymentMethodDetailsEmbeddedEntity = (RecurringPaymentMethodDetailsEmbeddedEntity) other;
        return Intrinsics.f(this.creditor, recurringPaymentMethodDetailsEmbeddedEntity.creditor) && Intrinsics.f(this.debtor, recurringPaymentMethodDetailsEmbeddedEntity.debtor) && Intrinsics.f(this.documentDescription, recurringPaymentMethodDetailsEmbeddedEntity.documentDescription) && Intrinsics.f(this.documentNumber, recurringPaymentMethodDetailsEmbeddedEntity.documentNumber) && Intrinsics.f(this.additionalInformation, recurringPaymentMethodDetailsEmbeddedEntity.additionalInformation);
    }

    @NotNull
    public final List<String> getAdditionalInformation() {
        return this.additionalInformation;
    }

    public final RecurringPaymentCreditorEmbeddedEntity getCreditor() {
        return this.creditor;
    }

    public final RecurringPaymentDebtorEmbeddedEntity getDebtor() {
        return this.debtor;
    }

    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public int hashCode() {
        RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity = this.creditor;
        int iHashCode = (recurringPaymentCreditorEmbeddedEntity == null ? 0 : recurringPaymentCreditorEmbeddedEntity.hashCode()) * 31;
        RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity = this.debtor;
        int iHashCode2 = (iHashCode + (recurringPaymentDebtorEmbeddedEntity == null ? 0 : recurringPaymentDebtorEmbeddedEntity.hashCode())) * 31;
        String str = this.documentDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentNumber;
        return this.additionalInformation.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
