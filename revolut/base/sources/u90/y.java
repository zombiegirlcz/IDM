package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.HtmlStringItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.t1;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends c {
    public static t1 c(HtmlStringItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63481a;
        xl2.s sVar = item.f63482b;
        return new t1(str, sVar != null ? sVar.name() : null);
    }

    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        t1 item = (t1) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String value = item.getValue();
        String style = item.getStyle();
        xl2.s sVar = null;
        if (style != null) {
            xl2.s[] sVarArrValues = xl2.s.values();
            int length = sVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                xl2.s sVar2 = sVarArrValues[i];
                if (kotlin.text.a0.z(sVar2.name(), style, true)) {
                    sVar = sVar2;
                    break;
                }
                i++;
            }
        }
        return new HtmlStringItem(value, sVar);
    }

    @Override // u90.c
    public final /* bridge */ /* synthetic */ q90.v b(BackendItem backendItem) {
        return c((HtmlStringItem) backendItem);
    }
}
