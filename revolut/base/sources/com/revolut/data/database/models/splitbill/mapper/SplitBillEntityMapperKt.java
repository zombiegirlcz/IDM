package com.revolut.data.database.models.splitbill.mapper;

import com.revolut.data.database.models.splitbill.SplitBillEntity;
import com.revolut.data.database.models.splitbill.SplitBillPayerEmbeddedEntity;
import com.revolut.data.database.models.splitbill.SplitLineItemEmbeddedEntity;
import com.revolut.data.database.models.splitbill.SplitLineItemPayerEmbeddedEntity;
import com.revolut.data.database.models.splitbill.SplitMoneyRequestEmbeddedEntity;
import com.revolut.data.database.models.splitbill.SplittedItemEntity;
import com.revolut.domain.models.moneyrequest.MoneyRequestState;
import com.revolut.domain.models.moneyrequest.SplitBillItemType;
import com.revolut.domain.models.moneyrequest.SplitBillState;
import com.revolut.domain.models.moneyrequest.SplitMoneyRequestStatus;
import com.revolut.domain.models.moneyrequest.SplitPayerType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v61.d;
import v61.e;
import v61.f;
import v61.g;
import v61.h;
import v61.i;
import xi0.a;
import xi0.b;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0013\u0010\u0002\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\r\u001a\u00020\u0007*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u0010\u001a\u0013\u0010\r\u001a\u00020\u0004*\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0002\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\r\u001a\u00020\u0012*\u00020\u0013H\u0002¢\u0006\u0004\b\r\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0015*\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/revolut/data/database/models/splitbill/SplitBillEntity;", "Lv61/h;", "toDomain", "(Lcom/revolut/data/database/models/splitbill/SplitBillEntity;)Lv61/h;", "Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "Lv61/i;", "(Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;)Lv61/i;", "Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;", "Lv61/d;", "(Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;)Lv61/d;", "Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;", "Lv61/e;", "(Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;)Lv61/e;", "toEntity", "(Lv61/h;)Lcom/revolut/data/database/models/splitbill/SplitBillEntity;", "(Lv61/d;)Lcom/revolut/data/database/models/splitbill/SplitMoneyRequestEmbeddedEntity;", "(Lv61/e;)Lcom/revolut/data/database/models/splitbill/SplitBillPayerEmbeddedEntity;", "(Lv61/i;)Lcom/revolut/data/database/models/splitbill/SplittedItemEntity;", "Lcom/revolut/data/database/models/splitbill/SplitLineItemEmbeddedEntity;", "Lv61/g;", "(Lcom/revolut/data/database/models/splitbill/SplitLineItemEmbeddedEntity;)Lv61/g;", "Lcom/revolut/data/database/models/splitbill/SplitLineItemPayerEmbeddedEntity;", "Lv61/f;", "toSplitItemPayer", "(Lcom/revolut/data/database/models/splitbill/SplitLineItemPayerEmbeddedEntity;)Lv61/f;", "(Lv61/g;)Lcom/revolut/data/database/models/splitbill/SplitLineItemEmbeddedEntity;", "toLineItemPayerEntity", "(Lv61/f;)Lcom/revolut/data/database/models/splitbill/SplitLineItemPayerEmbeddedEntity;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SplitBillEntityMapperKt {

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final h toDomain(@NotNull SplitBillEntity splitBillEntity) {
        Intrinsics.checkNotNullParameter(splitBillEntity, "<this>");
        String id10 = splitBillEntity.getId();
        SplitBillState.Companion companion = SplitBillState.INSTANCE;
        String state = splitBillEntity.getState();
        companion.getClass();
        SplitBillState splitBillStateA = SplitBillState.Companion.a(state);
        long datetime = splitBillEntity.getDatetime();
        a aVar = b.Companion;
        String currency = splitBillEntity.getCurrency();
        aVar.getClass();
        b bVarA = a.a(currency);
        String comment = splitBillEntity.getComment();
        String ownerId = splitBillEntity.getOwnerId();
        List<SplittedItemEntity> splittedItems = splitBillEntity.getSplittedItems();
        ArrayList arrayList = new ArrayList(w.t(splittedItems, 10));
        Iterator<T> it8 = splittedItems.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDomain((SplittedItemEntity) it8.next()));
        }
        List<SplitMoneyRequestEmbeddedEntity> moneyRequests = splitBillEntity.getMoneyRequests();
        ArrayList arrayList2 = new ArrayList(w.t(moneyRequests, 10));
        Iterator<T> it9 = moneyRequests.iterator();
        while (it9.hasNext()) {
            arrayList2.add(toDomain((SplitMoneyRequestEmbeddedEntity) it9.next()));
        }
        return new h(id10, splitBillStateA, bVarA, ownerId, datetime, arrayList, arrayList2, comment, splitBillEntity.getRegisteredIdentityId());
    }

    private static final SplittedItemEntity toEntity(i iVar) {
        ArrayList arrayList;
        String str = iVar.f286293a;
        String value = iVar.f286294b.getValue();
        String str2 = iVar.f286295c;
        String str3 = iVar.d;
        Long l2 = iVar.e;
        String str4 = iVar.f;
        String str5 = iVar.f286298j;
        ArrayList arrayList2 = iVar.f286296g;
        if (arrayList2 != null) {
            arrayList = new ArrayList(w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList.add(toEntity((g) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new SplittedItemEntity(str, value, str2, str3, l2, str4, str5, arrayList);
    }

    private static final SplitLineItemPayerEmbeddedEntity toLineItemPayerEntity(f fVar) {
        SplitPayerType splitPayerType = fVar.f286283a;
        String str = fVar.f286284b;
        int i = WhenMappings.$EnumSwitchMapping$0[splitPayerType.ordinal()];
        if (i == 1) {
            return new SplitLineItemPayerEmbeddedEntity(str, null, null);
        }
        if (i == 2) {
            return new SplitLineItemPayerEmbeddedEntity(null, str, null);
        }
        if (i == 3) {
            return new SplitLineItemPayerEmbeddedEntity(null, null, str);
        }
        if (i != 4) {
            return null;
        }
        return new SplitLineItemPayerEmbeddedEntity(str, null, null);
    }

    private static final f toSplitItemPayer(SplitLineItemPayerEmbeddedEntity splitLineItemPayerEmbeddedEntity) {
        if (splitLineItemPayerEmbeddedEntity.getPayerCode() != null) {
            return new f(SplitPayerType.CODE, splitLineItemPayerEmbeddedEntity.getPayerCode());
        }
        if (splitLineItemPayerEmbeddedEntity.getPayerPhone() != null) {
            return new f(SplitPayerType.PHONE, splitLineItemPayerEmbeddedEntity.getPayerPhone());
        }
        if (splitLineItemPayerEmbeddedEntity.getPayerEmail() != null) {
            return new f(SplitPayerType.EMAIL, splitLineItemPayerEmbeddedEntity.getPayerEmail());
        }
        return null;
    }

    private static final SplitLineItemEmbeddedEntity toEntity(g gVar) {
        String str = gVar.f286285a;
        long j2 = gVar.f286286b;
        String str2 = gVar.f286287c;
        ArrayList arrayList = gVar.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            SplitLineItemPayerEmbeddedEntity lineItemPayerEntity = toLineItemPayerEntity((f) it8.next());
            if (lineItemPayerEntity != null) {
                arrayList2.add(lineItemPayerEntity);
            }
        }
        return new SplitLineItemEmbeddedEntity(str, j2, str2, arrayList2);
    }

    @NotNull
    public static final i toDomain(@NotNull SplittedItemEntity splittedItemEntity) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(splittedItemEntity, "<this>");
        String id10 = splittedItemEntity.getId();
        SplitBillItemType.Companion companion = SplitBillItemType.INSTANCE;
        String type = splittedItemEntity.getType();
        companion.getClass();
        SplitBillItemType splitBillItemTypeA = SplitBillItemType.Companion.a(type);
        String transactionId = splittedItemEntity.getTransactionId();
        String currency = splittedItemEntity.getCurrency();
        Long totalAmount = splittedItemEntity.getTotalAmount();
        String currency2 = splittedItemEntity.getCurrency();
        String receiptImageUri = splittedItemEntity.getReceiptImageUri();
        List<SplitLineItemEmbeddedEntity> lineItems = splittedItemEntity.getLineItems();
        if (lineItems != null) {
            List<SplitLineItemEmbeddedEntity> list = lineItems;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDomain((SplitLineItemEmbeddedEntity) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new i(id10, splitBillItemTypeA, transactionId, currency2, totalAmount, currency, arrayList, null, null, receiptImageUri, 384);
    }

    @NotNull
    public static final SplitBillEntity toEntity(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String str = hVar.f286288a;
        String value = hVar.f286289b.getValue();
        long j2 = hVar.e;
        String str2 = hVar.f286290c.f306286a;
        String str3 = hVar.f286292h;
        String str4 = hVar.d;
        ArrayList arrayList = hVar.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(toEntity((i) it8.next()));
        }
        ArrayList arrayList3 = hVar.f286291g;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(toEntity((d) it9.next()));
        }
        return new SplitBillEntity(str, value, str2, str3, str4, j2, arrayList2, arrayList4, hVar.i);
    }

    @NotNull
    public static final d toDomain(@NotNull SplitMoneyRequestEmbeddedEntity splitMoneyRequestEmbeddedEntity) {
        Intrinsics.checkNotNullParameter(splitMoneyRequestEmbeddedEntity, "<this>");
        MoneyRequestState.Companion companion = MoneyRequestState.INSTANCE;
        String state = splitMoneyRequestEmbeddedEntity.getState();
        companion.getClass();
        return new d(MoneyRequestState.Companion.a(state), SplitMoneyRequestStatus.SUCCESS, splitMoneyRequestEmbeddedEntity.getItemId(), splitMoneyRequestEmbeddedEntity.getAmount(), splitMoneyRequestEmbeddedEntity.getMoneyRequestId(), splitMoneyRequestEmbeddedEntity.getTransactionId(), toDomain(splitMoneyRequestEmbeddedEntity.getPayer()), splitMoneyRequestEmbeddedEntity.getReason());
    }

    private static final e toDomain(SplitBillPayerEmbeddedEntity splitBillPayerEmbeddedEntity) {
        return new e(splitBillPayerEmbeddedEntity.getId(), splitBillPayerEmbeddedEntity.getPhone(), splitBillPayerEmbeddedEntity.getEmail(), splitBillPayerEmbeddedEntity.getCode(), splitBillPayerEmbeddedEntity.getFirstName(), splitBillPayerEmbeddedEntity.getLastName());
    }

    private static final SplitMoneyRequestEmbeddedEntity toEntity(d dVar) {
        String value;
        MoneyRequestState moneyRequestState = dVar.f286275a;
        if (moneyRequestState == null || (value = moneyRequestState.getValue()) == null) {
            value = MoneyRequestState.UNDEFINED.getValue();
        }
        return new SplitMoneyRequestEmbeddedEntity(value, dVar.f286277c, dVar.d, dVar.e, dVar.f, toEntity(dVar.f286278g), dVar.f286279h);
    }

    private static final g toDomain(SplitLineItemEmbeddedEntity splitLineItemEmbeddedEntity) {
        String name = splitLineItemEmbeddedEntity.getName();
        long amount = splitLineItemEmbeddedEntity.getAmount();
        String currency = splitLineItemEmbeddedEntity.getCurrency();
        List<SplitLineItemPayerEmbeddedEntity> payers = splitLineItemEmbeddedEntity.getPayers();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = payers.iterator();
        while (it8.hasNext()) {
            f splitItemPayer = toSplitItemPayer((SplitLineItemPayerEmbeddedEntity) it8.next());
            if (splitItemPayer != null) {
                arrayList.add(splitItemPayer);
            }
        }
        return new g(name, amount, currency, arrayList);
    }

    private static final SplitBillPayerEmbeddedEntity toEntity(e eVar) {
        return new SplitBillPayerEmbeddedEntity(eVar.f286280a, eVar.f286281b, eVar.f286282c, null, eVar.e, eVar.f, 8, null);
    }
}
