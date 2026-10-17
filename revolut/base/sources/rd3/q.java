package rd3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends d {

    @NotNull
    public static final p Companion = new p();

    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return b(domainState, hx7.i.o(domainState).f224328c);
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        ActionsView.Item item;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Object objF = iii.c.f(hx7.i.o(domainState).f224326a, new m(7), new k(11), new qk2.h(29));
        Object content = hx7.i.o(domainState).f224327b.getContent();
        Boolean bool = Boolean.TRUE;
        boolean zF = Intrinsics.f(content, bool);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_product_pro_title, null, null, 14);
        Clause clause = (Clause) objF;
        if (zF) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.cashback_product_pro_action_upgrade, null, null, 14);
            ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_upgrade, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            hha.u.Companion.getClass();
            item = new ActionsView.Item("ID_ACTION_UPGRADE", null, false, null, null, textLocalisedClause2, resourceImage, null, null, null, false, null, null, hha.u.F, null, 24478);
        } else {
            item = null;
        }
        ActionsView.Item[] elements = {item, (domainState.d || !Intrinsics.f(domainState.f224278c.getContent(), bool)) ? null : new ActionsView.Item("ID_ACTION_EXPLORE_PRO", null, false, null, null, new TextLocalisedClause(R$string.cashback_product_pro_action_explore, null, null, 14), null, null, null, null, false, null, null, null, null, 32670), d.a(domainState)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        dd3.n.Companion.getClass();
        return new od3.n(textLocalisedClause, clause, listL, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D206", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }
}
