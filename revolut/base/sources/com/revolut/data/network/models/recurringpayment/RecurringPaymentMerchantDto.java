package com.revolut.data.network.models.recurringpayment;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0007\u0010\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMerchantDto;", "", "id", "", "title", "category", "logo", "isBlocked", "", "canBeBlocked", "blockedMerchantId", "blockDate", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getCategory", "getLogo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanBeBlocked", "getBlockedMerchantId", "getBlockDate", "getReferenceId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/revolut/data/network/models/recurringpayment/RecurringPaymentMerchantDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentMerchantDto {

    @b("blockDate")
    private final String blockDate;

    @b("blockedMerchantId")
    private final String blockedMerchantId;

    @b("canBeBlocked")
    private final Boolean canBeBlocked;

    @b("category")
    private final String category;

    @b("id")
    private final String id;

    @b("blocked")
    private final Boolean isBlocked;

    @b("logo")
    private final String logo;

    @b("referenceId")
    private final String referenceId;

    @b("title")
    private final String title;

    public RecurringPaymentMerchantDto() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ RecurringPaymentMerchantDto copy$default(RecurringPaymentMerchantDto recurringPaymentMerchantDto, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, String str7, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = recurringPaymentMerchantDto.id;
        }
        if ((i & 2) != 0) {
            str2 = recurringPaymentMerchantDto.title;
        }
        if ((i & 4) != 0) {
            str3 = recurringPaymentMerchantDto.category;
        }
        if ((i & 8) != 0) {
            str4 = recurringPaymentMerchantDto.logo;
        }
        if ((i & 16) != 0) {
            bool = recurringPaymentMerchantDto.isBlocked;
        }
        if ((i & 32) != 0) {
            bool2 = recurringPaymentMerchantDto.canBeBlocked;
        }
        if ((i & 64) != 0) {
            str5 = recurringPaymentMerchantDto.blockedMerchantId;
        }
        if ((i & 128) != 0) {
            str6 = recurringPaymentMerchantDto.blockDate;
        }
        if ((i & 256) != 0) {
            str7 = recurringPaymentMerchantDto.referenceId;
        }
        String str8 = str6;
        String str9 = str7;
        Boolean bool3 = bool2;
        String str10 = str5;
        Boolean bool4 = bool;
        String str11 = str3;
        return recurringPaymentMerchantDto.copy(str, str2, str11, str4, bool4, bool3, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getCanBeBlocked() {
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
    public final RecurringPaymentMerchantDto copy(String id10, String title, String category, String logo, Boolean isBlocked, Boolean canBeBlocked, String blockedMerchantId, String blockDate, String referenceId) {
        return new RecurringPaymentMerchantDto(id10, title, category, logo, isBlocked, canBeBlocked, blockedMerchantId, blockDate, referenceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentMerchantDto)) {
            return false;
        }
        RecurringPaymentMerchantDto recurringPaymentMerchantDto = (RecurringPaymentMerchantDto) other;
        return Intrinsics.f(this.id, recurringPaymentMerchantDto.id) && Intrinsics.f(this.title, recurringPaymentMerchantDto.title) && Intrinsics.f(this.category, recurringPaymentMerchantDto.category) && Intrinsics.f(this.logo, recurringPaymentMerchantDto.logo) && Intrinsics.f(this.isBlocked, recurringPaymentMerchantDto.isBlocked) && Intrinsics.f(this.canBeBlocked, recurringPaymentMerchantDto.canBeBlocked) && Intrinsics.f(this.blockedMerchantId, recurringPaymentMerchantDto.blockedMerchantId) && Intrinsics.f(this.blockDate, recurringPaymentMerchantDto.blockDate) && Intrinsics.f(this.referenceId, recurringPaymentMerchantDto.referenceId);
    }

    public final String getBlockDate() {
        return this.blockDate;
    }

    public final String getBlockedMerchantId() {
        return this.blockedMerchantId;
    }

    public final Boolean getCanBeBlocked() {
        return this.canBeBlocked;
    }

    public final String getCategory() {
        return this.category;
    }

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
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logo;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isBlocked;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canBeBlocked;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.blockedMerchantId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.blockDate;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.referenceId;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final Boolean isBlocked() {
        return this.isBlocked;
    }

    public RecurringPaymentMerchantDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, String str7) {
        this.id = str;
        this.title = str2;
        this.category = str3;
        this.logo = str4;
        this.isBlocked = bool;
        this.canBeBlocked = bool2;
        this.blockedMerchantId = str5;
        this.blockDate = str6;
        this.referenceId = str7;
    }

    public /* synthetic */ RecurringPaymentMerchantDto(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
