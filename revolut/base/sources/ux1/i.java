package ux1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final BlikContact a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return new BlikContact(wx1.f.b(hVar.f283858a, hVar.f283859b), new ApmDescriptor.Phone(hVar.d), hVar.e, hVar.f, hVar.f283861g, wx1.f.e(hVar.f283862h));
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

    public static final h c(BlikContact blikContact) {
        Intrinsics.checkNotNullParameter(blikContact, "<this>");
        String strD = wx1.f.d(blikContact.f62119a);
        String f62112a = blikContact.f62119a.getF62112a();
        ApmDescriptor.Phone phone = blikContact.f62120b;
        return new h(strD, f62112a, wx1.f.c(phone), phone.f62110b, blikContact.f62121c, blikContact.d, blikContact.e, wx1.f.f(blikContact.f));
    }
}
