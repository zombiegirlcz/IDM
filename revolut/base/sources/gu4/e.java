package gu4;

import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$FlowState;
import com.revolut.feature.credit.card.impl.ui.repay.flow.CreditCardRepayFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kw4.j;
import vkm.j2;
import y5i.b;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay.flow.b f146695b;

    public /* synthetic */ e(com.revolut.feature.credit.card.impl.ui.repay.flow.b bVar, int i) {
        this.f146694a = i;
        this.f146695b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f146694a;
        com.revolut.feature.credit.card.impl.ui.repay.flow.b bVar = this.f146695b;
        switch (i) {
            case 0:
                u result = (u) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof s;
                com.revolut.feature.credit.card.impl.ui.repay.flow.b bVar2 = this.f146695b;
                d dVar = d.f146693a;
                if (z) {
                    qki.d dVar2 = bVar2.f69592w;
                    yki.i iVar = bVar2.f69593x;
                    c cVar = ((CreditCardRepayFlowContract$FlowState) ((j2) dVar2.f22677a).getValue()).e;
                    int i2 = cVar == null ? -1 : h.f146698a[cVar.ordinal()];
                    if (i2 == -1) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported " + cVar);
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        bVar2.C2(dVar);
                    } else if (i2 == 1) {
                        oki.h.t2(bVar2, iVar, CreditCardRepayFlowContract$Step.AutopaySettings.f69574a, false, null, false, 12);
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unsupported " + cVar);
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                        bVar2.C2(dVar);
                    } else {
                        oki.h.t2(bVar2, iVar, CreditCardRepayFlowContract$Step.CreateAutopay.f69576a, false, null, false, 12);
                    }
                } else if ((result instanceof q) || (result instanceof t)) {
                    bVar2.C2(dVar);
                } else {
                    if (!(result instanceof p) && !(result instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 1:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var3);
                oki.h.w2(bVar.f69593x, CreditCardRepayFlowContract$Step.Error.f69577a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Boolean.TRUE;
            case 2:
                y5i.b result2 = (y5i.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.I2();
                return Unit.f186387a;
            case 3:
                j result3 = (j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!Intrinsics.f(result3, j.f190231a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.I2();
                return Unit.f186387a;
            default:
                pu4.c result4 = (pu4.c) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (!(result4 instanceof pu4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.I2();
                return Unit.f186387a;
        }
    }
}
