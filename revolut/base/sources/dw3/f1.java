package dw3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_card_offer.due_day.CreditCardOfferSelectDueDayScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardOfferSelectDueDayScreenContract$InputData f118700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f118701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f118702c;
    public final e0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f118703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f118704h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f118705j;

    public f1(c1 c1Var, e1 e1Var, ViewController viewController, CreditCardOfferSelectDueDayScreenContract$InputData creditCardOfferSelectDueDayScreenContract$InputData) {
        this.f118701b = c1Var;
        this.f118700a = creditCardOfferSelectDueDayScreenContract$InputData;
        this.f118702c = e4m.b.b(e4m.c.a(viewController));
        e0 e0Var = new e0(c1Var, e1Var, this, 1, 7);
        this.d = e0Var;
        this.e = e4m.b.b(e0Var);
        this.f = e4m.b.b(new e0(c1Var, e1Var, this, 0, 7));
        this.f118703g = e4m.b.b(new e0(c1Var, e1Var, this, 2, 7));
        this.f118704h = e4m.b.b(this.d);
        this.i = e4m.b.b(new e0(c1Var, e1Var, this, 3, 7));
        this.f118705j = e4m.b.b(new e0(c1Var, e1Var, this, 4, 7));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.f118703g.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f118704h.get(), (yji.n) this.i.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f118703g.get());
    }
}
