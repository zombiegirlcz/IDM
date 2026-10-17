package z42;

import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferRecipient;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.b f319312a;

    public h(n8b.b countryUtils) {
        Intrinsics.checkNotNullParameter(countryUtils, "countryUtils");
        this.f319312a = countryUtils;
    }

    @Override // cli.n
    public final o c(j jVar) {
        f fVar;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        ApmTransferRecipient apmTransferRecipient = domainState.f319307a;
        if (apmTransferRecipient instanceof ApmTransferRecipient.OpenRequest) {
            fVar = new f(((ApmTransferRecipient.OpenRequest) apmTransferRecipient).f62300a, null, 14);
        } else {
            if (!(apmTransferRecipient instanceof ApmTransferRecipient.Contact)) {
                throw new NoWhenBranchMatchedException();
            }
            ApmContact apmContact = ((ApmTransferRecipient.Contact) apmTransferRecipient).f62299a;
            if (apmContact instanceof BrebContact) {
                BrebContact brebContact = (BrebContact) apmContact;
                String displayName = brebContact.getDisplayName();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_transfer_review_account_details_breb_key, null, null, 14);
                TextClause textClause = new TextClause(apmContact.x0(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str = brebContact.f62125g;
                fVar = new f(displayName, textLocalisedClause, textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
            } else {
                fVar = new f(apmContact.getDisplayName(), new TextClause(apmContact.x0(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 10);
            }
        }
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("NAME_CELL_ID", new TextLocalisedClause(R$string.bre_b_send_transfer_review_account_details_name, null, null, 14), null, new TextClause(fVar.f319309a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, null, null, null, null, 0, 131060);
        Clause clause = fVar.f319310b;
        CellDetailsNoteDelegate.Model model2 = clause != null ? new CellDetailsNoteDelegate.Model("KEY_CELL_ID", clause, null, fVar.f319311c, null, false, null, null, null, null, null, 0, 131060) : null;
        Clause clause2 = fVar.d;
        CellDetailsNoteDelegate.Model[] elements = {model, model2, clause2 != null ? new CellDetailsNoteDelegate.Model("BANK_NAME_CELL_ID", new TextLocalisedClause(R$string.bre_b_send_transfer_review_account_details_bank_name, null, null, 14), null, clause2, null, false, null, null, null, null, null, 0, 131060) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        ApmProduct apmProductA = k12.b.a(apmTransferRecipient);
        TextClause countryDisplayName = new TextClause(((o8b.g) this.f319312a).a(((wi0.b) d0.b0(apmProductA.c())).f297794a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause currency = new TextClause(apmProductA.b().f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(countryDisplayName, "countryDisplayName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        List listK = v.k(new CellDetailsDelegate.Model("COUNTRY_REGION_CELL_ID", new t0((Clause) new TextLocalisedClause(R$string.bre_b_send_transfer_review_account_details_country_region, null, null, 14), (Image) null, 0, false, 30), countryDisplayName, null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("CURRENCY_CELL_ID", new t0((Clause) new TextLocalisedClause(R$string.bre_b_send_transfer_review_account_details_currency, null, null, 14), (Image) null, 0, false, 30), currency, null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        return new d(u.a(eVarB));
    }
}
