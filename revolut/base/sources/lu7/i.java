package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements dv7.b, zv7.b, hv7.b, fv7.b, qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmbeddedDetailFlowContract$InputData f200109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f200111c = this;
    public final e4m.e d = e4m.b.b(new ljl.n(this, 16));

    public i(s sVar, EmbeddedDetailFlowContract$InputData embeddedDetailFlowContract$InputData) {
        this.f200110b = sVar;
        this.f200109a = embeddedDetailFlowContract$InputData;
    }

    @Override // fv7.b
    public final fv7.a b() {
        return new a0(this.f200110b, this.f200111c);
    }

    @Override // zv7.b
    public final zv7.a c() {
        return new j0(this.f200110b, this.f200111c);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // dv7.b
    public final dv7.a q() {
        return new x(this.f200110b, this.f200111c);
    }

    @Override // hv7.b
    public final hv7.a s() {
        return new g0(this.f200110b, this.f200111c, 0);
    }
}
