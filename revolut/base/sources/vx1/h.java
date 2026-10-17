package vx1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h {
    public static final BrebContact a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return new BrebContact(wx1.f.b(gVar.f292798a, gVar.f292799b), wx1.f.a(gVar.f292800c, gVar.d), gVar.e, gVar.f, gVar.f292801g, wx1.f.e(gVar.f292802h), gVar.i, null);
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((g) it8.next()));
        }
        return arrayList;
    }

    public static final g c(BrebContact brebContact) {
        Intrinsics.checkNotNullParameter(brebContact, "<this>");
        String strD = wx1.f.d(brebContact.f62122a);
        String f62112a = brebContact.f62122a.getF62112a();
        ApmDescriptor apmDescriptor = brebContact.f62123b;
        return new g(strD, f62112a, wx1.f.c(apmDescriptor), apmDescriptor.getF62112a(), brebContact.f62124c, brebContact.d, brebContact.e, wx1.f.f(brebContact.f), brebContact.f62125g);
    }
}
