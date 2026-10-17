package m66;

import cli.y;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements e {
    public final xv5.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DeFiSettingsScreenContract$InputData f203022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f203023q;

    public g(h mapper, xv5.c baseCurrencyInteractor, DeFiSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = baseCurrencyInteractor;
        this.f203022p = inputData;
        this.f203023q = mra.d.b(this, new d(null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(xv5.c.b(this.o)), null, new lph.h(this, null, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f203023q;
    }
}
