package uc1;

import com.revolut.feature.acquiring.card_reader.ui.impl.ui.screen.updating.CardReaderUpdatingScreenContract$InputData;
import efm.r;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ma1.b0;
import pfm.z;
import ufm.i;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends bji.b implements b {
    public final CardReaderUpdatingScreenContract$InputData u;
    public final b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ma1.d f278968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final xc1.d f278969x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, CardReaderUpdatingScreenContract$InputData inputData, b0 updatingInteractor, ma1.d batteryInteractor, xc1.d stickyActionExtension) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updatingInteractor, "updatingInteractor");
        Intrinsics.checkNotNullParameter(batteryInteractor, "batteryInteractor");
        Intrinsics.checkNotNullParameter(stickyActionExtension, "stickyActionExtension");
        this.u = inputData;
        this.v = updatingInteractor;
        this.f278968w = batteryInteractor;
        this.f278969x = stickyActionExtension;
    }

    public final void B2() {
        z zVarO = new i(this.f278968w.b(), new m78.e(new m9l.d(5), 10), 1).o(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        A2(zVarO, new c(this, 0), new zii.c(4));
    }

    @Override // yji.l
    public final void I1() {
        B2();
    }

    @Override // bji.b
    public final r y2() {
        r rVarJust = r.just(j.f175191a);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
