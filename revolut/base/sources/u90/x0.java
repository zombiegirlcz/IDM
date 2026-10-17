package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TitleValueItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.b4;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        b4 item = (b4) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new TitleValueItem(item.getTitle(), item.getValue());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        TitleValueItem item = (TitleValueItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new b4(item.f63699a, item.f63700b);
    }
}
