package com.revolut.data.network.models.moneyrequest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0088\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00062"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "", "id", "", "type", "transactionId", "title", "amount", "", "currency", "lineItems", "", "Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;", "receiptFileName", "scanTaskId", "receiptImageUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTransactionId", "getTitle", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getLineItems", "()Ljava/util/List;", "getReceiptFileName", "getScanTaskId", "getReceiptImageUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplittedItemDto {

    @b("amount")
    private final Long amount;

    @b("currency")
    private final String currency;

    @b("id")
    @NotNull
    private final String id;

    @b("lineItems")
    private final List<SplitLineItemDto> lineItems;

    @b("receiptFileName")
    private final String receiptFileName;

    @b("receiptImageUri")
    private final String receiptImageUri;

    @b("scanTaskId")
    private final String scanTaskId;

    @b("title")
    private final String title;

    @b("transactionId")
    private final String transactionId;

    @b("type")
    @NotNull
    private final String type;

    public SplittedItemDto(@NotNull String id10, @NotNull String type, String str, String str2, Long l2, String str3, List<SplitLineItemDto> list, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id10;
        this.type = type;
        this.transactionId = str;
        this.title = str2;
        this.amount = l2;
        this.currency = str3;
        this.lineItems = list;
        this.receiptFileName = str4;
        this.scanTaskId = str5;
        this.receiptImageUri = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SplittedItemDto copy$default(SplittedItemDto splittedItemDto, String str, String str2, String str3, String str4, Long l2, String str5, List list, String str6, String str7, String str8, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = splittedItemDto.id;
        }
        if ((i & 2) != 0) {
            str2 = splittedItemDto.type;
        }
        if ((i & 4) != 0) {
            str3 = splittedItemDto.transactionId;
        }
        if ((i & 8) != 0) {
            str4 = splittedItemDto.title;
        }
        if ((i & 16) != 0) {
            l2 = splittedItemDto.amount;
        }
        if ((i & 32) != 0) {
            str5 = splittedItemDto.currency;
        }
        if ((i & 64) != 0) {
            list = splittedItemDto.lineItems;
        }
        if ((i & 128) != 0) {
            str6 = splittedItemDto.receiptFileName;
        }
        if ((i & 256) != 0) {
            str7 = splittedItemDto.scanTaskId;
        }
        if ((i & 512) != 0) {
            str8 = splittedItemDto.receiptImageUri;
        }
        String str9 = str7;
        String str10 = str8;
        List list2 = list;
        String str11 = str6;
        Long l3 = l2;
        String str12 = str5;
        return splittedItemDto.copy(str, str2, str3, str4, l3, str12, list2, str11, str9, str10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getReceiptImageUri() {
        return this.receiptImageUri;
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
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final List<SplitLineItemDto> component7() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReceiptFileName() {
        return this.receiptFileName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getScanTaskId() {
        return this.scanTaskId;
    }

    @NotNull
    public final SplittedItemDto copy(@NotNull String id10, @NotNull String type, String transactionId, String title, Long amount, String currency, List<SplitLineItemDto> lineItems, String receiptFileName, String scanTaskId, String receiptImageUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SplittedItemDto(id10, type, transactionId, title, amount, currency, lineItems, receiptFileName, scanTaskId, receiptImageUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplittedItemDto)) {
            return false;
        }
        SplittedItemDto splittedItemDto = (SplittedItemDto) other;
        return Intrinsics.f(this.id, splittedItemDto.id) && Intrinsics.f(this.type, splittedItemDto.type) && Intrinsics.f(this.transactionId, splittedItemDto.transactionId) && Intrinsics.f(this.title, splittedItemDto.title) && Intrinsics.f(this.amount, splittedItemDto.amount) && Intrinsics.f(this.currency, splittedItemDto.currency) && Intrinsics.f(this.lineItems, splittedItemDto.lineItems) && Intrinsics.f(this.receiptFileName, splittedItemDto.receiptFileName) && Intrinsics.f(this.scanTaskId, splittedItemDto.scanTaskId) && Intrinsics.f(this.receiptImageUri, splittedItemDto.receiptImageUri);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final List<SplitLineItemDto> getLineItems() {
        return this.lineItems;
    }

    public final String getReceiptFileName() {
        return this.receiptFileName;
    }

    public final String getReceiptImageUri() {
        return this.receiptImageUri;
    }

    public final String getScanTaskId() {
        return this.scanTaskId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = a.c(this.id.hashCode() * 31, 31, this.type);
        String str = this.transactionId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.amount;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SplitLineItemDto> list = this.lineItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.receiptFileName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.scanTaskId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.receiptImageUri;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public /* synthetic */ SplittedItemDto(String str, String str2, String str3, String str4, Long l2, String str5, List list, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, l2, str5, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8);
    }
}
