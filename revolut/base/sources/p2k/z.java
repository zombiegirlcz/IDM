package p2k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class z implements qji.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittanceInputData f232535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f232536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f232537c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f232538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f232539h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f232540j;

    public z(x xVar, RemittanceInputData remittanceInputData) {
        this.f232536b = xVar;
        this.f232535a = remittanceInputData;
        int i = 12;
        this.d = e4m.b.b(new p12.f0(xVar, this, 0, i));
        this.e = e4m.b.b(new p12.f0(xVar, this, 1, i));
        this.f = e4m.b.b(new p12.f0(xVar, this, 3, i));
        this.f232538g = e4m.b.b(new p12.f0(xVar, this, 2, i));
        this.f232539h = e4m.b.b(new p12.f0(xVar, this, 5, i));
        this.i = e4m.b.b(new p12.f0(xVar, this, 4, i));
        this.f232540j = e4m.b.b(new p12.f0(xVar, this, 6, i));
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f232538g.get(), (yji.n) this.i.get());
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.e.get());
    }
}
