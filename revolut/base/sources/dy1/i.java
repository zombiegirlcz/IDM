package dy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final WeroContact a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new WeroContact(wx1.f.b(hVar.f121045a, hVar.f121046b), wx1.f.a(hVar.f121047c, hVar.d), hVar.e, hVar.f, hVar.f121048g, wx1.f.e(hVar.f121049h), hVar.i, null);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((h) it8.next()));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<WeroContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (WeroContact weroContact : list2) {
            Intrinsics.checkNotNullParameter(weroContact, "<this>");
            String strD = wx1.f.d(weroContact.f62157a);
            String f62112a = weroContact.f62157a.getF62112a();
            ApmDescriptor apmDescriptor = weroContact.f62158b;
            arrayList.add(new h(strD, f62112a, wx1.f.c(apmDescriptor), apmDescriptor.getF62112a(), weroContact.f62159c, weroContact.d, weroContact.e, wx1.f.f(weroContact.f), weroContact.f62160g));
        }
        return arrayList;
    }
}
