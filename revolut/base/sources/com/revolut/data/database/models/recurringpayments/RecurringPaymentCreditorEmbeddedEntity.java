package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentCreditorEmbeddedEntity;", "", "name", "", "identification", "Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "institutionName", "serviceProviderLogo", "<init>", "(Ljava/lang/String;Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getIdentification", "()Lcom/revolut/data/database/models/recurringpayments/RecurringPaymentIdentificationEmbeddedEntity;", "getInstitutionName", "getServiceProviderLogo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentCreditorEmbeddedEntity {
    private final RecurringPaymentIdentificationEmbeddedEntity identification;
    private final String institutionName;
    private final String name;
    private final String serviceProviderLogo;

    public RecurringPaymentCreditorEmbeddedEntity(String str, RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity, String str2, String str3) {
        this.name = str;
        this.identification = recurringPaymentIdentificationEmbeddedEntity;
        this.institutionName = str2;
        this.serviceProviderLogo = str3;
    }

    public static /* synthetic */ RecurringPaymentCreditorEmbeddedEntity copy$default(RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity, String str, RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = recurringPaymentCreditorEmbeddedEntity.name;
        }
        if ((i & 2) != 0) {
            recurringPaymentIdentificationEmbeddedEntity = recurringPaymentCreditorEmbeddedEntity.identification;
        }
        if ((i & 4) != 0) {
            str2 = recurringPaymentCreditorEmbeddedEntity.institutionName;
        }
        if ((i & 8) != 0) {
            str3 = recurringPaymentCreditorEmbeddedEntity.serviceProviderLogo;
        }
        return recurringPaymentCreditorEmbeddedEntity.copy(str, recurringPaymentIdentificationEmbeddedEntity, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServiceProviderLogo() {
        return this.serviceProviderLogo;
    }

    @NotNull
    public final RecurringPaymentCreditorEmbeddedEntity copy(String name, RecurringPaymentIdentificationEmbeddedEntity identification, String institutionName, String serviceProviderLogo) {
        return new RecurringPaymentCreditorEmbeddedEntity(name, identification, institutionName, serviceProviderLogo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentCreditorEmbeddedEntity)) {
            return false;
        }
        RecurringPaymentCreditorEmbeddedEntity recurringPaymentCreditorEmbeddedEntity = (RecurringPaymentCreditorEmbeddedEntity) other;
        return Intrinsics.f(this.name, recurringPaymentCreditorEmbeddedEntity.name) && Intrinsics.f(this.identification, recurringPaymentCreditorEmbeddedEntity.identification) && Intrinsics.f(this.institutionName, recurringPaymentCreditorEmbeddedEntity.institutionName) && Intrinsics.f(this.serviceProviderLogo, recurringPaymentCreditorEmbeddedEntity.serviceProviderLogo);
    }

    public final RecurringPaymentIdentificationEmbeddedEntity getIdentification() {
        return this.identification;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServiceProviderLogo() {
        return this.serviceProviderLogo;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RecurringPaymentIdentificationEmbeddedEntity recurringPaymentIdentificationEmbeddedEntity = this.identification;
        int iHashCode2 = (iHashCode + (recurringPaymentIdentificationEmbeddedEntity == null ? 0 : recurringPaymentIdentificationEmbeddedEntity.hashCode())) * 31;
        String str2 = this.institutionName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serviceProviderLogo;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
