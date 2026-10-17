package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.LinkItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.d2;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        d2 item = (d2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new LinkItem(item.getTitle(), item.getUrl());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        LinkItem item = (LinkItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new d2(item.f63514a, item.f63515b);
    }
}
