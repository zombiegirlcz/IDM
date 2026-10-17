package com.revolut.data.database.models.openbanking;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003JÂ\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001aR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001f¨\u0006="}, d2 = {"Lcom/revolut/data/database/models/openbanking/AuRegionConsentEntity;", "", "id", "", "type", "state", "authorisedDate", "", "expiryDate", "revokedDate", "permissions", "", "thirdPartyId", "thirdPartyName", "thirdPartyLogoUrl", "pockets", "loans", "amendedDate", "amendedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getType", "getState", "getAuthorisedDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getExpiryDate", "getRevokedDate", "getPermissions", "()Ljava/util/List;", "getThirdPartyId", "getThirdPartyName", "getThirdPartyLogoUrl", "getPockets", "getLoans", "getAmendedDate", "getAmendedData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/revolut/data/database/models/openbanking/AuRegionConsentEntity;", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuRegionConsentEntity {

    @lg.b("amendedData")
    private final List<String> amendedData;

    @lg.b("amendedDate")
    private final Long amendedDate;

    @lg.b("authorisedDate")
    private final Long authorisedDate;

    @lg.b("expiryDate")
    private final Long expiryDate;

    @lg.b("id")
    @NotNull
    private final String id;

    @lg.b("loans")
    private final List<String> loans;

    @lg.b("permissions")
    @NotNull
    private final List<String> permissions;

    @lg.b("pockets")
    private final List<String> pockets;

    @lg.b("revokedDate")
    private final Long revokedDate;

    @lg.b("state")
    @NotNull
    private final String state;

    @lg.b("thirdPartyId")
    @NotNull
    private final String thirdPartyId;

    @lg.b("thirdPartyLogoUrl")
    private final String thirdPartyLogoUrl;

    @lg.b("thirdPartyName")
    @NotNull
    private final String thirdPartyName;

    @lg.b("type")
    @NotNull
    private final String type;

    public AuRegionConsentEntity(@NotNull String id10, @NotNull String type, @NotNull String state, Long l2, Long l3, Long l4, @NotNull List<String> permissions, @NotNull String thirdPartyId, @NotNull String thirdPartyName, String str, List<String> list, List<String> list2, Long l5, List<String> list3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(thirdPartyId, "thirdPartyId");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.authorisedDate = l2;
        this.expiryDate = l3;
        this.revokedDate = l4;
        this.permissions = permissions;
        this.thirdPartyId = thirdPartyId;
        this.thirdPartyName = thirdPartyName;
        this.thirdPartyLogoUrl = str;
        this.pockets = list;
        this.loans = list2;
        this.amendedDate = l5;
        this.amendedData = list3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThirdPartyLogoUrl() {
        return this.thirdPartyLogoUrl;
    }

    public final List<String> component11() {
        return this.pockets;
    }

    public final List<String> component12() {
        return this.loans;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getAmendedDate() {
        return this.amendedDate;
    }

    public final List<String> component14() {
        return this.amendedData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getAuthorisedDate() {
        return this.authorisedDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getRevokedDate() {
        return this.revokedDate;
    }

    @NotNull
    public final List<String> component7() {
        return this.permissions;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThirdPartyId() {
        return this.thirdPartyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getThirdPartyName() {
        return this.thirdPartyName;
    }

    @NotNull
    public final AuRegionConsentEntity copy(@NotNull String id10, @NotNull String type, @NotNull String state, Long authorisedDate, Long expiryDate, Long revokedDate, @NotNull List<String> permissions, @NotNull String thirdPartyId, @NotNull String thirdPartyName, String thirdPartyLogoUrl, List<String> pockets, List<String> loans, Long amendedDate, List<String> amendedData) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(thirdPartyId, "thirdPartyId");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        return new AuRegionConsentEntity(id10, type, state, authorisedDate, expiryDate, revokedDate, permissions, thirdPartyId, thirdPartyName, thirdPartyLogoUrl, pockets, loans, amendedDate, amendedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuRegionConsentEntity)) {
            return false;
        }
        AuRegionConsentEntity auRegionConsentEntity = (AuRegionConsentEntity) other;
        return Intrinsics.f(this.id, auRegionConsentEntity.id) && Intrinsics.f(this.type, auRegionConsentEntity.type) && Intrinsics.f(this.state, auRegionConsentEntity.state) && Intrinsics.f(this.authorisedDate, auRegionConsentEntity.authorisedDate) && Intrinsics.f(this.expiryDate, auRegionConsentEntity.expiryDate) && Intrinsics.f(this.revokedDate, auRegionConsentEntity.revokedDate) && Intrinsics.f(this.permissions, auRegionConsentEntity.permissions) && Intrinsics.f(this.thirdPartyId, auRegionConsentEntity.thirdPartyId) && Intrinsics.f(this.thirdPartyName, auRegionConsentEntity.thirdPartyName) && Intrinsics.f(this.thirdPartyLogoUrl, auRegionConsentEntity.thirdPartyLogoUrl) && Intrinsics.f(this.pockets, auRegionConsentEntity.pockets) && Intrinsics.f(this.loans, auRegionConsentEntity.loans) && Intrinsics.f(this.amendedDate, auRegionConsentEntity.amendedDate) && Intrinsics.f(this.amendedData, auRegionConsentEntity.amendedData);
    }

    public final List<String> getAmendedData() {
        return this.amendedData;
    }

    public final Long getAmendedDate() {
        return this.amendedDate;
    }

    public final Long getAuthorisedDate() {
        return this.authorisedDate;
    }

    public final Long getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final List<String> getLoans() {
        return this.loans;
    }

    @NotNull
    public final List<String> getPermissions() {
        return this.permissions;
    }

    public final List<String> getPockets() {
        return this.pockets;
    }

    public final Long getRevokedDate() {
        return this.revokedDate;
    }

    @NotNull
    public final String getState() {
        return this.state;
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
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state);
        Long l2 = this.authorisedDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.expiryDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.revokedDate;
        int iC2 = p.a.c(p.a.c(p.a.d((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.permissions), 31, this.thirdPartyId), 31, this.thirdPartyName);
        String str = this.thirdPartyLogoUrl;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.pockets;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.loans;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l5 = this.amendedDate;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        List<String> list3 = this.amendedData;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public /* synthetic */ AuRegionConsentEntity(String str, String str2, String str3, Long l2, Long l3, Long l4, List list, String str4, String str5, String str6, List list2, List list3, Long l5, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, l2, l3, l4, list, str4, str5, str6, list2, list3, (i & 4096) != 0 ? null : l5, (i & 8192) != 0 ? null : list4);
    }
}
