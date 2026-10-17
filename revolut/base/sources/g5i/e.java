package g5i;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5i.b f140793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4i.a f140794b;

    public e(s5i.b amountDisplayer, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountDisplayer, "amountDisplayer");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f140793a = amountDisplayer;
        this.f140794b = amountConverter;
    }

    public static aim.e a(List list, RowDelegate.Model model, ej ejVar) {
        aim.e eVarB = u.b();
        yp0.b.k(list, 0, 0, 0, 0, 31);
        eVarB.addAll(list);
        if (model != null) {
            eVarB.add(model);
        }
        if (ejVar != null && !eVarB.isEmpty()) {
            int iJ = v.j(eVarB);
            n nVar = (n) eVarB.get(v.j(eVarB));
            yp0.b.c(nVar, R$attr.uikit_dp0);
            eVarB.set(iJ, nVar);
            int i = R$attr.uikit_dp0;
            yp0.b.r(ejVar, i, i, 0, 0, 12);
            eVarB.add(ejVar);
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.b(R$attr.uikit_dp24, eVarA);
        return eVarA;
    }

    public static RowDelegate.Model b() {
        RowDelegate.Model model = new RowDelegate.Model("accrued_fee_description_item", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.bank_transfer_payment_breakdown_interest_applies_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.bank_transfer_payment_breakdown_interest_applies_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final Clause c(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return this.f140793a.a(amount);
    }
}
