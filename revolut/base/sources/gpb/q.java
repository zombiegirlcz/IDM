package gpb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f145428a;

    public q(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f145428a = savingsInterestRateFormatter;
    }

    public static final void a(SavingsProductData savingsProductData, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.s("Tax and fees items can't be created product with id ", savingsProductData.f86683a.f86617a, " has ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f145416a, new gn.a(this, 17), new gp3.n(4), new gna.i(this, 4));
    }
}
