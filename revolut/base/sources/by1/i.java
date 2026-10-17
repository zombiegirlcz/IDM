package by1;

import com.google.android.material.internal.ViewUtils;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettings;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i {
    public static final QvikContact a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        ApmIdentifier apmIdentifierB = wx1.f.b(hVar.f19729a, hVar.f19730b);
        ApmDescriptor apmDescriptorA = wx1.f.a(hVar.f19731c, hVar.d);
        String str = hVar.e;
        String str2 = hVar.f;
        String str3 = hVar.f19732g;
        ApmContact.SimpleState simpleStateE = wx1.f.e(hVar.f19733h);
        boolean z = hVar.i;
        wx1.d dVar = hVar.f19734j;
        ApmRecipientSettings apmRecipientSettings = null;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Boolean bool = dVar.f300732a;
            apmRecipientSettings = new ApmRecipientSettings(bool != null ? new ApmRecipientSettingsValue.BlockIncomingMoneyRequests(bool.booleanValue()) : null);
        }
        return new QvikContact(apmIdentifierB, apmDescriptorA, str, str2, str3, simpleStateE, z, apmRecipientSettings, (f5j.a) null, ViewUtils.EDGE_TO_EDGE_FLAGS);
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
        List<QvikContact> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (QvikContact qvikContact : list2) {
            Intrinsics.checkNotNullParameter(qvikContact, "<this>");
            String strD = wx1.f.d(qvikContact.f62147a);
            String f62112a = qvikContact.f62147a.getF62112a();
            ApmDescriptor apmDescriptor = qvikContact.f62148b;
            String strC = wx1.f.c(apmDescriptor);
            String f62112a2 = apmDescriptor.getF62112a();
            String str = qvikContact.f62149c;
            String str2 = qvikContact.d;
            String str3 = qvikContact.e;
            wx1.b bVarF = wx1.f.f(qvikContact.f);
            boolean z = qvikContact.f62150g;
            ApmRecipientSettings apmRecipientSettings = qvikContact.f62151h;
            wx1.d dVar = null;
            if (apmRecipientSettings != null) {
                Intrinsics.checkNotNullParameter(apmRecipientSettings, "<this>");
                ApmRecipientSettingsValue.BlockIncomingMoneyRequests blockIncomingMoneyRequests = apmRecipientSettings.f62114a;
                dVar = new wx1.d(blockIncomingMoneyRequests != null ? Boolean.valueOf(blockIncomingMoneyRequests.f62115a) : null);
            }
            arrayList.add(new h(strD, f62112a, strC, f62112a2, str, str2, str3, bVarF, z, dVar));
        }
        return arrayList;
    }
}
