package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.NoneApplyItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.s2;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        s2 item = (s2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        String description = item.getDescription();
        q90.b0 value = item.getValue();
        return new NoneApplyItem(id10, description, pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null), pd.b.k(item.getRequired()));
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        NoneApplyItem item = (NoneApplyItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new s2(item.f63552a, item.f63553b, new q90.b0(item.f63554c), Boolean.valueOf(item.d));
    }
}
