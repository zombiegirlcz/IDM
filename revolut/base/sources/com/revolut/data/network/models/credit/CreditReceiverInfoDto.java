package com.revolut.data.network.models.credit;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/revolut/data/network/models/credit/CreditReceiverInfoDto;", "", "type", "Lcom/revolut/data/network/models/credit/CreditAmountTypeDto;", "forecast", "", "<init>", "(Lcom/revolut/data/network/models/credit/CreditAmountTypeDto;Ljava/lang/Boolean;)V", "getType", "()Lcom/revolut/data/network/models/credit/CreditAmountTypeDto;", "getForecast", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/revolut/data/network/models/credit/CreditAmountTypeDto;Ljava/lang/Boolean;)Lcom/revolut/data/network/models/credit/CreditReceiverInfoDto;", "equals", "other", "hashCode", "", "toString", "", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditReceiverInfoDto {

    @b("forecast")
    private final Boolean forecast;

    @b("amountType")
    @NotNull
    private final CreditAmountTypeDto type;

    public CreditReceiverInfoDto(@NotNull CreditAmountTypeDto type, Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.forecast = bool;
    }

    public static /* synthetic */ CreditReceiverInfoDto copy$default(CreditReceiverInfoDto creditReceiverInfoDto, CreditAmountTypeDto creditAmountTypeDto, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            creditAmountTypeDto = creditReceiverInfoDto.type;
        }
        if ((i & 2) != 0) {
            bool = creditReceiverInfoDto.forecast;
        }
        return creditReceiverInfoDto.copy(creditAmountTypeDto, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CreditAmountTypeDto getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getForecast() {
        return this.forecast;
    }

    @NotNull
    public final CreditReceiverInfoDto copy(@NotNull CreditAmountTypeDto type, Boolean forecast) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new CreditReceiverInfoDto(type, forecast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditReceiverInfoDto)) {
            return false;
        }
        CreditReceiverInfoDto creditReceiverInfoDto = (CreditReceiverInfoDto) other;
        return this.type == creditReceiverInfoDto.type && Intrinsics.f(this.forecast, creditReceiverInfoDto.forecast);
    }

    public final Boolean getForecast() {
        return this.forecast;
    }

    @NotNull
    public final CreditAmountTypeDto getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        Boolean bool = this.forecast;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
