package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.SingleChoiceButtonItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.j3;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        j3 item = (j3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        Integer group = item.getGroup();
        String description = item.getDescription();
        q90.b0 value = item.getValue();
        return new SingleChoiceButtonItem(id10, group, description, pd.b.j(value != null ? Boolean.valueOf(value.getValue()) : null), pd.b.k(item.getRequired()), item.getButtonText(), item.getHint());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        SingleChoiceButtonItem item = (SingleChoiceButtonItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63633a;
        Integer num = item.f63634b;
        String str2 = item.f63635c;
        q90.b0 b0Var = new q90.b0(item.d);
        boolean z = item.e;
        return new j3(str, num, null, str2, b0Var, Boolean.valueOf(z), "SELECT_BUTTON", item.f, item.f63636g, null);
    }
}
