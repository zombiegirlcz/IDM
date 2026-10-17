package rd3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends d {

    @NotNull
    public static final e Companion = new e();

    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return b(domainState, hx7.i.k(domainState).f224291b);
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_credit_title, null, null, 14);
        Clause clause = (Clause) iii.c.f(hx7.i.k(domainState).f224290a, new rbj.g(16), new rbh.j(18), new qk2.h(17));
        ActionsView.Item[] elements = {(domainState.d || !Intrinsics.f(domainState.f224278c.getContent(), Boolean.TRUE)) ? null : new ActionsView.Item("ID_ACTION_EXPLORE_CREDIT_CARDS", null, false, null, null, new TextLocalisedClause(R$string.cashback_product_credit_action_explore, null, null, 14), null, null, null, null, false, null, null, null, null, 32670), d.a(domainState)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        dd3.d.Companion.getClass();
        return new od3.n(textLocalisedClause, clause, listL, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D296", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }
}
