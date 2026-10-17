package com.revolut.data.network.models.transfer.mapper;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoEntry;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoValue;
import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import dj0.d;
import gsf.e;
import gsf.n;
import gsf.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo3.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0013\u0010\u0002\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonsValues;", "Lgsf/r;", "toDto", "(Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonsValues;)Lgsf/r;", "Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoEntry;", "Lgsf/e;", "(Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoEntry;)Lgsf/e;", "Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonNode;", "Lgsf/n;", "(Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonNode;)Lgsf/n;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TransferReasonsValuesDtoMapperKt {
    @NotNull
    public static final r toDto(@NotNull TransferReasonsValues transferReasonsValues) {
        Intrinsics.checkNotNullParameter(transferReasonsValues, "<this>");
        String strName = transferReasonsValues.f92444a.name();
        List list = transferReasonsValues.f92445b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(toDto((AdditionalInfoEntry) it8.next()));
        }
        List list2 = transferReasonsValues.f92446c;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(toDto((TransferReasonNode) it9.next()));
        }
        return new r(arrayList, arrayList2, strName);
    }

    private static final e toDto(AdditionalInfoEntry additionalInfoEntry) {
        d dVar;
        String str = additionalInfoEntry.f92403a;
        String strName = additionalInfoEntry.f92404b.name();
        AdditionalInfoValue additionalInfoValue = additionalInfoEntry.f92405c;
        AdditionalInfoValue.StringValue stringValue = additionalInfoValue instanceof AdditionalInfoValue.StringValue ? (AdditionalInfoValue.StringValue) additionalInfoValue : null;
        String str2 = stringValue != null ? stringValue.f92421a : null;
        AdditionalInfoValue.MoneyValue moneyValue = additionalInfoValue instanceof AdditionalInfoValue.MoneyValue ? (AdditionalInfoValue.MoneyValue) additionalInfoValue : null;
        a aVarP = (moneyValue == null || (dVar = moneyValue.f92420a) == null) ? null : mo3.a.p(dVar);
        AdditionalInfoValue.BooleanValue booleanValue = additionalInfoValue instanceof AdditionalInfoValue.BooleanValue ? (AdditionalInfoValue.BooleanValue) additionalInfoValue : null;
        return new e(str, strName, str2, aVarP, booleanValue != null ? Boolean.valueOf(booleanValue.f92419a) : null);
    }

    private static final n toDto(TransferReasonNode transferReasonNode) {
        if (transferReasonNode instanceof TransferReasonCategory) {
            TransferReasonCategory transferReasonCategory = (TransferReasonCategory) transferReasonNode;
            String str = transferReasonCategory.f92435a;
            String strName = transferReasonCategory.f92436b.name();
            List list = transferReasonCategory.d;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(toDto((TransferReasonNode) it8.next()));
            }
            return new n(str, strName, arrayList, null);
        }
        if (transferReasonNode instanceof TransferReason) {
            TransferReason transferReason = (TransferReason) transferReasonNode;
            String str2 = transferReason.f92432a;
            String strName2 = transferReason.f92433b.name();
            d dVar = transferReason.d;
            return new n(str2, strName2, null, dVar != null ? mo3.a.p(dVar) : null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
