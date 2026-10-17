package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.post_checkout.EsimPostCheckoutFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 implements xki.c, qkj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPostCheckoutFlowContract$InputData f4431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f4433c = this;
    public final e4m.e d = e4m.b.b(new a0b.c(this, 21));

    public s0(b bVar, EsimPostCheckoutFlowContract$InputData esimPostCheckoutFlowContract$InputData) {
        this.f4432b = bVar;
        this.f4431a = esimPostCheckoutFlowContract$InputData;
    }

    @Override // qkj.a
    public final g2 B() {
        return new g2(this.f4432b, this.f4433c, 0);
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
