package ys9;

import com.revolut.feature.payments.api.PaymentsToggles$ScanBill;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import oq9.k;
import oq9.o;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f316428a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f316428a = featureToggleInteractor;
    }

    public final List a(PaymentGroup group, List list) {
        SplitMemberType.GroupMember groupMember;
        Intrinsics.checkNotNullParameter(group, "group");
        if (!((d) this.f316428a).c(PaymentsToggles$ScanBill.f79163c)) {
            return f0.f322471a;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayListJ = c.j(group);
        int iB = q0.b(w.t(arrayListJ, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : arrayListJ) {
            linkedHashMap.put(((o) obj2).b(), obj2);
        }
        List<k> list3 = list;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (k kVar : list3) {
            String str = kVar.f227833a;
            long j2 = kVar.f227834b;
            String str2 = kVar.f227835c;
            ArrayList arrayList2 = kVar.d;
            ArrayList arrayList3 = new ArrayList();
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                o oVar = (o) linkedHashMap.get((String) it8.next());
                if (oVar != null) {
                    groupMember = new SplitMemberType.GroupMember(oVar);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Payer member not found");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    groupMember = null;
                }
                if (groupMember != null) {
                    arrayList3.add(groupMember);
                }
            }
            arrayList.add(new SplitLineItem(str, j2, str2, arrayList3));
        }
        return arrayList;
    }
}
