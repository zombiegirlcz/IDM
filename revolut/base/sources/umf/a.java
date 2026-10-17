package umf;

import amf.c;
import cmf.p;
import im2.b;
import j40.d;
import kkf.c6;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import oi3.g;
import olf.k;
import olf.l;
import rd0.e;
import vkm.q;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f281307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c6 f281308h;
    public final o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f281309j;
    public final o2 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final clf.a f281310l;

    public a(h0 commonDataSource, l roboHeaderProvider, c hideTransactionMenuOptionProvider, c6 roboBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(roboHeaderProvider, "roboHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(roboBlockProvider, "roboBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = roboHeaderProvider;
        this.f281307g = hideTransactionMenuOptionProvider;
        this.f281308h = roboBlockProvider;
        this.i = getHelpBlockProvider;
        this.f281309j = equivalentBlockProvider;
        this.k = limitExceededBlockProvider;
        this.f281310l = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f281310l.Z2();
        p pVarZ22 = this.k.Z2();
        p pVarA = this.f281309j.a();
        c6 c6Var = this.f281308h;
        return h(v.k(pVarZ2, pVarZ22, pVarA, new p(e.e(new t38.e((SharedFlow) c6Var.f184623l.d.getValue(), 24, c6Var.f184624m.a(), new d(c6Var, null, 16)), zhm.h0.f322473a, new b(3, 4, null)), new k98.a(c6Var, 9), u.c(c6Var), "Robo"), this.i.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        l lVar = this.f;
        return q.q(new t38.e(lVar.f226393a.A0(false), 24, new g((SharedFlow) lVar.f226394b.d.getValue(), lVar, 9), new k(3, null)));
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f281307g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
