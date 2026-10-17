package u90;

import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.backend_flow.domain.models.StarRatingInputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q90.h2;
import q90.n3;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 extends c {
    @Override // u90.c
    public final BackendItem a(q90.v vVar, List previousElements) {
        n3 item = (n3) vVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousElements, "previousElements");
        String id10 = item.getId();
        boolean required = item.getRequired();
        String negativeLabel = item.getNegativeLabel();
        String positiveLabel = item.getPositiveLabel();
        h2 value = item.getValue();
        return new StarRatingInputItem(id10, required, negativeLabel, positiveLabel, value != null ? Long.valueOf(kotlin.ranges.f.i(value.getValue(), 1L, 5L)) : null);
    }

    @Override // u90.c
    public final q90.v b(BackendItem backendItem) {
        StarRatingInputItem item = (StarRatingInputItem) backendItem;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f63655a;
        boolean z = item.f63656b;
        String str2 = item.f63657c;
        String str3 = item.d;
        Long l2 = item.e;
        return new n3(str, z, str2, str3, l2 != null ? new h2(kotlin.ranges.f.i(l2.longValue(), 1L, 5L)) : null);
    }
}
