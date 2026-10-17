package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.statement_bottom_sheet.CreditCardStatementBottomSheetScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m2 implements xki.e, bx4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardStatementBottomSheetScreenContract$InputData f176198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176200c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public m2(a3 a3Var, ViewController viewController, CreditCardStatementBottomSheetScreenContract$InputData creditCardStatementBottomSheetScreenContract$InputData) {
        this.f176199b = a3Var;
        this.f176198a = creditCardStatementBottomSheetScreenContract$InputData;
        this.f176200c = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.d = e4m.b.b(new f1(a3Var, this, 0, i));
        this.e = e4m.b.b(new f1(a3Var, this, 1, i));
        this.f = e4m.b.b(new f1(a3Var, this, 2, i));
    }

    @Override // bx4.a
    public final cx4.b c() {
        return (cx4.b) this.d.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
