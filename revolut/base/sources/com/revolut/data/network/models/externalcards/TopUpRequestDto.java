package com.revolut.data.network.models.externalcards;

import a0.d;
import com.revolut.data.network.models.topup.ContextDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/revolut/data/network/models/externalcards/TopUpRequestDto;", "", "externalCardId", "", "amount", "", "currency", "pocketType", "walletId", "context", "Lcom/revolut/data/network/models/topup/ContextDto;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/topup/ContextDto;)V", "getExternalCardId", "()Ljava/lang/String;", "getAmount", "()J", "getCurrency", "getPocketType", "getWalletId", "getContext", "()Lcom/revolut/data/network/models/topup/ContextDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUpRequestDto {

    @b("amount")
    private final long amount;

    @b("context")
    private final ContextDto context;

    @b("currency")
    @NotNull
    private final String currency;

    @b("externalCardId")
    @NotNull
    private final String externalCardId;

    @b("pocketType")
    @NotNull
    private final String pocketType;

    @b("walletId")
    private final String walletId;

    public TopUpRequestDto(@NotNull String externalCardId, long j2, @NotNull String currency, @NotNull String pocketType, String str, ContextDto contextDto) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.externalCardId = externalCardId;
        this.amount = j2;
        this.currency = currency;
        this.pocketType = pocketType;
        this.walletId = str;
        this.context = contextDto;
    }

    public static /* synthetic */ TopUpRequestDto copy$default(TopUpRequestDto topUpRequestDto, String str, long j2, String str2, String str3, String str4, ContextDto contextDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = topUpRequestDto.externalCardId;
        }
        if ((i & 2) != 0) {
            j2 = topUpRequestDto.amount;
        }
        if ((i & 4) != 0) {
            str2 = topUpRequestDto.currency;
        }
        if ((i & 8) != 0) {
            str3 = topUpRequestDto.pocketType;
        }
        if ((i & 16) != 0) {
            str4 = topUpRequestDto.walletId;
        }
        if ((i & 32) != 0) {
            contextDto = topUpRequestDto.context;
        }
        return topUpRequestDto.copy(str, j2, str2, str3, str4, contextDto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalCardId() {
        return this.externalCardId;
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
    public final String getPocketType() {
        return this.pocketType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ContextDto getContext() {
        return this.context;
    }

    @NotNull
    public final TopUpRequestDto copy(@NotNull String externalCardId, long amount, @NotNull String currency, @NotNull String pocketType, String walletId, ContextDto context) {
        Intrinsics.checkNotNullParameter(externalCardId, "externalCardId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return new TopUpRequestDto(externalCardId, amount, currency, pocketType, walletId, context);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopUpRequestDto)) {
            return false;
        }
        TopUpRequestDto topUpRequestDto = (TopUpRequestDto) other;
        return Intrinsics.f(this.externalCardId, topUpRequestDto.externalCardId) && this.amount == topUpRequestDto.amount && Intrinsics.f(this.currency, topUpRequestDto.currency) && Intrinsics.f(this.pocketType, topUpRequestDto.pocketType) && Intrinsics.f(this.walletId, topUpRequestDto.walletId) && Intrinsics.f(this.context, topUpRequestDto.context);
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
    public final String getExternalCardId() {
        return this.externalCardId;
    }

    @NotNull
    public final String getPocketType() {
        return this.pocketType;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        int iC = a.c(a.c(d.c(this.externalCardId.hashCode() * 31, 31, this.amount), 31, this.currency), 31, this.pocketType);
        String str = this.walletId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ContextDto contextDto = this.context;
        return iHashCode + (contextDto != null ? contextDto.hashCode() : 0);
    }
}
