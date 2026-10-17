package klb;

import aw0.e;
import aw0.h;
import aw0.i;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.shared.savings.models.info_sheets.InfoSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static i a(InfoSheet infoSheet) {
        Intrinsics.checkNotNullParameter(infoSheet, "infoSheet");
        ArrayList arrayList = infoSheet.e;
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            InfoSheet.Action action = (InfoSheet.Action) d0.b0(arrayList);
            return new e(false, null, null, new n6(new TextClause(action.f86473a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new hlb.e(action.f86474b), 508), null, null, 55);
        }
        InfoSheet.Action action2 = (InfoSheet.Action) d0.b0(arrayList);
        InfoSheet.Action action3 = (InfoSheet.Action) arrayList.get(1);
        return new h(false, new n6(new TextClause(action2.f86473a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new hlb.e(action2.f86474b), 508), new n6(new TextClause(action3.f86473a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, new hlb.e(action3.f86474b), 508), null, null, null, 121);
    }
}
