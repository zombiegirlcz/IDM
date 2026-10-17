package zx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class j {
    public static final MultibancoContact a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new MultibancoContact(wx1.f.b(iVar.f326033a, iVar.f326034b), new ApmDescriptor.Phone(iVar.d), iVar.e, iVar.f, iVar.f326036g, wx1.f.e(iVar.f326037h));
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((i) it8.next()));
        }
        return arrayList;
    }

    public static final ArrayList c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<MultibancoContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (MultibancoContact multibancoContact : list2) {
            Intrinsics.checkNotNullParameter(multibancoContact, "<this>");
            String strD = wx1.f.d(multibancoContact.f62131a);
            String f62112a = multibancoContact.f62131a.getF62112a();
            ApmDescriptor.Phone phone = multibancoContact.f62132b;
            arrayList.add(new i(strD, f62112a, wx1.f.c(phone), phone.f62110b, multibancoContact.f62133c, multibancoContact.d, multibancoContact.e, wx1.f.f(multibancoContact.f)));
        }
        return arrayList;
    }
}
