package dg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import go.g;
import java.util.List;
import jf7.b0;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import uf7.v;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0677a Companion = new C0677a();

    /* JADX INFO: renamed from: dg7.a$a, reason: collision with other inner class name */
    public static final class C0677a {
        private C0677a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        b0 block = (b0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("OPT_OUT_LIST_ID", new TextClause(block.f173659a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, v.f279622a, null, null, 2028);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(model), 2);
    }
}
