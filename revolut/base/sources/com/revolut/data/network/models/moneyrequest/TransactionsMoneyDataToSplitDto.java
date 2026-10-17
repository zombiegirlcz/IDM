package com.revolut.data.network.models.moneyrequest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransactionsMoneyDataToSplitDto;", "", "comment", "", "items", "", "Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "moneyRequests", "Lcom/revolut/data/network/models/moneyrequest/SplitBillMoneyRequestDto;", "walletId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getMoneyRequests", "getWalletId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsMoneyDataToSplitDto {

    @b("comment")
    private final String comment;

    @b("items")
    @NotNull
    private final List<SplittedItemDto> items;

    @b("moneyRequests")
    @NotNull
    private final List<SplitBillMoneyRequestDto> moneyRequests;

    @b("walletId")
    private final String walletId;

    public TransactionsMoneyDataToSplitDto(String str, @NotNull List<SplittedItemDto> items, @NotNull List<SplitBillMoneyRequestDto> moneyRequests, String str2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.comment = str;
        this.items = items;
        this.moneyRequests = moneyRequests;
        this.walletId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsMoneyDataToSplitDto copy$default(TransactionsMoneyDataToSplitDto transactionsMoneyDataToSplitDto, String str, List list, List list2, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transactionsMoneyDataToSplitDto.comment;
        }
        if ((i & 2) != 0) {
            list = transactionsMoneyDataToSplitDto.items;
        }
        if ((i & 4) != 0) {
            list2 = transactionsMoneyDataToSplitDto.moneyRequests;
        }
        if ((i & 8) != 0) {
            str2 = transactionsMoneyDataToSplitDto.walletId;
        }
        return transactionsMoneyDataToSplitDto.copy(str, list, list2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final List<SplittedItemDto> component2() {
        return this.items;
    }

    @NotNull
    public final List<SplitBillMoneyRequestDto> component3() {
        return this.moneyRequests;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    public final TransactionsMoneyDataToSplitDto copy(String comment, @NotNull List<SplittedItemDto> items, @NotNull List<SplitBillMoneyRequestDto> moneyRequests, String walletId) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        return new TransactionsMoneyDataToSplitDto(comment, items, moneyRequests, walletId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsMoneyDataToSplitDto)) {
            return false;
        }
        TransactionsMoneyDataToSplitDto transactionsMoneyDataToSplitDto = (TransactionsMoneyDataToSplitDto) other;
        return Intrinsics.f(this.comment, transactionsMoneyDataToSplitDto.comment) && Intrinsics.f(this.items, transactionsMoneyDataToSplitDto.items) && Intrinsics.f(this.moneyRequests, transactionsMoneyDataToSplitDto.moneyRequests) && Intrinsics.f(this.walletId, transactionsMoneyDataToSplitDto.walletId);
    }

    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final List<SplittedItemDto> getItems() {
        return this.items;
    }

    @NotNull
    public final List<SplitBillMoneyRequestDto> getMoneyRequests() {
        return this.moneyRequests;
    }

    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        String str = this.comment;
        int iD = a.d(a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.items), 31, this.moneyRequests);
        String str2 = this.walletId;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
