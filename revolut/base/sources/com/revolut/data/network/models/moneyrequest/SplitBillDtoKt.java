package com.revolut.data.network.models.moneyrequest;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.domain.models.moneyrequest.SplitBillItemType;
import com.revolut.domain.models.moneyrequest.SplitBillState;
import com.revolut.domain.models.moneyrequest.SplitMoneyRequestStatus;
import com.revolut.domain.models.moneyrequest.SplitPayerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import v61.b;
import v61.d;
import v61.e;
import v61.f;
import v61.g;
import v61.h;
import v61.i;
import v61.j;
import xi0.a;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0002\u0010\u0014\u001a\u0013\u0010\u000e\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u000e\u0010\u0017\u001a\u0013\u0010\u000e\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u0018\u001a\u0013\u0010\u000e\u001a\u00020\u001a*\u00020\u0019H\u0000¢\u0006\u0004\b\u000e\u0010\u001b\u001a\u0013\u0010\u000e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u000e\u0010\u001e¨\u0006\u001f"}, d2 = {"Lv61/j;", "Lcom/revolut/data/network/models/moneyrequest/TransactionsMoneyDataToSplitDto;", "toDto", "(Lv61/j;)Lcom/revolut/data/network/models/moneyrequest/TransactionsMoneyDataToSplitDto;", "Lv61/i;", "Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "(Lv61/i;)Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;", "Lv61/g;", "Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;", "(Lv61/g;)Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;", "Lv61/f;", "Lcom/revolut/data/network/models/moneyrequest/SplitLineItemPayerDto;", "toLineItemPayerDto", "(Lv61/f;)Lcom/revolut/data/network/models/moneyrequest/SplitLineItemPayerDto;", "toDomain", "(Lcom/revolut/data/network/models/moneyrequest/SplitLineItemDto;)Lv61/g;", "toSplitItemPayer", "(Lcom/revolut/data/network/models/moneyrequest/SplitLineItemPayerDto;)Lv61/f;", "Lv61/b;", "Lcom/revolut/data/network/models/moneyrequest/SplitBillMoneyRequestDto;", "(Lv61/b;)Lcom/revolut/data/network/models/moneyrequest/SplitBillMoneyRequestDto;", "Lcom/revolut/data/network/models/moneyrequest/SplittedBillDto;", "Lv61/h;", "(Lcom/revolut/data/network/models/moneyrequest/SplittedBillDto;)Lv61/h;", "(Lcom/revolut/data/network/models/moneyrequest/SplittedItemDto;)Lv61/i;", "Lcom/revolut/data/network/models/moneyrequest/SplittedBillMoneyRequestDto;", "Lv61/d;", "(Lcom/revolut/data/network/models/moneyrequest/SplittedBillMoneyRequestDto;)Lv61/d;", "Lcom/revolut/data/network/models/moneyrequest/SplitBillPayerDto;", "Lv61/e;", "(Lcom/revolut/data/network/models/moneyrequest/SplitBillPayerDto;)Lv61/e;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SplitBillDtoKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SplitPayerType.values().length];
            try {
                iArr[SplitPayerType.CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SplitPayerType.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SplitPayerType.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SplitPayerType.USER_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SplitPayerType.UNDEFINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final g toDomain(@NotNull SplitLineItemDto splitLineItemDto) {
        Intrinsics.checkNotNullParameter(splitLineItemDto, "<this>");
        String name = splitLineItemDto.getName();
        long amount = splitLineItemDto.getAmount();
        String currency = splitLineItemDto.getCurrency();
        List<SplitLineItemPayerDto> payers = splitLineItemDto.getPayers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = payers.iterator();
        while (it8.hasNext()) {
            f splitItemPayer = toSplitItemPayer((SplitLineItemPayerDto) it8.next());
            if (splitItemPayer != null) {
                arrayList.add(splitItemPayer);
            }
        }
        return new g(name, amount, currency, arrayList);
    }

    @NotNull
    public static final TransactionsMoneyDataToSplitDto toDto(@NotNull j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f286299a;
        List list = jVar.f286300b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDto((i) it8.next()));
        }
        ArrayList arrayList2 = jVar.f286301c;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            arrayList3.add(toDto((b) it9.next()));
        }
        AccountId.Joint joint = jVar.d;
        return new TransactionsMoneyDataToSplitDto(str, arrayList, arrayList3, joint != null ? joint.f51413b : null);
    }

    public static final SplitLineItemPayerDto toLineItemPayerDto(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        SplitPayerType splitPayerType = fVar.f286283a;
        String str = fVar.f286284b;
        int i = WhenMappings.$EnumSwitchMapping$0[splitPayerType.ordinal()];
        if (i == 1) {
            return new SplitLineItemPayerDto(str, null, null);
        }
        if (i == 2) {
            return new SplitLineItemPayerDto(null, str, null);
        }
        if (i == 3) {
            return new SplitLineItemPayerDto(null, null, str);
        }
        if (i == 4) {
            return new SplitLineItemPayerDto(str, null, null);
        }
        if (i == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final f toSplitItemPayer(@NotNull SplitLineItemPayerDto splitLineItemPayerDto) {
        Intrinsics.checkNotNullParameter(splitLineItemPayerDto, "<this>");
        if (splitLineItemPayerDto.getPayerCode() != null) {
            return new f(SplitPayerType.CODE, splitLineItemPayerDto.getPayerCode());
        }
        if (splitLineItemPayerDto.getPayerPhone() != null) {
            return new f(SplitPayerType.PHONE, splitLineItemPayerDto.getPayerPhone());
        }
        if (splitLineItemPayerDto.getPayerEmail() != null) {
            return new f(SplitPayerType.EMAIL, splitLineItemPayerDto.getPayerEmail());
        }
        return null;
    }

    @NotNull
    public static final h toDomain(@NotNull SplittedBillDto splittedBillDto) {
        Intrinsics.checkNotNullParameter(splittedBillDto, "<this>");
        String id10 = splittedBillDto.getId();
        SplitBillState.Companion companion = SplitBillState.INSTANCE;
        String state = splittedBillDto.getState();
        companion.getClass();
        SplitBillState splitBillStateA = SplitBillState.Companion.a(state);
        a aVar = xi0.b.Companion;
        String currency = splittedBillDto.getCurrency();
        aVar.getClass();
        xi0.b bVarA = a.a(currency);
        SplittedBillOwnerDto owner = splittedBillDto.getOwner();
        String id11 = owner != null ? owner.getId() : null;
        String comment = splittedBillDto.getComment();
        long createdDate = splittedBillDto.getCreatedDate();
        List<SplittedItemDto> splittedItems = splittedBillDto.getSplittedItems();
        ArrayList arrayList = new ArrayList(w.t(splittedItems, 10));
        Iterator<T> it8 = splittedItems.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((SplittedItemDto) it8.next()));
        }
        List<SplittedBillMoneyRequestDto> moneyRequests = splittedBillDto.getMoneyRequests();
        ArrayList arrayList2 = new ArrayList(w.t(moneyRequests, 10));
        Iterator<T> it9 = moneyRequests.iterator();
        while (it9.hasNext()) {
            arrayList2.add(toDomain((SplittedBillMoneyRequestDto) it9.next()));
        }
        return new h(id10, splitBillStateA, bVarA, id11, createdDate, arrayList, arrayList2, comment, splittedBillDto.getRegisteredIdentityId());
    }

    @NotNull
    public static final SplittedItemDto toDto(@NotNull i iVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f286293a;
        String value = iVar.f286294b.getValue();
        String str2 = iVar.f286295c;
        String str3 = iVar.d;
        Long l2 = iVar.e;
        String str4 = iVar.f;
        ArrayList arrayList2 = iVar.f286296g;
        if (arrayList2 != null) {
            arrayList = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDto((g) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new SplittedItemDto(str, value, str2, str3, l2, str4, arrayList, iVar.f286297h, iVar.i, iVar.f286298j);
    }

    @NotNull
    public static final i toDomain(@NotNull SplittedItemDto splittedItemDto) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(splittedItemDto, "<this>");
        String id10 = splittedItemDto.getId();
        SplitBillItemType.Companion companion = SplitBillItemType.INSTANCE;
        String type = splittedItemDto.getType();
        companion.getClass();
        SplitBillItemType splitBillItemTypeA = SplitBillItemType.Companion.a(type);
        String transactionId = splittedItemDto.getTransactionId();
        String title = splittedItemDto.getTitle();
        Long amount = splittedItemDto.getAmount();
        String currency = splittedItemDto.getCurrency();
        String receiptImageUri = splittedItemDto.getReceiptImageUri();
        List<SplitLineItemDto> lineItems = splittedItemDto.getLineItems();
        if (lineItems != null) {
            List<SplitLineItemDto> list = lineItems;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((SplitLineItemDto) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new i(id10, splitBillItemTypeA, transactionId, title, amount, currency, arrayList, null, null, receiptImageUri, 384);
    }

    @NotNull
    public static final SplitLineItemDto toDto(@NotNull g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String str = gVar.f286285a;
        long j2 = gVar.f286286b;
        String str2 = gVar.f286287c;
        ArrayList arrayList = gVar.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            SplitLineItemPayerDto lineItemPayerDto = toLineItemPayerDto((f) it8.next());
            if (lineItemPayerDto != null) {
                arrayList2.add(lineItemPayerDto);
            }
        }
        return new SplitLineItemDto(str, j2, str2, arrayList2);
    }

    @NotNull
    public static final d toDomain(@NotNull SplittedBillMoneyRequestDto splittedBillMoneyRequestDto) {
        MoneyRequestState moneyRequestStateA;
        Intrinsics.checkNotNullParameter(splittedBillMoneyRequestDto, "<this>");
        String state = splittedBillMoneyRequestDto.getState();
        SplitMoneyRequestStatus splitMoneyRequestStatus = null;
        if (state != null) {
            MoneyRequestState.INSTANCE.getClass();
            moneyRequestStateA = MoneyRequestState.Companion.a(state);
        } else {
            moneyRequestStateA = null;
        }
        String input = splittedBillMoneyRequestDto.getStatus();
        if (input != null) {
            SplitMoneyRequestStatus.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(input, "input");
            SplitMoneyRequestStatus[] splitMoneyRequestStatusArrValues = SplitMoneyRequestStatus.values();
            int length = splitMoneyRequestStatusArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                SplitMoneyRequestStatus splitMoneyRequestStatus2 = splitMoneyRequestStatusArrValues[i];
                if (a0.z(splitMoneyRequestStatus2.getValue(), input, true)) {
                    splitMoneyRequestStatus = splitMoneyRequestStatus2;
                    break;
                }
                i++;
            }
            if (splitMoneyRequestStatus == null) {
                splitMoneyRequestStatus = SplitMoneyRequestStatus.UNDEFINED;
            }
        }
        SplitMoneyRequestStatus splitMoneyRequestStatus3 = splitMoneyRequestStatus;
        String moneyRequestId = splittedBillMoneyRequestDto.getMoneyRequestId();
        String transactionId = splittedBillMoneyRequestDto.getTransactionId();
        String itemId = splittedBillMoneyRequestDto.getItemId();
        long amount = splittedBillMoneyRequestDto.getAmount();
        e domain = toDomain(splittedBillMoneyRequestDto.getPayer());
        String errorMessage = splittedBillMoneyRequestDto.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = "";
        }
        return new d(moneyRequestStateA, splitMoneyRequestStatus3, itemId, amount, moneyRequestId, transactionId, domain, errorMessage);
    }

    @NotNull
    public static final SplitBillMoneyRequestDto toDto(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        f fVar = bVar.f286265a;
        SplitPayerType splitPayerType = fVar.f286283a;
        return new SplitBillMoneyRequestDto(splitPayerType == SplitPayerType.USER_ID ? fVar.f286284b : null, splitPayerType == SplitPayerType.PHONE ? fVar.f286284b : null, splitPayerType == SplitPayerType.EMAIL ? fVar.f286284b : null, splitPayerType == SplitPayerType.CODE ? fVar.f286284b : null, bVar.f286266b, bVar.f286267c);
    }

    @NotNull
    public static final e toDomain(@NotNull SplitBillPayerDto splitBillPayerDto) {
        Intrinsics.checkNotNullParameter(splitBillPayerDto, "<this>");
        return new e(splitBillPayerDto.getId(), splitBillPayerDto.getPhone(), splitBillPayerDto.getEmail(), splitBillPayerDto.getCode(), splitBillPayerDto.getFirstName(), splitBillPayerDto.getLastName());
    }
}
