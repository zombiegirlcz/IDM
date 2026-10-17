package tc0;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.e;
import te0.j;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends iri.a {
    public static final /* synthetic */ KProperty[] f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f269567b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f269568c = new j();
    public final j d = new j();
    public final Sequence e;

    static {
        h0 h0Var = new h0(c.class, "flowId", "getFlowId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        f = new KProperty[]{p0Var.j(h0Var), p.a.y(c.class, "parameters", "getParameters()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(c.class, "item", "getItem()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public c() {
        e[] elements = {this.f269567b.getValue(this, f[0]), this.f269568c.getValue(this, f[1]), this.d.getValue(this, f[2])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.e = d.E(elements);
    }

    @Override // iri.a, iri.m
    public final void D(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.D(bundle);
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            ((e) it8.next()).g(bundle);
        }
    }

    @Override // iri.a, iri.m
    public final void s(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        super.s(bundle);
        Iterator it8 = this.e.iterator();
        while (it8.hasNext()) {
            ((e) it8.next()).f(bundle);
        }
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.e;
    }
}
