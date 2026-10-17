package ks2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import od0.i;
import te0.j;
import te0.n;

/* JADX INFO: loaded from: classes21.dex */
public class d extends iri.a implements a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f189108y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f189109b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f189110c = new j();
    public final j d = new j();
    public final n e = new n();
    public final n f = new n();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f189111g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f189112h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f189113j;
    public final n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f189114l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f189115m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f189116n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f189117p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f189118q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f189119r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f189120s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f189121t;
    public final n u;
    public final n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f189122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Sequence f189123x;

    static {
        h0 h0Var = new h0(d.class, "title", "getTitle()Lcom/revolut/core/data/state/BundleStateField;", 0);
        p0 p0Var = o0.f186429a;
        f189108y = new KProperty[]{p0Var.j(h0Var), p.a.y(d.class, "description", "getDescription()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "content", "getContent()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "closeButtonImage", "getCloseButtonImage()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "closeButtonCommand", "getCloseButtonCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "link", "getLink()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "footer", "getFooter()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "buttonsStyle", "getButtonsStyle()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "primaryActionIcon", "getPrimaryActionIcon()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "secondaryActionIcon", "getSecondaryActionIcon()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "primaryActionLabel", "getPrimaryActionLabel()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "secondaryActionLabel", "getSecondaryActionLabel()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "primaryActionStyle", "getPrimaryActionStyle()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "secondaryActionStyle", "getSecondaryActionStyle()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "primaryActionCommand", "getPrimaryActionCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "secondaryActionCommand", "getSecondaryActionCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "linkCommand", "getLinkCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "clauseClickCommand", "getClauseClickCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "backgroundType", "getBackgroundType()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "payload", "getPayload()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "primaryActionContext", "getPrimaryActionContext()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(d.class, "secondaryActionContext", "getSecondaryActionContext()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var)};
    }

    public d() {
        n nVar = new n();
        this.f189112h = nVar;
        this.i = new j();
        this.f189113j = new n();
        this.k = new n();
        this.f189114l = new n();
        this.f189115m = new n();
        j jVar = new j();
        this.f189116n = jVar;
        this.o = new j();
        this.f189117p = new n();
        this.f189118q = new n();
        this.f189119r = new n();
        n nVar2 = new n();
        this.f189120s = nVar2;
        i.Companion.getClass();
        i iVar = i.f224256b;
        Intrinsics.checkNotNullParameter(iVar, "default");
        this.f189121t = new n(iVar);
        n nVar3 = new n();
        this.u = nVar3;
        this.v = new n();
        this.f189122w = new n();
        te0.e eVarN0 = N0();
        te0.e eVarB0 = B0();
        te0.e eVarA0 = A0();
        te0.e eVarZ0 = z0();
        te0.e eVarY0 = y0();
        te0.e eVarC0 = C0();
        KProperty[] kPropertyArr = f189108y;
        te0.e[] elements = {eVarN0, eVarB0, eVarA0, eVarZ0, eVarY0, eVarC0, nVar.getValue(this, kPropertyArr[6]), x0(), G0(), K0(), H0(), L0(), jVar.getValue(this, kPropertyArr[12]), M0(), E0(), I0(), D0(), nVar2.getValue(this, kPropertyArr[17]), nVar3.getValue(this, kPropertyArr[19]), F0(), J0(), w0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f189123x = kotlin.collections.d.E(elements);
    }

    public final te0.e A0() {
        return this.d.getValue(this, f189108y[2]);
    }

    public final te0.e B0() {
        return this.f189110c.getValue(this, f189108y[1]);
    }

    public final te0.e C0() {
        return this.f189111g.getValue(this, f189108y[5]);
    }

    public final te0.e D0() {
        return this.f189119r.getValue(this, f189108y[16]);
    }

    public final te0.e E0() {
        return this.f189117p.getValue(this, f189108y[14]);
    }

    public final te0.e F0() {
        return this.v.getValue(this, f189108y[20]);
    }

    public final te0.e G0() {
        return this.f189113j.getValue(this, f189108y[8]);
    }

    public final te0.e H0() {
        return this.f189114l.getValue(this, f189108y[10]);
    }

    public final te0.e I0() {
        return this.f189118q.getValue(this, f189108y[15]);
    }

    public final te0.e J0() {
        return this.f189122w.getValue(this, f189108y[21]);
    }

    public final te0.e K0() {
        return this.k.getValue(this, f189108y[9]);
    }

    public final te0.e L0() {
        return this.f189115m.getValue(this, f189108y[11]);
    }

    public final te0.e M0() {
        return this.o.getValue(this, f189108y[13]);
    }

    public final te0.e N0() {
        return this.f189109b.getValue(this, f189108y[0]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f189123x;
    }

    public final te0.e w0() {
        return this.f189121t.getValue(this, f189108y[18]);
    }

    public final te0.e x0() {
        return this.i.getValue(this, f189108y[7]);
    }

    public final te0.e y0() {
        return this.f.getValue(this, f189108y[4]);
    }

    public final te0.e z0() {
        return this.e.getValue(this, f189108y[3]);
    }
}
