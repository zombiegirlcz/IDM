package idc;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        List listK = v.k(new RowDelegate.Model("LIST_ID_DATA_SECURITY", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_info1_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_info1_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LIST_ID_CARD_PROCESSING", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_info2_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_info2_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ENCRYPTED_BY_REVOLUT_GOT_IT_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.revolut_pay_common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, null, false, 60);
        eVarB.add(model);
        return new a(u.a(eVarB), new TextLocalisedClause(R$string.revolut_pay_add_card_info_screen_title, null, null, 14));
    }
}
