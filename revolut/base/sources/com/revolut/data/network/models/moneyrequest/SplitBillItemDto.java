package com.revolut.data.network.models.moneyrequest;

import a0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0091\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015¨\u00066"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplitBillItemDto;", "", "id", "", "type", "transactionId", "category", "logo", "title", "totalAmount", "", "requestedCurrency", "requestedAmount", "sourceCurrency", "lineItems", "", "Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;", "receiptImageUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTransactionId", "getCategory", "getLogo", "getTitle", "getTotalAmount", "()J", "getRequestedCurrency", "getRequestedAmount", "getSourceCurrency", "getLineItems", "()Ljava/util/List;", "getReceiptImageUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitBillItemDto {

    @b("category")
    private final String category;

    @b("id")
    @NotNull
    private final String id;

    @b("lineItems")
    private final List<SplitLineItemDto> lineItems;

    @b("logo")
    private final String logo;

    @b("receiptImageUri")
    private final String receiptImageUri;

    @b("requestedAmount")
    private final long requestedAmount;

    @b("currency")
    @NotNull
    private final String requestedCurrency;

    @b("requestedCurrency")
    @NotNull
    private final String sourceCurrency;

    @b("title")
    @NotNull
    private final String title;

    @b("amount")
    private final long totalAmount;

    @b("transactionId")
    private final String transactionId;

    @b("type")
    @NotNull
    private final String type;

    public SplitBillItemDto(@NotNull String id10, @NotNull String type, String str, String str2, String str3, @NotNull String title, long j2, @NotNull String requestedCurrency, long j3, @NotNull String sourceCurrency, List<SplitLineItemDto> list, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(requestedCurrency, "requestedCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        this.id = id10;
        this.type = type;
        this.transactionId = str;
        this.category = str2;
        this.logo = str3;
        this.title = title;
        this.totalAmount = j2;
        this.requestedCurrency = requestedCurrency;
        this.requestedAmount = j3;
        this.sourceCurrency = sourceCurrency;
        this.lineItems = list;
        this.receiptImageUri = str4;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    public final List<SplitLineItemDto> component11() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
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
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRequestedCurrency() {
        return this.requestedCurrency;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getRequestedAmount() {
        return this.requestedAmount;
    }

    @NotNull
    public final SplitBillItemDto copy(@NotNull String id10, @NotNull String type, String transactionId, String category, String logo, @NotNull String title, long totalAmount, @NotNull String requestedCurrency, long requestedAmount, @NotNull String sourceCurrency, List<SplitLineItemDto> lineItems, String receiptImageUri) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(requestedCurrency, "requestedCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        return new SplitBillItemDto(id10, type, transactionId, category, logo, title, totalAmount, requestedCurrency, requestedAmount, sourceCurrency, lineItems, receiptImageUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitBillItemDto)) {
            return false;
        }
        SplitBillItemDto splitBillItemDto = (SplitBillItemDto) other;
        return Intrinsics.f(this.id, splitBillItemDto.id) && Intrinsics.f(this.type, splitBillItemDto.type) && Intrinsics.f(this.transactionId, splitBillItemDto.transactionId) && Intrinsics.f(this.category, splitBillItemDto.category) && Intrinsics.f(this.logo, splitBillItemDto.logo) && Intrinsics.f(this.title, splitBillItemDto.title) && this.totalAmount == splitBillItemDto.totalAmount && Intrinsics.f(this.requestedCurrency, splitBillItemDto.requestedCurrency) && this.requestedAmount == splitBillItemDto.requestedAmount && Intrinsics.f(this.sourceCurrency, splitBillItemDto.sourceCurrency) && Intrinsics.f(this.lineItems, splitBillItemDto.lineItems) && Intrinsics.f(this.receiptImageUri, splitBillItemDto.receiptImageUri);
    }

    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final List<SplitLineItemDto> getLineItems() {
        return this.lineItems;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getReceiptImageUri() {
        return this.receiptImageUri;
    }

    public final long getRequestedAmount() {
        return this.requestedAmount;
    }

    @NotNull
    public final String getRequestedCurrency() {
        return this.requestedCurrency;
    }

    @NotNull
    public final String getSourceCurrency() {
        return this.sourceCurrency;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getTotalAmount() {
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
        int iC = a.c(this.id.hashCode() * 31, 31, this.type);
        String str = this.transactionId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iC2 = a.c(d.c(a.c(d.c(a.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.title), 31, this.totalAmount), 31, this.requestedCurrency), 31, this.requestedAmount), 31, this.sourceCurrency);
        List<SplitLineItemDto> list = this.lineItems;
        int iHashCode3 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.receiptImageUri;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public /* synthetic */ SplitBillItemDto(String str, String str2, String str3, String str4, String str5, String str6, long j2, String str7, long j3, String str8, List list, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, j2, str7, j3, str8, (i & 1024) != 0 ? null : list, (i & 2048) != 0 ? null : str9);
    }
}
