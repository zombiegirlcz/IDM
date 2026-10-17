package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class m3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentTransactionsScreenContract$InputData f176201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176203c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f176204g;

    public m3(a3 a3Var, k3 k3Var, ViewController viewController, InstalmentTransactionsScreenContract$InputData instalmentTransactionsScreenContract$InputData) {
        this.f176201a = instalmentTransactionsScreenContract$InputData;
        this.f176202b = e4m.b.b(e4m.c.a(viewController));
        this.f176203c = e4m.b.b(new f1(a3Var, this, 2, 23));
        this.d = e4m.b.b(new f1(a3Var, this, 1, 23));
        this.e = e4m.b.b(new f1(a3Var, this, 0, 23));
        this.f = e4m.b.b(new f1(a3Var, this, 4, 23));
        this.f176204g = e4m.b.b(new f1(a3Var, this, 3, 23));
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
