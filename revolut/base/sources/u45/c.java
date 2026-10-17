package u45;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount.AmountInputControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AmountInputControllerContract$InputData f277069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f277070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f277071c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277072g;

    public c(h hVar, c0 c0Var, AmountInputControllerContract$InputData amountInputControllerContract$InputData) {
        this.f277070b = hVar;
        this.f277069a = amountInputControllerContract$InputData;
        int i = 27;
        this.f277071c = e4m.b.b(new tg5.h(hVar, this, 1, i));
        this.d = e4m.b.b(new tg5.h(hVar, this, 0, i));
        this.e = e4m.b.b(new tg5.h(hVar, this, 3, i));
        this.f = e4m.b.b(new tg5.h(hVar, this, 2, i));
        this.f277072g = e4m.b.b(new tg5.h(hVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
