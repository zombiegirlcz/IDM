package bd6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.entity.provider.models.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import md6.d;
import md6.e;
import md6.f;
import md6.k;
import md6.l;
import md6.m;
import md6.n;
import md6.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static Clause a(e accountType, o accountCurrency, d accountState, f balanceType, cd6.b configuration) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountCurrency, "accountCurrency");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (balanceType == f.AGGREGATED) {
            return ld6.b.REVOLUT_LTD.a();
        }
        ld6.b bVarB = b(accountType, accountCurrency, accountState, balanceType, configuration);
        if (bVarB == null) {
            return null;
        }
        switch (a.f14532b[accountType.ordinal()]) {
            case 1:
            case 2:
                int i = a.f14531a[accountState.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_offered_by, u.c(bVarB.c()), null, 12);
                    }
                    if (d(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_fcy_promoted_by, u.c(c(bVarB)), null, 12);
                    }
                    List listK = v.k(new TextLocalisedClause(R$string.legal_product_account_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_account_fcy_promoted_by, u.c(c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE)), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (e(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (d(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_fcy_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (accountType == e.CURRENCY) {
                    List listK2 = v.k(new TextLocalisedClause(R$string.legal_product_account_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_account_fcy_offered_by, u.c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE.c()), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                throw new IllegalArgumentException("Unsupported combination for legal disclaimer: " + accountType + ", " + accountCurrency + ", " + accountState + ", " + balanceType);
            case 3:
                int i2 = a.f14531a[accountState.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_joint_offered_by, u.c(bVarB.c()), null, 12);
                    }
                    if (d(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_joint_fcy_promoted_by, u.c(c(bVarB)), null, 12);
                    }
                    List listK3 = v.k(new TextLocalisedClause(R$string.legal_product_account_joint_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_account_joint_fcy_promoted_by, u.c(c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE)), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (e(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_joint_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (d(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_joint_fcy_offered_by, u.c(bVarB.c()), null, 12);
                }
                throw new IllegalArgumentException("Unsupported combination for legal disclaimer: " + accountType + ", " + accountCurrency + ", " + accountState + ", " + balanceType);
            case 4:
                int i3 = a.f14531a[accountState.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_pocket_joint_offered_by, u.c(bVarB.c()), null, 12);
                    }
                    if (d(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_pocket_joint_fcy_promoted_by, u.c(c(bVarB)), null, 12);
                    }
                    List listK4 = v.k(new TextLocalisedClause(R$string.legal_product_pocket_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_pocket_joint_fcy_promoted_by, u.c(c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE)), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK4, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (e(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_pocket_joint_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (d(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_pocket_joint_fcy_offered_by, u.c(bVarB.c()), null, 12);
                }
                throw new IllegalArgumentException("Unsupported combination for legal disclaimer: " + accountType + ", " + accountCurrency + ", " + accountState + ", " + balanceType);
            case 5:
                int i5 = a.f14531a[accountState.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_pro_offered_by, u.c(bVarB.c()), null, 12);
                    }
                    if (d(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_account_pro_fcy_promoted_by, u.c(c(bVarB)), null, 12);
                    }
                    List listK5 = v.k(new TextLocalisedClause(R$string.legal_product_account_pro_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_account_pro_fcy_promoted_by, u.c(c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE)), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK5, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (e(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_pro_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (d(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_account_fcy_offered_by, u.c(bVarB.c()), null, 12);
                }
                throw new IllegalArgumentException("Unsupported combination for legal disclaimer: " + accountType + ", " + accountCurrency + ", " + accountState + ", " + balanceType);
            case 6:
                int i6 = a.f14531a[accountState.ordinal()];
                if (i6 != 1 && i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return new TextLocalisedClause(R$string.legal_product_savings_ias_offered_by, u.c(bVarB.c()), null, 12);
            case 7:
                int i21 = a.f14531a[accountState.ordinal()];
                if (i21 == 1) {
                    return new TextLocalisedClause(R$string.legal_product_savings_fcf_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (i21 == 2) {
                    return new TextLocalisedClause(R$string.legal_product_savings_fcf_promoted_by, u.c(c(bVarB)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                int i22 = a.f14531a[accountState.ordinal()];
                if (i22 == 1) {
                    List listK6 = v.k(new TextLocalisedClause(R$string.legal_product_savings_ias_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_savings_fcf_offered_by, u.c(ld6.b.REVOLUT_SECURITIES_SINGAPORE.c()), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK6, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (i22 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List listK7 = v.k(new TextLocalisedClause(R$string.legal_product_savings_ias_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_savings_fcf_promoted_by, u.c(c(ld6.b.REVOLUT_SECURITIES_SINGAPORE)), null, 12));
                m70.a.t(t0.f186434a);
                return new CompositeClause(listK7, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            case 9:
                return new TextLocalisedClause(R$string.legal_product_savings_joint_offered_by, u.c(bVarB.c()), null, 12);
            case 10:
            case 11:
            case 12:
                return new TextLocalisedClause(R$string.legal_product_account_youth_offered_by, u.c(bVarB.c()), null, 12);
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                int i32 = a.f14531a[accountState.ordinal()];
                if (i32 != 1) {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (e(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_pocket_offered_by, u.c(bVarB.c()), null, 12);
                    }
                    if (d(accountCurrency, configuration)) {
                        return new TextLocalisedClause(R$string.legal_product_pocket_fcy_promoted_by, u.c(c(bVarB)), null, 12);
                    }
                    List listK8 = v.k(new TextLocalisedClause(R$string.legal_product_pocket_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_pocket_fcy_promoted_by, u.c(c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE)), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK8, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                if (e(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_pocket_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (d(accountCurrency, configuration)) {
                    return new TextLocalisedClause(R$string.legal_product_pocket_fcy_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (accountType == e.PERSONAL_SUBACCOUNT) {
                    List listK9 = v.k(new TextLocalisedClause(R$string.legal_product_pocket_offered_by, u.c(ld6.b.REVOLUT_BANK_COLOMBIA.c()), null, 12), new TextLocalisedClause(R$string.legal_product_pocket_fcy_offered_by, u.c(ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE.c()), null, 12));
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(listK9, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                }
                throw new IllegalArgumentException("Unsupported combination for legal disclaimer: " + accountType + ", " + accountCurrency + ", " + accountState + ", " + balanceType);
            case 19:
                int i33 = a.f14531a[accountState.ordinal()];
                if (i33 == 1) {
                    return new TextLocalisedClause(R$string.legal_product_credit_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (i33 == 2) {
                    return new TextLocalisedClause(R$string.legal_product_credit_promoted_by, u.c(c(bVarB)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
            case 21:
                int i43 = a.f14531a[accountState.ordinal()];
                if (i43 == 1) {
                    return new TextLocalisedClause(R$string.legal_product_invest_offered_by, u.c(bVarB.c()), null, 12);
                }
                if (i43 == 2) {
                    return new TextLocalisedClause(R$string.legal_product_invest_promoted_by, u.c(c(bVarB)), null, 12);
                }
                throw new NoWhenBranchMatchedException();
            case 22:
            case 23:
                return new TextLocalisedClause(R$string.legal_product_crypto_offered_by, u.c(bVarB.c()), null, 12);
            default:
                return bVarB.b();
        }
    }

    public static ld6.b b(e accountType, o accountCurrency, d accountState, f balanceType, cd6.b configuration) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountCurrency, "accountCurrency");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if ((accountCurrency instanceof m) && accountState == d.DISCOVERY) {
            switch (a.f14532b[accountType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 9:
                case 10:
                case 12:
                case 13:
                case 15:
                case 16:
                    return ld6.b.REVOLUT_LTD;
                case 6:
                case 7:
                case 8:
                    return g(accountType);
                case 11:
                case 14:
                case 17:
                case 18:
                case 21:
                default:
                    return null;
                case 19:
                    return ld6.b.REVOLUT_BANK_COLOMBIA;
                case 20:
                    return ld6.b.REVOLUT_SECURITIES_SINGAPORE;
                case 22:
                case 23:
                    return ld6.b.REVOLUT_GLOBAL_DIGITAL_ASSETS;
            }
        }
        return f(accountType, accountCurrency, balanceType, configuration);
    }

    public static Clause c(ld6.b bVar) {
        int i = a.f14533c[bVar.ordinal()];
        return (i == 1 || i == 2) ? new TextLocalisedClause(R$string.legal_entity_representative_office_of, u.c(bVar.c()), null, 12) : bVar.c();
    }

    public static boolean d(o oVar, cd6.b bVar) {
        if (oVar instanceof k) {
            return true;
        }
        return (oVar instanceof n) && !Intrinsics.f(((n) oVar).f204494a, bVar.f23195a);
    }

    public static boolean e(o oVar, cd6.b bVar) {
        if (oVar instanceof l) {
            return true;
        }
        return (oVar instanceof n) && Intrinsics.f(((n) oVar).f204494a, bVar.f23195a);
    }

    public static ld6.b f(e eVar, o oVar, f fVar, cd6.b bVar) {
        switch (a.f14532b[eVar.ordinal()]) {
            case 1:
            case 13:
                return fVar == f.AGGREGATED ? ld6.b.REVOLUT_LTD : e(oVar, bVar) ? ld6.b.REVOLUT_BANK_COLOMBIA : d(oVar, bVar) ? ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE : ld6.b.REVOLUT_LTD;
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 24:
                if (fVar == f.AGGREGATED) {
                    return ld6.b.REVOLUT_LTD;
                }
                if (e(oVar, bVar)) {
                    return ld6.b.REVOLUT_BANK_COLOMBIA;
                }
                if (d(oVar, bVar)) {
                    return ld6.b.REVOLUT_TECHNOLOGIES_SINGAPORE;
                }
                throw new IllegalArgumentException("Opened account must have currency specified, current value = " + oVar);
            case 6:
            case 7:
            case 8:
                return g(eVar);
            case 9:
            case 12:
            case 25:
                if (fVar == f.AGGREGATED) {
                    return ld6.b.REVOLUT_LTD;
                }
                if (e(oVar, bVar)) {
                    return ld6.b.REVOLUT_BANK_COLOMBIA;
                }
                if (d(oVar, bVar)) {
                    return ld6.b.REVOLUT_SECURITIES_SINGAPORE;
                }
                throw new IllegalArgumentException("Opened account must have currency specified, current value = " + oVar);
            case 19:
                return ld6.b.REVOLUT_BANK_COLOMBIA;
            case 20:
            case 21:
                return ld6.b.REVOLUT_SECURITIES_SINGAPORE;
            case 22:
            case 23:
                return ld6.b.REVOLUT_GLOBAL_DIGITAL_ASSETS;
            case 26:
            case 27:
            case 28:
            case 29:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ld6.b g(e eVar) {
        int i = a.f14532b[eVar.ordinal()];
        return i != 6 ? i != 7 ? i != 8 ? ld6.b.REVOLUT_LTD : ld6.b.REVOLUT_LTD : ld6.b.REVOLUT_SECURITIES_SINGAPORE : ld6.b.REVOLUT_BANK_COLOMBIA;
    }
}
