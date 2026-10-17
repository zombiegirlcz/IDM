package e58;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import ip0.ck0;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        a domainState = (a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextDelegate.Model model = new TextDelegate.Model("joint_limits_description_id", new TextLocalisedClause(R$string.joint_limits_header_description, null, null, 14), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model2 = new RowDelegate.Model("personal_limits_button_id", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_limit, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.joint_limits_button_view_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        Object[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new c(kotlin.collections.d.L(elements));
    }
}
