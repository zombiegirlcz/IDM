package bce;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.j;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends iri.a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f14432c = {o0.f186429a.j(new h0(c.class, "subscriptionId", "getSubscriptionId()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f14433b = new j();

    @Override // iri.a
    public final Sequence v0() {
        return new r(w0(), 1);
    }

    public final te0.e w0() {
        return this.f14433b.getValue(this, f14432c[0]);
    }
}
