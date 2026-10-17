package tmf;

import ah1.p;
import amf.o;
import go.g;
import hmf.k0;
import kkf.e;
import kkf.i9;
import kkf.k7;
import kkf.o1;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f272192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f272193h;
    public final k7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i9 f272194j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f272195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f272196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final clf.a f272197n;

    public b(h0 commonDataSource, jt0.b commonHeaderProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, i9 userCommentBlockProvider, e analyticsBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f272192g = userCommentMenuOptionProvider;
        this.f272193h = hideTransactionMenuOptionProvider;
        this.i = statusBlockProvider;
        this.f272194j = userCommentBlockProvider;
        this.k = analyticsBlockProvider;
        this.f272195l = getHelpBlockProvider;
        this.f272196m = equivalentBlockProvider;
        this.f272197n = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(v.k(this.f272197n.Z2(), this.f272196m.a(), k0.a(this.i.a()), this.k.Z2(), this.f272194j.a(), this.f272195l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f272192g.a(new p(29)), this.f272193h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
