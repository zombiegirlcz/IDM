package g9i;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends iri.a implements n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f141900l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f141901b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f141902c = new te0.j();
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f141903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f141904h;
    public final te0.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f141905j;
    public final te0.r k;

    static {
        h0 h0Var = new h0(u.class, "source", "getSource()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f141900l = new KProperty[]{p0Var.j(h0Var), p.a.y(u.class, "cachedFile", "getCachedFile()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "withAuth", "getWithAuth()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "saveActionShown", "getSaveActionShown()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "withSaveActionIfPossible", "getWithSaveActionIfPossible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "networkErrorsSetting", "getNetworkErrorsSetting()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "analyticsProduct", "getAnalyticsProduct()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "analyticsContext", "getAnalyticsContext()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(u.class, "title", "getTitle()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public u() {
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.d = new te0.j(bool);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.e = new te0.j(bool);
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f = new te0.j(bool);
        this.f141903g = new te0.j();
        this.f141904h = new te0.j();
        this.i = new te0.n();
        this.f141905j = new te0.j();
        this.k = new te0.r();
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarY0 = y0();
        te0.e eVarX0 = x0();
        te0.e eVarZ0 = z0();
        KProperty[] kPropertyArr = f141900l;
        te0.e[] elements = {eVarY0, eVarX0, eVarZ0, this.e.getValue(this, kPropertyArr[3]), this.f.getValue(this, kPropertyArr[4]), this.f141903g.getValue(this, kPropertyArr[5]), this.f141904h.getValue(this, kPropertyArr[6]), w0(), this.f141905j.getValue(this, kPropertyArr[8])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.i.getValue(this, f141900l[7]);
    }

    public final te0.e x0() {
        return this.f141902c.getValue(this, f141900l[1]);
    }

    public final te0.e y0() {
        return this.f141901b.getValue(this, f141900l[0]);
    }

    public final te0.e z0() {
        return this.d.getValue(this, f141900l[2]);
    }
}
