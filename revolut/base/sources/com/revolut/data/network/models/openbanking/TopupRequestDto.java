package com.revolut.data.network.models.openbanking;

import a0.d;
import com.revolut.data.network.models.topup.ContextDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/revolut/data/network/models/openbanking/TopupRequestDto;", "", "from", "", "amount", "", "currency", "walletId", "context", "Lcom/revolut/data/network/models/topup/ContextDto;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/topup/ContextDto;)V", "getFrom", "()Ljava/lang/String;", "getAmount", "()J", "getCurrency", "getWalletId", "getContext", "()Lcom/revolut/data/network/models/topup/ContextDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupRequestDto {

    @b("amount")
    private final long amount;

    @b("context")
    private final ContextDto context;

    @b("currency")
    @NotNull
    private final String currency;

    @b("from")
    @NotNull
    private final String from;

    @b("walletId")
    private final String walletId;

    public TopupRequestDto(@NotNull String from, long j2, @NotNull String currency, String str, ContextDto contextDto) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.from = from;
        this.amount = j2;
        this.currency = currency;
        this.walletId = str;
        this.context = contextDto;
    }

    public static /* synthetic */ TopupRequestDto copy$default(TopupRequestDto topupRequestDto, String str, long j2, String str2, String str3, ContextDto contextDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = topupRequestDto.from;
        }
        if ((i & 2) != 0) {
            j2 = topupRequestDto.amount;
        }
        if ((i & 4) != 0) {
            str2 = topupRequestDto.currency;
        }
        if ((i & 8) != 0) {
            str3 = topupRequestDto.walletId;
        }
        if ((i & 16) != 0) {
            contextDto = topupRequestDto.context;
        }
        ContextDto contextDto2 = contextDto;
        String str4 = str2;
        return topupRequestDto.copy(str, j2, str4, str3, contextDto2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContextDto getContext() {
        return this.context;
    }

    @NotNull
    public final TopupRequestDto copy(@NotNull String from, long amount, @NotNull String currency, String walletId, ContextDto context) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TopupRequestDto(from, amount, currency, walletId, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupRequestDto)) {
            return false;
        }
        TopupRequestDto topupRequestDto = (TopupRequestDto) other;
        return Intrinsics.f(this.from, topupRequestDto.from) && this.amount == topupRequestDto.amount && Intrinsics.f(this.currency, topupRequestDto.currency) && Intrinsics.f(this.walletId, topupRequestDto.walletId) && Intrinsics.f(this.context, topupRequestDto.context);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final ContextDto getContext() {
        return this.context;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iC = a.c(d.c(this.from.hashCode() * 31, 31, this.amount), 31, this.currency);
        String str = this.walletId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ContextDto contextDto = this.context;
        return iHashCode + (contextDto != null ? contextDto.hashCode() : 0);
    }
}
