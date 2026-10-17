package com.revolut.feature.statements.impl.tools.transactions.extras;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015¨\u0006'"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionStandingOrderDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "id", "", "period", "type", "startDate", "nextDate", "recurring", "", "estimated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "getPeriod", "getType", "getStartDate", "getNextDate", "getRecurring", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEstimated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionStandingOrderDto;", "equals", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionStandingOrderDto implements Serializable, TransactionExtra {

    @b("estimated")
    private final Boolean estimated;

    @b("id")
    @NotNull
    private final String id;

    @b("nextDate")
    private final String nextDate;

    @b("period")
    private final String period;

    @b("recurring")
    private final Boolean recurring;

    @b("startDate")
    private final String startDate;

    @b("type")
    private final String type;

    public TransactionStandingOrderDto(@NotNull String id10, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.period = str;
        this.type = str2;
        this.startDate = str3;
        this.nextDate = str4;
        this.recurring = bool;
        this.estimated = bool2;
    }

    public static /* synthetic */ TransactionStandingOrderDto copy$default(TransactionStandingOrderDto transactionStandingOrderDto, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionStandingOrderDto.id;
        }
        if ((i & 2) != 0) {
            str2 = transactionStandingOrderDto.period;
        }
        if ((i & 4) != 0) {
            str3 = transactionStandingOrderDto.type;
        }
        if ((i & 8) != 0) {
            str4 = transactionStandingOrderDto.startDate;
        }
        if ((i & 16) != 0) {
            str5 = transactionStandingOrderDto.nextDate;
        }
        if ((i & 32) != 0) {
            bool = transactionStandingOrderDto.recurring;
        }
        if ((i & 64) != 0) {
            bool2 = transactionStandingOrderDto.estimated;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str5;
        String str7 = str3;
        return transactionStandingOrderDto.copy(str, str2, str7, str4, str6, bool3, bool4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextDate() {
        return this.nextDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getEstimated() {
        return this.estimated;
    }

    @NotNull
    public final TransactionStandingOrderDto copy(@NotNull String id10, String period, String type, String startDate, String nextDate, Boolean recurring, Boolean estimated) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new TransactionStandingOrderDto(id10, period, type, startDate, nextDate, recurring, estimated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionStandingOrderDto)) {
            return false;
        }
        TransactionStandingOrderDto transactionStandingOrderDto = (TransactionStandingOrderDto) other;
        return Intrinsics.f(this.id, transactionStandingOrderDto.id) && Intrinsics.f(this.period, transactionStandingOrderDto.period) && Intrinsics.f(this.type, transactionStandingOrderDto.type) && Intrinsics.f(this.startDate, transactionStandingOrderDto.startDate) && Intrinsics.f(this.nextDate, transactionStandingOrderDto.nextDate) && Intrinsics.f(this.recurring, transactionStandingOrderDto.recurring) && Intrinsics.f(this.estimated, transactionStandingOrderDto.estimated);
    }

    public final Boolean getEstimated() {
        return this.estimated;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getNextDate() {
        return this.nextDate;
    }

    public final String getPeriod() {
        return this.period;
    }

    public final Boolean getRecurring() {
        return this.recurring;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.period;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nextDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.recurring;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.estimated;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public /* synthetic */ TransactionStandingOrderDto(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }
}
