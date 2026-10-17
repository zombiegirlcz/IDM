package km1;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.api.navigation.BillersChooserNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements e {
    public final BillersChooserNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final im1.a f185678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f185679q;

    public j(BillersChooserNavigation$InputData inputData, im1.a billersInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billersInteractor, "billersInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f185678p = billersInteractor;
        this.f185679q = mra.d.b(this, new d(inputData.f61157b, "", new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        BillersChooserNavigation$InputData billersChooserNavigation$InputData = this.o;
        cm1.c request = new cm1.c(billersChooserNavigation$InputData.f61156a, billersChooserNavigation$InputData.f61157b);
        im1.a aVar = this.f185678p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        fm1.c cVar = aVar.f162277a;
        Intrinsics.checkNotNullParameter(request, "request");
        l.a1(this, t1.E(cVar.f136021c.b(request, w4l.i.f294643c)), null, null, new kae.d(this, null, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f185679q;
    }
}
