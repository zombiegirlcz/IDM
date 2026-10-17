package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentDebtorEmbeddedEntity;", "", "name", "", "identification", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "<init>", "(Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;)V", "getName", "()Ljava/lang/String;", "getIdentification", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentDebtorEmbeddedEntity {
    private final RecurringPaymentIdentificationEmbeddedEntity identification;
    private final String name;

    public RecurringPaymentDebtorEmbeddedEntity(String str, RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity) {
        this.name = str;
        this.identification = recurringPaymentIdentificationEmbeddedEntity;
    }

    public static /* synthetic */ RecurringPaymentDebtorEmbeddedEntity copy$default(RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity, String str, RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = recurringPaymentDebtorEmbeddedEntity.name;
        }
        if ((i & 2) != 0) {
            recurringPaymentIdentificationEmbeddedEntity = recurringPaymentDebtorEmbeddedEntity.identification;
        }
        return recurringPaymentDebtorEmbeddedEntity.copy(str, recurringPaymentIdentificationEmbeddedEntity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    @NotNull
    public final RecurringPaymentDebtorEmbeddedEntity copy(String name, RecurringPaymentIdentificationEmbeddedEntity identification) {
        return new RecurringPaymentDebtorEmbeddedEntity(name, identification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentDebtorEmbeddedEntity)) {
            return false;
        }
        RecurringPaymentDebtorEmbeddedEntity recurringPaymentDebtorEmbeddedEntity = (RecurringPaymentDebtorEmbeddedEntity) other;
        return Intrinsics.f(this.name, recurringPaymentDebtorEmbeddedEntity.name) && Intrinsics.f(this.identification, recurringPaymentDebtorEmbeddedEntity.identification);
    }

    public final RecurringPaymentIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity = this.identification;
        return iHashCode + (recurringPaymentIdentificationEmbeddedEntity != null ? recurringPaymentIdentificationEmbeddedEntity.hashCode() : 0);
    }
}
