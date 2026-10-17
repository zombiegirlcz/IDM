package com.revolut.data.network.models.moneyrequest;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Js\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014¨\u00060"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplittedBillDto;", "", "id", "", "state", "comment", "owner", "Lcom/revolut/data/network/models/moneyrequest/SplittedBillOwnerDto;", "currency", "createdDate", "", "splittedItems", "", "Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "moneyRequests", "Lcom/revolut/data/network/models/moneyrequest/SplittedBillMoneyRequestDto;", "registeredIdentityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/data/network/models/moneyrequest/SplittedBillOwnerDto;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getState", "getComment", "getOwner", "()Lcom/revolut/data/network/models/moneyrequest/SplittedBillOwnerDto;", "getCurrency", "getCreatedDate", "()J", "getSplittedItems", "()Ljava/util/List;", "getMoneyRequests", "getRegisteredIdentityId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplittedBillDto {

    @b("comment")
    @NotNull
    private final String comment;

    @b("createdDate")
    private final long createdDate;

    @b("currency")
    @NotNull
    private final String currency;

    @b("id")
    @NotNull
    private final String id;

    @b("moneyRequests")
    @NotNull
    private final List<SplittedBillMoneyRequestDto> moneyRequests;

    @b("owner")
    private final SplittedBillOwnerDto owner;

    @b("registeredIdentityId")
    private final String registeredIdentityId;

    @b("items")
    @NotNull
    private final List<SplittedItemDto> splittedItems;

    @b("state")
    @NotNull
    private final String state;

    public SplittedBillDto(@NotNull String id10, @NotNull String state, @NotNull String comment, SplittedBillOwnerDto splittedBillOwnerDto, @NotNull String currency, long j2, @NotNull List<SplittedItemDto> splittedItems, @NotNull List<SplittedBillMoneyRequestDto> moneyRequests, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.id = id10;
        this.state = state;
        this.comment = comment;
        this.owner = splittedBillOwnerDto;
        this.currency = currency;
        this.createdDate = j2;
        this.splittedItems = splittedItems;
        this.moneyRequests = moneyRequests;
        this.registeredIdentityId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplittedBillDto copy$default(SplittedBillDto splittedBillDto, String str, String str2, String str3, SplittedBillOwnerDto splittedBillOwnerDto, String str4, long j2, List list, List list2, String str5, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splittedBillDto.id;
        }
        if ((i & 2) != 0) {
            str2 = splittedBillDto.state;
        }
        if ((i & 4) != 0) {
            str3 = splittedBillDto.comment;
        }
        if ((i & 8) != 0) {
            splittedBillOwnerDto = splittedBillDto.owner;
        }
        if ((i & 16) != 0) {
            str4 = splittedBillDto.currency;
        }
        if ((i & 32) != 0) {
            j2 = splittedBillDto.createdDate;
        }
        if ((i & 64) != 0) {
            list = splittedBillDto.splittedItems;
        }
        if ((i & 128) != 0) {
            list2 = splittedBillDto.moneyRequests;
        }
        if ((i & 256) != 0) {
            str5 = splittedBillDto.registeredIdentityId;
        }
        String str6 = str5;
        List list3 = list;
        long j3 = j2;
        SplittedBillOwnerDto splittedBillOwnerDto2 = splittedBillOwnerDto;
        String str7 = str4;
        String str8 = str3;
        return splittedBillDto.copy(str, str2, str8, splittedBillOwnerDto2, str7, j3, list3, list2, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SplittedBillOwnerDto getOwner() {
        return this.owner;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public final List<SplittedItemDto> component7() {
        return this.splittedItems;
    }

    @NotNull
    public final List<SplittedBillMoneyRequestDto> component8() {
        return this.moneyRequests;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    public final SplittedBillDto copy(@NotNull String id10, @NotNull String state, @NotNull String comment, SplittedBillOwnerDto owner, @NotNull String currency, long createdDate, @NotNull List<SplittedItemDto> splittedItems, @NotNull List<SplittedBillMoneyRequestDto> moneyRequests, String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        return new SplittedBillDto(id10, state, comment, owner, currency, createdDate, splittedItems, moneyRequests, registeredIdentityId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplittedBillDto)) {
            return false;
        }
        SplittedBillDto splittedBillDto = (SplittedBillDto) other;
        return Intrinsics.f(this.id, splittedBillDto.id) && Intrinsics.f(this.state, splittedBillDto.state) && Intrinsics.f(this.comment, splittedBillDto.comment) && Intrinsics.f(this.owner, splittedBillDto.owner) && Intrinsics.f(this.currency, splittedBillDto.currency) && this.createdDate == splittedBillDto.createdDate && Intrinsics.f(this.splittedItems, splittedBillDto.splittedItems) && Intrinsics.f(this.moneyRequests, splittedBillDto.moneyRequests) && Intrinsics.f(this.registeredIdentityId, splittedBillDto.registeredIdentityId);
    }

    @NotNull
    public final String getComment() {
        return this.comment;
    }

    public final long getCreatedDate() {
        return this.createdDate;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<SplittedBillMoneyRequestDto> getMoneyRequests() {
        return this.moneyRequests;
    }

    public final SplittedBillOwnerDto getOwner() {
        return this.owner;
    }

    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    public final List<SplittedItemDto> getSplittedItems() {
        return this.splittedItems;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.id.hashCode() * 31, 31, this.state), 31, this.comment);
        SplittedBillOwnerDto splittedBillOwnerDto = this.owner;
        int iD = a.d(a.d(d.c(a.c((iC + (splittedBillOwnerDto == null ? 0 : splittedBillOwnerDto.hashCode())) * 31, 31, this.currency), 31, this.createdDate), 31, this.splittedItems), 31, this.moneyRequests);
        String str = this.registeredIdentityId;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
