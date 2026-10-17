package xwd;

import cli.y;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.unstake.v2.a f309363b;

    public /* synthetic */ n(com.revolut.feature.staking.impl.unstake.v2.a aVar, int i) {
        this.f309362a = i;
        this.f309363b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f309362a) {
            case 0:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                com.revolut.feature.staking.impl.unstake.v2.a aVar = this.f309363b;
                ppk.f fVar = aVar.f88163q;
                y yVar = aVar.z;
                return m70.a.f(fVar.d(v.k(new Pair(((l) ((j2) yVar.f22677a).getValue()).f309356c, baseCurrency), new Pair(baseCurrency, ((l) ((j2) yVar.f22677a).getValue()).f309356c)), n9l.b.SEC_3), new x0b.h(16), new xti.k(14), new xti.k(15));
            default:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                return this.f309363b.f88169y.map(new xt1.a(19, new x5f.m(exchangeRates, 11)));
        }
    }
}
