package ao1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountScreenContract$InputData f7866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f7868c;
    public final e4m.e d;
    public final e4m.e e;

    public c(d dVar, e eVar, AmountScreenContract$InputData amountScreenContract$InputData) {
        this.f7867b = dVar;
        this.f7866a = amountScreenContract$InputData;
        int i = 14;
        this.f7868c = e4m.b.b(new ak5.f(dVar, this, 2, i));
        this.d = e4m.b.b(new ak5.f(dVar, this, 1, i));
        this.e = e4m.b.b(new ak5.f(dVar, this, 0, i));
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
