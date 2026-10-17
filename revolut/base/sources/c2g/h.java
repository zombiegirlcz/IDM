package c2g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements g {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, int i2, int i3, Clause clause, String str) {
        Float fValueOf = Float.valueOf(16.0f);
        List listK = v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), clause);
        t0 t0Var = t0.f186434a;
        m70.a.t(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        CompositeClause compositeClause = new CompositeClause(listK, new TextClause("   ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return new CellDetailsDelegate.Model(str, compositeClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, i2, i3, 26616);
    }
}
