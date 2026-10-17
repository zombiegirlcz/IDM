package zmj;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import dej.t1;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimSubscriptionDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimSubscriptionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e0 e0VarE3 = this.v.d();
        String listId = model.f51822a;
        Object obj3 = model.e;
        com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a aVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.a) e0VarE3;
        cli.y yVar = aVar2.J;
        Intrinsics.checkNotNullParameter(listId, "listId");
        EsimGiftRecipient esimGiftRecipient = null;
        switch (listId.hashCode()) {
            case -1614147384:
                if (listId.equals("CONNECTIVITY_TROUBLESHOOTING_ID")) {
                    if (((jte.d) aVar2.v).c(EsimApi$Toggles.EsimConnectivityTroubleshooting.f100172c)) {
                        t1 t1Var = (t1) ((n) ((j2) yVar.f22677a).getValue()).f323568a.getContent();
                        aVar2.C2(new w(t1Var != null ? t1Var.e.f100440a : null));
                    }
                }
                break;
            case -731206558:
                if (listId.equals("CHANGE_PLAN_ID")) {
                    o oVar = obj3 instanceof o ? (o) obj3 : null;
                    if (oVar != null) {
                        String str = oVar.f323578a;
                        String str2 = oVar.f323579b;
                        Optional optional = (Optional) ((n) ((j2) yVar.f22677a).getValue()).f323572h.getContent();
                        if (optional != null) {
                            Intrinsics.checkNotNullParameter(optional, "<this>");
                            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
                        }
                        aVar2.C2(new v(str, str2, esimGiftRecipient));
                    }
                }
                break;
            case -469253774:
                if (listId.equals("REQUEST_REFUND_ID")) {
                    r rVar = obj3 instanceof r ? (r) obj3 : null;
                    if (rVar != null) {
                        if (rVar.equals(p.f323580a)) {
                            oki.h.v2(aVar2.L, EsimSubscriptionDetailsScreenContract$ModalStep.NonRefundableSubscription.f101425a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else {
                            if (!(rVar instanceof q)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.C2(new b0(((q) rVar).f323582a));
                        }
                    }
                }
                break;
            case 489919645:
                if (listId.equals("ID_CONTRACT_SUMMARY_ID")) {
                    aVar2.A1(new i0(aVar2, null), new yi5.b(25));
                }
                break;
        }
        return Unit.f186387a;
    }
}
