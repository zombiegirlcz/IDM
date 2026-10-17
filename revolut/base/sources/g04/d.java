package g04;

import com.youTransactor.uCube.rpc.Constants;
import dx4.o2;
import dx4.q2;
import dx4.r2;
import dx4.z2;
import g04.c;
import java.util.ArrayList;
import java.util.List;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public static final z2 a(c.d dVar) {
        ?? arrayList;
        String title = dVar.getTitle();
        String description = dVar.getDescription();
        List items = dVar.getItems();
        if (items != null) {
            List<c.d.a> list = items;
            arrayList = new ArrayList(w.t(list, 10));
            for (c.d.a aVar : list) {
                arrayList.add(new r2(aVar.getTitle(), aVar.getValue(), o2.DEFAULT, null, null, q2.DEFAULT, null, null));
            }
        } else {
            arrayList = f0.f322471a;
        }
        return new z2(Constants.TAG_PCI_PED_CHECKSUM, title, description, dVar.getButtonTitle(), arrayList);
    }
}
