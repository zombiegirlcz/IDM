package wx7;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import nkm.r;
import te0.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends iri.a implements b {
    public static final /* synthetic */ KProperty[] d = {o0.f186429a.j(new h0(k.class, "petType", "getPetType()Lcom/revolut/core/data/state/BaseBundleField;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f300783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f300784c;

    public k() {
        te0.j jVar = new te0.j();
        this.f300783b = jVar;
        this.f300784c = new r(jVar.getValue(this, d[0]), 1);
    }

    @Override // rz7.o
    public final v h0() {
        return this.f300783b.getValue(this, d[0]);
    }

    @Override // iri.a
    public final Sequence v0() {
        return this.f300784c;
    }
}
