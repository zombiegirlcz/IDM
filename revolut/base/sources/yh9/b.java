package yh9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vi9.l;
import zh9.p;
import zh9.r0;
import zh9.y;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    static RowDelegate.Model a(b bVar, y instalmentWithPlan) {
        l lVar = (l) bVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(instalmentWithPlan, "instalmentWithPlan");
        p pVar = instalmentWithPlan.f322366b;
        r0 r0Var = instalmentWithPlan.f322365a;
        boolean zE = czi.c.E(pVar, r0Var);
        String str = r0Var.f322326a;
        p pVar2 = instalmentWithPlan.f322366b;
        return new RowDelegate.Model(v1.c.t(pVar2.f322316a, "id_repayment_", str, "_"), new RowDelegate.Model.MainImage.Image40(lVar.c(instalmentWithPlan), l.e(instalmentWithPlan, zE), null, false, 28), new TextClause(r0Var.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, l.d(instalmentWithPlan, zE), null, null, 0, new RowDelegate.Model.c.b(sx4.f.b(3, null, null, czi.c.v(pVar2)), l.f(instalmentWithPlan), null, false, 124), false, null, false, null, null, null, null, null, null, new bi9.b(instalmentWithPlan), null, 0, 0, 0, 0, 532675544);
    }
}
