package fpb;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.savings.api.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import mx0.v5;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(2);
        s0Var.a(new PlainTextDelegate.Model("PLAIN_TEXT_DELEGATE_HOLDINGS_BREAKDOWN_LIST_ID", (Clause) null, (Clause) new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_explanation, null, null, 14), (v5) null, (UrlImage) null, false, pa.LIGHT, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65006));
        List listK = v.k(new ListCellDelegate.Model("LIST_CELL_BANK_LIST_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_bank_deposits_title, null, null, 14), new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_bank_deposits_explanation, null, null, 14), false, null, null, 0, 0, 0, 0, 4064), new ListCellDelegate.Model("LIST_CELL_BONDS_LIST_ID", new j8(new ResourceImage(R$drawable.uikit_icn_24_balance_sheet, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_bonds_title, null, null, 14), new TextLocalisedClause(R$string.vaults_mmf_information_fund_information_funds_holdings_breakdown_bonds_explanation, null, null, 14), false, null, null, 0, 0, 0, 0, 4064));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        s0Var.b(listK.toArray(new ListCellDelegate.Model[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new d(v.k(arrayList.toArray(new Object[arrayList.size()])));
    }
}
