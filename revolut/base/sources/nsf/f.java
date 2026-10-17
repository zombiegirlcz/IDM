package nsf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer_reasons.impl.flow.refund.TransferReasonsRefundFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements xki.c, ysf.a, atf.a, ctf.a, etf.a, itf.a, otf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsRefundFlowContract$InputData f218814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f218816c = this;
    public final e4m.e d;

    public f(b bVar, TransferReasonsRefundFlowContract$InputData transferReasonsRefundFlowContract$InputData) {
        this.f218815b = bVar;
        this.f218814a = transferReasonsRefundFlowContract$InputData;
        this.d = e4m.b.b(new nng.n(bVar, this, 4));
    }

    @Override // ctf.a
    public final o b() {
        return new o(this.f218815b, this.f218816c, 0);
    }

    @Override // otf.a
    public final s c() {
        return new s(this.f218815b, this.f218816c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // etf.a
    public final k j() {
        return new k(this.f218815b, this.f218816c, 0);
    }

    @Override // itf.a
    public final q q() {
        return new q(this.f218815b, this.f218816c, 0);
    }

    @Override // ysf.a
    public final i s() {
        return new i(this.f218815b, this.f218816c, 0);
    }

    @Override // atf.a
    public final m y() {
        return new m(this.f218815b, this.f218816c, 0);
    }
}
