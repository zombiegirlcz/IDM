package sx1;

import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final AaniContact a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new AaniContact(wx1.f.b(hVar.f266258a, hVar.f266259b), wx1.f.a(hVar.f266260c, hVar.d), hVar.e, hVar.f, hVar.f266261g, wx1.f.e(hVar.f266262h), hVar.i);
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
        List<AaniContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (AaniContact aaniContact : list2) {
            Intrinsics.checkNotNullParameter(aaniContact, "<this>");
            String strD = wx1.f.d(aaniContact.f62095a);
            String f62112a = aaniContact.f62095a.getF62112a();
            ApmDescriptor apmDescriptor = aaniContact.f62096b;
            arrayList.add(new h(strD, f62112a, wx1.f.c(apmDescriptor), apmDescriptor.getF62112a(), aaniContact.f62097c, aaniContact.d, aaniContact.e, wx1.f.f(aaniContact.f), aaniContact.f62098g));
        }
        return arrayList;
    }
}
