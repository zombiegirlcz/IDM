package com.revolut.data.network.models.confirmations;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "", "firstName", "", "lastName", "birthDate", "phone", "email", "address", "createdDate", "updatedDate", "userState", "walletRef", "terminatedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getBirthDate", "getPhone", "getEmail", "getAddress", "getCreatedDate", "getUpdatedDate", "getUserState", "getWalletRef", "getTerminatedDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProfileAccountUserDto {

    @b("address")
    private final String address;

    @b("birthDate")
    private final String birthDate;

    @b("createdDate")
    private final String createdDate;

    @b("email")
    private final String email;

    @b("firstName")
    private final String firstName;

    @b("lastName")
    private final String lastName;

    @b("phone")
    private final String phone;

    @b("terminatedDate")
    private final String terminatedDate;

    @b("updatedDate")
    private final String updatedDate;

    @b("userState")
    private final String userState;

    @b("walletRef")
    private final String walletRef;

    public ProfileAccountUserDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.firstName = str;
        this.lastName = str2;
        this.birthDate = str3;
        this.phone = str4;
        this.email = str5;
        this.address = str6;
        this.createdDate = str7;
        this.updatedDate = str8;
        this.userState = str9;
        this.walletRef = str10;
        this.terminatedDate = str11;
    }

    public static /* synthetic */ ProfileAccountUserDto copy$default(ProfileAccountUserDto profileAccountUserDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = profileAccountUserDto.firstName;
        }
        if ((i & 2) != 0) {
            str2 = profileAccountUserDto.lastName;
        }
        if ((i & 4) != 0) {
            str3 = profileAccountUserDto.birthDate;
        }
        if ((i & 8) != 0) {
            str4 = profileAccountUserDto.phone;
        }
        if ((i & 16) != 0) {
            str5 = profileAccountUserDto.email;
        }
        if ((i & 32) != 0) {
            str6 = profileAccountUserDto.address;
        }
        if ((i & 64) != 0) {
            str7 = profileAccountUserDto.createdDate;
        }
        if ((i & 128) != 0) {
            str8 = profileAccountUserDto.updatedDate;
        }
        if ((i & 256) != 0) {
            str9 = profileAccountUserDto.userState;
        }
        if ((i & 512) != 0) {
            str10 = profileAccountUserDto.walletRef;
        }
        if ((i & 1024) != 0) {
            str11 = profileAccountUserDto.terminatedDate;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return profileAccountUserDto.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getWalletRef() {
        return this.walletRef;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTerminatedDate() {
        return this.terminatedDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserState() {
        return this.userState;
    }

    @NotNull
    public final ProfileAccountUserDto copy(String firstName, String lastName, String birthDate, String phone, String email, String address, String createdDate, String updatedDate, String userState, String walletRef, String terminatedDate) {
        return new ProfileAccountUserDto(firstName, lastName, birthDate, phone, email, address, createdDate, updatedDate, userState, walletRef, terminatedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileAccountUserDto)) {
            return false;
        }
        ProfileAccountUserDto profileAccountUserDto = (ProfileAccountUserDto) other;
        return Intrinsics.f(this.firstName, profileAccountUserDto.firstName) && Intrinsics.f(this.lastName, profileAccountUserDto.lastName) && Intrinsics.f(this.birthDate, profileAccountUserDto.birthDate) && Intrinsics.f(this.phone, profileAccountUserDto.phone) && Intrinsics.f(this.email, profileAccountUserDto.email) && Intrinsics.f(this.address, profileAccountUserDto.address) && Intrinsics.f(this.createdDate, profileAccountUserDto.createdDate) && Intrinsics.f(this.updatedDate, profileAccountUserDto.updatedDate) && Intrinsics.f(this.userState, profileAccountUserDto.userState) && Intrinsics.f(this.walletRef, profileAccountUserDto.walletRef) && Intrinsics.f(this.terminatedDate, profileAccountUserDto.terminatedDate);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getTerminatedDate() {
        return this.terminatedDate;
    }

    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    public final String getUserState() {
        return this.userState;
    }

    public final String getWalletRef() {
        return this.walletRef;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.phone;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.createdDate;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updatedDate;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.userState;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.walletRef;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.terminatedDate;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }
}
