package tx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {
    public static final BizumContact a(j jVar) {
        ApmContact.State state;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        ApmIdentifier apmIdentifierB = wx1.f.b(jVar.f275315a, jVar.f275316b);
        ApmDescriptor apmDescriptorA = wx1.f.a(jVar.f275317c, jVar.d);
        String str = jVar.f;
        String str2 = jVar.e;
        String str3 = jVar.f275318g;
        wx1.c cVar = jVar.f275319h;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i = wx1.e.f300733a[cVar.ordinal()];
        if (i == 1) {
            state = ApmContact.State.ACTIVE.f62099a;
        } else if (i == 2) {
            state = ApmContact.State.DELETED.f62100a;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            state = ApmContact.State.NOT_REGISTERED.f62101a;
        }
        return new BizumContact(apmIdentifierB, apmDescriptorA, str2, str, str3, state);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((j) it8.next()));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        wx1.c cVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<BizumContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (BizumContact bizumContact : list2) {
            Intrinsics.checkNotNullParameter(bizumContact, "<this>");
            String strD = wx1.f.d(bizumContact.f62116a);
            String f62112a = bizumContact.f62116a.getF62112a();
            ApmDescriptor apmDescriptor = bizumContact.f62117b;
            String strC = wx1.f.c(apmDescriptor);
            String f62112a2 = apmDescriptor.getF62112a();
            String str = bizumContact.d;
            String str2 = bizumContact.f62118c;
            String str3 = bizumContact.e;
            ApmContact.State state = bizumContact.f;
            Intrinsics.checkNotNullParameter(state, "<this>");
            if (Intrinsics.f(state, ApmContact.State.ACTIVE.f62099a)) {
                cVar = wx1.c.ACTIVE;
            } else if (Intrinsics.f(state, ApmContact.State.DELETED.f62100a)) {
                cVar = wx1.c.DELETED;
            } else {
                if (!Intrinsics.f(state, ApmContact.State.NOT_REGISTERED.f62101a)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = wx1.c.NOT_REGISTERED;
            }
            arrayList.add(new j(strD, f62112a, strC, f62112a2, str2, str, str3, cVar));
        }
        return arrayList;
    }
}
