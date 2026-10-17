package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TableItem;
import com.revolut.feature.backend_flow.domain.models.TableRowItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.t3;
import q90.u3;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        t3 item = (t3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        List<u3> items = item.getItems();
        ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
        for (u3 u3Var : items) {
            arrayList.add(new TableRowItem(u3Var.getId(), u3Var.getTitle(), u3Var.getValue()));
        }
        return new TableItem(id10, arrayList);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        TableItem item = (TableItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63673a;
        ArrayList<TableRowItem> arrayList = item.f63674b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (TableRowItem tableRowItem : arrayList) {
            arrayList2.add(new u3(tableRowItem.f63675a, tableRowItem.f63676b, tableRowItem.f63677c));
        }
        return new t3(str, arrayList2);
    }
}
