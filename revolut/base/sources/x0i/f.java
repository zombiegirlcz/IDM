package x0i;

import com.revolut.core.model.account.AccountId;
import e7l.g;
import efm.d0;
import efm.r;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import wyg.s;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements p0i.a {

    @NotNull
    private static final a Companion = new a();
    public static final xi0.b f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f301639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f301640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fk3.b f301641c;
    public final xh5.a d;
    public final tj3.a e;

    static {
        xi0.b.Companion.getClass();
        f = xi0.b.i;
    }

    public f(n walletInteractor, xoj.a featuresInteractor, w0i.a exchangeProhibitedCurrenciesChecker, fk3.b configurationRepository, xh5.a cryptoFeatureEnabledInteractor, tj3.a commodityFeatureEnabledInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(exchangeProhibitedCurrenciesChecker, "exchangeProhibitedCurrenciesChecker");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        this.f301639a = walletInteractor;
        this.f301640b = featuresInteractor;
        this.f301641c = configurationRepository;
        this.d = cryptoFeatureEnabledInteractor;
        this.e = commodityFeatureEnabledInteractor;
    }

    public final d0 a(xi0.b contraryCurrency) {
        Intrinsics.checkNotNullParameter(contraryCurrency, "contraryCurrency");
        d0 d0VarFirstOrError = m70.a.g(((ik3.g) this.f301641c).a(g.b.f123407a, false), null, new s(14), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarC = d0.C(d0VarFirstOrError, ((cpj.b) this.f301640b).f(yoj.c.BRL_EXCHANGE_ALL_FIAT, yoj.d.DISABLED), this.f301639a.x(AccountId.Personal.f51414a), new wx9.b(new j31.b(contraryCurrency, this), 27));
        Intrinsics.checkNotNullExpressionValue(d0VarC, "zip(...)");
        return d0VarC;
    }

    public final ufm.i b(xi0.b contraryCurrency, wd6.c mode, Set blockedTypes) {
        Intrinsics.checkNotNullParameter(contraryCurrency, "contraryCurrency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(blockedTypes, "blockedTypes");
        ufm.i iVar = new ufm.i(a(contraryCurrency), new wx9.b(new wtl.f(this, 7, mode, blockedTypes), 28), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final d0 c(String str, xi0.b currency, AccountId accountId, io3.l pocketType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        n nVar = this.f301639a;
        return str != null ? nVar.z(accountId, str) : osg.b.r(nVar, currency, pocketType, null, accountId, 28);
    }

    public final r d(w4l.k loadingStrategy, wd6.i exchangePocketType, AccountId accountId, boolean z) {
        List listC;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(exchangePocketType, "exchangePocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = b.f301638a[exchangePocketType.ordinal()];
        if (i == 1 || i == 2) {
            if (z) {
                io3.l[] elements = {io3.l.CURRENT, io3.l.SAVINGS, io3.l.REVX_FIAT};
                Intrinsics.checkNotNullParameter(elements, "elements");
                listC = kotlin.collections.d.L(elements);
            } else {
                listC = u.c(io3.l.CURRENT);
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c(io3.l.MERCHANT);
        }
        r map = m70.a.g(osg.b.g(this.f301639a, loadingStrategy, null, null, null, null, null, accountId, 62), null, new s(15), 1).distinctUntilChanged().map(new wx9.b(new v77.a(listC, 24), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
