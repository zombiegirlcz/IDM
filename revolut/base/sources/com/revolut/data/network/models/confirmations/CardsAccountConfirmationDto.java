package com.revolut.data.network.models.confirmations;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, d2 = {"Lcom/revolut/data/network/models/confirmations/CardsAccountConfirmationDto;", "", "user", "Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "currentDate", "", "revolutCards", "", "Lcom/revolut/data/network/models/confirmations/CardDto;", "international", "Lcom/revolut/data/network/models/confirmations/InternationalDto;", "jointAccounts", "Lcom/revolut/data/network/models/confirmations/AccountConfirmationJointAccountDto;", "<init>", "(Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;Ljava/lang/String;Ljava/util/List;Lcom/revolut/data/network/models/confirmations/InternationalDto;Ljava/util/List;)V", "getUser", "()Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "getCurrentDate", "()Ljava/lang/String;", "getRevolutCards", "()Ljava/util/List;", "getInternational", "()Lcom/revolut/data/network/models/confirmations/InternationalDto;", "getJointAccounts", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsAccountConfirmationDto {

    @b("currentDate")
    @NotNull
    private final String currentDate;

    @b("international")
    @NotNull
    private final InternationalDto international;

    @b("jointAccounts")
    private final List<AccountConfirmationJointAccountDto> jointAccounts;

    @b("revolutCards")
    @NotNull
    private final List<CardDto> revolutCards;

    @b("user")
    @NotNull
    private final ProfileAccountUserDto user;

    public CardsAccountConfirmationDto(@NotNull ProfileAccountUserDto user, @NotNull String currentDate, @NotNull List<CardDto> revolutCards, @NotNull InternationalDto international, List<AccountConfirmationJointAccountDto> list) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(revolutCards, "revolutCards");
        Intrinsics.checkNotNullParameter(international, "international");
        this.user = user;
        this.currentDate = currentDate;
        this.revolutCards = revolutCards;
        this.international = international;
        this.jointAccounts = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardsAccountConfirmationDto copy$default(CardsAccountConfirmationDto cardsAccountConfirmationDto, ProfileAccountUserDto profileAccountUserDto, String str, List list, InternationalDto internationalDto, List list2, int i, Object obj2) {
        if ((i & 1) != 0) {
            profileAccountUserDto = cardsAccountConfirmationDto.user;
        }
        if ((i & 2) != 0) {
            str = cardsAccountConfirmationDto.currentDate;
        }
        if ((i & 4) != 0) {
            list = cardsAccountConfirmationDto.revolutCards;
        }
        if ((i & 8) != 0) {
            internationalDto = cardsAccountConfirmationDto.international;
        }
        if ((i & 16) != 0) {
            list2 = cardsAccountConfirmationDto.jointAccounts;
        }
        List list3 = list2;
        List list4 = list;
        return cardsAccountConfirmationDto.copy(profileAccountUserDto, str, list4, internationalDto, list3);
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
    public final List<CardDto> component3() {
        return this.revolutCards;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InternationalDto getInternational() {
        return this.international;
    }

    public final List<AccountConfirmationJointAccountDto> component5() {
        return this.jointAccounts;
    }

    @NotNull
    public final CardsAccountConfirmationDto copy(@NotNull ProfileAccountUserDto user, @NotNull String currentDate, @NotNull List<CardDto> revolutCards, @NotNull InternationalDto international, List<AccountConfirmationJointAccountDto> jointAccounts) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(revolutCards, "revolutCards");
        Intrinsics.checkNotNullParameter(international, "international");
        return new CardsAccountConfirmationDto(user, currentDate, revolutCards, international, jointAccounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardsAccountConfirmationDto)) {
            return false;
        }
        CardsAccountConfirmationDto cardsAccountConfirmationDto = (CardsAccountConfirmationDto) other;
        return Intrinsics.f(this.user, cardsAccountConfirmationDto.user) && Intrinsics.f(this.currentDate, cardsAccountConfirmationDto.currentDate) && Intrinsics.f(this.revolutCards, cardsAccountConfirmationDto.revolutCards) && Intrinsics.f(this.international, cardsAccountConfirmationDto.international) && Intrinsics.f(this.jointAccounts, cardsAccountConfirmationDto.jointAccounts);
    }

    @NotNull
    public final String getCurrentDate() {
        return this.currentDate;
    }

    @NotNull
    public final InternationalDto getInternational() {
        return this.international;
    }

    public final List<AccountConfirmationJointAccountDto> getJointAccounts() {
        return this.jointAccounts;
    }

    @NotNull
    public final List<CardDto> getRevolutCards() {
        return this.revolutCards;
    }

    @NotNull
    public final ProfileAccountUserDto getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = (this.international.hashCode() + a.d(a.c(this.user.hashCode() * 31, 31, this.currentDate), 31, this.revolutCards)) * 31;
        List<AccountConfirmationJointAccountDto> list = this.jointAccounts;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }
}
