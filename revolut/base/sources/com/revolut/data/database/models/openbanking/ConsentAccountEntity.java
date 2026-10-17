package com.revolut.data.database.models.openbanking;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ConsentAccountEntity;", "", "type", "", "branchCode", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getBranchCode", "getAccountNumber", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentAccountEntity {

    @lg.b("accountNumber")
    @NotNull
    private final String accountNumber;

    @lg.b("branchCode")
    @NotNull
    private final String branchCode;

    @lg.b("type")
    @NotNull
    private final String type;

    public ConsentAccountEntity(@NotNull String type, @NotNull String branchCode, @NotNull String accountNumber) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.type = type;
        this.branchCode = branchCode;
        this.accountNumber = accountNumber;
    }

    public static /* synthetic */ ConsentAccountEntity copy$default(ConsentAccountEntity consentAccountEntity, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = consentAccountEntity.type;
        }
        if ((i & 2) != 0) {
            str2 = consentAccountEntity.branchCode;
        }
        if ((i & 4) != 0) {
            str3 = consentAccountEntity.accountNumber;
        }
        return consentAccountEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBranchCode() {
        return this.branchCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    public final ConsentAccountEntity copy(@NotNull String type, @NotNull String branchCode, @NotNull String accountNumber) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(branchCode, "branchCode");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new ConsentAccountEntity(type, branchCode, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentAccountEntity)) {
            return false;
        }
        ConsentAccountEntity consentAccountEntity = (ConsentAccountEntity) other;
        return Intrinsics.f(this.type, consentAccountEntity.type) && Intrinsics.f(this.branchCode, consentAccountEntity.branchCode) && Intrinsics.f(this.accountNumber, consentAccountEntity.accountNumber);
    }

    @NotNull
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @NotNull
    public final String getBranchCode() {
        return this.branchCode;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.accountNumber.hashCode() + p.a.c(this.type.hashCode() * 31, 31, this.branchCode);
    }
}
