package cx2;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.j;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends iri.a implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f109889c = {o0.f186429a.j(new h0(g.class, "firstLaunch", "getFirstLaunch()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f109890b = new j(Boolean.TRUE);

    @Override // iri.a
    public final Sequence v0() {
        return new r(this.f109890b.getValue(this, f109889c[0]), 1);
    }
}
