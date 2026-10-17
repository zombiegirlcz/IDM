package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.HtmlItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.r1;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        r1 item = (r1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new HtmlItem(item.getContent());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        HtmlItem item = (HtmlItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new r1(item.f63477a);
    }
}
