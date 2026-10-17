package com.revolut.feature.statements.impl.tools.transactions.extras;

import a0.d;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\\\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006*"}, d2 = {"Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCreditRepaymentDto;", "Ljava/io/Serializable;", "Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionExtra;", "interest", "", "principal", "date", "", "currency", "displayCard", "apr", "", "transactionId", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getInterest", "()J", "getPrincipal", "getDate", "()Ljava/lang/String;", "getCurrency", "getDisplayCard", "getApr", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/revolut/feature/statements/impl/tools/transactions/extras/TransactionCreditRepaymentDto;", "equals", "", "other", "", "hashCode", "", "toString", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionCreditRepaymentDto implements Serializable, TransactionExtra {

    @b("apr")
    private final Double apr;

    @b("currency")
    private final String currency;

    @b("date")
    @NotNull
    private final String date;

    @b("displayCard")
    private final String displayCard;

    @b("interest")
    private final long interest;

    @b("principal")
    private final long principal;

    @b("transactionId")
    private final String transactionId;

    public TransactionCreditRepaymentDto(long j2, long j3, @NotNull String date, String str, String str2, Double d, String str3) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.interest = j2;
        this.principal = j3;
        this.date = date;
        this.currency = str;
        this.displayCard = str2;
        this.apr = d;
        this.transactionId = str3;
    }

    public static /* synthetic */ TransactionCreditRepaymentDto copy$default(TransactionCreditRepaymentDto transactionCreditRepaymentDto, long j2, long j3, String str, String str2, String str3, Double d, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = transactionCreditRepaymentDto.interest;
        }
        long j5 = j2;
        if ((i & 2) != 0) {
            j3 = transactionCreditRepaymentDto.principal;
        }
        long j16 = j3;
        if ((i & 4) != 0) {
            str = transactionCreditRepaymentDto.date;
        }
        return transactionCreditRepaymentDto.copy(j5, j16, str, (i & 8) != 0 ? transactionCreditRepaymentDto.currency : str2, (i & 16) != 0 ? transactionCreditRepaymentDto.displayCard : str3, (i & 32) != 0 ? transactionCreditRepaymentDto.apr : d, (i & 64) != 0 ? transactionCreditRepaymentDto.transactionId : str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPrincipal() {
        return this.principal;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDisplayCard() {
        return this.displayCard;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final TransactionCreditRepaymentDto copy(long interest, long principal, @NotNull String date, String currency, String displayCard, Double apr, String transactionId) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new TransactionCreditRepaymentDto(interest, principal, date, currency, displayCard, apr, transactionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionCreditRepaymentDto)) {
            return false;
        }
        TransactionCreditRepaymentDto transactionCreditRepaymentDto = (TransactionCreditRepaymentDto) other;
        return this.interest == transactionCreditRepaymentDto.interest && this.principal == transactionCreditRepaymentDto.principal && Intrinsics.f(this.date, transactionCreditRepaymentDto.date) && Intrinsics.f(this.currency, transactionCreditRepaymentDto.currency) && Intrinsics.f(this.displayCard, transactionCreditRepaymentDto.displayCard) && Intrinsics.f(this.apr, transactionCreditRepaymentDto.apr) && Intrinsics.f(this.transactionId, transactionCreditRepaymentDto.transactionId);
    }

    public final Double getApr() {
        return this.apr;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    public final String getDisplayCard() {
        return this.displayCard;
    }

    public final long getInterest() {
        return this.interest;
    }

    public final long getPrincipal() {
        return this.principal;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int iC = a.c(d.c(Long.hashCode(this.interest) * 31, 31, this.principal), 31, this.date);
        String str = this.currency;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayCard;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.apr;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.transactionId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public /* synthetic */ TransactionCreditRepaymentDto(long j2, long j3, String str, String str2, String str3, Double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : str4);
    }
}
