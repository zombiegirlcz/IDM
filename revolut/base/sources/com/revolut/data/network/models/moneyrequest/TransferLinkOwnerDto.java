package com.revolut.data.network.models.moneyrequest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006("}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/TransferLinkOwnerDto;", "", "id", "", "firstName", "lastName", "legalName", "code", "username", "country", "appMode", "customerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFirstName", "getLastName", "getLegalName", "getCode", "getUsername", "getCountry", "getAppMode", "getCustomerType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferLinkOwnerDto {

    @b("appMode")
    private final String appMode;

    @b("code")
    @NotNull
    private final String code;

    @b("country")
    @NotNull
    private final String country;

    @b("customerType")
    private final String customerType;

    @b("firstName")
    @NotNull
    private final String firstName;

    @b("id")
    @NotNull
    private final String id;

    @b("lastName")
    @NotNull
    private final String lastName;

    @b("legalName")
    private final String legalName;

    @b("username")
    @NotNull
    private final String username;

    public TransferLinkOwnerDto(@NotNull String id10, @NotNull String firstName, @NotNull String lastName, String str, @NotNull String code, @NotNull String username, @NotNull String country, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        this.id = id10;
        this.firstName = firstName;
        this.lastName = lastName;
        this.legalName = str;
        this.code = code;
        this.username = username;
        this.country = country;
        this.appMode = str2;
        this.customerType = str3;
    }

    public static /* synthetic */ TransferLinkOwnerDto copy$default(TransferLinkOwnerDto transferLinkOwnerDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = transferLinkOwnerDto.id;
        }
        if ((i & 2) != 0) {
            str2 = transferLinkOwnerDto.firstName;
        }
        if ((i & 4) != 0) {
            str3 = transferLinkOwnerDto.lastName;
        }
        if ((i & 8) != 0) {
            str4 = transferLinkOwnerDto.legalName;
        }
        if ((i & 16) != 0) {
            str5 = transferLinkOwnerDto.code;
        }
        if ((i & 32) != 0) {
            str6 = transferLinkOwnerDto.username;
        }
        if ((i & 64) != 0) {
            str7 = transferLinkOwnerDto.country;
        }
        if ((i & 128) != 0) {
            str8 = transferLinkOwnerDto.appMode;
        }
        if ((i & 256) != 0) {
            str9 = transferLinkOwnerDto.customerType;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return transferLinkOwnerDto.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCustomerType() {
        return this.customerType;
    }

    @NotNull
    public final TransferLinkOwnerDto copy(@NotNull String id10, @NotNull String firstName, @NotNull String lastName, String legalName, @NotNull String code, @NotNull String username, @NotNull String country, String appMode, String customerType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(country, "country");
        return new TransferLinkOwnerDto(id10, firstName, lastName, legalName, code, username, country, appMode, customerType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferLinkOwnerDto)) {
            return false;
        }
        TransferLinkOwnerDto transferLinkOwnerDto = (TransferLinkOwnerDto) other;
        return Intrinsics.f(this.id, transferLinkOwnerDto.id) && Intrinsics.f(this.firstName, transferLinkOwnerDto.firstName) && Intrinsics.f(this.lastName, transferLinkOwnerDto.lastName) && Intrinsics.f(this.legalName, transferLinkOwnerDto.legalName) && Intrinsics.f(this.code, transferLinkOwnerDto.code) && Intrinsics.f(this.username, transferLinkOwnerDto.username) && Intrinsics.f(this.country, transferLinkOwnerDto.country) && Intrinsics.f(this.appMode, transferLinkOwnerDto.appMode) && Intrinsics.f(this.customerType, transferLinkOwnerDto.customerType);
    }

    public final String getAppMode() {
        return this.appMode;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final String getCustomerType() {
        return this.customerType;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iC = a.c(a.c(this.id.hashCode() * 31, 31, this.firstName), 31, this.lastName);
        String str = this.legalName;
        int iC2 = a.c(a.c(a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.code), 31, this.username), 31, this.country);
        String str2 = this.appMode;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerType;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
