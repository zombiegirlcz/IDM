package v3e;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 extends iri.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f285893j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f285894b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f285895c = new te0.j();
    public final te0.j d = new te0.j(f0.f322471a);
    public final te0.j e = new te0.j();
    public final te0.j f = new te0.j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f285896g = new te0.j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f285897h = new te0.j();
    public final te0.j i = new te0.j();

    static {
        h0 h0Var = new h0(e0.class, "currentItem", "getCurrentItem()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f285893j = new KProperty[]{p0Var.j(h0Var), p.a.y(e0.class, "stories", "getStories()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "completedPages", "getCompletedPages()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "params", "getParams()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "nextNaviCommand", "getNextNaviCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "screenShownNaviCommand", "getScreenShownNaviCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "autofinishNaviCommand", "getAutofinishNaviCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(e0.class, "closeNaviCommand", "getCloseNaviCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // v3e.d
    public final te0.e H() {
        return this.f285897h.getValue(this, f285893j[6]);
    }

    @Override // v3e.d
    public final te0.e S() {
        return this.f285895c.getValue(this, f285893j[1]);
    }

    @Override // v3e.d
    public final te0.e Z() {
        return this.d.getValue(this, f285893j[2]);
    }

    @Override // v3e.d
    public final te0.e l0() {
        return this.f.getValue(this, f285893j[4]);
    }

    @Override // v3e.d
    public final te0.e s0() {
        return this.f285896g.getValue(this, f285893j[5]);
    }

    @Override // v3e.d
    public final te0.e t0() {
        return this.i.getValue(this, f285893j[7]);
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = f285893j;
        te0.e[] elements = {this.f285894b.getValue(this, kPropertyArr[0]), this.f285895c.getValue(this, kPropertyArr[1]), this.d.getValue(this, kPropertyArr[2]), this.e.getValue(this, kPropertyArr[3]), this.f.getValue(this, kPropertyArr[4]), this.f285896g.getValue(this, kPropertyArr[5]), this.f285897h.getValue(this, kPropertyArr[6]), this.i.getValue(this, kPropertyArr[7])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // v3e.d
    public final te0.e x() {
        return this.f285894b.getValue(this, f285893j[0]);
    }
}
