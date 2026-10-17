package aa0;

import com.revolut.feature.backend_flow.domain.models.CardSelectionItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        CardSelectionItem targetItem = (CardSelectionItem) inputItem;
        String updatedValue = (String) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        return CardSelectionItem.d(targetItem, null, gc0.c.A(targetItem.d, updatedValue), 7);
    }
}
