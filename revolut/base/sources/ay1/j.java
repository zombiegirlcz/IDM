package ay1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class j {
    public static final PixContact a(i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new PixContact(wx1.f.b(iVar.f11020a, iVar.f11021b), wx1.f.a(iVar.f11022c, iVar.d), iVar.e, iVar.f, iVar.f11023g, wx1.f.e(iVar.f11024h), iVar.i, null, iVar.f11025j, iVar.k, iVar.f11026l, false);
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

    public static final i c(PixContact pixContact) {
        Intrinsics.checkNotNullParameter(pixContact, "<this>");
        String strD = wx1.f.d(pixContact.f62140a);
        String f62112a = pixContact.f62140a.getF62112a();
        ApmDescriptor apmDescriptor = pixContact.f62141b;
        return new i(strD, f62112a, wx1.f.c(apmDescriptor), apmDescriptor.getF62112a(), pixContact.f62142c, pixContact.d, pixContact.e, wx1.f.f(pixContact.f), pixContact.f62143g, pixContact.i, pixContact.f62145j, pixContact.k);
    }
}
