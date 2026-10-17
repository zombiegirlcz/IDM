package ael;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 implements ybl.i {

    @NotNull
    public static final f0 Companion = new f0();
    public static final Set e;
    public static final Set f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.k f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4f.s f3619c;
    public final vbl.b d;

    static {
        cfl.v[] elements = {cfl.v.AVAILABLE, cfl.v.ONBOARDING, cfl.v.ACTIVE, cfl.v.REMEDIATION_REQUIRED, cfl.v.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
        cfl.b[] elements2 = {cfl.b.CREATED, cfl.b.ONBOARDING, cfl.b.ACTIVE, cfl.b.SUSPENDED, cfl.b.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f = kotlin.collections.d.y0(elements2);
    }

    public h0(ybl.k tradingAccountsInteractor, Map productsProviders, d4f.s wealthFeaturesInteractor, vbl.b wealthFeatureToggleProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(wealthFeaturesInteractor, "wealthFeaturesInteractor");
        Intrinsics.checkNotNullParameter(wealthFeatureToggleProvider, "wealthFeatureToggleProvider");
        this.f3617a = tradingAccountsInteractor;
        this.f3618b = productsProviders;
        this.f3619c = wealthFeaturesInteractor;
        this.d = wealthFeatureToggleProvider;
    }

    public static boolean a(List list, Set set) {
        List<TradingProduct> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (TradingProduct tradingProduct : list2) {
            if (set.contains(tradingProduct.f105281b)) {
                if (e.contains(tradingProduct.f105282c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final akg.n b(cfl.p accountProductGroup) {
        Intrinsics.checkNotNullParameter(accountProductGroup, "accountProductGroup");
        return nim.a.v(c(new cfl.p[]{accountProductGroup}), new a7b.r(accountProductGroup, this));
    }

    public final Flow c(cfl.p[] pVarArr) {
        ybl.p[] elements = {ybl.p.TRADING, ybl.p.BONDS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return xam.a.h(new a26.q(this, pVarArr, (Continuation) null, 10), vkm.q.q(this.f3619c.a(kotlin.collections.d.y0(elements))));
    }

    public final akg.n d() {
        return nim.a.v(c(cfl.p.values()), new aed.a(18));
    }
}
