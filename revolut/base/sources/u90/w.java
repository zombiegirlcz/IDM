package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q90.o1;
import q90.p1;

/* JADX INFO: loaded from: classes19.dex */
public final class w extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        ArrayList arrayList;
        o1 item = (o1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        boolean isMultipleSelection = item.getIsMultipleSelection();
        List groups = item.getGroups();
        if (groups != null) {
            List<o1.a> list = groups;
            arrayList = new ArrayList(zhm.w.t(list, 10));
            for (o1.a aVar : list) {
                arrayList.add(new FiltersInputItem.Group(aVar.getId(), aVar.getTitle(), aVar.getItemIds()));
            }
        } else {
            arrayList = null;
        }
        List<o1.b> items = item.getItems();
        ArrayList arrayList2 = new ArrayList(zhm.w.t(items, 10));
        for (o1.b bVar : items) {
            arrayList2.add(new FiltersInputItem.Option(bVar.getId(), bVar.getLabel()));
        }
        p1 value = item.getValue();
        Set selected = value != null ? value.getSelected() : null;
        if (selected == null) {
            selected = zhm.h0.f322473a;
        }
        return new FiltersInputItem(id10, required, isMultipleSelection, arrayList, arrayList2, selected);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        ArrayList arrayList;
        FiltersInputItem item = (FiltersInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63459a;
        Set set = item.f;
        boolean z = item.f63460b;
        boolean z3 = item.f63461c;
        List list = item.d;
        if (list != null) {
            List<FiltersInputItem.Group> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (FiltersInputItem.Group group : list2) {
                arrayList.add(new o1.a(group.f63462a, group.f63463b, group.f63464c));
            }
        } else {
            arrayList = null;
        }
        List<FiltersInputItem.Option> list3 = item.e;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
        for (FiltersInputItem.Option option : list3) {
            arrayList2.add(new o1.b(option.f63465a, option.f63466b));
        }
        return new o1(str, z, z3, arrayList, arrayList2, set.isEmpty() ? null : new p1(set));
    }
}
