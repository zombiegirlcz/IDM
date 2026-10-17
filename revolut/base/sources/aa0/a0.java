package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.MonthPickerItem;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        MonthPickerItem targetItem = (MonthPickerItem) inputItem;
        LocalDate updatedValue = (LocalDate) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        int year = updatedValue.getYear();
        String id10 = targetItem.f63538a;
        boolean z = targetItem.f63539b;
        LocalDate localDate = targetItem.e;
        LocalDate localDate2 = targetItem.f;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new MonthPickerItem(id10, z, year, updatedValue, localDate, localDate2);
    }
}
