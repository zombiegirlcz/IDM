package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.CardInputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q90.h0 item = (q90.h0) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        q90.i0 value = item.getValue();
        return new CardInputItem(id10, value != null ? value.getValue() : null, required);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        CardInputItem item = (CardInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63342a;
        boolean z = item.f63343b;
        String str2 = item.f63344c;
        return new q90.h0(str, z, str2 != null ? new q90.i0(str2) : null);
    }
}
