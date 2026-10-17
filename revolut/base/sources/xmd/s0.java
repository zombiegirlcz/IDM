package xmd;

import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.impl.ui.budget.setup_budget.SetupBudgetContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends oki.h implements dli.b {
    public final SetupBudgetContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p0 f307196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f307197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f307198r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cli.y f307199s;

    public s0(SetupBudgetContract$InputData inputData, p0 setupBudgetDelegate, w80.b amountFormatter, v0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(setupBudgetDelegate, "setupBudgetDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f307196p = setupBudgetDelegate;
        this.f307197q = amountFormatter;
        this.f307198r = new vii.b();
        this.f307199s = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    public static long K2(dj0.d dVar) {
        int i;
        long jK = cp5.d.k(dVar.f115083b);
        long j2 = dVar.f115082a;
        long j3 = ((long) 10000) * jK;
        if (j2 < j3) {
            i = 100;
        } else {
            long j5 = ((long) 100000) * jK;
            if (j2 >= j5) {
                return j2 < ((long) 1000000) * jK ? j3 : j5;
            }
            i = 1000;
        }
        return ((long) i) * jK;
    }

    public final o I2() {
        return (o) ((f) ((j2) this.f307199s.f22677a).getValue()).f307168a.getContent();
    }

    public final void J2() {
        yji.l.b1(this, new knd.g0(new vkm.q0(vkm.q.Q(this.f307198r, new x18.e((Continuation) null, this, 16)), new r0(this, null, 0), 1), new r0(this, null, 1), 1), null, null, 7);
    }

    public final void L2(o oVar) {
        H2(this.f307199s, new xe7.a(oVar, 19));
    }

    @Override // yji.l
    public final void T1(long j2) {
        o oVarI2 = I2();
        if (oVarI2 == null) {
            J2();
            return;
        }
        n nVar = oVarI2.f307186b;
        if (Intrinsics.f(nVar, j.f307177a)) {
            J2();
            return;
        }
        if (nVar instanceof h) {
            return;
        }
        if (!(nVar instanceof m)) {
            throw new NoWhenBranchMatchedException();
        }
        m mVar = (m) nVar;
        dj0.d amount = mVar.a().f307160c;
        h phase = new h(mVar.a());
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(phase, "phase");
        L2(new o(amount, phase));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f307199s;
    }
}
