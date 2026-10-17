package qwi;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.a;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lyi.b;
import qwd.o;
import svi.r;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e f249952b;

    public /* synthetic */ d(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar, int i) {
        this.f249951a = i;
        this.f249952b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f249951a;
        com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = this.f249952b;
        switch (i) {
            case 0:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                eVar.H2(eVar.z, new o(13));
                eVar.N2(false);
                return Boolean.FALSE;
            case 1:
                yki.i iVar = eVar.A;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.a output = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof a.C0607a) {
                    oki.h.D2(iVar);
                } else {
                    if (!(output instanceof byi.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    byi.e eVar2 = (byi.e) output;
                    oki.h.w2(iVar, new AirportLoungePassDetailsFlowContract$Step.GetHelp(eVar2.f19828a, eVar2.f19829b, eVar2.f19830c), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                lyi.b output2 = (lyi.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof lyi.c) {
                    r rVar = ((lyi.c) output2).f200833a;
                    com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar3 = this.f249952b;
                    oki.h.t2(eVar3, eVar3.A, new AirportLoungePassDetailsFlowContract$Step.PassList(rVar.f265969a, null, 2), false, TransitionAnimation.REPLACE.f98394a, false, 8);
                } else if (!Intrinsics.f(output2, b.a.f200832a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
