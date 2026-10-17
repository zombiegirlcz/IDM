package tm1;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("ID_DEACTIVATE_CONFIRM_ROW_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.boleto_finder_offboarding_description_one, null, null, 14), null, 0, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, R$attr.uikit_dp0, 0, 0, 503316440);
        RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.boleto_finder_offboarding_description_two, null, null, 14);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$attr.uikit_dp0;
        List listK = v.k(model, new RowDelegate.Model("ID_DEACTIVATE_CONFIRM_ROW_2", image24, textLocalisedClause, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, i, i, 0, 0, 486539224));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        List listK2 = v.k(new LargeActionButtonDelegate.Model("ID_CONFIRM_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.boleto_finder_offboarding_primary_cta, null, null, 14), false, null, null, 0, R$attr.uikit_dp16, 0, 0, 7152), new LargeActionButtonDelegate.Model("ID_CANCEL_BUTTON", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.boleto_finder_offboarding_secondary_cta, null, null, 14), false, null, null, null, null, 1000));
        yp0.b.q(listK2, 0, 0, 0, 0, 15);
        return new f(d0.E0(listK2, listK));
    }
}
