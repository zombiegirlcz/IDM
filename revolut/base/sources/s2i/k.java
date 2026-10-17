package s2i;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends iri.a implements c {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(k.class, "order", "getOrder()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f259366b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f259367c = new r(w0(), 1);

    @Override // iri.a
    public final Sequence v0() {
        return this.f259367c;
    }

    public final te0.e w0() {
        return this.f259366b.getValue(this, d[0]);
    }
}
