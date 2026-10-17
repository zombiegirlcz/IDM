package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.YesNoInputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.o4;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        o4 item = (o4) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        String yesTitle = item.getYesTitle();
        String noTitle = item.getNoTitle();
        q90.b0 value = item.getValue();
        return new YesNoInputItem(id10, required, yesTitle, noTitle, value != null ? Boolean.valueOf(value.getValue()) : null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        YesNoInputItem item = (YesNoInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63726a;
        boolean z = item.f63727b;
        Boolean bool = item.e;
        return new o4(str, z, item.f63728c, item.d, bool != null ? new q90.b0(bool.booleanValue()) : null);
    }
}
