package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q90.l0;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        ?? arrayList;
        Set cards;
        q90.k0 item = (q90.k0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        q90.l0 value = item.getValue();
        if (value == null || (cards = value.getCards()) == null) {
            arrayList = 0;
        } else {
            Set set = cards;
            arrayList = new ArrayList(zhm.w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList.add(((l0.a) it8.next()).getId());
            }
        }
        if (arrayList == 0) {
            arrayList = zhm.f0.f322471a;
        }
        return new CardSelectionItem(id10, required, null, zhm.d0.i1((Iterable) arrayList));
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CardSelectionItem item = (CardSelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63345a;
        boolean z = item.f63346b;
        Set set = item.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(new l0.a((String) it8.next()));
        }
        return new q90.k0(str, new q90.l0(zhm.d0.i1(arrayList)), z);
    }
}
