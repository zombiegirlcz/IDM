package yz2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cards_core.R$string;
import ip0.ak0;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {
    public static RowDelegate.Model.MainImage.Image24 b(int i) {
        return new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), false, false, 6);
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new RowDelegate.Model("information_item_1", b(1), new TextLocalisedClause(R$string.change_pin_activation_info_activate_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.change_pin_activation_info_activate_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("information_item_2", b(2), new TextLocalisedClause(R$string.change_pin_activation_info_pin_ready, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
        yp0.b.k(listK, 0, R$attr.uikit_dp16, 0, 0, 29);
        return new g(d0.F0(new TextDelegate.Model("footer_item", new TextLocalisedClause(R$string.change_pin_unsupported_atms, u.c(new TextLocalisedClause(R$string.change_pin_unsupported_atms_learn_more, null, new Click(30, (Integer) null, (Object) null, "ID_LEARN_MORE", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036), listK));
    }
}
