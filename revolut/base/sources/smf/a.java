package smf;

import a0e.m;
import a35.k;
import a3i.i;
import amf.c;
import amf.o;
import chc.c0;
import cmf.p;
import hmf.k0;
import jt0.b;
import kkf.d0;
import kkf.e;
import kkf.i9;
import kkf.o1;
import kkf.o6;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f264442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f264443h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f264444j;
    public final o6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f264445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f264446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f264447n;
    public final i9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final alf.c f264448p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final clf.a f264449q;

    public a(h0 commonDataSource, b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, o userCommentMenuOptionProvider, c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, o6 simpleStatusBlockProvider, d0 confirmationBlockProvider, e analyticsBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, alf.c salaryBonusBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(simpleStatusBlockProvider, "simpleStatusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(salaryBonusBlockProvider, "salaryBonusBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f264442g = adjustForAnalyticsMenuOptionProvider;
        this.f264443h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f264444j = adjustForAnalyticsActionProvider;
        this.k = simpleStatusBlockProvider;
        this.f264445l = confirmationBlockProvider;
        this.f264446m = analyticsBlockProvider;
        this.f264447n = getHelpBlockProvider;
        this.o = userCommentBlockProvider;
        this.f264448p = salaryBonusBlockProvider;
        this.f264449q = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f264449q.Z2();
        p pVarA = k0.a(this.k.a(), this.f264445l.a());
        alf.c cVar = this.f264448p;
        return h(v.k(pVarZ2, pVarA, new p(new i(rd0.e.e(mo3.a.f(q.Q(yh5.b.d(cVar.f6260a.d(), cVar.f6261b.a()), new m((Continuation) null, cVar, 22)), new ah1.p(24), new a2g.m(21), new ah1.p(25)), zhm.h0.f322473a, new k(3, 9, null)), cVar, 18), new c0(23), u.c(cVar), "SalaryBonusBlockProvider"), this.f264446m.Z2(), this.o.a(), this.f264447n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.f264444j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f264443h.a(new ah1.p(29)), this.f264442g.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
