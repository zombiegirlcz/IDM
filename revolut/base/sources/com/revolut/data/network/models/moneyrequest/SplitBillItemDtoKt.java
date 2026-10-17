package com.revolut.data.network.models.moneyrequest;

import com.revolut.domain.models.moneyrequest.SplitBillItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v61.c;
import v61.g;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/data/network/models/moneyrequest/SplitBillItemDto;", "Lv61/c;", "toDomain", "(Lcom/revolut/data/network/models/moneyrequest/SplitBillItemDto;)Lv61/c;", "toDto", "(Lv61/c;)Lcom/revolut/data/network/models/moneyrequest/SplitBillItemDto;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SplitBillItemDtoKt {
    @NotNull
    public static final c toDomain(@NotNull SplitBillItemDto splitBillItemDto) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(splitBillItemDto, "<this>");
        String id10 = splitBillItemDto.getId();
        SplitBillItemType.Companion companion = SplitBillItemType.INSTANCE;
        String type = splitBillItemDto.getType();
        companion.getClass();
        SplitBillItemType splitBillItemTypeA = SplitBillItemType.Companion.a(type);
        String transactionId = splitBillItemDto.getTransactionId();
        String category = splitBillItemDto.getCategory();
        String logo = splitBillItemDto.getLogo();
        String title = splitBillItemDto.getTitle();
        long totalAmount = splitBillItemDto.getTotalAmount();
        String requestedCurrency = splitBillItemDto.getRequestedCurrency();
        long requestedAmount = splitBillItemDto.getRequestedAmount();
        String sourceCurrency = splitBillItemDto.getSourceCurrency();
        List<SplitLineItemDto> lineItems = splitBillItemDto.getLineItems();
        if (lineItems != null) {
            List<SplitLineItemDto> list = lineItems;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator<T> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(SplitBillDtoKt.toDomain((SplitLineItemDto) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new c(id10, splitBillItemTypeA, transactionId, category, logo, title, totalAmount, requestedCurrency, requestedAmount, sourceCurrency, arrayList, splitBillItemDto.getReceiptImageUri());
    }

    @NotNull
    public static final SplitBillItemDto toDto(@NotNull c cVar) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String str = cVar.f286268a;
        String value = cVar.f286269b.getValue();
        String str2 = cVar.f286270c;
        String str3 = cVar.d;
        String str4 = cVar.e;
        String str5 = cVar.f;
        long j2 = cVar.f286271g;
        String str6 = cVar.f286272h;
        long j3 = cVar.i;
        String str7 = cVar.f286273j;
        List list = cVar.k;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(SplitBillDtoKt.toDto((g) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new SplitBillItemDto(str, value, str2, str3, str4, str5, j2, str6, j3, str7, arrayList, cVar.f286274l);
    }
}
