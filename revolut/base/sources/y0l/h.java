package y0l;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.j;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends iri.a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f310226c = {o0.f186429a.j(new h0(h.class, "isStartedOnboarding", "isStartedOnboarding()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f310227b = new j(Boolean.FALSE);

    @Override // iri.a
    public final Sequence v0() {
        return new r(this.f310227b.getValue(this, f310226c[0]), 1);
    }
}
