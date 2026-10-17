package fmf;

import com.revolut.domain.interactors.transactions.TransactionsPerformanceTracker$Scenario;
import elf.c1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import vkm.c2;
import vkm.d2;
import vkm.t0;
import vkm.u1;

/* JADX INFO: loaded from: classes8.dex */
public final class n0 extends oki.h implements f0 {

    @NotNull
    public static final h0 Companion = new h0();
    public final CoroutineScope o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hmf.h0 f136401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dmf.d f136402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rp0.l0 f136403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c1 f136404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public u1 f136405t;
    public final cli.y u;

    public n0(CoroutineScope coroutineScope, hmf.h0 screenBuilderProvider, dmf.d performanceTracker, rp0.l0 popupMenuDialogDisplayer, c1 navBarTitleClickHandler, k71.i transactionDescriptor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(screenBuilderProvider, "screenBuilderProvider");
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(navBarTitleClickHandler, "navBarTitleClickHandler");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = coroutineScope;
        this.f136401p = screenBuilderProvider;
        this.f136402q = performanceTracker;
        this.f136403r = popupMenuDialogDisplayer;
        this.f136404s = navBarTitleClickHandler;
        this.u = mra.d.b(this, new e0(transactionDescriptor, null, null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        dmf.d dVar = this.f136402q;
        ((l80.f) dVar.f116125n).getClass();
        dVar.f116127q = System.currentTimeMillis();
        boolean zD = dVar.f116124m.d(TransactionsPerformanceTracker$Scenario.DETAILS_UI);
        dVar.f116130t = zD;
        int i = 3;
        Continuation continuation = null;
        if (zD) {
            yji.n.j2(dVar, dVar.f116123l.d(), null, new d8j.c(dVar, continuation, 24), 3);
        }
        hmf.h0 h0Var = this.f136401p;
        klf.h0 h0Var2 = h0Var.f153774a;
        ghk.a0 a0Var = new ghk.a0(vkm.q.q(new ghk.a0(new t38.e(h0Var2.d(), 24, h0Var2.c(), new a0e.n(i, 6, continuation)), h0Var, 18)), h0Var, 19);
        d2.Companion.getClass();
        u1 u1VarO = vkm.q.O(a0Var, this.o, c2.f290009c, null);
        this.f136405t = u1VarO;
        yji.l.a1(this, vkm.q.Q(new t0(u1VarO, 1), new bwb.k(i, 1, continuation)), null, null, new k0(this, continuation, 0), 3);
        u1 u1Var = this.f136405t;
        if (u1Var == null) {
            Intrinsics.r("screenBuilder");
            throw null;
        }
        yji.l.a1(this, vkm.q.Q(new t0(u1Var, 1), new bwb.k(i, 2, continuation)), null, null, new k0(this, continuation, 1), 3);
        u1 u1Var2 = this.f136405t;
        if (u1Var2 == null) {
            Intrinsics.r("screenBuilder");
            throw null;
        }
        yji.l.a1(this, vkm.q.Q(new t0(u1Var2, 1), new bwb.k(i, 3, continuation)), null, null, new l0(this, null), 3);
        u1 u1Var3 = this.f136405t;
        if (u1Var3 != null) {
            yji.l.a1(this, vkm.q.Q(new t0(u1Var3, 1), new bwb.k(i, 4, continuation)), null, null, new k0(this, continuation, 2), 3);
        } else {
            Intrinsics.r("screenBuilder");
            throw null;
        }
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        l2(new j0(this, listId, obj2, null, 1), new yi5.b(26));
    }

    @Override // yji.l
    public final void O1() {
        skm.e0.n(this.o.getF74819h());
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
