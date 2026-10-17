package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class y2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardTopupScreenContract$InputData f176448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176450c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176452h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176453j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176454l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f176455m;

    public y2(a3 a3Var, z1 z1Var, ViewController viewController, CreditCardTopupScreenContract$InputData creditCardTopupScreenContract$InputData) {
        this.f176449b = a3Var;
        this.f176448a = creditCardTopupScreenContract$InputData;
        this.f176450c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 2, 17));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 17));
        this.f = e4m.b.b(new f1(a3Var, this, 0, 17));
        this.f176451g = e4m.b.b(new f1(a3Var, this, 4, 17));
        this.f176452h = e4m.b.b(new f1(a3Var, this, 3, 17));
        this.i = e4m.b.b(new f1(a3Var, this, 6, 17));
        this.f176453j = e4m.b.b(new f1(a3Var, this, 8, 17));
        this.k = e4m.b.b(new f1(a3Var, this, 9, 17));
        this.f176454l = e4m.b.b(new f1(a3Var, this, 7, 17));
        this.f176455m = e4m.b.b(new f1(a3Var, this, 5, 17));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f176452h.get());
    }
}
