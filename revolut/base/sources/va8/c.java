package va8;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior.isa.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_title, null, null, 14), null, null, null, false, 30);
        CellDetailsNoteDelegate.Companion companion = CellDetailsNoteDelegate.INSTANCE;
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("NINO_INFO_HEADER_ID", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_header, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), null, null, null, false, null, null, null, null, null, 0, 131060);
        CellDetailsStandaloneNoteDelegate.Model.Companion aVar2 = CellDetailsStandaloneNoteDelegate.Model.INSTANCE;
        List listK = v.k(CellDetailsStandaloneNoteDelegate.Model.Companion.b(aVar2, "NINO_INFO_NIC", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_nic, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(aVar2, "NINO_INFO_PAYSLIPS", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_payslips, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(aVar2, "NINO_INFO_P60", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_p_sixty_form, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(aVar2, "NINO_INFO_TAX_RETURN", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_tax_return, null, null, 14)), CellDetailsStandaloneNoteDelegate.Model.Companion.b(aVar2, "NINO_INFO_OFFICIAL_CORRESPONDENCE", new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_official_correspondence, null, null, 14)));
        companion.getClass();
        ArrayList arrayListA = CellDetailsNoteDelegate.Companion.a(model, listK);
        yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.junior_trading_nino_where_to_find_nino_sheet_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayListA, aVar);
    }
}
