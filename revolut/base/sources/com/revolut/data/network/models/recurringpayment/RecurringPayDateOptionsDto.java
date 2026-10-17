package com.revolut.data.network.models.recurringpayment;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J5\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPayDateOptionsDto;", "", "week", "", "", "month", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getWeek", "()Ljava/util/Map;", "getMonth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPayDateOptionsDto {

    @b("month")
    @NotNull
    private final Map<Integer, String> month;

    @b("week")
    @NotNull
    private final Map<String, String> week;

    public RecurringPayDateOptionsDto(@NotNull Map<String, String> week, @NotNull Map<Integer, String> month) {
        Intrinsics.checkNotNullParameter(week, "week");
        Intrinsics.checkNotNullParameter(month, "month");
        this.week = week;
        this.month = month;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringPayDateOptionsDto copy$default(RecurringPayDateOptionsDto recurringPayDateOptionsDto, Map map, Map map2, int i, Object obj2) {
        if ((i & 1) != 0) {
            map = recurringPayDateOptionsDto.week;
        }
        if ((i & 2) != 0) {
            map2 = recurringPayDateOptionsDto.month;
        }
        return recurringPayDateOptionsDto.copy(map, map2);
    }

    @NotNull
    public final Map<String, String> component1() {
        return this.week;
    }

    @NotNull
    public final Map<Integer, String> component2() {
        return this.month;
    }

    @NotNull
    public final RecurringPayDateOptionsDto copy(@NotNull Map<String, String> week, @NotNull Map<Integer, String> month) {
        Intrinsics.checkNotNullParameter(week, "week");
        Intrinsics.checkNotNullParameter(month, "month");
        return new RecurringPayDateOptionsDto(week, month);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPayDateOptionsDto)) {
            return false;
        }
        RecurringPayDateOptionsDto recurringPayDateOptionsDto = (RecurringPayDateOptionsDto) other;
        return Intrinsics.f(this.week, recurringPayDateOptionsDto.week) && Intrinsics.f(this.month, recurringPayDateOptionsDto.month);
    }

    @NotNull
    public final Map<Integer, String> getMonth() {
        return this.month;
    }

    @NotNull
    public final Map<String, String> getWeek() {
        return this.week;
    }

    public int hashCode() {
        return this.month.hashCode() + (this.week.hashCode() * 31);
    }
}
