package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement.details.page.CreditCardStatementPageScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class v2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementPageScreenContract$InputData f176398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176400c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f176402h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f176403j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f176404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f176405m;

    public v2(a3 a3Var, ViewController viewController, CreditCardStatementPageScreenContract$InputData creditCardStatementPageScreenContract$InputData) {
        this.f176399b = a3Var;
        this.f176398a = creditCardStatementPageScreenContract$InputData;
        this.f176400c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new f1(a3Var, this, 2, 15));
        this.e = e4m.b.b(new f1(a3Var, this, 1, 15));
        this.f = e4m.b.b(new f1(a3Var, this, 0, 15));
        this.f176401g = e4m.b.b(new f1(a3Var, this, 4, 15));
        this.f176402h = e4m.b.b(new f1(a3Var, this, 3, 15));
        this.i = e4m.b.b(new f1(a3Var, this, 7, 15));
        this.f176403j = e4m.b.b(new f1(a3Var, this, 6, 15));
        this.k = e4m.b.b(new f1(a3Var, this, 5, 15));
        this.f176404l = e4m.b.b(new f1(a3Var, this, 9, 15));
        this.f176405m = e4m.b.b(new f1(a3Var, this, 8, 15));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f176402h.get(), (yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
