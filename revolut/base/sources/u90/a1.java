package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.n4;

/* JADX INFO: loaded from: classes19.dex */
public final class a1 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        n4 item = (n4) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new WidgetProgressionItem(item.getId(), item.getTicketId(), null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        WidgetProgressionItem item = (WidgetProgressionItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new n4(item.f63720a, item.f63721b);
    }
}
