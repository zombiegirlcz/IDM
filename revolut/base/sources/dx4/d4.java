package dx4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d4 {
    public static final ArrayList a(b4 b4Var) {
        Custom custom;
        y3 y3Var;
        int i;
        Intrinsics.checkNotNullParameter(b4Var, "<this>");
        Iterable<z3> iterable = (Iterable) b4Var.f120559a;
        ArrayList arrayList = new ArrayList(zhm.w.t(iterable, 10));
        for (z3 z3Var : iterable) {
            String str = z3Var.f120865a;
            a4 a4Var = z3Var.f120866b;
            if (a4Var == null || (y3Var = a4Var.f120546a) == null) {
                custom = null;
            } else {
                int i2 = c4.f120568a[y3Var.ordinal()];
                if (i2 == 1) {
                    i = R$attr.uikit_colorForeground;
                } else if (i2 == 2) {
                    i = R$attr.uikit_colorGreyTone50;
                } else if (i2 == 3) {
                    i = R$attr.uikit_colorStatusWarning;
                } else if (i2 == 4) {
                    i = R$attr.uikit_colorStatusDanger;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$attr.uikit_colorStatusSuccess;
                }
                custom = new Custom(Integer.valueOf(i), false, null, false, null, 254);
            }
            arrayList.add(new TextClause(str, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124));
        }
        return arrayList;
    }
}
