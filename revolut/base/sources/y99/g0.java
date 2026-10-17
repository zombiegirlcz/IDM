package y99;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 extends iri.a implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f311775p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f311776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f311777c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f311778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f311779h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f311780j;
    public final te0.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f311781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f311782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f311783n;
    public final te0.j o;

    static {
        h0 h0Var = new h0(g0.class, "currentPosition", "getCurrentPosition()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f311775p = new KProperty[]{p0Var.j(h0Var), p.a.y(g0.class, "steps", "getSteps()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "email", "getEmail()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "selectedPurposes", "getSelectedPurposes()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "nextCommand", "getNextCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "ltPersonalCode", "getLtPersonalCode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "isLtPersonalCodeFilled", "isLtPersonalCodeFilled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "usIdentificationNumber", "getUsIdentificationNumber()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "usIdentificationNumberType", "getUsIdentificationNumberType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "isUsIdentificationNumberFilled", "isUsIdentificationNumberFilled()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "isSkippable", "isSkippable()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "configurationType", "getConfigurationType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "chooserList", "getChooserList()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(g0.class, "searchQuery", "getSearchQuery()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public g0() {
        Intrinsics.checkNotNullParameter(0, "default");
        this.f311776b = new te0.j(0);
        this.f311777c = new te0.j();
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter("", "default");
        this.d = new te0.j("");
        this.e = new te0.j(zhm.f0.f322471a);
        this.f = new te0.j();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.f311778g = new te0.j("");
        this.f311779h = new te0.j();
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter("", "default");
        this.i = new te0.j("");
        this.f311780j = new te0.j();
        this.k = new te0.j();
        this.f311781l = new te0.j();
        this.f311782m = new te0.j();
        this.f311783n = new te0.j();
        this.o = new te0.j();
    }

    public final te0.e A0() {
        return this.i.getValue(this, f311775p[7]);
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e a0() {
        return this.f311783n.getValue(this, f311775p[12]);
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.e f0() {
        return this.f311782m.getValue(this, f311775p[11]);
    }

    @Override // com.revolut.feature.chooser.d
    public final te0.v j() {
        return this.o.getValue(this, f311775p[13]);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarW0 = w0();
        te0.e eVarZ0 = z0();
        te0.e eVarX0 = x0();
        te0.e eVarY0 = y0();
        KProperty[] kPropertyArr = f311775p;
        te0.e[] elements = {eVarW0, eVarZ0, eVarX0, eVarY0, this.f311779h.getValue(this, kPropertyArr[6]), A0(), this.f311780j.getValue(this, kPropertyArr[8]), this.k.getValue(this, kPropertyArr[9]), this.f311781l.getValue(this, kPropertyArr[10]), this.f311782m.getValue(this, kPropertyArr[11]), this.f311783n.getValue(this, kPropertyArr[12]), this.o.getValue(this, kPropertyArr[13]), this.f.getValue(this, kPropertyArr[4])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f311776b.getValue(this, f311775p[0]);
    }

    public final te0.e x0() {
        return this.d.getValue(this, f311775p[2]);
    }

    public final te0.e y0() {
        return this.f311778g.getValue(this, f311775p[5]);
    }

    public final te0.e z0() {
        return this.f311777c.getValue(this, f311775p[1]);
    }
}
