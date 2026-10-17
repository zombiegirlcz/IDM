package com.revolut.data.network.models.transfer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/data/network/models/transfer/PocketTransferModelDto;", "", "from", "", "to", "currency", "amount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getFrom", "()Ljava/lang/String;", "getTo", "getCurrency", "getAmount", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PocketTransferModelDto {

    @b("amount")
    private final long amount;

    @b("currency")
    @NotNull
    private final String currency;

    @b("from")
    @NotNull
    private final String from;

    @b("to")
    private final String to;

    public PocketTransferModelDto(@NotNull String from, String str, @NotNull String currency, long j2) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.from = from;
        this.to = str;
        this.currency = currency;
        this.amount = j2;
    }

    public static /* synthetic */ PocketTransferModelDto copy$default(PocketTransferModelDto pocketTransferModelDto, String str, String str2, String str3, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pocketTransferModelDto.from;
        }
        if ((i & 2) != 0) {
            str2 = pocketTransferModelDto.to;
        }
        if ((i & 4) != 0) {
            str3 = pocketTransferModelDto.currency;
        }
        if ((i & 8) != 0) {
            j2 = pocketTransferModelDto.amount;
        }
        String str4 = str3;
        return pocketTransferModelDto.copy(str, str2, str4, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final PocketTransferModelDto copy(@NotNull String from, String to6, @NotNull String currency, long amount) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new PocketTransferModelDto(from, to6, currency, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PocketTransferModelDto)) {
            return false;
        }
        PocketTransferModelDto pocketTransferModelDto = (PocketTransferModelDto) other;
        return Intrinsics.f(this.from, pocketTransferModelDto.from) && Intrinsics.f(this.to, pocketTransferModelDto.to) && Intrinsics.f(this.currency, pocketTransferModelDto.currency) && this.amount == pocketTransferModelDto.amount;
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        int iHashCode = this.from.hashCode() * 31;
        String str = this.to;
        return Long.hashCode(this.amount) + a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.currency);
    }
}
