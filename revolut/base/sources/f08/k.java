package f08;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends iri.a implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f131021g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f131022b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f131023c = new te0.j();
    public final te0.j d = new te0.j(n08.d.DEFAULT);
    public final te0.j e = new te0.j(n08.g.DEFAULT);
    public final te0.j f = new te0.j();

    static {
        h0 h0Var = new h0(k.class, "petId", "getPetId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f131021g = new KProperty[]{p0Var.j(h0Var), p.a.y(k.class, "policyId", "getPolicyId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "screenMode", "getScreenMode()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "profilePicture", "getProfilePicture()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(k.class, "historyDocumentType", "getHistoryDocumentType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {d(), y0(), z0(), this.e.getValue(this, f131021g[3]), w0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f.getValue(this, f131021g[4]);
    }

    @Override // f08.c
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final te0.e d() {
        return this.f131022b.getValue(this, f131021g[0]);
    }

    public final te0.e y0() {
        return this.f131023c.getValue(this, f131021g[1]);
    }

    public final te0.e z0() {
        return this.d.getValue(this, f131021g[2]);
    }
}
