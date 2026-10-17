package kn3;

import com.revolut.feature.contacts_chooser.api.navigation.ContactType;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Email;
import com.revolut.feature.contacts_chooser.api.navigation.ContactType$DeviceContact$Phone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.i;
import zm3.j;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d3a.b f185983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f185984b;

    public f(d3a.b paymentsSearchInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f185983a = paymentsSearchInteractor;
        this.f185984b = configurationInteractor;
    }

    public static ArrayList a(List list, List list2) {
        boolean zContains;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            zm3.a aVar = (zm3.a) obj2;
            if (aVar instanceof i) {
                zContains = list2.contains(ContactType.RevolutContact.Local.f66038a);
            } else if (aVar instanceof j) {
                j jVar = (j) aVar;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof ContactType.RevolutContact.Remote) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    zContains = false;
                } else {
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        if (((ContactType.RevolutContact.Remote) it8.next()).f66039a.contains(jVar.e)) {
                            zContains = true;
                            break;
                        }
                    }
                    zContains = false;
                }
            } else if (aVar instanceof zm3.f) {
                zContains = list2.contains(ContactType$DeviceContact$Phone.f66036a);
            } else if (aVar instanceof zm3.e) {
                zContains = list2.contains(ContactType$DeviceContact$Email.f66035a);
            } else {
                boolean z = aVar instanceof o;
                ContactType.VirtualContact virtualContact = ContactType.VirtualContact.f66041a;
                if (!z && !(aVar instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
                zContains = list2.contains(virtualContact);
            }
            if (zContains) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
