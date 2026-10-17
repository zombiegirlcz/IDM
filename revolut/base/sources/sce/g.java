package sce;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import qce.k;
import te0.j;
import te0.r;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends iri.a implements k {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f261743b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f261744c = new j();
    public final r d = new r();

    static {
        h0 h0Var = new h0(g.class, "subscription", "getSubscription()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(g.class, "accountId", "getAccountId()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {w0(), this.f261744c.getValue(this, e[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f261743b.getValue(this, e[0]);
    }
}
