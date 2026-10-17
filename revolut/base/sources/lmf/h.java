package lmf;

import amf.o;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i9;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import olf.n;
import pkf.u1;
import vkm.q;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends hmf.a {
    public final h0 e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f197021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f197022h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u1 f197023j;
    public final o1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i9 f197024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f197025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final clf.a f197026n;

    public h(h0 commonDataSource, n headerProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, d0 confirmationBlockProvider, u1 cryptoUnstakeLockupProgressBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(cryptoUnstakeLockupProgressBlockProvider, "cryptoUnstakeLockupProgressBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f197021g = userCommentMenuOptionProvider;
        this.f197022h = hideTransactionMenuOptionProvider;
        this.i = confirmationBlockProvider;
        this.f197023j = cryptoUnstakeLockupProgressBlockProvider;
        this.k = getHelpBlockProvider;
        this.f197024l = userCommentBlockProvider;
        this.f197025m = equivalentBlockProvider;
        this.f197026n = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f197026n.Z2();
        p pVarA = this.f197025m.a();
        u1 u1Var = this.f197023j;
        h0 h0Var = u1Var.f237135b;
        SharedFlow sharedFlowD = h0Var.d();
        cvd.a aVar = u1Var.f237134a;
        String transactionId = h0Var.f185494j;
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        dwd.a aVar2 = aVar.f109330a;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return h(v.k(pVarZ2, pVarA, new p(new oi3.g(yh5.b.d(sharedFlowD, boh.f.e(aVar2.e.b(transactionId, loadingStrategy), new cui.v(aVar, loadingStrategy, 9))), u1Var, 26), new pka.c(12), f0.f322471a, "UnstakingLockupProgress"), k0.a(this.i.a()), this.f197024l.a(), this.k.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        n nVar = this.f;
        return q.q(new t38.e(nVar.f226397a.A0(false), 24, nVar.f226398b.d(), new rlf.c(3, null)));
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f197021g.a(new ah1.p(29)), this.f197022h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
