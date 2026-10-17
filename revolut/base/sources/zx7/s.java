package zx7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends iri.a implements l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f326088g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f326089b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f326090c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    static {
        h0 h0Var = new h0(s.class, "reasons", "getReasons()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f326088g = new KProperty[]{p0Var.j(h0Var), p.a.y(s.class, "userInput", "getUserInput()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "policyId", "getPolicyId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "petIssues", "getPetIssues()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "petId", "getPetId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public s() {
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f326090c = new te0.j("");
        this.d = new te0.j();
        this.e = new te0.j();
        this.f = new te0.j();
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {y0(), z0(), x0(), this.e.getValue(this, f326088g[3]), d()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // f08.c
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final te0.e d() {
        return this.f.getValue(this, f326088g[4]);
    }

    public final te0.e x0() {
        return this.d.getValue(this, f326088g[2]);
    }

    public final te0.e y0() {
        return this.f326089b.getValue(this, f326088g[0]);
    }

    public final te0.e z0() {
        return this.f326090c.getValue(this, f326088g[1]);
    }
}
