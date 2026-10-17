package gaf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.transfer.investments.api.domain.model.IsaTransferYear;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferUserAccountInformation;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        CellDetailsNoteDelegate.Model model;
        int i2;
        int i3;
        CellDetailsNoteDelegate.Model model2;
        int i5;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TradingAccount.TaxAdvantage taxAdvantage = domainState.d;
        boolean z = domainState.f142160g;
        int i6 = 14;
        CellDetailsDelegate.Model model3 = null;
        TextLocalisedClause textLocalisedClause = taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Custodian ? new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_title_jisa, u.c(((TradingAccount.TaxAdvantage.JIsa.Custodian) taxAdvantage).f105237n.f105176b), null, 12) : taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa.Personal ? new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_title_personal_jisa, null, null, 14) : new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_header_title_isa, null, null, 14);
        TradingAccount.TaxAdvantage taxAdvantage2 = domainState.d;
        Data data = domainState.f142159c;
        int i21 = 0;
        aw0.e eVar = data != null ? (aw0.e) iii.c.f(data, new l(i21), new g5k.f(19), new fnk.o(this, taxAdvantage2, 24)) : null;
        CellDetailsNoteDelegate.Model model4 = new CellDetailsNoteDelegate.Model("TO_REVOLUT_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_type, null, null, 14), null, new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_type_to_revolut, null, null, 14), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        u8f.b transferType = domainState.e;
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        int i22 = 2;
        if (z) {
            int i32 = m.f142171b[transferType.ordinal()];
            if (i32 == 1) {
                i = R$string.trading_stocks_transfer_in_confirmation_section_header_isa_account_type_stocks_and_shares;
            } else {
                if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.trading_stocks_transfer_in_confirmation_section_header_isa_account_type_cash;
            }
            model = new CellDetailsNoteDelegate.Model("TRANSFER_TYPE_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_isa_account_type, null, null, 14), null, new TextLocalisedClause(i, null, null, 14), null, false, null, null, null, null, null, 0, 131060);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        TransferBroker transferBroker = domainState.f142157a;
        Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
        CellDetailsNoteDelegate.Model model5 = new CellDetailsNoteDelegate.Model("PROVIDER_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_provider, null, null, 14), null, new TextClause(transferBroker.f91500a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        Map transferYears = domainState.f;
        Intrinsics.checkNotNullParameter(transferYears, "transferYears");
        if (z) {
            ArrayList arrayList = new ArrayList(transferYears.size());
            for (Map.Entry entry : transferYears.entrySet()) {
                int i33 = i21;
                IsaTransferYear isaTransferYear = (IsaTransferYear) entry.getKey();
                u8f.c cVar = (u8f.c) entry.getValue();
                if (Intrinsics.f(isaTransferYear, IsaTransferYear.CurrentYear.f91498a)) {
                    i5 = R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_details_current_year;
                } else {
                    if (!Intrinsics.f(isaTransferYear, IsaTransferYear.PastYear.f91499a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i43 = m.f142170a[cVar.ordinal()];
                    if (i43 == 1) {
                        i5 = R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_details_previous_year_full;
                    } else {
                        if (i43 != i22) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i5 = R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_details_previous_year_partial;
                    }
                }
                m70.a.a(t0.f186434a);
                arrayList.add(yoj.b.w(new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(i5, null, null, 14)));
                i21 = i33;
                i6 = 14;
                i22 = i22;
            }
            i2 = i21;
            i3 = i22;
            model2 = new CellDetailsNoteDelegate.Model("TRANSFER_YEAR_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_transfer_details, null, null, i6), null, new CompositeClause(arrayList, new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, false, null, null, null, null, null, 0, 131060);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        } else {
            model2 = null;
            i2 = 0;
            i3 = 2;
        }
        TransferUserAccountInformation.TaaTransferUserAccountInformation transferInAccountInformation = domainState.f142158b;
        Intrinsics.checkNotNullParameter(transferInAccountInformation, "transferInAccountInformation");
        CellDetailsNoteDelegate.Model model6 = new CellDetailsNoteDelegate.Model("ACCOUNT_NUMBER_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_section_header_account_number, null, null, 14), null, new TextClause(transferInAccountInformation.f91536a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
        if (!z) {
            CellDetailsDelegate.Model model7 = new CellDetailsDelegate.Model("IMPORTANT_NOTE_LIST_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_in_confirmation_important_note, null, null, 14), (Image) null, Integer.MAX_VALUE, false, 26), null, null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
            model3 = model7;
        }
        koi.j[] elements = new koi.j[6];
        elements[i2] = model4;
        elements[1] = model;
        elements[i3] = model5;
        elements[3] = model2;
        elements[4] = model6;
        elements[5] = model3;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new h(eVar, textLocalisedClause, kotlin.collections.d.L(elements));
    }
}
