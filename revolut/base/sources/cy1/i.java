package cy1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final SpinContact a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new SpinContact(wx1.f.b(hVar.f110032a, hVar.f110033b), wx1.f.a(hVar.f110034c, hVar.d), hVar.e, hVar.f, hVar.f110035g, wx1.f.e(hVar.f110036h), null);
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
        List<SpinContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (SpinContact spinContact : list2) {
            Intrinsics.checkNotNullParameter(spinContact, "<this>");
            String strD = wx1.f.d(spinContact.f62153a);
            String f62112a = spinContact.f62153a.getF62112a();
            ApmDescriptor apmDescriptor = spinContact.f62154b;
            arrayList.add(new h(strD, f62112a, wx1.f.c(apmDescriptor), apmDescriptor.getF62112a(), spinContact.f62155c, spinContact.d, spinContact.e, wx1.f.f(spinContact.f)));
        }
        return arrayList;
    }
}
