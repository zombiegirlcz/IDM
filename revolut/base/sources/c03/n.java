package c03;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends iri.a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f20136c = {o0.f186429a.j(new h0(n.class, "cardId", "getCardId()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f20137b = new te0.j();

    @Override // iri.a
    public final Sequence v0() {
        return new nkm.r(w0(), 1);
    }

    public final te0.e w0() {
        return this.f20137b.getValue(this, f20136c[0]);
    }
}
