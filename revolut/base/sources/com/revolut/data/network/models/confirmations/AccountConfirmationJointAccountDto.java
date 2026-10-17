package com.revolut.data.network.models.confirmations;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/revolut/data/network/models/confirmations/AccountConfirmationJointAccountDto;", "", "walletRef", "", "accountState", "accountOpeningDate", "accountTerminatedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getWalletRef", "()Ljava/lang/String;", "getAccountState", "getAccountOpeningDate", "getAccountTerminatedDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountConfirmationJointAccountDto {

    @b("accountOpeningDate")
    @NotNull
    private final String accountOpeningDate;

    @b("accountState")
    @NotNull
    private final String accountState;

    @b("accountTerminatedDate")
    private final String accountTerminatedDate;

    @b("walletRef")
    @NotNull
    private final String walletRef;

    public AccountConfirmationJointAccountDto(@NotNull String walletRef, @NotNull String accountState, @NotNull String accountOpeningDate, String str) {
        Intrinsics.checkNotNullParameter(walletRef, "walletRef");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(accountOpeningDate, "accountOpeningDate");
        this.walletRef = walletRef;
        this.accountState = accountState;
        this.accountOpeningDate = accountOpeningDate;
        this.accountTerminatedDate = str;
    }

    public static /* synthetic */ AccountConfirmationJointAccountDto copy$default(AccountConfirmationJointAccountDto accountConfirmationJointAccountDto, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = accountConfirmationJointAccountDto.walletRef;
        }
        if ((i & 2) != 0) {
            str2 = accountConfirmationJointAccountDto.accountState;
        }
        if ((i & 4) != 0) {
            str3 = accountConfirmationJointAccountDto.accountOpeningDate;
        }
        if ((i & 8) != 0) {
            str4 = accountConfirmationJointAccountDto.accountTerminatedDate;
        }
        return accountConfirmationJointAccountDto.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWalletRef() {
        return this.walletRef;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountState() {
        return this.accountState;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAccountTerminatedDate() {
        return this.accountTerminatedDate;
    }

    @NotNull
    public final AccountConfirmationJointAccountDto copy(@NotNull String walletRef, @NotNull String accountState, @NotNull String accountOpeningDate, String accountTerminatedDate) {
        Intrinsics.checkNotNullParameter(walletRef, "walletRef");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(accountOpeningDate, "accountOpeningDate");
        return new AccountConfirmationJointAccountDto(walletRef, accountState, accountOpeningDate, accountTerminatedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountConfirmationJointAccountDto)) {
            return false;
        }
        AccountConfirmationJointAccountDto accountConfirmationJointAccountDto = (AccountConfirmationJointAccountDto) other;
        return Intrinsics.f(this.walletRef, accountConfirmationJointAccountDto.walletRef) && Intrinsics.f(this.accountState, accountConfirmationJointAccountDto.accountState) && Intrinsics.f(this.accountOpeningDate, accountConfirmationJointAccountDto.accountOpeningDate) && Intrinsics.f(this.accountTerminatedDate, accountConfirmationJointAccountDto.accountTerminatedDate);
    }

    @NotNull
    public final String getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    @NotNull
    public final String getAccountState() {
        return this.accountState;
    }

    public final String getAccountTerminatedDate() {
        return this.accountTerminatedDate;
    }

    @NotNull
    public final String getWalletRef() {
        return this.walletRef;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.walletRef.hashCode() * 31, 31, this.accountState), 31, this.accountOpeningDate);
        String str = this.accountTerminatedDate;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
