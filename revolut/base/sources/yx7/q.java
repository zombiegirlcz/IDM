package yx7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public static TextLocalisedClause a(zw7.n documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        int i = p.f317594a[documentType.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.pets_all_documents_statement_insurance_name, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.pets_all_documents_ipid_name, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.pets_all_documents_policy_wording_name, null, null, 14);
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Not a valid policy document type: " + documentType);
    }
}
