package com.revolut.data.network.models.recurringpayment;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMethodDetailsDto;", "", "creditor", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentCreditorDto;", "debtor", "Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;", "documentDescription", "", "documentNumber", "additionalInformation", "", "<init>", "(Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentCreditorDto;Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCreditor", "()Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentCreditorDto;", "getDebtor", "()Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentDebtorDto;", "getDocumentDescription", "()Ljava/lang/String;", "getDocumentNumber", "getAdditionalInformation", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentMethodDetailsDto {

    @b("additionalInformation")
    private final List<String> additionalInformation;

    @b("creditor")
    private final RecurringPaymentCreditorDto creditor;

    @b("debtor")
    private final RecurringPaymentDebtorDto debtor;

    @b("documentDescription")
    private final String documentDescription;

    @b("documentNumber")
    private final String documentNumber;

    public RecurringPaymentMethodDetailsDto(RecurringPaymentCreditorDto recurringPaymentCreditorDto, RecurringPaymentDebtorDto recurringPaymentDebtorDto, String str, String str2, List<String> list) {
        this.creditor = recurringPaymentCreditorDto;
        this.debtor = recurringPaymentDebtorDto;
        this.documentDescription = str;
        this.documentNumber = str2;
        this.additionalInformation = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPaymentMethodDetailsDto copy$default(RecurringPaymentMethodDetailsDto recurringPaymentMethodDetailsDto, RecurringPaymentCreditorDto recurringPaymentCreditorDto, RecurringPaymentDebtorDto recurringPaymentDebtorDto, String str, String str2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            recurringPaymentCreditorDto = recurringPaymentMethodDetailsDto.creditor;
        }
        if ((i & 2) != 0) {
            recurringPaymentDebtorDto = recurringPaymentMethodDetailsDto.debtor;
        }
        if ((i & 4) != 0) {
            str = recurringPaymentMethodDetailsDto.documentDescription;
        }
        if ((i & 8) != 0) {
            str2 = recurringPaymentMethodDetailsDto.documentNumber;
        }
        if ((i & 16) != 0) {
            list = recurringPaymentMethodDetailsDto.additionalInformation;
        }
        List list2 = list;
        String str3 = str;
        return recurringPaymentMethodDetailsDto.copy(recurringPaymentCreditorDto, recurringPaymentDebtorDto, str3, str2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RecurringPaymentCreditorDto getCreditor() {
        return this.creditor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RecurringPaymentDebtorDto getDebtor() {
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

    public final List<String> component5() {
        return this.additionalInformation;
    }

    @NotNull
    public final RecurringPaymentMethodDetailsDto copy(RecurringPaymentCreditorDto creditor, RecurringPaymentDebtorDto debtor, String documentDescription, String documentNumber, List<String> additionalInformation) {
        return new RecurringPaymentMethodDetailsDto(creditor, debtor, documentDescription, documentNumber, additionalInformation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentMethodDetailsDto)) {
            return false;
        }
        RecurringPaymentMethodDetailsDto recurringPaymentMethodDetailsDto = (RecurringPaymentMethodDetailsDto) other;
        return Intrinsics.f(this.creditor, recurringPaymentMethodDetailsDto.creditor) && Intrinsics.f(this.debtor, recurringPaymentMethodDetailsDto.debtor) && Intrinsics.f(this.documentDescription, recurringPaymentMethodDetailsDto.documentDescription) && Intrinsics.f(this.documentNumber, recurringPaymentMethodDetailsDto.documentNumber) && Intrinsics.f(this.additionalInformation, recurringPaymentMethodDetailsDto.additionalInformation);
    }

    public final List<String> getAdditionalInformation() {
        return this.additionalInformation;
    }

    public final RecurringPaymentCreditorDto getCreditor() {
        return this.creditor;
    }

    public final RecurringPaymentDebtorDto getDebtor() {
        return this.debtor;
    }

    public final String getDocumentDescription() {
        return this.documentDescription;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public int hashCode() {
        RecurringPaymentCreditorDto recurringPaymentCreditorDto = this.creditor;
        int iHashCode = (recurringPaymentCreditorDto == null ? 0 : recurringPaymentCreditorDto.hashCode()) * 31;
        RecurringPaymentDebtorDto recurringPaymentDebtorDto = this.debtor;
        int iHashCode2 = (iHashCode + (recurringPaymentDebtorDto == null ? 0 : recurringPaymentDebtorDto.hashCode())) * 31;
        String str = this.documentDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentNumber;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.additionalInformation;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecurringPaymentMethodDetailsDto(RecurringPaymentCreditorDto recurringPaymentCreditorDto, RecurringPaymentDebtorDto recurringPaymentDebtorDto, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List list2;
        String str3;
        str = (i & 4) != 0 ? null : str;
        if ((i & 8) != 0) {
            list2 = list;
            str3 = null;
        } else {
            list2 = list;
            str3 = str2;
        }
        this(recurringPaymentCreditorDto, recurringPaymentDebtorDto, str, str3, list2);
    }
}
