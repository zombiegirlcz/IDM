package lj9;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zh9.b1;
import zh9.q1;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsActionDelegate.Model a(Clause clause, q1 q1Var, wi0.b bVar, b1 b1Var) {
        return new CellDetailsActionDelegate.Model(a0.d.n("fee-term-", q1Var.f322323a), clause, 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(ky4.d.a(q1Var.f322324b, bVar, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), true, null, false, null, Constants.TAG_FC_SPEED_MODE)), new PercentageClause(0.0d, (PercentageClause.Format) null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 2))), false, false, null, new vj9.a(b1Var, new Pair(cp5.d.r(q1Var), bVar)), 0, 0, 32224);
    }

    public static CellDetailsDelegate.Model b(Clause clause, q1 q1Var, wi0.b bVar) {
        return new CellDetailsDelegate.Model(a0.d.n("fee-term-", q1Var.f322323a), clause, ky4.d.a(q1Var.f322324b, bVar, null), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
