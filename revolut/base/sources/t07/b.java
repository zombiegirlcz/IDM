package t07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import ds6.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static TextLocalisedClause a(j taxType, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        int i = a.f266956a[taxType.ordinal()];
        if (i == 1) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297750h0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_income_es, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.f297760n0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_income_fr, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.p0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_income_gb, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.L0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_income_ie, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.T0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_income_it, null, null, 14);
            }
        } else if (i == 2) {
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297760n0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_social_security_fr, null, null, 14);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            wi0.b.Companion.getClass();
            if (Intrinsics.f(countryCode, wi0.b.f297750h0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_vat_es, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.p0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_vat_gb, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.L0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_vat_ie, null, null, 14);
            }
            if (Intrinsics.f(countryCode, wi0.b.T0)) {
                return new TextLocalisedClause(R$string.freelancer_taxes_vat_it, null, null, 14);
            }
        }
        return null;
    }
}
