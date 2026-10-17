package o7e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreenContract$InputData;
import jki.p;
import k71.q;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s6e.z;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6e.d f222778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppk.f f222779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BillAccountDetailScreenContract$InputData f222780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f222781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f222782t;
    public final k6e.e u;
    public final l80.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final nhf.a f222783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f222784x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, g6e.d subaccountInteractor, ppk.f ratesInteractor, BillAccountDetailScreenContract$InputData inputData, n billActionsDialogFactory, j60.a expandableDialogControllerExtension, k6e.e billWidgetActionExtension, l80.e dateProvider, nhf.a unitedWalletInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billActionsDialogFactory, "billActionsDialogFactory");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(billWidgetActionExtension, "billWidgetActionExtension");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f222778p = subaccountInteractor;
        this.f222779q = ratesInteractor;
        this.f222780r = inputData;
        this.f222781s = billActionsDialogFactory;
        this.f222782t = expandableDialogControllerExtension;
        this.u = billWidgetActionExtension;
        this.v = dateProvider;
        this.f222783w = unitedWalletInteractor;
        Data data = new Data(null, null, true, 3, null);
        q.Companion.getClass();
        this.f222784x = new f(data, k71.p.a());
    }

    @Override // yji.l
    public final void I1() {
        BillAccountDetailScreenContract$InputData billAccountDetailScreenContract$InputData = this.f222780r;
        String str = billAccountDetailScreenContract$InputData.f89002a;
        z zVar = (z) this.f222778p;
        vkm.d dVarU = zVar.u(str);
        String id10 = billAccountDetailScreenContract$InputData.f89002a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Continuation continuation = null;
        yji.l.a1(this, xam.a.h(new j(this, continuation, 0), u0.m(dVarU, rd0.e.b(zVar.p(id10)))), null, null, new j(this, continuation, 1), 3);
        yji.l.a1(this, rd0.e.b(((njf.j) this.f222783w).f()), null, null, new j(this, continuation, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f222784x;
    }
}
