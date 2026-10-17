package jq1;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormDetailsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yji.n;
import zh9.u0;
import zjh.j;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f177407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yp1.b f177408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yp1.a f177409n;

    public e(j interactor, yp1.b formFlowProvider, yp1.a dialogProvider) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(formFlowProvider, "formFlowProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.f177407l = interactor;
        this.f177408m = formFlowProvider;
        this.f177409n = dialogProvider;
    }

    public final void Z2(Bill bill, Function0 onResult) {
        Intrinsics.checkNotNullParameter(bill, "bill");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        xo1.j jVar = bill.f61247b;
        String str = bill.e;
        int i = b.f177404a[jVar.ordinal()];
        if (i == 1) {
            T2(new c(this, str, onResult, null), new yi5.b(27));
            return;
        }
        if (i == 2) {
            String str2 = bill.i;
            if (str2 == null) {
                return;
            }
            A2(u0.c(new TransactionsFeatureConfig.Details(new k71.c(str2), null, null, null, 126)));
            return;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerO2 = o2(new ef9.c(new FormDetailsInputData(str)));
        ac1.b block = new ac1.b(11, onResult);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerO2.H = block;
        A2(new com.revolut.kompot.common.b(viewControllerO2, (ModalDestination.Style) null, 6));
    }
}
