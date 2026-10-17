package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements xki.c, kec.b, yec.d, wec.a, hdc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayOrderSummaryContract$InputData f233741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f233742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f233743c = this;
    public final e4m.e d;

    public x(r rVar, RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData) {
        this.f233742b = rVar;
        this.f233741a = revolutPayOrderSummaryContract$InputData;
        this.d = e4m.b.b(new p2k.c(rVar, this, 4));
    }

    @Override // wec.a
    public final bac.d c() {
        return new bac.d(this.f233742b, this.f233743c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hdc.c
    public final hdc.a j() {
        return new z(this.f233742b, this.f233743c, 0);
    }

    @Override // kec.b
    public final kec.a s() {
        return new p0(this.f233742b, this.f233743c);
    }

    @Override // yec.d
    public final yec.c y() {
        return new bac.f(this.f233742b, this.f233743c, 1);
    }
}
