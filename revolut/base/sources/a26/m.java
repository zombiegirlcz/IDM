package a26;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.defi.accounts.impl.R$string;
import ip0.ej;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import mx0.d7;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv5.a f684a;

    public m(iv5.a splitAccountsGroupsMapper) {
        Intrinsics.checkNotNullParameter(splitAccountsGroupsMapper, "splitAccountsGroupsMapper");
        this.f684a = splitAccountsGroupsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.addAll(this.f684a.b(domainState.f670a));
        eVarB.addAll(domainState.f671b);
        eVarB.add(new ej("DeFiPortfolioScreen_Footer", new c7(new TextLocalisedClause(R$string.defi_portfolio_footer, v.k(new TextLocalisedClause(R$string.defi_portfolio_footer_revolut_global_digital_assets, null, null, 14), new TextLocalisedClause(R$string.defi_portfolio_footer_wallet_terms, null, new Click(30, (Integer) null, (Object) null, "DeFiPortfolioScreen_Footer_WalletTerms", false), 10)), null, 12), false, d7.DISCLAIMER, 2)));
        return new e(u.a(eVarB));
    }
}
