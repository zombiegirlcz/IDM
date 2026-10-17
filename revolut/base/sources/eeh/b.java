package eeh;

import dmj.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends aeh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aeh.c f125208c;
    public final c d;

    public b(aeh.c delegates, c controllerModelExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f125208c = delegates;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        yji.d.H(this, new k(rd0.e.b(this.f125208c.f3585a.f53218h), 22), new cyc.c(2, this.d, aeh.b.class, "onInstrumentClick", "onInstrumentClick(Lcom/revolut/feature/wealth/mutual_funds/api/ui/all_mutual_funds_widget/AllMutualFundsWidgetContract$Parcel$InstrumentDetails;)V", 4, 15), 3);
    }
}
