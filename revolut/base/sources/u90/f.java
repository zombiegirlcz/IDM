package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CardCellItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q90.g0 item = (q90.g0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new CardCellItem(item.getId(), item.getCardId(), item.getCardType(), null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CardCellItem item = (CardCellItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new q90.g0(item.f63339a, item.f63340b, item.f63341c);
    }
}
