package com.revolut.data.network.models.confirmations;

import a71.a;
import a71.b;
import a71.c;
import a71.d;
import a71.e;
import a71.f;
import a71.g;
import a71.h;
import a71.i;
import a71.j;
import a71.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\u0002\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;", "La71/k;", "toDomain", "(Lcom/revolut/data/network/models/confirmations/ProfileAccountUserDto;)La71/k;", "Lcom/revolut/data/network/models/confirmations/ProfileAccountConfirmationDto;", "La71/g;", "(Lcom/revolut/data/network/models/confirmations/ProfileAccountConfirmationDto;)La71/g;", "Lcom/revolut/data/network/models/confirmations/CardsAccountConfirmationDto;", "La71/d;", "(Lcom/revolut/data/network/models/confirmations/CardsAccountConfirmationDto;)La71/d;", "Lcom/revolut/data/network/models/confirmations/SarAccountConfirmationDto;", "La71/j;", "(Lcom/revolut/data/network/models/confirmations/SarAccountConfirmationDto;)La71/j;", "Lcom/revolut/data/network/models/confirmations/AccountConfirmationCoOwnerDto;", "La71/a;", "(Lcom/revolut/data/network/models/confirmations/AccountConfirmationCoOwnerDto;)La71/a;", "Lcom/revolut/data/network/models/confirmations/AccountConfirmationJointAccountDto;", "La71/b;", "(Lcom/revolut/data/network/models/confirmations/AccountConfirmationJointAccountDto;)La71/b;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ProfileAccountConfirmationDtoKt {
    @NotNull
    public static final k toDomain(@NotNull ProfileAccountUserDto profileAccountUserDto) {
        Intrinsics.checkNotNullParameter(profileAccountUserDto, "<this>");
        String firstName = profileAccountUserDto.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        String lastName = profileAccountUserDto.getLastName();
        if (lastName == null) {
            lastName = "";
        }
        String birthDate = profileAccountUserDto.getBirthDate();
        if (birthDate == null) {
            birthDate = "";
        }
        String phone = profileAccountUserDto.getPhone();
        if (phone == null) {
            phone = "";
        }
        String email = profileAccountUserDto.getEmail();
        if (email == null) {
            email = "";
        }
        String address = profileAccountUserDto.getAddress();
        if (address == null) {
            address = "";
        }
        String userState = profileAccountUserDto.getUserState();
        if (userState == null) {
            userState = "";
        }
        String createdDate = profileAccountUserDto.getCreatedDate();
        if (createdDate == null) {
            createdDate = "";
        }
        String walletRef = profileAccountUserDto.getWalletRef();
        if (walletRef == null) {
            walletRef = "";
        }
        String terminatedDate = profileAccountUserDto.getTerminatedDate();
        return new k(firstName, lastName, birthDate, phone, email, address, userState, createdDate, walletRef, terminatedDate == null ? "" : terminatedDate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    @NotNull
    public static final g toDomain(@NotNull ProfileAccountConfirmationDto profileAccountConfirmationDto) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(profileAccountConfirmationDto, "<this>");
        k domain = toDomain(profileAccountConfirmationDto.getUser());
        List<UserBankAccountsDto> representations = profileAccountConfirmationDto.getRepresentations();
        ArrayList arrayList2 = new ArrayList(w.t(representations, 10));
        Iterator it8 = representations.iterator();
        while (true) {
            boolean zBooleanValue = false;
            if (!it8.hasNext()) {
                break;
            }
            UserBankAccountsDto userBankAccountsDto = (UserBankAccountsDto) it8.next();
            String sortCode = userBankAccountsDto.getSortCode();
            if (sortCode == null) {
                sortCode = "";
            }
            String accountNumber = userBankAccountsDto.getAccountNumber();
            if (accountNumber == null) {
                accountNumber = "";
            }
            boolean mcbLocal = userBankAccountsDto.getMcbLocal();
            boolean cfsbLocal = userBankAccountsDto.getCfsbLocal();
            Boolean leadBank = userBankAccountsDto.getLeadBank();
            if (leadBank != null) {
                zBooleanValue = leadBank.booleanValue();
            }
            arrayList2.add(new h(sortCode, accountNumber, mcbLocal, cfsbLocal, zBooleanValue));
        }
        String copyright = profileAccountConfirmationDto.getInternational().getCopyright();
        if (copyright == null) {
            copyright = "";
        }
        String legalInfo = profileAccountConfirmationDto.getInternational().getLegalInfo();
        if (legalInfo == null) {
            legalInfo = "";
        }
        String supportPhoneNumber = profileAccountConfirmationDto.getInternational().getSupportPhoneNumber();
        f fVar = new f(legalInfo, copyright, supportPhoneNumber != null ? supportPhoneNumber : "");
        boolean zBooleanValue2 = false;
        String currentDate = profileAccountConfirmationDto.getCurrentDate();
        Boolean jointAccount = profileAccountConfirmationDto.getJointAccount();
        if (jointAccount != null) {
            zBooleanValue2 = jointAccount.booleanValue();
        }
        boolean z = zBooleanValue2;
        List<AccountConfirmationCoOwnerDto> coOwners = profileAccountConfirmationDto.getCoOwners();
        if (coOwners != null) {
            List<AccountConfirmationCoOwnerDto> list = coOwners;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(toDomain((AccountConfirmationCoOwnerDto) it9.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new g(domain, arrayList2, fVar, currentDate, z, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    @NotNull
    public static final d toDomain(@NotNull CardsAccountConfirmationDto cardsAccountConfirmationDto) {
        String str;
        ?? arrayList;
        Intrinsics.checkNotNullParameter(cardsAccountConfirmationDto, "<this>");
        k domain = toDomain(cardsAccountConfirmationDto.getUser());
        List<CardDto> revolutCards = cardsAccountConfirmationDto.getRevolutCards();
        ArrayList arrayList2 = new ArrayList(w.t(revolutCards, 10));
        Iterator it8 = revolutCards.iterator();
        while (true) {
            str = "";
            if (!it8.hasNext()) {
                break;
            }
            CardDto cardDto = (CardDto) it8.next();
            String maskedPan = cardDto.getMaskedPan();
            if (maskedPan == null) {
                maskedPan = "";
            }
            String expiry = cardDto.getExpiry();
            if (expiry == null) {
                expiry = "";
            }
            String deliveryAddress = cardDto.getDeliveryAddress();
            if (deliveryAddress != null) {
                str = deliveryAddress;
            }
            arrayList2.add(new c(maskedPan, expiry, str));
        }
        String copyright = cardsAccountConfirmationDto.getInternational().getCopyright();
        if (copyright == null) {
            copyright = "";
        }
        String legalInfo = cardsAccountConfirmationDto.getInternational().getLegalInfo();
        if (legalInfo == null) {
            legalInfo = "";
        }
        String supportPhoneNumber = cardsAccountConfirmationDto.getInternational().getSupportPhoneNumber();
        f fVar = new f(legalInfo, copyright, supportPhoneNumber != null ? supportPhoneNumber : "");
        String currentDate = cardsAccountConfirmationDto.getCurrentDate();
        List<AccountConfirmationJointAccountDto> jointAccounts = cardsAccountConfirmationDto.getJointAccounts();
        if (jointAccounts != null) {
            List<AccountConfirmationJointAccountDto> list = jointAccounts;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(toDomain((AccountConfirmationJointAccountDto) it9.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new d(domain, arrayList2, fVar, currentDate, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    @NotNull
    public static final j toDomain(@NotNull SarAccountConfirmationDto sarAccountConfirmationDto) {
        String str;
        ?? arrayList;
        Intrinsics.checkNotNullParameter(sarAccountConfirmationDto, "<this>");
        k domain = toDomain(sarAccountConfirmationDto.getUser());
        List<CardDto> revolutCards = sarAccountConfirmationDto.getRevolutCards();
        ArrayList arrayList2 = new ArrayList(w.t(revolutCards, 10));
        Iterator it8 = revolutCards.iterator();
        while (true) {
            String str2 = "";
            if (!it8.hasNext()) {
                break;
            }
            CardDto cardDto = (CardDto) it8.next();
            String maskedPan = cardDto.getMaskedPan();
            if (maskedPan == null) {
                maskedPan = "";
            }
            String expiry = cardDto.getExpiry();
            if (expiry == null) {
                expiry = "";
            }
            String deliveryAddress = cardDto.getDeliveryAddress();
            if (deliveryAddress != null) {
                str2 = deliveryAddress;
            }
            arrayList2.add(new c(maskedPan, expiry, str2));
        }
        List<ExtCardDto> externalCards = sarAccountConfirmationDto.getExternalCards();
        ArrayList arrayList3 = new ArrayList(w.t(externalCards, 10));
        for (ExtCardDto extCardDto : externalCards) {
            String lastFour = extCardDto.getLastFour();
            if (lastFour == null) {
                lastFour = "";
            }
            String expiry2 = extCardDto.getExpiry();
            if (expiry2 == null) {
                expiry2 = "";
            }
            String address = extCardDto.getAddress();
            if (address == null) {
                address = "";
            }
            arrayList3.add(new i(lastFour, expiry2, address));
        }
        List<DeviceDto> devices = sarAccountConfirmationDto.getDevices();
        str = "";
        ArrayList arrayList4 = new ArrayList(w.t(devices, 10));
        for (DeviceDto deviceDto : devices) {
            String id10 = deviceDto.getId();
            if (id10 == null) {
                id10 = str;
            }
            String lastIpAddress = deviceDto.getLastIpAddress();
            if (lastIpAddress == null) {
                lastIpAddress = str;
            }
            String lastOpen = deviceDto.getLastOpen();
            if (lastOpen == null) {
                lastOpen = str;
            }
            arrayList4.add(new e(id10, lastIpAddress, lastOpen));
        }
        String copyright = sarAccountConfirmationDto.getInternational().getCopyright();
        if (copyright == null) {
            copyright = str;
        }
        String legalInfo = sarAccountConfirmationDto.getInternational().getLegalInfo();
        if (legalInfo == null) {
            legalInfo = str;
        }
        String supportPhoneNumber = sarAccountConfirmationDto.getInternational().getSupportPhoneNumber();
        f fVar = new f(legalInfo, copyright, supportPhoneNumber != null ? supportPhoneNumber : "");
        String currentDate = sarAccountConfirmationDto.getCurrentDate();
        List<AccountConfirmationJointAccountDto> jointAccounts = sarAccountConfirmationDto.getJointAccounts();
        if (jointAccounts != null) {
            List<AccountConfirmationJointAccountDto> list = jointAccounts;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(toDomain((AccountConfirmationJointAccountDto) it9.next()));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new j(domain, arrayList2, arrayList3, arrayList4, fVar, currentDate, arrayList);
    }

    @NotNull
    public static final a toDomain(@NotNull AccountConfirmationCoOwnerDto accountConfirmationCoOwnerDto) {
        Intrinsics.checkNotNullParameter(accountConfirmationCoOwnerDto, "<this>");
        String firstName = accountConfirmationCoOwnerDto.getFirstName();
        if (firstName == null) {
            firstName = "";
        }
        String lastName = accountConfirmationCoOwnerDto.getLastName();
        if (lastName == null) {
            lastName = "";
        }
        String phone = accountConfirmationCoOwnerDto.getPhone();
        if (phone == null) {
            phone = "";
        }
        String birthDate = accountConfirmationCoOwnerDto.getBirthDate();
        if (birthDate == null) {
            birthDate = "";
        }
        String email = accountConfirmationCoOwnerDto.getEmail();
        if (email == null) {
            email = "";
        }
        String address = accountConfirmationCoOwnerDto.getAddress();
        return new a(firstName, lastName, phone, birthDate, email, address == null ? "" : address);
    }

    @NotNull
    public static final b toDomain(@NotNull AccountConfirmationJointAccountDto accountConfirmationJointAccountDto) {
        Intrinsics.checkNotNullParameter(accountConfirmationJointAccountDto, "<this>");
        String walletRef = accountConfirmationJointAccountDto.getWalletRef();
        String accountState = accountConfirmationJointAccountDto.getAccountState();
        String accountOpeningDate = accountConfirmationJointAccountDto.getAccountOpeningDate();
        String accountTerminatedDate = accountConfirmationJointAccountDto.getAccountTerminatedDate();
        if (accountTerminatedDate == null) {
            accountTerminatedDate = "";
        }
        return new b(walletRef, accountState, accountOpeningDate, accountTerminatedDate);
    }
}
