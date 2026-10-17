package gg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.k8;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import go.g;
import java.util.ArrayList;
import java.util.List;
import jf7.l1;
import jf7.m0;
import jf7.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xf7.b {

    @NotNull
    public static final a Companion = new a();

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        Object objG;
        n0 block = (n0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f173696b;
        if (list.isEmpty()) {
            objG = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model modelA = xf7.a.a(j6.a.q("STEPS_TITLE_LIST_ID_", block.f173695a), new TextClause(block.f173695a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);
            List list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                m0 m0Var = (m0) obj2;
                arrayList.add(new ListCellDelegate.Model(j6.a.q("STEPS_LIST_ID_", m0Var.f173690a), new k8(i2), new TextClause(m0Var.f173690a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(m0Var.f173691b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, 0, 0, 0, 0, 4064));
                i = i2;
            }
            objG = yp0.b.g(arrayList, modelA, null, 0, 0, 126);
        }
        return new g(objG, 2);
    }
}
