package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionInsuranceDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "policyId", "", "insuranceTypeString", "billingOption", "infoResponse", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TravelInsuranceTransactionInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/feature/statements/impl/tools/transactions/extras/TravelInsuranceTransactionInfoDto;)V", "getPolicyId", "()Ljava/lang/String;", "getInsuranceTypeString", "getBillingOption", "getInfoResponse", "()Lcom/revolut/feature/statements/impl/tools/transactions/extras/TravelInsuranceTransactionInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionInsuranceDto implements Serializable, TransactionExtra {

    @b("billingOption")
    private final String billingOption;

    @b("travel")
    private final TravelInsuranceTransactionInfoDto infoResponse;

    @b("type")
    private final String insuranceTypeString;

    @b("policyId")
    private final String policyId;

    public TransactionInsuranceDto() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransactionInsuranceDto copy$default(TransactionInsuranceDto transactionInsuranceDto, String str, String str2, String str3, TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionInsuranceDto.policyId;
        }
        if ((i & 2) != 0) {
            str2 = transactionInsuranceDto.insuranceTypeString;
        }
        if ((i & 4) != 0) {
            str3 = transactionInsuranceDto.billingOption;
        }
        if ((i & 8) != 0) {
            travelInsuranceTransactionInfoDto = transactionInsuranceDto.infoResponse;
        }
        return transactionInsuranceDto.copy(str, str2, str3, travelInsuranceTransactionInfoDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInsuranceTypeString() {
        return this.insuranceTypeString;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBillingOption() {
        return this.billingOption;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TravelInsuranceTransactionInfoDto getInfoResponse() {
        return this.infoResponse;
    }

    @NotNull
    public final TransactionInsuranceDto copy(String policyId, String insuranceTypeString, String billingOption, TravelInsuranceTransactionInfoDto infoResponse) {
        return new TransactionInsuranceDto(policyId, insuranceTypeString, billingOption, infoResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionInsuranceDto)) {
            return false;
        }
        TransactionInsuranceDto transactionInsuranceDto = (TransactionInsuranceDto) other;
        return Intrinsics.f(this.policyId, transactionInsuranceDto.policyId) && Intrinsics.f(this.insuranceTypeString, transactionInsuranceDto.insuranceTypeString) && Intrinsics.f(this.billingOption, transactionInsuranceDto.billingOption) && Intrinsics.f(this.infoResponse, transactionInsuranceDto.infoResponse);
    }

    public final String getBillingOption() {
        return this.billingOption;
    }

    public final TravelInsuranceTransactionInfoDto getInfoResponse() {
        return this.infoResponse;
    }

    public final String getInsuranceTypeString() {
        return this.insuranceTypeString;
    }

    public final String getPolicyId() {
        return this.policyId;
    }

    public int hashCode() {
        String str = this.policyId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.insuranceTypeString;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.billingOption;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto = this.infoResponse;
        return iHashCode3 + (travelInsuranceTransactionInfoDto != null ? travelInsuranceTransactionInfoDto.hashCode() : 0);
    }

    public TransactionInsuranceDto(String str, String str2, String str3, TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto) {
        this.policyId = str;
        this.insuranceTypeString = str2;
        this.billingOption = str3;
        this.infoResponse = travelInsuranceTransactionInfoDto;
    }

    public /* synthetic */ TransactionInsuranceDto(String str, String str2, String str3, TravelInsuranceTransactionInfoDto travelInsuranceTransactionInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : travelInsuranceTransactionInfoDto);
    }
}
