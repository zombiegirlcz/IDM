package uxd;

import aw0.k7;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.standingordertopup.api.domain.AutoTopUpPaymentDetails;
import com.revolut.feature.standingordertopup.impl.R$string;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f283984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoTopUpPaymentDetailsScreenContract$InputData f283985b;

    public g(je6.h externalInstitutionLogoMapper, AutoTopUpPaymentDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(externalInstitutionLogoMapper, "externalInstitutionLogoMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f283984a = externalInstitutionLogoMapper;
        this.f283985b = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AutoTopUpPaymentDetailsScreenContract$InputData autoTopUpPaymentDetailsScreenContract$InputData = this.f283985b;
        AutoTopUpPaymentDetails autoTopUpPaymentDetails = autoTopUpPaymentDetailsScreenContract$InputData.f88206a;
        aim.e eVarB = u.b();
        List listK = v.k(new CellDetailsDelegate.Model("LIST_ID_MONEY", new TextLocalisedClause(R$string.auto_topup_details_item_add_title, null, null, 14), new MoneyClause(autoTopUpPaymentDetails.f88172b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("LIST_ID_THRESHOLD", new TextLocalisedClause(R$string.auto_topup_details_item_balance_title, null, null, 14), new MoneyClause(autoTopUpPaymentDetails.f88171a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIST_ID_FROM", new TextLocalisedClause(R$string.auto_topup_details_item_payment_from_title, null, null, 14), new TextClause(autoTopUpPaymentDetails.f88173c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("LIST_ID_HELP", new TextLocalisedClause(R$string.auto_topup_details_action_help_title, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model2);
        aim.e eVarA = u.a(eVarB);
        AutoTopUpPaymentDetails autoTopUpPaymentDetails2 = autoTopUpPaymentDetailsScreenContract$InputData.f88206a;
        return new e(eVarA, new c(new MoneyClause(autoTopUpPaymentDetails2.f88172b, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), null, null, 12), new TextLocalisedClause(R$string.auto_topup_details_header_caption, null, null, 14), ((di6.a) this.f283984a).b(autoTopUpPaymentDetails2.d)));
    }
}
