package dw4;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardStatementDeferralQuote;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;
import pyd.c;
import rp0.m;
import rp0.y;
import sx4.f;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C0714a Companion = new C0714a();

    /* JADX INFO: renamed from: dw4.a$a, reason: collision with other inner class name */
    public static final class C0714a {
        private C0714a() {
        }
    }

    public static y a(CreditCardStatementDeferralQuote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        m.b bVar = m.Companion;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_total_repay, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_total_repay_description, null, null, 14);
        d dVar = quote.f68805h;
        d dVar2 = quote.f68802b;
        List listK = v.k(c(c.H(dVar, dVar2), true), b(dVar2), d(quote.f68805h));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return dy4.b.a(bVar, textLocalisedClause, textLocalisedClause2, new p("id_credit_card_statement_financing_dialog_action_got_it", new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14), (Object) null), null, listK, Constants.TAG_PCI_PED_CHECKSUM);
    }

    public static CellDetailsDelegate.Model b(d dVar) {
        return new CellDetailsDelegate.Model("id_credit_card_statement_financing_dialog_down_payment", new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_total_repay_item_down_payment, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), f.b(3, null, null, dVar), 0, null, null, null, null, null, false, 0, 0, 32760);
    }

    public static CellDetailsDelegate.Model c(d dVar, boolean z) {
        return new CellDetailsDelegate.Model("id_credit_card_statement_financing_dialog_total_cost", new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_dialog_total_repay_item_total_cost, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), f.b(3, null, null, dVar), null, new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_down : R$drawable.uikit_icn_16_chevron_up, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, 0, null, new b(z), null, null, 0, null, true, null, 0, 0, 0, 0, 1031656);
    }

    public static CellDetailsDelegate.Model d(d dVar) {
        return new CellDetailsDelegate.Model("id_credit_card_statement_financing_dialog_total_repay", new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_section_summary_total_repay, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), f.b(3, null, null, dVar), 0, null, null, null, null, null, false, 0, 0, 32760);
    }
}
