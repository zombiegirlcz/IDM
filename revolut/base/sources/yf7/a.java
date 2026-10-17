package yf7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;
import com.revolut.core.ui_kit.delegates.se;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import go.g;
import java.util.List;
import jf7.e;
import jf7.f;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C1741a Companion = new C1741a();

    /* JADX INFO: renamed from: yf7.a$a, reason: collision with other inner class name */
    public static final class C1741a {
        private C1741a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        f block = (f) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        TextClause textClause = new TextClause(block.f173671a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        e eVar = block.f173672b;
        RewardProgressDelegate.Model model = new RewardProgressDelegate.Model("REWARD_ACTIONS_COUNT_LIST_ID", textClause, new se(eVar.f173665a, eVar.f173666b));
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(model), 2);
    }
}
