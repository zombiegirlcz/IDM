package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.YearPickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        YearPickerItem targetItem = (YearPickerItem) inputItem;
        ba0.j updatedValue = (ba0.j) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        int i = updatedValue.f13875a;
        int i2 = updatedValue.f13876b;
        Integer numValueOf = Integer.valueOf(i);
        String id10 = targetItem.f63723a;
        boolean z = targetItem.f63724b;
        Integer num = targetItem.e;
        Integer num2 = targetItem.f;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new YearPickerItem(id10, z, i2, numValueOf, num, num2);
    }
}
