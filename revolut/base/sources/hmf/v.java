package hmf;

import kkf.i5;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends a {
    public final klf.h0 e;
    public final olf.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i5 f153940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o1 f153941h;
    public final y0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o2 f153942j;
    public final clf.a k;

    public v(klf.h0 commonDataSource, olf.i revPayAuthHeaderProvider, i5 revPayAuthBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(revPayAuthHeaderProvider, "revPayAuthHeaderProvider");
        Intrinsics.checkNotNullParameter(revPayAuthBlockProvider, "revPayAuthBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = revPayAuthHeaderProvider;
        this.f153940g = revPayAuthBlockProvider;
        this.f153941h = getHelpBlockProvider;
        this.i = equivalentBlockProvider;
        this.f153942j = limitExceededBlockProvider;
        this.k = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.k.Z2();
        cmf.p pVarZ22 = this.f153942j.Z2();
        cmf.p pVarA = this.i.a();
        i5 i5Var = this.f153940g;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, new cmf.p(vkm.q.Q(i5Var.f184746l.d(), new jy6.l((Continuation) null, i5Var, 29)), new kkf.i0(27), zhm.u.c(i5Var), "RevPayAuth"), this.f153941h.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return new olf.e(this.f.f226391a.A0(false), 1);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new go.g(zhm.f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return new go.g(zhm.f0.f322471a, 2);
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
