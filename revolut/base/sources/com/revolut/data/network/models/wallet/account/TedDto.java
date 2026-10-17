package com.revolut.data.network.models.wallet.account;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/revolut/data/network/models/wallet/account/TedDto;", "", "bankName", "", "beneficiaryName", "bankCode", "branchCode", "accountNumber", "companyRegisteredNumber", "transferTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getBeneficiaryName", "getBankCode", "getBranchCode", "getAccountNumber", "getCompanyRegisteredNumber", "getTransferTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TedDto {

    @b("accountNumber")
    @NotNull
    private final String accountNumber;

    @b("bankCode")
    @NotNull
    private final String bankCode;

    @b("bankName")
    @NotNull
    private final String bankName;

    @b("beneficiaryName")
    @NotNull
    private final String beneficiaryName;

    @b("branchCode")
    @NotNull
    private final String branchCode;

    @b("companyRegisteredNumber")
    @NotNull
    private final String companyRegisteredNumber;

    @b("transferTime")
    @NotNull
    private final String transferTime;

    public TedDto(@NotNull String bankName, @NotNull String beneficiaryName, @NotNull String bankCode, @NotNull String branchCode, @NotNull String accountNumber, @NotNull String companyRegisteredNumber, @NotNull String transferTime) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(companyRegisteredNumber, "companyRegisteredNumber");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        this.bankName = bankName;
        this.beneficiaryName = beneficiaryName;
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
        this.companyRegisteredNumber = companyRegisteredNumber;
        this.transferTime = transferTime;
    }

    public static /* synthetic */ TedDto copy$default(TedDto tedDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = tedDto.bankName;
        }
        if ((i & 2) != 0) {
            str2 = tedDto.beneficiaryName;
        }
        if ((i & 4) != 0) {
            str3 = tedDto.bankCode;
        }
        if ((i & 8) != 0) {
            str4 = tedDto.branchCode;
        }
        if ((i & 16) != 0) {
            str5 = tedDto.accountNumber;
        }
        if ((i & 32) != 0) {
            str6 = tedDto.companyRegisteredNumber;
        }
        if ((i & 64) != 0) {
            str7 = tedDto.transferTime;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return tedDto.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBranchCode() {
        return this.branchCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCompanyRegisteredNumber() {
        return this.companyRegisteredNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransferTime() {
        return this.transferTime;
    }

    @NotNull
    public final TedDto copy(@NotNull String bankName, @NotNull String beneficiaryName, @NotNull String bankCode, @NotNull String branchCode, @NotNull String accountNumber, @NotNull String companyRegisteredNumber, @NotNull String transferTime) {
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(bankCode, "bankCode");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(companyRegisteredNumber, "companyRegisteredNumber");
        Intrinsics.checkNotNullParameter(transferTime, "transferTime");
        return new TedDto(bankName, beneficiaryName, bankCode, branchCode, accountNumber, companyRegisteredNumber, transferTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TedDto)) {
            return false;
        }
        TedDto tedDto = (TedDto) other;
        return Intrinsics.f(this.bankName, tedDto.bankName) && Intrinsics.f(this.beneficiaryName, tedDto.beneficiaryName) && Intrinsics.f(this.bankCode, tedDto.bankCode) && Intrinsics.f(this.branchCode, tedDto.branchCode) && Intrinsics.f(this.accountNumber, tedDto.accountNumber) && Intrinsics.f(this.companyRegisteredNumber, tedDto.companyRegisteredNumber) && Intrinsics.f(this.transferTime, tedDto.transferTime);
    }

    @NotNull
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    public final String getBankCode() {
        return this.bankCode;
    }

    @NotNull
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    @NotNull
    public final String getBranchCode() {
        return this.branchCode;
    }

    @NotNull
    public final String getCompanyRegisteredNumber() {
        return this.companyRegisteredNumber;
    }

    @NotNull
    public final String getTransferTime() {
        return this.transferTime;
    }

    public int hashCode() {
        return this.transferTime.hashCode() + a.c(a.c(a.c(a.c(a.c(this.bankName.hashCode() * 31, 31, this.beneficiaryName), 31, this.bankCode), 31, this.branchCode), 31, this.accountNumber), 31, this.companyRegisteredNumber);
    }
}
