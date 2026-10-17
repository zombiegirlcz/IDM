package com.revolut.data.database.models.splitbill;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003Jp\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "", "id", "", "type", "transactionId", "title", "totalAmount", "", "currency", "receiptImageUri", "lineItems", "", "Lcom/revolut/data/database/models/splitbill/SplitLineItemEmbeddedEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getType", "getTransactionId", "getTitle", "getTotalAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getReceiptImageUri", "getLineItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplittedItemEntity {

    @b("currency")
    private final String currency;

    @b("id")
    @NotNull
    private final String id;

    @b("lineItems")
    private final List<SplitLineItemEmbeddedEntity> lineItems;

    @b("receiptImageUri")
    private final String receiptImageUri;

    @b("title")
    private final String title;

    @b("totalAmount")
    private final Long totalAmount;

    @b("transactionId")
    private final String transactionId;

    @b("type")
    @NotNull
    private final String type;

    public SplittedItemEntity(@NotNull String id10, @NotNull String type, String str, String str2, Long l2, String str3, String str4, List<SplitLineItemEmbeddedEntity> list) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.type = type;
        this.transactionId = str;
        this.title = str2;
        this.totalAmount = l2;
        this.currency = str3;
        this.receiptImageUri = str4;
        this.lineItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplittedItemEntity copy$default(SplittedItemEntity splittedItemEntity, String str, String str2, String str3, String str4, Long l2, String str5, String str6, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splittedItemEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = splittedItemEntity.type;
        }
        if ((i & 4) != 0) {
            str3 = splittedItemEntity.transactionId;
        }
        if ((i & 8) != 0) {
            str4 = splittedItemEntity.title;
        }
        if ((i & 16) != 0) {
            l2 = splittedItemEntity.totalAmount;
        }
        if ((i & 32) != 0) {
            str5 = splittedItemEntity.currency;
        }
        if ((i & 64) != 0) {
            str6 = splittedItemEntity.receiptImageUri;
        }
        if ((i & 128) != 0) {
            list = splittedItemEntity.lineItems;
        }
        String str7 = str6;
        List list2 = list;
        Long l3 = l2;
        String str8 = str5;
        return splittedItemEntity.copy(str, str2, str3, str4, l3, str8, str7, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReceiptImageUri() {
        return this.receiptImageUri;
    }

    public final List<SplitLineItemEmbeddedEntity> component8() {
        return this.lineItems;
    }

    @NotNull
    public final SplittedItemEntity copy(@NotNull String id10, @NotNull String type, String transactionId, String title, Long totalAmount, String currency, String receiptImageUri, List<SplitLineItemEmbeddedEntity> lineItems) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SplittedItemEntity(id10, type, transactionId, title, totalAmount, currency, receiptImageUri, lineItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplittedItemEntity)) {
            return false;
        }
        SplittedItemEntity splittedItemEntity = (SplittedItemEntity) other;
        return Intrinsics.f(this.id, splittedItemEntity.id) && Intrinsics.f(this.type, splittedItemEntity.type) && Intrinsics.f(this.transactionId, splittedItemEntity.transactionId) && Intrinsics.f(this.title, splittedItemEntity.title) && Intrinsics.f(this.totalAmount, splittedItemEntity.totalAmount) && Intrinsics.f(this.currency, splittedItemEntity.currency) && Intrinsics.f(this.receiptImageUri, splittedItemEntity.receiptImageUri) && Intrinsics.f(this.lineItems, splittedItemEntity.lineItems);
    }

    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final List<SplitLineItemEmbeddedEntity> getLineItems() {
        return this.lineItems;
    }

    public final String getReceiptImageUri() {
        return this.receiptImageUri;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTotalAmount() {
        return this.totalAmount;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
        String str = this.transactionId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.totalAmount;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.receiptImageUri;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SplitLineItemEmbeddedEntity> list = this.lineItems;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public /* synthetic */ SplittedItemEntity(String str, String str2, String str3, String str4, Long l2, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list);
    }
}
