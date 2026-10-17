package iq4;

import aw0.n6;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.j2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_title, null, null, 14), null, null, null, false, 30);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        aim.e eVarB = u.b();
        wi0.b countryCode = domainState.f167799b;
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.l2;
        boolean z = false;
        int i = 6;
        RowDelegate.Model model = new RowDelegate.Model("id_credit_card_blocked", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_expired, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_credit_card_blocked_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_credit_card_blocked, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        RowDelegate.Model model2 = new RowDelegate.Model("id_total_amount", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_total_amount_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_total_amount, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        RowDelegate.Model model3 = new RowDelegate.Model("id_statements", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_documents_pair, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_statements, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        List listK = v.k(model, model2, model3, new RowDelegate.Model("id_account_closed", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), Intrinsics.f(countryCode, bVar) ? new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_account_closed_nz, null, null, 14) : new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_account_closed, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        List listC = u.c(new CellDetailsDelegate.Model("id_total_left", new t0((Clause) new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_skip_total_left, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(domainState.f167798a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, j2.H3, null, 0, null, false, false, null, null, 32632));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        eVarB.addAll(listC);
        return new cii.b(gVar, u.a(eVarB), aVar);
    }
}
