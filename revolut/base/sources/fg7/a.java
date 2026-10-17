package fg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import go.g;
import java.util.List;
import jf7.h0;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0794a Companion = new C0794a();

    /* JADX INFO: renamed from: fg7.a$a, reason: collision with other inner class name */
    public static final class C0794a {
        private C0794a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        h0 block = (h0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        return new g(u.c(new CellDetailsDelegate.Model(j6.a.q("CELL_DETAILS_ITEM_ID_", block.f173676a), new TextClause(block.f173676a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(block.f173677b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), 2);
    }
}
