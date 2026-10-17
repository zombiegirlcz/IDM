package com.revolut.data.network.models.confirmations;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/revolut/data/network/models/confirmations/AccountConfirmationCoOwnerDto;", "", "firstName", "", "lastName", "phone", "birthDate", "email", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getPhone", "getBirthDate", "getEmail", "getAddress", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountConfirmationCoOwnerDto {

    @b("address")
    private final String address;

    @b("birthDate")
    private final String birthDate;

    @b("email")
    private final String email;

    @b("firstName")
    private final String firstName;

    @b("lastName")
    private final String lastName;

    @b("phone")
    private final String phone;

    public AccountConfirmationCoOwnerDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.birthDate = str4;
        this.email = str5;
        this.address = str6;
    }

    public static /* synthetic */ AccountConfirmationCoOwnerDto copy$default(AccountConfirmationCoOwnerDto accountConfirmationCoOwnerDto, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = accountConfirmationCoOwnerDto.firstName;
        }
        if ((i & 2) != 0) {
            str2 = accountConfirmationCoOwnerDto.lastName;
        }
        if ((i & 4) != 0) {
            str3 = accountConfirmationCoOwnerDto.phone;
        }
        if ((i & 8) != 0) {
            str4 = accountConfirmationCoOwnerDto.birthDate;
        }
        if ((i & 16) != 0) {
            str5 = accountConfirmationCoOwnerDto.email;
        }
        if ((i & 32) != 0) {
            str6 = accountConfirmationCoOwnerDto.address;
        }
        String str7 = str5;
        String str8 = str6;
        return accountConfirmationCoOwnerDto.copy(str, str2, str3, str4, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    public final AccountConfirmationCoOwnerDto copy(String firstName, String lastName, String phone, String birthDate, String email, String address) {
        return new AccountConfirmationCoOwnerDto(firstName, lastName, phone, birthDate, email, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountConfirmationCoOwnerDto)) {
            return false;
        }
        AccountConfirmationCoOwnerDto accountConfirmationCoOwnerDto = (AccountConfirmationCoOwnerDto) other;
        return Intrinsics.f(this.firstName, accountConfirmationCoOwnerDto.firstName) && Intrinsics.f(this.lastName, accountConfirmationCoOwnerDto.lastName) && Intrinsics.f(this.phone, accountConfirmationCoOwnerDto.phone) && Intrinsics.f(this.birthDate, accountConfirmationCoOwnerDto.birthDate) && Intrinsics.f(this.email, accountConfirmationCoOwnerDto.email) && Intrinsics.f(this.address, accountConfirmationCoOwnerDto.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getBirthDate() {
        return this.birthDate;
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

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.address;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
