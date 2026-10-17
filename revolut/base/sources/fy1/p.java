package fy1;

import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements lx1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f138871a;

    public p(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f138871a = uiKitResources;
    }

    public final List a(List contactList, String str, ApmProduct apmProduct) {
        List listN0;
        Intrinsics.checkNotNullParameter(contactList, "contactList");
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : contactList) {
            if (Intrinsics.f(((ApmContact) obj2).getF(), ApmContact.State.ACTIVE.f62099a)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        if (str != null) {
            m70.a.t(t0.f186434a);
            listN0 = d0.n0(str, new String[]{" "}, 0, 6);
        } else {
            listN0 = null;
        }
        if (listN0 == null) {
            return arrayList;
        }
        String string = this.f138871a.b(apmProduct.e()).toString();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            ApmContact apmContact = (ApmContact) obj3;
            List<String> list = listN0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str2 : list) {
                    if (apmContact.g8(str2) || jli.g.d(string, str2)) {
                    }
                }
            }
            arrayList2.add(obj3);
        }
        return arrayList2;
    }
}
