package com.revolut.data.network.models.confirmations;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012JF\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/revolut/data/network/models/confirmations/UserBankAccountsDto;", "", "sortCode", "", "accountNumber", "mcbLocal", "", "cfsbLocal", "leadBank", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;)V", "getSortCode", "()Ljava/lang/String;", "getAccountNumber", "getMcbLocal", "()Z", "getCfsbLocal", "getLeadBank", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;)Lcom/revolut/data/network/models/confirmations/UserBankAccountsDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserBankAccountsDto {

    @b("userCode")
    private final String accountNumber;

    @b("cfsbLocal")
    private final boolean cfsbLocal;

    @b("leadBank")
    private final Boolean leadBank;

    @b("mcbLocal")
    private final boolean mcbLocal;

    @b("bankCode")
    private final String sortCode;

    public UserBankAccountsDto(String str, String str2, boolean z, boolean z3, Boolean bool) {
        this.sortCode = str;
        this.accountNumber = str2;
        this.mcbLocal = z;
        this.cfsbLocal = z3;
        this.leadBank = bool;
    }

    public static /* synthetic */ UserBankAccountsDto copy$default(UserBankAccountsDto userBankAccountsDto, String str, String str2, boolean z, boolean z3, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = userBankAccountsDto.sortCode;
        }
        if ((i & 2) != 0) {
            str2 = userBankAccountsDto.accountNumber;
        }
        if ((i & 4) != 0) {
            z = userBankAccountsDto.mcbLocal;
        }
        if ((i & 8) != 0) {
            z3 = userBankAccountsDto.cfsbLocal;
        }
        if ((i & 16) != 0) {
            bool = userBankAccountsDto.leadBank;
        }
        Boolean bool2 = bool;
        boolean z4 = z;
        return userBankAccountsDto.copy(str, str2, z4, z3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getMcbLocal() {
        return this.mcbLocal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCfsbLocal() {
        return this.cfsbLocal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getLeadBank() {
        return this.leadBank;
    }

    @NotNull
    public final UserBankAccountsDto copy(String sortCode, String accountNumber, boolean mcbLocal, boolean cfsbLocal, Boolean leadBank) {
        return new UserBankAccountsDto(sortCode, accountNumber, mcbLocal, cfsbLocal, leadBank);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBankAccountsDto)) {
            return false;
        }
        UserBankAccountsDto userBankAccountsDto = (UserBankAccountsDto) other;
        return Intrinsics.f(this.sortCode, userBankAccountsDto.sortCode) && Intrinsics.f(this.accountNumber, userBankAccountsDto.accountNumber) && this.mcbLocal == userBankAccountsDto.mcbLocal && this.cfsbLocal == userBankAccountsDto.cfsbLocal && Intrinsics.f(this.leadBank, userBankAccountsDto.leadBank);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getCfsbLocal() {
        return this.cfsbLocal;
    }

    public final Boolean getLeadBank() {
        return this.leadBank;
    }

    public final boolean getMcbLocal() {
        return this.mcbLocal;
    }

    public final String getSortCode() {
        return this.sortCode;
    }

    public int hashCode() {
        String str = this.sortCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountNumber;
        int iC = a.c(a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mcbLocal), 31, this.cfsbLocal);
        Boolean bool = this.leadBank;
        return iC + (bool != null ? bool.hashCode() : 0);
    }
}
