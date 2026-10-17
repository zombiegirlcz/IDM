package com.revolut.data.database.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001d¨\u0006-"}, d2 = {"Lcom/revolut/data/database/models/openbanking/ConsentEntity;", "", "id", "", "type", "expiryDate", "Lorg/joda/time/DateTime;", "permissions", "", "accountNumbers", "Lcom/revolut/data/database/models/openbanking/ConsentAccountEntity;", "thirdPartyId", "thirdPartyName", "thirdPartyLogoUrl", "isActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getType", "getExpiryDate", "()Lorg/joda/time/DateTime;", "getPermissions", "()Ljava/util/List;", "getAccountNumbers", "getThirdPartyId", "getThirdPartyName", "getThirdPartyLogoUrl", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentEntity {

    @NotNull
    private final List<ConsentAccountEntity> accountNumbers;
    private final DateTime expiryDate;

    @NotNull
    private final String id;
    private final boolean isActive;

    @NotNull
    private final List<String> permissions;

    @NotNull
    private final String thirdPartyId;
    private final String thirdPartyLogoUrl;

    @NotNull
    private final String thirdPartyName;

    @NotNull
    private final String type;

    public ConsentEntity(@NotNull String id10, @NotNull String type, DateTime dateTime, @NotNull List<String> permissions, @NotNull List<ConsentAccountEntity> accountNumbers, @NotNull String thirdPartyId, @NotNull String thirdPartyName, String str, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(thirdPartyId, "thirdPartyId");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        this.id = id10;
        this.type = type;
        this.expiryDate = dateTime;
        this.permissions = permissions;
        this.accountNumbers = accountNumbers;
        this.thirdPartyId = thirdPartyId;
        this.thirdPartyName = thirdPartyName;
        this.thirdPartyLogoUrl = str;
        this.isActive = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConsentEntity copy$default(ConsentEntity consentEntity, String str, String str2, DateTime dateTime, List list, List list2, String str3, String str4, String str5, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = consentEntity.id;
        }
        if ((i & 2) != 0) {
            str2 = consentEntity.type;
        }
        if ((i & 4) != 0) {
            dateTime = consentEntity.expiryDate;
        }
        if ((i & 8) != 0) {
            list = consentEntity.permissions;
        }
        if ((i & 16) != 0) {
            list2 = consentEntity.accountNumbers;
        }
        if ((i & 32) != 0) {
            str3 = consentEntity.thirdPartyId;
        }
        if ((i & 64) != 0) {
            str4 = consentEntity.thirdPartyName;
        }
        if ((i & 128) != 0) {
            str5 = consentEntity.thirdPartyLogoUrl;
        }
        if ((i & 256) != 0) {
            z = consentEntity.isActive;
        }
        String str6 = str5;
        boolean z3 = z;
        String str7 = str3;
        String str8 = str4;
        List list3 = list2;
        DateTime dateTime2 = dateTime;
        return consentEntity.copy(str, str2, dateTime2, list, list3, str7, str8, str6, z3);
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
    public final DateTime getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final List<String> component4() {
        return this.permissions;
    }

    @NotNull
    public final List<ConsentAccountEntity> component5() {
        return this.accountNumbers;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThirdPartyId() {
        return this.thirdPartyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThirdPartyName() {
        return this.thirdPartyName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThirdPartyLogoUrl() {
        return this.thirdPartyLogoUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final ConsentEntity copy(@NotNull String id10, @NotNull String type, DateTime expiryDate, @NotNull List<String> permissions, @NotNull List<ConsentAccountEntity> accountNumbers, @NotNull String thirdPartyId, @NotNull String thirdPartyName, String thirdPartyLogoUrl, boolean isActive) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
        Intrinsics.checkNotNullParameter(thirdPartyId, "thirdPartyId");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        return new ConsentEntity(id10, type, expiryDate, permissions, accountNumbers, thirdPartyId, thirdPartyName, thirdPartyLogoUrl, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentEntity)) {
            return false;
        }
        ConsentEntity consentEntity = (ConsentEntity) other;
        return Intrinsics.f(this.id, consentEntity.id) && Intrinsics.f(this.type, consentEntity.type) && Intrinsics.f(this.expiryDate, consentEntity.expiryDate) && Intrinsics.f(this.permissions, consentEntity.permissions) && Intrinsics.f(this.accountNumbers, consentEntity.accountNumbers) && Intrinsics.f(this.thirdPartyId, consentEntity.thirdPartyId) && Intrinsics.f(this.thirdPartyName, consentEntity.thirdPartyName) && Intrinsics.f(this.thirdPartyLogoUrl, consentEntity.thirdPartyLogoUrl) && this.isActive == consentEntity.isActive;
    }

    @NotNull
    public final List<ConsentAccountEntity> getAccountNumbers() {
        return this.accountNumbers;
    }

    public final DateTime getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final String getThirdPartyId() {
        return this.thirdPartyId;
    }

    public final String getThirdPartyLogoUrl() {
        return this.thirdPartyLogoUrl;
    }

    @NotNull
    public final String getThirdPartyName() {
        return this.thirdPartyName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
        DateTime dateTime = this.expiryDate;
        int iC2 = p.a.c(p.a.c(p.a.d(p.a.d((iC + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31, this.permissions), 31, this.accountNumbers), 31, this.thirdPartyId), 31, this.thirdPartyName);
        String str = this.thirdPartyLogoUrl;
        return Boolean.hashCode(this.isActive) + ((iC2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
