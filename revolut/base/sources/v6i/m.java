package v6i;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_move_money.impl.amount.order_settings.OrderSettingsScreenContract$InputData;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tb4.t;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends oki.h implements dli.b {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f286403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f286404q;

    public m(t interactor, t1 rateNaviProvider, n stateMapper, OrderSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(rateNaviProvider, "rateNaviProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = interactor;
        this.f286403p = rateNaviProvider;
        k kVar = inputData.f97306b;
        String str = inputData.e;
        Data data = new Data(null, null, true, 3, null);
        this.f286404q = mra.d.b(this, new f(str, kVar, inputData.f97305a, inputData.f97307c, inputData.d, data), stateMapper, null, false, 12);
    }

    public final f I2() {
        return (f) ((j2) this.f286404q.f22677a).getValue();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow flowB = this.f286404q.B(new v6e.d(6));
        xi0.b baseCurrency = I2().d;
        xi0.b counterCurrency = I2().e;
        g mode = I2().f286395c;
        t tVar = this.o;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(mode, "mode");
        yji.l.b1(this, nim.a.v(u0.m(flowB, rd0.e.b(nim.a.w(((ppk.f) tVar.f269456b).c(v1.c.w(baseCurrency, counterCurrency), n9l.b.SEC_3), new w3c.n(mode, 10)))), new v25.k(this, 14)), null, new v44.e(this, null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f286404q;
    }
}
