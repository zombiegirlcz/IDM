package com.revolut.data.database.models.credit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/revolut/data/database/models/credit/LoanReceiverEmbeddedEntity;", "", "loanId", "", "repaymentId", "loanName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoanId", "()Ljava/lang/String;", "getRepaymentId", "getLoanName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoanReceiverEmbeddedEntity {

    @b("loanId")
    @NotNull
    private final String loanId;

    @b("loanName")
    private final String loanName;

    @b("repaymentId")
    @NotNull
    private final String repaymentId;

    public LoanReceiverEmbeddedEntity(@NotNull String loanId, @NotNull String repaymentId, String str) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentId, "repaymentId");
        this.loanId = loanId;
        this.repaymentId = repaymentId;
        this.loanName = str;
    }

    public static /* synthetic */ LoanReceiverEmbeddedEntity copy$default(LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntity, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = loanReceiverEmbeddedEntity.loanId;
        }
        if ((i & 2) != 0) {
            str2 = loanReceiverEmbeddedEntity.repaymentId;
        }
        if ((i & 4) != 0) {
            str3 = loanReceiverEmbeddedEntity.loanName;
        }
        return loanReceiverEmbeddedEntity.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLoanId() {
        return this.loanId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRepaymentId() {
        return this.repaymentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLoanName() {
        return this.loanName;
    }

    @NotNull
    public final LoanReceiverEmbeddedEntity copy(@NotNull String loanId, @NotNull String repaymentId, String loanName) {
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(repaymentId, "repaymentId");
        return new LoanReceiverEmbeddedEntity(loanId, repaymentId, loanName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoanReceiverEmbeddedEntity)) {
            return false;
        }
        LoanReceiverEmbeddedEntity loanReceiverEmbeddedEntity = (LoanReceiverEmbeddedEntity) other;
        return Intrinsics.f(this.loanId, loanReceiverEmbeddedEntity.loanId) && Intrinsics.f(this.repaymentId, loanReceiverEmbeddedEntity.repaymentId) && Intrinsics.f(this.loanName, loanReceiverEmbeddedEntity.loanName);
    }

    @NotNull
    public final String getLoanId() {
        return this.loanId;
    }

    public final String getLoanName() {
        return this.loanName;
    }

    @NotNull
    public final String getRepaymentId() {
        return this.repaymentId;
    }

    public int hashCode() {
        int iC = a.c(this.loanId.hashCode() * 31, 31, this.repaymentId);
        String str = this.loanName;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
