package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/externalcards/TopUpAlternativeRequestDto;", "", "amount", "", "currency", "", "issuerBic", "paymentMethod", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getIssuerBic", "getPaymentMethod", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpAlternativeRequestDto {

    @b("amount")
    private final long amount;

    @b("currency")
    @NotNull
    private final String currency;

    @b("issuerBic")
    private final String issuerBic;

    @b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    public TopUpAlternativeRequestDto(long j2, @NotNull String currency, String str, @NotNull String paymentMethod) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.amount = j2;
        this.currency = currency;
        this.issuerBic = str;
        this.paymentMethod = paymentMethod;
    }

    public static /* synthetic */ TopUpAlternativeRequestDto copy$default(TopUpAlternativeRequestDto topUpAlternativeRequestDto, long j2, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = topUpAlternativeRequestDto.amount;
        }
        long j3 = j2;
        if ((i & 2) != 0) {
            str = topUpAlternativeRequestDto.currency;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = topUpAlternativeRequestDto.issuerBic;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = topUpAlternativeRequestDto.paymentMethod;
        }
        return topUpAlternativeRequestDto.copy(j3, str4, str5, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssuerBic() {
        return this.issuerBic;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @NotNull
    public final TopUpAlternativeRequestDto copy(long amount, @NotNull String currency, String issuerBic, @NotNull String paymentMethod) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new TopUpAlternativeRequestDto(amount, currency, issuerBic, paymentMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopUpAlternativeRequestDto)) {
            return false;
        }
        TopUpAlternativeRequestDto topUpAlternativeRequestDto = (TopUpAlternativeRequestDto) other;
        return this.amount == topUpAlternativeRequestDto.amount && Intrinsics.f(this.currency, topUpAlternativeRequestDto.currency) && Intrinsics.f(this.issuerBic, topUpAlternativeRequestDto.issuerBic) && Intrinsics.f(this.paymentMethod, topUpAlternativeRequestDto.paymentMethod);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final String getIssuerBic() {
        return this.issuerBic;
    }

    @NotNull
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        int iC = a.c(Long.hashCode(this.amount) * 31, 31, this.currency);
        String str = this.issuerBic;
        return this.paymentMethod.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
