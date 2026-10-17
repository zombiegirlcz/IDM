package c43;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.kompot.navigable.flow.BaseFlow;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements qji.a, k43.a, m43.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectPaymentMethodInputData f21034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f21035b;
    public final e4m.e e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f21036c = this;
    public final e4m.e d = e4m.b.b(new aq1.e(this, 0, 21));
    public final e4m.e f = e4m.b.b(new aq1.e(this, 1, 21));

    public j(h hVar, BaseFlow baseFlow, SelectPaymentMethodInputData selectPaymentMethodInputData) {
        this.f21035b = hVar;
        this.f21034a = selectPaymentMethodInputData;
        this.e = e4m.b.b(e4m.c.a(baseFlow));
    }

    @Override // m43.a
    public final p b() {
        return new p(this.f21035b, this.f21036c, 1);
    }

    @Override // k43.a
    public final n c() {
        return new n(this.f21035b, this.f21036c, 1);
    }

    @Override // dki.t
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // dki.q
    public final Set g() {
        return ImmutableSet.of();
    }
}
