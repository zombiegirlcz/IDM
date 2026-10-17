package qsf;

import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import com.revolut.feature.transfer_reasons.models.reason.TransferReason;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    public static TransferReasonsFlowContract$State a(k kVar, TransferReasons reasons, TransferReasonsValues submittedValues) {
        Object next;
        TransferReason transferReason;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(submittedValues, "submittedValues");
        List list = submittedValues.f92446c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof TransferReasonCategory) {
                arrayList.add(obj2);
            }
        }
        TransferReasonCategory transferReasonCategory = (TransferReasonCategory) d0.d0(arrayList);
        List list2 = reasons.f92439b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof TransferReasonCategory) {
                arrayList2.add(obj3);
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((TransferReasonCategory) next).f92435a, transferReasonCategory != null ? transferReasonCategory.f92435a : null)) {
                break;
            }
        }
        TransferReasonCategory transferReasonCategory2 = (TransferReasonCategory) next;
        List list3 = transferReasonCategory != null ? transferReasonCategory.d : null;
        if (list3 == null) {
            list3 = f0.f322471a;
        }
        List list4 = list3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it9 = list4.iterator();
        while (it9.hasNext()) {
            linkedHashSet.add(((TransferReasonNode) it9.next()).getF92432a());
        }
        List list5 = transferReasonCategory2 != null ? transferReasonCategory2.d : null;
        if (list5 == null) {
            list5 = f0.f322471a;
        }
        LinkedHashSet<TransferReasonNode> linkedHashSet2 = new LinkedHashSet();
        for (Object obj4 : list5) {
            if (linkedHashSet.contains(((TransferReasonNode) obj4).getF92432a())) {
                linkedHashSet2.add(obj4);
            }
        }
        TransferReasonCategory transferReasonCategory3 = !linkedHashSet2.isEmpty() ? transferReasonCategory2 : null;
        List list6 = submittedValues.f92445b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : list4) {
            if (obj5 instanceof TransferReason) {
                arrayList3.add(obj5);
            }
        }
        int iB = q0.b(w.t(arrayList3, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj6 : arrayList3) {
            linkedHashMap.put(((TransferReason) obj6).f92432a, obj6);
        }
        ArrayList arrayList4 = new ArrayList();
        for (TransferReasonNode transferReasonNode : linkedHashSet2) {
            TransferReason transferReason2 = (TransferReason) linkedHashMap.get(transferReasonNode.getF92432a());
            if (transferReason2 != null) {
                String f92434c = transferReasonNode.getF92434c();
                String id10 = transferReason2.f92432a;
                ttf.c type = transferReason2.f92433b;
                dj0.d dVar = transferReason2.d;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(type, "type");
                transferReason = new TransferReason(id10, type, f92434c, dVar);
            } else {
                transferReason = null;
            }
            if (transferReason != null) {
                arrayList4.add(transferReason);
            }
        }
        return new TransferReasonsFlowContract$State(transferReasonCategory3, linkedHashSet2, list6, arrayList4, 32);
    }
}
