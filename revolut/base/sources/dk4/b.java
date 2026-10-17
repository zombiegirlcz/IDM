package dk4;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationFromStyle;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.i;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements vj4.b {
    public static CompositeClause a(TextLocalisedClause textLocalisedClause, xi0.b bVar) {
        return new CompositeClause(v.k(textLocalisedClause, new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4)), new DotDividerClause((Integer) null), null, null, 12);
    }

    public final i b(RepresentationFromStyle representationFromStyle) {
        RepresentationFromStyle representationStyle = representationFromStyle;
        Intrinsics.checkNotNullParameter(representationStyle, "representationStyle");
        if (representationStyle instanceof RepresentationFromStyle.RevolutWallet) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_card_auto_pay_management_source, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_card_auto_pay_source_personal, null, null, 14);
            xi0.a aVar = xi0.b.Companion;
            RepresentationFromStyle.RevolutWallet revolutWallet = (RepresentationFromStyle.RevolutWallet) representationStyle;
            String str = revolutWallet.f68571a;
            aVar.getClass();
            CompositeClause compositeClauseA = a(textLocalisedClause2, xi0.a.a(str));
            CurrencyImage currencyImage = new CurrencyImage(str, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            boolean z = revolutWallet.f68572b;
            if (!z) {
                representationStyle = null;
            }
            return new CellDetailsActionDelegate.Model("id_from", textLocalisedClause, 0, currencyImage, compositeClauseA, null, false, z, null, null, (RepresentationFromStyle.RevolutWallet) representationStyle, 0, 0, 0, 0, 4192100);
        }
        if (!(representationStyle instanceof RepresentationFromStyle.JointAccount)) {
            if (representationStyle instanceof RepresentationFromStyle.ExternalAccount) {
                return new CellDetailsDelegate.Model("id_from", new TextLocalisedClause(R$string.credit_card_auto_pay_management_source, null, null, 14), ((RepresentationFromStyle.ExternalAccount) representationStyle).f68567a, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            }
            throw new NoWhenBranchMatchedException();
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_card_auto_pay_management_source, null, null, 14);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.credit_card_auto_pay_source_joint, null, null, 14);
        RepresentationFromStyle.JointAccount jointAccount = (RepresentationFromStyle.JointAccount) representationStyle;
        xi0.b bVar = jointAccount.f68570b;
        CompositeClause compositeClauseA2 = a(textLocalisedClause4, bVar);
        CurrencyImage currencyImage2 = new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
        boolean z3 = jointAccount.f68569a;
        if (!z3) {
            representationStyle = null;
        }
        return new CellDetailsActionDelegate.Model("id_from", textLocalisedClause3, 0, currencyImage2, compositeClauseA2, null, false, z3, null, null, (RepresentationFromStyle.JointAccount) representationStyle, 0, 0, 0, 0, 4192100);
    }
}
