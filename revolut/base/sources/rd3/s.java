package rd3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od3.f0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends d {

    @NotNull
    public static final r Companion = new r();

    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "<this>");
        f0 f0Var = domainState.e;
        if (!(f0Var instanceof od3.a0)) {
            f0Var = null;
        }
        od3.a0 a0Var = (od3.a0) f0Var;
        if (a0Var != null) {
            return b(domainState, a0Var.f224261a);
        }
        throw new NullPointerException("For " + domainState.f224276a + " ProductData should be instance of " + od3.a0.class.getSimpleName() + " but it was " + domainState.e.getClass().getSimpleName());
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_rewards_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cashback_product_rewards_description, null, null, 14);
        ActionsView.Item[] elements = {(domainState.d || !Intrinsics.f(domainState.f224278c.getContent(), Boolean.TRUE)) ? null : new ActionsView.Item("ID_ACTION_EXPLORE_REWARDS", null, false, null, null, new TextLocalisedClause(R$string.cashback_product_rewards_action_explore, null, null, 14), null, null, null, null, false, null, null, null, null, 32670), d.a(domainState)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        dd3.q.Companion.getClass();
        return new od3.n(textLocalisedClause, textLocalisedClause2, listL, com.revolut.core.ui_kit_core.displayers.image.models.b.c("", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }
}
