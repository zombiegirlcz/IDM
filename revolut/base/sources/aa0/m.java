package aa0;

import com.revolut.feature.backend_flow.domain.models.DayPickerItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        DayPickerItem targetItem = (DayPickerItem) inputItem;
        LocalDate presentedMonth = (LocalDate) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(presentedMonth, "updatedValue");
        String id10 = targetItem.f63387a;
        boolean z = targetItem.f63388b;
        LocalDate localDate = targetItem.e;
        LocalDate localDate2 = targetItem.f;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(presentedMonth, "presentedMonth");
        return new DayPickerItem(id10, z, presentedMonth, presentedMonth, localDate, localDate2);
    }
}
