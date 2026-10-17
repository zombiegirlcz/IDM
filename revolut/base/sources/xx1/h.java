package xx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.IdentityType;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class h {
    public static final IrisContact a(g gVar) {
        IdentityType identityType;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ApmIdentifier apmIdentifierB = wx1.f.b(gVar.f309389a, gVar.f309390b);
        ApmDescriptor apmDescriptorA = wx1.f.a(gVar.f309391c, gVar.d);
        String str = gVar.e;
        String str2 = gVar.f;
        String str3 = gVar.f309392g;
        ApmContact.SimpleState simpleStateE = wx1.f.e(gVar.f309393h);
        wx1.a aVar = gVar.i;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = wx1.e.f300735c[aVar.ordinal()];
        if (i == 1) {
            identityType = IdentityType.BUSINESS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            identityType = IdentityType.PERSONAL;
        }
        return new IrisContact(apmIdentifierB, apmDescriptorA, str, str2, str3, simpleStateE, identityType);
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

    public static final g c(IrisContact irisContact) {
        wx1.a aVar;
        Intrinsics.checkNotNullParameter(irisContact, "<this>");
        String strD = wx1.f.d(irisContact.f62127a);
        String f62112a = irisContact.f62127a.getF62112a();
        ApmDescriptor apmDescriptor = irisContact.f62128b;
        String strC = wx1.f.c(apmDescriptor);
        String f62112a2 = apmDescriptor.getF62112a();
        String str = irisContact.f62129c;
        String str2 = irisContact.d;
        String str3 = irisContact.e;
        wx1.b bVarF = wx1.f.f(irisContact.f);
        IdentityType identityType = irisContact.f62130g;
        Intrinsics.checkNotNullParameter(identityType, "<this>");
        int i = wx1.e.d[identityType.ordinal()];
        if (i == 1) {
            aVar = wx1.a.BUSINESS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = wx1.a.PERSONAL;
        }
        return new g(strD, f62112a, strC, f62112a2, str, str2, str3, bVarF, aVar);
    }
}
