package ojk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class s {
    public static final void a(ArrayList arrayList, String str, Custom custom) {
        if (str.length() == 0) {
            return;
        }
        TextClause textClause = (TextClause) zhm.d0.o0(arrayList);
        if (custom != null || textClause == null || textClause.f57937b != null) {
            arrayList.add(new TextClause(str, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124));
            return;
        }
        arrayList.set(zhm.v.j(arrayList), TextClause.c(textClause, textClause.f57936a + str, null, 126));
    }
}
