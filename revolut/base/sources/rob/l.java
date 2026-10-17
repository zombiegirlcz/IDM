package rob;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreenContract$InputData;
import djb.k;
import djb.u;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.r0;
import vkm.q;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends oki.h implements g {
    public final djb.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f255958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xqe.b f255959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AccountSelectionDialogScreenContract$InputData f255960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f255961s;

    public l(djb.n savingsAccountInteractor, u tradingOnboardingStatusProvider, xqe.b teenProfileInteractor, AccountSelectionDialogScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(savingsAccountInteractor, "savingsAccountInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsAccountInteractor;
        this.f255958p = tradingOnboardingStatusProvider;
        this.f255959q = teenProfileInteractor;
        this.f255960r = inputData;
        this.f255961s = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Flow flowE;
        vkm.d dVarJ2 = J2(k.b.f115282a);
        e eVar = e.TOTAL;
        wkm.l lVarI2 = I2(dVarJ2, eVar, e.PERSONAL_SAVINGS);
        wkm.l lVarI22 = I2(J2(k.a.f115281a), eVar, e.JOINT_SAVINGS);
        e eVar2 = e.TEEN_SAVINGS;
        e[] elements = {eVar, eVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        AccountSelectionDialogScreenContract$InputData accountSelectionDialogScreenContract$InputData = this.f255960r;
        if (setY0.contains(accountSelectionDialogScreenContract$InputData.f83362b)) {
            String str = accountSelectionDialogScreenContract$InputData.f83363c;
            flowE = boh.f.e(str != null ? zi0.c.i(zhm.u.c(new djb.l(str))) : nim.a.v(this.f255959q.b(w4l.h.f294642c), new rnd.k(20)), new k(this, 1));
        } else {
            flowE = new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        yji.l.a1(this, boh.f.e(u0.i(lVarI2, lVarI22, I2(flowE, eVar, eVar2)), new k(this, 0)), null, null, new rk9.d(this, null, 12), 3);
    }

    public final wkm.l I2(Flow flow, e... eVarArr) {
        return q.Q(new go.g(this.f255960r.f83362b, 2), new r0(null, eVarArr, flow, 22));
    }

    public final vkm.d J2(djb.k kVar) {
        return rd0.e.b(nim.a.w(((rnb.i) this.o).f(kVar, w4l.h.f294642c), new k(this, 2)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f255961s;
    }
}
