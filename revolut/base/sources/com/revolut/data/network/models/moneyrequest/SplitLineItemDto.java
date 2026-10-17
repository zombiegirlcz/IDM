package com.revolut.data.network.models.moneyrequest;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;", "", "name", "", "amount", "", "currency", "payers", "", "Lcom/revolut/data/network/models/moneyrequest/SplitLineItemPayerDto;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getAmount", "()J", "getCurrency", "getPayers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitLineItemDto {

    @b("amount")
    private final long amount;

    @b("currency")
    @NotNull
    private final String currency;

    @b("name")
    @NotNull
    private final String name;

    @b("payers")
    @NotNull
    private final List<SplitLineItemPayerDto> payers;

    public SplitLineItemDto(@NotNull String name, long j2, @NotNull String currency, @NotNull List<SplitLineItemPayerDto> payers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payers, "payers");
        this.name = name;
        this.amount = j2;
        this.currency = currency;
        this.payers = payers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitLineItemDto copy$default(SplitLineItemDto splitLineItemDto, String str, long j2, String str2, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splitLineItemDto.name;
        }
        if ((i & 2) != 0) {
            j2 = splitLineItemDto.amount;
        }
        if ((i & 4) != 0) {
            str2 = splitLineItemDto.currency;
        }
        if ((i & 8) != 0) {
            list = splitLineItemDto.payers;
        }
        return splitLineItemDto.copy(str, j2, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
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
    public final List<SplitLineItemPayerDto> component4() {
        return this.payers;
    }

    @NotNull
    public final SplitLineItemDto copy(@NotNull String name, long amount, @NotNull String currency, @NotNull List<SplitLineItemPayerDto> payers) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(payers, "payers");
        return new SplitLineItemDto(name, amount, currency, payers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitLineItemDto)) {
            return false;
        }
        SplitLineItemDto splitLineItemDto = (SplitLineItemDto) other;
        return Intrinsics.f(this.name, splitLineItemDto.name) && this.amount == splitLineItemDto.amount && Intrinsics.f(this.currency, splitLineItemDto.currency) && Intrinsics.f(this.payers, splitLineItemDto.payers);
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<SplitLineItemPayerDto> getPayers() {
        return this.payers;
    }

    public int hashCode() {
        return this.payers.hashCode() + a.c(d.c(this.name.hashCode() * 31, 31, this.amount), 31, this.currency);
    }
}
