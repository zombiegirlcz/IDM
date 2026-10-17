package lmf;

import ah1.p;
import amf.o;
import hmf.k0;
import kkf.d0;
import kkf.i9;
import kkf.k7;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import olf.n;
import vkm.q;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends hmf.a {
    public final h0 e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f197015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f197016h;
    public final d0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k7 f197017j;
    public final o1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i9 f197018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f197019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o2 f197020n;
    public final clf.a o;

    public g(h0 commonDataSource, n headerProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, d0 confirmationBlockProvider, k7 statusBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f197015g = userCommentMenuOptionProvider;
        this.f197016h = hideTransactionMenuOptionProvider;
        this.i = confirmationBlockProvider;
        this.f197017j = statusBlockProvider;
        this.k = getHelpBlockProvider;
        this.f197018l = userCommentBlockProvider;
        this.f197019m = equivalentBlockProvider;
        this.f197020n = limitExceededBlockProvider;
        this.o = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(v.k(this.o.Z2(), this.f197020n.Z2(), this.f197019m.a(), k0.a(this.f197017j.a(), this.i.a()), this.f197018l.a(), this.k.a()));
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
        return g(v.k(this.f197015g.a(new p(29)), this.f197016h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
