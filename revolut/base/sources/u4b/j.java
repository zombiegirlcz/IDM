package u4b;

import a82.s;
import cli.n;
import cli.y;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tx0.p4;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements dli.b {
    public final CfdWithdrawScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f277299p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2b.j f277300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x4b.d f277301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d1h.e f277302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f277303t;
    public boolean u;
    public final y v;

    public j(n stateMapper, CfdWithdrawScreenContract$InputData inputData, w80.b amountFormatter, p2b.j cfdShareablePerformanceInteractor, x4b.d validateWithdrawAmount, d1h.e wealthRemoteDisclaimersExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(cfdShareablePerformanceInteractor, "cfdShareablePerformanceInteractor");
        Intrinsics.checkNotNullParameter(validateWithdrawAmount, "validateWithdrawAmount");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersExtension, "wealthRemoteDisclaimersExtension");
        this.o = inputData;
        this.f277299p = amountFormatter;
        this.f277300q = cfdShareablePerformanceInteractor;
        this.f277301r = validateWithdrawAmount;
        this.f277302s = wealthRemoteDisclaimersExtension;
        j2 j2VarC = q.c(0L);
        this.f277303t = j2VarC;
        this.v = mra.d.b(this, new e(((Number) j2VarC.getValue()).longValue(), 61), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ((gah.e) this.f277302s).Z2(u.c(rdh.b.CFD_WITHDRAWAL)), null, null, new h(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.u) {
            y yVar = this.v;
            if (!((e) ((j2) yVar.f22677a).getValue()).e) {
                H2(yVar, new u3a.g(27));
            }
        }
        this.u = true;
        Continuation continuation = null;
        s sVar = new s(this, continuation, 13);
        j2 j2Var = this.f277303t;
        l.b1(this, j2Var, null, sVar, 3);
        CfdWithdrawScreenContract$InputData cfdWithdrawScreenContract$InputData = this.o;
        akg.n nVarV = nim.a.v(p2b.j.b(this.f277300q, cfdWithdrawScreenContract$InputData.f82283a, cfdWithdrawScreenContract$InputData.f82284b, 4), new p4(this, 24));
        l.b1(this, nVarV, null, new h(this, continuation, 1), 3);
        l.b1(this, new tse.c(yh5.b.d(j2Var, nVarV), this, 10), null, new h(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
