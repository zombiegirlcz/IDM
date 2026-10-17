package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BrPaymentLimitsUpdateScreenContract$InputData f304839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f304840c;
    public final e4m.e d;

    public e3(w2 w2Var, u2 u2Var, BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData) {
        this.f304838a = 1;
        this.f304840c = w2Var;
        this.f304839b = brPaymentLimitsUpdateScreenContract$InputData;
        this.d = e4m.b.b(new f3(this, 0));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f304838a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f304838a) {
        }
        return ImmutableSet.of();
    }

    public final qd0.b i() {
        switch (this.f304838a) {
            case 0:
                qd0.b bVarN = ((w2) this.f304840c).e.n();
                vc.s.j(bVarN);
                return bVarN;
            case 1:
                qd0.b bVarN2 = ((w2) this.f304840c).e.n();
                vc.s.j(bVarN2);
                return bVarN2;
            default:
                qd0.b bVarN3 = ((t) this.f304840c).f305066h.n();
                vc.s.j(bVarN3);
                return bVarN3;
        }
    }

    public e3(w2 w2Var, a3 a3Var, BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData) {
        this.f304838a = 0;
        this.f304840c = w2Var;
        this.f304839b = brPaymentLimitsUpdateScreenContract$InputData;
        this.d = e4m.b.b(new wak.d(this, 29));
    }

    public e3(t tVar, m mVar, BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData) {
        this.f304838a = 2;
        this.f304840c = tVar;
        this.f304839b = brPaymentLimitsUpdateScreenContract$InputData;
        this.d = e4m.b.b(new wak.d(this, 24));
    }
}
