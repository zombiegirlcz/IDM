package q9a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import com.revolut.revolut.feature_fourthline_impl.R;
import g8a.o;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static TextLocalisedClause a(o oVar) {
        int i;
        BeneficiaryIdentificationType beneficiaryIdentificationType = oVar.f141327a;
        int i2 = beneficiaryIdentificationType == null ? -1 : c.f243850b[beneficiaryIdentificationType.ordinal()];
        if (i2 == -1) {
            i = R.string.common_empty;
        } else if (i2 == 1) {
            i = R$string.pix_key_document;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.pix_key_cnpj;
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
