package com.revolut.data.network.models.recurringpayment;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import o9l.r;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentListDto;", "", "", "totalAmount", "", "currency", "", "Lo9l/r;", "recurringPayments", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(JLjava/lang/String;Ljava/util/List;)Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentListDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "J", "getTotalAmount", "Ljava/lang/String;", "getCurrency", "Ljava/util/List;", "getRecurringPayments", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentListDto {

    @b("currency")
    @NotNull
    private final String currency;

    @b("recurringPayments")
    @NotNull
    private final List<r> recurringPayments;

    @b("totalAmount")
    private final long totalAmount;

    public RecurringPaymentListDto(long j2, @NotNull String currency, @NotNull List<r> recurringPayments) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        this.totalAmount = j2;
        this.currency = currency;
        this.recurringPayments = recurringPayments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPaymentListDto copy$default(RecurringPaymentListDto recurringPaymentListDto, long j2, String str, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = recurringPaymentListDto.totalAmount;
        }
        if ((i & 2) != 0) {
            str = recurringPaymentListDto.currency;
        }
        if ((i & 4) != 0) {
            list = recurringPaymentListDto.recurringPayments;
        }
        return recurringPaymentListDto.copy(j2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<r> component3() {
        return this.recurringPayments;
    }

    @NotNull
    public final RecurringPaymentListDto copy(long totalAmount, @NotNull String currency, @NotNull List<r> recurringPayments) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        return new RecurringPaymentListDto(totalAmount, currency, recurringPayments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentListDto)) {
            return false;
        }
        RecurringPaymentListDto recurringPaymentListDto = (RecurringPaymentListDto) other;
        return this.totalAmount == recurringPaymentListDto.totalAmount && Intrinsics.f(this.currency, recurringPaymentListDto.currency) && Intrinsics.f(this.recurringPayments, recurringPaymentListDto.recurringPayments);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final List<r> getRecurringPayments() {
        return this.recurringPayments;
    }

    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        return this.recurringPayments.hashCode() + a.c(Long.hashCode(this.totalAmount) * 31, 31, this.currency);
    }
}
