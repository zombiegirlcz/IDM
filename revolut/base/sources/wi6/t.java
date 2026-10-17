package wi6;

import aj6.u;
import cli.y;
import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wgb.v;
import zhm.a1;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends oki.h implements dli.b {

    @NotNull
    public static final r Companion = new r();
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fi6.h f297829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r10.a f297830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oe6.m f297831r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xg6.d f297832s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f297833t;

    public t(cli.n stateMapper, i inputData, fi6.h accountsProvider, r10.a accountsExchangeRatesProvider, oe6.m openBankingInteractor, xg6.d consentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsProvider, "accountsProvider");
        Intrinsics.checkNotNullParameter(accountsExchangeRatesProvider, "accountsExchangeRatesProvider");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(consentInteractor, "consentInteractor");
        this.o = inputData;
        this.f297829p = accountsProvider;
        this.f297830q = accountsExchangeRatesProvider;
        this.f297831r = openBankingInteractor;
        this.f297832s = consentInteractor;
        Data data = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        this.f297833t = mra.d.b(this, new h(null, data, h0Var, h0Var, h0Var, h0Var, null, r0.g(), h0Var, h0Var, h0Var, h0Var), stateMapper, null, false, 12);
    }

    public static LinkedHashSet I2(String str, Set set) {
        return set.contains(str) ? a1.j(set, str) : a1.m(set, str);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.e(vkm.q.H(new v(this, continuation, 6), rd0.e.b(this.f297829p.d(null, null, false, false))), h0.f322473a, new u(3, 6, null)), null, null, new w50.g(this, continuation, 25), 3);
        l2(new s(this, continuation, 0), new yi5.b(26));
        l2(new s(this, continuation, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f297833t;
    }
}
