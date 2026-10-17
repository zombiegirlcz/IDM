package n33;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class s2 extends iri.a implements w {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f211807p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f211808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f211809c;
    public final te0.j d;
    public final te0.n e;
    public final te0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.n f211810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f211811h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f211812j;
    public final te0.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f211813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.n f211814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f211815n;
    public final Sequence o;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(s2.class, "source", "getSource()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f211807p = new KProperty[]{p0Var.j(h0Var), p.a.y(s2.class, "selectedTab", "getSelectedTab()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "onSuccessCommand", "getOnSuccessCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "onSkipCommand", "getOnSkipCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "onBackCommand", "getOnBackCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "checkoutPlanParams", "getCheckoutPlanParams()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "accountWrapper", "getAccountWrapper()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "hasBackButton", "getHasBackButton()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "automaticEventProduct", "getAutomaticEventProduct()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "activeJointAccountId", "getActiveJointAccountId()Lcom/revolut/core/data/state/StateField;", 0, p0Var), p.a.y(s2.class, "juniorVirtualCardIdempotencyKey", "getJuniorVirtualCardIdempotencyKey()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "designsForPlanId", "getDesignsForPlanId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s2.class, "cardOrderContext", "getCardOrderContext()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public s2() {
        te0.j jVar = new te0.j();
        this.f211808b = jVar;
        this.f211809c = new te0.j();
        this.d = new te0.j();
        te0.n nVar = new te0.n();
        this.e = nVar;
        te0.n nVar2 = new te0.n();
        this.f = nVar2;
        this.f211810g = new te0.n();
        this.f211811h = new te0.j();
        te0.j jVar2 = new te0.j();
        this.i = jVar2;
        this.f211812j = new te0.j();
        this.k = new te0.n();
        this.f211813l = new te0.j();
        this.f211814m = new te0.n();
        this.f211815n = new te0.j();
        KProperty[] kPropertyArr = f211807p;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), C0(), nVar.getValue(this, kPropertyArr[3]), nVar2.getValue(this, kPropertyArr[4]), z0(), w0(), jVar2.getValue(this, kPropertyArr[7]), x0(), B0(), A0(), y0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.o = kotlin.collections.d.E(elements);
    }

    public final te0.e A0() {
        return this.f211814m.getValue(this, f211807p[11]);
    }

    public final te0.e B0() {
        return this.f211813l.getValue(this, f211807p[10]);
    }

    public final te0.e C0() {
        return this.d.getValue(this, f211807p[2]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.o;
    }

    public final te0.e w0() {
        return this.f211811h.getValue(this, f211807p[6]);
    }

    public final te0.e x0() {
        return this.f211812j.getValue(this, f211807p[8]);
    }

    public final te0.e y0() {
        return this.f211815n.getValue(this, f211807p[12]);
    }

    public final te0.e z0() {
        return this.f211810g.getValue(this, f211807p[5]);
    }
}
