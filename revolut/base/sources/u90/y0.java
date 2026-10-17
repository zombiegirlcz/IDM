package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.TransactionCellItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.c4;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        c4 item = (c4) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new TransactionCellItem(item.getId(), item.getTransactionId(), item.getDeeplink(), null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        TransactionCellItem item = (TransactionCellItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new c4(item.f63701a, item.f63702b, item.f63703c);
    }
}
