package t33;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends iri.a implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f267639l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f267640b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f267641c = new te0.j();
    public final te0.j d = new te0.j();
    public final te0.j e = new te0.j();
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f267642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f267643h;
    public final te0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.n f267644j;
    public final te0.n k;

    static {
        h0 h0Var = new h0(y.class, "virtualDesign", "getVirtualDesign()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f267639l = new KProperty[]{p0Var.j(h0Var), p.a.y(y.class, "virtualCardLabelType", "getVirtualCardLabelType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "onSuccessCommand", "getOnSuccessCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "replaceableCardId", "getReplaceableCardId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "virtualCardName", "getVirtualCardName()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "bindCardToSpecificPocket", "getBindCardToSpecificPocket()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "selectedCardBindingStrategy", "getSelectedCardBindingStrategy()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "accountId", "getAccountId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(y.class, "predefinedVirtualBrand", "getPredefinedVirtualBrand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(y.class, "checkoutOrderPlanParams", "getCheckoutOrderPlanParams()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var)};
    }

    public y() {
        m70.a.c(t0.f186434a);
        Intrinsics.checkNotNullParameter("", "default");
        this.f = new te0.j("");
        Boolean bool = Boolean.FALSE;
        Intrinsics.checkNotNullParameter(bool, "default");
        this.f267642g = new te0.j(bool);
        this.f267643h = new te0.j();
        this.i = new te0.j();
        this.f267644j = new te0.n();
        this.k = new te0.n();
    }

    public final te0.e A0() {
        return this.f267643h.getValue(this, f267639l[6]);
    }

    public final te0.e B0() {
        return this.f267640b.getValue(this, f267639l[0]);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e eVarB0 = B0();
        te0.e eVarY0 = y0();
        te0.e eVarZ0 = z0();
        te0.e eVarB02 = B0();
        KProperty[] kPropertyArr = f267639l;
        te0.e[] elements = {eVarB0, eVarY0, eVarZ0, eVarB02, this.f267641c.getValue(this, kPropertyArr[1]), this.f267642g.getValue(this, kPropertyArr[5]), A0(), x0(), w0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.i.getValue(this, f267639l[7]);
    }

    public final te0.e x0() {
        return this.k.getValue(this, f267639l[9]);
    }

    public final te0.e y0() {
        return this.d.getValue(this, f267639l[2]);
    }

    public final te0.e z0() {
        return this.e.getValue(this, f267639l[3]);
    }
}
