package aa0;

import com.revolut.feature.backend_flow.domain.models.ChipsSelectionItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        ChipsSelectionItem targetItem = (ChipsSelectionItem) inputItem;
        ChipsSelectionItem.Chip updatedValue = (ChipsSelectionItem.Chip) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        Set setA = gc0.c.A(targetItem.e, updatedValue.f63360a);
        if (targetItem.f63359c && setA.size() > 1) {
            setA = zhm.y0.b(updatedValue.f63360a);
        }
        Set selected = setA;
        String id10 = targetItem.f63357a;
        boolean z = targetItem.f63358b;
        boolean z3 = targetItem.f63359c;
        List chips = targetItem.d;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new ChipsSelectionItem(id10, z, z3, chips, selected);
    }
}
