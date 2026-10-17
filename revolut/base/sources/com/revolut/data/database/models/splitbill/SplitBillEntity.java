package com.revolut.data.database.models.splitbill;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006."}, d2 = {"Lcom/revolut/data/database/models/splitbill/SplitBillEntity;", "", "id", "", "state", "currency", "comment", "ownerId", "datetime", "", "splittedItems", "", "Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "moneyRequests", "Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;", "registeredIdentityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getState", "getCurrency", "getComment", "getOwnerId", "getDatetime", "()J", "getSplittedItems", "()Ljava/util/List;", "getMoneyRequests", "getRegisteredIdentityId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillEntity {
    private final String comment;

    @NotNull
    private final String currency;
    private final long datetime;

    @NotNull
    private final String id;

    @NotNull
    private final List<SplitMoneyRequestEmbeddedEntity> moneyRequests;
    private final String ownerId;
    private final String registeredIdentityId;

    @NotNull
    private final List<SplittedItemEntity> splittedItems;

    @NotNull
    private final String state;

    public SplitBillEntity(@NotNull String id10, @NotNull String state, @NotNull String currency, String str, String str2, long j2, @NotNull List<SplittedItemEntity> splittedItems, @NotNull List<SplitMoneyRequestEmbeddedEntity> moneyRequests, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        this.id = id10;
        this.state = state;
        this.currency = currency;
        this.comment = str;
        this.ownerId = str2;
        this.datetime = j2;
        this.splittedItems = splittedItems;
        this.moneyRequests = moneyRequests;
        this.registeredIdentityId = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplitBillEntity copy$default(SplitBillEntity splitBillEntity, String str, String str2, String str3, String str4, String str5, long j2, List list, List list2, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splitBillEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = splitBillEntity.state;
        }
        if ((i & 4) != 0) {
            str3 = splitBillEntity.currency;
        }
        if ((i & 8) != 0) {
            str4 = splitBillEntity.comment;
        }
        if ((i & 16) != 0) {
            str5 = splitBillEntity.ownerId;
        }
        if ((i & 32) != 0) {
            j2 = splitBillEntity.datetime;
        }
        if ((i & 64) != 0) {
            list = splitBillEntity.splittedItems;
        }
        if ((i & 128) != 0) {
            list2 = splitBillEntity.moneyRequests;
        }
        if ((i & 256) != 0) {
            str6 = splitBillEntity.registeredIdentityId;
        }
        String str7 = str6;
        List list3 = list;
        long j3 = j2;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        return splitBillEntity.copy(str, str2, str10, str8, str9, j3, list3, list2, str7);
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
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getDatetime() {
        return this.datetime;
    }

    @NotNull
    public final List<SplittedItemEntity> component7() {
        return this.splittedItems;
    }

    @NotNull
    public final List<SplitMoneyRequestEmbeddedEntity> component8() {
        return this.moneyRequests;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    public final SplitBillEntity copy(@NotNull String id10, @NotNull String state, @NotNull String currency, String comment, String ownerId, long datetime, @NotNull List<SplittedItemEntity> splittedItems, @NotNull List<SplitMoneyRequestEmbeddedEntity> moneyRequests, String registeredIdentityId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(splittedItems, "splittedItems");
        Intrinsics.checkNotNullParameter(moneyRequests, "moneyRequests");
        return new SplitBillEntity(id10, state, currency, comment, ownerId, datetime, splittedItems, moneyRequests, registeredIdentityId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitBillEntity)) {
            return false;
        }
        SplitBillEntity splitBillEntity = (SplitBillEntity) other;
        return Intrinsics.f(this.id, splitBillEntity.id) && Intrinsics.f(this.state, splitBillEntity.state) && Intrinsics.f(this.currency, splitBillEntity.currency) && Intrinsics.f(this.comment, splitBillEntity.comment) && Intrinsics.f(this.ownerId, splitBillEntity.ownerId) && this.datetime == splitBillEntity.datetime && Intrinsics.f(this.splittedItems, splitBillEntity.splittedItems) && Intrinsics.f(this.moneyRequests, splitBillEntity.moneyRequests) && Intrinsics.f(this.registeredIdentityId, splitBillEntity.registeredIdentityId);
    }

    public final String getComment() {
        return this.comment;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final long getDatetime() {
        return this.datetime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<SplitMoneyRequestEmbeddedEntity> getMoneyRequests() {
        return this.moneyRequests;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @NotNull
    public final List<SplittedItemEntity> getSplittedItems() {
        return this.splittedItems;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.currency);
        String str = this.comment;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ownerId;
        int iD = p.a.d(p.a.d(d.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.datetime), 31, this.splittedItems), 31, this.moneyRequests);
        String str3 = this.registeredIdentityId;
        return iD + (str3 != null ? str3.hashCode() : 0);
    }
}
