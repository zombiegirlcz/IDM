package krc;

import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.models.SalarySwitchPreview;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        CellDetailsDelegate.Model model;
        krc.a domainState = (krc.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SalarySwitchPreview salarySwitchPreview = domainState.f188845a;
        String str = domainState.f188846b;
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("BANK_CELL_ITEM_ID", new TextLocalisedClause(R$string.salary_switch_mx_details_item_bank, null, null, 14), new TextClause(salarySwitchPreview.f85229a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        SalarySwitchPreview.Account account = salarySwitchPreview.f85230b;
        if (account instanceof SalarySwitchPreview.Account.Card) {
            model = new CellDetailsDelegate.Model("NUMBER_TYPE_CELL_ITEM_ID", new TextLocalisedClause(R$string.salary_switch_mx_details_item_debit_card, null, null, 14), new TextClause(j6.a.q("•• ", ((SalarySwitchPreview.Account.Card) account).f85232b), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        } else {
            if (!(account instanceof SalarySwitchPreview.Account.Clabe)) {
                throw new NoWhenBranchMatchedException();
            }
            HashMap map = im.c.f162274c;
            model = new CellDetailsDelegate.Model("NUMBER_TYPE_CELL_ITEM_ID", new TextLocalisedClause(R$string.salary_switch_mx_details_item_clabe, null, null, 14), new TextClause(uc0.b.f(((SalarySwitchPreview.Account.Clabe) account).f85234a, v13.d.l("[0000] [0000] [0000] [0000000]", f0.f322471a)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        }
        List listK = v.k(model2, model, new CellDetailsDelegate.Model("REVOLUT_ACCOUNT_CELL_ITEM_ID", new TextLocalisedClause(R$string.salary_switch_mx_details_item_to_revolut_account, null, null, 14), new TextLocalisedClause(R$string.salary_switch_mx_details_item_to_revolut_account_value, u.c(str), null, 12), null, null, false, 0, null, null, null, null, 0, new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14), false, null, 0, 0, 0, 0, 1040360));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new d(listK);
    }
}
