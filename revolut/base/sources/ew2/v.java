package ew2;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends iri.a implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f130055j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f130056b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f130057c;
    public final te0.j d;
    public final te0.j e;
    public final te0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f130058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f130059h;
    public final Sequence i;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(v.class, "card", "getCard()Lcom/revolut/core/data/state/BundleStateField;", 0);
        kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
        f130055j = new KProperty[]{p0Var.j(h0Var), p.a.y(v.class, "isUSAccount", "isUSAccount()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(v.class, "onSuccessCommand", "getOnSuccessCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(v.class, "onCancelCommand", "getOnCancelCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(v.class, "navigationIconConfig", "getNavigationIconConfig()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(v.class, "reactivation", "getReactivation()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(v.class, "requiredForPlanActivation", "getRequiredForPlanActivation()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var)};
    }

    public v() {
        te0.j jVar = new te0.j();
        this.f130057c = jVar;
        te0.j jVar2 = new te0.j();
        this.d = jVar2;
        te0.j jVar3 = new te0.j();
        this.e = jVar3;
        this.f = new te0.n();
        te0.j jVar4 = new te0.j();
        this.f130058g = jVar4;
        this.f130059h = new te0.j();
        te0.e eVarW0 = w0();
        KProperty[] kPropertyArr = f130055j;
        te0.e[] elements = {eVarW0, jVar.getValue(this, kPropertyArr[1]), jVar2.getValue(this, kPropertyArr[2]), jVar3.getValue(this, kPropertyArr[3]), x0(), jVar4.getValue(this, kPropertyArr[5])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.i = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.i;
    }

    public final te0.e w0() {
        return this.f130056b.getValue(this, f130055j[0]);
    }

    public final te0.e x0() {
        return this.f.getValue(this, f130055j[4]);
    }
}
