package com.revolut.data.network.models.externalcards;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/externalcards/CardDetailsDto;", "", "entryMode", "", "lastFour", "expiry", "Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "binId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;Ljava/lang/String;)V", "getEntryMode", "()Ljava/lang/String;", "getLastFour", "getExpiry", "()Lcom/revolut/data/network/models/externalcards/ExpiryMonthYearDto;", "getBinId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetailsDto {

    @b("binId")
    @NotNull
    private final String binId;

    @b("entryMode")
    @NotNull
    private final String entryMode;

    @b("expiry")
    @NotNull
    private final ExpiryMonthYearDto expiry;

    @b("lastFour")
    @NotNull
    private final String lastFour;

    public CardDetailsDto(@NotNull String entryMode, @NotNull String lastFour, @NotNull ExpiryMonthYearDto expiry, @NotNull String binId) {
        Intrinsics.checkNotNullParameter(entryMode, "entryMode");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(expiry, "expiry");
        Intrinsics.checkNotNullParameter(binId, "binId");
        this.entryMode = entryMode;
        this.lastFour = lastFour;
        this.expiry = expiry;
        this.binId = binId;
    }

    public static /* synthetic */ CardDetailsDto copy$default(CardDetailsDto cardDetailsDto, String str, String str2, ExpiryMonthYearDto expiryMonthYearDto, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = cardDetailsDto.entryMode;
        }
        if ((i & 2) != 0) {
            str2 = cardDetailsDto.lastFour;
        }
        if ((i & 4) != 0) {
            expiryMonthYearDto = cardDetailsDto.expiry;
        }
        if ((i & 8) != 0) {
            str3 = cardDetailsDto.binId;
        }
        return cardDetailsDto.copy(str, str2, expiryMonthYearDto, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEntryMode() {
        return this.entryMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExpiryMonthYearDto getExpiry() {
        return this.expiry;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBinId() {
        return this.binId;
    }

    @NotNull
    public final CardDetailsDto copy(@NotNull String entryMode, @NotNull String lastFour, @NotNull ExpiryMonthYearDto expiry, @NotNull String binId) {
        Intrinsics.checkNotNullParameter(entryMode, "entryMode");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(expiry, "expiry");
        Intrinsics.checkNotNullParameter(binId, "binId");
        return new CardDetailsDto(entryMode, lastFour, expiry, binId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetailsDto)) {
            return false;
        }
        CardDetailsDto cardDetailsDto = (CardDetailsDto) other;
        return Intrinsics.f(this.entryMode, cardDetailsDto.entryMode) && Intrinsics.f(this.lastFour, cardDetailsDto.lastFour) && Intrinsics.f(this.expiry, cardDetailsDto.expiry) && Intrinsics.f(this.binId, cardDetailsDto.binId);
    }

    @NotNull
    public final String getBinId() {
        return this.binId;
    }

    @NotNull
    public final String getEntryMode() {
        return this.entryMode;
    }

    @NotNull
    public final ExpiryMonthYearDto getExpiry() {
        return this.expiry;
    }

    @NotNull
    public final String getLastFour() {
        return this.lastFour;
    }

    public int hashCode() {
        return this.binId.hashCode() + ((this.expiry.hashCode() + a.c(this.entryMode.hashCode() * 31, 31, this.lastFour)) * 31);
    }
}
