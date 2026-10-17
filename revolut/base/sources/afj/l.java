package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.help.EsimHelpFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements xki.c, cij.b, qnj.a, yij.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimHelpFlowContract$InputData f4321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f4323c = this;
    public final e4m.e d;

    public l(b bVar, EsimHelpFlowContract$InputData esimHelpFlowContract$InputData) {
        this.f4322b = bVar;
        this.f4321a = esimHelpFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 6));
    }

    @Override // qnj.a
    public final q3 J() {
        return new q3(this.f4322b, this.f4323c, 5);
    }

    @Override // cij.b
    public final cij.a M() {
        return new mp.p(this.f4322b, this.f4323c, 4);
    }

    @Override // yij.a
    public final o1 b() {
        return new o1(this.f4322b, this.f4323c, 3);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
