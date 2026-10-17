package com.revolut.data.network.models.recurringpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;", "", "name", "", "identification", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentIdentificationDto;", "<init>", "(Ljava/lang/String;Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentIdentificationDto;)V", "getName", "()Ljava/lang/String;", "getIdentification", "()Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentIdentificationDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentDebtorDto {

    @b("identification")
    private final RecurringPaymentIdentificationDto identification;

    @b("name")
    private final String name;

    public RecurringPaymentDebtorDto(String str, RecurringPaymentIdentificationDto recurringPaymentIdentificationDto) {
        this.name = str;
        this.identification = recurringPaymentIdentificationDto;
    }

    public static /* synthetic */ RecurringPaymentDebtorDto copy$default(RecurringPaymentDebtorDto recurringPaymentDebtorDto, String str, RecurringPaymentIdentificationDto recurringPaymentIdentificationDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = recurringPaymentDebtorDto.name;
        }
        if ((i & 2) != 0) {
            recurringPaymentIdentificationDto = recurringPaymentDebtorDto.identification;
        }
        return recurringPaymentDebtorDto.copy(str, recurringPaymentIdentificationDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentIdentificationDto getIdentification() {
        return this.identification;
    }

    @NotNull
    public final RecurringPaymentDebtorDto copy(String name, RecurringPaymentIdentificationDto identification) {
        return new RecurringPaymentDebtorDto(name, identification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentDebtorDto)) {
            return false;
        }
        RecurringPaymentDebtorDto recurringPaymentDebtorDto = (RecurringPaymentDebtorDto) other;
        return Intrinsics.f(this.name, recurringPaymentDebtorDto.name) && Intrinsics.f(this.identification, recurringPaymentDebtorDto.identification);
    }

    public final RecurringPaymentIdentificationDto getIdentification() {
        return this.identification;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RecurringPaymentIdentificationDto recurringPaymentIdentificationDto = this.identification;
        return iHashCode + (recurringPaymentIdentificationDto != null ? recurringPaymentIdentificationDto.hashCode() : 0);
    }
}
