package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.TimeInputItem;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        TimeInputItem targetItem = (TimeInputItem) inputItem;
        h1 updatedValue = (h1) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        LocalTime localTime = updatedValue.f2733a;
        String str = updatedValue.f2734b;
        String id10 = targetItem.f63694a;
        boolean z = targetItem.f63695b;
        String str2 = targetItem.f63696c;
        Intrinsics.checkNotNullParameter(id10, "id");
        return new TimeInputItem(id10, z, str2, localTime, str);
    }
}
