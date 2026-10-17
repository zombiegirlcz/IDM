package h3l;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends iri.a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f149247j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f149248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f149249c;
    public final te0.j d;
    public final te0.j e;
    public final te0.j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f149250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f149251h;
    public final Sequence i;

    static {
        h0 h0Var = new h0(m.class, "statusViewConfiguration", "getStatusViewConfiguration()Lcom/revolut/core/data/state/BundleStateField;", 0);
        p0 p0Var = o0.f186429a;
        f149247j = new KProperty[]{p0Var.j(h0Var), p.a.y(m.class, "primaryButtonCommand", "getPrimaryButtonCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(m.class, "primaryButtonAnalyticsEvent", "getPrimaryButtonAnalyticsEvent()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(m.class, "secondaryButtonCommand", "getSecondaryButtonCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(m.class, "secondaryButtonAnalyticsEvent", "getSecondaryButtonAnalyticsEvent()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(m.class, "finishResultCommand", "getFinishResultCommand()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var), p.a.y(m.class, "clauseClickCommands", "getClauseClickCommands()Lcom/revolut/core/data/state/BundleStateField;", 0, p0Var)};
    }

    public m() {
        te0.j jVar = new te0.j();
        this.f149248b = jVar;
        te0.j jVar2 = new te0.j();
        this.f149249c = jVar2;
        te0.j jVar3 = new te0.j();
        this.d = jVar3;
        te0.j jVar4 = new te0.j();
        this.e = jVar4;
        te0.j jVar5 = new te0.j();
        this.f = jVar5;
        te0.j jVar6 = new te0.j();
        this.f149250g = jVar6;
        te0.j jVar7 = new te0.j();
        this.f149251h = jVar7;
        KProperty[] kPropertyArr = f149247j;
        te0.e[] elements = {jVar.getValue(this, kPropertyArr[0]), jVar2.getValue(this, kPropertyArr[1]), jVar3.getValue(this, kPropertyArr[2]), jVar4.getValue(this, kPropertyArr[3]), jVar5.getValue(this, kPropertyArr[4]), jVar6.getValue(this, kPropertyArr[5]), jVar7.getValue(this, kPropertyArr[6])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.i = kotlin.collections.d.E(elements);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.i;
    }
}
