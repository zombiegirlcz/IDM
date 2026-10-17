package zf7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;
import com.revolut.core.ui_kit.delegates.re;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import go.g;
import java.util.List;
import jf7.i;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rim.d;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C1784a Companion = new C1784a();

    /* JADX INFO: renamed from: zf7.a$a, reason: collision with other inner class name */
    public static final class C1784a {
        private C1784a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        i block = (i) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        TextClause textClause = new TextClause(block.f173678a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int iB = d.b(block.f173679b * ((double) 100));
        String str = block.f173680c;
        RewardProgressDelegate.Model model = new RewardProgressDelegate.Model("REWARD_ACTIONS_VOLUME_LIST_ID", textClause, new re(iB, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextClause(block.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(model), 2);
    }
}
