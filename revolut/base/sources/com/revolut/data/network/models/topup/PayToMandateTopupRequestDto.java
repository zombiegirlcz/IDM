package com.revolut.data.network.models.topup;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/topup/PayToMandateTopupRequestDto;", "", "mandateId", "", "amount", "", "currency", "type", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getMandateId", "()Ljava/lang/String;", "getAmount", "()J", "getCurrency", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayToMandateTopupRequestDto {

    @b("amount")
    private final long amount;

    @b("currency")
    @NotNull
    private final String currency;

    @b("from")
    @NotNull
    private final String mandateId;

    @b("type")
    @NotNull
    private final String type;

    public PayToMandateTopupRequestDto(@NotNull String mandateId, long j2, @NotNull String currency, @NotNull String type) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.mandateId = mandateId;
        this.amount = j2;
        this.currency = currency;
        this.type = type;
    }

    public static /* synthetic */ PayToMandateTopupRequestDto copy$default(PayToMandateTopupRequestDto payToMandateTopupRequestDto, String str, long j2, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = payToMandateTopupRequestDto.mandateId;
        }
        if ((i & 2) != 0) {
            j2 = payToMandateTopupRequestDto.amount;
        }
        if ((i & 4) != 0) {
            str2 = payToMandateTopupRequestDto.currency;
        }
        if ((i & 8) != 0) {
            str3 = payToMandateTopupRequestDto.type;
        }
        return payToMandateTopupRequestDto.copy(str, j2, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMandateId() {
        return this.mandateId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final PayToMandateTopupRequestDto copy(@NotNull String mandateId, long amount, @NotNull String currency, @NotNull String type) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PayToMandateTopupRequestDto(mandateId, amount, currency, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayToMandateTopupRequestDto)) {
            return false;
        }
        PayToMandateTopupRequestDto payToMandateTopupRequestDto = (PayToMandateTopupRequestDto) other;
        return Intrinsics.f(this.mandateId, payToMandateTopupRequestDto.mandateId) && this.amount == payToMandateTopupRequestDto.amount && Intrinsics.f(this.currency, payToMandateTopupRequestDto.currency) && Intrinsics.f(this.type, payToMandateTopupRequestDto.type);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getMandateId() {
        return this.mandateId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + a.c(d.c(this.mandateId.hashCode() * 31, 31, this.amount), 31, this.currency);
    }
}
