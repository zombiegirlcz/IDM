package com.revolut.data.network.models.externalcards;

import java.io.Serializable;
import kotlin.Metadata;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "Ljava/io/Serializable;", "month", "", "year", "<init>", "(II)V", "getMonth", "()I", "getYear", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpiryMonthYearDto implements Serializable {

    @b("month")
    private final int month;

    @b("year")
    private final int year;

    public ExpiryMonthYearDto(int i, int i2) {
        this.month = i;
        this.year = i2;
    }

    public static /* synthetic */ ExpiryMonthYearDto copy$default(ExpiryMonthYearDto expiryMonthYearDto, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = expiryMonthYearDto.month;
        }
        if ((i3 & 2) != 0) {
            i2 = expiryMonthYearDto.year;
        }
        return expiryMonthYearDto.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final ExpiryMonthYearDto copy(int month, int year) {
        return new ExpiryMonthYearDto(month, year);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryMonthYearDto)) {
            return false;
        }
        ExpiryMonthYearDto expiryMonthYearDto = (ExpiryMonthYearDto) other;
        return this.month == expiryMonthYearDto.month && this.year == expiryMonthYearDto.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Integer.hashCode(this.year) + (Integer.hashCode(this.month) * 31);
    }

    @NotNull
    public String toString() {
        return "ExpiryMonthYearDto(month=**, year=**)";
    }
}
