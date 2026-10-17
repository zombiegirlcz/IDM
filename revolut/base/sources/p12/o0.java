package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.PaymentsBreakdownNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class o0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentsBreakdownNavigation$InputData f231735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231737c;
    public final e4m.e d;
    public final e4m.e e;

    public o0(v vVar, PaymentsBreakdownNavigation$InputData paymentsBreakdownNavigation$InputData) {
        this.f231735a = paymentsBreakdownNavigation$InputData;
        int i = 5;
        this.f231736b = e4m.b.b(new f0(vVar, this, 1, i));
        this.f231737c = e4m.b.b(new f0(vVar, this, 0, i));
        this.d = e4m.b.b(new f0(vVar, this, 3, i));
        this.e = e4m.b.b(new f0(vVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f231737c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
