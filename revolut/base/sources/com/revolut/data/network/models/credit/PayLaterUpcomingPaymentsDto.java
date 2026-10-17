package com.revolut.data.network.models.credit;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import o9l.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/credit/PayLaterUpcomingPaymentsDto;", "", "", "Lo9l/r;", "upcomingPayments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/revolut/data/network/models/credit/PayLaterUpcomingPaymentsDto;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUpcomingPayments", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterUpcomingPaymentsDto {

    @b("upcomingPayments")
    @NotNull
    private final List<r> upcomingPayments;

    public PayLaterUpcomingPaymentsDto(@NotNull List<r> upcomingPayments) {
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        this.upcomingPayments = upcomingPayments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PayLaterUpcomingPaymentsDto copy$default(PayLaterUpcomingPaymentsDto payLaterUpcomingPaymentsDto, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = payLaterUpcomingPaymentsDto.upcomingPayments;
        }
        return payLaterUpcomingPaymentsDto.copy(list);
    }

    @NotNull
    public final List<r> component1() {
        return this.upcomingPayments;
    }

    @NotNull
    public final PayLaterUpcomingPaymentsDto copy(@NotNull List<r> upcomingPayments) {
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        return new PayLaterUpcomingPaymentsDto(upcomingPayments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PayLaterUpcomingPaymentsDto) && Intrinsics.f(this.upcomingPayments, ((PayLaterUpcomingPaymentsDto) other).upcomingPayments);
    }

    @NotNull
    public final List<r> getUpcomingPayments() {
        return this.upcomingPayments;
    }

    public int hashCode() {
        return this.upcomingPayments.hashCode();
    }
}
