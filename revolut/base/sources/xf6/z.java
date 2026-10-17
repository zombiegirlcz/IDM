package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements xki.c, sn6.a, un6.a, yn6.a, ao6.a, co6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkAccountFlowContract$InputData f305182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f305183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f305184c = this;
    public final e4m.e d;

    public z(t tVar, LinkAccountFlowContract$InputData linkAccountFlowContract$InputData) {
        this.f305183b = tVar;
        this.f305182a = linkAccountFlowContract$InputData;
        this.d = e4m.b.b(new whc.d(tVar, this, 26));
    }

    @Override // un6.a
    public final u0 b() {
        return new u0(this.f305183b, this.f305184c, 2);
    }

    @Override // yn6.a
    public final y0 c() {
        return new y0(this.f305183b, this.f305184c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // co6.a
    public final d1 j() {
        return new d1(this.f305183b, this.f305184c, 1);
    }

    @Override // ao6.a
    public final b1 q() {
        return new b1(this.f305183b, this.f305184c, 1);
    }

    @Override // sn6.a
    public final s0 s() {
        return new s0(this.f305183b, this.f305184c, 2);
    }
}
