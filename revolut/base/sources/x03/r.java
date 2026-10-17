package x03;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends iri.a implements d {
    public static final /* synthetic */ KProperty[] e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f301484b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.n f301485c;
    public final nkm.r d;

    static {
        h0 h0Var = new h0(r.class, "cardId", "getCardId()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        e = new KProperty[]{p0Var.j(h0Var), p.a.y(r.class, "reason", "getReason()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    public r() {
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(iVar, "default");
        this.f301485c = new te0.n(iVar);
        this.d = new nkm.r(w0(), 1);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.d;
    }

    public final te0.e w0() {
        return this.f301484b.getValue(this, e[0]);
    }
}
