package qah;

import i9h.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.t;
import nkm.y;
import te0.e;
import te0.j;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends iri.a implements q {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f244038b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f244039c = new j();

    static {
        h0 h0Var = new h0(d.class, "selectedMostTradedAssetsTimeSpan", "getSelectedMostTradedAssetsTimeSpan()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), p.a.y(d.class, "selectedMostTradedAssetsSection", "getSelectedMostTradedAssetsSection()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a
    public final Sequence v0() {
        Sequence sequenceD = t.d();
        e[] elements = {x0(), w0()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return y.E(sequenceD, kotlin.collections.d.E(elements));
    }

    public final e w0() {
        return this.f244039c.getValue(this, d[1]);
    }

    public final e x0() {
        return this.f244038b.getValue(this, d[0]);
    }
}
