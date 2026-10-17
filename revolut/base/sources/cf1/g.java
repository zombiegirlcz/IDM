package cf1;

import cli.y;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements e {
    public final SelectTaxRateScreenProvider$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd1.c f23525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f23526q;

    public g(j stateMapper, SelectTaxRateScreenProvider$InputData inputData, nd1.c catalogueInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        this.o = inputData;
        this.f23525p = catalogueInteractor;
        this.f23526q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        nd1.c cVar = this.f23525p;
        l.a1(this, rd0.e.b(cVar.c(false)), null, null, new f(this, null, 0), 3);
        if (this.o.f60704c) {
            l.a1(this, rd0.e.b(cVar.f214281a.f160405g.f(Unit.f186387a, false)), null, null, new f(this, null, 1), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f23526q;
    }
}
