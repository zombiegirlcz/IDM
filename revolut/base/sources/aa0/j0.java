package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.StarRatingInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        StarRatingInputItem targetItem = (StarRatingInputItem) inputItem;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        if (1 > iIntValue || iIntValue >= 6) {
            throw new IllegalArgumentException(a0.d.n("Rating must be from 1 to 5 but provided value is ", iIntValue));
        }
        Long lValueOf = Long.valueOf(iIntValue);
        String id10 = targetItem.f63655a;
        boolean z = targetItem.f63656b;
        String str = targetItem.f63657c;
        String str2 = targetItem.d;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new StarRatingInputItem(id10, z, str, str2, lValueOf);
    }
}
