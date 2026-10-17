package rp9;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends jki.g implements b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BillsChooserInputData f256302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sp9.b f256303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tp9.a f256304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f256305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kp9.a f256306t;
    public final cji.d u;
    public final a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(BillsChooserInputData inputData, sp9.b transactionsInteractor, tp9.a mapper, j60.a bottomExpandableDialog, kp9.a billsChooserNavigationProvider, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(billsChooserNavigationProvider, "billsChooserNavigationProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f256302p = inputData;
        this.f256303q = transactionsInteractor;
        this.f256304r = mapper;
        this.f256305s = bottomExpandableDialog;
        this.f256306t = billsChooserNavigationProvider;
        this.u = new cji.d("");
        this.v = new a(new Data(null, null, true, 3, null), "", inputData.f79187b);
    }

    @Override // yji.l
    public final void I1() {
        r rVarSwitchMap = this.u.c().switchMap(new rof.e(28, new k(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarDistinctUntilChanged = rVarSwitchMap.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        yji.l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new rk9.d(this, null, 14), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }
}
