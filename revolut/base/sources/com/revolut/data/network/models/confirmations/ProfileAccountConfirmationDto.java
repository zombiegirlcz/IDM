package com.revolut.data.network.models.confirmations;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0003JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006*"}, d2 = {"Lcom/revolut/data/network/models/confirmations/ProfileAccountConfirmationDto;", "", "user", "Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "currentDate", "", "representations", "", "Lcom/revolut/data/network/models/confirmations/UserBankAccountsDto;", "international", "Lcom/revolut/data/network/models/confirmations/InternationalDto;", "jointAccount", "", "coOwners", "Lcom/revolut/data/network/models/confirmations/AccountConfirmationCoOwnerDto;", "<init>", "(Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/confirmations/InternationalDto;Ljava/lang/Boolean;Ljava/util/List;)V", "getUser", "()Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "getCurrentDate", "()Ljava/lang/String;", "getRepresentations", "()Ljava/util/List;", "getInternational", "()Lcom/revolut/data/network/models/confirmations/InternationalDto;", "getJointAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCoOwners", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/confirmations/InternationalDto;Ljava/lang/Boolean;Ljava/util/List;)Lcom/revolut/data/network/models/confirmations/ProfileAccountConfirmationDto;", "equals", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProfileAccountConfirmationDto {

    @b("coOwners")
    private final List<AccountConfirmationCoOwnerDto> coOwners;

    @b("currentDate")
    @NotNull
    private final String currentDate;

    @b("international")
    @NotNull
    private final InternationalDto international;

    @b("jointAccount")
    private final Boolean jointAccount;

    @b("userBankAccounts")
    @NotNull
    private final List<UserBankAccountsDto> representations;

    @b("user")
    @NotNull
    private final ProfileAccountUserDto user;

    public ProfileAccountConfirmationDto(@NotNull ProfileAccountUserDto user, @NotNull String currentDate, @NotNull List<UserBankAccountsDto> representations, @NotNull InternationalDto international, Boolean bool, List<AccountConfirmationCoOwnerDto> list) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(representations, "representations");
        Intrinsics.checkNotNullParameter(international, "international");
        this.user = user;
        this.currentDate = currentDate;
        this.representations = representations;
        this.international = international;
        this.jointAccount = bool;
        this.coOwners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileAccountConfirmationDto copy$default(ProfileAccountConfirmationDto profileAccountConfirmationDto, ProfileAccountUserDto profileAccountUserDto, String str, List list, InternationalDto internationalDto, Boolean bool, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            profileAccountUserDto = profileAccountConfirmationDto.user;
        }
        if ((i & 2) != 0) {
            str = profileAccountConfirmationDto.currentDate;
        }
        if ((i & 4) != 0) {
            list = profileAccountConfirmationDto.representations;
        }
        if ((i & 8) != 0) {
            internationalDto = profileAccountConfirmationDto.international;
        }
        if ((i & 16) != 0) {
            bool = profileAccountConfirmationDto.jointAccount;
        }
        if ((i & 32) != 0) {
            list2 = profileAccountConfirmationDto.coOwners;
        }
        Boolean bool2 = bool;
        List list3 = list2;
        return profileAccountConfirmationDto.copy(profileAccountUserDto, str, list, internationalDto, bool2, list3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProfileAccountUserDto getUser() {
        return this.user;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    @NotNull
    public final List<UserBankAccountsDto> component3() {
        return this.representations;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InternationalDto getInternational() {
        return this.international;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getJointAccount() {
        return this.jointAccount;
    }

    public final List<AccountConfirmationCoOwnerDto> component6() {
        return this.coOwners;
    }

    @NotNull
    public final ProfileAccountConfirmationDto copy(@NotNull ProfileAccountUserDto user, @NotNull String currentDate, @NotNull List<UserBankAccountsDto> representations, @NotNull InternationalDto international, Boolean jointAccount, List<AccountConfirmationCoOwnerDto> coOwners) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(representations, "representations");
        Intrinsics.checkNotNullParameter(international, "international");
        return new ProfileAccountConfirmationDto(user, currentDate, representations, international, jointAccount, coOwners);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileAccountConfirmationDto)) {
            return false;
        }
        ProfileAccountConfirmationDto profileAccountConfirmationDto = (ProfileAccountConfirmationDto) other;
        return Intrinsics.f(this.user, profileAccountConfirmationDto.user) && Intrinsics.f(this.currentDate, profileAccountConfirmationDto.currentDate) && Intrinsics.f(this.representations, profileAccountConfirmationDto.representations) && Intrinsics.f(this.international, profileAccountConfirmationDto.international) && Intrinsics.f(this.jointAccount, profileAccountConfirmationDto.jointAccount) && Intrinsics.f(this.coOwners, profileAccountConfirmationDto.coOwners);
    }

    public final List<AccountConfirmationCoOwnerDto> getCoOwners() {
        return this.coOwners;
    }

    @NotNull
    public final String getCurrentDate() {
        return this.currentDate;
    }

    @NotNull
    public final InternationalDto getInternational() {
        return this.international;
    }

    public final Boolean getJointAccount() {
        return this.jointAccount;
    }

    @NotNull
    public final List<UserBankAccountsDto> getRepresentations() {
        return this.representations;
    }

    @NotNull
    public final ProfileAccountUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (this.international.hashCode() + a.d(a.c(this.user.hashCode() * 31, 31, this.currentDate), 31, this.representations)) * 31;
        Boolean bool = this.jointAccount;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<AccountConfirmationCoOwnerDto> list = this.coOwners;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
