package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.MailItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.i2;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        i2 item = (i2) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        return new MailItem(item.getTitle(), item.getValue(), item.getUrl());
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        MailItem item = (MailItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        return new i2(item.f63516a, item.f63517b, item.f63518c);
    }
}
