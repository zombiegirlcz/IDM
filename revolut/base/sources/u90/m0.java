package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.RadioButtonItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.j3;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        j3 item = (j3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        Integer group = item.getGroup();
        String description = item.getDescription();
        q90.b0 value = item.getValue();
        return new RadioButtonItem(id10, group, description, pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null), pd.b.k(item.getRequired()));
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        RadioButtonItem item = (RadioButtonItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new j3(item.f63590a, item.f63591b, null, item.f63592c, new q90.b0(item.d), Boolean.valueOf(item.e), null, null, null, null);
    }
}
