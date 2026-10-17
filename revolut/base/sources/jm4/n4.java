package jm4;

import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes22.dex */
public final class n4 implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f176223c;
    public CreditCardStatementTransactionsScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ n4(a3 a3Var, Object obj2, int i) {
        this.f176221a = i;
        this.f176222b = a3Var;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f176221a) {
            case 0:
                this.f176223c = viewController;
                break;
            default:
                this.f176223c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f176221a) {
            case 0:
                vc.s.h(this.f176223c, ViewController.class);
                vc.s.h(this.d, CreditCardStatementTransactionsScreenContract$InputData.class);
                return new o4(this.f176222b, (z2) this.e, this.f176223c, this.d);
            default:
                vc.s.h(this.f176223c, ViewController.class);
                vc.s.h(this.d, CreditCardStatementTransactionsScreenContract$InputData.class);
                return new o4(this.f176222b, (z0) this.e, this.f176223c, this.d);
        }
    }
}
