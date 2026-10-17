package ko2;

import aim.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.bank_account_switching.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(int i, int i2, int i3, String str) {
        boolean z = false;
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image24(new ResourceImage(i3, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(i, null, null, 14), null, 0, new TextLocalisedClause(i2, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_title, null, null, 14), null, null, null, true, 14);
        e eVarB = u.b();
        eVarB.add(a(R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_redirect_title, R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_redirect_subtitle, R$drawable.uikit_icn_24_arrow_shuffle, "ROW_ID_$0"));
        eVarB.add(a(R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_debits_title, R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_debits_subtitle, R$drawable.uikit_icn_24_bank, "ROW_ID_$1"));
        eVarB.add(a(R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_period_title, R$string.account_switch_how_it_works_bottom_sheet_nl_overstap_cell_period_subtitle, R$drawable.uikit_icn_24_calendar_recurring, "ROW_ID_$2"));
        e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.account_switch_how_it_works_bottom_sheet_action_goit_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), eVarA, aVar);
    }
}
