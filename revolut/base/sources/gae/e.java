package gae;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import te0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends iri.a implements g {
    public static final /* synthetic */ KProperty[] d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f142150b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f142151c = new j();

    static {
        h0 h0Var = new h0(e.class, "currentSubscriptionId", "getCurrentSubscriptionId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        d = new KProperty[]{p0Var.j(h0Var), p.a.y(e.class, "currentSubscriptionCurrency", "getCurrentSubscriptionCurrency()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // iri.a
    public final Sequence v0() {
        KProperty[] kPropertyArr = d;
        te0.e[] elements = {this.f142150b.getValue(this, kPropertyArr[0]), this.f142151c.getValue(this, kPropertyArr[1])};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }
}
