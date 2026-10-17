package vy7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends iri.a implements d {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f293258b = new te0.j(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f293259c = new te0.j(c.HUB);

    static {
        h0 h0Var = new h0(n.class, "initialLoading", "getInitialLoading()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), p.a.y(n.class, ib.b.Screen, "getScreen()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {w0(), x0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    public final te0.e w0() {
        return this.f293258b.getValue(this, d[0]);
    }

    public final te0.e x0() {
        return this.f293259c.getValue(this, d[1]);
    }
}
