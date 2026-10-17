package aj6;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.t0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends oki.h implements p {

    @NotNull
    public static final t Companion = new t();
    public static final Set v;
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fi6.h f5431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r10.a f5432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe6.m f5433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xg6.b f5434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final elb.b f5435t;
    public final cli.y u;

    static {
        String[] elements = {"account_list_item_", "credit_list_item_", "savings_list_item_", "vault_list_item_", "junior_list_item_"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        v = kotlin.collections.d.y0(elements);
    }

    public x(cli.n stateMapper, l inputData, fi6.h accountsProvider, r10.a accountsExchangeRatesProvider, oe6.m openBankingInteractor, xg6.b accountSelectionAuInteractor, elb.b savingsFeatureConfigInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsProvider, "accountsProvider");
        Intrinsics.checkNotNullParameter(accountsExchangeRatesProvider, "accountsExchangeRatesProvider");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(accountSelectionAuInteractor, "accountSelectionAuInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        this.o = inputData;
        this.f5431p = accountsProvider;
        this.f5432q = accountsExchangeRatesProvider;
        this.f5433r = openBankingInteractor;
        this.f5434s = accountSelectionAuInteractor;
        this.f5435t = savingsFeatureConfigInteractor;
        Data data = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        this.u = mra.d.b(this, new i(null, data, h0Var, h0Var, null, null, r0.g(), true, h0Var, h0Var), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(new t0(this.u.B(new aik.d(3)), 1), new a0e.m(continuation, this, 15)), null, null, new af4.e(this, continuation, 14), 3);
        l2(new a01.e(this, continuation, 28), new yi5.b(26));
        l2(new w(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
