package jmf;

import amf.o;
import cmf.p;
import go.g;
import kkf.i9;
import kkf.m5;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nk4.d;
import nkf.f;
import pkg.e;
import plf.c;
import vkm.q;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f176616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f176617h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nkf.c f176618j;
    public final i9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f176619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f176620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o2 f176621n;
    public final clf.a o;

    public a(h0 commonDataSource, c headerProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, f collectionExchangeStatusBlockProvider, nkf.c collectionExchangeLinkedTransactionsBlockProvider, i9 userCommentBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(collectionExchangeStatusBlockProvider, "collectionExchangeStatusBlockProvider");
        Intrinsics.checkNotNullParameter(collectionExchangeLinkedTransactionsBlockProvider, "collectionExchangeLinkedTransactionsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = headerProvider;
        this.f176616g = userCommentMenuOptionProvider;
        this.f176617h = hideTransactionMenuOptionProvider;
        this.i = collectionExchangeStatusBlockProvider;
        this.f176618j = collectionExchangeLinkedTransactionsBlockProvider;
        this.k = userCommentBlockProvider;
        this.f176619l = getHelpBlockProvider;
        this.f176620m = equivalentBlockProvider;
        this.f176621n = limitExceededBlockProvider;
        this.o = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.o.Z2();
        p pVarZ22 = this.f176621n.Z2();
        p pVarA = this.f176620m.a();
        f fVar = this.i;
        p pVar = new p(new n1g.p(fVar.f216806l.d(), fVar, 19), new d(16), f0.f322471a, "CollectionExchangeStatus");
        nkf.c cVar = this.f176618j;
        klf.p pVar2 = cVar.f216802l;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVar, new p(new n1g.p(q.Q(pVar2.f185550a.d(), new m5(null, pVar2, 14)), cVar, 18), new d(15), u.c(cVar.f216804n), "CollectionExchangeLinkedTransactions"), this.k.a(), this.f176619l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        c cVar = this.f;
        return q.q(new e(cVar.f237371a.d(), cVar, 1));
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f176616g.a(new ah1.p(29)), this.f176617h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
