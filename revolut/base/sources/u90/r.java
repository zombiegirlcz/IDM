package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.c1;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        q90.b1 item = (q90.b1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean openRequired = item.getOpenRequired();
        c1 value = item.getValue();
        return new DocumentItem(id10, item.getTitle(), item.getSubtitle(), pd.b.j(value != null ? Boolean.valueOf(value.getOpened()) : null), openRequired, item.getButtonTitle(), item.getUrl());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        DocumentItem item = (DocumentItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63393a;
        String str2 = item.f63394b;
        String str3 = item.f63395c;
        String str4 = item.f63396g;
        return new q90.b1(str, new c1(item.d), str2, item.e, item.f, str3, str4);
    }
}
