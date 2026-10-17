package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import q90.n0;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q90.n0 item = (q90.n0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        boolean mutuallyExclusive = item.getMutuallyExclusive();
        List<n0.a> chips = item.getChips();
        ArrayList arrayList = new ArrayList(zhm.w.t(chips, 10));
        for (n0.a aVar : chips) {
            arrayList.add(new ChipsSelectionItem.Chip(aVar.getId(), aVar.getLabel()));
        }
        q90.m0 value = item.getValue();
        Set chipIds = value != null ? value.getChipIds() : null;
        if (chipIds == null) {
            chipIds = zhm.h0.f322473a;
        }
        return new ChipsSelectionItem(id10, required, mutuallyExclusive, arrayList, chipIds);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        ChipsSelectionItem item = (ChipsSelectionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63357a;
        boolean z = item.f63358b;
        boolean z3 = item.f63359c;
        List<ChipsSelectionItem.Chip> list = item.d;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (ChipsSelectionItem.Chip chip : list) {
            arrayList.add(new n0.a(chip.f63360a, chip.f63361b));
        }
        return new q90.n0(str, z, z3, arrayList, new q90.m0(item.e));
    }
}
