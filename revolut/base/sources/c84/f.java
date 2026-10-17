package c84;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends iri.a implements qv3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f22081c = {o0.f186429a.j(new h0(f.class, "pluginPayload", "getPluginPayload()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f22082b = new te0.j();

    @Override // iri.a
    public final Sequence v0() {
        return new nkm.r(n0(), 1);
    }

    @Override // qv3.a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public final te0.e n0() {
        return this.f22082b.getValue(this, f22081c[0]);
    }
}
