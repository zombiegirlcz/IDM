package com.revolut.data.database.models.splitbill;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;", "", "state", "", "itemId", "amount", "", "moneyRequestId", "transactionId", "payer", "Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getItemId", "getAmount", "()J", "getMoneyRequestId", "getTransactionId", "getPayer", "()Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitMoneyRequestEmbeddedEntity {

    @b("amount")
    private final long amount;

    @b("itemId")
    @NotNull
    private final String itemId;

    @b("moneyRequestId")
    private final String moneyRequestId;

    @b("payer")
    @NotNull
    private final SplitBillPayerEmbeddedEntity payer;

    @b("reason")
    @NotNull
    private final String reason;

    @b("state")
    @NotNull
    private final String state;

    @b("transactionId")
    private final String transactionId;

    public SplitMoneyRequestEmbeddedEntity(@NotNull String state, @NotNull String itemId, long j2, String str, String str2, @NotNull SplitBillPayerEmbeddedEntity payer, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.state = state;
        this.itemId = itemId;
        this.amount = j2;
        this.moneyRequestId = str;
        this.transactionId = str2;
        this.payer = payer;
        this.reason = reason;
    }

    public static /* synthetic */ SplitMoneyRequestEmbeddedEntity copy$default(SplitMoneyRequestEmbeddedEntity splitMoneyRequestEmbeddedEntity, String str, String str2, long j2, String str3, String str4, SplitBillPayerEmbeddedEntity splitBillPayerEmbeddedEntity, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splitMoneyRequestEmbeddedEntity.state;
        }
        if ((i & 2) != 0) {
            str2 = splitMoneyRequestEmbeddedEntity.itemId;
        }
        if ((i & 4) != 0) {
            j2 = splitMoneyRequestEmbeddedEntity.amount;
        }
        if ((i & 8) != 0) {
            str3 = splitMoneyRequestEmbeddedEntity.moneyRequestId;
        }
        if ((i & 16) != 0) {
            str4 = splitMoneyRequestEmbeddedEntity.transactionId;
        }
        if ((i & 32) != 0) {
            splitBillPayerEmbeddedEntity = splitMoneyRequestEmbeddedEntity.payer;
        }
        if ((i & 64) != 0) {
            str5 = splitMoneyRequestEmbeddedEntity.reason;
        }
        long j3 = j2;
        return splitMoneyRequestEmbeddedEntity.copy(str, str2, j3, str3, str4, splitBillPayerEmbeddedEntity, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMoneyRequestId() {
        return this.moneyRequestId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SplitBillPayerEmbeddedEntity getPayer() {
        return this.payer;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final SplitMoneyRequestEmbeddedEntity copy(@NotNull String state, @NotNull String itemId, long amount, String moneyRequestId, String transactionId, @NotNull SplitBillPayerEmbeddedEntity payer, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(payer, "payer");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new SplitMoneyRequestEmbeddedEntity(state, itemId, amount, moneyRequestId, transactionId, payer, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitMoneyRequestEmbeddedEntity)) {
            return false;
        }
        SplitMoneyRequestEmbeddedEntity splitMoneyRequestEmbeddedEntity = (SplitMoneyRequestEmbeddedEntity) other;
        return Intrinsics.f(this.state, splitMoneyRequestEmbeddedEntity.state) && Intrinsics.f(this.itemId, splitMoneyRequestEmbeddedEntity.itemId) && this.amount == splitMoneyRequestEmbeddedEntity.amount && Intrinsics.f(this.moneyRequestId, splitMoneyRequestEmbeddedEntity.moneyRequestId) && Intrinsics.f(this.transactionId, splitMoneyRequestEmbeddedEntity.transactionId) && Intrinsics.f(this.payer, splitMoneyRequestEmbeddedEntity.payer) && Intrinsics.f(this.reason, splitMoneyRequestEmbeddedEntity.reason);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getItemId() {
        return this.itemId;
    }

    public final String getMoneyRequestId() {
        return this.moneyRequestId;
    }

    @NotNull
    public final SplitBillPayerEmbeddedEntity getPayer() {
        return this.payer;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iC = d.c(p.a.c(this.state.hashCode() * 31, 31, this.itemId), 31, this.amount);
        String str = this.moneyRequestId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transactionId;
        return this.reason.hashCode() + ((this.payer.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }
}
