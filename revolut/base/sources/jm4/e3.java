package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditLimitCapChangeScreenContract$InputData f176057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176059c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176061h;
    public final e4m.e i;

    public e3(a3 a3Var, ViewController viewController, CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData) {
        this.f176058b = a3Var;
        this.f176057a = creditLimitCapChangeScreenContract$InputData;
        this.f176059c = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.d = e4m.b.b(new f1(a3Var, this, 1, i));
        this.e = e4m.b.b(new f1(a3Var, this, 0, i));
        this.f = e4m.b.b(new f1(a3Var, this, 4, i));
        this.f176060g = e4m.b.b(new f1(a3Var, this, 5, i));
        this.f176061h = e4m.b.b(new f1(a3Var, this, 3, i));
        this.i = e4m.b.b(new f1(a3Var, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
