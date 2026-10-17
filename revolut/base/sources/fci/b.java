package fci;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.purpose.model.PurposeOfAccountProductType;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f133746c = R$string.purpose_of_account_group_everyday_spending;
    public static final List d;
    public static final List e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f133747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f133748h;
    public static final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ArrayList f133749j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f133750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f133751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f133752n;
    public static final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f133753p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f133754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final List f133755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f133756s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f133757t;
    public static final int u;
    public static final List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f133758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f133759x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PurposeOfAccountScreenContract$InputData f133760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dci.b f133761b;

    static {
        cci.g gVar = cci.g.SALARY;
        cci.g gVar2 = cci.g.SPENDING;
        cci.g gVar3 = cci.g.P2P;
        cci.g gVar4 = cci.g.SUBSCRIPTIONS;
        cci.g gVar5 = cci.g.FREELANCING;
        d = zhm.v.k(gVar, gVar2, gVar3, gVar4, gVar5, cci.g.JOINT_ACCOUNT, cci.g.METAL, cci.g.CASHBACK, cci.g.BUDGETING, cci.g.LINKED_ACCOUNTS, cci.g.REWARDS, cci.g.JUNIOR, cci.g.MORTGAGE, cci.g.RENT);
        e = zhm.v.k(cci.g.DAILY_PURCHASE, cci.g.ONLINE_PURCHASE, cci.g.RECURRING_PAYMENTS);
        f = R$string.purpose_of_account_group_global_spending;
        f133747g = zhm.v.k(cci.g.REMITTANCE, cci.g.FX, cci.g.PAYMENTS, cci.g.TRAVEL_INSURANCE, cci.g.SMART_DELAY, cci.g.STAYS);
        f133748h = R$string.purpose_of_account_group_wealth;
        List listK = zhm.v.k(cci.g.VAULTS, cci.g.CREDIT_CARDS, cci.g.STOCKS, cci.g.SAVINGS, cci.g.CRYPTO, cci.g.COMMODITIES, cci.g.INVESTING);
        i = listK;
        f133749j = zhm.d0.F0(cci.g.LOANS, listK);
        k = R$string.purpose_of_account_group_security;
        f133750l = zhm.v.k(cci.g.DISPOSABLE_CARDS, cci.g.PURCHASE_PROTECTION, cci.g.VIRTUAL_CARDS);
        f133751m = R$string.purpose_of_account_group_travel_spending;
        f133752n = zhm.v.k(cci.g.SPENDING_ABROAD, cci.g.SPENDING_DOMESTIC, cci.g.ATM_WITHDRAWAL_ABROAD, cci.g.ATM_WITHDRAWAL_DOMESTIC);
        o = R$string.purpose_of_account_group_money_transfer;
        f133753p = zhm.v.k(cci.g.REMITTANCE_SELF_ABROAD, cci.g.REMITTANCE_SELF_DOMESTIC, cci.g.REMITTANCE_REV_USER, cci.g.REMITTANCE_ABROAD, cci.g.REMITTANCE_DOMESTIC, cci.g.P2P_DOMESTIC);
        f133754q = R$string.purpose_of_account_group_trading;
        f133755r = zhm.v.k(cci.g.TRADING_ABROAD, cci.g.TRADING_DOMESTIC, cci.g.TRADING_COMMODITIES);
        f133756s = R$string.purpose_of_account_group_income_and_payments;
        f133757t = zhm.v.k(cci.g.P2P_EUR, gVar, gVar5, cci.g.MANAGE_PROPERTY);
        u = R$string.purpose_of_account_group_local_recurring_payments;
        v = zhm.v.k(cci.g.UTILITIES, gVar4, cci.g.DIRECT_DEBITS);
        f133758w = R$string.purpose_of_account_group_personal_use;
        f133759x = zhm.v.k(cci.g.LIVING_ABROAD, cci.g.LOCAL_AUTHORITIES);
    }

    public b(PurposeOfAccountScreenContract$InputData inputData, dci.b purposeNameProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(purposeNameProvider, "purposeNameProvider");
        this.f133760a = inputData;
        this.f133761b = purposeNameProvider;
    }

    public static cci.h a(int i2, Set set) {
        if (set.isEmpty()) {
            return null;
        }
        return new cci.h(new TextLocalisedClause(i2, null, null, 14), zhm.d0.d1(set));
    }

    public final Clause b(PurposeOfAccountProductType purposeOfAccountProductType) {
        PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = this.f133760a;
        WorkflowScreenConfiguration workflowScreenConfiguration = purposeOfAccountScreenContract$InputData.e;
        String str = workflowScreenConfiguration != null ? workflowScreenConfiguration.f105669b : null;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.Personal.f97718a)) {
            wi0.b bVar = purposeOfAccountScreenContract$InputData.f97719a;
            wi0.b.Companion.getClass();
            return Intrinsics.f(bVar, wi0.b.p0) ? new TextLocalisedClause(R$string.purpose_of_account_uk_subtitle, null, null, 14) : new TextLocalisedClause(R$string.purpose_of_account_subtitle, null, null, 14);
        }
        if (Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.Joint.f97716a)) {
            return new TextLocalisedClause(R$string.purpose_of_account_joint_subtitle, null, null, 14);
        }
        if (Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.MultiIbanEur.f97717a)) {
            return new TextLocalisedClause(R$string.purpose_of_account_virtual_bank_account_subtitle, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f133774a, new f0d.l(this, domainState, 22), new fb.c(this, domainState, 1), new a0i.a(this, 17, domainState, domainState));
    }

    public final TextLocalisedClause d(PurposeOfAccountProductType purposeOfAccountProductType) {
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f133760a.e;
        Object textLocalisedClause = workflowScreenConfiguration != null ? workflowScreenConfiguration.f105668a : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.Joint.f97716a) ? new TextLocalisedClause(R$string.purpose_of_account_joint_title, null, null, 14) : Intrinsics.f(purposeOfAccountProductType, PurposeOfAccountProductType.MultiIbanEur.f97717a) ? new TextLocalisedClause(R$string.purpose_of_account_virtual_bank_account_title, null, null, 14) : new TextLocalisedClause(R$string.purpose_of_account_title, null, null, 14);
        }
        return new TextLocalisedClause(R$string.declaration_account_purpose_title, zhm.u.c(textLocalisedClause), null, 12);
    }
}
