package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsLimitsScreenContract$InputData f291958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f291959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f291960c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291961g;

    public c0(t tVar, ViewController viewController, TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData) {
        this.f291959b = tVar;
        this.f291958a = transactionsLimitsScreenContract$InputData;
        this.f291960c = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.d = e4m.b.b(new vn2.l(tVar, this, 2, i));
        this.e = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.f = e4m.b.b(new vn2.l(tVar, this, 0, i));
        this.f291961g = e4m.b.b(new vn2.l(tVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
