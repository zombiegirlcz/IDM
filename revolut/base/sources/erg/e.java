package erg;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.j;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends iri.a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f128668c = {o0.f186429a.j(new h0(e.class, "acceptedIds", "getAcceptedIds()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f128669b = new j(f0.f322471a);

    @Override // iri.a
    public final Sequence v0() {
        return new r(w0(), 1);
    }

    public final te0.e w0() {
        return this.f128669b.getValue(this, f128668c[0]);
    }
}
