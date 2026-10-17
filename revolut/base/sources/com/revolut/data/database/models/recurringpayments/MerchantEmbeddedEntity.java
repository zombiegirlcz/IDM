package com.revolut.data.database.models.recurringpayments;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006("}, d2 = {"Lcom/revolut/data/database/models/recurringpayments/MerchantEmbeddedEntity;", "", "id", "", "title", "logo", "category", "isBlocked", "", "canBeBlocked", "blockedMerchantId", "blockDate", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getLogo", "getCategory", "()Z", "getCanBeBlocked", "getBlockedMerchantId", "getBlockDate", "getReferenceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MerchantEmbeddedEntity {

    @b("blockDate")
    private final String blockDate;

    @b("blockedMerchantId")
    private final String blockedMerchantId;

    @b("canBeBlocked")
    private final boolean canBeBlocked;

    @b("category")
    private final String category;

    @b("id")
    @NotNull
    private final String id;

    @b("isBlocked")
    private final boolean isBlocked;

    @b("logo")
    private final String logo;

    @b("referenceId")
    private final String referenceId;

    @b("title")
    private final String title;

    public MerchantEmbeddedEntity(@NotNull String id10, String str, String str2, String str3, boolean z, boolean z3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.title = str;
        this.logo = str2;
        this.category = str3;
        this.isBlocked = z;
        this.canBeBlocked = z3;
        this.blockedMerchantId = str4;
        this.blockDate = str5;
        this.referenceId = str6;
    }

    public static /* synthetic */ MerchantEmbeddedEntity copy$default(MerchantEmbeddedEntity merchantEmbeddedEntity, String str, String str2, String str3, String str4, boolean z, boolean z3, String str5, String str6, String str7, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = merchantEmbeddedEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = merchantEmbeddedEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = merchantEmbeddedEntity.logo;
        }
        if ((i & 8) != 0) {
            str4 = merchantEmbeddedEntity.category;
        }
        if ((i & 16) != 0) {
            z = merchantEmbeddedEntity.isBlocked;
        }
        if ((i & 32) != 0) {
            z3 = merchantEmbeddedEntity.canBeBlocked;
        }
        if ((i & 64) != 0) {
            str5 = merchantEmbeddedEntity.blockedMerchantId;
        }
        if ((i & 128) != 0) {
            str6 = merchantEmbeddedEntity.blockDate;
        }
        if ((i & 256) != 0) {
            str7 = merchantEmbeddedEntity.referenceId;
        }
        String str8 = str6;
        String str9 = str7;
        boolean z4 = z3;
        String str10 = str5;
        boolean z6 = z;
        String str11 = str3;
        return merchantEmbeddedEntity.copy(str, str2, str11, str4, z6, z4, str10, str8, str9);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCanBeBlocked() {
        return this.canBeBlocked;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBlockedMerchantId() {
        return this.blockedMerchantId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBlockDate() {
        return this.blockDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReferenceId() {
        return this.referenceId;
    }

    @NotNull
    public final MerchantEmbeddedEntity copy(@NotNull String id10, String title, String logo, String category, boolean isBlocked, boolean canBeBlocked, String blockedMerchantId, String blockDate, String referenceId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new MerchantEmbeddedEntity(id10, title, logo, category, isBlocked, canBeBlocked, blockedMerchantId, blockDate, referenceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantEmbeddedEntity)) {
            return false;
        }
        MerchantEmbeddedEntity merchantEmbeddedEntity = (MerchantEmbeddedEntity) other;
        return Intrinsics.f(this.id, merchantEmbeddedEntity.id) && Intrinsics.f(this.title, merchantEmbeddedEntity.title) && Intrinsics.f(this.logo, merchantEmbeddedEntity.logo) && Intrinsics.f(this.category, merchantEmbeddedEntity.category) && this.isBlocked == merchantEmbeddedEntity.isBlocked && this.canBeBlocked == merchantEmbeddedEntity.canBeBlocked && Intrinsics.f(this.blockedMerchantId, merchantEmbeddedEntity.blockedMerchantId) && Intrinsics.f(this.blockDate, merchantEmbeddedEntity.blockDate) && Intrinsics.f(this.referenceId, merchantEmbeddedEntity.referenceId);
    }

    public final String getBlockDate() {
        return this.blockDate;
    }

    public final String getBlockedMerchantId() {
        return this.blockedMerchantId;
    }

    public final boolean getCanBeBlocked() {
        return this.canBeBlocked;
    }

    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iC = a.c(a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isBlocked), 31, this.canBeBlocked);
        String str4 = this.blockedMerchantId;
        int iHashCode4 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.blockDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.referenceId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }
}
