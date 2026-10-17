package qc0;

import android.os.Bundle;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import java.util.Map;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 extends iri.a implements k, com.revolut.feature.chooser.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f244426q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.chooser.e f244427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc0.c f244428c;
    public final te0.j d;
    public final te0.m e;
    public final te0.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.core.backend_flow.ui.a f244429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.r f244430h;
    public final te0.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.r f244431j;
    public final te0.r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.m f244432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f244433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.n f244434n;
    public final te0.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Sequence f244435p;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(g1.class, "locale", "getLocale()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f244426q = new KProperty[]{p0Var.j(h0Var), p.a.y(g1.class, "stepsStack", "getStepsStack()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g1.class, "startScreenNavigationIcon", "getStartScreenNavigationIcon()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g1.class, "exitDialog", "getExitDialog()Lcom/revolut/core/data/state/StateField;", 0, p0Var), p.a.y(g1.class, "extraParams", "getExtraParams()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public g1(com.revolut.feature.chooser.e chooserState, tc0.c entitiesListState, onh.b backendFlowSnapshotsBundleFieldFactory) {
        Intrinsics.checkNotNullParameter(chooserState, "chooserState");
        Intrinsics.checkNotNullParameter(entitiesListState, "entitiesListState");
        Intrinsics.checkNotNullParameter(backendFlowSnapshotsBundleFieldFactory, "backendFlowSnapshotsBundleFieldFactory");
        this.f244427b = chooserState;
        this.f244428c = entitiesListState;
        this.d = new te0.j();
        te0.m mVar = new te0.m("backendFlow", new pv7.t(22));
        this.e = mVar;
        Stack stack = new Stack();
        Intrinsics.checkNotNullParameter(stack, "default");
        this.f = new te0.p(stack);
        qb5.a mapper = new qb5.a(17);
        Intrinsics.checkNotNullParameter("backendFlowSnapshots", "key");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        com.revolut.core.backend_flow.ui.a aVar = new com.revolut.core.backend_flow.ui.a(new qa9.r(mapper, 12), (BackendFlowSnapshotsCompressor) backendFlowSnapshotsBundleFieldFactory.f226950b);
        this.f244429g = aVar;
        this.f244430h = new te0.r("");
        this.i = new te0.r("");
        this.f244431j = new te0.r("");
        this.k = new te0.r("");
        od0.i.Companion.getClass();
        te0.m mVar2 = new te0.m("analyticsProduct", od0.i.f224256b);
        this.f244432l = mVar2;
        BackendFlowNavigationIcon.BackArrow backArrow = BackendFlowNavigationIcon.BackArrow.f63285a;
        Intrinsics.checkNotNullParameter(backArrow, "default");
        this.f244433m = new te0.j(backArrow);
        this.f244434n = new te0.n();
        Map mapG = zhm.r0.g();
        Intrinsics.checkNotNullParameter(mapG, "default");
        this.o = new te0.j(mapG);
        te0.e[] elements = {getLocale(), r0(), mVar, aVar, mVar2, G(), h()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f244435p = kotlin.collections.d.E(elements);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        this.f244427b.D(bundle);
        this.f244428c.D(bundle);
    }

    @Override // qc0.k
    public final te0.v P() {
        return this.f244432l;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f244427b.a0();
    }

    @Override // qc0.k
    public final te0.r b() {
        return this.f244431j;
    }

    @Override // qc0.k
    public final te0.r e() {
        return this.f244430h;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f244427b.f0();
    }

    @Override // qc0.k
    public final te0.r g() {
        return this.i;
    }

    @Override // qc0.k
    public final te0.v g0() {
        return this.f244429g;
    }

    @Override // qc0.k
    public final te0.r i() {
        return this.k;
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.v j() {
        return this.f244427b.j();
    }

    @Override // qc0.k
    public final te0.v k() {
        return this.e;
    }

    @Override // qc0.k
    public final te0.e q() {
        return this.f244434n.getValue(this, f244426q[3]);
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        this.f244427b.s(bundle);
        this.f244428c.s(bundle);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f244435p;
    }

    @Override // qc0.k
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final te0.e h() {
        return this.o.getValue(this, f244426q[4]);
    }

    @Override // qc0.k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final te0.e getLocale() {
        return this.d.getValue(this, f244426q[0]);
    }

    @Override // qc0.k
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public final te0.e G() {
        return this.f244433m.getValue(this, f244426q[2]);
    }

    @Override // qc0.k
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final te0.e r0() {
        return this.f.getValue(this, f244426q[1]);
    }
}
