package w7h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import w7h.a;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class b {
    public static final List a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List instruments = aVar.getInstruments();
        if (instruments == null) {
            return f0.f322471a;
        }
        List list = instruments;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new xzg.f0(((a.C1630a) it8.next()).getRef()));
        }
        return arrayList;
    }
}
