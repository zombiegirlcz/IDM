package com.revolut.data.database.models.recurringpayments;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "", "logoUrl", "", "initiatedDate", "", "title", "category", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getLogoUrl", "()Ljava/lang/String;", "getInitiatedDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTitle", "getCategory", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/database/models/recurringpayments/PendingRefundSenderInfoEmbeddedEntity;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PendingRefundSenderInfoEmbeddedEntity {

    @b("category")
    private final String category;

    @b("initiatedDate")
    private final Long initiatedDate;

    @b("logoUrl")
    private final String logoUrl;

    @b("title")
    private final String title;

    public PendingRefundSenderInfoEmbeddedEntity() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ PendingRefundSenderInfoEmbeddedEntity copy$default(PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntity, String str, Long l2, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = pendingRefundSenderInfoEmbeddedEntity.logoUrl;
        }
        if ((i & 2) != 0) {
            l2 = pendingRefundSenderInfoEmbeddedEntity.initiatedDate;
        }
        if ((i & 4) != 0) {
            str2 = pendingRefundSenderInfoEmbeddedEntity.title;
        }
        if ((i & 8) != 0) {
            str3 = pendingRefundSenderInfoEmbeddedEntity.category;
        }
        return pendingRefundSenderInfoEmbeddedEntity.copy(str, l2, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInitiatedDate() {
        return this.initiatedDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final PendingRefundSenderInfoEmbeddedEntity copy(String logoUrl, Long initiatedDate, String title, String category) {
        return new PendingRefundSenderInfoEmbeddedEntity(logoUrl, initiatedDate, title, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingRefundSenderInfoEmbeddedEntity)) {
            return false;
        }
        PendingRefundSenderInfoEmbeddedEntity pendingRefundSenderInfoEmbeddedEntity = (PendingRefundSenderInfoEmbeddedEntity) other;
        return Intrinsics.f(this.logoUrl, pendingRefundSenderInfoEmbeddedEntity.logoUrl) && Intrinsics.f(this.initiatedDate, pendingRefundSenderInfoEmbeddedEntity.initiatedDate) && Intrinsics.f(this.title, pendingRefundSenderInfoEmbeddedEntity.title) && Intrinsics.f(this.category, pendingRefundSenderInfoEmbeddedEntity.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final Long getInitiatedDate() {
        return this.initiatedDate;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.logoUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l2 = this.initiatedDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public PendingRefundSenderInfoEmbeddedEntity(String str, Long l2, String str2, String str3) {
        this.logoUrl = str;
        this.initiatedDate = l2;
        this.title = str2;
        this.category = str3;
    }

    public /* synthetic */ PendingRefundSenderInfoEmbeddedEntity(String str, Long l2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
