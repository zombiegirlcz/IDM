package a9j;

import e7l.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tfm.n4;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f2676j;
    public static final List k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f2677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f2678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f61.a f2679c;
    public final l61.a d;
    public final ppk.f e;
    public final whf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a8j.a f2680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l80.e f2681h;
    public final xv5.c i;

    static {
        io3.l lVar = io3.l.CURRENT;
        f2676j = zhm.v.k(lVar, io3.l.SAVINGS);
        k = zhm.u.c(lVar);
    }

    public g(fk3.a configurationInteractor, wsg.n walletInteractor, f61.a plotInteractor, l61.a userCompanyInteractor, ppk.f ratesInteractor, whf.b transactionsListContentProvider, a8j.a chartState, l80.e dateProvider, xv5.c baseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(plotInteractor, "plotInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(transactionsListContentProvider, "transactionsListContentProvider");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        this.f2677a = configurationInteractor;
        this.f2678b = walletInteractor;
        this.f2679c = plotInteractor;
        this.d = userCompanyInteractor;
        this.e = ratesInteractor;
        this.f = transactionsListContentProvider;
        this.f2680g = chartState;
        this.f2681h = dateProvider;
        this.i = baseCurrencyInteractor;
    }

    public final efm.r a() {
        return this.i.a();
    }

    public final efm.r b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        efm.r map = m70.a.g(((ik3.c) this.f2677a).l(g.b.f123407a, w4l.h.f294642c), null, null, 3).map(new a6b.a(new a94.q(1, currency), 25));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r c(Pair currencyPair, qta.f duration) {
        Intrinsics.checkNotNullParameter(currencyPair, "ccPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        vpk.p pVar = (vpk.p) this.f2679c.f132372b;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        vpk.g gVar = new vpk.g(currencyPair, duration, vpk.f.MID_CANDLE, null, null, false, 48);
        return nim.a.w(rd0.e.c(qe0.o.a(pVar.f291255m, gVar, 10L, null, pVar.e(gVar), null, 20), kotlin.coroutines.g.f186406a), new a9h.b(3));
    }

    public final n4 d() {
        n4 n4VarE = pd.b.r(a(), new b(this, 1)).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        return n4VarE;
    }

    public final void e() {
        a8j.a aVar = this.f2680g;
        j2 j2Var = aVar.f2265a;
        j2 j2Var2 = aVar.f2265a;
        int i = d.f2671a[((a8j.b) j2Var.getValue()).ordinal()];
        if (i == 1) {
            a8j.b type = a8j.b.CANDLE;
            Intrinsics.checkNotNullParameter(type, "type");
            j2Var2.setValue(type);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a8j.b type2 = a8j.b.LINE;
            Intrinsics.checkNotNullParameter(type2, "type");
            j2Var2.setValue(type2);
        }
    }
}
