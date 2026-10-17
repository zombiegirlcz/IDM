package ubg;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rev_points.models.RevPoints;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, Clause clause, String str, boolean z) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, z, false, null, null, 30712);
    }

    public static CompositeClause b(RevPoints revPoints, dj0.d dVar) {
        TextClause textClause = new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
        o9 o9Var = o9.NON_SENSITIVE;
        MoneyClause moneyClause = new MoneyClause(dVar, defaults, null, o9Var, 4);
        TextClause textClause2 = new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        m70.a.t(kotlin.jvm.internal.t0.f186434a);
        return new CompositeClause(v.k(textClause, moneyClause, textClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nub.a.q(revPoints, null, nub.d.f219277a, o9Var, 1)), null, null, null, 14);
    }
}
