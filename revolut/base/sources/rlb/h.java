package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsOptionSelectionContract$InputData f254993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f254994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254995c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254996g;

    public h(e eVar, g gVar, ViewController viewController, SavingsOptionSelectionContract$InputData savingsOptionSelectionContract$InputData) {
        this.f254993a = savingsOptionSelectionContract$InputData;
        this.f254994b = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.f254995c = e4m.b.b(new o(eVar, this, 2, i));
        this.d = e4m.b.b(new o(eVar, this, 1, i));
        this.e = e4m.b.b(new o(eVar, this, 0, i));
        this.f = e4m.b.b(new o(eVar, this, 4, i));
        this.f254996g = e4m.b.b(new o(eVar, this, 3, i));
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
