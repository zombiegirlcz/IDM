package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.link.penny_topup.PennyTopUpFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements xki.c, yn6.a, sn6.a, wn6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PennyTopUpFlowContract$InputData f304870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f304871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f304872c = this;
    public final e4m.e d;
    public final e4m.e e;

    public h0(t tVar, PennyTopUpFlowContract$InputData pennyTopUpFlowContract$InputData) {
        this.f304871b = tVar;
        this.f304870a = pennyTopUpFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new xb1.m(tVar, this, 0, i));
        this.e = e4m.b.b(new xb1.m(tVar, this, 1, i));
    }

    @Override // wn6.a
    public final w0 b() {
        return new w0(this.f304871b, this.f304872c, 0);
    }

    @Override // yn6.a
    public final y0 c() {
        return new y0(this.f304871b, this.f304872c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // sn6.a
    public final s0 s() {
        return new s0(this.f304871b, this.f304872c, 1);
    }
}
