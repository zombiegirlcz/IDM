package q2j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends iri.a implements z {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(c0.class, "exchangeGlobalAccessParams", "getExchangeGlobalAccessParams()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f241665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nkm.r f241666c;

    public c0() {
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(iVar, "default");
        this.f241665b = new te0.j(iVar);
        this.f241666c = new nkm.r(w0(), 1);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f241666c;
    }

    public final te0.e w0() {
        return this.f241665b.getValue(this, d[0]);
    }
}
