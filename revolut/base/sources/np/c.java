package np;

import b60.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import od0.e;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements b {
    @Override // np.b
    public final void a(Collection dataManagers) {
        Intrinsics.checkNotNullParameter(dataManagers, "dataManagers");
        hf0.a aVar = (hf0.a) hf0.b.d.c();
        aVar.getClass();
        Iterator it8 = ((ip.a) aVar).b().G5().entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            String str = (String) entry.getKey();
            b60.b bVar = (b60.b) entry.getValue();
            if (bVar instanceof e) {
                ArrayList arrayList = i.f12527a;
                i.a("Clear data manager " + str);
                ((e) bVar).clear();
            } else {
                ArrayList arrayList2 = i.f12527a;
                i.a("Unknown data manager with name = " + str + " type = " + bVar.getClass().getSimpleName() + " ");
            }
        }
    }
}
