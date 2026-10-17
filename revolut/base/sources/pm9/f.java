package pm9;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.feature.payees.impl.ui.payees_list.PayeesListScreenContract$InputData;
import i3g.k;
import im9.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pfk.o0;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements dli.b {
    public final PayeesListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f237489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f237490q;

    public f(k stateMapper, PayeesListScreenContract$InputData inputData, i payeesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payeesInteractor, "payeesInteractor");
        this.o = inputData;
        this.f237489p = payeesInteractor;
        this.f237490q = mra.d.b(this, new d(inputData.f79004a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        jhi.k kVarU;
        PayeesFlowType payeesFlowType = this.o.f79004a;
        boolean z = payeesFlowType instanceof PayeesFlowType.RequireAuthentication;
        i iVar = this.f237489p;
        Continuation continuation = null;
        if (z) {
            iVar.getClass();
            kVarU = nim.a.u(new im9.d(iVar, continuation, 3), u0.m(i.d(iVar, null, null, 3), ((hy9.c) iVar.f162330c).a()));
        } else {
            if (!(payeesFlowType instanceof PayeesFlowType.Blocked)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar.getClass();
            kVarU = nim.a.u(new im9.d(iVar, continuation, 0), u0.m(i.d(iVar, null, u.c(d3a.a.REVOLUT), 1), ((hy9.c) iVar.f162330c).a()));
        }
        l.a1(this, kVarU, null, null, new o0(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f237490q;
    }
}
