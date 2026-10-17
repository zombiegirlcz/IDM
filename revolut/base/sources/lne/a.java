package lne;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.exemption.ui.amount.LimitOrderAmountSelectorScreenContract$InputData;
import java.util.Set;
import ljl.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitOrderAmountSelectorScreenContract$InputData f197212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f197213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f197214c;
    public final e4m.e d;
    public final e4m.e e;

    public a(c cVar, d dVar, LimitOrderAmountSelectorScreenContract$InputData limitOrderAmountSelectorScreenContract$InputData) {
        this.f197213b = cVar;
        this.f197212a = limitOrderAmountSelectorScreenContract$InputData;
        this.f197214c = e4m.b.b(new u(cVar, this, 2, 12));
        this.d = e4m.b.b(new u(cVar, this, 1, 12));
        this.e = e4m.b.b(new u(cVar, this, 0, 12));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
