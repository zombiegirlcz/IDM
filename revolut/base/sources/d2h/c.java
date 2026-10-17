package d2h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashSelectionControllerContract$InputData f110838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f110839b;

    public c(e eVar, a aVar, CashSelectionControllerContract$InputData cashSelectionControllerContract$InputData) {
        this.f110838a = cashSelectionControllerContract$InputData;
        this.f110839b = e4m.b.b(new b(eVar, 0, aVar, this));
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
