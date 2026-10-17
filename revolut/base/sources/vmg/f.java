package vmg;

import com.revolut.feature.address.models.Address;
import dng.l;
import eo3.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class f {
    public static final l a(List list) {
        Address address;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof a.b) {
                arrayList.add(obj2);
            }
        }
        a.b bVar = (a.b) d0.d0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof a.C0738a) {
                arrayList2.add(obj3);
            }
        }
        a.C0738a c0738a = (a.C0738a) d0.d0(arrayList2);
        String str = bVar != null ? bVar.f127860a : null;
        String str2 = bVar != null ? bVar.f127861b : null;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof eo3.b) {
                arrayList3.add(obj4);
            }
        }
        eo3.b bVar2 = (eo3.b) d0.d0(arrayList3);
        String str3 = bVar2 != null ? bVar2.f127863a : null;
        no3.b bVarD = (c0738a == null || (address = c0738a.f127859a) == null) ? null : oo3.a.d(address);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list2) {
            if (obj5 instanceof a.c) {
                arrayList4.add(obj5);
            }
        }
        a.c cVar = (a.c) d0.d0(arrayList4);
        dng.f fVar = (cVar != null ? cVar.f127862a : null) == null ? null : new dng.f(null, cVar != null ? cVar.f127862a : null, null);
        ArrayList arrayList5 = new ArrayList();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            it8.next();
        }
        if (d0.d0(arrayList5) == null) {
            return new l(null, null, null, str, str2, str3, null, bVarD, null, fVar, null);
        }
        throw new ClassCastException();
    }
}
