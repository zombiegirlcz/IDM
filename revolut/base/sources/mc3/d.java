package mc3;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cash_topup.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements n {
    public static RowDelegate.Model.MainImage.Image24 a(int i) {
        return new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorBlack), null, 24), false, false, 6);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_deposit_instructions_third_step_description_updated, null, null, 14);
        List listC = u.c(new FullScreenStateDelegate.Model("ILLUSTRATION_ID", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3d038a", null, null, "mobile/3d_images/v2", 22)), null, null, false, null, null, false, 0, 0, 32758));
        RowDelegate.Model[] elements = {new RowDelegate.Model("1", a(1), new TextLocalisedClause(R$string.topup_cash_deposit_instructions_first_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_deposit_instructions_first_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("2", a(2), new TextLocalisedClause(R$string.topup_cash_deposit_instructions_second_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_deposit_instructions_second_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("3", a(3), new TextLocalisedClause(R$string.topup_cash_deposit_instructions_third_step_title, null, null, 14), null, 0, textLocalisedClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("4", a(4), new TextLocalisedClause(R$string.topup_cash_deposit_instructions_fourth_step_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_cash_deposit_instructions_fourth_step_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new b(i2b.a.o(listC, listL));
    }
}
