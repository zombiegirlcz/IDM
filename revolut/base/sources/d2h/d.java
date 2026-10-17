package d2h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionControllerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentSelectionControllerContract$InputData f110840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f110841b;

    public d(e eVar, a aVar, InstrumentSelectionControllerContract$InputData instrumentSelectionControllerContract$InputData) {
        this.f110840a = instrumentSelectionControllerContract$InputData;
        this.f110841b = e4m.b.b(new b(eVar, 1, aVar, this));
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
