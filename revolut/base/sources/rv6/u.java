package rv6;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.b8;
import tof.cc;
import tof.i7;
import tof.q7;
import tof.xa;
import tof.y6;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends oki.h implements q {
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.h f257713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hr6.l f257714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jr6.m f257715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final whf.b f257716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q7 f257717t;
    public final q7 u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f257718w;

    public u(cli.n stateMapper, j60.a bottomDialogExtension, gr6.h freelancerCashbackInteractor, hr6.l freelancerCommandFactory, jr6.m freelancerDialogFactory, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.o = bottomDialogExtension;
        this.f257713p = freelancerCashbackInteractor;
        this.f257714q = freelancerCommandFactory;
        this.f257715r = freelancerDialogFactory;
        this.f257716s = transactionsContentProvider;
        i7.c cVar = i7.Companion;
        io3.l lVar = io3.l.MERCHANT;
        i7[] i7VarArr = {new xa(lVar), new cc(zhm.u.c(y6.REWARD)), new b8(uof.c.PLAN)};
        cVar.getClass();
        this.f257717t = i7.c.a(i7VarArr);
        this.u = i7.c.a(new xa(lVar), new cc(zhm.u.c(y6.CARD_PAYMENT)), i7.l.f272818a);
        z1 z1VarB = vkm.q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.v = z1VarB;
        this.f257718w = mra.d.b(this, new k(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(vkm.q.Q(this.v, new r3k.c(continuation, this, 15)), new ru6.r(5)), null, new rt4.o(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257718w;
    }
}
